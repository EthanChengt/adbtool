#!/usr/bin/env python3
"""Round 26 compile repairs for the JADX-restored adbtool source tree.

Run AFTER Round22, Fix11, Round23, Round24 and Round25. All source anchors are
validated before any file is written; this script does not download or replace
project files.
"""
from pathlib import Path
import re
import sys

ROOT = Path(__file__).resolve().parent
changes = {}

def load(rel):
    p = ROOT / rel
    if not p.is_file():
        raise RuntimeError(f"required file missing: {rel}")
    return p.read_text(encoding="utf-8")

def one(s, old, new, rel, expected=1):
    n = s.count(old)
    if n != expected:
        raise RuntimeError(f"{rel}: expected {expected} occurrence(s), found {n}: {old[:140]!r}")
    return s.replace(old, new)

def at_least(s, old, new, rel, minimum=1):
    n = s.count(old)
    if n < minimum:
        raise RuntimeError(f"{rel}: expected at least {minimum} occurrence(s), found {n}: {old[:140]!r}")
    return s.replace(old, new)

def add_static_import(s, statement, rel):
    if statement in s:
        return s
    first = s.find("\n", s.find("package "))
    if first < 0:
        raise RuntimeError(f"{rel}: package declaration not found")
    return s[:first+1] + "\n" + statement + "\n" + s[first+1:]

def put(rel, s):
    changes[rel] = s

# 1) Round24's comparator regex matched the first compare() method (class b)
# and swallowed the actual SortComparator class. Restore both comparators.
rel = "app/src/main/java/c/c/a/v3/k0/C1054t.java"
s = load(rel)
start = "    /* JADX INFO: renamed from: c.c.a.v3.k0.t$b */"
end = "    /* JADX INFO: renamed from: c.c.a.v3.k0.t$d */"
i, j = s.find(start), s.find(end)
if i < 0 or j < 0 or j <= i:
    raise RuntimeError(f"{rel}: cannot locate comparator class boundaries")
replacement = '''    /* JADX INFO: renamed from: c.c.a.v3.k0.t$b */
    public class b implements Comparator<C1056v> {
        public final /* synthetic */ Collator f5235b;

        public b(C1054t c1054t, Collator collator) {
            this.f5235b = collator;
        }

        @Override // java.util.Comparator
        public int compare(C1056v left, C1056v right) {
            return this.f5235b.getCollationKey(left.f5254i)
                    .compareTo(this.f5235b.getCollationKey(right.f5254i));
        }
    }

    /* JADX INFO: renamed from: c.c.a.v3.k0.t$c */
    public class SortComparator implements Comparator<C1056v> {
        public final /* synthetic */ int f5236b;
        public final /* synthetic */ int f5237c;
        public final /* synthetic */ Collator f5238d;

        public SortComparator(C1054t c1054t, int i, int i2, Collator collator) {
            this.f5236b = i;
            this.f5237c = i2;
            this.f5238d = collator;
        }

        @Override // java.util.Comparator
        public int compare(C1056v left, C1056v right) {
            int comparison;
            switch (this.f5236b) {
                case 1:
                    comparison = this.f5238d.getCollationKey(left.f5254i)
                            .compareTo(this.f5238d.getCollationKey(right.f5254i));
                    break;
                case 2:
                    comparison = this.f5238d.getCollationKey(left.f5259n)
                            .compareTo(this.f5238d.getCollationKey(right.f5259n));
                    break;
                case 3:
                    comparison = this.f5238d.getCollationKey(left.f5252g + left.f5253h)
                            .compareTo(this.f5238d.getCollationKey(right.f5252g + right.f5253h));
                    break;
                case 4:
                    comparison = Float.compare(left.f5255j, right.f5255j);
                    break;
                default:
                    return 0;
            }
            return comparison * this.f5237c;
        }
    }

'''
s = s[:i] + replacement + s[j:]
put(rel, s)

# Keep a reference from the standalone RecyclerView adapter back to its host
# fragment. The three click listeners used invalid lexical C1054t.this links.
rel = "app/src/main/java/c/c/a/v3/k0/C1051q.java"
s = load(rel)
s = one(s, "    public boolean f5183e = false;",
        "    public boolean f5183e = false;\n\n    public C1054t f5184f;", rel)
s = one(s,
'''    public C1051q(List<C1056v> list, a aVar) {
        this.f5181c = list;
        this.f5182d = aVar;
    }''',
'''    public C1051q(List<C1056v> list, a aVar) {
        this(null, list, aVar);
    }

    public C1051q(C1054t parent, List<C1056v> list, a aVar) {
        this.f5184f = parent;
        this.f5181c = list;
        this.f5182d = aVar;
    }''', rel)
put(rel, s)

rel = "app/src/main/java/c/c/a/v3/k0/C1054t.java"
s = changes[rel]
s = one(s, "new C1051q(this.f5205X, new i())", "new C1051q(this, this.f5205X, new i())", rel)
put(rel, s)

listener_specs = [
    ("app/src/main/java/c/c/a/v3/k0/ViewOnLongClickListenerC1049o.java", "C1054t c1054t = C1054t.this;", "C1054t c1054t = this.f5178c.f5184f;"),
    ("app/src/main/java/c/c/a/v3/k0/ViewOnClickListenerC1048n.java", "final C1054t c1054t = C1054t.this;", "final C1054t c1054t = this.f5176c.f5184f;"),
    ("app/src/main/java/c/c/a/v3/k0/ViewOnClickListenerC1050p.java", "C1054t c1054t = C1054t.this;", "C1054t c1054t = this.f5180c.f5184f;"),
]
for rel, old, new in listener_specs:
    s = load(rel)
    s = one(s, old, new, rel)
    put(rel, s)

# 2) Correct Round25's misplaced vertical-offset implementation. The dialog
# popup (class b) already has its own method; class d must implement the method
# using C0268k0's inherited vertical-offset helper.
rel = "app/src/main/java/p006b/p008b/p018i/C0291w.java"
s = load(rel)
bad = '''        @Override // p006b.p008b.p018i.C0291w.f
        /* JADX INFO: renamed from: n */
        public void mo1147n(int i) {
            m1089a(i);
        }

'''
s = one(s, bad, "", rel)
anchor = '''        @Override // p006b.p008b.p018i.C0291w.f
        /* JADX INFO: renamed from: p */
        public void mo1148p(int i) {'''
insert = '''        @Override // p006b.p008b.p018i.C0291w.f
        /* JADX INFO: renamed from: n */
        public void mo1147n(int i) {
            m1089a(i);
        }

        @Override // p006b.p008b.p018i.C0291w.f
        /* JADX INFO: renamed from: p */
        public void mo1148p(int i) {'''
s = one(s, anchor, insert, rel)
s = one(s, "d dVar = C0291w.d.this;", "C0291w.d dVar = C0291w.d.this;", rel, expected=2)
put(rel, s)

# 3) Repair the duplicate @Override generated while inserting mo918l().
rel = "app/src/main/java/p080c/p126d/p127a/p128a/p148r/C1271h.java"
s = load(rel)
s, n = re.subn(r"(?m)^([ \t]*)@Override // p006b\.p008b\.p016h\.p017i\.InterfaceC0235m\n[ \t]*@Override // p006b\.p008b\.p016h\.p017i\.InterfaceC0235m\n([ \t]*public void mo918l\()", r"\1@Override // p006b.p008b.p016h.p017i.InterfaceC0235m\n\2", s, count=1)
if n != 1:
    raise RuntimeError(f"{rel}: duplicate mo918l @Override pair not found")
needle = "    /* JADX INFO: renamed from: g */\n    public void mo120g(Context context, C0229g c0229g) {"
if needle in s:
    s = one(s, needle, "    @Override // p006b.p008b.p016h.p017i.InterfaceC0235m\n" + needle, rel)
put(rel, s)

# 4) TextInputLayout's decompiled Parcelable.Creator and constructor.
rel = "app/src/main/java/com/google/android/material/textfield/TextInputLayout.java"
s = load(rel)
s = one(s, "public Object createFromParcel(Parcel parcel) {\n                return new C1383h(parcel, null);",
        "public C1383h createFromParcel(Parcel parcel) {\n                return new C1383h(parcel, null);", rel)
s = one(s, "public Object[] newArray(int i) {\n                return new C1383h[i];",
        "public C1383h[] newArray(int i) {\n                return new C1383h[i];", rel)
s = one(s, 'StringBuilder sbM2191e = a.m2191e("TextInputLayout.SavedState{");',
        'StringBuilder sbM2191e = new StringBuilder("TextInputLayout.SavedState{");', rel)
s = one(s,
'''    public TextInputLayout(Context context, AttributeSet attributeSet) {
        int i;
        int colorForState;
        super(C1277n.m2946d(context, attributeSet, R.attr.rh, R.style.pe), attributeSet, R.attr.rh);''',
'''    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(C1277n.m2946d(context, attributeSet, R.attr.rh, R.style.pe), attributeSet, R.attr.rh);
        int i;
        int colorForState;''', rel)
put(rel, s)

# 5) Make RecyclerView adapter method signatures agree with their declared VH.
rel = "app/src/main/java/com/didjdk/adbhelper/AppPickerActivity.java"
s = load(rel)
s = one(s, "public void mo537e(RecyclerView.AbstractC0129d0 abstractC0129d0, int i) {\n            C1313b c1313b = (C1313b) abstractC0129d0;",
        "public void mo537e(C1313b c1313b, int i) {", rel)
s = one(s, "public RecyclerView.AbstractC0129d0 mo538f(ViewGroup viewGroup, int i) {",
        "public C1313b mo538f(ViewGroup viewGroup, int i) {", rel)
s = add_static_import(s, "import static c.a.a.a.a.m2188b;", rel)
s = one(s, "a.m2188b(viewGroup, R.layout.bj, viewGroup, false)", "m2188b(viewGroup, R.layout.bj, viewGroup, false)", rel)
put(rel, s)

rel = "app/src/main/java/com/didjdk/adbhelper/FilePickerActivity.java"
s = load(rel)
s = one(s, "return (file.isDirectory() ? 0 : num).compareTo(file2.isDirectory() ? 0 : 1);",
        "return Integer.compare(file.isDirectory() ? 0 : 1, file2.isDirectory() ? 0 : 1);", rel)
s = one(s, "public void mo537e(RecyclerView.AbstractC0129d0 abstractC0129d0, int i) {",
        "public void mo537e(C1329g c1329g, int i) {", rel)
s = one(s, "            C1329g c1329g = (C1329g) abstractC0129d0;\n", "", rel)
s = one(s, "public RecyclerView.AbstractC0129d0 mo538f(ViewGroup viewGroup, int i) {",
        "public C1329g mo538f(ViewGroup viewGroup, int i) {", rel)
s = add_static_import(s, "import static c.a.a.a.a.m2188b;", rel)
s = one(s, "a.m2188b(viewGroup, R.layout.bp, viewGroup, false)", "m2188b(viewGroup, R.layout.bp, viewGroup, false)", rel)
s = one(s, "FilePickerActivity.C1328f c1328f = this.f4895b;",
        "FilePickerActivity.C1328f c1328f = FilePickerActivity.C1328f.this;", rel)
s = at_least(s, 'StringBuilder sbM2191e = a.m2191e("last_used_directory");',
        'StringBuilder sbM2191e = new StringBuilder("last_used_directory");', rel, minimum=2)
put(rel, s)

rel = "app/src/main/java/c/c/a/y3/c.java"
s = load(rel)
s = one(s, "public void mo537e(RecyclerView.AbstractC0129d0 abstractC0129d0, int i) {\n        final ViewHolder cVar = (ViewHolder) abstractC0129d0;",
        "public void mo537e(ViewHolder cVar, int i) {", rel)
s = one(s, "public RecyclerView.AbstractC0129d0 mo538f(ViewGroup viewGroup, int i) {",
        "public ViewHolder mo538f(ViewGroup viewGroup, int i) {", rel)
put(rel, s)

# 6) Anonymous callbacks emitted as separate-looking classes must reference
# their lexical enclosing instance through an explicit enclosing-type qualifier.
rel = "app/src/main/java/c/c/a/C0949n3.java"
s = load(rel)
s = one(s, "MainActivity.this.f6456H.f4837a.get(i)", "this.f4862a.f6456H.f4837a.get(i)", rel)
put(rel, s)

rel = "app/src/main/java/c/c/a/RunnableC0954o3.java"
s = load(rel)
s = one(s, "this.f4783b", "RunnableC0954o3.this", rel)
s = one(s, "this.f4799b", "RunnableC0954o3.this", rel)
put(rel, s)

rel = "app/src/main/java/c/c/a/v3/C1004h0.java"
s = load(rel)
for field in ("f5428b", "f5430b", "f5425b", "f4945b", "f4947b", "f5421b", "f5431b", "f5424b", "f5422b", "f5427a", "f4949a"):
    s = one(s, "this." + field, "C1004h0.this", rel)
put(rel, s)

rel = "app/src/main/java/c/c/a/p122w3/C1127h.java"
s = load(rel)
s = one(s, "                    C1127h.a aVar = this.f5437b;\n", "", rel)
s = one(s, "this.f5443b", "c1127h", rel)
s = one(s, "this.f5445b", "C1127h.this", rel)
s = one(s, "this.f5441b", "C1127h.this", rel)
put(rel, s)

# 7) Helper calls in these files are shadowed by nested types named a or c.
# Direct StringBuilder/string expressions preserve the actual helper behavior.
rel = "app/src/main/java/p080c/p084b/p085a/p088m/p091u/p093d0/C0698j.java"
s = load(rel)
s = s.replace('c.a.a.a.a.m2191e("Calculation complete, Calculated memory cache size: ")',
              'new StringBuilder("Calculation complete, Calculated memory cache size: ")')
s = s.replace('a.m2191e("Calculation complete, Calculated memory cache size: ")',
              'new StringBuilder("Calculation complete, Calculated memory cache size: ")')
if 'c.a.a.a.a.m2191e("Calculation complete, Calculated memory cache size: ")' in s:
    raise RuntimeError(f"{rel}: shadowed helper call remains")
put(rel, s)

rel = "app/src/main/java/p080c/p084b/p085a/p088m/p091u/RunnableC0705i.java"
s = load(rel)
s = s.replace("c.a.a.a.a.m2191e(", "new StringBuilder(").replace("a.m2191e(", "new StringBuilder(")
s = s.replace('c.a.a.a.a.m2201o(", ", str2)', '", " + str2')
s = s.replace('a.m2201o(", ", str2)', '", " + str2')
if "c.a.a.a.a.m2191e(" in s or "c.a.a.a.a.m2201o(" in s:
    raise RuntimeError(f"{rel}: helper-shadowing reference remains")
put(rel, s)

rel = "app/src/main/java/p080c/p084b/p085a/p111s/p112k/C0876a.java"
s = load(rel)
s = s.replace("c.a.a.a.a.m2191e(", "new StringBuilder(").replace("a.m2191e(", "new StringBuilder(")
put(rel, s)

# 8) Static helper imports avoid the inherited/inner class named 'a'.
rel = "app/src/main/java/com/didjdk/adbhelper/RemoteActivity.java"
s = load(rel)
for method in ("q", "m2191e", "m2193g", "m2194h", "m2203q"):
    s = add_static_import(s, f"import static c.a.a.a.a.{method};", rel)
for method in ("q", "m2191e", "m2193g", "m2194h", "m2203q"):
    s = s.replace(f"a.{method}(", f"{method}(")
s = one(s, "import c.c.a.q3;", "import c.c.a.q3;\nimport c.c.a.RunnableC0954o3;", rel)
s = s.replace("this.f4878a", "RemoteActivity.this")
s = s.replace("this.f4848a", "RemoteActivity.this")
s = s.replace("this.f4865b", "RemoteActivity.this")
# Keep the concrete Glide request type when invoking its ImageView target method.
old_chain = 'c0622hM2545d.m2552l(C0800i.f4549b, Boolean.TRUE).m2549i(remoteActivity.f10067U.getDrawable()).m2226x(remoteActivity.f10067U);'
new_chain = 'c0622hM2545d.m2552l(C0800i.f4549b, Boolean.TRUE).m2549i(remoteActivity.f10067U.getDrawable());\n                    c0622hM2545d.m2226x(remoteActivity.f10067U);'
s = one(s, old_chain, new_chain, rel)
put(rel, s)

rel = "app/src/main/java/com/didjdk/adbhelper/FastbootActivity.java"
s = load(rel)
s = add_static_import(s, "import static c.a.a.a.a.q;", rel)
s = one(s, "a.q()", "q()", rel, expected=2)
put(rel, s)

rel = "app/src/main/java/com/didjdk/adbhelper/SettingsActivity.java"
s = load(rel)
s = add_static_import(s, "import static c.a.a.a.a.m2202p;", rel)
s = one(s, "a.m2202p(", "m2202p(", rel)
put(rel, s)

# r.java has a nested class named a; import q() statically rather than
# resolving a.q() to that nested class.
rel = "app/src/main/java/c/c/a/v3/i0/r.java"
s = load(rel)
s = add_static_import(s, "import static c.a.a.a.a.q;", rel)
s = at_least(s, "a.q()", "q()", rel, minimum=4)
put(rel, s)

# 9) Keep PreferenceGroup's generic API but correct its unchecked casts.
rel = "app/src/main/java/androidx/preference/PreferenceGroup.java"
s = load(rel)
old_method = '''    public <T extends Preference> T m393H(CharSequence charSequence) {
        T t;
        if (charSequence == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        if (TextUtils.equals(this.f793l, charSequence)) {
            return this;
        }
        int iM395J = m395J();
        for (int i = 0; i < iM395J; i++) {
            PreferenceGroup preferenceGroup = (T) m394I(i);
            if (TextUtils.equals(preferenceGroup.f793l, charSequence)) {
                return preferenceGroup;
            }
            if ((preferenceGroup instanceof PreferenceGroup) && (t = (T) preferenceGroup.m393H(charSequence)) != null) {
                return t;
            }
        }
        return null;
    }'''
new_method = '''    @SuppressWarnings("unchecked")
    public <T extends Preference> T m393H(CharSequence charSequence) {
        if (charSequence == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        if (TextUtils.equals(this.f793l, charSequence)) {
            return (T) this;
        }
        int count = m395J();
        for (int i = 0; i < count; i++) {
            Preference preference = m394I(i);
            if (TextUtils.equals(preference.f793l, charSequence)) {
                return (T) preference;
            }
            if (preference instanceof PreferenceGroup) {
                T nested = ((PreferenceGroup) preference).m393H(charSequence);
                if (nested != null) {
                    return nested;
                }
            }
        }
        return null;
    }'''
s = one(s, old_method, new_method, rel)
put(rel, s)

# 10) Glide helper shadowing and Property<View,Float> generic narrowing.
rel = "app/src/main/java/p080c/p126d/p127a/p128a/p130b0/C1179o.java"
s = load(rel)
s = one(s, "(Property<TextView, Float>) View.ALPHA", "(Property) View.ALPHA", rel)
s = one(s, "(Property<TextView, Float>) View.TRANSLATION_Y", "(Property) View.TRANSLATION_Y", rel)
put(rel, s)

# 11) Missing IDs referenced by programmatic Material views. Adding ID resources
# makes these references compile; jy remains an optional lookup and is null when
# no content child carries that ID.
rel = "app/src/main/res/values/ids.xml"
s = load(rel)
for name in ("p5", "p6", "p7", "jy"):
    item = f'    <item name="{name}" type="id" />\n'
    if f'name="{name}"' not in s:
        s = one(s, "</resources>", item + "</resources>", rel)
put(rel, s)

# Atomic write: all anchors validated before any source file is changed.
for rel, content in changes.items():
    (ROOT / rel).write_text(content, encoding="utf-8")

print(f"Round 26 patch applied to {len(changes)} files.")
print("Next: run :app:compileDebugJavaWithJavac and inspect remaining diagnostics.")
