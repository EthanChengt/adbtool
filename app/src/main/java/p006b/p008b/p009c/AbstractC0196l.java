package p006b.p008b.p009c;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import p006b.p025e.C0315c;

/* JADX INFO: renamed from: b.b.c.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0196l {

    /* JADX INFO: renamed from: b */
    public static final C0315c<WeakReference<AbstractC0196l>> f1249b = new C0315c<>();

    /* JADX INFO: renamed from: c */
    public static final Object f1250c = new Object();

    /* JADX INFO: renamed from: s */
    public static void m798s(AbstractC0196l abstractC0196l) {
        synchronized (f1250c) {
            Iterator<WeakReference<AbstractC0196l>> it = f1249b.iterator();
            while (it.hasNext()) {
                AbstractC0196l abstractC0196l2 = it.next().get();
                if (abstractC0196l2 == abstractC0196l || abstractC0196l2 == null) {
                    it.remove();
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo799c(View view, ViewGroup.LayoutParams layoutParams);

    /* JADX INFO: renamed from: d */
    public void mo800d(Context context) {
    }

    /* JADX INFO: renamed from: e */
    public abstract <T extends View> T mo801e(int i);

    /* JADX INFO: renamed from: f */
    public int mo802f() {
        return -100;
    }

    /* JADX INFO: renamed from: g */
    public abstract MenuInflater mo803g();

    /* JADX INFO: renamed from: h */
    public abstract AbstractC0185a mo804h();

    /* JADX INFO: renamed from: i */
    public abstract void mo805i();

    /* JADX INFO: renamed from: j */
    public abstract void mo806j();

    /* JADX INFO: renamed from: k */
    public abstract void mo807k(Configuration configuration);

    /* JADX INFO: renamed from: l */
    public abstract void mo808l(Bundle bundle);

    /* JADX INFO: renamed from: m */
    public abstract void mo809m();

    /* JADX INFO: renamed from: n */
    public abstract void mo810n(Bundle bundle);

    /* JADX INFO: renamed from: o */
    public abstract void mo811o();

    /* JADX INFO: renamed from: p */
    public abstract void mo812p(Bundle bundle);

    /* JADX INFO: renamed from: q */
    public abstract void mo813q();

    /* JADX INFO: renamed from: r */
    public abstract void mo814r();

    /* JADX INFO: renamed from: t */
    public abstract boolean mo815t(int i);

    /* JADX INFO: renamed from: u */
    public abstract void mo816u(int i);

    /* JADX INFO: renamed from: v */
    public abstract void mo817v(View view);

    /* JADX INFO: renamed from: w */
    public abstract void mo818w(View view, ViewGroup.LayoutParams layoutParams);

    /* JADX INFO: renamed from: x */
    public abstract void mo819x(Toolbar toolbar);

    /* JADX INFO: renamed from: y */
    public void mo820y(int i) {
    }

    /* JADX INFO: renamed from: z */
    public abstract void mo821z(CharSequence charSequence);
}
