package p006b.p008b.p016h.p017i;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import p006b.p008b.p009c.DialogInterfaceC0193i;

/* JADX INFO: renamed from: b.b.h.i.h */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnKeyListenerC0230h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC0235m.a {

    /* JADX INFO: renamed from: b */
    public C0229g f1654b;

    /* JADX INFO: renamed from: c */
    public DialogInterfaceC0193i f1655c;

    /* JADX INFO: renamed from: d */
    public C0227e f1656d;

    public DialogInterfaceOnKeyListenerC0230h(C0229g c0229g) {
        this.f1654b = c0229g;
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0235m.a
    /* JADX INFO: renamed from: a */
    public void mo60a(C0229g c0229g, boolean z) {
        DialogInterfaceC0193i dialogInterfaceC0193i;
        if ((z || c0229g == this.f1654b) && (dialogInterfaceC0193i = this.f1655c) != null) {
            dialogInterfaceC0193i.dismiss();
        }
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0235m.a
    /* JADX INFO: renamed from: b */
    public boolean mo61b(C0229g c0229g) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f1654b.m958r(((C0227e.a) this.f1656d.m936b()).getItem(i), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        C0227e c0227e = this.f1656d;
        C0229g c0229g = this.f1654b;
        InterfaceC0235m.a aVar = c0227e.f1619f;
        if (aVar != null) {
            aVar.mo60a(c0229g, true);
        }
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f1655c.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f1655c.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f1654b.m943c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f1654b.performShortcut(i, keyEvent, 0);
    }
}
