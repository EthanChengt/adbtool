#!/usr/bin/env python3
"""Round 28 Fix2: restore helper-class imports damaged by Round28 Fix1.

Run from the repository root:
    python3 round28_fix2.py .
Validate without writing:
    python3 round28_fix2.py . --check-only

This patch is intentionally limited to import declarations. Round28 Fix1
already converted qualified helper calls to unqualified calls; the repaired
static wildcard import makes those calls resolvable without rewriting them.
All target files are validated in memory before any file is written.
"""
from __future__ import annotations

import argparse
import shutil
import sys
from pathlib import Path

HELPER_STATIC_IMPORT = "import static c.a.a.a.a.*;"
BROKEN_STATIC_IMPORT = "import static *;"
BROKEN_Q_IMPORT = "import static q;"
BROKEN_TYPE_IMPORT = "import a;"
RESTORED_TYPE_IMPORT = "import c.a.a.a.a.a;"


class PatchError(RuntimeError):
    pass


def replace_exact(text: str, old: str, new: str, label: str, *, required: bool = True) -> str:
    count = text.count(old)
    if count == 0:
        if not required and new in text:
            return text
        if not required:
            return text
        raise PatchError(f"{label}: expected one matching import, found 0")
    if count != 1:
        raise PatchError(f"{label}: expected one matching import, found {count}")
    return text.replace(old, new, 1)


def repair_file(text: str, rel: str, restore_type_import: bool) -> str:
    # Round28 Fix1 performed a broad string replacement on the entire source,
    # including its newly inserted static import declaration.
    text = replace_exact(
        text,
        BROKEN_STATIC_IMPORT,
        HELPER_STATIC_IMPORT,
        f"{rel} static helper import",
        required=True,
    )

    # r.java can also contain a single-method import whose owner was stripped
    # by the same replacement. The wildcard import above already imports q().
    text = replace_exact(
        text,
        BROKEN_Q_IMPORT,
        "",
        f"{rel} stray q import",
        required=False,
    )

    # Restore the original imported helper type where the source had
    # `import c.a.a.a.a.a;`. C0333e did not have that import originally.
    if restore_type_import:
        text = replace_exact(
            text,
            BROKEN_TYPE_IMPORT,
            RESTORED_TYPE_IMPORT,
            f"{rel} helper type import",
            required=True,
        )
    else:
        if BROKEN_TYPE_IMPORT in text:
            raise PatchError(f"{rel}: unexpected stripped helper type import")

    for broken in (BROKEN_STATIC_IMPORT, BROKEN_Q_IMPORT, BROKEN_TYPE_IMPORT):
        if broken in text:
            raise PatchError(f"{rel}: malformed import remains: {broken}")

    if text.count(HELPER_STATIC_IMPORT) != 1:
        raise PatchError(f"{rel}: expected exactly one repaired static wildcard import")
    return text


def main() -> int:
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("root", nargs="?", default=".")
    parser.add_argument("--check-only", action="store_true")
    args = parser.parse_args()

    root = Path(args.root).resolve()
    if not root.is_dir():
        raise SystemExit(f"repository root does not exist: {root}")

    targets = {
        "app/src/main/java/c/c/a/v3/i0/C1021p.java": True,
        "app/src/main/java/c/c/a/v3/i0/r.java": True,
        "app/src/main/java/c/c/a/v3/m0/C1102z.java": True,
        "app/src/main/java/c/c/a/v3/l0/C1069l.java": True,
        "app/src/main/java/p006b/p026f/p027a/p028h/C0332d.java": True,
        "app/src/main/java/p006b/p026f/p027a/p028h/C0333e.java": False,
    }

    updates: dict[str, str] = {}
    for rel, restore_type_import in targets.items():
        path = root / rel
        if not path.is_file():
            raise PatchError(f"missing source file: {rel}")
        original = path.read_text(encoding="utf-8")
        updated = repair_file(original, rel, restore_type_import)
        if updated == original:
            raise PatchError(f"{rel}: no repair was necessary; expected Round28 Fix1 output")
        updates[rel] = updated

    if args.check_only:
        print(f"Round28 Fix2 validation passed: {len(updates)} files; no files changed")
        return 0

    for rel, updated in updates.items():
        path = root / rel
        backup = path.with_suffix(path.suffix + ".round28fix2.bak")
        if not backup.exists():
            shutil.copy2(path, backup)
        path.write_text(updated, encoding="utf-8")

    print(f"Round28 Fix2 applied to {len(updates)} files")
    return 0


if __name__ == "__main__":
    try:
        raise SystemExit(main())
    except PatchError as exc:
        print(f"Round28 Fix2 validation failed; no files were written:\n- {exc}", file=sys.stderr)
        raise SystemExit(2)
