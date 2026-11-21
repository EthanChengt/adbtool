package p006b.p061o;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: b.o.t */
/* JADX INFO: loaded from: classes.dex */
public class C0515t {

    /* JADX INFO: renamed from: a */
    public final HashMap<String, AbstractC0511p> f3198a = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public final void m1913a() {
        for (AbstractC0511p abstractC0511p : this.f3198a.values()) {
            Map<String, Object> map = abstractC0511p.f3197a;
            if (map != null) {
                synchronized (map) {
                    for (Object obj : abstractC0511p.f3197a.values()) {
                        if (obj instanceof Closeable) {
                            try {
                                ((Closeable) obj).close();
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                }
            }
            abstractC0511p.mo1866a();
        }
        this.f3198a.clear();
    }
}
