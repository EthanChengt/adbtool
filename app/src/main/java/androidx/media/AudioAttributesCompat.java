package androidx.media;

import android.util.SparseIntArray;
import p006b.p066r.InterfaceC0520a;
import p006b.p077y.InterfaceC0611c;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesCompat implements InterfaceC0611c {

    /* JADX INFO: renamed from: b */
    public static final SparseIntArray f741b;

    /* JADX INFO: renamed from: a */
    public InterfaceC0520a f742a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f741b = sparseIntArray;
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        InterfaceC0520a interfaceC0520a = this.f742a;
        InterfaceC0520a interfaceC0520a2 = ((AudioAttributesCompat) obj).f742a;
        if (interfaceC0520a == null) {
            return interfaceC0520a2 == null;
        }
        return interfaceC0520a.equals(interfaceC0520a2);
    }

    public int hashCode() {
        return this.f742a.hashCode();
    }

    public String toString() {
        return this.f742a.toString();
    }
}
