#!/usr/bin/env python3
"""Round46: initialize C0295y.m1172e's AndroidX attribute index local."""

from __future__ import annotations

import argparse
import shutil
import sys
from pathlib import Path

TARGET = Path(
    "app/src/main/java/p006b/p008b/p018i/C0295y.java"
)
METHOD_SIGNATURE = "public void m1172e(AttributeSet attributeSet, int i) {"
BACKUP_ROOT = Path(".round46-backup")


def find_method_body(source: str, signature: str) -> tuple[int, int]:
    """Return (opening-brace index, closing-brace index) for a Java method."""
    start = source.find(signature)
    if start < 0:
        raise ValueError(f"Method signature not found: {signature}")

    brace = source.find("{", start)
    if brace < 0:
        raise ValueError("Method opening brace not found")

    depth = 0
    in_string = False
    in_char = False
    in_line_comment = False
    in_block_comment = False
    escaped = False
    i = brace

    while i < len(source):
        ch = source[i]
        nxt = source[i + 1] if i + 1 < len(source) else ""

        if in_line_comment:
            if ch == "\n":
                in_line_comment = False
            i += 1
            continue

        if in_block_comment:
            if ch == "*" and nxt == "/":
                in_block_comment = False
                i += 2
            else:
                i += 1
            continue

        if in_string or in_char:
            if escaped:
                escaped = False
            elif ch == "\\":
                escaped = True
            elif in_string and ch == '"':
                in_string = False
            elif in_char and ch == "'":
                in_char = False
            i += 1
            continue

        if ch == "/" and nxt == "/":
            in_line_comment = True
            i += 2
            continue
        if ch == "/" and nxt == "*":
            in_block_comment = True
            i += 2
            continue
        if ch == '"':
            in_string = True
            i += 1
            continue
        if ch == "'":
            in_char = True
            i += 1
            continue

        if ch == "{":
            depth += 1
        elif ch == "}":
            depth -= 1
            if depth == 0:
                return brace, i
        i += 1

    raise ValueError("Unbalanced braces while locating m1172e")


def repair(source: str) -> tuple[str, str]:
    brace_start, brace_end = find_method_body(source, METHOD_SIGNATURE)
    method = source[brace_start : brace_end + 1]

    uninitialized = "int i5;"
    initialized = "int i5 = 15;"
    uninitialized_count = method.count(uninitialized)
    initialized_count = method.count(initialized)

    if initialized_count == 1 and uninitialized_count == 0:
        return source, "already-fixed"
    if uninitialized_count != 1 or initialized_count != 0:
        raise ValueError(
            "C0295y.m1172e expected exactly one 'int i5;' declaration "
            f"or one initialized declaration; found uninitialized={uninitialized_count}, "
            f"initialized={initialized_count}"
        )

    # The decompiled control flow only assigns i5 when attribute index 5 is
    # present, but reads i5 afterwards. Index 15 is the intended default.
    repaired_method = method.replace(uninitialized, initialized, 1)

    declaration_pos = repaired_method.find(initialized)
    first_use_pos = repaired_method.find("m1167o(i5)")
    if first_use_pos < 0 or declaration_pos < 0 or declaration_pos > first_use_pos:
        raise ValueError("Round46 postcondition failed: i5 is not initialized before use")

    repaired_source = (
        source[:brace_start] + repaired_method + source[brace_end + 1 :]
    )
    return repaired_source, "patched"


def main() -> int:
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("root", nargs="?", default=".", help="project root (default: .)")
    parser.add_argument("--check-only", action="store_true", help="validate without writing")
    args = parser.parse_args()

    root = Path(args.root).resolve()
    target = root / TARGET
    if not target.is_file():
        print(f"Round46: missing target file: {target}", file=sys.stderr)
        return 2

    try:
        original = target.read_text(encoding="utf-8")
        updated, status = repair(original)
    except (OSError, UnicodeError, ValueError) as exc:
        print(f"Round46 validation failed; no files were written: {exc}", file=sys.stderr)
        return 1

    if args.check_only:
        print(
            "Round46 check passed: C0295y.m1172e i5 initialization "
            f"({status}); no files changed."
        )
        return 0

    if status == "already-fixed":
        print(f"Round46 no change required: {TARGET.as_posix()}")
        return 0

    backup = root / BACKUP_ROOT / TARGET
    backup.parent.mkdir(parents=True, exist_ok=True)
    if not backup.exists():
        shutil.copy2(target, backup)

    target.write_text(updated, encoding="utf-8")
    print(
        "Round46 applied: initialized i5 to attribute index 15 in "
        f"{TARGET.as_posix()}; backup: {backup.relative_to(root).as_posix()}"
    )
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
