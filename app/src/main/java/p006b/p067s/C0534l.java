package p006b.p067s;

import android.R;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: b.s.l */
/* JADX INFO: loaded from: classes.dex */
public class C0534l extends RecyclerView.AbstractC0129d0 {

    /* JADX INFO: renamed from: t */
    public final SparseArray<View> f3289t;

    /* JADX INFO: renamed from: u */
    public boolean f3290u;

    /* JADX INFO: renamed from: v */
    public boolean f3291v;

    public C0534l(View view) {
        super(view);
        SparseArray<View> sparseArray = new SparseArray<>(4);
        this.f3289t = sparseArray;
        sparseArray.put(R.id.title, view.findViewById(R.id.title));
        sparseArray.put(R.id.summary, view.findViewById(R.id.summary));
        sparseArray.put(R.id.icon, view.findViewById(R.id.icon));
        sparseArray.put(com.didjdk.adbhelper.R.id.fv, view.findViewById(com.didjdk.adbhelper.R.id.fv));
        sparseArray.put(R.id.icon_frame, view.findViewById(R.id.icon_frame));
    }

    /* JADX INFO: renamed from: w */
    public View m1944w(int i) {
        View view = this.f3289t.get(i);
        if (view != null) {
            return view;
        }
        View viewFindViewById = this.f927a.findViewById(i);
        if (viewFindViewById != null) {
            this.f3289t.put(i, viewFindViewById);
        }
        return viewFindViewById;
    }
}
