#!/usr/bin/env python3
"""Round57: restore C0824p.handleMessage control flow and definite assignment."""

from __future__ import annotations

import argparse
import shutil
import sys
from pathlib import Path

TARGET = Path("app/src/main/java/p080c/p084b/p085a/p104n/C0824p.java")
BACKUP_DIR = Path(".round57-backup")
MARKER = "/* ROUND57: restored Glide pending-fragment message dispatch */"

REPLACEMENT = """    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        Object removed = null;
        Object expectedManager;
        boolean handled = true;

        if (message.what == 1) {
            FragmentManager manager = (FragmentManager) message.obj;
            removed = this.f4582b.remove(manager);
            expectedManager = manager;
        } else if (message.what == 2) {
            AbstractC0483r manager = (AbstractC0483r) message.obj;
            removed = this.f4583c.remove(manager);
            expectedManager = manager;
        } else {
            handled = false;
            expectedManager = null;
        }

        if (handled && removed == null
                && Log.isLoggable("RMRetriever", 5)) {
            Log.w("RMRetriever",
                    "Failed to remove expected request manager fragment, manager: "
                            + expectedManager);
        }
        return handled;
    }
"""

def method_span(source: str) -> tuple[int, int]:
    signature = "    public boolean handleMessage(Message message) {"
    if source.count(signature) != 1:
        raise ValueError(
            f"expected exactly one handleMessage signature, found {source.count(signature)}"
        )
    sig_at = source.index(signature)
    start = source.rfind("    @Override", 0, sig_at)
    if start < 0:
        raise ValueError("handleMessage @Override anchor not found")
    brace = source.index("{", sig_at)
    depth = 0
    in_string = False
    escaped = False
    # This method contains no brace characters in string literals; count Java braces.
    for pos in range(brace, len(source)):
        ch = source[pos]
        if ch == "{":
            depth += 1
        elif ch == "}":
            depth -= 1
            if depth == 0:
                return start, pos + 1
    raise ValueError("unterminated handleMessage method")

def main() -> int:
    parser = argparse.ArgumentParser()
    parser.add_argument("root", nargs="?", default=".")
    parser.add_argument("--check-only", action="store_true")
    args = parser.parse_args()

    root = Path(args.root).resolve()
    target = root / TARGET
    if not target.is_file():
        print(f"ERROR: target file not found: {target}", file=sys.stderr)
        return 2

    source = target.read_text(encoding="utf-8")
    if MARKER in source:
        print("Round57 already applied; no changes needed.")
        return 0

    try:
        start, end = method_span(source)
    except (ValueError, IndexError) as exc:
        print(f"ERROR: {exc}; no files were written.", file=sys.stderr)
        return 3

    updated_method = REPLACEMENT.rstrip()
    if args.check_only:
        print("Round57 validation passed: exactly one handleMessage method can be repaired.")
        return 0

    backup_dir = root / BACKUP_DIR
    backup_dir.mkdir(parents=True, exist_ok=True)
    backup = backup_dir / TARGET.name
    if not backup.exists():
        shutil.copy2(target, backup)

    replacement = "    " + MARKER + "\n" + updated_method
    updated = source[:start] + replacement + source[end:]
    target.write_text(updated, encoding="utf-8")
    print(f"Round57 applied: {TARGET}")
    print(f"Backup: {backup.relative_to(root)}")
    return 0

if __name__ == "__main__":
    raise SystemExit(main())
