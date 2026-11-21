package p006b.p032h.p036d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p006b.p032h.p033b.C0360f;
import p006b.p032h.p034c.p035b.C0365c;
import p006b.p032h.p034c.p035b.C0366d;
import p006b.p032h.p041g.C0393e;

/* JADX INFO: renamed from: b.h.d.d */
/* JADX INFO: loaded from: classes.dex */
public class C0373d extends C0379j {

    /* JADX INFO: renamed from: b */
    public static Class f2595b;

    /* JADX INFO: renamed from: c */
    public static Constructor f2596c;

    /* JADX INFO: renamed from: d */
    public static Method f2597d;

    /* JADX INFO: renamed from: e */
    public static Method f2598e;

    /* JADX INFO: renamed from: f */
    public static boolean f2599f;

    /* JADX INFO: renamed from: g */
    public static boolean m1495g(Object obj, String str, int i, boolean z) throws NoSuchMethodException {
        m1496i();
        try {
            return ((Boolean) f2597d.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m1496i() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f2599f) {
            return;
        }
        f2599f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
            method = null;
            cls = null;
            method2 = null;
        }
        f2596c = constructor;
        f2595b = cls;
        f2597d = method2;
        f2598e = method;
    }

    @Override // p006b.p032h.p036d.C0379j
    /* JADX INFO: renamed from: a */
    public Typeface mo1497a(Context context, C0365c c0365c, Resources resources, int i) throws NoSuchMethodException {
        m1496i();
        try {
            Object objNewInstance = f2596c.newInstance(new Object[0]);
            for (C0366d c0366d : c0365c.f2575a) {
                File fileM1465y = C0360f.m1465y(context);
                if (fileM1465y == null) {
                    return null;
                }
                try {
                    if (!C0360f.m1451k(fileM1465y, resources, c0366d.f2581f)) {
                        fileM1465y.delete();
                        return null;
                    }
                    boolean zM1495g = m1495g(objNewInstance, fileM1465y.getPath(), c0366d.f2577b, c0366d.f2578c);
                    fileM1465y.delete();
                    if (!zM1495g) {
                        return null;
                    }
                } catch (RuntimeException unused) {
                    fileM1465y.delete();
                    return null;
                } catch (Throwable th) {
                    fileM1465y.delete();
                    throw th;
                }
            }
            m1496i();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) f2595b, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f2598e.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // p006b.p032h.p036d.C0379j
    /* JADX INFO: renamed from: b */
    public Typeface mo1498b(Context context, CancellationSignal cancellationSignal, C0393e.c[] cVarArr, int i) {
        if (cVarArr.length < 1) {
            return null;
        }
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
                File fileM1499h = m1499h(parcelFileDescriptorOpenFileDescriptor);
                if (fileM1499h != null && fileM1499h.canRead()) {
                    Typeface typefaceCreateFromFile = Typeface.createFromFile(fileM1499h);
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceCreateFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    Typeface typefaceM1516c = m1516c(context, fileInputStream);
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceM1516c;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th6) {
                        th4.addSuppressed(th6);
                    }
                    throw th5;
                }
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public final File m1499h(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(str).st_mode)) {
                return new File(str);
            }
            return null;
        } catch (ErrnoException unused) {
            return null;
        }
    }
}
