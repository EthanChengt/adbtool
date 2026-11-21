package p006b.p032h.p036d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import p006b.p025e.C0320h;
import p006b.p032h.p033b.C0360f;
import p006b.p032h.p034c.p035b.C0365c;
import p006b.p032h.p034c.p035b.C0366d;
import p006b.p032h.p041g.C0393e;

/* JADX INFO: renamed from: b.h.d.e */
/* JADX INFO: loaded from: classes.dex */
public class C0374e extends C0379j {

    /* JADX INFO: renamed from: b */
    public static final Class f2600b;

    /* JADX INFO: renamed from: c */
    public static final Constructor f2601c;

    /* JADX INFO: renamed from: d */
    public static final Method f2602d;

    /* JADX INFO: renamed from: e */
    public static final Method f2603e;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            method2 = null;
        }
        f2601c = constructor;
        f2600b = cls;
        f2602d = method2;
        f2603e = method;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m1500g(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f2602d.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: h */
    public static Typeface m1501h(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f2600b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f2603e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // p006b.p032h.p036d.C0379j
    /* JADX INFO: renamed from: a */
    public Typeface mo1497a(Context context, C0365c c0365c, Resources resources, int i) {
        Object objNewInstance;
        MappedByteBuffer map;
        try {
            objNewInstance = f2601c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance == null) {
            return null;
        }
        for (C0366d c0366d : c0365c.f2575a) {
            int i2 = c0366d.f2581f;
            File fileM1465y = C0360f.m1465y(context);
            if (fileM1465y == null) {
                map = null;
            } else {
                try {
                    if (C0360f.m1451k(fileM1465y, resources, i2)) {
                        try {
                            FileInputStream fileInputStream = new FileInputStream(fileM1465y);
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                                fileM1465y.delete();
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
                        } catch (IOException unused2) {
                            map = null;
                        }
                    } else {
                        fileM1465y.delete();
                        map = null;
                    }
                } catch (Throwable th4) {
                    fileM1465y.delete();
                    throw th4;
                }
            }
            if (map == null || !m1500g(objNewInstance, map, c0366d.f2580e, c0366d.f2577b, c0366d.f2578c)) {
                return null;
            }
        }
        return m1501h(objNewInstance);
    }

    @Override // p006b.p032h.p036d.C0379j
    /* JADX INFO: renamed from: b */
    public Typeface mo1498b(Context context, CancellationSignal cancellationSignal, C0393e.c[] cVarArr, int i) {
        Object objNewInstance;
        try {
            objNewInstance = f2601c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance == null) {
            return null;
        }
        C0320h c0320h = new C0320h();
        for (C0393e.c cVar : cVarArr) {
            Uri uri = cVar.f2646a;
            ByteBuffer byteBufferM1413E = (ByteBuffer) c0320h.get(uri);
            if (byteBufferM1413E == null) {
                byteBufferM1413E = C0360f.m1413E(context, cancellationSignal, uri);
                c0320h.put(uri, byteBufferM1413E);
            }
            if (byteBufferM1413E == null || !m1500g(objNewInstance, byteBufferM1413E, cVar.f2647b, cVar.f2648c, cVar.f2649d)) {
                return null;
            }
        }
        Typeface typefaceM1501h = m1501h(objNewInstance);
        if (typefaceM1501h == null) {
            return null;
        }
        return Typeface.create(typefaceM1501h, i);
    }
}
