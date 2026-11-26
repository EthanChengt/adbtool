#!/usr/bin/env python3
"""Safe launcher for Round 26 Fix1 with a scoped C0291w insertion anchor.

Keep the original round26_fix.py beside this file in the repository root.
The original script is executed unchanged except that the ambiguous
mo1148p(int) anchor is scoped to C0291w.d, the popup class that needs
mo1147n(int). All original atomic validation and source-write behavior remains.
"""
from pathlib import Path
import sys

ROOT = Path(__file__).resolve().parent
PATCH = ROOT / "round26_fix.py"
if not PATCH.is_file():
    raise SystemExit("round26_fix.py not found beside round26_fix2.py")

source = PATCH.read_text(encoding="utf-8")
old = "s = one(s, anchor, insert, rel)"
new = '''class_start_marker = "    public class d extends C0268k0 implements f {"
class_end_marker = "    /* JADX INFO: renamed from: b.b.i.w$e */"
class_start = s.find(class_start_marker)
class_end = s.find(class_end_marker, class_start + len(class_start_marker))
if class_start < 0 or class_end < 0 or class_end <= class_start:
    raise RuntimeError(f"{rel}: cannot isolate C0291w.d popup class")
d_class = s[class_start:class_end]
d_class = one(d_class, anchor, insert, rel)
s = s[:class_start] + d_class + s[class_end:]'''
count = source.count(old)
if count != 1:
    raise SystemExit(
        f"round26_fix.py anchor patch expected exactly one launcher site, found {count}"
    )
source = source.replace(old, new, 1)

# Preserve the original script's project-root resolution and main-module behavior.
namespace = {
    "__file__": str(PATCH),
    "__name__": "__main__",
}
exec(compile(source, str(PATCH), "exec"), namespace)
