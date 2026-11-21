package p080c.p084b.p085a.p088m.p091u;

import p080c.p084b.p085a.p088m.EnumC0633a;
import p080c.p084b.p085a.p088m.EnumC0635c;

/* JADX INFO: renamed from: c.b.a.m.u.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0707k {

    /* JADX INFO: renamed from: a */
    public static final AbstractC0707k f4168a = new a();

    /* JADX INFO: renamed from: b */
    public static final AbstractC0707k f4169b = new b();

    /* JADX INFO: renamed from: c */
    public static final AbstractC0707k f4170c = new c();

    /* JADX INFO: renamed from: c.b.a.m.u.k$a */
    public class a extends AbstractC0707k {
        @Override // p080c.p084b.p085a.p088m.p091u.AbstractC0707k
        /* JADX INFO: renamed from: a */
        public boolean mo2388a() {
            return false;
        }

        @Override // p080c.p084b.p085a.p088m.p091u.AbstractC0707k
        /* JADX INFO: renamed from: b */
        public boolean mo2389b() {
            return false;
        }

        @Override // p080c.p084b.p085a.p088m.p091u.AbstractC0707k
        /* JADX INFO: renamed from: c */
        public boolean mo2390c(EnumC0633a enumC0633a) {
            return false;
        }

        @Override // p080c.p084b.p085a.p088m.p091u.AbstractC0707k
        /* JADX INFO: renamed from: d */
        public boolean mo2391d(boolean z, EnumC0633a enumC0633a, EnumC0635c enumC0635c) {
            return false;
        }
    }

    /* JADX INFO: renamed from: c.b.a.m.u.k$b */
    public class b extends AbstractC0707k {
        @Override // p080c.p084b.p085a.p088m.p091u.AbstractC0707k
        /* JADX INFO: renamed from: a */
        public boolean mo2388a() {
            return true;
        }

        @Override // p080c.p084b.p085a.p088m.p091u.AbstractC0707k
        /* JADX INFO: renamed from: b */
        public boolean mo2389b() {
            return false;
        }

        @Override // p080c.p084b.p085a.p088m.p091u.AbstractC0707k
        /* JADX INFO: renamed from: c */
        public boolean mo2390c(EnumC0633a enumC0633a) {
            return (enumC0633a == EnumC0633a.DATA_DISK_CACHE || enumC0633a == EnumC0633a.MEMORY_CACHE) ? false : true;
        }

        @Override // p080c.p084b.p085a.p088m.p091u.AbstractC0707k
        /* JADX INFO: renamed from: d */
        public boolean mo2391d(boolean z, EnumC0633a enumC0633a, EnumC0635c enumC0635c) {
            return false;
        }
    }

    /* JADX INFO: renamed from: c.b.a.m.u.k$c */
    public class c extends AbstractC0707k {
        @Override // p080c.p084b.p085a.p088m.p091u.AbstractC0707k
        /* JADX INFO: renamed from: a */
        public boolean mo2388a() {
            return true;
        }

        @Override // p080c.p084b.p085a.p088m.p091u.AbstractC0707k
        /* JADX INFO: renamed from: b */
        public boolean mo2389b() {
            return true;
        }

        @Override // p080c.p084b.p085a.p088m.p091u.AbstractC0707k
        /* JADX INFO: renamed from: c */
        public boolean mo2390c(EnumC0633a enumC0633a) {
            return enumC0633a == EnumC0633a.REMOTE;
        }

        @Override // p080c.p084b.p085a.p088m.p091u.AbstractC0707k
        /* JADX INFO: renamed from: d */
        public boolean mo2391d(boolean z, EnumC0633a enumC0633a, EnumC0635c enumC0635c) {
            return ((z && enumC0633a == EnumC0633a.DATA_DISK_CACHE) || enumC0633a == EnumC0633a.LOCAL) && enumC0635c == EnumC0635c.TRANSFORMED;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo2388a();

    /* JADX INFO: renamed from: b */
    public abstract boolean mo2389b();

    /* JADX INFO: renamed from: c */
    public abstract boolean mo2390c(EnumC0633a enumC0633a);

    /* JADX INFO: renamed from: d */
    public abstract boolean mo2391d(boolean z, EnumC0633a enumC0633a, EnumC0635c enumC0635c);
}
