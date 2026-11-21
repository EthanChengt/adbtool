package p080c.p084b.p085a.p088m.p095v;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p080c.p084b.p085a.p088m.C0647o;
import p080c.p084b.p085a.p088m.InterfaceC0645m;
import p080c.p084b.p085a.p088m.p089t.InterfaceC0655d;

/* JADX INFO: renamed from: c.b.a.m.v.n */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0736n<Model, Data> {

    /* JADX INFO: renamed from: c.b.a.m.v.n$a */
    public static class a<Data> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC0645m f4327a;

        /* JADX INFO: renamed from: b */
        public final List<InterfaceC0645m> f4328b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC0655d<Data> f4329c;

        public a(InterfaceC0645m interfaceC0645m, InterfaceC0655d<Data> interfaceC0655d) {
            List<InterfaceC0645m> listEmptyList = Collections.emptyList();
            Objects.requireNonNull(interfaceC0645m, "Argument must not be null");
            this.f4327a = interfaceC0645m;
            Objects.requireNonNull(listEmptyList, "Argument must not be null");
            this.f4328b = listEmptyList;
            Objects.requireNonNull(interfaceC0655d, "Argument must not be null");
            this.f4329c = interfaceC0655d;
        }
    }

    /* JADX INFO: renamed from: a */
    a<Data> mo2426a(Model model, int i, int i2, C0647o c0647o);

    /* JADX INFO: renamed from: b */
    boolean mo2427b(Model model);
}
