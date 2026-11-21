package androidx.preference;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.didjdk.adbhelper.R;
import p006b.p032h.p034c.C0362a;
import p006b.p032h.p034c.p035b.C0369g;
import p006b.p032h.p044j.p045w.C0429b;
import p006b.p067s.C0534l;

/* JADX INFO: loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C0369g.m1474a(context, R.attr.ni, android.R.attr.preferenceCategoryStyle), 0);
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: F */
    public boolean mo357F() {
        return !super.mo383k();
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: k */
    public boolean mo383k() {
        return false;
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: p */
    public void mo353p(C0534l c0534l) {
        TextView textView;
        super.mo353p(c0534l);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            c0534l.f927a.setAccessibilityHeading(true);
            return;
        }
        if (i < 21) {
            TypedValue typedValue = new TypedValue();
            if (this.f783b.getTheme().resolveAttribute(R.attr.dp, typedValue, true) && (textView = (TextView) c0534l.m1944w(android.R.id.title)) != null) {
                if (textView.getCurrentTextColor() != C0362a.m1468b(this.f783b, R.color.e3)) {
                    return;
                }
                textView.setTextColor(typedValue.data);
            }
        }
    }

    @Override // androidx.preference.Preference
    @Deprecated
    /* JADX INFO: renamed from: u */
    public void mo389u(C0429b c0429b) {
        int i = Build.VERSION.SDK_INT;
        if (i < 28) {
            AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = c0429b.f2743a.getCollectionItemInfo();
            C0429b.c cVar = collectionItemInfo != null ? new C0429b.c(collectionItemInfo) : null;
            if (cVar == null) {
                return;
            }
            c0429b.m1618m(C0429b.c.m1622a(((AccessibilityNodeInfo.CollectionItemInfo) cVar.f2757a).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) cVar.f2757a).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) cVar.f2757a).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) cVar.f2757a).getColumnSpan(), true, i >= 21 ? ((AccessibilityNodeInfo.CollectionItemInfo) cVar.f2757a).isSelected() : false));
        }
    }
}
