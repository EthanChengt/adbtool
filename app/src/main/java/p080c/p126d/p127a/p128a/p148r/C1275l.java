package p080c.p126d.p127a.p128a.p148r;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* JADX INFO: renamed from: c.d.a.a.r.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1275l {

    /* JADX INFO: renamed from: a */
    public final ArrayList<b> f6137a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public b f6138b = null;

    /* JADX INFO: renamed from: c */
    public ValueAnimator f6139c = null;

    /* JADX INFO: renamed from: d */
    public final Animator.AnimatorListener f6140d = new a();

    /* JADX INFO: renamed from: c.d.a.a.r.l$a */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C1275l c1275l = C1275l.this;
            if (c1275l.f6139c == animator) {
                c1275l.f6139c = null;
            }
        }
    }

    /* JADX INFO: renamed from: c.d.a.a.r.l$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final int[] f6142a;

        /* JADX INFO: renamed from: b */
        public final ValueAnimator f6143b;

        public b(int[] iArr, ValueAnimator valueAnimator) {
            this.f6142a = iArr;
            this.f6143b = valueAnimator;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2938a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f6140d);
        this.f6137a.add(bVar);
    }
}
