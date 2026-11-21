package p006b.p068t.p069b;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: b.t.b.t */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0557t {

    /* JADX INFO: renamed from: a */
    public final RecyclerView.AbstractC0140o f3443a;

    /* JADX INFO: renamed from: b */
    public int f3444b = RecyclerView.UNDEFINED_DURATION;

    /* JADX INFO: renamed from: c */
    public final Rect f3445c = new Rect();

    public AbstractC0557t(RecyclerView.AbstractC0140o abstractC0140o, C0555r c0555r) {
        this.f3443a = abstractC0140o;
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC0557t m2058a(RecyclerView.AbstractC0140o abstractC0140o, int i) {
        if (i == 0) {
            return new C0555r(abstractC0140o);
        }
        if (i == 1) {
            return new C0556s(abstractC0140o);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo2044b(View view);

    /* JADX INFO: renamed from: c */
    public abstract int mo2045c(View view);

    /* JADX INFO: renamed from: d */
    public abstract int mo2046d(View view);

    /* JADX INFO: renamed from: e */
    public abstract int mo2047e(View view);

    /* JADX INFO: renamed from: f */
    public abstract int mo2048f();

    /* JADX INFO: renamed from: g */
    public abstract int mo2049g();

    /* JADX INFO: renamed from: h */
    public abstract int mo2050h();

    /* JADX INFO: renamed from: i */
    public abstract int mo2051i();

    /* JADX INFO: renamed from: j */
    public abstract int mo2052j();

    /* JADX INFO: renamed from: k */
    public abstract int mo2053k();

    /* JADX INFO: renamed from: l */
    public abstract int mo2054l();

    /* JADX INFO: renamed from: m */
    public int m2059m() {
        if (Integer.MIN_VALUE == this.f3444b) {
            return 0;
        }
        return mo2054l() - this.f3444b;
    }

    /* JADX INFO: renamed from: n */
    public abstract int mo2055n(View view);

    /* JADX INFO: renamed from: o */
    public abstract int mo2056o(View view);

    /* JADX INFO: renamed from: p */
    public abstract void mo2057p(int i);
}
