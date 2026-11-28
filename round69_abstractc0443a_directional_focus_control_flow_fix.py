#!/usr/bin/env python3
"""Round69: restore mutually exclusive directional branches in ExploreByTouchHelper focus search."""
from pathlib import Path
import argparse
import shutil

REL = Path("app/src/main/java/p006b/p049j/p051b/AbstractC0443a.java")

REPLACEMENTS = [
    ("        int iWidth;\n", "        int iWidth = 0;\n"),
    ("        int i2;\n        C0429b c0429b2;\n", "        int i2 = 0;\n        C0429b c0429b2;\n"),
    ("        int iHeight;\n", "        int iHeight = 0;\n"),
    ("            if (i != 17) {\n", "            if (i == 33 || i == 130) {\n"),
    ("            } else {\n                iWidth = rect3.width() + 1;\n            }\n            rect4.offset(iWidth, 0);",
     "            } else {\n                iWidth = i == 17 ? rect3.width() + 1 : -(rect3.width() + 1);\n            }\n            if (i == 17 || i == 66) {\n                rect4.offset(iWidth, 0);"),
    ("            while (i2 < iM1285i) {", "            for (i2 = 0; i2 < iM1285i; i2++) {"),
    ("            }\n        }\n        C0429b c0429b4 = c0429b;",
     "            }\n            }\n        }\n        C0429b c0429b4 = c0429b;"),
]

def transform(source):
    result = source
    for old, new in REPLACEMENTS:
        count = result.count(old)
        if count != 1:
            raise ValueError(f"expected exactly one anchor ({count}): {old[:100]!r}")
        result = result.replace(old, new, 1)
    return result

def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("root", nargs="?", default=".")
    parser.add_argument("--check-only", action="store_true")
    args = parser.parse_args()
    path = Path(args.root) / REL
    source = path.read_text(encoding="utf-8")
    if args.check_only:
        if "if (i == 33 || i == 130)" in source and "if (i == 17 || i == 66)" in source and "for (i2 = 0; i2 < iM1285i; i2++)" in source:
            print(f"Round69 already applied: {REL}")
            return
        transform(source)
        print(f"Round69 validation passed: {REL}")
        return
    if "if (i == 33 || i == 130)" in source and "if (i == 17 || i == 66)" in source and "for (i2 = 0; i2 < iM1285i; i2++)" in source:
        print(f"Round69 already applied: {REL}")
        return
    updated = transform(source)
    backup = path.with_suffix(path.suffix + ".round69.bak")
    if not backup.exists():
        shutil.copy2(path, backup)
    path.write_text(updated, encoding="utf-8")
    check = path.read_text(encoding="utf-8")
    if "if (i == 33 || i == 130)" not in check or "if (i == 17 || i == 66)" not in check or "while (i2 < iM1285i)" in check:
        raise SystemExit("Round69 post-write verification failed")
    print(f"Round69 applied: {REL}")
    print(f"Backup: {backup}")

if __name__ == "__main__":
    main()
