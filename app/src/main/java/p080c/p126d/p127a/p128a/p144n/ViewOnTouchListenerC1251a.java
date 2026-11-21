package p080c.p126d.p127a.p128a.p144n;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: c.d.a.a.n.a */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnTouchListenerC1251a implements View.OnTouchListener {

    /* JADX INFO: renamed from: b */
    public final Dialog f5964b;

    /* JADX INFO: renamed from: c */
    public final int f5965c;

    /* JADX INFO: renamed from: d */
    public final int f5966d;

    /* JADX INFO: renamed from: e */
    public final int f5967e;

    public ViewOnTouchListenerC1251a(Dialog dialog, Rect rect) {
        this.f5964b = dialog;
        this.f5965c = rect.left;
        this.f5966d = rect.top;
        this.f5967e = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = viewFindViewById.getLeft() + this.f5965c;
        int width = viewFindViewById.getWidth() + left;
        int top = viewFindViewById.getTop() + this.f5966d;
        if (new RectF(left, top, width, viewFindViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(4);
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i = this.f5967e;
            motionEventObtain.setLocation((-i) - 1, (-i) - 1);
        }
        view.performClick();
        return this.f5964b.onTouchEvent(motionEventObtain);
    }
}
