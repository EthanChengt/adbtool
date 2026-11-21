package p006b.p008b.p016h;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import p006b.p008b.p016h.p017i.C0229g;
import p006b.p008b.p018i.C0248c;

/* JADX INFO: renamed from: b.b.h.d */
/* JADX INFO: loaded from: classes.dex */
public class C0218d extends AbstractC0215a implements C0229g.a {

    /* JADX INFO: renamed from: d */
    public Context f1488d;

    /* JADX INFO: renamed from: e */
    public ActionBarContextView f1489e;

    /* JADX INFO: renamed from: f */
    public AbstractC0215a.a f1490f;

    /* JADX INFO: renamed from: g */
    public WeakReference<View> f1491g;

    /* JADX INFO: renamed from: h */
    public boolean f1492h;

    /* JADX INFO: renamed from: i */
    public C0229g f1493i;

    public C0218d(Context context, ActionBarContextView actionBarContextView, AbstractC0215a.a aVar, boolean z) {
        this.f1488d = context;
        this.f1489e = actionBarContextView;
        this.f1490f = aVar;
        C0229g c0229g = new C0229g(actionBarContextView.getContext());
        c0229g.f1641l = 1;
        this.f1493i = c0229g;
        c0229g.f1634e = this;
    }

    @Override // p006b.p008b.p016h.p017i.C0229g.a
    /* JADX INFO: renamed from: a */
    public boolean mo62a(C0229g c0229g, MenuItem menuItem) {
        return this.f1490f.mo846b(this, menuItem);
    }

    @Override // p006b.p008b.p016h.p017i.C0229g.a
    /* JADX INFO: renamed from: b */
    public void mo63b(C0229g c0229g) {
        mo875i();
        C0248c c0248c = this.f1489e.f1741e;
        if (c0248c != null) {
            c0248c.m1021q();
        }
    }

    @Override // p006b.p008b.p016h.AbstractC0215a
    /* JADX INFO: renamed from: c */
    public void mo869c() {
        if (this.f1492h) {
            return;
        }
        this.f1492h = true;
        this.f1489e.sendAccessibilityEvent(32);
        this.f1490f.mo848d(this);
    }

    @Override // p006b.p008b.p016h.AbstractC0215a
    /* JADX INFO: renamed from: d */
    public View mo870d() {
        WeakReference<View> weakReference = this.f1491g;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // p006b.p008b.p016h.AbstractC0215a
    /* JADX INFO: renamed from: e */
    public Menu mo871e() {
        return this.f1493i;
    }

    @Override // p006b.p008b.p016h.AbstractC0215a
    /* JADX INFO: renamed from: f */
    public MenuInflater mo872f() {
        return new C0220f(this.f1489e.getContext());
    }

    @Override // p006b.p008b.p016h.AbstractC0215a
    /* JADX INFO: renamed from: g */
    public CharSequence mo873g() {
        return this.f1489e.getSubtitle();
    }

    @Override // p006b.p008b.p016h.AbstractC0215a
    /* JADX INFO: renamed from: h */
    public CharSequence mo874h() {
        return this.f1489e.getTitle();
    }

    @Override // p006b.p008b.p016h.AbstractC0215a
    /* JADX INFO: renamed from: i */
    public void mo875i() {
        this.f1490f.mo845a(this, this.f1493i);
    }

    @Override // p006b.p008b.p016h.AbstractC0215a
    /* JADX INFO: renamed from: j */
    public boolean mo876j() {
        return this.f1489e.f187s;
    }

    @Override // p006b.p008b.p016h.AbstractC0215a
    /* JADX INFO: renamed from: k */
    public void mo877k(View view) {
        this.f1489e.setCustomView(view);
        this.f1491g = view != null ? new WeakReference<>(view) : null;
    }

    @Override // p006b.p008b.p016h.AbstractC0215a
    /* JADX INFO: renamed from: l */
    public void mo878l(int i) {
        this.f1489e.setSubtitle(this.f1488d.getString(i));
    }

    @Override // p006b.p008b.p016h.AbstractC0215a
    /* JADX INFO: renamed from: m */
    public void mo879m(CharSequence charSequence) {
        this.f1489e.setSubtitle(charSequence);
    }

    @Override // p006b.p008b.p016h.AbstractC0215a
    /* JADX INFO: renamed from: n */
    public void mo880n(int i) {
        this.f1489e.setTitle(this.f1488d.getString(i));
    }

    @Override // p006b.p008b.p016h.AbstractC0215a
    /* JADX INFO: renamed from: o */
    public void mo881o(CharSequence charSequence) {
        this.f1489e.setTitle(charSequence);
    }

    @Override // p006b.p008b.p016h.AbstractC0215a
    /* JADX INFO: renamed from: p */
    public void mo882p(boolean z) {
        this.f1483c = z;
        this.f1489e.setTitleOptional(z);
    }
}
