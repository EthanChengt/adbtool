#!/usr/bin/env python3
"""Restore missing LiveData inner-class constructors lost during decompilation.

Usage:
    python3 round48_livedata_inner_constructors.py . --check-only
    python3 round48_livedata_inner_constructors.py .

The script is deliberately strict and idempotent. It backs up the original
source once under .round48-backup/ before writing any change.
"""
from __future__ import annotations

import argparse
import sys
from pathlib import Path

RELATIVE_PATH = Path("app/src/main/java/androidx/lifecycle/LiveData.java")
BACKUP_ROOT = Path(".round48-backup")

LIFECYCLE_CONSTRUCTOR = """        public LifecycleBoundObserver(InterfaceC0502g interfaceC0502g, InterfaceC0508m<? super T> interfaceC0508m) {
            LiveData.this.super(interfaceC0508m);
            this.f729e = interfaceC0502g;
            this.f730f = LiveData.this;
        }

"""

OBSERVER_CONSTRUCTOR = """        public AbstractC0091a(InterfaceC0508m<? super T> interfaceC0508m) {
            this.f731a = interfaceC0508m;
            this.f734d = LiveData.this;
        }

"""

LIFECYCLE_ANCHOR = """        public final /* synthetic */ LiveData f730f;

        @Override // p006b.p061o.InterfaceC0500e
"""
LIFECYCLE_REPLACEMENT = """        public final /* synthetic */ LiveData f730f;

""" + LIFECYCLE_CONSTRUCTOR + """        @Override // p006b.p061o.InterfaceC0500e
"""

OBSERVER_ANCHOR = """        public final /* synthetic */ LiveData f734d;

        /* JADX INFO: renamed from: h */
"""
OBSERVER_REPLACEMENT = """        public final /* synthetic */ LiveData f734d;

""" + OBSERVER_CONSTRUCTOR + """        /* JADX INFO: renamed from: h */
"""


def insert_once(source: str, anchor: str, replacement: str, marker: str, label: str) -> tuple[str, bool]:
    marker_count = source.count(marker)
    if marker_count == 1:
        return source, False
    if marker_count != 0:
        raise ValueError(f"{label}: constructor marker appears {marker_count} times")
    count = source.count(anchor)
    if count != 1:
        raise ValueError(f"{label}: expected exactly one insertion anchor, found {count}")
    return source.replace(anchor, replacement, 1), True


def transform(source: str) -> tuple[str, list[str]]:
    changes: list[str] = []
    source, changed = insert_once(
        source,
        LIFECYCLE_ANCHOR,
        LIFECYCLE_REPLACEMENT,
        "public LifecycleBoundObserver(InterfaceC0502g interfaceC0502g, InterfaceC0508m<? super T> interfaceC0508m)",
        "LifecycleBoundObserver constructor",
    )
    if changed:
        changes.append("LifecycleBoundObserver constructor")

    source, changed = insert_once(
        source,
        OBSERVER_ANCHOR,
        OBSERVER_REPLACEMENT,
        "public AbstractC0091a(InterfaceC0508m<? super T> interfaceC0508m)",
        "AbstractC0091a constructor",
    )
    if changed:
        changes.append("AbstractC0091a constructor")

    # Verify all four decompiler-generated final fields are explicitly assigned.
    required = (
        "this.f729e = interfaceC0502g;",
        "this.f730f = LiveData.this;",
        "this.f731a = interfaceC0508m;",
        "this.f734d = LiveData.this;",
    )
    for statement in required:
        if source.count(statement) != 1:
            raise ValueError(f"final-field assignment validation failed: {statement}")

    return source, changes


def main() -> int:
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("root", nargs="?", default=".", help="repository root (default: current directory)")
    parser.add_argument("--check-only", action="store_true", help="validate without writing files")
    args = parser.parse_args()

    root = Path(args.root).resolve()
    target = root / RELATIVE_PATH
    if not target.is_file():
        print(f"ERROR: source file not found: {target}", file=sys.stderr)
        return 2

    original = target.read_text(encoding="utf-8")
    try:
        updated, changes = transform(original)
    except ValueError as exc:
        print(f"Round48 validation failed; no files were written: {exc}", file=sys.stderr)
        return 3

    if args.check_only:
        if changes:
            print("Round48 check passed: both LiveData inner-class constructors can be restored; no files changed.")
        else:
            print("Round48 check passed: LiveData inner-class constructors are already present; no files changed.")
        return 0

    if not changes:
        print("Round48 already applied: LiveData inner-class constructors are present; no files changed.")
        return 0

    backup = root / BACKUP_ROOT / RELATIVE_PATH
    backup.parent.mkdir(parents=True, exist_ok=True)
    if not backup.exists():
        backup.write_text(original, encoding="utf-8")

    target.write_text(updated, encoding="utf-8")
    print("Round48 applied: restored constructors and initialized all four final fields in app/src/main/java/androidx/lifecycle/LiveData.java")
    print(f"Original source backup: {backup.relative_to(root)}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
