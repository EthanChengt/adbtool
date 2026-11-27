#!/usr/bin/env python3
"""Repair the decompiler-damaged operation scan in AbstractC0483r.m1804D."""
from __future__ import annotations
import argparse
import re
import shutil
from pathlib import Path

REL = Path("app/src/main/java/p006b/p056m/p057b/AbstractC0483r.java")
BACKUP = Path(".round47-backup") / REL

OLD = '''                        int i11 = 0;
                        while (true) {
                            if (i11 >= c0451a2.f2932a.size()) {
                                z = false;
                            } else if (C0451a.m1711o(c0451a2.f2932a.get(i11))) {
                                z = true;
                            } else {
                                i11++;
                            }
                        }'''

NEW = '''                        z = false;
                        for (int i11 = 0; i11 < c0451a2.f2932a.size(); i11++) {
                            if (C0451a.m1711o(c0451a2.f2932a.get(i11))) {
                                z = true;
                                break;
                            }
                        }'''


def transform(source: str) -> tuple[str, str]:
    if NEW in source:
        if OLD in source:
            raise SystemExit("Round47 validation failed: both old and repaired loop found")
        return source, "already-applied"
    count = source.count(OLD)
    if count != 1:
        raise SystemExit(f"Round47 validation failed: expected exactly one damaged operation scan, found {count}")
    updated = source.replace(OLD, NEW, 1)
    if updated.count(NEW) != 1 or OLD in updated:
        raise SystemExit("Round47 validation failed: post-replacement verification failed")
    return updated, "patched"


def main() -> None:
    parser = argparse.ArgumentParser()
    parser.add_argument("root", nargs="?", default=".")
    parser.add_argument("--check-only", action="store_true")
    args = parser.parse_args()
    root = Path(args.root).resolve()
    path = root / REL
    if not path.is_file():
        raise SystemExit(f"Missing source file: {path}")
    source = path.read_text(encoding="utf-8")
    updated, status = transform(source)
    if args.check_only:
        print(f"Round47 check passed: AbstractC0483r.m1804D operation scan {status}; no files changed.")
        return
    if status == "already-applied":
        print(f"Round47 already applied: {REL}")
        return
    backup = root / BACKUP
    backup.parent.mkdir(parents=True, exist_ok=True)
    if not backup.exists():
        shutil.copy2(path, backup)
    path.write_text(updated, encoding="utf-8")
    print(f"Round47 applied: repaired operation scan in {REL}; backup: {BACKUP}")

if __name__ == "__main__":
    main()
