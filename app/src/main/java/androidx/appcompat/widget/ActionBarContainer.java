package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.didjdk.adbhelper.R;
import java.util.WeakHashMap;
import p006b.p008b.C0184b;
import p006b.p008b.p018i.C0245b;
import p006b.p008b.p018i.C0280q0;
import p006b.p032h.p044j.C0418m;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: b */
    public boolean f168b;

    /* JADX INFO: renamed from: c */
    public View f169c;

    /* JADX INFO: renamed from: d */
    public View f170d;

    /* JADX INFO: renamed from: e */
    public View f171e;

    /* JADX INFO: renamed from: f */
    public Drawable f172f;

    /* JADX INFO: renamed from: g */
    public Drawable f173g;

    /* JADX INFO: renamed from: h */
    public Drawable f174h;

    /* JADX INFO: renamed from: i */
    public boolean f175i;

    /* JADX INFO: renamed from: j */
    public boolean f176j;

    /* JADX INFO: renamed from: k */
    public int f177k;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0245b c0245b = new C0245b(this);
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        setBackground(c0245b);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0184b.f1200a);
        boolean z = false;
        this.f172f = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f173g = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f177k = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.nb) {
            this.f175i = true;
            this.f174h = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f175i ? !(this.f172f != null || this.f173g != null) : this.f174h == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    /* JADX INFO: renamed from: a */
    public final int m28a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m29b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f172f;
        if (drawable != null && drawable.isStateful()) {
            this.f172f.setState(getDrawableState());
        }
        Drawable drawable2 = this.f173g;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f173g.setState(getDrawableState());
        }
        Drawable drawable3 = this.f174h;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f174h.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f169c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f172f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f173g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f174h;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f170d = findViewById(R.id.ap);
        this.f171e = findViewById(R.id.ax);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f168b || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        Drawable drawable2;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z, i, i2, i3, i4);
        View view2 = this.f169c;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view2 == null || view2.getVisibility() == 8) ? false : true;
        if (view2 != null && view2.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view2.getLayoutParams();
            int measuredHeight2 = measuredHeight - view2.getMeasuredHeight();
            int i5 = layoutParams.bottomMargin;
            view2.layout(i, measuredHeight2 - i5, i3, measuredHeight - i5);
        }
        if (this.f175i) {
            Drawable drawable3 = this.f174h;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f172f != null) {
                if (this.f170d.getVisibility() == 0) {
                    drawable2 = this.f172f;
                    left = this.f170d.getLeft();
                    top = this.f170d.getTop();
                    right = this.f170d.getRight();
                    view = this.f170d;
                } else {
                    View view3 = this.f171e;
                    if (view3 == null || view3.getVisibility() != 0) {
                        this.f172f.setBounds(0, 0, 0, 0);
                    } else {
                        drawable2 = this.f172f;
                        left = this.f171e.getLeft();
                        top = this.f171e.getTop();
                        right = this.f171e.getRight();
                        view = this.f171e;
                    }
                    z3 = true;
                }
                drawable2.setBounds(left, top, right, view.getBottom());
                z3 = true;
            }
            this.f176j = z4;
            if (!z4 || (drawable = this.f173g) == null) {
                z2 = z3;
            } else {
                drawable.setBounds(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            }
        }
        if (z2) {
            invalidate();
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
    /* JADX WARN: Code duplicated, block: B:28:0x005a  */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iM28a;
        View view;
        int size;
        int i3;
        if (this.f170d == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.f177k) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), RecyclerView.UNDEFINED_DURATION);
        }
        super.onMeasure(i, i2);
        if (this.f170d == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        View view2 = this.f169c;
        if (view2 == null || view2.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        if (m29b(this.f170d)) {
            if (m29b(this.f171e)) {
                iM28a = 0;
            } else {
                view = this.f171e;
            }
            if (mode == Integer.MIN_VALUE) {
                size = View.MeasureSpec.getSize(i2);
            } else {
                size = Integer.MAX_VALUE;
            }
            setMeasuredDimension(getMeasuredWidth(), Math.min(m28a(this.f169c) + iM28a, size));
        }
        view = this.f170d;
        iM28a = m28a(view);
        if (mode == Integer.MIN_VALUE) {
            size = View.MeasureSpec.getSize(i2);
        } else {
            size = Integer.MAX_VALUE;
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min(m28a(this.f169c) + iM28a, size));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f172f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f172f);
        }
        this.f172f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f170d;
            if (view != null) {
                this.f172f.setBounds(view.getLeft(), this.f170d.getTop(), this.f170d.getRight(), this.f170d.getBottom());
            }
        }
        boolean z = true;
        if (!this.f175i ? this.f172f != null || this.f173g != null : this.f174h != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f174h;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f174h);
        }
        this.f174h = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f175i && (drawable2 = this.f174h) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f175i ? !(this.f172f != null || this.f173g != null) : this.f174h == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f173g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f173g);
        }
        this.f173g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f176j && (drawable2 = this.f173g) != null) {
                drawable2.setBounds(this.f169c.getLeft(), this.f169c.getTop(), this.f169c.getRight(), this.f169c.getBottom());
            }
        }
        boolean z = true;
        if (!this.f175i ? this.f172f != null || this.f173g != null : this.f174h != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setTabContainer(C0280q0 c0280q0) {
        View view = this.f169c;
        if (view != null) {
            removeView(view);
        }
        this.f169c = c0280q0;
        if (c0280q0 != null) {
            addView(c0280q0);
            ViewGroup.LayoutParams layoutParams = c0280q0.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            c0280q0.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f168b = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f172f;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f173g;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f174h;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f172f && !this.f175i) || (drawable == this.f173g && this.f176j) || ((drawable == this.f174h && this.f175i) || super.verifyDrawable(drawable));
    }
}
