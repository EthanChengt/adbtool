package p080c.p084b.p085a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import c.a.a.a.a;
import p080c.p084b.p085a.p088m.p091u.AbstractC0707k;
import p080c.p084b.p085a.p088m.p091u.C0708l;
import p080c.p084b.p085a.p088m.p097w.p098c.AbstractC0768l;
import p080c.p084b.p085a.p088m.p097w.p098c.C0765i;
import p080c.p084b.p085a.p088m.p097w.p098c.C0766j;
import p080c.p084b.p085a.p088m.p097w.p098c.C0773q;
import p080c.p084b.p085a.p104n.C0826r;
import p080c.p084b.p085a.p107q.AbstractC0841a;
import p080c.p084b.p085a.p107q.C0842b;
import p080c.p084b.p085a.p107q.C0846f;
import p080c.p084b.p085a.p107q.C0848h;
import p080c.p084b.p085a.p107q.C0849i;
import p080c.p084b.p085a.p107q.InterfaceC0843c;
import p080c.p084b.p085a.p107q.InterfaceC0844d;
import p080c.p084b.p085a.p107q.InterfaceC0845e;
import p080c.p084b.p085a.p107q.p108j.AbstractC0858i;
import p080c.p084b.p085a.p107q.p108j.C0851b;
import p080c.p084b.p085a.p107q.p108j.C0853d;
import p080c.p084b.p085a.p107q.p108j.InterfaceC0857h;
import p080c.p084b.p085a.p107q.p109k.C0859a;
import p080c.p084b.p085a.p111s.C0870e;
import p080c.p084b.p085a.p111s.C0875j;

/* JADX WARN: Unexpected interfaces in signature: [java.lang.Object<c.b.a.h<TranscodeType>>] */
/* JADX INFO: renamed from: c.b.a.h */
/* JADX INFO: loaded from: classes.dex */
public class C0622h<TranscodeType> extends AbstractC0841a<C0622h<TranscodeType>> implements Cloneable {

    /* JADX INFO: renamed from: B */
    public final Context f3806B;

    /* JADX INFO: renamed from: C */
    public final ComponentCallbacks2C0623i f3807C;

    /* JADX INFO: renamed from: D */
    public final Class<TranscodeType> f3808D;

    /* JADX INFO: renamed from: E */
    public final C0618d f3809E;

    /* JADX INFO: renamed from: F */
    public AbstractC0624j<?, ? super TranscodeType> f3810F;

    /* JADX INFO: renamed from: G */
    public Object f3811G;

    /* JADX INFO: renamed from: H */
    public List<InterfaceC0845e<TranscodeType>> f3812H;

    /* JADX INFO: renamed from: I */
    public C0622h<TranscodeType> f3813I;

    /* JADX INFO: renamed from: J */
    public C0622h<TranscodeType> f3814J;

    /* JADX INFO: renamed from: K */
    public boolean f3815K = true;

    /* JADX INFO: renamed from: L */
    public boolean f3816L;

    /* JADX INFO: renamed from: M */
    public boolean f3817M;

    /* JADX INFO: renamed from: c.b.a.h$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f3818a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f3819b;

        static {
            EnumC0620f.values();
            int[] iArr = new int[4];
            f3819b = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3819b[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3819b[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3819b[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f3818a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3818a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3818a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f3818a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f3818a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f3818a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f3818a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f3818a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
        new C0846f().m2545d(AbstractC0707k.f4169b).m2550j(EnumC0620f.LOW).m2554n(true);
    }

    @SuppressLint({"CheckResult"})
    public C0622h(ComponentCallbacks2C0616b componentCallbacks2C0616b, ComponentCallbacks2C0623i componentCallbacks2C0623i, Class<TranscodeType> cls, Context context) {
        C0846f c0846f;
        this.f3807C = componentCallbacks2C0623i;
        this.f3808D = cls;
        this.f3806B = context;
        C0618d c0618d = componentCallbacks2C0623i.f3821b.f3756d;
        AbstractC0624j abstractC0624j = c0618d.f3784f.get(cls);
        if (abstractC0624j == null) {
            for (Map.Entry<Class<?>, AbstractC0624j<?, ?>> entry : c0618d.f3784f.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    abstractC0624j = (AbstractC0624j) entry.getValue();
                }
            }
        }
        this.f3810F = abstractC0624j == null ? C0618d.f3778k : abstractC0624j;
        this.f3809E = componentCallbacks2C0616b.f3756d;
        Iterator<InterfaceC0845e<Object>> it = componentCallbacks2C0623i.f3829j.iterator();
        while (it.hasNext()) {
            m2220r((InterfaceC0845e) it.next());
        }
        synchronized (componentCallbacks2C0623i) {
            c0846f = componentCallbacks2C0623i.f3830k;
        }
        mo2218a(c0846f);
    }

    /* JADX INFO: renamed from: r */
    public C0622h<TranscodeType> m2220r(InterfaceC0845e<TranscodeType> interfaceC0845e) {
        if (this.f4637w) {
            return clone().m2220r(interfaceC0845e);
        }
        if (interfaceC0845e != null) {
            if (this.f3812H == null) {
                this.f3812H = new ArrayList();
            }
            this.f3812H.add(interfaceC0845e);
        }
        m2551k();
        return this;
    }

    @Override // p080c.p084b.p085a.p107q.AbstractC0841a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public C0622h<TranscodeType> mo2218a(AbstractC0841a<?> abstractC0841a) {
        Objects.requireNonNull(abstractC0841a, "Argument must not be null");
        return (C0622h) super.mo2218a(abstractC0841a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0065  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ed  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    public final InterfaceC0843c m2222t(Object obj, InterfaceC0857h<TranscodeType> interfaceC0857h, InterfaceC0845e<TranscodeType> interfaceC0845e, InterfaceC0844d interfaceC0844d, AbstractC0624j<?, ? super TranscodeType> abstractC0624j, EnumC0620f enumC0620f, int i, int i2, AbstractC0841a<?> abstractC0841a, Executor executor) {
        C0842b c0842b;
        InterfaceC0844d c0842b2;
        InterfaceC0843c interfaceC0843cM2228z;
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.f3814J != null) {
            c0842b2 = new C0842b(obj, interfaceC0844d);
            c0842b = c0842b2;
        } else {
            c0842b = 0;
            c0842b2 = interfaceC0844d;
        }
        C0622h<TranscodeType> c0622h = this.f3813I;
        if (c0622h == null) {
            interfaceC0843cM2228z = m2228z(obj, interfaceC0857h, interfaceC0845e, abstractC0841a, c0842b2, abstractC0624j, enumC0620f, i, i2, executor);
        } else {
            if (this.f3817M) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            AbstractC0624j<?, ? super TranscodeType> abstractC0624j2 = c0622h.f3815K ? abstractC0624j : c0622h.f3810F;
            EnumC0620f enumC0620fM2224v = AbstractC0841a.m2543f(c0622h.f4616b, 8) ? this.f3813I.f4619e : m2224v(enumC0620f);
            C0622h<TranscodeType> c0622h2 = this.f3813I;
            int i7 = c0622h2.f4626l;
            int i8 = c0622h2.f4625k;
            if (C0875j.m2618j(i, i2)) {
                C0622h<TranscodeType> c0622h3 = this.f3813I;
                if (C0875j.m2618j(c0622h3.f4626l, c0622h3.f4625k)) {
                    i5 = i8;
                    i6 = i7;
                } else {
                    i6 = abstractC0841a.f4626l;
                    i5 = abstractC0841a.f4625k;
                }
            } else {
                i5 = i8;
                i6 = i7;
            }
            C0849i c0849i = new C0849i(obj, c0842b2);
            InterfaceC0843c interfaceC0843cM2228z2 = m2228z(obj, interfaceC0857h, interfaceC0845e, abstractC0841a, c0849i, abstractC0624j, enumC0620f, i, i2, executor);
            this.f3817M = true;
            C0622h<TranscodeType> c0622h4 = this.f3813I;
            InterfaceC0843c interfaceC0843cM2222t = c0622h4.m2222t(obj, interfaceC0857h, interfaceC0845e, c0849i, abstractC0624j2, enumC0620fM2224v, i6, i5, c0622h4, executor);
            this.f3817M = false;
            c0849i.f4693c = interfaceC0843cM2228z2;
            c0849i.f4694d = interfaceC0843cM2222t;
            interfaceC0843cM2228z = c0849i;
        }
        if (c0842b == 0) {
            return interfaceC0843cM2228z;
        }
        C0622h<TranscodeType> c0622h5 = this.f3814J;
        int i9 = c0622h5.f4626l;
        int i10 = c0622h5.f4625k;
        if (C0875j.m2618j(i, i2)) {
            C0622h<TranscodeType> c0622h6 = this.f3814J;
            if (C0875j.m2618j(c0622h6.f4626l, c0622h6.f4625k)) {
                i3 = i10;
                i4 = i9;
            } else {
                i4 = abstractC0841a.f4626l;
                i3 = abstractC0841a.f4625k;
            }
        } else {
            i3 = i10;
            i4 = i9;
        }
        C0622h<TranscodeType> c0622h7 = this.f3814J;
        InterfaceC0843c interfaceC0843cM2222t2 = c0622h7.m2222t(obj, interfaceC0857h, interfaceC0845e, c0842b, c0622h7.f3810F, c0622h7.f4619e, i4, i3, c0622h7, executor);
        c0842b.f4643c = interfaceC0843cM2228z;
        c0842b.f4644d = interfaceC0843cM2222t2;
        return c0842b;
    }

    @Override // p080c.p084b.p085a.p107q.AbstractC0841a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public C0622h<TranscodeType> clone() {
        C0622h<TranscodeType> c0622h = (C0622h) super.clone();
        c0622h.f3810F = c0622h.f3810F.m2239a();
        if (c0622h.f3812H != null) {
            c0622h.f3812H = new ArrayList(c0622h.f3812H);
        }
        C0622h<TranscodeType> c0622h2 = c0622h.f3813I;
        if (c0622h2 != null) {
            c0622h.f3813I = c0622h2.clone();
        }
        C0622h<TranscodeType> c0622h3 = c0622h.f3814J;
        if (c0622h3 != null) {
            c0622h.f3814J = c0622h3.clone();
        }
        return c0622h;
    }

    /* JADX INFO: renamed from: v */
    public final EnumC0620f m2224v(EnumC0620f enumC0620f) {
        int iOrdinal = enumC0620f.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return EnumC0620f.IMMEDIATE;
        }
        if (iOrdinal == 2) {
            return EnumC0620f.HIGH;
        }
        if (iOrdinal == 3) {
            return EnumC0620f.NORMAL;
        }
        StringBuilder sbM2191e = a.m2191e("unknown priority: ");
        sbM2191e.append(this.f4619e);
        throw new IllegalArgumentException(sbM2191e.toString());
    }

    /* JADX INFO: renamed from: w */
    public final <Y extends InterfaceC0857h<TranscodeType>> Y m2225w(Y y, InterfaceC0845e<TranscodeType> interfaceC0845e, AbstractC0841a<?> abstractC0841a, Executor executor) {
        Objects.requireNonNull(y, "Argument must not be null");
        if (!this.f3816L) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        InterfaceC0843c interfaceC0843cM2222t = m2222t(new Object(), y, interfaceC0845e, null, this.f3810F, abstractC0841a.f4619e, abstractC0841a.f4626l, abstractC0841a.f4625k, abstractC0841a, executor);
        InterfaceC0843c interfaceC0843cMo2590f = y.mo2590f();
        if (interfaceC0843cM2222t.mo2565h(interfaceC0843cMo2590f)) {
            if (!(!abstractC0841a.f4624j && interfaceC0843cMo2590f.mo2566i())) {
                Objects.requireNonNull(interfaceC0843cMo2590f, "Argument must not be null");
                if (!interfaceC0843cMo2590f.isRunning()) {
                    interfaceC0843cMo2590f.mo2563f();
                }
                return y;
            }
        }
        this.f3807C.m2233m(y);
        y.mo2592j(interfaceC0843cM2222t);
        ComponentCallbacks2C0623i componentCallbacks2C0623i = this.f3807C;
        synchronized (componentCallbacks2C0623i) {
            componentCallbacks2C0623i.f3826g.f4597b.add(y);
            C0826r c0826r = componentCallbacks2C0623i.f3824e;
            c0826r.f4587a.add(interfaceC0843cM2222t);
            if (c0826r.f4589c) {
                interfaceC0843cM2222t.clear();
                if (Log.isLoggable("RequestTracker", 2)) {
                    Log.v("RequestTracker", "Paused, delaying request");
                }
                c0826r.f4588b.add(interfaceC0843cM2222t);
            } else {
                interfaceC0843cM2222t.mo2563f();
            }
        }
        return y;
    }

    /* JADX INFO: renamed from: x */
    public AbstractC0858i<ImageView, TranscodeType> m2226x(ImageView imageView) {
        C0622h<TranscodeType> c0622hM2547g;
        AbstractC0858i<ImageView, TranscodeType> c0853d;
        C0622h<TranscodeType> c0622hClone;
        AbstractC0768l abstractC0768l;
        C0766j c0766j;
        C0875j.m2609a();
        Objects.requireNonNull(imageView, "Argument must not be null");
        if (!AbstractC0841a.m2543f(this.f4616b, 2048) && this.f4629o && imageView.getScaleType() != null) {
            switch (a.f3818a[imageView.getScaleType().ordinal()]) {
                case 1:
                    c0622hM2547g = clone().m2547g(AbstractC0768l.f4435c, new C0765i());
                    break;
                case RecyclerView.SCROLL_STATE_SETTLING /* 2 */:
                    c0622hClone = clone();
                    abstractC0768l = AbstractC0768l.f4434b;
                    c0766j = new C0766j();
                    c0622hM2547g = c0622hClone.m2547g(abstractC0768l, c0766j);
                    c0622hM2547g.f4640z = true;
                    break;
                case 3:
                case 4:
                case 5:
                    c0622hM2547g = clone().m2547g(AbstractC0768l.f4433a, new C0773q());
                    c0622hM2547g.f4640z = true;
                    break;
                case 6:
                    c0622hClone = clone();
                    abstractC0768l = AbstractC0768l.f4434b;
                    c0766j = new C0766j();
                    c0622hM2547g = c0622hClone.m2547g(abstractC0768l, c0766j);
                    c0622hM2547g.f4640z = true;
                    break;
                default:
                    c0622hM2547g = this;
                    break;
            }
        } else {
            c0622hM2547g = this;
        }
        C0618d c0618d = this.f3809E;
        Class<TranscodeType> cls = this.f3808D;
        Objects.requireNonNull(c0618d.f3781c);
        if (Bitmap.class.equals(cls)) {
            c0853d = new C0851b(imageView);
        } else {
            if (!Drawable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
            }
            c0853d = new C0853d(imageView);
        }
        m2225w(c0853d, null, c0622hM2547g, C0870e.f4729a);
        return c0853d;
    }

    /* JADX INFO: renamed from: y */
    public final C0622h<TranscodeType> m2227y(Object obj) {
        if (this.f4637w) {
            return clone().m2227y(obj);
        }
        this.f3811G = obj;
        this.f3816L = true;
        m2551k();
        return this;
    }

    /* JADX INFO: renamed from: z */
    public final InterfaceC0843c m2228z(Object obj, InterfaceC0857h<TranscodeType> interfaceC0857h, InterfaceC0845e<TranscodeType> interfaceC0845e, AbstractC0841a<?> abstractC0841a, InterfaceC0844d interfaceC0844d, AbstractC0624j<?, ? super TranscodeType> abstractC0624j, EnumC0620f enumC0620f, int i, int i2, Executor executor) {
        Context context = this.f3806B;
        C0618d c0618d = this.f3809E;
        Object obj2 = this.f3811G;
        Class<TranscodeType> cls = this.f3808D;
        List<InterfaceC0845e<TranscodeType>> list = this.f3812H;
        C0708l c0708l = c0618d.f3785g;
        Objects.requireNonNull(abstractC0624j);
        return new C0848h(context, c0618d, obj, obj2, cls, abstractC0841a, i, i2, enumC0620f, interfaceC0857h, interfaceC0845e, list, interfaceC0844d, c0708l, C0859a.f4710b, executor);
    }
}
