package com.google.android.material.theme;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import androidx.annotation.Keep;
import androidx.appcompat.app.AppCompatViewInflater;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import p006b.p008b.p018i.C0257f;
import p006b.p008b.p018i.C0259g;
import p006b.p008b.p018i.C0281r;
import p006b.p008b.p018i.C0297z;
import p080c.p126d.p127a.p128a.p139j.C1216a;
import p080c.p126d.p127a.p128a.p150t.C1281a;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class MaterialComponentsViewInflater extends AppCompatViewInflater {
    private static int floatingToolbarItemBackgroundResId = -1;

    @Override // androidx.appcompat.app.AppCompatViewInflater
    public C0257f createButton(Context context, AttributeSet attributeSet) {
        return shouldInflateAppCompatButton(context, attributeSet) ? new C0257f(context, attributeSet) : new MaterialButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.AppCompatViewInflater
    public C0259g createCheckBox(Context context, AttributeSet attributeSet) {
        return new C1216a(context, attributeSet);
    }

    @Override // androidx.appcompat.app.AppCompatViewInflater
    public C0281r createRadioButton(Context context, AttributeSet attributeSet) {
        return new C1281a(context, attributeSet);
    }

    @Override // androidx.appcompat.app.AppCompatViewInflater
    public C0297z createTextView(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }

    public boolean shouldInflateAppCompatButton(Context context, AttributeSet attributeSet) {
        int i = Build.VERSION.SDK_INT;
        if (i != 23 && i != 24 && i != 25) {
            return false;
        }
        if (floatingToolbarItemBackgroundResId == -1) {
            floatingToolbarItemBackgroundResId = context.getResources().getIdentifier("floatingToolbarItemBackgroundDrawable", "^attr-private", "android");
        }
        int i2 = floatingToolbarItemBackgroundResId;
        if (i2 != 0 && i2 != -1) {
            for (int i3 = 0; i3 < attributeSet.getAttributeCount(); i3++) {
                if (attributeSet.getAttributeNameResource(i3) == 16842964) {
                    if (floatingToolbarItemBackgroundResId == attributeSet.getAttributeListValue(i3, null, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
