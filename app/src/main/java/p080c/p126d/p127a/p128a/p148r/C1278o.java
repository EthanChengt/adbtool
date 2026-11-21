package p080c.p126d.p127a.p128a.p148r;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* JADX INFO: renamed from: c.d.a.a.r.o */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"AppCompatCustomView"})
public class C1278o extends ImageButton {

    /* JADX INFO: renamed from: b */
    public int f6155b;

    public C1278o(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f6155b = getVisibility();
    }

    public C1278o(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6155b = getVisibility();
    }

    /* JADX INFO: renamed from: b */
    public final void m2948b(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f6155b = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.f6155b;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        this.f6155b = i;
    }
}
