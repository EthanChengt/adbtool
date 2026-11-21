package p006b.p049j.p051b;

import android.graphics.Rect;
import java.util.Comparator;

/* JADX INFO: renamed from: b.j.b.d */
/* JADX INFO: loaded from: classes.dex */
public class C0446d<T> implements Comparator<T> {

    /* JADX INFO: renamed from: b */
    public final Rect f2827b = new Rect();

    /* JADX INFO: renamed from: c */
    public final Rect f2828c = new Rect();

    /* JADX INFO: renamed from: d */
    public final boolean f2829d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0444b<T> f2830e;

    public C0446d(boolean z, InterfaceC0444b<T> interfaceC0444b) {
        this.f2829d = z;
        this.f2830e = interfaceC0444b;
    }

    @Override // java.util.Comparator
    public int compare(T t, T t2) {
        Rect rect = this.f2827b;
        Rect rect2 = this.f2828c;
        ((AbstractC0443a.a) this.f2830e).m1647a(t, rect);
        ((AbstractC0443a.a) this.f2830e).m1647a(t2, rect2);
        int i = rect.top;
        int i2 = rect2.top;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int i3 = rect.left;
        int i4 = rect2.left;
        if (i3 < i4) {
            return this.f2829d ? 1 : -1;
        }
        if (i3 > i4) {
            return this.f2829d ? -1 : 1;
        }
        int i5 = rect.bottom;
        int i6 = rect2.bottom;
        if (i5 < i6) {
            return -1;
        }
        if (i5 > i6) {
            return 1;
        }
        int i7 = rect.right;
        int i8 = rect2.right;
        if (i7 < i8) {
            return this.f2829d ? 1 : -1;
        }
        if (i7 > i8) {
            return this.f2829d ? -1 : 1;
        }
        return 0;
    }
}
