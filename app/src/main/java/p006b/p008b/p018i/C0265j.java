package p006b.p008b.p018i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import com.didjdk.adbhelper.R;
import p006b.p008b.p010d.p011a.C0208a;
import p006b.p032h.p036d.C0370a;

/* JADX INFO: renamed from: b.b.i.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0265j {

    /* JADX INFO: renamed from: b */
    public static final PorterDuff.Mode f1882b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c */
    public static C0265j f1883c;

    /* JADX INFO: renamed from: a */
    public C0274n0 f1884a;

    /* JADX INFO: renamed from: b.b.i.j$a */
    public static class a implements C0274n0.e {

        /* JADX INFO: renamed from: a */
        public final int[] f1885a = {R.drawable.gh, R.drawable.gf, R.drawable.f9};

        /* JADX INFO: renamed from: b */
        public final int[] f1886b = {R.drawable.fg, R.drawable.a3, R.drawable.fl, R.drawable.fh, R.drawable.fi, R.drawable.fk, R.drawable.fj};

        /* JADX INFO: renamed from: c */
        public final int[] f1887c = {R.drawable.ge, R.drawable.gg, R.drawable.ff, R.drawable.a8, R.drawable.g9, R.drawable.ga, R.drawable.gc, R.drawable.g_, R.drawable.gb, R.drawable.gd};

        /* JADX INFO: renamed from: d */
        public final int[] f1888d = {R.drawable.g0, R.drawable.h, R.drawable.fz};

        /* JADX INFO: renamed from: e */
        public final int[] f1889e = {R.drawable.a7, R.drawable.a9};

        /* JADX INFO: renamed from: f */
        public final int[] f1890f = {R.drawable.b, R.drawable.f, R.drawable.c, R.drawable.g};

        /* JADX INFO: renamed from: a */
        public final boolean m1085a(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: b */
        public final ColorStateList m1086b(Context context, int i) {
            int iM1131b = C0284s0.m1131b(context, R.attr.dt);
            return new ColorStateList(new int[][]{C0284s0.f1999b, C0284s0.f2001d, C0284s0.f2000c, C0284s0.f2003f}, new int[]{C0284s0.m1130a(context, R.attr.dr), C0370a.m1487a(iM1131b, i), C0370a.m1487a(iM1131b, i), i});
        }

        /* JADX INFO: renamed from: c */
        public ColorStateList m1087c(Context context, int i) {
            if (i == R.drawable.k) {
                return C0208a.m883a(context, R.color.t);
            }
            if (i == R.drawable.g7) {
                return C0208a.m883a(context, R.color.w);
            }
            if (i == R.drawable.a6) {
                int[][] iArr = new int[3][];
                int[] iArr2 = new int[3];
                ColorStateList colorStateListM1132c = C0284s0.m1132c(context, R.attr.e9);
                if (colorStateListM1132c == null || !colorStateListM1132c.isStateful()) {
                    iArr[0] = C0284s0.f1999b;
                    iArr2[0] = C0284s0.m1130a(context, R.attr.e9);
                    iArr[1] = C0284s0.f2002e;
                    iArr2[1] = C0284s0.m1131b(context, R.attr.ds);
                    iArr[2] = C0284s0.f2003f;
                    iArr2[2] = C0284s0.m1131b(context, R.attr.e9);
                } else {
                    iArr[0] = C0284s0.f1999b;
                    iArr2[0] = colorStateListM1132c.getColorForState(iArr[0], 0);
                    iArr[1] = C0284s0.f2002e;
                    iArr2[1] = C0284s0.m1131b(context, R.attr.ds);
                    iArr[2] = C0284s0.f2003f;
                    iArr2[2] = colorStateListM1132c.getDefaultColor();
                }
                return new ColorStateList(iArr, iArr2);
            }
            if (i == R.drawable.e) {
                return m1086b(context, C0284s0.m1131b(context, R.attr.dr));
            }
            if (i == R.drawable.a) {
                return m1086b(context, 0);
            }
            if (i == R.drawable.d) {
                return m1086b(context, C0284s0.m1131b(context, R.attr.dp));
            }
            if (i == R.drawable.g6 || i == R.drawable.a5) {
                return C0208a.m883a(context, R.color.v);
            }
            if (m1085a(this.f1886b, i)) {
                return C0284s0.m1132c(context, R.attr.du);
            }
            if (m1085a(this.f1889e, i)) {
                return C0208a.m883a(context, R.color.s);
            }
            if (m1085a(this.f1890f, i)) {
                return C0208a.m883a(context, R.color.r);
            }
            if (i == R.drawable.a2) {
                return C0208a.m883a(context, R.color.u);
            }
            return null;
        }

        /* JADX INFO: renamed from: d */
        public final void m1088d(Drawable drawable, int i, PorterDuff.Mode mode) {
            if (C0255e0.m1060a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = C0265j.f1882b;
            }
            drawable.setColorFilter(C0265j.m1080c(i, mode));
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C0265j m1079a() {
        if (f1883c == null) {
            m1081e();
        }
        return f1883c;
    }

    /* JADX INFO: renamed from: c */
    public static synchronized PorterDuffColorFilter m1080c(int i, PorterDuff.Mode mode) {
        return C0274n0.m1106h(i, mode);
    }

    /* JADX INFO: renamed from: e */
    public static synchronized void m1081e() {
        if (f1883c == null) {
            C0265j c0265j = new C0265j();
            f1883c = c0265j;
            c0265j.f1884a = C0274n0.m1105d();
            C0274n0 c0274n0 = f1883c.f1884a;
            a aVar = new a();
            synchronized (c0274n0) {
                c0274n0.f1951g = aVar;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m1082f(Drawable drawable, C0290v0 c0290v0, int[] iArr) {
        PorterDuff.Mode mode = C0274n0.f1942h;
        if (C0255e0.m1060a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z = c0290v0.f2021d;
        if (z || c0290v0.f2020c) {
            PorterDuffColorFilter porterDuffColorFilterM1106h = null;
            ColorStateList colorStateList = z ? c0290v0.f2018a : null;
            PorterDuff.Mode mode2 = c0290v0.f2020c ? c0290v0.f2019b : C0274n0.f1942h;
            if (colorStateList != null && mode2 != null) {
                porterDuffColorFilterM1106h = C0274n0.m1106h(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilterM1106h);
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized Drawable m1083b(Context context, int i) {
        return this.f1884a.m1111f(context, i);
    }

    /* JADX INFO: renamed from: d */
    public synchronized ColorStateList m1084d(Context context, int i) {
        return this.f1884a.m1113i(context, i);
    }
}
