package p006b.p026f.p027a.p028h;

import java.util.ArrayList;
import p006b.p026f.p027a.C0324c;

/* JADX INFO: renamed from: b.f.a.h.n */
/* JADX INFO: loaded from: classes.dex */
public class C0342n extends C0332d {

    /* JADX INFO: renamed from: i0 */
    public ArrayList<C0332d> f2419i0 = new ArrayList<>();

    @Override // p006b.p026f.p027a.p028h.C0332d
    /* JADX INFO: renamed from: D */
    public void mo1343D() {
        int i = this.f2304I;
        int i2 = this.f2305J;
        this.f2308M = i;
        this.f2309N = i2;
        ArrayList<C0332d> arrayList = this.f2419i0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0332d c0332d = this.f2419i0.get(i3);
            c0332d.mo1365z(this.f2308M + this.f2310O, this.f2309N + this.f2311P);
            if (!(c0332d instanceof C0333e)) {
                c0332d.mo1343D();
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public void mo1366F() {
        mo1343D();
        ArrayList<C0332d> arrayList = this.f2419i0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0332d c0332d = this.f2419i0.get(i);
            if (c0332d instanceof C0342n) {
                ((C0342n) c0332d).mo1366F();
            }
        }
    }

    @Override // p006b.p026f.p027a.p028h.C0332d
    /* JADX INFO: renamed from: r */
    public void mo1359r() {
        this.f2419i0.clear();
        super.mo1359r();
    }

    @Override // p006b.p026f.p027a.p028h.C0332d
    /* JADX INFO: renamed from: t */
    public void mo1360t(C0324c c0324c) {
        super.mo1360t(c0324c);
        int size = this.f2419i0.size();
        for (int i = 0; i < size; i++) {
            this.f2419i0.get(i).mo1360t(c0324c);
        }
    }

    @Override // p006b.p026f.p027a.p028h.C0332d
    /* JADX INFO: renamed from: z */
    public void mo1365z(int i, int i2) {
        this.f2310O = i;
        this.f2311P = i2;
        int size = this.f2419i0.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.f2419i0.get(i3).mo1365z(this.f2304I + this.f2310O, this.f2305J + this.f2311P);
        }
    }
}
