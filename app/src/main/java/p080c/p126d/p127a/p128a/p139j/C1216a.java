package p080c.p126d.p127a.p128a.p139j;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p006b.p008b.p018i.C0259g;
import p006b.p032h.p033b.C0360f;
import p080c.p126d.p127a.p128a.C1161a;
import p080c.p126d.p127a.p128a.C1164b;
import p080c.p126d.p127a.p128a.p148r.C1277n;

/* JADX INFO: renamed from: c.d.a.a.j.a */
/* JADX INFO: loaded from: classes.dex */
public class C1216a extends C0259g {

    /* JADX INFO: renamed from: g */
    public static final int[][] f5778g = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: e */
    public ColorStateList f5779e;

    /* JADX INFO: renamed from: f */
    public boolean f5780f;

    public C1216a(Context context, AttributeSet attributeSet) {
        super(C1277n.m2946d(context, attributeSet, com.didjdk.adbhelper.R.attr.cl, com.didjdk.adbhelper.R.style.qh), attributeSet, com.didjdk.adbhelper.R.attr.cl);
        Context context2 = getContext();
        TypedArray typedArrayM2947e = C1277n.m2947e(context2, attributeSet, C1164b.f5577o, com.didjdk.adbhelper.R.attr.cl, com.didjdk.adbhelper.R.style.qh, new int[0]);
        if (typedArrayM2947e.hasValue(0)) {
            C0360f.m1421M(this, C1161a.m2723h(context2, typedArrayM2947e, 0));
        }
        this.f5780f = typedArrayM2947e.getBoolean(1, false);
        typedArrayM2947e.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f5779e == null) {
            int[][] iArr = f5778g;
            int[] iArr2 = new int[iArr.length];
            int iM2722g = C1161a.m2722g(this, com.didjdk.adbhelper.R.attr.ds);
            int iM2722g2 = C1161a.m2722g(this, com.didjdk.adbhelper.R.attr.e8);
            int iM2722g3 = C1161a.m2722g(this, com.didjdk.adbhelper.R.attr.e1);
            iArr2[0] = C1161a.m2731p(iM2722g2, iM2722g, 1.0f);
            iArr2[1] = C1161a.m2731p(iM2722g2, iM2722g3, 0.54f);
            iArr2[2] = C1161a.m2731p(iM2722g2, iM2722g3, 0.38f);
            iArr2[3] = C1161a.m2731p(iM2722g2, iM2722g3, 0.38f);
            this.f5779e = new ColorStateList(iArr, iArr2);
        }
        return this.f5779e;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f5780f && C0360f.m1460t(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f5780f = z;
        C0360f.m1421M(this, z ? getMaterialThemeColorsTintList() : null);
    }
}
