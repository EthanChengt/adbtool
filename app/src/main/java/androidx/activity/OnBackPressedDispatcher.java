package androidx.activity;

import java.util.ArrayDeque;
import java.util.Iterator;
import p006b.p007a.AbstractC0181b;
import p006b.p007a.InterfaceC0180a;
import p006b.p061o.AbstractC0499d;
import p006b.p061o.C0503h;
import p006b.p061o.InterfaceC0500e;
import p006b.p061o.InterfaceC0502g;

/* JADX INFO: loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* JADX INFO: renamed from: a */
    public final Runnable f57a;

    /* JADX INFO: renamed from: b */
    public final ArrayDeque<AbstractC0181b> f58b = new ArrayDeque<>();

    public class LifecycleOnBackPressedCancellable implements InterfaceC0500e, InterfaceC0180a {

        /* JADX INFO: renamed from: a */
        public final AbstractC0499d f59a;

        /* JADX INFO: renamed from: b */
        public final AbstractC0181b f60b;

        /* JADX INFO: renamed from: c */
        public InterfaceC0180a f61c;

        public LifecycleOnBackPressedCancellable(AbstractC0499d abstractC0499d, AbstractC0181b abstractC0181b) {
            this.f59a = abstractC0499d;
            this.f60b = abstractC0181b;
            abstractC0499d.mo1894a(this);
        }

        @Override // p006b.p007a.InterfaceC0180a
        public void cancel() {
            ((C0503h) this.f59a).f3186a.mo1187e(this);
            this.f60b.f1189b.remove(this);
            InterfaceC0180a interfaceC0180a = this.f61c;
            if (interfaceC0180a != null) {
                interfaceC0180a.cancel();
                this.f61c = null;
            }
        }

        @Override // p006b.p061o.InterfaceC0500e
        /* JADX INFO: renamed from: d */
        public void mo8d(InterfaceC0502g interfaceC0502g, AbstractC0499d.a aVar) {
            if (aVar == AbstractC0499d.a.ON_START) {
                OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
                AbstractC0181b abstractC0181b = this.f60b;
                onBackPressedDispatcher.f58b.add(abstractC0181b);
                C0018a c0018a = onBackPressedDispatcher.new C0018a(abstractC0181b);
                abstractC0181b.f1189b.add(c0018a);
                this.f61c = c0018a;
                return;
            }
            if (aVar != AbstractC0499d.a.ON_STOP) {
                if (aVar == AbstractC0499d.a.ON_DESTROY) {
                    cancel();
                }
            } else {
                InterfaceC0180a interfaceC0180a = this.f61c;
                if (interfaceC0180a != null) {
                    interfaceC0180a.cancel();
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$a */
    public class C0018a implements InterfaceC0180a {

        /* JADX INFO: renamed from: a */
        public final AbstractC0181b f63a;

        public C0018a(AbstractC0181b abstractC0181b) {
            this.f63a = abstractC0181b;
        }

        @Override // p006b.p007a.InterfaceC0180a
        public void cancel() {
            OnBackPressedDispatcher.this.f58b.remove(this.f63a);
            this.f63a.f1189b.remove(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f57a = runnable;
    }

    /* JADX INFO: renamed from: a */
    public void m9a() {
        Iterator<AbstractC0181b> itDescendingIterator = this.f58b.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            AbstractC0181b next = itDescendingIterator.next();
            if (next.f1188a) {
                next.mo753a();
                return;
            }
        }
        Runnable runnable = this.f57a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
