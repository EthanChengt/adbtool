#!/usr/bin/env python3
"""Round42: remove duplicate consecutive @Override annotations introduced by Round41.

Run after round41_c0264i0_linear_layout_fix.py and before Gradle compilation.
The patch is deliberately limited to adjacent duplicate annotations; it does not
change any method body or layout behavior.
"""
from __future__ import annotations

import argparse
import re
import shutil
import sys
from pathlib import Path

REL = Path("app/src/main/java/p006b/p008b/p018i/C0264i0.java")
BACKUP_ROOT = Path(".round42-backup")

# A single annotation followed immediately by one or more further @Override
# annotation lines. Comments following annotations are preserved on the first.
DUPLICATE_OVERRIDE = re.compile(
    r"(?m)^(?P<first>[ \t]*@Override[^\r\n]*\r?\n)"
    r"(?:(?:[ \t]*\r?\n)*[ \t]*@Override[^\r\n]*\r?\n)+"
)


def patch(source: str) -> tuple[str, int]:
    if "public class C0264i0 extends android.widget.LinearLayout {" not in source:
        raise ValueError("Round41 migration is not present; run Round41 before Round42")
    if "public void onMeasure(int i, int i2)" in source:
        raise ValueError("damaged onMeasure override is still present; Round41 was not fully applied")
    if "public void onLayout(boolean z, int i, int i2, int i3, int i4)" in source:
        raise ValueError("damaged onLayout override is still present; Round41 was not fully applied")

    matches = list(DUPLICATE_OVERRIDE.finditer(source))
    if not matches:
        # Idempotent second execution: all duplicate blocks have already gone.
        return source, 0
    if len(matches) != 2:
        raise ValueError(
            f"expected 2 duplicated @Override blocks from Round41, found {len(matches)}; refusing to guess"
        )

    updated, count = DUPLICATE_OVERRIDE.subn(lambda m: m.group("first"), source)
    if count != 2:
        raise ValueError(f"internal replacement count mismatch: expected 2, got {count}")
    if DUPLICATE_OVERRIDE.search(updated):
        raise ValueError("duplicate @Override annotations remain after repair")
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
        print(f"Round42 validation failed; no files were written: {exc}", file=sys.stderr)
        return 1

    if args.check_only:
        print(f"Round42 check passed: {count} duplicate @Override block(s) will be removed; no files changed.")
        return 0
    if updated == original:
        print("Round42 already applied; no changes made.")
        return 0

    backup = root / BACKUP_ROOT / REL
    backup.parent.mkdir(parents=True, exist_ok=True)
    if not backup.exists():
        shutil.copy2(target, backup)
    target.write_text(updated, encoding="utf-8")
    print(f"Round42 applied: removed {count} duplicate @Override annotation block(s) in {REL}")
    print(f"Original source backup: {backup.relative_to(root)}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
