package p006b.p070u;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.savedstate.Recreator;
import p006b.p019c.p020a.p022b.C0303b;
import c.a.a.a.a;

/* JADX INFO: renamed from: b.u.a */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedApi"})
public final class C0564a {

    /* JADX INFO: renamed from: b */
    public Bundle f3471b;

    /* JADX INFO: renamed from: c */
    public boolean f3472c;

    /* JADX INFO: renamed from: d */
    public Recreator.C0158a f3473d;

    /* JADX INFO: renamed from: a */
    public C0303b<String, b> f3470a = new C0303b<>();

    /* JADX INFO: renamed from: e */
    public boolean f3474e = true;

    /* JADX INFO: renamed from: b.u.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo350a(InterfaceC0566c interfaceC0566c);
    }

    /* JADX INFO: renamed from: b.u.a$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        Bundle mo712a();
    }

    /* JADX INFO: renamed from: a */
    public void m2075a(Class<? extends a> cls) {
        if (!this.f3474e) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f3473d == null) {
            this.f3473d = new Recreator.C0158a(this);
        }
        try {
            cls.getDeclaredConstructor(new Class[0]);
            Recreator.C0158a c0158a = this.f3473d;
            c0158a.f1071a.add(cls.getName());
        } catch (NoSuchMethodException e) {
            StringBuilder sbM2191e = a.m2191e("Class");
            sbM2191e.append(cls.getSimpleName());
            sbM2191e.append(" must have default constructor in order to be automatically recreated");
            throw new IllegalArgumentException(sbM2191e.toString(), e);
        }
    }
}
