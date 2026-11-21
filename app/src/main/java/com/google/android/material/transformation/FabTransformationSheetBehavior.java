package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.didjdk.adbhelper.R;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import p006b.p032h.p044j.C0418m;
import p080c.p126d.p127a.p128a.p131c.C1188g;
import p080c.p126d.p127a.p128a.p131c.C1190i;

/* JADX INFO: loaded from: classes.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* JADX INFO: renamed from: i */
    public Map<View, Integer> f10512i;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    /* JADX INFO: renamed from: C */
    public boolean mo3194C(View view, View view2, boolean z, boolean z2) {
        int iIntValue;
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                this.f10512i = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                boolean z3 = (childAt.getLayoutParams() instanceof CoordinatorLayout.C0071f) && (((CoordinatorLayout.C0071f) childAt.getLayoutParams()).f542a instanceof FabTransformationScrimBehavior);
                if (childAt != view2 && !z3) {
                    Map<View, Integer> map = this.f10512i;
                    if (z) {
                        map.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        iIntValue = 4;
                    } else if (map != null && map.containsKey(childAt)) {
                        iIntValue = this.f10512i.get(childAt).intValue();
                    }
                    WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
                    childAt.setImportantForAccessibility(iIntValue);
                }
            }
            if (!z) {
                this.f10512i = null;
            }
        }
        super.mo3194C(view, view2, z, z2);
        return true;
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    /* JADX INFO: renamed from: O */
    public FabTransformationBehavior.C1387b mo3206O(Context context, boolean z) {
        int i = z ? R.animator.n : R.animator.m;
        FabTransformationBehavior.C1387b c1387b = new FabTransformationBehavior.C1387b();
        c1387b.f10506a = C1188g.m2765b(context, i);
        c1387b.f10507b = new C1190i(17, 0.0f, 0.0f);
        return c1387b;
    }
}
