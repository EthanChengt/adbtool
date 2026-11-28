#!/usr/bin/env python3
"""Round71: handle checked IOExceptions while closing stream resources in C1127h.a."""
from pathlib import Path
import argparse
import shutil

REL = Path("app/src/main/java/c/c/a/p122w3/C1127h.java")
OLD = """            BufferedOutputStream bufferedOutputStream = c1127h.f5455e;
            if (bufferedOutputStream != null) {
                bufferedOutputStream.close();
            }
            InputStream inputStream = this.f5461b;
            if (inputStream != null) {
                inputStream.close();
            }
"""
NEW = """            BufferedOutputStream bufferedOutputStream = c1127h.f5455e;
            if (bufferedOutputStream != null) {
                try {
                    bufferedOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            InputStream inputStream = this.f5461b;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
"""

def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("root", nargs="?", default=".")
    parser.add_argument("--check-only", action="store_true")
    args = parser.parse_args()
    path = Path(args.root) / REL
    source = path.read_text(encoding="utf-8")
    if NEW in source:
        print(f"Round71 already applied: {REL}")
        return
    count = source.count(OLD)
    if count != 1:
        raise SystemExit(f"Round71 expected exactly one stream-close block, found {count}")
    updated = source.replace(OLD, NEW, 1)
    if args.check_only:
        print(f"Round71 validation passed: {REL}")
        return
    backup = path.with_suffix(path.suffix + ".round71.bak")
    if not backup.exists():
        shutil.copy2(path, backup)
    path.write_text(updated, encoding="utf-8")
    if NEW not in path.read_text(encoding="utf-8"):
        raise SystemExit("Round71 post-write verification failed")
    print(f"Round71 applied: {REL}")
    print(f"Backup: {backup}")

if __name__ == "__main__":
    main()
