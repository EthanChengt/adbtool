#!/usr/bin/env python3
"""Round34 targeted javac fixes for adbtool.

Run at repository root:
  python3 round34_compile_repair1.py . --check-only
  python3 round34_compile_repair1.py .

All anchors are validated before writes. Backups are kept outside source/resource trees.
"""
from __future__ import annotations
import argparse
import re
import shutil
from pathlib import Path

BACKUP = '.round34-backup'

class PatchError(RuntimeError):
    pass


def dedupe_override_annotations(src: str, label: str) -> str:
    lines = src.splitlines(keepends=True)
    out = []
    # An annotation group may contain decompiler comments/blank lines. Keep the first
    # @Override in a group and drop subsequent @Override lines before the next code line.
    group_has_override = False
    for line in lines:
        stripped = line.strip()
        if stripped.startswith('@Override'):
            if group_has_override:
                continue
            group_has_override = True
            out.append(line)
            continue
        if not stripped or stripped.startswith('/*') or stripped.startswith('*') or stripped.startswith('//'):
            out.append(line)
            continue
        # Any actual declaration/body line closes the annotation group.
        group_has_override = False
        out.append(line)
    result = ''.join(out)
    if result == src:
        # Idempotent is fine only if no obvious duplicate annotations remain.
        if re.search(r'(?m)^\s*@Override[^\n]*\n(?:\s*(?:/\*[^\n]*\*/|\*[^\n]*|//[^\n]*|)\s*\n)*\s*@Override', src):
            raise PatchError(f'{label}: duplicate @Override group was not normalized')
    return result


def main() -> int:
    ap = argparse.ArgumentParser()
    ap.add_argument('root', nargs='?', default='.')
    ap.add_argument('--check-only', action='store_true')
    args = ap.parse_args()
    root = Path(args.root).resolve()
    planned: dict[Path, str] = {}

    def load(rel: str) -> str:
        p = root / rel
        if not p.is_file():
            raise PatchError(f'missing required file: {rel}')
        return planned.get(p, p.read_text(encoding='utf-8'))

    def save(rel: str, old: str, new: str) -> None:
        if old != new:
            planned[root / rel] = new

    # 1. Remove duplicated @Override annotations introduced by the earlier script rounds.
    for rel in (
        'app/src/main/java/p006b/p008b/p018i/C0291w.java',
        'app/src/main/java/p080c/p084b/p085a/p088m/C0640h.java',
    ):
        old = load(rel)
        new = dedupe_override_annotations(old, rel)
        save(rel, old, new)

    # 2. Expose RecyclerView's protected measurement operation through its own nested
    # LayoutManager class, where Java protected access is legal.
    rel = 'app/src/main/java/androidx/recyclerview/widget/RecyclerView.java'
    old = load(rel)
    helper = '''        /** Bridge for LayoutManager subclasses to set the owning RecyclerView size. */
        public final void mRound34SetMeasuredDimension(int width, int height) {
            this.f959b.setMeasuredDimension(width, height);
        }

'''
    anchor = '        public void mo420O0(Rect rect, int i, int i2) {'
    if 'mRound34SetMeasuredDimension(int width, int height)' not in old:
        if old.count(anchor) != 1:
            raise PatchError('RecyclerView LayoutManager measurement anchor count is not one')
        new = old.replace(anchor, helper + anchor, 1)
    else:
        new = old
    save(rel, old, new)

    for rel in (
        'app/src/main/java/androidx/recyclerview/widget/GridLayoutManager.java',
        'app/src/main/java/androidx/recyclerview/widget/StaggeredGridLayoutManager.java',
    ):
        old = load(rel)
        new, n1 = re.subn(r'(?:this\.f959b\.)?setMeasuredDimension\(iM562h, iM562h2\);',
                          'mRound34SetMeasuredDimension(iM562h, iM562h2);', old, count=1)
        if n1 == 0 and 'mRound34SetMeasuredDimension(iM562h, iM562h2);' not in old:
            raise PatchError(f'{rel}: measured-dimension call anchor not found')
        save(rel, old, new)

    # 3. Use the generic factory method; the no-op updater is intentionally b<Object>.
    rel = 'app/src/main/java/p080c/p084b/p085a/p088m/p097w/p098c/C0758c.java'
    old = load(rel)
    bad = 'new C0646n<Bitmap.CompressFormat>("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, C0646n.f3938e)'
    good = 'C0646n.m2283a("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null)'
    if bad in old:
        if old.count(bad) != 1:
            raise PatchError('C0758c compression option initializer is not unique')
        new = old.replace(bad, good, 1)
    elif good in old:
        new = old
    else:
        raise PatchError('C0758c compression option initializer anchor not found')
    save(rel, old, new)

    # 4. ImageHeaderParser's checked-I/O contract must declare IOException. Implementors
    # already propagate it; adding it here matches Glide's actual API contract.
    rel = 'app/src/main/java/com/bumptech/glide/load/ImageHeaderParser.java'
    old = load(rel)
    new = old
    if 'import java.io.IOException;' not in new:
        new = new.replace('import java.io.InputStream;', 'import java.io.IOException;\nimport java.io.InputStream;', 1)
    pairs = (
        ('int mo2456b(InputStream inputStream, InterfaceC0676b interfaceC0676b);',
         'int mo2456b(InputStream inputStream, InterfaceC0676b interfaceC0676b) throws IOException;'),
        ('ImageType mo2457c(InputStream inputStream);',
         'ImageType mo2457c(InputStream inputStream) throws IOException;'),
    )
    for before, after in pairs:
        if before in new:
            if new.count(before) != 1:
                raise PatchError(f'ImageHeaderParser method anchor not unique: {before}')
            new = new.replace(before, after, 1)
        elif after not in new:
            raise PatchError(f'ImageHeaderParser method contract anchor missing: {before}')
    save(rel, old, new)

    if not planned:
        print('Round34: all targeted fixes already present; no changes needed.')
        return 0

    print(f'Round34: validated {len(planned)} file(s):')
    for p in sorted(planned):
        print(f'  - {p.relative_to(root)}')
    if args.check_only:
        print('Round34 check passed; no files changed.')
        return 0

    backup_root = root / BACKUP
    for p, content in planned.items():
        rel = p.relative_to(root)
        backup = backup_root / rel
        backup.parent.mkdir(parents=True, exist_ok=True)
        if not backup.exists():
            shutil.copy2(p, backup)
    for p, content in planned.items():
        p.write_text(content, encoding='utf-8')
    print(f'Round34 applied to {len(planned)} file(s). Backups: {BACKUP}/')
    return 0

if __name__ == '__main__':
    try:
        raise SystemExit(main())
    except PatchError as exc:
        raise SystemExit(f'Round34 validation failed; no files were written: {exc}')
