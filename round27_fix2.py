#!/usr/bin/env python3
"""Round 27 Fix2: repair the first Gradle Java compile batch.

Run from the repository root:
    python3 round27_fix2.py .
Optional validation without writing:
    python3 round27_fix2.py . --check-only

The script validates all target edits in memory before writing any source file.
"""
from __future__ import annotations

import argparse
import re
import shutil
import sys
from pathlib import Path

HELPER = "c.a.a.a.a"


class PatchError(RuntimeError):
    pass


def replace_one(text: str, old: str, new: str, label: str) -> str:
    count = text.count(old)
    if count == 0:
        if new in text:
            return text
        raise PatchError(f"{label}: expected anchor not found")
    if count != 1:
        raise PatchError(f"{label}: expected exactly one anchor, found {count}")
    return text.replace(old, new, 1)


def replace_optional(text: str, old: str, new: str, label: str) -> str:
    count = text.count(old)
    if count > 1:
        raise PatchError(f"{label}: expected at most one anchor, found {count}")
    return text.replace(old, new, 1) if count else text


def qualify_shadowed_helper_calls(text: str, label: str) -> str:
    # A nested type named `a` shadows the imported c.a.a.a.a helper class.
    # Only qualify known helper entry points, not variables named `a`.
    pattern = re.compile(r"(?<![\w.$])a\.(?=(?:q|m\d+[A-Za-z]*)\s*\()")
    updated, count = pattern.subn(HELPER + ".", text)
    if count == 0 and re.search(r"(?<![\w.$])a\.(?:q|m\d+[A-Za-z]*)\s*\(", text):
        raise PatchError(f"{label}: helper qualification did not consume all shadowed calls")
    return updated


def replace_capture_owner(text: str, outer: str, fields: list[str], label: str) -> str:
    """Replace JADX synthetic capture fields with the lexical enclosing instance.

    In the decompiled Java, `this.fNNNN` in anonymous callbacks is a synthetic
    field holding the enclosing object. It is not a field on that enclosing
    object. The valid source-level expression is therefore `Outer.this`, not
    `Outer.this.fNNNN`.
    """
    for field in fields:
        pattern = re.compile(r"(?<![\w.])this\." + re.escape(field) + r"\b")
        text, count = pattern.subn(f"{outer}.this", text)
        if count != 1:
            raise PatchError(f"{label}: expected one synthetic capture this.{field}, found {count}")
    return text


def load_file(root: Path, rel: str) -> str:
    path = root / rel
    if not path.is_file():
        raise PatchError(f"missing source file: {rel}")
    return path.read_text(encoding="utf-8")


def patch_c1056v(s: str) -> str:
    rel = "C1056v.java"
    s = replace_one(s, "        int i;\n", "        int i = 0;\n", rel + " local i")
    s = replace_one(s, "        String str3;\n", "        String str3 = \"\";\n", rel + " local str3")

    # The symlink parser already extracts the displayed link name into
    # f5254i; preserve that name in str3 before the common assignment below.
    pattern = re.compile(
        r'(?m)^(?P<indent>[ \t]*)this\.f5254i = (?P<array>(?:strArr2|this\.f5246a))\[5\]\.split\(" ->"\)\[0\];\n'
        r'(?P=indent)String str\d+ = this\.f5246a\[5\]\.split\(" ->"\)\[1\];'
    )
    s, count = pattern.subn(
        lambda m: (
            f'{m.group("indent")}this.f5254i = {m.group("array")}[5].split(" ->")[0];\n'
            f'{m.group("indent")}str3 = this.f5254i;'
        ),
        s,
    )
    if count < 1:
        # The initialized default still guarantees compilation on decompiler
        # branches that do not expose the optional symlink target.
        if 'String str3 = "";' not in s:
            raise PatchError(rel + ": str3 initialization did not apply")
    return s


def patch_c0291w(s: str) -> str:
    rel = "C0291w.java"
    anchor = '''        @Override // p006b.p008b.p018i.C0291w.f
        /* JADX INFO: renamed from: l */
        public void mo1145l(CharSequence charSequence) {
            this.f2038E = charSequence;
        }
'''
    insert = anchor + '''
        @Override // p006b.p008b.p018i.C0291w.f
        /* JADX INFO: renamed from: m */
        public void mo1146m(Drawable drawable) {
            m1093m(drawable);
        }
'''
    return replace_one(s, anchor, insert, rel + " dropdown popup background setter")


def patch_r(s: str) -> str:
    rel = "r.java"
    # Rename the nested query-listener class so it no longer shadows the
    # imported c.c.a.y3.c callback class used by `new c.a()` below.
    old_class = '''    public class c implements SearchView.InterfaceC0051m {
        public c() {
        }
    }'''
    new_class = '''    public class QueryTextListener implements SearchView.InterfaceC0051m {
        public QueryTextListener() {
        }

        @Override
        public boolean onQueryTextSubmit(String query) {
            r.this.m2656L0(query);
            return false;
        }

        @Override
        public boolean onQueryTextChange(String newText) {
            r.this.m2656L0(newText);
            return false;
        }
    }'''
    s = replace_one(s, old_class, new_class, rel + " query listener class")
    s = replace_one(
        s,
        "searchView.setOnQueryTextListener(new c());",
        "searchView.setOnQueryTextListener(new QueryTextListener());",
        rel + " query listener registration",
    )
    # This decompiler-native method is not an Android Fragment override;
    # javac rejects the annotation, while the forwarding wrapper remains valid.
    s = replace_one(
        s,
        "    @Override // androidx.fragment.app.Fragment\n    /* JADX INFO: renamed from: O */\n    public native void O(Menu menu, MenuInflater menuInflater);",
        "    /* JADX INFO: renamed from: O */\n    public native void O(Menu menu, MenuInflater menuInflater);",
        rel + " invalid native O override annotation",
    )
    s = replace_capture_owner(s, "r", ["f5016a", "f5013a", "f5014b"], rel)
    s = qualify_shadowed_helper_calls(s, rel)
    # Add a narrow owner accessor so the RecyclerView adapter can obtain the
    # actual enclosing Fragment without illegal r.this references.
    old_owner = '''    public class a implements C1021p.a {
        public a() {
        }
    }'''
    new_owner = '''    public class a implements C1021p.a {
        public a() {
        }

        public r getOwner() {
            return r.this;
        }
    }'''
    s = replace_one(s, old_owner, new_owner, rel + " adapter owner accessor")
    return s


def patch_c1021p(s: str) -> str:
    rel = "C1021p.java"
    s = replace_one(
        s,
        "public void mo537e(RecyclerView.AbstractC0129d0 abstractC0129d0, int i) {\n        b bVar = (b) abstractC0129d0;",
        "public void mo537e(b bVar, int i) {",
        rel + " bind ViewHolder generic signature",
    )
    s = replace_one(
        s,
        "public RecyclerView.AbstractC0129d0 mo538f(ViewGroup viewGroup, int i) {",
        "public b mo538f(ViewGroup viewGroup, int i) {",
        rel + " create ViewHolder generic signature",
    )
    s = replace_one(
        s,
        "final C1027v c1027v = r.this.f5050X.get(iM509e);\n                final r c1023r = r.this;",
        "final r c1023r = aVar.getOwner();\n                final C1027v c1027v = c1023r.f5050X.get(iM509e);",
        rel + " enclosing Fragment capture",
    )
    s = replace_capture_owner(s, "C1021p", ["f5001b", "f5003b"], rel)
    s = qualify_shadowed_helper_calls(s, rel)
    return s


def patch_q(s: str) -> str:
    rel = "q.java"
    return replace_capture_owner(s, "q", ["f5007a", "f5005a", "f5006b"], rel)


def patch_c1000f0(s: str) -> str:
    rel = "C1000f0.java"
    return replace_capture_owner(
        s,
        "C1000f0",
        ["f4950b", "f5105a", "f5000b", "f4946b", "f4968b", "f4965b", "f4948b", "f4941a"],
        rel,
    )


def patch_c1102z(s: str) -> str:
    rel = "C1102z.java"
    s = replace_capture_owner(
        s,
        "C1102z",
        ["f5332b", "f5325a", "f5340b", "f5356b", "f5348b", "f5328b", "f5330b", "f5369b", "f5345b", "f5353b"],
        rel,
    )
    s = qualify_shadowed_helper_calls(s, rel)
    old = '''                    final int Equals = strTrim.equals("enabled") ? 1 : 0;
                    if (strTrim.equals("disabled")) {
                        Equals = 2;
                    }'''
    new = '''                    final int selectedIndex = strTrim.equals("disabled") ? 2 : (strTrim.equals("enabled") ? 1 : 0);'''
    s = replace_one(s, old, new, rel + " cached-app freezer choice index")
    s = re.sub(r"\bEquals\b", "selectedIndex", s)
    return s


def patch_c1100x(s: str) -> str:
    return qualify_shadowed_helper_calls(s, "C1100x.java")


def patch_c1067j(s: str) -> str:
    rel = "C1067j.java"
    s = replace_capture_owner(s, "C1067j", ["f5268b", "f5265b"], rel)
    return qualify_shadowed_helper_calls(s, rel)


def patch_search_view(s: str) -> str:
    rel = "SearchView.java"
    s = replace_optional(s, "import c.c.a.v3.i0.r;\n", "", rel + " stale Fragment import")
    s = replace_one(
        s,
        '''    public interface InterfaceC0051m {
    }''',
        '''    public interface InterfaceC0051m {
        boolean onQueryTextSubmit(String query);

        boolean onQueryTextChange(String newText);
    }''',
        rel + " query listener contract",
    )
    s = replace_one(
        s,
        '''            if (searchView.f265L != null && !TextUtils.equals(charSequence, searchView.f279c0)) {
                r.this.m2656L0(charSequence.toString());
            }''',
        '''            if (searchView.f265L != null && !TextUtils.equals(charSequence, searchView.f279c0)) {
                searchView.f265L.onQueryTextChange(charSequence.toString());
            }''',
        rel + " text-change callback",
    )
    s = replace_one(
        s,
        '''        if (interfaceC0051m != null) {
            r.this.m2656L0(text.toString());
        }''',
        '''        if (interfaceC0051m != null) {
            interfaceC0051m.onQueryTextSubmit(text.toString());
        }''',
        rel + " query-submit callback",
    )
    s = replace_one(
        s,
        "public Object createFromParcel(Parcel parcel) {\n                return new C0053o(parcel, null);",
        "public C0053o createFromParcel(Parcel parcel) {\n                return new C0053o(parcel, null);",
        rel + " Parcelable.Creator createFromParcel return type",
    )
    s = replace_one(
        s,
        "public Object[] newArray(int i) {\n                return new C0053o[i];",
        "public C0053o[] newArray(int i) {\n                return new C0053o[i];",
        rel + " Parcelable.Creator newArray return type",
    )
    s = qualify_shadowed_helper_calls(s, rel)
    return s


def patch_abstract0439a(s: str) -> str:
    return qualify_shadowed_helper_calls(s, "AbstractC0439a.java")


def main() -> int:
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("root", nargs="?", default=".", help="repository root (default: current directory)")
    parser.add_argument("--check-only", action="store_true", help="validate edits without writing files")
    args = parser.parse_args()
    root = Path(args.root).resolve()
    if not root.is_dir():
        raise SystemExit(f"repository root does not exist: {root}")

    files = {
        "app/src/main/java/c/c/a/v3/k0/C1056v.java": patch_c1056v,
        "app/src/main/java/p006b/p008b/p018i/C0291w.java": patch_c0291w,
        "app/src/main/java/c/c/a/v3/i0/r.java": patch_r,
        "app/src/main/java/c/c/a/v3/i0/C1021p.java": patch_c1021p,
        "app/src/main/java/c/c/a/v3/i0/q.java": patch_q,
        "app/src/main/java/c/c/a/v3/C1000f0.java": patch_c1000f0,
        "app/src/main/java/c/c/a/v3/m0/C1102z.java": patch_c1102z,
        "app/src/main/java/c/c/a/v3/m0/C1100x.java": patch_c1100x,
        "app/src/main/java/c/c/a/v3/l0/C1067j.java": patch_c1067j,
        "app/src/main/java/androidx/appcompat/widget/SearchView.java": patch_search_view,
        "app/src/main/java/p006b/p047i/p048a/AbstractC0439a.java": patch_abstract0439a,
    }

    changes: dict[str, tuple[str, str]] = {}
    try:
        for rel, transform in files.items():
            original = load_file(root, rel)
            updated = transform(original)
            if original != updated:
                changes[rel] = (original, updated)

        # Validate the key compile blockers are absent from the staged result.
        staged = {rel: updated for rel, (_, updated) in changes.items()}
        def content(rel: str) -> str:
            return staged[rel] if rel in staged else load_file(root, rel)

        checks = [
            ("app/src/main/java/c/c/a/v3/i0/C1021p.java", "r.this.", "C1021p outer-reference cleanup"),
            ("app/src/main/java/androidx/appcompat/widget/SearchView.java", "r.this.", "SearchView callback cleanup"),
            ("app/src/main/java/c/c/a/v3/i0/r.java", "this.f5016a", "r handler synthetic capture"),
            ("app/src/main/java/c/c/a/v3/i0/r.java", "this.f5013a", "r progress synthetic capture"),
            ("app/src/main/java/c/c/a/v3/i0/r.java", "this.f5014b", "r click synthetic capture"),
            ("app/src/main/java/c/c/a/v3/i0/r.java", "new c()", "r query listener rename"),
            ("app/src/main/java/c/c/a/v3/C1000f0.java", "this.f4950b", "C1000f0 captured outer field"),
            ("app/src/main/java/c/c/a/v3/m0/C1102z.java", "this.f5332b", "C1102z captured outer field"),
            ("app/src/main/java/c/c/a/v3/l0/C1067j.java", "this.f5268b", "C1067j captured outer field"),
        ]
        for rel, needle, label in checks:
            if needle.startswith("this."):
                pattern = re.compile(r"(?<![\w.])" + re.escape(needle) + r"\b")
                unresolved = pattern.search(content(rel)) is not None
            else:
                unresolved = needle in content(rel)
            if unresolved:
                raise PatchError(f"{label}: unresolved token remains")

        if args.check_only:
            print(f"Round 27 check passed: {len(changes)} files validated; no files changed.")
            return 0

        backup = root / ".round27-backup"
        backup.mkdir(exist_ok=True)
        for rel, (original, _) in changes.items():
            dest = backup / rel
            dest.parent.mkdir(parents=True, exist_ok=True)
            if not dest.exists():
                dest.write_text(original, encoding="utf-8")

        # Write only after every edit and validation has passed.
        for rel, (_, updated) in changes.items():
            path = root / rel
            temp = path.with_suffix(path.suffix + ".round27.tmp")
            temp.write_text(updated, encoding="utf-8")
            temp.replace(path)

        print(f"Round 27 Fix1 applied to {len(changes)} files. Backups: .round27-backup/")
        print("Next: run ./gradlew :app:compileDebugJavaWithJavac and inspect the next diagnostics batch.")
        return 0
    except PatchError as exc:
        print(f"Round 27 validation failed; no files were written:\n- {exc}", file=sys.stderr)
        return 2


if __name__ == "__main__":
    raise SystemExit(main())
