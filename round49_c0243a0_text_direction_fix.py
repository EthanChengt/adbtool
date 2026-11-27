#!/usr/bin/env python3
"""Round49 script correction: validate the actual fallback structure in C0243a0."""
from __future__ import annotations

import argparse
from pathlib import Path
import shutil
import sys

RELATIVE_PATH = Path("app/src/main/java/p006b/p008b/p018i/C0243a0.java")
BACKUP_ROOT = Path(".round49-backup")

OLD = '''                    } catch (ClassCastException unused) {
                        Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
                    }
                } else {'''

NEW = '''                    } catch (ClassCastException unused) {
                        Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                    }
                } else {'''

FALLBACK_ASSIGNMENT = "textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;"
LEGACY_FALLBACK = ('m1002e(this.f1760i, ' '"getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR)')


def validate(text: str) -> None:
    count = text.count(FALLBACK_ASSIGNMENT)
    if count != 1:
        raise SystemExit(f"ERROR: expected exactly one catch fallback assignment, found {count}.")
    if LEGACY_FALLBACK not in text:
        raise SystemExit("ERROR: pre-29 reflective fallback is missing; source not accepted.")
    if NEW not in text:
        raise SystemExit("ERROR: catch fallback is not in the expected location.")


def main() -> int:
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("root", nargs="?", default=".", help="repository root")
    parser.add_argument("--check-only", action="store_true")
    args = parser.parse_args()

    root = Path(args.root).resolve()
    target = root / RELATIVE_PATH
    if not target.is_file():
        print(f"ERROR: source file not found: {target}", file=sys.stderr)
        return 2

    source = target.read_text(encoding="utf-8")
    if NEW in source:
        try:
            validate(source)
        except SystemExit as exc:
            print(str(exc), file=sys.stderr)
            return 4
        print(f"Already fixed and validated: {RELATIVE_PATH.as_posix()}")
        return 0

    count = source.count(OLD)
    if count != 1:
        print(f"ERROR: expected exactly one catch anchor, found {count}; no files changed.", file=sys.stderr)
        return 3

    updated = source.replace(OLD, NEW, 1)
    try:
        validate(updated)
    except SystemExit as exc:
        print(f"{exc} No files changed.", file=sys.stderr)
        return 4

    if args.check_only:
        print("Round49 check passed: exactly one catch fallback assignment and the legacy fallback are present; no files changed.")
        return 0

    backup = root / BACKUP_ROOT / RELATIVE_PATH
    backup.parent.mkdir(parents=True, exist_ok=True)
    if not backup.exists():
        shutil.copy2(target, backup)
    target.write_text(updated, encoding="utf-8")
    print(f"Round49 applied: {RELATIVE_PATH.as_posix()}")
    print(f"Backup: {backup.relative_to(root).as_posix()}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
