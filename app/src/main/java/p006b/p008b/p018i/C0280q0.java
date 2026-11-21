package p006b.p008b.p018i;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AdapterView;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.didjdk.adbhelper.R;
import java.util.Objects;
import p006b.p008b.C0184b;
import p006b.p008b.p009c.AbstractC0185a;

/* JADX INFO: renamed from: b.b.i.q0 */
/* JADX INFO: loaded from: classes.dex */
public class C0280q0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: b */
    public boolean f1969b;

    /* JADX INFO: renamed from: c */
    public int f1970c;

    /* JADX INFO: renamed from: d */
    public int f1971d;

    /* JADX INFO: renamed from: e */
    public int f1972e;

    /* JADX INFO: renamed from: b.b.i.q0$a */
    public class a extends LinearLayout {

        /* JADX INFO: renamed from: b */
        public AbstractC0185a.c f1973b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C0280q0 f1974c;

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            Objects.requireNonNull(this.f1974c);
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    static {
        new DecelerateInterpolator();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Context context = getContext();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, C0184b.f1200a, R.attr.f, 0);
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(13, 0);
        Resources resources = context.getResources();
        if (!context.getResources().getBoolean(R.bool.a)) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(R.dimen.j));
        }
        typedArrayObtainStyledAttributes.recycle();
        setContentHeight(layoutDimension);
        this.f1970c = context.getResources().getDimensionPixelSize(R.dimen.k);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((a) view).f1973b.m777a();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        setFillViewport(View.MeasureSpec.getMode(i) == 1073741824);
        throw null;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f1969b = z;
    }

    public void setContentHeight(int i) {
        this.f1971d = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.f1972e = i;
        throw null;
    }
}
