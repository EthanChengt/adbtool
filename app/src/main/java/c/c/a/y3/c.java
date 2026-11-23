package c.c.a.y3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.didjdk.adbhelper.R;
import java.util.List;
import p006b.p067s.C0532j;
import c.c.a.v3.C1000f0;
import c.c.a.v3.C1034k;

/* JADX INFO: renamed from: c.c.a.y3.c */
/* JADX INFO: loaded from: classes.dex */
public class c extends RecyclerView.AbstractC0132g<c.ViewHolder> {

    /* JADX INFO: renamed from: c */
    public List<d> f5503c;

    /* JADX INFO: renamed from: d */
    public a f5504d;

    /* JADX INFO: renamed from: e */
    public b f5505e;

    /* JADX INFO: renamed from: f */
    public boolean f5506f;

    /* JADX INFO: renamed from: g */
    public boolean f5507g;

    /* JADX INFO: renamed from: c.c.a.y3.c$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo2640a(int i);
    }

    /* JADX INFO: renamed from: c.c.a.y3.c$b */
    public interface b {
    }

    /* JADX INFO: renamed from: c.c.a.y3.c$c */
    public class ViewHolder extends RecyclerView.AbstractC0129d0 {

        /* JADX INFO: renamed from: t */
        public View f5508t;

        /* JADX INFO: renamed from: u */
        public ImageView f5509u;

        /* JADX INFO: renamed from: v */
        public TextView f5510v;

        /* JADX INFO: renamed from: w */
        public TextView f5511w;

        public ViewHolder(View view) {
            super(view);
            if (c.this.f5506f) {
                this.f5510v = (TextView) view.findViewById(R.id.hb);
                this.f5511w = (TextView) view.findViewById(R.id.he);
            } else {
                this.f5508t = view.findViewById(R.id.hc);
                this.f5509u = (ImageView) view.findViewById(R.id.ha);
                this.f5510v = (TextView) view.findViewById(R.id.hd);
            }
        }
    }

    public c(Context context, List<d> list) {
        this.f5506f = false;
        this.f5507g = false;
        this.f5503c = list;
        this.f5506f = true;
    }

    public c(Context context, List<d> list, a aVar) {
        this.f5506f = false;
        this.f5507g = false;
        this.f5503c = list;
        this.f5504d = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0132g
    /* JADX INFO: renamed from: a */
    public int mo533a() {
        return this.f5503c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0132g
    /* JADX INFO: renamed from: e */
    public void mo537e(RecyclerView.AbstractC0129d0 abstractC0129d0, int i) {
        final ViewHolder cVar = (ViewHolder) abstractC0129d0;
        d c1149d = this.f5503c.get(i);
        if (this.f5506f) {
            cVar.f5510v.setText(c1149d.f5513b);
            cVar.f5511w.setText(c1149d.f5516e);
            return;
        }
        cVar.f5508t.setEnabled(c1149d.f5515d);
        if (c1149d.f5514c) {
            cVar.f5509u.setVisibility(0);
            cVar.f5509u.setImageResource(c1149d.f5512a);
            cVar.f5509u.setEnabled(c1149d.f5515d);
        } else {
            cVar.f5509u.setVisibility(8);
        }
        cVar.f5510v.setText(c1149d.f5513b);
        cVar.f5510v.setEnabled(c1149d.f5515d);
        cVar.f5508t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.this.f5504d.mo2640a(cVar.m509e());
            }
        });
        if (this.f5507g) {
            cVar.f5508t.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View view) {
                    int position = cVar.m509e();
                    C1034k c1034k = (C1034k) c.this.f5505e;
                    C1000f0 c1000f0 = c1034k.f5153a;
                    List list = c1034k.f5154b;
                    c cAdapter = c1034k.f5155c;
                    if (position < list.size() - 1) {
                        list.remove(position);
                        StringBuilder sb = new StringBuilder();
                        for (int i2 = 0; i2 < list.size() - 1; i2++) {
                            sb.append(((d) list.get(i2)).f5513b);
                            sb.append(";qcmd;");
                        }
                        C0532j.m1940a(c1000f0.m303h()).edit().putString("quick_commands", sb.toString()).apply();
                        cAdapter.f947a.m542b();
                    }
                    return false;
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0132g
    /* JADX INFO: renamed from: f */
    public RecyclerView.AbstractC0129d0 mo538f(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(this.f5506f ? R.layout.bo : R.layout.bn, viewGroup, false));
    }
}
