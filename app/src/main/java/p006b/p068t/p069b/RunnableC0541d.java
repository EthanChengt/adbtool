package p006b.p068t.p069b;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: renamed from: b.t.b.d */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC0541d implements Runnable {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f3323b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0548k f3324c;

    public RunnableC0541d(C0548k c0548k, ArrayList arrayList) {
        this.f3324c = c0548k;
        this.f3323b = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        for (C0548k.a aVar : this.f3323b) {
            C0548k c0548k = this.f3324c;
            Objects.requireNonNull(c0548k);
            RecyclerView.AbstractC0129d0 abstractC0129d0 = aVar.f3361a;
            View view = abstractC0129d0 == null ? null : abstractC0129d0.f927a;
            RecyclerView.AbstractC0129d0 abstractC0129d1 = aVar.f3362b;
            View view2 = abstractC0129d1 != null ? abstractC0129d1.f927a : null;
            if (view != null) {
                ViewPropertyAnimator duration = view.animate().setDuration(c0548k.f954f);
                c0548k.f3360r.add(aVar.f3361a);
                duration.translationX(aVar.f3365e - aVar.f3363c);
                duration.translationY(aVar.f3366f - aVar.f3364d);
                duration.alpha(0.0f).setListener(new C0546i(c0548k, aVar, duration, view)).start();
            }
            if (view2 != null) {
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
                c0548k.f3360r.add(aVar.f3362b);
                viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(c0548k.f954f).alpha(1.0f).setListener(new C0547j(c0548k, aVar, viewPropertyAnimatorAnimate, view2)).start();
            }
        }
        this.f3323b.clear();
        this.f3324c.f3356n.remove(this.f3323b);
    }
}
