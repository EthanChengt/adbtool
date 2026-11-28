#!/usr/bin/env python3
"""Round77: restore the synthetic Runnable constructor captured by UnlockActivity."""
from pathlib import Path
import argparse
import shutil

REL = Path("app/src/main/java/c/c/a/RunnableC0913g2.java")
OLD = '''    public final /* synthetic */ UnlockActivity f4801b;

    @Override // java.lang.Runnable'''
NEW = '''    public final /* synthetic */ UnlockActivity f4801b;

    public RunnableC0913g2(UnlockActivity unlockActivity) {
        this.f4801b = unlockActivity;
    }

    @Override // java.lang.Runnable'''
def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("root", nargs="?", default=".")
    parser.add_argument("--check-only", action="store_true")
    args = parser.parse_args()
    path = Path(args.root) / REL
    source = path.read_text(encoding="utf-8")
    if NEW in source:
        print(f"Round77 already applied: {REL}")
        return
    count = source.count(OLD)
    if count != 1:
        raise SystemExit(f"Round77 expected exactly one synthetic Runnable anchor, found {count}")
    updated = source.replace(OLD, NEW, 1)
    if args.check_only:
        print(f"Round77 validation passed: {REL}")
        return
    backup = path.with_suffix(path.suffix + ".round77.bak")
    if not backup.exists():
        shutil.copy2(path, backup)
    path.write_text(updated, encoding="utf-8")
    if NEW not in path.read_text(encoding="utf-8"):
        raise SystemExit("Round77 post-write verification failed")
    print(f"Round77 applied: {REL}")
    print(f"Backup: {backup}")
if __name__ == "__main__":
    main()
