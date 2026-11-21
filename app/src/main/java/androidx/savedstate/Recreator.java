package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import p006b.p061o.AbstractC0499d;
import p006b.p061o.C0503h;
import p006b.p061o.InterfaceC0500e;
import p006b.p061o.InterfaceC0502g;
import p006b.p070u.C0564a;
import p006b.p070u.InterfaceC0566c;
import c.a.a.a.a;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedApi"})
public final class Recreator implements InterfaceC0500e {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0566c f1070a;

    /* JADX INFO: renamed from: androidx.savedstate.Recreator$a */
    public static final class C0158a implements C0564a.b {

        /* JADX INFO: renamed from: a */
        public final Set<String> f1071a = new HashSet();

        public C0158a(C0564a c0564a) {
            if (c0564a.f3470a.mo1186d("androidx.savedstate.Restarter", this) != null) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
        }

        @Override // p006b.p070u.C0564a.b
        /* JADX INFO: renamed from: a */
        public Bundle mo712a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f1071a));
            return bundle;
        }
    }

    public Recreator(InterfaceC0566c interfaceC0566c) {
        this.f1070a = interfaceC0566c;
    }

    @Override // p006b.p061o.InterfaceC0500e
    /* JADX INFO: renamed from: d */
    public void mo8d(InterfaceC0502g interfaceC0502g, AbstractC0499d.a aVar) {
        if (aVar != AbstractC0499d.a.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        ((C0503h) interfaceC0502g.mo4a()).f3186a.mo1187e(this);
        C0564a c0564aMo6d = this.f1070a.mo6d();
        if (!c0564aMo6d.f3472c) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = c0564aMo6d.f3471b;
        Bundle bundle2 = null;
        if (bundle != null) {
            Bundle bundle3 = bundle.getBundle("androidx.savedstate.Restarter");
            c0564aMo6d.f3471b.remove("androidx.savedstate.Restarter");
            if (c0564aMo6d.f3471b.isEmpty()) {
                c0564aMo6d.f3471b = null;
            }
            bundle2 = bundle3;
        }
        if (bundle2 == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundle2.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for (String str : stringArrayList) {
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(C0564a.a.class);
                try {
                    Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(new Class[0]);
                    declaredConstructor.setAccessible(true);
                    try {
                        ((C0564a.a) declaredConstructor.newInstance(new Object[0])).mo350a(this.f1070a);
                    } catch (Exception e) {
                        throw new RuntimeException(a.m2201o("Failed to instantiate ", str), e);
                    }
                } catch (NoSuchMethodException e2) {
                    StringBuilder sbM2191e = a.m2191e("Class");
                    sbM2191e.append(clsAsSubclass.getSimpleName());
                    sbM2191e.append(" must have default constructor in order to be automatically recreated");
                    throw new IllegalStateException(sbM2191e.toString(), e2);
                }
            } catch (ClassNotFoundException e3) {
                throw new RuntimeException(a.m2202p("Class ", str, " wasn't found"), e3);
            }
        }
    }
}
