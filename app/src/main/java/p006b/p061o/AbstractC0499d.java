package p006b.p061o;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: b.o.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0499d {

    /* JADX INFO: renamed from: b.o.d$a */
    public enum a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY
    }

    /* JADX INFO: renamed from: b.o.d$b */
    public enum b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED
    }

    public AbstractC0499d() {
        new AtomicReference();
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo1894a(InterfaceC0501f interfaceC0501f);
}
