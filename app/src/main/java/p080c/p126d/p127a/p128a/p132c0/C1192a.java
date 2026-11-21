package p080c.p126d.p127a.p128a.p132c0;

import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.material.transformation.FabTransformationBehavior;

/* JADX INFO: renamed from: c.d.a.a.c0.a */
/* JADX INFO: loaded from: classes.dex */
public class C1192a implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ View f5682a;

    public C1192a(FabTransformationBehavior fabTransformationBehavior, View view) {
        this.f5682a = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f5682a.invalidate();
    }
}
