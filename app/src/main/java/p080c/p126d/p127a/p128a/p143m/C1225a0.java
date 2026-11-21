package p080c.p126d.p127a.p128a.p143m;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.didjdk.adbhelper.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import c.a.a.a.a;
import p080c.p126d.p127a.p128a.C1161a;

/* JADX INFO: renamed from: c.d.a.a.m.a0 */
/* JADX INFO: loaded from: classes.dex */
public class C1225a0 extends RecyclerView.AbstractC0132g<a> {

    /* JADX INFO: renamed from: c */
    public final C1231g<?> f5865c;

    /* JADX INFO: renamed from: c.d.a.a.m.a0$a */
    public static class a extends RecyclerView.AbstractC0129d0 {

        /* JADX INFO: renamed from: t */
        public final TextView f5866t;

        public a(TextView textView) {
            super(textView);
            this.f5866t = textView;
        }
    }

    public C1225a0(C1231g<?> c1231g) {
        this.f5865c = c1231g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0132g
    /* JADX INFO: renamed from: a */
    public int mo533a() {
        return this.f5865c.f5889Y.f5857f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0132g
    /* JADX INFO: renamed from: e */
    public void mo537e(RecyclerView.AbstractC0129d0 abstractC0129d0, int i) {
        a aVar = (a) abstractC0129d0;
        int i2 = this.f5865c.f5889Y.f5853b.f5944e + i;
        String string = aVar.f5866t.getContext().getString(R.string.dn);
        aVar.f5866t.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i2)));
        aVar.f5866t.setContentDescription(String.format(string, Integer.valueOf(i2)));
        C1227c c1227c = this.f5865c.f5892b0;
        Calendar calendarM2728m = C1161a.m2728m();
        C1226b c1226b = calendarM2728m.get(1) == i2 ? c1227c.f5878f : c1227c.f5876d;
        Iterator<Long> it = this.f5865c.f5888X.m2856i().iterator();
        while (it.hasNext()) {
            calendarM2728m.setTimeInMillis(it.next().longValue());
            if (calendarM2728m.get(1) == i2) {
                c1226b = c1227c.f5877e;
            }
        }
        c1226b.m2848b(aVar.f5866t);
        aVar.f5866t.setOnClickListener(new ViewOnClickListenerC1250z(this, i2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0132g
    /* JADX INFO: renamed from: f */
    public RecyclerView.AbstractC0129d0 mo538f(ViewGroup viewGroup, int i) {
        return new a((TextView) a.m2188b(viewGroup, R.layout.cd, viewGroup, false));
    }

    /* JADX INFO: renamed from: i */
    public int m2846i(int i) {
        return i - this.f5865c.f5889Y.f5853b.f5944e;
    }
}
