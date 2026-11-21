package p006b.p032h.p036d;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: b.h.d.g */
/* JADX INFO: loaded from: classes.dex */
public class C0376g extends C0375f {
    @Override // p006b.p032h.p036d.C0375f
    /* JADX INFO: renamed from: l */
    public Typeface mo1506l(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f2604g, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f2610m.invoke(null, objNewInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // p006b.p032h.p036d.C0375f
    /* JADX INFO: renamed from: r */
    public Method mo1511r(Class cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
