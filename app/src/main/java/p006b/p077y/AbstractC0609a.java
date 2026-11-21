package p006b.p077y;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p006b.p025e.C0313a;

/* JADX INFO: renamed from: b.y.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0609a {

    /* JADX INFO: renamed from: a */
    public final C0313a<String, Method> f3737a;

    /* JADX INFO: renamed from: b */
    public final C0313a<String, Method> f3738b;

    /* JADX INFO: renamed from: c */
    public final C0313a<String, Class> f3739c;

    public AbstractC0609a(C0313a<String, Method> c0313a, C0313a<String, Method> c0313a2, C0313a<String, Class> c0313a3) {
        this.f3737a = c0313a;
        this.f3738b = c0313a2;
        this.f3739c = c0313a3;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo2163a();

    /* JADX INFO: renamed from: b */
    public abstract AbstractC0609a mo2164b();

    /* JADX INFO: renamed from: c */
    public final Class m2165c(Class<? extends InterfaceC0611c> cls) throws ClassNotFoundException {
        Class orDefault = this.f3739c.getOrDefault(cls.getName(), null);
        if (orDefault != null) {
            return orDefault;
        }
        Class<?> cls2 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f3739c.put(cls.getName(), cls2);
        return cls2;
    }

    /* JADX INFO: renamed from: d */
    public final Method m2166d(String str) throws NoSuchMethodException {
        Method orDefault = this.f3737a.getOrDefault(str, null);
        if (orDefault != null) {
            return orDefault;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC0609a.class.getClassLoader()).getDeclaredMethod("read", AbstractC0609a.class);
        this.f3737a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public final Method m2167e(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        Method orDefault = this.f3738b.getOrDefault(cls.getName(), null);
        if (orDefault != null) {
            return orDefault;
        }
        Class clsM2165c = m2165c(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsM2165c.getDeclaredMethod("write", cls, AbstractC0609a.class);
        this.f3738b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: f */
    public abstract boolean mo2168f();

    /* JADX INFO: renamed from: g */
    public abstract byte[] mo2169g();

    /* JADX INFO: renamed from: h */
    public abstract CharSequence mo2170h();

    /* JADX INFO: renamed from: i */
    public abstract boolean mo2171i(int i);

    /* JADX INFO: renamed from: j */
    public abstract int mo2172j();

    /* JADX INFO: renamed from: k */
    public int m2173k(int i, int i2) {
        return !mo2171i(i2) ? i : mo2172j();
    }

    /* JADX INFO: renamed from: l */
    public abstract <T extends Parcelable> T mo2174l();

    /* JADX INFO: renamed from: m */
    public <T extends Parcelable> T m2175m(T t, int i) {
        return !mo2171i(i) ? t : (T) mo2174l();
    }

    /* JADX INFO: renamed from: n */
    public abstract String mo2176n();

    /* JADX INFO: renamed from: o */
    public <T extends InterfaceC0611c> T m2177o() {
        String strMo2176n = mo2176n();
        if (strMo2176n == null) {
            return null;
        }
        try {
            return (T) m2166d(strMo2176n).invoke(null, mo2164b());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    /* JADX INFO: renamed from: p */
    public abstract void mo2178p(int i);

    /* JADX INFO: renamed from: q */
    public abstract void mo2179q(boolean z);

    /* JADX INFO: renamed from: r */
    public abstract void mo2180r(byte[] bArr);

    /* JADX INFO: renamed from: s */
    public abstract void mo2181s(CharSequence charSequence);

    /* JADX INFO: renamed from: t */
    public abstract void mo2182t(int i);

    /* JADX INFO: renamed from: u */
    public abstract void mo2183u(Parcelable parcelable);

    /* JADX INFO: renamed from: v */
    public abstract void mo2184v(String str);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w */
    public void m2185w(InterfaceC0611c interfaceC0611c) {
        if (interfaceC0611c == null) {
            mo2184v(null);
            return;
        }
        try {
            mo2184v(m2165c(interfaceC0611c.getClass()).getName());
            AbstractC0609a abstractC0609aMo2164b = mo2164b();
            try {
                m2167e(interfaceC0611c.getClass()).invoke(null, interfaceC0611c, abstractC0609aMo2164b);
                abstractC0609aMo2164b.mo2163a();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (!(e4.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
                }
                throw ((RuntimeException) e4.getCause());
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(interfaceC0611c.getClass().getSimpleName() + " does not have a Parcelizer", e5);
        }
    }
}
