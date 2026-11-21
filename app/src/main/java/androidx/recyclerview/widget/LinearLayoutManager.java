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
import java.util.List;
import java.util.Objects;
import b.s.m;
import p006b.p068t.p069b.AbstractC0557t;
import p006b.p068t.p069b.C0552o;
import p006b.p068t.p069b.RunnableC0550m;
import c.a.a.a.a;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.AbstractC0140o implements RecyclerView.AbstractC0151z.b {

    /* JADX INFO: renamed from: A */
    public int f863A;

    /* JADX INFO: renamed from: B */
    public C0121d f864B;

    /* JADX INFO: renamed from: C */
    public final C0118a f865C;

    /* JADX INFO: renamed from: D */
    public final C0119b f866D;

    /* JADX INFO: renamed from: E */
    public int f867E;

    /* JADX INFO: renamed from: F */
    public int[] f868F;

    /* JADX INFO: renamed from: r */
    public int f869r;

    /* JADX INFO: renamed from: s */
    public C0120c f870s;

    /* JADX INFO: renamed from: t */
    public AbstractC0557t f871t;

    /* JADX INFO: renamed from: u */
    public boolean f872u;

    /* JADX INFO: renamed from: v */
    public boolean f873v;

    /* JADX INFO: renamed from: w */
    public boolean f874w;

    /* JADX INFO: renamed from: x */
    public boolean f875x;

    /* JADX INFO: renamed from: y */
    public boolean f876y;

    /* JADX INFO: renamed from: z */
    public int f877z;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.LinearLayoutManager$a */
    public static class C0118a {

        /* JADX INFO: renamed from: a */
        public AbstractC0557t f878a;

        /* JADX INFO: renamed from: b */
        public int f879b;

        /* JADX INFO: renamed from: c */
        public int f880c;

        /* JADX INFO: renamed from: d */
        public boolean f881d;

        /* JADX INFO: renamed from: e */
        public boolean f882e;

        public C0118a() {
            m495d();
        }

        /* JADX INFO: renamed from: a */
        public void m492a() {
            this.f880c = this.f881d ? this.f878a.mo2049g() : this.f878a.mo2053k();
        }

        /* JADX INFO: renamed from: b */
        public void m493b(View view, int i) {
            if (this.f881d) {
                this.f880c = this.f878a.m2059m() + this.f878a.mo2044b(view);
            } else {
                this.f880c = this.f878a.mo2047e(view);
            }
            this.f879b = i;
        }

        /* JADX INFO: renamed from: c */
        public void m494c(View view, int i) {
            int iMin;
            int iM2059m = this.f878a.m2059m();
            if (iM2059m >= 0) {
                m493b(view, i);
                return;
            }
            this.f879b = i;
            if (this.f881d) {
                int iMo2049g = (this.f878a.mo2049g() - iM2059m) - this.f878a.mo2044b(view);
                this.f880c = this.f878a.mo2049g() - iMo2049g;
                if (iMo2049g <= 0) {
                    return;
                }
                int iMo2045c = this.f880c - this.f878a.mo2045c(view);
                int iMo2053k = this.f878a.mo2053k();
                int iMin2 = iMo2045c - (Math.min(this.f878a.mo2047e(view) - iMo2053k, 0) + iMo2053k);
                if (iMin2 >= 0) {
                    return;
                }
                iMin = Math.min(iMo2049g, -iMin2) + this.f880c;
            } else {
                int iMo2047e = this.f878a.mo2047e(view);
                int iMo2053k2 = iMo2047e - this.f878a.mo2053k();
                this.f880c = iMo2047e;
                if (iMo2053k2 <= 0) {
                    return;
                }
                int iMo2049g2 = (this.f878a.mo2049g() - Math.min(0, (this.f878a.mo2049g() - iM2059m) - this.f878a.mo2044b(view))) - (this.f878a.mo2045c(view) + iMo2047e);
                if (iMo2049g2 >= 0) {
                    return;
                } else {
                    iMin = this.f880c - Math.min(iMo2053k2, -iMo2049g2);
                }
            }
            this.f880c = iMin;
        }

        /* JADX INFO: renamed from: d */
        public void m495d() {
            this.f879b = -1;
            this.f880c = RecyclerView.UNDEFINED_DURATION;
            this.f881d = false;
            this.f882e = false;
        }

        public String toString() {
            StringBuilder sbM2191e = a.m2191e("AnchorInfo{mPosition=");
            sbM2191e.append(this.f879b);
            sbM2191e.append(", mCoordinate=");
            sbM2191e.append(this.f880c);
            sbM2191e.append(", mLayoutFromEnd=");
            sbM2191e.append(this.f881d);
            sbM2191e.append(", mValid=");
            sbM2191e.append(this.f882e);
            sbM2191e.append('}');
            return sbM2191e.toString();
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.LinearLayoutManager$b */
    public static class C0119b {

        /* JADX INFO: renamed from: a */
        public int f883a;

        /* JADX INFO: renamed from: b */
        public boolean f884b;

        /* JADX INFO: renamed from: c */
        public boolean f885c;

        /* JADX INFO: renamed from: d */
        public boolean f886d;
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.LinearLayoutManager$c */
    public static class C0120c {

        /* JADX INFO: renamed from: b */
        public int f888b;

        /* JADX INFO: renamed from: c */
        public int f889c;

        /* JADX INFO: renamed from: d */
        public int f890d;

        /* JADX INFO: renamed from: e */
        public int f891e;

        /* JADX INFO: renamed from: f */
        public int f892f;

        /* JADX INFO: renamed from: g */
        public int f893g;

        /* JADX INFO: renamed from: j */
        public int f896j;

        /* JADX INFO: renamed from: l */
        public boolean f898l;

        /* JADX INFO: renamed from: a */
        public boolean f887a = true;

        /* JADX INFO: renamed from: h */
        public int f894h = 0;

        /* JADX INFO: renamed from: i */
        public int f895i = 0;

        /* JADX INFO: renamed from: k */
        public List<RecyclerView.AbstractC0129d0> f897k = null;

        /* JADX INFO: renamed from: a */
        public void m496a(View view) {
            int iM626a;
            int size = this.f897k.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.f897k.get(i2).f927a;
                RecyclerView.C0141p c0141p = (RecyclerView.C0141p) view3.getLayoutParams();
                if (view3 != view && !c0141p.m628c() && (iM626a = (c0141p.m626a() - this.f890d) * this.f891e) >= 0 && iM626a < i) {
                    view2 = view3;
                    if (iM626a == 0) {
                        break;
                    } else {
                        i = iM626a;
                    }
                }
            }
            this.f890d = view2 == null ? -1 : ((RecyclerView.C0141p) view2.getLayoutParams()).m626a();
        }

        /* JADX INFO: renamed from: b */
        public boolean m497b(RecyclerView.C0123a0 c0123a0) {
            int i = this.f890d;
            return i >= 0 && i < c0123a0.m501b();
        }

        /* JADX INFO: renamed from: c */
        public View m498c(RecyclerView.C0147v c0147v) {
            List<RecyclerView.AbstractC0129d0> list = this.f897k;
            if (list == null) {
                View view = c0147v.m648k(this.f890d, false, RecyclerView.FOREVER_NS).f927a;
                this.f890d += this.f891e;
                return view;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view2 = this.f897k.get(i).f927a;
                RecyclerView.C0141p c0141p = (RecyclerView.C0141p) view2.getLayoutParams();
                if (!c0141p.m628c() && this.f890d == c0141p.m626a()) {
                    m496a(view2);
                    return view2;
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.LinearLayoutManager$d */
    @SuppressLint({"BanParcelableUsage"})
    public static class C0121d implements Parcelable {
        public static final Parcelable.Creator<C0121d> CREATOR = new a();

        /* JADX INFO: renamed from: b */
        public int f899b;

        /* JADX INFO: renamed from: c */
        public int f900c;

        /* JADX INFO: renamed from: d */
        public boolean f901d;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.LinearLayoutManager$d$a */
        public static class a implements Parcelable.Creator<C0121d> {
            @Override // android.os.Parcelable.Creator
            public C0121d createFromParcel(Parcel parcel) {
                return new C0121d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public C0121d[] newArray(int i) {
                return new C0121d[i];
            }
        }

        public C0121d() {
        }

        public C0121d(Parcel parcel) {
            this.f899b = parcel.readInt();
            this.f900c = parcel.readInt();
            this.f901d = parcel.readInt() == 1;
        }

        public C0121d(C0121d c0121d) {
            this.f899b = c0121d.f899b;
            this.f900c = c0121d.f900c;
            this.f901d = c0121d.f901d;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: j */
        public boolean m499j() {
            return this.f899b >= 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f899b);
            parcel.writeInt(this.f900c);
            parcel.writeInt(this.f901d ? 1 : 0);
        }
    }

    public LinearLayoutManager(int i, boolean z) {
        this.f869r = 1;
        this.f873v = false;
        this.f874w = false;
        this.f875x = false;
        this.f876y = true;
        this.f877z = -1;
        this.f863A = RecyclerView.UNDEFINED_DURATION;
        this.f864B = null;
        this.f865C = new C0118a();
        this.f866D = new C0119b();
        this.f867E = 2;
        this.f868F = new int[2];
        m446A1(i);
        mo460d(null);
        if (z == this.f873v) {
            return;
        }
        this.f873v = z;
        m580I0();
    }

    public LinearLayoutManager(Context context) {
        this(1, false);
    }

    /* JADX INFO: renamed from: A1 */
    public void m446A1(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(a.m2198l("invalid orientation:", i));
        }
        mo460d(null);
        if (i != this.f869r || this.f871t == null) {
            AbstractC0557t abstractC0557tM2058a = AbstractC0557t.m2058a(this, i);
            this.f871t = abstractC0557tM2058a;
            this.f865C.f878a = abstractC0557tM2058a;
            this.f869r = i;
            m580I0();
        }
    }

    /* JADX INFO: renamed from: B1 */
    public void mo408B1(boolean z) {
        mo460d(null);
        if (this.f875x == z) {
            return;
        }
        this.f875x = z;
        m580I0();
    }

    /* JADX INFO: renamed from: C1 */
    public final void m447C1(int i, int i2, boolean z, RecyclerView.C0123a0 c0123a0) {
        int iMo2053k;
        this.f870s.f898l = m488x1();
        this.f870s.f892f = i;
        int[] iArr = this.f868F;
        iArr[0] = 0;
        iArr[1] = 0;
        mo454X0(c0123a0, iArr);
        int iMax = Math.max(0, this.f868F[0]);
        int iMax2 = Math.max(0, this.f868F[1]);
        boolean z2 = i == 1;
        C0120c c0120c = this.f870s;
        int i3 = z2 ? iMax2 : iMax;
        c0120c.f894h = i3;
        if (!z2) {
            iMax = iMax2;
        }
        c0120c.f895i = iMax;
        if (z2) {
            c0120c.f894h = this.f871t.mo2050h() + i3;
            View viewM481q1 = m481q1();
            C0120c c0120c2 = this.f870s;
            c0120c2.f891e = this.f874w ? -1 : 1;
            int iM589P = m589P(viewM481q1);
            C0120c c0120c3 = this.f870s;
            c0120c2.f890d = iM589P + c0120c3.f891e;
            c0120c3.f888b = this.f871t.mo2044b(viewM481q1);
            iMo2053k = this.f871t.mo2044b(viewM481q1) - this.f871t.mo2049g();
        } else {
            View viewM482r1 = m482r1();
            C0120c c0120c4 = this.f870s;
            c0120c4.f894h = this.f871t.mo2053k() + c0120c4.f894h;
            C0120c c0120c5 = this.f870s;
            c0120c5.f891e = this.f874w ? 1 : -1;
            int iM589P2 = m589P(viewM482r1);
            C0120c c0120c6 = this.f870s;
            c0120c5.f890d = iM589P2 + c0120c6.f891e;
            c0120c6.f888b = this.f871t.mo2047e(viewM482r1);
            iMo2053k = (-this.f871t.mo2047e(viewM482r1)) + this.f871t.mo2053k();
        }
        C0120c c0120c7 = this.f870s;
        c0120c7.f889c = i2;
        if (z) {
            c0120c7.f889c = i2 - iMo2053k;
        }
        c0120c7.f893g = iMo2053k;
    }

    /* JADX INFO: renamed from: D1 */
    public final void m448D1(int i, int i2) {
        this.f870s.f889c = this.f871t.mo2049g() - i2;
        C0120c c0120c = this.f870s;
        c0120c.f891e = this.f874w ? -1 : 1;
        c0120c.f890d = i;
        c0120c.f892f = 1;
        c0120c.f888b = i2;
        c0120c.f893g = RecyclerView.UNDEFINED_DURATION;
    }

    /* JADX INFO: renamed from: E1 */
    public final void m449E1(int i, int i2) {
        this.f870s.f889c = i2 - this.f871t.mo2053k();
        C0120c c0120c = this.f870s;
        c0120c.f890d = i;
        c0120c.f891e = this.f874w ? 1 : -1;
        c0120c.f892f = -1;
        c0120c.f888b = i2;
        c0120c.f893g = RecyclerView.UNDEFINED_DURATION;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: J0 */
    public int mo413J0(int i, RecyclerView.C0147v c0147v, RecyclerView.C0123a0 c0123a0) {
        if (this.f869r == 1) {
            return 0;
        }
        return m491z1(i, c0147v, c0123a0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: K0 */
    public void mo450K0(int i) {
        this.f877z = i;
        this.f863A = RecyclerView.UNDEFINED_DURATION;
        C0121d c0121d = this.f864B;
        if (c0121d != null) {
            c0121d.f899b = -1;
        }
        m580I0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: L0 */
    public int mo416L0(int i, RecyclerView.C0147v c0147v, RecyclerView.C0123a0 c0123a0) {
        if (this.f869r == 0) {
            return 0;
        }
        return m491z1(i, c0147v, c0123a0);
    }

    /* JADX WARN: Code duplicated, block: B:23:? A[RETURN, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: S0 */
    public boolean mo451S0() {
        boolean z;
        if (this.f972o != 1073741824 && this.f971n != 1073741824) {
            int iM619y = m619y();
            for (int i = 0; i < iM619y; i++) {
                ViewGroup.LayoutParams layoutParams = m618x(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    z = true;
                    if (z) {
                        return true;
                    }
                }
            }
            z = false;
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: U */
    public boolean mo452U() {
        return true;
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
        return this.f864B == null && this.f872u == this.f875x;
    }

    /* JADX INFO: renamed from: X0 */
    public void mo454X0(RecyclerView.C0123a0 c0123a0, int[] iArr) {
        int i;
        int iMo2054l = c0123a0.f903a != -1 ? this.f871t.mo2054l() : 0;
        if (this.f870s.f892f == -1) {
            i = 0;
        } else {
            i = iMo2054l;
            iMo2054l = 0;
        }
        iArr[0] = iMo2054l;
        iArr[1] = i;
    }

    /* JADX INFO: renamed from: Y0 */
    public void mo424Y0(RecyclerView.C0123a0 c0123a0, C0120c c0120c, RecyclerView.AbstractC0140o.c cVar) {
        int i = c0120c.f890d;
        if (i < 0 || i >= c0123a0.m501b()) {
            return;
        }
        ((RunnableC0550m.b) cVar).m2031a(i, Math.max(0, c0120c.f893g));
    }

    /* JADX INFO: renamed from: Z0 */
    public final int m455Z0(RecyclerView.C0123a0 c0123a0) {
        if (m619y() == 0) {
            return 0;
        }
        m461d1();
        return m.m1960d(c0123a0, this.f871t, m469h1(!this.f876y, true), m467g1(!this.f876y, true), this, this.f876y);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0151z.b
    /* JADX INFO: renamed from: a */
    public PointF mo456a(int i) {
        if (m619y() == 0) {
            return null;
        }
        int i2 = (i < m589P(m618x(0))) != this.f874w ? -1 : 1;
        return this.f869r == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    /* JADX INFO: renamed from: a1 */
    public final int m457a1(RecyclerView.C0123a0 c0123a0) {
        if (m619y() == 0) {
            return 0;
        }
        m461d1();
        return m.m1961e(c0123a0, this.f871t, m469h1(!this.f876y, true), m467g1(!this.f876y, true), this, this.f876y, this.f874w);
    }

    /* JADX INFO: renamed from: b1 */
    public final int m458b1(RecyclerView.C0123a0 c0123a0) {
        if (m619y() == 0) {
            return 0;
        }
        m461d1();
        return m.m1962f(c0123a0, this.f871t, m469h1(!this.f876y, true), m467g1(!this.f876y, true), this, this.f876y);
    }

    /* JADX INFO: renamed from: c1 */
    public int m459c1(int i) {
        if (i == 1) {
            return (this.f869r != 1 && m483s1()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.f869r != 1 && m483s1()) ? -1 : 1;
        }
        if (i == 17) {
            if (this.f869r == 0) {
                return -1;
            }
            return RecyclerView.UNDEFINED_DURATION;
        }
        if (i == 33) {
            if (this.f869r == 1) {
                return -1;
            }
            return RecyclerView.UNDEFINED_DURATION;
        }
        if (i == 66) {
            if (this.f869r == 0) {
                return 1;
            }
            return RecyclerView.UNDEFINED_DURATION;
        }
        if (i == 130 && this.f869r == 1) {
            return 1;
        }
        return RecyclerView.UNDEFINED_DURATION;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: d */
    public void mo460d(String str) {
        RecyclerView recyclerView;
        if (this.f864B != null || (recyclerView = this.f959b) == null) {
            return;
        }
        recyclerView.assertNotInLayoutOrScroll(str);
    }

    /* JADX INFO: renamed from: d1 */
    public void m461d1() {
        if (this.f870s == null) {
            this.f870s = new C0120c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: e */
    public boolean mo462e() {
        return this.f869r == 0;
    }

    /* JADX INFO: renamed from: e1 */
    public int m463e1(RecyclerView.C0147v c0147v, C0120c c0120c, RecyclerView.C0123a0 c0123a0, boolean z) {
        int i = c0120c.f889c;
        int i2 = c0120c.f893g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                c0120c.f893g = i2 + i;
            }
            m485v1(c0147v, c0120c);
        }
        int i3 = c0120c.f889c + c0120c.f894h;
        C0119b c0119b = this.f866D;
        while (true) {
            if ((!c0120c.f898l && i3 <= 0) || !c0120c.m497b(c0123a0)) {
                break;
            }
            c0119b.f883a = 0;
            c0119b.f884b = false;
            c0119b.f885c = false;
            c0119b.f886d = false;
            mo440t1(c0147v, c0123a0, c0120c, c0119b);
            if (!c0119b.f884b) {
                int i4 = c0120c.f888b;
                int i5 = c0119b.f883a;
                c0120c.f888b = (c0120c.f892f * i5) + i4;
                if (!c0119b.f885c || c0120c.f897k != null || !c0123a0.f909g) {
                    c0120c.f889c -= i5;
                    i3 -= i5;
                }
                int i6 = c0120c.f893g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + i5;
                    c0120c.f893g = i7;
                    int i8 = c0120c.f889c;
                    if (i8 < 0) {
                        c0120c.f893g = i7 + i8;
                    }
                    m485v1(c0147v, c0120c);
                }
                if (z && c0119b.f886d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - c0120c.f889c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: f */
    public boolean mo464f() {
        return this.f869r == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: f0 */
    public void mo465f0(RecyclerView recyclerView, RecyclerView.C0147v c0147v) {
        m607e0();
    }

    /* JADX INFO: renamed from: f1 */
    public final View m466f1(RecyclerView.C0147v c0147v, RecyclerView.C0123a0 c0123a0) {
        return mo432n1(c0147v, c0123a0, 0, m619y(), c0123a0.m501b());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: g0 */
    public View mo426g0(View view, int i, RecyclerView.C0147v c0147v, RecyclerView.C0123a0 c0123a0) {
        int iM459c1;
        View viewM476l1;
        m490y1();
        if (m619y() == 0 || (iM459c1 = m459c1(i)) == Integer.MIN_VALUE) {
            return null;
        }
        m461d1();
        m447C1(iM459c1, (int) (this.f871t.mo2054l() * 0.33333334f), false, c0123a0);
        C0120c c0120c = this.f870s;
        c0120c.f893g = RecyclerView.UNDEFINED_DURATION;
        c0120c.f887a = false;
        m463e1(c0147v, c0120c, c0123a0, true);
        if (iM459c1 == -1) {
            viewM476l1 = this.f874w ? m476l1(m619y() - 1, -1) : m476l1(0, m619y());
        } else {
            viewM476l1 = this.f874w ? m476l1(0, m619y()) : m476l1(m619y() - 1, -1);
        }
        View viewM482r1 = iM459c1 == -1 ? m482r1() : m481q1();
        if (!viewM482r1.hasFocusable()) {
            return viewM476l1;
        }
        if (viewM476l1 == null) {
            return null;
        }
        return viewM482r1;
    }

    /* JADX INFO: renamed from: g1 */
    public View m467g1(boolean z, boolean z2) {
        int iM619y;
        int iM619y2;
        if (this.f874w) {
            iM619y = 0;
            iM619y2 = m619y();
        } else {
            iM619y = m619y() - 1;
            iM619y2 = -1;
        }
        return m477m1(iM619y, iM619y2, z, z2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: h0 */
    public void mo468h0(AccessibilityEvent accessibilityEvent) {
        RecyclerView.C0147v c0147v = this.f959b.mRecycler;
        m608i0(accessibilityEvent);
        if (m619y() > 0) {
            accessibilityEvent.setFromIndex(m471i1());
            accessibilityEvent.setToIndex(m475k1());
        }
    }

    /* JADX INFO: renamed from: h1 */
    public View m469h1(boolean z, boolean z2) {
        int iM619y;
        int iM619y2;
        if (this.f874w) {
            iM619y = m619y() - 1;
            iM619y2 = -1;
        } else {
            iM619y = 0;
            iM619y2 = m619y();
        }
        return m477m1(iM619y, iM619y2, z, z2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: i */
    public void mo470i(int i, int i2, RecyclerView.C0123a0 c0123a0, RecyclerView.AbstractC0140o.c cVar) {
        if (this.f869r != 0) {
            i = i2;
        }
        if (m619y() == 0 || i == 0) {
            return;
        }
        m461d1();
        m447C1(i > 0 ? 1 : -1, Math.abs(i), true, c0123a0);
        mo424Y0(c0123a0, this.f870s, cVar);
    }

    /* JADX INFO: renamed from: i1 */
    public int m471i1() {
        View viewM477m1 = m477m1(0, m619y(), false, true);
        if (viewM477m1 == null) {
            return -1;
        }
        return m589P(viewM477m1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: j */
    public void mo472j(int i, RecyclerView.AbstractC0140o.c cVar) {
        boolean z;
        int i2;
        C0121d c0121d = this.f864B;
        if (c0121d == null || !c0121d.m499j()) {
            m490y1();
            z = this.f874w;
            i2 = this.f877z;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            C0121d c0121d2 = this.f864B;
            z = c0121d2.f901d;
            i2 = c0121d2.f899b;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.f867E && i2 >= 0 && i2 < i; i4++) {
            ((RunnableC0550m.b) cVar).m2031a(i2, 0);
            i2 += i3;
        }
    }

    /* JADX INFO: renamed from: j1 */
    public final View m473j1(RecyclerView.C0147v c0147v, RecyclerView.C0123a0 c0123a0) {
        return mo432n1(c0147v, c0123a0, m619y() - 1, -1, c0123a0.m501b());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: k */
    public int mo474k(RecyclerView.C0123a0 c0123a0) {
        return m455Z0(c0123a0);
    }

    /* JADX INFO: renamed from: k1 */
    public int m475k1() {
        View viewM477m1 = m477m1(m619y() - 1, -1, false, true);
        if (viewM477m1 == null) {
            return -1;
        }
        return m589P(viewM477m1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: l */
    public int mo428l(RecyclerView.C0123a0 c0123a0) {
        return m457a1(c0123a0);
    }

    /* JADX INFO: renamed from: l1 */
    public View m476l1(int i, int i2) {
        byte b2;
        int i3;
        int i4;
        m461d1();
        if (i2 > i) {
            b2 = 1;
        } else {
            b2 = i2 < i ? (byte) -1 : (byte) 0;
        }
        if (b2 == 0) {
            return m618x(i);
        }
        if (this.f871t.mo2047e(m618x(i)) < this.f871t.mo2053k()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return (this.f869r == 0 ? this.f962e : this.f963f).m2062a(i, i2, i3, i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: m */
    public int mo429m(RecyclerView.C0123a0 c0123a0) {
        return m458b1(c0123a0);
    }

    /* JADX INFO: renamed from: m1 */
    public View m477m1(int i, int i2, boolean z, boolean z2) {
        m461d1();
        return (this.f869r == 0 ? this.f962e : this.f963f).m2062a(i, i2, z ? 24579 : 320, z2 ? 320 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: n */
    public int mo478n(RecyclerView.C0123a0 c0123a0) {
        return m455Z0(c0123a0);
    }

    /* JADX INFO: renamed from: n1 */
    public View mo432n1(RecyclerView.C0147v c0147v, RecyclerView.C0123a0 c0123a0, int i, int i2, int i3) {
        m461d1();
        int iMo2053k = this.f871t.mo2053k();
        int iMo2049g = this.f871t.mo2049g();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View viewM618x = m618x(i);
            int iM589P = m589P(viewM618x);
            if (iM589P >= 0 && iM589P < i3) {
                if (((RecyclerView.C0141p) viewM618x.getLayoutParams()).m628c()) {
                    if (view2 == null) {
                        view2 = viewM618x;
                    }
                } else {
                    if (this.f871t.mo2047e(viewM618x) < iMo2049g && this.f871t.mo2044b(viewM618x) >= iMo2053k) {
                        return viewM618x;
                    }
                    if (view == null) {
                        view = viewM618x;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: o */
    public int mo433o(RecyclerView.C0123a0 c0123a0) {
        return m457a1(c0123a0);
    }

    /* JADX INFO: renamed from: o1 */
    public final int m479o1(int i, RecyclerView.C0147v c0147v, RecyclerView.C0123a0 c0123a0, boolean z) {
        int iMo2049g;
        int iMo2049g2 = this.f871t.mo2049g() - i;
        if (iMo2049g2 <= 0) {
            return 0;
        }
        int i2 = -m491z1(-iMo2049g2, c0147v, c0123a0);
        int i3 = i + i2;
        if (!z || (iMo2049g = this.f871t.mo2049g() - i3) <= 0) {
            return i2;
        }
        this.f871t.mo2057p(iMo2049g);
        return iMo2049g + i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: p */
    public int mo435p(RecyclerView.C0123a0 c0123a0) {
        return m458b1(c0123a0);
    }

    /* JADX INFO: renamed from: p1 */
    public final int m480p1(int i, RecyclerView.C0147v c0147v, RecyclerView.C0123a0 c0123a0, boolean z) {
        int iMo2053k;
        int iMo2053k2 = i - this.f871t.mo2053k();
        if (iMo2053k2 <= 0) {
            return 0;
        }
        int i2 = -m491z1(iMo2053k2, c0147v, c0123a0);
        int i3 = i + i2;
        if (!z || (iMo2053k = i3 - this.f871t.mo2053k()) <= 0) {
            return i2;
        }
        this.f871t.mo2057p(-iMo2053k);
        return i2 - iMo2053k;
    }

    /* JADX INFO: renamed from: q1 */
    public final View m481q1() {
        return m618x(this.f874w ? 0 : m619y() - 1);
    }

    /* JADX INFO: renamed from: r1 */
    public final View m482r1() {
        return m618x(this.f874w ? m619y() - 1 : 0);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:105:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:107:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:109:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:110:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:111:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:113:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:114:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:116:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:126:0x0206  */
    /* JADX WARN: Code duplicated, block: B:128:0x0209  */
    /* JADX WARN: Code duplicated, block: B:130:0x020d  */
    /* JADX WARN: Code duplicated, block: B:131:0x0214  */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: s0 */
    public void mo438s0(RecyclerView.C0147v c0147v, RecyclerView.C0123a0 c0123a0) {
        boolean z;
        boolean z2;
        View viewM466f1;
        boolean z3;
        int iMo2053k;
        int i;
        int iMo2053k2;
        int i2;
        int iMo2049g;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int iM479o1;
        int i9;
        View viewMo484t;
        int iMo2047e;
        int iMo2049g2;
        if (!(this.f864B == null && this.f877z == -1) && c0123a0.m501b() == 0) {
            m568C0(c0147v);
            return;
        }
        C0121d c0121d = this.f864B;
        if (c0121d != null && c0121d.m499j()) {
            this.f877z = this.f864B.f899b;
        }
        m461d1();
        this.f870s.f887a = false;
        m490y1();
        View viewM577H = m577H();
        C0118a c0118a = this.f865C;
        if (!c0118a.f882e || this.f877z != -1 || this.f864B != null) {
            c0118a.m495d();
            C0118a c0118a2 = this.f865C;
            c0118a2.f881d = this.f874w ^ this.f875x;
            if (c0123a0.f909g || (i = this.f877z) == -1) {
                z = false;
            } else if (i < 0 || i >= c0123a0.m501b()) {
                this.f877z = -1;
                this.f863A = RecyclerView.UNDEFINED_DURATION;
                z = false;
            } else {
                c0118a2.f879b = this.f877z;
                C0121d c0121d2 = this.f864B;
                if (c0121d2 != null && c0121d2.m499j()) {
                    boolean z4 = this.f864B.f901d;
                    c0118a2.f881d = z4;
                    if (z4) {
                        iMo2049g = this.f871t.mo2049g();
                        i3 = this.f864B.f900c;
                        i4 = iMo2049g - i3;
                        c0118a2.f880c = i4;
                    } else {
                        iMo2053k2 = this.f871t.mo2053k();
                        i2 = this.f864B.f900c;
                        i4 = iMo2053k2 + i2;
                        c0118a2.f880c = i4;
                    }
                } else if (this.f863A == Integer.MIN_VALUE) {
                    View viewMo484t2 = mo484t(this.f877z);
                    if (viewMo484t2 != null) {
                        if (this.f871t.mo2045c(viewMo484t2) <= this.f871t.mo2054l()) {
                            if (this.f871t.mo2047e(viewMo484t2) - this.f871t.mo2053k() < 0) {
                                c0118a2.f880c = this.f871t.mo2053k();
                                c0118a2.f881d = false;
                            } else if (this.f871t.mo2049g() - this.f871t.mo2044b(viewMo484t2) < 0) {
                                c0118a2.f880c = this.f871t.mo2049g();
                                c0118a2.f881d = true;
                            } else {
                                c0118a2.f880c = c0118a2.f881d ? this.f871t.m2059m() + this.f871t.mo2044b(viewMo484t2) : this.f871t.mo2047e(viewMo484t2);
                            }
                        }
                    } else if (m619y() > 0) {
                        c0118a2.f881d = (this.f877z < m589P(m618x(0))) == this.f874w;
                    }
                    c0118a2.m492a();
                } else {
                    boolean z5 = this.f874w;
                    c0118a2.f881d = z5;
                    if (z5) {
                        iMo2049g = this.f871t.mo2049g();
                        i3 = this.f863A;
                        i4 = iMo2049g - i3;
                        c0118a2.f880c = i4;
                    } else {
                        iMo2053k2 = this.f871t.mo2053k();
                        i2 = this.f863A;
                        i4 = iMo2053k2 + i2;
                        c0118a2.f880c = i4;
                    }
                }
                z = true;
            }
            if (!z) {
                if (m619y() != 0) {
                    View viewM577H2 = m577H();
                    if (viewM577H2 != null) {
                        RecyclerView.C0141p c0141p = (RecyclerView.C0141p) viewM577H2.getLayoutParams();
                        if (!c0141p.m628c() && c0141p.m626a() >= 0 && c0141p.m626a() < c0123a0.m501b()) {
                            c0118a2.m494c(viewM577H2, m589P(viewM577H2));
                        } else {
                            if (this.f872u == this.f875x) {
                                if (c0118a2.f881d) {
                                    if (this.f874w) {
                                        viewM466f1 = m466f1(c0147v, c0123a0);
                                    } else {
                                        viewM466f1 = m473j1(c0147v, c0123a0);
                                    }
                                } else if (this.f874w) {
                                    viewM466f1 = m473j1(c0147v, c0123a0);
                                } else {
                                    viewM466f1 = m466f1(c0147v, c0123a0);
                                }
                                if (viewM466f1 != null) {
                                    c0118a2.m493b(viewM466f1, m589P(viewM466f1));
                                    if (!c0123a0.f909g && mo423W0()) {
                                        if (this.f871t.mo2047e(viewM466f1) < this.f871t.mo2049g() || this.f871t.mo2044b(viewM466f1) < this.f871t.mo2053k()) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        if (z3) {
                                            if (c0118a2.f881d) {
                                                iMo2053k = this.f871t.mo2049g();
                                            } else {
                                                iMo2053k = this.f871t.mo2053k();
                                            }
                                            c0118a2.f880c = iMo2053k;
                                        }
                                    }
                                }
                            }
                            z2 = false;
                        }
                        z2 = true;
                    } else {
                        if (this.f872u == this.f875x) {
                            if (c0118a2.f881d) {
                                if (this.f874w) {
                                    viewM466f1 = m466f1(c0147v, c0123a0);
                                } else {
                                    viewM466f1 = m473j1(c0147v, c0123a0);
                                }
                            } else if (this.f874w) {
                                viewM466f1 = m473j1(c0147v, c0123a0);
                            } else {
                                viewM466f1 = m466f1(c0147v, c0123a0);
                            }
                            if (viewM466f1 != null) {
                                c0118a2.m493b(viewM466f1, m589P(viewM466f1));
                                if (!c0123a0.f909g) {
                                    if (this.f871t.mo2047e(viewM466f1) < this.f871t.mo2049g()) {
                                        z3 = true;
                                    } else {
                                        z3 = true;
                                    }
                                    if (z3) {
                                        if (c0118a2.f881d) {
                                            iMo2053k = this.f871t.mo2049g();
                                        } else {
                                            iMo2053k = this.f871t.mo2053k();
                                        }
                                        c0118a2.f880c = iMo2053k;
                                    }
                                }
                                z2 = true;
                            }
                        }
                        z2 = false;
                    }
                } else {
                    z2 = false;
                }
                if (!z2) {
                    c0118a2.m492a();
                    c0118a2.f879b = this.f875x ? c0123a0.m501b() - 1 : 0;
                }
            }
            this.f865C.f882e = true;
        } else if (viewM577H != null && (this.f871t.mo2047e(viewM577H) >= this.f871t.mo2049g() || this.f871t.mo2044b(viewM577H) <= this.f871t.mo2053k())) {
            this.f865C.m494c(viewM577H, m589P(viewM577H));
        }
        C0120c c0120c = this.f870s;
        c0120c.f892f = c0120c.f896j >= 0 ? 1 : -1;
        int[] iArr = this.f868F;
        iArr[0] = 0;
        iArr[1] = 0;
        mo454X0(c0123a0, iArr);
        int iMo2053k3 = this.f871t.mo2053k() + Math.max(0, this.f868F[0]);
        int iMo2050h = this.f871t.mo2050h() + Math.max(0, this.f868F[1]);
        if (c0123a0.f909g && (i9 = this.f877z) != -1 && this.f863A != Integer.MIN_VALUE && (viewMo484t = mo484t(i9)) != null) {
            if (this.f874w) {
                iMo2049g2 = this.f871t.mo2049g() - this.f871t.mo2044b(viewMo484t);
                iMo2047e = this.f863A;
            } else {
                iMo2047e = this.f871t.mo2047e(viewMo484t) - this.f871t.mo2053k();
                iMo2049g2 = this.f863A;
            }
            int i10 = iMo2049g2 - iMo2047e;
            if (i10 > 0) {
                iMo2053k3 += i10;
            } else {
                iMo2050h -= i10;
            }
        }
        C0118a c0118a3 = this.f865C;
        mo442u1(c0147v, c0123a0, c0118a3, (!c0118a3.f881d ? this.f874w : !this.f874w) ? 1 : -1);
        m611q(c0147v);
        this.f870s.f898l = m488x1();
        Objects.requireNonNull(this.f870s);
        this.f870s.f895i = 0;
        C0118a c0118a4 = this.f865C;
        if (c0118a4.f881d) {
            m449E1(c0118a4.f879b, c0118a4.f880c);
            C0120c c0120c2 = this.f870s;
            c0120c2.f894h = iMo2053k3;
            m463e1(c0147v, c0120c2, c0123a0, false);
            C0120c c0120c3 = this.f870s;
            i6 = c0120c3.f888b;
            int i11 = c0120c3.f890d;
            int i12 = c0120c3.f889c;
            if (i12 > 0) {
                iMo2050h += i12;
            }
            C0118a c0118a5 = this.f865C;
            m448D1(c0118a5.f879b, c0118a5.f880c);
            C0120c c0120c4 = this.f870s;
            c0120c4.f894h = iMo2050h;
            c0120c4.f890d += c0120c4.f891e;
            m463e1(c0147v, c0120c4, c0123a0, false);
            C0120c c0120c5 = this.f870s;
            i5 = c0120c5.f888b;
            int i13 = c0120c5.f889c;
            if (i13 > 0) {
                m449E1(i11, i6);
                C0120c c0120c6 = this.f870s;
                c0120c6.f894h = i13;
                m463e1(c0147v, c0120c6, c0123a0, false);
                i6 = this.f870s.f888b;
            }
        } else {
            m448D1(c0118a4.f879b, c0118a4.f880c);
            C0120c c0120c7 = this.f870s;
            c0120c7.f894h = iMo2050h;
            m463e1(c0147v, c0120c7, c0123a0, false);
            C0120c c0120c8 = this.f870s;
            i5 = c0120c8.f888b;
            int i14 = c0120c8.f890d;
            int i15 = c0120c8.f889c;
            if (i15 > 0) {
                iMo2053k3 += i15;
            }
            C0118a c0118a6 = this.f865C;
            m449E1(c0118a6.f879b, c0118a6.f880c);
            C0120c c0120c9 = this.f870s;
            c0120c9.f894h = iMo2053k3;
            c0120c9.f890d += c0120c9.f891e;
            m463e1(c0147v, c0120c9, c0123a0, false);
            C0120c c0120c10 = this.f870s;
            i6 = c0120c10.f888b;
            int i16 = c0120c10.f889c;
            if (i16 > 0) {
                m448D1(i14, i5);
                C0120c c0120c11 = this.f870s;
                c0120c11.f894h = i16;
                m463e1(c0147v, c0120c11, c0123a0, false);
                i5 = this.f870s.f888b;
            }
        }
        if (m619y() > 0) {
            if (this.f874w ^ this.f875x) {
                int iM479o2 = m479o1(i5, c0147v, c0123a0, true);
                i7 = i6 + iM479o2;
                i8 = i5 + iM479o2;
                iM479o1 = m480p1(i7, c0147v, c0123a0, false);
            } else {
                int iM480p1 = m480p1(i6, c0147v, c0123a0, true);
                i7 = i6 + iM480p1;
                i8 = i5 + iM480p1;
                iM479o1 = m479o1(i8, c0147v, c0123a0, false);
            }
            i6 = i7 + iM479o1;
            i5 = i8 + iM479o1;
        }
        if (c0123a0.f913k && m619y() != 0 && !c0123a0.f909g && mo423W0()) {
            List<RecyclerView.AbstractC0129d0> list = c0147v.f994d;
            int size = list.size();
            int iM589P = m589P(m618x(0));
            int i17 = 0;
            int i18 = 0;
            for (int i19 = 0; i19 < size; i19++) {
                RecyclerView.AbstractC0129d0 abstractC0129d0 = list.get(i19);
                if (!abstractC0129d0.m517m()) {
                    byte b2 = (abstractC0129d0.m510f() < iM589P) != this.f874w ? (byte) -1 : (byte) 1;
                    int iMo2045c = this.f871t.mo2045c(abstractC0129d0.f927a);
                    if (b2 == -1) {
                        i17 += iMo2045c;
                    } else {
                        i18 += iMo2045c;
                    }
                }
            }
            this.f870s.f897k = list;
            if (i17 > 0) {
                m449E1(m589P(m482r1()), i6);
                C0120c c0120c12 = this.f870s;
                c0120c12.f894h = i17;
                c0120c12.f889c = 0;
                c0120c12.m496a(null);
                m463e1(c0147v, this.f870s, c0123a0, false);
            }
            if (i18 > 0) {
                m448D1(m589P(m481q1()), i5);
                C0120c c0120c13 = this.f870s;
                c0120c13.f894h = i18;
                c0120c13.f889c = 0;
                c0120c13.m496a(null);
                m463e1(c0147v, this.f870s, c0123a0, false);
            }
            this.f870s.f897k = null;
        }
        if (c0123a0.f909g) {
            this.f865C.m495d();
        } else {
            AbstractC0557t abstractC0557t = this.f871t;
            abstractC0557t.f3444b = abstractC0557t.mo2054l();
        }
        this.f872u = this.f875x;
    }

    /* JADX INFO: renamed from: s1 */
    public boolean m483s1() {
        return m579I() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: t */
    public View mo484t(int i) {
        int iM619y = m619y();
        if (iM619y == 0) {
            return null;
        }
        int iM589P = i - m589P(m618x(0));
        if (iM589P >= 0 && iM589P < iM619y) {
            View viewM618x = m618x(iM589P);
            if (m589P(viewM618x) == i) {
                return viewM618x;
            }
        }
        return super.mo484t(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: t0 */
    public void mo439t0(RecyclerView.C0123a0 c0123a0) {
        this.f864B = null;
        this.f877z = -1;
        this.f863A = RecyclerView.UNDEFINED_DURATION;
        this.f865C.m495d();
    }

    /* JADX INFO: renamed from: t1 */
    public void mo440t1(RecyclerView.C0147v c0147v, RecyclerView.C0123a0 c0123a0, C0120c c0120c, C0119b c0119b) {
        int i;
        int i2;
        int i3;
        int iM584M;
        int iMo2046d;
        View viewM498c = c0120c.m498c(c0147v);
        if (viewM498c == null) {
            c0119b.f884b = true;
            return;
        }
        RecyclerView.C0141p c0141p = (RecyclerView.C0141p) viewM498c.getLayoutParams();
        if (c0120c.f897k == null) {
            if (this.f874w == (c0120c.f892f == -1)) {
                m604c(viewM498c, -1, false);
            } else {
                m604c(viewM498c, 0, false);
            }
        } else {
            if (this.f874w == (c0120c.f892f == -1)) {
                m604c(viewM498c, -1, true);
            } else {
                m604c(viewM498c, 0, true);
            }
        }
        RecyclerView.C0141p c0141p2 = (RecyclerView.C0141p) viewM498c.getLayoutParams();
        Rect itemDecorInsetsForChild = this.f959b.getItemDecorInsetsForChild(viewM498c);
        int i4 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + 0;
        int i5 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + 0;
        int iM563z = RecyclerView.AbstractC0140o.m563z(this.f973p, this.f971n, m586N() + m584M() + ((ViewGroup.MarginLayoutParams) c0141p2).leftMargin + ((ViewGroup.MarginLayoutParams) c0141p2).rightMargin + i4, ((ViewGroup.MarginLayoutParams) c0141p2).width, mo462e());
        int iM563z2 = RecyclerView.AbstractC0140o.m563z(this.f974q, this.f972o, m583L() + m588O() + ((ViewGroup.MarginLayoutParams) c0141p2).topMargin + ((ViewGroup.MarginLayoutParams) c0141p2).bottomMargin + i5, ((ViewGroup.MarginLayoutParams) c0141p2).height, mo464f());
        if (m592R0(viewM498c, iM563z, iM563z2, c0141p2)) {
            viewM498c.measure(iM563z, iM563z2);
        }
        c0119b.f883a = this.f871t.mo2045c(viewM498c);
        if (this.f869r == 1) {
            if (m483s1()) {
                iMo2046d = this.f973p - m586N();
                iM584M = iMo2046d - this.f871t.mo2046d(viewM498c);
            } else {
                iM584M = m584M();
                iMo2046d = this.f871t.mo2046d(viewM498c) + iM584M;
            }
            int i6 = c0120c.f892f;
            int i7 = c0120c.f888b;
            if (i6 == -1) {
                i3 = i7;
                i2 = iMo2046d;
                i = i7 - c0119b.f883a;
            } else {
                i = i7;
                i2 = iMo2046d;
                i3 = c0119b.f883a + i7;
            }
        } else {
            int iM588O = m588O();
            int iMo2046d2 = this.f871t.mo2046d(viewM498c) + iM588O;
            int i8 = c0120c.f892f;
            int i9 = c0120c.f888b;
            if (i8 == -1) {
                i2 = i9;
                i = iM588O;
                i3 = iMo2046d2;
                iM584M = i9 - c0119b.f883a;
            } else {
                i = iM588O;
                i2 = c0119b.f883a + i9;
                i3 = iMo2046d2;
                iM584M = i9;
            }
        }
        m599Y(viewM498c, iM584M, i, i2, i3);
        if (c0141p.m628c() || c0141p.m627b()) {
            c0119b.f885c = true;
        }
        c0119b.f886d = viewM498c.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: u */
    public RecyclerView.C0141p mo441u() {
        return new RecyclerView.C0141p(-2, -2);
    }

    /* JADX INFO: renamed from: u1 */
    public void mo442u1(RecyclerView.C0147v c0147v, RecyclerView.C0123a0 c0123a0, C0118a c0118a, int i) {
    }

    /* JADX INFO: renamed from: v1 */
    public final void m485v1(RecyclerView.C0147v c0147v, C0120c c0120c) {
        if (!c0120c.f887a || c0120c.f898l) {
            return;
        }
        int i = c0120c.f893g;
        int i2 = c0120c.f895i;
        if (c0120c.f892f == -1) {
            int iM619y = m619y();
            if (i < 0) {
                return;
            }
            int iMo2048f = (this.f871t.mo2048f() - i) + i2;
            if (this.f874w) {
                for (int i3 = 0; i3 < iM619y; i3++) {
                    View viewM618x = m618x(i3);
                    if (this.f871t.mo2047e(viewM618x) < iMo2048f || this.f871t.mo2056o(viewM618x) < iMo2048f) {
                        m486w1(c0147v, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = iM619y - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View viewM618x2 = m618x(i5);
                if (this.f871t.mo2047e(viewM618x2) < iMo2048f || this.f871t.mo2056o(viewM618x2) < iMo2048f) {
                    m486w1(c0147v, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int iM619y2 = m619y();
        if (!this.f874w) {
            for (int i7 = 0; i7 < iM619y2; i7++) {
                View viewM618x3 = m618x(i7);
                if (this.f871t.mo2044b(viewM618x3) > i6 || this.f871t.mo2055n(viewM618x3) > i6) {
                    m486w1(c0147v, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = iM619y2 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View viewM618x4 = m618x(i9);
            if (this.f871t.mo2044b(viewM618x4) > i6 || this.f871t.mo2055n(viewM618x4) > i6) {
                m486w1(c0147v, i8, i9);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: w1 */
    public final void m486w1(RecyclerView.C0147v c0147v, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                m574F0(i, c0147v);
                i--;
            }
        } else {
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                m574F0(i3, c0147v);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: x0 */
    public void mo487x0(Parcelable parcelable) {
        if (parcelable instanceof C0121d) {
            this.f864B = (C0121d) parcelable;
            m580I0();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public boolean m488x1() {
        return this.f871t.mo2051i() == 0 && this.f871t.mo2048f() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0140o
    /* JADX INFO: renamed from: y0 */
    public Parcelable mo489y0() {
        C0121d c0121d = this.f864B;
        if (c0121d != null) {
            return new C0121d(c0121d);
        }
        C0121d c0121d2 = new C0121d();
        if (m619y() > 0) {
            m461d1();
            boolean z = this.f872u ^ this.f874w;
            c0121d2.f901d = z;
            if (z) {
                View viewM481q1 = m481q1();
                c0121d2.f900c = this.f871t.mo2049g() - this.f871t.mo2044b(viewM481q1);
                c0121d2.f899b = m589P(viewM481q1);
            } else {
                View viewM482r1 = m482r1();
                c0121d2.f899b = m589P(viewM482r1);
                c0121d2.f900c = this.f871t.mo2047e(viewM482r1) - this.f871t.mo2053k();
            }
        } else {
            c0121d2.f899b = -1;
        }
        return c0121d2;
    }

    /* JADX INFO: renamed from: y1 */
    public final void m490y1() {
        this.f874w = (this.f869r == 1 || !m483s1()) ? this.f873v : !this.f873v;
    }

    /* JADX INFO: renamed from: z1 */
    public int m491z1(int i, RecyclerView.C0147v c0147v, RecyclerView.C0123a0 c0123a0) {
        if (m619y() == 0 || i == 0) {
            return 0;
        }
        m461d1();
        this.f870s.f887a = true;
        int i2 = i > 0 ? 1 : -1;
        int iAbs = Math.abs(i);
        m447C1(i2, iAbs, true, c0123a0);
        C0120c c0120c = this.f870s;
        int iM463e1 = m463e1(c0147v, c0120c, c0123a0, false) + c0120c.f893g;
        if (iM463e1 < 0) {
            return 0;
        }
        if (iAbs > iM463e1) {
            i = i2 * iM463e1;
        }
        this.f871t.mo2057p(-i);
        this.f870s.f896j = i;
        return i;
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f869r = 1;
        this.f873v = false;
        this.f874w = false;
        this.f875x = false;
        this.f876y = true;
        this.f877z = -1;
        this.f863A = RecyclerView.UNDEFINED_DURATION;
        this.f864B = null;
        this.f865C = new C0118a();
        this.f866D = new C0119b();
        this.f867E = 2;
        this.f868F = new int[2];
        RecyclerView.AbstractC0140o.d dVarM560Q = RecyclerView.AbstractC0140o.m560Q(context, attributeSet, i, i2);
        m446A1(dVarM560Q.f977a);
        boolean z = dVarM560Q.f979c;
        mo460d(null);
        if (z != this.f873v) {
            this.f873v = z;
            m580I0();
        }
        mo408B1(dVarM560Q.f980d);
    }
}
