package p006b.p032h.p041g;

import java.util.ArrayList;
import p006b.p025e.C0320h;

/* JADX INFO: renamed from: b.h.g.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0392d implements C0394f.c<C0393e.d> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f2638a;

    public C0392d(String str) {
        this.f2638a = str;
    }

    @Override // p006b.p032h.p041g.C0394f.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo1522a(C0393e.d dVar) {
        synchronized (C0393e.f2641c) {
            C0320h<String, ArrayList<C0394f.c<C0393e.d>>> c0320h = C0393e.f2642d;
            ArrayList<C0394f.c<C0393e.d>> arrayList = c0320h.get(this.f2638a);
            if (arrayList == null) {
                return;
            }
            c0320h.remove(this.f2638a);
            for (int i = 0; i < arrayList.size(); i++) {
                arrayList.get(i).mo1522a(dVar);
            }
        }
    }
}
