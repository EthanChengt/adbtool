#!/usr/bin/env python3
"""Round65: restore missing TextPaint width calculations and right-aligned origins."""
from pathlib import Path
import argparse

REL = Path("app/src/main/java/p080c/p126d/p127a/p128a/p148r/C1266c.java")

def once(s, old, new, label):
    n=s.count(old)
    if n==0 and s.count(new)==1:
        return s
    if n!=1:
        raise SystemExit(f"{REL}: expected exactly one {label} anchor, found {n}")
    return s.replace(old,new,1)

def transform(s):
    old="        float fMeasureText;"
    new="        float fMeasureText = 0.0f;"
    s=once(s,old,new,"text width declaration")
    old="        float f;"
    new="        float f = 0.0f;"
    s=once(s,old,new,"draw origin declaration")

    blocks=[
("""            CharSequence charSequence3 = this.f6086x;
            if (charSequence3 != null) {
            }""",
"""            CharSequence charSequence3 = this.f6086x;
            fMeasureText = charSequence3 != null ? this.f6055E.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;"""),
("""            CharSequence charSequence4 = this.f6086x;
            if (charSequence4 != null) {
            }""",
"""            CharSequence charSequence4 = this.f6086x;
            fMeasureText = charSequence4 != null ? this.f6055E.measureText(charSequence4, 0, charSequence4.length()) : 0.0f;"""),
("""        CharSequence charSequence5 = this.f6086x;
        if (charSequence5 != null) {
        }""",
"""        CharSequence charSequence5 = this.f6086x;
        fMeasureText = charSequence5 != null ? this.f6055E.measureText(charSequence5, 0, charSequence5.length()) : 0.0f;""")
    ]
    for old,new in blocks:
        s=once(s,old,new,"missing collapsed-text measurement")

    old="fCenterX2 = this.f6066d.right;"
    new="fCenterX2 = this.f6066d.right;\n                        f = fCenterX2 - fMeasureText;"
    count=s.count(old)
    if count==0 and s.count(new)==8:
        pass
    elif count!=8:
        raise SystemExit(f"{REL}: expected eight right-gravity anchors, found {count}")
    else:
        s=s.replace(old,new)
    return s

def main():
    ap=argparse.ArgumentParser()
    ap.add_argument("root",nargs="?",default=".")
    ap.add_argument("--check-only",action="store_true")
    args=ap.parse_args()
    path=Path(args.root)/REL
    if not path.is_file():
        raise SystemExit(f"Missing source file: {path}")
    before=path.read_text(encoding="utf-8")
    after=transform(before)
    if args.check_only:
        print(f"Round65 validation passed: {REL}")
        return
    if after!=before:
        backup=path.with_suffix(path.suffix+".round65.bak")
        if not backup.exists():
            backup.write_text(before,encoding="utf-8")
        path.write_text(after,encoding="utf-8")
        print(f"Round65 applied: {REL}")
    else:
        print(f"Round65 already applied: {REL}")
    check=path.read_text(encoding="utf-8")
    right_pair = "fCenterX2 = this.f6066d.right;\\n                        f = fCenterX2 - fMeasureText;"
    if (check.count("float fMeasureText = 0.0f;") != 1
            or check.count("float f = 0.0f;") != 1
            or check.count(right_pair) != 8):
        raise SystemExit(
            "Round65 post-write verification failed: "
            f"width_decl={check.count('float fMeasureText = 0.0f;')}, "
            f"origin_decl={check.count('float f = 0.0f;')}, "
            f"right_gravity_pairs={check.count(right_pair)}"
        )
    print("Round65 post-write verification passed")

if __name__=="__main__":
    main()
