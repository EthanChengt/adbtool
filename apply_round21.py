#!/usr/bin/env python3
"""Apply Round 21 source fixes after verifying both original Git blob SHAs."""
from pathlib import Path
import hashlib
import shutil
import sys

PATCH_DIR = Path(__file__).resolve().parent
REPO_ROOT = Path(sys.argv[1]).resolve() if len(sys.argv) > 1 else Path.cwd().resolve()
FILES = {
    "app/src/main/java/p080c/p126d/p127a/p128a/p131c/C1187f.java": "d0f321c00d1d0c00d944eaa0ab6e46f255018f4c",
    "app/src/main/java/p000a/p001a/p002a/p005b/InterfaceC0001a.java": "ab4445db59534fcf12dae095ed4acd81d85f2950",
}

def git_blob_sha(data: bytes) -> str:
    header = f"blob {len(data)}\0".encode("ascii")
    return hashlib.sha1(header + data).hexdigest()

# Validate every original before modifying any file (all-or-nothing preflight).
for rel, expected in FILES.items():
    target = REPO_ROOT / rel
    if not target.is_file():
        raise SystemExit(f"缺少目标文件：{target}")
    actual = git_blob_sha(target.read_bytes())
    if actual != expected:
        raise SystemExit(
            f"原文件版本不匹配，已停止，未修改任何文件：{rel}\n"
            f"期望 blob SHA：{expected}\n实际 blob SHA：{actual}"
        )
    replacement = PATCH_DIR / rel
    if not replacement.is_file():
        raise SystemExit(f"补丁文件缺失：{replacement}")

backup_root = REPO_ROOT / ".round21-backups"
for rel in FILES:
    target = REPO_ROOT / rel
    backup = backup_root / rel
    backup.parent.mkdir(parents=True, exist_ok=True)
    shutil.copy2(target, backup)
    shutil.copy2(PATCH_DIR / rel, target)

print("Round 21 已应用：2 个 Java 文件。")
print(f"原文件备份位于：{backup_root}")
