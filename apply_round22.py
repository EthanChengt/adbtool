#!/usr/bin/env python3
"""Apply round-22 compile repairs to the adbtool repository checkout.

The script verifies each input against the corresponding Git blob SHA from
EthanChengt/adbtool main (commit 24170f8a33cb622caf23f12a208d8672552f87f7).
No files are changed unless every source file matches and every edit anchor
is found exactly as expected.
"""
from __future__ import annotations
import argparse
import hashlib
import json
import re
import shutil
import sys
from pathlib import Path

BASE_SHA = {
    "app/src/main/java/androidx/recyclerview/widget/RecyclerView.java": "b4d0f3490d9a13c4058e3b5a2473a24f3fd49561",
    "app/src/main/java/p006b/p068t/p069b/C0539b.java": "a46c679a926eb6b8885866ef356ddcbc1d4ed2bb",
    "app/src/main/java/c/c/a/v3/k0/C1051q.java": "f62ab477e2a4a93bdff14437fc88742a1b796813",
    "app/src/main/java/androidx/coordinatorlayout/widget/CoordinatorLayout.java": "675158ebe8b9cd0d3409616c3e6a1d01498db558",
    "app/src/main/java/p006b/p032h/p042h/C0397b.java": "2acdaf9770ba02e537e0896e038e5f639df63329",
    "app/src/main/java/p006b/p008b/p018i/C0264i0.java": "0434e206ad249a76f0661e7337c55ee75c399295",
    "app/src/main/java/p006b/p008b/p018i/C0243a0.java": "82bbdfa34274d708ffa54a5a9ad8686a19b07558",
    "app/src/main/java/p006b/p008b/p018i/C0295y.java": "404b67c1e0cb5c9a3c0505485127a1a894441976",
    "app/src/main/java/p006b/p032h/p034c/p035b/C0369g.java": "3293f0862d74752a12e92da4f3259a4e2acbbbdf",
    "app/src/main/java/p006b/p071v/p072a/C0570d.java": "7948ba7c89c41dfd7d195d290677ee54ccfe4016",
    "app/src/main/java/androidx/appcompat/widget/Toolbar.java": "ba574746ad64a0028c2368e9ccad26053e7a6645",
    "app/src/main/java/androidx/core/widget/NestedScrollView.java": "276031d1012f2eb2a7c21cadad3ff236f0ada7e7",
    "app/src/main/java/androidx/appcompat/widget/ActionMenuView.java": "f577da7f31b44d5108a65059cb78aaa3e61e5357",
    "app/src/main/java/p006b/p008b/p018i/C0248c.java": "46f73e193738bdc7176c68cb83e20e61d4fc655a",
    "app/src/main/java/p006b/p032h/p044j/C0425t.java": "66a3ae5cf31b15b25526ebae8d00154b824941d5",
    "app/src/main/java/p006b/p032h/p044j/AbstractC0407b.java": "7b186668f3d68f4ea7853919a031e1d17851b14f",
    "app/src/main/java/p006b/p025e/AbstractC0319g.java": "8efc9588132d2b894f469328b9274a5154c9ade0",
    "app/src/main/java/p006b/p025e/C0315c.java": "43167396788a1a8833854cca425e28198fd4c73f",
    "app/src/main/java/p006b/p071v/p072a/C0567a.java": "74a1a0820e336d265470dfab2667d846281d7be6",
    "app/src/main/java/p006b/p008b/p009c/DialogC0203s.java": "eafb3108e163b8b33dc9552a111b63e32fe49cd9",
    "app/src/main/java/p006b/p008b/p016h/p017i/C0229g.java": "e777995c6446a7a14efb33bd7d75721f3d99adff",
    "app/src/main/res/values/ids.xml": "d54688ee8c9d5000120806f90397f56f1dcc197e",
    "app/src/main/java/p006b/p032h/p044j/C0423r.java": "ab1ff6fc777e5038c596e41909e8b702fa358325",
    "app/src/main/java/p006b/p032h/p033b/ActivityC0361g.java": "a8df1eb0b360e5fae5c2bfbd7972c181b24a80d7",
    "app/src/main/java/p006b/p008b/p009c/C0204t.java": "2f07383ffa4605ad318b1f92abd239ae912998da",
    "app/src/main/java/androidx/appcompat/view/menu/ActionMenuItemView.java": "d0d1a095db628d413e709430ea9a0fcaa35012d0",
    "app/src/main/java/p080c/p126d/p127a/p128a/p153w/InterfaceC1289b.java": "e587a956667b8a217dd7d5fc23b2dff3e843651f",
    "app/src/main/java/com/google/android/material/floatingactionbutton/FloatingActionButton.java": "17638b1acd2468bfd220f487c4a760678e95c8d3",
    "app/src/main/java/p080c/p126d/p127a/p128a/p147q/C1259e.java": "691476f24e981c07d6c11526d50d6882f4f6268c",
    "app/src/main/java/p080c/p126d/p127a/p128a/p154x/C1300k.java": "7c75d50786709bb7d387658e6207297862ac01ca",
    "app/src/main/java/p080c/p126d/p127a/p128a/p154x/C1296g.java": "87857d6ea8e83df44417eeca4ba043d1855bbfcc",
    "app/src/main/java/p006b/p008b/p018i/C0280q0.java": "dd092391839455d445726ce04c82e35f141a6348",
    "app/src/main/java/com/didjdk/adbhelper/MainActivity.java": "4af8a806c1b5a6bab09df6bb9d5265ed131658c2",
    "app/src/main/java/com/didjdk/adbhelper/ConnectActivity.java": "be2c9a390bdbf91a489fdd55c4683cd4e19eaab7",
}


def git_blob_sha(data: bytes) -> str:
    header = b"blob " + str(len(data)).encode("ascii") + b"\0"
    return hashlib.sha1(header + data).hexdigest()


def replace_exact(text: str, old: str, new: str, count: int = 1, label: str = "edit") -> str:
    actual = text.count(old)
    if actual != count:
        raise ValueError(f"{label}: expected {count} occurrence(s), found {actual}")
    return text.replace(old, new, count)


def apply_transforms(path: str, text: str) -> str:
    # Use a mutable holder so each exact replacement validates the expected count.
    text_holder = [text]

    def rep(old: str, new: str, n: int = 1):
        text_holder[0] = replace_exact(text_holder[0], old, new, n, path)

    if path.endswith("RecyclerView.java"):
        rep("""        C0539b c0539b = this.mChildHelper;
        if (!z) {
            c0539b.m1996a(view, -1, true);
            return;
        }
        int iIndexOfChild = this.f959b.indexOfChild(view);""",
            """        C0539b c0539b = this.mChildHelper;
        if (!z) {
            c0539b.m1996a(view, -1, true);
            return;
        }
        int iIndexOfChild = indexOfChild(view);""")
        rep("""    public boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        C0539b c0539b = this.mChildHelper;
        int iIndexOfChild = this.f959b.indexOfChild(view);""",
            """    public boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        C0539b c0539b = this.mChildHelper;
        int iIndexOfChild = indexOfChild(view);""")
    elif path.endswith("C0539b.java"):
        rep("a.m2197k(", "c.a.a.a.a.m2197k(", 2)
    elif path.endswith("C1051q.java"):
        rep("public void mo537e(RecyclerView.AbstractC0129d0 abstractC0129d0, int i) {\n        b bVar = (b) abstractC0129d0;",
            "public void mo537e(b bVar, int i) {")
        rep("public RecyclerView.AbstractC0129d0 mo538f(ViewGroup viewGroup, int i) {",
            "public b mo538f(ViewGroup viewGroup, int i) {")
    elif path.endswith("CoordinatorLayout.java"):
        rep("public C0071f(Context context, AttributeSet attributeSet) {\n            AbstractC0068c abstractC0068cNewInstance;\n            super(context, attributeSet);",
            "public C0071f(Context context, AttributeSet attributeSet) {\n            super(context, attributeSet);\n            AbstractC0068c abstractC0068cNewInstance;")
        rep("constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f516w);",
            "constructor = (Constructor<AbstractC0068c>) Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f516w);")
        rep("public Object createFromParcel(Parcel parcel) {\n                return new C0073h(parcel, null);",
            "public C0073h createFromParcel(Parcel parcel) {\n                return new C0073h(parcel, null);")
        rep("public Object[] newArray(int i) {\n                return new C0073h[i];",
            "public C0073h[] newArray(int i) {\n                return new C0073h[i];")
    elif path.endswith("AbstractC0407b.java"):
        rep("a.m2191e(", "c.a.a.a.a.m2191e(")
    elif path.endswith("C0397b.java"):
        text_holder[0] = text_holder[0].replace("a.m2191e(", "c.a.a.a.a.m2191e(")
        if "a.m2191e(" in text_holder[0]:
            raise ValueError(f"{path}: helper shadowing replacement incomplete")
    elif path.endswith("C0264i0.java"):
        rep("public C0264i0(Context context, AttributeSet attributeSet, int i) {\n        int resourceId;\n        super(context, attributeSet, i);",
            "public C0264i0(Context context, AttributeSet attributeSet, int i) {\n        super(context, attributeSet, i);\n        int resourceId;")
        rep("a.m2191e(", "c.a.a.a.a.m2191e(")
        # The original decompilation repeats this assignment outside the block
        # in which z24 is declared, producing an out-of-scope local variable.
        pos = text_holder[0].rfind("z19 = z24;")
        if pos < 0:
            raise ValueError(f"{path}: missing duplicate z19 = z24 assignment")
        text_holder[0] = text_holder[0][:pos] + text_holder[0][pos + len("z19 = z24;"):]
    elif path.endswith("C0243a0.java"):
        rep("int measuredWidth = Build.VERSION.SDK_INT >= 29 ? this.f1760i.isHorizontallyScrollable() : ((Boolean) m1002e(this.f1760i, \"getHorizontallyScrolling\", Boolean.FALSE)).booleanValue() ? 1048576 : (this.f1760i.getMeasuredWidth() - this.f1760i.getTotalPaddingLeft()) - this.f1760i.getTotalPaddingRight();",
            "int measuredWidth = (Build.VERSION.SDK_INT >= 29 ? this.f1760i.isHorizontallyScrollable() : ((Boolean) m1002e(this.f1760i, \"getHorizontallyScrolling\", Boolean.FALSE)).booleanValue()) ? 1048576 : (this.f1760i.getMeasuredWidth() - this.f1760i.getTotalPaddingLeft()) - this.f1760i.getTotalPaddingRight();")
    elif path.endswith("NestedScrollView.java"):
        rep("a.m2191e(", "c.a.a.a.a.m2191e(", 2)
    elif path.endswith("C0295y.java"):
        text_holder[0] = text_holder[0].replace("a.m2191e(", "c.a.a.a.a.m2191e(")
        rep("a.m2198l(", "c.a.a.a.a.m2198l(")
    elif path.endswith("C0369g.java"):
        text_holder[0] = text_holder[0].replace("a.m2191e(", "c.a.a.a.a.m2191e(")
    elif path.endswith("C0570d.java"):
        rep("a.m2187a(", "c.a.a.a.a.m2187a(")
    elif path.endswith("Toolbar.java"):
        rep("public Object createFromParcel(Parcel parcel) {\n                return new C0062g(parcel, null);",
            "public C0062g createFromParcel(Parcel parcel) {\n                return new C0062g(parcel, null);")
        rep("public Object[] newArray(int i) {\n                return new C0062g[i];",
            "public C0062g[] newArray(int i) {\n                return new C0062g[i];")
        rep("if (!this.f384O) {\n            z = false;\n            break;\n        }",
            "if (!this.f384O) {\n            z = false;\n        }")
        # Restore the missing MenuPresenter callback method.
        end = "\n    }\n\n    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$f */"
        rep(end, "\n        @Override\n        public void mo918l(InterfaceC0235m.a aVar) {\n            Toolbar.this.f382M = aVar;\n        }\n    }\n\n    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$f */")
        rep("public class C0056a implements ActionMenuView.InterfaceC0036e {\n        public C0056a() {\n        }\n    }",
            "public class C0056a implements ActionMenuView.InterfaceC0036e {\n        public C0056a() {\n        }\n\n        @Override\n        public boolean onMenuItemClick(MenuItem menuItem) {\n            InterfaceC0061f listener = Toolbar.this.f377H;\n            return listener != null && listener.onMenuItemClick(menuItem);\n        }\n    }")
        rep("public interface InterfaceC0061f {\n    }",
            "public interface InterfaceC0061f {\n        boolean onMenuItemClick(MenuItem menuItem);\n    }")
    elif path.endswith("ActionMenuView.java"):
        rep("InterfaceC0036e interfaceC0036e = ActionMenuView.this.f222B;\n            if (interfaceC0036e == null) {\n                return false;\n            }\n            Toolbar.InterfaceC0061f interfaceC0061f = Toolbar.this.f377H;\n            return interfaceC0061f != null ? C0204t.this.f1348c.onMenuItemSelected(0, menuItem) : false;",
            "InterfaceC0036e interfaceC0036e = ActionMenuView.this.f222B;\n            return interfaceC0036e != null && interfaceC0036e.onMenuItemClick(menuItem);")
        rep("public interface InterfaceC0036e {\n    }",
            "public interface InterfaceC0036e {\n        boolean onMenuItemClick(MenuItem menuItem);\n    }")
        rep("c0034c2.f238h = r3;", "c0034c2.f238h = false;")
        rep("c0034c2.f236f = r3;", "c0034c2.f236f = false;")
    elif path.endswith("C0248c.java"):
        rep("if ((i11 & 1) == z) {", "if (((i11 & 1) != 0) == z) {")
        rep("public class b extends ActionMenuItemView.AbstractC0025b {\n        public b() {\n        }\n    }",
            "public class b extends ActionMenuItemView.AbstractC0025b {\n        public b() {\n        }\n\n        @Override\n        public C0248c.a getPopup() {\n            return C0248c.this.f1797w;\n        }\n    }")
    elif path.endswith("C0425t.java"):
        rep("public class C0425t implements InterfaceC0424s {\n    @Override // p006b.p032h.p044j.InterfaceC0424s\n    /* JADX INFO: renamed from: b */",
            "public class C0425t implements InterfaceC0424s {\n    @Override // p006b.p032h.p044j.InterfaceC0424s\n    public void mo849a(View view) {\n    }\n\n    @Override // p006b.p032h.p044j.InterfaceC0424s\n    /* JADX INFO: renamed from: b */")
    elif path.endswith("AbstractC0319g.java"):
        rep("public boolean add(Object obj) {", "public boolean add(Map.Entry<K, V> obj) {")
        rep("public Object next() {\n            if (!hasNext()) {\n                throw new NoSuchElementException();\n            }\n            this.f2187c++;",
            "public Map.Entry<K, V> next() {\n            if (!hasNext()) {\n                throw new NoSuchElementException();\n            }\n            this.f2187c++;")
        rep("tArr[i2] = mo1229b(i2, i);", "tArr[i2] = (T) mo1229b(i2, i);")
    elif path.endswith("C0315c.java"):
        rep("abstractC0319g.f2177b = new AbstractC0319g.c();", "abstractC0319g.f2177b = abstractC0319g.new c();")
    elif path.endswith("C0567a.java"):
        rep("public C0567a(Context context, int i) {\n        ShapeDrawable shapeDrawable;\n        super(context);",
            "public C0567a(Context context, int i) {\n        super(context);\n        ShapeDrawable shapeDrawable;")
    elif path.endswith("DialogC0203s.java"):
        rep("    public DialogC0203s(Context context, int i) {\n        int i2;\n        if (i == 0) {\n            TypedValue typedValue = new TypedValue();\n            context.getTheme().resolveAttribute(R.attr.fm, typedValue, true);\n            i2 = typedValue.resourceId;\n        } else {\n            i2 = i;\n        }\n        super(context, i2);",
            "    private static int resolveDialogTheme(Context context, int theme) {\n        if (theme != 0) {\n            return theme;\n        }\n        TypedValue typedValue = new TypedValue();\n        context.getTheme().resolveAttribute(R.attr.fm, typedValue, true);\n        return typedValue.resourceId;\n    }\n\n    public DialogC0203s(Context context, int i) {\n        super(context, resolveDialogTheme(context, i));")
    elif path.endswith("C0229g.java"):
        bad_first = "while (r8.hasNext()) {\n                                    interfaceC0235m2 = weakReference.get();\n                                    if (interfaceC0235m2 == null) {\n                                        this.f1650u.remove(weakReference);\n                                    } else if (!zMo124m) {\n                                        zMo124m = interfaceC0235m2.mo124m(subMenuC0240r);\n                                    }\n                                }"
        good_first = "for (WeakReference<InterfaceC0235m> weakReference : this.f1650u) {\n                                    interfaceC0235m2 = weakReference.get();\n                                    if (interfaceC0235m2 == null) {\n                                        this.f1650u.remove(weakReference);\n                                    } else if (!zMo124m) {\n                                        zMo124m = interfaceC0235m2.mo124m(subMenuC0240r);\n                                    }\n                                }"
        rep(bad_first, good_first)
        bad_second = "while (r8.hasNext()) {\n                    interfaceC0235m2 = weakReference.get();\n                    if (interfaceC0235m2 == null) {\n                        this.f1650u.remove(weakReference);\n                    } else if (!zMo124m) {\n                        zMo124m = interfaceC0235m2.mo124m(subMenuC0240r);\n                    }\n                }"
        good_second = "for (WeakReference<InterfaceC0235m> weakReference : this.f1650u) {\n                    interfaceC0235m2 = weakReference.get();\n                    if (interfaceC0235m2 == null) {\n                        this.f1650u.remove(weakReference);\n                    } else if (!zMo124m) {\n                        zMo124m = interfaceC0235m2.mo124m(subMenuC0240r);\n                    }\n                }"
        rep(bad_second, good_second)
        rep("if (interfaceC0235m != null) {\n                }\n                for (WeakReference<InterfaceC0235m> weakReference : this.f1650u)",
            "if (interfaceC0235m != null) {\n                    zMo124m = interfaceC0235m.mo124m(subMenuC0240r);\n                } else {\n                    zMo124m = false;\n                }\n                for (WeakReference<InterfaceC0235m> weakReference : this.f1650u)")
        rep("SparseArray<? extends Parcelable> sparseArray = null;", "SparseArray<Parcelable> sparseArray = null;")
        rep("abstractC0407b == null && abstractC0407b.mo981e()", "abstractC0407b != null && abstractC0407b.mo981e()")
        rep("abstractC0407b2 == null && abstractC0407b2.mo979a()", "abstractC0407b2 != null && abstractC0407b2.mo979a()")
    elif path.endswith("ids.xml"):
        rep("    <item name=\"s\" type=\"id\" />\n</resources>",
            "    <item name=\"s\" type=\"id\" />\n    <item name=\"b2\" type=\"id\" />\n    <item name=\"nz\" type=\"id\" />\n</resources>")
    elif path.endswith("C0423r.java"):
        rep("((View) C0207w.this.f1375d.getParent()).invalidate();",
            "View parent = this.f2737b.getParent() instanceof View ? (View) this.f2737b.getParent() : null;\n            if (parent != null) {\n                parent.invalidate();\n            }")
    elif path.endswith("ActivityC0361g.java"):
        rep("    @Override // android.app.Activity, android.view.Window.Callback\n    public boolean dispatchKeyEvent(KeyEvent keyEvent) {",
            "    @Override\n    public AbstractC0499d mo4a() {\n        return this.f2570b;\n    }\n\n    @Override // android.app.Activity, android.view.Window.Callback\n    public boolean dispatchKeyEvent(KeyEvent keyEvent) {")
    elif path.endswith("C0204t.java"):
        rep("public class b implements Toolbar.InterfaceC0061f {\n        public b() {\n        }\n    }",
            "public class b implements Toolbar.InterfaceC0061f {\n        public b() {\n        }\n\n        @Override\n        public boolean onMenuItemClick(MenuItem menuItem) {\n            Window.Callback callback = C0204t.this.f1348c;\n            return callback != null && callback.onMenuItemSelected(0, menuItem);\n        }\n    }")
    elif path.endswith("ActionMenuItemView.java"):
        rep("            AbstractC0025b abstractC0025b = ActionMenuItemView.this.f142k;\n            if (abstractC0025b == null || (aVar = C0248c.this.f1797w) == null) {\n                return null;\n            }\n            return aVar.m989a();",
            "            AbstractC0025b abstractC0025b = ActionMenuItemView.this.f142k;\n            if (abstractC0025b == null) {\n                return null;\n            }\n            aVar = abstractC0025b.getPopup();\n            return aVar == null ? null : aVar.m989a();")
        rep("public static abstract class AbstractC0025b {\n    }",
            "public static abstract class AbstractC0025b {\n        public abstract C0248c.a getPopup();\n    }")
    elif path.endswith("InterfaceC1289b.java"):
        rep("package p080c.p126d.p127a.p128a.p153w;\n\n", "package p080c.p126d.p127a.p128a.p153w;\n\nimport android.graphics.drawable.Drawable;\n\n")
        rep("public interface InterfaceC1289b {\n}",
            "public interface InterfaceC1289b {\n    void setBackgroundDrawable(Drawable drawable);\n\n    void setShadowPadding(int left, int top, int right, int bottom);\n}")
    elif path.endswith("FloatingActionButton.java"):
        rep("public class C1360b implements InterfaceC1289b {\n        public C1360b() {\n        }\n    }",
            "public class C1360b implements InterfaceC1289b {\n        public C1360b() {\n        }\n\n        @Override\n        public void setBackgroundDrawable(Drawable drawable) {\n            FloatingActionButton.this.setBackgroundDrawableInternal(drawable);\n        }\n\n        @Override\n        public void setShadowPadding(int left, int top, int right, int bottom) {\n            FloatingActionButton.this.f10289n.set(left, top, right, bottom);\n            int padding = FloatingActionButton.this.f10286k;\n            FloatingActionButton.this.setPadding(left + padding, top + padding, right + padding, bottom + padding);\n        }\n    }\n\n    private void setBackgroundDrawableInternal(Drawable drawable) {\n        super.setBackgroundDrawable(drawable);\n    }")
        rep("public /* bridge */ /* synthetic */ boolean mo164a(CoordinatorLayout coordinatorLayout, View view, Rect rect) {\n            return m3127B((FloatingActionButton) view, rect);",
            "public /* bridge */ /* synthetic */ boolean mo164a(CoordinatorLayout coordinatorLayout, T view, Rect rect) {\n            return m3127B(view, rect);")
        rep("public boolean mo170g(CoordinatorLayout coordinatorLayout, View view, View view2) {\n            FloatingActionButton floatingActionButton = (FloatingActionButton) view;",
            "public boolean mo170g(CoordinatorLayout coordinatorLayout, T view, View view2) {\n            FloatingActionButton floatingActionButton = view;")
        rep("public boolean mo174k(CoordinatorLayout coordinatorLayout, View view, int i) {\n            FloatingActionButton floatingActionButton = (FloatingActionButton) view;",
            "public boolean mo174k(CoordinatorLayout coordinatorLayout, T view, int i) {\n            FloatingActionButton floatingActionButton = view;")
        rep("this.f10297a.m2770a(FloatingActionButton.this);", "this.f10297a.m2770a((T) FloatingActionButton.this);")
        rep("this.f10297a.m2771b(FloatingActionButton.this);", "this.f10297a.m2771b((T) FloatingActionButton.this);")
    elif path.endswith("C1259e.java"):
        rep("(Property<FloatingActionButton, Float>) View.ALPHA", '"alpha"')
        rep("(Property<FloatingActionButton, Float>) View.SCALE_X", '"scaleX"')
        rep("(Property<FloatingActionButton, Float>) View.SCALE_Y", '"scaleY"')
        rep("FloatingActionButton.this.f10289n.set(i, i2, i3, i4);\n            FloatingActionButton floatingActionButton = FloatingActionButton.this;\n            int i5 = floatingActionButton.f10286k;\n            floatingActionButton.setPadding(i + i5, i2 + i5, i3 + i5, i4 + i5);",
            "c1360b3.setShadowPadding(i, i2, i3, i4);")
        rep("super/*android.widget.ImageButton*/.setBackgroundDrawable(insetDrawable);",
            "c1360b.setBackgroundDrawable(insetDrawable);")
        rep("FloatingActionButton.this.f10289n.set(i6, i7, i8, i9);\n            FloatingActionButton floatingActionButton2 = FloatingActionButton.this;\n            int i10 = floatingActionButton2.f10286k;\n            floatingActionButton2.setPadding(i6 + i10, i7 + i10, i8 + i10, i9 + i10);",
            "c1360b4.setShadowPadding(i6, i7, i8, i9);")
    elif path.endswith("C1300k.java"):
        rep("    public interface a {\n    }",
            "    public interface a {\n        void mo2994a(int index, C1302m shape, Matrix matrix);\n\n        void mo2995b(int index, C1302m shape, Matrix matrix);\n    }")
        rep("C1302m.f[] fVarArr = C1296g.this.f6212c;\n                c1302m2.m2999b(c1302m2.f6295f);\n                fVarArr[i3] = new C1301l(c1302m2, new ArrayList(c1302m2.f6297h), matrix5);",
            "aVar.mo2994a(i3, c1302m2, matrix5);")
        rep("C1302m.f[] fVarArr2 = C1296g.this.f6213d;\n                c1302m3.m2999b(c1302m3.f6295f);\n                fVarArr2[i3] = new C1301l(c1302m3, new ArrayList(c1302m3.f6297h), matrix6);",
            "aVar.mo2995b(i3, c1302m3, matrix6);")
    elif path.endswith("C1296g.java"):
        rep("public class a implements C1300k.a {\n        public a() {\n        }\n    }",
            "public class a implements C1300k.a {\n        public a() {\n        }\n\n        @Override\n        public void mo2994a(int index, C1302m shape, Matrix matrix) {\n            shape.m2999b(shape.f6295f);\n            C1296g.this.f6212c[index] = new C1301l(shape, new java.util.ArrayList(shape.f6297h), matrix);\n        }\n\n        @Override\n        public void mo2995b(int index, C1302m shape, Matrix matrix) {\n            shape.m2999b(shape.f6295f);\n            C1296g.this.f6213d[index] = new C1301l(shape, new java.util.ArrayList(shape.f6297h), matrix);\n        }\n    }")
    elif path.endswith("C0280q0.java"):
        rep("    /* JADX INFO: renamed from: b.b.i.q0$a */\n    public class a extends LinearLayout {",
            "    public C0280q0(Context context) {\n        this(context, null);\n    }\n\n    public C0280q0(Context context, android.util.AttributeSet attrs) {\n        this(context, attrs, 0);\n    }\n\n    public C0280q0(Context context, android.util.AttributeSet attrs, int defStyleAttr) {\n        super(context, attrs, defStyleAttr);\n    }\n\n    /* JADX INFO: renamed from: b.b.i.q0$a */\n    public class a extends LinearLayout {")
        rep("        public final /* synthetic */ C0280q0 f1974c;\n\n        @Override // android.view.View",
            "        public final /* synthetic */ C0280q0 f1974c;\n\n        public a(Context context) {\n            super(context);\n            this.f1974c = C0280q0.this;\n        }\n\n        @Override // android.view.View")
    elif path.endswith("MainActivity.java"):
        rep("        @Override // p006b.p078z.p079a.AbstractC0612a\n        /* JADX INFO: renamed from: c */\n        public native int c();",
            "        /* JADX INFO: renamed from: c */\n        public native int c();")
    elif path.endswith("ConnectActivity.java"):
        rep("package com.didjdk.adbhelper;\n\n",
            "package com.didjdk.adbhelper;\n\nimport static c.a.a.a.a.q;\n\n")
        rep("c.a.a.a.c.a.a.a.a.q()", "q()", 5)
    else:
        raise ValueError(f"No transform registered for {path}")

    return text_holder[0]


def main() -> int:
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("repo", nargs="?", default=".", help="repository root (default: current directory)")
    parser.add_argument("--check-only", action="store_true", help="verify inputs and transformations without writing")
    args = parser.parse_args()
    root = Path(args.repo).resolve()
    prepared: dict[Path, bytes] = {}
    old_data: dict[Path, bytes] = {}
    errors = []
    for rel, expected in BASE_SHA.items():
        file_path = root / rel
        if not file_path.is_file():
            errors.append(f"missing file: {rel}")
            continue
        raw = file_path.read_bytes()
        actual = git_blob_sha(raw)
        if actual != expected:
            errors.append(f"SHA mismatch: {rel}\n  expected {expected}\n  actual   {actual}")
            continue
        try:
            source = raw.decode("utf-8")
            updated = apply_transforms(rel, source)
            if updated == source:
                errors.append(f"no-op transform: {rel}")
                continue
            prepared[file_path] = updated.encode("utf-8")
            old_data[file_path] = raw
        except Exception as exc:
            errors.append(f"edit failed: {rel}: {exc}")
    if errors:
        print("Round 22 validation failed; no files were written:", file=sys.stderr)
        for err in errors:
            print("- " + err, file=sys.stderr)
        return 2
    if args.check_only:
        print(f"Round 22 check passed: {len(prepared)} files validated; no files changed.")
        return 0
    backup_root = root / ".round22-backup"
    for path, raw in old_data.items():
        rel = path.relative_to(root)
        backup = backup_root / rel
        backup.parent.mkdir(parents=True, exist_ok=True)
        backup.write_bytes(raw)
    for path, updated in prepared.items():
        path.write_bytes(updated)
    report = {
        "base_commit": "24170f8a33cb622caf23f12a208d8672552f87f7",
        "files_changed": [str(p.relative_to(root)) for p in prepared],
        "backup_directory": ".round22-backup",
        "build_verified": False,
    }
    (root / "round22-apply-report.json").write_text(json.dumps(report, ensure_ascii=False, indent=2) + "\n", encoding="utf-8")
    print(f"Applied Round 22 to {len(prepared)} files. Original files backed up to .round22-backup/")
    print("Run ./gradlew :app:assembleDebug to test the next compile checkpoint.")
    return 0

if __name__ == "__main__":
    raise SystemExit(main())
