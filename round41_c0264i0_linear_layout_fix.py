#!/usr/bin/env python3
"""Round41 repair for decompiler-damaged C0264i0 LinearLayout implementation.

The decompiled onMeasure/onLayout control flow is corrupted (duplicate layout
branches and non-advancing loops). Reuse android.widget.LinearLayout's mature
measurement/layout engine while keeping this project's C0264i0 API, custom
LayoutParams wrapper, and support-style attribute handling.

Usage:
  python3 round41_c0264i0_linear_layout_fix.py . --check-only
  python3 round41_c0264i0_linear_layout_fix.py .
"""
from __future__ import annotations

import argparse
import shutil
import sys
from pathlib import Path

REL = Path("app/src/main/java/p006b/p008b/p018i/C0264i0.java")
BACKUP_ROOT = Path(".round41-backup")


def find_method(text: str, signature_fragment: str) -> tuple[int, int, int]:
    """Return (method_start, opening_brace, end_after_closing_brace)."""
    start = text.find(signature_fragment)
    if start < 0:
        raise ValueError(f"missing method anchor: {signature_fragment}")
    if text.find(signature_fragment, start + 1) >= 0:
        raise ValueError(f"ambiguous method anchor: {signature_fragment}")
    brace = text.find("{", start)
    if brace < 0:
        raise ValueError(f"missing method body: {signature_fragment}")

    depth = 0
    i = brace
    state = "code"
    while i < len(text):
        ch = text[i]
        nxt = text[i + 1] if i + 1 < len(text) else ""
        if state == "line_comment":
            if ch == "\n":
                state = "code"
            i += 1
            continue
        if state == "block_comment":
            if ch == "*" and nxt == "/":
                state = "code"
                i += 2
            else:
                i += 1
            continue
        if state in ("string", "char"):
            if ch == "\\":
                i += 2
                continue
            if (state == "string" and ch == '"') or (state == "char" and ch == "'"):
                state = "code"
            i += 1
            continue
        if ch == "/" and nxt == "/":
            state = "line_comment"
            i += 2
            continue
        if ch == "/" and nxt == "*":
            state = "block_comment"
            i += 2
            continue
        if ch == '"':
            state = "string"
            i += 1
            continue
        if ch == "'":
            state = "char"
            i += 1
            continue
        if ch == "{":
            depth += 1
        elif ch == "}":
            depth -= 1
            if depth == 0:
                return start, brace, i + 1
        i += 1
    raise ValueError(f"unterminated method body: {signature_fragment}")


def remove_method(text: str, signature_fragment: str) -> str:
    start, _brace, end = find_method(text, signature_fragment)
    # Remove a directly preceding @Override annotation, if present.
    prefix = text[:start]
    line_start = prefix.rfind("\n") + 1
    annotation_line = prefix[line_start:].strip()
    if annotation_line.startswith("@Override"):
        start = line_start
    return text[:start] + text[end:]


def replace_exact(text: str, old: str, new: str, expected: int, label: str) -> str:
    count = text.count(old)
    if count != expected:
        raise ValueError(f"{label}: expected {expected} occurrence(s), found {count}")
    return text.replace(old, new, expected)


def patch(source: str) -> str:
    # Idempotence guard.
    if "public class C0264i0 extends android.widget.LinearLayout" in source and \
       "public void onMeasure(int i, int i2)" not in source and \
       "public void onLayout(boolean z, int i, int i2, int i3, int i4)" not in source:
        return source

    source = replace_exact(
        source,
        "public class C0264i0 extends ViewGroup {",
        "public class C0264i0 extends android.widget.LinearLayout {",
        1,
        "C0264i0 superclass",
    )
    source = replace_exact(
        source,
        "public static class a extends ViewGroup.MarginLayoutParams {",
        "public static class a extends android.widget.LinearLayout.LayoutParams {",
        1,
        "LayoutParams superclass",
    )

    # Remove the decompiler-generated layout/measurement/drawing overrides.
    # The platform LinearLayout implementation provides the same public
    # semantics, and avoids the source's duplicated branches and broken loops.
    for signature in (
        "public int getBaseline()",
        "public void onDraw(Canvas canvas)",
        "public void onLayout(boolean z, int i, int i2, int i3, int i4)",
        "public void onMeasure(int i, int i2)",
    ):
        source = remove_method(source, signature)

    # Keep the project's legacy weight/gravity mirror fields in sync with the
    # actual android.widget.LinearLayout.LayoutParams fields consumed by the
    # platform measurement engine.
    old_ctor = '''        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1881b = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0184b.f1213n);
            this.f1880a = typedArrayObtainStyledAttributes.getFloat(3, 0.0f);
            this.f1881b = typedArrayObtainStyledAttributes.getInt(0, -1);
            typedArrayObtainStyledAttributes.recycle();
        }'''
    new_ctor = '''        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1881b = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0184b.f1213n);
            this.f1880a = typedArrayObtainStyledAttributes.getFloat(3, 0.0f);
            this.f1881b = typedArrayObtainStyledAttributes.getInt(0, -1);
            typedArrayObtainStyledAttributes.recycle();
            this.weight = this.f1880a;
            this.gravity = this.f1881b;
        }'''
    source = replace_exact(source, old_ctor, new_ctor, 1, "attribute LayoutParams constructor")

    old_copy = '''        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1881b = -1;
        }'''
    new_copy = '''        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1880a = this.weight;
            this.f1881b = this.gravity;
        }'''
    source = replace_exact(source, old_copy, new_copy, 1, "copy LayoutParams constructor")

    # The support-style attributes use this project's generated styleable IDs.
    # Forward them to the platform widget so its native layout engine receives
    # the same settings; Android framework attributes are also read by super().
    source = replace_exact(
        source,
        "        this.f1869f = 8388659;",
        "        this.f1869f = 8388659;\n        super.setGravity(this.f1869f);",
        1,
        "default gravity initialization",
    )
    source = replace_exact(
        source,
        "        this.f1871h = typedArrayObtainStyledAttributes.getFloat(4, -1.0f);",
        "        this.f1871h = typedArrayObtainStyledAttributes.getFloat(4, -1.0f);\n        setWeightSum(this.f1871h);",
        1,
        "weight sum attribute",
    )
    source = replace_exact(
        source,
        "        this.f1872i = typedArrayObtainStyledAttributes.getBoolean(7, false);",
        "        this.f1872i = typedArrayObtainStyledAttributes.getBoolean(7, false);\n        setMeasureWithLargestChildEnabled(this.f1872i);",
        1,
        "largest-child attribute",
    )
    source = replace_exact(
        source,
        "        this.f1878o = typedArrayObtainStyledAttributes.getInt(8, 0);",
        "        this.f1878o = typedArrayObtainStyledAttributes.getInt(8, 0);\n        setShowDividers(this.f1878o);",
        1,
        "show-dividers attribute",
    )
    source = replace_exact(
        source,
        "        this.f1879p = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);",
        "        this.f1879p = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);\n        setDividerPadding(this.f1879p);",
        1,
        "divider-padding attribute",
    )

    # Replace the class's setters with delegating versions. The mirror fields
    # remain available for legacy callers and drawing helpers. Keep gravity in
    # the mirror field because LinearLayout.getGravity() was only added in API 24.
    method_replacements = {
        "public int getBaselineAlignedChildIndex()": '''    public int getBaselineAlignedChildIndex() {
        return super.getBaselineAlignedChildIndex();
    }''',
        "public int getDividerPadding()": '''    public int getDividerPadding() {
        return super.getDividerPadding();
    }''',
        "public int getDividerWidth()": '''    public int getDividerWidth() {
        return this.f1876m;
    }''',
        "public int getGravity()": '''    public int getGravity() {
        return this.f1869f;
    }''',
        "public int getOrientation()": '''    public int getOrientation() {
        return this.f1868e;
    }''',
        "public int getShowDividers()": '''    public int getShowDividers() {
        return super.getShowDividers();
    }''',
        "public float getWeightSum()": '''    public float getWeightSum() {
        return super.getWeightSum();
    }''',
        "public void setBaselineAligned(boolean z)": '''    public void setBaselineAligned(boolean z) {
        super.setBaselineAligned(z);
        this.f1865b = z;
    }''',
        "public void setBaselineAlignedChildIndex(int i)": '''    public void setBaselineAlignedChildIndex(int i) {
        super.setBaselineAlignedChildIndex(i);
        this.f1866c = i;
    }''',
        "public void setDividerDrawable(Drawable drawable)": '''    public void setDividerDrawable(Drawable drawable) {
        super.setDividerDrawable(drawable);
        this.f1875l = drawable;
        this.f1876m = drawable == null ? 0 : drawable.getIntrinsicWidth();
        this.f1877n = drawable == null ? 0 : drawable.getIntrinsicHeight();
    }''',
        "public void setDividerPadding(int i)": '''    public void setDividerPadding(int i) {
        super.setDividerPadding(i);
        this.f1879p = i;
    }''',
        "public void setGravity(int i)": '''    public void setGravity(int i) {
        if ((8388615 & i) == 0) {
            i |= 8388611;
        }
        if ((i & 112) == 0) {
            i |= 48;
        }
        super.setGravity(i);
        this.f1869f = i;
    }''',
        "public void setHorizontalGravity(int i)": '''    public void setHorizontalGravity(int i) {
        int horizontal = i & 8388615;
        if ((8388615 & this.f1869f) != horizontal) {
            this.f1869f = horizontal | ((-8388616) & this.f1869f);
            super.setGravity(this.f1869f);
        }
    }''',
        "public void setMeasureWithLargestChildEnabled(boolean z)": '''    public void setMeasureWithLargestChildEnabled(boolean z) {
        super.setMeasureWithLargestChildEnabled(z);
        this.f1872i = z;
    }''',
        "public void setOrientation(int i)": '''    public void setOrientation(int i) {
        super.setOrientation(i);
        this.f1868e = super.getOrientation();
    }''',
        "public void setShowDividers(int i)": '''    public void setShowDividers(int i) {
        super.setShowDividers(i);
        this.f1878o = i;
    }''',
        "public void setVerticalGravity(int i)": '''    public void setVerticalGravity(int i) {
        int vertical = i & 112;
        if ((this.f1869f & 112) != vertical) {
            this.f1869f = vertical | (this.f1869f & (-113));
            super.setGravity(this.f1869f);
        }
    }''',
        "public void setWeightSum(float f)": '''    public void setWeightSum(float f) {
        super.setWeightSum(f);
        this.f1871h = Math.max(0.0f, f);
    }''',
    }
    for signature, replacement in method_replacements.items():
        start, _brace, end = find_method(source, signature)
        # Include the direct @Override annotation if present.
        prefix = source[:start]
        line_start = prefix.rfind("\n") + 1
        annotation_line = prefix[line_start:].strip()
        if annotation_line.startswith("@Override"):
            start = line_start
        source = source[:start] + replacement + source[end:]

    return source


def validate(source: str) -> None:
    required = (
        "public class C0264i0 extends android.widget.LinearLayout",
        "public static class a extends android.widget.LinearLayout.LayoutParams",
        "this.weight = this.f1880a;",
        "this.gravity = this.f1881b;",
        "super.setDividerDrawable(drawable);",
        "super.setMeasureWithLargestChildEnabled(z);",
        "super.setShowDividers(i);",
        "super.setGravity(this.f1869f);",
    )
    for token in required:
        if token not in source:
            raise ValueError(f"post-patch validation failed: missing {token}")
    for signature in (
        "public int getBaseline()",
        "public void onMeasure(int i, int i2)",
        "public void onLayout(boolean z, int i, int i2, int i3, int i4)",
        "public void onDraw(Canvas canvas)",
    ):
        if signature in source:
            raise ValueError(f"post-patch validation failed: damaged override remains: {signature}")
    if "super.getGravity()" in source:
        raise ValueError("post-patch validation failed: API 24-only getGravity() call")
    if source.count("public void setDividerDrawable(Drawable drawable)") != 1:
        raise ValueError("post-patch validation failed: setter count")


def main() -> int:
    parser = argparse.ArgumentParser()
    parser.add_argument("root", nargs="?", default=".")
    parser.add_argument("--check-only", action="store_true")
    args = parser.parse_args()
    root = Path(args.root).resolve()
    target = root / REL
    if not target.is_file():
        print(f"ERROR: source file not found: {target}", file=sys.stderr)
        return 2

    original = target.read_text(encoding="utf-8")
    try:
        updated = patch(original)
        validate(updated)
    except Exception as exc:
        print(f"Round41 validation failed; no files were written: {exc}", file=sys.stderr)
        return 1

    if args.check_only:
        print("Round41 check passed: C0264i0 can be safely migrated to the platform LinearLayout engine; no files changed.")
        return 0
    if updated == original:
        print("Round41 already applied: C0264i0 is using the platform LinearLayout engine.")
        return 0

    backup = root / BACKUP_ROOT / REL
    backup.parent.mkdir(parents=True, exist_ok=True)
    if not backup.exists():
        shutil.copy2(target, backup)
    target.write_text(updated, encoding="utf-8")
    print(f"Round41 applied: {REL}")
    print(f"Original source backup: {backup.relative_to(root)}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
