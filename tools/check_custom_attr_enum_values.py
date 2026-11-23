#!/usr/bin/env python3
"""Reject numeric literals where app custom attributes declare enum/flag names."""
from pathlib import Path
import re
import sys
import xml.etree.ElementTree as ET

PROJECT = Path(__file__).resolve().parents[1]
RES = PROJECT / "app" / "src" / "main" / "res"
AUTO_NS = "{http://schemas.android.com/apk/res-auto}"
NUMERIC = re.compile(r"-?(?:0[xX][0-9a-fA-F]+|\d+)\Z")

attrs_root = ET.parse(RES / "values" / "attrs.xml").getroot()
enums = {}
formats = {}
for node in attrs_root.iter("attr"):
    name = node.get("name")
    if not name:
        continue
    fmt = set((node.get("format") or "").split("|"))
    formats[name] = formats.get(name, set()) | fmt
    mapping = enums.setdefault(name, {})
    for child in node:
        if child.tag in ("enum", "flag") and child.get("value") is not None:
            value = child.get("value").strip()
            enum_name = child.get("name")
            if enum_name:
                previous = mapping.get(value)
                if previous and previous != enum_name:
                    mapping.pop(value, None)
                elif value not in mapping:
                    mapping[value] = enum_name

errors = []
checked = 0
for path in sorted(RES.rglob("*.xml")):
    try:
        root = ET.parse(path).getroot()
    except ET.ParseError as exc:
        errors.append(f"XML parse error: {path}: {exc}")
        continue
    for node in root.iter():
        for qname, raw_value in node.attrib.items():
            if not qname.startswith(AUTO_NS):
                continue
            name = qname[len(AUTO_NS):]
            value = raw_value.strip()
            if name not in enums or not NUMERIC.fullmatch(value):
                continue
            # If integer is explicitly part of the attribute format, the numeric
            # literal is valid as an integer and should not be rewritten as an enum.
            if "integer" in formats.get(name, set()):
                continue
            enum_name = enums[name].get(value)
            if enum_name:
                checked += 1
                errors.append(
                    f"numeric enum literal: {path.relative_to(RES)} "
                    f"attribute {name}=\"{value}\"; use {enum_name!r}"
                )

if errors:
    print("Custom attribute enum preflight FAILED:")
    print("\n".join(errors[:300]))
    if len(errors) > 300:
        print(f"... plus {len(errors) - 300} more")
    sys.exit(1)

print(f"Custom attribute enum preflight passed: {len(list(RES.rglob('*.xml')))} XML files checked; no numeric literals used where a named enum/flag is required.")
