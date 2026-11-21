package p006b.p068t.p069b;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: b.t.b.p */
/* JADX INFO: loaded from: classes.dex */
public class C0553p extends AbstractC0560w {

    /* JADX INFO: renamed from: d */
    public AbstractC0557t f3440d;

    /* JADX INFO: renamed from: e */
    public AbstractC0557t f3441e;

    @Override // p006b.p068t.p069b.AbstractC0560w
    /* JADX INFO: renamed from: a */
    public int[] mo2037a(RecyclerView.AbstractC0140o abstractC0140o, View view) {
        int[] iArr = new int[2];
        if (abstractC0140o.mo462e()) {
            iArr[0] = m2039d(view, m2042g(abstractC0140o));
        } else {
            iArr[0] = 0;
        }
        if (abstractC0140o.mo464f()) {
            iArr[1] = m2039d(view, m2043h(abstractC0140o));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // p006b.p068t.p069b.AbstractC0560w
    /* JADX INFO: renamed from: b */
    public View mo2038b(RecyclerView.AbstractC0140o abstractC0140o) {
        AbstractC0557t abstractC0557tM2042g;
        if (abstractC0140o.mo464f()) {
            abstractC0557tM2042g = m2043h(abstractC0140o);
        } else {
            if (!abstractC0140o.mo462e()) {
                return null;
            }
            abstractC0557tM2042g = m2042g(abstractC0140o);
        }
        return m2041f(abstractC0140o, abstractC0557tM2042g);
    }

    /* JADX INFO: renamed from: d */
    public final int m2039d(View view, AbstractC0557t abstractC0557t) {
        return ((abstractC0557t.mo2045c(view) / 2) + abstractC0557t.mo2047e(view)) - ((abstractC0557t.mo2054l() / 2) + abstractC0557t.mo2053k());
    }

    /* JADX INFO: renamed from: e */
    public final int m2040e(RecyclerView.AbstractC0140o abstractC0140o, AbstractC0557t abstractC0557t, int i, int i2) {
        int iMax;
        this.f3452b.fling(0, 0, i, i2, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
        int[] iArr = {this.f3452b.getFinalX(), this.f3452b.getFinalY()};
        int iM619y = abstractC0140o.m619y();
        float f = 1.0f;
        if (iM619y != 0) {
            View view = null;
            View view2 = null;
            int i3 = Integer.MAX_VALUE;
            int i4 = RecyclerView.UNDEFINED_DURATION;
            for (int i5 = 0; i5 < iM619y; i5++) {
                View viewM618x = abstractC0140o.m618x(i5);
                int iM589P = abstractC0140o.m589P(viewM618x);
                if (iM589P != -1) {
                    if (iM589P < i3) {
                        view = viewM618x;
                        i3 = iM589P;
                    }
                    if (iM589P > i4) {
                        view2 = viewM618x;
                        i4 = iM589P;
                    }
                }
            }
            if (view != null && view2 != null && (iMax = Math.max(abstractC0557t.mo2044b(view), abstractC0557t.mo2044b(view2)) - Math.min(abstractC0557t.mo2047e(view), abstractC0557t.mo2047e(view2))) != 0) {
                f = (iMax * 1.0f) / ((i4 - i3) + 1);
            }
        }
        if (f <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(iArr[0]) > Math.abs(iArr[1]) ? iArr[0] : iArr[1]) / f);
    }

    /* JADX INFO: renamed from: f */
    public final View m2041f(RecyclerView.AbstractC0140o abstractC0140o, AbstractC0557t abstractC0557t) {
        int iM619y = abstractC0140o.m619y();
        View view = null;
        if (iM619y == 0) {
            return null;
        }
        int iMo2054l = (abstractC0557t.mo2054l() / 2) + abstractC0557t.mo2053k();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < iM619y; i2++) {
            View viewM618x = abstractC0140o.m618x(i2);
            int iAbs = Math.abs(((abstractC0557t.mo2045c(viewM618x) / 2) + abstractC0557t.mo2047e(viewM618x)) - iMo2054l);
            if (iAbs < i) {
                view = viewM618x;
                i = iAbs;
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: g */
    public final AbstractC0557t m2042g(RecyclerView.AbstractC0140o abstractC0140o) {
        AbstractC0557t abstractC0557t = this.f3441e;
        if (abstractC0557t == null || abstractC0557t.f3443a != abstractC0140o) {
            this.f3441e = new C0555r(abstractC0140o);
        }
        return this.f3441e;
    }

    /* JADX INFO: renamed from: h */
    public final AbstractC0557t m2043h(RecyclerView.AbstractC0140o abstractC0140o) {
        AbstractC0557t abstractC0557t = this.f3440d;
        if (abstractC0557t == null || abstractC0557t.f3443a != abstractC0140o) {
            this.f3440d = new C0556s(abstractC0140o);
        }
        return this.f3440d;
    }
}
