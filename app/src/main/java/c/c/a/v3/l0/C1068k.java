package c.c.a.v3.l0;

import java.io.File;

/* JADX INFO: renamed from: c.c.a.v3.l0.k */
/* JADX INFO: loaded from: classes.dex */
public class C1068k {

    /* JADX INFO: renamed from: a */
    public String f5293a;

    /* JADX INFO: renamed from: b */
    public String f5294b;

    /* JADX INFO: renamed from: c */
    public String f5295c;

    /* JADX INFO: renamed from: d */
    public String f5296d;

    /* JADX INFO: renamed from: e */
    public String f5297e;

    /* JADX INFO: renamed from: f */
    public File f5298f;

    /* JADX INFO: renamed from: g */
    public boolean f5299g;

    /* JADX INFO: renamed from: h */
    public int f5300h;

    /* JADX INFO: renamed from: i */
    public int f5301i;

    /* JADX INFO: renamed from: j */
    public int f5302j;

    /* JADX INFO: renamed from: k */
    public boolean f5303k;

    /* JADX INFO: renamed from: l */
    public boolean f5304l;

    /* JADX INFO: renamed from: m */
    public boolean f5305m;

    /* JADX INFO: renamed from: n */
    public boolean f5306n;

    public C1068k() {
        this.f5301i = 1;
        this.f5303k = true;
        this.f5304l = false;
        this.f5305m = false;
        this.f5306n = false;
        this.f5301i = 0;
    }

    public C1068k(C1068k c1068k) {
        this.f5301i = 1;
        this.f5303k = true;
        this.f5304l = false;
        this.f5305m = false;
        this.f5306n = false;
        this.f5294b = c1068k.f5294b;
        this.f5296d = c1068k.f5296d;
        this.f5295c = c1068k.f5295c;
        this.f5293a = c1068k.f5293a;
        this.f5299g = c1068k.f5299g;
        this.f5298f = c1068k.f5298f;
        this.f5300h = c1068k.f5300h;
        this.f5305m = c1068k.f5305m;
        this.f5306n = c1068k.f5306n;
    }

    public C1068k(String str) {
        this.f5301i = 1;
        this.f5303k = true;
        this.f5304l = false;
        this.f5305m = false;
        this.f5306n = false;
        String[] strArrSplit = str.split(":", 2);
        int i = Integer.parseInt(strArrSplit[0].trim().replaceAll("\\D", "").trim());
        this.f5300h = i;
        this.f5297e = m2679a(i);
        String strTrim = strArrSplit[1].trim().split("\\(")[0].trim();
        this.f5294b = strTrim;
        this.f5295c = strTrim.contains(":") ? this.f5294b.split(":")[0] : this.f5294b.contains("@") ? this.f5294b.split("@")[0] : this.f5294b;
        String str2 = strArrSplit[1].split("\\(")[1].split("\\s")[1];
    }

    /* JADX INFO: renamed from: a */
    public static String m2679a(int i) {
        if (i > 1048576) {
            return String.format("%.2f", Float.valueOf((i / 1024.0f) / 1024.0f)) + " GB";
        }
        if (i > 1024) {
            return String.format("%.1f", Float.valueOf(i / 1024.0f)) + " MB";
        }
        return i + " KB";
    }
}
