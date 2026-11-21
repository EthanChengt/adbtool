package androidx.lifecycle;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import p006b.p061o.AbstractC0499d;
import p006b.p061o.AbstractC0511p;
import p006b.p061o.C0503h;
import p006b.p061o.C0515t;
import p006b.p061o.InterfaceC0500e;
import p006b.p061o.InterfaceC0502g;
import p006b.p061o.InterfaceC0516u;
import p006b.p070u.C0564a;
import p006b.p070u.InterfaceC0566c;

/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleController implements InterfaceC0500e {

    /* JADX INFO: renamed from: a */
    public boolean f737a;

    /* JADX INFO: renamed from: androidx.lifecycle.SavedStateHandleController$1 */
    public final class C00921 implements InterfaceC0500e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC0499d f738a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C0564a f739b;

        @Override // p006b.p061o.InterfaceC0500e
        /* JADX INFO: renamed from: d */
        public void mo8d(InterfaceC0502g interfaceC0502g, AbstractC0499d.a aVar) {
            if (aVar == AbstractC0499d.a.ON_START) {
                ((C0503h) this.f738a).f3186a.mo1187e(this);
                this.f739b.m2075a(C0093a.class);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.SavedStateHandleController$a */
    public static final class C0093a implements C0564a.a {
        @Override // p006b.p070u.C0564a.a
        /* JADX INFO: renamed from: a */
        public void mo350a(InterfaceC0566c interfaceC0566c) {
            Object obj;
            boolean z;
            if (!(interfaceC0566c instanceof InterfaceC0516u)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
            }
            C0515t c0515tMo7g = ((InterfaceC0516u) interfaceC0566c).mo7g();
            C0564a c0564aMo6d = interfaceC0566c.mo6d();
            Objects.requireNonNull(c0515tMo7g);
            Iterator it = new HashSet(c0515tMo7g.f3198a.keySet()).iterator();
            while (it.hasNext()) {
                AbstractC0511p abstractC0511p = c0515tMo7g.f3198a.get((String) it.next());
                AbstractC0499d abstractC0499dMo4a = interfaceC0566c.mo4a();
                Map<String, Object> map = abstractC0511p.f3197a;
                if (map == null) {
                    obj = null;
                } else {
                    synchronized (map) {
                        obj = abstractC0511p.f3197a.get("androidx.lifecycle.savedstate.vm.tag");
                    }
                }
                SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
                if (savedStateHandleController != null && !(z = savedStateHandleController.f737a)) {
                    if (z) {
                        throw new IllegalStateException("Already attached to lifecycleOwner");
                    }
                    savedStateHandleController.f737a = true;
                    abstractC0499dMo4a.mo1894a(savedStateHandleController);
                    throw null;
                }
            }
            if (new HashSet(c0515tMo7g.f3198a.keySet()).isEmpty()) {
                return;
            }
            c0564aMo6d.m2075a(C0093a.class);
        }
    }

    @Override // p006b.p061o.InterfaceC0500e
    /* JADX INFO: renamed from: d */
    public void mo8d(InterfaceC0502g interfaceC0502g, AbstractC0499d.a aVar) {
        if (aVar == AbstractC0499d.a.ON_DESTROY) {
            this.f737a = false;
            ((C0503h) interfaceC0502g.mo4a()).f3186a.mo1187e(this);
        }
    }
}
