package p080c.p084b.p085a.p088m.p097w.p098c;

import android.graphics.Bitmap;
import p080c.p084b.p085a.p088m.C0647o;
import p080c.p084b.p085a.p088m.InterfaceC0649q;
import p080c.p084b.p085a.p088m.p091u.InterfaceC0719w;
import p080c.p084b.p085a.p111s.C0875j;

/* JADX INFO: renamed from: c.b.a.m.w.c.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0755a0 implements InterfaceC0649q<Bitmap, Bitmap> {

    /* JADX INFO: renamed from: c.b.a.m.w.c.a0$a */
    public static final class a implements InterfaceC0719w<Bitmap> {

        /* JADX INFO: renamed from: b */
        public final Bitmap f4406b;

        public a(Bitmap bitmap) {
            this.f4406b = bitmap;
        }

        @Override // p080c.p084b.p085a.p088m.p091u.InterfaceC0719w
        /* JADX INFO: renamed from: b */
        public Bitmap mo2409b() {
            return this.f4406b;
        }

        @Override // p080c.p084b.p085a.p088m.p091u.InterfaceC0719w
        /* JADX INFO: renamed from: c */
        public int mo2410c() {
            return C0875j.m2612d(this.f4406b);
        }

        @Override // p080c.p084b.p085a.p088m.p091u.InterfaceC0719w
        /* JADX INFO: renamed from: d */
        public Class<Bitmap> mo2411d() {
            return Bitmap.class;
        }

        @Override // p080c.p084b.p085a.p088m.p091u.InterfaceC0719w
        /* JADX INFO: renamed from: e */
        public void mo2412e() {
        }
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0649q
    /* JADX INFO: renamed from: a */
    public InterfaceC0719w<Bitmap> mo2287a(Bitmap bitmap, int i, int i2, C0647o c0647o) {
        return new a(bitmap);
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0649q
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo2288b(Bitmap bitmap, C0647o c0647o) {
        return true;
    }
}
