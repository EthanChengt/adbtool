#!/usr/bin/env python3
"""Check that app-namespace XML attributes and application R.attr fields are declared."""
from pathlib import Path
import re
import sys
import xml.etree.ElementTree as ET

PROJECT = Path(__file__).resolve().parents[1]
RES = PROJECT / "app" / "src" / "main" / "res"
JAVA = PROJECT / "app" / "src" / "main" / "java"
AUTO_NS = "{http://schemas.android.com/apk/res-auto}"

declared = set()
errors = []

# Collect every custom attr declaration, including declarations nested in styleables.
for path in sorted(RES.glob("values*/*.xml")):
    try:
        root = ET.parse(path).getroot()
    except ET.ParseError as exc:
        errors.append(f"XML parse error: {path}: {exc}")
        continue
    for node in root.iter("attr"):
        name = node.get("name")
        if name:
            declared.add(name)

# All res-auto attributes used by layout, menu, animator, color, and other resources
# must exist in the app's merged resource namespace.
xml_uses = set()
for path in sorted(RES.rglob("*.xml")):
    try:
        root = ET.parse(path).getroot()
    except ET.ParseError:
        continue
    for node in root.iter():
        for qname in node.attrib:
            if qname.startswith(AUTO_NS):
                xml_uses.add(qname[len(AUTO_NS):])

for name in sorted(xml_uses - declared):
    errors.append(f"undeclared app XML attribute: {name}")

# Decompilation merged many library R.attr references into the app R class.
# Check sources that explicitly import the app R class (or belong to that package),
# while skipping classes that explicitly import android.R.
java_uses = set()
for path in sorted(JAVA.rglob("*.java")):
    try:
        source = path.read_text(encoding="utf-8", errors="replace")
    except OSError as exc:
        errors.append(f"cannot read {path}: {exc}")
        continue
    uses_android_r = bool(re.search(r"(?m)^\s*import\s+android\.R\s*;", source))
    uses_app_r = (
        bool(re.search(r"(?m)^\s*import\s+com\.didjdk\.adbhelper\.R\s*;", source))
        or path.relative_to(JAVA).as_posix().startswith("com/didjdk/adbhelper/")
    )
    if uses_app_r and not uses_android_r:
        java_uses.update(re.findall(r"\bR\.attr\.([A-Za-z_][A-Za-z0-9_]*)", source))

for name in sorted(java_uses - declared):
    errors.append(f"undeclared application R.attr field: {name}")

if errors:
    print("Application attribute preflight FAILED:")
    print("\n".join(errors))
    sys.exit(1)

print(
    f"Application attribute preflight passed: {len(declared)} declarations, "
    f"{len(xml_uses)} app XML attributes, {len(java_uses)} application R.attr references."
)
