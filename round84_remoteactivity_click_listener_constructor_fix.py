#!/usr/bin/env python3
"""Round84: restore RemoteActivity click-listener capture constructor."""
from pathlib import Path
import argparse

REL = Path("app/src/main/java/c/c/a/ViewOnClickListenerC0917h1.java")
FIELD = "public final /* synthetic */ RemoteActivity f4809b;"
CTOR = """    public ViewOnClickListenerC0917h1(RemoteActivity remoteActivity) {
        this.f4809b = remoteActivity;
    }"""

def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("root", nargs="?", default=".")
    parser.add_argument("--check-only", action="store_true")
    args = parser.parse_args()
    path = Path(args.root) / REL
    source = path.read_text(encoding="utf-8")
    if "ViewOnClickListenerC0917h1(RemoteActivity" in source:
        print("Round84: already applied")
        return
    if source.count(FIELD) != 1:
        raise SystemExit(f"Expected one RemoteActivity field, found {source.count(FIELD)}")
    if args.check_only:
        print("Round84 check: constructor anchor valid")
        return
    backup = path.with_suffix(path.suffix + ".round84.bak")
    if not backup.exists():
        backup.write_text(source, encoding="utf-8")
    path.write_text(source.replace(FIELD, FIELD + "\n\n" + CTOR, 1), encoding="utf-8")
    verify = path.read_text(encoding="utf-8")
    if verify.count("ViewOnClickListenerC0917h1(RemoteActivity") != 1 or "this.f4809b = remoteActivity;" not in verify:
        raise SystemExit("Round84 post-write verification failed")
    print("Round84: RemoteActivity capture constructor restored")

if __name__ == "__main__":
    main()
