package p080c.p126d.p127a.p128a.p130b0;

import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;

/* JADX INFO: renamed from: c.d.a.a.b0.i */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnTouchListenerC1173i implements View.OnTouchListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AutoCompleteTextView f5621b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1172h f5622c;

    public ViewOnTouchListenerC1173i(C1172h c1172h, AutoCompleteTextView autoCompleteTextView) {
        this.f5622c = c1172h;
        this.f5621b = autoCompleteTextView;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (this.f5622c.m2750h()) {
                this.f5622c.f5607g = false;
            }
            C1172h.m2746f(this.f5622c, this.f5621b);
            view.performClick();
        }
        return false;
    }
}
