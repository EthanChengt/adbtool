package b.s;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Property;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.CycleInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.load.ImageHeaderParser;
import com.didjdk.adbhelper.R;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.List;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p006b.p058n.p059a.p060a.C0492a;
import p006b.p058n.p059a.p060a.C0493b;
import p006b.p058n.p059a.p060a.C0494c;
import p006b.p068t.p069b.AbstractC0557t;
import p006b.p073w.C0581f;
import p006b.p074x.p075a.p076a.InterpolatorC0606e;
import c.a.a.a.a;
import p080c.p084b.p085a.ComponentCallbacks2C0616b;
import p080c.p084b.p085a.p088m.C0638f;
import p080c.p084b.p085a.p088m.C0641i;
import p080c.p084b.p085a.p088m.InterfaceC0643k;
import p080c.p084b.p085a.p088m.InterfaceC0644l;
import p080c.p084b.p085a.p088m.p091u.p092c0.InterfaceC0676b;
import p080c.p084b.p085a.p088m.p097w.p098c.C0779w;
import c.c.a.q3;
import c.c.a.v3.k0.C1054t;
import c.c.a.v3.k0.C1056v;
import c.c.a.y3.e;
import c.c.a.y3.g;
import c.c.a.y3.j;
import c.c.a.y3.f;

/* JADX INFO: renamed from: b.s.m */
/* JADX INFO: loaded from: classes.dex */
public final class m {
    /* JADX INFO: renamed from: A */
    public static boolean m1945A(int i, int i2) {
        return i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384;
    }

    /* JADX INFO: renamed from: B */
    public static Interpolator m1946B(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return AnimationUtils.loadInterpolator(context, i);
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                if (i == 17563663) {
                    return new C0492a();
                }
                if (i == 17563661) {
                    return new C0493b();
                }
                if (i == 17563662) {
                    return new C0494c();
                }
                XmlResourceParser animation = context.getResources().getAnimation(i);
                context.getResources();
                context.getTheme();
                Interpolator interpolatorM1965i = m1965i(context, animation);
                animation.close();
                return interpolatorM1965i;
            } catch (IOException e) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                notFoundException.initCause(e);
                throw notFoundException;
            } catch (XmlPullParserException e2) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                notFoundException2.initCause(e2);
                throw notFoundException2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: C */
    public static void m1947C(Context context) {
        File file = new File(context.getCacheDir(), "tmp");
        if (!file.isDirectory()) {
            file.delete();
        }
        if (file.exists()) {
            return;
        }
        file.mkdir();
    }

    /* JADX INFO: renamed from: D */
    public static <T> ObjectAnimator m1948D(T t, Property<T, PointF> property, Path path) {
        return Build.VERSION.SDK_INT >= 21 ? ObjectAnimator.ofObject(t, property, (TypeConverter) null, path) : ObjectAnimator.ofFloat(t, new C0581f(property, path), 0.0f, 1.0f);
    }

    /* JADX INFO: renamed from: E */
    public static void m1949E(C1054t c1054t, C1056v c1056v) {
        String str;
        g c1152g = new g(c1054t.m303h(), true);
        c1152g.m2708f(c1056v.f5254i);
        int i = c1056v.f5260o;
        c1152g.f5535e.setVisibility(0);
        ComponentCallbacks2C0616b.m2208e(c1152g.f5531a).m2235o(Integer.valueOf(i)).m2226x(c1152g.f5535e);
        c1152g.m2703a(c1054t.m337y(R.string.d2), c1056v.f5257l.replace("\\", ""));
        String strM337y = c1054t.m337y(R.string.hm);
        int i2 = c1056v.f5247b;
        if (i2 == 0) {
            str = "文件夹";
        } else if (i2 != 1) {
            str = i2 != 2 ? "未知" : "文件";
        } else {
            str = "链接";
        }
        c1152g.m2703a(strM337y, str);
        c1152g.m2703a(c1054t.m337y(R.string.f7), c1056v.f5248c);
        c1152g.m2703a(c1054t.m337y(R.string.ht), c1056v.f5249d);
        c1152g.m2703a(c1054t.m337y(R.string.hu), c1056v.f5250e);
        c1152g.m2703a(c1054t.m337y(R.string.gr), c1056v.f5247b == 0 ? null : c1056v.f5256k);
        c1152g.m2703a(c1054t.m337y(R.string.cz), c1056v.f5252g + " " + c1056v.f5253h);
        String strM337y2 = c1054t.m337y(R.string.eg);
        c1152g.f5537g.setVisibility(0);
        c1152g.f5537g.setText(strM337y2);
        c1152g.f5537g.setOnClickListener(new f(c1152g));
        c1152g.m2709g();
    }

    /* JADX INFO: renamed from: F */
    public static void m1950F(final C1054t c1054t, final int i, final String str) {
        final e c1150e = new e(c1054t.m303h());
        c1150e.m2701d(c1054t.m337y(R.string.fd));
        if (i == 2) {
            c1150e.f5523g.setText(str);
            c1150e.f5523g.setSelection(str.length());
        }
        c1150e.m2699b(c1054t.m337y(R.string.aq));
        c1150e.m2700c(c1054t.m337y(R.string.eg));
        c1150e.f5525i.setOnClickListener(new View.OnClickListener() { // from class: c.c.a.v3.k0.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                C1054t c1054t2 = c1054t;
                e c1150e2 = c1150e;
                String str2 = str;
                if (i2 == 0) {
                    q3 runnableC0964q3 = c1054t2.f5220m0;
                    StringBuilder sbM2191e = a.m2191e("mkdir ");
                    sbM2191e.append(c1054t2.f5211d0);
                    sbM2191e.append("/");
                    sbM2191e.append(C1056v.m2676a(c1150e2.m2698a()));
                    sbM2191e.append(";echo $?");
                    a.m2193g(sbM2191e, c1054t2.f5215h0, runnableC0964q3);
                }
                if (i2 == 1) {
                    q3 runnableC0964q4 = c1054t2.f5220m0;
                    StringBuilder sbM2191e2 = a.m2191e("touch ");
                    sbM2191e2.append(c1054t2.f5211d0);
                    sbM2191e2.append("/");
                    sbM2191e2.append(C1056v.m2676a(c1150e2.m2698a()));
                    sbM2191e2.append(";echo $?");
                    a.m2193g(sbM2191e2, c1054t2.f5215h0, runnableC0964q4);
                }
                if (i2 == 2) {
                    q3 runnableC0964q5 = c1054t2.f5220m0;
                    StringBuilder sbM2191e3 = a.m2191e("mv ");
                    a.m2194h(sbM2191e3, c1054t2.f5211d0, "/", str2, " ");
                    sbM2191e3.append(c1054t2.f5211d0);
                    sbM2191e3.append("/");
                    sbM2191e3.append(C1056v.m2676a(c1150e2.m2698a()));
                    sbM2191e3.append(";echo $?");
                    sbM2191e3.append(c1054t2.f5215h0);
                    runnableC0964q5.m2627c(sbM2191e3.toString());
                    c1054t2.m2673P0(false);
                }
                c1150e2.f5518b.dismiss();
            }
        });
        c1150e.m2702e();
    }

    /* JADX INFO: renamed from: G */
    public static void m1951G(C1054t c1054t, String str) {
        j c1155j = new j(c1054t.m303h());
        c1054t.f5201F0 = c1155j;
        c1155j.f5550b.setVisibility(0);
        c1155j.f5550b.setText(str);
        c1054t.f5201F0.m2715a(c1054t.m303h().getString(R.string.ft) + c1054t.f5197B0 + c1054t.m303h().getString(R.string.cu));
        c1054t.f5201F0.f5549a.show();
    }

    /* JADX INFO: renamed from: H */
    public static void m1952H(Context context, CharSequence charSequence) {
        Toast toast = new Toast(context);
        View viewInflate = View.inflate(context, R.layout.by, null);
        ((TextView) viewInflate.findViewById(R.id.qw)).setText(charSequence);
        toast.setView(viewInflate);
        toast.setDuration(0);
        toast.show();
    }

    /* JADX INFO: renamed from: I */
    public static String m1953I(byte[] bArr) {
        byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(bArr);
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArrDigest) {
            String upperCase = Integer.toHexString(b2 & 255).toUpperCase(Locale.US);
            if (upperCase.length() == 1) {
                sb.append("0");
            }
            sb.append(upperCase);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: J */
    public static native boolean J(Context context);

    /* JADX INFO: renamed from: K */
    public static native boolean K(String str, String str2);

    /* JADX INFO: renamed from: L */
    public static native String L(Context context);

    /* JADX INFO: renamed from: a */
    public static native byte[] a(int i, byte[] bArr);

    /* JADX INFO: renamed from: b */
    public static void m1958b(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m1959c(Context context) {
        m1967k(context.getCacheDir());
        if (Environment.getExternalStorageState().equals("mounted")) {
            m1967k(context.getExternalCacheDir());
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m1960d(RecyclerView.C0123a0 c0123a0, AbstractC0557t abstractC0557t, View view, View view2, RecyclerView.AbstractC0140o abstractC0140o, boolean z) {
        if (abstractC0140o.m619y() == 0 || c0123a0.m501b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(abstractC0140o.m589P(view) - abstractC0140o.m589P(view2)) + 1;
        }
        return Math.min(abstractC0557t.mo2054l(), abstractC0557t.mo2044b(view2) - abstractC0557t.mo2047e(view));
    }

    /* JADX INFO: renamed from: e */
    public static int m1961e(RecyclerView.C0123a0 c0123a0, AbstractC0557t abstractC0557t, View view, View view2, RecyclerView.AbstractC0140o abstractC0140o, boolean z, boolean z2) {
        if (abstractC0140o.m619y() == 0 || c0123a0.m501b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (c0123a0.m501b() - Math.max(abstractC0140o.m589P(view), abstractC0140o.m589P(view2))) - 1) : Math.max(0, Math.min(abstractC0140o.m589P(view), abstractC0140o.m589P(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(abstractC0557t.mo2044b(view2) - abstractC0557t.mo2047e(view)) / (Math.abs(abstractC0140o.m589P(view) - abstractC0140o.m589P(view2)) + 1))) + (abstractC0557t.mo2053k() - abstractC0557t.mo2047e(view)));
        }
        return iMax;
    }

    /* JADX INFO: renamed from: f */
    public static int m1962f(RecyclerView.C0123a0 c0123a0, AbstractC0557t abstractC0557t, View view, View view2, RecyclerView.AbstractC0140o abstractC0140o, boolean z) {
        if (abstractC0140o.m619y() == 0 || c0123a0.m501b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return c0123a0.m501b();
        }
        return (int) (((abstractC0557t.mo2044b(view2) - abstractC0557t.mo2047e(view)) / (Math.abs(abstractC0140o.m589P(view) - abstractC0140o.m589P(view2)) + 1)) * c0123a0.m501b());
    }

    /* JADX INFO: renamed from: g */
    public static boolean m1963g(Context context, boolean z, String str, String str2) {
        try {
            String[] list = context.getAssets().list(str);
            if (list.length > 0) {
                File file = new File(context.getFilesDir().getAbsolutePath(), str2);
                if (!file.exists()) {
                    file.mkdirs();
                }
                for (String str3 : list) {
                    if (str.equals("")) {
                        m1963g(context, z, str3, str2 + File.separator + str3);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        String str4 = File.separator;
                        sb.append(str4);
                        sb.append(str3);
                        m1963g(context, z, sb.toString(), str2 + str4 + str3);
                    }
                }
                return true;
            }
            File file2 = new File(context.getFilesDir().getAbsolutePath(), str2);
            if (file2.exists() && !z) {
                return true;
            }
            InputStream inputStreamOpen = context.getAssets().open(str);
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            byte[] bArr = new byte[1024];
            while (true) {
                int i = inputStreamOpen.read(bArr);
                if (i == -1) {
                    fileOutputStream.flush();
                    inputStreamOpen.close();
                    fileOutputStream.close();
                    return true;
                }
                fileOutputStream.write(bArr, 0, i);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: h */
    public static native boolean h(Context context, boolean z, int i, String str);

    /* JADX INFO: renamed from: i */
    public static Interpolator m1965i(Context context, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        Interpolator accelerateInterpolator;
        int depth = xmlPullParser.getDepth();
        Interpolator linearInterpolator = null;
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                break;
            }
            if (next == 2) {
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
                String name = xmlPullParser.getName();
                if (name.equals("linearInterpolator")) {
                    linearInterpolator = new LinearInterpolator();
                } else {
                    if (name.equals("accelerateInterpolator")) {
                        accelerateInterpolator = new AccelerateInterpolator(context, attributeSetAsAttributeSet);
                    } else if (name.equals("decelerateInterpolator")) {
                        accelerateInterpolator = new DecelerateInterpolator(context, attributeSetAsAttributeSet);
                    } else if (name.equals("accelerateDecelerateInterpolator")) {
                        linearInterpolator = new AccelerateDecelerateInterpolator();
                    } else if (name.equals("cycleInterpolator")) {
                        accelerateInterpolator = new CycleInterpolator(context, attributeSetAsAttributeSet);
                    } else if (name.equals("anticipateInterpolator")) {
                        accelerateInterpolator = new AnticipateInterpolator(context, attributeSetAsAttributeSet);
                    } else if (name.equals("overshootInterpolator")) {
                        accelerateInterpolator = new OvershootInterpolator(context, attributeSetAsAttributeSet);
                    } else if (name.equals("anticipateOvershootInterpolator")) {
                        accelerateInterpolator = new AnticipateOvershootInterpolator(context, attributeSetAsAttributeSet);
                    } else if (name.equals("bounceInterpolator")) {
                        linearInterpolator = new BounceInterpolator();
                    } else {
                        if (!name.equals("pathInterpolator")) {
                            StringBuilder sbM2191e = a.m2191e("Unknown interpolator name: ");
                            sbM2191e.append(xmlPullParser.getName());
                            throw new RuntimeException(sbM2191e.toString());
                        }
                        accelerateInterpolator = new InterpolatorC0606e(context, attributeSetAsAttributeSet, xmlPullParser);
                    }
                    linearInterpolator = accelerateInterpolator;
                }
            }
        }
        return linearInterpolator;
    }

    /* JADX INFO: renamed from: j */
    public static String m1966j(String str) {
        return new String(a(2, Base64.decode(str, 9)), StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m1967k(File file) {
        String[] list;
        if (file != null && file.isDirectory() && (list = file.list()) != null) {
            for (String str : list) {
                if (!m1967k(new File(file, str))) {
                    return false;
                }
            }
        }
        if (file == null) {
            return true;
        }
        return file.delete();
    }

    /* JADX INFO: renamed from: l */
    public static String m1968l(String str, int i) {
        try {
            String str2 = str.split("\\s+")[i];
            if (str2.contains("G")) {
                return str2.replace("G", " GB");
            }
            if (str2.contains("M")) {
                return str2.replace("M", " MB");
            }
            if (str2.contains("K")) {
                return str2.replace("K", " KB");
            }
            float f = Integer.parseInt(str.split("\\s+")[i]) / 1024.0f;
            if (f >= 1024.0f) {
                return String.format("%.2f", Float.valueOf(f / 1024.0f)) + " GB";
            }
            return String.format("%.0f", Float.valueOf(f)) + " MB";
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public static String m1969m(String str) {
        return Base64.encodeToString(a(1, str.getBytes(StandardCharsets.UTF_8)), 11);
    }

    /* JADX INFO: renamed from: n */
    public static long m1970n(File file) {
        long jM1970n = 0;
        try {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                int length = fileArrListFiles.length;
                for (int i = 0; i < length; i++) {
                    jM1970n += fileArrListFiles[i].isDirectory() ? m1970n(fileArrListFiles[i]) : fileArrListFiles[i].length();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jM1970n;
    }

    /* JADX INFO: renamed from: o */
    public static String m1971o(String str) {
        return str != null ? str : "未知";
    }

    /* JADX INFO: renamed from: p */
    public static String m1972p(String str, String str2) {
        return str != null ? str : str2;
    }

    /* JADX INFO: renamed from: q */
    public static int m1973q(List<ImageHeaderParser> list, InputStream inputStream, InterfaceC0676b interfaceC0676b) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C0779w(inputStream, interfaceC0676b);
        }
        inputStream.mark(5242880);
        return m1974r(list, new C0641i(inputStream, interfaceC0676b));
    }

    /* JADX INFO: renamed from: r */
    public static int m1974r(List<ImageHeaderParser> list, InterfaceC0643k interfaceC0643k) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int iMo2281a = interfaceC0643k.mo2281a(list.get(i));
            if (iMo2281a != -1) {
                return iMo2281a;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: s */
    public static native void s(String str);

    /* JADX INFO: renamed from: t */
    public static String m1976t(File file) {
        StringBuilder sb = new StringBuilder();
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, StandardCharsets.UTF_8));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
                sb.append("\n");
            }
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString().trim();
    }

    /* JADX INFO: renamed from: u */
    public static String m1977u(Context context) {
        StringBuilder sb;
        String str;
        StringBuilder sb2;
        String str2;
        long jM1970n = m1970n(context.getCacheDir());
        if (Environment.getExternalStorageState().equals("mounted")) {
            jM1970n += m1970n(context.getExternalCacheDir());
        }
        double d = jM1970n;
        Double.isNaN(d);
        Double.isNaN(d);
        double d2 = d / 1024.0d;
        if (d2 < 1.0d) {
            return "缓存为空";
        }
        double d3 = d2 / 1024.0d;
        if (d3 >= 1.0d) {
            double d4 = d3 / 1024.0d;
            if (d4 < 1.0d) {
                BigDecimal bigDecimal = new BigDecimal(Double.toString(d3));
                sb = new StringBuilder();
                sb.append(bigDecimal.setScale(2, 4).toPlainString());
                str = " MB";
            } else {
                double d5 = d4 / 1024.0d;
                if (d5 < 1.0d) {
                    BigDecimal bigDecimal2 = new BigDecimal(Double.toString(d4));
                    sb2 = new StringBuilder();
                    sb2.append(bigDecimal2.setScale(2, 4).toPlainString());
                    str2 = " GB";
                } else {
                    BigDecimal bigDecimal3 = new BigDecimal(d5);
                    sb = new StringBuilder();
                    sb.append(bigDecimal3.setScale(2, 4).toPlainString());
                    str = "TB";
                }
            }
            sb.append(str);
            return sb.toString();
        }
        BigDecimal bigDecimal4 = new BigDecimal(Double.toString(d2));
        sb2 = new StringBuilder();
        sb2.append(bigDecimal4.setScale(2, 4).toPlainString());
        str2 = " KB";
        sb2.append(str2);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: v */
    public static ImageHeaderParser.ImageType m1978v(List<ImageHeaderParser> list, InputStream inputStream, InterfaceC0676b interfaceC0676b) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C0779w(inputStream, interfaceC0676b);
        }
        inputStream.mark(5242880);
        return m1979w(list, new C0638f(inputStream));
    }

    /* JADX INFO: renamed from: w */
    public static ImageHeaderParser.ImageType m1979w(List<ImageHeaderParser> list, InterfaceC0644l interfaceC0644l) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser.ImageType imageTypeMo2280a = interfaceC0644l.mo2280a(list.get(i));
            if (imageTypeMo2280a != ImageHeaderParser.ImageType.UNKNOWN) {
                return imageTypeMo2280a;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    /* JADX INFO: renamed from: x */
    public static native String x(Context context);

    /* JADX INFO: renamed from: y */
    public static String m1981y(int i, int i2) {
        return String.valueOf(i).replace("1", "A") + String.valueOf(i2).replace("3", "B").replace("4", "F");
    }

    /* JADX INFO: renamed from: z */
    public static boolean m1982z(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }
}
