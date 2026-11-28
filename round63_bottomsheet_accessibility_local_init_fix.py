#!/usr/bin/env python3
"""Round63: preserve current accessibility importance when no saved value exists."""
from pathlib import Path
import argparse

REL = Path("app/src/main/java/com/google/android/material/bottomsheet/BottomSheetBehavior.java")
OLD = '''    public final void m3085Q(boolean z) {
        int iIntValue;'''
NEW = '''    public final void m3085Q(boolean z) {
        int iIntValue;'''
# Narrowly initialize from the current view state at the point of use.
OLD_USE = '''                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.f10177B.get()) {
                    Map<View, Integer> map = this.f10184I;'''
NEW_USE = '''                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.f10177B.get()) {
                    int iIntValue = childAt.getImportantForAccessibility();
                    Map<View, Integer> map = this.f10184I;'''
OLD_DECL = '''    public final void m3085Q(boolean z) {
        int iIntValue;'''
NEW_DECL = '''    public final void m3085Q(boolean z) {'''
def transform(s):
    if s.count(NEW_USE) == 1 and s.count(NEW_DECL) == 1:
        return s
    if s.count(OLD_USE) != 1:
        raise SystemExit(f"{REL}: expected one m3085Q loop anchor, found {s.count(OLD_USE)}")
    if s.count(OLD_DECL) != 1:
        raise SystemExit(f"{REL}: expected one m3085Q local declaration, found {s.count(OLD_DECL)}")
    s = s.replace(OLD_USE, NEW_USE, 1)
    s = s.replace(OLD_DECL, NEW_DECL, 1)
    return s

def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("root", nargs="?", default=".")
    ap.add_argument("--check-only", action="store_true")
    args = ap.parse_args()
    path = Path(args.root) / REL
    if not path.is_file():
        raise SystemExit(f"Missing source file: {path}")
    before = path.read_text(encoding="utf-8")
    after = transform(before)
    if args.check_only:
        print(f"Round63 validation passed: {REL}")
        return
    if after != before:
        backup = path.with_suffix(path.suffix + ".round63.bak")
        if not backup.exists():
            backup.write_text(before, encoding="utf-8")
        path.write_text(after, encoding="utf-8")
        print(f"Round63 applied: {REL}")
    else:
        print(f"Round63 already applied: {REL}")
    check = path.read_text(encoding="utf-8")
    if check.count(NEW_USE) != 1 or check.count(NEW_DECL) != 1:
        raise SystemExit("Round63 post-write verification failed")
    print("Round63 post-write verification passed")

if __name__ == "__main__":
    main()
