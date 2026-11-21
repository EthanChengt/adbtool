package p006b.p008b.p016h.p017i;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.didjdk.adbhelper.R;
import java.util.WeakHashMap;
import p006b.p032h.p044j.C0418m;

/* JADX INFO: renamed from: b.b.h.i.l */
/* JADX INFO: loaded from: classes.dex */
public class C0234l {

    /* JADX INFO: renamed from: a */
    public final Context f1699a;

    /* JADX INFO: renamed from: b */
    public final C0229g f1700b;

    /* JADX INFO: renamed from: c */
    public final boolean f1701c;

    /* JADX INFO: renamed from: d */
    public final int f1702d;

    /* JADX INFO: renamed from: e */
    public final int f1703e;

    /* JADX INFO: renamed from: f */
    public View f1704f;

    /* JADX INFO: renamed from: h */
    public boolean f1706h;

    /* JADX INFO: renamed from: i */
    public InterfaceC0235m.a f1707i;

    /* JADX INFO: renamed from: j */
    public AbstractC0233k f1708j;

    /* JADX INFO: renamed from: k */
    public PopupWindow.OnDismissListener f1709k;

    /* JADX INFO: renamed from: g */
    public int f1705g = 8388611;

    /* JADX INFO: renamed from: l */
    public final PopupWindow.OnDismissListener f1710l = new a();

    /* JADX INFO: renamed from: b.b.h.i.l$a */
    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            C0234l.this.mo991c();
        }
    }

    public C0234l(Context context, C0229g c0229g, View view, boolean z, int i, int i2) {
        this.f1699a = context;
        this.f1700b = c0229g;
        this.f1704f = view;
        this.f1701c = z;
        this.f1702d = i;
        this.f1703e = i2;
    }

    /* JADX INFO: renamed from: a */
    public AbstractC0233k m989a() {
        if (this.f1708j == null) {
            Display defaultDisplay = ((WindowManager) this.f1699a.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            AbstractC0233k viewOnKeyListenerC0226d = Math.min(point.x, point.y) >= this.f1699a.getResources().getDimensionPixelSize(R.dimen.w) ? new ViewOnKeyListenerC0226d(this.f1699a, this.f1704f, this.f1702d, this.f1703e, this.f1701c) : new ViewOnKeyListenerC0239q(this.f1699a, this.f1700b, this.f1704f, this.f1702d, this.f1703e, this.f1701c);
            viewOnKeyListenerC0226d.mo924o(this.f1700b);
            viewOnKeyListenerC0226d.mo930v(this.f1710l);
            viewOnKeyListenerC0226d.mo926r(this.f1704f);
            viewOnKeyListenerC0226d.mo918l(this.f1707i);
            viewOnKeyListenerC0226d.mo927s(this.f1706h);
            viewOnKeyListenerC0226d.mo928t(this.f1705g);
            this.f1708j = viewOnKeyListenerC0226d;
        }
        return this.f1708j;
    }

    /* JADX INFO: renamed from: b */
    public boolean m990b() {
        AbstractC0233k abstractC0233k = this.f1708j;
        return abstractC0233k != null && abstractC0233k.mo921b();
    }

    /* JADX INFO: renamed from: c */
    public void mo991c() {
        this.f1708j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f1709k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* JADX INFO: renamed from: d */
    public void m992d(InterfaceC0235m.a aVar) {
        this.f1707i = aVar;
        AbstractC0233k abstractC0233k = this.f1708j;
        if (abstractC0233k != null) {
            abstractC0233k.mo918l(aVar);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m993e(int i, int i2, boolean z, boolean z2) {
        AbstractC0233k abstractC0233kM989a = m989a();
        abstractC0233kM989a.mo931w(z2);
        if (z) {
            int i3 = this.f1705g;
            View view = this.f1704f;
            WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
            if ((Gravity.getAbsoluteGravity(i3, view.getLayoutDirection()) & 7) == 5) {
                i -= this.f1704f.getWidth();
            }
            abstractC0233kM989a.mo929u(i);
            abstractC0233kM989a.mo932x(i2);
            int i4 = (int) ((this.f1699a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            abstractC0233kM989a.f1698b = new Rect(i - i4, i2 - i4, i + i4, i2 + i4);
        }
        abstractC0233kM989a.mo922f();
    }

    /* JADX INFO: renamed from: f */
    public boolean m994f() {
        if (m990b()) {
            return true;
        }
        if (this.f1704f == null) {
            return false;
        }
        m993e(0, 0, false, false);
        return true;
    }
}
