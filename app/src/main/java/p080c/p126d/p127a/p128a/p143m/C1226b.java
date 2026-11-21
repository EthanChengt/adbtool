package p080c.p126d.p127a.p128a.p143m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import android.widget.TextView;
import java.util.WeakHashMap;
import p006b.p032h.p033b.C0360f;
import p006b.p032h.p044j.C0418m;
import p080c.p126d.p127a.p128a.C1161a;
import p080c.p126d.p127a.p128a.C1164b;
import p080c.p126d.p127a.p128a.p154x.C1290a;
import p080c.p126d.p127a.p128a.p154x.C1296g;
import p080c.p126d.p127a.p128a.p154x.C1299j;

/* JADX INFO: renamed from: c.d.a.a.m.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1226b {

    /* JADX INFO: renamed from: a */
    public final Rect f5867a;

    /* JADX INFO: renamed from: b */
    public final ColorStateList f5868b;

    /* JADX INFO: renamed from: c */
    public final ColorStateList f5869c;

    /* JADX INFO: renamed from: d */
    public final ColorStateList f5870d;

    /* JADX INFO: renamed from: e */
    public final int f5871e;

    /* JADX INFO: renamed from: f */
    public final C1299j f5872f;

    public C1226b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, C1299j c1299j, Rect rect) {
        C0360f.m1443e(rect.left);
        C0360f.m1443e(rect.top);
        C0360f.m1443e(rect.right);
        C0360f.m1443e(rect.bottom);
        this.f5867a = rect;
        this.f5868b = colorStateList2;
        this.f5869c = colorStateList;
        this.f5870d = colorStateList3;
        this.f5871e = i;
        this.f5872f = c1299j;
    }

    /* JADX INFO: renamed from: a */
    public static C1226b m2847a(Context context, int i) {
        if (!(i != 0)) {
            throw new IllegalArgumentException("Cannot create a CalendarItemStyle with a styleResId of 0");
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, C1164b.f5576n);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList colorStateListM2723h = C1161a.m2723h(context, typedArrayObtainStyledAttributes, 4);
        ColorStateList colorStateListM2723h2 = C1161a.m2723h(context, typedArrayObtainStyledAttributes, 9);
        ColorStateList colorStateListM2723h3 = C1161a.m2723h(context, typedArrayObtainStyledAttributes, 7);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        C1299j c1299jM2991a = C1299j.m2985a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0), new C1290a(0)).m2991a();
        typedArrayObtainStyledAttributes.recycle();
        return new C1226b(colorStateListM2723h, colorStateListM2723h2, colorStateListM2723h3, dimensionPixelSize, c1299jM2991a, rect);
    }

    /* JADX INFO: renamed from: b */
    public void m2848b(TextView textView) {
        C1296g c1296g = new C1296g();
        C1296g c1296g2 = new C1296g();
        c1296g.setShapeAppearanceModel(this.f5872f);
        c1296g2.setShapeAppearanceModel(this.f5872f);
        c1296g.m2975p(this.f5869c);
        c1296g.m2980u(this.f5871e, this.f5870d);
        textView.setTextColor(this.f5868b);
        Drawable rippleDrawable = Build.VERSION.SDK_INT >= 21 ? new RippleDrawable(this.f5868b.withAlpha(30), c1296g, c1296g2) : c1296g;
        Rect rect = this.f5867a;
        InsetDrawable insetDrawable = new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        textView.setBackground(insetDrawable);
    }
}
