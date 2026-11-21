package p080c.p126d.p127a.p128a.p151u;

import android.graphics.Typeface;
import android.text.TextPaint;

/* JADX INFO: renamed from: c.d.a.a.u.c */
/* JADX INFO: loaded from: classes.dex */
public class C1284c extends AbstractC1285d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TextPaint f6178a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC1285d f6179b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1283b f6180c;

    public C1284c(C1283b c1283b, TextPaint textPaint, AbstractC1285d abstractC1285d) {
        this.f6180c = c1283b;
        this.f6178a = textPaint;
        this.f6179b = abstractC1285d;
    }

    @Override // p080c.p126d.p127a.p128a.p151u.AbstractC1285d
    /* JADX INFO: renamed from: a */
    public void mo2941a(int i) {
        this.f6179b.mo2941a(i);
    }

    @Override // p080c.p126d.p127a.p128a.p151u.AbstractC1285d
    /* JADX INFO: renamed from: b */
    public void mo2942b(Typeface typeface, boolean z) {
        this.f6180c.m2953d(this.f6178a, typeface);
        this.f6179b.mo2942b(typeface, z);
    }
}
