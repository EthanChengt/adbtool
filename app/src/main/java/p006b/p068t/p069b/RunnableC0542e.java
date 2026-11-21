package p006b.p068t.p069b;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: renamed from: b.t.b.e */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC0542e implements Runnable {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f3325b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0548k f3326c;

    public RunnableC0542e(C0548k c0548k, ArrayList arrayList) {
        this.f3326c = c0548k;
        this.f3325b = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        for (RecyclerView.AbstractC0129d0 abstractC0129d0 : this.f3325b) {
            C0548k c0548k = this.f3326c;
            Objects.requireNonNull(c0548k);
            View view = abstractC0129d0.f927a;
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            c0548k.f3357o.add(abstractC0129d0);
            viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(c0548k.f951c).setListener(new C0544g(c0548k, abstractC0129d0, view, viewPropertyAnimatorAnimate)).start();
        }
        this.f3325b.clear();
        this.f3326c.f3354l.remove(this.f3325b);
    }
}
