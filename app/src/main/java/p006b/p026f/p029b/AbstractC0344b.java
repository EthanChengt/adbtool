package p006b.p026f.p029b;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import p006b.p026f.p027a.p028h.C0332d;
import p006b.p026f.p027a.p028h.C0336h;

/* JADX INFO: renamed from: b.f.b.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0344b extends View {

    /* JADX INFO: renamed from: b */
    public int[] f2423b;

    /* JADX INFO: renamed from: c */
    public int f2424c;

    /* JADX INFO: renamed from: d */
    public Context f2425d;

    /* JADX INFO: renamed from: e */
    public C0336h f2426e;

    /* JADX INFO: renamed from: f */
    public String f2427f;

    public AbstractC0344b(Context context) {
        super(context);
        this.f2423b = new int[32];
        this.f2425d = context;
        mo1391b(null);
    }

    private void setIds(String str) {
        if (str == null) {
            return;
        }
        int i = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                m1392a(str.substring(i));
                return;
            } else {
                m1392a(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1392a(String str) {
        int iIntValue;
        Object objM134b;
        if (str == null || this.f2425d == null) {
            return;
        }
        String strTrim = str.trim();
        try {
            iIntValue = C0349g.class.getField(strTrim).getInt(null);
        } catch (Exception unused) {
            iIntValue = 0;
        }
        if (iIntValue == 0) {
            iIntValue = this.f2425d.getResources().getIdentifier(strTrim, "id", this.f2425d.getPackageName());
        }
        if (iIntValue == 0 && isInEditMode() && (getParent() instanceof ConstraintLayout) && (objM134b = ((ConstraintLayout) getParent()).m134b(0, strTrim)) != null && (objM134b instanceof Integer)) {
            iIntValue = ((Integer) objM134b).intValue();
        }
        if (iIntValue != 0) {
            setTag(iIntValue, null);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
    }

    /* JADX INFO: renamed from: b */
    public void mo1391b(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0350h.f2521a);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 9) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f2427f = string;
                    setIds(string);
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m1393c() {
    }

    /* JADX INFO: renamed from: d */
    public void m1394d() {
    }

    /* JADX INFO: renamed from: e */
    public void m1395e(ConstraintLayout constraintLayout) {
        if (isInEditMode()) {
            setIds(this.f2427f);
        }
        C0336h c0336h = this.f2426e;
        if (c0336h == null) {
            return;
        }
        c0336h.f2393j0 = 0;
        for (int i = 0; i < this.f2424c; i++) {
            View view = constraintLayout.f436b.get(this.f2423b[i]);
            if (view != null) {
                C0336h c0336h2 = this.f2426e;
                C0332d c0332dM136d = constraintLayout.m136d(view);
                int i2 = c0336h2.f2393j0 + 1;
                C0332d[] c0332dArr = c0336h2.f2392i0;
                if (i2 > c0332dArr.length) {
                    c0336h2.f2392i0 = (C0332d[]) Arrays.copyOf(c0332dArr, c0332dArr.length * 2);
                }
                C0332d[] c0332dArr2 = c0336h2.f2392i0;
                int i3 = c0336h2.f2393j0;
                c0332dArr2[i3] = c0332dM136d;
                c0336h2.f2393j0 = i3 + 1;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m1396f() {
        if (this.f2426e == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.C0065a) {
            ((ConstraintLayout.C0065a) layoutParams).f498k0 = this.f2426e;
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f2423b, this.f2424c);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setReferencedIds(int[] iArr) {
        this.f2424c = 0;
        for (int i : iArr) {
            setTag(i, null);
        }
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        int i2 = this.f2424c + 1;
        int[] iArr = this.f2423b;
        if (i2 > iArr.length) {
            this.f2423b = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f2423b;
        int i3 = this.f2424c;
        iArr2[i3] = i;
        this.f2424c = i3 + 1;
    }
}
