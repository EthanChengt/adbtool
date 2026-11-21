package p006b.p067s;

import android.R;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.preference.DialogPreference;
import p006b.p008b.p009c.DialogInterfaceC0193i;
import p006b.p056m.p057b.ActivityC0459e;
import p006b.p056m.p057b.DialogInterfaceOnCancelListenerC0455c;
import p006b.p061o.InterfaceC0516u;

/* JADX INFO: renamed from: b.s.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractDialogInterfaceOnClickListenerC0527e extends DialogInterfaceOnCancelListenerC0455c implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: j0 */
    public DialogPreference f3235j0;

    /* JADX INFO: renamed from: k0 */
    public CharSequence f3236k0;

    /* JADX INFO: renamed from: l0 */
    public CharSequence f3237l0;

    /* JADX INFO: renamed from: m0 */
    public CharSequence f3238m0;

    /* JADX INFO: renamed from: n0 */
    public CharSequence f3239n0;

    /* JADX INFO: renamed from: o0 */
    public int f3240o0;

    /* JADX INFO: renamed from: p0 */
    public BitmapDrawable f3241p0;

    /* JADX INFO: renamed from: q0 */
    public int f3242q0;

    @Override // p006b.p056m.p057b.DialogInterfaceOnCancelListenerC0455c
    /* JADX INFO: renamed from: H0 */
    public Dialog mo1727H0(Bundle bundle) {
        ActivityC0459e activityC0459eM303h = m303h();
        this.f3242q0 = -2;
        DialogInterfaceC0193i.a aVar = new DialogInterfaceC0193i.a(activityC0459eM303h);
        CharSequence charSequence = this.f3236k0;
        AlertController.C0020b c0020b = aVar.f1245a;
        c0020b.f115d = charSequence;
        c0020b.f114c = this.f3241p0;
        aVar.m782d(this.f3237l0, this);
        aVar.m781c(this.f3238m0, this);
        View viewM1924M0 = m1924M0();
        if (viewM1924M0 != null) {
            mo1919L0(viewM1924M0);
            aVar.f1245a.f126o = viewM1924M0;
        } else {
            aVar.f1245a.f117f = this.f3239n0;
        }
        mo1922O0(aVar);
        DialogInterfaceC0193i dialogInterfaceC0193iM779a = aVar.m779a();
        if (mo1918K0()) {
            dialogInterfaceC0193iM779a.getWindow().setSoftInputMode(5);
        }
        return dialogInterfaceC0193iM779a;
    }

    /* JADX INFO: renamed from: J0 */
    public DialogPreference m1923J0() {
        if (this.f3235j0 == null) {
            this.f3235j0 = (DialogPreference) ((DialogPreference.InterfaceC0095a) m339z()).mo355b(this.f686g.getString("key"));
        }
        return this.f3235j0;
    }

    /* JADX INFO: renamed from: K0 */
    public boolean mo1918K0() {
        return false;
    }

    @Override // p006b.p056m.p057b.DialogInterfaceOnCancelListenerC0455c, androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: L */
    public void mo279L(Bundle bundle) {
        BitmapDrawable bitmapDrawable;
        super.mo279L(bundle);
        InterfaceC0516u interfaceC0516uM339z = m339z();
        if (!(interfaceC0516uM339z instanceof DialogPreference.InterfaceC0095a)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        DialogPreference.InterfaceC0095a interfaceC0095a = (DialogPreference.InterfaceC0095a) interfaceC0516uM339z;
        String string = this.f686g.getString("key");
        if (bundle != null) {
            this.f3236k0 = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.f3237l0 = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.f3238m0 = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.f3239n0 = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.f3240o0 = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.f3241p0 = new BitmapDrawable(m327t(), bitmap);
                return;
            }
            return;
        }
        DialogPreference dialogPreference = (DialogPreference) interfaceC0095a.mo355b(string);
        this.f3235j0 = dialogPreference;
        this.f3236k0 = dialogPreference.f745N;
        this.f3237l0 = dialogPreference.f748Q;
        this.f3238m0 = dialogPreference.f749R;
        this.f3239n0 = dialogPreference.f746O;
        this.f3240o0 = dialogPreference.f750S;
        Drawable drawable = dialogPreference.f747P;
        if (drawable == null || (drawable instanceof BitmapDrawable)) {
            bitmapDrawable = (BitmapDrawable) drawable;
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            bitmapDrawable = new BitmapDrawable(m327t(), bitmapCreateBitmap);
        }
        this.f3241p0 = bitmapDrawable;
    }

    /* JADX INFO: renamed from: L0 */
    public void mo1919L0(View view) {
        View viewFindViewById = view.findViewById(R.id.message);
        if (viewFindViewById != null) {
            CharSequence charSequence = this.f3239n0;
            int i = 8;
            if (!TextUtils.isEmpty(charSequence)) {
                if (viewFindViewById instanceof TextView) {
                    ((TextView) viewFindViewById).setText(charSequence);
                }
                i = 0;
            }
            if (viewFindViewById.getVisibility() != i) {
                viewFindViewById.setVisibility(i);
            }
        }
    }

    /* JADX INFO: renamed from: M0 */
    public View m1924M0() {
        int i = this.f3240o0;
        if (i == 0) {
            return null;
        }
        LayoutInflater layoutInflaterM314m0 = this.f674N;
        if (layoutInflaterM314m0 == null) {
            layoutInflaterM314m0 = m314m0(null);
        }
        return layoutInflaterM314m0.inflate(i, (ViewGroup) null);
    }

    /* JADX INFO: renamed from: N0 */
    public abstract void mo1920N0(boolean z);

    /* JADX INFO: renamed from: O0 */
    public void mo1922O0(DialogInterfaceC0193i.a aVar) {
    }

    @Override // p006b.p056m.p057b.DialogInterfaceOnCancelListenerC0455c, androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: g0 */
    public void mo302g0(Bundle bundle) {
        super.mo302g0(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.f3236k0);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.f3237l0);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.f3238m0);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.f3239n0);
        bundle.putInt("PreferenceDialogFragment.layout", this.f3240o0);
        BitmapDrawable bitmapDrawable = this.f3241p0;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f3242q0 = i;
    }

    @Override // p006b.p056m.p057b.DialogInterfaceOnCancelListenerC0455c, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        mo1920N0(this.f3242q0 == -1);
    }
}
