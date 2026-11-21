package p006b.p056m.p057b;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.didjdk.adbhelper.R;
import java.util.ArrayList;
import p006b.p056m.C0450a;
import c.a.a.a.a;

/* JADX INFO: renamed from: b.m.b.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0473l extends FrameLayout {

    /* JADX INFO: renamed from: b */
    public ArrayList<View> f3077b;

    /* JADX INFO: renamed from: c */
    public ArrayList<View> f3078c;

    /* JADX INFO: renamed from: d */
    public boolean f3079d;

    public C0473l(Context context, AttributeSet attributeSet, AbstractC0483r abstractC0483r) {
        super(context, attributeSet);
        this.f3079d = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0450a.f2928b);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        Fragment fragmentM1807G = abstractC0483r.m1807G(id);
        if (classAttribute == null || fragmentM1807G != null) {
            return;
        }
        if (id <= 0) {
            throw new IllegalStateException(a.m2202p("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? a.m2201o(" with tag ", string) : ""));
        }
        Fragment fragmentMo1785a = abstractC0483r.m1811K().mo1785a(context.getClassLoader(), classAttribute);
        fragmentMo1785a.m290W(attributeSet, null);
        C0451a c0451a = new C0451a(abstractC0483r);
        c0451a.f2947p = true;
        fragmentMo1785a.f666F = this;
        c0451a.mo1715e(getId(), fragmentMo1785a, string, 1);
        c0451a.mo1714d();
    }

    /* JADX INFO: renamed from: a */
    public final void m1775a(View view) {
        ArrayList<View> arrayList;
        if (view.getAnimation() != null || ((arrayList = this.f3078c) != null && arrayList.contains(view))) {
            if (this.f3077b == null) {
                this.f3077b = new ArrayList<>();
            }
            this.f3077b.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Object tag = view.getTag(R.id.fh);
        if ((tag instanceof Fragment ? (Fragment) tag : null) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        Object tag = view.getTag(R.id.fh);
        if ((tag instanceof Fragment ? (Fragment) tag : null) != null) {
            return super.addViewInLayout(view, i, layoutParams, z);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.f3079d && this.f3077b != null) {
            for (int i = 0; i < this.f3077b.size(); i++) {
                super.drawChild(canvas, this.f3077b.get(i), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        ArrayList<View> arrayList;
        if (!this.f3079d || (arrayList = this.f3077b) == null || arrayList.size() <= 0 || !this.f3077b.contains(view)) {
            return super.drawChild(canvas, view, j);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        ArrayList<View> arrayList = this.f3078c;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.f3077b;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f3079d = true;
            }
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        for (int i = 0; i < getChildCount(); i++) {
            getChildAt(i).dispatchApplyWindowInsets(new WindowInsets(windowInsets));
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            m1775a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z) {
        if (z) {
            m1775a(view);
        }
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        m1775a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i) {
        m1775a(getChildAt(i));
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        m1775a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            m1775a(getChildAt(i3));
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            m1775a(getChildAt(i3));
        }
        super.removeViewsInLayout(i, i2);
    }

    public void setDrawDisappearingViewsLast(boolean z) {
        this.f3079d = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f3078c == null) {
                this.f3078c = new ArrayList<>();
            }
            this.f3078c.add(view);
        }
        super.startViewTransition(view);
    }
}
