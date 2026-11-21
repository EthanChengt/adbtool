package p080c.p126d.p127a.p128a.p143m;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p006b.p032h.p044j.C0406a;
import p006b.p032h.p044j.p045w.C0429b;

/* JADX INFO: renamed from: c.d.a.a.m.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1231g<S> extends AbstractC1248x<S> {

    /* JADX INFO: renamed from: g0 */
    public static final /* synthetic */ int f5886g0 = 0;

    /* JADX INFO: renamed from: W */
    public int f5887W;

    /* JADX INFO: renamed from: X */
    public InterfaceC1228d<S> f5888X;

    /* JADX INFO: renamed from: Y */
    public C1224a f5889Y;

    /* JADX INFO: renamed from: Z */
    public C1243s f5890Z;

    /* JADX INFO: renamed from: a0 */
    public e f5891a0;

    /* JADX INFO: renamed from: b0 */
    public C1227c f5892b0;

    /* JADX INFO: renamed from: c0 */
    public RecyclerView f5893c0;

    /* JADX INFO: renamed from: d0 */
    public RecyclerView f5894d0;

    /* JADX INFO: renamed from: e0 */
    public View f5895e0;

    /* JADX INFO: renamed from: f0 */
    public View f5896f0;

    /* JADX INFO: renamed from: c.d.a.a.m.g$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f5897b;

        public a(int i) {
            this.f5897b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1231g.this.f5894d0.smoothScrollToPosition(this.f5897b);
        }
    }

    /* JADX INFO: renamed from: c.d.a.a.m.g$b */
    public class b extends C0406a {
        public b(C1231g c1231g) {
        }

        @Override // p006b.p032h.p044j.C0406a
        /* JADX INFO: renamed from: d */
        public void mo223d(View view, C0429b c0429b) {
            this.f2700a.onInitializeAccessibilityNodeInfo(view, c0429b.f2743a);
            c0429b.m1617l(null);
        }
    }

    /* JADX INFO: renamed from: c.d.a.a.m.g$c */
    public class c extends C1249y {

        /* JADX INFO: renamed from: G */
        public final /* synthetic */ int f5899G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, int i, boolean z, int i2) {
            super(context, i, z);
            this.f5899G = i2;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        /* JADX INFO: renamed from: X0 */
        public void mo454X0(RecyclerView.C0123a0 c0123a0, int[] iArr) {
            if (this.f5899G == 0) {
                iArr[0] = C1231g.this.f5894d0.getWidth();
                iArr[1] = C1231g.this.f5894d0.getWidth();
            } else {
                iArr[0] = C1231g.this.f5894d0.getHeight();
                iArr[1] = C1231g.this.f5894d0.getHeight();
            }
        }
    }

    /* JADX INFO: renamed from: c.d.a.a.m.g$d */
    public class d implements f {
        public d() {
        }
    }

    /* JADX INFO: renamed from: c.d.a.a.m.g$e */
    public enum e {
        DAY,
        YEAR
    }

    /* JADX INFO: renamed from: c.d.a.a.m.g$f */
    public interface f {
    }

    /* JADX INFO: renamed from: G0 */
    public LinearLayoutManager m2857G0() {
        return (LinearLayoutManager) this.f5894d0.getLayoutManager();
    }

    /* JADX INFO: renamed from: H0 */
    public final void m2858H0(int i) {
        this.f5894d0.post(new a(i));
    }

    /* JADX INFO: renamed from: I0 */
    public void m2859I0(C1243s c1243s) {
        RecyclerView recyclerView;
        int i;
        C1246v c1246v = (C1246v) this.f5894d0.getAdapter();
        int iM2874o = c1246v.f5955c.f5853b.m2874o(c1243s);
        int iM2879j = iM2874o - c1246v.m2879j(this.f5890Z);
        boolean z = Math.abs(iM2879j) > 3;
        boolean z2 = iM2879j > 0;
        this.f5890Z = c1243s;
        if (!z || !z2) {
            if (z) {
                recyclerView = this.f5894d0;
                i = iM2874o + 3;
            }
            m2858H0(iM2874o);
        }
        recyclerView = this.f5894d0;
        i = iM2874o - 3;
        recyclerView.scrollToPosition(i);
        m2858H0(iM2874o);
    }

    /* JADX INFO: renamed from: J0 */
    public void m2860J0(e eVar) {
        this.f5891a0 = eVar;
        if (eVar == e.YEAR) {
            this.f5893c0.getLayoutManager().mo450K0(((C1225a0) this.f5893c0.getAdapter()).m2846i(this.f5890Z.f5944e));
            this.f5895e0.setVisibility(0);
            this.f5896f0.setVisibility(8);
        } else if (eVar == e.DAY) {
            this.f5895e0.setVisibility(8);
            this.f5896f0.setVisibility(0);
            m2859I0(this.f5890Z);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: L */
    public void mo279L(Bundle bundle) {
        super.mo279L(bundle);
        if (bundle == null) {
            bundle = this.f686g;
        }
        this.f5887W = bundle.getInt("THEME_RES_ID_KEY");
        this.f5888X = (InterfaceC1228d) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f5889Y = (C1224a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f5890Z = (C1243s) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x013b, code lost:
    
        r13 = new p006b.p068t.p069b.C0553p();
     */
    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View mo283P(android.view.LayoutInflater r11, android.view.ViewGroup r12, android.os.Bundle r13) {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p080c.p126d.p127a.p128a.p143m.C1231g.mo283P(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: g0 */
    public void mo302g0(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f5887W);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f5888X);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f5889Y);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f5890Z);
    }
}
