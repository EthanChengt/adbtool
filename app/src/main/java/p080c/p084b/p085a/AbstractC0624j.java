package p080c.p084b.p085a;

import p080c.p084b.p085a.AbstractC0624j;

/* JADX INFO: renamed from: c.b.a.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0624j<CHILD extends AbstractC0624j<CHILD, TranscodeType>, TranscodeType> implements Cloneable {
    /* JADX INFO: renamed from: a */
    public final CHILD m2239a() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public Object clone() {
        try {
            return (AbstractC0624j) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
