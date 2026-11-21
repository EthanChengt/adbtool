package p080c.p084b.p085a.p088m.p091u.p093d0;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import p080c.p084b.p085a.p086k.C0625a;
import p080c.p084b.p085a.p088m.InterfaceC0645m;
import p080c.p084b.p085a.p088m.p091u.C0702f;

/* JADX INFO: renamed from: c.b.a.m.u.d0.e */
/* JADX INFO: loaded from: classes.dex */
public class C0693e implements InterfaceC0689a {

    /* JADX INFO: renamed from: b */
    public final File f4059b;

    /* JADX INFO: renamed from: c */
    public final long f4060c;

    /* JADX INFO: renamed from: e */
    public C0625a f4062e;

    /* JADX INFO: renamed from: d */
    public final C0691c f4061d = new C0691c();

    /* JADX INFO: renamed from: a */
    public final C0699k f4058a = new C0699k();

    @Deprecated
    public C0693e(File file, long j) {
        this.f4059b = file;
        this.f4060c = j;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p080c.p084b.p085a.p088m.p091u.p093d0.InterfaceC0689a
    /* JADX INFO: renamed from: a */
    public void mo2355a(InterfaceC0645m interfaceC0645m, InterfaceC0689a.b bVar) {
        C0691c.a aVarPoll;
        String strM2362a = this.f4058a.m2362a(interfaceC0645m);
        C0691c c0691c = this.f4061d;
        synchronized (c0691c) {
            aVarPoll = c0691c.f4051a.get(strM2362a);
            if (aVarPoll == null) {
                C0691c.b bVar2 = c0691c.f4052b;
                synchronized (bVar2.f4055a) {
                    aVarPoll = bVar2.f4055a.poll();
                }
                if (aVarPoll == null) {
                    aVarPoll = new C0691c.a();
                }
                c0691c.f4051a.put(strM2362a, aVarPoll);
            }
            aVarPoll.f4054b++;
        }
        aVarPoll.f4053a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + strM2362a + " for for Key: " + interfaceC0645m);
            }
            try {
                C0625a c0625aM2358c = m2358c();
                if (c0625aM2358c.m2248g(strM2362a) == null) {
                    C0625a.c cVarM2247e = c0625aM2358c.m2247e(strM2362a);
                    if (cVarM2247e == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: " + strM2362a);
                    }
                    try {
                        C0702f c0702f = (C0702f) bVar;
                        if (c0702f.f4091a.mo2279a(c0702f.f4092b, cVarM2247e.m2256b(0), c0702f.f4093c)) {
                            C0625a.m2240a(C0625a.this, cVarM2247e, true);
                            cVarM2247e.f3851c = true;
                        }
                        if (!cVarM2247e.f3851c) {
                            try {
                                cVarM2247e.m2255a();
                            } catch (IOException unused) {
                            }
                        }
                    } catch (Throwable th) {
                        if (!cVarM2247e.f3851c) {
                            try {
                                cVarM2247e.m2255a();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                }
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            }
            this.f4061d.m2357a(strM2362a);
        } catch (Throwable th2) {
            this.f4061d.m2357a(strM2362a);
            throw th2;
        }
    }

    @Override // p080c.p084b.p085a.p088m.p091u.p093d0.InterfaceC0689a
    /* JADX INFO: renamed from: b */
    public File mo2356b(InterfaceC0645m interfaceC0645m) {
        String strM2362a = this.f4058a.m2362a(interfaceC0645m);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + strM2362a + " for for Key: " + interfaceC0645m);
        }
        try {
            C0625a.e eVarM2248g = m2358c().m2248g(strM2362a);
            if (eVarM2248g != null) {
                return eVarM2248g.f3861a[0];
            }
            return null;
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized C0625a m2358c() {
        if (this.f4062e == null) {
            this.f4062e = C0625a.m2244i(this.f4059b, 1, 1, this.f4060c);
        }
        return this.f4062e;
    }
}
