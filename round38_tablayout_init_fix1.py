#!/usr/bin/env python3
"""Round 38: repair two JADX local-variable initialization artifacts in TabLayout.

Run from repository root:
  python3 round38_tablayout_init_fix1.py . --check-only
  python3 round38_tablayout_init_fix1.py .

The script validates all anchors in memory before writing and backs up the
original file under .round38-backup/.
"""
from __future__ import annotations

import argparse
import shutil
from pathlib import Path

REL = Path("app/src/main/java/com/google/android/material/tabs/TabLayout.java")
BACKUP = Path(".round38-backup")

OLD_VIEW = """        public final void m3163e() {
            C1372g c1372g;
            View view;
            C1372g c1372g2;
"""
NEW_VIEW = """        public final void m3163e() {
            C1372g c1372g;
            View view = null;
            C1372g c1372g2;
"""

OLD_RIPPLE = """                if (Build.VERSION.SDK_INT >= 21) {
                    boolean z = TabLayout.this.f10336D;
                    if (z) {
                        gradientDrawable = gradientDrawable2;
                        gradientDrawable = null;
                    }
                    layerDrawable = new RippleDrawable(colorStateList, gradientDrawable, z ? null : gradientDrawable3);
                } else {
"""
NEW_RIPPLE = """                if (Build.VERSION.SDK_INT >= 21) {
                    boolean z = TabLayout.this.f10336D;
                    gradientDrawable = z ? null : gradientDrawable2;
                    layerDrawable = new RippleDrawable(colorStateList, gradientDrawable, z ? null : gradientDrawable3);
                } else {
"""


def patch_once(source: str, old: str, new: str, label: str) -> tuple[str, str]:
    old_count = source.count(old)
    new_count = source.count(new)
    if old_count == 1 and new_count == 0:
        return source.replace(old, new, 1), "patch"
    if old_count == 0 and new_count == 1:
        return source, "already-applied"
    raise SystemExit(
        f"Round38: {label} anchor mismatch (old={old_count}, new={new_count}); no files written"
    )


def main() -> int:
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("root", nargs="?", default=".", help="repository root")
    parser.add_argument("--check-only", action="store_true", help="validate without writing")
    args = parser.parse_args()

    root = Path(args.root).resolve()
    source_path = root / REL
    if not source_path.is_file():
        raise SystemExit(f"Round38: source file not found: {REL.as_posix()}")

    original = source_path.read_text(encoding="utf-8")
    planned, view_status = patch_once(original, OLD_VIEW, NEW_VIEW, "m3163e View initializer")
    planned, ripple_status = patch_once(planned, OLD_RIPPLE, NEW_RIPPLE, "m3166h RippleDrawable branch")

    if "View view = null;" not in planned:
        raise SystemExit("Round38: View initialization postcondition failed; no files written")
    if "gradientDrawable = z ? null : gradientDrawable2;" not in planned:
        raise SystemExit("Round38: RippleDrawable content postcondition failed; no files written")
    if "new RippleDrawable(colorStateList, gradientDrawable, z ? null : gradientDrawable3)" not in planned:
        raise SystemExit("Round38: RippleDrawable constructor postcondition failed; no files written")

    print(f"Round38: m3163e View={view_status}; m3166h RippleDrawable={ripple_status}")
    if args.check_only:
        print("Round38 check passed; no files changed.")
        return 0
    if planned == original:
        print(f"Round38 already applied; no changes made: {REL.as_posix()}")
        return 0

    backup_path = root / BACKUP / REL
    backup_path.parent.mkdir(parents=True, exist_ok=True)
    if not backup_path.exists():
        shutil.copy2(source_path, backup_path)
    source_path.write_text(planned, encoding="utf-8")
    print(f"Round38 applied to {REL.as_posix()}")
    print(f"Original source backup: {backup_path.relative_to(root).as_posix()}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
