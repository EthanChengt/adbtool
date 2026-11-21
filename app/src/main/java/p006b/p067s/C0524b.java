package p006b.p067s;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import com.didjdk.adbhelper.R;
import java.util.ArrayList;
import java.util.List;
import p006b.p008b.p010d.p011a.C0208a;

/* JADX INFO: renamed from: b.s.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0524b extends Preference {

    /* JADX INFO: renamed from: N */
    public long f3225N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0524b(Context context, List<Preference> list, long j) {
        super(context, null);
        CharSequence string = null;
        this.f774E = R.layout.b4;
        Drawable drawableM884b = C0208a.m884b(this.f783b, R.drawable.bo);
        if (this.f792k != drawableM884b) {
            this.f792k = drawableM884b;
            this.f791j = 0;
            mo356l();
        }
        this.f791j = R.drawable.bo;
        String string2 = this.f783b.getString(R.string.c6);
        if ((string2 == null && this.f789h != null) || (string2 != null && !string2.equals(this.f789h))) {
            this.f789h = string2;
            mo356l();
        }
        m372D(999);
        ArrayList arrayList = new ArrayList();
        for (Preference preference : list) {
            CharSequence charSequence = preference.f789h;
            boolean z = preference instanceof PreferenceGroup;
            if (z && !TextUtils.isEmpty(charSequence)) {
                arrayList.add((PreferenceGroup) preference);
            }
            if (arrayList.contains(preference.f778I)) {
                if (z) {
                    arrayList.add((PreferenceGroup) preference);
                }
            } else if (!TextUtils.isEmpty(charSequence)) {
                string = string == null ? charSequence : this.f783b.getString(R.string.h2, string, charSequence);
            }
        }
        mo364E(string);
        this.f3225N = j + 1000000;
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: c */
    public long mo376c() {
        return this.f3225N;
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: p */
    public void mo353p(C0534l c0534l) {
        super.mo353p(c0534l);
        c0534l.f3290u = false;
    }
}
