package p006b.p061o;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: b.o.j */
/* JADX INFO: loaded from: classes.dex */
public class C0505j {

    /* JADX INFO: renamed from: a */
    public static Map<Class<?>, Integer> f3195a = new HashMap();

    /* JADX INFO: renamed from: b */
    public static Map<Class<?>, List<Constructor<? extends InterfaceC0498c>>> f3196b = new HashMap();

    /* JADX INFO: renamed from: a */
    public static InterfaceC0498c m1904a(Constructor<? extends InterfaceC0498c> constructor, Object obj) {
        try {
            return constructor.newInstance(obj);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m1905b(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:70:0x0101 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x0103  */
    /* JADX WARN: Code duplicated, block: B:75:0x0118  */
    /* JADX WARN: Code duplicated, block: B:87:0x011e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0113 A[SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static int m1906c(Class<?> cls) {
        Constructor<?> declaredConstructor;
        boolean zBooleanValue;
        int i;
        Map<Class<?>, List<Constructor<? extends InterfaceC0498c>>> map;
        boolean z;
        Integer num = f3195a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i2 = 1;
        if (cls.getCanonicalName() != null) {
            List<Constructor<? extends InterfaceC0498c>> arrayList = null;
            try {
                Package r4 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r4 != null ? r4.getName() : "";
                if (!name.isEmpty()) {
                    canonicalName = canonicalName.substring(name.length() + 1);
                }
                String strM1905b = m1905b(canonicalName);
                if (!name.isEmpty()) {
                    strM1905b = name + "." + strM1905b;
                }
                declaredConstructor = Class.forName(strM1905b).getDeclaredConstructor(cls);
                if (!declaredConstructor.isAccessible()) {
                    declaredConstructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                declaredConstructor = null;
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
            if (declaredConstructor != null) {
                map = f3196b;
                arrayList = Collections.singletonList(declaredConstructor);
            } else {
                C0496a c0496a = C0496a.f3173c;
                Boolean bool = c0496a.f3175b.get(cls);
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length) {
                                c0496a.f3175b.put(cls, Boolean.FALSE);
                                zBooleanValue = false;
                                break;
                            }
                            if (((InterfaceC0509n) declaredMethods[i3].getAnnotation(InterfaceC0509n.class)) != null) {
                                c0496a.m1883a(cls, declaredMethods);
                                zBooleanValue = true;
                                break;
                            }
                            i3++;
                        }
                    } catch (NoClassDefFoundError e2) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
                    }
                }
                if (!zBooleanValue) {
                    Class<? super Object> superclass = cls.getSuperclass();
                    if (!(superclass != null && InterfaceC0501f.class.isAssignableFrom(superclass))) {
                        for (Class<?> cls2 : cls.getInterfaces()) {
                            if (cls2 == null && InterfaceC0501f.class.isAssignableFrom(cls2)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                if (m1906c(cls2) == 1) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList<>();
                                    }
                                    arrayList.addAll(f3196b.get(cls2));
                                }
                            }
                        }
                        if (arrayList != null) {
                            map = f3196b;
                        }
                    } else if (m1906c(superclass) != 1) {
                        arrayList = new ArrayList<>(f3196b.get(superclass));
                        while (i < r6) {
                            if (cls2 == null) {
                                z = false;
                            } else {
                                z = false;
                            }
                            if (z) {
                                if (m1906c(cls2) == 1) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList<>();
                                    }
                                    arrayList.addAll(f3196b.get(cls2));
                                }
                            }
                        }
                        if (arrayList != null) {
                            map = f3196b;
                        }
                    }
                }
            }
            map.put(cls, arrayList);
            i2 = 2;
        }
        f3195a.put(cls, Integer.valueOf(i2));
        return i2;
    }
}
