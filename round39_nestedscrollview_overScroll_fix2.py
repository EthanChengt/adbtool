#!/usr/bin/env python3
"""Round39 Fix2: restore NestedScrollView.m218w with method-scoped anchors."""
from __future__ import annotations

import argparse
import shutil
import sys
from pathlib import Path

REL = Path("app/src/main/java/androidx/core/widget/NestedScrollView.java")
BACKUP_ROOT = Path(".round39-backup")
START = "    /* JADX INFO: renamed from: w */\n    public boolean m218w("
END = "    /* JADX INFO: renamed from: x */\n"

NEW_METHOD = '''    /* JADX INFO: renamed from: w */
    public boolean m218w(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int overScrollMode = getOverScrollMode();
        boolean canScrollHorizontal = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean canScrollVertical = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean overScrollHorizontal = overScrollMode == 0 || (overScrollMode == 1 && canScrollHorizontal);
        boolean overScrollVertical = overScrollMode == 0 || (overScrollMode == 1 && canScrollVertical);

        int newScrollX = i3 + i;
        if (!overScrollHorizontal) {
            i7 = 0;
        }

        int newScrollY = i4 + i2;
        if (!overScrollVertical) {
            i8 = 0;
        }

        int left = -i7;
        int right = i7 + i5;
        int top = -i8;
        int bottom = i8 + i6;

        boolean clampedX = false;
        if (newScrollX > right) {
            newScrollX = right;
            clampedX = true;
        } else if (newScrollX < left) {
            newScrollX = left;
            clampedX = true;
        }

        boolean clampedY = false;
        if (newScrollY > bottom) {
            newScrollY = bottom;
            clampedY = true;
        } else if (newScrollY < top) {
            newScrollY = top;
            clampedY = true;
        }

        if (clampedY && !m214r(1)) {
            this.f588d.springBack(newScrollX, newScrollY, 0, 0, 0, getScrollRange());
        }

        onOverScrolled(newScrollX, newScrollY, clampedX, clampedY);
        return clampedX || clampedY;
    }

'''


def locate_region(source: str) -> tuple[int, int, str]:
    start_count = source.count(START)
    if start_count != 1:
        raise ValueError(f"expected exactly one m218w start anchor, found {start_count}")

    start = source.index(START)
    # This class also has a field whose JADX comment is "renamed from: x".
    # Only the method boundary after m218w is relevant.
    end_count = source.count(END, start + len(START))
    if end_count != 1:
        raise ValueError(f"expected exactly one m218w end anchor after method start, found {end_count}")

    end = source.index(END, start + len(START))
    if end <= start:
        raise ValueError("m218w method boundary order is invalid")
    region = source[start:end]
    if region.count("public boolean m218w(") != 1:
        raise ValueError("m218w signature is not unique inside its target region")
    return start, end, region


def transform(source: str) -> tuple[str, str]:
    start, end, region = locate_region(source)
    if region == NEW_METHOD:
        return source, "already-applied"

    required_old_fragments = (
        "boolean z;",
        "boolean z2;",
        "if (i9 <= i14)",
        "onOverScrolled(i9, i11, z, z2);",
    )
    missing = [fragment for fragment in required_old_fragments if fragment not in region]
    if missing:
        raise ValueError("m218w source does not match expected damaged version; missing: " + ", ".join(missing))

    updated = source[:start] + NEW_METHOD + source[end:]
    post_start, post_end, post_region = locate_region(updated)
    if post_region != NEW_METHOD:
        raise ValueError("postcondition failed: replaced m218w method does not match expected output")
    for fragment in (
        "boolean clampedX = false;",
        "boolean clampedY = false;",
        "if (clampedY && !m214r(1))",
        "onOverScrolled(newScrollX, newScrollY, clampedX, clampedY);",
        "return clampedX || clampedY;",
    ):
        if fragment not in post_region:
            raise ValueError(f"postcondition failed: {fragment}")
    return updated, "patched"


def main() -> int:
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("root", nargs="?", default=".", help="repository root (default: current directory)")
    parser.add_argument("--check-only", action="store_true", help="validate anchors without writing files")
    args = parser.parse_args()

    root = Path(args.root).resolve()
    target = root / REL
    if not target.is_file():
        print(f"ERROR: source file not found: {target}", file=sys.stderr)
        return 2

    try:
        original = target.read_text(encoding="utf-8")
        updated, status = transform(original)
    except (OSError, UnicodeError, ValueError) as exc:
        print(f"Round39 Fix2 validation failed; no files were written: {exc}", file=sys.stderr)
        return 1

    print(f"Round39 Fix2: NestedScrollView.m218w={status}")
    if args.check_only:
        print("Round39 Fix2 check passed; no files changed.")
        return 0
    if status == "already-applied":
        print(f"Round39 Fix2 already applied; no changes made: {REL.as_posix()}")
        return 0

    backup = root / BACKUP_ROOT / REL
    try:
        backup.parent.mkdir(parents=True, exist_ok=True)
        if not backup.exists():
            shutil.copy2(target, backup)
        target.write_text(updated, encoding="utf-8", newline="")
    except OSError as exc:
        print(f"Round39 Fix2 write failed: {exc}", file=sys.stderr)
        return 1

    print(f"Round39 Fix2 applied: restored complete over-scroll logic in {REL.as_posix()}")
    print(f"Original source backup: {backup.relative_to(root).as_posix()}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
