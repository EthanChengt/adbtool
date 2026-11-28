#!/usr/bin/env python3
"""Round81: propagate AppComponentFactory's ClassNotFoundException."""
from pathlib import Path
import argparse
import re

REL = Path("app/src/main/java/androidx/core/app/CoreComponentFactory.java")
METHODS = {
    "instantiateActivity": "Activity",
    "instantiateApplication": "Application",
    "instantiateProvider": "ContentProvider",
    "instantiateReceiver": "BroadcastReceiver",
    "instantiateService": "Service",
}

def transform(source: str) -> str:
    result = source
    for name, return_type in METHODS.items():
        pattern = re.compile(
            r"(public\s+" + re.escape(return_type) + r"\s+" + re.escape(name)
            + r"\s*\([^{}]*?\))\s*(throws\s+[^{}]+)?\s*\{"
        )
        matches = list(pattern.finditer(result))
        if len(matches) != 1:
            raise ValueError(f"{name}: expected exactly one declaration, found {len(matches)}")
        m = matches[0]
        existing = m.group(2) or ""
        if "ClassNotFoundException" in existing:
            continue
        throws = (existing.rstrip() + ", ClassNotFoundException") if existing else "throws ClassNotFoundException"
        result = result[:m.start()] + m.group(1) + " " + throws + " {" + result[m.end():]
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
        print("Round81 check: patchable" if original != updated else "Round81 check: already applied")
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
    print("Round81: all five overrides now declare ClassNotFoundException")

if __name__ == "__main__":
    main()
