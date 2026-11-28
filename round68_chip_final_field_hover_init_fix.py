#!/usr/bin/env python3
"""Round68: repair Chip constructor field reassignment and hover-event definite assignment."""
from pathlib import Path
import argparse
import shutil

REL = Path("app/src/main/java/com/google/android/material/chip/Chip.java")
FIELD_OLD = "public final C1351b f10256q;"
FIELD_NEW = "public C1351b f10256q;"
HOVER_OLD = """    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        boolean z;
"""
HOVER_NEW = """    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        boolean z = false;
"""

def transform(text):
    changes = 0
    if FIELD_OLD in text:
        text = text.replace(FIELD_OLD, FIELD_NEW, 1)
        changes += 1
    if HOVER_OLD in text:
        text = text.replace(HOVER_OLD, HOVER_NEW, 1)
        changes += 1
    return text, changes

def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("root", nargs="?", default=".")
    parser.add_argument("--check-only", action="store_true")
    args = parser.parse_args()
    path = Path(args.root) / REL
    original = path.read_text(encoding="utf-8")
    updated, changes = transform(original)
    if args.check_only:
        if FIELD_OLD not in original or HOVER_OLD not in original:
            if FIELD_NEW in original and HOVER_NEW in original:
                print(f"Round68 already applied: {REL}")
                return
            raise SystemExit("Round68 validation failed: expected Chip field and hover anchors not found")
        print(f"Round68 validation passed: {REL}")
        return
    if changes == 0:
        if FIELD_NEW in original and HOVER_NEW in original:
            print(f"Round68 already applied: {REL}")
            return
        raise SystemExit("Round68 apply failed: no expected anchors changed")
    backup = path.with_suffix(path.suffix + ".round68.bak")
    if not backup.exists():
        shutil.copy2(path, backup)
    path.write_text(updated, encoding="utf-8")
    check = path.read_text(encoding="utf-8")
    if FIELD_OLD in check or HOVER_OLD in check or FIELD_NEW not in check or HOVER_NEW not in check:
        raise SystemExit("Round68 post-write verification failed")
    print(f"Round68 applied: {REL}")
    print(f"Original source backup: {backup}")

if __name__ == "__main__":
    main()
