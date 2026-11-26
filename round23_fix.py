#!/usr/bin/env python3
"""Round 23 compile repairs for EthanChengt/adbtool. Run from repo root."""
from pathlib import Path
ROOT = Path(__file__).resolve().parent
PENDING = {}

def read(rel):
    p = ROOT / rel
    if not p.is_file():
        raise SystemExit(f"Missing file: {rel}")
    return p.read_text(encoding="utf-8")

def once(s, old, new, label):
    n = s.count(old)
    if n != 1:
        raise SystemExit(f"{label}: expected 1 anchor, found {n}; no files written")
    return s.replace(old, new, 1)

def stage(rel, s):
    PENDING[rel] = s

# Binder RemoteException declaration.
p = "app/src/main/java/p000a/p001a/p002a/p005b/C0002b.java"
s = read(p)
s = once(s, "public boolean onTransact(int code, Parcel data, Parcel reply, int flags) {", "public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws android.os.RemoteException {", "C0002b onTransact")
stage(p, s)

# Nested interface a hides the imported helper class.
p = "app/src/main/java/c/c/a/v3/k0/C1051q.java"
s = read(p)
s = once(s, "new b(a.m2188b(viewGroup, R.layout.bp, viewGroup, false))", "new b(c.a.a.a.a.m2188b(viewGroup, R.layout.bp, viewGroup, false))", "C1051q inflater helper")
stage(p, s)

# Catch variables have independent scopes.
p = "app/src/main/java/p006b/p032h/p034c/p035b/C0369g.java"
s = read(p)
s = once(s, "} catch (IOException e) {\n                    e = e;", "} catch (IOException e) {", "C0369g IOException catch")
s = once(s, "} catch (XmlPullParserException e2) {\n                    e = e2;", "} catch (XmlPullParserException e2) {", "C0369g XML catch")
s = once(s, 'str = "Failed to parse xml resource ";\n                    sb.append(str);\n                    sb.append(string);\n                    Log.e("ResourcesCompat", sb.toString(), e);', 'str = "Failed to parse xml resource ";\n                    sb.append(str);\n                    sb.append(string);\n                    Log.e("ResourcesCompat", sb.toString(), e2);', "C0369g XML logger")
stage(p, s)

# Fragment subtype and typed lists.
p = "app/src/main/java/p006b/p056m/p057b/C0477n.java"
s = read(p)
s = once(s, "return m1783b(classLoader, str);", "return m1783b(classLoader, str).asSubclass(Fragment.class);", "C0477n Fragment class")
stage(p, s)

p = "app/src/main/java/p006b/p056m/p057b/C0491z.java"
s = read(p)
s = once(s, "ArrayList arrayList = new ArrayList();", "ArrayList<Fragment> arrayList = new ArrayList<>();", "C0491z active list")
s = once(s, "ArrayList arrayList;\n        if (this.f3166a.isEmpty())", "ArrayList<Fragment> arrayList;\n        if (this.f3166a.isEmpty())", "C0491z added list")
stage(p, s)

p = "app/src/main/java/p006b/p056m/p057b/C0487v.java"
s = read(p)
s = once(s, "        public <T extends AbstractC0511p> T m1868a(Class<T> cls) {", "        @SuppressWarnings(\"unchecked\")\n        public <T extends AbstractC0511p> T m1868a(Class<T> cls) {", "C0487v factory annotation")
s = once(s, "            return new C0487v(true);", "            return (T) new C0487v(true);", "C0487v factory cast")
stage(p, s)

# Back-stack transaction constructor: super must be first.
p = "app/src/main/java/p006b/p056m/p057b/C0451a.java"
s = read(p)
old = "    public C0451a(AbstractC0483r abstractC0483r) {\n        C0477n c0477nM1811K = abstractC0483r.m1811K();\n        AbstractC0479o<?> abstractC0479o = abstractC0483r.f3108n;\n        super(c0477nM1811K, abstractC0479o != null ? abstractC0479o.f3086c.getClassLoader() : null);\n        this.f2931s = -1;\n        this.f2929q = abstractC0483r;\n    }"
new = "    public C0451a(AbstractC0483r abstractC0483r) {\n        super(abstractC0483r.m1811K(), abstractC0483r.f3108n != null ? abstractC0483r.f3108n.f3086c.getClassLoader() : null);\n        this.f2931s = -1;\n        this.f2929q = abstractC0483r;\n    }"
s = once(s, old, new, "C0451a constructor")
s = s.replace("a.m2191e(", "c.a.a.a.a.m2191e(")
stage(p, s)

# Transition group traversal: retain ViewGroup type; restore missing keyed tag resource.
p = "app/src/main/java/p006b/p056m/p057b/AbstractC0476m0.java"
s = read(p)
old = """    public void m1780f(ArrayList<View> arrayList, View view) {
        boolean zIsTransitionGroup;
        if (view.getVisibility() == 0) {
            if (view instanceof ViewGroup) {
                view = (ViewGroup) view;
                if (Build.VERSION.SDK_INT >= 21) {
                    zIsTransitionGroup = view.isTransitionGroup();
                } else {
                    Boolean bool = (Boolean) view.getTag(R.id.ny);
                    zIsTransitionGroup = ((bool == null || !bool.booleanValue()) && view.getBackground() == null && C0418m.m1568k(view) == null) ? false : true;
                }
                if (!zIsTransitionGroup) {
                    int childCount = view.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        m1780f(arrayList, view.getChildAt(i));
                    }
                    return;
                }
            }
            arrayList.add(view);
        }
    }"""
new = """    public void m1780f(ArrayList<View> arrayList, View view) {
        boolean zIsTransitionGroup;
        if (view.getVisibility() != 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (Build.VERSION.SDK_INT >= 21) {
                zIsTransitionGroup = viewGroup.isTransitionGroup();
            } else {
                Boolean bool = (Boolean) viewGroup.getTag(R.id.ny);
                zIsTransitionGroup = (bool != null && bool.booleanValue()) || viewGroup.getBackground() != null || C0418m.m1568k(viewGroup) != null;
            }
            if (!zIsTransitionGroup) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    m1780f(arrayList, viewGroup.getChildAt(i));
                }
                return;
            }
        }
        arrayList.add(view);
    }"""
s = once(s, old, new, "AbstractC0476m0 transition traversal")
stage(p, s)

p = "app/src/main/res/values/ids.xml"
s = read(p)
s = once(s, '    <item name="nx" type="id" />', '    <item name="nx" type="id" />\n    <item name="ny" type="id" />', "ids.xml transition tag")
stage(p, s)

# Other helper-name collisions.
for p, old, new, label in [
    ("app/src/main/java/p080c/p126d/p127a/p128a/p151u/C1283b.java", 'a.m2191e("Error loading font ")', 'c.a.a.a.a.m2191e("Error loading font ")', "C1283b helper"),
    ("app/src/main/java/p006b/p070u/C0564a.java", 'a.m2191e("Class")', 'c.a.a.a.a.m2191e("Class")', "C0564a helper"),
]:
    s = read(p)
    s = once(s, old, new, label)
    stage(p, s)

# Recreator generic was decompiled as an undefined type U.
p = "app/src/main/java/androidx/savedstate/Recreator.java"
s = read(p)
s = once(s, "Class<? extends U> clsAsSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(C0564a.a.class);", "Class<? extends C0564a.a> clsAsSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(C0564a.a.class);", "Recreator class generic")
stage(p, s)

# ViewPager: Creator signatures, helper collision, Activity context, and malformed break.
p = "app/src/main/java/androidx/viewpager/widget/ViewPager.java"
s = read(p)
s = once(s, "public Object createFromParcel(Parcel parcel) {", "public C0178k createFromParcel(Parcel parcel) {", "ViewPager parcel creator")
s = once(s, "public Object[] newArray(int i) {", "public C0178k[] newArray(int i) {", "ViewPager parcel array")
s = once(s, 'StringBuilder sbM2191e = a.m2191e("FragmentPager.SavedState{");', 'StringBuilder sbM2191e = new StringBuilder("FragmentPager.SavedState{");', "ViewPager state string")
s = once(s, "g0 abstractC1002g0M1808H = abstractC0488w.f3145c.m1808H(", "Fragment abstractC1002g0M1808H = abstractC0488w.f3145c.m1808H(", "ViewPager Fragment type")
s = once(s, "abstractC1002g0M1808H = MainActivity.this.f6456H.f4837a.get(i);", "abstractC1002g0M1808H = ((MainActivity) getContext()).f6456H.f4837a.get(i);", "ViewPager MainActivity context")
old = """            if (viewFindFocus == null) {
                c0172eM734h = null;
                break;
            }
            while (true) {
                Object parent = viewFindFocus.getParent();
                if (parent == this) {
                    c0172eM734h = m734h(viewFindFocus);
                    break;
                } else {
                    if (parent == null || !(parent instanceof View)) {
                        c0172eM734h = null;
                        break;
                    }
                    viewFindFocus = (View) parent;
                }
            }"""
new = """            if (viewFindFocus == null) {
                c0172eM734h = null;
            } else {
                while (true) {
                    Object parent = viewFindFocus.getParent();
                    if (parent == this) {
                        c0172eM734h = m734h(viewFindFocus);
                        break;
                    } else {
                        if (parent == null || !(parent instanceof View)) {
                            c0172eM734h = null;
                            break;
                        }
                        viewFindFocus = (View) parent;
                    }
                }
            }"""
s = once(s, old, new, "ViewPager focus traversal")
stage(p, s)

# TabLayout: stale inner-class name and invalid MainActivity.this lexical reference.
p = "app/src/main/java/com/google/android/material/tabs/TabLayout.java"
s = read(p)
s = once(s, "                MainActivity.C1332c c1332c = (MainActivity.C1332c) this.f10342J;\n", "", "TabLayout stale adapter class")
s = once(s, "MainActivity.this.getResources().getString(MainActivity.this.f6456H.f4839c.get(i).intValue())", "getResources().getString(((MainActivity) getContext()).f6456H.f4839c.get(i).intValue())", "TabLayout activity context")
stage(p, s)

# FragmentManager: inner class c hides the imported package prefix c.a.a.a.a.
p = "app/src/main/java/p006b/p056m/p057b/AbstractC0483r.java"
s = read(p)
s = once(s, "public class c extends C0477n {", "public class FragmentFactory extends C0477n {", "FragmentManager factory class")
s = once(s, "        public c() {", "        public FragmentFactory() {", "FragmentManager factory constructor")
s = once(s, "public C0477n f3112r = new c();", "public C0477n f3112r = new FragmentFactory();", "FragmentManager factory instance")
for method in ("m2191e", "m2192f", "m2200n", "m2201o", "m2202p", "m2203q"):
    s = s.replace(f"a.{method}(", f"c.a.a.a.a.{method}(")
s = s.replace("(ArrayList) abstractC0483r.f3097c.m1880f()", "abstractC0483r.f3097c.m1880f()")
s = s.replace("(ArrayList) this.f3097c.m1880f()", "this.f3097c.m1880f()")
stage(p, s)

# Atomicity: all anchors were checked above; now write the staged files.
for rel, content in PENDING.items():
    (ROOT / rel).write_text(content, encoding="utf-8")
print(f"Round 23 patch applied to {len(PENDING)} files.")
print("Run: ./gradlew :app:compileDebugJavaWithJavac")
