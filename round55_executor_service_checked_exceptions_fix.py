#!/usr/bin/env python3
"""Restore checked-exception declarations lost from Glide's ExecutorService wrapper."""
from __future__ import annotations

import argparse
import shutil
from pathlib import Path

REL = Path("app/src/main/java/p080c/p084b/p085a/p088m/p091u/p094e0/ExecutorServiceC0701a.java")
BACKUP = Path(".round55-backup/ExecutorServiceC0701a.java.original")

REPLACEMENTS = [
    (
        "import java.util.concurrent.ExecutorService;",
        "import java.util.concurrent.ExecutionException;\nimport java.util.concurrent.ExecutorService;",
        "ExecutionException import",
    ),
    (
        "public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {",
        "public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {",
        "invokeAll(Collection)",
    ),
    (
        "public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {",
        "public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {",
        "invokeAll(Collection, long, TimeUnit)",
    ),
    (
        "public <T> T invokeAny(Collection<? extends Callable<T>> collection) {",
        "public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {",
        "invokeAny(Collection)",
    ),
    (
        "public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {",
        "public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException {",
        "invokeAny(Collection, long, TimeUnit)",
    ),
]


def transform(text: str) -> tuple[str, bool]:
    changed = False
    for old, new, label in REPLACEMENTS:
        if text.count(new) == 1:
            continue
        count = text.count(old)
        if count != 1:
            raise SystemExit(f"{label}: expected exactly one original or repaired signature, found {count}")
        text = text.replace(old, new, 1)
        changed = True
    return text, changed


def main() -> None:
    parser = argparse.ArgumentParser()
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
        print("Round55 check passed: ExecutorService signatures validated; no files changed.")
        return
    if not changed:
        print("Round55 already applied: no changes required.")
        return

    backup = root / BACKUP
    backup.parent.mkdir(parents=True, exist_ok=True)
    if not backup.exists():
        shutil.copy2(target, backup)
    target.write_text(repaired, encoding="utf-8")
    print(f"Round55 applied: restored checked exceptions in {REL}")
    print(f"Original source backup: {BACKUP}")


if __name__ == "__main__":
    main()
