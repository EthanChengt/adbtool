package c.c.a.v3.l0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.didjdk.adbhelper.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Objects;
import c.a.a.a.a;
import p080c.p084b.p085a.ComponentCallbacks2C0616b;
import p080c.p084b.p085a.ComponentCallbacks2C0623i;
import p080c.p084b.p085a.p104n.C0824p;
import p080c.p084b.p085a.p111s.C0875j;
import c.c.a.q3;
import c.c.a.y3.h;

/* JADX INFO: renamed from: c.c.a.v3.l0.j */
/* JADX INFO: loaded from: classes.dex */
public class C1067j extends RecyclerView.AbstractC0132g<RecyclerView.AbstractC0129d0> {

    /* JADX INFO: renamed from: c */
    public C1069l f5280c;

    /* JADX INFO: renamed from: d */
    public ArrayList<C1068k> f5281d;

    /* JADX INFO: renamed from: c.c.a.v3.l0.j$a */
    public static class a extends RecyclerView.AbstractC0129d0 {

        /* JADX INFO: renamed from: t */
        public TextView f5282t;

        /* JADX INFO: renamed from: u */
        public TextView f5283u;

        /* JADX INFO: renamed from: v */
        public TextView f5284v;

        /* JADX INFO: renamed from: w */
        public ProgressBar f5285w;

        public a(View view) {
            super(view);
            this.f5282t = (TextView) view.findViewById(R.id.q_);
            this.f5283u = (TextView) view.findViewById(R.id.pv);
            this.f5284v = (TextView) view.findViewById(R.id.qa);
            this.f5285w = (ProgressBar) view.findViewById(R.id.la);
        }
    }

    /* JADX INFO: renamed from: c.c.a.v3.l0.j$b */
    public static class b extends RecyclerView.AbstractC0129d0 {

        /* JADX INFO: renamed from: t */
        public ConstraintLayout f5286t;

        /* JADX INFO: renamed from: u */
        public ImageView f5287u;

        /* JADX INFO: renamed from: v */
        public TextView f5288v;

        /* JADX INFO: renamed from: w */
        public TextView f5289w;

        /* JADX INFO: renamed from: x */
        public TextView f5290x;

        /* JADX INFO: renamed from: y */
        public ImageView f5291y;

        /* JADX INFO: renamed from: z */
        public ImageView f5292z;

        public b(View view) {
            super(view);
            this.f5286t = (ConstraintLayout) view.findViewById(R.id.i2);
            this.f5287u = (ImageView) view.findViewById(R.id.gr);
            this.f5289w = (TextView) view.findViewById(R.id.py);
            this.f5288v = (TextView) view.findViewById(R.id.px);
            this.f5290x = (TextView) view.findViewById(R.id.pz);
            this.f5291y = (ImageView) view.findViewById(R.id.gq);
            this.f5292z = (ImageView) view.findViewById(R.id.go);
        }
    }

    public C1067j(C1069l c1069l, ArrayList<C1068k> arrayList) {
        this.f5280c = c1069l;
        this.f5281d = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0132g
    /* JADX INFO: renamed from: a */
    public int mo533a() {
        return this.f5281d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0132g
    /* JADX INFO: renamed from: c */
    public int mo535c(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0132g
    /* JADX INFO: renamed from: e */
    public void mo537e(RecyclerView.AbstractC0129d0 abstractC0129d0, final int i) {
        ComponentCallbacks2C0623i componentCallbacks2C0623iM2530g;
        View view;
        if (i == 0) {
            a aVar = (a) abstractC0129d0;
            aVar.f5282t.setText(this.f5280c.f5317g0);
            aVar.f5284v.setText(this.f5280c.f5319i0);
            aVar.f5283u.setText(this.f5280c.f5318h0);
            aVar.f5285w.setMax(this.f5280c.f5320j0);
            aVar.f5285w.setProgress(this.f5280c.f5322l0);
            return;
        }
        final C1068k c1068k = this.f5281d.get(i);
        b bVar = (b) abstractC0129d0;
        C1069l c1069l = this.f5280c;
        C0824p c0824pM2206c = ComponentCallbacks2C0616b.m2206c(c1069l.m309k());
        Objects.requireNonNull(c0824pM2206c);
        Objects.requireNonNull(c1069l.m309k(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (C0875j.m2616h()) {
            componentCallbacks2C0623iM2530g = c0824pM2206c.m2526b(c1069l.m309k().getApplicationContext());
        } else {
            if (c1069l.m303h() != null) {
                c0824pM2206c.f4586f.mo2521a(c1069l.m303h());
            }
            componentCallbacks2C0623iM2530g = c0824pM2206c.m2530g(c1069l.m309k(), c1069l.m307j(), c1069l, (!c1069l.m264B() || c1069l.f705z || (view = c1069l.f667G) == null || view.getWindowToken() == null || c1069l.f667G.getVisibility() != 0) ? false : true);
        }
        componentCallbacks2C0623iM2530g.m2232l().m2227y(new File(c1068k.f5293a)).m2546e(R.drawable.aa).m2226x(bVar.f5287u);
        bVar.f5292z.setVisibility(c1068k.f5304l ? 4 : 0);
        bVar.f5286t.setSelected(c1068k.f5304l);
        bVar.f5291y.setVisibility(c1068k.f5301i <= 1 ? 8 : 0);
        if (c1068k.f5301i > 1) {
            bVar.f5291y.setImageResource(c1068k.f5303k ? R.drawable.dr : R.drawable.dq);
        }
        bVar.f5289w.setText(c1068k.f5294b);
        bVar.f5288v.setText(c1068k.f5296d);
        bVar.f5290x.setText(c1068k.f5297e);
        bVar.f5286t.setOnClickListener(new View.OnClickListener() { // from class: c.c.a.v3.l0.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f5268b.m2678j(i);
            }
        });
        bVar.f5292z.setOnClickListener(new View.OnClickListener() { // from class: c.c.a.v3.l0.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                final C1067j c1067j = this.f5265b;
                final C1068k c1068k2 = c1068k;
                final int i2 = i;
                Objects.requireNonNull(c1067j);
                if (!c1068k2.f5306n) {
                    c1067j.m2677i(c1068k2, i2);
                    return;
                }
                final h c1153h = new h(c1067j.f5280c.m303h());
                c1153h.m2714e(c1067j.f5280c.m337y(R.string.h5));
                c1153h.m2711b(c1067j.f5280c.m337y(R.string.aq));
                c1153h.m2712c(c1067j.f5280c.m337y(R.string.eg));
                c1153h.f5543e.setOnClickListener(new View.OnClickListener() { // from class: c.c.a.v3.l0.c
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        C1067j c1067j2 = c1067j;
                        C1068k c1068k3 = c1068k2;
                        int i3 = i2;
                        h c1153h2 = c1153h;
                        c1067j2.m2677i(c1068k3, i3);
                        c1153h2.f5539a.dismiss();
                    }
                });
                c1153h.f5539a.show();
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0132g
    /* JADX INFO: renamed from: f */
    public RecyclerView.AbstractC0129d0 mo538f(ViewGroup viewGroup, int i) {
        return i == 0 ? new a(LayoutInflater.from(this.f5280c.m303h()).inflate(R.layout.br, viewGroup, false)) : new b(LayoutInflater.from(this.f5280c.m303h()).inflate(R.layout.bs, viewGroup, false));
    }

    /* JADX INFO: renamed from: i */
    public final void m2677i(C1068k c1068k, int i) {
        if (!c1068k.f5303k) {
            m2678j(i);
        }
        this.f5280c.f5315e0.setEnabled(false);
        C1069l c1069l = this.f5280c;
        c1069l.f5323m0 = c1068k;
        q3 runnableC0964q3 = c1069l.f5312b0;
        StringBuilder sb = new StringBuilder();
        sb.append(c1069l.f4967W);
        sb.append("shell am force-stop ");
        sb.append(c1068k.f5295c);
        sb.append(" 2>&1;echo $?");
        a.m2193g(sb, c1069l.f5309Y, runnableC0964q3);
    }

    /* JADX INFO: renamed from: j */
    public final void m2678j(int i) {
        C1068k c1068k = this.f5281d.get(i);
        if (c1068k.f5301i <= 1 || !this.f5280c.f5315e0.isEnabled()) {
            return;
        }
        if (c1068k.f5303k) {
            c1068k.f5303k = false;
            for (int i2 = 1; i2 <= c1068k.f5301i; i2++) {
                this.f5281d.add(i + i2, this.f5280c.f5310Z.get(c1068k.f5302j + i2));
            }
        } else {
            c1068k.f5303k = true;
            for (int i3 = 1; i3 <= c1068k.f5301i; i3++) {
                this.f5281d.remove(i + 1);
            }
        }
        this.f5280c.f5314d0.f947a.m542b();
    }
}
