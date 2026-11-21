package p006b.p032h.p036d;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p006b.p025e.C0318f;
import p006b.p032h.p033b.C0360f;
import p006b.p032h.p034c.p035b.C0365c;
import p006b.p032h.p034c.p035b.C0366d;
import p006b.p032h.p041g.C0393e;
import c.a.a.a.a;

/* JADX INFO: renamed from: b.h.d.f */
/* JADX INFO: loaded from: classes.dex */
public class C0375f extends C0373d {

    /* JADX INFO: renamed from: g */
    public final Class f2604g;

    /* JADX INFO: renamed from: h */
    public final Constructor f2605h;

    /* JADX INFO: renamed from: i */
    public final Method f2606i;

    /* JADX INFO: renamed from: j */
    public final Method f2607j;

    /* JADX INFO: renamed from: k */
    public final Method f2608k;

    /* JADX INFO: renamed from: l */
    public final Method f2609l;

    /* JADX INFO: renamed from: m */
    public final Method f2610m;

    public C0375f() throws NoSuchMethodException {
        Method methodMo1511r;
        Method method;
        Constructor<?> constructor;
        Method methodM1509p;
        Method methodM1510q;
        Method method2;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(new Class[0]);
            methodM1509p = m1509p(cls2);
            methodM1510q = m1510q(cls2);
            method2 = cls2.getMethod("freeze", new Class[0]);
            method = cls2.getMethod("abortCreation", new Class[0]);
            methodMo1511r = mo1511r(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            StringBuilder sbM2191e = a.m2191e("Unable to collect necessary methods for class ");
            sbM2191e.append(e.getClass().getName());
            Log.e("TypefaceCompatApi26Impl", sbM2191e.toString(), e);
            methodMo1511r = null;
            method = null;
            constructor = null;
            methodM1509p = null;
            methodM1510q = null;
            method2 = null;
        }
        this.f2604g = cls;
        this.f2605h = constructor;
        this.f2606i = methodM1509p;
        this.f2607j = methodM1510q;
        this.f2608k = method2;
        this.f2609l = method;
        this.f2610m = methodMo1511r;
    }

    /* JADX INFO: renamed from: o */
    private Object m1502o() {
        try {
            return this.f2605h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // p006b.p032h.p036d.C0373d, p006b.p032h.p036d.C0379j
    /* JADX INFO: renamed from: a */
    public Typeface mo1497a(Context context, C0365c c0365c, Resources resources, int i) {
        if (!m1508n()) {
            return super.mo1497a(context, c0365c, resources, i);
        }
        Object objM1502o = m1502o();
        if (objM1502o == null) {
            return null;
        }
        for (C0366d c0366d : c0365c.f2575a) {
            if (!m1505k(context, objM1502o, c0366d.f2576a, c0366d.f2580e, c0366d.f2577b, c0366d.f2578c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c0366d.f2579d))) {
                m1504j(objM1502o);
                return null;
            }
        }
        if (m1507m(objM1502o)) {
            return mo1506l(objM1502o);
        }
        return null;
    }

    @Override // p006b.p032h.p036d.C0373d, p006b.p032h.p036d.C0379j
    /* JADX INFO: renamed from: b */
    public Typeface mo1498b(Context context, CancellationSignal cancellationSignal, C0393e.c[] cVarArr, int i) {
        Typeface typefaceMo1506l;
        boolean zBooleanValue;
        if (cVarArr.length < 1) {
            return null;
        }
        if (!m1508n()) {
            C0393e.c cVar = (C0393e.c) C0379j.m1514e(cVarArr, i, new C0377h(this));
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(cVar.f2646a, "r", cancellationSignal);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(cVar.f2648c).setItalic(cVar.f2649d).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            } catch (IOException unused) {
                return null;
            }
        }
        C0318f<String, Typeface> c0318f = C0393e.f2639a;
        HashMap map = new HashMap();
        for (C0393e.c cVar2 : cVarArr) {
            if (cVar2.f2650e == 0) {
                Uri uri = cVar2.f2646a;
                if (!map.containsKey(uri)) {
                    map.put(uri, C0360f.m1413E(context, cancellationSignal, uri));
                }
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
        Object objM1502o = m1502o();
        if (objM1502o == null) {
            return null;
        }
        boolean z = false;
        for (C0393e.c cVar3 : cVarArr) {
            ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(cVar3.f2646a);
            if (byteBuffer != null) {
                try {
                    zBooleanValue = ((Boolean) this.f2607j.invoke(objM1502o, byteBuffer, Integer.valueOf(cVar3.f2647b), null, Integer.valueOf(cVar3.f2648c), Integer.valueOf(cVar3.f2649d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    zBooleanValue = false;
                }
                if (!zBooleanValue) {
                    m1504j(objM1502o);
                    return null;
                }
                z = true;
            }
        }
        if (!z) {
            m1504j(objM1502o);
            return null;
        }
        if (m1507m(objM1502o) && (typefaceMo1506l = mo1506l(objM1502o)) != null) {
            return Typeface.create(typefaceMo1506l, i);
        }
        return null;
    }

    @Override // p006b.p032h.p036d.C0379j
    /* JADX INFO: renamed from: d */
    public Typeface mo1503d(Context context, Resources resources, int i, String str, int i2) {
        if (!m1508n()) {
            return super.mo1503d(context, resources, i, str, i2);
        }
        Object objM1502o = m1502o();
        if (objM1502o == null) {
            return null;
        }
        if (!m1505k(context, objM1502o, str, 0, -1, -1, null)) {
            m1504j(objM1502o);
            return null;
        }
        if (m1507m(objM1502o)) {
            return mo1506l(objM1502o);
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final void m1504j(Object obj) {
        try {
            this.f2609l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m1505k(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f2606i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: l */
    public Typeface mo1506l(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f2604g, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f2610m.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m1507m(Object obj) {
        try {
            return ((Boolean) this.f2608k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: n */
    public final boolean m1508n() {
        if (this.f2606i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f2606i != null;
    }

    /* JADX INFO: renamed from: p */
    public Method m1509p(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    /* JADX INFO: renamed from: q */
    public Method m1510q(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    /* JADX INFO: renamed from: r */
    public Method mo1511r(Class cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
