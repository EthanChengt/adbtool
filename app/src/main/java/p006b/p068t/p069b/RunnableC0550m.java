package p006b.p068t.p069b;

import android.annotation.SuppressLint;
import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: b.t.b.m */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0550m implements Runnable {

    /* JADX INFO: renamed from: f */
    public static final ThreadLocal<RunnableC0550m> f3408f = new ThreadLocal<>();

    /* JADX INFO: renamed from: g */
    public static Comparator<c> f3409g = new a();

    /* JADX INFO: renamed from: c */
    public long f3411c;

    /* JADX INFO: renamed from: d */
    public long f3412d;

    /* JADX INFO: renamed from: b */
    public ArrayList<RecyclerView> f3410b = new ArrayList<>();

    /* JADX INFO: renamed from: e */
    public ArrayList<c> f3413e = new ArrayList<>();

    /* JADX INFO: renamed from: b.t.b.m$a */
    public static class a implements Comparator<c> {
        /* JADX WARN: Code duplicated, block: B:17:0x0022  */
        @Override // java.util.Comparator
        public int compare(c cVar, c cVar2) {
            c cVar3 = cVar;
            c cVar4 = cVar2;
            RecyclerView recyclerView = cVar3.f3421d;
            int i = 1;
            if ((recyclerView == null) == (cVar4.f3421d == null)) {
                boolean z = cVar3.f3418a;
                if (z == cVar4.f3418a) {
                    int i2 = cVar4.f3419b - cVar3.f3419b;
                    if (i2 != 0) {
                        return i2;
                    }
                    int i3 = cVar3.f3420c - cVar4.f3420c;
                    if (i3 != 0) {
                        return i3;
                    }
                    return 0;
                }
                if (z) {
                    i = -1;
                }
            } else if (recyclerView != null) {
                i = -1;
            }
            return i;
        }
    }

    /* JADX INFO: renamed from: b.t.b.m$b */
    @SuppressLint({"VisibleForTests"})
    public static class b implements RecyclerView.AbstractC0140o.c {

        /* JADX INFO: renamed from: a */
        public int f3414a;

        /* JADX INFO: renamed from: b */
        public int f3415b;

        /* JADX INFO: renamed from: c */
        public int[] f3416c;

        /* JADX INFO: renamed from: d */
        public int f3417d;

        /* JADX INFO: renamed from: a */
        public void m2031a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i2 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i3 = this.f3417d * 2;
            int[] iArr = this.f3416c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f3416c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i3 >= iArr.length) {
                int[] iArr3 = new int[i3 * 2];
                this.f3416c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f3416c;
            iArr4[i3] = i;
            iArr4[i3 + 1] = i2;
            this.f3417d++;
        }

        /* JADX INFO: renamed from: b */
        public void m2032b(RecyclerView recyclerView, boolean z) {
            this.f3417d = 0;
            int[] iArr = this.f3416c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.AbstractC0140o abstractC0140o = recyclerView.mLayout;
            if (recyclerView.mAdapter == null || abstractC0140o == null || !abstractC0140o.f968k) {
                return;
            }
            if (z) {
                if (!recyclerView.mAdapterHelper.m1989g()) {
                    abstractC0140o.mo472j(recyclerView.mAdapter.mo533a(), this);
                }
            } else if (!recyclerView.hasPendingAdapterUpdates()) {
                abstractC0140o.mo470i(this.f3414a, this.f3415b, recyclerView.mState, this);
            }
            int i = this.f3417d;
            if (i > abstractC0140o.f969l) {
                abstractC0140o.f969l = i;
                abstractC0140o.f970m = z;
                recyclerView.mRecycler.m650m();
            }
        }

        /* JADX INFO: renamed from: c */
        public boolean m2033c(int i) {
            if (this.f3416c != null) {
                int i2 = this.f3417d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f3416c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: b.t.b.m$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public boolean f3418a;

        /* JADX INFO: renamed from: b */
        public int f3419b;

        /* JADX INFO: renamed from: c */
        public int f3420c;

        /* JADX INFO: renamed from: d */
        public RecyclerView f3421d;

        /* JADX INFO: renamed from: e */
        public int f3422e;
    }

    /* JADX INFO: renamed from: a */
    public void m2028a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f3411c == 0) {
            this.f3411c = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        b bVar = recyclerView.mPrefetchRegistry;
        bVar.f3414a = i;
        bVar.f3415b = i2;
    }

    /* JADX INFO: renamed from: b */
    public void m2029b(long j) {
        c cVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        c cVar2;
        int size = this.f3410b.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = this.f3410b.get(i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                recyclerView3.mPrefetchRegistry.m2032b(recyclerView3, false);
                i += recyclerView3.mPrefetchRegistry.f3417d;
            }
        }
        this.f3413e.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = this.f3410b.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                b bVar = recyclerView4.mPrefetchRegistry;
                int iAbs = Math.abs(bVar.f3415b) + Math.abs(bVar.f3414a);
                for (int i5 = 0; i5 < bVar.f3417d * 2; i5 += 2) {
                    if (i3 >= this.f3413e.size()) {
                        cVar2 = new c();
                        this.f3413e.add(cVar2);
                    } else {
                        cVar2 = this.f3413e.get(i3);
                    }
                    int[] iArr = bVar.f3416c;
                    int i6 = iArr[i5 + 1];
                    cVar2.f3418a = i6 <= iAbs;
                    cVar2.f3419b = iAbs;
                    cVar2.f3420c = i6;
                    cVar2.f3421d = recyclerView4;
                    cVar2.f3422e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.f3413e, f3409g);
        for (int i7 = 0; i7 < this.f3413e.size() && (recyclerView = (cVar = this.f3413e.get(i7)).f3421d) != null; i7++) {
            RecyclerView.AbstractC0129d0 abstractC0129d0M2030c = m2030c(recyclerView, cVar.f3422e, cVar.f3418a ? RecyclerView.FOREVER_NS : j);
            if (abstractC0129d0M2030c != null && abstractC0129d0M2030c.f928b != null && abstractC0129d0M2030c.m514j() && !abstractC0129d0M2030c.m515k() && (recyclerView2 = abstractC0129d0M2030c.f928b.get()) != null) {
                if (recyclerView2.mDataSetHasChangedAfterLayout && recyclerView2.mChildHelper.m2003h() != 0) {
                    recyclerView2.removeAndRecycleViews();
                }
                b bVar2 = recyclerView2.mPrefetchRegistry;
                bVar2.m2032b(recyclerView2, true);
                if (bVar2.f3417d != 0) {
                    try {
                        Trace.beginSection(RecyclerView.TRACE_NESTED_PREFETCH_TAG);
                        RecyclerView.C0123a0 c0123a0 = recyclerView2.mState;
                        RecyclerView.AbstractC0132g abstractC0132g = recyclerView2.mAdapter;
                        c0123a0.f906d = 1;
                        c0123a0.f907e = abstractC0132g.mo533a();
                        c0123a0.f909g = false;
                        c0123a0.f910h = false;
                        c0123a0.f911i = false;
                        for (int i8 = 0; i8 < bVar2.f3417d * 2; i8 += 2) {
                            m2030c(recyclerView2, bVar2.f3416c[i8], j);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    continue;
                }
            }
            cVar.f3418a = false;
            cVar.f3419b = 0;
            cVar.f3420c = 0;
            cVar.f3421d = null;
            cVar.f3422e = 0;
        }
    }

    /* JADX INFO: renamed from: c */
    public final RecyclerView.AbstractC0129d0 m2030c(RecyclerView recyclerView, int i, long j) {
        boolean z;
        int iM2003h = recyclerView.mChildHelper.m2003h();
        int i2 = 0;
        while (true) {
            if (i2 >= iM2003h) {
                z = false;
                break;
            }
            RecyclerView.AbstractC0129d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.m2002g(i2));
            if (childViewHolderInt.f929c == i && !childViewHolderInt.m515k()) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            return null;
        }
        RecyclerView.C0147v c0147v = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.AbstractC0129d0 abstractC0129d0M648k = c0147v.m648k(i, false, j);
            if (abstractC0129d0M648k != null) {
                if (!abstractC0129d0M648k.m514j() || abstractC0129d0M648k.m515k()) {
                    c0147v.m638a(abstractC0129d0M648k, false);
                } else {
                    c0147v.m645h(abstractC0129d0M648k.f927a);
                }
            }
            return abstractC0129d0M648k;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Trace.beginSection(RecyclerView.TRACE_PREFETCH_TAG);
            if (this.f3410b.isEmpty()) {
                return;
            }
            int size = this.f3410b.size();
            long jMax = 0;
            for (int i = 0; i < size; i++) {
                RecyclerView recyclerView = this.f3410b.get(i);
                if (recyclerView.getWindowVisibility() == 0) {
                    jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                }
            }
            if (jMax == 0) {
                return;
            }
            m2029b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f3412d);
        } finally {
            this.f3411c = 0L;
            Trace.endSection();
        }
    }
}
