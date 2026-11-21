package p006b.p008b.p018i;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p006b.p008b.C0184b;
import p006b.p008b.p016h.p017i.InterfaceC0238p;
import p006b.p032h.p033b.C0360f;
import p006b.p032h.p044j.C0418m;

/* JADX INFO: renamed from: b.b.i.k0 */
/* JADX INFO: loaded from: classes.dex */
public class C0268k0 implements InterfaceC0238p {

    /* JADX INFO: renamed from: B */
    public static Method f1895B;

    /* JADX INFO: renamed from: C */
    public static Method f1896C;

    /* JADX INFO: renamed from: D */
    public static Method f1897D;

    /* JADX INFO: renamed from: A */
    public PopupWindow f1898A;

    /* JADX INFO: renamed from: b */
    public Context f1899b;

    /* JADX INFO: renamed from: c */
    public ListAdapter f1900c;

    /* JADX INFO: renamed from: d */
    public C0258f0 f1901d;

    /* JADX INFO: renamed from: g */
    public int f1904g;

    /* JADX INFO: renamed from: h */
    public int f1905h;

    /* JADX INFO: renamed from: j */
    public boolean f1907j;

    /* JADX INFO: renamed from: k */
    public boolean f1908k;

    /* JADX INFO: renamed from: l */
    public boolean f1909l;

    /* JADX INFO: renamed from: p */
    public DataSetObserver f1913p;

    /* JADX INFO: renamed from: q */
    public View f1914q;

    /* JADX INFO: renamed from: r */
    public AdapterView.OnItemClickListener f1915r;

    /* JADX INFO: renamed from: w */
    public final Handler f1920w;

    /* JADX INFO: renamed from: y */
    public Rect f1922y;

    /* JADX INFO: renamed from: z */
    public boolean f1923z;

    /* JADX INFO: renamed from: e */
    public int f1902e = -2;

    /* JADX INFO: renamed from: f */
    public int f1903f = -2;

    /* JADX INFO: renamed from: i */
    public int f1906i = 1002;

    /* JADX INFO: renamed from: m */
    public int f1910m = 0;

    /* JADX INFO: renamed from: n */
    public int f1911n = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: o */
    public int f1912o = 0;

    /* JADX INFO: renamed from: s */
    public final e f1916s = new e();

    /* JADX INFO: renamed from: t */
    public final d f1917t = new d();

    /* JADX INFO: renamed from: u */
    public final c f1918u = new c();

    /* JADX INFO: renamed from: v */
    public final a f1919v = new a();

    /* JADX INFO: renamed from: x */
    public final Rect f1921x = new Rect();

    /* JADX INFO: renamed from: b.b.i.k0$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0258f0 c0258f0 = C0268k0.this.f1901d;
            if (c0258f0 != null) {
                c0258f0.setListSelectionHidden(true);
                c0258f0.requestLayout();
            }
        }
    }

    /* JADX INFO: renamed from: b.b.i.k0$b */
    public class b extends DataSetObserver {
        public b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (C0268k0.this.mo921b()) {
                C0268k0.this.mo922f();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            C0268k0.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: b.b.i.k0$c */
    public class c implements AbsListView.OnScrollListener {
        public c() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1) {
                if ((C0268k0.this.f1898A.getInputMethodMode() == 2) || C0268k0.this.f1898A.getContentView() == null) {
                    return;
                }
                C0268k0 c0268k0 = C0268k0.this;
                c0268k0.f1920w.removeCallbacks(c0268k0.f1916s);
                C0268k0.this.f1916s.run();
            }
        }
    }

    /* JADX INFO: renamed from: b.b.i.k0$d */
    public class d implements View.OnTouchListener {
        public d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = C0268k0.this.f1898A) != null && popupWindow.isShowing() && x >= 0 && x < C0268k0.this.f1898A.getWidth() && y >= 0 && y < C0268k0.this.f1898A.getHeight()) {
                C0268k0 c0268k0 = C0268k0.this;
                c0268k0.f1920w.postDelayed(c0268k0.f1916s, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            C0268k0 c0268k1 = C0268k0.this;
            c0268k1.f1920w.removeCallbacks(c0268k1.f1916s);
            return false;
        }
    }

    /* JADX INFO: renamed from: b.b.i.k0$e */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0258f0 c0258f0 = C0268k0.this.f1901d;
            if (c0258f0 != null) {
                WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
                if (!c0258f0.isAttachedToWindow() || C0268k0.this.f1901d.getCount() <= C0268k0.this.f1901d.getChildCount()) {
                    return;
                }
                int childCount = C0268k0.this.f1901d.getChildCount();
                C0268k0 c0268k0 = C0268k0.this;
                if (childCount <= c0268k0.f1911n) {
                    c0268k0.f1898A.setInputMethodMode(2);
                    C0268k0.this.mo922f();
                }
            }
        }
    }

    static {
        Class cls = Boolean.TYPE;
        int i = Build.VERSION.SDK_INT;
        if (i <= 28) {
            try {
                f1895B = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", cls);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f1897D = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (i <= 23) {
            try {
                f1896C = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, cls);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public C0268k0(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1899b = context;
        this.f1920w = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0184b.f1214o, i, i2);
        this.f1904g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f1905h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1907j = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C0277p c0277p = new C0277p(context, attributeSet, i, i2);
        this.f1898A = c0277p;
        c0277p.setInputMethodMode(1);
    }

    /* JADX INFO: renamed from: a */
    public void m1089a(int i) {
        this.f1904g = i;
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0238p
    /* JADX INFO: renamed from: b */
    public boolean mo921b() {
        return this.f1898A.isShowing();
    }

    /* JADX INFO: renamed from: c */
    public int m1090c() {
        return this.f1904g;
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0238p
    public void dismiss() {
        this.f1898A.dismiss();
        this.f1898A.setContentView(null);
        this.f1901d = null;
        this.f1920w.removeCallbacks(this.f1916s);
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0238p
    /* JADX INFO: renamed from: f */
    public void mo922f() {
        int i;
        int maxAvailableHeight;
        int i2;
        int paddingBottom;
        C0258f0 c0258f0;
        int i3 = Build.VERSION.SDK_INT;
        if (this.f1901d == null) {
            C0258f0 c0258f0Mo1096q = mo1096q(this.f1899b, !this.f1923z);
            this.f1901d = c0258f0Mo1096q;
            c0258f0Mo1096q.setAdapter(this.f1900c);
            this.f1901d.setOnItemClickListener(this.f1915r);
            this.f1901d.setFocusable(true);
            this.f1901d.setFocusableInTouchMode(true);
            this.f1901d.setOnItemSelectedListener(new C0266j0(this));
            this.f1901d.setOnScrollListener(this.f1918u);
            this.f1898A.setContentView(this.f1901d);
        }
        Drawable background = this.f1898A.getBackground();
        if (background != null) {
            background.getPadding(this.f1921x);
            Rect rect = this.f1921x;
            int i4 = rect.top;
            i = rect.bottom + i4;
            if (!this.f1907j) {
                this.f1905h = -i4;
            }
        } else {
            this.f1921x.setEmpty();
            i = 0;
        }
        boolean z = this.f1898A.getInputMethodMode() == 2;
        View view = this.f1914q;
        int i5 = this.f1905h;
        if (i3 <= 23) {
            Method method = f1896C;
            if (method != null) {
                try {
                    maxAvailableHeight = ((Integer) method.invoke(this.f1898A, view, Integer.valueOf(i5), Boolean.valueOf(z))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                    maxAvailableHeight = this.f1898A.getMaxAvailableHeight(view, i5);
                }
            } else {
                maxAvailableHeight = this.f1898A.getMaxAvailableHeight(view, i5);
            }
        } else {
            maxAvailableHeight = this.f1898A.getMaxAvailableHeight(view, i5, z);
        }
        if (this.f1902e == -1) {
            paddingBottom = maxAvailableHeight + i;
        } else {
            int i6 = this.f1903f;
            if (i6 != -2) {
                i2 = 1073741824;
                if (i6 == -1) {
                    int i7 = this.f1899b.getResources().getDisplayMetrics().widthPixels;
                    Rect rect2 = this.f1921x;
                    i6 = i7 - (rect2.left + rect2.right);
                }
            } else {
                int i8 = this.f1899b.getResources().getDisplayMetrics().widthPixels;
                Rect rect3 = this.f1921x;
                i6 = i8 - (rect3.left + rect3.right);
                i2 = RecyclerView.UNDEFINED_DURATION;
            }
            int iM1065a = this.f1901d.m1065a(View.MeasureSpec.makeMeasureSpec(i6, i2), maxAvailableHeight - 0, -1);
            paddingBottom = iM1065a + (iM1065a > 0 ? this.f1901d.getPaddingBottom() + this.f1901d.getPaddingTop() + i + 0 : 0);
        }
        boolean z2 = this.f1898A.getInputMethodMode() == 2;
        C0360f.m1436a0(this.f1898A, this.f1906i);
        if (this.f1898A.isShowing()) {
            View view2 = this.f1914q;
            WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
            if (view2.isAttachedToWindow()) {
                int width = this.f1903f;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f1914q.getWidth();
                }
                int i9 = this.f1902e;
                if (i9 == -1) {
                    if (!z2) {
                        paddingBottom = -1;
                    }
                    if (z2) {
                        this.f1898A.setWidth(this.f1903f == -1 ? -1 : 0);
                        this.f1898A.setHeight(0);
                    } else {
                        this.f1898A.setWidth(this.f1903f == -1 ? -1 : 0);
                        this.f1898A.setHeight(-1);
                    }
                } else if (i9 != -2) {
                    paddingBottom = i9;
                }
                this.f1898A.setOutsideTouchable(true);
                this.f1898A.update(this.f1914q, this.f1904g, this.f1905h, width < 0 ? -1 : width, paddingBottom < 0 ? -1 : paddingBottom);
                return;
            }
            return;
        }
        int width2 = this.f1903f;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f1914q.getWidth();
        }
        int i10 = this.f1902e;
        if (i10 == -1) {
            paddingBottom = -1;
        } else if (i10 != -2) {
            paddingBottom = i10;
        }
        this.f1898A.setWidth(width2);
        this.f1898A.setHeight(paddingBottom);
        if (i3 <= 28) {
            Method method2 = f1895B;
            if (method2 != null) {
                try {
                    method2.invoke(this.f1898A, Boolean.TRUE);
                } catch (Exception unused2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.f1898A.setIsClippedToScreen(true);
        }
        this.f1898A.setOutsideTouchable(true);
        this.f1898A.setTouchInterceptor(this.f1917t);
        if (this.f1909l) {
            C0360f.m1429U(this.f1898A, this.f1908k);
        }
        if (i3 <= 28) {
            Method method3 = f1897D;
            if (method3 != null) {
                try {
                    method3.invoke(this.f1898A, this.f1922y);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            this.f1898A.setEpicenterBounds(this.f1922y);
        }
        this.f1898A.showAsDropDown(this.f1914q, this.f1904g, this.f1905h, this.f1910m);
        this.f1901d.setSelection(-1);
        if ((!this.f1923z || this.f1901d.isInTouchMode()) && (c0258f0 = this.f1901d) != null) {
            c0258f0.setListSelectionHidden(true);
            c0258f0.requestLayout();
        }
        if (this.f1923z) {
            return;
        }
        this.f1920w.post(this.f1919v);
    }

    /* JADX INFO: renamed from: g */
    public int m1091g() {
        if (this.f1907j) {
            return this.f1905h;
        }
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public Drawable m1092i() {
        return this.f1898A.getBackground();
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0238p
    /* JADX INFO: renamed from: k */
    public ListView mo923k() {
        return this.f1901d;
    }

    /* JADX INFO: renamed from: m */
    public void m1093m(Drawable drawable) {
        this.f1898A.setBackgroundDrawable(drawable);
    }

    /* JADX INFO: renamed from: n */
    public void m1094n(int i) {
        this.f1905h = i;
        this.f1907j = true;
    }

    /* JADX INFO: renamed from: o */
    public void mo1095o(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f1913p;
        if (dataSetObserver == null) {
            this.f1913p = new b();
        } else {
            ListAdapter listAdapter2 = this.f1900c;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1900c = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1913p);
        }
        C0258f0 c0258f0 = this.f1901d;
        if (c0258f0 != null) {
            c0258f0.setAdapter(this.f1900c);
        }
    }

    /* JADX INFO: renamed from: q */
    public C0258f0 mo1096q(Context context, boolean z) {
        return new C0258f0(context, z);
    }

    /* JADX INFO: renamed from: r */
    public void m1097r(int i) {
        Drawable background = this.f1898A.getBackground();
        if (background == null) {
            this.f1903f = i;
            return;
        }
        background.getPadding(this.f1921x);
        Rect rect = this.f1921x;
        this.f1903f = rect.left + rect.right + i;
    }

    /* JADX INFO: renamed from: s */
    public void m1098s(boolean z) {
        this.f1923z = z;
        this.f1898A.setFocusable(z);
    }
}
