#!/usr/bin/env python3
"""Round53: repair JADX-damaged control flow in C0466h0.java.

Changes are deliberately narrow and validated by exact occurrence counts:
- initialize the transition predicate z3 to false;
- restore missing for-loop initializers/increments for i4 and i6;
- remove duplicated consecutive break statements left by decompilation.

Usage:
  python3 round53_c0466h0_control_flow_repair.py [repo_root] [--check-only]
"""
from __future__ import annotations

import argparse
import shutil
import sys
from pathlib import Path

REL = Path("app/src/main/java/p006b/p056m/p057b/C0466h0.java")
BACKUP_DIR = Path(".round53-backup")

REPLACEMENTS = [
    ("        boolean z3;\n", "        boolean z3 = false;\n", 1, "initialize z3"),
    ("                                while (i4 < size) {", "                                for (i4 = 0; i4 < size; i4++) {", 2, "restore i4 loops"),
    ("                                        while (i6 < size2) {", "                                        for (i6 = 0; i6 < size2; i6++) {", 2, "restore i6 loops"),
    ("                                                break;\n                                                break;", "                                                break;", 2, "remove duplicate break"),
]


def transform(source: str) -> str:
    result = source
    for old, new, count, label in REPLACEMENTS:
        found = result.count(old)
        if found == 0:
            if label == "remove duplicate break":
                continue  # no duplicated consecutive break remains
            if result.count(new) == count:
                continue  # already applied
        if found != count:
            raise ValueError(f"{label}: expected {count} source occurrence(s), found {found}; no files written")
        result = result.replace(old, new)
    return result


def main() -> int:
    parser = argparse.ArgumentParser()
    parser.add_argument("repo_root", nargs="?", default=".")
    parser.add_argument("--check-only", action="store_true")
    args = parser.parse_args()

    root = Path(args.repo_root).resolve()
    target = root / REL
    if not target.is_file():
        print(f"ERROR: target not found: {target}", file=sys.stderr)
        return 2

    original = target.read_text(encoding="utf-8")
    try:
        updated = transform(original)
    except ValueError as exc:
        print(f"Round53 validation failed; no files were written:\n- {exc}", file=sys.stderr)
        return 1

    if updated == original:
        print("Round53 already applied; no changes needed.")
        return 0
    if args.check_only:
        print("Round53 validation passed; all expected C0466h0 anchors are present.")
        return 0

    backup_dir = root / BACKUP_DIR
    backup_dir.mkdir(parents=True, exist_ok=True)
    backup = backup_dir / "C0466h0.java.original"
    if not backup.exists():
        shutil.copy2(target, backup)
    target.write_text(updated, encoding="utf-8", newline="")
    print(f"Round53 applied successfully: {REL}")
    print(f"Backup: {backup.relative_to(root)}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
