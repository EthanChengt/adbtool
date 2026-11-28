#!/usr/bin/env python3
"""Round75: ensure FilePickerActivity bind-view exception path has a valid ImageView."""
from pathlib import Path
import argparse
import shutil

REL = Path("app/src/main/java/com/didjdk/adbhelper/FilePickerActivity.java")
OLD = "            ImageView imageView;\n"
NEW = "            ImageView imageView = c1329g.f6443u;\n"

def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("root", nargs="?", default=".")
    parser.add_argument("--check-only", action="store_true")
    args = parser.parse_args()
    path = Path(args.root) / REL
    source = path.read_text(encoding="utf-8")
    if NEW in source:
        print(f"Round75 already applied: {REL}")
        return
    count = source.count(OLD)
    if count != 1:
        raise SystemExit(f"Round75 expected exactly one ImageView declaration, found {count}")
    updated = source.replace(OLD, NEW, 1)
    if args.check_only:
        print(f"Round75 validation passed: {REL}")
        return
    backup = path.with_suffix(path.suffix + ".round75.bak")
    if not backup.exists():
        shutil.copy2(path, backup)
    path.write_text(updated, encoding="utf-8")
    if NEW not in path.read_text(encoding="utf-8"):
        raise SystemExit("Round75 post-write verification failed")
    print(f"Round75 applied: {REL}")
    print(f"Backup: {backup}")

if __name__ == "__main__":
    main()
