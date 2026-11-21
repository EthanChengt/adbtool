package p080c.p084b.p085a.p088m.p091u.p092c0;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import c.a.a.a.a;
import p080c.p084b.p085a.p111s.C0875j;

/* JADX INFO: renamed from: c.b.a.m.u.c0.m */
/* JADX INFO: loaded from: classes.dex */
public class C0687m implements InterfaceC0685k {

    /* JADX INFO: renamed from: d */
    public static final Bitmap.Config[] f4030d;

    /* JADX INFO: renamed from: e */
    public static final Bitmap.Config[] f4031e;

    /* JADX INFO: renamed from: f */
    public static final Bitmap.Config[] f4032f;

    /* JADX INFO: renamed from: g */
    public static final Bitmap.Config[] f4033g;

    /* JADX INFO: renamed from: h */
    public static final Bitmap.Config[] f4034h;

    /* JADX INFO: renamed from: a */
    public final c f4035a = new c();

    /* JADX INFO: renamed from: b */
    public final C0681g<b, Bitmap> f4036b = new C0681g<>();

    /* JADX INFO: renamed from: c */
    public final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f4037c = new HashMap();

    /* JADX INFO: renamed from: c.b.a.m.u.c0.m$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f4038a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f4038a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4038a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4038a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4038a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: c.b.a.m.u.c0.m$b */
    public static final class b implements InterfaceC0686l {

        /* JADX INFO: renamed from: a */
        public final c f4039a;

        /* JADX INFO: renamed from: b */
        public int f4040b;

        /* JADX INFO: renamed from: c */
        public Bitmap.Config f4041c;

        public b(c cVar) {
            this.f4039a = cVar;
        }

        @Override // p080c.p084b.p085a.p088m.p091u.p092c0.InterfaceC0686l
        /* JADX INFO: renamed from: a */
        public void mo2342a() {
            this.f4039a.m2327c(this);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f4040b == bVar.f4040b && C0875j.m2610b(this.f4041c, bVar.f4041c);
        }

        public int hashCode() {
            int i = this.f4040b * 31;
            Bitmap.Config config = this.f4041c;
            return i + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return C0687m.m2348c(this.f4040b, this.f4041c);
        }
    }

    /* JADX INFO: renamed from: c.b.a.m.u.c0.m$c */
    public static class c extends AbstractC0677c<b> {
        @Override // p080c.p084b.p085a.p088m.p091u.p092c0.AbstractC0677c
        /* JADX INFO: renamed from: a */
        public InterfaceC0686l mo2325a() {
            return new b(this);
        }

        /* JADX INFO: renamed from: d */
        public b m2354d(int i, Bitmap.Config config) {
            b bVarM2326b = m2326b();
            bVarM2326b.f4040b = i;
            bVarM2326b.f4041c = config;
            return bVarM2326b;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f4030d = configArr;
        f4031e = configArr;
        f4032f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f4033g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f4034h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    /* JADX INFO: renamed from: c */
    public static String m2348c(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    /* JADX INFO: renamed from: a */
    public final void m2349a(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> navigableMapM2351d = m2351d(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapM2351d.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapM2351d.remove(num);
                return;
            } else {
                navigableMapM2351d.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + m2352e(bitmap) + ", this: " + this);
    }

    /* JADX INFO: renamed from: b */
    public Bitmap m2350b(int i, int i2, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int iM2611c = C0875j.m2611c(i, i2, config);
        b bVarM2326b = this.f4035a.m2326b();
        bVarM2326b.f4040b = iM2611c;
        bVarM2326b.f4041c = config;
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(config)) {
            int i3 = a.f4038a[config.ordinal()];
            if (i3 == 1) {
                configArr = f4030d;
            } else if (i3 == 2) {
                configArr = f4032f;
            } else if (i3 != 3) {
                configArr = i3 != 4 ? new Bitmap.Config[]{config} : f4034h;
            } else {
                configArr = f4033g;
            }
        } else {
            configArr = f4031e;
        }
        for (Bitmap.Config config2 : configArr) {
            Integer numCeilingKey = m2351d(config2).ceilingKey(Integer.valueOf(iM2611c));
            if (numCeilingKey != null && numCeilingKey.intValue() <= iM2611c * 8) {
                if (numCeilingKey.intValue() == iM2611c && (config2 != null ? config2.equals(config) : config == null)) {
                    break;
                    break;
                }
                this.f4035a.m2327c(bVarM2326b);
                bVarM2326b = this.f4035a.m2354d(numCeilingKey.intValue(), config2);
                break;
            }
        }
        Bitmap bitmapM2333a = this.f4036b.m2333a(bVarM2326b);
        if (bitmapM2333a != null) {
            m2349a(Integer.valueOf(bVarM2326b.f4040b), bitmapM2333a);
            bitmapM2333a.reconfigure(i, i2, config);
        }
        return bitmapM2333a;
    }

    /* JADX INFO: renamed from: d */
    public final NavigableMap<Integer, Integer> m2351d(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f4037c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f4037c.put(config, treeMap);
        return treeMap;
    }

    /* JADX INFO: renamed from: e */
    public String m2352e(Bitmap bitmap) {
        return m2348c(C0875j.m2612d(bitmap), bitmap.getConfig());
    }

    /* JADX INFO: renamed from: f */
    public void m2353f(Bitmap bitmap) {
        b bVarM2354d = this.f4035a.m2354d(C0875j.m2612d(bitmap), bitmap.getConfig());
        this.f4036b.m2334b(bVarM2354d, bitmap);
        NavigableMap<Integer, Integer> navigableMapM2351d = m2351d(bitmap.getConfig());
        Integer num = (Integer) navigableMapM2351d.get(Integer.valueOf(bVarM2354d.f4040b));
        navigableMapM2351d.put(Integer.valueOf(bVarM2354d.f4040b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public String toString() {
        StringBuilder sbM2191e = a.m2191e("SizeConfigStrategy{groupedMap=");
        sbM2191e.append(this.f4036b);
        sbM2191e.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.f4037c.entrySet()) {
            sbM2191e.append(entry.getKey());
            sbM2191e.append('[');
            sbM2191e.append(entry.getValue());
            sbM2191e.append("], ");
        }
        if (!this.f4037c.isEmpty()) {
            sbM2191e.replace(sbM2191e.length() - 2, sbM2191e.length(), "");
        }
        sbM2191e.append(")}");
        return sbM2191e.toString();
    }
}
