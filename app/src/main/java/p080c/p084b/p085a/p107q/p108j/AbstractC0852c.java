package p080c.p084b.p085a.p107q.p108j;

import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import p080c.p084b.p085a.p107q.C0848h;
import p080c.p084b.p085a.p107q.InterfaceC0843c;
import p080c.p084b.p085a.p111s.C0875j;

/* JADX INFO: renamed from: c.b.a.q.j.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0852c<T> implements InterfaceC0857h<T> {

    /* JADX INFO: renamed from: b */
    public final int f4698b;

    /* JADX INFO: renamed from: c */
    public final int f4699c;

    /* JADX INFO: renamed from: d */
    public InterfaceC0843c f4700d;

    public AbstractC0852c() {
        if (C0875j.m2618j(RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION)) {
            this.f4698b = RecyclerView.UNDEFINED_DURATION;
            this.f4699c = RecyclerView.UNDEFINED_DURATION;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + RecyclerView.UNDEFINED_DURATION + " and height: " + RecyclerView.UNDEFINED_DURATION);
    }

    @Override // p080c.p084b.p085a.p107q.p108j.InterfaceC0857h
    /* JADX INFO: renamed from: a */
    public final void mo2587a(InterfaceC0856g interfaceC0856g) {
    }

    @Override // p080c.p084b.p085a.p107q.p108j.InterfaceC0857h
    /* JADX INFO: renamed from: b */
    public void mo2588b(Drawable drawable) {
    }

    @Override // p080c.p084b.p085a.p107q.p108j.InterfaceC0857h
    /* JADX INFO: renamed from: d */
    public void mo2589d(Drawable drawable) {
    }

    @Override // p080c.p084b.p085a.p104n.InterfaceC0821m
    /* JADX INFO: renamed from: e */
    public void mo2229e() {
    }

    @Override // p080c.p084b.p085a.p107q.p108j.InterfaceC0857h
    /* JADX INFO: renamed from: f */
    public final InterfaceC0843c mo2590f() {
        return this.f4700d;
    }

    @Override // p080c.p084b.p085a.p107q.p108j.InterfaceC0857h
    /* JADX INFO: renamed from: h */
    public final void mo2591h(InterfaceC0856g interfaceC0856g) throws Throwable {
        ((C0848h) interfaceC0856g).mo2574b(this.f4698b, this.f4699c);
    }

    @Override // p080c.p084b.p085a.p104n.InterfaceC0821m
    /* JADX INFO: renamed from: i */
    public void mo2230i() {
    }

    @Override // p080c.p084b.p085a.p107q.p108j.InterfaceC0857h
    /* JADX INFO: renamed from: j */
    public final void mo2592j(InterfaceC0843c interfaceC0843c) {
        this.f4700d = interfaceC0843c;
    }

    @Override // p080c.p084b.p085a.p104n.InterfaceC0821m
    /* JADX INFO: renamed from: k */
    public void mo2231k() {
    }
}
