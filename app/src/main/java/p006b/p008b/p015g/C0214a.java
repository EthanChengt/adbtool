package p006b.p008b.p015g;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

/* JADX INFO: renamed from: b.b.g.a */
/* JADX INFO: loaded from: classes.dex */
public class C0214a implements TransformationMethod {

    /* JADX INFO: renamed from: b */
    public Locale f1481b;

    public C0214a(Context context) {
        this.f1481b = context.getResources().getConfiguration().locale;
    }

    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.f1481b);
        }
        return null;
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
    }
}
