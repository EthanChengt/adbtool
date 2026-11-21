package p080c.p126d.p127a.p128a.p151u;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import p006b.p032h.p034c.p035b.C0369g;
import c.a.a.a.a;
import p080c.p126d.p127a.p128a.C1161a;
import p080c.p126d.p127a.p128a.C1164b;

/* JADX INFO: renamed from: c.d.a.a.u.b */
/* JADX INFO: loaded from: classes.dex */
public class C1283b {

    /* JADX INFO: renamed from: a */
    public final float f6164a;

    /* JADX INFO: renamed from: b */
    public final ColorStateList f6165b;

    /* JADX INFO: renamed from: c */
    public final int f6166c;

    /* JADX INFO: renamed from: d */
    public final int f6167d;

    /* JADX INFO: renamed from: e */
    public final String f6168e;

    /* JADX INFO: renamed from: f */
    public final ColorStateList f6169f;

    /* JADX INFO: renamed from: g */
    public final float f6170g;

    /* JADX INFO: renamed from: h */
    public final float f6171h;

    /* JADX INFO: renamed from: i */
    public final float f6172i;

    /* JADX INFO: renamed from: j */
    public final int f6173j;

    /* JADX INFO: renamed from: k */
    public boolean f6174k = false;

    /* JADX INFO: renamed from: l */
    public Typeface f6175l;

    /* JADX INFO: renamed from: c.d.a.a.u.b$a */
    public class a extends C0369g.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC1285d f6176a;

        public a(AbstractC1285d abstractC1285d) {
            this.f6176a = abstractC1285d;
        }

        @Override // p006b.p032h.p034c.p035b.C0369g.a
        /* JADX INFO: renamed from: c */
        public void mo1178c(int i) {
            C1283b.this.f6174k = true;
            this.f6176a.mo2941a(i);
        }

        @Override // p006b.p032h.p034c.p035b.C0369g.a
        /* JADX INFO: renamed from: d */
        public void mo1179d(Typeface typeface) {
            C1283b c1283b = C1283b.this;
            c1283b.f6175l = Typeface.create(typeface, c1283b.f6166c);
            C1283b c1283b2 = C1283b.this;
            c1283b2.f6174k = true;
            this.f6176a.mo2942b(c1283b2.f6175l, false);
        }
    }

    public C1283b(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, C1164b.f5588z);
        this.f6164a = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.f6165b = C1161a.m2723h(context, typedArrayObtainStyledAttributes, 3);
        C1161a.m2723h(context, typedArrayObtainStyledAttributes, 4);
        C1161a.m2723h(context, typedArrayObtainStyledAttributes, 5);
        this.f6166c = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.f6167d = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i2 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f6173j = typedArrayObtainStyledAttributes.getResourceId(i2, 0);
        this.f6168e = typedArrayObtainStyledAttributes.getString(i2);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.f6169f = C1161a.m2723h(context, typedArrayObtainStyledAttributes, 6);
        this.f6170g = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.f6171h = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.f6172i = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    public final void m2950a() {
        Typeface typeface;
        String str;
        if (this.f6175l == null && (str = this.f6168e) != null) {
            this.f6175l = Typeface.create(str, this.f6166c);
        }
        if (this.f6175l == null) {
            int i = this.f6167d;
            if (i == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (i != 2) {
                typeface = i != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE;
            } else {
                typeface = Typeface.SERIF;
            }
            this.f6175l = typeface;
            this.f6175l = Typeface.create(this.f6175l, this.f6166c);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m2951b(Context context, AbstractC1285d abstractC1285d) {
        m2950a();
        int i = this.f6173j;
        if (i == 0) {
            this.f6174k = true;
        }
        if (this.f6174k) {
            abstractC1285d.mo2942b(this.f6175l, true);
            return;
        }
        try {
            a aVar = new a(abstractC1285d);
            if (context.isRestricted()) {
                aVar.m1485a(-4, null);
            } else {
                C0369g.m1483j(context, i, new TypedValue(), 0, aVar, null, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f6174k = true;
            abstractC1285d.mo2941a(1);
        } catch (Exception e) {
            StringBuilder sbM2191e = a.m2191e("Error loading font ");
            sbM2191e.append(this.f6168e);
            Log.d("TextAppearance", sbM2191e.toString(), e);
            this.f6174k = true;
            abstractC1285d.mo2941a(-3);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m2952c(Context context, TextPaint textPaint, AbstractC1285d abstractC1285d) {
        m2950a();
        m2953d(textPaint, this.f6175l);
        m2951b(context, new C1284c(this, textPaint, abstractC1285d));
        ColorStateList colorStateList = this.f6165b;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f = this.f6172i;
        float f2 = this.f6170g;
        float f3 = this.f6171h;
        ColorStateList colorStateList2 = this.f6169f;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* JADX INFO: renamed from: d */
    public void m2953d(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int style = (typeface.getStyle() ^ (-1)) & this.f6166c;
        textPaint.setFakeBoldText((style & 1) != 0);
        textPaint.setTextSkewX((style & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f6164a);
    }
}
