package c.c.a.v3.m0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.didjdk.adbhelper.R;
import java.util.List;
import c.a.a.a.a;
import p080c.p084b.p085a.ComponentCallbacks2C0616b;

/* JADX INFO: renamed from: c.c.a.v3.m0.x */
/* JADX INFO: loaded from: classes.dex */
public class C1100x extends RecyclerView.AbstractC0132g<RecyclerView.AbstractC0129d0> {

    /* JADX INFO: renamed from: c */
    public List<C1101y> f5370c;

    /* JADX INFO: renamed from: d */
    public Context f5371d;

    /* JADX INFO: renamed from: c.c.a.v3.m0.x$a */
    public class a extends RecyclerView.AbstractC0129d0 {

        /* JADX INFO: renamed from: t */
        public View f5372t;

        /* JADX INFO: renamed from: u */
        public ImageView f5373u;

        /* JADX INFO: renamed from: v */
        public TextView f5374v;

        /* JADX INFO: renamed from: w */
        public TextView f5375w;

        /* JADX INFO: renamed from: x */
        public Switch f5376x;

        public a(C1100x c1100x, View view) {
            super(view);
            this.f5372t = view.findViewById(R.id.ck);
            this.f5373u = (ImageView) view.findViewById(R.id.r6);
            this.f5374v = (TextView) view.findViewById(R.id.r9);
            this.f5375w = (TextView) view.findViewById(R.id.r8);
            this.f5376x = (Switch) view.findViewById(R.id.r7);
        }
    }

    public C1100x(Context context, List<C1101y> list) {
        this.f5371d = context;
        this.f5370c = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0132g
    /* JADX INFO: renamed from: a */
    public int mo533a() {
        return this.f5370c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0132g
    /* JADX INFO: renamed from: e */
    public void mo537e(RecyclerView.AbstractC0129d0 abstractC0129d0, int i) {
        C1101y c1101y = this.f5370c.get(i);
        a aVar = (a) abstractC0129d0;
        ComponentCallbacks2C0616b.m2208e(this.f5371d).m2235o(Integer.valueOf(c1101y.f5377a)).m2226x(aVar.f5373u);
        aVar.f5374v.setText(c1101y.f5378b);
        aVar.f5375w.setText(c1101y.f5379c);
        aVar.f5376x.setVisibility(c1101y.f5380d ? 0 : 8);
        aVar.f5376x.setChecked(c1101y.f5381e);
        aVar.f5376x.setOnCheckedChangeListener(c1101y.f5383g);
        aVar.f5372t.setOnClickListener(c1101y.f5382f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0132g
    /* JADX INFO: renamed from: f */
    public RecyclerView.AbstractC0129d0 mo538f(ViewGroup viewGroup, int i) {
        return new a(this, a.m2188b(viewGroup, R.layout.bt, viewGroup, false));
    }
}
