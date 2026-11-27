#!/usr/bin/env python3
"""Restore the remaining checked-exception declarations in Glide's ExecutorService wrapper."""
from __future__ import annotations

import argparse
import shutil
from pathlib import Path

REL = Path("app/src/main/java/p080c/p084b/p085a/p088m/p091u/p094e0/ExecutorServiceC0701a.java")
BACKUP = Path(".round56-backup/ExecutorServiceC0701a.java.original")
REPLACEMENTS = [
    (
        "import java.util.concurrent.TimeUnit;",
        "import java.util.concurrent.TimeUnit;\nimport java.util.concurrent.TimeoutException;",
        "TimeoutException import",
    ),
    (
        "public boolean awaitTermination(long j, TimeUnit timeUnit) {",
        "public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {",
        "awaitTermination(long, TimeUnit)",
    ),
    (
        "public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException {",
        "public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {",
        "invokeAny(Collection, long, TimeUnit)",
    ),
]


def transform(source: str) -> tuple[str, bool]:
    changed = False
    for old, new, label in REPLACEMENTS:
        if source.count(new) == 1:
            continue
        count = source.count(old)
        if count != 1:
            raise SystemExit(f"{label}: expected exactly one original or repaired anchor, found {count}")
        source = source.replace(old, new, 1)
        changed = True
    return source, changed


def main() -> None:
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("root", nargs="?", default=".")
    parser.add_argument("--check-only", action="store_true")
    args = parser.parse_args()

    root = Path(args.root).resolve()
    target = root / REL
    if not target.is_file():
        raise SystemExit(f"Target file not found: {target}")

    original = target.read_text(encoding="utf-8")
    repaired, changed = transform(original)
    if args.check_only:
        print("Round56 check passed: awaitTermination and timed invokeAny declarations validated; no files changed.")
        return
    if not changed:
        print("Round56 already applied: no changes required.")
        return

    backup = root / BACKUP
    backup.parent.mkdir(parents=True, exist_ok=True)
    if not backup.exists():
        shutil.copy2(target, backup)
    target.write_text(repaired, encoding="utf-8")
    print(f"Round56 applied: restored remaining checked exceptions in {REL}")
    print(f"Original source backup: {BACKUP}")


if __name__ == "__main__":
    main()
