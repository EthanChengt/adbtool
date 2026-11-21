package p006b.p008b.p018i;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import com.didjdk.adbhelper.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p006b.p032h.p044j.C0418m;
import p006b.p032h.p044j.C0422q;

/* JADX INFO: renamed from: b.b.i.a1 */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnLongClickListenerC0244a1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: k */
    public static ViewOnLongClickListenerC0244a1 f1762k;

    /* JADX INFO: renamed from: l */
    public static ViewOnLongClickListenerC0244a1 f1763l;

    /* JADX INFO: renamed from: b */
    public final View f1764b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f1765c;

    /* JADX INFO: renamed from: d */
    public final int f1766d;

    /* JADX INFO: renamed from: e */
    public final Runnable f1767e = new a();

    /* JADX INFO: renamed from: f */
    public final Runnable f1768f = new b();

    /* JADX INFO: renamed from: g */
    public int f1769g;

    /* JADX INFO: renamed from: h */
    public int f1770h;

    /* JADX INFO: renamed from: i */
    public C0247b1 f1771i;

    /* JADX INFO: renamed from: j */
    public boolean f1772j;

    /* JADX INFO: renamed from: b.b.i.a1$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewOnLongClickListenerC0244a1.this.m1014d(false);
        }
    }

    /* JADX INFO: renamed from: b.b.i.a1$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewOnLongClickListenerC0244a1.this.m1013b();
        }
    }

    public ViewOnLongClickListenerC0244a1(View view, CharSequence charSequence) {
        this.f1764b = view;
        this.f1765c = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = C0422q.f2731a;
        this.f1766d = Build.VERSION.SDK_INT >= 28 ? viewConfiguration.getScaledHoverSlop() : viewConfiguration.getScaledTouchSlop() / 2;
        m1012a();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* JADX INFO: renamed from: c */
    public static void m1011c(ViewOnLongClickListenerC0244a1 viewOnLongClickListenerC0244a1) {
        ViewOnLongClickListenerC0244a1 viewOnLongClickListenerC0244a2 = f1762k;
        if (viewOnLongClickListenerC0244a2 != null) {
            viewOnLongClickListenerC0244a2.f1764b.removeCallbacks(viewOnLongClickListenerC0244a2.f1767e);
        }
        f1762k = viewOnLongClickListenerC0244a1;
        if (viewOnLongClickListenerC0244a1 != null) {
            viewOnLongClickListenerC0244a1.f1764b.postDelayed(viewOnLongClickListenerC0244a1.f1767e, ViewConfiguration.getLongPressTimeout());
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1012a() {
        this.f1769g = Integer.MAX_VALUE;
        this.f1770h = Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: b */
    public void m1013b() {
        if (f1763l == this) {
            f1763l = null;
            C0247b1 c0247b1 = this.f1771i;
            if (c0247b1 != null) {
                c0247b1.m1015a();
                this.f1771i = null;
                m1012a();
                this.f1764b.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1762k == this) {
            m1011c(null);
        }
        this.f1764b.removeCallbacks(this.f1768f);
    }

    /* JADX INFO: renamed from: d */
    public void m1014d(boolean z) {
        int height;
        int i;
        View view = this.f1764b;
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        if (view.isAttachedToWindow()) {
            m1011c(null);
            ViewOnLongClickListenerC0244a1 viewOnLongClickListenerC0244a1 = f1763l;
            if (viewOnLongClickListenerC0244a1 != null) {
                viewOnLongClickListenerC0244a1.m1013b();
            }
            f1763l = this;
            this.f1772j = z;
            C0247b1 c0247b1 = new C0247b1(this.f1764b.getContext());
            this.f1771i = c0247b1;
            View view2 = this.f1764b;
            int width = this.f1769g;
            int i2 = this.f1770h;
            boolean z2 = this.f1772j;
            CharSequence charSequence = this.f1765c;
            if (c0247b1.f1778b.getParent() != null) {
                c0247b1.m1015a();
            }
            c0247b1.f1779c.setText(charSequence);
            WindowManager.LayoutParams layoutParams = c0247b1.f1780d;
            layoutParams.token = view2.getApplicationWindowToken();
            int dimensionPixelOffset = c0247b1.f1777a.getResources().getDimensionPixelOffset(R.dimen.id);
            if (view2.getWidth() < dimensionPixelOffset) {
                width = view2.getWidth() / 2;
            }
            if (view2.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = c0247b1.f1777a.getResources().getDimensionPixelOffset(R.dimen.ic);
                height = i2 + dimensionPixelOffset2;
                i = i2 - dimensionPixelOffset2;
            } else {
                height = view2.getHeight();
                i = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = c0247b1.f1777a.getResources().getDimensionPixelOffset(z2 ? R.dimen.ig : R.dimen.if_res_0x7f070152);
            View rootView = view2.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                for (Context context = view2.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                    if (context instanceof Activity) {
                        rootView = ((Activity) context).getWindow().getDecorView();
                        break;
                    }
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
            } else {
                rootView.getWindowVisibleDisplayFrame(c0247b1.f1781e);
                Rect rect = c0247b1.f1781e;
                if (rect.left < 0 && rect.top < 0) {
                    Resources resources = c0247b1.f1777a.getResources();
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    c0247b1.f1781e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(c0247b1.f1783g);
                view2.getLocationOnScreen(c0247b1.f1782f);
                int[] iArr = c0247b1.f1782f;
                int i3 = iArr[0];
                int[] iArr2 = c0247b1.f1783g;
                iArr[0] = i3 - iArr2[0];
                iArr[1] = iArr[1] - iArr2[1];
                layoutParams.x = (iArr[0] + width) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                c0247b1.f1778b.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = c0247b1.f1778b.getMeasuredHeight();
                int[] iArr3 = c0247b1.f1782f;
                int i4 = ((iArr3[1] + i) - dimensionPixelOffset3) - measuredHeight;
                int i5 = iArr3[1] + height + dimensionPixelOffset3;
                if (!z2 ? measuredHeight + i5 > c0247b1.f1781e.height() : i4 >= 0) {
                    layoutParams.y = i4;
                } else {
                    layoutParams.y = i5;
                }
            }
            ((WindowManager) c0247b1.f1777a.getSystemService("window")).addView(c0247b1.f1778b, c0247b1.f1780d);
            this.f1764b.addOnAttachStateChangeListener(this);
            long longPressTimeout = this.f1772j ? 2500L : ((this.f1764b.getWindowSystemUiVisibility() & 1) == 1 ? 3000L : 15000L) - ((long) ViewConfiguration.getLongPressTimeout());
            this.f1764b.removeCallbacks(this.f1768f);
            this.f1764b.postDelayed(this.f1768f, longPressTimeout);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        boolean z;
        if (this.f1771i != null && this.f1772j) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1764b.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                m1012a();
                m1013b();
            }
        } else if (this.f1764b.isEnabled() && this.f1771i == null) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (Math.abs(x - this.f1769g) > this.f1766d || Math.abs(y - this.f1770h) > this.f1766d) {
                this.f1769g = x;
                this.f1770h = y;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                m1011c(this);
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f1769g = view.getWidth() / 2;
        this.f1770h = view.getHeight() / 2;
        m1014d(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m1013b();
    }
}
