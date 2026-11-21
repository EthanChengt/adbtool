package p006b.p008b.p018i;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.didjdk.adbhelper.R;

/* JADX INFO: renamed from: b.b.i.s */
/* JADX INFO: loaded from: classes.dex */
public class C0283s extends RatingBar {

    /* JADX INFO: renamed from: b */
    public final C0279q f1997b;

    public C0283s(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.nz);
        C0279q c0279q = new C0279q(this);
        this.f1997b = c0279q;
        c0279q.mo1119a(attributeSet, R.attr.nz);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = this.f1997b.f1968b;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
