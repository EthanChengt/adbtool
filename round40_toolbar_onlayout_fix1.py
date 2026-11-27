#!/usr/bin/env python3
"""Round40: repair JADX-damaged Toolbar.onLayout local flow and loops.

Usage:
  python3 round40_toolbar_onlayout_fix1.py . --check-only
  python3 round40_toolbar_onlayout_fix1.py .
"""
from __future__ import annotations

import argparse
import shutil
import sys
from pathlib import Path

REL = Path("app/src/main/java/androidx/appcompat/widget/Toolbar.java")
BACKUP = Path(".round40-backup") / REL

PATCHES = [
    (
        "initialize right edge before conditional toolbar children",
        """        int i27 = width - paddingRight;
        int[] iArr = this.f376G;""",
        """        int i27 = width - paddingRight;
        iM111q = i27;
        int[] iArr = this.f376G;""",
        1,
    ),
    (
        "restore title/subtitle width predicate in both duplicated branches",
        """            if (zM114t) {
            }
            i5 = this.f408x & 112;""",
        """            z2 = (!zM114t && this.f387c.getMeasuredWidth() > 0)
                    || (zM114t2 && this.f388d.getMeasuredWidth() > 0);
            i5 = this.f408x & 112;""",
        2,
    ),
    (
        "restore left custom-child loop",
        """        while (i18 < size) {
            iM110p2 = m110p(this.f374E.get(i18), iM110p2, iArr, iMin2);
        }""",
        """        for (i18 = 0; i18 < size; i18++) {
            iM110p2 = m110p(this.f374E.get(i18), iM110p2, iArr, iMin2);
        }""",
        1,
    ),
    (
        "restore right custom-child loop",
        """        while (i20 < size2) {
            iMin = m111q(this.f374E.get(i20), iMin, iArr, i19);
        }""",
        """        for (i20 = 0; i20 < size2; i20++) {
            iMin = m111q(this.f374E.get(i20), iMin, iArr, i19);
        }""",
        1,
    ),
    (
        "restore centered custom-child loop",
        """        while (i26 < size4) {
            iM110p3 = m110p(this.f374E.get(i26), iM110p3, iArr, i19);
        }""",
        """        for (i26 = 0; i26 < size4; i26++) {
            iM110p3 = m110p(this.f374E.get(i26), iM110p3, iArr, i19);
        }""",
        1,
    ),
]

ALREADY = [
    ("right edge initialized", "        iM111q = i27;"),
    ("title/subtitle predicate restored",
     "z2 = (!zM114t && this.f387c.getMeasuredWidth() > 0)"),
    ("left loop restored", "for (i18 = 0; i18 < size; i18++)"),
    ("right loop restored", "for (i20 = 0; i20 < size2; i20++)"),
    ("center loop restored", "for (i26 = 0; i26 < size4; i26++)"),
]

def transform(source: str) -> tuple[str, list[str]]:
    result = source
    statuses = []
    for label, old, new, expected in PATCHES:
        old_count = result.count(old)
        if old_count == expected:
            result = result.replace(old, new, expected)
            statuses.append(f"{label}: patch")
        elif old_count == 0:
            # Accept only when the corresponding replacement is present
            new_count = result.count(new)
            if new_count == expected:
                statuses.append(f"{label}: already-applied")
            else:
                raise RuntimeError(
                    f"{label}: expected {expected} old anchor(s) or "
                    f"{expected} patched anchor(s); found old={old_count}, new={new_count}"
                )
        else:
            raise RuntimeError(
                f"{label}: expected exactly {expected} old anchor(s), found {old_count}"
            )

    # Validate all resulting code fragments before any write.
    checks = [
        ("right edge", "int i27 = width - paddingRight;\n        iM111q = i27;"),
        ("predicate", "z2 = (!zM114t && this.f387c.getMeasuredWidth() > 0)"),
        ("left for-loop", "for (i18 = 0; i18 < size; i18++)"),
        ("right for-loop", "for (i20 = 0; i20 < size2; i20++)"),
        ("center for-loop", "for (i26 = 0; i26 < size4; i26++)"),
    ]
    for label, fragment in checks:
        if fragment not in result:
            raise RuntimeError(f"post-validation failed: {label}")
    if result.count("z2 = (!zM114t && this.f387c.getMeasuredWidth() > 0)") != 2:
        raise RuntimeError("post-validation failed: expected two restored z2 predicates")
    return result, statuses

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
        updated, statuses = transform(original)
    except Exception as exc:
        print(f"Round40 validation failed; no files were written:\n- {exc}", file=sys.stderr)
        return 3

    for status in statuses:
        print(f"Round40: {status}")

    if args.check_only:
        print("Round40 check passed; no files changed.")
        return 0

    if updated == original:
        print("Round40 already applied; no changes made.")
        return 0

    backup = root / BACKUP
    backup.parent.mkdir(parents=True, exist_ok=True)
    if not backup.exists():
        shutil.copy2(target, backup)

    target.write_text(updated, encoding="utf-8")
    print(f"Round40 applied to {REL.as_posix()}")
    print(f"Original source backup: {BACKUP.as_posix()}")
    return 0

if __name__ == "__main__":
    raise SystemExit(main())
