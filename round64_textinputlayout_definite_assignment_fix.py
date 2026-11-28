#!/usr/bin/env python3
"""Round64: repair TextInputLayout definite-assignment paths without changing layout/color semantics."""
from pathlib import Path
import argparse

REL = Path("app/src/main/java/com/google/android/material/textfield/TextInputLayout.java")

OLD_LAYOUT_DECLS = """        int paddingTop;
        int compoundPaddingRight;
        int i5;
        int i6;"""
NEW_LAYOUT_DECLS = """        int paddingTop;
        int i6;"""
OLD_LAYOUT_ANCHOR = """                Rect rect3 = this.f10420D;
                rect3.bottom = rect2.bottom;
                int i15 = this.f10478v;"""
NEW_LAYOUT_ANCHOR = """                Rect rect3 = this.f10420D;
                rect3.bottom = rect2.bottom;
                int compoundPaddingRight = editText2.getCompoundPaddingRight();
                int i5 = rect2.right;
                int i15 = this.f10478v;"""
OLD_COLOR_DECLS = """        ColorStateList textColors;
        C1266c c1266c;
        TextView textView;"""
NEW_COLOR_DECLS = """        ColorStateList textColors = null;
        C1266c c1266c = this.f10466n0;
        TextView textView;"""

def replace_once(source, old, new, label):
    count = source.count(old)
    if count == 0 and source.count(new) == 1:
        return source
    if count != 1:
        raise SystemExit(f"{REL}: expected exactly one {label} anchor, found {count}")
    return source.replace(old, new, 1)

def transform(source):
    source = replace_once(source, OLD_LAYOUT_DECLS, NEW_LAYOUT_DECLS, "onLayout local declarations")
    source = replace_once(source, OLD_LAYOUT_ANCHOR, NEW_LAYOUT_ANCHOR, "onLayout rect3 initialization")
    source = replace_once(source, OLD_COLOR_DECLS, NEW_COLOR_DECLS, "m3189v local declarations")
    return source

def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("root", nargs="?", default=".")
    parser.add_argument("--check-only", action="store_true")
    args = parser.parse_args()
    path = Path(args.root) / REL
    if not path.is_file():
        raise SystemExit(f"Missing source file: {path}")
    before = path.read_text(encoding="utf-8")
    after = transform(before)
    if args.check_only:
        print(f"Round64 validation passed: {REL}")
        return
    if after != before:
        backup = path.with_suffix(path.suffix + ".round64.bak")
        if not backup.exists():
            backup.write_text(before, encoding="utf-8")
        path.write_text(after, encoding="utf-8")
        print(f"Round64 applied: {REL}")
    else:
        print(f"Round64 already applied: {REL}")
    check = path.read_text(encoding="utf-8")
    if check.count(NEW_LAYOUT_DECLS) != 1 or check.count(NEW_LAYOUT_ANCHOR) != 1 or check.count(NEW_COLOR_DECLS) != 1:
        raise SystemExit("Round64 post-write verification failed")
    print("Round64 post-write verification passed")

if __name__ == "__main__":
    main()
