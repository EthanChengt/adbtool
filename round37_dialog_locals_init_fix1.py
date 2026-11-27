#!/usr/bin/env python3
"""Round 37: initialize decompiler-ambiguous AlertDialog locals safely.

Run from the repository root:
  python3 round37_dialog_locals_init_fix1.py . --check-only
  python3 round37_dialog_locals_init_fix1.py .

All source anchors are validated before any write. Original files are copied to
.round37-backup/ before modification.
"""
from __future__ import annotations

import argparse
import shutil
from pathlib import Path

REL = Path("app/src/main/java/p006b/p008b/p009c/DialogInterfaceC0193i.java")
BACKUP = Path(".round37-backup")
PATCHES = (
    (
        "            AdapterView.OnItemClickListener c0192h;\n            int i;",
        "            AdapterView.OnItemClickListener c0192h = null;\n            int i = 0;",
        "AlertDialog builder listener/choice-mode locals",
    ),
    (
        "        Button button;",
        "        Button button = null;",
        "AlertDialog centered-button local",
    ),
    (
        "            alertController.m12b(button);",
        "            if (button != null) {\n                alertController.m12b(button);\n            }",
        "center only when exactly one button was selected",
    ),
)


def main() -> int:
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("root", nargs="?", default=".", help="repository root")
    parser.add_argument("--check-only", action="store_true", help="validate without writing")
    args = parser.parse_args()

    root = Path(args.root).resolve()
    source = root / REL
    if not source.is_file():
        raise SystemExit(f"Round37: source file not found: {REL.as_posix()}")

    original = source.read_text(encoding="utf-8")
    updated = original
    changes = 0
    already = 0

    # Validate every anchor in memory first. No writes occur in this loop.
    for old, new, label in PATCHES:
        old_count = updated.count(old)
        new_count = updated.count(new)
        if old_count == 1 and new_count == 0:
            updated = updated.replace(old, new, 1)
            changes += 1
        elif old_count == 1 and new_count == 1:
            # For the call-site guard, the original statement is intentionally
            # contained once inside the replacement block.
            already += 1
        elif old_count == 0 and new_count == 1:
            already += 1
        else:
            raise SystemExit(
                f"Round37: {label}: expected one original or one patched anchor "
                f"(original={old_count}, patched={new_count}); no files written"
            )

    # Postconditions ensure the method locals and guard survived as expected.
    required = (
        "AdapterView.OnItemClickListener c0192h = null;\n            int i = 0;",
        "        Button button = null;",
        "            if (button != null) {\n                alertController.m12b(button);\n            }",
    )
    for item in required:
        if updated.count(item) != 1:
            raise SystemExit("Round37: post-validation failed; no files written")

    if args.check_only:
        print(
            f"Round37 check passed: {REL.as_posix()} "
            f"({changes} patch(es), {already} already applied); no files changed."
        )
        return 0

    if changes == 0:
        print(f"Round37: already applied; no changes made: {REL.as_posix()}")
        return 0

    backup = root / BACKUP / REL
    backup.parent.mkdir(parents=True, exist_ok=True)
    if not backup.exists():
        shutil.copy2(source, backup)

    source.write_text(updated, encoding="utf-8")
    print(f"Round37 applied: {changes} local-initialization repair(s) in {REL.as_posix()}")
    print(f"Original source backup: {backup.relative_to(root).as_posix()}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
