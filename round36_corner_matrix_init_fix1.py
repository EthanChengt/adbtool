#!/usr/bin/env python3
"""Round36 corrected anchor: initialize the missing bottom-left corner Y.

Run from repository root:
  python3 round36_corner_matrix_init_fix1.py . --check-only
  python3 round36_corner_matrix_init_fix1.py .

This replaces the previous Round36 file with an indentation-correct anchor.
All validation happens before any source file is written.
"""
from __future__ import annotations

import argparse
import re
import shutil
from pathlib import Path

REL = Path("app/src/main/java/p080c/p126d/p127a/p128a/p154x/C1300k.java")
BACKUP = Path(".round36-backup")

# In the decompiled source this else belongs to `if (i != 2)` and is indented
# one level deeper than the previous script assumed (16 spaces, not 12).
OLD_PATTERN = re.compile(
    r"(?m)^(?P<indent>[ \t]*)\} else \{\n"
    r"(?P=indent)    f3 = rectF\.left;\n"
    r"(?P=indent)\}\n"
    r"(?P=indent)pointF\.set\(f3, f4\);"
)
NEW_PATTERN = re.compile(
    r"(?m)^(?P<indent>[ \t]*)\} else \{\n"
    r"(?P=indent)    f3 = rectF\.left;\n"
    r"(?P=indent)    f4 = rectF\.bottom;\n"
    r"(?P=indent)\}\n"
    r"(?P=indent)pointF\.set\(f3, f4\);"
)


def replacement(match: re.Match[str]) -> str:
    indent = match.group("indent")
    return (
        f"{indent}}} else {{\n"
        f"{indent}    f3 = rectF.left;\n"
        f"{indent}    f4 = rectF.bottom;\n"
        f"{indent}}}\n"
        f"{indent}pointF.set(f3, f4);"
    )


def main() -> int:
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("root", nargs="?", default=".", help="repository root")
    parser.add_argument("--check-only", action="store_true", help="validate without writing")
    args = parser.parse_args()

    root = Path(args.root).resolve()
    source = root / REL
    if not source.is_file():
        raise SystemExit(f"Round36: source file not found: {REL.as_posix()}")

    original = source.read_text(encoding="utf-8")
    old_matches = list(OLD_PATTERN.finditer(original))
    new_matches = list(NEW_PATTERN.finditer(original))

    if len(old_matches) == 1 and not new_matches:
        updated, count = OLD_PATTERN.subn(replacement, original, count=1)
        if count != 1:
            raise SystemExit("Round36: internal replacement count mismatch; no files written")
        action = "patch"
    elif not old_matches and len(new_matches) == 1:
        updated = original
        action = "already-applied"
    else:
        raise SystemExit(
            "Round36: expected exactly one corner anchor "
            f"(unpatched={len(old_matches)}, patched={len(new_matches)}); no files written"
        )

    # Verify the target is the i == 2 branch and the missing bottom coordinate
    # now occurs immediately before the existing pointF.set call.
    expected = NEW_PATTERN.search(updated)
    if expected is None or updated.count("f4 = rectF.bottom;") < 1:
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
