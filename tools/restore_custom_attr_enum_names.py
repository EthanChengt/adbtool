#!/usr/bin/env python3
"""Restore symbolic names for numeric app: attributes declared as enums/flags."""
from pathlib import Path
import re
import xml.etree.ElementTree as ET
from collections import Counter

PROJECT = Path(__file__).resolve().parents[1]
RES = PROJECT / "app" / "src" / "main" / "res"
AUTO_URI = "http://schemas.android.com/apk/res-auto"

attrs_root = ET.parse(RES / "values" / "attrs.xml").getroot()
enums = {}
for node in attrs_root.iter("attr"):
    name = node.get("name")
    if not name:
        continue
    mapping = {}
    for child in node:
        if child.tag in ("enum", "flag") and child.get("value") is not None and child.get("name"):
            key = child.get("value").strip()
            # Keep only unambiguous value -> name mappings.
            if key in mapping and mapping[key] != child.get("name"):
                mapping.pop(key)
            elif key not in mapping:
                mapping[key] = child.get("name")
    if mapping:
        enums[name] = mapping

attr_re = re.compile(
    r"(?P<prefix>[A-Za-z_][\w.-]*):(?P<name>[A-Za-z_][\w.-]*)"
    r"(?P<space>\s*=\s*)(?P<quote>[\"'])(?P<value>[^\"']*)(?P=quote)"
)
changed = Counter()
changed_files = set()
for path in sorted(RES.rglob("*.xml")):
    source = path.read_text(encoding="utf-8")
    prefixes = {item[0] for item in re.findall(
        rf"xmlns:([A-Za-z_][\w.-]*)\s*=\s*([\"']){re.escape(AUTO_URI)}\2",
        source,
    )}
    if not prefixes:
        continue

    def replace(match):
        prefix = match.group("prefix")
        name = match.group("name")
        value = match.group("value").strip()
        if prefix not in prefixes or name not in enums:
            return match.group(0)
        enum_name = enums[name].get(value)
        if not enum_name or not re.fullmatch(r"-?(?:0[xX][0-9a-fA-F]+|\d+)", value):
            return match.group(0)
        changed[name] += 1
        changed_files.add(path)
        return f"{prefix}:{name}{match.group('space')}{match.group('quote')}{enum_name}{match.group('quote')}"

    updated = attr_re.sub(replace, source)
    if updated != source:
        path.write_text(updated, encoding="utf-8")

# Validate that all XML remains well-formed.
for path in sorted(RES.rglob("*.xml")):
    ET.parse(path)

print(f"Replaced {sum(changed.values())} numeric enum values in {len(changed_files)} XML files.")
for name, count in sorted(changed.items()):
    print(f"  {name}: {count}")
