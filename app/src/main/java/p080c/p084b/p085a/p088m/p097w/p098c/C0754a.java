package p080c.p084b.p085a.p088m.p097w.p098c;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import p080c.p084b.p085a.p088m.C0647o;
import p080c.p084b.p085a.p088m.InterfaceC0649q;
import p080c.p084b.p085a.p088m.p091u.InterfaceC0719w;

/* JADX INFO: renamed from: c.b.a.m.w.c.a */
/* JADX INFO: loaded from: classes.dex */
public class C0754a<DataType> implements InterfaceC0649q<DataType, BitmapDrawable> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0649q<DataType, Bitmap> f4404a;

    /* JADX INFO: renamed from: b */
    public final Resources f4405b;

    public C0754a(Resources resources, InterfaceC0649q<DataType, Bitmap> interfaceC0649q) {
        this.f4405b = resources;
        this.f4404a = interfaceC0649q;
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0649q
    /* JADX INFO: renamed from: a */
    public InterfaceC0719w<BitmapDrawable> mo2287a(DataType datatype, int i, int i2, C0647o c0647o) {
        return C0777u.m2489f(this.f4405b, this.f4404a.mo2287a(datatype, i, i2, c0647o));
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0649q
    /* JADX INFO: renamed from: b */
    public boolean mo2288b(DataType datatype, C0647o c0647o) {
        return this.f4404a.mo2288b(datatype, c0647o);
    }
}
