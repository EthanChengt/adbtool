package p080c.p126d.p127a.p128a.p151u;

import android.graphics.Typeface;
import p080c.p126d.p127a.p128a.p148r.C1265b;
import p080c.p126d.p127a.p128a.p148r.C1266c;

/* JADX INFO: renamed from: c.d.a.a.u.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1282a extends AbstractC1285d {

    /* JADX INFO: renamed from: a */
    public final Typeface f6161a;

    /* JADX INFO: renamed from: b */
    public final a f6162b;

    /* JADX INFO: renamed from: c */
    public boolean f6163c;

    /* JADX INFO: renamed from: c.d.a.a.u.a$a */
    public interface a {
    }

    public C1282a(a aVar, Typeface typeface) {
        this.f6161a = typeface;
        this.f6162b = aVar;
    }

    @Override // p080c.p126d.p127a.p128a.p151u.AbstractC1285d
    /* JADX INFO: renamed from: a */
    public void mo2941a(int i) {
        m2949c(this.f6161a);
    }

    @Override // p080c.p126d.p127a.p128a.p151u.AbstractC1285d
    /* JADX INFO: renamed from: b */
    public void mo2942b(Typeface typeface, boolean z) {
        m2949c(typeface);
    }

    /* JADX INFO: renamed from: c */
    public final void m2949c(Typeface typeface) {
        if (this.f6163c) {
            return;
        }
        C1266c c1266c = ((C1265b) this.f6162b).f6050a;
        C1282a c1282a = c1266c.f6084v;
        boolean z = true;
        if (c1282a != null) {
            c1282a.f6163c = true;
        }
        if (c1266c.f6081s != typeface) {
            c1266c.f6081s = typeface;
        } else {
            z = false;
        }
        if (z) {
            c1266c.m2923k();
        }
    }
}
