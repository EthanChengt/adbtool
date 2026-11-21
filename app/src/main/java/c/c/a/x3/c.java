package c.c.a.x3;

import java.lang.reflect.Field;

/* JADX INFO: renamed from: c.c.a.x3.c */
/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: b */
    public static final String f5476b = f.m2694a("hoykegdcl");

    /* JADX INFO: renamed from: c */
    public static final String f5477c = f.m2694a("zL");

    /* JADX INFO: renamed from: d */
    public static final String f5478d = f.m2694a("l");

    /* JADX INFO: renamed from: e */
    public static final String f5479e = f.m2694a("pklpVimc");

    /* JADX INFO: renamed from: a */
    public Field f5480a;

    public c(Class cls, String str) {
        try {
            this.f5480a = cls.getField(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m2690b(Object obj) {
        Object obj2 = ((Object[]) new c(obj.getClass(), f5478d + f5476b).m2692a(obj))[0];
        return ((Integer) new e(obj2.getClass(), f5479e, new Class[0]).m2693a(obj2, new Object[0])).intValue();
    }

    /* JADX INFO: renamed from: c */
    public static int m2691c(Object obj) {
        Object obj2 = ((Object[]) new c(obj.getClass(), f5477c + f5476b).m2692a(obj))[0];
        return ((Integer) new e(obj2.getClass(), f5479e, new Class[0]).m2693a(obj2, new Object[0])).intValue();
    }

    /* JADX INFO: renamed from: a */
    public Object m2692a(Object obj) {
        this.f5480a.setAccessible(true);
        try {
            return this.f5480a.get(obj);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
