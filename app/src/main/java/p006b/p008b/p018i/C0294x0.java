package p006b.p008b.p018i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import p006b.p008b.p010d.p011a.C0208a;
import p006b.p032h.p034c.p035b.C0369g;

/* JADX INFO: renamed from: b.b.i.x0 */
/* JADX INFO: loaded from: classes.dex */
public class C0294x0 {

    /* JADX INFO: renamed from: a */
    public final Context f2051a;

    /* JADX INFO: renamed from: b */
    public final TypedArray f2052b;

    /* JADX INFO: renamed from: c */
    public TypedValue f2053c;

    public C0294x0(Context context, TypedArray typedArray) {
        this.f2051a = context;
        this.f2052b = typedArray;
    }

    /* JADX INFO: renamed from: p */
    public static C0294x0 m1151p(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C0294x0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* JADX INFO: renamed from: q */
    public static C0294x0 m1152q(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C0294x0(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* JADX INFO: renamed from: a */
    public boolean m1153a(int i, boolean z) {
        return this.f2052b.getBoolean(i, z);
    }

    /* JADX INFO: renamed from: b */
    public int m1154b(int i, int i2) {
        return this.f2052b.getColor(i, i2);
    }

    /* JADX INFO: renamed from: c */
    public ColorStateList m1155c(int i) {
        int resourceId;
        ColorStateList colorStateListM883a;
        return (!this.f2052b.hasValue(i) || (resourceId = this.f2052b.getResourceId(i, 0)) == 0 || (colorStateListM883a = C0208a.m883a(this.f2051a, resourceId)) == null) ? this.f2052b.getColorStateList(i) : colorStateListM883a;
    }

    /* JADX INFO: renamed from: d */
    public float m1156d(int i, float f) {
        return this.f2052b.getDimension(i, f);
    }

    /* JADX INFO: renamed from: e */
    public int m1157e(int i, int i2) {
        return this.f2052b.getDimensionPixelOffset(i, i2);
    }

    /* JADX INFO: renamed from: f */
    public int m1158f(int i, int i2) {
        return this.f2052b.getDimensionPixelSize(i, i2);
    }

    /* JADX INFO: renamed from: g */
    public Drawable m1159g(int i) {
        int resourceId;
        return (!this.f2052b.hasValue(i) || (resourceId = this.f2052b.getResourceId(i, 0)) == 0) ? this.f2052b.getDrawable(i) : C0208a.m884b(this.f2051a, resourceId);
    }

    /* JADX INFO: renamed from: h */
    public Drawable m1160h(int i) {
        int resourceId;
        Drawable drawableM1112g;
        if (!this.f2052b.hasValue(i) || (resourceId = this.f2052b.getResourceId(i, 0)) == 0) {
            return null;
        }
        C0265j c0265jM1079a = C0265j.m1079a();
        Context context = this.f2051a;
        synchronized (c0265jM1079a) {
            drawableM1112g = c0265jM1079a.f1884a.m1112g(context, resourceId, true);
        }
        return drawableM1112g;
    }

    /* JADX INFO: renamed from: i */
    public Typeface m1161i(int i, int i2, C0369g.a aVar) {
        int resourceId = this.f2052b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f2053c == null) {
            this.f2053c = new TypedValue();
        }
        Context context = this.f2051a;
        TypedValue typedValue = this.f2053c;
        if (context.isRestricted()) {
            return null;
        }
        return C0369g.m1483j(context, resourceId, typedValue, i2, aVar, null, true);
    }

    /* JADX INFO: renamed from: j */
    public int m1162j(int i, int i2) {
        return this.f2052b.getInt(i, i2);
    }

    /* JADX INFO: renamed from: k */
    public int m1163k(int i, int i2) {
        return this.f2052b.getLayoutDimension(i, i2);
    }

    /* JADX INFO: renamed from: l */
    public int m1164l(int i, int i2) {
        return this.f2052b.getResourceId(i, i2);
    }

    /* JADX INFO: renamed from: m */
    public String m1165m(int i) {
        return this.f2052b.getString(i);
    }

    /* JADX INFO: renamed from: n */
    public CharSequence m1166n(int i) {
        return this.f2052b.getText(i);
    }

    /* JADX INFO: renamed from: o */
    public boolean m1167o(int i) {
        return this.f2052b.hasValue(i);
    }
}
