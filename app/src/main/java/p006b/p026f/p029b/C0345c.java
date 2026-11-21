package p006b.p026f.p029b;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: b.f.b.c */
/* JADX INFO: loaded from: classes.dex */
public class C0345c {

    /* JADX INFO: renamed from: b */
    public static final int[] f2428b = {0, 4, 8};

    /* JADX INFO: renamed from: c */
    public static SparseIntArray f2429c;

    /* JADX INFO: renamed from: a */
    public HashMap<Integer, a> f2430a = new HashMap<>();

    /* JADX INFO: renamed from: b.f.b.c$a */
    public static class a {

        /* JADX INFO: renamed from: b */
        public int f2459b;

        /* JADX INFO: renamed from: c */
        public int f2461c;

        /* JADX INFO: renamed from: d */
        public int f2463d;

        /* JADX INFO: renamed from: u0 */
        public int[] f2498u0;

        /* JADX INFO: renamed from: v0 */
        public String f2500v0;

        /* JADX INFO: renamed from: a */
        public boolean f2457a = false;

        /* JADX INFO: renamed from: e */
        public int f2465e = -1;

        /* JADX INFO: renamed from: f */
        public int f2467f = -1;

        /* JADX INFO: renamed from: g */
        public float f2469g = -1.0f;

        /* JADX INFO: renamed from: h */
        public int f2471h = -1;

        /* JADX INFO: renamed from: i */
        public int f2473i = -1;

        /* JADX INFO: renamed from: j */
        public int f2475j = -1;

        /* JADX INFO: renamed from: k */
        public int f2477k = -1;

        /* JADX INFO: renamed from: l */
        public int f2479l = -1;

        /* JADX INFO: renamed from: m */
        public int f2481m = -1;

        /* JADX INFO: renamed from: n */
        public int f2483n = -1;

        /* JADX INFO: renamed from: o */
        public int f2485o = -1;

        /* JADX INFO: renamed from: p */
        public int f2487p = -1;

        /* JADX INFO: renamed from: q */
        public int f2489q = -1;

        /* JADX INFO: renamed from: r */
        public int f2491r = -1;

        /* JADX INFO: renamed from: s */
        public int f2493s = -1;

        /* JADX INFO: renamed from: t */
        public int f2495t = -1;

        /* JADX INFO: renamed from: u */
        public float f2497u = 0.5f;

        /* JADX INFO: renamed from: v */
        public float f2499v = 0.5f;

        /* JADX INFO: renamed from: w */
        public String f2501w = null;

        /* JADX INFO: renamed from: x */
        public int f2502x = -1;

        /* JADX INFO: renamed from: y */
        public int f2503y = 0;

        /* JADX INFO: renamed from: z */
        public float f2504z = 0.0f;

        /* JADX INFO: renamed from: A */
        public int f2431A = -1;

        /* JADX INFO: renamed from: B */
        public int f2432B = -1;

        /* JADX INFO: renamed from: C */
        public int f2433C = -1;

        /* JADX INFO: renamed from: D */
        public int f2434D = -1;

        /* JADX INFO: renamed from: E */
        public int f2435E = -1;

        /* JADX INFO: renamed from: F */
        public int f2436F = -1;

        /* JADX INFO: renamed from: G */
        public int f2437G = -1;

        /* JADX INFO: renamed from: H */
        public int f2438H = -1;

        /* JADX INFO: renamed from: I */
        public int f2439I = -1;

        /* JADX INFO: renamed from: J */
        public int f2440J = 0;

        /* JADX INFO: renamed from: K */
        public int f2441K = -1;

        /* JADX INFO: renamed from: L */
        public int f2442L = -1;

        /* JADX INFO: renamed from: M */
        public int f2443M = -1;

        /* JADX INFO: renamed from: N */
        public int f2444N = -1;

        /* JADX INFO: renamed from: O */
        public int f2445O = -1;

        /* JADX INFO: renamed from: P */
        public int f2446P = -1;

        /* JADX INFO: renamed from: Q */
        public float f2447Q = 0.0f;

        /* JADX INFO: renamed from: R */
        public float f2448R = 0.0f;

        /* JADX INFO: renamed from: S */
        public int f2449S = 0;

        /* JADX INFO: renamed from: T */
        public int f2450T = 0;

        /* JADX INFO: renamed from: U */
        public float f2451U = 1.0f;

        /* JADX INFO: renamed from: V */
        public boolean f2452V = false;

        /* JADX INFO: renamed from: W */
        public float f2453W = 0.0f;

        /* JADX INFO: renamed from: X */
        public float f2454X = 0.0f;

        /* JADX INFO: renamed from: Y */
        public float f2455Y = 0.0f;

        /* JADX INFO: renamed from: Z */
        public float f2456Z = 0.0f;

        /* JADX INFO: renamed from: a0 */
        public float f2458a0 = 1.0f;

        /* JADX INFO: renamed from: b0 */
        public float f2460b0 = 1.0f;

        /* JADX INFO: renamed from: c0 */
        public float f2462c0 = Float.NaN;

        /* JADX INFO: renamed from: d0 */
        public float f2464d0 = Float.NaN;

        /* JADX INFO: renamed from: e0 */
        public float f2466e0 = 0.0f;

        /* JADX INFO: renamed from: f0 */
        public float f2468f0 = 0.0f;

        /* JADX INFO: renamed from: g0 */
        public float f2470g0 = 0.0f;

        /* JADX INFO: renamed from: h0 */
        public boolean f2472h0 = false;

        /* JADX INFO: renamed from: i0 */
        public boolean f2474i0 = false;

        /* JADX INFO: renamed from: j0 */
        public int f2476j0 = 0;

        /* JADX INFO: renamed from: k0 */
        public int f2478k0 = 0;

        /* JADX INFO: renamed from: l0 */
        public int f2480l0 = -1;

        /* JADX INFO: renamed from: m0 */
        public int f2482m0 = -1;

        /* JADX INFO: renamed from: n0 */
        public int f2484n0 = -1;

        /* JADX INFO: renamed from: o0 */
        public int f2486o0 = -1;

        /* JADX INFO: renamed from: p0 */
        public float f2488p0 = 1.0f;

        /* JADX INFO: renamed from: q0 */
        public float f2490q0 = 1.0f;

        /* JADX INFO: renamed from: r0 */
        public boolean f2492r0 = false;

        /* JADX INFO: renamed from: s0 */
        public int f2494s0 = -1;

        /* JADX INFO: renamed from: t0 */
        public int f2496t0 = -1;

        /* JADX INFO: renamed from: a */
        public void m1400a(ConstraintLayout.C0065a c0065a) {
            c0065a.f483d = this.f2471h;
            c0065a.f485e = this.f2473i;
            c0065a.f487f = this.f2475j;
            c0065a.f489g = this.f2477k;
            c0065a.f491h = this.f2479l;
            c0065a.f493i = this.f2481m;
            c0065a.f495j = this.f2483n;
            c0065a.f497k = this.f2485o;
            c0065a.f499l = this.f2487p;
            c0065a.f503p = this.f2489q;
            c0065a.f504q = this.f2491r;
            c0065a.f505r = this.f2493s;
            c0065a.f506s = this.f2495t;
            ((ViewGroup.MarginLayoutParams) c0065a).leftMargin = this.f2434D;
            ((ViewGroup.MarginLayoutParams) c0065a).rightMargin = this.f2435E;
            ((ViewGroup.MarginLayoutParams) c0065a).topMargin = this.f2436F;
            ((ViewGroup.MarginLayoutParams) c0065a).bottomMargin = this.f2437G;
            c0065a.f511x = this.f2446P;
            c0065a.f512y = this.f2445O;
            c0065a.f513z = this.f2497u;
            c0065a.f451A = this.f2499v;
            c0065a.f500m = this.f2502x;
            c0065a.f501n = this.f2503y;
            c0065a.f502o = this.f2504z;
            c0065a.f452B = this.f2501w;
            c0065a.f466P = this.f2431A;
            c0065a.f467Q = this.f2432B;
            c0065a.f455E = this.f2447Q;
            c0065a.f454D = this.f2448R;
            c0065a.f457G = this.f2450T;
            c0065a.f456F = this.f2449S;
            c0065a.f469S = this.f2472h0;
            c0065a.f470T = this.f2474i0;
            c0065a.f458H = this.f2476j0;
            c0065a.f459I = this.f2478k0;
            c0065a.f462L = this.f2480l0;
            c0065a.f463M = this.f2482m0;
            c0065a.f460J = this.f2484n0;
            c0065a.f461K = this.f2486o0;
            c0065a.f464N = this.f2488p0;
            c0065a.f465O = this.f2490q0;
            c0065a.f468R = this.f2433C;
            c0065a.f481c = this.f2469g;
            c0065a.f477a = this.f2465e;
            c0065a.f479b = this.f2467f;
            ((ViewGroup.MarginLayoutParams) c0065a).width = this.f2459b;
            ((ViewGroup.MarginLayoutParams) c0065a).height = this.f2461c;
            c0065a.setMarginStart(this.f2439I);
            c0065a.setMarginEnd(this.f2438H);
            c0065a.m141a();
        }

        /* JADX INFO: renamed from: b */
        public final void m1401b(int i, C0346d.a aVar) {
            this.f2463d = i;
            this.f2471h = aVar.f483d;
            this.f2473i = aVar.f485e;
            this.f2475j = aVar.f487f;
            this.f2477k = aVar.f489g;
            this.f2479l = aVar.f491h;
            this.f2481m = aVar.f493i;
            this.f2483n = aVar.f495j;
            this.f2485o = aVar.f497k;
            this.f2487p = aVar.f499l;
            this.f2489q = aVar.f503p;
            this.f2491r = aVar.f504q;
            this.f2493s = aVar.f505r;
            this.f2495t = aVar.f506s;
            this.f2497u = aVar.f513z;
            this.f2499v = aVar.f451A;
            this.f2501w = aVar.f452B;
            this.f2502x = aVar.f500m;
            this.f2503y = aVar.f501n;
            this.f2504z = aVar.f502o;
            this.f2431A = aVar.f466P;
            this.f2432B = aVar.f467Q;
            this.f2433C = aVar.f468R;
            this.f2469g = aVar.f481c;
            this.f2465e = aVar.f477a;
            this.f2467f = aVar.f479b;
            this.f2459b = ((ViewGroup.MarginLayoutParams) aVar).width;
            this.f2461c = ((ViewGroup.MarginLayoutParams) aVar).height;
            this.f2434D = ((ViewGroup.MarginLayoutParams) aVar).leftMargin;
            this.f2435E = ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
            this.f2436F = ((ViewGroup.MarginLayoutParams) aVar).topMargin;
            this.f2437G = ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
            this.f2447Q = aVar.f455E;
            this.f2448R = aVar.f454D;
            this.f2450T = aVar.f457G;
            this.f2449S = aVar.f456F;
            boolean z = aVar.f469S;
            this.f2472h0 = z;
            this.f2474i0 = aVar.f470T;
            this.f2476j0 = aVar.f458H;
            this.f2478k0 = aVar.f459I;
            this.f2472h0 = z;
            this.f2480l0 = aVar.f462L;
            this.f2482m0 = aVar.f463M;
            this.f2484n0 = aVar.f460J;
            this.f2486o0 = aVar.f461K;
            this.f2488p0 = aVar.f464N;
            this.f2490q0 = aVar.f465O;
            this.f2438H = aVar.getMarginEnd();
            this.f2439I = aVar.getMarginStart();
            this.f2451U = aVar.f2506l0;
            this.f2454X = aVar.f2509o0;
            this.f2455Y = aVar.f2510p0;
            this.f2456Z = aVar.f2511q0;
            this.f2458a0 = aVar.f2512r0;
            this.f2460b0 = aVar.f2513s0;
            this.f2462c0 = aVar.f2514t0;
            this.f2464d0 = aVar.f2515u0;
            this.f2466e0 = aVar.f2516v0;
            this.f2468f0 = aVar.f2517w0;
            this.f2470g0 = 0.0f;
            this.f2453W = aVar.f2508n0;
            this.f2452V = aVar.f2507m0;
        }

        public Object clone() {
            a aVar = new a();
            aVar.f2457a = this.f2457a;
            aVar.f2459b = this.f2459b;
            aVar.f2461c = this.f2461c;
            aVar.f2465e = this.f2465e;
            aVar.f2467f = this.f2467f;
            aVar.f2469g = this.f2469g;
            aVar.f2471h = this.f2471h;
            aVar.f2473i = this.f2473i;
            aVar.f2475j = this.f2475j;
            aVar.f2477k = this.f2477k;
            aVar.f2479l = this.f2479l;
            aVar.f2481m = this.f2481m;
            aVar.f2483n = this.f2483n;
            aVar.f2485o = this.f2485o;
            aVar.f2487p = this.f2487p;
            aVar.f2489q = this.f2489q;
            aVar.f2491r = this.f2491r;
            aVar.f2493s = this.f2493s;
            aVar.f2495t = this.f2495t;
            aVar.f2497u = this.f2497u;
            aVar.f2499v = this.f2499v;
            aVar.f2501w = this.f2501w;
            aVar.f2431A = this.f2431A;
            aVar.f2432B = this.f2432B;
            aVar.f2497u = this.f2497u;
            aVar.f2497u = this.f2497u;
            aVar.f2497u = this.f2497u;
            aVar.f2497u = this.f2497u;
            aVar.f2497u = this.f2497u;
            aVar.f2433C = this.f2433C;
            aVar.f2434D = this.f2434D;
            aVar.f2435E = this.f2435E;
            aVar.f2436F = this.f2436F;
            aVar.f2437G = this.f2437G;
            aVar.f2438H = this.f2438H;
            aVar.f2439I = this.f2439I;
            aVar.f2440J = this.f2440J;
            aVar.f2441K = this.f2441K;
            aVar.f2442L = this.f2442L;
            aVar.f2443M = this.f2443M;
            aVar.f2444N = this.f2444N;
            aVar.f2445O = this.f2445O;
            aVar.f2446P = this.f2446P;
            aVar.f2447Q = this.f2447Q;
            aVar.f2448R = this.f2448R;
            aVar.f2449S = this.f2449S;
            aVar.f2450T = this.f2450T;
            aVar.f2451U = this.f2451U;
            aVar.f2452V = this.f2452V;
            aVar.f2453W = this.f2453W;
            aVar.f2454X = this.f2454X;
            aVar.f2455Y = this.f2455Y;
            aVar.f2456Z = this.f2456Z;
            aVar.f2458a0 = this.f2458a0;
            aVar.f2460b0 = this.f2460b0;
            aVar.f2462c0 = this.f2462c0;
            aVar.f2464d0 = this.f2464d0;
            aVar.f2466e0 = this.f2466e0;
            aVar.f2468f0 = this.f2468f0;
            aVar.f2470g0 = this.f2470g0;
            aVar.f2472h0 = this.f2472h0;
            aVar.f2474i0 = this.f2474i0;
            aVar.f2476j0 = this.f2476j0;
            aVar.f2478k0 = this.f2478k0;
            aVar.f2480l0 = this.f2480l0;
            aVar.f2482m0 = this.f2482m0;
            aVar.f2484n0 = this.f2484n0;
            aVar.f2486o0 = this.f2486o0;
            aVar.f2488p0 = this.f2488p0;
            aVar.f2490q0 = this.f2490q0;
            aVar.f2494s0 = this.f2494s0;
            aVar.f2496t0 = this.f2496t0;
            int[] iArr = this.f2498u0;
            if (iArr != null) {
                aVar.f2498u0 = Arrays.copyOf(iArr, iArr.length);
            }
            aVar.f2502x = this.f2502x;
            aVar.f2503y = this.f2503y;
            aVar.f2504z = this.f2504z;
            aVar.f2492r0 = this.f2492r0;
            return aVar;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2429c = sparseIntArray;
        sparseIntArray.append(55, 25);
        f2429c.append(56, 26);
        f2429c.append(58, 29);
        f2429c.append(59, 30);
        f2429c.append(64, 36);
        f2429c.append(63, 35);
        f2429c.append(37, 4);
        f2429c.append(36, 3);
        f2429c.append(34, 1);
        f2429c.append(72, 6);
        f2429c.append(73, 7);
        f2429c.append(44, 17);
        f2429c.append(45, 18);
        f2429c.append(46, 19);
        f2429c.append(0, 27);
        f2429c.append(60, 32);
        f2429c.append(61, 33);
        f2429c.append(43, 10);
        f2429c.append(42, 9);
        f2429c.append(76, 13);
        f2429c.append(79, 16);
        f2429c.append(77, 14);
        f2429c.append(74, 11);
        f2429c.append(78, 15);
        f2429c.append(75, 12);
        f2429c.append(67, 40);
        f2429c.append(53, 39);
        f2429c.append(52, 41);
        f2429c.append(66, 42);
        f2429c.append(51, 20);
        f2429c.append(65, 37);
        f2429c.append(41, 5);
        f2429c.append(54, 75);
        f2429c.append(62, 75);
        f2429c.append(57, 75);
        f2429c.append(35, 75);
        f2429c.append(33, 75);
        f2429c.append(5, 24);
        f2429c.append(7, 28);
        f2429c.append(23, 31);
        f2429c.append(24, 8);
        f2429c.append(6, 34);
        f2429c.append(8, 2);
        f2429c.append(3, 23);
        f2429c.append(4, 21);
        f2429c.append(2, 22);
        f2429c.append(13, 43);
        f2429c.append(26, 44);
        f2429c.append(21, 45);
        f2429c.append(22, 46);
        f2429c.append(20, 60);
        f2429c.append(18, 47);
        f2429c.append(19, 48);
        f2429c.append(14, 49);
        f2429c.append(15, 50);
        f2429c.append(16, 51);
        f2429c.append(17, 52);
        f2429c.append(25, 53);
        f2429c.append(68, 54);
        f2429c.append(47, 55);
        f2429c.append(69, 56);
        f2429c.append(48, 57);
        f2429c.append(70, 58);
        f2429c.append(49, 59);
        f2429c.append(38, 61);
        f2429c.append(40, 62);
        f2429c.append(39, 63);
        f2429c.append(1, 38);
        f2429c.append(71, 69);
        f2429c.append(50, 70);
        f2429c.append(29, 71);
        f2429c.append(28, 72);
        f2429c.append(30, 73);
        f2429c.append(27, 74);
    }

    /* JADX INFO: renamed from: a */
    public final int[] m1397a(View view, String str) {
        int iIntValue;
        Object objM134b;
        String[] strArrSplit = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            try {
                iIntValue = C0349g.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (objM134b = ((ConstraintLayout) view.getParent()).m134b(0, strTrim)) != null && (objM134b instanceof Integer)) {
                iIntValue = ((Integer) objM134b).intValue();
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    /* JADX INFO: renamed from: b */
    public final a m1398b(Context context, AttributeSet attributeSet) {
        StringBuilder sb;
        String str;
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0350h.f2522b);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            int i2 = f2429c.get(index);
            switch (i2) {
                case 1:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, aVar.f2487p);
                    if (resourceId == -1) {
                        resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.f2487p = resourceId;
                    break;
                case RecyclerView.SCROLL_STATE_SETTLING /* 2 */:
                    aVar.f2437G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, aVar.f2437G);
                    break;
                case 3:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, aVar.f2485o);
                    if (resourceId2 == -1) {
                        resourceId2 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.f2485o = resourceId2;
                    break;
                case 4:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, aVar.f2483n);
                    if (resourceId3 == -1) {
                        resourceId3 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.f2483n = resourceId3;
                    break;
                case 5:
                    aVar.f2501w = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 6:
                    aVar.f2431A = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, aVar.f2431A);
                    break;
                case 7:
                    aVar.f2432B = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, aVar.f2432B);
                    break;
                case 8:
                    aVar.f2438H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, aVar.f2438H);
                    break;
                case 9:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, aVar.f2495t);
                    if (resourceId4 == -1) {
                        resourceId4 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.f2495t = resourceId4;
                    break;
                case 10:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, aVar.f2493s);
                    if (resourceId5 == -1) {
                        resourceId5 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.f2493s = resourceId5;
                    break;
                case 11:
                    aVar.f2444N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, aVar.f2444N);
                    break;
                case 12:
                    aVar.f2445O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, aVar.f2445O);
                    break;
                case 13:
                    aVar.f2441K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, aVar.f2441K);
                    break;
                case 14:
                    aVar.f2443M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, aVar.f2443M);
                    break;
                case 15:
                    aVar.f2446P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, aVar.f2446P);
                    break;
                case 16:
                    aVar.f2442L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, aVar.f2442L);
                    break;
                case 17:
                    aVar.f2465e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, aVar.f2465e);
                    break;
                case 18:
                    aVar.f2467f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, aVar.f2467f);
                    break;
                case 19:
                    aVar.f2469g = typedArrayObtainStyledAttributes.getFloat(index, aVar.f2469g);
                    break;
                case 20:
                    aVar.f2497u = typedArrayObtainStyledAttributes.getFloat(index, aVar.f2497u);
                    break;
                case 21:
                    aVar.f2461c = typedArrayObtainStyledAttributes.getLayoutDimension(index, aVar.f2461c);
                    break;
                case 22:
                    int i3 = typedArrayObtainStyledAttributes.getInt(index, aVar.f2440J);
                    aVar.f2440J = i3;
                    aVar.f2440J = f2428b[i3];
                    break;
                case 23:
                    aVar.f2459b = typedArrayObtainStyledAttributes.getLayoutDimension(index, aVar.f2459b);
                    break;
                case 24:
                    aVar.f2434D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, aVar.f2434D);
                    break;
                case 25:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, aVar.f2471h);
                    if (resourceId6 == -1) {
                        resourceId6 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.f2471h = resourceId6;
                    break;
                case 26:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, aVar.f2473i);
                    if (resourceId7 == -1) {
                        resourceId7 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.f2473i = resourceId7;
                    break;
                case 27:
                    aVar.f2433C = typedArrayObtainStyledAttributes.getInt(index, aVar.f2433C);
                    break;
                case 28:
                    aVar.f2435E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, aVar.f2435E);
                    break;
                case 29:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, aVar.f2475j);
                    if (resourceId8 == -1) {
                        resourceId8 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.f2475j = resourceId8;
                    break;
                case 30:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, aVar.f2477k);
                    if (resourceId9 == -1) {
                        resourceId9 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.f2477k = resourceId9;
                    break;
                case 31:
                    aVar.f2439I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, aVar.f2439I);
                    break;
                case 32:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, aVar.f2489q);
                    if (resourceId10 == -1) {
                        resourceId10 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.f2489q = resourceId10;
                    break;
                case 33:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, aVar.f2491r);
                    if (resourceId11 == -1) {
                        resourceId11 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.f2491r = resourceId11;
                    break;
                case 34:
                    aVar.f2436F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, aVar.f2436F);
                    break;
                case 35:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, aVar.f2481m);
                    if (resourceId12 == -1) {
                        resourceId12 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.f2481m = resourceId12;
                    break;
                case 36:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, aVar.f2479l);
                    if (resourceId13 == -1) {
                        resourceId13 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.f2479l = resourceId13;
                    break;
                case 37:
                    aVar.f2499v = typedArrayObtainStyledAttributes.getFloat(index, aVar.f2499v);
                    break;
                case 38:
                    aVar.f2463d = typedArrayObtainStyledAttributes.getResourceId(index, aVar.f2463d);
                    break;
                case 39:
                    aVar.f2448R = typedArrayObtainStyledAttributes.getFloat(index, aVar.f2448R);
                    break;
                case 40:
                    aVar.f2447Q = typedArrayObtainStyledAttributes.getFloat(index, aVar.f2447Q);
                    break;
                case 41:
                    aVar.f2449S = typedArrayObtainStyledAttributes.getInt(index, aVar.f2449S);
                    break;
                case 42:
                    aVar.f2450T = typedArrayObtainStyledAttributes.getInt(index, aVar.f2450T);
                    break;
                case 43:
                    aVar.f2451U = typedArrayObtainStyledAttributes.getFloat(index, aVar.f2451U);
                    break;
                case 44:
                    aVar.f2452V = true;
                    aVar.f2453W = typedArrayObtainStyledAttributes.getDimension(index, aVar.f2453W);
                    break;
                case 45:
                    aVar.f2455Y = typedArrayObtainStyledAttributes.getFloat(index, aVar.f2455Y);
                    break;
                case 46:
                    aVar.f2456Z = typedArrayObtainStyledAttributes.getFloat(index, aVar.f2456Z);
                    break;
                case 47:
                    aVar.f2458a0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.f2458a0);
                    break;
                case 48:
                    aVar.f2460b0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.f2460b0);
                    break;
                case 49:
                    aVar.f2462c0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.f2462c0);
                    break;
                case 50:
                    aVar.f2464d0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.f2464d0);
                    break;
                case 51:
                    aVar.f2466e0 = typedArrayObtainStyledAttributes.getDimension(index, aVar.f2466e0);
                    break;
                case 52:
                    aVar.f2468f0 = typedArrayObtainStyledAttributes.getDimension(index, aVar.f2468f0);
                    break;
                case 53:
                    aVar.f2470g0 = typedArrayObtainStyledAttributes.getDimension(index, aVar.f2470g0);
                    break;
                default:
                    switch (i2) {
                        case 60:
                            aVar.f2454X = typedArrayObtainStyledAttributes.getFloat(index, aVar.f2454X);
                            break;
                        case 61:
                            int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, aVar.f2502x);
                            if (resourceId14 == -1) {
                                resourceId14 = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            aVar.f2502x = resourceId14;
                            break;
                        case 62:
                            aVar.f2503y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, aVar.f2503y);
                            break;
                        case 63:
                            aVar.f2504z = typedArrayObtainStyledAttributes.getFloat(index, aVar.f2504z);
                            break;
                        default:
                            switch (i2) {
                                case 69:
                                    aVar.f2488p0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                    continue;
                                case 70:
                                    aVar.f2490q0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                    continue;
                                case 71:
                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                    continue;
                                case 72:
                                    aVar.f2494s0 = typedArrayObtainStyledAttributes.getInt(index, aVar.f2494s0);
                                    continue;
                                case 73:
                                    aVar.f2500v0 = typedArrayObtainStyledAttributes.getString(index);
                                    continue;
                                case 74:
                                    aVar.f2492r0 = typedArrayObtainStyledAttributes.getBoolean(index, aVar.f2492r0);
                                    continue;
                                case 75:
                                    sb = new StringBuilder();
                                    str = "unused attribute 0x";
                                    break;
                                default:
                                    sb = new StringBuilder();
                                    str = "Unknown attribute 0x";
                                    break;
                            }
                            sb.append(str);
                            sb.append(Integer.toHexString(index));
                            sb.append("   ");
                            sb.append(f2429c.get(index));
                            Log.w("ConstraintSet", sb.toString());
                            break;
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    /* JADX INFO: renamed from: c */
    public void m1399c(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a aVarM1398b = m1398b(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        aVarM1398b.f2457a = true;
                    }
                    this.f2430a.put(Integer.valueOf(aVarM1398b.f2463d), aVarM1398b);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }
}
