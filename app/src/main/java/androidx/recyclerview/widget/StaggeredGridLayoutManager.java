package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.Objects;
import p006b.p032h.p044j.p045w.C0429b;
import b.s.m;
import p006b.p068t.p069b.AbstractC0557t;
import p006b.p068t.p069b.C0551n;
import p006b.p068t.p069b.C0552o;
import p006b.p068t.p069b.RunnableC0550m;
import c.a.a.a.a;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.AbstractC0140o implements RecyclerView.AbstractC0151z.b {

    /* JADX INFO: renamed from: A */
    public BitSet f1016A;

    /* JADX INFO: renamed from: F */
    public boolean f1021F;

    /* JADX INFO: renamed from: G */
    public boolean f1022G;

    /* JADX INFO: renamed from: H */
    public C0156e f1023H;

    /* JADX INFO: renamed from: I */
    public int f1024I;

    /* JADX INFO: renamed from: M */
    public int[] f1028M;

    /* JADX INFO: renamed from: r */
    public int f1030r;

    /* JADX INFO: renamed from: s */
    public C0157f[] f1031s;

    /* JADX INFO: renamed from: t */
    public AbstractC0557t f1032t;

    /* JADX INFO: renamed from: u */
    public AbstractC0557t f1033u;

    /* JADX INFO: renamed from: v */
    public int f1034v;

    /* JADX INFO: renamed from: w */
    public int f1035w;

    /* JADX INFO: renamed from: x */
    public final C0551n f1036x;

    /* JADX INFO: renamed from: y */
    public boolean f1037y;

    /* JADX INFO: renamed from: z */
    public boolean f1038z = false;

    /* JADX INFO: renamed from: B */
    public int f1017B = -1;

    /* JADX INFO: renamed from: C */
    public int f1018C = RecyclerView.UNDEFINED_DURATION;

    /* JADX INFO: renamed from: D */
    public C0155d f1019D = new C0155d();

    /* JADX INFO: renamed from: E */
    public int f1020E = 2;

    /* JADX INFO: renamed from: J */
    public final Rect f1025J = new Rect();

    /* JADX INFO: renamed from: K */
    public final C0153b f1026K = new C0153b();

    /* JADX INFO: renamed from: L */
    public boolean f1027L = true;

    /* JADX INFO: renamed from: N */
    public final Runnable f1029N = new RunnableC0152a();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$a */
    public class RunnableC0152a implements Runnable {
        public RunnableC0152a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.m662Y0();
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$b */
    public class C0153b {

        /* JADX INFO: renamed from: a */
        public int f1040a;

        /* JADX INFO: renamed from: b */
        public int f1041b;

        /* JADX INFO: renamed from: c */
        public boolean f1042c;

        /* JADX INFO: renamed from: d */
        public boolean f1043d;

        /* JADX INFO: renamed from: e */
        public boolean f1044e;

        /* JADX INFO: renamed from: f */
        public int[] f1045f;

        public C0153b() {
            m691b();
        }

        /* JADX INFO: renamed from: a */
        public void m690a() {
            this.f1041b = this.f1042c ? StaggeredGridLayoutManager.this.f1032t.mo2049g() : StaggeredGridLayoutManager.this.f1032t.mo2053k();
        }

        /* JADX INFO: renamed from: b */
        public void m691b() {
            this.f1040a = -1;
            this.f1041b = RecyclerView.UNDEFINED_DURATION;
            this.f1042c = false;
            this.f1043d = false;
            this.f1044e = false;
            int[] iArr = this.f1045f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c */
    public static class C0154c extends RecyclerView.C0141p {

        /* JADX INFO: renamed from: e */
        public C0157f f1047e;

        public C0154c(int i, int i2) {
            super(i, i2);
        }

        public C0154c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0154c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0154c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d */
    public static class C0155d {

        /* JADX INFO: renamed from: a */
        public int[] f1048a;

        /* JADX INFO: renamed from: b */
        public List<a> f1049b;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a */
        @SuppressLint({"BanParcelableUsage"})
        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C1390a();

            /* JADX INFO: renamed from: b */
            public int f1050b;

            /* JADX INFO: renamed from: c */
            public int f1051c;

            /* JADX INFO: renamed from: d */
            public int[] f1052d;

            /* JADX INFO: renamed from: e */
            public boolean f1053e;

            /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a, reason: collision with other inner class name */
            public static class C1390a implements Parcelable.Creator<a> {
                @Override // android.os.Parcelable.Creator
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                public a[] newArray(int i) {
                    return new a[i];
                }
            }

            public a() {
            }

            public a(Parcel parcel) {
                this.f1050b = parcel.readInt();
                this.f1051c = parcel.readInt();
                this.f1053e = parcel.readInt() == 1;
                int i = parcel.readInt();
                if (i > 0) {
                    int[] iArr = new int[i];
                    this.f1052d = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                StringBuilder sbM2191e = a.m2191e("FullSpanItem{mPosition=");
                sbM2191e.append(this.f1050b);
                sbM2191e.append(", mGapDir=");
                sbM2191e.append(this.f1051c);
                sbM2191e.append(", mHasUnwantedGapAfter=");
                sbM2191e.append(this.f1053e);
                sbM2191e.append(", mGapPerSpan=");
                sbM2191e.append(Arrays.toString(this.f1052d));
                sbM2191e.append('}');
                return sbM2191e.toString();
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f1050b);
                parcel.writeInt(this.f1051c);
                parcel.writeInt(this.f1053e ? 1 : 0);
                int[] iArr = this.f1052d;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f1052d);
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public void m692a() {
            int[] iArr = this.f1048a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f1049b = null;
        }

        /* JADX INFO: renamed from: b */
        public void m693b(int i) {
            int[] iArr = this.f1048a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i, 10) + 1];
                this.f1048a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int length = iArr.length;
                while (length <= i) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.f1048a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f1048a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* JADX INFO: renamed from: c */
        public a m694c(int i) {
            List<a> list = this.f1049b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f1049b.get(size);
                if (aVar.f1050b == i) {
                    return aVar;
                }
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x000e  */
        /* JADX INFO: renamed from: d */
        public int m695d(int i) {
            int i2;
            int[] iArr = this.f1048a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            if (this.f1049b != null) {
                a aVarM694c = m694c(i);
                if (aVarM694c != null) {
                    this.f1049b.remove(aVarM694c);
                }
                int size = this.f1049b.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        i3 = -1;
                        break;
                    }
                    if (this.f1049b.get(i3).f1050b >= i) {
                        break;
                    }
                    i3++;
                }
                if (i3 != -1) {
                    a aVar = this.f1049b.get(i3);
                    this.f1049b.remove(i3);
                    i2 = aVar.f1050b;
                } else {
                    i2 = -1;
                }
            } else {
                i2 = -1;
            }
            if (i2 == -1) {
                int[] iArr2 = this.f1048a;
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.f1048a.length;
            }
            int i4 = i2 + 1;
            Arrays.fill(this.f1048a, i, i4, -1);
            return i4;
        }

        /* JADX INFO: renamed from: e */
        public void m696e(int i, int i2) {
            int[] iArr = this.f1048a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            m693b(i3);
            int[] iArr2 = this.f1048a;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill(this.f1048a, i, i3, -1);
            List<a> list = this.f1049b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f1049b.get(size);
                int i4 = aVar.f1050b;
                if (i4 >= i) {
                    aVar.f1050b = i4 + i2;
                }
            }
        }

        /* JADX INFO: renamed from: f */
        public void m697f(int i, int i2) {
            int[] iArr = this.f1048a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            m693b(i3);
            int[] iArr2 = this.f1048a;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = this.f1048a;
            Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
            List<a> list = this.f1049b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f1049b.get(size);
                int i4 = aVar.f1050b;
                if (i4 >= i) {
                    if (i4 < i3) {
                        this.f1049b.remove(size);
                    } else {
                        aVar.f1050b = i4 - i2;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e */
    @SuppressLint({"BanParcelableUsage"})
    public static class C0156e implements Parcelable {
        public static final Parcelable.Creator<C0156e> CREATOR = new a();

        /* JADX INFO: renamed from: b */
        public int f1054b;

        /* JADX INFO: renamed from: c */
        public int f1055c;

        /* JADX INFO: renamed from: d */
        public int f1056d;

        /* JADX INFO: renamed from: e */
        public int[] f1057e;

        /* JADX INFO: renamed from: f */
        public int f1058f;

        /* JADX INFO: renamed from: g */
        public int[] f1059g;

        /* JADX INFO: renamed from: h */
        public List<C0155d.a> f1060h;

        /* JADX INFO: renamed from: i */
        public boolean f1061i;

        /* JADX INFO: renamed from: j */
        public boolean f1062j;

        /* JADX INFO: renamed from: k */
        public boolean f1063k;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e$a */
        public static class a implements Parcelable.Creator<C0156e> {
            @Override // android.os.Parcelable.Creator
            public C0156e createFromParcel(Parcel parcel) {
                return new C0156e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public C0156e[] newArray(int i) {
                return new C0156e[i];
            }
        }

        public C0156e() {
        }

        public C0156e(Parcel parcel) {
            this.f1054b = parcel.readInt();
            this.f1055c = parcel.readInt();
            int i = parcel.readInt();
            this.f1056d = i;
            if (i > 0) {
                int[] iArr = new int[i];
                this.f1057e = iArr;
                parcel.readIntArray(iArr);
            }
            int i2 = parcel.readInt();
            this.f1058f = i2;
            if (i2 > 0) {
                int[] iArr2 = new int[i2];
                this.f1059g = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f1061i = parcel.readInt() == 1;
            this.f1062j = parcel.readInt() == 1;
            this.f1063k = parcel.readInt() == 1;
            this.f1060h = parcel.readArrayList(C0155d.a.class.getClassLoader());
        }

        public C0156e(C0156e c0156e) {
            this.f1056d = c0156e.f1056d;
            this.f1054b = c0156e.f1054b;
            this.f1055c = c0156e.f1055c;
            this.f1057e = c0156e.f1057e;
            this.f1058f = c0156e.f1058f;
            this.f1059g = c0156e.f1059g;
            this.f1061i = c0156e.f1061i;
            this.f1062j = c0156e.f1062j;
            this.f1063k = c0156e.f1063k;
            this.f1060h = c0156e.f1060h;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f1054b);
            parcel.writeInt(this.f1055c);
            parcel.writeInt(this.f1056d);
            if (this.f1056d > 0) {
                parcel.writeIntArray(this.f1057e);
            }
            parcel.writeInt(this.f1058f);
            if (this.f1058f > 0) {
                parcel.writeIntArray(this.f1059g);
            }
            parcel.writeInt(this.f1061i ? 1 : 0);
            parcel.writeInt(this.f1062j ? 1 : 0);
            parcel.writeInt(this.f1063k ? 1 : 0);
            parcel.writeList(this.f1060h);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$f */
    public class C0157f {

        /* JADX INFO: renamed from: a */
        public ArrayList<View> f1064a = new ArrayList<>();

        /* JADX INFO: renamed from: b */
        public int f1065b = RecyclerView.UNDEFINED_DURATION;

        /* JADX INFO: renamed from: c */
        public int f1066c = RecyclerView.UNDEFINED_DURATION;

        /* JADX INFO: renamed from: d */
        public int f1067d = 0;

        /* JADX INFO: renamed from: e */
        public final int f1068e;

        public C0157f(int i) {
            this.f1068e = i;
        }

        /* JADX INFO: renamed from: a */
        public void m698a(View view) {
            C0154c c0154cM707j = m707j(view);
            c0154cM707j.f1047e = this;
            this.f1064a.add(view);
            this.f1066c = RecyclerView.UNDEFINED_DURATION;
            if (this.f1064a.size() == 1) {
                this.f1065b = RecyclerView.UNDEFINED_DURATION;
            }
            if (c0154cM707j.m628c() || c0154cM707j.m627b()) {
                this.f1067d = StaggeredGridLayoutManager.this.f1032t.mo2045c(view) + this.f1067d;
            }
        }

        /* JADX INFO: renamed from: b */
        public void m699b() {
            ArrayList<View> arrayList = this.f1064a;
            View view = arrayList.get(arrayList.size() - 1);
            C0154c c0154cM707j = m707j(view);
            this.f1066c = StaggeredGridLayoutManager.this.f1032t.mo2044b(view);
            Objects.requireNonNull(c0154cM707j);
        }

        /* JADX INFO: renamed from: c */
        public void m700c() {
            View view = this.f1064a.get(0);
            C0154c c0154cM707j = m707j(view);
            this.f1065b = StaggeredGridLayoutManager.this.f1032t.mo2047e(view);
            Objects.requireNonNull(c0154cM707j);
        }

        /* JADX INFO: renamed from: d */
        public void m701d() {
            this.f1064a.clear();
            this.f1065b = RecyclerView.UNDEFINED_DURATION;
            this.f1066c = RecyclerView.UNDEFINED_DURATION;
            this.f1067d = 0;
        }

        /* JADX INFO: renamed from: e */
        public int m702e() {
            int size;
            int size2;
            if (StaggeredGridLayoutManager.this.f1037y) {
                size = this.f1064a.size() - 1;
                size2 = -1;
            } else {
                size = 0;
                size2 = this.f1064a.size();
            }
            return m704g(size, size2, true);
        }

        /* JADX INFO: renamed from: f */
        public int m703f() {
            int size;
            int size2;
            if (StaggeredGridLayoutManager.this.f1037y) {
                size = 0;
                size2 = this.f1064a.size();
            } else {
                size = this.f1064a.size() - 1;
                size2 = -1;
            }
            return m704g(size, size2, true);
        }

        /* JADX INFO: renamed from: g */
        public int m704g(int i, int i2, boolean z) {
            int iMo2053k = StaggeredGridLayoutManager.this.f1032t.mo2053k();
            int iMo2049g = StaggeredGridLayoutManager.this.f1032t.mo2049g();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.f1064a.get(i);
                int iMo2047e = StaggeredGridLayoutManager.this.f1032t.mo2047e(view);
                int iMo2044b = StaggeredGridLayoutManager.this.f1032t.mo2044b(view);
                boolean z2 = false;
                boolean z3 = !z ? iMo2047e >= iMo2049g : iMo2047e > iMo2049g;
                if (!z ? iMo2044b > iMo2053k : iMo2044b >= iMo2053k) {
                    z2 = true;
                }
                if (z3 && z2 && (iMo2047e < iMo2053k || iMo2044b > iMo2049g)) {
                    return StaggeredGridLayoutManager.this.m589P(view);
                }
                i += i3;
            }
            return -1;
        }

        /* JADX INFO: renamed from: h */
        public int m705h(int i) {
            int i2 = this.f1066c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f1064a.size() == 0) {
                return i;
            }
            m699b();
            return this.f1066c;
        }

        /* JADX INFO: renamed from: i */
        public View m706i(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.f1064a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f1064a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f1037y && staggeredGridLayoutManager.m589P(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f1037y && staggeredGridLayoutManager2.m589P(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f1064a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = this.f1064a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f1037y && staggeredGridLayoutManager3.m589P(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f1037y && staggeredGridLayoutManager4.m589P(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        /* JADX INFO: renamed from: j */
        public C0154c m707j(View view) {
            return (C0154c) view.getLayoutParams();
        }

        /* JADX INFO: renamed from: k */
        public int m708k(int i) {
            int i2 = this.f1065b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f1064a.size() == 0) {
                return i;
            }
            m700c();
            return this.f1065b;
        }

        /* JADX INFO: renamed from: l */
        public void m709l() {
            int size = this.f1064a.size();
            View viewRemove = this.f1064a.remove(size - 1);
            C0154c c0154cM707j = m707j(viewRemove);
            c0154cM707j.f1047e = null;
            if (c0154cM707j.m628c() || c0154cM707j.m627b()) {
                this.f1067d -= StaggeredGridLayoutManager.this.f1032t.mo2045c(viewRemove);
            }
            if (size == 1) {
                this.f1065b = RecyclerView.UNDEFINED_DURATION;
            }
            this.f1066c = RecyclerView.UNDEFINED_DURATION;
        }

        /* JADX INFO: renamed from: m */
        public void m710m() {
            View viewRemove = this.f1064a.remove(0);
            C0154c c0154cM707j = m707j(viewRemove);
            c0154cM707j.f1047e = null;
            if (this.f1064a.size() == 0) {
                this.f1066c = RecyclerView.UNDEFINED_DURATION;
            }
            if (c0154cM707j.m628c() || c0154cM707j.m627b()) {
                this.f1067d -= StaggeredGridLayoutManager.this.f1032t.mo2045c(viewRemove);
            }
            this.f1065b = RecyclerView.UNDEFINED_DURATION;
        }

        /* JADX INFO: renamed from: n */
        public void m711n(View view) {
            C0154c c0154cM707j = m707j(view);
            c0154cM707j.f1047e = this;
            this.f1064a.add(0, view);
            this.f1065b = RecyclerView.UNDEFINED_DURATION;
            if (this.f1064a.size() == 1) {
                this.f1066c = RecyclerView.UNDEFINED_DURATION;
            }
            if (c0154cM707j.m628c() || c0154cM707j.m627b()) {
                this.f1067d = StaggeredGridLayoutManager.this.f1032t.mo2045c(view) + this.f1067d;
            }
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1030r = -1;
        this.f1037y = false;
        RecyclerView.AbstractC0140o.d dVarM560Q = RecyclerView.AbstractC0140o.m560Q(context, attributeSet, i, i2);
        int i3 = dVarM560Q.f977a;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        mo460d(null);
        if (i3 != this.f1034v) {
            this.f1034v = i3;
            AbstractC0557t abstractC0557t = this.f1032t;
            this.f1032t = this.f1033u;
            this.f1033u = abstractC0557t;
            m580I0();
        }
        int i4 = dVarM560Q.f978b;
        mo460d(null);
        if (i4 != this.f1030r) {
            this.f1019D.m692a();
            m580I0();
            this.f1030r = i4;
            this.f1016A = new BitSet(this.f1030r);
            this.f1031s = new C0157f[this.f1030r];
            for (int i5 = 0; i5 < this.f1030r; i5++) {
                this.f1031s[i5] = new C0157f(i5);
            }
            m580I0();
        }
        boolean z = dVarM560Q.f979c;
        mo460d(null);
        C0156e c0156e = this.f1023H;
        if (c0156e != null && c0156e.f1061i != z) {
            c0156e.f1061i = z;
        }
        this.f1037y = z;
        m580I0();
        this.f1036x = new C0551n();
        this.f1032t = AbstractC0557t.m2058a(this, this.f1034v);
        this.f1033u = AbstractC0557t.m2058a(this, 1 - this.f1034v);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: A */
    public int mo407A(RecyclerView.C0147v c0147v, RecyclerView.C0123a0 c0123a0) {
        return this.f1034v == 1 ? this.f1030r : super.mo407A(c0147v, c0123a0);
    }

    /* JADX INFO: renamed from: A1 */
    public final void m659A1(C0157f c0157f, int i, int i2) {
        int i3 = c0157f.f1067d;
        if (i == -1) {
            int i4 = c0157f.f1065b;
            if (i4 == Integer.MIN_VALUE) {
                c0157f.m700c();
                i4 = c0157f.f1065b;
            }
            if (i4 + i3 > i2) {
                return;
            }
        } else {
            int i5 = c0157f.f1066c;
            if (i5 == Integer.MIN_VALUE) {
                c0157f.m699b();
                i5 = c0157f.f1066c;
            }
            if (i5 - i3 < i2) {
                return;
            }
        }
        this.f1016A.set(c0157f.f1068e, false);
    }

    /* JADX INFO: renamed from: B1 */
    public final int m660B1(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: J0 */
    public int mo413J0(int i, RecyclerView.C0147v c0147v, RecyclerView.C0123a0 c0123a0) {
        return m686w1(i, c0147v, c0123a0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: K0 */
    public void mo450K0(int i) {
        C0156e c0156e = this.f1023H;
        if (c0156e != null && c0156e.f1054b != i) {
            c0156e.f1057e = null;
            c0156e.f1056d = 0;
            c0156e.f1054b = -1;
            c0156e.f1055c = -1;
        }
        this.f1017B = i;
        this.f1018C = RecyclerView.UNDEFINED_DURATION;
        m580I0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: L0 */
    public int mo416L0(int i, RecyclerView.C0147v c0147v, RecyclerView.C0123a0 c0123a0) {
        return m686w1(i, c0147v, c0123a0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: O0 */
    public void mo420O0(Rect rect, int i, int i2) {
        int iM562h;
        int iM562h2;
        int iM586N = m586N() + m584M();
        int iM583L = m583L() + m588O();
        if (this.f1034v == 1) {
            iM562h2 = RecyclerView.AbstractC0140o.m562h(i2, rect.height() + iM583L, m581J());
            iM562h = RecyclerView.AbstractC0140o.m562h(i, (this.f1035w * this.f1030r) + iM586N, m582K());
        } else {
            iM562h = RecyclerView.AbstractC0140o.m562h(i, rect.width() + iM586N, m582K());
            iM562h2 = RecyclerView.AbstractC0140o.m562h(i2, (this.f1035w * this.f1030r) + iM583L, m581J());
        }
        this.f959b.setMeasuredDimension(iM562h, iM562h2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: R */
    public int mo422R(RecyclerView.C0147v c0147v, RecyclerView.C0123a0 c0123a0) {
        return this.f1034v == 0 ? this.f1030r : super.mo422R(c0147v, c0123a0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: U */
    public boolean mo452U() {
        return this.f1020E != 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: U0 */
    public void mo453U0(RecyclerView recyclerView, RecyclerView.C0123a0 c0123a0, int i) {
        C0552o c0552o = new C0552o(recyclerView.getContext());
        c0552o.f1001a = i;
        m597V0(c0552o);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: W0 */
    public boolean mo423W0() {
        return this.f1023H == null;
    }

    /* JADX INFO: renamed from: X0 */
    public final int m661X0(int i) {
        if (m619y() == 0) {
            return this.f1038z ? 1 : -1;
        }
        return (i < m671h1()) != this.f1038z ? -1 : 1;
    }

    /* JADX INFO: renamed from: Y0 */
    public boolean m662Y0() {
        int iM671h1;
        if (m619y() != 0 && this.f1020E != 0 && this.f966i) {
            if (this.f1038z) {
                iM671h1 = m672i1();
                m671h1();
            } else {
                iM671h1 = m671h1();
                m672i1();
            }
            if (iM671h1 == 0 && m676m1() != null) {
                this.f1019D.m692a();
                this.f965h = true;
                m580I0();
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: Z */
    public void mo600Z(int i) {
        RecyclerView recyclerView = this.f959b;
        if (recyclerView != null) {
            recyclerView.offsetChildrenHorizontal(i);
        }
        for (int i2 = 0; i2 < this.f1030r; i2++) {
            C0157f c0157f = this.f1031s[i2];
            int i3 = c0157f.f1065b;
            if (i3 != Integer.MIN_VALUE) {
                c0157f.f1065b = i3 + i;
            }
            int i4 = c0157f.f1066c;
            if (i4 != Integer.MIN_VALUE) {
                c0157f.f1066c = i4 + i;
            }
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public final int m663Z0(RecyclerView.C0123a0 c0123a0) {
        if (m619y() == 0) {
            return 0;
        }
        return m.m1960d(c0123a0, this.f1032t, m668e1(!this.f1027L), m667d1(!this.f1027L), this, this.f1027L);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0151z.b
    /* JADX INFO: renamed from: a */
    public PointF mo456a(int i) {
        int iM661X0 = m661X0(i);
        PointF pointF = new PointF();
        if (iM661X0 == 0) {
            return null;
        }
        if (this.f1034v == 0) {
            pointF.x = iM661X0;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = iM661X0;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: a0 */
    public void mo601a0(int i) {
        RecyclerView recyclerView = this.f959b;
        if (recyclerView != null) {
            recyclerView.offsetChildrenVertical(i);
        }
        for (int i2 = 0; i2 < this.f1030r; i2++) {
            C0157f c0157f = this.f1031s[i2];
            int i3 = c0157f.f1065b;
            if (i3 != Integer.MIN_VALUE) {
                c0157f.f1065b = i3 + i;
            }
            int i4 = c0157f.f1066c;
            if (i4 != Integer.MIN_VALUE) {
                c0157f.f1066c = i4 + i;
            }
        }
    }

    /* JADX INFO: renamed from: a1 */
    public final int m664a1(RecyclerView.C0123a0 c0123a0) {
        if (m619y() == 0) {
            return 0;
        }
        return m.m1961e(c0123a0, this.f1032t, m668e1(!this.f1027L), m667d1(!this.f1027L), this, this.f1027L, this.f1038z);
    }

    /* JADX INFO: renamed from: b1 */
    public final int m665b1(RecyclerView.C0123a0 c0123a0) {
        if (m619y() == 0) {
            return 0;
        }
        return m.m1962f(c0123a0, this.f1032t, m668e1(!this.f1027L), m667d1(!this.f1027L), this, this.f1027L);
    }

    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean, int] */
    /* JADX INFO: renamed from: c1 */
    public final int m666c1(RecyclerView.C0147v c0147v, C0551n c0551n, RecyclerView.C0123a0 c0123a0) {
        int i;
        int iM673j1;
        C0157f c0157f;
        int r2 = 0;
        int iM563z;
        boolean z;
        int iM563z2;
        int iM708k;
        int iMo2045c;
        int iMo2053k;
        int iMo2045c2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2 = false;
        this.f1016A.set(0, this.f1030r, true);
        if (this.f1036x.f3431i) {
            i = c0551n.f3427e == 1 ? Integer.MAX_VALUE : RecyclerView.UNDEFINED_DURATION;
        } else {
            i = c0551n.f3427e == 1 ? c0551n.f3429g + c0551n.f3424b : c0551n.f3428f - c0551n.f3424b;
        }
        m688y1(c0551n.f3427e, i);
        int iMo2049g = this.f1038z ? this.f1032t.mo2049g() : this.f1032t.mo2053k();
        boolean z3 = false;
        while (true) {
            int i8 = c0551n.f3425c;
            if (!(i8 >= 0 && i8 < c0123a0.m501b()) || (!this.f1036x.f3431i && this.f1016A.isEmpty())) {
                break;
            }
            View view = c0147v.m648k(c0551n.f3425c, z2, RecyclerView.FOREVER_NS).f927a;
            c0551n.f3425c += c0551n.f3426d;
            C0154c c0154c = (C0154c) view.getLayoutParams();
            int iM626a = c0154c.m626a();
            int[] iArr = this.f1019D.f1048a;
            int i9 = (iArr == null || iM626a >= iArr.length) ? -1 : iArr[iM626a];
            if (i9 == -1) {
                if (m680q1(c0551n.f3427e)) {
                    i6 = this.f1030r - 1;
                    i5 = -1;
                    i7 = -1;
                } else {
                    i5 = this.f1030r;
                    i6 = 0;
                    i7 = 1;
                }
                C0157f c0157f2 = null;
                if (c0551n.f3427e == 1) {
                    int iMo2053k2 = this.f1032t.mo2053k();
                    int i10 = Integer.MAX_VALUE;
                    while (i6 != i5) {
                        C0157f c0157f3 = this.f1031s[i6];
                        int iM705h = c0157f3.m705h(iMo2053k2);
                        if (iM705h < i10) {
                            c0157f2 = c0157f3;
                            i10 = iM705h;
                        }
                        i6 += i7;
                    }
                } else {
                    int iMo2049g2 = this.f1032t.mo2049g();
                    int i11 = RecyclerView.UNDEFINED_DURATION;
                    while (i6 != i5) {
                        C0157f c0157f4 = this.f1031s[i6];
                        int iM708k2 = c0157f4.m708k(iMo2049g2);
                        if (iM708k2 > i11) {
                            c0157f2 = c0157f4;
                            i11 = iM708k2;
                        }
                        i6 += i7;
                    }
                }
                c0157f = c0157f2;
                C0155d c0155d = this.f1019D;
                c0155d.m693b(iM626a);
                c0155d.f1048a[iM626a] = c0157f.f1068e;
            } else {
                c0157f = this.f1031s[i9];
            }
            C0157f c0157f5 = c0157f;
            c0154c.f1047e = c0157f5;
            if (c0551n.f3427e == 1) {
                r2 = 0;
                m604c(view, -1, false);
            } else {
                r2 = 0;
                m604c(view, 0, false);
            }
            if (this.f1034v == 1) {
                iM563z = RecyclerView.AbstractC0140o.m563z(this.f1035w, this.f971n, r2, ((ViewGroup.MarginLayoutParams) c0154c).width, r2);
                iM563z2 = RecyclerView.AbstractC0140o.m563z(this.f974q, this.f972o, m583L() + m588O(), ((ViewGroup.MarginLayoutParams) c0154c).height, true);
                z = false;
            } else {
                iM563z = RecyclerView.AbstractC0140o.m563z(this.f973p, this.f971n, m586N() + m584M(), ((ViewGroup.MarginLayoutParams) c0154c).width, true);
                z = false;
                iM563z2 = RecyclerView.AbstractC0140o.m563z(this.f1035w, this.f972o, 0, ((ViewGroup.MarginLayoutParams) c0154c).height, false);
            }
            m678o1(view, iM563z, iM563z2, z);
            if (c0551n.f3427e == 1) {
                iMo2045c = c0157f5.m705h(iMo2049g);
                iM708k = this.f1032t.mo2045c(view) + iMo2045c;
            } else {
                iM708k = c0157f5.m708k(iMo2049g);
                iMo2045c = iM708k - this.f1032t.mo2045c(view);
            }
            int i12 = c0551n.f3427e;
            C0157f c0157f6 = c0154c.f1047e;
            if (i12 == 1) {
                c0157f6.m698a(view);
            } else {
                c0157f6.m711n(view);
            }
            if (m677n1() && this.f1034v == 1) {
                iMo2045c2 = this.f1033u.mo2049g() - (((this.f1030r - 1) - c0157f5.f1068e) * this.f1035w);
                iMo2053k = iMo2045c2 - this.f1033u.mo2045c(view);
            } else {
                iMo2053k = this.f1033u.mo2053k() + (c0157f5.f1068e * this.f1035w);
                iMo2045c2 = this.f1033u.mo2045c(view) + iMo2053k;
            }
            if (this.f1034v == 1) {
                i3 = iMo2045c2;
                i2 = iM708k;
                i4 = iMo2053k;
                iMo2053k = iMo2045c;
            } else {
                i2 = iMo2045c2;
                i3 = iM708k;
                i4 = iMo2045c;
            }
            m599Y(view, i4, iMo2053k, i3, i2);
            m659A1(c0157f5, this.f1036x.f3427e, i);
            m682s1(c0147v, this.f1036x);
            if (this.f1036x.f3430h && view.hasFocusable()) {
                this.f1016A.set(c0157f5.f1068e, false);
            }
            z3 = true;
            z2 = false;
        }
        if (!z3) {
            m682s1(c0147v, this.f1036x);
        }
        if (this.f1036x.f3427e == -1) {
            iM673j1 = this.f1032t.mo2053k() - m674k1(this.f1032t.mo2053k());
        } else {
            iM673j1 = m673j1(this.f1032t.mo2049g()) - this.f1032t.mo2049g();
        }
        if (iM673j1 > 0) {
            return Math.min(c0551n.f3424b, iM673j1);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: d */
    public void mo460d(String str) {
        RecyclerView recyclerView;
        if (this.f1023H != null || (recyclerView = this.f959b) == null) {
            return;
        }
        recyclerView.assertNotInLayoutOrScroll(str);
    }

    /* JADX INFO: renamed from: d1 */
    public View m667d1(boolean z) {
        int iMo2053k = this.f1032t.mo2053k();
        int iMo2049g = this.f1032t.mo2049g();
        View view = null;
        for (int iM619y = m619y() - 1; iM619y >= 0; iM619y--) {
            View viewM618x = m618x(iM619y);
            int iMo2047e = this.f1032t.mo2047e(viewM618x);
            int iMo2044b = this.f1032t.mo2044b(viewM618x);
            if (iMo2044b > iMo2053k && iMo2047e < iMo2049g) {
                if (iMo2044b <= iMo2049g || !z) {
                    return viewM618x;
                }
                if (view == null) {
                    view = viewM618x;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: e */
    public boolean mo462e() {
        return this.f1034v == 0;
    }

    /* JADX INFO: renamed from: e1 */
    public View m668e1(boolean z) {
        int iMo2053k = this.f1032t.mo2053k();
        int iMo2049g = this.f1032t.mo2049g();
        int iM619y = m619y();
        View view = null;
        for (int i = 0; i < iM619y; i++) {
            View viewM618x = m618x(i);
            int iMo2047e = this.f1032t.mo2047e(viewM618x);
            if (this.f1032t.mo2044b(viewM618x) > iMo2053k && iMo2047e < iMo2049g) {
                if (iMo2047e >= iMo2053k || !z) {
                    return viewM618x;
                }
                if (view == null) {
                    view = viewM618x;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: f */
    public boolean mo464f() {
        return this.f1034v == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: f0 */
    public void mo465f0(RecyclerView recyclerView, RecyclerView.C0147v c0147v) {
        m607e0();
        Runnable runnable = this.f1029N;
        RecyclerView recyclerView2 = this.f959b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(runnable);
        }
        for (int i = 0; i < this.f1030r; i++) {
            this.f1031s[i].m701d();
        }
        recyclerView.requestLayout();
    }

    /* JADX INFO: renamed from: f1 */
    public final void m669f1(RecyclerView.C0147v c0147v, RecyclerView.C0123a0 c0123a0, boolean z) {
        int iMo2049g;
        int iM673j1 = m673j1(RecyclerView.UNDEFINED_DURATION);
        if (iM673j1 != Integer.MIN_VALUE && (iMo2049g = this.f1032t.mo2049g() - iM673j1) > 0) {
            int i = iMo2049g - (-m686w1(-iMo2049g, c0147v, c0123a0));
            if (!z || i <= 0) {
                return;
            }
            this.f1032t.mo2057p(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: g */
    public boolean mo425g(RecyclerView.C0141p c0141p) {
        return c0141p instanceof C0154c;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0030  */
    /* JADX WARN: Code duplicated, block: B:30:0x003e  */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: g0 */
    public View mo426g0(View view, int i, RecyclerView.C0147v c0147v, RecyclerView.C0123a0 c0123a0) {
        View viewM614s;
        int i2;
        if (m619y() == 0 || (viewM614s = m614s(view)) == null) {
            return null;
        }
        m685v1();
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i == 66 ? this.f1034v == 0 : !(i != 130 || this.f1034v != 1)) {
                            i2 = 1;
                        }
                    } else if (this.f1034v == 1) {
                        i2 = -1;
                    }
                    i2 = RecyclerView.UNDEFINED_DURATION;
                } else if (this.f1034v == 0) {
                    i2 = -1;
                } else {
                    i2 = RecyclerView.UNDEFINED_DURATION;
                }
            } else if (this.f1034v != 1 && m677n1()) {
                i2 = -1;
            } else {
                i2 = 1;
            }
        } else if (this.f1034v != 1 && m677n1()) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        C0154c c0154c = (C0154c) viewM614s.getLayoutParams();
        Objects.requireNonNull(c0154c);
        C0157f c0157f = c0154c.f1047e;
        int iM672i1 = i2 == 1 ? m672i1() : m671h1();
        m689z1(iM672i1, c0123a0);
        m687x1(i2);
        C0551n c0551n = this.f1036x;
        c0551n.f3425c = c0551n.f3426d + iM672i1;
        c0551n.f3424b = (int) (this.f1032t.mo2054l() * 0.33333334f);
        C0551n c0551n2 = this.f1036x;
        c0551n2.f3430h = true;
        c0551n2.f3423a = false;
        m666c1(c0147v, c0551n2, c0123a0);
        this.f1021F = this.f1038z;
        View viewM706i = c0157f.m706i(iM672i1, i2);
        if (viewM706i != null && viewM706i != viewM614s) {
            return viewM706i;
        }
        if (m680q1(i2)) {
            for (int i3 = this.f1030r - 1; i3 >= 0; i3--) {
                View viewM706i2 = this.f1031s[i3].m706i(iM672i1, i2);
                if (viewM706i2 != null && viewM706i2 != viewM614s) {
                    return viewM706i2;
                }
            }
        } else {
            for (int i4 = 0; i4 < this.f1030r; i4++) {
                View viewM706i3 = this.f1031s[i4].m706i(iM672i1, i2);
                if (viewM706i3 != null && viewM706i3 != viewM614s) {
                    return viewM706i3;
                }
            }
        }
        boolean z = (this.f1037y ^ true) == (i2 == -1);
        View viewMo484t = mo484t(z ? c0157f.m702e() : c0157f.m703f());
        if (viewMo484t != null && viewMo484t != viewM614s) {
            return viewMo484t;
        }
        if (m680q1(i2)) {
            for (int i5 = this.f1030r - 1; i5 >= 0; i5--) {
                if (i5 != c0157f.f1068e) {
                    C0157f[] c0157fArr = this.f1031s;
                    View viewMo484t2 = mo484t(z ? c0157fArr[i5].m702e() : c0157fArr[i5].m703f());
                    if (viewMo484t2 != null && viewMo484t2 != viewM614s) {
                        return viewMo484t2;
                    }
                }
            }
        } else {
            for (int i6 = 0; i6 < this.f1030r; i6++) {
                C0157f[] c0157fArr2 = this.f1031s;
                View viewMo484t3 = mo484t(z ? c0157fArr2[i6].m702e() : c0157fArr2[i6].m703f());
                if (viewMo484t3 != null && viewMo484t3 != viewM614s) {
                    return viewMo484t3;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g1 */
    public final void m670g1(RecyclerView.C0147v c0147v, RecyclerView.C0123a0 c0123a0, boolean z) {
        int iMo2053k;
        int iM674k1 = m674k1(Integer.MAX_VALUE);
        if (iM674k1 != Integer.MAX_VALUE && (iMo2053k = iM674k1 - this.f1032t.mo2053k()) > 0) {
            int iM686w1 = iMo2053k - m686w1(iMo2053k, c0147v, c0123a0);
            if (!z || iM686w1 <= 0) {
                return;
            }
            this.f1032t.mo2057p(-iM686w1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: h0 */
    public void mo468h0(AccessibilityEvent accessibilityEvent) {
        RecyclerView.C0147v c0147v = this.f959b.mRecycler;
        m608i0(accessibilityEvent);
        if (m619y() > 0) {
            View viewM668e1 = m668e1(false);
            View viewM667d1 = m667d1(false);
            if (viewM668e1 == null || viewM667d1 == null) {
                return;
            }
            int iM589P = m589P(viewM668e1);
            int iM589P2 = m589P(viewM667d1);
            if (iM589P < iM589P2) {
                accessibilityEvent.setFromIndex(iM589P);
                accessibilityEvent.setToIndex(iM589P2);
            } else {
                accessibilityEvent.setFromIndex(iM589P2);
                accessibilityEvent.setToIndex(iM589P);
            }
        }
    }

    /* JADX INFO: renamed from: h1 */
    public int m671h1() {
        if (m619y() == 0) {
            return 0;
        }
        return m589P(m618x(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: i */
    public void mo470i(int i, int i2, RecyclerView.C0123a0 c0123a0, RecyclerView.AbstractC0140o.c cVar) {
        int iM705h;
        int iM708k;
        if (this.f1034v != 0) {
            i = i2;
        }
        if (m619y() == 0 || i == 0) {
            return;
        }
        m681r1(i, c0123a0);
        int[] iArr = this.f1028M;
        if (iArr == null || iArr.length < this.f1030r) {
            this.f1028M = new int[this.f1030r];
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f1030r; i4++) {
            C0551n c0551n = this.f1036x;
            if (c0551n.f3426d == -1) {
                iM705h = c0551n.f3428f;
                iM708k = this.f1031s[i4].m708k(iM705h);
            } else {
                iM705h = this.f1031s[i4].m705h(c0551n.f3429g);
                iM708k = this.f1036x.f3429g;
            }
            int i5 = iM705h - iM708k;
            if (i5 >= 0) {
                this.f1028M[i3] = i5;
                i3++;
            }
        }
        Arrays.sort(this.f1028M, 0, i3);
        for (int i6 = 0; i6 < i3; i6++) {
            int i7 = this.f1036x.f3425c;
            if (!(i7 >= 0 && i7 < c0123a0.m501b())) {
                return;
            }
            ((RunnableC0550m.b) cVar).m2031a(this.f1036x.f3425c, this.f1028M[i6]);
            C0551n c0551n2 = this.f1036x;
            c0551n2.f3425c += c0551n2.f3426d;
        }
    }

    /* JADX INFO: renamed from: i1 */
    public int m672i1() {
        int iM619y = m619y();
        if (iM619y == 0) {
            return 0;
        }
        return m589P(m618x(iM619y - 1));
    }

    /* JADX INFO: renamed from: j1 */
    public final int m673j1(int i) {
        int iM705h = this.f1031s[0].m705h(i);
        for (int i2 = 1; i2 < this.f1030r; i2++) {
            int iM705h2 = this.f1031s[i2].m705h(i);
            if (iM705h2 > iM705h) {
                iM705h = iM705h2;
            }
        }
        return iM705h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: k */
    public int mo474k(RecyclerView.C0123a0 c0123a0) {
        return m663Z0(c0123a0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: k0 */
    public void mo427k0(RecyclerView.C0147v c0147v, RecyclerView.C0123a0 c0123a0, View view, C0429b c0429b) {
        int i;
        int i2;
        int i3;
        int i4;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0154c)) {
            m609j0(view, c0429b);
            return;
        }
        C0154c c0154c = (C0154c) layoutParams;
        if (this.f1034v == 0) {
            C0157f c0157f = c0154c.f1047e;
            i2 = c0157f == null ? -1 : c0157f.f1068e;
            i3 = 1;
            i = -1;
            i4 = -1;
        } else {
            C0157f c0157f2 = c0154c.f1047e;
            i = c0157f2 == null ? -1 : c0157f2.f1068e;
            i2 = -1;
            i3 = -1;
            i4 = 1;
        }
        c0429b.m1618m(C0429b.c.m1622a(i2, i3, i, i4, false, false));
    }

    /* JADX INFO: renamed from: k1 */
    public final int m674k1(int i) {
        int iM708k = this.f1031s[0].m708k(i);
        for (int i2 = 1; i2 < this.f1030r; i2++) {
            int iM708k2 = this.f1031s[i2].m708k(i);
            if (iM708k2 < iM708k) {
                iM708k = iM708k2;
            }
        }
        return iM708k;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: l */
    public int mo428l(RecyclerView.C0123a0 c0123a0) {
        return m664a1(c0123a0);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0025  */
    /* JADX WARN: Code duplicated, block: B:17:0x0028 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x002b  */
    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    /* JADX WARN: Code duplicated, block: B:21:0x003c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0043 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0044  */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: l1 */
    public final void m675l1(int i, int i2, int i3) {
        int i4;
        int i5;
        int iM672i1;
        int iM672i2 = this.f1038z ? m672i1() : m671h1();
        if (i3 == 8) {
            if (i < i2) {
                i4 = i2 + 1;
            } else {
                i4 = i + 1;
                i5 = i2;
            }
            this.f1019D.m695d(i5);
            if (i3 != 1) {
                this.f1019D.m696e(i, i2);
            } else if (i3 != 2) {
                this.f1019D.m697f(i, i2);
            } else if (i3 == 8) {
                this.f1019D.m697f(i, 1);
                this.f1019D.m696e(i2, 1);
            }
            if (i4 <= iM672i2) {
                return;
            }
            if (this.f1038z) {
                iM672i1 = m671h1();
            } else {
                iM672i1 = m672i1();
            }
            if (i5 <= iM672i1) {
                m580I0();
            }
        }
        i4 = i + i2;
        i5 = i;
        this.f1019D.m695d(i5);
        if (i3 != 1) {
            this.f1019D.m696e(i, i2);
        } else if (i3 != 2) {
            this.f1019D.m697f(i, i2);
        } else if (i3 == 8) {
            this.f1019D.m697f(i, 1);
            this.f1019D.m696e(i2, 1);
        }
        if (i4 <= iM672i2) {
            return;
        }
        if (this.f1038z) {
            iM672i1 = m671h1();
        } else {
            iM672i1 = m672i1();
        }
        if (i5 <= iM672i1) {
            m580I0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: m */
    public int mo429m(RecyclerView.C0123a0 c0123a0) {
        return m665b1(c0123a0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: m0 */
    public void mo430m0(RecyclerView recyclerView, int i, int i2) {
        m675l1(i, i2, 1);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c9  */
    /* JADX INFO: renamed from: m1 */
    public View m676m1() {
        int i;
        boolean z;
        View view;
        boolean z2;
        int iM619y = m619y() - 1;
        BitSet bitSet = new BitSet(this.f1030r);
        bitSet.set(0, this.f1030r, true);
        byte b2 = (this.f1034v == 1 && m677n1()) ? (byte) 1 : (byte) -1;
        if (this.f1038z) {
            i = -1;
        } else {
            i = iM619y + 1;
            iM619y = 0;
        }
        int i2 = iM619y < i ? 1 : -1;
        while (iM619y != i) {
            View viewM618x = m618x(iM619y);
            C0154c c0154c = (C0154c) viewM618x.getLayoutParams();
            if (bitSet.get(c0154c.f1047e.f1068e)) {
                C0157f c0157f = c0154c.f1047e;
                if (this.f1038z) {
                    int i3 = c0157f.f1066c;
                    if (i3 == Integer.MIN_VALUE) {
                        c0157f.m699b();
                        i3 = c0157f.f1066c;
                    }
                    if (i3 < this.f1032t.mo2049g()) {
                        ArrayList<View> arrayList = c0157f.f1064a;
                        view = arrayList.get(arrayList.size() - 1);
                        Objects.requireNonNull(c0157f.m707j(view));
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    int i4 = c0157f.f1065b;
                    if (i4 == Integer.MIN_VALUE) {
                        c0157f.m700c();
                        i4 = c0157f.f1065b;
                    }
                    if (i4 > this.f1032t.mo2053k()) {
                        view = c0157f.f1064a.get(0);
                        Objects.requireNonNull(c0157f.m707j(view));
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    return viewM618x;
                }
                bitSet.clear(c0154c.f1047e.f1068e);
            }
            int i5 = iM619y + i2;
            if (i5 != i) {
                View viewM618x2 = m618x(i5);
                if (this.f1038z) {
                    int iMo2044b = this.f1032t.mo2044b(viewM618x);
                    int iMo2044b2 = this.f1032t.mo2044b(viewM618x2);
                    if (iMo2044b < iMo2044b2) {
                        return viewM618x;
                    }
                    if (iMo2044b == iMo2044b2) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    int iMo2047e = this.f1032t.mo2047e(viewM618x);
                    int iMo2047e2 = this.f1032t.mo2047e(viewM618x2);
                    if (iMo2047e > iMo2047e2) {
                        return viewM618x;
                    }
                    if (iMo2047e == iMo2047e2) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    if ((c0154c.f1047e.f1068e - ((C0154c) viewM618x2.getLayoutParams()).f1047e.f1068e < 0) != (b2 < 0)) {
                        return viewM618x;
                    }
                } else {
                    continue;
                }
            }
            iM619y += i2;
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: n */
    public int mo478n(RecyclerView.C0123a0 c0123a0) {
        return m663Z0(c0123a0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: n0 */
    public void mo431n0(RecyclerView recyclerView) {
        this.f1019D.m692a();
        m580I0();
    }

    /* JADX INFO: renamed from: n1 */
    public boolean m677n1() {
        return m579I() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: o */
    public int mo433o(RecyclerView.C0123a0 c0123a0) {
        return m664a1(c0123a0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: o0 */
    public void mo434o0(RecyclerView recyclerView, int i, int i2, int i3) {
        m675l1(i, i2, 8);
    }

    /* JADX INFO: renamed from: o1 */
    public final void m678o1(View view, int i, int i2, boolean z) {
        Rect rect = this.f1025J;
        RecyclerView recyclerView = this.f959b;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.getItemDecorInsetsForChild(view));
        }
        C0154c c0154c = (C0154c) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c0154c).leftMargin;
        Rect rect2 = this.f1025J;
        int iM660B1 = m660B1(i, i3 + rect2.left, ((ViewGroup.MarginLayoutParams) c0154c).rightMargin + rect2.right);
        int i4 = ((ViewGroup.MarginLayoutParams) c0154c).topMargin;
        Rect rect3 = this.f1025J;
        int iM660B2 = m660B1(i2, i4 + rect3.top, ((ViewGroup.MarginLayoutParams) c0154c).bottomMargin + rect3.bottom);
        if (z ? m595T0(view, iM660B1, iM660B2, c0154c) : m592R0(view, iM660B1, iM660B2, c0154c)) {
            view.measure(iM660B1, iM660B2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: p */
    public int mo435p(RecyclerView.C0123a0 c0123a0) {
        return m665b1(c0123a0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: p0 */
    public void mo436p0(RecyclerView recyclerView, int i, int i2) {
        m675l1(i, i2, 2);
    }

    /* JADX WARN: Code duplicated, block: B:250:0x03fc  */
    /* JADX INFO: renamed from: p1 */
    public final void m679p1(RecyclerView.C0147v c0147v, RecyclerView.C0123a0 c0123a0, boolean z) {
        boolean z2;
        C0156e c0156e;
        boolean z3;
        int iM589P;
        int i;
        int iMo2049g;
        int iMo2049g2;
        int iMo2053k;
        int iMo2047e;
        boolean z4;
        C0153b c0153b = this.f1026K;
        if (!(this.f1023H == null && this.f1017B == -1) && c0123a0.m501b() == 0) {
            m568C0(c0147v);
            c0153b.m691b();
            return;
        }
        boolean z5 = (c0153b.f1044e && this.f1017B == -1 && this.f1023H == null) ? false : true;
        if (z5) {
            c0153b.m691b();
            C0156e c0156e2 = this.f1023H;
            if (c0156e2 != null) {
                int i2 = c0156e2.f1056d;
                if (i2 > 0) {
                    if (i2 == this.f1030r) {
                        for (int i3 = 0; i3 < this.f1030r; i3++) {
                            this.f1031s[i3].m701d();
                            C0156e c0156e3 = this.f1023H;
                            int iMo2049g3 = c0156e3.f1057e[i3];
                            if (iMo2049g3 != Integer.MIN_VALUE) {
                                iMo2049g3 += c0156e3.f1062j ? this.f1032t.mo2049g() : this.f1032t.mo2053k();
                            }
                            C0157f c0157f = this.f1031s[i3];
                            c0157f.f1065b = iMo2049g3;
                            c0157f.f1066c = iMo2049g3;
                        }
                    } else {
                        c0156e2.f1057e = null;
                        c0156e2.f1056d = 0;
                        c0156e2.f1058f = 0;
                        c0156e2.f1059g = null;
                        c0156e2.f1060h = null;
                        c0156e2.f1054b = c0156e2.f1055c;
                    }
                }
                C0156e c0156e4 = this.f1023H;
                this.f1022G = c0156e4.f1063k;
                boolean z6 = c0156e4.f1061i;
                mo460d(null);
                C0156e c0156e5 = this.f1023H;
                if (c0156e5 != null && c0156e5.f1061i != z6) {
                    c0156e5.f1061i = z6;
                }
                this.f1037y = z6;
                m580I0();
                m685v1();
                C0156e c0156e6 = this.f1023H;
                int i4 = c0156e6.f1054b;
                if (i4 != -1) {
                    this.f1017B = i4;
                    z4 = c0156e6.f1062j;
                } else {
                    z4 = this.f1038z;
                }
                c0153b.f1042c = z4;
                if (c0156e6.f1058f > 1) {
                    C0155d c0155d = this.f1019D;
                    c0155d.f1048a = c0156e6.f1059g;
                    c0155d.f1049b = c0156e6.f1060h;
                }
            } else {
                m685v1();
                c0153b.f1042c = this.f1038z;
            }
            if (c0123a0.f909g || (i = this.f1017B) == -1) {
                z3 = false;
            } else if (i < 0 || i >= c0123a0.m501b()) {
                this.f1017B = -1;
                this.f1018C = RecyclerView.UNDEFINED_DURATION;
                z3 = false;
            } else {
                C0156e c0156e7 = this.f1023H;
                if (c0156e7 == null || c0156e7.f1054b == -1 || c0156e7.f1056d < 1) {
                    View viewMo484t = mo484t(this.f1017B);
                    if (viewMo484t != null) {
                        c0153b.f1040a = this.f1038z ? m672i1() : m671h1();
                        if (this.f1018C != Integer.MIN_VALUE) {
                            if (c0153b.f1042c) {
                                iMo2053k = this.f1032t.mo2049g() - this.f1018C;
                                iMo2047e = this.f1032t.mo2044b(viewMo484t);
                            } else {
                                iMo2053k = this.f1032t.mo2053k() + this.f1018C;
                                iMo2047e = this.f1032t.mo2047e(viewMo484t);
                            }
                            iMo2049g = iMo2053k - iMo2047e;
                        } else {
                            if (this.f1032t.mo2045c(viewMo484t) > this.f1032t.mo2054l()) {
                                iMo2049g2 = c0153b.f1042c ? this.f1032t.mo2049g() : this.f1032t.mo2053k();
                            } else {
                                int iMo2047e2 = this.f1032t.mo2047e(viewMo484t) - this.f1032t.mo2053k();
                                if (iMo2047e2 < 0) {
                                    iMo2049g2 = -iMo2047e2;
                                } else {
                                    iMo2049g = this.f1032t.mo2049g() - this.f1032t.mo2044b(viewMo484t);
                                    if (iMo2049g >= 0) {
                                        c0153b.f1041b = RecyclerView.UNDEFINED_DURATION;
                                    }
                                }
                            }
                            c0153b.f1041b = iMo2049g2;
                        }
                        c0153b.f1041b = iMo2049g;
                    } else {
                        int i5 = this.f1017B;
                        c0153b.f1040a = i5;
                        int i6 = this.f1018C;
                        if (i6 == Integer.MIN_VALUE) {
                            c0153b.f1042c = m661X0(i5) == 1;
                            c0153b.m690a();
                        } else {
                            c0153b.f1041b = c0153b.f1042c ? StaggeredGridLayoutManager.this.f1032t.mo2049g() - i6 : StaggeredGridLayoutManager.this.f1032t.mo2053k() + i6;
                        }
                        c0153b.f1043d = true;
                    }
                } else {
                    c0153b.f1041b = RecyclerView.UNDEFINED_DURATION;
                    c0153b.f1040a = this.f1017B;
                }
                z3 = true;
            }
            if (!z3) {
                boolean z7 = this.f1021F;
                int iM501b = c0123a0.m501b();
                if (z7) {
                    int iM619y = m619y();
                    while (true) {
                        iM619y--;
                        if (iM619y < 0) {
                            iM589P = 0;
                            break;
                        }
                        iM589P = m589P(m618x(iM619y));
                        if (iM589P >= 0 && iM589P < iM501b) {
                            break;
                        }
                    }
                } else {
                    int iM619y2 = m619y();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= iM619y2) {
                            iM589P = 0;
                            break;
                        }
                        int iM589P2 = m589P(m618x(i7));
                        if (iM589P2 >= 0 && iM589P2 < iM501b) {
                            iM589P = iM589P2;
                            break;
                        }
                        i7++;
                    }
                }
                c0153b.f1040a = iM589P;
                c0153b.f1041b = RecyclerView.UNDEFINED_DURATION;
            }
            c0153b.f1044e = true;
        }
        if (this.f1023H == null && this.f1017B == -1 && (c0153b.f1042c != this.f1021F || m677n1() != this.f1022G)) {
            this.f1019D.m692a();
            c0153b.f1043d = true;
        }
        if (m619y() > 0 && ((c0156e = this.f1023H) == null || c0156e.f1056d < 1)) {
            if (c0153b.f1043d) {
                for (int i8 = 0; i8 < this.f1030r; i8++) {
                    this.f1031s[i8].m701d();
                    int i9 = c0153b.f1041b;
                    if (i9 != Integer.MIN_VALUE) {
                        C0157f c0157f2 = this.f1031s[i8];
                        c0157f2.f1065b = i9;
                        c0157f2.f1066c = i9;
                    }
                }
            } else if (z5 || this.f1026K.f1045f == null) {
                for (int i10 = 0; i10 < this.f1030r; i10++) {
                    C0157f c0157f3 = this.f1031s[i10];
                    boolean z8 = this.f1038z;
                    int i11 = c0153b.f1041b;
                    int iM705h = z8 ? c0157f3.m705h(RecyclerView.UNDEFINED_DURATION) : c0157f3.m708k(RecyclerView.UNDEFINED_DURATION);
                    c0157f3.m701d();
                    if (iM705h != Integer.MIN_VALUE && ((!z8 || iM705h >= StaggeredGridLayoutManager.this.f1032t.mo2049g()) && (z8 || iM705h <= StaggeredGridLayoutManager.this.f1032t.mo2053k()))) {
                        if (i11 != Integer.MIN_VALUE) {
                            iM705h += i11;
                        }
                        c0157f3.f1066c = iM705h;
                        c0157f3.f1065b = iM705h;
                    }
                }
                C0153b c0153b2 = this.f1026K;
                C0157f[] c0157fArr = this.f1031s;
                Objects.requireNonNull(c0153b2);
                int length = c0157fArr.length;
                int[] iArr = c0153b2.f1045f;
                if (iArr == null || iArr.length < length) {
                    c0153b2.f1045f = new int[StaggeredGridLayoutManager.this.f1031s.length];
                }
                for (int i12 = 0; i12 < length; i12++) {
                    c0153b2.f1045f[i12] = c0157fArr[i12].m708k(RecyclerView.UNDEFINED_DURATION);
                }
            } else {
                for (int i13 = 0; i13 < this.f1030r; i13++) {
                    C0157f c0157f4 = this.f1031s[i13];
                    c0157f4.m701d();
                    int i14 = this.f1026K.f1045f[i13];
                    c0157f4.f1065b = i14;
                    c0157f4.f1066c = i14;
                }
            }
        }
        m611q(c0147v);
        this.f1036x.f3423a = false;
        int iMo2054l = this.f1033u.mo2054l();
        this.f1035w = iMo2054l / this.f1030r;
        this.f1024I = View.MeasureSpec.makeMeasureSpec(iMo2054l, this.f1033u.mo2051i());
        m689z1(c0153b.f1040a, c0123a0);
        if (c0153b.f1042c) {
            m687x1(-1);
            m666c1(c0147v, this.f1036x, c0123a0);
            m687x1(1);
        } else {
            m687x1(1);
            m666c1(c0147v, this.f1036x, c0123a0);
            m687x1(-1);
        }
        C0551n c0551n = this.f1036x;
        c0551n.f3425c = c0153b.f1040a + c0551n.f3426d;
        m666c1(c0147v, c0551n, c0123a0);
        if (this.f1033u.mo2051i() != 1073741824) {
            float fMax = 0.0f;
            int iM619y3 = m619y();
            for (int i15 = 0; i15 < iM619y3; i15++) {
                View viewM618x = m618x(i15);
                float fMo2045c = this.f1033u.mo2045c(viewM618x);
                if (fMo2045c >= fMax) {
                    Objects.requireNonNull((C0154c) viewM618x.getLayoutParams());
                    fMax = Math.max(fMax, fMo2045c);
                }
            }
            int i16 = this.f1035w;
            int iRound = Math.round(fMax * this.f1030r);
            if (this.f1033u.mo2051i() == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, this.f1033u.mo2054l());
            }
            this.f1035w = iRound / this.f1030r;
            this.f1024I = View.MeasureSpec.makeMeasureSpec(iRound, this.f1033u.mo2051i());
            if (this.f1035w != i16) {
                for (int i17 = 0; i17 < iM619y3; i17++) {
                    View viewM618x2 = m618x(i17);
                    C0154c c0154c = (C0154c) viewM618x2.getLayoutParams();
                    Objects.requireNonNull(c0154c);
                    if (m677n1() && this.f1034v == 1) {
                        int i18 = this.f1030r;
                        int i19 = c0154c.f1047e.f1068e;
                        viewM618x2.offsetLeftAndRight(((-((i18 - 1) - i19)) * this.f1035w) - ((-((i18 - 1) - i19)) * i16));
                    } else {
                        int i20 = c0154c.f1047e.f1068e;
                        int i21 = this.f1034v;
                        int i22 = (this.f1035w * i20) - (i20 * i16);
                        if (i21 == 1) {
                            viewM618x2.offsetLeftAndRight(i22);
                        } else {
                            viewM618x2.offsetTopAndBottom(i22);
                        }
                    }
                }
            }
        }
        if (m619y() > 0) {
            if (this.f1038z) {
                m669f1(c0147v, c0123a0, true);
                m670g1(c0147v, c0123a0, false);
            } else {
                m670g1(c0147v, c0123a0, true);
                m669f1(c0147v, c0123a0, false);
            }
        }
        if (z && !c0123a0.f909g) {
            if ((this.f1020E == 0 || m619y() <= 0 || m676m1() == null) ? false : true) {
                Runnable runnable = this.f1029N;
                RecyclerView recyclerView = this.f959b;
                if (recyclerView != null) {
                    recyclerView.removeCallbacks(runnable);
                }
                z2 = m662Y0();
            }
        }
        if (c0123a0.f909g) {
            this.f1026K.m691b();
        }
        this.f1021F = c0153b.f1042c;
        this.f1022G = m677n1();
        if (z2) {
            this.f1026K.m691b();
            m679p1(c0147v, c0123a0, false);
        }
    }

    /* JADX INFO: renamed from: q1 */
    public final boolean m680q1(int i) {
        if (this.f1034v == 0) {
            return (i == -1) != this.f1038z;
        }
        return ((i == -1) == this.f1038z) == m677n1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: r0 */
    public void mo437r0(RecyclerView recyclerView, int i, int i2, Object obj) {
        m675l1(i, i2, 4);
    }

    /* JADX INFO: renamed from: r1 */
    public void m681r1(int i, RecyclerView.C0123a0 c0123a0) {
        int iM671h1;
        int i2;
        if (i > 0) {
            iM671h1 = m672i1();
            i2 = 1;
        } else {
            iM671h1 = m671h1();
            i2 = -1;
        }
        this.f1036x.f3423a = true;
        m689z1(iM671h1, c0123a0);
        m687x1(i2);
        C0551n c0551n = this.f1036x;
        c0551n.f3425c = iM671h1 + c0551n.f3426d;
        c0551n.f3424b = Math.abs(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: s0 */
    public void mo438s0(RecyclerView.C0147v c0147v, RecyclerView.C0123a0 c0123a0) {
        m679p1(c0147v, c0123a0, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0011, code lost:
    
        if (r6.f3427e == (-1)) goto L11;
     */
    /* JADX INFO: renamed from: s1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m682s1(androidx.recyclerview.widget.RecyclerView.C0147v r5, p006b.p068t.p069b.C0551n r6) {
        /*
            r4 = this;
            boolean r0 = r6.f3423a
            if (r0 == 0) goto L7c
            boolean r0 = r6.f3431i
            if (r0 == 0) goto La
            goto L7c
        La:
            int r0 = r6.f3424b
            r1 = -1
            if (r0 != 0) goto L1f
            int r0 = r6.f3427e
            if (r0 != r1) goto L19
        L13:
            int r6 = r6.f3429g
        L15:
            r4.m683t1(r5, r6)
            goto L7c
        L19:
            int r6 = r6.f3428f
        L1b:
            r4.m684u1(r5, r6)
            goto L7c
        L1f:
            int r0 = r6.f3427e
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L50
            int r0 = r6.f3428f
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r4.f1031s
            r1 = r1[r2]
            int r1 = r1.m708k(r0)
        L2f:
            int r2 = r4.f1030r
            if (r3 >= r2) goto L41
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r2 = r4.f1031s
            r2 = r2[r3]
            int r2 = r2.m708k(r0)
            if (r2 <= r1) goto L3e
            r1 = r2
        L3e:
            int r3 = r3 + 1
            goto L2f
        L41:
            int r0 = r0 - r1
            if (r0 >= 0) goto L45
            goto L13
        L45:
            int r1 = r6.f3429g
            int r6 = r6.f3424b
            int r6 = java.lang.Math.min(r0, r6)
            int r6 = r1 - r6
            goto L15
        L50:
            int r0 = r6.f3429g
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r4.f1031s
            r1 = r1[r2]
            int r1 = r1.m705h(r0)
        L5a:
            int r2 = r4.f1030r
            if (r3 >= r2) goto L6c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r2 = r4.f1031s
            r2 = r2[r3]
            int r2 = r2.m705h(r0)
            if (r2 >= r1) goto L69
            r1 = r2
        L69:
            int r3 = r3 + 1
            goto L5a
        L6c:
            int r0 = r6.f3429g
            int r1 = r1 - r0
            if (r1 >= 0) goto L72
            goto L19
        L72:
            int r0 = r6.f3428f
            int r6 = r6.f3424b
            int r6 = java.lang.Math.min(r1, r6)
            int r6 = r6 + r0
            goto L1b
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m682s1(androidx.recyclerview.widget.RecyclerView$v, b.t.b.n):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: t0 */
    public void mo439t0(RecyclerView.C0123a0 c0123a0) {
        this.f1017B = -1;
        this.f1018C = RecyclerView.UNDEFINED_DURATION;
        this.f1023H = null;
        this.f1026K.m691b();
    }

    /* JADX INFO: renamed from: t1 */
    public final void m683t1(RecyclerView.C0147v c0147v, int i) {
        for (int iM619y = m619y() - 1; iM619y >= 0; iM619y--) {
            View viewM618x = m618x(iM619y);
            if (this.f1032t.mo2047e(viewM618x) < i || this.f1032t.mo2056o(viewM618x) < i) {
                return;
            }
            C0154c c0154c = (C0154c) viewM618x.getLayoutParams();
            Objects.requireNonNull(c0154c);
            if (c0154c.f1047e.f1064a.size() == 1) {
                return;
            }
            c0154c.f1047e.m709l();
            m572E0(viewM618x, c0147v);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: u */
    public RecyclerView.C0141p mo441u() {
        return this.f1034v == 0 ? new C0154c(-2, -1) : new C0154c(-1, -2);
    }

    /* JADX INFO: renamed from: u1 */
    public final void m684u1(RecyclerView.C0147v c0147v, int i) {
        while (m619y() > 0) {
            View viewM618x = m618x(0);
            if (this.f1032t.mo2044b(viewM618x) > i || this.f1032t.mo2055n(viewM618x) > i) {
                return;
            }
            C0154c c0154c = (C0154c) viewM618x.getLayoutParams();
            Objects.requireNonNull(c0154c);
            if (c0154c.f1047e.f1064a.size() == 1) {
                return;
            }
            c0154c.f1047e.m710m();
            m572E0(viewM618x, c0147v);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: v */
    public RecyclerView.C0141p mo443v(Context context, AttributeSet attributeSet) {
        return new C0154c(context, attributeSet);
    }

    /* JADX INFO: renamed from: v1 */
    public final void m685v1() {
        this.f1038z = (this.f1034v == 1 || !m677n1()) ? this.f1037y : !this.f1037y;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: w */
    public RecyclerView.C0141p mo444w(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0154c((ViewGroup.MarginLayoutParams) layoutParams) : new C0154c(layoutParams);
    }

    /* JADX INFO: renamed from: w1 */
    public int m686w1(int i, RecyclerView.C0147v c0147v, RecyclerView.C0123a0 c0123a0) {
        if (m619y() == 0 || i == 0) {
            return 0;
        }
        m681r1(i, c0123a0);
        int iM666c1 = m666c1(c0147v, this.f1036x, c0123a0);
        if (this.f1036x.f3424b >= iM666c1) {
            i = i < 0 ? -iM666c1 : iM666c1;
        }
        this.f1032t.mo2057p(-i);
        this.f1021F = this.f1038z;
        C0551n c0551n = this.f1036x;
        c0551n.f3424b = 0;
        m682s1(c0147v, c0551n);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: x0 */
    public void mo487x0(Parcelable parcelable) {
        if (parcelable instanceof C0156e) {
            this.f1023H = (C0156e) parcelable;
            m580I0();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m687x1(int i) {
        C0551n c0551n = this.f1036x;
        c0551n.f3427e = i;
        c0551n.f3426d = this.f1038z != (i == -1) ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: y0 */
    public Parcelable mo489y0() {
        int iM708k;
        int iMo2053k;
        int[] iArr;
        C0156e c0156e = this.f1023H;
        if (c0156e != null) {
            return new C0156e(c0156e);
        }
        C0156e c0156e2 = new C0156e();
        c0156e2.f1061i = this.f1037y;
        c0156e2.f1062j = this.f1021F;
        c0156e2.f1063k = this.f1022G;
        C0155d c0155d = this.f1019D;
        if (c0155d == null || (iArr = c0155d.f1048a) == null) {
            c0156e2.f1058f = 0;
        } else {
            c0156e2.f1059g = iArr;
            c0156e2.f1058f = iArr.length;
            c0156e2.f1060h = c0155d.f1049b;
        }
        if (m619y() > 0) {
            c0156e2.f1054b = this.f1021F ? m672i1() : m671h1();
            View viewM667d1 = this.f1038z ? m667d1(true) : m668e1(true);
            c0156e2.f1055c = viewM667d1 != null ? m589P(viewM667d1) : -1;
            int i = this.f1030r;
            c0156e2.f1056d = i;
            c0156e2.f1057e = new int[i];
            for (int i2 = 0; i2 < this.f1030r; i2++) {
                if (this.f1021F) {
                    iM708k = this.f1031s[i2].m705h(RecyclerView.UNDEFINED_DURATION);
                    if (iM708k != Integer.MIN_VALUE) {
                        iMo2053k = this.f1032t.mo2049g();
                        iM708k -= iMo2053k;
                    }
                } else {
                    iM708k = this.f1031s[i2].m708k(RecyclerView.UNDEFINED_DURATION);
                    if (iM708k != Integer.MIN_VALUE) {
                        iMo2053k = this.f1032t.mo2053k();
                        iM708k -= iMo2053k;
                    }
                }
                c0156e2.f1057e[i2] = iM708k;
            }
        } else {
            c0156e2.f1054b = -1;
            c0156e2.f1055c = -1;
            c0156e2.f1056d = 0;
        }
        return c0156e2;
    }

    /* JADX INFO: renamed from: y1 */
    public final void m688y1(int i, int i2) {
        for (int i3 = 0; i3 < this.f1030r; i3++) {
            if (!this.f1031s[i3].f1064a.isEmpty()) {
                m659A1(this.f1031s[i3], i, i2);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: z0 */
    public void mo620z0(int i) {
        if (i == 0) {
            m662Y0();
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x003f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0042  */
    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    /* JADX INFO: renamed from: z1 */
    public final void m689z1(int i, RecyclerView.C0123a0 c0123a0) {
        int iMo2054l;
        int iMo2054l2;
        RecyclerView recyclerView;
        boolean z;
        int i2;
        C0551n c0551n = this.f1036x;
        boolean z2 = false;
        c0551n.f3424b = 0;
        c0551n.f3425c = i;
        RecyclerView.AbstractC0151z abstractC0151z = this.f964g;
        if ((abstractC0151z != null && abstractC0151z.f1005e) && (i2 = c0123a0.f903a) != -1) {
            if (this.f1038z == (i2 < i)) {
                iMo2054l = this.f1032t.mo2054l();
            } else {
                iMo2054l2 = this.f1032t.mo2054l();
                iMo2054l = 0;
            }
            recyclerView = this.f959b;
            if (recyclerView == null && recyclerView.mClipToPadding) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f1036x.f3428f = this.f1032t.mo2053k() - iMo2054l2;
                this.f1036x.f3429g = this.f1032t.mo2049g() + iMo2054l;
            } else {
                this.f1036x.f3429g = this.f1032t.mo2048f() + iMo2054l;
                this.f1036x.f3428f = -iMo2054l2;
            }
            C0551n c0551n2 = this.f1036x;
            c0551n2.f3430h = false;
            c0551n2.f3423a = true;
            if (this.f1032t.mo2051i() == 0 && this.f1032t.mo2048f() == 0) {
                z2 = true;
            }
            c0551n2.f3431i = z2;
        }
        iMo2054l = 0;
        iMo2054l2 = 0;
        recyclerView = this.f959b;
        if (recyclerView == null) {
            z = false;
        } else {
            z = false;
        }
        if (z) {
            this.f1036x.f3428f = this.f1032t.mo2053k() - iMo2054l2;
            this.f1036x.f3429g = this.f1032t.mo2049g() + iMo2054l;
        } else {
            this.f1036x.f3429g = this.f1032t.mo2048f() + iMo2054l;
            this.f1036x.f3428f = -iMo2054l2;
        }
        C0551n c0551n3 = this.f1036x;
        c0551n3.f3430h = false;
        c0551n3.f3423a = true;
        if (this.f1032t.mo2051i() == 0) {
            z2 = true;
        }
        c0551n3.f3431i = z2;
    }
}
