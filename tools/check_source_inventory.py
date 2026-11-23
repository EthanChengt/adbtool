#!/usr/bin/env python3
from pathlib import Path
import sys
root = Path(__file__).resolve().parents[1]
java_root = root / "app/src/main/java"
required = [
    "androidx/recyclerview/widget/RecyclerView.java",
    "p006b/p067s/C0532j.java",
    "com/didjdk/adbhelper/ConnectActivity.java",
    "com/didjdk/adbhelper/MainActivity.java",
    "com/didjdk/adbhelper/R.java",
]
missing = [p for p in required if not (java_root / p).is_file()]
count = sum(1 for _ in java_root.rglob("*.java")) if java_root.exists() else 0
print(f"Java source files: {count}")
print(f"Required source checks: {len(required) - len(missing)}/{len(required)}")
if count < 1100:
    print("ERROR: source tree appears incomplete (expected at least 1100 Java files)", file=sys.stderr)
    sys.exit(2)
if missing:
    print("ERROR: required source files missing:", *missing, sep="\n - ", file=sys.stderr)
    sys.exit(3)
print("Source inventory preflight passed")
