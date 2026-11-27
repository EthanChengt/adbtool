#!/usr/bin/env python3
"""Round 35: propagate checked IOException through Glide image-parser helpers.

Run from the repository root:
  python3 round35_io_propagation_fix1.py . --check-only
  python3 round35_io_propagation_fix1.py .

All anchors are validated before any write. The original file is backed up under
.round35-backup/ (outside Android source/resource trees).
"""
from __future__ import annotations

import argparse
import shutil
import sys
from pathlib import Path

REL = Path("app/src/main/java/b/s/m.java")
BACKUP = Path(".round35-backup") / REL
SIGNATURES = (
    (
        "public static int m1973q(List<ImageHeaderParser> list, InputStream inputStream, InterfaceC0676b interfaceC0676b) {",
        "public static int m1973q(List<ImageHeaderParser> list, InputStream inputStream, InterfaceC0676b interfaceC0676b) throws IOException {",
        "m1973q InputStream entry point",
    ),
    (
        "public static int m1974r(List<ImageHeaderParser> list, InterfaceC0643k interfaceC0643k) {",
        "public static int m1974r(List<ImageHeaderParser> list, InterfaceC0643k interfaceC0643k) throws IOException {",
        "m1974r parser loop",
    ),
    (
        "public static ImageHeaderParser.ImageType m1978v(List<ImageHeaderParser> list, InputStream inputStream, InterfaceC0676b interfaceC0676b) {",
        "public static ImageHeaderParser.ImageType m1978v(List<ImageHeaderParser> list, InputStream inputStream, InterfaceC0676b interfaceC0676b) throws IOException {",
        "m1978v InputStream entry point",
    ),
    (
        "public static ImageHeaderParser.ImageType m1979w(List<ImageHeaderParser> list, InterfaceC0644l interfaceC0644l) {",
        "public static ImageHeaderParser.ImageType m1979w(List<ImageHeaderParser> list, InterfaceC0644l interfaceC0644l) throws IOException {",
        "m1979w parser loop",
    ),
)


def patch_text(text: str) -> tuple[str, list[str]]:
    result = text
    changes: list[str] = []
    # Prevalidate each exact signature before applying the in-memory edits.
    for old, new, label in SIGNATURES:
        old_count = result.count(old)
        new_count = result.count(new)
        if old_count == 1 and new_count == 0:
            result = result.replace(old, new, 1)
            changes.append(label)
        elif old_count == 0 and new_count == 1:
            continue  # already applied; idempotent rerun
        else:
            raise ValueError(
                f"{label}: expected one unpatched or one already-patched signature; "
                f"found unpatched={old_count}, patched={new_count}"
            )
    if "import java.io.IOException;" not in result:
        raise ValueError("java.io.IOException import is missing from b/s/m.java")
    return result, changes


def main() -> int:
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("root", nargs="?", default=".", help="repository root (default: current directory)")
    parser.add_argument("--check-only", action="store_true", help="validate anchors without writing files")
    args = parser.parse_args()

    root = Path(args.root).resolve()
    source = root / REL
    if not source.is_file():
        print(f"ERROR: required source file not found: {source}", file=sys.stderr)
        return 2

    original = source.read_text(encoding="utf-8")
    try:
        updated, changes = patch_text(original)
    except ValueError as exc:
        print(f"Round35 validation failed; no files were written: {exc}", file=sys.stderr)
        return 2

    if args.check_only:
        print(f"Round35 check passed: {len(SIGNATURES)} signatures validated; no files changed.")
        return 0

    if updated == original:
        print("Round35 already applied; no files changed.")
        return 0

    backup = root / BACKUP
    backup.parent.mkdir(parents=True, exist_ok=True)
    if not backup.exists():
        shutil.copy2(source, backup)
    source.write_text(updated, encoding="utf-8")
    print(f"Round35 applied: {len(changes)} method signature(s) updated in {REL.as_posix()}.")
    print(f"Original source backup: {BACKUP.as_posix()}")
    print("Checked IOException now propagates through the four image-parser utility methods.")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
