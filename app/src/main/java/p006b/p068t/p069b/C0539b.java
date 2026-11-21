package p006b.p068t.p069b;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import p006b.p032h.p044j.C0418m;
import c.a.a.a.a;

/* JADX INFO: renamed from: b.t.b.b */
/* JADX INFO: loaded from: classes.dex */
public class C0539b {

    /* JADX INFO: renamed from: a */
    public final b f3316a;

    /* JADX INFO: renamed from: b */
    public final a f3317b = new a();

    /* JADX INFO: renamed from: c */
    public final List<View> f3318c = new ArrayList();

    /* JADX INFO: renamed from: b.t.b.b$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public long f3319a = 0;

        /* JADX INFO: renamed from: b */
        public a f3320b;

        /* JADX INFO: renamed from: a */
        public void m2008a(int i) {
            if (i < 64) {
                this.f3319a &= (1 << i) ^ (-1);
                return;
            }
            a aVar = this.f3320b;
            if (aVar != null) {
                aVar.m2008a(i - 64);
            }
        }

        /* JADX INFO: renamed from: b */
        public int m2009b(int i) {
            long j;
            a aVar = this.f3320b;
            if (aVar == null) {
                if (i >= 64) {
                    j = this.f3319a;
                }
                return Long.bitCount(j);
            }
            if (i >= 64) {
                return Long.bitCount(this.f3319a) + aVar.m2009b(i - 64);
            }
            j = this.f3319a & ((1 << i) - 1);
            return Long.bitCount(j);
        }

        /* JADX INFO: renamed from: c */
        public final void m2010c() {
            if (this.f3320b == null) {
                this.f3320b = new a();
            }
        }

        /* JADX INFO: renamed from: d */
        public boolean m2011d(int i) {
            if (i < 64) {
                return (this.f3319a & (1 << i)) != 0;
            }
            m2010c();
            return this.f3320b.m2011d(i - 64);
        }

        /* JADX INFO: renamed from: e */
        public void m2012e(int i, boolean z) {
            if (i >= 64) {
                m2010c();
                this.f3320b.m2012e(i - 64, z);
                return;
            }
            long j = this.f3319a;
            boolean z2 = (Long.MIN_VALUE & j) != 0;
            long j2 = (1 << i) - 1;
            this.f3319a = ((j & (j2 ^ (-1))) << 1) | (j & j2);
            if (z) {
                m2015h(i);
            } else {
                m2008a(i);
            }
            if (z2 || this.f3320b != null) {
                m2010c();
                this.f3320b.m2012e(0, z2);
            }
        }

        /* JADX INFO: renamed from: f */
        public boolean m2013f(int i) {
            if (i >= 64) {
                m2010c();
                return this.f3320b.m2013f(i - 64);
            }
            long j = 1 << i;
            long j2 = this.f3319a;
            boolean z = (j2 & j) != 0;
            long j3 = j2 & (j ^ (-1));
            this.f3319a = j3;
            long j4 = j - 1;
            this.f3319a = (j3 & j4) | Long.rotateRight((j4 ^ (-1)) & j3, 1);
            a aVar = this.f3320b;
            if (aVar != null) {
                if (aVar.m2011d(0)) {
                    m2015h(63);
                }
                this.f3320b.m2013f(0);
            }
            return z;
        }

        /* JADX INFO: renamed from: g */
        public void m2014g() {
            this.f3319a = 0L;
            a aVar = this.f3320b;
            if (aVar != null) {
                aVar.m2014g();
            }
        }

        /* JADX INFO: renamed from: h */
        public void m2015h(int i) {
            if (i < 64) {
                this.f3319a |= 1 << i;
            } else {
                m2010c();
                this.f3320b.m2015h(i - 64);
            }
        }

        public String toString() {
            if (this.f3320b == null) {
                return Long.toBinaryString(this.f3319a);
            }
            return this.f3320b.toString() + "xx" + Long.toBinaryString(this.f3319a);
        }
    }

    /* JADX INFO: renamed from: b.t.b.b$b */
    public interface b {
    }

    public C0539b(b bVar) {
        this.f3316a = bVar;
    }

    /* JADX INFO: renamed from: a */
    public void m1996a(View view, int i, boolean z) {
        int iM528b = i < 0 ? ((RecyclerView.C0130e) this.f3316a).m528b() : m2001f(i);
        this.f3317b.m2012e(iM528b, z);
        if (z) {
            m2004i(view);
        }
        RecyclerView.C0130e c0130e = (RecyclerView.C0130e) this.f3316a;
        RecyclerView.this.addView(view, iM528b);
        RecyclerView.this.dispatchChildAttached(view);
    }

    /* JADX INFO: renamed from: b */
    public void m1997b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int iM528b = i < 0 ? ((RecyclerView.C0130e) this.f3316a).m528b() : m2001f(i);
        this.f3317b.m2012e(iM528b, z);
        if (z) {
            m2004i(view);
        }
        RecyclerView.C0130e c0130e = (RecyclerView.C0130e) this.f3316a;
        Objects.requireNonNull(c0130e);
        RecyclerView.AbstractC0129d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (!childViewHolderInt.m519o() && !childViewHolderInt.m525u()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Called attach on a child which is not detached: ");
                sb.append(childViewHolderInt);
                throw new IllegalArgumentException(a.m2197k(RecyclerView.this, sb));
            }
            childViewHolderInt.f936j &= -257;
        }
        RecyclerView.this.attachViewToParent(view, iM528b, layoutParams);
    }

    /* JADX INFO: renamed from: c */
    public void m1998c(int i) {
        RecyclerView.AbstractC0129d0 childViewHolderInt;
        int iM2001f = m2001f(i);
        this.f3317b.m2013f(iM2001f);
        RecyclerView.C0130e c0130e = (RecyclerView.C0130e) this.f3316a;
        View childAt = RecyclerView.this.getChildAt(iM2001f);
        if (childAt != null && (childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt)) != null) {
            if (childViewHolderInt.m519o() && !childViewHolderInt.m525u()) {
                StringBuilder sb = new StringBuilder();
                sb.append("called detach on an already detached child ");
                sb.append(childViewHolderInt);
                throw new IllegalArgumentException(a.m2197k(RecyclerView.this, sb));
            }
            childViewHolderInt.m506b(256);
        }
        RecyclerView.this.detachViewFromParent(iM2001f);
    }

    /* JADX INFO: renamed from: d */
    public View m1999d(int i) {
        return ((RecyclerView.C0130e) this.f3316a).m527a(m2001f(i));
    }

    /* JADX INFO: renamed from: e */
    public int m2000e() {
        return ((RecyclerView.C0130e) this.f3316a).m528b() - this.f3318c.size();
    }

    /* JADX INFO: renamed from: f */
    public final int m2001f(int i) {
        if (i < 0) {
            return -1;
        }
        int iM528b = ((RecyclerView.C0130e) this.f3316a).m528b();
        int i2 = i;
        while (i2 < iM528b) {
            int iM2009b = i - (i2 - this.f3317b.m2009b(i2));
            if (iM2009b == 0) {
                while (this.f3317b.m2011d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iM2009b;
        }
        return -1;
    }

    /* JADX INFO: renamed from: g */
    public View m2002g(int i) {
        return RecyclerView.this.getChildAt(i);
    }

    /* JADX INFO: renamed from: h */
    public int m2003h() {
        return ((RecyclerView.C0130e) this.f3316a).m528b();
    }

    /* JADX INFO: renamed from: i */
    public final void m2004i(View view) {
        this.f3318c.add(view);
        RecyclerView.C0130e c0130e = (RecyclerView.C0130e) this.f3316a;
        Objects.requireNonNull(c0130e);
        RecyclerView.AbstractC0129d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            RecyclerView recyclerView = RecyclerView.this;
            int importantForAccessibility = childViewHolderInt.f943q;
            if (importantForAccessibility == -1) {
                View view2 = childViewHolderInt.f927a;
                WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
                importantForAccessibility = view2.getImportantForAccessibility();
            }
            childViewHolderInt.f942p = importantForAccessibility;
            recyclerView.setChildImportantForAccessibilityInternal(childViewHolderInt, 4);
        }
    }

    /* JADX INFO: renamed from: j */
    public int m2005j(View view) {
        int iIndexOfChild = RecyclerView.this.indexOfChild(view);
        if (iIndexOfChild == -1 || this.f3317b.m2011d(iIndexOfChild)) {
            return -1;
        }
        return iIndexOfChild - this.f3317b.m2009b(iIndexOfChild);
    }

    /* JADX INFO: renamed from: k */
    public boolean m2006k(View view) {
        return this.f3318c.contains(view);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m2007l(View view) {
        if (!this.f3318c.remove(view)) {
            return false;
        }
        RecyclerView.C0130e c0130e = (RecyclerView.C0130e) this.f3316a;
        Objects.requireNonNull(c0130e);
        RecyclerView.AbstractC0129d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt == null) {
            return true;
        }
        RecyclerView.this.setChildImportantForAccessibilityInternal(childViewHolderInt, childViewHolderInt.f942p);
        childViewHolderInt.f942p = 0;
        return true;
    }

    public String toString() {
        return this.f3317b.toString() + ", hidden list:" + this.f3318c.size();
    }
}
