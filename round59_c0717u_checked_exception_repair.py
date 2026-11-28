#!/usr/bin/env python3
"""Round59 repair for Glide LoadPath checked-exception/control-flow damage."""
from __future__ import annotations
import argparse
from pathlib import Path
import re
import shutil
import sys

REL = Path('app/src/main/java/p080c/p084b/p085a/p088m/p091u/C0717u.java')
BACKUP_DIR = Path('.round59-backup')
MARKER = 'ROUND59_C0717U_EXCEPTION_REPAIR'
HELPER = '''    /* Round59: preserve the original checked exception without widening callers. */
    @SuppressWarnings("unchecked")
    private static <E extends Throwable> RuntimeException sneakyThrow(Throwable failure) throws E {
        throw (E) failure;
    }

'''
METHOD = '''    /* JADX INFO: renamed from: a */
    public InterfaceC0719w<Transcode> m2422a(InterfaceC0656e<Data> interfaceC0656e, C0647o c0647o, int i, int i2, C0706j.a<ResourceType> aVar) {
        List<Throwable> listMo1537b = this.f4256a.mo1537b();
        Objects.requireNonNull(listMo1537b, "Argument must not be null");
        List<Throwable> list = listMo1537b;
        try {
            int size = this.f4257b.size();
            InterfaceC0719w<Transcode> result = null;
            for (int i3 = 0; i3 < size; i3++) {
                result = this.f4257b.get(i3).m2386a(interfaceC0656e, i, i2, c0647o, aVar);
                if (result != null) {
                    break;
                }
            }
            if (result == null) {
                throw C0717u.<RuntimeException>sneakyThrow(
                        new C0714r(this.f4258c, new ArrayList<>(list)));
            }
            return result;
        } finally {
            this.f4256a.mo1536a(list);
        }
    }
'''

def replace_method(src: str) -> str:
    sig = 'public InterfaceC0719w<Transcode> m2422a('
    if src.count(sig) != 1:
        raise ValueError(f'expected exactly one m2422a method, found {src.count(sig)}')
    start = src.index(sig)
    brace = src.index('{', start)
    depth = 0
    end = None
    for i in range(brace, len(src)):
        if src[i] == '{': depth += 1
        elif src[i] == '}':
            depth -= 1
            if depth == 0:
                end = i + 1
                break
    if end is None:
        raise ValueError('unterminated m2422a method')
    method_start = src.rfind('    /* JADX INFO: renamed', 0, start)
    if method_start < 0 or src[method_start:start].strip() != '/* JADX INFO: renamed from: a */':
        # Keep existing annotations/comments and replace from the public signature only.
        method_start = start
        replacement = METHOD[METHOD.index('public Interface'):]
    else:
        replacement = METHOD
    return src[:method_start] + replacement + src[end:]

def transform(src: str) -> str:
    if MARKER in src:
        return src
    src2 = replace_method(src)
    class_anchor = 'public class C0717u<Data, ResourceType, Transcode> {'
    if src2.count(class_anchor) != 1:
        raise ValueError('expected exactly one C0717u class declaration')
    src2 = src2.replace(class_anchor, class_anchor + '\n\n' + HELPER.rstrip(), 1)
    # Place an explicit marker in the helper for reliable idempotency.
    src2 = src2.replace('/* Round59: preserve', '/* ' + MARKER + ': preserve', 1)
    return src2

def main() -> int:
    ap = argparse.ArgumentParser()
    ap.add_argument('root', nargs='?', default='.')
    ap.add_argument('--check-only', action='store_true')
    args = ap.parse_args()
    root = Path(args.root).resolve()
    target = root / REL
    if not target.is_file():
        print(f'ERROR: source file not found: {target}', file=sys.stderr); return 2
    original = target.read_text(encoding='utf-8')
    updated = transform(original)
    if updated == original:
        print('Round59 already applied; no changes needed.')
        return 0
    if args.check_only:
        print('Round59 check passed: C0717u.m2422a can be repaired safely.')
        return 0
    backup = root / BACKUP_DIR / REL.name
    backup.parent.mkdir(parents=True, exist_ok=True)
    if not backup.exists(): shutil.copy2(target, backup)
    target.write_text(updated, encoding='utf-8')
    # Basic post-write invariants.
    written = target.read_text(encoding='utf-8')
    if MARKER not in written or 'catch (C0714r e)' in written or 'throw th;' in written:
        raise RuntimeError('Round59 post-write verification failed')
    print(f'Round59 applied: {REL.as_posix()}')
    print(f'Backup: {BACKUP_DIR.as_posix()}/{REL.name}')
    return 0

if __name__ == '__main__':
    raise SystemExit(main())
