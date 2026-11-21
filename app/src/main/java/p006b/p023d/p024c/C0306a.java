package p006b.p023d.p024c;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* JADX INFO: renamed from: b.d.c.a */
/* JADX INFO: loaded from: classes.dex */
public class C0306a extends C0308c {

    /* JADX INFO: renamed from: b.d.c.a$a */
    public class a implements C0312g.a {
        public a(C0306a c0306a) {
        }

        @Override // p006b.p023d.p024c.C0312g.a
        /* JADX INFO: renamed from: a */
        public void mo1203a(Canvas canvas, RectF rectF, float f, Paint paint) {
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    @Override // p006b.p023d.p024c.InterfaceC0310e
    /* JADX INFO: renamed from: n */
    public void mo1202n() {
        C0312g.f2131r = new a(this);
    }
}
