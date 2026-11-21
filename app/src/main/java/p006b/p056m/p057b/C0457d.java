package p006b.p056m.p057b;

import android.view.View;
import androidx.fragment.app.Fragment;

/* JADX INFO: renamed from: b.m.b.d */
/* JADX INFO: loaded from: classes.dex */
public class C0457d extends AbstractC0471k {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Fragment f2991a;

    public C0457d(Fragment fragment) {
        this.f2991a = fragment;
    }

    @Override // p006b.p056m.p057b.AbstractC0471k
    /* JADX INFO: renamed from: b */
    public View mo1729b(int i) {
        View view = this.f2991a.f667G;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + this + " does not have a view");
    }

    @Override // p006b.p056m.p057b.AbstractC0471k
    /* JADX INFO: renamed from: e */
    public boolean mo1730e() {
        return this.f2991a.f667G != null;
    }
}
