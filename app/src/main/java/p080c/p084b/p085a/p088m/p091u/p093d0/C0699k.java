package p080c.p084b.p085a.p088m.p091u.p093d0;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;
import p006b.p032h.p043i.InterfaceC0403c;
import p080c.p084b.p085a.p088m.InterfaceC0645m;
import p080c.p084b.p085a.p111s.C0872g;
import p080c.p084b.p085a.p111s.C0875j;
import p080c.p084b.p085a.p111s.p112k.AbstractC0879d;
import p080c.p084b.p085a.p111s.p112k.C0876a;

/* JADX INFO: renamed from: c.b.a.m.u.d0.k */
/* JADX INFO: loaded from: classes.dex */
public class C0699k {

    /* JADX INFO: renamed from: a */
    public final C0872g<InterfaceC0645m, String> f4076a = new C0872g<>(1000);

    /* JADX INFO: renamed from: b */
    public final InterfaceC0403c<b> f4077b = C0876a.m2619a(10, new a(this));

    /* JADX INFO: renamed from: c.b.a.m.u.d0.k$a */
    public class a implements C0876a.b<b> {
        public a(C0699k c0699k) {
        }

        @Override // p080c.p084b.p085a.p111s.p112k.C0876a.b
        /* JADX INFO: renamed from: a */
        public b mo2363a() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: renamed from: c.b.a.m.u.d0.k$b */
    public static final class b implements C0876a.d {

        /* JADX INFO: renamed from: b */
        public final MessageDigest f4078b;

        /* JADX INFO: renamed from: c */
        public final AbstractC0879d f4079c = new AbstractC0879d.b();

        public b(MessageDigest messageDigest) {
            this.f4078b = messageDigest;
        }

        @Override // p080c.p084b.p085a.p111s.p112k.C0876a.d
        /* JADX INFO: renamed from: a */
        public AbstractC0879d mo2364a() {
            return this.f4079c;
        }
    }

    /* JADX INFO: renamed from: a */
    public String m2362a(InterfaceC0645m interfaceC0645m) {
        String strM2604a;
        synchronized (this.f4076a) {
            strM2604a = this.f4076a.m2604a(interfaceC0645m);
        }
        if (strM2604a == null) {
            b bVarMo1537b = this.f4077b.mo1537b();
            Objects.requireNonNull(bVarMo1537b, "Argument must not be null");
            b bVar = bVarMo1537b;
            try {
                interfaceC0645m.mo2282a(bVar.f4078b);
                byte[] bArrDigest = bVar.f4078b.digest();
                char[] cArr = C0875j.f4743b;
                synchronized (cArr) {
                    for (int i = 0; i < bArrDigest.length; i++) {
                        int i2 = bArrDigest[i] & 255;
                        int i3 = i * 2;
                        char[] cArr2 = C0875j.f4742a;
                        cArr[i3] = cArr2[i2 >>> 4];
                        cArr[i3 + 1] = cArr2[i2 & 15];
                    }
                    strM2604a = new String(cArr);
                }
                this.f4077b.mo1536a(bVar);
            } catch (Throwable th) {
                this.f4077b.mo1536a(bVar);
                throw th;
            }
        }
        synchronized (this.f4076a) {
            this.f4076a.m2605d(interfaceC0645m, strM2604a);
        }
        return strM2604a;
    }
}
