#!/usr/bin/env python3
"""Round42 Fix2: safely collapse duplicate @Override annotations in C0264i0.

Run after round41_c0264i0_linear_layout_fix.py. Comments and blank lines may
occur between annotations, so this scans annotation blocks rather than relying
on a strict adjacent-line regex. Only duplicate @Override annotations are
removed; comments, other annotations, method bodies and layout logic remain.
"""
from __future__ import annotations

import argparse
import shutil
import sys
from pathlib import Path

REL = Path("app/src/main/java/p006b/p008b/p018i/C0264i0.java")
BACKUP_ROOT = Path(".round42-backup")


def _is_override_annotation(stripped: str) -> bool:
    token = "@Override"
    return stripped.startswith(token) and (
        len(stripped) == len(token)
        or not (stripped[len(token)].isalnum() or stripped[len(token)] in "_.$")
    )


def dedupe_override_annotations(source: str) -> tuple[str, int]:
    """Keep the first @Override per declaration annotation block."""
    out: list[str] = []
    override_seen = False
    in_block_comment = False
    removed = 0

    for line in source.splitlines(keepends=True):
        stripped = line.strip()

        if in_block_comment:
            out.append(line)
            if "*/" in line:
                in_block_comment = False
            continue

        # Blank lines and comments do not consume an annotation block.
        if not stripped or stripped.startswith("//"):
            out.append(line)
            continue
        if stripped.startswith("/*"):
            out.append(line)
            if "*/" not in stripped:
                in_block_comment = True
            continue
        if stripped.startswith("*") or stripped.startswith("*/"):
            out.append(line)
            continue

        if stripped.startswith("@"):
            if _is_override_annotation(stripped):
                if override_seen:
                    removed += 1
                    continue
                override_seen = True
            # Other annotations (for example @SuppressWarnings) are retained.
            out.append(line)
            continue

        # First declaration/code line: annotations above now belong to it.
        override_seen = False
        out.append(line)

    return "".join(out), removed


def patch(source: str) -> tuple[str, int]:
    if "public class C0264i0 extends android.widget.LinearLayout {" not in source:
        raise ValueError("Round41 migration is not present; run Round41 first")
    if "public void onMeasure(int i, int i2)" in source:
        raise ValueError("damaged onMeasure override remains; Round41 was not fully applied")
    if "public void onLayout(boolean z, int i, int i2, int i3, int i4)" in source:
        raise ValueError("damaged onLayout override remains; Round41 was not fully applied")

    updated, removed = dedupe_override_annotations(source)
    # A second scan must be clean. This also documents the idempotence property.
    _verified, leftovers = dedupe_override_annotations(updated)
    if leftovers:
        raise ValueError(f"post-patch validation failed: {leftovers} duplicate @Override annotation(s) remain")
    return updated, removed


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
        updated, removed = patch(original)
    except Exception as exc:
        print(f"Round42 validation failed; no files were written: {exc}", file=sys.stderr)
        return 1

    if args.check_only:
        print(f"Round42 check passed: {removed} duplicate @Override annotation(s) will be removed; no files changed.")
        return 0
    if updated == original:
        print("Round42 already applied; no changes made.")
        return 0

    backup = root / BACKUP_ROOT / REL
    backup.parent.mkdir(parents=True, exist_ok=True)
    if not backup.exists():
        shutil.copy2(target, backup)
    target.write_text(updated, encoding="utf-8")
    print(f"Round42 applied: removed {removed} duplicate @Override annotation(s) in {REL}")
    print(f"Original source backup: {backup.relative_to(root)}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
