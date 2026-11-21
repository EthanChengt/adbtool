package p006b.p056m.p057b;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import p006b.p056m.p057b.AbstractC0483r.f;
import c.a.a.a.a;

/* JADX INFO: renamed from: b.m.b.c */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0455c extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: V */
    public Handler f2973V;

    /* JADX INFO: renamed from: W */
    public Runnable f2974W = new a();

    /* JADX INFO: renamed from: X */
    public DialogInterface.OnCancelListener f2975X = new b();

    /* JADX INFO: renamed from: Y */
    public DialogInterface.OnDismissListener f2976Y = new c();

    /* JADX INFO: renamed from: Z */
    public int f2977Z = 0;

    /* JADX INFO: renamed from: a0 */
    public int f2978a0 = 0;

    /* JADX INFO: renamed from: b0 */
    public boolean f2979b0 = true;

    /* JADX INFO: renamed from: c0 */
    public boolean f2980c0 = true;

    /* JADX INFO: renamed from: d0 */
    public int f2981d0 = -1;

    /* JADX INFO: renamed from: e0 */
    public boolean f2982e0;

    /* JADX INFO: renamed from: f0 */
    public Dialog f2983f0;

    /* JADX INFO: renamed from: g0 */
    public boolean f2984g0;

    /* JADX INFO: renamed from: h0 */
    public boolean f2985h0;

    /* JADX INFO: renamed from: i0 */
    public boolean f2986i0;

    /* JADX INFO: renamed from: b.m.b.c$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            DialogInterfaceOnCancelListenerC0455c dialogInterfaceOnCancelListenerC0455c = DialogInterfaceOnCancelListenerC0455c.this;
            dialogInterfaceOnCancelListenerC0455c.f2976Y.onDismiss(dialogInterfaceOnCancelListenerC0455c.f2983f0);
        }
    }

    /* JADX INFO: renamed from: b.m.b.c$b */
    public class b implements DialogInterface.OnCancelListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        @SuppressLint({"SyntheticAccessor"})
        public void onCancel(DialogInterface dialogInterface) {
            DialogInterfaceOnCancelListenerC0455c dialogInterfaceOnCancelListenerC0455c = DialogInterfaceOnCancelListenerC0455c.this;
            Dialog dialog = dialogInterfaceOnCancelListenerC0455c.f2983f0;
            if (dialog != null) {
                dialogInterfaceOnCancelListenerC0455c.onCancel(dialog);
            }
        }
    }

    /* JADX INFO: renamed from: b.m.b.c$c */
    public class c implements DialogInterface.OnDismissListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        @SuppressLint({"SyntheticAccessor"})
        public void onDismiss(DialogInterface dialogInterface) {
            DialogInterfaceOnCancelListenerC0455c dialogInterfaceOnCancelListenerC0455c = DialogInterfaceOnCancelListenerC0455c.this;
            Dialog dialog = dialogInterfaceOnCancelListenerC0455c.f2983f0;
            if (dialog != null) {
                dialogInterfaceOnCancelListenerC0455c.onDismiss(dialog);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: F */
    public void mo272F(Bundle bundle) {
        Bundle bundle2;
        this.f665E = true;
        if (this.f2980c0) {
            View view = this.f667G;
            if (this.f2983f0 != null) {
                if (view != null) {
                    if (view.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                    this.f2983f0.setContentView(view);
                }
                ActivityC0459e activityC0459eM303h = m303h();
                if (activityC0459eM303h != null) {
                    this.f2983f0.setOwnerActivity(activityC0459eM303h);
                }
                this.f2983f0.setCancelable(this.f2979b0);
                this.f2983f0.setOnCancelListener(this.f2975X);
                this.f2983f0.setOnDismissListener(this.f2976Y);
                if (bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
                    return;
                }
                this.f2983f0.onRestoreInstanceState(bundle2);
            }
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final void m1726G0(boolean z, boolean z2) {
        if (this.f2985h0) {
            return;
        }
        this.f2985h0 = true;
        this.f2986i0 = false;
        Dialog dialog = this.f2983f0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f2983f0.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.f2973V.getLooper()) {
                    onDismiss(this.f2983f0);
                } else {
                    this.f2973V.post(this.f2974W);
                }
            }
        }
        this.f2984g0 = true;
        if (this.f2981d0 >= 0) {
            AbstractC0483r abstractC0483rM323r = m323r();
            int i = this.f2981d0;
            if (i < 0) {
                throw new IllegalArgumentException(a.m2198l("Bad id: ", i));
            }
            abstractC0483rM323r.m1862z(abstractC0483rM323r.new f(null, i, 1), false);
            this.f2981d0 = -1;
            return;
        }
        C0451a c0451a = new C0451a(m323r());
        AbstractC0483r abstractC0483r = this.f698s;
        if (abstractC0483r != null && abstractC0483r != c0451a.f2929q) {
            StringBuilder sbM2191e = a.m2191e("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
            sbM2191e.append(toString());
            sbM2191e.append(" is already attached to a FragmentManager.");
            throw new IllegalStateException(sbM2191e.toString());
        }
        c0451a.m1724b(new AbstractC0452a0.a(3, this));
        if (z) {
            c0451a.m1718i(true);
        } else {
            c0451a.mo1713c();
        }
    }

    /* JADX INFO: renamed from: H0 */
    public Dialog mo1727H0(Bundle bundle) {
        return new Dialog(m322q0(), this.f2978a0);
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: I */
    public void mo276I(Context context) {
        super.mo276I(context);
        if (this.f2986i0) {
            return;
        }
        this.f2985h0 = false;
    }

    /* JADX INFO: renamed from: I0 */
    public final Dialog m1728I0() {
        Dialog dialog = this.f2983f0;
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: L */
    public void mo279L(Bundle bundle) {
        super.mo279L(bundle);
        this.f2973V = new Handler();
        this.f2980c0 = this.f703x == 0;
        if (bundle != null) {
            this.f2977Z = bundle.getInt("android:style", 0);
            this.f2978a0 = bundle.getInt("android:theme", 0);
            this.f2979b0 = bundle.getBoolean("android:cancelable", true);
            this.f2980c0 = bundle.getBoolean("android:showsDialog", this.f2980c0);
            this.f2981d0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: R */
    public void mo285R() {
        this.f665E = true;
        Dialog dialog = this.f2983f0;
        if (dialog != null) {
            this.f2984g0 = true;
            dialog.setOnDismissListener(null);
            this.f2983f0.dismiss();
            if (!this.f2985h0) {
                onDismiss(this.f2983f0);
            }
            this.f2983f0 = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: S */
    public void mo286S() {
        this.f665E = true;
        if (this.f2986i0 || this.f2985h0) {
            return;
        }
        this.f2985h0 = true;
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: T */
    public LayoutInflater mo287T(Bundle bundle) {
        LayoutInflater layoutInflaterM319p = m319p();
        if (!this.f2980c0 || this.f2982e0) {
            return layoutInflaterM319p;
        }
        try {
            this.f2982e0 = true;
            Dialog dialogMo1727H0 = mo1727H0(bundle);
            this.f2983f0 = dialogMo1727H0;
            int i = this.f2977Z;
            if (i == 1 || i == 2) {
                dialogMo1727H0.requestWindowFeature(1);
            } else if (i == 3) {
                Window window = dialogMo1727H0.getWindow();
                if (window != null) {
                    window.addFlags(24);
                }
                dialogMo1727H0.requestWindowFeature(1);
            }
            return layoutInflaterM319p.cloneInContext(m1728I0().getContext());
        } finally {
            this.f2982e0 = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: g0 */
    public void mo302g0(Bundle bundle) {
        Dialog dialog = this.f2983f0;
        if (dialog != null) {
            bundle.putBundle("android:savedDialogState", dialog.onSaveInstanceState());
        }
        int i = this.f2977Z;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f2978a0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.f2979b0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.f2980c0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.f2981d0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: h0 */
    public void mo304h0() {
        this.f665E = true;
        Dialog dialog = this.f2983f0;
        if (dialog != null) {
            this.f2984g0 = false;
            dialog.show();
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: i0 */
    public void mo306i0() {
        this.f665E = true;
        Dialog dialog = this.f2983f0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f2984g0) {
            return;
        }
        m1726G0(true, true);
    }
}
