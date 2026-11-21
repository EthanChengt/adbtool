package p006b.p008b.p018i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import com.didjdk.adbhelper.R;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p006b.p008b.p012e.p013a.C0209a;
import p006b.p025e.C0313a;
import p006b.p025e.C0316d;
import p006b.p025e.C0317e;
import p006b.p025e.C0318f;
import p006b.p025e.C0321i;
import p006b.p032h.p033b.C0360f;
import p006b.p074x.p075a.p076a.C0603b;
import p006b.p074x.p075a.p076a.C0608g;

/* JADX INFO: renamed from: b.b.i.n0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0274n0 {

    /* JADX INFO: renamed from: i */
    public static C0274n0 f1943i;

    /* JADX INFO: renamed from: a */
    public WeakHashMap<Context, C0321i<ColorStateList>> f1945a;

    /* JADX INFO: renamed from: b */
    public C0313a<String, d> f1946b;

    /* JADX INFO: renamed from: c */
    public C0321i<String> f1947c;

    /* JADX INFO: renamed from: d */
    public final WeakHashMap<Context, C0317e<WeakReference<Drawable.ConstantState>>> f1948d = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: e */
    public TypedValue f1949e;

    /* JADX INFO: renamed from: f */
    public boolean f1950f;

    /* JADX INFO: renamed from: g */
    public e f1951g;

    /* JADX INFO: renamed from: h */
    public static final PorterDuff.Mode f1942h = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: j */
    public static final c f1944j = new c(6);

    /* JADX INFO: renamed from: b.b.i.n0$a */
    public static class a implements d {
        @Override // p006b.p008b.p018i.C0274n0.d
        /* JADX INFO: renamed from: a */
        public Drawable mo1117a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C0209a.m885g(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: b.b.i.n0$b */
    public static class b implements d {
        @Override // p006b.p008b.p018i.C0274n0.d
        /* JADX INFO: renamed from: a */
        public Drawable mo1117a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                Resources resources = context.getResources();
                C0603b c0603b = new C0603b(context, null, null);
                c0603b.inflate(resources, xmlPullParser, attributeSet, theme);
                return c0603b;
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: b.b.i.n0$c */
    public static class c extends C0318f<Integer, PorterDuffColorFilter> {
        public c(int i) {
            super(i);
        }
    }

    /* JADX INFO: renamed from: b.b.i.n0$d */
    public interface d {
        /* JADX INFO: renamed from: a */
        Drawable mo1117a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* JADX INFO: renamed from: b.b.i.n0$e */
    public interface e {
    }

    /* JADX INFO: renamed from: b.b.i.n0$f */
    public static class f implements d {
        @Override // p006b.p008b.p018i.C0274n0.d
        /* JADX INFO: renamed from: a */
        public Drawable mo1117a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C0608g.m2154a(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static synchronized C0274n0 m1105d() {
        if (f1943i == null) {
            C0274n0 c0274n0 = new C0274n0();
            f1943i = c0274n0;
            if (Build.VERSION.SDK_INT < 24) {
                c0274n0.m1107a("vector", new f());
                c0274n0.m1107a("animated-vector", new b());
                c0274n0.m1107a("animated-selector", new a());
            }
        }
        return f1943i;
    }

    /* JADX INFO: renamed from: h */
    public static synchronized PorterDuffColorFilter m1106h(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterM1258a;
        c cVar = f1944j;
        Objects.requireNonNull(cVar);
        int i2 = (i + 31) * 31;
        porterDuffColorFilterM1258a = cVar.m1258a(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilterM1258a == null) {
            porterDuffColorFilterM1258a = new PorterDuffColorFilter(i, mode);
            Objects.requireNonNull(cVar);
            cVar.m1259b(Integer.valueOf(mode.hashCode() + i2), porterDuffColorFilterM1258a);
        }
        return porterDuffColorFilterM1258a;
    }

    /* JADX INFO: renamed from: a */
    public final void m1107a(String str, d dVar) {
        if (this.f1946b == null) {
            this.f1946b = new C0313a<>();
        }
        this.f1946b.put(str, dVar);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized boolean m1108b(Context context, long j, Drawable drawable) {
        boolean z;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            C0317e<WeakReference<Drawable.ConstantState>> c0317e = this.f1948d.get(context);
            if (c0317e == null) {
                c0317e = new C0317e<>();
                this.f1948d.put(context, c0317e);
            }
            c0317e.m1255g(j, new WeakReference<>(constantState));
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* JADX INFO: renamed from: c */
    public final Drawable m1109c(Context context, int i) {
        if (this.f1949e == null) {
            this.f1949e = new TypedValue();
        }
        TypedValue typedValue = this.f1949e;
        context.getResources().getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable drawableM1110e = m1110e(context, j);
        if (drawableM1110e != null) {
            return drawableM1110e;
        }
        e eVar = this.f1951g;
        LayerDrawable layerDrawable = null;
        if (eVar != null) {
            if (i == R.drawable.i) {
                layerDrawable = new LayerDrawable(new Drawable[]{m1111f(context, R.drawable.h), m1111f(context, R.drawable.ff)});
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            m1108b(context, j, layerDrawable);
        }
        return layerDrawable;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized Drawable m1110e(Context context, long j) {
        C0317e<WeakReference<Drawable.ConstantState>> c0317e = this.f1948d.get(context);
        if (c0317e == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> weakReferenceM1254f = c0317e.m1254f(j, null);
        if (weakReferenceM1254f != null) {
            Drawable.ConstantState constantState = weakReferenceM1254f.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int iM1244b = C0316d.m1244b(c0317e.f2166c, c0317e.f2168e, j);
            if (iM1244b >= 0) {
                Object[] objArr = c0317e.f2167d;
                Object obj = objArr[iM1244b];
                Object obj2 = C0317e.f2164f;
                if (obj != obj2) {
                    objArr[iM1244b] = obj2;
                    c0317e.f2165b = true;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public synchronized Drawable m1111f(Context context, int i) {
        return m1112g(context, i, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        if (r0 != false) goto L15;
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized android.graphics.drawable.Drawable m1112g(android.content.Context r5, int r6, boolean r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f1950f     // Catch: java.lang.Throwable -> L48
            if (r0 == 0) goto L6
            goto L2b
        L6:
            r0 = 1
            r4.f1950f = r0     // Catch: java.lang.Throwable -> L48
            r1 = 2131230811(0x7f08005b, float:1.8077685E38)
            android.graphics.drawable.Drawable r1 = r4.m1111f(r5, r1)     // Catch: java.lang.Throwable -> L48
            r2 = 0
            if (r1 == 0) goto L4a
            boolean r3 = r1 instanceof p006b.p074x.p075a.p076a.C0608g     // Catch: java.lang.Throwable -> L48
            if (r3 != 0) goto L29
            java.lang.String r3 = "android.graphics.drawable.VectorDrawable"
            java.lang.Class r1 = r1.getClass()     // Catch: java.lang.Throwable -> L48
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L48
            boolean r1 = r3.equals(r1)     // Catch: java.lang.Throwable -> L48
            if (r1 == 0) goto L28
            goto L29
        L28:
            r0 = 0
        L29:
            if (r0 == 0) goto L4a
        L2b:
            android.graphics.drawable.Drawable r0 = r4.m1114j(r5, r6)     // Catch: java.lang.Throwable -> L48
            if (r0 != 0) goto L35
            android.graphics.drawable.Drawable r0 = r4.m1109c(r5, r6)     // Catch: java.lang.Throwable -> L48
        L35:
            if (r0 != 0) goto L3b
            android.graphics.drawable.Drawable r0 = p006b.p032h.p034c.C0362a.m1469c(r5, r6)     // Catch: java.lang.Throwable -> L48
        L3b:
            if (r0 == 0) goto L41
            android.graphics.drawable.Drawable r0 = r4.m1115k(r5, r6, r7, r0)     // Catch: java.lang.Throwable -> L48
        L41:
            if (r0 == 0) goto L46
            p006b.p008b.p018i.C0255e0.m1061b(r0)     // Catch: java.lang.Throwable -> L48
        L46:
            monitor-exit(r4)
            return r0
        L48:
            r5 = move-exception
            goto L54
        L4a:
            r4.f1950f = r2     // Catch: java.lang.Throwable -> L48
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L48
            java.lang.String r6 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L48
            throw r5     // Catch: java.lang.Throwable -> L48
        L54:
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p008b.p018i.C0274n0.m1112g(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    /* JADX INFO: renamed from: i */
    public synchronized ColorStateList m1113i(Context context, int i) {
        ColorStateList colorStateListM1281e;
        C0321i<ColorStateList> c0321i;
        WeakHashMap<Context, C0321i<ColorStateList>> weakHashMap = this.f1945a;
        colorStateListM1281e = (weakHashMap == null || (c0321i = weakHashMap.get(context)) == null) ? null : c0321i.m1281e(i, null);
        if (colorStateListM1281e == null) {
            e eVar = this.f1951g;
            ColorStateList colorStateListM1087c = eVar != null ? ((C0265j.a) eVar).m1087c(context, i) : null;
            if (colorStateListM1087c != null) {
                if (this.f1945a == null) {
                    this.f1945a = new WeakHashMap<>();
                }
                C0321i<ColorStateList> c0321i2 = this.f1945a.get(context);
                if (c0321i2 == null) {
                    c0321i2 = new C0321i<>(10);
                    this.f1945a.put(context, c0321i2);
                }
                c0321i2.m1277a(i, colorStateListM1087c);
            }
            colorStateListM1281e = colorStateListM1087c;
        }
        return colorStateListM1281e;
    }

    /* JADX INFO: renamed from: j */
    public final Drawable m1114j(Context context, int i) {
        int next;
        C0313a<String, d> c0313a = this.f1946b;
        if (c0313a == null || c0313a.isEmpty()) {
            return null;
        }
        C0321i<String> c0321i = this.f1947c;
        if (c0321i != null) {
            String strM1281e = c0321i.m1281e(i, null);
            if ("appcompat_skip_skip".equals(strM1281e) || (strM1281e != null && this.f1946b.getOrDefault(strM1281e, null) == null)) {
                return null;
            }
        } else {
            this.f1947c = new C0321i<>(10);
        }
        if (this.f1949e == null) {
            this.f1949e = new TypedValue();
        }
        TypedValue typedValue = this.f1949e;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable drawableM1110e = m1110e(context, j);
        if (drawableM1110e != null) {
            return drawableM1110e;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f1947c.m1277a(i, name);
                d dVar = this.f1946b.get(name);
                if (dVar != null) {
                    drawableM1110e = dVar.mo1117a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableM1110e != null) {
                    drawableM1110e.setChangingConfigurations(typedValue.changingConfigurations);
                    m1108b(context, j, drawableM1110e);
                }
            } catch (Exception e2) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e2);
            }
        }
        if (drawableM1110e == null) {
            this.f1947c.m1277a(i, "appcompat_skip_skip");
        }
        return drawableM1110e;
    }

    /* JADX INFO: renamed from: k */
    public final Drawable m1115k(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList colorStateListM1113i = m1113i(context, i);
        PorterDuff.Mode mode = null;
        if (colorStateListM1113i != null) {
            if (C0255e0.m1060a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable drawableM1444e0 = C0360f.m1444e0(drawable);
            C0360f.m1433Y(drawableM1444e0, colorStateListM1113i);
            e eVar = this.f1951g;
            if (eVar != null) {
                if (i == R.drawable.a6) {
                    mode = PorterDuff.Mode.MULTIPLY;
                }
            }
            if (mode == null) {
                return drawableM1444e0;
            }
            C0360f.m1434Z(drawableM1444e0, mode);
            return drawableM1444e0;
        }
        e eVar2 = this.f1951g;
        if (eVar2 != null) {
            C0265j.a aVar = (C0265j.a) eVar2;
            Objects.requireNonNull(aVar);
            boolean z2 = true;
            if (i == R.drawable.a4) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int iM1131b = C0284s0.m1131b(context, R.attr.du);
                PorterDuff.Mode mode2 = C0265j.f1882b;
                aVar.m1088d(drawableFindDrawableByLayerId, iM1131b, mode2);
                aVar.m1088d(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), C0284s0.m1131b(context, R.attr.du), mode2);
                aVar.m1088d(layerDrawable.findDrawableByLayerId(android.R.id.progress), C0284s0.m1131b(context, R.attr.ds), mode2);
            } else if (i == R.drawable.a0 || i == R.drawable.z || i == R.drawable.a1) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int iM1130a = C0284s0.m1130a(context, R.attr.du);
                PorterDuff.Mode mode3 = C0265j.f1882b;
                aVar.m1088d(drawableFindDrawableByLayerId2, iM1130a, mode3);
                aVar.m1088d(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), C0284s0.m1131b(context, R.attr.ds), mode3);
                aVar.m1088d(layerDrawable2.findDrawableByLayerId(android.R.id.progress), C0284s0.m1131b(context, R.attr.ds), mode3);
            } else {
                z2 = false;
            }
            if (z2) {
                return drawable;
            }
        }
        if (m1116l(context, i, drawable) || !z) {
            return drawable;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0052  */
    /* JADX WARN: Code duplicated, block: B:24:0x0058  */
    /* JADX WARN: Code duplicated, block: B:27:0x0069  */
    /* JADX WARN: Code duplicated, block: B:29:0x006e  */
    /* JADX WARN: Code duplicated, block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: l */
    public boolean m1116l(Context context, int i, Drawable drawable) {
        int i2;
        int iRound;
        boolean z;
        boolean z2;
        e eVar = this.f1951g;
        if (eVar != null) {
            C0265j.a aVar = (C0265j.a) eVar;
            Objects.requireNonNull(aVar);
            PorterDuff.Mode mode = C0265j.f1882b;
            boolean zM1085a = aVar.m1085a(aVar.f1885a, i);
            int i3 = android.R.attr.colorBackground;
            if (zM1085a) {
                i3 = R.attr.du;
            } else if (aVar.m1085a(aVar.f1887c, i)) {
                i3 = R.attr.ds;
            } else if (aVar.m1085a(aVar.f1888d, i)) {
                mode = PorterDuff.Mode.MULTIPLY;
            } else {
                if (i == R.drawable.fs) {
                    i2 = android.R.attr.colorForeground;
                    iRound = Math.round(40.8f);
                    z = true;
                } else if (i != R.drawable.j) {
                    i2 = 0;
                    iRound = -1;
                    z = false;
                }
                if (z) {
                    if (C0255e0.m1060a(drawable)) {
                        drawable = drawable.mutate();
                    }
                    drawable.setColorFilter(C0265j.m1080c(C0284s0.m1131b(context, i2), mode));
                    if (iRound != -1) {
                        drawable.setAlpha(iRound);
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    return true;
                }
            }
            i2 = i3;
            iRound = -1;
            z = true;
            if (z) {
                if (C0255e0.m1060a(drawable)) {
                    drawable = drawable.mutate();
                }
                drawable.setColorFilter(C0265j.m1080c(C0284s0.m1131b(context, i2), mode));
                if (iRound != -1) {
                    drawable.setAlpha(iRound);
                }
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }
}
