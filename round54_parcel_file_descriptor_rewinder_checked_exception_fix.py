#!/usr/bin/env python3
"""Round54: adapt ParcelFileDescriptorRewinder IOException to DataRewinder API."""
from __future__ import annotations

import argparse
import shutil
import sys
from pathlib import Path

REL = Path("app/src/main/java/com/bumptech/glide/load/data/ParcelFileDescriptorRewinder.java")
OLD = '''    public ParcelFileDescriptor mo2301a() {
        return this.f6325a.rewind();
    }
'''
NEW = '''    public ParcelFileDescriptor mo2301a() {
        try {
            return this.f6325a.rewind();
        } catch (IOException e) {
            throw new RuntimeException("Failed to rewind ParcelFileDescriptor", e);
        }
    }
'''
BACKUP = Path(".round54-backup/ParcelFileDescriptorRewinder.java.original")


def main() -> int:
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("root", nargs="?", default=".", help="repository root")
    parser.add_argument("--check-only", action="store_true", help="validate without writing")
    args = parser.parse_args()

    root = Path(args.root).resolve()
    target = root / REL
    if not target.is_file():
        raise SystemExit(f"Target source file not found: {REL}")

    text = target.read_text(encoding="utf-8")
    if NEW in text:
        print("Round54 already applied; no changes needed.")
        return 0
    count = text.count(OLD)
    if count != 1:
        raise SystemExit(f"Expected exactly one mo2301a() anchor, found {count}; no files were written")

    if args.check_only:
        print("Round54 validation passed; one exact replacement is ready.")
        return 0

    backup = root / BACKUP
    backup.parent.mkdir(parents=True, exist_ok=True)
    if not backup.exists():
        shutil.copy2(target, backup)
    target.write_text(text.replace(OLD, NEW, 1), encoding="utf-8")
    print(f"Round54 applied: {REL}")
    return 0


if __name__ == "__main__":
    sys.exit(main())
