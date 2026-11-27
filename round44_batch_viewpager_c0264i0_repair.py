#!/usr/bin/env python3
"""Round44 batch repair: C0264i0 orphan override + ViewPager decompiler control flow.

This consolidates every compiler error reported by Actions run 46011769329.
It does not initialize locals with arbitrary defaults: the three affected
ViewPager methods are restored using the AndroidX ViewPager layout algorithms.

Usage:
  python3 round44_batch_viewpager_c0264i0_repair.py . --check-only
  python3 round44_batch_viewpager_c0264i0_repair.py .
"""
from __future__ import annotations

import argparse
import re
import shutil
import sys
from pathlib import Path

C0264I0 = Path("app/src/main/java/p006b/p008b/p018i/C0264i0.java")
VIEWPAGER = Path("app/src/main/java/androidx/viewpager/widget/ViewPager.java")
BACKUP_ROOT = Path(".round44-backup")


def method_bounds(source: str, signature: str) -> tuple[int, int, int]:
    """Locate a Java method by unique signature fragment and balance its body."""
    start = source.find(signature)
    if start < 0:
        raise ValueError(f"missing method anchor: {signature}")
    if source.find(signature, start + 1) >= 0:
        raise ValueError(f"ambiguous method anchor: {signature}")
    brace = source.find("{", start)
    if brace < 0:
        raise ValueError(f"missing method body: {signature}")

    depth = 0
    state = "code"
    i = brace
    while i < len(source):
        ch = source[i]
        nxt = source[i + 1] if i + 1 < len(source) else ""
        if state == "line":
            if ch == "\n":
                state = "code"
            i += 1
            continue
        if state == "block":
            if ch == "*" and nxt == "/":
                state = "code"
                i += 2
            else:
                i += 1
            continue
        if state in ("string", "char"):
            if ch == "\\":
                i += 2
                continue
            if (state == "string" and ch == '"') or (state == "char" and ch == "'"):
                state = "code"
            i += 1
            continue
        if ch == "/" and nxt == "/":
            state = "line"
            i += 2
            continue
        if ch == "/" and nxt == "*":
            state = "block"
            i += 2
            continue
        if ch == '"':
            state = "string"
            i += 1
            continue
        if ch == "'":
            state = "char"
            i += 1
            continue
        if ch == "{":
            depth += 1
        elif ch == "}":
            depth -= 1
            if depth == 0:
                return start, brace, i + 1
        i += 1
    raise ValueError(f"unterminated method body: {signature}")


def replace_method(source: str, signature: str, replacement: str) -> str:
    start, _brace, end = method_bounds(source, signature)
    # Replace from the beginning of the line so the existing indentation is
    # not retained in front of the replacement's own indentation.
    line_start = source.rfind("\n", 0, start) + 1
    if source[line_start:start].strip():
        raise ValueError(f"unexpected text before method signature: {signature}")
    return source[:line_start] + replacement + source[end:]


def strip_orphan_override(source: str) -> tuple[str, int]:
    """Remove the stranded annotation before m1078p even with JADX comments between."""
    if "public class C0264i0 extends android.widget.LinearLayout {" not in source:
        raise ValueError("C0264i0 Round41 LinearLayout migration is missing")
    target = "public int m1078p()"
    target_pos = source.find(target)
    if target_pos < 0 or source.find(target, target_pos + 1) >= 0:
        raise ValueError("C0264i0 m1078p() anchor missing or ambiguous")

    # Look backwards only to the nearest @Override, then prove that everything
    # between it and m1078p is whitespace or comments (no Java declaration).
    search_start = max(0, target_pos - 20000)
    candidates = list(re.finditer(r"(?m)^[ \t]*@Override\b[^\r\n]*(?:\r?\n|$)", source[search_start:target_pos]))
    if not candidates:
        return source, 0  # already clean
    match = candidates[-1]
    absolute_start = search_start + match.start()
    absolute_end = search_start + match.end()
    between = source[absolute_end:target_pos]
    residue = re.sub(r"/\*.*?\*/|//[^\r\n]*", "", between, flags=re.S)
    if residue.strip():
        # This nearest Override belongs to a real method; do not touch it.
        return source, 0

    updated = source[:absolute_start] + source[absolute_end:]
    # Ensure no annotation can now attach to m1078p through comments alone.
    target_pos2 = updated.find(target)
    back = updated[max(0, target_pos2 - 20000):target_pos2]
    candidates2 = list(re.finditer(r"(?m)^[ \t]*@Override\b[^\r\n]*(?:\r?\n|$)", back))
    if candidates2:
        m2 = candidates2[-1]
        gap = back[m2.end():]
        if not re.sub(r"/\*.*?\*/|//[^\r\n]*", "", gap, flags=re.S).strip():
            raise ValueError("orphan @Override remains attached to m1078p()")
    return updated, 1


M737K = r'''    public void m737k(int i, float f, int i2) {
        if (this.f1140R > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            for (int index = 0; index < childCount; index++) {
                View child = getChildAt(index);
                C0173f lp = (C0173f) child.getLayoutParams();
                if (lp.f1177a) {
                    int gravity = lp.f1178b & 7;
                    int childLeft;
                    switch (gravity) {
                        case 3: // LEFT
                            childLeft = paddingLeft;
                            paddingLeft += child.getWidth();
                            break;
                        case 1: // CENTER_HORIZONTAL
                            childLeft = Math.max((width - child.getMeasuredWidth()) / 2, paddingLeft);
                            break;
                        case 5: // RIGHT
                            childLeft = width - paddingRight - child.getMeasuredWidth();
                            paddingRight += child.getMeasuredWidth();
                            break;
                        default:
                            childLeft = paddingLeft;
                            break;
                    }
                    int offset = childLeft + scrollX - child.getLeft();
                    if (offset != 0) {
                        child.offsetLeftAndRight(offset);
                    }
                }
            }
        }
        InterfaceC0176i listener = this.f1142T;
        if (listener != null) {
            listener.mo750a(i, f, i2);
        }
        List<InterfaceC0176i> listeners = this.f1141S;
        if (listeners != null) {
            int size = listeners.size();
            for (int index = 0; index < size; index++) {
                InterfaceC0176i item = listeners.get(index);
                if (item != null) {
                    item.mo750a(i, f, i2);
                }
            }
        }
        this.f1139Q = true;
    }'''


ON_LAYOUT = r'''    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int width = i3 - i;
        int height = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int decorCount = 0;

        // First lay out decor children so their occupied space is excluded from pages.
        for (int index = 0; index < childCount; index++) {
            View child = getChildAt(index);
            if (child.getVisibility() == 8) {
                continue;
            }
            C0173f lp = (C0173f) child.getLayoutParams();
            if (!lp.f1177a) {
                continue;
            }

            int horizontalGravity = lp.f1178b & 7;
            int verticalGravity = lp.f1178b & 112;
            int childLeft;
            switch (horizontalGravity) {
                case 3: // LEFT
                    childLeft = paddingLeft;
                    paddingLeft += child.getMeasuredWidth();
                    break;
                case 1: // CENTER_HORIZONTAL
                    childLeft = Math.max((width - child.getMeasuredWidth()) / 2, paddingLeft);
                    break;
                case 5: // RIGHT
                    childLeft = width - paddingRight - child.getMeasuredWidth();
                    paddingRight += child.getMeasuredWidth();
                    break;
                default:
                    childLeft = paddingLeft;
                    break;
            }

            int childTop;
            switch (verticalGravity) {
                case 48: // TOP
                    childTop = paddingTop;
                    paddingTop += child.getMeasuredHeight();
                    break;
                case 16: // CENTER_VERTICAL
                    childTop = Math.max((height - child.getMeasuredHeight()) / 2, paddingTop);
                    break;
                case 80: // BOTTOM
                    childTop = height - paddingBottom - child.getMeasuredHeight();
                    paddingBottom += child.getMeasuredHeight();
                    break;
                default:
                    childTop = paddingTop;
                    break;
            }

            childLeft += scrollX;
            child.layout(childLeft, childTop,
                    childLeft + child.getMeasuredWidth(),
                    childTop + child.getMeasuredHeight());
            decorCount++;
        }

        int childWidth = width - paddingLeft - paddingRight;
        // Then lay out pages using the final space remaining after decor children.
        for (int index = 0; index < childCount; index++) {
            View child = getChildAt(index);
            if (child.getVisibility() == 8) {
                continue;
            }
            C0173f lp = (C0173f) child.getLayoutParams();
            C0172e item = null;
            if (!lp.f1177a) {
                item = m734h(child);
            }
            if (!lp.f1177a && item != null) {
                int childLeft = paddingLeft + (int) (childWidth * item.f1176e);
                int childTop = paddingTop;
                if (lp.f1180d) {
                    lp.f1180d = false;
                    int widthSpec = View.MeasureSpec.makeMeasureSpec(
                            (int) (childWidth * lp.f1179c), 1073741824);
                    int heightSpec = View.MeasureSpec.makeMeasureSpec(
                            height - paddingTop - paddingBottom, 1073741824);
                    child.measure(widthSpec, heightSpec);
                }
                child.layout(childLeft, childTop,
                        childLeft + child.getMeasuredWidth(),
                        childTop + child.getMeasuredHeight());
            }
        }

        this.f1160p = paddingTop;
        this.f1161q = height - paddingBottom;
        this.f1140R = decorCount;
        if (this.f1138P) {
            m747u(this.f1151g, false, 0, false);
        }
        this.f1138P = false;
    }'''


ON_MEASURE = r'''    public void onMeasure(int i, int i2) {
        setMeasuredDimension(ViewGroup.getDefaultSize(0, i),
                ViewGroup.getDefaultSize(0, i2));

        int measuredWidth = getMeasuredWidth();
        this.f1124B = Math.min(measuredWidth / 10, this.f1123A);
        int childWidthSize = measuredWidth - getPaddingLeft() - getPaddingRight();
        int childHeightSize = getMeasuredHeight() - getPaddingTop() - getPaddingBottom();

        // Measure decor children first. Their gravity determines which dimension
        // they consume, while explicit layout dimensions take precedence.
        int childCount = getChildCount();
        for (int index = 0; index < childCount; index++) {
            View child = getChildAt(index);
            if (child.getVisibility() == 8) {
                continue;
            }
            C0173f lp = (C0173f) child.getLayoutParams();
            if (lp == null || !lp.f1177a) {
                continue;
            }

            int horizontalGravity = lp.f1178b & 7;
            int verticalGravity = lp.f1178b & 112;
            boolean consumeVertical = verticalGravity == 48 || verticalGravity == 80;
            boolean consumeHorizontal = horizontalGravity == 3 || horizontalGravity == 5;

            int widthMode = Integer.MIN_VALUE;  // AT_MOST
            int heightMode = Integer.MIN_VALUE; // AT_MOST
            if (consumeVertical) {
                widthMode = 1073741824; // EXACTLY
            } else if (consumeHorizontal) {
                heightMode = 1073741824; // EXACTLY
            }

            int widthSize = childWidthSize;
            int heightSize = childHeightSize;
            if (((ViewGroup.LayoutParams) lp).width != -2) {
                widthMode = 1073741824;
                if (((ViewGroup.LayoutParams) lp).width != -1) {
                    widthSize = ((ViewGroup.LayoutParams) lp).width;
                }
            }
            if (((ViewGroup.LayoutParams) lp).height != -2) {
                heightMode = 1073741824;
                if (((ViewGroup.LayoutParams) lp).height != -1) {
                    heightSize = ((ViewGroup.LayoutParams) lp).height;
                }
            }

            child.measure(View.MeasureSpec.makeMeasureSpec(widthSize, widthMode),
                    View.MeasureSpec.makeMeasureSpec(heightSize, heightMode));
            if (consumeVertical) {
                childHeightSize -= child.getMeasuredHeight();
            } else if (consumeHorizontal) {
                childWidthSize -= child.getMeasuredWidth();
            }
        }

        this.f1164t = View.MeasureSpec.makeMeasureSpec(childHeightSize, 1073741824);
        this.f1165u = true;
        m743q(this.f1151g);
        this.f1165u = false;

        // Page children fill the remaining width, scaled by their page width factor.
        int pageChildCount = getChildCount();
        for (int index = 0; index < pageChildCount; index++) {
            View child = getChildAt(index);
            if (child.getVisibility() == 8) {
                continue;
            }
            C0173f lp = (C0173f) child.getLayoutParams();
            if (lp != null && !lp.f1177a) {
                int width = (int) (childWidthSize * lp.f1179c);
                int widthSpec = View.MeasureSpec.makeMeasureSpec(width, 1073741824);
                child.measure(widthSpec, this.f1164t);
            }
        }
    }'''


def patch_c0264i0(path: Path) -> tuple[str, int]:
    source = path.read_text(encoding="utf-8")
    updated, removed = strip_orphan_override(source)
    # An annotation still immediately attached to m1078p is a hard failure.
    target_pos = updated.find("public int m1078p()")
    prev = updated[max(0, target_pos - 20000):target_pos]
    anns = list(re.finditer(r"(?m)^[ \t]*@Override\b[^\r\n]*(?:\r?\n|$)", prev))
    if anns:
        gap = prev[anns[-1].end():]
        if not re.sub(r"/\*.*?\*/|//[^\r\n]*", "", gap, flags=re.S).strip():
            raise ValueError("C0264i0: invalid @Override still attaches to m1078p()")
    return updated, removed


def patch_viewpager(path: Path) -> str:
    source = path.read_text(encoding="utf-8")
    required = (
        "public void m737k(int i, float f, int i2)",
        "public void onLayout(boolean z, int i, int i2, int i3, int i4)",
        "public void onMeasure(int i, int i2)",
        "this.f1140R",
        "this.f1164t",
    )
    for token in required:
        if token not in source:
            raise ValueError(f"ViewPager anchor missing: {token}")

    source = replace_method(source, "public void m737k(int i, float f, int i2)", M737K)
    source = replace_method(
        source,
        "public void onLayout(boolean z, int i, int i2, int i3, int i4)",
        ON_LAYOUT,
    )
    source = replace_method(source, "public void onMeasure(int i, int i2)", ON_MEASURE)

    # Validate that the repaired methods do not retain the old uninitialized locals.
    for signature in (
        "public void m737k(int i, float f, int i2)",
        "public void onLayout(boolean z, int i, int i2, int i3, int i4)",
        "public void onMeasure(int i, int i2)",
    ):
        method_bounds(source, signature)
    for token in (
        "switch (gravity)",
        "childHeightSize -= child.getMeasuredHeight();",
        "this.f1164t = View.MeasureSpec.makeMeasureSpec(childHeightSize, 1073741824);",
        "m747u(this.f1151g, false, 0, false);",
    ):
        if token not in source:
            raise ValueError(f"ViewPager post-patch validation failed: missing {token}")
    return source


def main() -> int:
    parser = argparse.ArgumentParser()
    parser.add_argument("root", nargs="?", default=".")
    parser.add_argument("--check-only", action="store_true")
    args = parser.parse_args()
    root = Path(args.root).resolve()
    c_path = root / C0264I0
    v_path = root / VIEWPAGER
    for path in (c_path, v_path):
        if not path.is_file():
            print(f"ERROR: source file not found: {path}", file=sys.stderr)
            return 2

    original_c = c_path.read_text(encoding="utf-8")
    original_v = v_path.read_text(encoding="utf-8")
    try:
        updated_c, removed_override = patch_c0264i0(c_path)
        updated_v = patch_viewpager(v_path)
    except Exception as exc:
        print(f"Round44 validation failed; no files were written: {exc}", file=sys.stderr)
        return 1

    if args.check_only:
        print(
            "Round44 check passed: C0264i0 orphan annotation check and all three "
            "ViewPager method repairs validated; no files changed."
        )
        return 0

    changes = []
    if updated_c != original_c:
        backup = root / BACKUP_ROOT / C0264I0
        backup.parent.mkdir(parents=True, exist_ok=True)
        if not backup.exists():
            shutil.copy2(c_path, backup)
        c_path.write_text(updated_c, encoding="utf-8")
        changes.append(f"C0264i0 (removed {removed_override} orphan @Override)")
    if updated_v != original_v:
        backup = root / BACKUP_ROOT / VIEWPAGER
        backup.parent.mkdir(parents=True, exist_ok=True)
        if not backup.exists():
            shutil.copy2(v_path, backup)
        v_path.write_text(updated_v, encoding="utf-8")
        changes.append("ViewPager (restored m737k/onLayout/onMeasure)")

    if not changes:
        print("Round44 already applied; no changes made.")
    else:
        print("Round44 applied: " + "; ".join(changes))
        print(f"Original files backed up under {BACKUP_ROOT}/")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
