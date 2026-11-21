package p080c.p084b.p085a;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: c.b.a.e */
/* JADX INFO: loaded from: classes.dex */
public class C0619e {

    /* JADX INFO: renamed from: a */
    public final Map<Class<?>, Object> f3789a;

    /* JADX INFO: renamed from: c.b.a.e$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final Map<Class<?>, Object> f3790a = new HashMap();
    }

    public C0619e(a aVar) {
        this.f3789a = Collections.unmodifiableMap(new HashMap(aVar.f3790a));
    }
}
