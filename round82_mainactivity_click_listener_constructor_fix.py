#!/usr/bin/env python3
"""Round82: restore the captured MainActivity constructor."""
from pathlib import Path
import argparse

REL = Path("app/src/main/java/c/c/a/ViewOnClickListenerC1158z0.java")
FIELD = "public final /* synthetic */ MainActivity f5556b;"
CTOR = """    public ViewOnClickListenerC1158z0(MainActivity mainActivity) {
        this.f5556b = mainActivity;
    }

"""

def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("root", nargs="?", default=".")
    parser.add_argument("--check-only", action="store_true")
    args = parser.parse_args()
    path = Path(args.root) / REL
    source = path.read_text(encoding="utf-8")
    if source.count(FIELD) != 1:
        raise SystemExit(f"Expected one captured MainActivity field, found {source.count(FIELD)}")
    if "ViewOnClickListenerC1158z0(MainActivity" in source:
        print("Round82: already applied")
        return
    if args.check_only:
        print("Round82 check: constructor insertion anchor valid")
        return
    backup = path.with_suffix(path.suffix + ".round82.bak")
    if not backup.exists():
        backup.write_text(source, encoding="utf-8")
    path.write_text(source.replace(FIELD, FIELD + "\n\n" + CTOR.rstrip(), 1), encoding="utf-8")
    verify = path.read_text(encoding="utf-8")
    if verify.count("ViewOnClickListenerC1158z0(MainActivity") != 1 or "this.f5556b = mainActivity;" not in verify:
        raise SystemExit("Round82 post-write verification failed")
    print("Round82: MainActivity capture constructor restored")

if __name__ == "__main__":
    main()
