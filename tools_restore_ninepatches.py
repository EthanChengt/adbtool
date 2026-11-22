from __future__ import annotations

import struct
from pathlib import Path
from PIL import Image

ROOT = Path('/mnt/data/ghfix_work/app/src/main/res')
PNG_SIG = b'\x89PNG\r\n\x1a\n'
BLACK = (0, 0, 0, 255)
RED = (255, 0, 0, 255)
TRANSPARENT = (0, 0, 0, 0)


def parse_chunks(data: bytes):
    if not data.startswith(PNG_SIG):
        raise ValueError('invalid PNG signature')
    pos = 8
    chunks = []
    while pos + 12 <= len(data):
        length = struct.unpack_from('>I', data, pos)[0]
        kind = data[pos + 4:pos + 8]
        end = pos + 12 + length
        if end > len(data):
            raise ValueError(f'truncated {kind!r} chunk')
        chunk_data = data[pos + 8:pos + 8 + length]
        chunks.append((kind, chunk_data))
        pos = end
        if kind == b'IEND':
            break
    if not chunks or chunks[-1][0] != b'IEND':
        raise ValueError('missing IEND')
    return chunks


def get_data(chunks, name):
    vals = [data for kind, data in chunks if kind == name]
    if len(vals) != 1:
        raise ValueError(f'expected exactly one {name.decode()} chunk, got {len(vals)}')
    return vals[0]


def range_marks(draw, is_horizontal, fixed, start, end, color):
    # start/end use the content-area coordinate system from npTc/npLb.
    # The marker border is shifted by one pixel, so content coordinates
    # [start, end) map to border coordinates [start+1, end].
    if end <= start:
        return
    if is_horizontal:
        for x in range(start + 1, end + 1):
            draw.point((x, fixed), fill=color)
    else:
        for y in range(start + 1, end + 1):
            draw.point((fixed, y), fill=color)


files = sorted(ROOT.rglob('*.9.png'))
if not files:
    raise SystemExit('No nine-patch resources found')

records = []
for path in files:
    original_bytes = path.read_bytes()
    chunks = parse_chunks(original_bytes)
    nine = get_data(chunks, b'npTc')
    if len(nine) < 32:
        raise ValueError(f'{path}: npTc chunk too short ({len(nine)})')

    was_deserialized, num_x, num_y, num_colors = nine[:4]
    x_off, y_off = struct.unpack_from('<II', nine, 4)
    padding_left, padding_right, padding_top, padding_bottom = struct.unpack_from('>iiii', nine, 12)
    colors_off = struct.unpack_from('<I', nine, 28)[0]
    expected = 32 + 4 * (num_x + num_y + num_colors)
    if len(nine) != expected:
        raise ValueError(f'{path}: npTc length {len(nine)} != expected {expected}')
    if x_off < 32 or y_off < 32 or colors_off < 32:
        raise ValueError(f'{path}: npTc array offset points into header')

    x_divs = list(struct.unpack_from('>' + 'i' * num_x, nine, x_off)) if num_x else []
    y_divs = list(struct.unpack_from('>' + 'i' * num_y, nine, y_off)) if num_y else []
    # Color hints are validated structurally by npTc length; AAPT2 recalculates
    # them from the bitmap pixels when compiling the source nine-patch.

    im = Image.open(path).convert('RGBA')
    width, height = im.size
    if width < 1 or height < 1:
        raise ValueError(f'{path}: empty bitmap')
    if num_x < 2 or num_y < 2 or num_x % 2 or num_y % 2:
        raise ValueError(f'{path}: invalid stretch division counts x={num_x}, y={num_y}')
    if any(v < 0 or v > width for v in x_divs) or any(v < 0 or v > height for v in y_divs):
        raise ValueError(f'{path}: stretch division lies outside {width}x{height}: {x_divs}/{y_divs}')
    if any(x_divs[i] >= x_divs[i + 1] for i in range(0, len(x_divs), 2)):
        raise ValueError(f'{path}: invalid x stretch range {x_divs}')
    if any(y_divs[i] >= y_divs[i + 1] for i in range(0, len(y_divs), 2)):
        raise ValueError(f'{path}: invalid y stretch range {y_divs}')
    if min(padding_left, padding_right, padding_top, padding_bottom) < 0:
        raise ValueError(f'{path}: negative padding')
    if padding_left + padding_right > width or padding_top + padding_bottom > height:
        raise ValueError(f'{path}: padding outside bitmap {width}x{height}')

    layout = None
    layout_chunks = [d for k, d in chunks if k == b'npLb']
    if len(layout_chunks) > 1:
        raise ValueError(f'{path}: duplicate npLb chunks')
    if layout_chunks:
        if len(layout_chunks[0]) != 16:
            raise ValueError(f'{path}: malformed npLb length')
        layout = struct.unpack('<4i', layout_chunks[0])
        if min(layout) < 0 or layout[0] + layout[2] > width or layout[1] + layout[3] > height:
            raise ValueError(f'{path}: invalid npLb insets {layout} for {width}x{height}')

    # Recreate a valid AAPT2 source nine-patch: transparent 1px border with
    # black stretch/padding runs and optional red layout-bound runs.
    canvas = Image.new('RGBA', (width + 2, height + 2), TRANSPARENT)
    canvas.paste(im, (1, 1))
    from PIL import ImageDraw
    draw = ImageDraw.Draw(canvas)

    for i in range(0, len(x_divs), 2):
        range_marks(draw, True, 0, x_divs[i], x_divs[i + 1], BLACK)
    for i in range(0, len(y_divs), 2):
        range_marks(draw, False, 0, y_divs[i], y_divs[i + 1], BLACK)

    # Content padding markers on bottom/right borders. The intervals are
    # omitted only for a zero-width content interval.
    range_marks(draw, True, height + 1, padding_left, width - padding_right, BLACK)
    range_marks(draw, False, width + 1, padding_top, height - padding_bottom, BLACK)

    # Preserve optional layout-bound insets carried by npLb (red AAPT2 markers).
    if layout:
        left, top, right, bottom = layout
        range_marks(draw, True, height + 1, 0, left, RED)
        range_marks(draw, True, height + 1, width - right, width, RED)
        range_marks(draw, False, width + 1, 0, top, RED)
        range_marks(draw, False, width + 1, height - bottom, height, RED)

    # Write a clean source PNG without compiled Android nine-patch chunks.
    tmp = path.with_suffix(path.suffix + '.tmp')
    canvas.save(tmp, format='PNG', optimize=True)
    tmp.replace(path)
    records.append((path.relative_to(ROOT).as_posix(), width, height, x_divs, y_divs, (padding_left, padding_right, padding_top, padding_bottom), layout))

print(f'RECONSTRUCTED={len(records)}')
for row in records:
    print('\t'.join(map(str, row)))
