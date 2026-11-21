package p006b.p061o;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import c.a.a.a.a;

/* JADX INFO: renamed from: b.o.a */
/* JADX INFO: loaded from: classes.dex */
public class C0496a {

    /* JADX INFO: renamed from: c */
    public static C0496a f3173c = new C0496a();

    /* JADX INFO: renamed from: a */
    public final Map<Class<?>, a> f3174a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final Map<Class<?>, Boolean> f3175b = new HashMap();

    /* JADX INFO: renamed from: b.o.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final Map<AbstractC0499d.a, List<b>> f3176a = new HashMap();

        /* JADX INFO: renamed from: b */
        public final Map<b, AbstractC0499d.a> f3177b;

        public a(Map<b, AbstractC0499d.a> map) {
            this.f3177b = map;
            for (Map.Entry<b, AbstractC0499d.a> entry : map.entrySet()) {
                AbstractC0499d.a value = entry.getValue();
                List<b> arrayList = this.f3176a.get(value);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.f3176a.put(value, arrayList);
                }
                arrayList.add(entry.getKey());
            }
        }

        /* JADX INFO: renamed from: a */
        public static void m1886a(List<b> list, InterfaceC0502g interfaceC0502g, AbstractC0499d.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    b bVar = list.get(size);
                    Objects.requireNonNull(bVar);
                    try {
                        int i = bVar.f3178a;
                        if (i == 0) {
                            bVar.f3179b.invoke(obj, new Object[0]);
                        } else if (i == 1) {
                            bVar.f3179b.invoke(obj, interfaceC0502g);
                        } else if (i == 2) {
                            bVar.f3179b.invoke(obj, interfaceC0502g, aVar);
                        }
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    } catch (InvocationTargetException e2) {
                        throw new RuntimeException("Failed to call observer method", e2.getCause());
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: b.o.a$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final int f3178a;

        /* JADX INFO: renamed from: b */
        public final Method f3179b;

        public b(int i, Method method) {
            this.f3178a = i;
            this.f3179b = method;
            method.setAccessible(true);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f3178a == bVar.f3178a && this.f3179b.getName().equals(bVar.f3179b.getName());
        }

        public int hashCode() {
            return this.f3179b.getName().hashCode() + (this.f3178a * 31);
        }
    }

    /* JADX INFO: renamed from: a */
    public final a m1883a(Class<?> cls, Method[] methodArr) {
        int i;
        a aVarM1884b;
        Class<?> superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null && (aVarM1884b = m1884b(superclass)) != null) {
            map.putAll(aVarM1884b.f3177b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, AbstractC0499d.a> entry : m1884b(cls2).f3177b.entrySet()) {
                m1885c(map, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            InterfaceC0509n interfaceC0509n = (InterfaceC0509n) method.getAnnotation(InterfaceC0509n.class);
            if (interfaceC0509n != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!parameterTypes[0].isAssignableFrom(InterfaceC0502g.class)) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                AbstractC0499d.a aVarValue = interfaceC0509n.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(AbstractC0499d.a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (aVarValue != AbstractC0499d.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                m1885c(map, new b(i, method), aVarValue, cls);
                z = true;
            }
        }
        a aVar = new a(map);
        this.f3174a.put(cls, aVar);
        this.f3175b.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    /* JADX INFO: renamed from: b */
    public a m1884b(Class<?> cls) {
        a aVar = this.f3174a.get(cls);
        return aVar != null ? aVar : m1883a(cls, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m1885c(Map<b, AbstractC0499d.a> map, b bVar, AbstractC0499d.a aVar, Class<?> cls) {
        AbstractC0499d.a aVar2 = map.get(bVar);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(bVar, aVar);
                return;
            }
            return;
        }
        Method method = bVar.f3179b;
        StringBuilder sbM2191e = a.m2191e("Method ");
        sbM2191e.append(method.getName());
        sbM2191e.append(" in ");
        sbM2191e.append(cls.getName());
        sbM2191e.append(" already declared with different @OnLifecycleEvent value: previous value ");
        sbM2191e.append(aVar2);
        sbM2191e.append(", new value ");
        sbM2191e.append(aVar);
        throw new IllegalArgumentException(sbM2191e.toString());
    }
}
