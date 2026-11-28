#!/usr/bin/env python3
"""Round58: repair AppCompatViewInflater reflection and spinner checked exceptions."""
from pathlib import Path
import argparse
import shutil
import sys

TARGET = Path('app/src/main/java/androidx/appcompat/app/AppCompatViewInflater.java')
BACKUP_DIR = Path('.round58-backup')


def replace_method(source: str, signature: str, replacement: str) -> str:
    start = source.find(signature)
    if start < 0 or source.find(signature, start + 1) >= 0:
        raise RuntimeError(f'expected exactly one method signature: {signature!r}')
    brace = source.find('{', start)
    if brace < 0:
        raise RuntimeError(f'method body not found: {signature!r}')
    depth = 0
    in_string = False
    in_char = False
    escape = False
    line_comment = False
    block_comment = False
    i = brace
    while i < len(source):
        c = source[i]
        n = source[i + 1] if i + 1 < len(source) else ''
        if line_comment:
            if c == '\n': line_comment = False
        elif block_comment:
            if c == '*' and n == '/': block_comment = False; i += 1
        elif in_string or in_char:
            if escape: escape = False
            elif c == '\\': escape = True
            elif in_string and c == '"': in_string = False
            elif in_char and c == "'": in_char = False
        elif c == '/' and n == '/': line_comment = True; i += 1
        elif c == '/' and n == '*': block_comment = True; i += 1
        elif c == '"': in_string = True
        elif c == "'": in_char = True
        elif c == '{': depth += 1
        elif c == '}':
            depth -= 1
            if depth == 0:
                return source[:start] + replacement + source[i + 1:]
        i += 1
    raise RuntimeError(f'unbalanced method body: {signature!r}')


def transform(source: str) -> str:
    if 'ROUND58_APP_COMPAT_REFLECTION_FIX' in source:
        return source
    source = replace_method(
        source,
        '    private View createViewByPrefix(Context context, String str, String str2)',
        '''    // ROUND58_APP_COMPAT_REFLECTION_FIX
    private View createViewByPrefix(Context context, String str, String str2) {
        Map<String, Constructor<? extends View>> map = sConstructorMap;
        Constructor<? extends View> constructor = map.get(str);
        try {
            if (constructor == null) {
                String className = str2 != null ? str2 + str : str;
                constructor = Class.forName(className, false, context.getClassLoader())
                        .asSubclass(View.class)
                        .getConstructor(sConstructorSignature);
                map.put(str, constructor);
            }
            constructor.setAccessible(true);
            return constructor.newInstance(this.mConstructorArgs);
        } catch (Exception unused) {
            return null;
        }
    }''')
    source = replace_method(
        source,
        '    public C0291w createSpinner(Context context, AttributeSet attributeSet)',
        '''    public C0291w createSpinner(Context context, AttributeSet attributeSet) {
        try {
            return new C0291w(context, attributeSet, com.didjdk.adbhelper.R.attr.p2);
        } catch (RuntimeException | Error failure) {
            throw failure;
        } catch (Throwable failure) {
            throw new IllegalStateException("Unable to create AppCompat spinner", failure);
        }
    }''')
    return source


def main() -> int:
    parser = argparse.ArgumentParser()
    parser.add_argument('root', nargs='?', default='.')
    parser.add_argument('--check-only', action='store_true')
    args = parser.parse_args()
    root = Path(args.root).resolve()
    target = root / TARGET
    if not target.is_file():
        print(f'target not found: {target}', file=sys.stderr)
        return 2
    original = target.read_text(encoding='utf-8')
    try:
        updated = transform(original)
    except Exception as exc:
        print(f'Round58 validation failed; no files were written: {exc}', file=sys.stderr)
        return 3
    if args.check_only:
        print('Round58 validation passed' if updated != original or 'ROUND58_APP_COMPAT_REFLECTION_FIX' in original else 'Round58 already applied')
        return 0
    if updated == original:
        print('Round58 already applied; no changes needed')
        return 0
    backup = root / BACKUP_DIR / TARGET.name
    backup.parent.mkdir(parents=True, exist_ok=True)
    if not backup.exists():
        shutil.copy2(target, backup)
    target.write_text(updated, encoding='utf-8')
    print(f'Round58 applied: {TARGET.as_posix()}')
    return 0

if __name__ == '__main__':
    raise SystemExit(main())
