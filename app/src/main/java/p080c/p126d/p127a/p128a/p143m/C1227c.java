package p080c.p126d.p127a.p128a.p143m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.didjdk.adbhelper.R;
import p080c.p126d.p127a.p128a.C1161a;
import p080c.p126d.p127a.p128a.C1164b;

/* JADX INFO: renamed from: c.d.a.a.m.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1227c {

    /* JADX INFO: renamed from: a */
    public final C1226b f5873a;

    /* JADX INFO: renamed from: b */
    public final C1226b f5874b;

    /* JADX INFO: renamed from: c */
    public final C1226b f5875c;

    /* JADX INFO: renamed from: d */
    public final C1226b f5876d;

    /* JADX INFO: renamed from: e */
    public final C1226b f5877e;

    /* JADX INFO: renamed from: f */
    public final C1226b f5878f;

    /* JADX INFO: renamed from: g */
    public final C1226b f5879g;

    /* JADX INFO: renamed from: h */
    public final Paint f5880h;

    public C1227c(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C1161a.m2737v(context, R.attr.mc, C1231g.class.getCanonicalName()), C1164b.f5575m);
        this.f5873a = C1226b.m2847a(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        this.f5879g = C1226b.m2847a(context, typedArrayObtainStyledAttributes.getResourceId(1, 0));
        this.f5874b = C1226b.m2847a(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        this.f5875c = C1226b.m2847a(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
        ColorStateList colorStateListM2723h = C1161a.m2723h(context, typedArrayObtainStyledAttributes, 5);
        this.f5876d = C1226b.m2847a(context, typedArrayObtainStyledAttributes.getResourceId(7, 0));
        this.f5877e = C1226b.m2847a(context, typedArrayObtainStyledAttributes.getResourceId(6, 0));
        this.f5878f = C1226b.m2847a(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
        Paint paint = new Paint();
        this.f5880h = paint;
        paint.setColor(colorStateListM2723h.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
