package p080c.p126d.p127a.p128a.p133d;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.view.View;

/* JADX INFO: renamed from: c.d.a.a.d.h */
/* JADX INFO: loaded from: classes.dex */
public class C1204h {

    /* JADX INFO: renamed from: a */
    public static final int[] f5712a = {R.attr.stateListAnimator};

    /* JADX INFO: renamed from: a */
    public static void m2782a(View view, float f) {
        int integer = view.getResources().getInteger(com.didjdk.adbhelper.R.integer.c);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = integer;
        stateListAnimator.addState(new int[]{R.attr.enabled, com.didjdk.adbhelper.R.attr.pe, -2130969173}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j));
        stateListAnimator.addState(new int[]{R.attr.enabled}, ObjectAnimator.ofFloat(view, "elevation", f).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }
}
