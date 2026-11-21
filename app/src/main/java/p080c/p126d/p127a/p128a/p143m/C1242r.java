package p080c.p126d.p127a.p128a.p143m;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: renamed from: c.d.a.a.m.r */
/* JADX INFO: loaded from: classes.dex */
public final class C1242r<S> extends AbstractC1248x<S> {

    /* JADX INFO: renamed from: W */
    public InterfaceC1228d<S> f5938W;

    /* JADX INFO: renamed from: X */
    public C1224a f5939X;

    /* JADX INFO: renamed from: c.d.a.a.m.r$a */
    public class a implements InterfaceC1247w<S> {
        public a() {
        }

        @Override // p080c.p126d.p127a.p128a.p143m.InterfaceC1247w
        /* JADX INFO: renamed from: a */
        public void mo2866a(S s) {
            Iterator<InterfaceC1247w<S>> it = C1242r.this.f5961V.iterator();
            while (it.hasNext()) {
                it.next().mo2866a(s);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: L */
    public void mo279L(Bundle bundle) {
        super.mo279L(bundle);
        if (bundle == null) {
            bundle = this.f686g;
        }
        this.f5938W = (InterfaceC1228d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f5939X = (C1224a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: P */
    public View mo283P(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f5938W.m2855h(layoutInflater, viewGroup, bundle, this.f5939X, new a());
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: g0 */
    public void mo302g0(Bundle bundle) {
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f5938W);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f5939X);
    }
}
