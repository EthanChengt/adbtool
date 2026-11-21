package p080c.p084b.p085a.p088m;

import android.text.TextUtils;
import java.security.MessageDigest;
import java.util.Objects;
import c.a.a.a.a;

/* JADX INFO: renamed from: c.b.a.m.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0646n<T> {

    /* JADX INFO: renamed from: e */
    public static final b<Object> f3938e = new a();

    /* JADX INFO: renamed from: a */
    public final T f3939a;

    /* JADX INFO: renamed from: b */
    public final b<T> f3940b;

    /* JADX INFO: renamed from: c */
    public final String f3941c;

    /* JADX INFO: renamed from: d */
    public volatile byte[] f3942d;

    /* JADX INFO: renamed from: c.b.a.m.n$a */
    public class a implements b<Object> {
        @Override // p080c.p084b.p085a.p088m.C0646n.b
        /* JADX INFO: renamed from: a */
        public void mo2284a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    /* JADX INFO: renamed from: c.b.a.m.n$b */
    public interface b<T> {
        /* JADX INFO: renamed from: a */
        void mo2284a(byte[] bArr, T t, MessageDigest messageDigest);
    }

    public C0646n(String str, T t, b<T> bVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.f3941c = str;
        this.f3939a = t;
        Objects.requireNonNull(bVar, "Argument must not be null");
        this.f3940b = bVar;
    }

    /* JADX INFO: renamed from: a */
    public static <T> C0646n<T> m2283a(String str, T t) {
        return new C0646n<>(str, t, f3938e);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0646n) {
            return this.f3941c.equals(((C0646n) obj).f3941c);
        }
        return false;
    }

    public int hashCode() {
        return this.f3941c.hashCode();
    }

    public String toString() {
        StringBuilder sbM2191e = a.m2191e("Option{key='");
        sbM2191e.append(this.f3941c);
        sbM2191e.append('\'');
        sbM2191e.append('}');
        return sbM2191e.toString();
    }
}
