#!/usr/bin/env python3
"""Round51: restore definite initialization in C0274n0.m1116l.

The decompiled AppCompat tint branch has a special no-tint resource case
(R.drawable.j). Preserve that behavior by setting z=false and leaving the
color/alpha values at harmless defaults for that branch.
"""
from __future__ import annotations

import argparse
import datetime as _dt
import shutil
import sys
from pathlib import Path

TARGET = Path("app/src/main/java/p006b/p008b/p018i/C0274n0.java")

OLD = """                } else if (i != R.drawable.j) {
                    i2 = 0;
                    iRound = -1;
                    z = false;
                }
                if (z) {"""

NEW = """                } else if (i != R.drawable.j) {
                    i2 = 0;
                    iRound = -1;
                    z = false;
                } else {
                    // R.drawable.j is the dialog material background: do not tint it.
                    i2 = 0;
                    iRound = -1;
                    z = false;
                }
                if (z) {"""

def main() -> int:
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("root", nargs="?", default=".", help="repository root")
    parser.add_argument("--check-only", action="store_true", help="validate without writing")
    args = parser.parse_args()

    root = Path(args.root).resolve()
    target = root / TARGET
    if not target.is_file():
        print(f"Round51 error: target file not found: {target}", file=sys.stderr)
        return 2

    source = target.read_text(encoding="utf-8")
    if NEW in source:
        print("Round51: already applied; no changes needed")
        return 0
    count = source.count(OLD)
    if count != 1:
        print(f"Round51 validation failed: expected exactly one C0274n0.m1116l branch anchor, found {count}", file=sys.stderr)
        return 1
    if args.check_only:
        print("Round51 validation passed: patch applicable")
        return 0

    backup_dir = root / ".round51-backup" / TARGET.parent
    backup_dir.mkdir(parents=True, exist_ok=True)
    stamp = _dt.datetime.now().strftime("%Y%m%d-%H%M%S")
    backup = backup_dir / f"{TARGET.stem}.{stamp}{TARGET.suffix}"
    shutil.copy2(target, backup)

    updated = source.replace(OLD, NEW, 1)
    target.write_text(updated, encoding="utf-8")
    print(f"Round51 applied: {TARGET.as_posix()}")
    print(f"Backup: {backup.relative_to(root).as_posix()}")
    return 0

if __name__ == "__main__":
    raise SystemExit(main())
