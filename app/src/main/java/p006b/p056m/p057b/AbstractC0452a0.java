package p006b.p056m.p057b;

import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import p006b.p061o.AbstractC0499d;

/* JADX INFO: renamed from: b.m.b.a0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0452a0 {

    /* JADX INFO: renamed from: b */
    public int f2933b;

    /* JADX INFO: renamed from: c */
    public int f2934c;

    /* JADX INFO: renamed from: d */
    public int f2935d;

    /* JADX INFO: renamed from: e */
    public int f2936e;

    /* JADX INFO: renamed from: f */
    public int f2937f;

    /* JADX INFO: renamed from: g */
    public boolean f2938g;

    /* JADX INFO: renamed from: i */
    public String f2940i;

    /* JADX INFO: renamed from: j */
    public int f2941j;

    /* JADX INFO: renamed from: k */
    public CharSequence f2942k;

    /* JADX INFO: renamed from: l */
    public int f2943l;

    /* JADX INFO: renamed from: m */
    public CharSequence f2944m;

    /* JADX INFO: renamed from: n */
    public ArrayList<String> f2945n;

    /* JADX INFO: renamed from: o */
    public ArrayList<String> f2946o;

    /* JADX INFO: renamed from: a */
    public ArrayList<a> f2932a = new ArrayList<>();

    /* JADX INFO: renamed from: h */
    public boolean f2939h = true;

    /* JADX INFO: renamed from: p */
    public boolean f2947p = false;

    /* JADX INFO: renamed from: b.m.b.a0$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public int f2948a;

        /* JADX INFO: renamed from: b */
        public Fragment f2949b;

        /* JADX INFO: renamed from: c */
        public int f2950c;

        /* JADX INFO: renamed from: d */
        public int f2951d;

        /* JADX INFO: renamed from: e */
        public int f2952e;

        /* JADX INFO: renamed from: f */
        public int f2953f;

        /* JADX INFO: renamed from: g */
        public AbstractC0499d.b f2954g;

        /* JADX INFO: renamed from: h */
        public AbstractC0499d.b f2955h;

        public a() {
        }

        public a(int i, Fragment fragment) {
            this.f2948a = i;
            this.f2949b = fragment;
            AbstractC0499d.b bVar = AbstractC0499d.b.RESUMED;
            this.f2954g = bVar;
            this.f2955h = bVar;
        }

        public a(int i, Fragment fragment, AbstractC0499d.b bVar) {
            this.f2948a = i;
            this.f2949b = fragment;
            this.f2954g = fragment.f676P;
            this.f2955h = bVar;
        }
    }

    public AbstractC0452a0(C0477n c0477n, ClassLoader classLoader) {
    }

    /* JADX INFO: renamed from: b */
    public void m1724b(a aVar) {
        this.f2932a.add(aVar);
        aVar.f2950c = this.f2933b;
        aVar.f2951d = this.f2934c;
        aVar.f2952e = this.f2935d;
        aVar.f2953f = this.f2936e;
    }

    /* JADX INFO: renamed from: c */
    public abstract int mo1713c();

    /* JADX INFO: renamed from: d */
    public abstract void mo1714d();

    /* JADX INFO: renamed from: e */
    public abstract void mo1715e(int i, Fragment fragment, String str, int i2);

    /* JADX INFO: renamed from: f */
    public AbstractC0452a0 m1725f(int i, Fragment fragment) {
        if (i == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        mo1715e(i, fragment, null, 2);
        return this;
    }

    /* JADX INFO: renamed from: g */
    public abstract AbstractC0452a0 mo1716g(Fragment fragment, AbstractC0499d.b bVar);
}
