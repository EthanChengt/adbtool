package c.c.a.v3.k0;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.didjdk.adbhelper.R;
import java.util.List;
import c.a.a.a.a;

/* JADX INFO: renamed from: c.c.a.v3.k0.q */
/* JADX INFO: loaded from: classes.dex */
public class C1051q extends RecyclerView.AbstractC0132g<b> {

    /* JADX INFO: renamed from: c */
    public List<C1056v> f5181c;

    /* JADX INFO: renamed from: d */
    public a f5182d;

    /* JADX INFO: renamed from: e */
    public boolean f5183e = false;

    /* JADX INFO: renamed from: c.c.a.v3.k0.q$a */
    public interface a {
    }

    /* JADX INFO: renamed from: c.c.a.v3.k0.q$b */
    public static class b extends RecyclerView.AbstractC0129d0 {

        /* JADX INFO: renamed from: t */
        public View f5184t;

        /* JADX INFO: renamed from: u */
        public ImageView f5185u;

        /* JADX INFO: renamed from: v */
        public TextView f5186v;

        /* JADX INFO: renamed from: w */
        public TextView f5187w;

        /* JADX INFO: renamed from: x */
        public TextView f5188x;

        /* JADX INFO: renamed from: y */
        public CheckBox f5189y;

        public b(View view) {
            super(view);
            this.f5184t = view;
            this.f5185u = (ImageView) view.findViewById(R.id.gn);
            this.f5186v = (TextView) view.findViewById(R.id.ps);
            this.f5187w = (TextView) view.findViewById(R.id.pt);
            this.f5188x = (TextView) view.findViewById(R.id.pu);
            this.f5189y = (CheckBox) view.findViewById(R.id.cl);
        }
    }

    public C1051q(List<C1056v> list, a aVar) {
        this.f5181c = list;
        this.f5182d = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0132g
    /* JADX INFO: renamed from: a */
    public int mo533a() {
        return this.f5181c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0132g
    /* JADX INFO: renamed from: e */
    public void mo537e(RecyclerView.AbstractC0129d0 abstractC0129d0, int i) {
        b bVar = (b) abstractC0129d0;
        C1056v c1056v = this.f5181c.get(i);
        bVar.f5185u.setImageResource(c1056v.f5260o);
        bVar.f5186v.setText(c1056v.f5254i);
        bVar.f5187w.setText(c1056v.f5256k);
        bVar.f5188x.setText(c1056v.f5252g + " " + c1056v.f5253h);
        bVar.f5189y.setChecked(c1056v.f5263r);
        bVar.f5189y.setVisibility(this.f5183e ? 0 : 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0132g
    /* JADX INFO: renamed from: f */
    public RecyclerView.AbstractC0129d0 mo538f(ViewGroup viewGroup, int i) {
        b bVar = new b(a.m2188b(viewGroup, R.layout.bp, viewGroup, false));
        bVar.f5184t.setOnClickListener(new ViewOnClickListenerC1048n(this, bVar));
        bVar.f5184t.setOnLongClickListener(new ViewOnLongClickListenerC1049o(this, bVar));
        bVar.f5189y.setOnClickListener(new ViewOnClickListenerC1050p(this, bVar));
        return bVar;
    }
}
