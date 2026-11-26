#!/usr/bin/env python3
"""Round 24 compile repair for the decompiled adbtool Android project.

The script validates every source anchor in memory before writing any file.
It preserves Glide execution paths; changes are limited to recovered Java
structure, generic bridge typing, Parcelable signatures and missing generated
resource IDs.
"""
from pathlib import Path
import re
import sys

ROOT = Path(__file__).resolve().parent
JAVA = ROOT / "app/src/main/java"
RES = ROOT / "app/src/main/res/values/ids.xml"
changes = {}


def load(rel):
    p = ROOT / rel
    if not p.is_file():
        raise RuntimeError(f"required file missing: {rel}")
    return p.read_text(encoding="utf-8")


def put(rel, content):
    changes[rel] = content


def one(text, old, new, rel, expected=1):
    n = text.count(old)
    if n != expected:
        raise RuntimeError(f"{rel}: anchor count {n}, expected {expected}: {old[:100]!r}")
    return text.replace(old, new)


def all_replace(text, old, new, rel, minimum=1):
    n = text.count(old)
    if n < minimum:
        raise RuntimeError(f"{rel}: anchor {old[:100]!r} not found")
    return text.replace(old, new)


def regex_one(text, pattern, repl, rel):
    out, n = re.subn(pattern, repl, text, count=1, flags=re.S)
    if n != 1:
        raise RuntimeError(f"{rel}: regex anchor count {n}, expected 1: {pattern[:120]!r}")
    return out

# 1) File sorting comparator: make the four sort modes definitely assigned.
rel = "app/src/main/java/c/c/a/v3/k0/C1054t.java"
s = load(rel)
pattern = r'''        @Override // java\.util\.Comparator\n        public int compare\(C1056v c1056v, C1056v c1056v2\) \{\n.*?\n        \}\n    \}\n\n    /\* JADX INFO: renamed from: c\.c\.a\.v3\.k0\.t\$d \*/'''
repl = '''        @Override // java.util.Comparator
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

    /* JADX INFO: renamed from: c.c.a.v3.k0.t$d */'''
s = regex_one(s, pattern, repl, rel)
put(rel, s)

# 2) Lifecycle observer value comes from Object storage; cast back to T.
rel = "app/src/main/java/androidx/lifecycle/LiveData.java"
s = load(rel)
s = one(s, "abstractC0091a.f731a.m1908a((Object) this.f724d);",
        "abstractC0091a.f731a.m1908a((T) this.f724d);", rel)
put(rel, s)

# 3) Missing IDs used as keyed View tags in fragment/glide targets.
rel = "app/src/main/res/values/ids.xml"
s = load(rel)
for name in ("fh", "rd", "fk"):
    if not re.search(rf'<item\\s+name=["\']{name}["\']\\s+type=["\']id["\']', s):
        s = s.replace("</resources>", f'    <item name="{name}" type="id" />\n</resources>')
put(rel, s)

# 4) Generic Glide model-loader registry: decompiler lost wildcards/captures.
rel = "app/src/main/java/p080c/p084b/p085a/C0621g.java"
s = load(rel)
s = all_replace(s,
'''            StringBuilder sbM2191e = a.m2191e("Failed to find any ModelLoaders registered for model class: ");
            sbM2191e.append(obj.getClass());
            super(sbM2191e.toString());''',
'''            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());''', rel)
s = one(s,
'''    public <Model, Data> C0621g m2212c(Class<Model> cls, Class<Data> cls2, InterfaceC0737o<Model, Data> interfaceC0737o) {
        C0738p c0738p = this.f3796a;
        synchronized (c0738p) {
            C0740r c0740r = c0738p.f4330a;
            synchronized (c0740r) {
                C0740r.b<?, ?> bVar = new C0740r.b<>(cls, cls2, interfaceC0737o);
                List<C0740r.b<?, ?>> list = c0740r.f4345a;
                list.add(list.size(), bVar);
            }
            c0738p.f4331b.f4332a.clear();
        }
        return this;
    }''',
'''    @SuppressWarnings({"rawtypes", "unchecked"})
    public C0621g m2212c(Class cls, Class cls2, InterfaceC0737o interfaceC0737o) {
        C0738p c0738p = this.f3796a;
        synchronized (c0738p) {
            C0740r c0740r = c0738p.f4330a;
            synchronized (c0740r) {
                C0740r.b bVar = new C0740r.b(cls, cls2, interfaceC0737o);
                List list = c0740r.f4345a;
                list.add(list.size(), bVar);
            }
            c0738p.f4331b.f4332a.clear();
        }
        return this;
    }''', rel)
# Replace the whole method with raw-safe local casts; actual registry cache semantics remain unchanged.
start = s.index("    public <Model> List<InterfaceC0736n<Model, ?>> m2215f(Model model) {")
end = s.index("\n    /* JADX INFO: renamed from: g */", start)
new_method = '''    @SuppressWarnings({"rawtypes", "unchecked"})
    public <Model> List<InterfaceC0736n<Model, ?>> m2215f(Model model) {
        List loaders;
        C0738p c0738p = this.f3796a;
        Objects.requireNonNull(c0738p);
        Class<?> cls = model.getClass();
        synchronized (c0738p) {
            C0738p.a.C1398a cached = (C0738p.a.C1398a) c0738p.f4331b.f4332a.get(cls);
            loaders = cached == null ? null : (List) cached.f4333a;
            if (loaders == null) {
                loaders = Collections.unmodifiableList(c0738p.f4330a.m2446c(cls));
                if (c0738p.f4331b.f4332a.put(cls, new C0738p.a.C1398a(loaders)) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (loaders.isEmpty()) {
            throw new c(model);
        }
        List<InterfaceC0736n<Model, ?>> matching = new ArrayList<>(loaders.size());
        for (Object item : loaders) {
            InterfaceC0736n loader = (InterfaceC0736n) item;
            if (loader.mo2427b(model)) {
                matching.add(loader);
            }
        }
        if (matching.isEmpty()) {
            throw new c(model, (List) loaders);
        }
        return matching;
    }
'''
s = s[:start] + new_method + s[end:]
s = s.replace("a.m2191e(", "c.a.a.a.a.m2191e(")
put(rel, s)

# 5) Glide module helper references were shadowed by nested interface 'a'.
helper_files = [
"app/src/main/java/p080c/p084b/p085a/ComponentCallbacks2C0616b.java",
"app/src/main/java/p080c/p084b/p085a/ComponentCallbacks2C0623i.java",
"app/src/main/java/p080c/p084b/p085a/p088m/p091u/p093d0/C0698j.java",
"app/src/main/java/p080c/p084b/p085a/p088m/C0646n.java",
"app/src/main/java/p080c/p084b/p085a/p088m/p091u/C0706j.java",
"app/src/main/java/p080c/p084b/p085a/p088m/p091u/C0714r.java",
"app/src/main/java/p080c/p084b/p085a/p088m/p091u/RunnableC0705i.java",
"app/src/main/java/p080c/p084b/p085a/p111s/p112k/C0876a.java",
"app/src/main/java/p080c/p084b/p085a/p107q/p108j/AbstractC0858i.java",
"app/src/main/java/p080c/p084b/p085a/C0622h.java",
"app/src/main/java/p006b/p049j/p051b/C0447e.java",
]
for rel in helper_files:
    s = load(rel)
    s2 = s.replace("a.m2191e(", "c.a.a.a.a.m2191e(").replace("a.m2201o(", "c.a.a.a.a.m2201o(")
    if s2 == s:
        raise RuntimeError(f"{rel}: expected helper-shadowing call not found")
    put(rel, s2)

# 6) Static nested strategy/factory classes reconstructed as non-static by jadx.
static_changes = {
"app/src/main/java/p080c/p084b/p085a/p104n/C0824p.java": [
    ("public class a implements b {", "public static class a implements b {")],
"app/src/main/java/p080c/p084b/p085a/p088m/p091u/AbstractC0707k.java": [
    ("public class a extends AbstractC0707k {", "public static class a extends AbstractC0707k {"),
    ("public class b extends AbstractC0707k {", "public static class b extends AbstractC0707k {"),
    ("public class c extends AbstractC0707k {", "public static class c extends AbstractC0707k {")],
"app/src/main/java/p080c/p084b/p085a/p088m/C0646n.java": [
    ("public class a implements b<Object> {", "public static class a implements b<Object> {")],
"app/src/main/java/p080c/p084b/p085a/p088m/p089t/C0657f.java": [
    ("public class a implements InterfaceC0656e.a<Object> {", "public static class a implements InterfaceC0656e.a<Object> {")],
"app/src/main/java/p080c/p084b/p085a/p111s/p112k/C0876a.java": [
    ("public class a implements e<Object> {", "public static class a implements e<Object> {")],
"app/src/main/java/p080c/p084b/p085a/p088m/p091u/C0718v.java": [
    ("public class a implements C0876a.b<C0718v<?>> {", "public static class a implements C0876a.b<C0718v<?>> {")],
}
for rel, pairs in static_changes.items():
    s = changes.get(rel, load(rel))
    for old, new in pairs:
        s = one(s, old, new, rel)
    put(rel, s)

# 7) Generic option and digest map bridge casts.
rel = "app/src/main/java/p080c/p084b/p085a/p088m/C0646n.java"
s = changes[rel]
s = one(s, "return new C0646n<>(str, t, f3938e);",
        "return new C0646n<>(str, t, (b<T>) (b) f3938e);", rel)
put(rel, s)
rel = "app/src/main/java/p080c/p084b/p085a/p088m/C0647o.java"
s = load(rel)
s = one(s, "bVar.mo2284a(c0646nM1272h.f3942d, objM1276l, messageDigest);",
        "((C0646n.b) bVar).mo2284a(c0646nM1272h.f3942d, objM1276l, messageDigest);", rel)
put(rel, s)

# 8) Correct the broken decompiler-emitted super-call ordering in WeakReference subclass.
rel = "app/src/main/java/p080c/p084b/p085a/p088m/p091u/C0670a.java"
s = load(rel)
s = one(s,
'''        public b(InterfaceC0645m interfaceC0645m, C0713q<?> c0713q, ReferenceQueue<? super C0713q<?>> referenceQueue, boolean z) {
            InterfaceC0719w<?> interfaceC0719w;
            super(c0713q, referenceQueue);''',
'''        public b(InterfaceC0645m interfaceC0645m, C0713q<?> c0713q, ReferenceQueue<? super C0713q<?>> referenceQueue, boolean z) {
            super(c0713q, referenceQueue);
            InterfaceC0719w<?> interfaceC0719w;''', rel)
put(rel, s)

# 9) Glide RequestBuilder self types and Drawable transcoder generic bridge.
rel = "app/src/main/java/p080c/p084b/p085a/p107q/AbstractC0841a.java"
s = load(rel)
count_this = s.count("return this;")
if count_this < 10:
    raise RuntimeError(f"{rel}: expected fluent self returns, found {count_this}")
s = s.replace("return this;", "return (T) this;")
s = one(s, "m2556p(BitmapDrawable.class, c0771o, z);",
        "m2556p((Class) BitmapDrawable.class, (InterfaceC0651s) c0771o, z);", rel)
put(rel, s)

# 10) Glide request target's runtime-specialized view target is necessarily unchecked.
rel = "app/src/main/java/p080c/p084b/p085a/C0622h.java"
s = changes[rel]
s = one(s,
"this.f3810F = abstractC0624j == null ? C0618d.f3778k : abstractC0624j;",
"this.f3810F = abstractC0624j == null ? (AbstractC0624j<?, ? super TranscodeType>) C0618d.f3778k : (AbstractC0624j<?, ? super TranscodeType>) abstractC0624j;", rel)
s = one(s,
'''        C0842b c0842b;
        InterfaceC0844d c0842b2;
        InterfaceC0843c interfaceC0843cM2228z;''',
'''        C0842b c0842b = null;
        InterfaceC0844d c0842b2 = interfaceC0844d;
        InterfaceC0843c interfaceC0843cM2228z;''', rel)
s = one(s,
'''        if (this.f3814J != null) {
            c0842b2 = new C0842b(obj, interfaceC0844d);
            c0842b = c0842b2;
        } else {
            c0842b = 0;
            c0842b2 = interfaceC0844d;
        }''',
'''        if (this.f3814J != null) {
            c0842b = new C0842b(obj, interfaceC0844d);
            c0842b2 = c0842b;
        }''', rel)
s = one(s, "if (c0842b == 0) {", "if (c0842b == null) {", rel)
s = one(s, "c0853d = new C0851b(imageView);",
        "c0853d = (AbstractC0858i<ImageView, TranscodeType>) (AbstractC0858i) new C0851b(imageView);", rel)
s = one(s, "c0853d = new C0853d(imageView);",
        "c0853d = (AbstractC0858i<ImageView, TranscodeType>) (AbstractC0858i) new C0853d(imageView);", rel)
put(rel, s)

# 11) The lifecycle target method cannot widen the throws clause of its interface.
rel = "app/src/main/java/p080c/p084b/p085a/p107q/p108j/AbstractC0858i.java"
s = changes[rel]
s = one(s, "public void mo2591h(InterfaceC0856g interfaceC0856g) throws Throwable {",
        "public void mo2591h(InterfaceC0856g interfaceC0856g) {", rel)
put(rel, s)

# 12) Fix the abstract AppBar offset method's generic parameter and Parcelable Creator signatures.
rel = "app/src/main/java/com/google/android/material/appbar/AppBarLayout.java"
s = load(rel)
s = one(s,
"public int mo2776I(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {",
"public int mo2776I(CoordinatorLayout coordinatorLayout, T view, int i, int i2, int i3) {", rel)
s = one(s,
'''                public Object createFromParcel(Parcel parcel) {
                    return new C1335a(parcel, null);
                }

                @Override // android.os.Parcelable.Creator
                public Object[] newArray(int i) {
                    return new C1335a[i];
                }''',
'''                public C1335a createFromParcel(Parcel parcel) {
                    return new C1335a(parcel, null);
                }

                @Override // android.os.Parcelable.Creator
                public C1335a[] newArray(int i) {
                    return new C1335a[i];
                }''', rel)
put(rel, s)

# 13) Glide module and cache key iteration types.
rel = "app/src/main/java/p080c/p084b/p085a/ComponentCallbacks2C0623i.java"
s = changes[rel]
s = all_replace(s,
"for (InterfaceC0843c interfaceC0843c : (ArrayList) C0875j.m2613e(c0826r.f4587a)) {",
"for (InterfaceC0843c interfaceC0843c : (ArrayList<InterfaceC0843c>) C0875j.m2613e(c0826r.f4587a)) {", rel, minimum=2)
put(rel, s)

# 14) Decoded Glide path uses a callback supplied by RunnableC0705i's inner task.
rel = "app/src/main/java/p080c/p084b/p085a/p088m/p091u/C0706j.java"
s = changes[rel]
s = one(s, "    public interface a<ResourceType> {\n    }",
'''    public interface a<ResourceType> {
        RunnableC0705i<?> mo2393a();
        EnumC0633a mo2394b();
    }''', rel)
s = one(s,
'''            RunnableC0705i.b bVar = (RunnableC0705i.b) aVar;
            RunnableC0705i runnableC0705i = RunnableC0705i.this;
            EnumC0633a enumC0633a = bVar.f4144a;''',
'''            RunnableC0705i<?> runnableC0705i = aVar.mo2393a();
            EnumC0633a enumC0633a = aVar.mo2394b();''', rel)
s = one(s, "C0704h<R> c0704h = runnableC0705i.f4119b;",
        "C0704h<Transcode> c0704h = (C0704h<Transcode>) runnableC0705i.f4119b;", rel)
s = one(s, "C0718v<Z> c0718vM2423f = C0718v.m2423f(interfaceC0719wMo2290b);",
        "C0718v<ResourceType> c0718vM2423f = C0718v.m2423f(interfaceC0719wMo2290b);", rel)
s = one(s, "RunnableC0705i.c<?> cVar = runnableC0705i.f4124g;",
        "RunnableC0705i.c cVar = (RunnableC0705i.c) runnableC0705i.f4124g;", rel)
s = one(s, "return this.f4165c.mo2512a(obj, c0647o);",
        "return this.f4165c.mo2512a((InterfaceC0719w<ResourceType>) obj, c0647o);", rel)
put(rel, s)

rel = "app/src/main/java/p080c/p084b/p085a/p088m/p091u/RunnableC0705i.java"
s = changes[rel]
s = one(s,
'''        public b(EnumC0633a enumC0633a) {
            this.f4144a = enumC0633a;
        }''',
'''        public b(EnumC0633a enumC0633a) {
            this.f4144a = enumC0633a;
        }

        @Override
        public RunnableC0705i<?> mo2393a() {
            return RunnableC0705i.this;
        }

        @Override
        public EnumC0633a mo2394b() {
            return this.f4144a;
        }''', rel)
s = one(s,
"C0717u<Data, ?, R> c0717uM2370d = this.f4119b.m2370d(data.getClass());",
"C0717u<Data, ?, R> c0717uM2370d = this.f4119b.m2370d((Class<Data>) data.getClass());", rel)
s = one(s, "InterfaceC0656e.a<?> aVar = c0657f.f3955a.get(data.getClass());",
        "InterfaceC0656e.a aVar = c0657f.f3955a.get(data.getClass());", rel)
s = one(s, "C0718v c0718vM2374e;", "InterfaceC0719w<R> interfaceC0719wM2374e;", rel)
s = one(s, "C0718v c0718vM2423f = null;", "C0718v<R> c0718vM2423f = null;", rel)
s = all_replace(s, "c0718vM2374e", "interfaceC0719wM2374e", rel, minimum=5)
s = all_replace(s, "C0709m<?> c0709m = (C0709m) this.f4134q;",
                "C0709m<R> c0709m = (C0709m<R>) this.f4134q;", rel, minimum=2)
s = one(s, "new C0709m.b(dVar.f4227a)", "((C0709m<?>) this.f4134q).new b(dVar.f4227a)", rel)
s = one(s, "new C0709m.a(dVar.f4227a)", "((C0709m<?>) this.f4134q).new a(dVar.f4227a)", rel)
put(rel, s)

# 15) Engine construction holds a wildcard pool result; bind it to request result type.
rel = "app/src/main/java/p080c/p084b/p085a/p088m/p091u/C0708l.java"
s = load(rel)
s = one(s, "        throw th;\n    }\n\n    /* JADX INFO: renamed from: f */",
        "    }\n\n    /* JADX INFO: renamed from: f */", rel)
s = one(s, "C0709m<?> c0709mMo1537b = this.f4175d.f4190g.mo1537b();",
        "C0709m<R> c0709mMo1537b = (C0709m<R>) this.f4175d.f4190g.mo1537b();", rel)
put(rel, s)

# 16) Collection return type casts in decode-path construction.
rel = "app/src/main/java/p080c/p084b/p085a/p088m/p091u/C0704h.java"
s = load(rel)
s = one(s,
"for (Class<?> cls4 : (ArrayList) c0621g.f3798c.m2540b(cls, cls2)) {",
"for (Class<?> cls4 : (List<Class<?>>) (List<?>) c0621g.f3798c.m2540b(cls, cls2)) {", rel)
s = one(s,
"for (Class<?> cls5 : (ArrayList) c0621g.f3801f.m2513a(cls4, cls3)) {",
"for (Class<?> cls5 : (List<Class<?>>) (List<?>) c0621g.f3801f.m2513a(cls4, cls3)) {", rel)
put(rel, s)

# 17) Resource map callbacks and fragment request tracker casts.
rel = "app/src/main/java/p080c/p084b/p085a/p088m/C0647o.java"
# already patched above; no-op retained intentionally
rel = "app/src/main/java/p080c/p084b/p085a/p107q/p108j/AbstractC0858i.java"
# helper and throws patches already applied

# 18) Static collection of tags: resource list edits remain additive and idempotent.
# 19) Stage files to disk only after all validation succeeds.
for rel, content in changes.items():
    path = ROOT / rel
    path.write_text(content, encoding="utf-8")

print(f"Round 24 patch applied to {len(changes)} files.")
print("Compile next: ./gradlew :app:compileDebugJavaWithJavac")
