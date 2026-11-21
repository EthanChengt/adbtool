package p080c.p126d.p127a.p128a.p150t;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p006b.p008b.p018i.C0281r;
import p006b.p032h.p033b.C0360f;
import p080c.p126d.p127a.p128a.C1161a;
import p080c.p126d.p127a.p128a.C1164b;
import p080c.p126d.p127a.p128a.p148r.C1277n;

/* JADX INFO: renamed from: c.d.a.a.t.a */
/* JADX INFO: loaded from: classes.dex */
public class C1281a extends C0281r {

    /* JADX INFO: renamed from: g */
    public static final int[][] f6158g = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: e */
    public ColorStateList f6159e;

    /* JADX INFO: renamed from: f */
    public boolean f6160f;

    public C1281a(Context context, AttributeSet attributeSet) {
        super(C1277n.m2946d(context, attributeSet, com.didjdk.adbhelper.R.attr.nx, com.didjdk.adbhelper.R.style.qi), attributeSet, com.didjdk.adbhelper.R.attr.nx);
        TypedArray typedArrayM2947e = C1277n.m2947e(getContext(), attributeSet, C1164b.f5578p, com.didjdk.adbhelper.R.attr.nx, com.didjdk.adbhelper.R.style.qi, new int[0]);
        this.f6160f = typedArrayM2947e.getBoolean(0, false);
        typedArrayM2947e.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f6159e == null) {
            int iM2722g = C1161a.m2722g(this, com.didjdk.adbhelper.R.attr.ds);
            int iM2722g2 = C1161a.m2722g(this, com.didjdk.adbhelper.R.attr.e1);
            int iM2722g3 = C1161a.m2722g(this, com.didjdk.adbhelper.R.attr.e8);
            int[][] iArr = f6158g;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = C1161a.m2731p(iM2722g3, iM2722g, 1.0f);
            iArr2[1] = C1161a.m2731p(iM2722g3, iM2722g2, 0.54f);
            iArr2[2] = C1161a.m2731p(iM2722g3, iM2722g2, 0.38f);
            iArr2[3] = C1161a.m2731p(iM2722g3, iM2722g2, 0.38f);
            this.f6159e = new ColorStateList(iArr, iArr2);
        }
        return this.f6159e;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f6160f && C0360f.m1460t(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f6160f = z;
        C0360f.m1421M(this, z ? getMaterialThemeColorsTintList() : null);
    }
}
