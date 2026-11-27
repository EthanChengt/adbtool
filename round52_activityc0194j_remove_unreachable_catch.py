#!/usr/bin/env python3
"""Round52: remove an unreachable NameNotFoundException catch in ActivityC0194j."""
from __future__ import annotations
import argparse
import shutil
import sys
from pathlib import Path

REL = Path('app/src/main/java/p006b/p008b/p009c/ActivityC0194j.java')
OLD = '''            while (true) {
                try {
                    Intent intentM1463w = C0360f.m1463w(this, component);
                    if (intentM1463w == null) {
                        break;
                    }
                    arrayList.add(size, intentM1463w);
                    component = intentM1463w.getComponent();
                } catch (PackageManager.NameNotFoundException e) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e);
                }
            }'''
NEW = '''            while (true) {
                Intent intentM1463w = C0360f.m1463w(this, component);
                if (intentM1463w == null) {
                    break;
                }
                arrayList.add(size, intentM1463w);
                component = intentM1463w.getComponent();
            }'''

def main() -> int:
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument('root', nargs='?', default='.', help='repository root')
    parser.add_argument('--check-only', action='store_true', help='validate without writing')
    args = parser.parse_args()
    root = Path(args.root).resolve()
    target = root / REL
    if not target.is_file():
        print(f'ERROR: target file not found: {target}', file=sys.stderr)
        return 2
    source = target.read_text(encoding='utf-8')
    if NEW in source:
        print('Round52 already applied; no changes needed.')
        return 0
    count = source.count(OLD)
    if count != 1:
        print(f'ERROR: expected exactly one Round52 anchor, found {count}; no files were written.', file=sys.stderr)
        return 3
    if args.check_only:
        print('Round52 validation passed: exactly one unreachable catch block found.')
        return 0
    backup_dir = root / '.round52-backup'
    backup_dir.mkdir(parents=True, exist_ok=True)
    backup = backup_dir / 'ActivityC0194j.java.orig'
    if not backup.exists():
        shutil.copy2(target, backup)
    updated = source.replace(OLD, NEW, 1)
    target.write_text(updated, encoding='utf-8', newline='')
    print(f'Round52 applied: {REL}')
    return 0

if __name__ == '__main__':
    raise SystemExit(main())
