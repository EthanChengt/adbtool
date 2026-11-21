package p006b.p056m.p057b;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import p006b.p032h.p033b.C0360f;

/* JADX INFO: renamed from: b.m.b.o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0479o<E> extends AbstractC0471k {

    /* JADX INFO: renamed from: b */
    public final Activity f3085b;

    /* JADX INFO: renamed from: c */
    public final Context f3086c;

    /* JADX INFO: renamed from: d */
    public final Handler f3087d;

    /* JADX INFO: renamed from: e */
    public final AbstractC0483r f3088e;

    public AbstractC0479o(ActivityC0459e activityC0459e) {
        Handler handler = new Handler();
        this.f3088e = new C0485t();
        this.f3085b = activityC0459e;
        C0360f.m1445f(activityC0459e, "context == null");
        this.f3086c = activityC0459e;
        C0360f.m1445f(handler, "handler == null");
        this.f3087d = handler;
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo1736f(Fragment fragment);

    /* JADX INFO: renamed from: h */
    public abstract E mo1737h();

    /* JADX INFO: renamed from: i */
    public abstract LayoutInflater mo1738i();

    /* JADX INFO: renamed from: j */
    public abstract boolean mo1739j(Fragment fragment);

    /* JADX INFO: renamed from: k */
    public abstract void mo1740k(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle);

    /* JADX INFO: renamed from: l */
    public abstract void mo1741l();
}
