package c.c.a.x3;

/* JADX INFO: renamed from: c.c.a.x3.g */
/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a */
    public static final int f5486a;

    /* JADX INFO: renamed from: b */
    public static final String f5487b;

    /* JADX INFO: renamed from: c */
    public static final String f5488c;

    /* JADX INFO: renamed from: d */
    public static final String f5489d;

    /* JADX INFO: renamed from: e */
    public static final String f5490e;

    static {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            if ("caeijfcecj".charAt(i) == '-') {
                sb.append('-');
            } else {
                sb.append("caeijfcecj".charAt(i) - 'a');
            }
        }
        f5486a = Integer.parseInt(sb.toString());
        f5487b = f.m2694a("kymdihm") + "." + f.m2694a("viyecye") + "." + f.m2694a("jz") + "." + f.m2694a("JkvrkocJkdlcd");
        f5488c = f.m2694a("jkdlcJkvrkoc");
        f5489d = f.m2694a("visscveVcdehnhvkecl");
        f5490e = f.m2694a("zLhoyhyoMcekhsl");
    }

    /* JADX INFO: renamed from: a */
    public static native byte[] a(String str);
    public static byte[] m2696a(String str) {
        return a(str);
    }
}
