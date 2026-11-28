#!/usr/bin/env python3
"""Round80: restore the captured AboutActivity constructor for its click listener."""
from pathlib import Path
import argparse
import shutil

REL = Path("app/src/main/java/c/c/a/ViewOnClickListenerC0880a.java")
FIELD = "    public final /* synthetic */ AboutActivity f4751b;\n"
CTOR = """
    public ViewOnClickListenerC0880a(AboutActivity aboutActivity) {
        this.f4751b = aboutActivity;
    }
"""

def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("root", nargs="?", default=".")
    parser.add_argument("--check-only", action="store_true")
    args = parser.parse_args()
    path = Path(args.root) / REL
    source = path.read_text(encoding="utf-8")
    if "public ViewOnClickListenerC0880a(AboutActivity aboutActivity)" in source:
        print(f"Round80 already applied: {REL}")
        return
    if source.count(FIELD) != 1:
        raise SystemExit(f"AboutActivity field anchor: expected 1, found {source.count(FIELD)}")
    updated = source.replace(FIELD, FIELD + CTOR, 1)
    if args.check_only:
        print(f"Round80 validation passed: {REL}")
        return
    backup = path.with_suffix(path.suffix + ".round80.bak")
    if not backup.exists():
        shutil.copy2(path, backup)
    path.write_text(updated, encoding="utf-8")
    verify = path.read_text(encoding="utf-8")
    if "this.f4751b = aboutActivity;" not in verify:
        raise SystemExit("Round80 post-write verification failed")
    print(f"Round80 applied: {REL}")
    print(f"Backup: {backup}")

if __name__ == "__main__":
    main()
