#!/usr/bin/env python3
"""Round 31 Java compile repairs for adbtool.

Run after Round22--Round30 scripts:
    python3 round31_java_compile_fix1.py --check-only .
    python3 round31_java_compile_fix1.py .

All edits are validated in memory before any file is written. Backups are stored
outside Android resource directories in .round31-backup/.
"""
from __future__ import annotations

import argparse
import shutil
import sys
from pathlib import Path


class PatchError(RuntimeError):
    pass


def replace_once(text: str, old: str, new: str, label: str) -> str:
    count = text.count(old)
    if count != 1:
        raise PatchError(f"{label}: expected exactly 1 anchor, found {count}")
    return text.replace(old, new, 1)


def replace_all(text: str, old: str, new: str, expected: int, label: str) -> str:
    count = text.count(old)
    if count != expected:
        raise PatchError(f"{label}: expected {expected} anchor(s), found {count}")
    return text.replace(old, new)


def patch(root: Path) -> dict[Path, str]:
    pending: dict[Path, str] = {}

    def edit(rel: str, transform) -> None:
        path = root / rel
        if not path.is_file():
            raise PatchError(f"missing source file: {rel}")
        original = pending.get(path)
        if original is None:
            original = path.read_text(encoding="utf-8")
        updated = transform(original)
        if updated != original:
            pending[path] = updated

    # 1. Definite local-variable initialization defects in CoordinatorLayout.
    p = "app/src/main/java/androidx/coordinatorlayout/widget/CoordinatorLayout.java"
    def coordinator(s: str) -> str:
        s = replace_once(s, "        int iMax;\n", "        int iMax = 0;\n", "CoordinatorLayout iMax initialization")
        s = replace_once(s, "        boolean zMo163A;\n", "        boolean zMo163A = false;\n", "CoordinatorLayout touch result initialization")
        return s
    edit(p, coordinator)

    # 2. AppCompat spinner popup implementation omitted one interface method.
    p = "app/src/main/java/p006b/p008b/p018i/C0291w.java"
    def spinner(s: str) -> str:
        anchor = """            this.f1915r = new a(C0291w.this);\n        }\n\n        @Override // p006b.p008b.p018i.C0291w.f\n        /* JADX INFO: renamed from: c */\n        public int mo1140c() {\n            return this.f2041H;\n        }"""
        replacement = """            this.f1915r = new a(C0291w.this);\n        }\n\n        @Override // p006b.p008b.p018i.C0291w.f\n        public boolean mo1139b() {\n            return mo921b();\n        }\n\n        @Override // p006b.p008b.p018i.C0291w.f\n        /* JADX INFO: renamed from: c */\n        public int mo1140c() {\n            return this.f2041H;\n        }"""
        return replace_once(s, anchor, replacement, "C0291w popup visibility method")
    edit(p, spinner)

    # 3. Decompiled break statements outside a loop, and checked exception mismatch.
    p = "app/src/main/java/p006b/p008b/p009c/LayoutInflaterFactory2C0197m.java"
    def inflater(s: str) -> str:
        s = replace_once(s, "public void mo800d(Context context) throws IllegalAccessException {", "public void mo800d(Context context) {", "AppCompat delegate override throws clause")
        s = replace_once(s, "            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {\n                z2 = true;\n                break;\n            }", "            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {\n                z2 = true;\n            }", "LayoutInflaterFactory2C0197m illegal break")
        return s
    edit(p, inflater)

    p = "app/src/main/java/p080c/p126d/p127a/p128a/p148r/C1277n.java"
    def c1277n(s: str) -> str:
        return replace_once(s, "        } else if (typedArrayObtainStyledAttributes.getResourceId(0, -1) != -1) {\n            z = true;\n            break;\n        }", "        } else if (typedArrayObtainStyledAttributes.getResourceId(0, -1) != -1) {\n            z = true;\n        }", "C1277n illegal break")
    edit(p, c1277n)

    # 4. Java requires explicit super(...) to be the first constructor statement.
    p = "app/src/main/java/androidx/appcompat/widget/ActionBarContextView.java"
    edit(p, lambda s: replace_once(s, "    public ActionBarContextView(Context context, AttributeSet attributeSet) {\n        int resourceId;\n        super(context, attributeSet, R.attr.a1);", "    public ActionBarContextView(Context context, AttributeSet attributeSet) {\n        super(context, attributeSet, R.attr.a1);\n        int resourceId;", "ActionBarContextView constructor order"))

    p = "app/src/main/java/androidx/appcompat/view/menu/ExpandedMenuView.java"
    edit(p, lambda s: replace_once(s, "    public ExpandedMenuView(Context context, AttributeSet attributeSet) {\n        int resourceId;\n        int resourceId2;\n        super(context, attributeSet);", "    public ExpandedMenuView(Context context, AttributeSet attributeSet) {\n        super(context, attributeSet);\n        int resourceId;\n        int resourceId2;", "ExpandedMenuView constructor order"))

    p = "app/src/main/java/androidx/cardview/widget/CardView.java"
    edit(p, lambda s: replace_once(s, "    public CardView(Context context, AttributeSet attributeSet) {\n        Resources resources;\n        int i;\n        ColorStateList colorStateListValueOf;\n        super(context, attributeSet, com.didjdk.adbhelper.R.attr.ci);", "    public CardView(Context context, AttributeSet attributeSet) {\n        super(context, attributeSet, com.didjdk.adbhelper.R.attr.ci);\n        Resources resources;\n        int i;\n        ColorStateList colorStateListValueOf;", "CardView constructor order"))

    pref_specs = [
        ("app/src/main/java/androidx/preference/MultiSelectListPreference.java",
         "C0369g.m1474a(context, R.attr.fk, android.R.attr.dialogPreferenceStyle)", "MultiSelectListPreference"),
        ("app/src/main/java/androidx/preference/SwitchPreference.java",
         "C0369g.m1474a(context, R.attr.py, android.R.attr.switchPreferenceStyle)", "SwitchPreference"),
        ("app/src/main/java/androidx/preference/CheckBoxPreference.java",
         "C0369g.m1474a(context, R.attr.ck, android.R.attr.checkBoxPreferenceStyle)", "CheckBoxPreference"),
    ]
    for rel, expr, label in pref_specs:
        def pref(s: str, expr=expr, label=label) -> str:
            old = f"        int iM1474a = {expr};\n        super(context, attributeSet, iM1474a, 0);"
            new = f"        super(context, attributeSet, {expr}, 0);\n        int iM1474a = {expr};"
            return replace_once(s, old, new, f"{label} constructor order")
        edit(rel, pref)

    p = "app/src/main/java/androidx/appcompat/widget/ActivityChooserView$InnerLayout.java"
    edit(p, lambda s: replace_once(s, "    public ActivityChooserView$InnerLayout(Context context, AttributeSet attributeSet) {\n        int resourceId;\n        super(context, attributeSet);", "    public ActivityChooserView$InnerLayout(Context context, AttributeSet attributeSet) {\n        super(context, attributeSet);\n        int resourceId;", "ActivityChooserView inner layout constructor"))

    p = "app/src/main/java/androidx/appcompat/widget/SwitchCompat.java"
    edit(p, lambda s: replace_once(s, "    public SwitchCompat(Context context, AttributeSet attributeSet) {\n        Typeface typeface;\n        int resourceId;\n        super(context, attributeSet, com.didjdk.adbhelper.R.attr.pz);", "    public SwitchCompat(Context context, AttributeSet attributeSet) {\n        super(context, attributeSet, com.didjdk.adbhelper.R.attr.pz);\n        Typeface typeface;\n        int resourceId;", "SwitchCompat constructor order"))

    # 5. Correct helper references shadowed by decompiler-generated nested class 'a'.
    helper_replacements = {
        "app/src/main/java/p006b/p008b/p009c/C0207w.java": [("a.m2191e(", "c.a.a.a.a.m2191e(")],
        "app/src/main/java/p006b/p008b/p016h/C0220f.java": [("a.m2201o(", "c.a.a.a.a.m2201o(")],
        "app/src/main/java/p006b/p073w/AbstractC0584i.java": [("a.m2191e(", "c.a.a.a.a.m2191e("), ("a.m2201o(", "c.a.a.a.a.m2201o(")],
        "app/src/main/java/p006b/p073w/C0590o.java": [("a.m2198l(", "c.a.a.a.a.m2198l(")],
        "app/src/main/java/androidx/recyclerview/widget/LinearLayoutManager.java": [("a.m2191e(", "c.a.a.a.a.m2191e("), ("a.m2198l(", "c.a.a.a.a.m2198l(")],
        "app/src/main/java/androidx/recyclerview/widget/GridLayoutManager.java": [("a.m2198l(", "c.a.a.a.a.m2198l(")],
        "app/src/main/java/androidx/recyclerview/widget/StaggeredGridLayoutManager.java": [("a.m2191e(", "c.a.a.a.a.m2191e(")],
        "app/src/main/java/p080c/p126d/p127a/p128a/p156z/C1309a.java": [("a.m2191e(", "c.a.a.a.a.m2191e(")],
        "app/src/main/java/p080c/p084b/p085a/p086k/C0625a.java": [("a.m2191e(", "c.a.a.a.a.m2191e("), ("a.m2201o(", "c.a.a.a.a.m2201o(")],
        "app/src/main/java/p080c/p084b/p085a/p104n/C0813e.java": [("a.m2191e(", "c.a.a.a.a.m2191e(")],
    }
    for rel, pairs in helper_replacements.items():
        def helpers(s: str, pairs=pairs, rel=rel) -> str:
            for old, new in pairs:
                count = s.count(old)
                if count < 1:
                    raise PatchError(f"{rel}: missing helper call {old!r}")
                s = s.replace(old, new)
            return s
        edit(rel, helpers)

    # 6. Menu inflater integer attribute was accidentally read as Boolean.
    p = "app/src/main/java/p006b/p008b/p016h/C0220f.java"
    edit(p, lambda s: replace_once(s, "c0294x0M1151p.m1167o(11) ? c0294x0M1151p.m1153a(11, false) : bVar.f1519e", "c0294x0M1151p.m1167o(11) ? c0294x0M1151p.m1162j(11, bVar.f1519e) : bVar.f1519e", "MenuInflater showAsAction integer attribute"))

    # 7. Missing transition tag IDs referenced by decompiled support/material code.
    p = "app/src/main/res/values/ids.xml"
    def ids(s: str) -> str:
        missing = [name for name in ("m5", "pk", "jz") if f'name="{name}"' not in s]
        if not missing:
            return s
        if "</resources>" not in s:
            raise PatchError("ids.xml: </resources> anchor missing")
        entries = "".join(f'    <item name="{name}" type="id" />\n' for name in missing)
        return s.replace("</resources>", entries + "</resources>", 1)
    edit(p, ids)

    # 8. Missing no-op transition listener callback and generic Property signature.
    p = "app/src/main/java/p006b/p073w/C0587l.java"
    edit(p, lambda s: replace_once(s, "    @Override // p006b.p073w.AbstractC0584i.d\n    /* JADX INFO: renamed from: d */\n    public void mo2093d(AbstractC0584i abstractC0584i) {\n    }\n}", "    @Override // p006b.p073w.AbstractC0584i.d\n    /* JADX INFO: renamed from: d */\n    public void mo2093d(AbstractC0584i abstractC0584i) {\n    }\n\n    @Override // p006b.p073w.AbstractC0584i.d\n    public void mo2087e(AbstractC0584i abstractC0584i) {\n    }\n}", "C0587l missing listener callback"))

    p = "app/src/main/java/p006b/p073w/C0581f.java"
    edit(p, lambda s: replace_once(s, "    public void set(Object obj, Float f) {", "    public void set(T obj, Float f) {", "C0581f generic Property setter"))

    # 9. Reconstruct non-enclosing owner references through the actual callback owner.
    p = "app/src/main/java/p006b/p008b/p016h/p017i/MenuItemC0232j.java"
    def menu_item(s: str) -> str:
        old = """                C0229g c0229g = C0231i.this.f1674n;\n                c0229g.f1637h = true;\n                c0229g.mo957q(true);"""
        new = """                if (MenuItemC0232j.this.f1688d instanceof C0231i) {\n                    C0229g c0229g = ((C0231i) MenuItemC0232j.this.f1688d).f1674n;\n                    c0229g.f1637h = true;\n                    c0229g.mo957q(true);\n                }"""
        return replace_once(s, old, new, "MenuItem action-provider owner reference")
    edit(p, menu_item)

    # 10. Repair invalid decompiler outer-this access in Material date picker callback.
    p = "app/src/main/java/p080c/p126d/p127a/p128a/p143m/C1231g.java"
    def date_picker_owner(s: str) -> str:
        old = """    public class d implements f {\n        public d() {\n        }\n    }"""
        new = """    public class d implements f {\n        public d() {\n        }\n\n        public void dispatchSelection(long selection) {\n            if (C1231g.this.f5889Y.f5856e.mo2845e(selection)) {\n                C1231g.this.f5888X.m2854g(selection);\n                java.util.Iterator it = C1231g.this.f5961V.iterator();\n                while (it.hasNext()) {\n                    ((InterfaceC1247w) it.next()).mo2866a(C1231g.this.f5888X.m2849a());\n                }\n                C1231g.this.f5894d0.getAdapter().f947a.m542b();\n                RecyclerView recyclerView = C1231g.this.f5893c0;\n                if (recyclerView != null) {\n                    recyclerView.getAdapter().f947a.m542b();\n                }\n            }\n        }\n    }"""
        return replace_once(s, old, new, "C1231g selection callback bridge")
    edit(p, date_picker_owner)

    p = "app/src/main/java/p080c/p126d/p127a/p128a/p143m/C1245u.java"
    def date_picker_listener(s: str) -> str:
        old = """            C1231g.d dVar = (C1231g.d) fVar;\n            if (C1231g.this.f5889Y.f5856e.mo2845e(jLongValue)) {\n                C1231g.this.f5888X.m2854g(jLongValue);\n                Iterator it = C1231g.this.f5961V.iterator();\n                while (it.hasNext()) {\n                    ((InterfaceC1247w) it.next()).mo2866a(C1231g.this.f5888X.m2849a());\n                }\n                C1231g.this.f5894d0.getAdapter().f947a.m542b();\n                RecyclerView recyclerView = C1231g.this.f5893c0;\n                if (recyclerView != null) {\n                    recyclerView.getAdapter().f947a.m542b();\n                }\n            }"""
        new = """            C1231g.d dVar = (C1231g.d) fVar;\n            dVar.dispatchSelection(jLongValue);"""
        return replace_once(s, old, new, "C1245u invalid outer-this callback")
    edit(p, date_picker_listener)

    # 11. RecyclerView adapter generic ViewHolder signatures and shadowed helper.
    p = "app/src/main/java/p080c/p126d/p127a/p128a/p143m/C1246v.java"
    def adapter_v(s: str) -> str:
        s = replace_once(s, "extends RecyclerView.AbstractC0132g<a>", "extends RecyclerView.AbstractC0132g<C1246v.a>", "C1246v ViewHolder generic")
        s = replace_once(s, "public void mo537e(RecyclerView.AbstractC0129d0 abstractC0129d0, int i)", "public void mo537e(C1246v.a abstractC0129d0, int i)", "C1246v bind signature")
        s = replace_once(s, "public RecyclerView.AbstractC0129d0 mo538f(ViewGroup viewGroup, int i)", "public C1246v.a mo538f(ViewGroup viewGroup, int i)", "C1246v create signature")
        s = replace_once(s, "a.m2188b(viewGroup, R.layout.c_, viewGroup, false)", "c.a.a.a.a.m2188b(viewGroup, R.layout.c_, viewGroup, false)", "C1246v inflater helper")
        return s
    edit(p, adapter_v)

    p = "app/src/main/java/p080c/p126d/p127a/p128a/p143m/C1225a0.java"
    def adapter_a0(s: str) -> str:
        s = replace_once(s, "extends RecyclerView.AbstractC0132g<a>", "extends RecyclerView.AbstractC0132g<C1225a0.a>", "C1225a0 ViewHolder generic")
        s = replace_once(s, "public void mo537e(RecyclerView.AbstractC0129d0 abstractC0129d0, int i)", "public void mo537e(C1225a0.a abstractC0129d0, int i)", "C1225a0 bind signature")
        s = replace_once(s, "public RecyclerView.AbstractC0129d0 mo538f(ViewGroup viewGroup, int i)", "public C1225a0.a mo538f(ViewGroup viewGroup, int i)", "C1225a0 create signature")
        s = replace_once(s, "a.m2188b(viewGroup, R.layout.cd, viewGroup, false)", "c.a.a.a.a.m2188b(viewGroup, R.layout.cd, viewGroup, false)", "C1225a0 inflater helper")
        return s
    edit(p, adapter_a0)

    # 12. Material FAB implementation: use the actual contained view, not an invalid outer-this.
    p = "app/src/main/java/p080c/p126d/p127a/p128a/p147q/C1262h.java"
    def fab(s: str) -> str:
        s = replace_all(s, "FloatingActionButton.this.f10288m", "this.f6037y.getUseCompatPadding()", 2, "C1262h compat-padding owner")
        s = replace_all(s, "(Property<FloatingActionButton, Float>) View.TRANSLATION_Z", '"translationZ"', 3, "C1262h translation property generic")
        return s
    edit(p, fab)

    # 13. Small Java type and access corrections.
    p = "app/src/main/java/p080c/p126d/p127a/p128a/C1161a.java"
    edit(p, lambda s: replace_once(s, "(Property<InterfaceC1222d, V>) InterfaceC1222d.c.f5848a", "(Property<InterfaceC1222d, InterfaceC1222d.e>) InterfaceC1222d.c.f5848a", "C1161a circular reveal property type"))

    p = "app/src/main/java/p080c/p084b/p085a/p086k/C0625a.java"
    def disk_cache(s: str) -> str:
        return replace_once(s, "                while (i < c0625a.f3840h) {", "                for (int i = 0; i < c0625a.f3840h; i++) {", "C0625a missing journal loop index")
    edit(p, disk_cache)

    p = "app/src/main/java/p080c/p084b/p085a/p086k/C0626b.java"
    def line_reader(s: str) -> str:
        s = replace_once(s, "int i = ((ByteArrayOutputStream) this).count;", "int i = this.count;", "C0626b protected count access")
        s = replace_all(s, "((ByteArrayOutputStream) this).buf", "this.buf", 2, "C0626b protected buffer access")
        return s
    edit(p, line_reader)

    p = "app/src/main/java/p080c/p084b/p085a/p087l/C0632e.java"
    def lzw(s: str) -> str:
        s = replace_once(s, "                            s = i35;", "                            s = (short) i35;", "C0632e short index assignment 1")
        s = replace_once(s, "                            s = i48;", "                            s = (short) i48;", "C0632e short index assignment 2")
        return s
    edit(p, lzw)

    # 13b. Move the Glide manager lock operation back to its actual enclosing owner.
    # The connectivity monitor is not lexically nested in ComponentCallbacks2C0623i,
    # so it delegates the synchronized cleanup to the manager's inner callback.
    p = "app/src/main/java/p080c/p084b/p085a/ComponentCallbacks2C0623i.java"
    def glide_manager(s: str) -> str:
        anchor = """        public b(C0826r c0826r) {
            this.f3832a = c0826r;
        }
    }"""
        replacement = """        public b(C0826r c0826r) {
            this.f3832a = c0826r;
        }

        public void clearInactiveRequests() {
            synchronized (ComponentCallbacks2C0623i.this) {
                C0826r c0826r = this.f3832a;
                for (InterfaceC0843c interfaceC0843c : (ArrayList) C0875j.m2613e(c0826r.f4587a)) {
                    if (!interfaceC0843c.mo2566i() && !interfaceC0843c.mo2567j()) {
                        interfaceC0843c.clear();
                        if (c0826r.f4589c) {
                            c0826r.f4588b.add(interfaceC0843c);
                        } else {
                            interfaceC0843c.mo2563f();
                        }
                    }
                }
            }
        }
    }"""
        return replace_once(s, anchor, replacement, "Glide manager connectivity callback bridge")
    edit(p, glide_manager)

    p = "app/src/main/java/p080c/p084b/p085a/p104n/C0813e.java"
    def glide_monitor(s: str) -> str:
        old = """                    synchronized (ComponentCallbacks2C0623i.this) {
                        C0826r c0826r = bVar.f3832a;
                        for (InterfaceC0843c interfaceC0843c : (ArrayList) C0875j.m2613e(c0826r.f4587a)) {
                            if (!interfaceC0843c.mo2566i() && !interfaceC0843c.mo2567j()) {
                                interfaceC0843c.clear();
                                if (c0826r.f4589c) {
                                    c0826r.f4588b.add(interfaceC0843c);
                                } else {
                                    interfaceC0843c.mo2563f();
                                }
                            }
                        }
                    }"""
        return replace_once(s, old, "                    bVar.clearInactiveRequests();", "Glide monitor invalid outer-this synchronization")
    edit(p, glide_monitor)

    # 14. Preference callback was decompiled with the erased superclass type.
    p = "app/src/main/java/androidx/preference/ListPreference.java"
    def list_pref(s: str) -> str:
        s = replace_once(s, "public CharSequence mo363a(Preference preference) {\n            ListPreference listPreference = (ListPreference) preference;", "public CharSequence mo363a(ListPreference listPreference) {", "ListPreference generic callback parameter")
        return s
    edit(p, list_pref)

    # DialogTitle: android.R.style uses the flattened constant name, not a nested type.
    p = "app/src/main/java/androidx/appcompat/widget/DialogTitle.java"
    edit(p, lambda s: replace_once(s, "R.style.TextAppearance.Medium", "R.style.TextAppearance_Medium", "DialogTitle Android style constant"))

    # 15. Transition helpers use View IDs added above; fix ViewGroup's measured dimension call.
    for rel in ("app/src/main/java/androidx/recyclerview/widget/GridLayoutManager.java",
                "app/src/main/java/androidx/recyclerview/widget/StaggeredGridLayoutManager.java"):
        edit(rel, lambda s, rel=rel: replace_once(s, "this.f959b.setMeasuredDimension(iM562h, iM562h2);", "setMeasuredDimension(iM562h, iM562h2);", f"{rel} LayoutManager measured dimension"))

    p = "app/src/main/java/androidx/recyclerview/widget/StaggeredGridLayoutManager.java"
    edit(p, lambda s: replace_once(s, "RecyclerView.AbstractC0140o.m563z(this.f1035w, this.f971n, r2, ((ViewGroup.MarginLayoutParams) c0154c).width, r2)", "RecyclerView.AbstractC0140o.m563z(this.f1035w, this.f971n, r2, ((ViewGroup.MarginLayoutParams) c0154c).width, false)", "StaggeredGridLayoutManager horizontal child measure flag"))

    # 16. Correct custom View/FrameLayout subclasses that had no Context constructor.
    p = "app/src/main/java/p080c/p126d/p127a/p128a/p138i/C1215a.java"
    def card_checkable(s: str) -> str:
        s = replace_once(s, "import android.R;", "import android.R;\nimport android.content.Context;\nimport android.util.AttributeSet;", "C1215a constructor imports")
        anchor = """    public interface a {\n    }\n\n    @Override // androidx.cardview.widget.CardView"""
        replacement = """    public interface a {\n    }\n\n    public C1215a(Context context) {\n        this(context, null);\n    }\n\n    public C1215a(Context context, AttributeSet attributeSet) {\n        super(context, attributeSet);\n    }\n\n    @Override // androidx.cardview.widget.CardView"""
        return replace_once(s, anchor, replacement, "C1215a Context constructors")
    edit(p, card_checkable)

    p = "app/src/main/java/p080c/p126d/p127a/p128a/p141l/C1220b.java"
    def frame_layout(s: str) -> str:
        s = replace_once(s, "import android.annotation.SuppressLint;", "import android.annotation.SuppressLint;\nimport android.content.Context;\nimport android.util.AttributeSet;", "C1220b constructor imports")
        return replace_once(s, "public class C1220b extends FrameLayout implements InterfaceC1222d {", "public class C1220b extends FrameLayout implements InterfaceC1222d {\n    public C1220b(Context context) {\n        super(context);\n    }\n\n    public C1220b(Context context, AttributeSet attributeSet) {\n        super(context, attributeSet);\n    }", "C1220b FrameLayout constructors")
    edit(p, frame_layout)

    p = "app/src/main/java/p080c/p126d/p127a/p128a/p129a0/C1162a.java"
    def simple_view(s: str) -> str:
        s = replace_once(s, "import android.view.View;", "import android.view.View;\nimport android.content.Context;\nimport android.util.AttributeSet;", "C1162a constructor imports")
        return replace_once(s, "public class C1162a extends View {\n}", "public class C1162a extends View {\n    public C1162a(Context context) {\n        super(context);\n    }\n\n    public C1162a(Context context, AttributeSet attributeSet) {\n        super(context, attributeSet);\n    }\n}", "C1162a View constructors")
    edit(p, simple_view)

    # 17. Parcelable.Creator methods must return the concrete generic type.
    p = "app/src/main/java/p080c/p126d/p127a/p128a/p156z/C1309a.java"
    def parcel_saved_state(s: str) -> str:
        s = replace_once(s, "public Object createFromParcel(Parcel parcel) {", "public C1309a createFromParcel(Parcel parcel) {", "C1309a Creator return type")
        s = replace_once(s, "public Object[] newArray(int i) {", "public C1309a[] newArray(int i) {", "C1309a Creator array type")
        return s
    edit(p, parcel_saved_state)

    p = "app/src/main/java/p080c/p126d/p127a/p128a/p148r/C1273j.java"
    def parcel_sparse(s: str) -> str:
        s = replace_once(s, "public Object createFromParcel(Parcel parcel) {", "public C1273j createFromParcel(Parcel parcel) {", "C1273j Creator return type")
        s = replace_once(s, "public Object[] newArray(int i) {", "public C1273j[] newArray(int i) {", "C1273j Creator array type")
        return s
    edit(p, parcel_sparse)

    return pending


def main() -> int:
    parser = argparse.ArgumentParser(description="Apply Round31 Java compile fixes")
    parser.add_argument("root", nargs="?", default=".", help="repository root")
    parser.add_argument("--check-only", action="store_true", help="validate anchors without writing")
    args = parser.parse_args()
    root = Path(args.root).resolve()
    try:
        changes = patch(root)
    except Exception as exc:
        print(f"Round31 validation failed; no files were written: {exc}", file=sys.stderr)
        return 2

    print(f"Round31 validation passed: {len(changes)} file(s) ready; no source was modified during validation.")
    if args.check_only:
        return 0
    if not changes:
        print("No changes required.")
        return 0

    backup_root = root / ".round31-backup"
    try:
        for path, content in changes.items():
            rel = path.relative_to(root)
            backup = backup_root / rel
            backup.parent.mkdir(parents=True, exist_ok=True)
            shutil.copy2(path, backup)
        for path, content in changes.items():
            temp = path.with_suffix(path.suffix + ".round31.tmp")
            temp.write_text(content, encoding="utf-8", newline="")
            temp.replace(path)
    except Exception as exc:
        print(f"Round31 write failed: {exc}", file=sys.stderr)
        return 3

    print(f"Applied Round31 to {len(changes)} file(s). Backups: .round31-backup/")
    print("Next: run ./gradlew :app:assembleDebug and upload compiler logs if another checkpoint fails.")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
