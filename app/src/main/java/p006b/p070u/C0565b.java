package p006b.p070u;

import android.os.Bundle;
import androidx.savedstate.Recreator;
import java.util.Map;
import java.util.Objects;
import p006b.p019c.p020a.p022b.C0303b;
import p006b.p061o.AbstractC0499d;
import p006b.p061o.C0503h;
import p006b.p061o.InterfaceC0500e;
import p006b.p061o.InterfaceC0502g;
import p006b.p070u.C0564a;

/* JADX INFO: renamed from: b.u.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0565b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0566c f3475a;

    /* JADX INFO: renamed from: b */
    public final C0564a f3476b = new C0564a();

    public C0565b(InterfaceC0566c interfaceC0566c) {
        this.f3475a = interfaceC0566c;
    }

    /* JADX INFO: renamed from: a */
    public void m2076a(Bundle bundle) {
        AbstractC0499d abstractC0499dMo4a = this.f3475a.mo4a();
        if (((C0503h) abstractC0499dMo4a).f3187b != AbstractC0499d.b.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        abstractC0499dMo4a.mo1894a(new Recreator(this.f3475a));
        final C0564a c0564a = this.f3476b;
        if (c0564a.f3472c) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        if (bundle != null) {
            c0564a.f3471b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        abstractC0499dMo4a.mo1894a(new InterfaceC0500e() { // from class: androidx.savedstate.SavedStateRegistry$1
            @Override // p006b.p061o.InterfaceC0500e
            /* JADX INFO: renamed from: d */
            public void mo8d(InterfaceC0502g interfaceC0502g, AbstractC0499d.a aVar) {
                C0564a c0564a2;
                boolean z;
                if (aVar == AbstractC0499d.a.ON_START) {
                    c0564a2 = c0564a;
                    z = true;
                } else {
                    if (aVar != AbstractC0499d.a.ON_STOP) {
                        return;
                    }
                    c0564a2 = c0564a;
                    z = false;
                }
                c0564a2.f3474e = z;
            }
        });
        c0564a.f3472c = true;
    }

    /* JADX INFO: renamed from: b */
    public void m2077b(Bundle bundle) {
        C0564a c0564a = this.f3476b;
        Objects.requireNonNull(c0564a);
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = c0564a.f3471b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C0303b<String, C0564a.b>.d dVarM1188b = c0564a.f3470a.m1188b();
        while (dVarM1188b.hasNext()) {
            Map.Entry entry = (Map.Entry) dVarM1188b.next();
            bundle2.putBundle((String) entry.getKey(), ((C0564a.b) entry.getValue()).mo712a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
