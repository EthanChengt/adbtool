package p006b.p068t.p069b;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import java.util.WeakHashMap;
import p006b.p032h.p044j.C0406a;
import p006b.p032h.p044j.p045w.C0429b;
import p006b.p032h.p044j.p045w.C0430c;

/* JADX INFO: renamed from: b.t.b.u */
/* JADX INFO: loaded from: classes.dex */
public class C0558u extends C0406a {

    /* JADX INFO: renamed from: d */
    public final RecyclerView f3446d;

    /* JADX INFO: renamed from: e */
    public final a f3447e;

    /* JADX INFO: renamed from: b.t.b.u$a */
    public static class a extends C0406a {

        /* JADX INFO: renamed from: d */
        public final C0558u f3448d;

        /* JADX INFO: renamed from: e */
        public Map<View, C0406a> f3449e = new WeakHashMap();

        public a(C0558u c0558u) {
            this.f3448d = c0558u;
        }

        @Override // p006b.p032h.p044j.C0406a
        /* JADX INFO: renamed from: a */
        public boolean mo243a(View view, AccessibilityEvent accessibilityEvent) {
            C0406a c0406a = this.f3449e.get(view);
            return c0406a != null ? c0406a.mo243a(view, accessibilityEvent) : this.f2700a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // p006b.p032h.p044j.C0406a
        /* JADX INFO: renamed from: b */
        public C0430c mo1538b(View view) {
            C0406a c0406a = this.f3449e.get(view);
            return c0406a != null ? c0406a.mo1538b(view) : super.mo1538b(view);
        }

        @Override // p006b.p032h.p044j.C0406a
        /* JADX INFO: renamed from: c */
        public void mo222c(View view, AccessibilityEvent accessibilityEvent) {
            C0406a c0406a = this.f3449e.get(view);
            if (c0406a != null) {
                c0406a.mo222c(view, accessibilityEvent);
            } else {
                this.f2700a.onInitializeAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // p006b.p032h.p044j.C0406a
        /* JADX INFO: renamed from: d */
        public void mo223d(View view, C0429b c0429b) {
            if (!this.f3448d.m2060k() && this.f3448d.f3446d.getLayoutManager() != null) {
                this.f3448d.f3446d.getLayoutManager().m609j0(view, c0429b);
                C0406a c0406a = this.f3449e.get(view);
                if (c0406a != null) {
                    c0406a.mo223d(view, c0429b);
                    return;
                }
            }
            this.f2700a.onInitializeAccessibilityNodeInfo(view, c0429b.f2743a);
        }

        @Override // p006b.p032h.p044j.C0406a
        /* JADX INFO: renamed from: e */
        public void mo1539e(View view, AccessibilityEvent accessibilityEvent) {
            C0406a c0406a = this.f3449e.get(view);
            if (c0406a != null) {
                c0406a.mo1539e(view, accessibilityEvent);
            } else {
                this.f2700a.onPopulateAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // p006b.p032h.p044j.C0406a
        /* JADX INFO: renamed from: f */
        public boolean mo244f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C0406a c0406a = this.f3449e.get(viewGroup);
            return c0406a != null ? c0406a.mo244f(viewGroup, view, accessibilityEvent) : this.f2700a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // p006b.p032h.p044j.C0406a
        /* JADX INFO: renamed from: g */
        public boolean mo224g(View view, int i, Bundle bundle) {
            if (this.f3448d.m2060k() || this.f3448d.f3446d.getLayoutManager() == null) {
                return super.mo224g(view, i, bundle);
            }
            C0406a c0406a = this.f3449e.get(view);
            if (c0406a != null) {
                if (c0406a.mo224g(view, i, bundle)) {
                    return true;
                }
            } else if (super.mo224g(view, i, bundle)) {
                return true;
            }
            RecyclerView.AbstractC0140o layoutManager = this.f3448d.f3446d.getLayoutManager();
            RecyclerView.C0147v c0147v = layoutManager.f959b.mRecycler;
            return layoutManager.m566B0();
        }

        @Override // p006b.p032h.p044j.C0406a
        /* JADX INFO: renamed from: h */
        public void mo1540h(View view, int i) {
            C0406a c0406a = this.f3449e.get(view);
            if (c0406a != null) {
                c0406a.mo1540h(view, i);
            } else {
                this.f2700a.sendAccessibilityEvent(view, i);
            }
        }

        @Override // p006b.p032h.p044j.C0406a
        /* JADX INFO: renamed from: i */
        public void mo1541i(View view, AccessibilityEvent accessibilityEvent) {
            C0406a c0406a = this.f3449e.get(view);
            if (c0406a != null) {
                c0406a.mo1541i(view, accessibilityEvent);
            } else {
                this.f2700a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            }
        }
    }

    public C0558u(RecyclerView recyclerView) {
        this.f3446d = recyclerView;
        C0406a c0406aMo1943j = mo1943j();
        this.f3447e = (c0406aMo1943j == null || !(c0406aMo1943j instanceof a)) ? new a(this) : (a) c0406aMo1943j;
    }

    @Override // p006b.p032h.p044j.C0406a
    /* JADX INFO: renamed from: c */
    public void mo222c(View view, AccessibilityEvent accessibilityEvent) {
        this.f2700a.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || m2060k()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().mo468h0(accessibilityEvent);
        }
    }

    @Override // p006b.p032h.p044j.C0406a
    /* JADX INFO: renamed from: d */
    public void mo223d(View view, C0429b c0429b) {
        this.f2700a.onInitializeAccessibilityNodeInfo(view, c0429b.f2743a);
        if (m2060k() || this.f3446d.getLayoutManager() == null) {
            return;
        }
        RecyclerView.AbstractC0140o layoutManager = this.f3446d.getLayoutManager();
        RecyclerView recyclerView = layoutManager.f959b;
        RecyclerView.C0147v c0147v = recyclerView.mRecycler;
        RecyclerView.C0123a0 c0123a0 = recyclerView.mState;
        if (recyclerView.canScrollVertically(-1) || layoutManager.f959b.canScrollHorizontally(-1)) {
            c0429b.f2743a.addAction(8192);
            c0429b.f2743a.setScrollable(true);
        }
        if (layoutManager.f959b.canScrollVertically(1) || layoutManager.f959b.canScrollHorizontally(1)) {
            c0429b.f2743a.addAction(4096);
            c0429b.f2743a.setScrollable(true);
        }
        int iMo422R = layoutManager.mo422R(c0147v, c0123a0);
        int iMo407A = layoutManager.mo407A(c0147v, c0123a0);
        boolean zM596V = layoutManager.m596V();
        c0429b.m1617l(Build.VERSION.SDK_INT >= 21 ? new C0429b.b(AccessibilityNodeInfo.CollectionInfo.obtain(iMo422R, iMo407A, zM596V, layoutManager.m593S())) : new C0429b.b(AccessibilityNodeInfo.CollectionInfo.obtain(iMo422R, iMo407A, zM596V)));
    }

    @Override // p006b.p032h.p044j.C0406a
    /* JADX INFO: renamed from: g */
    public boolean mo224g(View view, int i, Bundle bundle) {
        if (super.mo224g(view, i, bundle)) {
            return true;
        }
        if (m2060k() || this.f3446d.getLayoutManager() == null) {
            return false;
        }
        RecyclerView.AbstractC0140o layoutManager = this.f3446d.getLayoutManager();
        RecyclerView.C0147v c0147v = layoutManager.f959b.mRecycler;
        return layoutManager.m564A0(i);
    }

    /* JADX INFO: renamed from: j */
    public C0406a mo1943j() {
        return this.f3447e;
    }

    /* JADX INFO: renamed from: k */
    public boolean m2060k() {
        return this.f3446d.hasPendingAdapterUpdates();
    }
}
