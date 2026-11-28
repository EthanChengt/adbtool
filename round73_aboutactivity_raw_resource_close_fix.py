#!/usr/bin/env python3
"""Round73: handle IOException when closing AboutActivity's raw resource stream."""
from pathlib import Path
import argparse
import shutil

REL = Path("app/src/main/java/com/didjdk/adbhelper/AboutActivity.java")
OLD = """        inputStreamOpenRawResource.close();
        return sb.toString();
"""
NEW = """        try {
            inputStreamOpenRawResource.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
"""

def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("root", nargs="?", default=".")
    parser.add_argument("--check-only", action="store_true")
    args = parser.parse_args()
    path = Path(args.root) / REL
    source = path.read_text(encoding="utf-8")
    if NEW in source:
        print(f"Round73 already applied: {REL}")
        return
    count = source.count(OLD)
    if count != 1:
        raise SystemExit(f"Round73 expected exactly one raw-resource close anchor, found {count}")
    updated = source.replace(OLD, NEW, 1)
    if args.check_only:
        print(f"Round73 validation passed: {REL}")
        return
    backup = path.with_suffix(path.suffix + ".round73.bak")
    if not backup.exists():
        shutil.copy2(path, backup)
    path.write_text(updated, encoding="utf-8")
    if NEW not in path.read_text(encoding="utf-8"):
        raise SystemExit("Round73 post-write verification failed")
    print(f"Round73 applied: {REL}")
    print(f"Backup: {backup}")

if __name__ == "__main__":
    main()
