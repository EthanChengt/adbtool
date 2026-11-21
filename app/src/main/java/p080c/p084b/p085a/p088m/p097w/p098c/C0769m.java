package p080c.p084b.p085a.p088m.p097w.p098c;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import c.a.a.a.a;
import p080c.p084b.p085a.p088m.C0646n;
import p080c.p084b.p085a.p088m.C0647o;
import p080c.p084b.p085a.p088m.EnumC0634b;
import p080c.p084b.p085a.p088m.EnumC0648p;
import p080c.p084b.p085a.p088m.p091u.InterfaceC0719w;
import p080c.p084b.p085a.p088m.p091u.p092c0.InterfaceC0676b;
import p080c.p084b.p085a.p088m.p091u.p092c0.InterfaceC0678d;
import p080c.p084b.p085a.p111s.C0875j;

/* JADX INFO: renamed from: c.b.a.m.w.c.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0769m {

    /* JADX INFO: renamed from: f */
    public static final C0646n<EnumC0634b> f4443f = C0646n.m2283a("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", EnumC0634b.PREFER_ARGB_8888);

    /* JADX INFO: renamed from: g */
    public static final C0646n<EnumC0648p> f4444g = C0646n.m2283a("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", EnumC0648p.SRGB);

    /* JADX INFO: renamed from: h */
    public static final C0646n<Boolean> f4445h;

    /* JADX INFO: renamed from: i */
    public static final C0646n<Boolean> f4446i;

    /* JADX INFO: renamed from: j */
    public static final Set<String> f4447j;

    /* JADX INFO: renamed from: k */
    public static final b f4448k;

    /* JADX INFO: renamed from: l */
    public static final Set<ImageHeaderParser.ImageType> f4449l;

    /* JADX INFO: renamed from: m */
    public static final Queue<BitmapFactory.Options> f4450m;

    /* JADX INFO: renamed from: a */
    public final InterfaceC0678d f4451a;

    /* JADX INFO: renamed from: b */
    public final DisplayMetrics f4452b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0676b f4453c;

    /* JADX INFO: renamed from: d */
    public final List<ImageHeaderParser> f4454d;

    /* JADX INFO: renamed from: e */
    public final C0774r f4455e = C0774r.m2483a();

    /* JADX INFO: renamed from: c.b.a.m.w.c.m$a */
    public class a implements b {
        @Override // p080c.p084b.p085a.p088m.p097w.p098c.C0769m.b
        /* JADX INFO: renamed from: a */
        public void mo2480a(InterfaceC0678d interfaceC0678d, Bitmap bitmap) {
        }

        @Override // p080c.p084b.p085a.p088m.p097w.p098c.C0769m.b
        /* JADX INFO: renamed from: b */
        public void mo2481b() {
        }
    }

    /* JADX INFO: renamed from: c.b.a.m.w.c.m$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo2480a(InterfaceC0678d interfaceC0678d, Bitmap bitmap);

        /* JADX INFO: renamed from: b */
        void mo2481b();
    }

    static {
        C0646n<AbstractC0768l> c0646n = AbstractC0768l.f4438f;
        Boolean bool = Boolean.FALSE;
        f4445h = C0646n.m2283a("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f4446i = C0646n.m2283a("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        f4447j = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f4448k = new a();
        f4449l = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        char[] cArr = C0875j.f4742a;
        f4450m = new ArrayDeque(0);
    }

    public C0769m(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, InterfaceC0678d interfaceC0678d, InterfaceC0676b interfaceC0676b) {
        this.f4454d = list;
        Objects.requireNonNull(displayMetrics, "Argument must not be null");
        this.f4452b = displayMetrics;
        Objects.requireNonNull(interfaceC0678d, "Argument must not be null");
        this.f4451a = interfaceC0678d;
        Objects.requireNonNull(interfaceC0676b, "Argument must not be null");
        this.f4453c = interfaceC0676b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        throw r1;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap m2469d(p080c.p084b.p085a.p088m.p097w.p098c.InterfaceC0775s r5, android.graphics.BitmapFactory.Options r6, p080c.p084b.p085a.p088m.p097w.p098c.C0769m.b r7, p080c.p084b.p085a.p088m.p091u.p092c0.InterfaceC0678d r8) {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r6.inJustDecodeBounds
            if (r1 != 0) goto Lc
            r7.mo2481b()
            r5.mo2487c()
        Lc:
            int r1 = r6.outWidth
            int r2 = r6.outHeight
            java.lang.String r3 = r6.outMimeType
            java.util.concurrent.locks.Lock r4 = p080c.p084b.p085a.p088m.p097w.p098c.C0782z.f4496d
            r4.lock()
            android.graphics.Bitmap r5 = r5.mo2485a(r6)     // Catch: java.lang.Throwable -> L1f java.lang.IllegalArgumentException -> L21
            r4.unlock()
            return r5
        L1f:
            r5 = move-exception
            goto L48
        L21:
            r4 = move-exception
            java.io.IOException r1 = m2474i(r4, r1, r2, r3, r6)     // Catch: java.lang.Throwable -> L1f
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch: java.lang.Throwable -> L1f
            if (r2 == 0) goto L32
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch: java.lang.Throwable -> L1f
        L32:
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L47
            r8.mo2332e(r0)     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L46
            r0 = 0
            r6.inBitmap = r0     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L46
            android.graphics.Bitmap r5 = m2469d(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L46
            java.util.concurrent.locks.Lock r6 = p080c.p084b.p085a.p088m.p097w.p098c.C0782z.f4496d
            r6.unlock()
            return r5
        L46:
            throw r1     // Catch: java.lang.Throwable -> L1f
        L47:
            throw r1     // Catch: java.lang.Throwable -> L1f
        L48:
            java.util.concurrent.locks.Lock r6 = p080c.p084b.p085a.p088m.p097w.p098c.C0782z.f4496d
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p080c.p084b.p085a.p088m.p097w.p098c.C0769m.m2469d(c.b.a.m.w.c.s, android.graphics.BitmapFactory$Options, c.b.a.m.w.c.m$b, c.b.a.m.u.c0.d):android.graphics.Bitmap");
    }

    @TargetApi(19)
    /* JADX INFO: renamed from: e */
    public static String m2470e(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        StringBuilder sbM2191e = a.m2191e(" (");
        sbM2191e.append(bitmap.getAllocationByteCount());
        sbM2191e.append(")");
        String string = sbM2191e.toString();
        StringBuilder sbM2191e2 = a.m2191e("[");
        sbM2191e2.append(bitmap.getWidth());
        sbM2191e2.append("x");
        sbM2191e2.append(bitmap.getHeight());
        sbM2191e2.append("] ");
        sbM2191e2.append(bitmap.getConfig());
        sbM2191e2.append(string);
        return sbM2191e2.toString();
    }

    /* JADX INFO: renamed from: f */
    public static int m2471f(double d) {
        if (d > 1.0d) {
            d = 1.0d / d;
        }
        return (int) Math.round(d * 2.147483647E9d);
    }

    /* JADX INFO: renamed from: g */
    public static int[] m2472g(InterfaceC0775s interfaceC0775s, BitmapFactory.Options options, b bVar, InterfaceC0678d interfaceC0678d) {
        options.inJustDecodeBounds = true;
        m2469d(interfaceC0775s, options, bVar, interfaceC0678d);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* JADX INFO: renamed from: h */
    public static boolean m2473h(int i) {
        return i == 90 || i == 270;
    }

    /* JADX INFO: renamed from: i */
    public static IOException m2474i(IllegalArgumentException illegalArgumentException, int i, int i2, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i + ", outHeight: " + i2 + ", outMimeType: " + str + ", inBitmap: " + m2470e(options.inBitmap), illegalArgumentException);
    }

    /* JADX INFO: renamed from: j */
    public static void m2475j(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    /* JADX INFO: renamed from: k */
    public static int m2476k(double d) {
        return (int) (d + 0.5d);
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC0719w<Bitmap> m2477a(InterfaceC0775s interfaceC0775s, int i, int i2, C0647o c0647o, b bVar) {
        Queue<BitmapFactory.Options> queue;
        BitmapFactory.Options optionsPoll;
        BitmapFactory.Options options;
        byte[] bArr = (byte[]) this.f4453c.mo2324e(65536, byte[].class);
        synchronized (C0769m.class) {
            queue = f4450m;
            synchronized (queue) {
                optionsPoll = queue.poll();
            }
            if (optionsPoll == null) {
                optionsPoll = new BitmapFactory.Options();
                m2475j(optionsPoll);
            }
            options = optionsPoll;
        }
        options.inTempStorage = bArr;
        EnumC0634b enumC0634b = (EnumC0634b) c0647o.m2285c(f4443f);
        EnumC0648p enumC0648p = (EnumC0648p) c0647o.m2285c(f4444g);
        AbstractC0768l abstractC0768l = (AbstractC0768l) c0647o.m2285c(AbstractC0768l.f4438f);
        boolean zBooleanValue = ((Boolean) c0647o.m2285c(f4445h)).booleanValue();
        C0646n<Boolean> c0646n = f4446i;
        try {
            C0761e c0761eM2453f = C0761e.m2453f(m2479c(interfaceC0775s, options, abstractC0768l, enumC0634b, enumC0648p, c0647o.m2285c(c0646n) != null && ((Boolean) c0647o.m2285c(c0646n)).booleanValue(), i, i2, zBooleanValue, bVar), this.f4451a);
            m2475j(options);
            synchronized (queue) {
                queue.offer(options);
            }
            return c0761eM2453f;
        } finally {
            m2475j(options);
            Queue<BitmapFactory.Options> queue2 = f4450m;
            synchronized (queue2) {
                queue2.offer(options);
                this.f4453c.mo2323d(bArr);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC0719w<Bitmap> m2478b(InputStream inputStream, int i, int i2, C0647o c0647o, b bVar) {
        return m2477a(new InterfaceC0775s.a(inputStream, this.f4454d, this.f4453c), i, i2, c0647o, bVar);
    }

    /* JADX WARN: Code duplicated, block: B:175:0x045d  */
    /* JADX WARN: Code duplicated, block: B:177:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:179:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:180:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:182:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:183:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:186:0x0506  */
    /* JADX WARN: Code duplicated, block: B:187:0x050a  */
    /* JADX WARN: Code duplicated, block: B:188:0x050e  */
    /* JADX WARN: Code duplicated, block: B:189:0x0512  */
    /* JADX WARN: Code duplicated, block: B:190:0x0516  */
    /* JADX WARN: Code duplicated, block: B:192:0x051f  */
    /* JADX WARN: Code duplicated, block: B:193:0x0523  */
    /* JADX WARN: Code duplicated, block: B:197:0x056c  */
    /* JADX WARN: Code duplicated, block: B:198:0x0572 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:202:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x017a  */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x043f, code lost:
    
        if (r11 >= 26) goto L171;
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap m2479c(p080c.p084b.p085a.p088m.p097w.p098c.InterfaceC0775s r33, android.graphics.BitmapFactory.Options r34, p080c.p084b.p085a.p088m.p097w.p098c.AbstractC0768l r35, p080c.p084b.p085a.p088m.EnumC0634b r36, p080c.p084b.p085a.p088m.EnumC0648p r37, boolean r38, int r39, int r40, boolean r41, p080c.p084b.p085a.p088m.p097w.p098c.C0769m.b r42) {
        /*
            Method dump skipped, instruction units count: 1466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p080c.p084b.p085a.p088m.p097w.p098c.C0769m.m2479c(c.b.a.m.w.c.s, android.graphics.BitmapFactory$Options, c.b.a.m.w.c.l, c.b.a.m.b, c.b.a.m.p, boolean, int, int, boolean, c.b.a.m.w.c.m$b):android.graphics.Bitmap");
    }
}
