package p080c.p084b.p085a.p088m.p095v;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Objects;
import p080c.p084b.p085a.p088m.InterfaceC0645m;

/* JADX INFO: renamed from: c.b.a.m.v.g */
/* JADX INFO: loaded from: classes.dex */
public class C0729g implements InterfaceC0645m {

    /* JADX INFO: renamed from: b */
    public final InterfaceC0730h f4303b;

    /* JADX INFO: renamed from: c */
    public final URL f4304c;

    /* JADX INFO: renamed from: d */
    public final String f4305d;

    /* JADX INFO: renamed from: e */
    public String f4306e;

    /* JADX INFO: renamed from: f */
    public URL f4307f;

    /* JADX INFO: renamed from: g */
    public volatile byte[] f4308g;

    /* JADX INFO: renamed from: h */
    public int f4309h;

    public C0729g(String str) {
        InterfaceC0730h interfaceC0730h = InterfaceC0730h.f4310a;
        this.f4304c = null;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.f4305d = str;
        Objects.requireNonNull(interfaceC0730h, "Argument must not be null");
        this.f4303b = interfaceC0730h;
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0645m
    /* JADX INFO: renamed from: a */
    public void mo2282a(MessageDigest messageDigest) {
        if (this.f4308g == null) {
            this.f4308g = m2436c().getBytes(InterfaceC0645m.f3937a);
        }
        messageDigest.update(this.f4308g);
    }

    /* JADX INFO: renamed from: c */
    public String m2436c() {
        String str = this.f4305d;
        if (str != null) {
            return str;
        }
        URL url = this.f4304c;
        Objects.requireNonNull(url, "Argument must not be null");
        return url.toString();
    }

    /* JADX INFO: renamed from: d */
    public URL m2437d() {
        if (this.f4307f == null) {
            if (TextUtils.isEmpty(this.f4306e)) {
                String string = this.f4305d;
                if (TextUtils.isEmpty(string)) {
                    URL url = this.f4304c;
                    Objects.requireNonNull(url, "Argument must not be null");
                    string = url.toString();
                }
                this.f4306e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.f4307f = new URL(this.f4306e);
        }
        return this.f4307f;
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0645m
    public boolean equals(Object obj) {
        if (!(obj instanceof C0729g)) {
            return false;
        }
        C0729g c0729g = (C0729g) obj;
        return m2436c().equals(c0729g.m2436c()) && this.f4303b.equals(c0729g.f4303b);
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0645m
    public int hashCode() {
        if (this.f4309h == 0) {
            int iHashCode = m2436c().hashCode();
            this.f4309h = iHashCode;
            this.f4309h = this.f4303b.hashCode() + (iHashCode * 31);
        }
        return this.f4309h;
    }

    public String toString() {
        return m2436c();
    }

    public C0729g(URL url) {
        InterfaceC0730h interfaceC0730h = InterfaceC0730h.f4310a;
        Objects.requireNonNull(url, "Argument must not be null");
        this.f4304c = url;
        this.f4305d = null;
        Objects.requireNonNull(interfaceC0730h, "Argument must not be null");
        this.f4303b = interfaceC0730h;
    }
}
