package p006b.p008b.p018i;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.didjdk.adbhelper.R;
import java.lang.reflect.Field;
import p006b.p008b.p012e.p013a.C0211c;
import p006b.p032h.p033b.C0360f;
import p006b.p032h.p046k.C0434c;

/* JADX INFO: renamed from: b.b.i.f0 */
/* JADX INFO: loaded from: classes.dex */
public class C0258f0 extends ListView {

    /* JADX INFO: renamed from: b */
    public final Rect f1828b;

    /* JADX INFO: renamed from: c */
    public int f1829c;

    /* JADX INFO: renamed from: d */
    public int f1830d;

    /* JADX INFO: renamed from: e */
    public int f1831e;

    /* JADX INFO: renamed from: f */
    public int f1832f;

    /* JADX INFO: renamed from: g */
    public int f1833g;

    /* JADX INFO: renamed from: h */
    public Field f1834h;

    /* JADX INFO: renamed from: i */
    public a f1835i;

    /* JADX INFO: renamed from: j */
    public boolean f1836j;

    /* JADX INFO: renamed from: k */
    public boolean f1837k;

    /* JADX INFO: renamed from: l */
    public boolean f1838l;

    /* JADX INFO: renamed from: m */
    public C0434c f1839m;

    /* JADX INFO: renamed from: n */
    public b f1840n;

    /* JADX INFO: renamed from: b.b.i.f0$a */
    public static class a extends C0211c {

        /* JADX INFO: renamed from: c */
        public boolean f1841c;

        public a(Drawable drawable) {
            super(drawable);
            this.f1841c = true;
        }

        @Override // p006b.p008b.p012e.p013a.C0211c, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f1841c) {
                this.f1474b.draw(canvas);
            }
        }

        @Override // p006b.p008b.p012e.p013a.C0211c, android.graphics.drawable.Drawable
        public void setHotspot(float f, float f2) {
            if (this.f1841c) {
                C0360f.m1424P(this.f1474b, f, f2);
            }
        }

        @Override // p006b.p008b.p012e.p013a.C0211c, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f1841c) {
                C0360f.m1425Q(this.f1474b, i, i2, i3, i4);
            }
        }

        @Override // p006b.p008b.p012e.p013a.C0211c, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f1841c) {
                return this.f1474b.setState(iArr);
            }
            return false;
        }

        @Override // p006b.p008b.p012e.p013a.C0211c, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z, boolean z2) {
            if (this.f1841c) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: b.b.i.f0$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0258f0 c0258f0 = C0258f0.this;
            c0258f0.f1840n = null;
            c0258f0.drawableStateChanged();
        }
    }

    public C0258f0(Context context, boolean z) {
        super(context, null, R.attr.g4);
        this.f1828b = new Rect();
        this.f1829c = 0;
        this.f1830d = 0;
        this.f1831e = 0;
        this.f1832f = 0;
        this.f1837k = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f1834h = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    private void setSelectorEnabled(boolean z) {
        a aVar = this.f1835i;
        if (aVar != null) {
            aVar.f1841c = z;
        }
    }

    /* JADX INFO: renamed from: a */
    public int m1065a(int i, int i2, int i3) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return measuredHeight;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < count) {
            int itemViewType = adapter.getItemViewType(i4);
            if (itemViewType != i5) {
                view = null;
                i5 = itemViewType;
            }
            view = adapter.getView(i4, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i7 = layoutParams.height;
            view.measure(i, i7 > 0 ? View.MeasureSpec.makeMeasureSpec(i7, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i4 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i2) {
                return (i3 < 0 || i4 <= i3 || i6 <= 0 || measuredHeight == i2) ? i2 : i6;
            }
            if (i3 >= 0 && i4 >= i3) {
                i6 = measuredHeight;
            }
            i4++;
        }
        return measuredHeight;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001d  */
    /* JADX WARN: Code duplicated, block: B:74:0x012f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0144  */
    /* JADX WARN: Code duplicated, block: B:78:0x0149  */
    /* JADX WARN: Code duplicated, block: B:80:0x014d  */
    /* JADX WARN: Code duplicated, block: B:82:0x015f  */
    /* JADX WARN: Code duplicated, block: B:84:0x0163  */
    /* JADX WARN: Code duplicated, block: B:86:0x0167  */
    /* JADX INFO: renamed from: b */
    public boolean m1066b(MotionEvent motionEvent, int i) {
        boolean z;
        View childAt;
        View childAt2;
        C0434c c0434c;
        int actionMasked = motionEvent.getActionMasked();
        boolean z2 = true;
        if (actionMasked == 1) {
            z = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z = true;
                } else {
                    z = false;
                }
                z2 = false;
                if (z || z2) {
                    this.f1838l = false;
                    setPressed(false);
                    drawableStateChanged();
                    childAt2 = getChildAt(this.f1833g - getFirstVisiblePosition());
                    if (childAt2 != null) {
                        childAt2.setPressed(false);
                    }
                }
                if (z) {
                    if (this.f1839m == null) {
                        this.f1839m = new C0434c(this);
                    }
                    C0434c c0434c2 = this.f1839m;
                    boolean z3 = c0434c2.f2776q;
                    c0434c2.f2776q = true;
                    c0434c2.onTouch(this, motionEvent);
                } else {
                    c0434c = this.f1839m;
                    if (c0434c != null) {
                        if (c0434c.f2776q) {
                            c0434c.m1629d();
                        }
                        c0434c.f2776q = false;
                    }
                }
                return z;
            }
            z = true;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i);
        if (iFindPointerIndex < 0) {
            z = false;
            z2 = false;
        } else {
            int x = (int) motionEvent.getX(iFindPointerIndex);
            int y = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x, y);
            if (iPointToPosition != -1) {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f = x;
                float f2 = y;
                this.f1838l = true;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 21) {
                    drawableHotspotChanged(f, f2);
                }
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i3 = this.f1833g;
                if (i3 != -1 && (childAt = getChildAt(i3 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f1833g = iPointToPosition;
                float left = f - childAt3.getLeft();
                float top = f2 - childAt3.getTop();
                if (i2 >= 21) {
                    childAt3.drawableHotspotChanged(left, top);
                }
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z4 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z4) {
                    selector.setVisible(false, false);
                }
                Rect rect = this.f1828b;
                rect.set(childAt3.getLeft(), childAt3.getTop(), childAt3.getRight(), childAt3.getBottom());
                rect.left -= this.f1829c;
                rect.top -= this.f1830d;
                rect.right += this.f1831e;
                rect.bottom += this.f1832f;
                try {
                    boolean z5 = this.f1834h.getBoolean(this);
                    if (childAt3.isEnabled() != z5) {
                        this.f1834h.set(this, Boolean.valueOf(!z5));
                        if (iPointToPosition != -1) {
                            refreshDrawableState();
                        }
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
                if (z4) {
                    Rect rect2 = this.f1828b;
                    float fExactCenterX = rect2.exactCenterX();
                    float fExactCenterY = rect2.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    C0360f.m1424P(selector, fExactCenterX, fExactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    C0360f.m1424P(selector2, f, f2);
                }
                setSelectorEnabled(false);
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z = true;
                z2 = false;
            }
        }
        if (z) {
            this.f1838l = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f1833g - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        } else {
            this.f1838l = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f1833g - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        }
        if (z) {
            if (this.f1839m == null) {
                this.f1839m = new C0434c(this);
            }
            C0434c c0434c3 = this.f1839m;
            boolean z6 = c0434c3.f2776q;
            c0434c3.f2776q = true;
            c0434c3.onTouch(this, motionEvent);
        } else {
            c0434c = this.f1839m;
            if (c0434c != null) {
                if (c0434c.f2776q) {
                    c0434c.m1629d();
                }
                c0434c.f2776q = false;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: c */
    public final void m1067c() {
        Drawable selector = getSelector();
        if (selector != null && this.f1838l && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Drawable selector;
        if (!this.f1828b.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f1828b);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.f1840n != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        m1067c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f1837k || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f1837k || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f1837k || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f1837k && this.f1836j) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f1840n = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f1840n == null) {
            b bVar = new b();
            this.f1840n = bVar;
            post(bVar);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                }
                m1067c();
            }
        } else {
            setSelection(-1);
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1833g = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        b bVar = this.f1840n;
        if (bVar != null) {
            C0258f0 c0258f0 = C0258f0.this;
            c0258f0.f1840n = null;
            c0258f0.removeCallbacks(bVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.f1836j = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        a aVar = drawable != null ? new a(drawable) : null;
        this.f1835i = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1829c = rect.left;
        this.f1830d = rect.top;
        this.f1831e = rect.right;
        this.f1832f = rect.bottom;
    }
}
