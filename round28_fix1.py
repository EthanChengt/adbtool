#!/usr/bin/env python3
"""Round 28 Fix1: repair the next verified javac error batch.

Run at repository root: python3 round28_fix1.py .
Validate only:              python3 round28_fix1.py . --check-only
All edits are validated in memory before any file is written.
"""
from __future__ import annotations
import argparse
import re
import shutil
import sys
from pathlib import Path

HELPER_IMPORT = "import static c.a.a.a.a.*;\n"
class PatchError(RuntimeError):
    pass

def once(s: str, old: str, new: str, label: str, *, allow_done: bool = True) -> str:
    n = s.count(old)
    if n == 0:
        if allow_done and new in s:
            return s
        raise PatchError(f"{label}: anchor not found")
    if n != 1:
        raise PatchError(f"{label}: expected one anchor, found {n}")
    return s.replace(old, new, 1)

def static_helper_import(s: str, label: str) -> str:
    # Static imports are not shadowed by local classes/interfaces named `a` or `c`.
    if HELPER_IMPORT not in s:
        m = re.search(r"(?m)^package [^;]+;\n", s)
        if not m:
            raise PatchError(f"{label}: package declaration missing")
        s = s[:m.end()] + "\n" + HELPER_IMPORT + s[m.end():]
    s = s.replace("c.a.a.a.a.", "")
    # In constraint-layout classes, enum `a` shadows the ordinary helper class.
    s = re.sub(r"(?<![\w.$])a\.(?=m\d+[A-Za-z]*\s*\()", "", s)
    return s

def capture(s: str, outer: str, fields: list[str], label: str) -> str:
    for f in fields:
        pat = re.compile(r"(?<![\w.])this\." + re.escape(f) + r"\b")
        s, n = pat.subn(f"{outer}.this", s)
        if n == 0 and f"{outer}.this" in s:
            continue
        if n != 1:
            raise PatchError(f"{label}: expected one this.{f} capture, found {n}")
    return s

def patch_c0291w(s: str) -> str:
    anchor = '''        @Override // p006b.p008b.p018i.C0291w.f
        /* JADX INFO: renamed from: j */
        public CharSequence mo1144j() {
            return this.f2038E;
        }
'''
    insert = '''        @Override // p006b.p008b.p018i.C0291w.f
        /* JADX INFO: renamed from: i */
        public Drawable mo1143i() {
            return m1092i();
        }

''' + anchor
    return once(s, anchor, insert, "C0291w dropdown background getter")

def patch_c1069l(s: str) -> str:
    s = capture(s, "C1069l", ["f5274a", "f5279a"], "C1069l synthetic captures")
    return static_helper_import(s, "C1069l")

def patch_r(s: str) -> str:
    return static_helper_import(s, "r.java")

def patch_c1021p(s: str) -> str:
    return static_helper_import(s, "C1021p.java")

def patch_c1102z(s: str) -> str:
    return static_helper_import(s, "C1102z.java")

def patch_c0332d(s: str) -> str:
    s = static_helper_import(s, "C0332d.java")
    # The decompiler placed these reciprocal-connection flags inside a nested
    # branch although their values are consumed after that branch.
    s = once(s,
        "        C0331c c0331c5;\n        a aVar = a.WRAP_CONTENT;",
        "        C0331c c0331c5;\n        boolean z14 = false;\n        boolean z15 = false;\n        a aVar = a.WRAP_CONTENT;",
        "C0332d reciprocal flags declaration")
    s = once(s, "boolean z14 = (c0331c7 != null", "z14 = (c0331c7 != null", "C0332d z14 scope")
    s = once(s, "boolean z15 = (c0331c9 == null", "z15 = (c0331c9 == null", "C0332d z15 scope")
    s = once(s, "r13 = z18 ? 1 : 0;", "r13 = z18;", "C0332d boolean conversion")
    return s

def patch_c0333e(s: str) -> str:
    # JADX merged an Exception temporary into catch blocks without declaring it.
    s = once(s,
        "        int i7;\n        C0332d.a aVar3 = C0332d.a.MATCH_CONSTRAINT;",
        "        int i7;\n        Exception e = null;\n        C0332d.a aVar3 = C0332d.a.MATCH_CONSTRAINT;",
        "C0333e exception temporary")
    s = s.replace("this.f2376y0 = r2;", "this.f2376y0 = (r2 != 0);")
    s = static_helper_import(s, "C0333e.java")
    return s

def patch_constraint_layout(s: str) -> str:
    return once(s,
        "        public C0065a(Context context, AttributeSet attributeSet) {\n            String str;\n            int i;\n            super(context, attributeSet);",
        "        public C0065a(Context context, AttributeSet attributeSet) {\n            super(context, attributeSet);\n            String str;\n            int i;",
        "ConstraintLayout super constructor order")

def patch_recyclerview(s: str) -> str:
    # Initialize only compiler-reported locals whose decompiled control-flow
    # joins omit a value. Defaults match the AndroidX method's no-op paths.
    replacements = [
        ("            C0539b c0539b;\n            int iM2001f;", "            C0539b c0539b = this.f958a;\n            int iM2001f;", "layout manager child helper"),
        ("            AbstractC0129d0 abstractC0129d0;", "            AbstractC0129d0 abstractC0129d0 = null;", "recycler holder lookup"),
        ("            C0141p c0141p;", "            C0141p c0141p = null;", "layout params local"),
        ("            boolean z5;", "            boolean z5 = false;", "recycler animation flag"),
        ("            boolean z2;", "            boolean z2 = false;", "recycler state flag"),
        ("        AbstractC0137l.c cVar;\n        AbstractC0137l.c cVar2;", "        AbstractC0137l.c cVar = null;\n        AbstractC0137l.c cVar2 = null;", "view info animation records"),
        ("        float axisValue;", "        float axisValue = 0.0f;", "generic motion axis"),
    ]
    for old, new, label in replacements:
        n = s.count(old)
        if n == 0:
            if new in s:
                continue
            raise PatchError(f"RecyclerView.java {label}: declaration anchor missing")
        if n < 1:
            raise PatchError(f"RecyclerView.java {label}: declaration anchor missing")
        # A few decompiled methods share the same local declaration text;
        # only the first declaration corresponds to the javac-reported method.
        s = s.replace(old, new, 1)
    # pullGlows has one branch in which the decompiler omitted z's false value.
    s = once(s,
        "    private void pullGlows(float f, float f2, float f3, float f4) {\n        boolean z;",
        "    private void pullGlows(float f, float f2, float f3, float f4) {\n        boolean z = false;",
        "RecyclerView pullGlows flag")
    return s

def main() -> int:
    ap = argparse.ArgumentParser(description=__doc__)
    ap.add_argument("root", nargs="?", default=".")
    ap.add_argument("--check-only", action="store_true")
    args = ap.parse_args()
    root = Path(args.root).resolve()
    if not root.is_dir():
        raise SystemExit(f"repository root does not exist: {root}")
    patches = {
        "app/src/main/java/androidx/recyclerview/widget/RecyclerView.java": patch_recyclerview,
        "app/src/main/java/p006b/p008b/p018i/C0291w.java": patch_c0291w,
        "app/src/main/java/c/c/a/v3/i0/r.java": patch_r,
        "app/src/main/java/c/c/a/v3/i0/C1021p.java": patch_c1021p,
        "app/src/main/java/c/c/a/v3/m0/C1102z.java": patch_c1102z,
        "app/src/main/java/c/c/a/v3/l0/C1069l.java": patch_c1069l,
        "app/src/main/java/androidx/constraintlayout/widget/ConstraintLayout.java": patch_constraint_layout,
        "app/src/main/java/p006b/p026f/p027a/p028h/C0332d.java": patch_c0332d,
        "app/src/main/java/p006b/p026f/p027a/p028h/C0333e.java": patch_c0333e,
    }
    changed = {}
    for rel, fn in patches.items():
        p = root / rel
        if not p.is_file():
            raise PatchError(f"missing source file: {rel}")
        original = p.read_text(encoding="utf-8")
        updated = fn(original)
        if updated == original:
            raise PatchError(f"{rel}: no changes produced")
        changed[rel] = updated
    if args.check_only:
        print(f"Round28 Fix1 validation passed: {len(changed)} files")
        return 0
    for rel, updated in changed.items():
        p = root / rel
        backup = p.with_suffix(p.suffix + ".round28.bak")
        if not backup.exists():
            shutil.copy2(p, backup)
        p.write_text(updated, encoding="utf-8")
    print(f"Round28 Fix1 applied to {len(changed)} files")
    return 0

if __name__ == "__main__":
    try:
        raise SystemExit(main())
    except PatchError as exc:
        print(f"Round28 validation failed; no files were written:\n- {exc}", file=sys.stderr)
        raise SystemExit(2)
