package p006b.p068t.p069b;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: renamed from: b.t.b.c */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC0540c implements Runnable {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f3321b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0548k f3322c;

    public RunnableC0540c(C0548k c0548k, ArrayList arrayList) {
        this.f3322c = c0548k;
        this.f3321b = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        for (C0548k.b bVar : this.f3321b) {
            C0548k c0548k = this.f3322c;
            RecyclerView.AbstractC0129d0 abstractC0129d0 = bVar.f3367a;
            int i = bVar.f3368b;
            int i2 = bVar.f3369c;
            int i3 = bVar.f3370d;
            int i4 = bVar.f3371e;
            Objects.requireNonNull(c0548k);
            View view = abstractC0129d0.f927a;
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (i5 != 0) {
                view.animate().translationX(0.0f);
            }
            if (i6 != 0) {
                view.animate().translationY(0.0f);
            }
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            c0548k.f3358p.add(abstractC0129d0);
            viewPropertyAnimatorAnimate.setDuration(c0548k.f953e).setListener(new C0545h(c0548k, abstractC0129d0, i5, view, i6, viewPropertyAnimatorAnimate)).start();
        }
        this.f3321b.clear();
        this.f3322c.f3355m.remove(this.f3321b);
    }
}
