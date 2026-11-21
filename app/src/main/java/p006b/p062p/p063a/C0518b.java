package p006b.p062p.p063a;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Objects;
import p006b.p025e.C0321i;
import p006b.p032h.p033b.C0360f;
import p006b.p061o.AbstractC0511p;
import p006b.p061o.AbstractC0513r;
import p006b.p061o.C0507l;
import p006b.p061o.C0514s;
import p006b.p061o.C0515t;
import p006b.p061o.InterfaceC0502g;
import p006b.p061o.InterfaceC0508m;
import p006b.p061o.InterfaceC0512q;
import c.a.a.a.a;

/* JADX INFO: renamed from: b.p.a.b */
/* JADX INFO: loaded from: classes.dex */
public class C0518b extends AbstractC0517a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0502g f3199a;

    /* JADX INFO: renamed from: b */
    public final b f3200b;

    /* JADX WARN: Unexpected interfaces in signature: [java.lang.Object<D>] */
    /* JADX INFO: renamed from: b.p.a.b$a */
    public static class a<D> extends C0507l<D> {
        @Override // androidx.lifecycle.LiveData
        /* JADX INFO: renamed from: d */
        public void mo344d() {
            throw null;
        }

        @Override // androidx.lifecycle.LiveData
        /* JADX INFO: renamed from: e */
        public void mo345e() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        /* JADX INFO: renamed from: f */
        public void mo346f(InterfaceC0508m<? super D> interfaceC0508m) {
            super.mo346f(interfaceC0508m);
        }

        @Override // p006b.p061o.C0507l
        /* JADX INFO: renamed from: g */
        public void mo1907g(D d) {
            super.mo1907g(d);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(0);
            sb.append(" : ");
            C0360f.m1439c(null, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: b.p.a.b$b */
    public static class b extends AbstractC0511p {

        /* JADX INFO: renamed from: c */
        public static final InterfaceC0512q f3201c = new a();

        /* JADX INFO: renamed from: b */
        public C0321i<a> f3202b = new C0321i<>(10);

        /* JADX INFO: renamed from: b.p.a.b$b$a */
        public static class a implements InterfaceC0512q {
            /* JADX INFO: renamed from: a */
            public <T extends AbstractC0511p> T m1916a(Class<T> cls) {
                return new b();
            }
        }

        @Override // p006b.p061o.AbstractC0511p
        /* JADX INFO: renamed from: a */
        public void mo1866a() {
            if (this.f3202b.m1285i() > 0) {
                Objects.requireNonNull(this.f3202b.m1286j(0));
                throw null;
            }
            C0321i<a> c0321i = this.f3202b;
            int i = c0321i.f2202e;
            Object[] objArr = c0321i.f2201d;
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = null;
            }
            c0321i.f2202e = 0;
            c0321i.f2199b = false;
        }
    }

    public C0518b(InterfaceC0502g interfaceC0502g, C0515t c0515t) {
        this.f3199a = interfaceC0502g;
        Object obj = b.f3201c;
        String canonicalName = b.class.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        String strM2201o = a.m2201o("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
        AbstractC0511p abstractC0511pM1912a = c0515t.f3198a.get(strM2201o);
        if (!b.class.isInstance(abstractC0511pM1912a)) {
            abstractC0511pM1912a = obj instanceof AbstractC0513r ? ((AbstractC0513r) obj).m1912a(strM2201o, b.class) : ((b.a) obj).m1916a(b.class);
            AbstractC0511p abstractC0511pPut = c0515t.f3198a.put(strM2201o, abstractC0511pM1912a);
            if (abstractC0511pPut != null) {
                abstractC0511pPut.mo1866a();
            }
        } else if (obj instanceof C0514s) {
        }
        this.f3200b = (b) abstractC0511pM1912a;
    }

    @Override // p006b.p062p.p063a.AbstractC0517a
    @Deprecated
    /* JADX INFO: renamed from: a */
    public void mo1915a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        b bVar = this.f3200b;
        if (bVar.f3202b.m1285i() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            if (bVar.f3202b.m1285i() <= 0) {
                return;
            }
            a aVarM1286j = bVar.f3202b.m1286j(0);
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(bVar.f3202b.m1282f(0));
            printWriter.print(": ");
            printWriter.println(aVarM1286j.toString());
            printWriter.print(str2);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mArgs=");
            printWriter.println((Object) null);
            printWriter.print(str2);
            printWriter.print("mLoader=");
            printWriter.println((Object) null);
            throw null;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C0360f.m1439c(this.f3199a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
