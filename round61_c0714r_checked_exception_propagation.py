#!/usr/bin/env python3
"""Round61: restore checked C0714r propagation through Glide LoadPath callers.

Round59 reconstructs C0717u.m2422a and creates C0714r when no decode path
succeeds, but its replacement signature omitted the checked throws clause.
That omission makes RunnableC0705i.m2376g's existing C0714r catch unreachable.
This patch restores the checked-exception contract through m2422a -> m2375f
-> m2374e, preserving the caller's existing catch and error handling.
"""
from __future__ import annotations
import argparse
from pathlib import Path
import shutil
import sys

BASE = Path("app/src/main/java/p080c/p084b/p085a/p088m/p091u")
LOAD_PATH = BASE / "C0717u.java"
DECODE_JOB = BASE / "RunnableC0705i.java"
MARKER = "ROUND61_C0714R_THROWS_PROPAGATION"

REPLACEMENTS = {
    LOAD_PATH: (
        "public InterfaceC0719w<Transcode> m2422a(InterfaceC0656e<Data> interfaceC0656e, C0647o c0647o, int i, int i2, C0706j.a<ResourceType> aVar) {",
        "public InterfaceC0719w<Transcode> m2422a(InterfaceC0656e<Data> interfaceC0656e, C0647o c0647o, int i, int i2, C0706j.a<ResourceType> aVar) throws C0714r {",
    ),
    DECODE_JOB: (
        "public final <Data> InterfaceC0719w<R> m2374e(InterfaceC0655d<?> interfaceC0655d, Data data, EnumC0633a enumC0633a) {",
        "public final <Data> InterfaceC0719w<R> m2374e(InterfaceC0655d<?> interfaceC0655d, Data data, EnumC0633a enumC0633a) throws C0714r {",
    ),
}
EXTRA = (
    DECODE_JOB,
    "public final <Data> InterfaceC0719w<R> m2375f(Data data, EnumC0633a enumC0633a) {",
    "public final <Data> InterfaceC0719w<R> m2375f(Data data, EnumC0633a enumC0633a) throws C0714r {",
)

def transform(path: Path, source: str, replacements: list[tuple[str, str]]) -> str:
    if MARKER in source:
        return source
    result = source
    for old, new in replacements:
        count = result.count(old)
        if count != 1:
            raise ValueError(f"{path}: expected exactly one signature anchor, found {count}: {old}")
        result = result.replace(old, new, 1)
    return result

def main() -> int:
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("root", nargs="?", default=".")
    parser.add_argument("--check-only", action="store_true")
    args = parser.parse_args()
    root = Path(args.root).resolve()
    plans: dict[Path, list[tuple[str, str]]] = {
        root / LOAD_PATH: [REPLACEMENTS[LOAD_PATH]],
        root / DECODE_JOB: [REPLACEMENTS[DECODE_JOB], (EXTRA[1], EXTRA[2])],
    }
    updated: dict[Path, str] = {}
    try:
        for path, reps in plans.items():
            if not path.is_file():
                raise ValueError(f"source file not found: {path}")
            original = path.read_text(encoding="utf-8")
            updated[path] = transform(path, original, reps)
    except ValueError as exc:
        print(f"ERROR: {exc}", file=sys.stderr)
        return 2

    if all(updated[p] == p.read_text(encoding="utf-8") for p in updated):
        print("Round61 already applied; no changes needed.")
        return 0
    if args.check_only:
        print("Round61 check passed: all three C0714r propagation signatures are uniquely anchored.")
        return 0

    backup_root = root / ".round61-backup"
    backups: list[tuple[Path, Path]] = []
    for path in updated:
        rel = path.relative_to(root)
        backup = backup_root / rel
        backup.parent.mkdir(parents=True, exist_ok=True)
        if not backup.exists():
            shutil.copy2(path, backup)
        backups.append((path, backup))

    for path, new_text in updated.items():
        path.write_text(new_text, encoding="utf-8")
    for path in updated:
        check = path.read_text(encoding="utf-8")
        if path.name == "C0717u.java":
            assert "m2422a(InterfaceC0656e<Data> interfaceC0656e, C0647o c0647o, int i, int i2, C0706j.a<ResourceType> aVar) throws C0714r {" in check
        else:
            assert "m2374e(InterfaceC0655d<?> interfaceC0655d, Data data, EnumC0633a enumC0633a) throws C0714r {" in check
            assert "m2375f(Data data, EnumC0633a enumC0633a) throws C0714r {" in check
    print("Round61 applied: C0714r checked-exception propagation restored.")
    for _, backup in backups:
        print(f"Backup: {backup.relative_to(root).as_posix()}")
    return 0

if __name__ == "__main__":
    raise SystemExit(main())
