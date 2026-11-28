#!/usr/bin/env python3
"""Round67: remove the duplicated final-field assignment in C0291w's catch path."""

from pathlib import Path
import argparse
import sys

REL = Path("app/src/main/java/p006b/p008b/p018i/C0291w.java")
OLD = "                    this.f2027f = true;\n"
NEW = ""


def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("root", nargs="?", default=".")
    parser.add_argument("--check-only", action="store_true")
    args = parser.parse_args()

    path = Path(args.root) / REL
    if not path.is_file():
        raise SystemExit(f"Missing source file: {path}")

    source = path.read_text(encoding="utf-8")
    if source.splitlines().count("        this.f2027f = true;") == 1 and OLD not in source:
        print(f"Round67 already applied: {REL}")
        return

    if source.count(OLD) != 1:
        raise SystemExit(
            f"Round67 anchor mismatch in {REL}: expected exactly one "
            f"catch-path assignment, found {source.count(OLD)}"
        )
    if source.splitlines().count("        this.f2027f = true;") != 1:
        raise SystemExit(
            f"Round67 final assignment count mismatch: expected one "
            f"normal-path assignment, found {source.splitlines().count('        this.f2027f = true;')}"
        )

    updated = source.replace(OLD, NEW, 1)
    if updated.count("this.f2027f = true;") != 1:
        raise SystemExit("Round67 verification failed: final assignment is not unique")

    if args.check_only:
        print(f"Round67 validation passed: {REL}")
        return

    backup = path.with_suffix(path.suffix + ".round67.bak")
    if not backup.exists():
        backup.write_text(source, encoding="utf-8")
    path.write_text(updated, encoding="utf-8")

    check = path.read_text(encoding="utf-8")
    if check.count("this.f2027f = true;") != 1:
        path.write_text(source, encoding="utf-8")
        raise SystemExit("Round67 post-write verification failed; source restored")

    print(f"Round67 applied: {REL}")
    print(f"Original source backup: {backup}")
    print("The constructor now assigns final field f2027f exactly once.")


if __name__ == "__main__":
    main()
