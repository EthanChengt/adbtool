#!/usr/bin/env python3
"""Reject decompiled numeric literals for Android framework enum/flag style items."""
from pathlib import Path
import re
import sys
import xml.etree.ElementTree as ET

ROOT = Path(__file__).resolve().parents[1] / "app" / "src" / "main" / "res"
# These framework attributes are enums or flags in the Android resource table.
# Decompiled binary XML often serializes their typed values as raw decimal/hex strings,
# which AAPT2 rejects when rebuilding source resources.
TYPED_ATTRS = {
    "android:textStyle",
    "android:windowSoftInputMode",
    "android:gravity",
    "android:layout_gravity",
    "android:scrollbars",
    "android:ellipsize",
    "android:scaleType",
    "android:orientation",
    "android:textAlignment",
    "android:datePickerMode",
    "android:visibility",
    "android:breakStrategy",
    "android:hyphenationFrequency",
}
# Layout dimensions are special enums; raw -1/-2 must be symbolic values.
LAYOUT_DIMENSION_ATTRS = {
    "android:layout_width",
    "android:layout_height",
    "android:dropDownWidth",
}
NUMERIC = re.compile(r"\s*(?:0[xX][0-9a-fA-F]+|-?\d+)\s*\Z")
errors = []
files = sorted(ROOT.glob("values*/*.xml"))
for path in files:
    try:
        root = ET.parse(path).getroot()
    except ET.ParseError as exc:
        errors.append(f"XML parse error: {path}: {exc}")
        continue
    for item in root.iter("item"):
        name = item.get("name")
        value = item.text or ""
        if name in TYPED_ATTRS and NUMERIC.fullmatch(value):
            errors.append(f"numeric typed value: {path}:{item.sourceline if hasattr(item, 'sourceline') else '?'} {name}={value.strip()}")
        if name in LAYOUT_DIMENSION_ATTRS and value.strip() in {"-1", "-2"}:
            errors.append(f"raw layout dimension: {path} {name}={value.strip()} (use match_parent/wrap_content)")

if errors:
    print("Resource enum/flag preflight FAILED:")
    print("\n".join(errors))
    sys.exit(1)
print(f"Resource enum/flag preflight passed: {len(files)} values XML files checked; no numeric literals remain for {len(TYPED_ATTRS)} typed framework attributes and raw -1/-2 layout dimensions.")
