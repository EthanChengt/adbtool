package p006b.p061o;

import androidx.lifecycle.CompositeGeneratedAdaptersObserver;
import androidx.lifecycle.FullLifecycleObserverAdapter;
import androidx.lifecycle.ReflectiveGenericLifecycleObserver;
import androidx.lifecycle.SingleGeneratedAdapterObserver;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p006b.p019c.p020a.p022b.C0302a;
import p006b.p019c.p020a.p022b.C0303b;

/* JADX INFO: renamed from: b.o.h */
/* JADX INFO: loaded from: classes.dex */
public class C0503h extends AbstractC0499d {

    /* JADX INFO: renamed from: c */
    public final WeakReference<InterfaceC0502g> f3188c;

    /* JADX INFO: renamed from: a */
    public C0302a<InterfaceC0501f, a> f3186a = new C0302a<>();

    /* JADX INFO: renamed from: d */
    public int f3189d = 0;

    /* JADX INFO: renamed from: e */
    public boolean f3190e = false;

    /* JADX INFO: renamed from: f */
    public boolean f3191f = false;

    /* JADX INFO: renamed from: g */
    public ArrayList<AbstractC0499d.b> f3192g = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public AbstractC0499d.b f3187b = AbstractC0499d.b.INITIALIZED;

    /* JADX INFO: renamed from: b.o.h$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public AbstractC0499d.b f3193a;

        /* JADX INFO: renamed from: b */
        public InterfaceC0500e f3194b;

        public a(InterfaceC0501f interfaceC0501f, AbstractC0499d.b bVar) {
            InterfaceC0500e reflectiveGenericLifecycleObserver;
            Map<Class<?>, Integer> map = C0505j.f3195a;
            boolean z = interfaceC0501f instanceof InterfaceC0500e;
            boolean z2 = interfaceC0501f instanceof InterfaceC0497b;
            if (z && z2) {
                reflectiveGenericLifecycleObserver = new FullLifecycleObserverAdapter((InterfaceC0497b) interfaceC0501f, (InterfaceC0500e) interfaceC0501f);
            } else if (z2) {
                reflectiveGenericLifecycleObserver = new FullLifecycleObserverAdapter((InterfaceC0497b) interfaceC0501f, null);
            } else if (z) {
                reflectiveGenericLifecycleObserver = (InterfaceC0500e) interfaceC0501f;
            } else {
                Class<?> cls = interfaceC0501f.getClass();
                if (C0505j.m1906c(cls) == 2) {
                    List<Constructor<? extends InterfaceC0498c>> list = C0505j.f3196b.get(cls);
                    if (list.size() == 1) {
                        reflectiveGenericLifecycleObserver = new SingleGeneratedAdapterObserver(C0505j.m1904a(list.get(0), interfaceC0501f));
                    } else {
                        InterfaceC0498c[] interfaceC0498cArr = new InterfaceC0498c[list.size()];
                        for (int i = 0; i < list.size(); i++) {
                            interfaceC0498cArr[i] = C0505j.m1904a(list.get(i), interfaceC0501f);
                        }
                        reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(interfaceC0498cArr);
                    }
                } else {
                    reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(interfaceC0501f);
                }
            }
            this.f3194b = reflectiveGenericLifecycleObserver;
            this.f3193a = bVar;
        }

        /* JADX INFO: renamed from: a */
        public void m1903a(InterfaceC0502g interfaceC0502g, AbstractC0499d.a aVar) {
            AbstractC0499d.b bVarM1895c = C0503h.m1895c(aVar);
            this.f3193a = C0503h.m1896e(this.f3193a, bVarM1895c);
            this.f3194b.mo8d(interfaceC0502g, aVar);
            this.f3193a = bVarM1895c;
        }
    }

    public C0503h(InterfaceC0502g interfaceC0502g) {
        this.f3188c = new WeakReference<>(interfaceC0502g);
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC0499d.b m1895c(AbstractC0499d.a aVar) {
        int iOrdinal = aVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    return AbstractC0499d.b.RESUMED;
                }
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        if (iOrdinal == 5) {
                            return AbstractC0499d.b.DESTROYED;
                        }
                        throw new IllegalArgumentException("Unexpected event value " + aVar);
                    }
                }
            }
            return AbstractC0499d.b.STARTED;
        }
        return AbstractC0499d.b.CREATED;
    }

    /* JADX INFO: renamed from: e */
    public static AbstractC0499d.b m1896e(AbstractC0499d.b bVar, AbstractC0499d.b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    /* JADX INFO: renamed from: i */
    public static AbstractC0499d.a m1897i(AbstractC0499d.b bVar) {
        int iOrdinal = bVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return AbstractC0499d.a.ON_CREATE;
        }
        if (iOrdinal == 2) {
            return AbstractC0499d.a.ON_START;
        }
        if (iOrdinal == 3) {
            return AbstractC0499d.a.ON_RESUME;
        }
        if (iOrdinal == 4) {
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException("Unexpected state value " + bVar);
    }

    @Override // p006b.p061o.AbstractC0499d
    /* JADX INFO: renamed from: a */
    public void mo1894a(InterfaceC0501f interfaceC0501f) {
        InterfaceC0502g interfaceC0502g;
        AbstractC0499d.b bVar = this.f3187b;
        AbstractC0499d.b bVar2 = AbstractC0499d.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = AbstractC0499d.b.INITIALIZED;
        }
        a aVar = new a(interfaceC0501f, bVar2);
        if (this.f3186a.mo1186d(interfaceC0501f, aVar) == null && (interfaceC0502g = this.f3188c.get()) != null) {
            boolean z = this.f3189d != 0 || this.f3190e;
            AbstractC0499d.b bVarM1898b = m1898b(interfaceC0501f);
            this.f3189d++;
            while (aVar.f3193a.compareTo(bVarM1898b) < 0 && this.f3186a.f2103f.containsKey(interfaceC0501f)) {
                this.f3192g.add(aVar.f3193a);
                aVar.m1903a(interfaceC0502g, m1897i(aVar.f3193a));
                m1901g();
                bVarM1898b = m1898b(interfaceC0501f);
            }
            if (!z) {
                m1902h();
            }
            this.f3189d--;
        }
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC0499d.b m1898b(InterfaceC0501f interfaceC0501f) {
        C0302a<InterfaceC0501f, a> c0302a = this.f3186a;
        AbstractC0499d.b bVar = null;
        C0303b.c<InterfaceC0501f, a> cVar = c0302a.f2103f.containsKey(interfaceC0501f) ? c0302a.f2103f.get(interfaceC0501f).f2111e : null;
        AbstractC0499d.b bVar2 = cVar != null ? cVar.f2109c.f3193a : null;
        if (!this.f3192g.isEmpty()) {
            ArrayList<AbstractC0499d.b> arrayList = this.f3192g;
            bVar = arrayList.get(arrayList.size() - 1);
        }
        return m1896e(m1896e(this.f3187b, bVar2), bVar);
    }

    /* JADX INFO: renamed from: d */
    public void m1899d(AbstractC0499d.a aVar) {
        m1900f(m1895c(aVar));
    }

    /* JADX INFO: renamed from: f */
    public final void m1900f(AbstractC0499d.b bVar) {
        if (this.f3187b == bVar) {
            return;
        }
        this.f3187b = bVar;
        if (this.f3190e || this.f3189d != 0) {
            this.f3191f = true;
            return;
        }
        this.f3190e = true;
        m1902h();
        this.f3190e = false;
    }

    /* JADX INFO: renamed from: g */
    public final void m1901g() {
        ArrayList<AbstractC0499d.b> arrayList = this.f3192g;
        arrayList.remove(arrayList.size() - 1);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    /* JADX INFO: renamed from: h */
    public final void m1902h() {
        boolean z;
        AbstractC0499d.a aVar;
        InterfaceC0502g interfaceC0502g = this.f3188c.get();
        if (interfaceC0502g == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            C0302a<InterfaceC0501f, a> c0302a = this.f3186a;
            if (c0302a.f2107e == 0) {
                z = true;
            } else {
                AbstractC0499d.b bVar = c0302a.f2104b.f2109c.f3193a;
                AbstractC0499d.b bVar2 = c0302a.f2105c.f2109c.f3193a;
                if (bVar == bVar2 && this.f3187b == bVar2) {
                    z = true;
                } else {
                    z = false;
                }
            }
            this.f3191f = false;
            if (z) {
                return;
            }
            if (this.f3187b.compareTo(c0302a.f2104b.f2109c.f3193a) < 0) {
                C0302a<InterfaceC0501f, a> c0302a2 = this.f3186a;
                C0303b.b bVar3 = new C0303b.b(c0302a2.f2105c, c0302a2.f2104b);
                c0302a2.f2106d.put(bVar3, Boolean.FALSE);
                while (bVar3.hasNext() && !this.f3191f) {
                    Map.Entry entry = (Map.Entry) bVar3.next();
                    a aVar2 = (a) entry.getValue();
                    while (aVar2.f3193a.compareTo(this.f3187b) > 0 && !this.f3191f && this.f3186a.contains((InterfaceC0501f) entry.getKey())) {
                        AbstractC0499d.b bVar4 = aVar2.f3193a;
                        int iOrdinal = bVar4.ordinal();
                        if (iOrdinal == 0) {
                            throw new IllegalArgumentException();
                        }
                        if (iOrdinal == 1) {
                            throw new IllegalArgumentException();
                        }
                        if (iOrdinal == 2) {
                            aVar = AbstractC0499d.a.ON_DESTROY;
                        } else if (iOrdinal == 3) {
                            aVar = AbstractC0499d.a.ON_STOP;
                        } else {
                            if (iOrdinal != 4) {
                                throw new IllegalArgumentException("Unexpected state value " + bVar4);
                            }
                            aVar = AbstractC0499d.a.ON_PAUSE;
                        }
                        this.f3192g.add(m1895c(aVar));
                        aVar2.m1903a(interfaceC0502g, aVar);
                        m1901g();
                    }
                }
            }
            C0303b.c<InterfaceC0501f, a> cVar = this.f3186a.f2105c;
            if (!this.f3191f && cVar != null && this.f3187b.compareTo(cVar.f2109c.f3193a) > 0) {
                C0303b<InterfaceC0501f, a>.d dVarM1188b = this.f3186a.m1188b();
                while (dVarM1188b.hasNext() && !this.f3191f) {
                    Map.Entry entry2 = (Map.Entry) dVarM1188b.next();
                    a aVar3 = (a) entry2.getValue();
                    while (aVar3.f3193a.compareTo(this.f3187b) < 0 && !this.f3191f && this.f3186a.contains((InterfaceC0501f) entry2.getKey())) {
                        this.f3192g.add(aVar3.f3193a);
                        aVar3.m1903a(interfaceC0502g, m1897i(aVar3.f3193a));
                        m1901g();
                    }
                }
            }
        }
    }
}
