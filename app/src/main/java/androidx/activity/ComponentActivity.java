package androidx.activity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import p006b.p007a.InterfaceC0182c;
import p006b.p032h.p033b.ActivityC0361g;
import p006b.p061o.AbstractC0499d;
import p006b.p061o.C0503h;
import p006b.p061o.C0515t;
import p006b.p061o.FragmentC0510o;
import p006b.p061o.InterfaceC0500e;
import p006b.p061o.InterfaceC0502g;
import p006b.p061o.InterfaceC0516u;
import p006b.p070u.C0564a;
import p006b.p070u.C0565b;
import p006b.p070u.InterfaceC0566c;

/* JADX INFO: loaded from: classes.dex */
public class ComponentActivity extends ActivityC0361g implements InterfaceC0502g, InterfaceC0516u, InterfaceC0566c, InterfaceC0182c {

    /* JADX INFO: renamed from: c */
    public final C0503h f44c;

    /* JADX INFO: renamed from: d */
    public final C0565b f45d;

    /* JADX INFO: renamed from: e */
    public C0515t f46e;

    /* JADX INFO: renamed from: f */
    public final OnBackPressedDispatcher f47f;

    /* JADX INFO: renamed from: androidx.activity.ComponentActivity$a */
    public class RunnableC0016a implements Runnable {
        public RunnableC0016a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentActivity.super.onBackPressed();
        }
    }

    /* JADX INFO: renamed from: androidx.activity.ComponentActivity$b */
    public static final class C0017b {

        /* JADX INFO: renamed from: a */
        public C0515t f51a;
    }

    public ComponentActivity() {
        C0503h c0503h = new C0503h(this);
        this.f44c = c0503h;
        this.f45d = new C0565b(this);
        this.f47f = new OnBackPressedDispatcher(new RunnableC0016a());
        int i = Build.VERSION.SDK_INT;
        c0503h.mo1894a(new InterfaceC0500e() { // from class: androidx.activity.ComponentActivity.2
            @Override // p006b.p061o.InterfaceC0500e
            /* JADX INFO: renamed from: d */
            public void mo8d(InterfaceC0502g interfaceC0502g, AbstractC0499d.a aVar) {
                if (aVar == AbstractC0499d.a.ON_STOP) {
                    Window window = ComponentActivity.this.getWindow();
                    View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                    if (viewPeekDecorView != null) {
                        viewPeekDecorView.cancelPendingInputEvents();
                    }
                }
            }
        });
        c0503h.mo1894a(new InterfaceC0500e() { // from class: androidx.activity.ComponentActivity.3
            @Override // p006b.p061o.InterfaceC0500e
            /* JADX INFO: renamed from: d */
            public void mo8d(InterfaceC0502g interfaceC0502g, AbstractC0499d.a aVar) {
                if (aVar != AbstractC0499d.a.ON_DESTROY || ComponentActivity.this.isChangingConfigurations()) {
                    return;
                }
                ComponentActivity.this.mo7g().m1913a();
            }
        });
        if (i <= 23) {
            c0503h.mo1894a(new ImmLeaksCleaner(this));
        }
    }

    @Override // p006b.p061o.InterfaceC0502g
    /* JADX INFO: renamed from: a */
    public AbstractC0499d mo4a() {
        return this.f44c;
    }

    @Override // p006b.p007a.InterfaceC0182c
    /* JADX INFO: renamed from: c */
    public final OnBackPressedDispatcher mo5c() {
        return this.f47f;
    }

    @Override // p006b.p070u.InterfaceC0566c
    /* JADX INFO: renamed from: d */
    public final C0564a mo6d() {
        return this.f45d.f3476b;
    }

    @Override // p006b.p061o.InterfaceC0516u
    /* JADX INFO: renamed from: g */
    public C0515t mo7g() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f46e == null) {
            C0017b c0017b = (C0017b) getLastNonConfigurationInstance();
            if (c0017b != null) {
                this.f46e = c0017b.f51a;
            }
            if (this.f46e == null) {
                this.f46e = new C0515t();
            }
        }
        return this.f46e;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.f47f.m9a();
    }

    @Override // p006b.p032h.p033b.ActivityC0361g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f45d.m2076a(bundle);
        FragmentC0510o.m1910c(this);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0017b c0017b;
        C0515t c0515t = this.f46e;
        if (c0515t == null && (c0017b = (C0017b) getLastNonConfigurationInstance()) != null) {
            c0515t = c0017b.f51a;
        }
        if (c0515t == null) {
            return null;
        }
        C0017b c0017b2 = new C0017b();
        c0017b2.f51a = c0515t;
        return c0017b2;
    }

    @Override // p006b.p032h.p033b.ActivityC0361g, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        C0503h c0503h = this.f44c;
        if (c0503h instanceof C0503h) {
            c0503h.m1900f(AbstractC0499d.b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f45d.m2077b(bundle);
    }
}
