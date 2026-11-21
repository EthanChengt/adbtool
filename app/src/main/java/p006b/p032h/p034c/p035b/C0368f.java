package p006b.p032h.p034c.p035b;

import java.util.List;

/* JADX INFO: renamed from: b.h.c.b.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0368f {

    /* JADX INFO: renamed from: a */
    public final int[] f2585a;

    /* JADX INFO: renamed from: b */
    public final float[] f2586b;

    public C0368f(int i, int i2) {
        this.f2585a = new int[]{i, i2};
        this.f2586b = new float[]{0.0f, 1.0f};
    }

    public C0368f(int i, int i2, int i3) {
        this.f2585a = new int[]{i, i2, i3};
        this.f2586b = new float[]{0.0f, 0.5f, 1.0f};
    }

    public C0368f(List<Integer> list, List<Float> list2) {
        int size = list.size();
        this.f2585a = new int[size];
        this.f2586b = new float[size];
        for (int i = 0; i < size; i++) {
            this.f2585a[i] = list.get(i).intValue();
            this.f2586b[i] = list2.get(i).floatValue();
        }
    }
}
