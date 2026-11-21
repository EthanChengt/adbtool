package p080c.p126d.p127a.p128a.p133d;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import java.util.WeakHashMap;
import p006b.p032h.p033b.C0360f;
import p006b.p032h.p044j.C0418m;
import p006b.p032h.p044j.C0427v;

/* JADX INFO: renamed from: c.d.a.a.d.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1201e extends C1202f<View> {

    /* JADX INFO: renamed from: c */
    public final Rect f5701c;

    /* JADX INFO: renamed from: d */
    public final Rect f5702d;

    /* JADX INFO: renamed from: e */
    public int f5703e;

    /* JADX INFO: renamed from: f */
    public int f5704f;

    public AbstractC1201e() {
        this.f5701c = new Rect();
        this.f5702d = new Rect();
        this.f5703e = 0;
    }

    public AbstractC1201e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5701c = new Rect();
        this.f5702d = new Rect();
        this.f5703e = 0;
    }

    @Override // p080c.p126d.p127a.p128a.p133d.C1202f
    /* JADX INFO: renamed from: C */
    public void mo2777C(CoordinatorLayout coordinatorLayout, View view, int i) {
        int bottom;
        AppBarLayout appBarLayoutM3056F = ((AppBarLayout.ScrollingViewBehavior) this).m3056F(coordinatorLayout.m146e(view));
        if (appBarLayoutM3056F != null) {
            CoordinatorLayout.C0071f c0071f = (CoordinatorLayout.C0071f) view.getLayoutParams();
            Rect rect = this.f5701c;
            rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0071f).leftMargin, appBarLayoutM3056F.getBottom() + ((ViewGroup.MarginLayoutParams) c0071f).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0071f).rightMargin, ((appBarLayoutM3056F.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c0071f).bottomMargin);
            C0427v lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null) {
                WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
                if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rect.left = lastWindowInsets.m1601b() + rect.left;
                    rect.right -= lastWindowInsets.m1602c();
                }
            }
            Rect rect2 = this.f5702d;
            int i2 = c0071f.f544c;
            Gravity.apply(i2 == 0 ? 8388659 : i2, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int iM2778E = m2778E(appBarLayoutM3056F);
            view.layout(rect2.left, rect2.top - iM2778E, rect2.right, rect2.bottom - iM2778E);
            bottom = rect2.top - appBarLayoutM3056F.getBottom();
        } else {
            coordinatorLayout.m154s(view, i);
            bottom = 0;
        }
        this.f5703e = bottom;
    }

    /* JADX INFO: renamed from: E */
    public final int m2778E(View view) {
        int i;
        if (this.f5704f == 0) {
            return 0;
        }
        float f = 0.0f;
        if (view instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int totalScrollRange = appBarLayout.getTotalScrollRange();
            int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
            CoordinatorLayout.AbstractC0068c abstractC0068c = ((CoordinatorLayout.C0071f) appBarLayout.getLayoutParams()).f542a;
            int iMo2773F = abstractC0068c instanceof AppBarLayout.BaseBehavior ? ((AppBarLayout.BaseBehavior) abstractC0068c).mo2773F() : 0;
            if ((downNestedPreScrollRange == 0 || totalScrollRange + iMo2773F > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                f = 1.0f + (iMo2773F / i);
            }
        }
        int i2 = this.f5704f;
        return C0360f.m1448h((int) (f * i2), 0, i2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0068c
    /* JADX INFO: renamed from: l */
    public boolean mo175l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        C0427v lastWindowInsets;
        int i5 = view.getLayoutParams().height;
        if (i5 != -1 && i5 != -2) {
            return false;
        }
        AppBarLayout appBarLayoutM3056F = ((AppBarLayout.ScrollingViewBehavior) this).m3056F(coordinatorLayout.m146e(view));
        if (appBarLayoutM3056F == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size > 0) {
            WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
            if (appBarLayoutM3056F.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                size += lastWindowInsets.m1600a() + lastWindowInsets.m1603d();
            }
        } else {
            size = coordinatorLayout.getHeight();
        }
        coordinatorLayout.m155t(view, i, i2, View.MeasureSpec.makeMeasureSpec((size + appBarLayoutM3056F.getTotalScrollRange()) - appBarLayoutM3056F.getMeasuredHeight(), i5 == -1 ? 1073741824 : RecyclerView.UNDEFINED_DURATION), i4);
        return true;
    }
}
