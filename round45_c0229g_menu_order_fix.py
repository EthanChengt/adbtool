#!/usr/bin/env python3
"""Round45: restore C0229g.m941a menu insertion ordering logic.

The JADX output duplicated a do/while branch, causing an uninitialized local
and an unreachable statement. This replaces the complete method with the
standard AppCompat MenuBuilder insertion algorithm while retaining this
project's obfuscated API and field names.

Usage:
  python3 round45_c0229g_menu_order_fix.py . --check-only
  python3 round45_c0229g_menu_order_fix.py .
"""
from __future__ import annotations

import argparse
import shutil
import sys
from pathlib import Path

REL = Path("app/src/main/java/p006b/p008b/p016h/p017i/C0229g.java")
BACKUP_ROOT = Path(".round45-backup")
SIGNATURE = "public MenuItem m941a(int i, int i2, int i3, CharSequence charSequence)"
REPLACEMENT = '''public MenuItem m941a(int i, int i2, int i3, CharSequence charSequence) {
        int category = (i3 & 0xFFFF0000) >>> 16;
        if (category < 0 || category >= f1629y.length) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }

        int ordering = (f1629y[category] << 16) | (i3 & 0xFFFF);
        C0231i item = new C0231i(this, i, i2, i3, ordering, charSequence, this.f1641l);
        ArrayList<C0231i> items = this.f1635f;

        // Keep menu items sorted by the normalized ordering value. Insert
        // after existing items with the same ordering to preserve stable order.
        int insertIndex = items.size();
        while (insertIndex > 0 && items.get(insertIndex - 1).f1664d > ordering) {
            insertIndex--;
        }
        items.add(insertIndex, item);
        mo957q(true);
        return item;
    }'''


def find_method(text: str, signature: str) -> tuple[int, int]:
    start = text.find(signature)
    if start < 0:
        raise ValueError(f"method anchor not found: {signature}")
    if text.find(signature, start + 1) >= 0:
        raise ValueError(f"method anchor is ambiguous: {signature}")
    brace = text.find("{", start)
    if brace < 0:
        raise ValueError("method opening brace not found")

    depth = 0
    state = "code"
    i = brace
    while i < len(text):
        ch = text[i]
        nxt = text[i + 1] if i + 1 < len(text) else ""
        if state == "line_comment":
            if ch == "\n":
                state = "code"
            i += 1
            continue
        if state == "block_comment":
            if ch == "*" and nxt == "/":
                state = "code"
                i += 2
            else:
                i += 1
            continue
        if state in ("string", "char"):
            if ch == "\\":
                i += 2
                continue
            if (state == "string" and ch == '"') or (state == "char" and ch == "'"):
                state = "code"
            i += 1
            continue
        if ch == "/" and nxt == "/":
            state = "line_comment"
            i += 2
            continue
        if ch == "/" and nxt == "*":
            state = "block_comment"
            i += 2
            continue
        if ch == '"':
            state = "string"
            i += 1
            continue
        if ch == "'":
            state = "char"
            i += 1
            continue
        if ch == "{":
            depth += 1
        elif ch == "}":
            depth -= 1
            if depth == 0:
                return start, i + 1
        i += 1
    raise ValueError("method body is unterminated")


def patch(source: str) -> tuple[str, bool]:
    if "public class C0229g implements InterfaceMenuC0385a" not in source:
        raise ValueError("unexpected C0229g class declaration")
    if "int insertIndex = items.size();" in source and "items.add(insertIndex, item);" in source:
        return source, False

    start, end = find_method(source, SIGNATURE)
    updated = source[:start] + REPLACEMENT + source[end:]

    # Verify that the decompiler's broken do/while fragment is gone and the
    # normalized category ordering plus stable insertion semantics are present.
    required = (
        "int category = (i3 & 0xFFFF0000) >>> 16;",
        "int ordering = (f1629y[category] << 16) | (i3 & 0xFFFF);",
        "while (insertIndex > 0 && items.get(insertIndex - 1).f1664d > ordering)",
        "items.add(insertIndex, item);",
        "mo957q(true);",
        "return item;",
    )
    for token in required:
        if token not in updated:
            raise ValueError(f"post-patch validation failed: missing {token}")

    method_start, method_end = find_method(updated, SIGNATURE)
    method_body = updated[method_start:method_end]
    if "do {" in method_body or "i4 = size + 1" in method_body:
        raise ValueError("broken decompiler insertion branch remains")
    if method_body.count("items.add(insertIndex, item);") != 1:
        raise ValueError("menu insertion call count is not exactly one")
    return updated, True


def main() -> int:
    parser = argparse.ArgumentParser()
    parser.add_argument("root", nargs="?", default=".")
    parser.add_argument("--check-only", action="store_true")
    args = parser.parse_args()

    root = Path(args.root).resolve()
    target = root / REL
    if not target.is_file():
        print(f"ERROR: source file not found: {target}", file=sys.stderr)
        return 2

    original = target.read_text(encoding="utf-8")
    try:
        updated, changed = patch(original)
    except Exception as exc:
        print(f"Round45 validation failed; no files were written: {exc}", file=sys.stderr)
        return 1

    if args.check_only:
        print("Round45 check passed: C0229g.m941a menu-order insertion logic is valid; no files changed.")
        return 0
    if not changed:
        print("Round45 already applied; no changes made.")
        return 0

    backup = root / BACKUP_ROOT / REL
    backup.parent.mkdir(parents=True, exist_ok=True)
    if not backup.exists():
        shutil.copy2(target, backup)
    target.write_text(updated, encoding="utf-8")
    print(f"Round45 applied: restored ordered menu insertion in {REL}")
    print(f"Original source backup: {backup.relative_to(root)}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
