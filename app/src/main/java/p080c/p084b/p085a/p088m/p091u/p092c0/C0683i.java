package p080c.p084b.p085a.p088m.p091u.p092c0;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.TreeMap;
import c.a.a.a.a;

/* JADX INFO: renamed from: c.b.a.m.u.c0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0683i implements InterfaceC0676b {

    /* JADX INFO: renamed from: a */
    public final C0681g<a, Object> f4011a = new C0681g<>();

    /* JADX INFO: renamed from: b */
    public final b f4012b = new b();

    /* JADX INFO: renamed from: c */
    public final Map<Class<?>, NavigableMap<Integer, Integer>> f4013c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final Map<Class<?>, InterfaceC0675a<?>> f4014d = new HashMap();

    /* JADX INFO: renamed from: e */
    public final int f4015e;

    /* JADX INFO: renamed from: f */
    public int f4016f;

    /* JADX INFO: renamed from: c.b.a.m.u.c0.i$a */
    public static final class a implements InterfaceC0686l {

        /* JADX INFO: renamed from: a */
        public final b f4017a;

        /* JADX INFO: renamed from: b */
        public int f4018b;

        /* JADX INFO: renamed from: c */
        public Class<?> f4019c;

        public a(b bVar) {
            this.f4017a = bVar;
        }

        @Override // p080c.p084b.p085a.p088m.p091u.p092c0.InterfaceC0686l
        /* JADX INFO: renamed from: a */
        public void mo2342a() {
            this.f4017a.m2327c(this);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f4018b == aVar.f4018b && this.f4019c == aVar.f4019c;
        }

        public int hashCode() {
            int i = this.f4018b * 31;
            Class<?> cls = this.f4019c;
            return i + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sbM2191e = a.m2191e("Key{size=");
            sbM2191e.append(this.f4018b);
            sbM2191e.append("array=");
            sbM2191e.append(this.f4019c);
            sbM2191e.append('}');
            return sbM2191e.toString();
        }
    }

    /* JADX INFO: renamed from: c.b.a.m.u.c0.i$b */
    public static final class b extends AbstractC0677c<a> {
        @Override // p080c.p084b.p085a.p088m.p091u.p092c0.AbstractC0677c
        /* JADX INFO: renamed from: a */
        public InterfaceC0686l mo2325a() {
            return new a(this);
        }

        /* JADX INFO: renamed from: d */
        public a m2343d(int i, Class<?> cls) {
            a aVarM2326b = m2326b();
            aVarM2326b.f4018b = i;
            aVarM2326b.f4019c = cls;
            return aVarM2326b;
        }
    }

    public C0683i(int i) {
        this.f4015e = i;
    }

    @Override // p080c.p084b.p085a.p088m.p091u.p092c0.InterfaceC0676b
    /* JADX INFO: renamed from: a */
    public synchronized void mo2320a(int i) {
        if (i >= 40) {
            synchronized (this) {
                m2338g(0);
            }
        } else if (i >= 20 || i == 15) {
            m2338g(this.f4015e / 2);
        }
    }

    @Override // p080c.p084b.p085a.p088m.p091u.p092c0.InterfaceC0676b
    /* JADX INFO: renamed from: b */
    public synchronized void mo2321b() {
        m2338g(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p080c.p084b.p085a.p088m.p091u.p092c0.InterfaceC0676b
    /* JADX INFO: renamed from: c */
    public synchronized <T> T mo2322c(int i, Class<T> cls) {
        a aVarM2326b;
        aVarM2326b = this.f4012b.m2326b();
        aVarM2326b.f4018b = i;
        aVarM2326b.f4019c = cls;
        return (T) m2340i(aVarM2326b, cls);
    }

    @Override // p080c.p084b.p085a.p088m.p091u.p092c0.InterfaceC0676b
    /* JADX INFO: renamed from: d */
    public synchronized <T> void mo2323d(T t) {
        Class<?> cls = t.getClass();
        InterfaceC0675a<T> interfaceC0675aM2339h = m2339h(cls);
        int iMo2318b = interfaceC0675aM2339h.mo2318b(t);
        int iMo2319c = interfaceC0675aM2339h.mo2319c() * iMo2318b;
        int iIntValue = 1;
        if (iMo2319c <= this.f4015e / 2) {
            a aVarM2343d = this.f4012b.m2343d(iMo2318b, cls);
            this.f4011a.m2334b(aVarM2343d, t);
            NavigableMap<Integer, Integer> navigableMapM2341j = m2341j(cls);
            Integer num = (Integer) navigableMapM2341j.get(Integer.valueOf(aVarM2343d.f4018b));
            Integer numValueOf = Integer.valueOf(aVarM2343d.f4018b);
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapM2341j.put(numValueOf, Integer.valueOf(iIntValue));
            this.f4016f += iMo2319c;
            m2338g(this.f4015e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002c  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p080c.p084b.p085a.p088m.p091u.p092c0.InterfaceC0676b
    /* JADX INFO: renamed from: e */
    public synchronized <T> T mo2324e(int i, Class<T> cls) {
        a aVarM2343d;
        Integer numCeilingKey = m2341j(cls).ceilingKey(Integer.valueOf(i));
        boolean z = true;
        if (numCeilingKey == null) {
            z = false;
        } else {
            int i2 = this.f4016f;
            if (!(i2 == 0 || this.f4015e / i2 >= 2) && numCeilingKey.intValue() > i * 8) {
                z = false;
            }
        }
        if (z) {
            aVarM2343d = this.f4012b.m2343d(numCeilingKey.intValue(), cls);
        } else {
            a aVarM2326b = this.f4012b.m2326b();
            aVarM2326b.f4018b = i;
            aVarM2326b.f4019c = cls;
            aVarM2343d = aVarM2326b;
        }
        return (T) m2340i(aVarM2343d, cls);
    }

    /* JADX INFO: renamed from: f */
    public final void m2337f(int i, Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMapM2341j = m2341j(cls);
        Integer num = (Integer) navigableMapM2341j.get(Integer.valueOf(i));
        if (num == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
        }
        int iIntValue = num.intValue();
        Integer numValueOf = Integer.valueOf(i);
        if (iIntValue == 1) {
            navigableMapM2341j.remove(numValueOf);
        } else {
            navigableMapM2341j.put(numValueOf, Integer.valueOf(num.intValue() - 1));
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m2338g(int i) {
        while (this.f4016f > i) {
            Object objM2335c = this.f4011a.m2335c();
            Objects.requireNonNull(objM2335c, "Argument must not be null");
            InterfaceC0675a interfaceC0675aM2339h = m2339h(objM2335c.getClass());
            this.f4016f -= interfaceC0675aM2339h.mo2319c() * interfaceC0675aM2339h.mo2318b(objM2335c);
            m2337f(interfaceC0675aM2339h.mo2318b(objM2335c), objM2335c.getClass());
            if (Log.isLoggable(interfaceC0675aM2339h.mo2317a(), 2)) {
                String strMo2317a = interfaceC0675aM2339h.mo2317a();
                StringBuilder sbM2191e = a.m2191e("evicted: ");
                sbM2191e.append(interfaceC0675aM2339h.mo2318b(objM2335c));
                Log.v(strMo2317a, sbM2191e.toString());
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final <T> InterfaceC0675a<T> m2339h(Class<T> cls) {
        InterfaceC0675a<T> c0680f = (InterfaceC0675a) this.f4014d.get(cls);
        if (c0680f == null) {
            if (cls.equals(int[].class)) {
                c0680f = new C0682h();
            } else {
                if (!cls.equals(byte[].class)) {
                    StringBuilder sbM2191e = a.m2191e("No array pool found for: ");
                    sbM2191e.append(cls.getSimpleName());
                    throw new IllegalArgumentException(sbM2191e.toString());
                }
                c0680f = new C0680f();
            }
            this.f4014d.put(cls, c0680f);
        }
        return c0680f;
    }

    /* JADX INFO: renamed from: i */
    public final <T> T m2340i(a aVar, Class<T> cls) {
        InterfaceC0675a<T> interfaceC0675aM2339h = m2339h(cls);
        T t = (T) this.f4011a.m2333a(aVar);
        if (t != null) {
            this.f4016f -= interfaceC0675aM2339h.mo2319c() * interfaceC0675aM2339h.mo2318b(t);
            m2337f(interfaceC0675aM2339h.mo2318b(t), cls);
        }
        if (t != null) {
            return t;
        }
        if (Log.isLoggable(interfaceC0675aM2339h.mo2317a(), 2)) {
            String strMo2317a = interfaceC0675aM2339h.mo2317a();
            StringBuilder sbM2191e = a.m2191e("Allocated ");
            sbM2191e.append(aVar.f4018b);
            sbM2191e.append(" bytes");
            Log.v(strMo2317a, sbM2191e.toString());
        }
        return interfaceC0675aM2339h.newArray(aVar.f4018b);
    }

    /* JADX INFO: renamed from: j */
    public final NavigableMap<Integer, Integer> m2341j(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f4013c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f4013c.put(cls, treeMap);
        return treeMap;
    }
}
