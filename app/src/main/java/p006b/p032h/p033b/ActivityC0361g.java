package p006b.p032h.p033b;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import p006b.p032h.p044j.C0408c;
import p006b.p061o.AbstractC0499d;
import p006b.p061o.C0503h;
import p006b.p061o.FragmentC0510o;
import p006b.p061o.InterfaceC0502g;

/* JADX INFO: renamed from: b.h.b.g */
/* JADX INFO: loaded from: classes.dex */
public class ActivityC0361g extends Activity implements InterfaceC0502g, C0408c.a {

    /* JADX INFO: renamed from: b */
    public C0503h f2570b = new C0503h(this);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C0408c.m1542a(decorView, keyEvent)) {
            return C0408c.m1543b(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C0408c.m1542a(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Override // p006b.p032h.p044j.C0408c.a
    /* JADX INFO: renamed from: e */
    public boolean mo860e(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentC0510o.m1910c(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        this.f2570b.m1900f(AbstractC0499d.b.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
