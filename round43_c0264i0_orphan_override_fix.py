#!/usr/bin/env python3
"""Round43: remove the orphaned @Override left before C0264i0.m1078p by Round41.

Round41 deletes the broken onMeasure override. Its preceding @Override line
was left behind and is now attached to m1078p(), which is not a LinearLayout
or View method. This patch removes only that annotation; it leaves the method
and all layout behavior untouched.

Usage:
  python3 round43_c0264i0_orphan_override_fix.py . --check-only
  python3 round43_c0264i0_orphan_override_fix.py .
"""
from __future__ import annotations

import argparse
import re
import shutil
import sys
from pathlib import Path

REL = Path("app/src/main/java/p006b/p008b/p018i/C0264i0.java")
BACKUP_ROOT = Path(".round43-backup")

# The annotation that originally belonged to onMeasure is now stranded
# immediately before m1078p's JADX method comment.
ORPHAN = re.compile(
    r"(?m)^(?P<indent>[ \t]*)@Override[^\r\n]*\r?\n"
    r"(?=(?:[ \t]*\r?\n)*[ \t]*/\* JADX INFO: renamed from p \*/\r?\n"
    r"[ \t]*public int m1078p\s*\(\s*\))"
)


def patch(source: str) -> tuple[str, int]:
    if "public class C0264i0 extends android.widget.LinearLayout {" not in source:
        raise ValueError("Round41 LinearLayout migration is missing")
    if "public void onMeasure(int i, int i2)" in source:
        raise ValueError("damaged onMeasure method remains; Round41 must run first")
    if "public int m1078p()" not in source:
        raise ValueError("m1078p method anchor is missing")

    matches = list(ORPHAN.finditer(source))
    if not matches:
        # Idempotent when the orphan has already been removed.
        return source, 0
    if len(matches) != 1:
        raise ValueError(
            f"expected exactly one orphan @Override before m1078p(), found {len(matches)}"
        )

    updated, count = ORPHAN.subn("", source, count=1)
    if count != 1:
        raise ValueError(f"internal replacement count mismatch: {count}")
    if ORPHAN.search(updated):
        raise ValueError("orphan @Override remains before m1078p()")
    return updated, count


def main() -> int:
    parser = argparse.ArgumentParser()
    parser.add_argument("root", nargs="?", default=".")
    parser.add_argument("--check-only", action="store_true")
    args = parser.parse_args()

    root = Path(args.root).resolve()
    target = root / REL
    if not target.is_file():
        print(f"ERROR: source file not found: {target}", file=sys.stderr)
        return 2

    original = target.read_text(encoding="utf-8")
    try:
        updated, count = patch(original)
    except Exception as exc:
        print(f"Round43 validation failed; no files were written: {exc}", file=sys.stderr)
        return 1

    if args.check_only:
        print(
            f"Round43 check passed: {count} orphan @Override annotation(s) will be removed; "
            "no files changed."
        )
        return 0
    if updated == original:
        print("Round43 already applied; no changes made.")
        return 0

    backup = root / BACKUP_ROOT / REL
    backup.parent.mkdir(parents=True, exist_ok=True)
    if not backup.exists():
        shutil.copy2(target, backup)
    target.write_text(updated, encoding="utf-8")
    print(f"Round43 applied: removed orphan @Override before m1078p() in {REL}")
    print(f"Original source backup: {backup.relative_to(root)}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
