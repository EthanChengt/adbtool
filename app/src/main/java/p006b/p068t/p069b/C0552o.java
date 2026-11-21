package p006b.p068t.p069b;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: b.t.b.o */
/* JADX INFO: loaded from: classes.dex */
public class C0552o extends RecyclerView.AbstractC0151z {

    /* JADX INFO: renamed from: k */
    public PointF f3434k;

    /* JADX INFO: renamed from: l */
    public final DisplayMetrics f3435l;

    /* JADX INFO: renamed from: n */
    public float f3437n;

    /* JADX INFO: renamed from: i */
    public final LinearInterpolator f3432i = new LinearInterpolator();

    /* JADX INFO: renamed from: j */
    public final DecelerateInterpolator f3433j = new DecelerateInterpolator();

    /* JADX INFO: renamed from: m */
    public boolean f3436m = false;

    /* JADX INFO: renamed from: o */
    public int f3438o = 0;

    /* JADX INFO: renamed from: p */
    public int f3439p = 0;

    public C0552o(Context context) {
        this.f3435l = context.getResources().getDisplayMetrics();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0017  */
    /* JADX WARN: Code duplicated, block: B:28:0x005d  */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0151z
    /* JADX INFO: renamed from: c */
    public void mo655c(View view, RecyclerView.C0123a0 c0123a0, RecyclerView.AbstractC0151z.a aVar) {
        int i;
        int iM2034e;
        int i2;
        PointF pointF = this.f3434k;
        int iM2034e2 = 0;
        if (pointF != null) {
            float f = pointF.x;
            if (f == 0.0f) {
                i = 0;
            } else {
                i = f > 0.0f ? 1 : -1;
            }
        } else {
            i = 0;
        }
        RecyclerView.AbstractC0140o abstractC0140o = this.f1003c;
        if (abstractC0140o == null || !abstractC0140o.mo462e()) {
            iM2034e = 0;
        } else {
            RecyclerView.C0141p c0141p = (RecyclerView.C0141p) view.getLayoutParams();
            iM2034e = m2034e(abstractC0140o.m567C(view) - ((ViewGroup.MarginLayoutParams) c0141p).leftMargin, abstractC0140o.m573F(view) + ((ViewGroup.MarginLayoutParams) c0141p).rightMargin, abstractC0140o.m584M(), abstractC0140o.f973p - abstractC0140o.m586N(), i);
        }
        PointF pointF2 = this.f3434k;
        if (pointF2 != null) {
            float f2 = pointF2.y;
            if (f2 == 0.0f) {
                i2 = 0;
            } else {
                i2 = f2 > 0.0f ? 1 : -1;
            }
        } else {
            i2 = 0;
        }
        RecyclerView.AbstractC0140o abstractC0140o2 = this.f1003c;
        if (abstractC0140o2 != null && abstractC0140o2.mo464f()) {
            RecyclerView.C0141p c0141p2 = (RecyclerView.C0141p) view.getLayoutParams();
            iM2034e2 = m2034e(abstractC0140o2.m575G(view) - ((ViewGroup.MarginLayoutParams) c0141p2).topMargin, abstractC0140o2.m565B(view) + ((ViewGroup.MarginLayoutParams) c0141p2).bottomMargin, abstractC0140o2.m588O(), abstractC0140o2.f974q - abstractC0140o2.m583L(), i2);
        }
        double dM2036g = m2036g((int) Math.sqrt((iM2034e2 * iM2034e2) + (iM2034e * iM2034e)));
        Double.isNaN(dM2036g);
        Double.isNaN(dM2036g);
        Double.isNaN(dM2036g);
        int iCeil = (int) Math.ceil(dM2036g / 0.3356d);
        if (iCeil > 0) {
            aVar.m658b(-iM2034e, -iM2034e2, iCeil, this.f3433j);
        }
    }

    /* JADX INFO: renamed from: e */
    public int m2034e(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                return i4 - i2;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    /* JADX INFO: renamed from: f */
    public float mo2035f(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    /* JADX INFO: renamed from: g */
    public int m2036g(int i) {
        float fAbs = Math.abs(i);
        if (!this.f3436m) {
            this.f3437n = mo2035f(this.f3435l);
            this.f3436m = true;
        }
        return (int) Math.ceil(fAbs * this.f3437n);
    }
}
