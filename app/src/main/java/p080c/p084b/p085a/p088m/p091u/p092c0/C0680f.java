package p080c.p084b.p085a.p088m.p091u.p092c0;

/* JADX INFO: renamed from: c.b.a.m.u.c0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0680f implements InterfaceC0675a<byte[]> {
    @Override // p080c.p084b.p085a.p088m.p091u.p092c0.InterfaceC0675a
    /* JADX INFO: renamed from: a */
    public String mo2317a() {
        return "ByteArrayPool";
    }

    @Override // p080c.p084b.p085a.p088m.p091u.p092c0.InterfaceC0675a
    /* JADX INFO: renamed from: b */
    public int mo2318b(byte[] bArr) {
        return bArr.length;
    }

    @Override // p080c.p084b.p085a.p088m.p091u.p092c0.InterfaceC0675a
    /* JADX INFO: renamed from: c */
    public int mo2319c() {
        return 1;
    }

    @Override // p080c.p084b.p085a.p088m.p091u.p092c0.InterfaceC0675a
    public byte[] newArray(int i) {
        return new byte[i];
    }
}
