#!/usr/bin/env python3
"""Round72: preserve ControlView action semantics and satisfy Java definite assignment."""
from pathlib import Path
import argparse
import shutil

REL = Path("app/src/main/java/com/didjdk/adbhelper/view/ControlView.java")
OLD = """                    sb.append(jUptimeMillis - this.f10112n);
                }
                runnableC0964q3.m2627c(sb.toString());
"""
NEW = """                    sb.append(jUptimeMillis - this.f10112n);
                } else {
                    // Only a completed tap (0) or swipe (2) produces a command.
                    return true;
                }
                runnableC0964q3.m2627c(sb.toString());
"""

def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("root", nargs="?", default=".")
    parser.add_argument("--check-only", action="store_true")
    args = parser.parse_args()
    path = Path(args.root) / REL
    source = path.read_text(encoding="utf-8")
    if NEW in source:
        print(f"Round72 already applied: {REL}")
        return
    count = source.count(OLD)
    if count != 1:
        raise SystemExit(f"Round72 expected exactly one action dispatch anchor, found {count}")
    updated = source.replace(OLD, NEW, 1)
    if args.check_only:
        print(f"Round72 validation passed: {REL}")
        return
    backup = path.with_suffix(path.suffix + ".round72.bak")
    if not backup.exists():
        shutil.copy2(path, backup)
    path.write_text(updated, encoding="utf-8")
    if NEW not in path.read_text(encoding="utf-8"):
        raise SystemExit("Round72 post-write verification failed")
    print(f"Round72 applied: {REL}")
    print(f"Backup: {backup}")

if __name__ == "__main__":
    main()
