package p006b.p032h.p042h;

/* JADX INFO: renamed from: b.h.h.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0396a {

    /* JADX INFO: renamed from: d */
    public static final InterfaceC0398c f2669d;

    /* JADX INFO: renamed from: e */
    public static final String f2670e;

    /* JADX INFO: renamed from: f */
    public static final String f2671f;

    /* JADX INFO: renamed from: g */
    public static final C0396a f2672g;

    /* JADX INFO: renamed from: h */
    public static final C0396a f2673h;

    /* JADX INFO: renamed from: a */
    public final boolean f2674a;

    /* JADX INFO: renamed from: b */
    public final int f2675b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0398c f2676c;

    /* JADX INFO: renamed from: b.h.h.a$a */
    public static class a {

        /* JADX INFO: renamed from: e */
        public static final byte[] f2677e = new byte[1792];

        /* JADX INFO: renamed from: a */
        public final CharSequence f2678a;

        /* JADX INFO: renamed from: b */
        public final int f2679b;

        /* JADX INFO: renamed from: c */
        public int f2680c;

        /* JADX INFO: renamed from: d */
        public char f2681d;

        static {
            for (int i = 0; i < 1792; i++) {
                f2677e[i] = Character.getDirectionality(i);
            }
        }

        public a(CharSequence charSequence, boolean z) {
            this.f2678a = charSequence;
            this.f2679b = charSequence.length();
        }

        /* JADX INFO: renamed from: a */
        public byte m1530a() {
            char cCharAt = this.f2678a.charAt(this.f2680c - 1);
            this.f2681d = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(this.f2678a, this.f2680c);
                this.f2680c -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.f2680c--;
            char c2 = this.f2681d;
            return c2 < 1792 ? f2677e[c2] : Character.getDirectionality(c2);
        }
    }

    static {
        InterfaceC0398c interfaceC0398c = C0399d.f2688c;
        f2669d = interfaceC0398c;
        f2670e = Character.toString((char) 8206);
        f2671f = Character.toString((char) 8207);
        f2672g = new C0396a(false, 2, interfaceC0398c);
        f2673h = new C0396a(true, 2, interfaceC0398c);
    }

    public C0396a(boolean z, int i, InterfaceC0398c interfaceC0398c) {
        this.f2674a = z;
        this.f2675b = i;
        this.f2676c = interfaceC0398c;
    }

    /* JADX INFO: renamed from: a */
    public static int m1528a(CharSequence charSequence) {
        byte directionality;
        a aVar = new a(charSequence, false);
        aVar.f2680c = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = aVar.f2680c;
            if (i4 < aVar.f2679b && i == 0) {
                char cCharAt = aVar.f2678a.charAt(i4);
                aVar.f2681d = cCharAt;
                if (Character.isHighSurrogate(cCharAt)) {
                    int iCodePointAt = Character.codePointAt(aVar.f2678a, aVar.f2680c);
                    aVar.f2680c = Character.charCount(iCodePointAt) + aVar.f2680c;
                    directionality = Character.getDirectionality(iCodePointAt);
                } else {
                    aVar.f2680c++;
                    char c2 = aVar.f2681d;
                    directionality = c2 < 1792 ? a.f2677e[c2] : Character.getDirectionality(c2);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
        }
        if (i == 0) {
            return 0;
        }
        if (i2 != 0) {
            return i2;
        }
        while (aVar.f2680c > 0) {
            switch (aVar.m1530a()) {
                case 14:
                case 15:
                    if (i == i3) {
                        return -1;
                    }
                    i3--;
                    break;
                case 16:
                case 17:
                    if (i == i3) {
                        return 1;
                    }
                    i3--;
                    break;
                case 18:
                    i3++;
                    break;
                default:
                    break;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public static int m1529b(CharSequence charSequence) {
        a aVar = new a(charSequence, false);
        aVar.f2680c = aVar.f2679b;
        int i = 0;
        int i2 = 0;
        while (aVar.f2680c > 0) {
            byte bM1530a = aVar.m1530a();
            if (bM1530a == 0) {
                if (i == 0) {
                    return -1;
                }
                if (i2 == 0) {
                    i2 = i;
                }
            } else if (bM1530a == 1 || bM1530a == 2) {
                if (i == 0) {
                    return 1;
                }
                if (i2 == 0) {
                    i2 = i;
                }
            } else if (bM1530a != 9) {
                switch (bM1530a) {
                    case 14:
                    case 15:
                        if (i2 == i) {
                            return -1;
                        }
                        i--;
                        break;
                    case 16:
                    case 17:
                        if (i2 == i) {
                            return 1;
                        }
                        i--;
                        break;
                    case 18:
                        i++;
                        break;
                    default:
                        if (i2 == 0) {
                            i2 = i;
                        }
                        break;
                }
            } else {
                continue;
            }
        }
        return 0;
    }
}
