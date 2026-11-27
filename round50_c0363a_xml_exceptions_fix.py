#!/usr/bin/env python3
"""Round 50: preserve XML parser failures by declaring checked exceptions."""
from __future__ import annotations

import argparse
import shutil
import sys
from datetime import datetime
from pathlib import Path

RELATIVE = Path("app/src/main/java/p006b/p032h/p034c/p035b/C0363a.java")
IMPORT = "import java.io.IOException;"
OLD_SIGNATURE = (
    "    public static C0363a m1470a(Resources resources, int i, Resources.Theme theme) {"
)
NEW_SIGNATURE = (
    "    public static C0363a m1470a(Resources resources, int i, Resources.Theme theme) "
    "throws XmlPullParserException, IOException {"
)


def validate(text: str) -> str:
    has_import = IMPORT in text
    has_old = OLD_SIGNATURE in text
    has_new = NEW_SIGNATURE in text

    if has_old and has_new:
        raise RuntimeError("C0363a.m1470a has both old and new declarations")
    if not has_old and not has_new:
        raise RuntimeError("Cannot locate the exact C0363a.m1470a declaration")

    if has_new:
        if not has_import:
            raise RuntimeError("Method declares IOException but java.io.IOException import is missing")
        return "already-fixed"

    if text.count(OLD_SIGNATURE) != 1:
        raise RuntimeError(f"Expected one m1470a declaration, found {text.count(OLD_SIGNATURE)}")
    return "needs-fix"


def apply(text: str) -> str:
    state = validate(text)
    if state == "already-fixed":
        return text

    updated = text.replace(OLD_SIGNATURE, NEW_SIGNATURE, 1)
    if IMPORT not in updated:
        anchor = "import java.util.ArrayList;"
        if updated.count(anchor) != 1:
            raise RuntimeError("Cannot safely locate import insertion point")
        updated = updated.replace(anchor, IMPORT + "\n" + anchor, 1)

    validate(updated)
    return updated


def main() -> int:
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("root", nargs="?", default=".", help="repository root")
    parser.add_argument("--check-only", action="store_true", help="validate without writing")
    args = parser.parse_args()

    root = Path(args.root).resolve()
    target = root / RELATIVE
    if not target.is_file():
        raise SystemExit(f"Missing source file: {target}")

    original = target.read_text(encoding="utf-8")
    state = validate(original)
    if args.check_only:
        print("Round50 validation passed: " + ("already fixed" if state == "already-fixed" else "patch applicable"))
        return 0

    updated = apply(original)
    if updated == original:
        print("Round50: already fixed; no changes written")
        return 0

    backup_dir = root / ".round50-backup" / RELATIVE.parent
    backup_dir.mkdir(parents=True, exist_ok=True)
    stamp = datetime.now().strftime("%Y%m%d-%H%M%S")
    backup = backup_dir / f"{target.stem}.{stamp}{target.suffix}"
    shutil.copy2(target, backup)
    target.write_text(updated, encoding="utf-8")
    print(f"Round50 applied: {RELATIVE}")
    print(f"Backup: {backup.relative_to(root)}")
    return 0


if __name__ == "__main__":
    try:
        raise SystemExit(main())
    except Exception as exc:
        print(f"Round50 failed safely: {exc}", file=sys.stderr)
        raise SystemExit(2)
