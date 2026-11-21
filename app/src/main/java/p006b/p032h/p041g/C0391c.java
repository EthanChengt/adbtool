package p006b.p032h.p041g;

import android.os.Handler;
import p006b.p032h.p034c.p035b.C0369g;

/* JADX INFO: renamed from: b.h.g.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0391c implements C0394f.c<C0393e.d> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0369g.a f2636a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Handler f2637b;

    public C0391c(C0369g.a aVar, Handler handler) {
        this.f2636a = aVar;
        this.f2637b = handler;
    }

    @Override // p006b.p032h.p041g.C0394f.c
    /* JADX INFO: renamed from: a */
    public void mo1522a(C0393e.d dVar) {
        int i;
        C0369g.a aVar;
        C0393e.d dVar2 = dVar;
        if (dVar2 == null) {
            aVar = this.f2636a;
            i = 1;
        } else {
            i = dVar2.f2652b;
            if (i == 0) {
                this.f2636a.m1486b(dVar2.f2651a, this.f2637b);
                return;
            }
            aVar = this.f2636a;
        }
        aVar.m1485a(i, this.f2637b);
    }
}
