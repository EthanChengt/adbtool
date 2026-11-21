package p006b.p032h.p042h;

/* JADX INFO: renamed from: b.h.h.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0399d {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC0398c f2686a = new d(null, false);

    /* JADX INFO: renamed from: b */
    public static final InterfaceC0398c f2687b = new d(null, true);

    /* JADX INFO: renamed from: c */
    public static final InterfaceC0398c f2688c;

    /* JADX INFO: renamed from: d */
    public static final InterfaceC0398c f2689d;

    /* JADX INFO: renamed from: b.h.h.d$a */
    public static class a implements b {

        /* JADX INFO: renamed from: a */
        public static final a f2690a = new a();

        /* JADX WARN: Code duplicated, block: B:11:0x001d  */
        /* JADX WARN: Code duplicated, block: B:12:0x001f  */
        @Override // p006b.p032h.p042h.C0399d.b
        /* JADX INFO: renamed from: a */
        public int mo1532a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i));
                InterfaceC0398c interfaceC0398c = C0399d.f2686a;
                if (directionality != 0) {
                    if (directionality != 1 && directionality != 2) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i4 = 1;
                                break;
                            case 16:
                            case 17:
                                i4 = 0;
                                break;
                            default:
                                i4 = 2;
                                break;
                        }
                    } else {
                        i4 = 0;
                    }
                } else {
                    i4 = 1;
                }
                i++;
            }
            return i4;
        }
    }

    /* JADX INFO: renamed from: b.h.h.d$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        int mo1532a(CharSequence charSequence, int i, int i2);
    }

    /* JADX INFO: renamed from: b.h.h.d$c */
    public static abstract class c implements InterfaceC0398c {

        /* JADX INFO: renamed from: a */
        public final b f2691a;

        public c(b bVar) {
            this.f2691a = bVar;
        }

        /* JADX INFO: renamed from: a */
        public abstract boolean mo1533a();

        /* JADX INFO: renamed from: b */
        public boolean m1534b(CharSequence charSequence, int i, int i2) {
            if (i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
                throw new IllegalArgumentException();
            }
            b bVar = this.f2691a;
            if (bVar == null) {
                return mo1533a();
            }
            int iMo1532a = bVar.mo1532a(charSequence, i, i2);
            if (iMo1532a == 0) {
                return true;
            }
            if (iMo1532a != 1) {
                return mo1533a();
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: b.h.h.d$d */
    public static class d extends c {

        /* JADX INFO: renamed from: b */
        public final boolean f2692b;

        public d(b bVar, boolean z) {
            super(bVar);
            this.f2692b = z;
        }

        @Override // p006b.p032h.p042h.C0399d.c
        /* JADX INFO: renamed from: a */
        public boolean mo1533a() {
            return this.f2692b;
        }
    }

    static {
        a aVar = a.f2690a;
        f2688c = new d(aVar, false);
        f2689d = new d(aVar, true);
    }
}
