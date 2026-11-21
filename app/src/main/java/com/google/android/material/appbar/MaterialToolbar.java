package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.Toolbar;
import com.didjdk.adbhelper.R;
import p006b.p032h.p044j.C0418m;
import p080c.p126d.p127a.p128a.C1161a;
import p080c.p126d.p127a.p128a.p145o.C1252a;
import p080c.p126d.p127a.p128a.p148r.C1277n;
import p080c.p126d.p127a.p128a.p154x.C1296g;

/* JADX INFO: loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {
    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(C1277n.m2946d(context, attributeSet, R.attr.s8, R.style.rt), attributeSet, R.attr.s8);
        Context context2 = getContext();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            C1296g c1296g = new C1296g();
            c1296g.m2975p(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            c1296g.f6211b.f6234b = new C1252a(context2);
            c1296g.m2984y();
            c1296g.m2974o(C0418m.m1566i(this));
            setBackground(c1296g);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C1296g) {
            C1161a.m2739x(this, (C1296g) background);
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C1161a.m2738w(this, f);
    }
}
