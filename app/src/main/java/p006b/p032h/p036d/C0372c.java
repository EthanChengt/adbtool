package p006b.p032h.p036d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Objects;
import p006b.p025e.C0318f;
import p006b.p025e.C0320h;
import p006b.p032h.p034c.p035b.C0365c;
import p006b.p032h.p034c.p035b.C0367e;
import p006b.p032h.p034c.p035b.C0369g;
import p006b.p032h.p034c.p035b.InterfaceC0364b;
import p006b.p032h.p041g.C0389a;
import p006b.p032h.p041g.C0391c;
import p006b.p032h.p041g.C0392d;
import p006b.p032h.p041g.C0393e;
import p006b.p032h.p041g.C0394f;
import p006b.p032h.p041g.CallableC0390b;
import p006b.p032h.p041g.RunnableC0395g;

/* JADX INFO: renamed from: b.h.d.c */
/* JADX INFO: loaded from: classes.dex */
public class C0372c {

    /* JADX INFO: renamed from: a */
    public static final C0379j f2593a;

    /* JADX INFO: renamed from: b */
    public static final C0318f<String, Typeface> f2594b;

    /* JADX WARN: Code duplicated, block: B:18:0x0032  */
    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    /* JADX WARN: Code duplicated, block: B:21:0x003c  */
    static {
        C0379j c0379j;
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            c0379j = new C0376g();
        } else if (i >= 26) {
            c0379j = new C0375f();
        } else if (i >= 24) {
            Method method = C0374e.f2602d;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                c0379j = new C0374e();
            } else if (i >= 21) {
                c0379j = new C0373d();
            } else {
                c0379j = new C0379j();
            }
        } else if (i >= 21) {
            c0379j = new C0373d();
        } else {
            c0379j = new C0379j();
        }
        f2593a = c0379j;
        f2594b = new C0318f<>(16);
    }

    /* JADX INFO: renamed from: a */
    public static Typeface m1492a(Context context, InterfaceC0364b interfaceC0364b, Resources resources, int i, int i2, C0369g.a aVar, Handler handler, boolean z) {
        Typeface typefaceMo1497a;
        if (interfaceC0364b instanceof C0367e) {
            C0367e c0367e = (C0367e) interfaceC0364b;
            boolean z2 = true;
            if (!z ? aVar != null : c0367e.f2584c != 0) {
                z2 = false;
            }
            int i3 = z ? c0367e.f2583b : -1;
            C0389a c0389a = c0367e.f2582a;
            C0318f<String, Typeface> c0318f = C0393e.f2639a;
            String str = c0389a.f2631e + "-" + i2;
            typefaceMo1497a = C0393e.f2639a.m1258a(str);
            if (typefaceMo1497a != null) {
                if (aVar != null) {
                    aVar.mo1179d(typefaceMo1497a);
                }
            } else if (z2 && i3 == -1) {
                C0393e.d dVarM1525b = C0393e.m1525b(context, c0389a, i2);
                if (aVar != null) {
                    int i4 = dVarM1525b.f2652b;
                    if (i4 == 0) {
                        aVar.m1486b(dVarM1525b.f2651a, handler);
                    } else {
                        aVar.m1485a(i4, handler);
                    }
                }
                typefaceMo1497a = dVarM1525b.f2651a;
            } else {
                CallableC0390b callableC0390b = new CallableC0390b(context, c0389a, i2, str);
                typefaceMo1497a = null;
                if (z2) {
                    try {
                        typefaceMo1497a = ((C0393e.d) C0393e.f2640b.m1527b(callableC0390b, i3)).f2651a;
                    } catch (InterruptedException unused) {
                    }
                } else {
                    C0391c c0391c = aVar == null ? null : new C0391c(aVar, handler);
                    synchronized (C0393e.f2641c) {
                        C0320h<String, ArrayList<C0394f.c<C0393e.d>>> c0320h = C0393e.f2642d;
                        ArrayList<C0394f.c<C0393e.d>> orDefault = c0320h.getOrDefault(str, null);
                        if (orDefault == null) {
                            if (c0391c != null) {
                                ArrayList<C0394f.c<C0393e.d>> arrayList = new ArrayList<>();
                                arrayList.add(c0391c);
                                c0320h.put(str, arrayList);
                            }
                            C0394f c0394f = C0393e.f2640b;
                            C0392d c0392d = new C0392d(str);
                            Objects.requireNonNull(c0394f);
                            c0394f.m1526a(new RunnableC0395g(c0394f, callableC0390b, new Handler(), c0392d));
                        } else if (c0391c != null) {
                            orDefault.add(c0391c);
                        }
                    }
                }
            }
        } else {
            typefaceMo1497a = f2593a.mo1497a(context, (C0365c) interfaceC0364b, resources, i2);
            if (aVar != null) {
                if (typefaceMo1497a != null) {
                    aVar.m1486b(typefaceMo1497a, handler);
                } else {
                    aVar.m1485a(-3, handler);
                }
            }
        }
        if (typefaceMo1497a != null) {
            f2594b.m1259b(m1494c(resources, i, i2), typefaceMo1497a);
        }
        return typefaceMo1497a;
    }

    /* JADX INFO: renamed from: b */
    public static Typeface m1493b(Context context, Resources resources, int i, String str, int i2) {
        Typeface typefaceMo1503d = f2593a.mo1503d(context, resources, i, str, i2);
        if (typefaceMo1503d != null) {
            f2594b.m1259b(m1494c(resources, i, i2), typefaceMo1503d);
        }
        return typefaceMo1503d;
    }

    /* JADX INFO: renamed from: c */
    public static String m1494c(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }
}
