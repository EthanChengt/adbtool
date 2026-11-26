#!/usr/bin/env python3
"""Round 29 Fix1: repair the verified javac failure batch from run 45838856035.

Run at repository root:
    python3 round29_fix1.py . --check-only
    python3 round29_fix1.py .

Every transform is validated in memory before any source file is written.
The apply mode creates a .round29.bak backup beside each changed source file.
"""
from __future__ import annotations

import argparse
import re
import shutil
import sys
from pathlib import Path


class PatchError(RuntimeError):
    pass


def replace_n(text: str, old: str, new: str, label: str, expected: int = 1) -> str:
    count = text.count(old)
    if count != expected:
        raise PatchError(f"{label}: expected {expected} occurrence(s), found {count}")
    return text.replace(old, new)


def replace_once_or_done(text: str, old: str, new: str, label: str) -> str:
    count = text.count(old)
    if count == 1:
        return text.replace(old, new, 1)
    if count == 0 and new in text:
        return text
    raise PatchError(f"{label}: expected one source anchor, found {count}")


def add_static_imports(text: str, ordinary_import: str, imports: list[str], label: str) -> str:
    missing = [line for line in imports if line not in text]
    if not missing:
        return text
    if ordinary_import not in text:
        raise PatchError(f"{label}: helper import anchor missing")
    return text.replace(ordinary_import, ordinary_import + "\n".join(missing) + "\n", 1)


def patch_c0539b(s: str) -> str:
    old = '''            if (aVar == null) {
                if (i >= 64) {
                    j = this.f3319a;
                }
                return Long.bitCount(j);
            }'''
    new = '''            if (aVar == null) {
                j = i >= 64 ? this.f3319a : this.f3319a & ((1L << i) - 1);
                return Long.bitCount(j);
            }'''
    return replace_once_or_done(s, old, new, "C0539b bit-count mask")


def patch_c0291w(s: str) -> str:
    anchor = '''        @Override // p006b.p008b.p018i.C0291w.f
        /* JADX INFO: renamed from: i */
        public Drawable mo1143i() {
            return m1092i();
        }'''
    insertion = '''        @Override // p006b.p008b.p018i.C0291w.f
        /* JADX INFO: renamed from: g */
        public int mo1142g() {
            return this.f1905h;
        }

        @Override // p006b.p008b.p018i.C0291w.f
        /* JADX INFO: renamed from: i */
        public Drawable mo1143i() {
            return m1092i();
        }'''
    return replace_once_or_done(s, anchor, insertion, "C0291w vertical-offset getter")


def patch_c0332d(s: str) -> str:
    # Restore the four anchors used by ConstraintWidget's dimension-ratio row.
    # RIGHT, LEFT, BOTTOM, TOP is the horizontal-ratio ordering used by
    # LinearSystem.addRatio; the adjacent top/bottom local already maps to TOP.
    s = replace_n(s, "c0328g3 = r29;", "c0328g3 = c0328gM1314l6;", "C0332d missing RIGHT anchor", 4)
    s = replace_n(s, "c0328g5 = r25;", "c0328g5 = c0328gM1314l8;", "C0332d missing BOTTOM anchor", 4)
    # JADX emitted two dead register copies with different indentation levels.
    # Both are immediately overwritten by the following c0328g assignment.
    dead_r26 = re.compile(r"(?m)^[ \t]*c0328g = r26;[ \t]*\n")
    s, removed = dead_r26.subn("", s)
    if removed != 2:
        raise PatchError(
            f"C0332d dead r26 register copies: expected 2 occurrence(s), found {removed}"
        )
    return s


def patch_c0333e(s: str) -> str:
    # Round28 introduced a method-scoped exception slot so JADX's rethrow path
    # can assign to it. Rename the first catch parameter to avoid shadowing it.
    s = replace_once_or_done(
        s,
        "} catch (Exception e) {\n                                e = e;",
        "} catch (Exception e4) {\n                                e = e4;",
        "C0333e method-scoped exception handoff",
    )
    s = replace_once_or_done(s, "this.f2377z0 = r2;", "this.f2377z0 = true;", "C0333e boolean dimension flag")
    return s


def patch_c0346d(s: str) -> str:
    class_anchor = '''    public C0345c f2505b;
'''
    constructors = '''    public C0345c f2505b;

    public C0346d(Context context) {
        super(context);
    }

    public C0346d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C0346d(Context context, AttributeSet attributeSet, int defStyleAttr) {
        super(context, attributeSet, defStyleAttr);
    }
'''
    s = replace_once_or_done(s, class_anchor, constructors, "C0346d ViewGroup constructors")
    s = replace_once_or_done(
        s,
        "        public a(Context context, AttributeSet attributeSet) {\n            float f;\n            super(context, attributeSet);",
        "        public a(Context context, AttributeSet attributeSet) {\n            super(context, attributeSet);\n            float f;",
        "C0346d LayoutParams super-constructor order",
    )
    return s


def patch_c0449a(s: str) -> str:
    s = add_static_imports(
        s,
        "import c.a.a.a.a;\n",
        [
            "import static c.a.a.a.a.m2191e;\n",
            "import static c.a.a.a.a.m2198l;\n",
        ],
        "C0449a",
    )
    s = s.replace("a.m2191e(", "m2191e(")
    s = s.replace("a.m2198l(", "m2198l(")
    if "m2191e(" not in s or "m2198l(" not in s:
        raise PatchError("C0449a: expected helper call sites were not found")

    # The inner attribute-value class has its own input-read catch/rethrow path.
    s = replace_once_or_done(
        s,
        """            byte[] bArr;
            InputStream inputStream2 = null;
            try {""",
        """            byte[] bArr;
            InputStream inputStream2 = null;
            IOException e = null;
            Throwable th = null;
            try {""",
        "C0449a attribute-value exception scopes",
    )

    # JPEG/HEIF/PNG format detection contains several decompiler catch merges;
    # the temporary variables are method-scoped in the original control flow.
    s = replace_once_or_done(
        s,
        """        byte[] bArr3;
        boolean z7;
        b bVar7;
        short s;
        bufferedInputStream.mark(5000);""",
        """        byte[] bArr3;
        boolean z7;
        b bVar7;
        short s;
        Exception e = null;
        Throwable th = null;
        bufferedInputStream.mark(5000);""",
        "C0449a format-detection exception scopes",
    )

    # A return statement is illegal in a static initializer; this exits its loop.
    s = replace_once_or_done(
        s,
        "                Pattern.compile(\"^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$\");\n                return;\n            }\n            f2877W[i] = new HashMap<>();",
        "                Pattern.compile(\"^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$\");\n                break;\n            }\n            f2877W[i] = new HashMap<>();",
        "C0449a static initializer loop exit",
    )
    return s


def patch_c1033e(s: str) -> str:
    s = add_static_imports(
        s,
        "import c.a.a.a.a;\n",
        [
            "import static c.a.a.a.a.m2188b;\n",
            "import static c.a.a.a.a.m2191e;\n",
            "import static c.a.a.a.a.m2198l;\n",
        ],
        "C1033e",
    )
    for method in ("m2188b", "m2191e", "m2198l"):
        s = s.replace(f"a.{method}(", f"{method}(")
    return s


def patch_c1032d(s: str) -> str:
    s = replace_once_or_done(s, "this.f5106a", "C1032d.this", "C1032d Handler callback outer capture")
    s = replace_once_or_done(s, "this.f5107a", "C1032d.this", "C1032d refresh-listener outer capture")
    s = replace_once_or_done(s, "new C1033e.d(c1033e)", "c1033e.new d(c1033e)", "C1032d inner adapter-row construction")
    return s


def patch_drawer_layout(s: str) -> str:
    s = replace_once_or_done(
        s,
        "public Object createFromParcel(Parcel parcel) {",
        "public C0085e createFromParcel(Parcel parcel) {",
        "DrawerLayout typed Parcelable.Creator factory",
    )
    s = replace_once_or_done(
        s,
        "public Object[] newArray(int i) {",
        "public C0085e[] newArray(int i) {",
        "DrawerLayout typed Parcelable.Creator array",
    )
    return s


def patch_view_click_file_picker(s: str) -> str:
    s = add_static_imports(
        s,
        "import c.a.a.a.a;\n",
        ["import static c.a.a.a.a.m2191e;\n"],
        "ViewOnClickListenerC0929j3",
    )
    s = s.replace("a.m2191e(", "m2191e(")
    field_anchor = "    public final /* synthetic */ FilePickerActivity.C1329g f4829b;\n"
    s = replace_once_or_done(
        s,
        field_anchor,
        "    public final FilePickerActivity f4828a;\n\n" + field_anchor,
        "File-picker listener activity field",
    )
    s = replace_once_or_done(
        s,
        "public ViewOnClickListenerC0929j3(FilePickerActivity.C1328f c1328f, FilePickerActivity.C1329g c1329g) {\n        this.f4830c = c1328f;",
        "public ViewOnClickListenerC0929j3(FilePickerActivity filePickerActivity, FilePickerActivity.C1328f c1328f, FilePickerActivity.C1329g c1329g) {\n        this.f4828a = filePickerActivity;\n        this.f4830c = c1328f;",
        "File-picker listener constructor capture",
    )
    s = s.replace("FilePickerActivity.this", "ViewOnClickListenerC0929j3.this.f4828a")
    if "FilePickerActivity.this" in s:
        raise PatchError("ViewOnClickListenerC0929j3: stale qualified outer reference remains")
    return s


def patch_file_picker_call_site(s: str) -> str:
    return replace_once_or_done(
        s,
        "new ViewOnClickListenerC0929j3(this, c1329g)",
        "new ViewOnClickListenerC0929j3(FilePickerActivity.this, this, c1329g)",
        "FilePickerActivity listener constructor call",
    )


def patch_view_click_app_picker(s: str) -> str:
    field_anchor = "    public final /* synthetic */ AppPickerActivity.C1313b f4934b;\n"
    s = replace_once_or_done(
        s,
        field_anchor,
        "    public final AppPickerActivity f4936a;\n\n" + field_anchor,
        "App-picker listener activity field",
    )
    s = replace_once_or_done(
        s,
        "public ViewOnClickListenerC0988v2(AppPickerActivity.C1312a c1312a, AppPickerActivity.C1313b c1313b) {\n        this.f4935c = c1312a;",
        "public ViewOnClickListenerC0988v2(AppPickerActivity appPickerActivity, AppPickerActivity.C1312a c1312a, AppPickerActivity.C1313b c1313b) {\n        this.f4936a = appPickerActivity;\n        this.f4935c = c1312a;",
        "App-picker listener constructor capture",
    )
    s = s.replace("AppPickerActivity.this", "ViewOnClickListenerC0988v2.this.f4936a")
    s = s.replace("this.f4759b", "ViewOnClickListenerC0988v2.this")
    return s


def patch_app_picker_call_site(s: str) -> str:
    return replace_once_or_done(
        s,
        "new ViewOnClickListenerC0988v2(this, c1313b)",
        "new ViewOnClickListenerC0988v2(AppPickerActivity.this, this, c1313b)",
        "AppPickerActivity listener constructor call",
    )


def patch_runnable_1128i(s: str) -> str:
    return replace_once_or_done(
        s,
        "RunnableC1128i runnableC1128i = this.f5439b;",
        "RunnableC1128i runnableC1128i = RunnableC1128i.this;",
        "RunnableC1128i callback outer capture",
    )


def patch_c0909f3(s: str) -> str:
    return replace_once_or_done(
        s,
        "C0909f3 c0909f3 = this.f5493b;",
        "C0909f3 c0909f3 = C0909f3.this;",
        "C0909f3 click-listener outer capture",
    )


def patch_runnable_0919h3(s: str) -> str:
    s = add_static_imports(
        s,
        "import c.a.a.a.a;\n",
        [
            "import static c.a.a.a.a.m2191e;\n",
            "import static c.a.a.a.a.m2193g;\n",
        ],
        "RunnableC0919h3",
    )
    s = s.replace("a.m2191e(", "m2191e(")
    s = s.replace("a.m2193g(", "m2193g(")
    return s


def patch_runnable_0925j(s: str) -> str:
    s = replace_once_or_done(
        s,
        "    public final /* synthetic */ ConnectActivity f4822b;\n",
        "    public final /* synthetic */ ConnectActivity f4822b;\n\n    public RunnableC0925j(ConnectActivity connectActivity) {\n        this.f4822b = connectActivity;\n    }\n",
        "RunnableC0925j activity constructor",
    )
    pattern = re.compile(
        r"    @Override // java\.lang\.Runnable\n"
        r"    public final void run\(\) throws Throwable \{.*?\n    \}\n\}",
        re.S,
    )
    replacement = '''    @Override // java.lang.Runnable
    public final void run() {
        final ConnectActivity connectActivity = this.f4822b;
        HttpsURLConnection connection = null;
        try {
            connection = (HttpsURLConnection) new URL("https://didjdk.github.io/adbhelper/privacy_policy.html").openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            StringBuilder body = new StringBuilder();
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    body.append(line);
                }
            }
            final String html = body.toString();
            connectActivity.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    DialogInterfaceC0193i.a builder = new DialogInterfaceC0193i.a(connectActivity);
                    builder.f1245a.f115d = "用户协议和隐私政策";
                    Spanned message = Html.fromHtml(html);
                    AlertController.C0020b params = builder.f1245a;
                    params.f117f = message;
                    params.f120i = "不同意";
                    params.f121j = null;
                    DialogInterface.OnClickListener agree = new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int which) {
                            C0532j.m1940a(connectActivity).edit().putBoolean("accept_policy", true).apply();
                        }
                    };
                    params.f118g = "同意并继续";
                    params.f119h = agree;
                    builder.m786h();
                }
            });
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }
}'''
    out, count = pattern.subn(replacement, s, count=1)
    if count != 1:
        raise PatchError(f"RunnableC0925j run method: expected one method body, found {count}")
    return out


def main() -> int:
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("root", nargs="?", default=".")
    parser.add_argument("--check-only", action="store_true")
    args = parser.parse_args()

    root = Path(args.root).resolve()
    if not root.is_dir():
        raise SystemExit(f"repository root does not exist: {root}")

    patches = {
        "app/src/main/java/p006b/p068t/p069b/C0539b.java": patch_c0539b,
        "app/src/main/java/p006b/p008b/p018i/C0291w.java": patch_c0291w,
        "app/src/main/java/p006b/p026f/p027a/p028h/C0332d.java": patch_c0332d,
        "app/src/main/java/p006b/p026f/p027a/p028h/C0333e.java": patch_c0333e,
        "app/src/main/java/p006b/p026f/p029b/C0346d.java": patch_c0346d,
        "app/src/main/java/p006b/p054l/p055a/C0449a.java": patch_c0449a,
        "app/src/main/java/c/c/a/v3/j0/C1033e.java": patch_c1033e,
        "app/src/main/java/c/c/a/v3/j0/C1032d.java": patch_c1032d,
        "app/src/main/java/androidx/drawerlayout/widget/DrawerLayout.java": patch_drawer_layout,
        "app/src/main/java/c/c/a/ViewOnClickListenerC0929j3.java": patch_view_click_file_picker,
        "app/src/main/java/com/didjdk/adbhelper/FilePickerActivity.java": patch_file_picker_call_site,
        "app/src/main/java/c/c/a/ViewOnClickListenerC0988v2.java": patch_view_click_app_picker,
        "app/src/main/java/com/didjdk/adbhelper/AppPickerActivity.java": patch_app_picker_call_site,
        "app/src/main/java/c/c/a/p122w3/RunnableC1128i.java": patch_runnable_1128i,
        "app/src/main/java/c/c/a/C0909f3.java": patch_c0909f3,
        "app/src/main/java/c/c/a/RunnableC0919h3.java": patch_runnable_0919h3,
        "app/src/main/java/c/c/a/RunnableC0925j.java": patch_runnable_0925j,
    }

    updates: dict[str, str] = {}
    for rel, transform in patches.items():
        path = root / rel
        if not path.is_file():
            raise PatchError(f"missing source file: {rel}")
        original = path.read_text(encoding="utf-8")
        updated = transform(original)
        if updated == original:
            raise PatchError(f"{rel}: patch produced no change")
        updates[rel] = updated

    if args.check_only:
        print(f"Round29 Fix1 validation passed: {len(updates)} files; no files changed")
        return 0

    for rel, updated in updates.items():
        path = root / rel
        backup = path.with_suffix(path.suffix + ".round29.bak")
        if not backup.exists():
            shutil.copy2(path, backup)
        path.write_text(updated, encoding="utf-8")

    print(f"Round29 Fix1 applied to {len(updates)} files")
    return 0


if __name__ == "__main__":
    try:
        raise SystemExit(main())
    except PatchError as exc:
        print(f"Round29 Fix1 validation failed; no files were written:\n- {exc}", file=sys.stderr)
        raise SystemExit(2)
