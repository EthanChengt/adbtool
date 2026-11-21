package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;
import java.util.Objects;
import p006b.p032h.p044j.p045w.C0429b;
import p006b.p068t.p069b.RunnableC0550m;
import c.a.a.a.a;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: G */
    public boolean f851G;

    /* JADX INFO: renamed from: H */
    public int f852H;

    /* JADX INFO: renamed from: I */
    public int[] f853I;

    /* JADX INFO: renamed from: J */
    public View[] f854J;

    /* JADX INFO: renamed from: K */
    public final SparseIntArray f855K;

    /* JADX INFO: renamed from: L */
    public final SparseIntArray f856L;

    /* JADX INFO: renamed from: M */
    public AbstractC0117c f857M;

    /* JADX INFO: renamed from: N */
    public final Rect f858N;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.GridLayoutManager$a */
    public static final class C0115a extends AbstractC0117c {
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.GridLayoutManager$b */
    public static class C0116b extends RecyclerView.C0141p {

        /* JADX INFO: renamed from: e */
        public int f859e;

        /* JADX INFO: renamed from: f */
        public int f860f;

        public C0116b(int i, int i2) {
            super(i, i2);
            this.f859e = -1;
            this.f860f = 0;
        }

        public C0116b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f859e = -1;
            this.f860f = 0;
        }

        public C0116b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f859e = -1;
            this.f860f = 0;
        }

        public C0116b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f859e = -1;
            this.f860f = 0;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.GridLayoutManager$c */
    public static abstract class AbstractC0117c {

        /* JADX INFO: renamed from: a */
        public final SparseIntArray f861a = new SparseIntArray();

        /* JADX INFO: renamed from: b */
        public final SparseIntArray f862b = new SparseIntArray();

        /* JADX INFO: renamed from: a */
        public int m445a(int i, int i2) {
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                i3++;
                if (i3 == i2) {
                    i4++;
                    i3 = 0;
                } else if (i3 > i2) {
                    i4++;
                    i3 = 1;
                }
            }
            return i3 + 1 > i2 ? i4 + 1 : i4;
        }
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(i2, z);
        this.f851G = false;
        this.f852H = -1;
        this.f855K = new SparseIntArray();
        this.f856L = new SparseIntArray();
        this.f857M = new C0115a();
        this.f858N = new Rect();
        m419N1(i);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f851G = false;
        this.f852H = -1;
        this.f855K = new SparseIntArray();
        this.f856L = new SparseIntArray();
        this.f857M = new C0115a();
        this.f858N = new Rect();
        m419N1(RecyclerView.AbstractC0140o.m560Q(context, attributeSet, i, i2).f978b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: A */
    public int mo407A(RecyclerView.C0147v c0147v, RecyclerView.C0123a0 c0123a0) {
        if (this.f869r == 1) {
            return this.f852H;
        }
        if (c0123a0.m501b() < 1) {
            return 0;
        }
        return m412I1(c0147v, c0123a0, c0123a0.m501b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: B1 */
    public void mo408B1(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        mo460d(null);
        if (this.f875x) {
            this.f875x = false;
            m580I0();
        }
    }

    /* JADX INFO: renamed from: F1 */
    public final void m409F1(int i) {
        int i2;
        int[] iArr = this.f853I;
        int i3 = this.f852H;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.f853I = iArr;
    }

    /* JADX INFO: renamed from: G1 */
    public final void m410G1() {
        View[] viewArr = this.f854J;
        if (viewArr == null || viewArr.length != this.f852H) {
            this.f854J = new View[this.f852H];
        }
    }

    /* JADX INFO: renamed from: H1 */
    public int m411H1(int i, int i2) {
        if (this.f869r != 1 || !m483s1()) {
            int[] iArr = this.f853I;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f853I;
        int i3 = this.f852H;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    /* JADX INFO: renamed from: I1 */
    public final int m412I1(RecyclerView.C0147v c0147v, RecyclerView.C0123a0 c0123a0, int i) {
        if (!c0123a0.f909g) {
            return this.f857M.m445a(i, this.f852H);
        }
        int iM640c = c0147v.m640c(i);
        if (iM640c != -1) {
            return this.f857M.m445a(iM640c, this.f852H);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: J0 */
    public int mo413J0(int i, RecyclerView.C0147v c0147v, RecyclerView.C0123a0 c0123a0) {
        m421O1();
        m410G1();
        if (this.f869r == 1) {
            return 0;
        }
        return m491z1(i, c0147v, c0123a0);
    }

    /* JADX INFO: renamed from: J1 */
    public final int m414J1(RecyclerView.C0147v c0147v, RecyclerView.C0123a0 c0123a0, int i) {
        if (!c0123a0.f909g) {
            AbstractC0117c abstractC0117c = this.f857M;
            int i2 = this.f852H;
            Objects.requireNonNull(abstractC0117c);
            return i % i2;
        }
        int i3 = this.f856L.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int iM640c = c0147v.m640c(i);
        if (iM640c != -1) {
            AbstractC0117c abstractC0117c2 = this.f857M;
            int i4 = this.f852H;
            Objects.requireNonNull(abstractC0117c2);
            return iM640c % i4;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    /* JADX INFO: renamed from: K1 */
    public final int m415K1(RecyclerView.C0147v c0147v, RecyclerView.C0123a0 c0123a0, int i) {
        if (!c0123a0.f909g) {
            Objects.requireNonNull(this.f857M);
            return 1;
        }
        int i2 = this.f855K.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (c0147v.m640c(i) != -1) {
            Objects.requireNonNull(this.f857M);
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: L0 */
    public int mo416L0(int i, RecyclerView.C0147v c0147v, RecyclerView.C0123a0 c0123a0) {
        m421O1();
        m410G1();
        if (this.f869r == 0) {
            return 0;
        }
        return m491z1(i, c0147v, c0123a0);
    }

    /* JADX INFO: renamed from: L1 */
    public final void m417L1(View view, int i, boolean z) {
        int iM563z;
        int iM563z2;
        C0116b c0116b = (C0116b) view.getLayoutParams();
        Rect rect = c0116b.f982b;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c0116b).topMargin + ((ViewGroup.MarginLayoutParams) c0116b).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c0116b).leftMargin + ((ViewGroup.MarginLayoutParams) c0116b).rightMargin;
        int iM411H1 = m411H1(c0116b.f859e, c0116b.f860f);
        if (this.f869r == 1) {
            iM563z2 = RecyclerView.AbstractC0140o.m563z(iM411H1, i, i3, ((ViewGroup.MarginLayoutParams) c0116b).width, false);
            iM563z = RecyclerView.AbstractC0140o.m563z(this.f871t.mo2054l(), this.f972o, i2, ((ViewGroup.MarginLayoutParams) c0116b).height, true);
        } else {
            int iM563z3 = RecyclerView.AbstractC0140o.m563z(iM411H1, i, i2, ((ViewGroup.MarginLayoutParams) c0116b).height, false);
            int iM563z4 = RecyclerView.AbstractC0140o.m563z(this.f871t.mo2054l(), this.f971n, i3, ((ViewGroup.MarginLayoutParams) c0116b).width, true);
            iM563z = iM563z3;
            iM563z2 = iM563z4;
        }
        m418M1(view, iM563z2, iM563z, z);
    }

    /* JADX INFO: renamed from: M1 */
    public final void m418M1(View view, int i, int i2, boolean z) {
        RecyclerView.C0141p c0141p = (RecyclerView.C0141p) view.getLayoutParams();
        if (z ? m595T0(view, i, i2, c0141p) : m592R0(view, i, i2, c0141p)) {
            view.measure(i, i2);
        }
    }

    /* JADX INFO: renamed from: N1 */
    public void m419N1(int i) {
        if (i == this.f852H) {
            return;
        }
        this.f851G = true;
        if (i < 1) {
            throw new IllegalArgumentException(a.m2198l("Span count should be at least 1. Provided ", i));
        }
        this.f852H = i;
        this.f857M.f861a.clear();
        m580I0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: O0 */
    public void mo420O0(Rect rect, int i, int i2) {
        int iM562h;
        int iM562h2;
        if (this.f853I == null) {
            super.mo420O0(rect, i, i2);
        }
        int iM586N = m586N() + m584M();
        int iM583L = m583L() + m588O();
        if (this.f869r == 1) {
            iM562h2 = RecyclerView.AbstractC0140o.m562h(i2, rect.height() + iM583L, m581J());
            int[] iArr = this.f853I;
            iM562h = RecyclerView.AbstractC0140o.m562h(i, iArr[iArr.length - 1] + iM586N, m582K());
        } else {
            iM562h = RecyclerView.AbstractC0140o.m562h(i, rect.width() + iM586N, m582K());
            int[] iArr2 = this.f853I;
            iM562h2 = RecyclerView.AbstractC0140o.m562h(i2, iArr2[iArr2.length - 1] + iM583L, m581J());
        }
        this.f959b.setMeasuredDimension(iM562h, iM562h2);
    }

    /* JADX INFO: renamed from: O1 */
    public final void m421O1() {
        int iM583L;
        int iM588O;
        if (this.f869r == 1) {
            iM583L = this.f973p - m586N();
            iM588O = m584M();
        } else {
            iM583L = this.f974q - m583L();
            iM588O = m588O();
        }
        m409F1(iM583L - iM588O);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: R */
    public int mo422R(RecyclerView.C0147v c0147v, RecyclerView.C0123a0 c0123a0) {
        if (this.f869r == 0) {
            return this.f852H;
        }
        if (c0123a0.m501b() < 1) {
            return 0;
        }
        return m412I1(c0147v, c0123a0, c0123a0.m501b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: W0 */
    public boolean mo423W0() {
        return this.f864B == null && !this.f851G;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: Y0 */
    public void mo424Y0(RecyclerView.C0123a0 c0123a0, LinearLayoutManager.C0120c c0120c, RecyclerView.AbstractC0140o.c cVar) {
        int i = this.f852H;
        for (int i2 = 0; i2 < this.f852H && c0120c.m497b(c0123a0) && i > 0; i2++) {
            ((RunnableC0550m.b) cVar).m2031a(c0120c.f890d, Math.max(0, c0120c.f893g));
            Objects.requireNonNull(this.f857M);
            i--;
            c0120c.f890d += c0120c.f891e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: g */
    public boolean mo425g(RecyclerView.C0141p c0141p) {
        return c0141p instanceof C0116b;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:77:0x0109  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: g0 */
    public View mo426g0(View view, int i, RecyclerView.C0147v c0147v, RecyclerView.C0123a0 c0123a0) {
        int iM619y;
        int iM619y2;
        int i2;
        View view2;
        View view3;
        int iMin;
        boolean z;
        RecyclerView.C0147v c0147v2 = c0147v;
        RecyclerView.C0123a0 c0123a1 = c0123a0;
        View viewM614s = m614s(view);
        View view4 = null;
        if (viewM614s == null) {
            return null;
        }
        C0116b c0116b = (C0116b) viewM614s.getLayoutParams();
        int i3 = c0116b.f859e;
        int i4 = c0116b.f860f + i3;
        if (super.mo426g0(view, i, c0147v, c0123a0) == null) {
            return null;
        }
        if ((m459c1(i) == 1) != this.f874w) {
            iM619y2 = m619y() - 1;
            iM619y = -1;
            i2 = -1;
        } else {
            iM619y = m619y();
            iM619y2 = 0;
            i2 = 1;
        }
        boolean z2 = this.f869r == 1 && m483s1();
        int iM412I1 = m412I1(c0147v2, c0123a1, iM619y2);
        int i5 = iM619y2;
        int i6 = i2;
        int i7 = 0;
        int i8 = -1;
        int iMin2 = 0;
        int i9 = -1;
        View view5 = null;
        while (i5 != iM619y) {
            int i10 = iM619y;
            int iM412I2 = m412I1(c0147v2, c0123a1, i5);
            View viewM618x = m618x(i5);
            if (viewM618x == viewM614s) {
                break;
            }
            if (!viewM618x.hasFocusable() || iM412I2 == iM412I1) {
                C0116b c0116b2 = (C0116b) viewM618x.getLayoutParams();
                int i11 = c0116b2.f859e;
                view2 = viewM614s;
                int i12 = c0116b2.f860f + i11;
                if (viewM618x.hasFocusable() && i11 == i3 && i12 == i4) {
                    return viewM618x;
                }
                if (!(viewM618x.hasFocusable() && view4 == null) && (viewM618x.hasFocusable() || view5 != null)) {
                    view3 = view5;
                    int iMin3 = Math.min(i12, i4) - Math.max(i11, i3);
                    if (!viewM618x.hasFocusable()) {
                        if (view4 == null) {
                            iMin = i7;
                            if (m598X(viewM618x, false)) {
                                if (iMin3 <= iMin2) {
                                    if (iMin3 == iMin2) {
                                        if (z2 == (i11 > i8)) {
                                        }
                                    }
                                }
                                z = true;
                            }
                            if (z) {
                                if (viewM618x.hasFocusable()) {
                                    int i13 = c0116b2.f859e;
                                    iMin = Math.min(i12, i4) - Math.max(i11, i3);
                                    i9 = i13;
                                    view5 = view3;
                                    view4 = viewM618x;
                                } else {
                                    int i14 = c0116b2.f859e;
                                    iMin2 = Math.min(i12, i4) - Math.max(i11, i3);
                                    i8 = i14;
                                    view5 = viewM618x;
                                }
                            }
                            i5 += i6;
                            c0147v2 = c0147v;
                            c0123a1 = c0123a0;
                            iM619y = i10;
                            viewM614s = view2;
                            i7 = iMin;
                        }
                        z = false;
                        if (z) {
                            if (viewM618x.hasFocusable()) {
                                int i15 = c0116b2.f859e;
                                iMin = Math.min(i12, i4) - Math.max(i11, i3);
                                i9 = i15;
                                view5 = view3;
                                view4 = viewM618x;
                            } else {
                                int i16 = c0116b2.f859e;
                                iMin2 = Math.min(i12, i4) - Math.max(i11, i3);
                                i8 = i16;
                                view5 = viewM618x;
                            }
                        }
                        i5 += i6;
                        c0147v2 = c0147v;
                        c0123a1 = c0123a0;
                        iM619y = i10;
                        viewM614s = view2;
                        i7 = iMin;
                    } else if (iMin3 <= i7) {
                        if (iMin3 == i7) {
                            if (z2 == (i11 > i9)) {
                            }
                            if (z) {
                                if (viewM618x.hasFocusable()) {
                                    int i17 = c0116b2.f859e;
                                    iMin = Math.min(i12, i4) - Math.max(i11, i3);
                                    i9 = i17;
                                    view5 = view3;
                                    view4 = viewM618x;
                                } else {
                                    int i18 = c0116b2.f859e;
                                    iMin2 = Math.min(i12, i4) - Math.max(i11, i3);
                                    i8 = i18;
                                    view5 = viewM618x;
                                }
                            }
                            i5 += i6;
                            c0147v2 = c0147v;
                            c0123a1 = c0123a0;
                            iM619y = i10;
                            viewM614s = view2;
                            i7 = iMin;
                        }
                    }
                    iMin = i7;
                    z = false;
                    if (z) {
                        if (viewM618x.hasFocusable()) {
                            int i19 = c0116b2.f859e;
                            iMin = Math.min(i12, i4) - Math.max(i11, i3);
                            i9 = i19;
                            view5 = view3;
                            view4 = viewM618x;
                        } else {
                            int i110 = c0116b2.f859e;
                            iMin2 = Math.min(i12, i4) - Math.max(i11, i3);
                            i8 = i110;
                            view5 = viewM618x;
                        }
                    }
                    i5 += i6;
                    c0147v2 = c0147v;
                    c0123a1 = c0123a0;
                    iM619y = i10;
                    viewM614s = view2;
                    i7 = iMin;
                } else {
                    view3 = view5;
                }
                iMin = i7;
                z = true;
                if (z) {
                    if (viewM618x.hasFocusable()) {
                        int i111 = c0116b2.f859e;
                        iMin = Math.min(i12, i4) - Math.max(i11, i3);
                        i9 = i111;
                        view5 = view3;
                        view4 = viewM618x;
                    } else {
                        int i112 = c0116b2.f859e;
                        iMin2 = Math.min(i12, i4) - Math.max(i11, i3);
                        i8 = i112;
                        view5 = viewM618x;
                    }
                }
                i5 += i6;
                c0147v2 = c0147v;
                c0123a1 = c0123a0;
                iM619y = i10;
                viewM614s = view2;
                i7 = iMin;
            } else {
                if (view4 != null) {
                    break;
                }
                view2 = viewM614s;
                view3 = view5;
                iMin = i7;
            }
            view5 = view3;
            i5 += i6;
            c0147v2 = c0147v;
            c0123a1 = c0123a0;
            iM619y = i10;
            viewM614s = view2;
            i7 = iMin;
        }
        return view4 != null ? view4 : view5;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: k0 */
    public void mo427k0(RecyclerView.C0147v c0147v, RecyclerView.C0123a0 c0123a0, View view, C0429b c0429b) {
        int i;
        int i2;
        int i3;
        boolean z;
        boolean z2;
        int i4;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0116b)) {
            m609j0(view, c0429b);
            return;
        }
        C0116b c0116b = (C0116b) layoutParams;
        int iM412I1 = m412I1(c0147v, c0123a0, c0116b.m626a());
        if (this.f869r == 0) {
            i4 = c0116b.f859e;
            i = c0116b.f860f;
            i3 = 1;
            z = false;
            z2 = false;
            i2 = iM412I1;
        } else {
            i = 1;
            i2 = c0116b.f859e;
            i3 = c0116b.f860f;
            z = false;
            z2 = false;
            i4 = iM412I1;
        }
        c0429b.m1618m(C0429b.c.m1622a(i4, i, i2, i3, z, z2));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: l */
    public int mo428l(RecyclerView.C0123a0 c0123a0) {
        return m457a1(c0123a0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: m */
    public int mo429m(RecyclerView.C0123a0 c0123a0) {
        return m458b1(c0123a0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: m0 */
    public void mo430m0(RecyclerView recyclerView, int i, int i2) {
        this.f857M.f861a.clear();
        this.f857M.f862b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: n0 */
    public void mo431n0(RecyclerView recyclerView) {
        this.f857M.f861a.clear();
        this.f857M.f862b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: n1 */
    public View mo432n1(RecyclerView.C0147v c0147v, RecyclerView.C0123a0 c0123a0, int i, int i2, int i3) {
        m461d1();
        int iMo2053k = this.f871t.mo2053k();
        int iMo2049g = this.f871t.mo2049g();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View viewM618x = m618x(i);
            int iM589P = m589P(viewM618x);
            if (iM589P >= 0 && iM589P < i3 && m414J1(c0147v, c0123a0, iM589P) == 0) {
                if (((RecyclerView.C0141p) viewM618x.getLayoutParams()).m628c()) {
                    if (view2 == null) {
                        view2 = viewM618x;
                    }
                } else {
                    if (this.f871t.mo2047e(viewM618x) < iMo2049g && this.f871t.mo2044b(viewM618x) >= iMo2053k) {
                        return viewM618x;
                    }
                    if (view == null) {
                        view = viewM618x;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: o */
    public int mo433o(RecyclerView.C0123a0 c0123a0) {
        return m457a1(c0123a0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: o0 */
    public void mo434o0(RecyclerView recyclerView, int i, int i2, int i3) {
        this.f857M.f861a.clear();
        this.f857M.f862b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: p */
    public int mo435p(RecyclerView.C0123a0 c0123a0) {
        return m458b1(c0123a0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: p0 */
    public void mo436p0(RecyclerView recyclerView, int i, int i2) {
        this.f857M.f861a.clear();
        this.f857M.f862b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: r0 */
    public void mo437r0(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.f857M.f861a.clear();
        this.f857M.f862b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: s0 */
    public void mo438s0(RecyclerView.C0147v c0147v, RecyclerView.C0123a0 c0123a0) {
        if (c0123a0.f909g) {
            int iM619y = m619y();
            for (int i = 0; i < iM619y; i++) {
                C0116b c0116b = (C0116b) m618x(i).getLayoutParams();
                int iM626a = c0116b.m626a();
                this.f855K.put(iM626a, c0116b.f860f);
                this.f856L.put(iM626a, c0116b.f859e);
            }
        }
        super.mo438s0(c0147v, c0123a0);
        this.f855K.clear();
        this.f856L.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: t0 */
    public void mo439t0(RecyclerView.C0123a0 c0123a0) {
        this.f864B = null;
        this.f877z = -1;
        this.f863A = RecyclerView.UNDEFINED_DURATION;
        this.f865C.m495d();
        this.f851G = false;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x025b  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: t1 */
    public void mo440t1(RecyclerView.C0147v c0147v, RecyclerView.C0123a0 c0123a0, LinearLayoutManager.C0120c c0120c, LinearLayoutManager.C0119b c0119b) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int iMo2046d;
        int iM588O;
        int iM584M;
        int iMo2046d2;
        int i7;
        int i8;
        int iMo2046d3;
        int i9;
        int i10;
        int iM563z;
        int iM563z2;
        View viewM498c;
        int iMo2052j = this.f871t.mo2052j();
        boolean z = iMo2052j != 1073741824;
        int i11 = m619y() > 0 ? this.f853I[this.f852H] : 0;
        if (z) {
            m421O1();
        }
        boolean z2 = c0120c.f891e == 1;
        int iM414J1 = this.f852H;
        if (!z2) {
            iM414J1 = m414J1(c0147v, c0123a0, c0120c.f890d) + m415K1(c0147v, c0123a0, c0120c.f890d);
        }
        int i12 = 0;
        while (i12 < this.f852H && c0120c.m497b(c0123a0) && iM414J1 > 0) {
            int i13 = c0120c.f890d;
            int iM415K1 = m415K1(c0147v, c0123a0, i13);
            if (iM415K1 > this.f852H) {
                throw new IllegalArgumentException("Item at position " + i13 + " requires " + iM415K1 + " spans but GridLayoutManager has only " + this.f852H + " spans.");
            }
            iM414J1 -= iM415K1;
            if (iM414J1 < 0 || (viewM498c = c0120c.m498c(c0147v)) == null) {
                break;
            }
            this.f854J[i12] = viewM498c;
            i12++;
        }
        if (i12 == 0) {
            c0119b.f884b = true;
            return;
        }
        if (z2) {
            i2 = i12;
            i = 0;
            i3 = 0;
            i4 = 1;
        } else {
            i = i12 - 1;
            i2 = -1;
            i3 = 0;
            i4 = -1;
        }
        while (i != i2) {
            View view = this.f854J[i];
            C0116b c0116b = (C0116b) view.getLayoutParams();
            int iM415K2 = m415K1(c0147v, c0123a0, m589P(view));
            c0116b.f860f = iM415K2;
            c0116b.f859e = i3;
            i3 += iM415K2;
            i += i4;
        }
        float f = 0.0f;
        int i14 = 0;
        for (int i15 = 0; i15 < i12; i15++) {
            View view2 = this.f854J[i15];
            if (c0120c.f897k == null) {
                if (z2) {
                    m602b(view2);
                } else {
                    m604c(view2, 0, false);
                }
            } else if (z2) {
                m604c(view2, -1, true);
            } else {
                m604c(view2, 0, true);
            }
            Rect rect = this.f858N;
            RecyclerView recyclerView = this.f959b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view2));
            }
            m417L1(view2, iMo2052j, false);
            int iMo2045c = this.f871t.mo2045c(view2);
            if (iMo2045c > i14) {
                i14 = iMo2045c;
            }
            float fMo2046d = (this.f871t.mo2046d(view2) * 1.0f) / ((C0116b) view2.getLayoutParams()).f860f;
            if (fMo2046d > f) {
                f = fMo2046d;
            }
        }
        if (z) {
            m409F1(Math.max(Math.round(f * this.f852H), i11));
            i14 = 0;
            for (int i16 = 0; i16 < i12; i16++) {
                View view3 = this.f854J[i16];
                m417L1(view3, 1073741824, true);
                int iMo2045c2 = this.f871t.mo2045c(view3);
                if (iMo2045c2 > i14) {
                    i14 = iMo2045c2;
                }
            }
        }
        for (int i17 = 0; i17 < i12; i17++) {
            View view4 = this.f854J[i17];
            if (this.f871t.mo2045c(view4) != i14) {
                C0116b c0116b2 = (C0116b) view4.getLayoutParams();
                Rect rect2 = c0116b2.f982b;
                int i18 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) c0116b2).topMargin + ((ViewGroup.MarginLayoutParams) c0116b2).bottomMargin;
                int i19 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) c0116b2).leftMargin + ((ViewGroup.MarginLayoutParams) c0116b2).rightMargin;
                int iM411H1 = m411H1(c0116b2.f859e, c0116b2.f860f);
                if (this.f869r == 1) {
                    iM563z2 = RecyclerView.AbstractC0140o.m563z(iM411H1, 1073741824, i19, ((ViewGroup.MarginLayoutParams) c0116b2).width, false);
                    iM563z = View.MeasureSpec.makeMeasureSpec(i14 - i18, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14 - i19, 1073741824);
                    iM563z = RecyclerView.AbstractC0140o.m563z(iM411H1, 1073741824, i18, ((ViewGroup.MarginLayoutParams) c0116b2).height, false);
                    iM563z2 = iMakeMeasureSpec;
                }
                m418M1(view4, iM563z2, iM563z, true);
            }
        }
        c0119b.f883a = i14;
        if (this.f869r == 1) {
            if (c0120c.f892f == -1) {
                iMo2046d2 = c0120c.f888b;
                i10 = iMo2046d2 - i14;
            } else {
                i10 = c0120c.f888b;
                iMo2046d2 = i14 + i10;
            }
            iM588O = i10;
            iM584M = 0;
            iMo2046d = 0;
        } else {
            if (c0120c.f892f == -1) {
                i6 = c0120c.f888b;
                i5 = i6 - i14;
            } else {
                i5 = c0120c.f888b;
                i6 = i14 + i5;
            }
            iMo2046d = i5;
            iM588O = 0;
            iM584M = i6;
            iMo2046d2 = 0;
        }
        int i20 = 0;
        while (i20 < i12) {
            View view5 = this.f854J[i20];
            C0116b c0116b3 = (C0116b) view5.getLayoutParams();
            if (this.f869r == 1) {
                if (m483s1()) {
                    iM584M = m584M() + this.f853I[this.f852H - c0116b3.f859e];
                    iMo2046d = iM584M - this.f871t.mo2046d(view5);
                } else {
                    int iM584M2 = m584M() + this.f853I[c0116b3.f859e];
                    i9 = iMo2046d2;
                    i7 = iM584M2;
                    i8 = iM588O;
                    iMo2046d3 = this.f871t.mo2046d(view5) + iM584M2;
                }
                m599Y(view5, i7, i8, iMo2046d3, i9);
                if (c0116b3.m628c() || c0116b3.m627b()) {
                    c0119b.f885c = true;
                }
                c0119b.f886d |= view5.hasFocusable();
                i20++;
                iMo2046d2 = i9;
                iM584M = iMo2046d3;
                iM588O = i8;
                iMo2046d = i7;
            } else {
                iM588O = this.f853I[c0116b3.f859e] + m588O();
                iMo2046d2 = this.f871t.mo2046d(view5) + iM588O;
            }
            i9 = iMo2046d2;
            iMo2046d3 = iM584M;
            i8 = iM588O;
            i7 = iMo2046d;
            m599Y(view5, i7, i8, iMo2046d3, i9);
            if (c0116b3.m628c()) {
                c0119b.f885c = true;
            } else {
                c0119b.f885c = true;
            }
            c0119b.f886d |= view5.hasFocusable();
            i20++;
            iMo2046d2 = i9;
            iM584M = iMo2046d3;
            iM588O = i8;
            iMo2046d = i7;
        }
        Arrays.fill(this.f854J, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: u */
    public RecyclerView.C0141p mo441u() {
        return this.f869r == 0 ? new C0116b(-2, -1) : new C0116b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: u1 */
    public void mo442u1(RecyclerView.C0147v c0147v, RecyclerView.C0123a0 c0123a0, LinearLayoutManager.C0118a c0118a, int i) {
        m421O1();
        if (c0123a0.m501b() > 0 && !c0123a0.f909g) {
            boolean z = i == 1;
            int iM414J1 = m414J1(c0147v, c0123a0, c0118a.f879b);
            if (z) {
                while (iM414J1 > 0) {
                    int i2 = c0118a.f879b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    c0118a.f879b = i3;
                    iM414J1 = m414J1(c0147v, c0123a0, i3);
                }
            } else {
                int iM501b = c0123a0.m501b() - 1;
                int i4 = c0118a.f879b;
                while (i4 < iM501b) {
                    int i5 = i4 + 1;
                    int iM414J2 = m414J1(c0147v, c0123a0, i5);
                    if (iM414J2 <= iM414J1) {
                        break;
                    }
                    i4 = i5;
                    iM414J1 = iM414J2;
                }
                c0118a.f879b = i4;
            }
        }
        m410G1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: v */
    public RecyclerView.C0141p mo443v(Context context, AttributeSet attributeSet) {
        return new C0116b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: w */
    public RecyclerView.C0141p mo444w(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0116b((ViewGroup.MarginLayoutParams) layoutParams) : new C0116b(layoutParams);
    }
}
