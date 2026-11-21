package p006b.p073w;

import android.view.View;
import android.view.ViewGroup;
import com.didjdk.adbhelper.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: b.w.a0 */
/* JADX INFO: loaded from: classes.dex */
public class C0573a0 extends C0587l {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ViewGroup f3517a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f3518b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f3519c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC0575b0 f3520d;

    public C0573a0(AbstractC0575b0 abstractC0575b0, ViewGroup viewGroup, View view, View view2) {
        this.f3520d = abstractC0575b0;
        this.f3517a = viewGroup;
        this.f3518b = view;
        this.f3519c = view2;
    }

    @Override // p006b.p073w.C0587l, p006b.p073w.AbstractC0584i.d
    /* JADX INFO: renamed from: a */
    public void mo2085a(AbstractC0584i abstractC0584i) {
        this.f3517a.getOverlay().remove(this.f3518b);
    }

    @Override // p006b.p073w.C0587l, p006b.p073w.AbstractC0584i.d
    /* JADX INFO: renamed from: b */
    public void mo2086b(AbstractC0584i abstractC0584i) {
        if (this.f3518b.getParent() == null) {
            this.f3517a.getOverlay().add(this.f3518b);
            return;
        }
        AbstractC0575b0 abstractC0575b0 = this.f3520d;
        int size = abstractC0575b0.f3589n.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else {
                abstractC0575b0.f3589n.get(size).cancel();
            }
        }
        ArrayList<AbstractC0584i.d> arrayList = abstractC0575b0.f3593r;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) abstractC0575b0.f3593r.clone();
        int size2 = arrayList2.size();
        for (int i = 0; i < size2; i++) {
            ((AbstractC0584i.d) arrayList2.get(i)).mo2093d(abstractC0575b0);
        }
    }

    @Override // p006b.p073w.AbstractC0584i.d
    /* JADX INFO: renamed from: e */
    public void mo2087e(AbstractC0584i abstractC0584i) {
        this.f3519c.setTag(R.id.m5, null);
        this.f3517a.getOverlay().remove(this.f3518b);
        abstractC0584i.mo2127v(this);
    }
}
