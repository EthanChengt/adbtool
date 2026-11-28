#!/usr/bin/env python3
"""Round66: preserve the current accessibility value when no saved value exists."""
from pathlib import Path
import argparse

REL = Path("app/src/main/java/com/google/android/material/transformation/FabTransformationSheetBehavior.java")

OLD_DECL = "        int iIntValue;\n"
OLD_CHILD = "                View childAt = coordinatorLayout.getChildAt(i);\n"
NEW_CHILD = OLD_CHILD + "                int iIntValue = childAt.getImportantForAccessibility();\n"

def transform(source):
    if source.count(OLD_DECL) == 0 and source.count(NEW_CHILD) == 1:
        return source
    if source.count(OLD_DECL) != 1:
        raise SystemExit(f"{REL}: expected one method-level iIntValue declaration, found {source.count(OLD_DECL)}")
    if source.count(OLD_CHILD) != 1:
        raise SystemExit(f"{REL}: expected one child-loop anchor, found {source.count(OLD_CHILD)}")
    source = source.replace(OLD_DECL, "", 1)
    source = source.replace(OLD_CHILD, NEW_CHILD, 1)
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
        print(f"Round66 validation passed: {REL}")
        return
    if after != before:
        backup = path.with_suffix(path.suffix + ".round66.bak")
        if not backup.exists():
            backup.write_text(before, encoding="utf-8")
        path.write_text(after, encoding="utf-8")
        print(f"Round66 applied: {REL}")
    else:
        print(f"Round66 already applied: {REL}")
    check = path.read_text(encoding="utf-8")
    if check.count(OLD_DECL) != 0 or check.count(NEW_CHILD) != 1:
        raise SystemExit("Round66 post-write verification failed")
    print("Round66 post-write verification passed")

if __name__ == "__main__":
    main()
