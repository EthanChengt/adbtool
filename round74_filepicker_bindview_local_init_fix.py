#!/usr/bin/env python3
"""Round74: initialize FilePickerActivity adapter bind locals before guarded branches."""
from pathlib import Path
import argparse
import shutil

REL = Path("app/src/main/java/com/didjdk/adbhelper/FilePickerActivity.java")
OLD = """            ImageView imageView;
            int i2;
            Drawable drawableLoadIcon;
            FilePickerActivity filePickerActivity;
            String string;
"""
NEW = """            ImageView imageView;
            int i2 = R.drawable.dx;
            Drawable drawableLoadIcon;
            FilePickerActivity filePickerActivity = FilePickerActivity.this;
            String string = "";
"""
def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("root", nargs="?", default=".")
    parser.add_argument("--check-only", action="store_true")
    args = parser.parse_args()
    path = Path(args.root) / REL
    source = path.read_text(encoding="utf-8")
    if NEW in source:
        print(f"Round74 already applied: {REL}")
        return
    count = source.count(OLD)
    if count != 1:
        raise SystemExit(f"Round74 expected exactly one adapter-local declaration anchor, found {count}")
    updated = source.replace(OLD, NEW, 1)
    if args.check_only:
        print(f"Round74 validation passed: {REL}")
        return
    backup = path.with_suffix(path.suffix + ".round74.bak")
    if not backup.exists():
        shutil.copy2(path, backup)
    path.write_text(updated, encoding="utf-8")
    if NEW not in path.read_text(encoding="utf-8"):
        raise SystemExit("Round74 post-write verification failed")
    print(f"Round74 applied: {REL}")
    print(f"Backup: {backup}")
if __name__ == "__main__":
    main()
