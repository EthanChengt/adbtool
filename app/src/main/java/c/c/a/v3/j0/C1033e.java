package c.c.a.v3.j0;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.didjdk.adbhelper.R;
import java.util.ArrayList;
import b.s.m;
import c.a.a.a.a;

/* JADX INFO: renamed from: c.c.a.v3.j0.e */
/* JADX INFO: loaded from: classes.dex */
public class C1033e extends RecyclerView.AbstractC0132g<RecyclerView.AbstractC0129d0> {

    /* JADX INFO: renamed from: c */
    public C1032d f5137c;

    /* JADX INFO: renamed from: d */
    public ArrayList<d> f5138d = new ArrayList<>();

    /* JADX INFO: renamed from: c.c.a.v3.j0.e$a */
    public static class a extends RecyclerView.AbstractC0129d0 {

        /* JADX INFO: renamed from: t */
        public TextView f5139t;

        public a(View view) {
            super(view);
            this.f5139t = (TextView) view.findViewById(R.id.qi);
        }
    }

    /* JADX INFO: renamed from: c.c.a.v3.j0.e$b */
    public static class b extends RecyclerView.AbstractC0129d0 {

        /* JADX INFO: renamed from: t */
        public TextView f5140t;

        /* JADX INFO: renamed from: u */
        public TextView f5141u;

        /* JADX INFO: renamed from: v */
        public TextView f5142v;

        /* JADX INFO: renamed from: w */
        public TextView f5143w;

        /* JADX INFO: renamed from: x */
        public TextView f5144x;

        /* JADX INFO: renamed from: y */
        public TextView f5145y;

        /* JADX INFO: renamed from: z */
        public ProgressBar f5146z;

        public b(View view) {
            super(view);
            this.f5140t = (TextView) view.findViewById(R.id.qh);
            this.f5141u = (TextView) view.findViewById(R.id.qj);
            this.f5142v = (TextView) view.findViewById(R.id.q7);
            this.f5143w = (TextView) view.findViewById(R.id.pq);
            this.f5144x = (TextView) view.findViewById(R.id.q0);
            this.f5145y = (TextView) view.findViewById(R.id.q1);
            this.f5146z = (ProgressBar) view.findViewById(R.id.lf);
        }
    }

    /* JADX INFO: renamed from: c.c.a.v3.j0.e$c */
    public static class c extends RecyclerView.AbstractC0129d0 {

        /* JADX INFO: renamed from: t */
        public TextView f5147t;

        /* JADX INFO: renamed from: u */
        public TextView f5148u;

        public c(View view) {
            super(view);
            this.f5147t = (TextView) view.findViewById(R.id.qf);
            this.f5148u = (TextView) view.findViewById(R.id.qg);
        }
    }

    /* JADX INFO: renamed from: c.c.a.v3.j0.e$d */
    public class d {

        /* JADX INFO: renamed from: a */
        public int f5149a;

        /* JADX INFO: renamed from: b */
        public String f5150b;

        /* JADX INFO: renamed from: c */
        public String f5151c;

        /* JADX INFO: renamed from: d */
        public String f5152d;

        public d(C1033e c1033e) {
        }
    }

    public C1033e(C1032d c1032d) {
        this.f5137c = c1032d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0132g
    /* JADX INFO: renamed from: a */
    public int mo533a() {
        return this.f5138d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0132g
    /* JADX INFO: renamed from: c */
    public int mo535c(int i) {
        return this.f5138d.get(i).f5149a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0132g
    /* JADX INFO: renamed from: e */
    public void mo537e(RecyclerView.AbstractC0129d0 abstractC0129d0, int i) {
        TextView textView;
        String str;
        int i2 = this.f5138d.get(i).f5149a;
        if (i2 == 0) {
            return;
        }
        if (i2 == 1) {
            textView = ((a) abstractC0129d0).f5139t;
            str = this.f5138d.get(i).f5150b;
        } else {
            if (i2 != 2) {
                return;
            }
            c cVar = (c) abstractC0129d0;
            cVar.f5147t.setText(this.f5138d.get(i).f5151c);
            textView = cVar.f5148u;
            str = this.f5138d.get(i).f5152d;
        }
        textView.setText(str);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0132g
    /* JADX INFO: renamed from: f */
    public RecyclerView.AbstractC0129d0 mo538f(ViewGroup viewGroup, int i) {
        String string;
        StringBuilder sb;
        String str;
        int i2 = 0;
        if (i != 0) {
            if (i == 1) {
                return new a(a.m2188b(viewGroup, R.layout.bl, viewGroup, false));
            }
            if (i == 2) {
                return new c(a.m2188b(viewGroup, R.layout.bk, viewGroup, false));
            }
            throw new IllegalStateException(a.m2198l("Unexpected value: ", i));
        }
        b bVar = new b(a.m2188b(viewGroup, R.layout.bm, viewGroup, false));
        bVar.f5140t.setText(m.m1971o(this.f5137c.f5126o0.get("ro.product.manufacturer")) + " " + this.f5137c.f5126o0.get("ro.product.model"));
        TextView textView = bVar.f5141u;
        StringBuilder sbM2191e = a.m2191e("Android ");
        sbM2191e.append(m.m1972p(this.f5137c.f5126o0.get("ro.build.version.release"), ""));
        textView.setText(sbM2191e.toString());
        bVar.f5142v.setText(m.m1971o(this.f5137c.f5127p0.get("Physical size")));
        TextView textView2 = bVar.f5144x;
        try {
            float f = Integer.parseInt(this.f5137c.f5128q0.get("MemTotal").replace(" kB", "").trim());
            float f2 = f / 1024.0f;
            if (f >= 1024.0f) {
                sb = new StringBuilder();
                sb.append(String.format("%.2f", Float.valueOf(f2 / 1024.0f)));
                str = " GB";
            } else {
                sb = new StringBuilder();
                sb.append(String.format("%.0f", Float.valueOf(f2)));
                str = " MB";
            }
            sb.append(str);
            string = sb.toString();
        } catch (Exception unused) {
            string = null;
        }
        textView2.setText(m.m1971o(string));
        bVar.f5143w.setText(m.m1971o(this.f5137c.f5129r0.get("Hardware")));
        String strM1972p = m.m1972p(m.m1968l(this.f5137c.f5131t0.get("/data"), 1), "-");
        String strM1972p2 = m.m1972p(m.m1968l(this.f5137c.f5131t0.get("/data"), 3), "-");
        bVar.f5145y.setText(this.f5137c.m337y(R.string.hl) + strM1972p + "/" + this.f5137c.m337y(R.string.hp) + strM1972p2);
        bVar.f5146z.setMax(100);
        ProgressBar progressBar = bVar.f5146z;
        try {
            float f3 = Float.parseFloat(strM1972p2.split("\\s")[0]);
            float f4 = Float.parseFloat(strM1972p.split("\\s")[0]);
            if (strM1972p2.contains("GB")) {
                f3 *= 1024.0f;
            }
            if (strM1972p.contains("GB")) {
                f4 *= 1024.0f;
            }
            if (strM1972p2.contains("KB")) {
                f3 /= 1024.0f;
            }
            if (strM1972p.contains("KB")) {
                f4 /= 1024.0f;
            }
            i2 = (int) ((f3 / f4) * 100.0f);
        } catch (NumberFormatException unused2) {
        }
        progressBar.setProgress(100 - i2);
        return bVar;
    }

    /* JADX INFO: renamed from: i */
    public void m2666i(String str) {
        d dVar = new d(this);
        dVar.f5149a = 1;
        dVar.f5150b = str;
        this.f5138d.add(dVar);
    }

    /* JADX INFO: renamed from: j */
    public void m2667j(String str, String str2) {
        if (str2 == null) {
            return;
        }
        d dVar = new d(this);
        dVar.f5149a = 2;
        dVar.f5151c = str;
        dVar.f5152d = str2;
        this.f5138d.add(dVar);
    }
}
