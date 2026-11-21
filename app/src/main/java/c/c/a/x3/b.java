package c.c.a.x3;

/* JADX INFO: renamed from: c.c.a.x3.b */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a */
    public Class f5474a;

    /* JADX INFO: renamed from: b */
    public int f5475b;

    public b(String str) {
        try {
            this.f5474a = Class.forName(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        int length = new f().toString().length() - 2;
        this.f5475b = length;
        this.f5475b = length * length;
    }

    /* JADX INFO: renamed from: a */
    public e m2689a(String str, Class<?>... clsArr) {
        return new e(this.f5474a, str, clsArr);
    }
}
