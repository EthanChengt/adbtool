package p006b.p026f.p029b;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: b.f.b.e */
/* JADX INFO: loaded from: classes.dex */
public class C0347e extends View {
    public C0347e(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i) {
        ConstraintLayout.C0065a c0065a = (ConstraintLayout.C0065a) getLayoutParams();
        c0065a.f477a = i;
        setLayoutParams(c0065a);
    }

    public void setGuidelineEnd(int i) {
        ConstraintLayout.C0065a c0065a = (ConstraintLayout.C0065a) getLayoutParams();
        c0065a.f479b = i;
        setLayoutParams(c0065a);
    }

    public void setGuidelinePercent(float f) {
        ConstraintLayout.C0065a c0065a = (ConstraintLayout.C0065a) getLayoutParams();
        c0065a.f481c = f;
        setLayoutParams(c0065a);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
