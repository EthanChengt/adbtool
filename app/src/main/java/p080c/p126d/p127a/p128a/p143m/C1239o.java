package p080c.p126d.p127a.p128a.p143m;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.didjdk.adbhelper.R;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p006b.p008b.p010d.p011a.C0208a;
import p006b.p032h.p044j.C0418m;
import p006b.p056m.p057b.C0451a;
import p006b.p056m.p057b.DialogInterfaceOnCancelListenerC0455c;
import p080c.p126d.p127a.p128a.C1161a;
import p080c.p126d.p127a.p128a.p144n.ViewOnTouchListenerC1251a;
import p080c.p126d.p127a.p128a.p145o.C1252a;
import p080c.p126d.p127a.p128a.p154x.C1290a;
import p080c.p126d.p127a.p128a.p154x.C1296g;
import p080c.p126d.p127a.p128a.p154x.C1299j;

/* JADX INFO: renamed from: c.d.a.a.m.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1239o<S> extends DialogInterfaceOnCancelListenerC0455c {

    /* JADX INFO: renamed from: z0 */
    public static final /* synthetic */ int f5917z0 = 0;

    /* JADX INFO: renamed from: j0 */
    public final LinkedHashSet<InterfaceC1241q<? super S>> f5918j0 = new LinkedHashSet<>();

    /* JADX INFO: renamed from: k0 */
    public final LinkedHashSet<View.OnClickListener> f5919k0 = new LinkedHashSet<>();

    /* JADX INFO: renamed from: l0 */
    public final LinkedHashSet<DialogInterface.OnCancelListener> f5920l0 = new LinkedHashSet<>();

    /* JADX INFO: renamed from: m0 */
    public final LinkedHashSet<DialogInterface.OnDismissListener> f5921m0 = new LinkedHashSet<>();

    /* JADX INFO: renamed from: n0 */
    public int f5922n0;

    /* JADX INFO: renamed from: o0 */
    public InterfaceC1228d<S> f5923o0;

    /* JADX INFO: renamed from: p0 */
    public AbstractC1248x<S> f5924p0;

    /* JADX INFO: renamed from: q0 */
    public C1224a f5925q0;

    /* JADX INFO: renamed from: r0 */
    public C1231g<S> f5926r0;

    /* JADX INFO: renamed from: s0 */
    public int f5927s0;

    /* JADX INFO: renamed from: t0 */
    public CharSequence f5928t0;

    /* JADX INFO: renamed from: u0 */
    public boolean f5929u0;

    /* JADX INFO: renamed from: v0 */
    public TextView f5930v0;

    /* JADX INFO: renamed from: w0 */
    public CheckableImageButton f5931w0;

    /* JADX INFO: renamed from: x0 */
    public C1296g f5932x0;

    /* JADX INFO: renamed from: y0 */
    public Button f5933y0;

    /* JADX INFO: renamed from: c.d.a.a.m.o$a */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator<InterfaceC1241q<? super S>> it = C1239o.this.f5918j0.iterator();
            while (it.hasNext()) {
                it.next().m2867a(C1239o.this.f5923o0.m2849a());
            }
            C1239o.this.m1726G0(false, false);
        }
    }

    /* JADX INFO: renamed from: c.d.a.a.m.o$b */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator<View.OnClickListener> it = C1239o.this.f5919k0.iterator();
            while (it.hasNext()) {
                it.next().onClick(view);
            }
            C1239o.this.m1726G0(false, false);
        }
    }

    /* JADX INFO: renamed from: c.d.a.a.m.o$c */
    public class c implements InterfaceC1247w<S> {
        public c() {
        }

        @Override // p080c.p126d.p127a.p128a.p143m.InterfaceC1247w
        /* JADX INFO: renamed from: a */
        public void mo2866a(S s) {
            Button button;
            boolean z;
            C1239o c1239o = C1239o.this;
            int i = C1239o.f5917z0;
            c1239o.m2864M0();
            if (C1239o.this.f5923o0.m2853f()) {
                button = C1239o.this.f5933y0;
                z = true;
            } else {
                button = C1239o.this.f5933y0;
                z = false;
            }
            button.setEnabled(z);
        }
    }

    /* JADX INFO: renamed from: J0 */
    public static int m2861J0(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.er);
        int i = C1243s.m2870p().f5945f;
        return ((i - 1) * resources.getDimensionPixelOffset(R.dimen.fa)) + (resources.getDimensionPixelSize(R.dimen.ex) * i) + (dimensionPixelOffset * 2);
    }

    /* JADX INFO: renamed from: K0 */
    public static boolean m2862K0(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C1161a.m2737v(context, R.attr.mc, C1231g.class.getCanonicalName()), new int[]{android.R.attr.windowFullscreen});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    @Override // p006b.p056m.p057b.DialogInterfaceOnCancelListenerC0455c
    /* JADX INFO: renamed from: H0 */
    public final Dialog mo1727H0(Bundle bundle) {
        Context contextM322q0 = m322q0();
        Context contextM322q1 = m322q0();
        int iM2851c = this.f5922n0;
        if (iM2851c == 0) {
            iM2851c = this.f5923o0.m2851c(contextM322q1);
        }
        Dialog dialog = new Dialog(contextM322q0, iM2851c);
        Context context = dialog.getContext();
        this.f5929u0 = m2862K0(context);
        int iM2737v = C1161a.m2737v(context, R.attr.e8, C1239o.class.getCanonicalName());
        C1296g c1296g = new C1296g(C1299j.m2986b(context, null, R.attr.mc, R.style.qp, new C1290a(0)).m2991a());
        this.f5932x0 = c1296g;
        c1296g.f6211b.f6234b = new C1252a(context);
        c1296g.m2984y();
        this.f5932x0.m2975p(ColorStateList.valueOf(iM2737v));
        this.f5932x0.m2974o(C0418m.m1566i(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // p006b.p056m.p057b.DialogInterfaceOnCancelListenerC0455c, androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: L */
    public final void mo279L(Bundle bundle) {
        super.mo279L(bundle);
        if (bundle == null) {
            bundle = this.f686g;
        }
        this.f5922n0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f5923o0 = (InterfaceC1228d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f5925q0 = (C1224a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f5927s0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f5928t0 = bundle.getCharSequence("TITLE_TEXT_KEY");
    }

    /* JADX INFO: renamed from: L0 */
    public final void m2863L0() {
        AbstractC1248x<S> c1242r;
        InterfaceC1228d<S> interfaceC1228d = this.f5923o0;
        Context contextM322q0 = m322q0();
        int iM2851c = this.f5922n0;
        if (iM2851c == 0) {
            iM2851c = this.f5923o0.m2851c(contextM322q0);
        }
        C1224a c1224a = this.f5925q0;
        C1231g<S> c1231g = new C1231g<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", iM2851c);
        bundle.putParcelable("GRID_SELECTOR_KEY", interfaceC1228d);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", c1224a);
        bundle.putParcelable("CURRENT_MONTH_KEY", c1224a.f5855d);
        c1231g.m332v0(bundle);
        this.f5926r0 = c1231g;
        if (this.f5931w0.isChecked()) {
            InterfaceC1228d<S> interfaceC1228d2 = this.f5923o0;
            C1224a c1224a2 = this.f5925q0;
            c1242r = new C1242r<>();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("DATE_SELECTOR_KEY", interfaceC1228d2);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", c1224a2);
            c1242r.m332v0(bundle2);
        } else {
            c1242r = this.f5926r0;
        }
        this.f5924p0 = c1242r;
        m2864M0();
        C0451a c0451a = new C0451a(m307j());
        c0451a.m1725f(R.id.jr, this.f5924p0);
        if (c0451a.f2938g) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        c0451a.f2939h = false;
        c0451a.f2929q.m1803C(c0451a, false);
        AbstractC1248x<S> abstractC1248x = this.f5924p0;
        abstractC1248x.f5961V.add(new c());
    }

    /* JADX INFO: renamed from: M0 */
    public final void m2864M0() {
        String strM2850b = this.f5923o0.m2850b(m309k());
        this.f5930v0.setContentDescription(String.format(m337y(R.string.dc), strM2850b));
        this.f5930v0.setText(strM2850b);
    }

    /* JADX INFO: renamed from: N0 */
    public final void m2865N0(CheckableImageButton checkableImageButton) {
        this.f5931w0.setContentDescription(checkableImageButton.getContext().getString(this.f5931w0.isChecked() ? R.string.e1 : R.string.e3));
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: P */
    public final View mo283P(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.f5929u0 ? R.layout.ci : R.layout.ch, viewGroup);
        Context context = viewInflate.getContext();
        if (this.f5929u0) {
            viewInflate.findViewById(R.id.jr).setLayoutParams(new LinearLayout.LayoutParams(m2861J0(context), -2));
        } else {
            View viewFindViewById = viewInflate.findViewById(R.id.js);
            View viewFindViewById2 = viewInflate.findViewById(R.id.jr);
            viewFindViewById.setLayoutParams(new LinearLayout.LayoutParams(m2861J0(context), -1));
            Resources resources = m322q0().getResources();
            int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.fc) + resources.getDimensionPixelOffset(R.dimen.fe) + resources.getDimensionPixelSize(R.dimen.fd);
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.ey);
            int i = C1244t.f5948f;
            viewFindViewById2.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(R.dimen.fb) * (i - 1)) + (resources.getDimensionPixelSize(R.dimen.et) * i) + resources.getDimensionPixelOffset(R.dimen.eq));
        }
        TextView textView = (TextView) viewInflate.findViewById(R.id.k2);
        this.f5930v0 = textView;
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        textView.setAccessibilityLiveRegion(1);
        this.f5931w0 = (CheckableImageButton) viewInflate.findViewById(R.id.k4);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.k8);
        CharSequence charSequence = this.f5928t0;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.f5927s0);
        }
        this.f5931w0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f5931w0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, C0208a.m884b(context, R.drawable.bp));
        stateListDrawable.addState(new int[0], C0208a.m884b(context, R.drawable.br));
        checkableImageButton.setImageDrawable(stateListDrawable);
        C0418m.m1577t(this.f5931w0, null);
        m2865N0(this.f5931w0);
        this.f5931w0.setOnClickListener(new ViewOnClickListenerC1240p(this));
        this.f5933y0 = (Button) viewInflate.findViewById(R.id.d5);
        if (this.f5923o0.m2853f()) {
            this.f5933y0.setEnabled(true);
        } else {
            this.f5933y0.setEnabled(false);
        }
        this.f5933y0.setTag("CONFIRM_BUTTON_TAG");
        this.f5933y0.setOnClickListener(new a());
        Button button = (Button) viewInflate.findViewById(R.id.c_);
        button.setTag("CANCEL_BUTTON_TAG");
        button.setOnClickListener(new b());
        return viewInflate;
    }

    @Override // p006b.p056m.p057b.DialogInterfaceOnCancelListenerC0455c, androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: g0 */
    public final void mo302g0(Bundle bundle) {
        super.mo302g0(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f5922n0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f5923o0);
        C1224a.b bVar = new C1224a.b(this.f5925q0);
        C1243s c1243s = this.f5926r0.f5890Z;
        if (c1243s != null) {
            bVar.f5863c = Long.valueOf(c1243s.f5947h);
        }
        if (bVar.f5863c == null) {
            long j = C1243s.m2870p().f5947h;
            long j2 = bVar.f5861a;
            if (j2 > j || j > bVar.f5862b) {
                j = j2;
            }
            bVar.f5863c = Long.valueOf(j);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", bVar.f5864d);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new C1224a(C1243s.m2869l(bVar.f5861a), C1243s.m2869l(bVar.f5862b), C1243s.m2869l(bVar.f5863c.longValue()), (C1224a.c) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY"), null));
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f5927s0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f5928t0);
    }

    @Override // p006b.p056m.p057b.DialogInterfaceOnCancelListenerC0455c, androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: h0 */
    public void mo304h0() {
        this.f665E = true;
        Dialog dialog = this.f2983f0;
        if (dialog != null) {
            this.f2984g0 = false;
            dialog.show();
        }
        Window window = m1728I0().getWindow();
        if (this.f5929u0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f5932x0);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = m327t().getDimensionPixelOffset(R.dimen.ez);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f5932x0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new ViewOnTouchListenerC1251a(m1728I0(), rect));
        }
        m2863L0();
    }

    @Override // p006b.p056m.p057b.DialogInterfaceOnCancelListenerC0455c, androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: i0 */
    public void mo306i0() {
        this.f5924p0.f5961V.clear();
        this.f665E = true;
        Dialog dialog = this.f2983f0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // p006b.p056m.p057b.DialogInterfaceOnCancelListenerC0455c, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f5920l0.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
    }

    @Override // p006b.p056m.p057b.DialogInterfaceOnCancelListenerC0455c, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f5921m0.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.f667G;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }
}
