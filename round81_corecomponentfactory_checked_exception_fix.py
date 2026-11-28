#!/usr/bin/env python3
"""Round81: propagate AppComponentFactory's ClassNotFoundException."""
from pathlib import Path
import argparse
import re
import sys

REL = Path("app/src/main/java/androidx/core/app/CoreComponentFactory.java")
METHODS = (
    "instantiateActivity",
    "instantiateApplication",
    "instantiateProvider",
    "instantiateReceiver",
    "instantiateService",
)

def transform(source: str) -> str:
    result = source
    for name in METHODS:
        pattern = re.compile(
            r"(public\\s+(?:Activity|Application|ContentProvider|BroadcastReceiver|Service)\\s+"
            + re.escape(name)
            + r"\\s*\\([^{}]*?\\))\\s*(throws\\s+[^{}]+)?\\s*\\{"
        )
        matches = list(pattern.finditer(result))
        if len(matches) != 1:
            raise ValueError(f"{name}: expected exactly one method declaration, found {len(matches)}")
        m = matches[0]
        existing = m.group(2) or ""
        if "ClassNotFoundException" in existing:
            continue
        if existing:
            throws = existing.rstrip() + ", ClassNotFoundException"
        else:
            throws = "throws ClassNotFoundException"
        replacement = m.group(1) + " " + throws + " {"
        result = result[:m.start()] + replacement + result[m.end():]
    return result

def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("root", nargs="?", default=".")
    parser.add_argument("--check-only", action="store_true")
    args = parser.parse_args()
    path = Path(args.root) / REL
    if not path.is_file():
        raise SystemExit(f"Missing source file: {path}")
    original = path.read_text(encoding="utf-8")
    updated = transform(original)
    if args.check_only:
        if original == updated:
            print("Round81 check: all five methods already declare ClassNotFoundException")
        else:
            print("Round81 check: five method declarations are patchable")
        return
    if original == updated:
        print("Round81: already applied")
        return
    backup = path.with_suffix(path.suffix + ".round81.bak")
    if not backup.exists():
        backup.write_text(original, encoding="utf-8")
    path.write_text(updated, encoding="utf-8")
    if transform(updated) != updated:
        raise SystemExit("Round81 post-write verification failed")
    print("Round81: propagated ClassNotFoundException in all five overrides")

if __name__ == "__main__":
    main()
