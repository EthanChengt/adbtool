package p080c.p084b.p085a.p088m.p097w.p101f;

import java.io.File;
import java.util.Objects;
import p080c.p084b.p085a.p088m.p091u.InterfaceC0719w;

/* JADX WARN: Incorrect class signature: super class is equals to this class */
/* JADX INFO: renamed from: c.b.a.m.w.f.b */
/* JADX INFO: loaded from: classes.dex */
public class C0791b implements InterfaceC0719w {

    /* JADX INFO: renamed from: b */
    public final T f4502b;

    /* JADX WARN: Multi-variable type inference failed */
    public C0791b(File file) {
        Objects.requireNonNull(file, "Argument must not be null");
        this.f4502b = file;
    }

    @Override // p080c.p084b.p085a.p088m.p091u.InterfaceC0719w
    /* JADX INFO: renamed from: b */
    public final Object mo2409b() {
        return this.f4502b;
    }

    @Override // p080c.p084b.p085a.p088m.p091u.InterfaceC0719w
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ int mo2410c() {
        return 1;
    }

    @Override // p080c.p084b.p085a.p088m.p091u.InterfaceC0719w
    /* JADX INFO: renamed from: d */
    public Class mo2411d() {
        return this.f4502b.getClass();
    }

    @Override // p080c.p084b.p085a.p088m.p091u.InterfaceC0719w
    /* JADX INFO: renamed from: e */
    public void mo2412e() {
    }
}
