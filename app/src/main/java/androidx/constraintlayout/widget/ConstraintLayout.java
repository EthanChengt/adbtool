package androidx.constraintlayout.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import p006b.p023d.C0304a;
import p006b.p026f.p027a.p028h.C0331c;
import p006b.p026f.p027a.p028h.C0332d;
import p006b.p026f.p027a.p028h.C0333e;
import p006b.p026f.p027a.p028h.C0335g;
import p006b.p026f.p027a.p028h.C0338j;
import p006b.p026f.p027a.p028h.C0339k;
import p006b.p026f.p027a.p028h.C0342n;
import p006b.p026f.p029b.AbstractC0344b;
import p006b.p026f.p029b.C0343a;
import p006b.p026f.p029b.C0345c;
import p006b.p026f.p029b.C0346d;
import p006b.p026f.p029b.C0347e;
import p006b.p026f.p029b.C0348f;
import p006b.p026f.p029b.C0350h;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* JADX INFO: renamed from: b */
    public SparseArray<View> f436b;

    /* JADX INFO: renamed from: c */
    public ArrayList<AbstractC0344b> f437c;

    /* JADX INFO: renamed from: d */
    public final ArrayList<C0332d> f438d;

    /* JADX INFO: renamed from: e */
    public C0333e f439e;

    /* JADX INFO: renamed from: f */
    public int f440f;

    /* JADX INFO: renamed from: g */
    public int f441g;

    /* JADX INFO: renamed from: h */
    public int f442h;

    /* JADX INFO: renamed from: i */
    public int f443i;

    /* JADX INFO: renamed from: j */
    public boolean f444j;

    /* JADX INFO: renamed from: k */
    public int f445k;

    /* JADX INFO: renamed from: l */
    public C0345c f446l;

    /* JADX INFO: renamed from: m */
    public int f447m;

    /* JADX INFO: renamed from: n */
    public HashMap<String, Integer> f448n;

    /* JADX INFO: renamed from: o */
    public int f449o;

    /* JADX INFO: renamed from: p */
    public int f450p;

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.ConstraintLayout$a */
    public static class C0065a extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: A */
        public float f451A;

        /* JADX INFO: renamed from: B */
        public String f452B;

        /* JADX INFO: renamed from: C */
        public int f453C;

        /* JADX INFO: renamed from: D */
        public float f454D;

        /* JADX INFO: renamed from: E */
        public float f455E;

        /* JADX INFO: renamed from: F */
        public int f456F;

        /* JADX INFO: renamed from: G */
        public int f457G;

        /* JADX INFO: renamed from: H */
        public int f458H;

        /* JADX INFO: renamed from: I */
        public int f459I;

        /* JADX INFO: renamed from: J */
        public int f460J;

        /* JADX INFO: renamed from: K */
        public int f461K;

        /* JADX INFO: renamed from: L */
        public int f462L;

        /* JADX INFO: renamed from: M */
        public int f463M;

        /* JADX INFO: renamed from: N */
        public float f464N;

        /* JADX INFO: renamed from: O */
        public float f465O;

        /* JADX INFO: renamed from: P */
        public int f466P;

        /* JADX INFO: renamed from: Q */
        public int f467Q;

        /* JADX INFO: renamed from: R */
        public int f468R;

        /* JADX INFO: renamed from: S */
        public boolean f469S;

        /* JADX INFO: renamed from: T */
        public boolean f470T;

        /* JADX INFO: renamed from: U */
        public boolean f471U;

        /* JADX INFO: renamed from: V */
        public boolean f472V;

        /* JADX INFO: renamed from: W */
        public boolean f473W;

        /* JADX INFO: renamed from: X */
        public boolean f474X;

        /* JADX INFO: renamed from: Y */
        public boolean f475Y;

        /* JADX INFO: renamed from: Z */
        public boolean f476Z;

        /* JADX INFO: renamed from: a */
        public int f477a;

        /* JADX INFO: renamed from: a0 */
        public int f478a0;

        /* JADX INFO: renamed from: b */
        public int f479b;

        /* JADX INFO: renamed from: b0 */
        public int f480b0;

        /* JADX INFO: renamed from: c */
        public float f481c;

        /* JADX INFO: renamed from: c0 */
        public int f482c0;

        /* JADX INFO: renamed from: d */
        public int f483d;

        /* JADX INFO: renamed from: d0 */
        public int f484d0;

        /* JADX INFO: renamed from: e */
        public int f485e;

        /* JADX INFO: renamed from: e0 */
        public int f486e0;

        /* JADX INFO: renamed from: f */
        public int f487f;

        /* JADX INFO: renamed from: f0 */
        public int f488f0;

        /* JADX INFO: renamed from: g */
        public int f489g;

        /* JADX INFO: renamed from: g0 */
        public float f490g0;

        /* JADX INFO: renamed from: h */
        public int f491h;

        /* JADX INFO: renamed from: h0 */
        public int f492h0;

        /* JADX INFO: renamed from: i */
        public int f493i;

        /* JADX INFO: renamed from: i0 */
        public int f494i0;

        /* JADX INFO: renamed from: j */
        public int f495j;

        /* JADX INFO: renamed from: j0 */
        public float f496j0;

        /* JADX INFO: renamed from: k */
        public int f497k;

        /* JADX INFO: renamed from: k0 */
        public C0332d f498k0;

        /* JADX INFO: renamed from: l */
        public int f499l;

        /* JADX INFO: renamed from: m */
        public int f500m;

        /* JADX INFO: renamed from: n */
        public int f501n;

        /* JADX INFO: renamed from: o */
        public float f502o;

        /* JADX INFO: renamed from: p */
        public int f503p;

        /* JADX INFO: renamed from: q */
        public int f504q;

        /* JADX INFO: renamed from: r */
        public int f505r;

        /* JADX INFO: renamed from: s */
        public int f506s;

        /* JADX INFO: renamed from: t */
        public int f507t;

        /* JADX INFO: renamed from: u */
        public int f508u;

        /* JADX INFO: renamed from: v */
        public int f509v;

        /* JADX INFO: renamed from: w */
        public int f510w;

        /* JADX INFO: renamed from: x */
        public int f511x;

        /* JADX INFO: renamed from: y */
        public int f512y;

        /* JADX INFO: renamed from: z */
        public float f513z;

        /* JADX INFO: renamed from: androidx.constraintlayout.widget.ConstraintLayout$a$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            public static final SparseIntArray f514a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f514a = sparseIntArray;
                sparseIntArray.append(34, 8);
                sparseIntArray.append(35, 9);
                sparseIntArray.append(37, 10);
                sparseIntArray.append(38, 11);
                sparseIntArray.append(43, 12);
                sparseIntArray.append(42, 13);
                sparseIntArray.append(16, 14);
                sparseIntArray.append(15, 15);
                sparseIntArray.append(13, 16);
                sparseIntArray.append(17, 2);
                sparseIntArray.append(19, 3);
                sparseIntArray.append(18, 4);
                sparseIntArray.append(51, 49);
                sparseIntArray.append(52, 50);
                sparseIntArray.append(23, 5);
                sparseIntArray.append(24, 6);
                sparseIntArray.append(25, 7);
                sparseIntArray.append(0, 1);
                sparseIntArray.append(39, 17);
                sparseIntArray.append(40, 18);
                sparseIntArray.append(22, 19);
                sparseIntArray.append(21, 20);
                sparseIntArray.append(55, 21);
                sparseIntArray.append(58, 22);
                sparseIntArray.append(56, 23);
                sparseIntArray.append(53, 24);
                sparseIntArray.append(57, 25);
                sparseIntArray.append(54, 26);
                sparseIntArray.append(30, 29);
                sparseIntArray.append(44, 30);
                sparseIntArray.append(20, 44);
                sparseIntArray.append(32, 45);
                sparseIntArray.append(46, 46);
                sparseIntArray.append(31, 47);
                sparseIntArray.append(45, 48);
                sparseIntArray.append(11, 27);
                sparseIntArray.append(10, 28);
                sparseIntArray.append(47, 31);
                sparseIntArray.append(26, 32);
                sparseIntArray.append(49, 33);
                sparseIntArray.append(48, 34);
                sparseIntArray.append(50, 35);
                sparseIntArray.append(28, 36);
                sparseIntArray.append(27, 37);
                sparseIntArray.append(29, 38);
                sparseIntArray.append(33, 39);
                sparseIntArray.append(41, 40);
                sparseIntArray.append(36, 41);
                sparseIntArray.append(14, 42);
                sparseIntArray.append(12, 43);
            }
        }

        public C0065a(int i, int i2) {
            super(i, i2);
            this.f477a = -1;
            this.f479b = -1;
            this.f481c = -1.0f;
            this.f483d = -1;
            this.f485e = -1;
            this.f487f = -1;
            this.f489g = -1;
            this.f491h = -1;
            this.f493i = -1;
            this.f495j = -1;
            this.f497k = -1;
            this.f499l = -1;
            this.f500m = -1;
            this.f501n = 0;
            this.f502o = 0.0f;
            this.f503p = -1;
            this.f504q = -1;
            this.f505r = -1;
            this.f506s = -1;
            this.f507t = -1;
            this.f508u = -1;
            this.f509v = -1;
            this.f510w = -1;
            this.f511x = -1;
            this.f512y = -1;
            this.f513z = 0.5f;
            this.f451A = 0.5f;
            this.f452B = null;
            this.f453C = 1;
            this.f454D = -1.0f;
            this.f455E = -1.0f;
            this.f456F = 0;
            this.f457G = 0;
            this.f458H = 0;
            this.f459I = 0;
            this.f460J = 0;
            this.f461K = 0;
            this.f462L = 0;
            this.f463M = 0;
            this.f464N = 1.0f;
            this.f465O = 1.0f;
            this.f466P = -1;
            this.f467Q = -1;
            this.f468R = -1;
            this.f469S = false;
            this.f470T = false;
            this.f471U = true;
            this.f472V = true;
            this.f473W = false;
            this.f474X = false;
            this.f475Y = false;
            this.f476Z = false;
            this.f478a0 = -1;
            this.f480b0 = -1;
            this.f482c0 = -1;
            this.f484d0 = -1;
            this.f486e0 = -1;
            this.f488f0 = -1;
            this.f490g0 = 0.5f;
            this.f498k0 = new C0332d();
        }

        public C0065a(Context context, AttributeSet attributeSet) {
            String str;
            int i;
            super(context, attributeSet);
            this.f477a = -1;
            this.f479b = -1;
            this.f481c = -1.0f;
            this.f483d = -1;
            this.f485e = -1;
            this.f487f = -1;
            this.f489g = -1;
            this.f491h = -1;
            this.f493i = -1;
            this.f495j = -1;
            this.f497k = -1;
            this.f499l = -1;
            this.f500m = -1;
            this.f501n = 0;
            this.f502o = 0.0f;
            this.f503p = -1;
            this.f504q = -1;
            this.f505r = -1;
            this.f506s = -1;
            this.f507t = -1;
            this.f508u = -1;
            this.f509v = -1;
            this.f510w = -1;
            this.f511x = -1;
            this.f512y = -1;
            this.f513z = 0.5f;
            this.f451A = 0.5f;
            this.f452B = null;
            this.f453C = 1;
            this.f454D = -1.0f;
            this.f455E = -1.0f;
            this.f456F = 0;
            this.f457G = 0;
            this.f458H = 0;
            this.f459I = 0;
            this.f460J = 0;
            this.f461K = 0;
            this.f462L = 0;
            this.f463M = 0;
            this.f464N = 1.0f;
            this.f465O = 1.0f;
            this.f466P = -1;
            this.f467Q = -1;
            this.f468R = -1;
            this.f469S = false;
            this.f470T = false;
            this.f471U = true;
            this.f472V = true;
            this.f473W = false;
            this.f474X = false;
            this.f475Y = false;
            this.f476Z = false;
            this.f478a0 = -1;
            this.f480b0 = -1;
            this.f482c0 = -1;
            this.f484d0 = -1;
            this.f486e0 = -1;
            this.f488f0 = -1;
            this.f490g0 = 0.5f;
            this.f498k0 = new C0332d();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0350h.f2521a);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                int i3 = a.f514a.get(index);
                switch (i3) {
                    case 1:
                        this.f468R = typedArrayObtainStyledAttributes.getInt(index, this.f468R);
                        continue;
                        break;
                    case RecyclerView.SCROLL_STATE_SETTLING /* 2 */:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f500m);
                        this.f500m = resourceId;
                        if (resourceId == -1) {
                            this.f500m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 3:
                        this.f501n = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f501n);
                        continue;
                        break;
                    case 4:
                        float f = typedArrayObtainStyledAttributes.getFloat(index, this.f502o) % 360.0f;
                        this.f502o = f;
                        if (f < 0.0f) {
                            this.f502o = (360.0f - f) % 360.0f;
                        } else {
                            continue;
                        }
                        break;
                    case 5:
                        this.f477a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f477a);
                        continue;
                        break;
                    case 6:
                        this.f479b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f479b);
                        continue;
                        break;
                    case 7:
                        this.f481c = typedArrayObtainStyledAttributes.getFloat(index, this.f481c);
                        continue;
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f483d);
                        this.f483d = resourceId2;
                        if (resourceId2 == -1) {
                            this.f483d = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f485e);
                        this.f485e = resourceId3;
                        if (resourceId3 == -1) {
                            this.f485e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f487f);
                        this.f487f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f487f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f489g);
                        this.f489g = resourceId5;
                        if (resourceId5 == -1) {
                            this.f489g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f491h);
                        this.f491h = resourceId6;
                        if (resourceId6 == -1) {
                            this.f491h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f493i);
                        this.f493i = resourceId7;
                        if (resourceId7 == -1) {
                            this.f493i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f495j);
                        this.f495j = resourceId8;
                        if (resourceId8 == -1) {
                            this.f495j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f497k);
                        this.f497k = resourceId9;
                        if (resourceId9 == -1) {
                            this.f497k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f499l);
                        this.f499l = resourceId10;
                        if (resourceId10 == -1) {
                            this.f499l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f503p);
                        this.f503p = resourceId11;
                        if (resourceId11 == -1) {
                            this.f503p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f504q);
                        this.f504q = resourceId12;
                        if (resourceId12 == -1) {
                            this.f504q = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f505r);
                        this.f505r = resourceId13;
                        if (resourceId13 == -1) {
                            this.f505r = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f506s);
                        this.f506s = resourceId14;
                        if (resourceId14 == -1) {
                            this.f506s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 21:
                        this.f507t = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f507t);
                        continue;
                        break;
                    case 22:
                        this.f508u = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f508u);
                        continue;
                        break;
                    case 23:
                        this.f509v = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f509v);
                        continue;
                        break;
                    case 24:
                        this.f510w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f510w);
                        continue;
                        break;
                    case 25:
                        this.f511x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f511x);
                        continue;
                        break;
                    case 26:
                        this.f512y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f512y);
                        continue;
                        break;
                    case 27:
                        this.f469S = typedArrayObtainStyledAttributes.getBoolean(index, this.f469S);
                        continue;
                        break;
                    case 28:
                        this.f470T = typedArrayObtainStyledAttributes.getBoolean(index, this.f470T);
                        continue;
                        break;
                    case 29:
                        this.f513z = typedArrayObtainStyledAttributes.getFloat(index, this.f513z);
                        continue;
                        break;
                    case 30:
                        this.f451A = typedArrayObtainStyledAttributes.getFloat(index, this.f451A);
                        continue;
                        break;
                    case 31:
                        int i4 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f458H = i4;
                        if (i4 == 1) {
                            str = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.";
                            break;
                        }
                        break;
                    case 32:
                        int i5 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f459I = i5;
                        if (i5 == 1) {
                            str = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.";
                            break;
                        }
                        break;
                    case 33:
                        try {
                            this.f460J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f460J);
                            continue;
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f460J) == -2) {
                                this.f460J = -2;
                            }
                        }
                        break;
                    case 34:
                        try {
                            this.f462L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f462L);
                            continue;
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f462L) == -2) {
                                this.f462L = -2;
                            }
                        }
                        break;
                    case 35:
                        this.f464N = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f464N));
                        continue;
                        break;
                    case 36:
                        try {
                            this.f461K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f461K);
                            continue;
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f461K) == -2) {
                                this.f461K = -2;
                            }
                        }
                        break;
                    case 37:
                        try {
                            this.f463M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f463M);
                            continue;
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f463M) == -2) {
                                this.f463M = -2;
                            }
                        }
                        break;
                    case 38:
                        this.f465O = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f465O));
                        continue;
                        break;
                    default:
                        switch (i3) {
                            case 44:
                                String string = typedArrayObtainStyledAttributes.getString(index);
                                this.f452B = string;
                                this.f453C = -1;
                                if (string != null) {
                                    int length = string.length();
                                    int iIndexOf = this.f452B.indexOf(44);
                                    if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                                        i = 0;
                                    } else {
                                        String strSubstring = this.f452B.substring(0, iIndexOf);
                                        if (strSubstring.equalsIgnoreCase("W")) {
                                            this.f453C = 0;
                                        } else if (strSubstring.equalsIgnoreCase("H")) {
                                            this.f453C = 1;
                                        }
                                        i = iIndexOf + 1;
                                    }
                                    int iIndexOf2 = this.f452B.indexOf(58);
                                    if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                                        String strSubstring2 = this.f452B.substring(i);
                                        if (strSubstring2.length() > 0) {
                                            Float.parseFloat(strSubstring2);
                                            continue;
                                        }
                                    } else {
                                        String strSubstring3 = this.f452B.substring(i, iIndexOf2);
                                        String strSubstring4 = this.f452B.substring(iIndexOf2 + 1);
                                        if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                                            try {
                                                float f2 = Float.parseFloat(strSubstring3);
                                                float f3 = Float.parseFloat(strSubstring4);
                                                if (f2 > 0.0f && f3 > 0.0f) {
                                                    if (this.f453C == 1) {
                                                        Math.abs(f3 / f2);
                                                    } else {
                                                        Math.abs(f2 / f3);
                                                    }
                                                }
                                            } catch (NumberFormatException unused5) {
                                            }
                                        }
                                    }
                                }
                                break;
                            case 45:
                                this.f454D = typedArrayObtainStyledAttributes.getFloat(index, this.f454D);
                                break;
                            case 46:
                                this.f455E = typedArrayObtainStyledAttributes.getFloat(index, this.f455E);
                                break;
                            case 47:
                                this.f456F = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f457G = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f466P = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f466P);
                                break;
                            case 50:
                                this.f467Q = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f467Q);
                                break;
                        }
                        break;
                }
                Log.e("ConstraintLayout", str);
            }
            typedArrayObtainStyledAttributes.recycle();
            m141a();
        }

        public C0065a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f477a = -1;
            this.f479b = -1;
            this.f481c = -1.0f;
            this.f483d = -1;
            this.f485e = -1;
            this.f487f = -1;
            this.f489g = -1;
            this.f491h = -1;
            this.f493i = -1;
            this.f495j = -1;
            this.f497k = -1;
            this.f499l = -1;
            this.f500m = -1;
            this.f501n = 0;
            this.f502o = 0.0f;
            this.f503p = -1;
            this.f504q = -1;
            this.f505r = -1;
            this.f506s = -1;
            this.f507t = -1;
            this.f508u = -1;
            this.f509v = -1;
            this.f510w = -1;
            this.f511x = -1;
            this.f512y = -1;
            this.f513z = 0.5f;
            this.f451A = 0.5f;
            this.f452B = null;
            this.f453C = 1;
            this.f454D = -1.0f;
            this.f455E = -1.0f;
            this.f456F = 0;
            this.f457G = 0;
            this.f458H = 0;
            this.f459I = 0;
            this.f460J = 0;
            this.f461K = 0;
            this.f462L = 0;
            this.f463M = 0;
            this.f464N = 1.0f;
            this.f465O = 1.0f;
            this.f466P = -1;
            this.f467Q = -1;
            this.f468R = -1;
            this.f469S = false;
            this.f470T = false;
            this.f471U = true;
            this.f472V = true;
            this.f473W = false;
            this.f474X = false;
            this.f475Y = false;
            this.f476Z = false;
            this.f478a0 = -1;
            this.f480b0 = -1;
            this.f482c0 = -1;
            this.f484d0 = -1;
            this.f486e0 = -1;
            this.f488f0 = -1;
            this.f490g0 = 0.5f;
            this.f498k0 = new C0332d();
        }

        /* JADX INFO: renamed from: a */
        public void m141a() {
            this.f474X = false;
            this.f471U = true;
            this.f472V = true;
            int i = ((ViewGroup.MarginLayoutParams) this).width;
            if (i == -2 && this.f469S) {
                this.f471U = false;
                this.f458H = 1;
            }
            int i2 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i2 == -2 && this.f470T) {
                this.f472V = false;
                this.f459I = 1;
            }
            if (i == 0 || i == -1) {
                this.f471U = false;
                if (i == 0 && this.f458H == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f469S = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.f472V = false;
                if (i2 == 0 && this.f459I == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f470T = true;
                }
            }
            if (this.f481c == -1.0f && this.f477a == -1 && this.f479b == -1) {
                return;
            }
            this.f474X = true;
            this.f471U = true;
            this.f472V = true;
            if (!(this.f498k0 instanceof C0335g)) {
                this.f498k0 = new C0335g();
            }
            ((C0335g) this.f498k0).m1376F(this.f468R);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x004c  */
        /* JADX WARN: Code duplicated, block: B:19:0x0053  */
        /* JADX WARN: Code duplicated, block: B:22:0x005a  */
        /* JADX WARN: Code duplicated, block: B:25:0x0060  */
        /* JADX WARN: Code duplicated, block: B:28:0x0066  */
        /* JADX WARN: Code duplicated, block: B:35:0x007c  */
        /* JADX WARN: Code duplicated, block: B:36:0x0084  */
        /* JADX WARN: Code duplicated, block: B:38:0x0088  */
        /* JADX WARN: Code duplicated, block: B:40:0x008f  */
        /* JADX WARN: Code duplicated, block: B:42:0x0093  */
        /* JADX WARN: Code duplicated, block: B:74:0x00d8  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @TargetApi(17)
        public void resolveLayoutDirection(int i) {
            int i2;
            int i3;
            int i4;
            int i5;
            float f;
            int i6;
            int i7;
            int i8 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int i9 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(i);
            this.f482c0 = -1;
            this.f484d0 = -1;
            this.f478a0 = -1;
            this.f480b0 = -1;
            this.f486e0 = -1;
            this.f488f0 = -1;
            this.f486e0 = this.f507t;
            this.f488f0 = this.f509v;
            this.f490g0 = this.f513z;
            this.f492h0 = this.f477a;
            this.f494i0 = this.f479b;
            this.f496j0 = this.f481c;
            boolean z = false;
            if (1 == getLayoutDirection()) {
                int i10 = this.f503p;
                if (i10 != -1) {
                    this.f482c0 = i10;
                } else {
                    int i11 = this.f504q;
                    if (i11 != -1) {
                        this.f484d0 = i11;
                    } else {
                        i2 = this.f505r;
                        if (i2 != -1) {
                            this.f480b0 = i2;
                            z = true;
                        }
                        i3 = this.f506s;
                        if (i3 != -1) {
                            this.f478a0 = i3;
                            z = true;
                        }
                        i4 = this.f511x;
                        if (i4 != -1) {
                            this.f488f0 = i4;
                        }
                        i5 = this.f512y;
                        if (i5 != -1) {
                            this.f486e0 = i5;
                        }
                        if (z) {
                            this.f490g0 = 1.0f - this.f513z;
                        }
                        if (this.f474X && this.f468R == 1) {
                            f = this.f481c;
                            if (f != -1.0f) {
                                this.f496j0 = 1.0f - f;
                                this.f492h0 = -1;
                                this.f494i0 = -1;
                            } else {
                                i6 = this.f477a;
                                if (i6 != -1) {
                                    this.f494i0 = i6;
                                    this.f492h0 = -1;
                                } else {
                                    i7 = this.f479b;
                                    if (i7 != -1) {
                                        this.f492h0 = i7;
                                        this.f494i0 = -1;
                                    }
                                }
                                this.f496j0 = -1.0f;
                            }
                        }
                    }
                }
                z = true;
                i2 = this.f505r;
                if (i2 != -1) {
                    this.f480b0 = i2;
                    z = true;
                }
                i3 = this.f506s;
                if (i3 != -1) {
                    this.f478a0 = i3;
                    z = true;
                }
                i4 = this.f511x;
                if (i4 != -1) {
                    this.f488f0 = i4;
                }
                i5 = this.f512y;
                if (i5 != -1) {
                    this.f486e0 = i5;
                }
                if (z) {
                    this.f490g0 = 1.0f - this.f513z;
                }
                if (this.f474X) {
                    f = this.f481c;
                    if (f != -1.0f) {
                        this.f496j0 = 1.0f - f;
                        this.f492h0 = -1;
                        this.f494i0 = -1;
                    } else {
                        i6 = this.f477a;
                        if (i6 != -1) {
                            this.f494i0 = i6;
                            this.f492h0 = -1;
                        } else {
                            i7 = this.f479b;
                            if (i7 != -1) {
                                this.f492h0 = i7;
                                this.f494i0 = -1;
                            }
                        }
                        this.f496j0 = -1.0f;
                    }
                }
            } else {
                int i12 = this.f503p;
                if (i12 != -1) {
                    this.f480b0 = i12;
                }
                int i13 = this.f504q;
                if (i13 != -1) {
                    this.f478a0 = i13;
                }
                int i14 = this.f505r;
                if (i14 != -1) {
                    this.f482c0 = i14;
                }
                int i15 = this.f506s;
                if (i15 != -1) {
                    this.f484d0 = i15;
                }
                int i16 = this.f511x;
                if (i16 != -1) {
                    this.f486e0 = i16;
                }
                int i17 = this.f512y;
                if (i17 != -1) {
                    this.f488f0 = i17;
                }
            }
            if (this.f505r == -1 && this.f506s == -1 && this.f504q == -1 && this.f503p == -1) {
                int i18 = this.f487f;
                if (i18 != -1) {
                    this.f482c0 = i18;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i9 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i9;
                    }
                } else {
                    int i19 = this.f489g;
                    if (i19 != -1) {
                        this.f484d0 = i19;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i9 > 0) {
                            ((ViewGroup.MarginLayoutParams) this).rightMargin = i9;
                        }
                    }
                }
                int i20 = this.f483d;
                if (i20 != -1) {
                    this.f478a0 = i20;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i8 <= 0) {
                        return;
                    }
                } else {
                    int i21 = this.f485e;
                    if (i21 == -1) {
                        return;
                    }
                    this.f480b0 = i21;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i8 <= 0) {
                        return;
                    }
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i8;
            }
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f436b = new SparseArray<>();
        this.f437c = new ArrayList<>(4);
        this.f438d = new ArrayList<>(100);
        this.f439e = new C0333e();
        this.f440f = 0;
        this.f441g = 0;
        this.f442h = Integer.MAX_VALUE;
        this.f443i = Integer.MAX_VALUE;
        this.f444j = true;
        this.f445k = 7;
        this.f446l = null;
        this.f447m = -1;
        this.f448n = new HashMap<>();
        this.f449o = -1;
        this.f450p = -1;
        this.f439e.f2319X = this;
        this.f436b.put(getId(), this);
        this.f446l = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0350h.f2521a);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 3) {
                    this.f440f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f440f);
                } else if (index == 4) {
                    this.f441g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f441g);
                } else if (index == 1) {
                    this.f442h = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f442h);
                } else if (index == 2) {
                    this.f443i = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f443i);
                } else if (index == 59) {
                    this.f445k = typedArrayObtainStyledAttributes.getInt(index, this.f445k);
                } else if (index == 8) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C0345c c0345c = new C0345c();
                        this.f446l = c0345c;
                        c0345c.m1399c(getContext(), resourceId);
                    } catch (Resources.NotFoundException unused) {
                        this.f446l = null;
                    }
                    this.f447m = resourceId;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f439e.f2374w0 = this.f445k;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0065a generateDefaultLayoutParams() {
        return new C0065a(-2, -2);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
    }

    /* JADX INFO: renamed from: b */
    public Object m134b(int i, Object obj) {
        if (i != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> map = this.f448n;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.f448n.get(str);
    }

    /* JADX INFO: renamed from: c */
    public final C0332d m135c(int i) {
        if (i == 0) {
            return this.f439e;
        }
        View viewFindViewById = this.f436b.get(i);
        if (viewFindViewById == null && (viewFindViewById = findViewById(i)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return this.f439e;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((C0065a) viewFindViewById.getLayoutParams()).f498k0;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0065a;
    }

    /* JADX INFO: renamed from: d */
    public final C0332d m136d(View view) {
        if (view == this) {
            return this.f439e;
        }
        if (view == null) {
            return null;
        }
        return ((C0065a) view.getLayoutParams()).f498k0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i2 = Integer.parseInt(strArrSplit[0]);
                        int i3 = Integer.parseInt(strArrSplit[1]);
                        int i4 = Integer.parseInt(strArrSplit[2]);
                        int i5 = (int) ((i2 / 1080.0f) * width);
                        int i6 = (int) ((i3 / 1920.0f) * height);
                        int i7 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i5;
                        float f2 = i6;
                        float f3 = i5 + ((int) ((i4 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i6 + i7;
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m137e(int i, int i2) {
        boolean z;
        int baseline;
        int childMeasureSpec;
        int childMeasureSpec2;
        int childMeasureSpec3;
        boolean z2;
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C0065a c0065a = (C0065a) childAt.getLayoutParams();
                C0332d c0332d = c0065a.f498k0;
                if (!c0065a.f474X && !c0065a.f475Y) {
                    c0332d.f2320Y = childAt.getVisibility();
                    int measuredWidth = ((ViewGroup.MarginLayoutParams) c0065a).width;
                    int measuredHeight = ((ViewGroup.MarginLayoutParams) c0065a).height;
                    boolean z3 = c0065a.f471U;
                    boolean z4 = true;
                    if (z3 || (z2 = c0065a.f472V) || (!z3 && c0065a.f458H == 1) || measuredWidth == -1 || (!z2 && (c0065a.f459I == 1 || measuredHeight == -1))) {
                        if (measuredWidth == 0) {
                            childMeasureSpec = ViewGroup.getChildMeasureSpec(i, paddingRight, -2);
                            z = true;
                        } else if (measuredWidth == -1) {
                            childMeasureSpec = ViewGroup.getChildMeasureSpec(i, paddingRight, -1);
                            z = false;
                        } else {
                            z = measuredWidth == -2;
                            childMeasureSpec = ViewGroup.getChildMeasureSpec(i, paddingRight, measuredWidth);
                        }
                        if (measuredHeight == 0) {
                            childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
                        } else {
                            if (measuredHeight == -1) {
                                childMeasureSpec3 = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -1);
                                z4 = false;
                            } else {
                                z4 = measuredHeight == -2;
                                childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, paddingBottom, measuredHeight);
                            }
                            childAt.measure(childMeasureSpec, childMeasureSpec3);
                            measuredWidth = childAt.getMeasuredWidth();
                            measuredHeight = childAt.getMeasuredHeight();
                        }
                        childMeasureSpec3 = childMeasureSpec2;
                        childAt.measure(childMeasureSpec, childMeasureSpec3);
                        measuredWidth = childAt.getMeasuredWidth();
                        measuredHeight = childAt.getMeasuredHeight();
                    } else {
                        z4 = false;
                        z = false;
                    }
                    c0332d.m1342C(measuredWidth);
                    c0332d.m1362w(measuredHeight);
                    if (z) {
                        c0332d.f2315T = measuredWidth;
                    }
                    if (z4) {
                        c0332d.f2316U = measuredHeight;
                    }
                    if (c0065a.f473W && (baseline = childAt.getBaseline()) != -1) {
                        c0332d.f2312Q = baseline;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:153:0x0271  */
    /* JADX WARN: Code duplicated, block: B:155:0x0275  */
    /* JADX WARN: Code duplicated, block: B:158:0x027a  */
    /* JADX WARN: Code duplicated, block: B:159:0x0282  */
    /* JADX WARN: Code duplicated, block: B:161:0x028a  */
    /* JADX WARN: Code duplicated, block: B:162:0x0292  */
    /* JADX WARN: Code duplicated, block: B:165:0x029e  */
    /* JADX WARN: Code duplicated, block: B:168:0x02a8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:169:0x02aa  */
    /* JADX INFO: renamed from: f */
    public final void m138f(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        int childMeasureSpec;
        int childMeasureSpec2;
        boolean z2;
        int childMeasureSpec3;
        boolean z3;
        int childMeasureSpec4;
        int measuredWidth;
        int measuredHeight;
        int baseline;
        boolean z4;
        boolean z5;
        int baseline2;
        int i7 = i2;
        C0332d.a aVar = C0332d.a.MATCH_CONSTRAINT;
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int childCount = getChildCount();
        int i8 = 0;
        while (true) {
            i3 = 8;
            if (i8 >= childCount) {
                break;
            }
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C0065a c0065a = (C0065a) childAt.getLayoutParams();
                C0332d c0332d = c0065a.f498k0;
                if (!c0065a.f474X && !c0065a.f475Y) {
                    c0332d.f2320Y = childAt.getVisibility();
                    int i9 = ((ViewGroup.MarginLayoutParams) c0065a).width;
                    int i10 = ((ViewGroup.MarginLayoutParams) c0065a).height;
                    if (i9 == 0 || i10 == 0) {
                        c0332d.m1353l().m1389b();
                        c0332d.m1352k().m1389b();
                    } else {
                        boolean z6 = i9 == -2;
                        int childMeasureSpec5 = ViewGroup.getChildMeasureSpec(i, paddingRight, i9);
                        boolean z7 = i10 == -2;
                        childAt.measure(childMeasureSpec5, ViewGroup.getChildMeasureSpec(i7, paddingBottom, i10));
                        int measuredWidth2 = childAt.getMeasuredWidth();
                        int measuredHeight2 = childAt.getMeasuredHeight();
                        c0332d.m1342C(measuredWidth2);
                        c0332d.m1362w(measuredHeight2);
                        if (z6) {
                            c0332d.f2315T = measuredWidth2;
                        }
                        if (z7) {
                            c0332d.f2316U = measuredHeight2;
                        }
                        if (c0065a.f473W && (baseline2 = childAt.getBaseline()) != -1) {
                            c0332d.f2312Q = baseline2;
                        }
                        if (c0065a.f471U && c0065a.f472V) {
                            c0332d.m1353l().m1387e(measuredWidth2);
                            c0332d.m1352k().m1387e(measuredHeight2);
                        }
                    }
                }
            }
            i8++;
        }
        this.f439e.m1372L();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt2 = getChildAt(i11);
            if (childAt2.getVisibility() == i3) {
                i4 = childCount;
                i5 = paddingBottom;
                i6 = i11;
                i2 = i7;
            } else {
                C0065a c0065a2 = (C0065a) childAt2.getLayoutParams();
                C0332d c0332d2 = c0065a2.f498k0;
                if (c0065a2.f474X || c0065a2.f475Y) {
                    i4 = childCount;
                    i5 = paddingBottom;
                    i6 = i11;
                    i2 = i7;
                } else {
                    c0332d2.f2320Y = childAt2.getVisibility();
                    int i12 = ((ViewGroup.MarginLayoutParams) c0065a2).width;
                    int i13 = ((ViewGroup.MarginLayoutParams) c0065a2).height;
                    if (i12 == 0 || i13 == 0) {
                        C0331c.b bVar = C0331c.b.LEFT;
                        C0338j c0338j = c0332d2.mo1347f(bVar).f2273a;
                        C0331c.b bVar2 = C0331c.b.RIGHT;
                        i4 = childCount;
                        C0338j c0338j2 = c0332d2.mo1347f(bVar2).f2273a;
                        boolean z8 = (c0332d2.mo1347f(bVar).f2276d == null || c0332d2.mo1347f(bVar2).f2276d == null) ? false : true;
                        C0331c.b bVar3 = C0331c.b.TOP;
                        i6 = i11;
                        C0338j c0338j3 = c0332d2.mo1347f(bVar3).f2273a;
                        C0331c.b bVar4 = C0331c.b.BOTTOM;
                        View view = childAt2;
                        C0338j c0338j4 = c0332d2.mo1347f(bVar4).f2273a;
                        boolean z9 = (c0332d2.mo1347f(bVar3).f2276d == null || c0332d2.mo1347f(bVar4).f2276d == null) ? false : true;
                        if (i12 == 0 && i13 == 0 && z8 && z9) {
                            i2 = i7;
                            i5 = paddingBottom;
                        } else {
                            C0332d.a aVarM1350i = this.f439e.m1350i();
                            C0332d.a aVar2 = C0332d.a.WRAP_CONTENT;
                            i5 = paddingBottom;
                            boolean z10 = aVarM1350i != aVar2;
                            boolean z11 = this.f439e.m1354m() != aVar2;
                            if (!z10) {
                                c0332d2.m1353l().m1389b();
                            }
                            if (!z11) {
                                c0332d2.m1352k().m1389b();
                            }
                            if (i12 == 0) {
                                if (z10) {
                                    if (c0332d2.f2330e == 0 && c0332d2.f2302G == 0.0f && c0332d2.f2336h == 0 && c0332d2.f2338i == 0) {
                                        z5 = c0332d2.f2298C[0] == aVar;
                                        if (!z5 && z8 && c0338j.m1390c() && c0338j2.m1390c()) {
                                            int i14 = (int) (c0338j2.f2399g - c0338j.f2399g);
                                            c0332d2.m1353l().m1387e(i14);
                                            childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i, paddingRight, i14);
                                            childMeasureSpec = childMeasureSpec2;
                                            z = false;
                                        }
                                    }
                                    if (!z5) {
                                    }
                                }
                                childMeasureSpec = ViewGroup.getChildMeasureSpec(i, paddingRight, -2);
                                z = true;
                                z10 = false;
                            } else if (i12 == -1) {
                                childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i, paddingRight, -1);
                                childMeasureSpec = childMeasureSpec2;
                                z = false;
                            } else {
                                z = i12 == -2;
                                childMeasureSpec = ViewGroup.getChildMeasureSpec(i, paddingRight, i12);
                            }
                            if (i13 == 0) {
                                if (z11) {
                                    if (c0332d2.f2332f == 0 && c0332d2.f2302G == 0.0f && c0332d2.f2340k == 0 && c0332d2.f2341l == 0) {
                                        z4 = c0332d2.f2298C[1] == aVar;
                                        if (!z4 && z9 && c0338j3.m1390c() && c0338j4.m1390c()) {
                                            int i15 = (int) (c0338j4.f2399g - c0338j3.f2399g);
                                            c0332d2.m1352k().m1387e(i15);
                                            i2 = i2;
                                            i5 = i5;
                                            childMeasureSpec3 = ViewGroup.getChildMeasureSpec(i2, i5, i15);
                                        }
                                    }
                                    if (!z4) {
                                    }
                                }
                                childMeasureSpec4 = ViewGroup.getChildMeasureSpec(i2, i5, -2);
                                view = view;
                                z3 = false;
                                z2 = true;
                                view.measure(childMeasureSpec, childMeasureSpec4);
                                measuredWidth = view.getMeasuredWidth();
                                measuredHeight = view.getMeasuredHeight();
                                c0332d2.m1342C(measuredWidth);
                                c0332d2.m1362w(measuredHeight);
                                if (z) {
                                    c0332d2.f2315T = measuredWidth;
                                }
                                if (z2) {
                                    c0332d2.f2316U = measuredHeight;
                                }
                                if (z10) {
                                    c0332d2.m1353l().m1387e(measuredWidth);
                                } else {
                                    c0332d2.m1353l().f2408b = 2;
                                }
                                if (z3) {
                                    c0332d2.m1352k().m1387e(measuredHeight);
                                } else {
                                    c0332d2.m1352k().f2408b = 2;
                                }
                                if (!c0065a2.f473W && (baseline = view.getBaseline()) != -1) {
                                    c0332d2.f2312Q = baseline;
                                }
                            } else {
                                i2 = i2;
                                i5 = i5;
                                if (i13 == -1) {
                                    childMeasureSpec3 = ViewGroup.getChildMeasureSpec(i2, i5, -1);
                                } else {
                                    z2 = i13 == -2;
                                    childMeasureSpec3 = ViewGroup.getChildMeasureSpec(i2, i5, i13);
                                }
                                int i16 = childMeasureSpec3;
                                z3 = z11;
                                childMeasureSpec4 = i16;
                                view.measure(childMeasureSpec, childMeasureSpec4);
                                measuredWidth = view.getMeasuredWidth();
                                measuredHeight = view.getMeasuredHeight();
                                c0332d2.m1342C(measuredWidth);
                                c0332d2.m1362w(measuredHeight);
                                if (z) {
                                    c0332d2.f2315T = measuredWidth;
                                }
                                if (z2) {
                                    c0332d2.f2316U = measuredHeight;
                                }
                                if (z10) {
                                    c0332d2.m1353l().m1387e(measuredWidth);
                                } else {
                                    c0332d2.m1353l().f2408b = 2;
                                }
                                if (z3) {
                                    c0332d2.m1352k().m1387e(measuredHeight);
                                } else {
                                    c0332d2.m1352k().f2408b = 2;
                                }
                                if (!c0065a2.f473W) {
                                    c0332d2.f2312Q = baseline;
                                }
                            }
                            z2 = false;
                            int i17 = childMeasureSpec3;
                            z3 = z11;
                            childMeasureSpec4 = i17;
                            view.measure(childMeasureSpec, childMeasureSpec4);
                            measuredWidth = view.getMeasuredWidth();
                            measuredHeight = view.getMeasuredHeight();
                            c0332d2.m1342C(measuredWidth);
                            c0332d2.m1362w(measuredHeight);
                            if (z) {
                                c0332d2.f2315T = measuredWidth;
                            }
                            if (z2) {
                                c0332d2.f2316U = measuredHeight;
                            }
                            if (z10) {
                                c0332d2.m1353l().m1387e(measuredWidth);
                            } else {
                                c0332d2.m1353l().f2408b = 2;
                            }
                            if (z3) {
                                c0332d2.m1352k().m1387e(measuredHeight);
                            } else {
                                c0332d2.m1352k().f2408b = 2;
                            }
                            if (!c0065a2.f473W) {
                                c0332d2.f2312Q = baseline;
                            }
                        }
                    } else {
                        i4 = childCount;
                        i5 = paddingBottom;
                        i6 = i11;
                        i2 = i7;
                    }
                }
            }
            paddingBottom = i5;
            childCount = i4;
            i3 = 8;
            int i18 = i2;
            i11 = i6 + 1;
            i7 = i18;
        }
    }

    /* JADX INFO: renamed from: g */
    public void m139g(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f448n == null) {
                this.f448n = new HashMap<>();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            this.f448n.put(strSubstring, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0065a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0065a(layoutParams);
    }

    public int getMaxHeight() {
        return this.f443i;
    }

    public int getMaxWidth() {
        return this.f442h;
    }

    public int getMinHeight() {
        return this.f441g;
    }

    public int getMinWidth() {
        return this.f440f;
    }

    public int getOptimizationLevel() {
        return this.f439e.f2374w0;
    }

    /* JADX INFO: renamed from: h */
    public void m140h() {
        this.f439e.mo1366F();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C0065a c0065a = (C0065a) childAt.getLayoutParams();
            C0332d c0332d = c0065a.f498k0;
            if ((childAt.getVisibility() != 8 || c0065a.f474X || c0065a.f475Y || zIsInEditMode) && !c0065a.f476Z) {
                int i6 = c0332d.f2308M + c0332d.f2310O;
                int i7 = c0332d.f2309N + c0332d.f2311P;
                int iM1355n = c0332d.m1355n() + i6;
                int iM1349h = c0332d.m1349h() + i7;
                childAt.layout(i6, i7, iM1355n, iM1349h);
                if ((childAt instanceof C0348f) && (content = ((C0348f) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(i6, i7, iM1355n, iM1349h);
                }
            }
        }
        int size = this.f437c.size();
        if (size > 0) {
            for (int i8 = 0; i8 < size; i8++) {
                this.f437c.get(i8).m1393c();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:247:0x0556  */
    /* JADX WARN: Code duplicated, block: B:279:0x0613  */
    /* JADX WARN: Code duplicated, block: B:306:0x0671  */
    /* JADX WARN: Code duplicated, block: B:308:0x0675  */
    /* JADX WARN: Code duplicated, block: B:309:0x0689  */
    /* JADX WARN: Code duplicated, block: B:310:0x068e  */
    /* JADX WARN: Code duplicated, block: B:314:0x069a  */
    /* JADX WARN: Code duplicated, block: B:316:0x06a0  */
    /* JADX WARN: Code duplicated, block: B:317:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:319:0x06b1  */
    /* JADX WARN: Code duplicated, block: B:329:0x06d2  */
    /* JADX WARN: Code duplicated, block: B:332:0x06dc  */
    /* JADX WARN: Code duplicated, block: B:347:0x0716  */
    /* JADX WARN: Code duplicated, block: B:349:0x0720 A[Catch: NumberFormatException -> 0x0725, TRY_ENTER, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x0725, blocks: (B:338:0x06f6, B:344:0x070a, B:345:0x0710, B:349:0x0720), top: B:570:0x06f6 }] */
    /* JADX WARN: Code duplicated, block: B:351:0x0725  */
    /* JADX WARN: Code duplicated, block: B:354:0x072b  */
    /* JADX WARN: Code duplicated, block: B:357:0x075a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:361:0x0772 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:427:0x0896  */
    /* JADX WARN: Code duplicated, block: B:429:0x08a6  */
    /* JADX WARN: Code duplicated, block: B:431:0x08aa  */
    /* JADX WARN: Code duplicated, block: B:432:0x08b3  */
    /* JADX WARN: Code duplicated, block: B:442:0x08d4  */
    /* JADX WARN: Code duplicated, block: B:448:0x08e6  */
    /* JADX WARN: Code duplicated, block: B:452:0x08ee  */
    /* JADX WARN: Code duplicated, block: B:455:0x0905  */
    /* JADX WARN: Code duplicated, block: B:457:0x090d  */
    /* JADX WARN: Code duplicated, block: B:458:0x090f  */
    /* JADX WARN: Code duplicated, block: B:461:0x0918  */
    /* JADX WARN: Code duplicated, block: B:462:0x091a  */
    /* JADX WARN: Code duplicated, block: B:466:0x093c  */
    /* JADX WARN: Code duplicated, block: B:468:0x094c  */
    /* JADX WARN: Code duplicated, block: B:469:0x0950  */
    /* JADX WARN: Code duplicated, block: B:471:0x095e  */
    /* JADX WARN: Code duplicated, block: B:529:0x0a65  */
    /* JADX WARN: Code duplicated, block: B:531:0x0a75  */
    /* JADX WARN: Code duplicated, block: B:534:0x0a85  */
    /* JADX WARN: Code duplicated, block: B:535:0x0a8c  */
    /* JADX WARN: Code duplicated, block: B:538:0x0a95  */
    /* JADX WARN: Code duplicated, block: B:540:0x0a9d  */
    /* JADX WARN: Code duplicated, block: B:543:0x0aa5  */
    /* JADX WARN: Code duplicated, block: B:546:0x0ab4  */
    /* JADX WARN: Code duplicated, block: B:551:0x0ac9  */
    /* JADX WARN: Code duplicated, block: B:552:0x0acb  */
    /* JADX WARN: Code duplicated, block: B:555:0x0ad4  */
    /* JADX WARN: Code duplicated, block: B:558:0x0aee  */
    /* JADX WARN: Code duplicated, block: B:561:0x0b27  */
    /* JADX WARN: Code duplicated, block: B:564:0x0b2c  */
    /* JADX WARN: Code duplicated, block: B:611:0x0776 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:617:0x0a59 A[EDGE_INSN: B:617:0x0a59->B:527:0x0a59 BREAK  A[LOOP:11: B:464:0x0938->B:526:0x0a49], SYNTHETIC] */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        C0332d.a aVar;
        int iMin;
        C0332d.a aVar2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        C0332d.a aVar3;
        int i8;
        boolean z;
        int i9;
        int i10;
        C0332d.a aVar4;
        int i11;
        int i12;
        int i13;
        int i14;
        int size;
        int paddingRight;
        int i15;
        int i16;
        int iMin2;
        int iMin3;
        C0333e c0333e;
        boolean z2;
        boolean z3;
        int iMax;
        int iMax2;
        int i17;
        boolean z4;
        int i18;
        int i19;
        int i20;
        int i21;
        C0332d c0332d;
        View view;
        boolean z5;
        View view2;
        int i22;
        C0065a c0065a;
        boolean z6;
        int baseline;
        int i23;
        int i24;
        int iM1355n;
        int iM1349h;
        int i25;
        C0333e c0333e2;
        C0333e c0333e3;
        C0339k c0339k;
        C0339k c0339k2;
        boolean z7;
        int i26;
        int i27;
        C0332d.a aVar5;
        int i28;
        C0332d.a aVar6;
        C0331c.b bVar;
        C0065a c0065a2;
        C0332d c0332dM135c;
        C0332d c0332d2;
        int i29;
        C0331c.b bVar2;
        C0332d c0332dM135c2;
        C0332d c0332d3;
        int i30;
        C0331c.b bVar3;
        C0332d.a aVar7;
        int i31;
        C0332d c0332dM135c3;
        C0332d c0332d4;
        int i32;
        int i33;
        C0331c.b bVar4;
        C0332d c0332dM135c4;
        int i34;
        int i35;
        C0331c.b bVar5;
        int i36;
        int i37;
        String str;
        float f;
        float f2;
        int iIndexOf;
        int i38;
        int i39;
        int iIndexOf2;
        String strSubstring;
        float fAbs;
        int i40;
        int i41;
        int i42;
        int i43;
        C0331c.b bVar6;
        int i44;
        ConstraintLayout constraintLayout = this;
        C0331c.b bVar7 = C0331c.b.BOTTOM;
        C0331c.b bVar8 = C0331c.b.RIGHT;
        C0332d.a aVar8 = C0332d.a.WRAP_CONTENT;
        C0332d.a aVar9 = C0332d.a.FIXED;
        System.currentTimeMillis();
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        C0333e c0333e4 = constraintLayout.f439e;
        c0333e4.f2304I = paddingLeft;
        c0333e4.f2305J = paddingTop;
        int i45 = constraintLayout.f442h;
        int[] iArr = c0333e4.f2346q;
        iArr[0] = i45;
        iArr[1] = constraintLayout.f443i;
        c0333e4.f2361j0 = getLayoutDirection() == 1;
        int mode3 = View.MeasureSpec.getMode(i);
        int size4 = View.MeasureSpec.getSize(i);
        int mode4 = View.MeasureSpec.getMode(i2);
        int size5 = View.MeasureSpec.getSize(i2);
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingRight2 = getPaddingRight() + getPaddingLeft();
        getLayoutParams();
        if (mode3 != Integer.MIN_VALUE) {
            if (mode3 == 0) {
                aVar = aVar8;
            } else if (mode3 != 1073741824) {
                aVar = aVar9;
            } else {
                size4 = Math.min(constraintLayout.f442h, size4) - paddingRight2;
                aVar = aVar9;
            }
            size4 = 0;
        } else {
            aVar = aVar8;
        }
        if (mode4 != Integer.MIN_VALUE) {
            if (mode4 == 0) {
                aVar2 = aVar8;
            } else if (mode4 != 1073741824) {
                aVar2 = aVar9;
            } else {
                iMin = Math.min(constraintLayout.f443i, size5) - paddingBottom;
                aVar2 = aVar9;
            }
            iMin = 0;
        } else {
            iMin = size5;
            aVar2 = aVar8;
        }
        C0333e c0333e5 = constraintLayout.f439e;
        c0333e5.f2313R = 0;
        c0333e5.f2314S = 0;
        c0333e5.m1364y(aVar);
        constraintLayout.f439e.m1342C(size4);
        constraintLayout.f439e.m1341B(aVar2);
        constraintLayout.f439e.m1362w(iMin);
        C0333e c0333e6 = constraintLayout.f439e;
        int paddingLeft2 = (constraintLayout.f440f - getPaddingLeft()) - getPaddingRight();
        if (paddingLeft2 < 0) {
            paddingLeft2 = 0;
        }
        c0333e6.f2313R = paddingLeft2;
        C0333e c0333e7 = constraintLayout.f439e;
        int paddingTop2 = (constraintLayout.f441g - getPaddingTop()) - getPaddingBottom();
        if (paddingTop2 < 0) {
            paddingTop2 = 0;
        }
        c0333e7.f2314S = paddingTop2;
        int iM1355n2 = constraintLayout.f439e.m1355n();
        int iM1349h2 = constraintLayout.f439e.m1349h();
        if (constraintLayout.f444j) {
            constraintLayout.f444j = false;
            int childCount = getChildCount();
            int i46 = 0;
            while (true) {
                if (i46 >= childCount) {
                    z7 = false;
                    break;
                } else {
                    if (constraintLayout.getChildAt(i46).isLayoutRequested()) {
                        z7 = true;
                        break;
                    }
                    i46++;
                }
            }
            if (z7) {
                constraintLayout.f438d.clear();
                C0332d.a aVar10 = C0332d.a.MATCH_PARENT;
                C0332d.a aVar11 = C0332d.a.MATCH_CONSTRAINT;
                C0331c.b bVar9 = C0331c.b.LEFT;
                C0331c.b bVar10 = C0331c.b.TOP;
                boolean zIsInEditMode = isInEditMode();
                int childCount2 = getChildCount();
                C0332d.a aVar12 = aVar11;
                if (zIsInEditMode) {
                    int i47 = 0;
                    while (i47 < childCount2) {
                        View childAt = constraintLayout.getChildAt(i47);
                        C0332d.a aVar13 = aVar10;
                        try {
                            bVar6 = bVar10;
                            try {
                                String resourceName = getResources().getResourceName(childAt.getId());
                                i44 = paddingTop;
                                try {
                                    constraintLayout.m139g(0, resourceName, Integer.valueOf(childAt.getId()));
                                    int iIndexOf3 = resourceName.indexOf(47);
                                    if (iIndexOf3 != -1) {
                                        resourceName = resourceName.substring(iIndexOf3 + 1);
                                    }
                                    constraintLayout.m135c(childAt.getId()).f2321Z = resourceName;
                                } catch (Resources.NotFoundException unused) {
                                }
                            } catch (Resources.NotFoundException unused2) {
                                i44 = paddingTop;
                            }
                        } catch (Resources.NotFoundException unused3) {
                            bVar6 = bVar10;
                        }
                        i47++;
                        aVar10 = aVar13;
                        bVar10 = bVar6;
                        paddingTop = i44;
                    }
                }
                C0332d.a aVar14 = aVar10;
                C0331c.b bVar11 = bVar10;
                int i48 = paddingTop;
                for (int i49 = 0; i49 < childCount2; i49++) {
                    C0332d c0332dM136d = constraintLayout.m136d(constraintLayout.getChildAt(i49));
                    if (c0332dM136d != null) {
                        c0332dM136d.mo1359r();
                    }
                }
                if (constraintLayout.f447m != -1) {
                    for (int i50 = 0; i50 < childCount2; i50++) {
                        View childAt2 = constraintLayout.getChildAt(i50);
                        if (childAt2.getId() == constraintLayout.f447m && (childAt2 instanceof C0346d)) {
                            constraintLayout.f446l = ((C0346d) childAt2).getConstraintSet();
                        }
                    }
                }
                C0345c c0345c = constraintLayout.f446l;
                if (c0345c != null) {
                    int childCount3 = getChildCount();
                    HashSet<Integer> hashSet = new HashSet(c0345c.f2430a.keySet());
                    int i51 = 0;
                    while (i51 < childCount3) {
                        int i52 = childCount3;
                        View childAt3 = constraintLayout.getChildAt(i51);
                        int i53 = paddingLeft;
                        int id = childAt3.getId();
                        int i54 = size3;
                        if (id == -1) {
                            throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                        }
                        int i55 = mode;
                        if (c0345c.f2430a.containsKey(Integer.valueOf(id))) {
                            hashSet.remove(Integer.valueOf(id));
                            C0345c.a aVar15 = c0345c.f2430a.get(Integer.valueOf(id));
                            if (childAt3 instanceof C0343a) {
                                i43 = 1;
                                aVar15.f2496t0 = 1;
                            } else {
                                i43 = 1;
                            }
                            i42 = iM1349h2;
                            int i56 = aVar15.f2496t0;
                            i41 = iM1355n2;
                            if (i56 != -1 && i56 == i43) {
                                C0343a c0343a = (C0343a) childAt3;
                                c0343a.setId(id);
                                c0343a.setType(aVar15.f2494s0);
                                c0343a.setAllowsGoneWidget(aVar15.f2492r0);
                                int[] iArr2 = aVar15.f2498u0;
                                if (iArr2 != null) {
                                    c0343a.setReferencedIds(iArr2);
                                } else {
                                    String str2 = aVar15.f2500v0;
                                    if (str2 != null) {
                                        int[] iArrM1397a = c0345c.m1397a(c0343a, str2);
                                        aVar15.f2498u0 = iArrM1397a;
                                        c0343a.setReferencedIds(iArrM1397a);
                                    }
                                }
                            }
                            C0065a c0065a3 = (C0065a) childAt3.getLayoutParams();
                            aVar15.m1400a(c0065a3);
                            childAt3.setLayoutParams(c0065a3);
                            childAt3.setVisibility(aVar15.f2440J);
                            int i57 = Build.VERSION.SDK_INT;
                            childAt3.setAlpha(aVar15.f2451U);
                            childAt3.setRotation(aVar15.f2454X);
                            childAt3.setRotationX(aVar15.f2455Y);
                            childAt3.setRotationY(aVar15.f2456Z);
                            childAt3.setScaleX(aVar15.f2458a0);
                            childAt3.setScaleY(aVar15.f2460b0);
                            if (!Float.isNaN(aVar15.f2462c0)) {
                                childAt3.setPivotX(aVar15.f2462c0);
                            }
                            if (!Float.isNaN(aVar15.f2464d0)) {
                                childAt3.setPivotY(aVar15.f2464d0);
                            }
                            childAt3.setTranslationX(aVar15.f2466e0);
                            childAt3.setTranslationY(aVar15.f2468f0);
                            if (i57 >= 21) {
                                childAt3.setTranslationZ(aVar15.f2470g0);
                                if (aVar15.f2452V) {
                                    childAt3.setElevation(aVar15.f2453W);
                                }
                            }
                        } else {
                            i41 = iM1355n2;
                            i42 = iM1349h2;
                        }
                        i51++;
                        childCount3 = i52;
                        paddingLeft = i53;
                        size3 = i54;
                        mode = i55;
                        iM1349h2 = i42;
                        iM1355n2 = i41;
                    }
                    i3 = iM1355n2;
                    i4 = iM1349h2;
                    i26 = paddingLeft;
                    i27 = size3;
                    i8 = mode;
                    for (Integer num : hashSet) {
                        C0345c.a aVar16 = c0345c.f2430a.get(num);
                        int i58 = aVar16.f2496t0;
                        if (i58 != -1 && i58 == 1) {
                            C0343a c0343a2 = new C0343a(getContext());
                            c0343a2.setId(num.intValue());
                            int[] iArr3 = aVar16.f2498u0;
                            if (iArr3 != null) {
                                c0343a2.setReferencedIds(iArr3);
                            } else {
                                String str3 = aVar16.f2500v0;
                                if (str3 != null) {
                                    int[] iArrM1397a2 = c0345c.m1397a(c0343a2, str3);
                                    aVar16.f2498u0 = iArrM1397a2;
                                    c0343a2.setReferencedIds(iArrM1397a2);
                                }
                            }
                            c0343a2.setType(aVar16.f2494s0);
                            C0065a c0065aGenerateDefaultLayoutParams = generateDefaultLayoutParams();
                            c0343a2.m1396f();
                            aVar16.m1400a(c0065aGenerateDefaultLayoutParams);
                            constraintLayout.addView(c0343a2, c0065aGenerateDefaultLayoutParams);
                        }
                        if (aVar16.f2457a) {
                            C0347e c0347e = new C0347e(getContext());
                            c0347e.setId(num.intValue());
                            C0065a c0065aGenerateDefaultLayoutParams2 = generateDefaultLayoutParams();
                            aVar16.m1400a(c0065aGenerateDefaultLayoutParams2);
                            constraintLayout.addView(c0347e, c0065aGenerateDefaultLayoutParams2);
                        }
                    }
                } else {
                    i3 = iM1355n2;
                    i4 = iM1349h2;
                    i26 = paddingLeft;
                    i27 = size3;
                    i8 = mode;
                }
                constraintLayout.f439e.f2419i0.clear();
                int size6 = constraintLayout.f437c.size();
                if (size6 > 0) {
                    for (int i59 = 0; i59 < size6; i59++) {
                        constraintLayout.f437c.get(i59).m1395e(constraintLayout);
                    }
                }
                for (int i60 = 0; i60 < childCount2; i60++) {
                    View childAt4 = constraintLayout.getChildAt(i60);
                    if (childAt4 instanceof C0348f) {
                        C0348f c0348f = (C0348f) childAt4;
                        if (c0348f.f2518b == -1 && !c0348f.isInEditMode()) {
                            c0348f.setVisibility(c0348f.f2520d);
                        }
                        View viewFindViewById = constraintLayout.findViewById(c0348f.f2518b);
                        c0348f.f2519c = viewFindViewById;
                        if (viewFindViewById != null) {
                            ((C0065a) viewFindViewById.getLayoutParams()).f476Z = true;
                            c0348f.f2519c.setVisibility(0);
                            c0348f.setVisibility(0);
                        }
                    }
                }
                int i61 = 0;
                while (i61 < childCount2) {
                    View childAt5 = constraintLayout.getChildAt(i61);
                    C0332d c0332dM136d2 = constraintLayout.m136d(childAt5);
                    if (c0332dM136d2 == null) {
                        aVar5 = aVar8;
                        i28 = childCount2;
                        aVar6 = aVar12;
                        aVar14 = aVar14;
                        bVar = bVar11;
                        i48 = i48;
                        i26 = i26;
                        i27 = i27;
                        i61 = i61;
                    } else {
                        C0065a c0065a4 = (C0065a) childAt5.getLayoutParams();
                        c0065a4.m141a();
                        if (zIsInEditMode) {
                            try {
                                String resourceName2 = getResources().getResourceName(childAt5.getId());
                                constraintLayout.m139g(0, resourceName2, Integer.valueOf(childAt5.getId()));
                                constraintLayout.m135c(childAt5.getId()).f2321Z = resourceName2.substring(resourceName2.indexOf("id/") + 3);
                            } catch (Resources.NotFoundException unused4) {
                            }
                        }
                        c0332dM136d2.f2320Y = childAt5.getVisibility();
                        if (c0065a4.f476Z) {
                            c0332dM136d2.f2320Y = 8;
                        }
                        c0332dM136d2.f2319X = childAt5;
                        C0333e c0333e8 = constraintLayout.f439e;
                        c0333e8.f2419i0.add(c0332dM136d2);
                        C0332d c0332d5 = c0332dM136d2.f2299D;
                        if (c0332d5 != null) {
                            ((C0342n) c0332d5).f2419i0.remove(c0332dM136d2);
                            c0332dM136d2.f2299D = null;
                        }
                        c0332dM136d2.f2299D = c0333e8;
                        if (!c0065a4.f472V || !c0065a4.f471U) {
                            constraintLayout.f438d.add(c0332dM136d2);
                        }
                        if (c0065a4.f474X) {
                            C0335g c0335g = (C0335g) c0332dM136d2;
                            int i62 = c0065a4.f492h0;
                            int i63 = c0065a4.f494i0;
                            float f3 = c0065a4.f496j0;
                            if (f3 != -1.0f) {
                                if (f3 > -1.0f) {
                                    c0335g.f2387i0 = f3;
                                    c0335g.f2388j0 = -1;
                                    c0335g.f2389k0 = -1;
                                }
                            } else if (i62 != -1) {
                                if (i62 > -1) {
                                    c0335g.f2387i0 = -1.0f;
                                    c0335g.f2388j0 = i62;
                                    c0335g.f2389k0 = -1;
                                }
                            } else if (i63 != -1 && i63 > -1) {
                                c0335g.f2387i0 = -1.0f;
                                c0335g.f2388j0 = -1;
                                c0335g.f2389k0 = i63;
                            }
                        } else if (c0065a4.f483d != -1 || c0065a4.f485e != -1 || c0065a4.f487f != -1 || c0065a4.f489g != -1 || c0065a4.f504q != -1 || c0065a4.f503p != -1 || c0065a4.f505r != -1 || c0065a4.f506s != -1 || c0065a4.f491h != -1 || c0065a4.f493i != -1 || c0065a4.f495j != -1 || c0065a4.f497k != -1 || c0065a4.f499l != -1 || c0065a4.f466P != -1 || c0065a4.f467Q != -1 || c0065a4.f500m != -1 || ((ViewGroup.MarginLayoutParams) c0065a4).width == -1 || ((ViewGroup.MarginLayoutParams) c0065a4).height == -1) {
                            int i64 = c0065a4.f478a0;
                            int i65 = c0065a4.f480b0;
                            int i66 = c0065a4.f482c0;
                            int i67 = c0065a4.f484d0;
                            int i68 = c0065a4.f486e0;
                            int i69 = c0065a4.f488f0;
                            i28 = childCount2;
                            float f4 = c0065a4.f490g0;
                            int i70 = c0065a4.f500m;
                            aVar5 = aVar8;
                            if (i70 != -1) {
                                C0332d c0332dM135c5 = constraintLayout.m135c(i70);
                                if (c0332dM135c5 != null) {
                                    float f5 = c0065a4.f502o;
                                    int i71 = c0065a4.f501n;
                                    C0331c.b bVar12 = C0331c.b.CENTER;
                                    c0332dM136d2.m1356o(bVar12, c0332dM135c5, bVar12, i71, 0);
                                    c0332dM136d2.f2347r = f5;
                                }
                                c0065a2 = c0065a4;
                                aVar7 = aVar12;
                                aVar14 = aVar14;
                                bVar = bVar11;
                                i48 = i48;
                                i26 = i26;
                                i27 = i27;
                                i61 = i61;
                                i31 = -1;
                            } else {
                                c0065a2 = c0065a4;
                                if (i64 != -1) {
                                    C0332d c0332dM135c6 = constraintLayout.m135c(i64);
                                    if (c0332dM135c6 != null) {
                                        c0332d2 = c0332dM135c6;
                                        i29 = ((ViewGroup.MarginLayoutParams) c0065a2).leftMargin;
                                        bVar2 = bVar9;
                                        c0332dM136d2.m1356o(bVar9, c0332d2, bVar2, i29, i68);
                                    }
                                } else if (i65 != -1 && (c0332dM135c = constraintLayout.m135c(i65)) != null) {
                                    c0332d2 = c0332dM135c;
                                    i29 = ((ViewGroup.MarginLayoutParams) c0065a2).leftMargin;
                                    bVar2 = bVar8;
                                    c0332dM136d2.m1356o(bVar9, c0332d2, bVar2, i29, i68);
                                }
                                if (i66 != -1) {
                                    C0332d c0332dM135c7 = constraintLayout.m135c(i66);
                                    if (c0332dM135c7 != null) {
                                        c0332d3 = c0332dM135c7;
                                        i30 = ((ViewGroup.MarginLayoutParams) c0065a2).rightMargin;
                                        bVar3 = bVar9;
                                        i31 = -1;
                                        aVar7 = aVar12;
                                        c0332dM136d2.m1356o(bVar8, c0332d3, bVar3, i30, i69);
                                    } else {
                                        aVar7 = aVar12;
                                        i31 = -1;
                                    }
                                } else if (i67 == -1 || (c0332dM135c2 = constraintLayout.m135c(i67)) == null) {
                                    aVar7 = aVar12;
                                    i31 = -1;
                                } else {
                                    c0332d3 = c0332dM135c2;
                                    i30 = ((ViewGroup.MarginLayoutParams) c0065a2).rightMargin;
                                    bVar3 = bVar8;
                                    i31 = -1;
                                    aVar7 = aVar12;
                                    c0332dM136d2.m1356o(bVar8, c0332d3, bVar3, i30, i69);
                                }
                                int i72 = c0065a2.f491h;
                                if (i72 != i31) {
                                    C0332d c0332dM135c8 = constraintLayout.m135c(i72);
                                    if (c0332dM135c8 != null) {
                                        c0332d4 = c0332dM135c8;
                                        i32 = ((ViewGroup.MarginLayoutParams) c0065a2).topMargin;
                                        i33 = c0065a2.f508u;
                                        bVar4 = bVar11;
                                        c0332dM136d2.m1356o(bVar11, c0332d4, bVar4, i32, i33);
                                    }
                                } else {
                                    int i73 = c0065a2.f493i;
                                    if (i73 != i31 && (c0332dM135c3 = constraintLayout.m135c(i73)) != null) {
                                        c0332d4 = c0332dM135c3;
                                        i32 = ((ViewGroup.MarginLayoutParams) c0065a2).topMargin;
                                        i33 = c0065a2.f508u;
                                        bVar4 = bVar7;
                                        c0332dM136d2.m1356o(bVar11, c0332d4, bVar4, i32, i33);
                                    }
                                }
                                int i74 = c0065a2.f495j;
                                if (i74 != i31) {
                                    c0332dM135c4 = constraintLayout.m135c(i74);
                                    if (c0332dM135c4 != null) {
                                        i34 = ((ViewGroup.MarginLayoutParams) c0065a2).bottomMargin;
                                        i35 = c0065a2.f510w;
                                        bVar5 = bVar11;
                                        c0332dM136d2.m1356o(bVar7, c0332dM135c4, bVar5, i34, i35);
                                    }
                                } else {
                                    int i75 = c0065a2.f497k;
                                    if (i75 != i31 && (c0332dM135c4 = constraintLayout.m135c(i75)) != null) {
                                        i34 = ((ViewGroup.MarginLayoutParams) c0065a2).bottomMargin;
                                        i35 = c0065a2.f510w;
                                        bVar5 = bVar7;
                                        c0332dM136d2.m1356o(bVar7, c0332dM135c4, bVar5, i34, i35);
                                    }
                                }
                                int i76 = c0065a2.f499l;
                                if (i76 != i31) {
                                    View view3 = constraintLayout.f436b.get(i76);
                                    C0332d c0332dM135c9 = constraintLayout.m135c(c0065a2.f499l);
                                    if (c0332dM135c9 == null || view3 == null || !(view3.getLayoutParams() instanceof C0065a)) {
                                        bVar = bVar11;
                                    } else {
                                        C0065a c0065a5 = (C0065a) view3.getLayoutParams();
                                        c0065a2.f473W = true;
                                        c0065a5.f473W = true;
                                        C0331c.b bVar13 = C0331c.b.BASELINE;
                                        c0332dM136d2.mo1347f(bVar13).m1335a(c0332dM135c9.mo1347f(bVar13), 0, -1, C0331c.a.STRONG, 0, true);
                                        bVar = bVar11;
                                        c0332dM136d2.mo1347f(bVar).m1338d();
                                        c0332dM136d2.mo1347f(bVar7).m1338d();
                                    }
                                } else {
                                    bVar = bVar11;
                                }
                                if (f4 >= 0.0f && f4 != 0.5f) {
                                    c0332dM136d2.f2317V = f4;
                                }
                                float f6 = c0065a2.f451A;
                                if (f6 >= 0.0f && f6 != 0.5f) {
                                    c0332dM136d2.f2318W = f6;
                                }
                            }
                            if (zIsInEditMode && ((i40 = c0065a2.f466P) != i31 || c0065a2.f467Q != i31)) {
                                int i77 = c0065a2.f467Q;
                                c0332dM136d2.f2304I = i40;
                                c0332dM136d2.f2305J = i77;
                            }
                            if (c0065a2.f471U) {
                                aVar6 = aVar7;
                                c0332dM136d2.m1364y(aVar9);
                                i36 = ((ViewGroup.MarginLayoutParams) c0065a2).width;
                            } else {
                                if (((ViewGroup.MarginLayoutParams) c0065a2).width == i31) {
                                    c0332dM136d2.m1364y(aVar14);
                                    c0332dM136d2.mo1347f(bVar9).f2277e = ((ViewGroup.MarginLayoutParams) c0065a2).leftMargin;
                                    c0332dM136d2.mo1347f(bVar8).f2277e = ((ViewGroup.MarginLayoutParams) c0065a2).rightMargin;
                                    aVar6 = aVar7;
                                } else {
                                    aVar6 = aVar7;
                                    c0332dM136d2.m1364y(aVar6);
                                    i36 = 0;
                                }
                                if (c0065a2.f472V) {
                                    c0332dM136d2.m1341B(aVar9);
                                    i37 = ((ViewGroup.MarginLayoutParams) c0065a2).height;
                                } else {
                                    if (((ViewGroup.MarginLayoutParams) c0065a2).height == i31) {
                                        c0332dM136d2.m1341B(aVar14);
                                        c0332dM136d2.mo1347f(bVar).f2277e = ((ViewGroup.MarginLayoutParams) c0065a2).topMargin;
                                        c0332dM136d2.mo1347f(bVar7).f2277e = ((ViewGroup.MarginLayoutParams) c0065a2).bottomMargin;
                                    } else {
                                        c0332dM136d2.m1341B(aVar6);
                                        i37 = 0;
                                    }
                                    str = c0065a2.f452B;
                                    if (str != null) {
                                        if (str.length() == 0) {
                                            c0332dM136d2.f2302G = 0.0f;
                                        } else {
                                            int length = str.length();
                                            iIndexOf = str.indexOf(44);
                                            if (iIndexOf > 0 || iIndexOf >= length - 1) {
                                                i38 = 0;
                                                i39 = -1;
                                            } else {
                                                String strSubstring2 = str.substring(0, iIndexOf);
                                                i39 = strSubstring2.equalsIgnoreCase("W") ? 0 : strSubstring2.equalsIgnoreCase("H") ? 1 : -1;
                                                i38 = iIndexOf + 1;
                                            }
                                            iIndexOf2 = str.indexOf(58);
                                            if (iIndexOf2 >= 0 || iIndexOf2 >= length - 1) {
                                                strSubstring = str.substring(i38);
                                                if (strSubstring.length() > 0) {
                                                    fAbs = Float.parseFloat(strSubstring);
                                                } else {
                                                    fAbs = 0.0f;
                                                }
                                            } else {
                                                String strSubstring3 = str.substring(i38, iIndexOf2);
                                                String strSubstring4 = str.substring(iIndexOf2 + 1);
                                                if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                                                    fAbs = 0.0f;
                                                } else {
                                                    try {
                                                        float f7 = Float.parseFloat(strSubstring3);
                                                        float f8 = Float.parseFloat(strSubstring4);
                                                        if (f7 <= 0.0f || f8 <= 0.0f) {
                                                            fAbs = 0.0f;
                                                        } else {
                                                            fAbs = i39 == 1 ? Math.abs(f8 / f7) : Math.abs(f7 / f8);
                                                        }
                                                    } catch (NumberFormatException unused5) {
                                                    }
                                                }
                                            }
                                            if (fAbs > 0.0f) {
                                                c0332dM136d2.f2302G = fAbs;
                                                c0332dM136d2.f2303H = i39;
                                            }
                                        }
                                    }
                                    float f9 = c0065a2.f454D;
                                    float[] fArr = c0332dM136d2.f2333f0;
                                    fArr[0] = f9;
                                    fArr[1] = c0065a2.f455E;
                                    c0332dM136d2.f2329d0 = c0065a2.f456F;
                                    c0332dM136d2.f2331e0 = c0065a2.f457G;
                                    int i78 = c0065a2.f458H;
                                    int i79 = c0065a2.f460J;
                                    int i80 = c0065a2.f462L;
                                    f = c0065a2.f464N;
                                    c0332dM136d2.f2330e = i78;
                                    c0332dM136d2.f2336h = i79;
                                    c0332dM136d2.f2338i = i80;
                                    c0332dM136d2.f2339j = f;
                                    if (f < 1.0f && i78 == 0) {
                                        c0332dM136d2.f2330e = 2;
                                    }
                                    int i81 = c0065a2.f459I;
                                    int i82 = c0065a2.f461K;
                                    int i83 = c0065a2.f463M;
                                    f2 = c0065a2.f465O;
                                    c0332dM136d2.f2332f = i81;
                                    c0332dM136d2.f2340k = i82;
                                    c0332dM136d2.f2341l = i83;
                                    c0332dM136d2.f2342m = f2;
                                    if (f2 >= 1.0f && i81 == 0) {
                                        c0332dM136d2.f2332f = 2;
                                    }
                                }
                                c0332dM136d2.m1362w(i37);
                                str = c0065a2.f452B;
                                if (str != null) {
                                    if (str.length() == 0) {
                                        c0332dM136d2.f2302G = 0.0f;
                                    } else {
                                        int length2 = str.length();
                                        iIndexOf = str.indexOf(44);
                                        if (iIndexOf > 0) {
                                            i38 = 0;
                                            i39 = -1;
                                        } else {
                                            i38 = 0;
                                            i39 = -1;
                                        }
                                        iIndexOf2 = str.indexOf(58);
                                        if (iIndexOf2 >= 0) {
                                            strSubstring = str.substring(i38);
                                            if (strSubstring.length() > 0) {
                                                fAbs = Float.parseFloat(strSubstring);
                                            } else {
                                                fAbs = 0.0f;
                                            }
                                        } else {
                                            strSubstring = str.substring(i38);
                                            if (strSubstring.length() > 0) {
                                                fAbs = Float.parseFloat(strSubstring);
                                            } else {
                                                fAbs = 0.0f;
                                            }
                                        }
                                        if (fAbs > 0.0f) {
                                            c0332dM136d2.f2302G = fAbs;
                                            c0332dM136d2.f2303H = i39;
                                        }
                                    }
                                }
                                float f10 = c0065a2.f454D;
                                float[] fArr2 = c0332dM136d2.f2333f0;
                                fArr2[0] = f10;
                                fArr2[1] = c0065a2.f455E;
                                c0332dM136d2.f2329d0 = c0065a2.f456F;
                                c0332dM136d2.f2331e0 = c0065a2.f457G;
                                int i710 = c0065a2.f458H;
                                int i711 = c0065a2.f460J;
                                int i84 = c0065a2.f462L;
                                f = c0065a2.f464N;
                                c0332dM136d2.f2330e = i710;
                                c0332dM136d2.f2336h = i711;
                                c0332dM136d2.f2338i = i84;
                                c0332dM136d2.f2339j = f;
                                if (f < 1.0f) {
                                    c0332dM136d2.f2330e = 2;
                                }
                                int i85 = c0065a2.f459I;
                                int i86 = c0065a2.f461K;
                                int i87 = c0065a2.f463M;
                                f2 = c0065a2.f465O;
                                c0332dM136d2.f2332f = i85;
                                c0332dM136d2.f2340k = i86;
                                c0332dM136d2.f2341l = i87;
                                c0332dM136d2.f2342m = f2;
                                if (f2 >= 1.0f) {
                                }
                            }
                            c0332dM136d2.m1342C(i36);
                            if (c0065a2.f472V) {
                                if (((ViewGroup.MarginLayoutParams) c0065a2).height == i31) {
                                    c0332dM136d2.m1341B(aVar14);
                                    c0332dM136d2.mo1347f(bVar).f2277e = ((ViewGroup.MarginLayoutParams) c0065a2).topMargin;
                                    c0332dM136d2.mo1347f(bVar7).f2277e = ((ViewGroup.MarginLayoutParams) c0065a2).bottomMargin;
                                } else {
                                    c0332dM136d2.m1341B(aVar6);
                                    i37 = 0;
                                }
                                str = c0065a2.f452B;
                                if (str != null) {
                                    if (str.length() == 0) {
                                        c0332dM136d2.f2302G = 0.0f;
                                    } else {
                                        int length3 = str.length();
                                        iIndexOf = str.indexOf(44);
                                        if (iIndexOf > 0) {
                                            i38 = 0;
                                            i39 = -1;
                                        } else {
                                            i38 = 0;
                                            i39 = -1;
                                        }
                                        iIndexOf2 = str.indexOf(58);
                                        if (iIndexOf2 >= 0) {
                                            strSubstring = str.substring(i38);
                                            if (strSubstring.length() > 0) {
                                                fAbs = Float.parseFloat(strSubstring);
                                            } else {
                                                fAbs = 0.0f;
                                            }
                                        } else {
                                            strSubstring = str.substring(i38);
                                            if (strSubstring.length() > 0) {
                                                fAbs = Float.parseFloat(strSubstring);
                                            } else {
                                                fAbs = 0.0f;
                                            }
                                        }
                                        if (fAbs > 0.0f) {
                                            c0332dM136d2.f2302G = fAbs;
                                            c0332dM136d2.f2303H = i39;
                                        }
                                    }
                                }
                                float f11 = c0065a2.f454D;
                                float[] fArr3 = c0332dM136d2.f2333f0;
                                fArr3[0] = f11;
                                fArr3[1] = c0065a2.f455E;
                                c0332dM136d2.f2329d0 = c0065a2.f456F;
                                c0332dM136d2.f2331e0 = c0065a2.f457G;
                                int i712 = c0065a2.f458H;
                                int i713 = c0065a2.f460J;
                                int i88 = c0065a2.f462L;
                                f = c0065a2.f464N;
                                c0332dM136d2.f2330e = i712;
                                c0332dM136d2.f2336h = i713;
                                c0332dM136d2.f2338i = i88;
                                c0332dM136d2.f2339j = f;
                                if (f < 1.0f) {
                                    c0332dM136d2.f2330e = 2;
                                }
                                int i89 = c0065a2.f459I;
                                int i810 = c0065a2.f461K;
                                int i811 = c0065a2.f463M;
                                f2 = c0065a2.f465O;
                                c0332dM136d2.f2332f = i89;
                                c0332dM136d2.f2340k = i810;
                                c0332dM136d2.f2341l = i811;
                                c0332dM136d2.f2342m = f2;
                                if (f2 >= 1.0f) {
                                }
                            } else {
                                c0332dM136d2.m1341B(aVar9);
                                i37 = ((ViewGroup.MarginLayoutParams) c0065a2).height;
                            }
                            c0332dM136d2.m1362w(i37);
                            str = c0065a2.f452B;
                            if (str != null) {
                                if (str.length() == 0) {
                                    c0332dM136d2.f2302G = 0.0f;
                                } else {
                                    int length4 = str.length();
                                    iIndexOf = str.indexOf(44);
                                    if (iIndexOf > 0) {
                                        i38 = 0;
                                        i39 = -1;
                                    } else {
                                        i38 = 0;
                                        i39 = -1;
                                    }
                                    iIndexOf2 = str.indexOf(58);
                                    if (iIndexOf2 >= 0) {
                                        strSubstring = str.substring(i38);
                                        if (strSubstring.length() > 0) {
                                            fAbs = Float.parseFloat(strSubstring);
                                        } else {
                                            fAbs = 0.0f;
                                        }
                                    } else {
                                        strSubstring = str.substring(i38);
                                        if (strSubstring.length() > 0) {
                                            fAbs = Float.parseFloat(strSubstring);
                                        } else {
                                            fAbs = 0.0f;
                                        }
                                    }
                                    if (fAbs > 0.0f) {
                                        c0332dM136d2.f2302G = fAbs;
                                        c0332dM136d2.f2303H = i39;
                                    }
                                }
                            }
                            float f12 = c0065a2.f454D;
                            float[] fArr4 = c0332dM136d2.f2333f0;
                            fArr4[0] = f12;
                            fArr4[1] = c0065a2.f455E;
                            c0332dM136d2.f2329d0 = c0065a2.f456F;
                            c0332dM136d2.f2331e0 = c0065a2.f457G;
                            int i714 = c0065a2.f458H;
                            int i715 = c0065a2.f460J;
                            int i812 = c0065a2.f462L;
                            f = c0065a2.f464N;
                            c0332dM136d2.f2330e = i714;
                            c0332dM136d2.f2336h = i715;
                            c0332dM136d2.f2338i = i812;
                            c0332dM136d2.f2339j = f;
                            if (f < 1.0f) {
                                c0332dM136d2.f2330e = 2;
                            }
                            int i813 = c0065a2.f459I;
                            int i814 = c0065a2.f461K;
                            int i815 = c0065a2.f463M;
                            f2 = c0065a2.f465O;
                            c0332dM136d2.f2332f = i813;
                            c0332dM136d2.f2340k = i814;
                            c0332dM136d2.f2341l = i815;
                            c0332dM136d2.f2342m = f2;
                            if (f2 >= 1.0f) {
                            }
                        }
                        aVar5 = aVar8;
                        i28 = childCount2;
                        aVar6 = aVar12;
                        aVar14 = aVar14;
                        bVar = bVar11;
                        i48 = i48;
                        i26 = i26;
                        i27 = i27;
                        i61 = i61;
                    }
                    int i90 = i61 + 1;
                    bVar11 = bVar;
                    aVar12 = aVar6;
                    i61 = i90;
                    i48 = i48;
                    i26 = i26;
                    childCount2 = i28;
                    aVar8 = aVar5;
                    i27 = i27;
                    aVar14 = aVar14;
                }
                aVar3 = aVar8;
                i5 = i48;
                i6 = i26;
                i7 = i27;
            } else {
                i3 = iM1355n2;
                i4 = iM1349h2;
                i5 = paddingTop;
                i6 = paddingLeft;
                i7 = size3;
                aVar3 = aVar8;
                i8 = mode;
            }
            z = true;
        } else {
            i3 = iM1355n2;
            i4 = iM1349h2;
            i5 = paddingTop;
            i6 = paddingLeft;
            i7 = size3;
            aVar3 = aVar8;
            i8 = mode;
            size2 = size2;
            z = false;
        }
        boolean z8 = (constraintLayout.f445k & 8) == 8;
        if (z8) {
            C0333e c0333e9 = constraintLayout.f439e;
            c0333e9.m1370J();
            c0333e9.mo1332c(c0333e9.f2374w0);
            C0333e c0333e10 = constraintLayout.f439e;
            aVar4 = aVar3;
            if (c0333e10.f2298C[0] == aVar4 || (c0339k2 = c0333e10.f2326c) == null) {
                i10 = i3;
            } else {
                i10 = i3;
                c0339k2.m1387e(i10);
            }
            if (c0333e10.f2298C[1] == aVar4 || (c0339k = c0333e10.f2328d) == null) {
                i9 = i4;
            } else {
                i9 = i4;
                c0339k.m1387e(i9);
            }
            m138f(i, i2);
        } else {
            i9 = i4;
            i10 = i3;
            aVar4 = aVar3;
            m137e(i, i2);
        }
        int childCount4 = getChildCount();
        for (int i91 = 0; i91 < childCount4; i91++) {
            View childAt6 = constraintLayout.getChildAt(i91);
            if (childAt6 instanceof C0348f) {
                ((C0348f) childAt6).m1402a();
            }
        }
        int size7 = constraintLayout.f437c.size();
        if (size7 > 0) {
            for (int i92 = 0; i92 < size7; i92++) {
                constraintLayout.f437c.get(i92).m1394d();
            }
        }
        if (getChildCount() > 0 && z) {
            C0304a.m1195c(constraintLayout.f439e);
        }
        C0333e c0333e11 = constraintLayout.f439e;
        if (c0333e11.f2369r0) {
            if (c0333e11.f2370s0) {
                i13 = i8;
                if (i13 == Integer.MIN_VALUE) {
                    int i93 = c0333e11.f2372u0;
                    i12 = size2;
                    if (i93 < i12) {
                        c0333e11.m1342C(i93);
                    }
                    constraintLayout.f439e.m1364y(aVar9);
                } else {
                    i12 = size2;
                }
            } else {
                i12 = size2;
                i13 = i8;
            }
            C0333e c0333e12 = constraintLayout.f439e;
            if (c0333e12.f2371t0) {
                i11 = mode2;
                if (i11 == Integer.MIN_VALUE) {
                    int i94 = c0333e12.f2373v0;
                    i14 = i7;
                    if (i94 < i14) {
                        c0333e12.m1362w(i94);
                    }
                    constraintLayout.f439e.m1341B(aVar9);
                }
                if ((constraintLayout.f445k & 32) == 32) {
                    iM1355n = constraintLayout.f439e.m1355n();
                    iM1349h = constraintLayout.f439e.m1349h();
                    if (constraintLayout.f449o != iM1355n) {
                        i25 = 1073741824;
                        if (i13 == 1073741824) {
                            C0304a.m1200h(constraintLayout.f439e.f2368q0, 0, iM1355n);
                        }
                    } else {
                        i25 = 1073741824;
                    }
                    if (constraintLayout.f450p != iM1349h && i11 == i25) {
                        C0304a.m1200h(constraintLayout.f439e.f2368q0, 1, iM1349h);
                    }
                    c0333e2 = constraintLayout.f439e;
                    if (!c0333e2.f2370s0 && c0333e2.f2372u0 > i12) {
                        C0304a.m1200h(c0333e2.f2368q0, 0, i12);
                    }
                    c0333e3 = constraintLayout.f439e;
                    if (!c0333e3.f2371t0 && c0333e3.f2373v0 > i14) {
                        C0304a.m1200h(c0333e3.f2368q0, 1, i14);
                    }
                    if (getChildCount() > 0) {
                        m140h();
                    }
                    size = constraintLayout.f438d.size();
                    int paddingBottom2 = getPaddingBottom() + i5;
                    paddingRight = getPaddingRight() + i6;
                    if (size > 0) {
                        if (constraintLayout.f439e.m1350i() == aVar4) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (constraintLayout.f439e.m1354m() == aVar4) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        int iMax3 = Math.max(constraintLayout.f439e.m1355n(), constraintLayout.f440f);
                        iMax = Math.max(constraintLayout.f439e.m1349h(), constraintLayout.f441g);
                        iMax2 = iMax3;
                        i17 = 0;
                        z4 = false;
                        int iCombineMeasuredStates = 0;
                        while (true) {
                            i18 = size;
                            if (i17 < size) {
                                break;
                            }
                            C0332d c0332d6 = constraintLayout.f438d.get(i17);
                            int i95 = i9;
                            view2 = (View) c0332d6.f2319X;
                            if (view2 == null) {
                                i22 = i10;
                            } else {
                                i22 = i10;
                                c0065a = (C0065a) view2.getLayoutParams();
                                if (c0065a.f475Y && !c0065a.f474X) {
                                    z6 = z4;
                                    if (view2.getVisibility() != 8 && (!z8 || !c0332d6.m1353l().m1390c() || !c0332d6.m1352k().m1390c())) {
                                        int i96 = ((ViewGroup.MarginLayoutParams) c0065a).width;
                                        int childMeasureSpec = (i96 == -2 && c0065a.f471U) ? ViewGroup.getChildMeasureSpec(i, paddingRight, i96) : View.MeasureSpec.makeMeasureSpec(c0332d6.m1355n(), 1073741824);
                                        int i97 = ((ViewGroup.MarginLayoutParams) c0065a).height;
                                        paddingRight = paddingRight;
                                        view2.measure(childMeasureSpec, (i97 == -2 && c0065a.f472V) ? ViewGroup.getChildMeasureSpec(i2, paddingBottom2, i97) : View.MeasureSpec.makeMeasureSpec(c0332d6.m1349h(), 1073741824));
                                        int measuredWidth = view2.getMeasuredWidth();
                                        int measuredHeight = view2.getMeasuredHeight();
                                        if (measuredWidth != c0332d6.m1355n()) {
                                            c0332d6.m1342C(measuredWidth);
                                            if (z8) {
                                                c0332d6.m1353l().m1387e(measuredWidth);
                                            }
                                            if (z2 && (i24 = c0332d6.f2304I + c0332d6.f2300E) > iMax2) {
                                                iMax2 = Math.max(iMax2, c0332d6.mo1347f(bVar8).m1336b() + i24);
                                            }
                                            z6 = true;
                                        }
                                        if (measuredHeight != c0332d6.m1349h()) {
                                            c0332d6.m1362w(measuredHeight);
                                            if (z8) {
                                                c0332d6.m1352k().m1387e(measuredHeight);
                                            }
                                            if (z3 && (i23 = c0332d6.f2305J + c0332d6.f2301F) > iMax) {
                                                iMax = Math.max(iMax, c0332d6.mo1347f(bVar7).m1336b() + i23);
                                            }
                                            z6 = true;
                                        }
                                        if (c0065a.f473W && (baseline = view2.getBaseline()) != -1 && baseline != c0332d6.f2312Q) {
                                            c0332d6.f2312Q = baseline;
                                            z6 = true;
                                        }
                                        iCombineMeasuredStates = ViewGroup.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
                                    }
                                    z4 = z6;
                                    i17++;
                                    constraintLayout = this;
                                    size = i18;
                                    paddingRight = paddingRight;
                                    i9 = i95;
                                    i10 = i22;
                                }
                                z4 = z6;
                                i17++;
                                constraintLayout = this;
                                size = i18;
                                paddingRight = paddingRight;
                                i9 = i95;
                                i10 = i22;
                            }
                            z6 = z4;
                            z4 = z6;
                            i17++;
                            constraintLayout = this;
                            size = i18;
                            paddingRight = paddingRight;
                            i9 = i95;
                            i10 = i22;
                        }
                        i19 = i9;
                        i20 = i10;
                        i15 = paddingRight;
                        constraintLayout = this;
                        if (z4) {
                            constraintLayout.f439e.m1342C(i20);
                            constraintLayout.f439e.m1362w(i19);
                            if (z8) {
                                constraintLayout.f439e.m1372L();
                            }
                            m140h();
                            if (constraintLayout.f439e.m1355n() < iMax2) {
                                constraintLayout.f439e.m1342C(iMax2);
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (constraintLayout.f439e.m1349h() < iMax) {
                                constraintLayout.f439e.m1362w(iMax);
                                z5 = true;
                            }
                            if (z5) {
                                m140h();
                            }
                        }
                        for (i21 = 0; i21 < i18; i21++) {
                            c0332d = constraintLayout.f438d.get(i21);
                            view = (View) c0332d.f2319X;
                            if (view != null && (view.getMeasuredWidth() != c0332d.m1355n() || view.getMeasuredHeight() != c0332d.m1349h())) {
                                if (c0332d.f2320Y != 8) {
                                    view.measure(View.MeasureSpec.makeMeasureSpec(c0332d.m1355n(), 1073741824), View.MeasureSpec.makeMeasureSpec(c0332d.m1349h(), 1073741824));
                                }
                            }
                        }
                        i16 = iCombineMeasuredStates;
                    } else {
                        i15 = paddingRight;
                        i16 = 0;
                    }
                    int iM1355n3 = constraintLayout.f439e.m1355n() + i15;
                    int iM1349h3 = constraintLayout.f439e.m1349h() + paddingBottom2;
                    int iResolveSizeAndState = ViewGroup.resolveSizeAndState(iM1355n3, i, i16);
                    int iResolveSizeAndState2 = ViewGroup.resolveSizeAndState(iM1349h3, i2, i16 << 16) & 16777215;
                    iMin2 = Math.min(constraintLayout.f442h, iResolveSizeAndState & 16777215);
                    iMin3 = Math.min(constraintLayout.f443i, iResolveSizeAndState2);
                    c0333e = constraintLayout.f439e;
                    if (c0333e.f2376y0) {
                        iMin2 |= 16777216;
                    }
                    if (c0333e.f2377z0) {
                        iMin3 |= 16777216;
                    }
                    constraintLayout.setMeasuredDimension(iMin2, iMin3);
                    constraintLayout.f449o = iMin2;
                    constraintLayout.f450p = iMin3;
                }
                if (getChildCount() > 0) {
                    m140h();
                }
                size = constraintLayout.f438d.size();
                int paddingBottom3 = getPaddingBottom() + i5;
                paddingRight = getPaddingRight() + i6;
                if (size > 0) {
                    if (constraintLayout.f439e.m1350i() == aVar4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (constraintLayout.f439e.m1354m() == aVar4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    int iMax4 = Math.max(constraintLayout.f439e.m1355n(), constraintLayout.f440f);
                    iMax = Math.max(constraintLayout.f439e.m1349h(), constraintLayout.f441g);
                    iMax2 = iMax4;
                    i17 = 0;
                    z4 = false;
                    int iCombineMeasuredStates2 = 0;
                    while (true) {
                        i18 = size;
                        if (i17 < size) {
                            break;
                            break;
                        }
                        C0332d c0332d7 = constraintLayout.f438d.get(i17);
                        int i98 = i9;
                        view2 = (View) c0332d7.f2319X;
                        if (view2 == null) {
                            i22 = i10;
                        } else {
                            i22 = i10;
                            c0065a = (C0065a) view2.getLayoutParams();
                            if (c0065a.f475Y) {
                            }
                            z4 = z6;
                            i17++;
                            constraintLayout = this;
                            size = i18;
                            paddingRight = paddingRight;
                            i9 = i98;
                            i10 = i22;
                        }
                        z6 = z4;
                        z4 = z6;
                        i17++;
                        constraintLayout = this;
                        size = i18;
                        paddingRight = paddingRight;
                        i9 = i98;
                        i10 = i22;
                    }
                    i19 = i9;
                    i20 = i10;
                    i15 = paddingRight;
                    constraintLayout = this;
                    if (z4) {
                        constraintLayout.f439e.m1342C(i20);
                        constraintLayout.f439e.m1362w(i19);
                        if (z8) {
                            constraintLayout.f439e.m1372L();
                        }
                        m140h();
                        if (constraintLayout.f439e.m1355n() < iMax2) {
                            constraintLayout.f439e.m1342C(iMax2);
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (constraintLayout.f439e.m1349h() < iMax) {
                            constraintLayout.f439e.m1362w(iMax);
                            z5 = true;
                        }
                        if (z5) {
                            m140h();
                        }
                    }
                    while (i21 < i18) {
                        c0332d = constraintLayout.f438d.get(i21);
                        view = (View) c0332d.f2319X;
                        if (view != null) {
                            if (c0332d.f2320Y != 8) {
                                view.measure(View.MeasureSpec.makeMeasureSpec(c0332d.m1355n(), 1073741824), View.MeasureSpec.makeMeasureSpec(c0332d.m1349h(), 1073741824));
                            }
                        }
                    }
                    i16 = iCombineMeasuredStates2;
                } else {
                    i15 = paddingRight;
                    i16 = 0;
                }
                int iM1355n4 = constraintLayout.f439e.m1355n() + i15;
                int iM1349h4 = constraintLayout.f439e.m1349h() + paddingBottom3;
                int iResolveSizeAndState3 = ViewGroup.resolveSizeAndState(iM1355n4, i, i16);
                int iResolveSizeAndState4 = ViewGroup.resolveSizeAndState(iM1349h4, i2, i16 << 16) & 16777215;
                iMin2 = Math.min(constraintLayout.f442h, iResolveSizeAndState3 & 16777215);
                iMin3 = Math.min(constraintLayout.f443i, iResolveSizeAndState4);
                c0333e = constraintLayout.f439e;
                if (c0333e.f2376y0) {
                    iMin2 |= 16777216;
                }
                if (c0333e.f2377z0) {
                    iMin3 |= 16777216;
                }
                constraintLayout.setMeasuredDimension(iMin2, iMin3);
                constraintLayout.f449o = iMin2;
                constraintLayout.f450p = iMin3;
            }
            i11 = mode2;
        } else {
            i11 = mode2;
            i12 = size2;
            i13 = i8;
        }
        i14 = i7;
        if ((constraintLayout.f445k & 32) == 32) {
            iM1355n = constraintLayout.f439e.m1355n();
            iM1349h = constraintLayout.f439e.m1349h();
            if (constraintLayout.f449o != iM1355n) {
                i25 = 1073741824;
                if (i13 == 1073741824) {
                    C0304a.m1200h(constraintLayout.f439e.f2368q0, 0, iM1355n);
                }
            } else {
                i25 = 1073741824;
            }
            if (constraintLayout.f450p != iM1349h) {
                C0304a.m1200h(constraintLayout.f439e.f2368q0, 1, iM1349h);
            }
            c0333e2 = constraintLayout.f439e;
            if (!c0333e2.f2370s0) {
            }
            c0333e3 = constraintLayout.f439e;
            if (!c0333e3.f2371t0) {
            }
            if (getChildCount() > 0) {
                m140h();
            }
            size = constraintLayout.f438d.size();
            int paddingBottom4 = getPaddingBottom() + i5;
            paddingRight = getPaddingRight() + i6;
            if (size > 0) {
                if (constraintLayout.f439e.m1350i() == aVar4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (constraintLayout.f439e.m1354m() == aVar4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                int iMax5 = Math.max(constraintLayout.f439e.m1355n(), constraintLayout.f440f);
                iMax = Math.max(constraintLayout.f439e.m1349h(), constraintLayout.f441g);
                iMax2 = iMax5;
                i17 = 0;
                z4 = false;
                int iCombineMeasuredStates3 = 0;
                while (true) {
                    i18 = size;
                    if (i17 < size) {
                        break;
                        break;
                    }
                    C0332d c0332d8 = constraintLayout.f438d.get(i17);
                    int i99 = i9;
                    view2 = (View) c0332d8.f2319X;
                    if (view2 == null) {
                        i22 = i10;
                    } else {
                        i22 = i10;
                        c0065a = (C0065a) view2.getLayoutParams();
                        if (c0065a.f475Y) {
                        }
                        z4 = z6;
                        i17++;
                        constraintLayout = this;
                        size = i18;
                        paddingRight = paddingRight;
                        i9 = i99;
                        i10 = i22;
                    }
                    z6 = z4;
                    z4 = z6;
                    i17++;
                    constraintLayout = this;
                    size = i18;
                    paddingRight = paddingRight;
                    i9 = i99;
                    i10 = i22;
                }
                i19 = i9;
                i20 = i10;
                i15 = paddingRight;
                constraintLayout = this;
                if (z4) {
                    constraintLayout.f439e.m1342C(i20);
                    constraintLayout.f439e.m1362w(i19);
                    if (z8) {
                        constraintLayout.f439e.m1372L();
                    }
                    m140h();
                    if (constraintLayout.f439e.m1355n() < iMax2) {
                        constraintLayout.f439e.m1342C(iMax2);
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (constraintLayout.f439e.m1349h() < iMax) {
                        constraintLayout.f439e.m1362w(iMax);
                        z5 = true;
                    }
                    if (z5) {
                        m140h();
                    }
                }
                while (i21 < i18) {
                    c0332d = constraintLayout.f438d.get(i21);
                    view = (View) c0332d.f2319X;
                    if (view != null) {
                        if (c0332d.f2320Y != 8) {
                            view.measure(View.MeasureSpec.makeMeasureSpec(c0332d.m1355n(), 1073741824), View.MeasureSpec.makeMeasureSpec(c0332d.m1349h(), 1073741824));
                        }
                    }
                }
                i16 = iCombineMeasuredStates3;
            } else {
                i15 = paddingRight;
                i16 = 0;
            }
            int iM1355n5 = constraintLayout.f439e.m1355n() + i15;
            int iM1349h5 = constraintLayout.f439e.m1349h() + paddingBottom4;
            int iResolveSizeAndState5 = ViewGroup.resolveSizeAndState(iM1355n5, i, i16);
            int iResolveSizeAndState6 = ViewGroup.resolveSizeAndState(iM1349h5, i2, i16 << 16) & 16777215;
            iMin2 = Math.min(constraintLayout.f442h, iResolveSizeAndState5 & 16777215);
            iMin3 = Math.min(constraintLayout.f443i, iResolveSizeAndState6);
            c0333e = constraintLayout.f439e;
            if (c0333e.f2376y0) {
                iMin2 |= 16777216;
            }
            if (c0333e.f2377z0) {
                iMin3 |= 16777216;
            }
            constraintLayout.setMeasuredDimension(iMin2, iMin3);
            constraintLayout.f449o = iMin2;
            constraintLayout.f450p = iMin3;
        }
        if (getChildCount() > 0) {
            m140h();
        }
        size = constraintLayout.f438d.size();
        int paddingBottom5 = getPaddingBottom() + i5;
        paddingRight = getPaddingRight() + i6;
        if (size > 0) {
            if (constraintLayout.f439e.m1350i() == aVar4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (constraintLayout.f439e.m1354m() == aVar4) {
                z3 = true;
            } else {
                z3 = false;
            }
            int iMax6 = Math.max(constraintLayout.f439e.m1355n(), constraintLayout.f440f);
            iMax = Math.max(constraintLayout.f439e.m1349h(), constraintLayout.f441g);
            iMax2 = iMax6;
            i17 = 0;
            z4 = false;
            int iCombineMeasuredStates4 = 0;
            while (true) {
                i18 = size;
                if (i17 < size) {
                    break;
                    break;
                }
                C0332d c0332d9 = constraintLayout.f438d.get(i17);
                int i910 = i9;
                view2 = (View) c0332d9.f2319X;
                if (view2 == null) {
                    i22 = i10;
                } else {
                    i22 = i10;
                    c0065a = (C0065a) view2.getLayoutParams();
                    if (c0065a.f475Y) {
                    }
                    z4 = z6;
                    i17++;
                    constraintLayout = this;
                    size = i18;
                    paddingRight = paddingRight;
                    i9 = i910;
                    i10 = i22;
                }
                z6 = z4;
                z4 = z6;
                i17++;
                constraintLayout = this;
                size = i18;
                paddingRight = paddingRight;
                i9 = i910;
                i10 = i22;
            }
            i19 = i9;
            i20 = i10;
            i15 = paddingRight;
            constraintLayout = this;
            if (z4) {
                constraintLayout.f439e.m1342C(i20);
                constraintLayout.f439e.m1362w(i19);
                if (z8) {
                    constraintLayout.f439e.m1372L();
                }
                m140h();
                if (constraintLayout.f439e.m1355n() < iMax2) {
                    constraintLayout.f439e.m1342C(iMax2);
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (constraintLayout.f439e.m1349h() < iMax) {
                    constraintLayout.f439e.m1362w(iMax);
                    z5 = true;
                }
                if (z5) {
                    m140h();
                }
            }
            while (i21 < i18) {
                c0332d = constraintLayout.f438d.get(i21);
                view = (View) c0332d.f2319X;
                if (view != null) {
                    if (c0332d.f2320Y != 8) {
                        view.measure(View.MeasureSpec.makeMeasureSpec(c0332d.m1355n(), 1073741824), View.MeasureSpec.makeMeasureSpec(c0332d.m1349h(), 1073741824));
                    }
                }
            }
            i16 = iCombineMeasuredStates4;
        } else {
            i15 = paddingRight;
            i16 = 0;
        }
        int iM1355n6 = constraintLayout.f439e.m1355n() + i15;
        int iM1349h6 = constraintLayout.f439e.m1349h() + paddingBottom5;
        int iResolveSizeAndState7 = ViewGroup.resolveSizeAndState(iM1355n6, i, i16);
        int iResolveSizeAndState8 = ViewGroup.resolveSizeAndState(iM1349h6, i2, i16 << 16) & 16777215;
        iMin2 = Math.min(constraintLayout.f442h, iResolveSizeAndState7 & 16777215);
        iMin3 = Math.min(constraintLayout.f443i, iResolveSizeAndState8);
        c0333e = constraintLayout.f439e;
        if (c0333e.f2376y0) {
            iMin2 |= 16777216;
        }
        if (c0333e.f2377z0) {
            iMin3 |= 16777216;
        }
        constraintLayout.setMeasuredDimension(iMin2, iMin3);
        constraintLayout.f449o = iMin2;
        constraintLayout.f450p = iMin3;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        C0332d c0332dM136d = m136d(view);
        if ((view instanceof C0347e) && !(c0332dM136d instanceof C0335g)) {
            C0065a c0065a = (C0065a) view.getLayoutParams();
            C0335g c0335g = new C0335g();
            c0065a.f498k0 = c0335g;
            c0065a.f474X = true;
            c0335g.m1376F(c0065a.f468R);
        }
        if (view instanceof AbstractC0344b) {
            AbstractC0344b abstractC0344b = (AbstractC0344b) view;
            abstractC0344b.m1396f();
            ((C0065a) view.getLayoutParams()).f475Y = true;
            if (!this.f437c.contains(abstractC0344b)) {
                this.f437c.add(abstractC0344b);
            }
        }
        this.f436b.put(view.getId(), view);
        this.f444j = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f436b.remove(view.getId());
        C0332d c0332dM136d = m136d(view);
        this.f439e.f2419i0.remove(c0332dM136d);
        c0332dM136d.f2299D = null;
        this.f437c.remove(view);
        this.f438d.remove(c0332dM136d);
        this.f444j = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        this.f444j = true;
        this.f449o = -1;
        this.f450p = -1;
    }

    public void setConstraintSet(C0345c c0345c) {
        this.f446l = c0345c;
    }

    @Override // android.view.View
    public void setId(int i) {
        this.f436b.remove(getId());
        super.setId(i);
        this.f436b.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.f443i) {
            return;
        }
        this.f443i = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f442h) {
            return;
        }
        this.f442h = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.f441g) {
            return;
        }
        this.f441g = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.f440f) {
            return;
        }
        this.f440f = i;
        requestLayout();
    }

    public void setOptimizationLevel(int i) {
        this.f439e.f2374w0 = i;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
