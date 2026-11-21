package p080c.p084b.p085a.p088m.p097w.p100e;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.Objects;
import p080c.p084b.p085a.p088m.p091u.InterfaceC0715s;
import p080c.p084b.p085a.p088m.p091u.InterfaceC0719w;
import p080c.p084b.p085a.p088m.p097w.p102g.C0794c;

/* JADX INFO: renamed from: c.b.a.m.w.e.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0786b<T extends Drawable> implements InterfaceC0719w<T>, InterfaceC0715s {

    /* JADX INFO: renamed from: b */
    public final T f4500b;

    public AbstractC0786b(T t) {
        Objects.requireNonNull(t, "Argument must not be null");
        this.f4500b = t;
    }

    @Override // p080c.p084b.p085a.p088m.p091u.InterfaceC0715s
    /* JADX INFO: renamed from: a */
    public void mo2420a() {
        Bitmap bitmapM2503b;
        T t = this.f4500b;
        if (t instanceof BitmapDrawable) {
            bitmapM2503b = ((BitmapDrawable) t).getBitmap();
        } else if (!(t instanceof C0794c)) {
            return;
        } else {
            bitmapM2503b = ((C0794c) t).m2503b();
        }
        bitmapM2503b.prepareToDraw();
    }

    @Override // p080c.p084b.p085a.p088m.p091u.InterfaceC0719w
    /* JADX INFO: renamed from: b */
    public Object mo2409b() {
        Drawable.ConstantState constantState = this.f4500b.getConstantState();
        return constantState == null ? this.f4500b : constantState.newDrawable();
    }
}
