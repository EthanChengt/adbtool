#!/usr/bin/env python3
"""Round79: repair FileProvider checked exceptions and query projection control flow."""
from pathlib import Path
import argparse
import shutil

REL = Path("app/src/main/java/androidx/core/content/FileProvider.java")

def replace_one(source, old, new, label):
    count = source.count(old)
    if count != 1:
        raise SystemExit(f"{label}: expected exactly one anchor, found {count}")
    return source.replace(old, new, 1)

def transform(source):
    source = replace_one(
        source,
        "import java.io.File;\nimport java.io.IOException;",
        "import java.io.File;\nimport java.io.FileNotFoundException;\nimport java.io.IOException;",
        "FileNotFoundException import"
    )
    source = replace_one(
        source,
        "public static InterfaceC0076a m195b(Context context, String str) {",
        "public static InterfaceC0076a m195b(Context context, String str) throws IOException, XmlPullParserException {",
        "m195b checked exceptions"
    )
    source = replace_one(
        source,
        "public ParcelFileDescriptor openFile(Uri uri, String str) {",
        "public ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {",
        "openFile checked exception"
    )
    source = replace_one(
        source,
        "        for (String str3 : strArr) {\n            if (\"_display_name\".equals(str3)) {",
        "        for (String str3 : strArr) {\n            i = i2;\n            if (\"_display_name\".equals(str3)) {",
        "query projection index initialization"
    )
    return source

def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("root", nargs="?", default=".")
    parser.add_argument("--check-only", action="store_true")
    args = parser.parse_args()
    path = Path(args.root) / REL
    source = path.read_text(encoding="utf-8")
    if "throws IOException, XmlPullParserException" in source and "throws FileNotFoundException" in source and "            i = i2;\n            if (\"_display_name\".equals(str3))" in source:
        print(f"Round79 already applied: {REL}")
        return
    updated = transform(source)
    if args.check_only:
        print(f"Round79 validation passed: {REL}")
        return
    backup = path.with_suffix(path.suffix + ".round79.bak")
    if not backup.exists():
        shutil.copy2(path, backup)
    path.write_text(updated, encoding="utf-8")
    if transform(path.read_text(encoding="utf-8")) != path.read_text(encoding="utf-8"):
        raise SystemExit("Round79 post-write verification failed")
    print(f"Round79 applied: {REL}")
    print(f"Backup: {backup}")

if __name__ == "__main__":
    main()
