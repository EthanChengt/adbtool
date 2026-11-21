package p080c.p084b.p085a.p107q.p108j;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import p080c.p084b.p085a.p107q.p109k.InterfaceC0860b;

/* JADX WARN: Unexpected interfaces in signature: [java.lang.Object] */
/* JADX INFO: renamed from: c.b.a.q.j.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0854e<Z> extends AbstractC0858i<ImageView, Z> {

    /* JADX INFO: renamed from: d */
    public Animatable f4701d;

    public AbstractC0854e(ImageView imageView) {
        super(imageView);
    }

    @Override // p080c.p084b.p085a.p107q.p108j.InterfaceC0857h
    /* JADX INFO: renamed from: b */
    public void mo2588b(Drawable drawable) {
        m2593m(null);
        ((ImageView) this.f4702b).setImageDrawable(drawable);
    }

    @Override // p080c.p084b.p085a.p107q.p108j.InterfaceC0857h
    /* JADX INFO: renamed from: c */
    public void mo2510c(Z z, InterfaceC0860b<? super Z> interfaceC0860b) {
        m2593m(z);
    }

    @Override // p080c.p084b.p085a.p107q.p108j.InterfaceC0857h
    /* JADX INFO: renamed from: d */
    public void mo2589d(Drawable drawable) {
        m2593m(null);
        ((ImageView) this.f4702b).setImageDrawable(drawable);
    }

    @Override // p080c.p084b.p085a.p104n.InterfaceC0821m
    /* JADX INFO: renamed from: e */
    public void mo2229e() {
        Animatable animatable = this.f4701d;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // p080c.p084b.p085a.p107q.p108j.InterfaceC0857h
    /* JADX INFO: renamed from: g */
    public void mo2511g(Drawable drawable) {
        this.f4703c.m2594a();
        Animatable animatable = this.f4701d;
        if (animatable != null) {
            animatable.stop();
        }
        m2593m(null);
        ((ImageView) this.f4702b).setImageDrawable(drawable);
    }

    @Override // p080c.p084b.p085a.p104n.InterfaceC0821m
    /* JADX INFO: renamed from: i */
    public void mo2230i() {
        Animatable animatable = this.f4701d;
        if (animatable != null) {
            animatable.start();
        }
    }

    /* JADX INFO: renamed from: l */
    public abstract void mo2586l(Z z);

    /* JADX INFO: renamed from: m */
    public final void m2593m(Z z) {
        mo2586l(z);
        if (!(z instanceof Animatable)) {
            this.f4701d = null;
            return;
        }
        Animatable animatable = (Animatable) z;
        this.f4701d = animatable;
        animatable.start();
    }
}
