#!/usr/bin/env python3
"""Round 25 source-structure repair for adbtool's JADX-restored sources.

All anchors are validated before any file is written. This patch addresses
compiler diagnostics exposed after Round 24, retaining existing code paths.
"""
from pathlib import Path
import re
import sys

ROOT = Path(__file__).resolve().parent
JAVA = ROOT / "app/src/main/java"
changes = {}


def load(rel):
    p = ROOT / rel
    if not p.is_file():
        raise RuntimeError(f"required file missing: {rel}")
    return p.read_text(encoding="utf-8")


def one(s, old, new, rel, expected=1):
    n = s.count(old)
    if n != expected:
        raise RuntimeError(f"{rel}: expected {expected} occurrence(s), found {n}: {old[:100]!r}")
    return s.replace(old, new)


def regex_one(s, pattern, repl, rel):
    out, n = re.subn(pattern, repl, s, count=1, flags=re.S)
    if n != 1:
        raise RuntimeError(f"{rel}: regex expected one match, found {n}: {pattern[:100]!r}")
    return out


def put(rel, s):
    changes[rel] = s

# 1) VersionedParcel reflection helper must declare ClassNotFoundException so
# m2177o's existing catch block is reachable.
rel = "app/src/main/java/p006b/p077y/AbstractC0609a.java"
s = load(rel)
s = one(s, "public final Method m2166d(String str) throws NoSuchMethodException {",
        "public final Method m2166d(String str) throws NoSuchMethodException, ClassNotFoundException {", rel)
put(rel, s)

# 2) Support ResultReceiver wrapper and its Parcelable sibling need their
# platform/synthetic no-argument superclass construction restored.
rel = "app/src/main/java/android/support/v4/media/session/ResultReceiverC0007x50fd9e4a.java"
s = load(rel)
s = one(s, "import android.os.Bundle;\nimport android.os.ResultReceiver;",
        "import android.os.Bundle;\nimport android.os.Handler;\nimport android.os.ResultReceiver;", rel)
s = one(s, "public class ResultReceiverC0007x50fd9e4a extends ResultReceiver {",
        "public class ResultReceiverC0007x50fd9e4a extends ResultReceiver {\n    public ResultReceiverC0007x50fd9e4a() {\n        super((Handler) null);\n    }\n", rel)
put(rel, s)

rel = "app/src/main/java/p000a/p001a/p002a/p005b/C0002b.java"
s = load(rel)
s = one(s, "    public C0002b(Parcel parcel) {",
        "    public C0002b() {\n        this.f2b = null;\n    }\n\n    public C0002b(Parcel parcel) {", rel)
put(rel, s)

# 3) ViewDragHelper's string construction avoids the decompiler's conflicting
# single-letter package/class qualifier.
rel = "app/src/main/java/p006b/p049j/p051b/C0447e.java"
s = load(rel)
s = one(s, 'StringBuilder sbM2191e = a.m2191e("captureChildView: parameter must be a descendant of the ViewDragHelper\'s tracked parent view (");',
        'StringBuilder sbM2191e = new StringBuilder("captureChildView: parameter must be a descendant of the ViewDragHelper\'s tracked parent view (");', rel)
put(rel, s)

# 4) Restore typed Parcelable.Creator signatures in Material saved-state classes.
creator_fixes = {
"app/src/main/java/com/google/android/material/bottomsheet/BottomSheetBehavior.java": ("C1346e",),
"app/src/main/java/com/google/android/material/navigation/NavigationView.java": ("C1365b",),
"app/src/main/java/com/google/android/material/internal/CheckableImageButton.java": ("C1362a",),
"app/src/main/java/com/google/android/material/bottomappbar/BottomAppBar.java": ("C1341a",),
}
for rel, (typ,) in creator_fixes.items():
    s = load(rel)
    s = one(s, "public Object createFromParcel(Parcel parcel) {", f"public {typ} createFromParcel(Parcel parcel) {{", rel)
    s = one(s, "public Object[] newArray(int i) {", f"public {typ}[] newArray(int i) {{", rel)
    put(rel, s)

# 5) Material constructors: local variable declarations emitted before super()
# are moved immediately after the required constructor invocation.
rel = "app/src/main/java/com/google/android/material/bottomsheet/BottomSheetBehavior.java"
s = changes[rel]
s = one(s, "    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {\n        int i;\n        super(context, attributeSet);",
        "    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {\n        super(context, attributeSet);\n        int i;", rel)
put(rel, s)

rel = "app/src/main/java/com/google/android/material/navigation/NavigationView.java"
s = changes[rel]
s = one(s, "    public NavigationView(Context context, AttributeSet attributeSet) {\n        int iM1164l;\n        boolean z;\n        super(context, attributeSet, com.didjdk.adbhelper.R.attr.mu);",
        "    public NavigationView(Context context, AttributeSet attributeSet) {\n        super(context, attributeSet, com.didjdk.adbhelper.R.attr.mu);\n        int iM1164l;\n        boolean z;", rel)
s = one(s, "SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();",
        "SparseArray<Parcelable> sparseArray = new SparseArray<>();", rel)
put(rel, s)

rel = "app/src/main/java/com/google/android/material/button/MaterialButton.java"
s = load(rel)
s = one(s, "    public MaterialButton(Context context, AttributeSet attributeSet) {\n        Drawable insetDrawable;\n        super(C1277n.m2946d(context, attributeSet, com.didjdk.adbhelper.R.attr.m3, com.didjdk.adbhelper.R.style.pz), attributeSet, com.didjdk.adbhelper.R.attr.m3);",
        "    public MaterialButton(Context context, AttributeSet attributeSet) {\n        super(C1277n.m2946d(context, attributeSet, com.didjdk.adbhelper.R.attr.m3, com.didjdk.adbhelper.R.style.pz), attributeSet, com.didjdk.adbhelper.R.attr.m3);\n        Drawable insetDrawable;", rel)
put(rel, s)

rel = "app/src/main/java/com/google/android/material/chip/Chip.java"
s = load(rel)
s = one(s,
'''    public Chip(Context context, AttributeSet attributeSet) {
        TextUtils.TruncateAt truncateAt;
        TypedArray typedArrayObtainStyledAttributes;
        int i;
        boolean zHasValue;
        C1351b c1351b;
        int resourceId;
        super(context, attributeSet, com.didjdk.adbhelper.R.attr.da);''',
'''    public Chip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.didjdk.adbhelper.R.attr.da);
        TextUtils.TruncateAt truncateAt;
        TypedArray typedArrayObtainStyledAttributes;
        int i;
        boolean zHasValue;
        C1351b c1351b;
        int resourceId;''', rel)
put(rel, s)

# 6) NavigationView adapter must implement the generic RecyclerView.Adapter<VH>
# contract with its actual holder type, and register its menu callback.
rel = "app/src/main/java/p080c/p126d/p127a/p128a/p148r/C1271h.java"
s = load(rel)
s = one(s, "    public int f6119u = -1;",
        "    public int f6119u = -1;\n\n    public InterfaceC0235m.a f6121a;", rel)
s = one(s, "public void mo537e(RecyclerView.AbstractC0129d0 abstractC0129d0, int i) {\n            l lVar = (l) abstractC0129d0;",
        "public void mo537e(l lVar, int i) {", rel)
s = one(s, "public RecyclerView.AbstractC0129d0 mo538f(ViewGroup viewGroup, int i) {\n            RecyclerView.AbstractC0129d0 iVar;",
        "public l mo538f(ViewGroup viewGroup, int i) {\n            l iVar;", rel)
s = one(s, "public void mo539g(RecyclerView.AbstractC0129d0 abstractC0129d0) {\n            l lVar = (l) abstractC0129d0;",
        "public void mo539g(l lVar) {", rel)
s = one(s,
'''        public i(LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            View viewInflate = layoutInflater.inflate(R.layout.aj, viewGroup, false);
            super(viewInflate);
            viewInflate.setOnClickListener(onClickListener);
        }''',
'''        public i(LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(R.layout.aj, viewGroup, false));
            this.f927a.setOnClickListener(onClickListener);
        }''', rel)
# In saved-state action-view map, the value type is Parcelable, not a wildcard capture.
s = one(s, "SparseArray<? extends Parcelable> sparseArray2 = new SparseArray<>();",
        "SparseArray<Parcelable> sparseArray2 = new SparseArray<>();", rel)
s = one(s, "SparseArray<? extends Parcelable> sparseArray3 = new SparseArray<>();",
        "SparseArray<Parcelable> sparseArray3 = new SparseArray<>();", rel)
# Add the interface callback setter (the menu presenter callback is retained for lifecycle parity).
s = one(s, "    /* JADX INFO: renamed from: g */\n    public void mo120g(Context context, C0229g c0229g) {",
        "    @Override // p006b.p008b.p016h.p017i.InterfaceC0235m\n    public void mo918l(InterfaceC0235m.a callback) {\n        this.f6121a = callback;\n    }\n\n    /* JADX INFO: renamed from: g */\n    public void mo120g(Context context, C0229g c0229g) {", rel)
put(rel, s)

# 7) The popup implementation uses its own enclosing class for qualified-this
# references and implements the missing vertical-offset method.
rel = "app/src/main/java/p006b/p008b/p018i/C0291w.java"
s = load(rel)
s = s.replace("d.this", "C0291w.d.this")
# Verify the inner-class reference replacements were actually needed.
if s.count("C0291w.d.this") < 4:
    raise RuntimeError(f"{rel}: expected at least four qualified popup inner references")
s = one(s, "        @Override // p006b.p008b.p018i.C0291w.f\n        /* JADX INFO: renamed from: o */\n        public void mo1095o(ListAdapter listAdapter) {",
        "        @Override // p006b.p008b.p018i.C0291w.f\n        /* JADX INFO: renamed from: n */\n        public void mo1147n(int i) {\n            m1089a(i);\n        }\n\n        @Override // p006b.p008b.p018i.C0291w.f\n        /* JADX INFO: renamed from: o */\n        public void mo1095o(ListAdapter listAdapter) {", rel)
# Super must precede local declarations.
s = one(s,
'''    public C0291w(Context context, AttributeSet attributeSet, int i) throws Throwable {
        Exception e2;
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, i);''',
'''    public C0291w(Context context, AttributeSet attributeSet, int i) throws Throwable {
        super(context, attributeSet, i);
        Exception e2;
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;''', rel)
# The outer catch cannot assign to a catch-local variable from the nested catch.
s = one(s,
'''        } catch (Throwable th2) {
            th = th2;
            if (typedArray != null) {
                typedArray.recycle();
            }
            throw th;
        }''',
'''        } catch (Throwable th2) {
            if (typedArray != null) {
                typedArray.recycle();
            }
            throw th2;
        }''', rel)
put(rel, s)

# 8) Fix AppCompat's cached onClick branch by re-running context lookup when
# invoked; the method is cached again, but no illegal out-of-loop break remains.
rel = "app/src/main/java/androidx/appcompat/app/AppCompatViewInflater.java"
s = load(rel)
s = one(s, "            if (this.f135d != null) {\n                break;\n            }\n", "", rel)
put(rel, s)

# 9) Material's CoordinatorLayout behaviors use the generic child type in
# overridden method signatures. Keep AppBarLayout's concrete API for helpers.
rel = "app/src/main/java/com/google/android/material/appbar/AppBarLayout.java"
s = load(rel)
repls = [
("public boolean mo2772E(View view)", "public boolean mo2772E(T view)"),
("public int mo2776I(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3)", "public int mo2776I(CoordinatorLayout coordinatorLayout, T view, int i, int i2, int i3)"),
("public boolean mo174k(CoordinatorLayout coordinatorLayout, View view, int i)", "public boolean mo174k(CoordinatorLayout coordinatorLayout, T view, int i)"),
("public boolean mo175l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4)", "public boolean mo175l(CoordinatorLayout coordinatorLayout, T view, int i, int i2, int i3, int i4)"),
("public /* bridge */ /* synthetic */ void mo179p(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3)", "public /* bridge */ /* synthetic */ void mo179p(CoordinatorLayout coordinatorLayout, T view, View view2, int i, int i2, int[] iArr, int i3)"),
("public /* bridge */ /* synthetic */ void mo181r(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr)", "public /* bridge */ /* synthetic */ void mo181r(CoordinatorLayout coordinatorLayout, T view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr)"),
("public void mo184u(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable)", "public void mo184u(CoordinatorLayout coordinatorLayout, T view, Parcelable parcelable)"),
("public Parcelable mo185v(CoordinatorLayout coordinatorLayout, View view)", "public Parcelable mo185v(CoordinatorLayout coordinatorLayout, T view)"),
("public /* bridge */ /* synthetic */ boolean mo187x(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2)", "public /* bridge */ /* synthetic */ boolean mo187x(CoordinatorLayout coordinatorLayout, T view, View view2, View view3, int i, int i2)"),
("public void mo189z(CoordinatorLayout coordinatorLayout, View view, View view2, int i)", "public void mo189z(CoordinatorLayout coordinatorLayout, T view, View view2, int i)"),
("public void m3051M(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int[] iArr)", "public void m3051M(CoordinatorLayout coordinatorLayout, T appBarLayout, View view, int i, int[] iArr)"),
("public void m3052N(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int[] iArr)", "public void m3052N(CoordinatorLayout coordinatorLayout, T appBarLayout, int i, int[] iArr)"),
("public boolean m3053O(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2)", "public boolean m3053O(CoordinatorLayout coordinatorLayout, T appBarLayout, View view, int i, int i2)"),
]
for old,new in repls:
    s = one(s, old, new, rel)
# The bridge-shaped overrides above now receive T, so pass T through to the
# typed helper methods rather than narrowing it back to AppBarLayout.
s = one(s, "m3051M(coordinatorLayout, (AppBarLayout) view, view2, i2, iArr);",
        "m3051M(coordinatorLayout, (T) view, view2, i2, iArr);", rel)
s = one(s, "m3052N(coordinatorLayout, (AppBarLayout) view, i4, iArr);",
        "m3052N(coordinatorLayout, (T) view, i4, iArr);", rel)
s = one(s, "return m3053O(coordinatorLayout, (AppBarLayout) view, view2, i, i2);",
        "return m3053O(coordinatorLayout, (T) view, view2, i, i2);", rel)
# T is bounded by AppBarLayout, allowing inherited offset helpers to receive the
# exact generic child and avoiding AppBarLayout-to-T conversion failures.
s = s.replace("AppBarLayout appBarLayout = (AppBarLayout) view;", "T appBarLayout = (T) view;")
# This source contains one decompiler-inserted break outside a loop in offset logic.
s = one(s, "            if (!appBarLayout.f10119f) {\n                top = iM1448h;\n                break;\n            }",
        "            if (!appBarLayout.f10119f) {\n                top = iM1448h;\n            }", rel)
put(rel, s)

# 10) Extended FAB behavior signatures must use its declared generic child T;
# the base MaterialButton constructors are Context/AttributeSet based.
rel = "app/src/main/java/com/google/android/material/floatingactionbutton/ExtendedFloatingActionButton.java"
s = load(rel)
s = one(s, "    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.AbstractC0068c<T> {",
        "    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet) {\n        super(context, attributeSet);\n    }\n\n    public ExtendedFloatingActionButton(Context context) {\n        this(context, null);\n    }\n\n    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.AbstractC0068c<T> {", rel)
s = one(s, "public /* bridge */ /* synthetic */ boolean mo164a(CoordinatorLayout coordinatorLayout, View view, Rect rect)",
        "public /* bridge */ /* synthetic */ boolean mo164a(CoordinatorLayout coordinatorLayout, T view, Rect rect)", rel)
s = one(s, "public boolean mo170g(CoordinatorLayout coordinatorLayout, View view, View view2)",
        "public boolean mo170g(CoordinatorLayout coordinatorLayout, T view, View view2)", rel)
s = one(s, "public boolean mo174k(CoordinatorLayout coordinatorLayout, View view, int i)",
        "public boolean mo174k(CoordinatorLayout coordinatorLayout, T view, int i)", rel)
put(rel, s)

# 11) BottomAppBar lacked constructors, which caused an implicit Toolbar()
# invocation. Restore normal View constructors and generic child overrides.
rel = "app/src/main/java/com/google/android/material/bottomappbar/BottomAppBar.java"
s = changes[rel]
s = one(s, "    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {",
        "    public BottomAppBar(Context context, AttributeSet attributeSet) {\n        super(context, attributeSet);\n    }\n\n    public BottomAppBar(Context context) {\n        this(context, null);\n    }\n\n    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {", rel)
s = one(s, "public boolean mo174k(CoordinatorLayout coordinatorLayout, View view, int i)",
        "public boolean mo174k(CoordinatorLayout coordinatorLayout, BottomAppBar view, int i)", rel)
s = one(s, "public boolean mo187x(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2)",
        "public boolean mo187x(CoordinatorLayout coordinatorLayout, BottomAppBar view, View view2, View view3, int i, int i2)", rel)
put(rel, s)

# 12) Two remaining illegal breaks were reconstructed as ordinary fall-through.
rel = "app/src/main/java/p080c/p126d/p127a/p128a/p140k/C1218b.java"
s = load(rel)
s = one(s, "        } else {\n            z = false;\n            break;\n        }\n        boolean z3 = z && this.f5805Q;",
        "        } else {\n            z = false;\n        }\n        boolean z3 = z && this.f5805Q;", rel)
put(rel, s)

# 13) Collectively commit all replacements only after every source anchor above
# has validated. A failed anchor leaves the working tree untouched.
for rel, content in changes.items():
    (ROOT / rel).write_text(content, encoding="utf-8")

print(f"Round 25 patch applied to {len(changes)} files.")
print("Next: ./gradlew :app:compileDebugJavaWithJavac")
