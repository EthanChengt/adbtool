package p006b.p008b.p018i;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.recyclerview.widget.RecyclerView;
import com.didjdk.adbhelper.R;
import p006b.p008b.C0184b;
import p006b.p008b.p016h.p017i.C0229g;
import p006b.p032h.p044j.C0418m;
import p006b.p032h.p044j.C0423r;
import p006b.p032h.p044j.InterfaceC0424s;

/* JADX INFO: renamed from: b.b.i.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0242a extends ViewGroup {

    /* JADX INFO: renamed from: b */
    public final a f1738b;

    /* JADX INFO: renamed from: c */
    public final Context f1739c;

    /* JADX INFO: renamed from: d */
    public ActionMenuView f1740d;

    /* JADX INFO: renamed from: e */
    public C0248c f1741e;

    /* JADX INFO: renamed from: f */
    public int f1742f;

    /* JADX INFO: renamed from: g */
    public C0423r f1743g;

    /* JADX INFO: renamed from: h */
    public boolean f1744h;

    /* JADX INFO: renamed from: i */
    public boolean f1745i;

    /* JADX INFO: renamed from: b.b.i.a$a */
    public class a implements InterfaceC0424s {

        /* JADX INFO: renamed from: a */
        public boolean f1746a = false;

        /* JADX INFO: renamed from: b */
        public int f1747b;

        public a() {
        }

        @Override // p006b.p032h.p044j.InterfaceC0424s
        /* JADX INFO: renamed from: a */
        public void mo849a(View view) {
            if (this.f1746a) {
                return;
            }
            AbstractC0242a abstractC0242a = AbstractC0242a.this;
            abstractC0242a.f1743g = null;
            AbstractC0242a.super.setVisibility(this.f1747b);
        }

        @Override // p006b.p032h.p044j.InterfaceC0424s
        /* JADX INFO: renamed from: b */
        public void mo857b(View view) {
            AbstractC0242a.super.setVisibility(0);
            this.f1746a = false;
        }

        @Override // p006b.p032h.p044j.InterfaceC0424s
        /* JADX INFO: renamed from: c */
        public void mo1000c(View view) {
            this.f1746a = true;
        }
    }

    public AbstractC0242a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AbstractC0242a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1738b = new a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.c, typedValue, true) || typedValue.resourceId == 0) {
            this.f1739c = context;
        } else {
            this.f1739c = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* JADX INFO: renamed from: c */
    public int m997c(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, RecyclerView.UNDEFINED_DURATION), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* JADX INFO: renamed from: d */
    public int m998d(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    /* JADX INFO: renamed from: e */
    public C0423r m999e(int i, long j) {
        C0423r c0423r = this.f1743g;
        if (c0423r != null) {
            c0423r.m1592b();
        }
        if (i != 0) {
            C0423r c0423rM1558a = C0418m.m1558a(this);
            c0423rM1558a.m1591a(0.0f);
            c0423rM1558a.m1593c(j);
            a aVar = this.f1738b;
            AbstractC0242a.this.f1743g = c0423rM1558a;
            aVar.f1747b = i;
            View view = c0423rM1558a.f2732a.get();
            if (view != null) {
                c0423rM1558a.m1595e(view, aVar);
            }
            return c0423rM1558a;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        C0423r c0423rM1558a2 = C0418m.m1558a(this);
        c0423rM1558a2.m1591a(1.0f);
        c0423rM1558a2.m1593c(j);
        a aVar2 = this.f1738b;
        AbstractC0242a.this.f1743g = c0423rM1558a2;
        aVar2.f1747b = i;
        View view2 = c0423rM1558a2.f2732a.get();
        if (view2 != null) {
            c0423rM1558a2.m1595e(view2, aVar2);
        }
        return c0423rM1558a2;
    }

    public int getAnimatedVisibility() {
        return this.f1743g != null ? this.f1738b.f1747b : getVisibility();
    }

    public int getContentHeight() {
        return this.f1742f;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        int i;
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, C0184b.f1200a, R.attr.f, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        C0248c c0248c = this.f1741e;
        if (c0248c != null) {
            Configuration configuration2 = c0248c.f1568c.getResources().getConfiguration();
            int i2 = configuration2.screenWidthDp;
            int i3 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
                i = 5;
            } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
                i = 4;
            } else {
                i = i2 >= 360 ? 3 : 2;
            }
            c0248c.f1792r = i;
            C0229g c0229g = c0248c.f1569d;
            if (c0229g != null) {
                c0229g.mo957q(true);
            }
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1745i = false;
        }
        if (!this.f1745i) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f1745i = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1745i = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1744h = false;
        }
        if (!this.f1744h) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f1744h = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1744h = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i);

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            C0423r c0423r = this.f1743g;
            if (c0423r != null) {
                c0423r.m1592b();
            }
            super.setVisibility(i);
        }
    }
}
