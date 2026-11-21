package p080c.p084b.p085a;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.List;
import java.util.Map;
import p080c.p084b.p085a.p088m.p091u.C0708l;
import p080c.p084b.p085a.p088m.p091u.p092c0.InterfaceC0676b;
import p080c.p084b.p085a.p107q.C0846f;
import p080c.p084b.p085a.p107q.InterfaceC0845e;
import p080c.p084b.p085a.p107q.p108j.C0855f;

/* JADX INFO: renamed from: c.b.a.d */
/* JADX INFO: loaded from: classes.dex */
public class C0618d extends ContextWrapper {

    /* JADX INFO: renamed from: k */
    public static final AbstractC0624j<?, ?> f3778k = new C0615a();

    /* JADX INFO: renamed from: a */
    public final InterfaceC0676b f3779a;

    /* JADX INFO: renamed from: b */
    public final C0621g f3780b;

    /* JADX INFO: renamed from: c */
    public final C0855f f3781c;

    /* JADX INFO: renamed from: d */
    public final ComponentCallbacks2C0616b.a f3782d;

    /* JADX INFO: renamed from: e */
    public final List<InterfaceC0845e<Object>> f3783e;

    /* JADX INFO: renamed from: f */
    public final Map<Class<?>, AbstractC0624j<?, ?>> f3784f;

    /* JADX INFO: renamed from: g */
    public final C0708l f3785g;

    /* JADX INFO: renamed from: h */
    public final C0619e f3786h;

    /* JADX INFO: renamed from: i */
    public final int f3787i;

    /* JADX INFO: renamed from: j */
    public C0846f f3788j;

    public C0618d(Context context, InterfaceC0676b interfaceC0676b, C0621g c0621g, C0855f c0855f, ComponentCallbacks2C0616b.a aVar, Map<Class<?>, AbstractC0624j<?, ?>> map, List<InterfaceC0845e<Object>> list, C0708l c0708l, C0619e c0619e, int i) {
        super(context.getApplicationContext());
        this.f3779a = interfaceC0676b;
        this.f3780b = c0621g;
        this.f3781c = c0855f;
        this.f3782d = aVar;
        this.f3783e = list;
        this.f3784f = map;
        this.f3785g = c0708l;
        this.f3786h = c0619e;
        this.f3787i = i;
    }
}
