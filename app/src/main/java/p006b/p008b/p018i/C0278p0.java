package p006b.p008b.p018i;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: b.b.i.p0 */
/* JADX INFO: loaded from: classes.dex */
public class C0278p0 {

    /* JADX INFO: renamed from: a */
    public int f1958a = 0;

    /* JADX INFO: renamed from: b */
    public int f1959b = 0;

    /* JADX INFO: renamed from: c */
    public int f1960c = RecyclerView.UNDEFINED_DURATION;

    /* JADX INFO: renamed from: d */
    public int f1961d = RecyclerView.UNDEFINED_DURATION;

    /* JADX INFO: renamed from: e */
    public int f1962e = 0;

    /* JADX INFO: renamed from: f */
    public int f1963f = 0;

    /* JADX INFO: renamed from: g */
    public boolean f1964g = false;

    /* JADX INFO: renamed from: h */
    public boolean f1965h = false;

    /* JADX INFO: renamed from: a */
    public void m1118a(int i, int i2) {
        this.f1960c = i;
        this.f1961d = i2;
        this.f1965h = true;
        if (this.f1964g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f1958a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f1959b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f1958a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1959b = i2;
        }
    }
}
