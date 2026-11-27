#!/usr/bin/env python3
"""Round 36: initialize the bottom-left corner Y coordinate in C1300k.

Run from repository root:
  python3 round36_corner_matrix_init_fix1.py . --check-only
  python3 round36_corner_matrix_init_fix1.py .

The script validates the exact source anchor before changing any file and
stores the original source under .round36-backup/.
"""
from __future__ import annotations

import argparse
import shutil
from pathlib import Path

REL = Path("app/src/main/java/p080c/p126d/p127a/p128a/p154x/C1300k.java")
BACKUP = Path(".round36-backup")
OLD = """            } else {
                f3 = rectF.left;
            }
            pointF.set(f3, f4);
"""
NEW = """            } else {
                f3 = rectF.left;
                f4 = rectF.bottom;
            }
            pointF.set(f3, f4);
"""


def main() -> int:
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("root", nargs="?", default=".", help="repository root")
    parser.add_argument("--check-only", action="store_true", help="validate without writing")
    args = parser.parse_args()

    root = Path(args.root).resolve()
    source = root / REL
    if not source.is_file():
        raise SystemExit(f"Round36: source file not found: {REL.as_posix()}")

    text = source.read_text(encoding="utf-8")
    old_count = text.count(OLD)
    new_count = text.count(NEW)

    if old_count == 1:
        updated = text.replace(OLD, NEW, 1)
        action = "patch"
    elif old_count == 0 and new_count == 1:
        updated = text
        action = "already-applied"
    else:
        raise SystemExit(
            "Round36: expected exactly one unpatched corner anchor "
            f"(found old={old_count}, already-patched={new_count}); no files written"
        )

    # Guard against accidentally targeting a different block or file revision.
    if "f3 = rectF.left;\n                f4 = rectF.bottom;" not in updated:
        raise SystemExit("Round36: post-validation failed; no files written")

    if args.check_only:
        print(f"Round36 check passed: {REL.as_posix()} ({action}); no files changed.")
        return 0

    if action == "already-applied":
        print(f"Round36: already applied; no changes made: {REL.as_posix()}")
        return 0

    backup = root / BACKUP / REL
    backup.parent.mkdir(parents=True, exist_ok=True)
    if not backup.exists():
        shutil.copy2(source, backup)

    source.write_text(updated, encoding="utf-8")
    print(f"Round36 applied: {REL.as_posix()}")
    print(f"Original source backup: {backup.relative_to(root).as_posix()}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
