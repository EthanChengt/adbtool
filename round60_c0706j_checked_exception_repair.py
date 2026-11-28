#!/usr/bin/env python3
"""Round60: repair C0706j.m2386a checked-exception rethrow without widening callers.

The original method catches Throwable to release its pooled list and then rethrows
it. Since m2387b can throw the checked C0714r, javac rejects a direct `throw th`.
This helper preserves the exact Throwable instance/type at runtime while keeping
m2386a's public signature unchanged.
"""
from __future__ import annotations
import argparse
from pathlib import Path
import shutil
import sys

REL = Path('app/src/main/java/p080c/p084b/p085a/p088m/p091u/C0706j.java')
BACKUP = Path('.round60-backup/C0706j.java')
MARKER = 'ROUND60_C0706J_CHECKED_EXCEPTION_REPAIR'
CLASS = 'public class C0706j<DataType, ResourceType, Transcode> {'
HELPER = '''
    /* ROUND60_C0706J_CHECKED_EXCEPTION_REPAIR: rethrow the original Throwable unchanged. */
    @SuppressWarnings("unchecked")
    private static <E extends Throwable> RuntimeException sneakyThrow(Throwable failure) throws E {
        throw (E) failure;
    }
'''
OLD = '''        } catch (Throwable th) {
            this.f4166d.mo1536a(list);
            throw th;
        }'''
NEW = '''        } catch (Throwable th) {
            this.f4166d.mo1536a(list);
            throw C0706j.<RuntimeException>sneakyThrow(th);
        }'''

def transform(source: str) -> str:
    if MARKER in source:
        return source
    if source.count(CLASS) != 1:
        raise ValueError(f'expected exactly one C0706j class declaration; found {source.count(CLASS)}')
    if source.count(OLD) != 1:
        raise ValueError(f'expected exactly one target Throwable catch/rethrow block; found {source.count(OLD)}')
    result = source.replace(CLASS, CLASS + HELPER, 1)
    result = result.replace(OLD, NEW, 1)
    if result.count('throw C0706j.<RuntimeException>sneakyThrow(th);') != 1:
        raise ValueError('post-transform invariant failed: expected one sneaky rethrow')
    return result

def main() -> int:
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument('root', nargs='?', default='.')
    parser.add_argument('--check-only', action='store_true')
    args = parser.parse_args()
    root = Path(args.root).resolve()
    target = root / REL
    if not target.is_file():
        print(f'ERROR: source file not found: {target}', file=sys.stderr)
        return 2
    original = target.read_text(encoding='utf-8')
    try:
        updated = transform(original)
    except ValueError as exc:
        print(f'ERROR: {exc}', file=sys.stderr)
        return 2
    if updated == original:
        print('Round60 already applied; no changes needed.')
        return 0
    if args.check_only:
        print('Round60 check passed: C0706j.m2386a checked-exception rethrow is uniquely anchored.')
        return 0
    backup = root / BACKUP
    backup.parent.mkdir(parents=True, exist_ok=True)
    if not backup.exists():
        shutil.copy2(target, backup)
    target.write_text(updated, encoding='utf-8')
    verified = target.read_text(encoding='utf-8')
    if MARKER not in verified or OLD in verified or NEW not in verified:
        raise RuntimeError('Round60 post-write verification failed')
    print(f'Round60 applied: {REL.as_posix()}')
    print(f'Backup created: {BACKUP.as_posix()}')
    return 0

if __name__ == '__main__':
    raise SystemExit(main())
