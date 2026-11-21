package p080c.p126d.p127a.p128a.p154x;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import java.util.Objects;
import p080c.p126d.p127a.p128a.C1161a;
import p080c.p126d.p127a.p128a.C1164b;

/* JADX INFO: renamed from: c.d.a.a.x.j */
/* JADX INFO: loaded from: classes.dex */
public class C1299j {

    /* JADX INFO: renamed from: m */
    public static final InterfaceC1292c f6256m = new C1297h(0.5f);

    /* JADX INFO: renamed from: a */
    public C1293d f6257a;

    /* JADX INFO: renamed from: b */
    public C1293d f6258b;

    /* JADX INFO: renamed from: c */
    public C1293d f6259c;

    /* JADX INFO: renamed from: d */
    public C1293d f6260d;

    /* JADX INFO: renamed from: e */
    public InterfaceC1292c f6261e;

    /* JADX INFO: renamed from: f */
    public InterfaceC1292c f6262f;

    /* JADX INFO: renamed from: g */
    public InterfaceC1292c f6263g;

    /* JADX INFO: renamed from: h */
    public InterfaceC1292c f6264h;

    /* JADX INFO: renamed from: i */
    public C1295f f6265i;

    /* JADX INFO: renamed from: j */
    public C1295f f6266j;

    /* JADX INFO: renamed from: k */
    public C1295f f6267k;

    /* JADX INFO: renamed from: l */
    public C1295f f6268l;

    public C1299j() {
        this.f6257a = new C1298i();
        this.f6258b = new C1298i();
        this.f6259c = new C1298i();
        this.f6260d = new C1298i();
        this.f6261e = new C1290a(0.0f);
        this.f6262f = new C1290a(0.0f);
        this.f6263g = new C1290a(0.0f);
        this.f6264h = new C1290a(0.0f);
        this.f6265i = new C1295f();
        this.f6266j = new C1295f();
        this.f6267k = new C1295f();
        this.f6268l = new C1295f();
    }

    /* JADX INFO: renamed from: a */
    public static b m2985a(Context context, int i, int i2, InterfaceC1292c interfaceC1292c) {
        if (i2 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
            i = i2;
            context = contextThemeWrapper;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, C1164b.f5585w);
        try {
            int i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(3, i3);
            int i5 = typedArrayObtainStyledAttributes.getInt(4, i3);
            int i6 = typedArrayObtainStyledAttributes.getInt(2, i3);
            int i7 = typedArrayObtainStyledAttributes.getInt(1, i3);
            InterfaceC1292c interfaceC1292cM2987c = m2987c(typedArrayObtainStyledAttributes, 5, interfaceC1292c);
            InterfaceC1292c interfaceC1292cM2987c2 = m2987c(typedArrayObtainStyledAttributes, 8, interfaceC1292cM2987c);
            InterfaceC1292c interfaceC1292cM2987c3 = m2987c(typedArrayObtainStyledAttributes, 9, interfaceC1292cM2987c);
            InterfaceC1292c interfaceC1292cM2987c4 = m2987c(typedArrayObtainStyledAttributes, 7, interfaceC1292cM2987c);
            InterfaceC1292c interfaceC1292cM2987c5 = m2987c(typedArrayObtainStyledAttributes, 6, interfaceC1292cM2987c);
            b bVar = new b();
            C1293d c1293dM2718c = C1161a.m2718c(i4);
            bVar.f6269a = c1293dM2718c;
            b.m2990b(c1293dM2718c);
            bVar.f6273e = interfaceC1292cM2987c2;
            C1293d c1293dM2718c2 = C1161a.m2718c(i5);
            bVar.f6270b = c1293dM2718c2;
            b.m2990b(c1293dM2718c2);
            bVar.f6274f = interfaceC1292cM2987c3;
            C1293d c1293dM2718c3 = C1161a.m2718c(i6);
            bVar.f6271c = c1293dM2718c3;
            b.m2990b(c1293dM2718c3);
            bVar.f6275g = interfaceC1292cM2987c4;
            C1293d c1293dM2718c4 = C1161a.m2718c(i7);
            bVar.f6272d = c1293dM2718c4;
            b.m2990b(c1293dM2718c4);
            bVar.f6276h = interfaceC1292cM2987c5;
            return bVar;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: b */
    public static b m2986b(Context context, AttributeSet attributeSet, int i, int i2, InterfaceC1292c interfaceC1292c) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1164b.f5579q, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return m2985a(context, resourceId, resourceId2, interfaceC1292c);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC1292c m2987c(TypedArray typedArray, int i, InterfaceC1292c interfaceC1292c) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue == null) {
            return interfaceC1292c;
        }
        int i2 = typedValuePeekValue.type;
        if (i2 == 5) {
            return new C1290a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        return i2 == 6 ? new C1297h(typedValuePeekValue.getFraction(1.0f, 1.0f)) : interfaceC1292c;
    }

    /* JADX INFO: renamed from: d */
    public boolean m2988d(RectF rectF) {
        boolean z = this.f6268l.getClass().equals(C1295f.class) && this.f6266j.getClass().equals(C1295f.class) && this.f6265i.getClass().equals(C1295f.class) && this.f6267k.getClass().equals(C1295f.class);
        float fMo2958a = this.f6261e.mo2958a(rectF);
        return z && ((this.f6262f.mo2958a(rectF) > fMo2958a ? 1 : (this.f6262f.mo2958a(rectF) == fMo2958a ? 0 : -1)) == 0 && (this.f6264h.mo2958a(rectF) > fMo2958a ? 1 : (this.f6264h.mo2958a(rectF) == fMo2958a ? 0 : -1)) == 0 && (this.f6263g.mo2958a(rectF) > fMo2958a ? 1 : (this.f6263g.mo2958a(rectF) == fMo2958a ? 0 : -1)) == 0) && ((this.f6258b instanceof C1298i) && (this.f6257a instanceof C1298i) && (this.f6259c instanceof C1298i) && (this.f6260d instanceof C1298i));
    }

    /* JADX INFO: renamed from: e */
    public C1299j m2989e(float f) {
        b bVar = new b(this);
        bVar.f6273e = new C1290a(f);
        bVar.f6274f = new C1290a(f);
        bVar.f6275g = new C1290a(f);
        bVar.f6276h = new C1290a(f);
        return bVar.m2991a();
    }

    /* JADX INFO: renamed from: c.d.a.a.x.j$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public C1293d f6269a;

        /* JADX INFO: renamed from: b */
        public C1293d f6270b;

        /* JADX INFO: renamed from: c */
        public C1293d f6271c;

        /* JADX INFO: renamed from: d */
        public C1293d f6272d;

        /* JADX INFO: renamed from: e */
        public InterfaceC1292c f6273e;

        /* JADX INFO: renamed from: f */
        public InterfaceC1292c f6274f;

        /* JADX INFO: renamed from: g */
        public InterfaceC1292c f6275g;

        /* JADX INFO: renamed from: h */
        public InterfaceC1292c f6276h;

        /* JADX INFO: renamed from: i */
        public C1295f f6277i;

        /* JADX INFO: renamed from: j */
        public C1295f f6278j;

        /* JADX INFO: renamed from: k */
        public C1295f f6279k;

        /* JADX INFO: renamed from: l */
        public C1295f f6280l;

        public b() {
            this.f6269a = new C1298i();
            this.f6270b = new C1298i();
            this.f6271c = new C1298i();
            this.f6272d = new C1298i();
            this.f6273e = new C1290a(0.0f);
            this.f6274f = new C1290a(0.0f);
            this.f6275g = new C1290a(0.0f);
            this.f6276h = new C1290a(0.0f);
            this.f6277i = new C1295f();
            this.f6278j = new C1295f();
            this.f6279k = new C1295f();
            this.f6280l = new C1295f();
        }

        /* JADX INFO: renamed from: b */
        public static float m2990b(C1293d c1293d) {
            Object obj;
            if (c1293d instanceof C1298i) {
                obj = (C1298i) c1293d;
            } else {
                if (!(c1293d instanceof C1294e)) {
                    return -1.0f;
                }
                obj = (C1294e) c1293d;
            }
            Objects.requireNonNull(obj);
            return -1.0f;
        }

        /* JADX INFO: renamed from: a */
        public C1299j m2991a() {
            return new C1299j(this, null);
        }

        /* JADX INFO: renamed from: c */
        public b m2992c(float f) {
            this.f6276h = new C1290a(f);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public b m2993d(float f) {
            this.f6275g = new C1290a(f);
            return this;
        }

        /* JADX INFO: renamed from: e */
        public b m2994e(float f) {
            this.f6273e = new C1290a(f);
            return this;
        }

        /* JADX INFO: renamed from: f */
        public b m2995f(float f) {
            this.f6274f = new C1290a(f);
            return this;
        }

        public b(C1299j c1299j) {
            this.f6269a = new C1298i();
            this.f6270b = new C1298i();
            this.f6271c = new C1298i();
            this.f6272d = new C1298i();
            this.f6273e = new C1290a(0.0f);
            this.f6274f = new C1290a(0.0f);
            this.f6275g = new C1290a(0.0f);
            this.f6276h = new C1290a(0.0f);
            this.f6277i = new C1295f();
            this.f6278j = new C1295f();
            this.f6279k = new C1295f();
            this.f6280l = new C1295f();
            this.f6269a = c1299j.f6257a;
            this.f6270b = c1299j.f6258b;
            this.f6271c = c1299j.f6259c;
            this.f6272d = c1299j.f6260d;
            this.f6273e = c1299j.f6261e;
            this.f6274f = c1299j.f6262f;
            this.f6275g = c1299j.f6263g;
            this.f6276h = c1299j.f6264h;
            this.f6277i = c1299j.f6265i;
            this.f6278j = c1299j.f6266j;
            this.f6279k = c1299j.f6267k;
            this.f6280l = c1299j.f6268l;
        }
    }

    public C1299j(b bVar, a aVar) {
        this.f6257a = bVar.f6269a;
        this.f6258b = bVar.f6270b;
        this.f6259c = bVar.f6271c;
        this.f6260d = bVar.f6272d;
        this.f6261e = bVar.f6273e;
        this.f6262f = bVar.f6274f;
        this.f6263g = bVar.f6275g;
        this.f6264h = bVar.f6276h;
        this.f6265i = bVar.f6277i;
        this.f6266j = bVar.f6278j;
        this.f6267k = bVar.f6279k;
        this.f6268l = bVar.f6280l;
    }
}
