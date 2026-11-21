package p006b.p008b.p016h;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import p006b.p032h.p044j.C0423r;
import p006b.p032h.p044j.C0425t;
import p006b.p032h.p044j.InterfaceC0424s;

/* JADX INFO: renamed from: b.b.h.g */
/* JADX INFO: loaded from: classes.dex */
public class C0221g {

    /* JADX INFO: renamed from: c */
    public Interpolator f1543c;

    /* JADX INFO: renamed from: d */
    public InterfaceC0424s f1544d;

    /* JADX INFO: renamed from: e */
    public boolean f1545e;

    /* JADX INFO: renamed from: b */
    public long f1542b = -1;

    /* JADX INFO: renamed from: f */
    public final C0425t f1546f = new a();

    /* JADX INFO: renamed from: a */
    public final ArrayList<C0423r> f1541a = new ArrayList<>();

    /* JADX INFO: renamed from: b.b.h.g$a */
    public class a extends C0425t {

        /* JADX INFO: renamed from: a */
        public boolean f1547a = false;

        /* JADX INFO: renamed from: b */
        public int f1548b = 0;

        public a() {
        }

        @Override // p006b.p032h.p044j.InterfaceC0424s
        /* JADX INFO: renamed from: a */
        public void mo849a(View view) {
            int i = this.f1548b + 1;
            this.f1548b = i;
            if (i == C0221g.this.f1541a.size()) {
                InterfaceC0424s interfaceC0424s = C0221g.this.f1544d;
                if (interfaceC0424s != null) {
                    interfaceC0424s.mo849a(null);
                }
                this.f1548b = 0;
                this.f1547a = false;
                C0221g.this.f1545e = false;
            }
        }

        @Override // p006b.p032h.p044j.C0425t, p006b.p032h.p044j.InterfaceC0424s
        /* JADX INFO: renamed from: b */
        public void mo857b(View view) {
            if (this.f1547a) {
                return;
            }
            this.f1547a = true;
            InterfaceC0424s interfaceC0424s = C0221g.this.f1544d;
            if (interfaceC0424s != null) {
                interfaceC0424s.mo857b(null);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m913a() {
        if (this.f1545e) {
            Iterator<C0423r> it = this.f1541a.iterator();
            while (it.hasNext()) {
                it.next().m1592b();
            }
            this.f1545e = false;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m914b() {
        View view;
        if (this.f1545e) {
            return;
        }
        for (C0423r c0423r : this.f1541a) {
            long j = this.f1542b;
            if (j >= 0) {
                c0423r.m1593c(j);
            }
            Interpolator interpolator = this.f1543c;
            if (interpolator != null && (view = c0423r.f2732a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f1544d != null) {
                c0423r.m1594d(this.f1546f);
            }
            View view2 = c0423r.f2732a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f1545e = true;
    }
}
