package p006b.p008b.p016h.p017i;

import android.content.Context;
import android.view.LayoutInflater;

/* JADX INFO: renamed from: b.b.h.i.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0224b implements InterfaceC0235m {

    /* JADX INFO: renamed from: b */
    public Context f1567b;

    /* JADX INFO: renamed from: c */
    public Context f1568c;

    /* JADX INFO: renamed from: d */
    public C0229g f1569d;

    /* JADX INFO: renamed from: e */
    public LayoutInflater f1570e;

    /* JADX INFO: renamed from: f */
    public InterfaceC0235m.a f1571f;

    /* JADX INFO: renamed from: g */
    public int f1572g;

    /* JADX INFO: renamed from: h */
    public int f1573h;

    /* JADX INFO: renamed from: i */
    public InterfaceC0236n f1574i;

    /* JADX INFO: renamed from: j */
    public int f1575j;

    public AbstractC0224b(Context context, int i, int i2) {
        this.f1567b = context;
        this.f1570e = LayoutInflater.from(context);
        this.f1572g = i;
        this.f1573h = i2;
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0235m
    /* JADX INFO: renamed from: c */
    public int mo117c() {
        return this.f1575j;
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0235m
    /* JADX INFO: renamed from: i */
    public boolean mo122i(C0229g c0229g, C0231i c0231i) {
        return false;
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0235m
    /* JADX INFO: renamed from: j */
    public boolean mo123j(C0229g c0229g, C0231i c0231i) {
        return false;
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0235m
    /* JADX INFO: renamed from: l */
    public void mo918l(InterfaceC0235m.a aVar) {
        this.f1571f = aVar;
    }
}
