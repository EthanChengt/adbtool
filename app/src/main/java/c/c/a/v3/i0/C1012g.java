package c.c.a.v3.i0;

import java.text.Collator;
import java.util.Comparator;

/* JADX INFO: renamed from: c.c.a.v3.i0.g */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1012g implements Comparator {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Collator f5011b;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Collator collator = this.f5011b;
        int i = r.f5049z0;
        return collator.getCollationKey(((C1027v) obj).f5092d).compareTo(collator.getCollationKey(((C1027v) obj2).f5092d));
    }
}
