package p080c.p084b.p085a.p107q;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.Map;
import java.util.Objects;
import p080c.p084b.p085a.EnumC0620f;
import p080c.p084b.p085a.p088m.C0646n;
import p080c.p084b.p085a.p088m.C0647o;
import p080c.p084b.p085a.p088m.InterfaceC0645m;
import p080c.p084b.p085a.p088m.InterfaceC0651s;
import p080c.p084b.p085a.p088m.p091u.AbstractC0707k;
import p080c.p084b.p085a.p088m.p097w.p098c.AbstractC0768l;
import p080c.p084b.p085a.p088m.p097w.p098c.C0771o;
import p080c.p084b.p085a.p088m.p097w.p102g.C0794c;
import p080c.p084b.p085a.p088m.p097w.p102g.C0797f;
import p080c.p084b.p085a.p107q.AbstractC0841a;
import p080c.p084b.p085a.p110r.C0864c;
import p080c.p084b.p085a.p111s.C0867b;
import p080c.p084b.p085a.p111s.C0875j;

/* JADX INFO: renamed from: c.b.a.q.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0841a<T extends AbstractC0841a<T>> implements Cloneable {

    /* JADX INFO: renamed from: A */
    public boolean f4615A;

    /* JADX INFO: renamed from: b */
    public int f4616b;

    /* JADX INFO: renamed from: f */
    public Drawable f4620f;

    /* JADX INFO: renamed from: g */
    public int f4621g;

    /* JADX INFO: renamed from: h */
    public Drawable f4622h;

    /* JADX INFO: renamed from: i */
    public int f4623i;

    /* JADX INFO: renamed from: m */
    public InterfaceC0645m f4627m;

    /* JADX INFO: renamed from: n */
    public boolean f4628n;

    /* JADX INFO: renamed from: o */
    public boolean f4629o;

    /* JADX INFO: renamed from: p */
    public Drawable f4630p;

    /* JADX INFO: renamed from: q */
    public int f4631q;

    /* JADX INFO: renamed from: r */
    public C0647o f4632r;

    /* JADX INFO: renamed from: s */
    public Map<Class<?>, InterfaceC0651s<?>> f4633s;

    /* JADX INFO: renamed from: t */
    public Class<?> f4634t;

    /* JADX INFO: renamed from: u */
    public boolean f4635u;

    /* JADX INFO: renamed from: v */
    public Resources.Theme f4636v;

    /* JADX INFO: renamed from: w */
    public boolean f4637w;

    /* JADX INFO: renamed from: x */
    public boolean f4638x;

    /* JADX INFO: renamed from: y */
    public boolean f4639y;

    /* JADX INFO: renamed from: z */
    public boolean f4640z;

    /* JADX INFO: renamed from: c */
    public float f4617c = 1.0f;

    /* JADX INFO: renamed from: d */
    public AbstractC0707k f4618d = AbstractC0707k.f4170c;

    /* JADX INFO: renamed from: e */
    public EnumC0620f f4619e = EnumC0620f.NORMAL;

    /* JADX INFO: renamed from: j */
    public boolean f4624j = true;

    /* JADX INFO: renamed from: k */
    public int f4625k = -1;

    /* JADX INFO: renamed from: l */
    public int f4626l = -1;

    public AbstractC0841a() {
        C0864c c0864c = C0864c.f4715b;
        this.f4627m = C0864c.f4715b;
        this.f4629o = true;
        this.f4632r = new C0647o();
        this.f4633s = new C0867b();
        this.f4634t = Object.class;
        this.f4640z = true;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m2543f(int i, int i2) {
        return (i & i2) != 0;
    }

    /* JADX INFO: renamed from: a */
    public T mo2218a(AbstractC0841a<?> abstractC0841a) {
        if (this.f4637w) {
            return (T) clone().mo2218a(abstractC0841a);
        }
        if (m2543f(abstractC0841a.f4616b, 2)) {
            this.f4617c = abstractC0841a.f4617c;
        }
        if (m2543f(abstractC0841a.f4616b, 262144)) {
            this.f4638x = abstractC0841a.f4638x;
        }
        if (m2543f(abstractC0841a.f4616b, 1048576)) {
            this.f4615A = abstractC0841a.f4615A;
        }
        if (m2543f(abstractC0841a.f4616b, 4)) {
            this.f4618d = abstractC0841a.f4618d;
        }
        if (m2543f(abstractC0841a.f4616b, 8)) {
            this.f4619e = abstractC0841a.f4619e;
        }
        if (m2543f(abstractC0841a.f4616b, 16)) {
            this.f4620f = abstractC0841a.f4620f;
            this.f4621g = 0;
            this.f4616b &= -33;
        }
        if (m2543f(abstractC0841a.f4616b, 32)) {
            this.f4621g = abstractC0841a.f4621g;
            this.f4620f = null;
            this.f4616b &= -17;
        }
        if (m2543f(abstractC0841a.f4616b, 64)) {
            this.f4622h = abstractC0841a.f4622h;
            this.f4623i = 0;
            this.f4616b &= -129;
        }
        if (m2543f(abstractC0841a.f4616b, 128)) {
            this.f4623i = abstractC0841a.f4623i;
            this.f4622h = null;
            this.f4616b &= -65;
        }
        if (m2543f(abstractC0841a.f4616b, 256)) {
            this.f4624j = abstractC0841a.f4624j;
        }
        if (m2543f(abstractC0841a.f4616b, 512)) {
            this.f4626l = abstractC0841a.f4626l;
            this.f4625k = abstractC0841a.f4625k;
        }
        if (m2543f(abstractC0841a.f4616b, 1024)) {
            this.f4627m = abstractC0841a.f4627m;
        }
        if (m2543f(abstractC0841a.f4616b, 4096)) {
            this.f4634t = abstractC0841a.f4634t;
        }
        if (m2543f(abstractC0841a.f4616b, 8192)) {
            this.f4630p = abstractC0841a.f4630p;
            this.f4631q = 0;
            this.f4616b &= -16385;
        }
        if (m2543f(abstractC0841a.f4616b, 16384)) {
            this.f4631q = abstractC0841a.f4631q;
            this.f4630p = null;
            this.f4616b &= -8193;
        }
        if (m2543f(abstractC0841a.f4616b, 32768)) {
            this.f4636v = abstractC0841a.f4636v;
        }
        if (m2543f(abstractC0841a.f4616b, 65536)) {
            this.f4629o = abstractC0841a.f4629o;
        }
        if (m2543f(abstractC0841a.f4616b, 131072)) {
            this.f4628n = abstractC0841a.f4628n;
        }
        if (m2543f(abstractC0841a.f4616b, 2048)) {
            this.f4633s.putAll(abstractC0841a.f4633s);
            this.f4640z = abstractC0841a.f4640z;
        }
        if (m2543f(abstractC0841a.f4616b, 524288)) {
            this.f4639y = abstractC0841a.f4639y;
        }
        if (!this.f4629o) {
            this.f4633s.clear();
            int i = this.f4616b & (-2049);
            this.f4616b = i;
            this.f4628n = false;
            this.f4616b = i & (-131073);
            this.f4640z = true;
        }
        this.f4616b |= abstractC0841a.f4616b;
        this.f4632r.m2286d(abstractC0841a.f4632r);
        m2551k();
        return this;
    }

    @Override // 
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public T clone() {
        try {
            T t = (T) super.clone();
            C0647o c0647o = new C0647o();
            t.f4632r = c0647o;
            c0647o.m2286d(this.f4632r);
            C0867b c0867b = new C0867b();
            t.f4633s = c0867b;
            c0867b.putAll(this.f4633s);
            t.f4635u = false;
            t.f4637w = false;
            return t;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: c */
    public T m2544c(Class<?> cls) {
        if (this.f4637w) {
            return (T) clone().m2544c(cls);
        }
        Objects.requireNonNull(cls, "Argument must not be null");
        this.f4634t = cls;
        this.f4616b |= 4096;
        m2551k();
        return this;
    }

    /* JADX INFO: renamed from: d */
    public T m2545d(AbstractC0707k abstractC0707k) {
        if (this.f4637w) {
            return (T) clone().m2545d(abstractC0707k);
        }
        Objects.requireNonNull(abstractC0707k, "Argument must not be null");
        this.f4618d = abstractC0707k;
        this.f4616b |= 4;
        m2551k();
        return this;
    }

    /* JADX INFO: renamed from: e */
    public T m2546e(int i) {
        if (this.f4637w) {
            return (T) clone().m2546e(i);
        }
        this.f4621g = i;
        int i2 = this.f4616b | 32;
        this.f4616b = i2;
        this.f4620f = null;
        this.f4616b = i2 & (-17);
        m2551k();
        return this;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AbstractC0841a)) {
            return false;
        }
        AbstractC0841a abstractC0841a = (AbstractC0841a) obj;
        return Float.compare(abstractC0841a.f4617c, this.f4617c) == 0 && this.f4621g == abstractC0841a.f4621g && C0875j.m2610b(this.f4620f, abstractC0841a.f4620f) && this.f4623i == abstractC0841a.f4623i && C0875j.m2610b(this.f4622h, abstractC0841a.f4622h) && this.f4631q == abstractC0841a.f4631q && C0875j.m2610b(this.f4630p, abstractC0841a.f4630p) && this.f4624j == abstractC0841a.f4624j && this.f4625k == abstractC0841a.f4625k && this.f4626l == abstractC0841a.f4626l && this.f4628n == abstractC0841a.f4628n && this.f4629o == abstractC0841a.f4629o && this.f4638x == abstractC0841a.f4638x && this.f4639y == abstractC0841a.f4639y && this.f4618d.equals(abstractC0841a.f4618d) && this.f4619e == abstractC0841a.f4619e && this.f4632r.equals(abstractC0841a.f4632r) && this.f4633s.equals(abstractC0841a.f4633s) && this.f4634t.equals(abstractC0841a.f4634t) && C0875j.m2610b(this.f4627m, abstractC0841a.f4627m) && C0875j.m2610b(this.f4636v, abstractC0841a.f4636v);
    }

    /* JADX INFO: renamed from: g */
    public final T m2547g(AbstractC0768l abstractC0768l, InterfaceC0651s<Bitmap> interfaceC0651s) {
        if (this.f4637w) {
            return (T) clone().m2547g(abstractC0768l, interfaceC0651s);
        }
        C0646n c0646n = AbstractC0768l.f4438f;
        Objects.requireNonNull(abstractC0768l, "Argument must not be null");
        m2552l(c0646n, abstractC0768l);
        return (T) m2555o(interfaceC0651s, false);
    }

    /* JADX INFO: renamed from: h */
    public T m2548h(int i, int i2) {
        if (this.f4637w) {
            return (T) clone().m2548h(i, i2);
        }
        this.f4626l = i;
        this.f4625k = i2;
        this.f4616b |= 512;
        m2551k();
        return this;
    }

    public int hashCode() {
        float f = this.f4617c;
        char[] cArr = C0875j.f4742a;
        return C0875j.m2615g(this.f4636v, C0875j.m2615g(this.f4627m, C0875j.m2615g(this.f4634t, C0875j.m2615g(this.f4633s, C0875j.m2615g(this.f4632r, C0875j.m2615g(this.f4619e, C0875j.m2615g(this.f4618d, (((((((((((((C0875j.m2615g(this.f4630p, (C0875j.m2615g(this.f4622h, (C0875j.m2615g(this.f4620f, ((Float.floatToIntBits(f) + 527) * 31) + this.f4621g) * 31) + this.f4623i) * 31) + this.f4631q) * 31) + (this.f4624j ? 1 : 0)) * 31) + this.f4625k) * 31) + this.f4626l) * 31) + (this.f4628n ? 1 : 0)) * 31) + (this.f4629o ? 1 : 0)) * 31) + (this.f4638x ? 1 : 0)) * 31) + (this.f4639y ? 1 : 0))))))));
    }

    /* JADX INFO: renamed from: i */
    public T m2549i(Drawable drawable) {
        if (this.f4637w) {
            return (T) clone().m2549i(drawable);
        }
        this.f4622h = drawable;
        int i = this.f4616b | 64;
        this.f4616b = i;
        this.f4623i = 0;
        this.f4616b = i & (-129);
        m2551k();
        return this;
    }

    /* JADX INFO: renamed from: j */
    public T m2550j(EnumC0620f enumC0620f) {
        if (this.f4637w) {
            return (T) clone().m2550j(enumC0620f);
        }
        Objects.requireNonNull(enumC0620f, "Argument must not be null");
        this.f4619e = enumC0620f;
        this.f4616b |= 8;
        m2551k();
        return this;
    }

    /* JADX INFO: renamed from: k */
    public final T m2551k() {
        if (this.f4635u) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return this;
    }

    /* JADX INFO: renamed from: l */
    public <Y> T m2552l(C0646n<Y> c0646n, Y y) {
        if (this.f4637w) {
            return (T) clone().m2552l(c0646n, y);
        }
        Objects.requireNonNull(c0646n, "Argument must not be null");
        Objects.requireNonNull(y, "Argument must not be null");
        this.f4632r.f3943b.put(c0646n, y);
        m2551k();
        return this;
    }

    /* JADX INFO: renamed from: m */
    public T m2553m(InterfaceC0645m interfaceC0645m) {
        if (this.f4637w) {
            return (T) clone().m2553m(interfaceC0645m);
        }
        Objects.requireNonNull(interfaceC0645m, "Argument must not be null");
        this.f4627m = interfaceC0645m;
        this.f4616b |= 1024;
        m2551k();
        return this;
    }

    /* JADX INFO: renamed from: n */
    public T m2554n(boolean z) {
        if (this.f4637w) {
            return (T) clone().m2554n(true);
        }
        this.f4624j = !z;
        this.f4616b |= 256;
        m2551k();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public T m2555o(InterfaceC0651s<Bitmap> interfaceC0651s, boolean z) {
        if (this.f4637w) {
            return (T) clone().m2555o(interfaceC0651s, z);
        }
        C0771o c0771o = new C0771o(interfaceC0651s, z);
        m2556p(Bitmap.class, interfaceC0651s, z);
        m2556p(Drawable.class, c0771o, z);
        m2556p(BitmapDrawable.class, c0771o, z);
        m2556p(C0794c.class, new C0797f(interfaceC0651s), z);
        m2551k();
        return this;
    }

    /* JADX INFO: renamed from: p */
    public <Y> T m2556p(Class<Y> cls, InterfaceC0651s<Y> interfaceC0651s, boolean z) {
        if (this.f4637w) {
            return (T) clone().m2556p(cls, interfaceC0651s, z);
        }
        Objects.requireNonNull(cls, "Argument must not be null");
        Objects.requireNonNull(interfaceC0651s, "Argument must not be null");
        this.f4633s.put(cls, interfaceC0651s);
        int i = this.f4616b | 2048;
        this.f4616b = i;
        this.f4629o = true;
        int i2 = i | 65536;
        this.f4616b = i2;
        this.f4640z = false;
        if (z) {
            this.f4616b = i2 | 131072;
            this.f4628n = true;
        }
        m2551k();
        return this;
    }

    /* JADX INFO: renamed from: q */
    public T m2557q(boolean z) {
        if (this.f4637w) {
            return (T) clone().m2557q(z);
        }
        this.f4615A = z;
        this.f4616b |= 1048576;
        m2551k();
        return this;
    }
}
