package p006b.p008b.p018i;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.didjdk.adbhelper.R;

/* JADX INFO: renamed from: b.b.i.b1 */
/* JADX INFO: loaded from: classes.dex */
public class C0247b1 {

    /* JADX INFO: renamed from: a */
    public final Context f1777a;

    /* JADX INFO: renamed from: b */
    public final View f1778b;

    /* JADX INFO: renamed from: c */
    public final TextView f1779c;

    /* JADX INFO: renamed from: d */
    public final WindowManager.LayoutParams f1780d;

    /* JADX INFO: renamed from: e */
    public final Rect f1781e;

    /* JADX INFO: renamed from: f */
    public final int[] f1782f;

    /* JADX INFO: renamed from: g */
    public final int[] f1783g;

    public C0247b1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1780d = layoutParams;
        this.f1781e = new Rect();
        this.f1782f = new int[2];
        this.f1783g = new int[2];
        this.f1777a = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.a1, (ViewGroup) null);
        this.f1778b = viewInflate;
        this.f1779c = (TextView) viewInflate.findViewById(R.id.ja);
        layoutParams.setTitle(C0247b1.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.e;
        layoutParams.flags = 24;
    }

    /* JADX INFO: renamed from: a */
    public void m1015a() {
        if (this.f1778b.getParent() != null) {
            ((WindowManager) this.f1777a.getSystemService("window")).removeView(this.f1778b);
        }
    }
}
