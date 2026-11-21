package p006b.p032h.p041g;

import android.content.Context;
import android.graphics.Typeface;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: b.h.g.b */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC0390b implements Callable<C0393e.d> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f2632a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0389a f2633b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f2634c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f2635d;

    public CallableC0390b(Context context, C0389a c0389a, int i, String str) {
        this.f2632a = context;
        this.f2633b = c0389a;
        this.f2634c = i;
        this.f2635d = str;
    }

    @Override // java.util.concurrent.Callable
    public C0393e.d call() {
        C0393e.d dVarM1525b = C0393e.m1525b(this.f2632a, this.f2633b, this.f2634c);
        Typeface typeface = dVarM1525b.f2651a;
        if (typeface != null) {
            C0393e.f2639a.m1259b(this.f2635d, typeface);
        }
        return dVarM1525b;
    }
}
