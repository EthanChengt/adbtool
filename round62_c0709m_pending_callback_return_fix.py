#!/usr/bin/env python3
"""Round62: restore the pending-callback return path in C0709m.m2400b."""
from pathlib import Path
import argparse
import sys

REL = Path("app/src/main/java/p080c/p084b/p085a/p088m/p091u/C0709m.java")
OLD = '''        } else {
            if (this.f4221y) {
                z = false;
            }
            m.m1958b(z, "Cannot add callbacks to a cancelled EngineJob");
        }
        executor.execute(aVar);'''
NEW = '''        } else {
            if (this.f4221y) {
                z = false;
            }
            m.m1958b(z, "Cannot add callbacks to a cancelled EngineJob");
            return;
        }
        executor.execute(aVar);'''

def transform(text):
    if text.count(NEW) == 1:
        return text
    if text.count(OLD) != 1:
        raise SystemExit(
            f"{REL}: expected exactly one m2400b control-flow anchor, found {text.count(OLD)}"
        )
    return text.replace(OLD, NEW, 1)

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
        print(f"Round62 validation passed: {REL}")
        return
    if after != before:
        backup = path.with_suffix(path.suffix + ".round62.bak")
        if not backup.exists():
            backup.write_text(before, encoding="utf-8")
        path.write_text(after, encoding="utf-8")
        print(f"Round62 applied: {REL}")
    else:
        print(f"Round62 already applied: {REL}")
    verified = path.read_text(encoding="utf-8")
    if verified.count(NEW) != 1:
        raise SystemExit(f"Round62 post-write verification failed: {REL}")
    print("Round62 post-write verification passed")

if __name__ == "__main__":
    main()
