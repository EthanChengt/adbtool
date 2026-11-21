package p080c.p084b.p085a.p088m.p097w.p099d;

import java.util.Objects;
import p080c.p084b.p085a.p088m.p091u.InterfaceC0719w;

/* JADX INFO: renamed from: c.b.a.m.w.d.b */
/* JADX INFO: loaded from: classes.dex */
public class C0784b implements InterfaceC0719w<byte[]> {

    /* JADX INFO: renamed from: b */
    public final byte[] f4498b;

    public C0784b(byte[] bArr) {
        Objects.requireNonNull(bArr, "Argument must not be null");
        this.f4498b = bArr;
    }

    @Override // p080c.p084b.p085a.p088m.p091u.InterfaceC0719w
    /* JADX INFO: renamed from: b */
    public byte[] mo2409b() {
        return this.f4498b;
    }

    @Override // p080c.p084b.p085a.p088m.p091u.InterfaceC0719w
    /* JADX INFO: renamed from: c */
    public int mo2410c() {
        return this.f4498b.length;
    }

    @Override // p080c.p084b.p085a.p088m.p091u.InterfaceC0719w
    /* JADX INFO: renamed from: d */
    public Class<byte[]> mo2411d() {
        return byte[].class;
    }

    @Override // p080c.p084b.p085a.p088m.p091u.InterfaceC0719w
    /* JADX INFO: renamed from: e */
    public void mo2412e() {
    }
}
