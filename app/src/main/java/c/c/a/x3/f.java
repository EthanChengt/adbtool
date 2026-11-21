package c.c.a.x3;

import java.util.Random;

/* JADX INFO: renamed from: c.c.a.x3.f */
/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a */
    public final StringBuilder f5485a;

    public f() {
        this.f5485a = new StringBuilder(10);
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            this.f5485a.append((char) (random.nextInt(26) + 97));
        }
    }

    public f(int i) {
        this.f5485a = new StringBuilder(i);
        Random random = new Random();
        for (int i2 = 0; i2 < i; i2++) {
            this.f5485a.append((char) (random.nextInt(26) + 97));
        }
    }

    /* JADX INFO: renamed from: a */
    public static native String a(String str);
    public static String m2694a(String str) {
        return a(str);
    }

    /* JADX INFO: renamed from: b */
    public static native String b();
    public static String m2695b() {
        return b();
    }

    public native String toString();
}
