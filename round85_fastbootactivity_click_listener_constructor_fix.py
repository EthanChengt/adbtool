#!/usr/bin/env python3
"""Round85: restore FastbootActivity click-listener capture constructor."""
from pathlib import Path
import argparse

REL = Path("app/src/main/java/c/c/a/ViewOnClickListenerC1157z.java")
FIELD = "public final /* synthetic */ FastbootActivity f5555b;"
CTOR = """    public ViewOnClickListenerC1157z(FastbootActivity fastbootActivity) {
        this.f5555b = fastbootActivity;
    }"""

def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("root", nargs="?", default=".")
    parser.add_argument("--check-only", action="store_true")
    args = parser.parse_args()
    path = Path(args.root) / REL
    source = path.read_text(encoding="utf-8")
    if "ViewOnClickListenerC1157z(FastbootActivity" in source:
        print("Round85: already applied")
        return
    if source.count(FIELD) != 1:
        raise SystemExit(f"Expected one FastbootActivity field, found {source.count(FIELD)}")
    if args.check_only:
        print("Round85 check: constructor anchor valid")
        return
    backup = path.with_suffix(path.suffix + ".round85.bak")
    if not backup.exists():
        backup.write_text(source, encoding="utf-8")
    path.write_text(source.replace(FIELD, FIELD + "\n\n" + CTOR, 1), encoding="utf-8")
    verify = path.read_text(encoding="utf-8")
    if verify.count("ViewOnClickListenerC1157z(FastbootActivity") != 1 or "this.f5555b = fastbootActivity;" not in verify:
        raise SystemExit("Round85 post-write verification failed")
    print("Round85: FastbootActivity capture constructor restored")

if __name__ == "__main__":
    main()
