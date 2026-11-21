package p080c.p126d.p127a.p128a.p148r;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
import p080c.p126d.p127a.p128a.p151u.AbstractC1285d;
import p080c.p126d.p127a.p128a.p151u.C1283b;
import p080c.p126d.p127a.p128a.p151u.C1284c;

/* JADX INFO: renamed from: c.d.a.a.r.m */
/* JADX INFO: loaded from: classes.dex */
public class C1276m {

    /* JADX INFO: renamed from: c */
    public float f6146c;

    /* JADX INFO: renamed from: e */
    public WeakReference<b> f6148e;

    /* JADX INFO: renamed from: f */
    public C1283b f6149f;

    /* JADX INFO: renamed from: a */
    public final TextPaint f6144a = new TextPaint(1);

    /* JADX INFO: renamed from: b */
    public final AbstractC1285d f6145b = new a();

    /* JADX INFO: renamed from: d */
    public boolean f6147d = true;

    /* JADX INFO: renamed from: c.d.a.a.r.m$a */
    public class a extends AbstractC1285d {
        public a() {
        }

        @Override // p080c.p126d.p127a.p128a.p151u.AbstractC1285d
        /* JADX INFO: renamed from: a */
        public void mo2941a(int i) {
            C1276m c1276m = C1276m.this;
            c1276m.f6147d = true;
            b bVar = c1276m.f6148e.get();
            if (bVar != null) {
                bVar.mo2783a();
            }
        }

        @Override // p080c.p126d.p127a.p128a.p151u.AbstractC1285d
        /* JADX INFO: renamed from: b */
        public void mo2942b(Typeface typeface, boolean z) {
            if (z) {
                return;
            }
            C1276m c1276m = C1276m.this;
            c1276m.f6147d = true;
            b bVar = c1276m.f6148e.get();
            if (bVar != null) {
                bVar.mo2783a();
            }
        }
    }

    /* JADX INFO: renamed from: c.d.a.a.r.m$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo2783a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public C1276m(b bVar) {
        this.f6148e = new WeakReference<>(null);
        this.f6148e = new WeakReference<>(bVar);
    }

    /* JADX INFO: renamed from: a */
    public float m2939a(String str) {
        if (!this.f6147d) {
            return this.f6146c;
        }
        float fMeasureText = str == null ? 0.0f : this.f6144a.measureText((CharSequence) str, 0, str.length());
        this.f6146c = fMeasureText;
        this.f6147d = false;
        return fMeasureText;
    }

    /* JADX INFO: renamed from: b */
    public void m2940b(C1283b c1283b, Context context) {
        if (this.f6149f != c1283b) {
            this.f6149f = c1283b;
            if (c1283b != null) {
                TextPaint textPaint = this.f6144a;
                AbstractC1285d abstractC1285d = this.f6145b;
                c1283b.m2950a();
                c1283b.m2953d(textPaint, c1283b.f6175l);
                c1283b.m2951b(context, new C1284c(c1283b, textPaint, abstractC1285d));
                b bVar = this.f6148e.get();
                if (bVar != null) {
                    this.f6144a.drawableState = bVar.getState();
                }
                c1283b.m2952c(context, this.f6144a, this.f6145b);
                this.f6147d = true;
            }
            b bVar2 = this.f6148e.get();
            if (bVar2 != null) {
                bVar2.mo2783a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }
}
