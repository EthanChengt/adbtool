#!/usr/bin/env python3
"""Round70: initialize directional focus-search result before mutually exclusive branches."""
from pathlib import Path
import argparse
import shutil

REL = Path("app/src/main/java/p006b/p049j/p051b/AbstractC0443a.java")
OLD = "        C0429b c0429b;\n"
NEW = "        C0429b c0429b = null;\n"

def transform(source):
    count = source.count(OLD)
    if count != 1:
        raise ValueError(f"expected exactly one c0429b declaration, found {count}")
    return source.replace(OLD, NEW, 1)

def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("root", nargs="?", default=".")
    parser.add_argument("--check-only", action="store_true")
    args = parser.parse_args()
    path = Path(args.root) / REL
    source = path.read_text(encoding="utf-8")
    if NEW in source:
        print(f"Round70 already applied: {REL}")
        return
    updated = transform(source)
    if args.check_only:
        print(f"Round70 validation passed: {REL}")
        return
    backup = path.with_suffix(path.suffix + ".round70.bak")
    if not backup.exists():
        shutil.copy2(path, backup)
    path.write_text(updated, encoding="utf-8")
    if NEW not in path.read_text(encoding="utf-8"):
        raise SystemExit("Round70 post-write verification failed")
    print(f"Round70 applied: {REL}")
    print(f"Backup: {backup}")

if __name__ == "__main__":
    main()
