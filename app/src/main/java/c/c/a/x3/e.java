package c.c.a.x3;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: c.c.a.x3.e */
/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a */
    public Method f5484a;

    public e(Class cls, String str, Class<?>... clsArr) {
        try {
            this.f5484a = cls.getMethod(str, clsArr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public Object m2693a(Object obj, Object... objArr) {
        try {
            return this.f5484a.invoke(obj, objArr);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
