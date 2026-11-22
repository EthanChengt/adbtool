#!/usr/bin/env python3
"""Validate source Android nine-patch PNGs before invoking AAPT2.

This checker intentionally uses only the Python standard library so it works
on a stock GitHub Actions ubuntu-latest runner.
"""
from __future__ import annotations

import struct
import sys
import zlib
from pathlib import Path

ROOT = Path(__file__).resolve().parents[1] / "app" / "src" / "main" / "res"
SIGNATURE = b"\x89PNG\r\n\x1a\n"
COMPILED_ANDROID_CHUNKS = {b"npTc", b"npOl", b"npLb"}
NEUTRAL = (0, 0, 0, 0)
BLACK = (0, 0, 0, 255)
RED = (255, 0, 0, 255)


def paeth(a: int, b: int, c: int) -> int:
    p = a + b - c
    pa, pb, pc = abs(p - a), abs(p - b), abs(p - c)
    if pa <= pb and pa <= pc:
        return a
    if pb <= pc:
        return b
    return c


def read_png(path: Path):
    data = path.read_bytes()
    if not data.startswith(SIGNATURE):
        raise ValueError("invalid PNG signature")

    pos = len(SIGNATURE)
    width = height = bit_depth = color_type = None
    idat = bytearray()
    types = []
    seen_iend = False
    while pos + 12 <= len(data):
        size = struct.unpack_from(">I", data, pos)[0]
        kind = data[pos + 4:pos + 8]
        start = pos + 8
        end = start + size
        if end + 4 > len(data):
            raise ValueError(f"truncated {kind.decode('ascii', 'replace')} chunk")
        payload = data[start:end]
        stored_crc = struct.unpack_from(">I", data, end)[0]
        actual_crc = zlib.crc32(kind + payload) & 0xFFFFFFFF
        if stored_crc != actual_crc:
            raise ValueError(f"CRC mismatch in {kind.decode('ascii', 'replace')} chunk")
        types.append(kind)

        if kind == b"IHDR":
            if size != 13:
                raise ValueError("invalid IHDR length")
            width, height, bit_depth, color_type, comp, filt, interlace = struct.unpack(">IIBBBBB", payload)
            if (comp, filt, interlace) != (0, 0, 0):
                raise ValueError("unsupported PNG compression/filter/interlace mode")
        elif kind == b"IDAT":
            idat.extend(payload)
        elif kind == b"IEND":
            seen_iend = True
            pos = end + 4
            break
        pos = end + 4

    if not seen_iend or width is None:
        raise ValueError("missing IHDR or IEND")
    if bit_depth != 8 or color_type != 6:
        raise ValueError(f"expected 8-bit RGBA PNG, got bit_depth={bit_depth}, color_type={color_type}")

    raw = zlib.decompress(bytes(idat))
    bpp = 4
    stride = width * bpp
    expected = height * (stride + 1)
    if len(raw) != expected:
        raise ValueError(f"decoded pixel buffer has {len(raw)} bytes; expected {expected}")

    rows = []
    offset = 0
    previous = bytearray(stride)
    for _ in range(height):
        filter_type = raw[offset]
        encoded = raw[offset + 1:offset + 1 + stride]
        offset += stride + 1
        row = bytearray(stride)
        for i, value in enumerate(encoded):
            left = row[i - bpp] if i >= bpp else 0
            up = previous[i]
            up_left = previous[i - bpp] if i >= bpp else 0
            if filter_type == 0:
                predictor = 0
            elif filter_type == 1:
                predictor = left
            elif filter_type == 2:
                predictor = up
            elif filter_type == 3:
                predictor = (left + up) // 2
            elif filter_type == 4:
                predictor = paeth(left, up, up_left)
            else:
                raise ValueError(f"unknown PNG row filter {filter_type}")
            row[i] = (value + predictor) & 0xFF
        rows.append(row)
        previous = row
    return width, height, rows, types


def pixel(rows, x, y):
    i = x * 4
    return tuple(rows[y][i:i + 4])


def validate(path: Path):
    width, height, rows, chunk_types = read_png(path)
    errors = []
    if width < 3 or height < 3:
        errors.append(f"{width}x{height} is too small for nine-patch")
    bad_chunks = sorted(c.decode("ascii", "replace") for c in set(chunk_types) & COMPILED_ANDROID_CHUNKS)
    if bad_chunks:
        errors.append("compiled APK metadata remains: " + ", ".join(bad_chunks))
    if pixel(rows, 0, 0) != NEUTRAL:
        errors.append("top-left border pixel is not transparent")

    allowed = {NEUTRAL, BLACK, RED}
    border = ([pixel(rows, x, 0) for x in range(width)] +
              [pixel(rows, x, height - 1) for x in range(width)] +
              [pixel(rows, 0, y) for y in range(height)] +
              [pixel(rows, width - 1, y) for y in range(height)])
    if any(p not in allowed for p in border):
        errors.append("border contains a color other than transparent, black, or red")
    if not any(pixel(rows, x, 0) == BLACK for x in range(1, width - 1)):
        errors.append("no horizontal stretch marker on top border")
    if not any(pixel(rows, 0, y) == BLACK for y in range(1, height - 1)):
        errors.append("no vertical stretch marker on left border")
    return errors


def main() -> int:
    files = sorted(ROOT.rglob("*.9.png"))
    if not files:
        print(f"ERROR: no .9.png resources found under {ROOT}")
        return 1
    failed = 0
    for path in files:
        try:
            errors = validate(path)
        except Exception as exc:
            errors = [str(exc)]
        for error in errors:
            failed += 1
            rel = path.relative_to(ROOT)
            print(f"::error file=app/src/main/res/{rel}::{error}")
    if failed:
        print(f"FAILED: {failed} validation issue(s) in {len(files)} nine-patch file(s)")
        return 1
    print(f"PASS: {len(files)} source nine-patch PNG files are valid (no APK npTc/npOl/npLb chunks)")
    return 0


if __name__ == "__main__":
    sys.exit(main())
