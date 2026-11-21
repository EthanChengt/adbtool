package p080c.p126d.p127a.p128a.p143m;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.didjdk.adbhelper.R;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import java.util.WeakHashMap;
import p006b.p032h.p044j.C0406a;
import p006b.p032h.p044j.C0418m;
import p006b.p032h.p044j.C0421p;
import c.a.a.a.a;

/* JADX INFO: renamed from: c.d.a.a.m.v */
/* JADX INFO: loaded from: classes.dex */
public class C1246v extends RecyclerView.AbstractC0132g<a> {

    /* JADX INFO: renamed from: c */
    public final C1224a f5955c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1228d<?> f5956d;

    /* JADX INFO: renamed from: e */
    public final C1231g.f f5957e;

    /* JADX INFO: renamed from: f */
    public final int f5958f;

    /* JADX INFO: renamed from: c.d.a.a.m.v$a */
    public static class a extends RecyclerView.AbstractC0129d0 {

        /* JADX INFO: renamed from: t */
        public final TextView f5959t;

        /* JADX INFO: renamed from: u */
        public final MaterialCalendarGridView f5960u;

        public a(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(R.id.ji);
            this.f5959t = textView;
            WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
            C0421p c0421p = new C0421p(R.id.nv, Boolean.class, 28);
            Boolean bool = Boolean.TRUE;
            if (Build.VERSION.SDK_INT >= 28) {
                c0421p.m1588d(textView, bool);
            } else if (c0421p.m1589e(c0421p.m1584c(textView), bool)) {
                C0406a c0406aM1563f = C0418m.m1563f(textView);
                C0418m.m1577t(textView, c0406aM1563f == null ? new C0406a() : c0406aM1563f);
                textView.setTag(c0421p.f2724a, bool);
                C0418m.m1570m(textView, 0);
            }
            this.f5960u = (MaterialCalendarGridView) linearLayout.findViewById(R.id.jd);
            if (z) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public C1246v(Context context, InterfaceC1228d<?> interfaceC1228d, C1224a c1224a, C1231g.f fVar) {
        C1243s c1243s = c1224a.f5853b;
        C1243s c1243s2 = c1224a.f5854c;
        C1243s c1243s3 = c1224a.f5855d;
        if (c1243s.compareTo(c1243s3) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (c1243s3.compareTo(c1243s2) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        int i = C1244t.f5948f;
        int i2 = C1231g.f5886g0;
        this.f5958f = (i * context.getResources().getDimensionPixelSize(R.dimen.et)) + (C1239o.m2862K0(context) ? context.getResources().getDimensionPixelSize(R.dimen.et) : 0);
        this.f5955c = c1224a;
        this.f5956d = interfaceC1228d;
        this.f5957e = fVar;
        m540h(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0132g
    /* JADX INFO: renamed from: a */
    public int mo533a() {
        return this.f5955c.f5858g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0132g
    /* JADX INFO: renamed from: b */
    public long mo534b(int i) {
        return this.f5955c.f5853b.m2873n(i).f5941b.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0132g
    /* JADX INFO: renamed from: e */
    public void mo537e(RecyclerView.AbstractC0129d0 abstractC0129d0, int i) {
        a aVar = (a) abstractC0129d0;
        C1243s c1243sM2873n = this.f5955c.f5853b.m2873n(i);
        aVar.f5959t.setText(c1243sM2873n.f5942c);
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) aVar.f5960u.findViewById(R.id.jd);
        if (materialCalendarGridView.getAdapter() == null || !c1243sM2873n.equals(materialCalendarGridView.getAdapter().f5949b)) {
            C1244t c1244t = new C1244t(c1243sM2873n, this.f5956d, this.f5955c);
            materialCalendarGridView.setNumColumns(c1243sM2873n.f5945f);
            materialCalendarGridView.setAdapter((ListAdapter) c1244t);
        } else {
            materialCalendarGridView.getAdapter().notifyDataSetChanged();
        }
        materialCalendarGridView.setOnItemClickListener(new C1245u(this, materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0132g
    /* JADX INFO: renamed from: f */
    public RecyclerView.AbstractC0129d0 mo538f(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) a.m2188b(viewGroup, R.layout.c_, viewGroup, false);
        if (!C1239o.m2862K0(viewGroup.getContext())) {
            return new a(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.C0141p(-1, this.f5958f));
        return new a(linearLayout, true);
    }

    /* JADX INFO: renamed from: i */
    public C1243s m2878i(int i) {
        return this.f5955c.f5853b.m2873n(i);
    }

    /* JADX INFO: renamed from: j */
    public int m2879j(C1243s c1243s) {
        return this.f5955c.f5853b.m2874o(c1243s);
    }
}
