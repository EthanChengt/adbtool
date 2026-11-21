package p080c.p126d.p127a.p128a.p141l;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import p080c.p126d.p127a.p128a.C1161a;

/* JADX INFO: renamed from: c.d.a.a.l.d */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1222d {

    /* JADX INFO: renamed from: c.d.a.a.l.d$b */
    public static class b implements TypeEvaluator<e> {

        /* JADX INFO: renamed from: b */
        public static final TypeEvaluator<e> f5846b = new b();

        /* JADX INFO: renamed from: a */
        public final e f5847a = new e(null);

        @Override // android.animation.TypeEvaluator
        public e evaluate(float f, e eVar, e eVar2) {
            e eVar3 = eVar;
            e eVar4 = eVar2;
            e eVar5 = this.f5847a;
            float fM2732q = C1161a.m2732q(eVar3.f5850a, eVar4.f5850a, f);
            float fM2732q2 = C1161a.m2732q(eVar3.f5851b, eVar4.f5851b, f);
            float fM2732q3 = C1161a.m2732q(eVar3.f5852c, eVar4.f5852c, f);
            eVar5.f5850a = fM2732q;
            eVar5.f5851b = fM2732q2;
            eVar5.f5852c = fM2732q3;
            return this.f5847a;
        }
    }

    /* JADX INFO: renamed from: c.d.a.a.l.d$c */
    public static class c extends Property<InterfaceC1222d, e> {

        /* JADX INFO: renamed from: a */
        public static final Property<InterfaceC1222d, e> f5848a = new c("circularReveal");

        public c(String str) {
            super(e.class, str);
        }

        @Override // android.util.Property
        public e get(InterfaceC1222d interfaceC1222d) {
            return interfaceC1222d.getRevealInfo();
        }

        @Override // android.util.Property
        public void set(InterfaceC1222d interfaceC1222d, e eVar) {
            interfaceC1222d.setRevealInfo(eVar);
        }
    }

    /* JADX INFO: renamed from: c.d.a.a.l.d$d */
    public static class d extends Property<InterfaceC1222d, Integer> {

        /* JADX INFO: renamed from: a */
        public static final Property<InterfaceC1222d, Integer> f5849a = new d("circularRevealScrimColor");

        public d(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        public Integer get(InterfaceC1222d interfaceC1222d) {
            return Integer.valueOf(interfaceC1222d.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        public void set(InterfaceC1222d interfaceC1222d, Integer num) {
            interfaceC1222d.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* JADX INFO: renamed from: c.d.a.a.l.d$e */
    public static class e {

        /* JADX INFO: renamed from: a */
        public float f5850a;

        /* JADX INFO: renamed from: b */
        public float f5851b;

        /* JADX INFO: renamed from: c */
        public float f5852c;

        public e() {
        }

        public e(float f, float f2, float f3) {
            this.f5850a = f;
            this.f5851b = f2;
            this.f5852c = f3;
        }

        public e(a aVar) {
        }
    }

    /* JADX INFO: renamed from: a */
    void mo2843a();

    /* JADX INFO: renamed from: b */
    void mo2844b();

    int getCircularRevealScrimColor();

    e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(e eVar);
}
