package p006b.p032h.p036d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import p006b.p032h.p033b.C0360f;
import p006b.p032h.p034c.p035b.C0365c;
import p006b.p032h.p034c.p035b.C0366d;
import p006b.p032h.p041g.C0393e;

/* JADX INFO: renamed from: b.h.d.j */
/* JADX INFO: loaded from: classes.dex */
public class C0379j {

    /* JADX INFO: renamed from: a */
    public ConcurrentHashMap<Long, C0365c> f2611a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b.h.d.j$a */
    public interface a<T> {
        /* JADX INFO: renamed from: a */
        int mo1512a(T t);

        /* JADX INFO: renamed from: b */
        boolean mo1513b(T t);
    }

    /* JADX INFO: renamed from: e */
    public static <T> T m1514e(T[] tArr, int i, a<T> aVar) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int iAbs = (Math.abs(aVar.mo1512a(t2) - i2) * 2) + (aVar.mo1513b(t2) == z ? 0 : 1);
            if (t == null || i3 > iAbs) {
                t = t2;
                i3 = iAbs;
            }
        }
        return t;
    }

    /* JADX INFO: renamed from: f */
    public static long m1515f(Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException e) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e);
            return 0L;
        } catch (NoSuchFieldException e2) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e2);
            return 0L;
        }
    }

    /* JADX INFO: renamed from: a */
    public Typeface mo1497a(Context context, C0365c c0365c, Resources resources, int i) {
        C0366d c0366d = (C0366d) m1514e(c0365c.f2575a, i, new C0378i(this));
        if (c0366d == null) {
            return null;
        }
        Typeface typefaceM1493b = C0372c.m1493b(context, resources, c0366d.f2581f, c0366d.f2576a, i);
        long jM1515f = m1515f(typefaceM1493b);
        if (jM1515f != 0) {
            this.f2611a.put(Long.valueOf(jM1515f), c0365c);
        }
        return typefaceM1493b;
    }

    /* JADX INFO: renamed from: b */
    public Typeface mo1498b(Context context, CancellationSignal cancellationSignal, C0393e.c[] cVarArr, int i) {
        InputStream inputStreamOpenInputStream;
        InputStream inputStream = null;
        if (cVarArr.length < 1) {
            return null;
        }
        try {
            inputStreamOpenInputStream = context.getContentResolver().openInputStream(((C0393e.c) m1514e(cVarArr, i, new C0377h(this))).f2646a);
            try {
                Typeface typefaceM1516c = m1516c(context, inputStreamOpenInputStream);
                if (inputStreamOpenInputStream != null) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return typefaceM1516c;
            } catch (IOException unused2) {
                if (inputStreamOpenInputStream != null) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream = inputStreamOpenInputStream;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (IOException unused5) {
            inputStreamOpenInputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: c */
    public Typeface m1516c(Context context, InputStream inputStream) {
        File fileM1465y = C0360f.m1465y(context);
        if (fileM1465y == null) {
            return null;
        }
        try {
            if (C0360f.m1452l(fileM1465y, inputStream)) {
                return Typeface.createFromFile(fileM1465y.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM1465y.delete();
        }
    }

    /* JADX INFO: renamed from: d */
    public Typeface mo1503d(Context context, Resources resources, int i, String str, int i2) {
        File fileM1465y = C0360f.m1465y(context);
        if (fileM1465y == null) {
            return null;
        }
        try {
            if (C0360f.m1451k(fileM1465y, resources, i)) {
                return Typeface.createFromFile(fileM1465y.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM1465y.delete();
        }
    }
}
