#!/usr/bin/env python3
"""Round83: propagate SocketFactory IOException from delegated createSocket calls."""
from pathlib import Path
import argparse
import re

REL = Path("app/src/main/java/c/c/a/x3/h.java")
SIGNATURES = (
    ("createSocket", "String str, int i"),
    ("createSocket", "String str, int i, InetAddress inetAddress, int i2"),
    ("createSocket", "InetAddress inetAddress, int i"),
    ("createSocket", "InetAddress inetAddress, int i, InetAddress inetAddress2, int i2"),
)

def transform(source):
    result = source
    for name, params in SIGNATURES:
        marker = f"public Socket {name}({params})"
        count = result.count(marker)
        if count != 1:
            raise ValueError(f"{params}: expected one signature, found {count}")
        start = result.index(marker)
        brace = result.find("{", start)
        if brace < 0:
            raise ValueError(f"Missing method body for {params}")
        header = result[start:brace]
        if "throws IOException" not in header:
            result = result[:brace].rstrip() + " throws IOException " + result[brace:]
    return result

def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("root", nargs="?", default=".")
    parser.add_argument("--check-only", action="store_true")
    args = parser.parse_args()
    path = Path(args.root) / REL
    source = path.read_text(encoding="utf-8")
    updated = transform(source)
    if args.check_only:
        print("Round83 check: patchable" if source != updated else "Round83 check: already applied")
        return
    if source == updated:
        print("Round83: already applied")
        return
    backup = path.with_suffix(path.suffix + ".round83.bak")
    if not backup.exists():
        backup.write_text(source, encoding="utf-8")
    path.write_text(updated, encoding="utf-8")
    if transform(updated) != updated:
        raise SystemExit("Round83 post-write verification failed")
    print("Round83: IOException declared on all four delegated socket overloads")

if __name__ == "__main__":
    main()
