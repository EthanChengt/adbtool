#!/usr/bin/env python3
"""Round78: restore TwoStatePreference summary selection and visibility control flow."""
from pathlib import Path
import argparse
import shutil

REL = Path("app/src/main/java/androidx/preference/TwoStatePreference.java")
OLD_START = "    public void m405K(View view) {"
NEXT_METHOD = "\n    /* JADX INFO: renamed from: L */"
NEW_METHOD = """    public void m405K(View view) {
        if (!(view instanceof TextView)) {
            return;
        }

        TextView textView = (TextView) view;
        CharSequence summary = this.f843N ? this.f844O : this.f845P;

        if (TextUtils.isEmpty(summary)) {
            summary = mo368i();
        }

        if (TextUtils.isEmpty(summary)) {
            textView.setVisibility(View.GONE);
        } else {
            textView.setText(summary);
            textView.setVisibility(View.VISIBLE);
        }
    }
"""

def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("root", nargs="?", default=".")
    parser.add_argument("--check-only", action="store_true")
    args = parser.parse_args()
    path = Path(args.root) / REL
    source = path.read_text(encoding="utf-8")
    start = source.find(OLD_START)
    if start < 0:
        if NEW_METHOD.strip() in source:
            print(f"Round78 already applied: {REL}")
            return
        raise SystemExit("Round78 could not find m405K method")
    end = source.find(NEXT_METHOD, start)
    if end < 0:
        raise SystemExit("Round78 could not find m405K method boundary")
    updated = source[:start] + NEW_METHOD + source[end:]
    if args.check_only:
        print(f"Round78 validation passed: {REL}")
        return
    backup = path.with_suffix(path.suffix + ".round78.bak")
    if not backup.exists():
        shutil.copy2(path, backup)
    path.write_text(updated, encoding="utf-8")
    verify = path.read_text(encoding="utf-8")
    if NEW_METHOD.strip() not in verify:
        raise SystemExit("Round78 post-write verification failed")
    print(f"Round78 applied: {REL}")
    print(f"Backup: {backup}")

if __name__ == "__main__":
    main()
