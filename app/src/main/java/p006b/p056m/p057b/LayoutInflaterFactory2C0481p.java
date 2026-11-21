package p006b.p056m.p057b;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import p006b.p025e.C0320h;
import p006b.p056m.C0450a;
import c.a.a.a.a;

/* JADX INFO: renamed from: b.m.b.p */
/* JADX INFO: loaded from: classes.dex */
public class LayoutInflaterFactory2C0481p implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: b */
    public final AbstractC0483r f3089b;

    public LayoutInflaterFactory2C0481p(AbstractC0483r abstractC0483r) {
        this.f3089b = abstractC0483r;
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        if (C0473l.class.getName().equals(str)) {
            return new C0473l(context, attributeSet, this.f3089b);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0450a.f2927a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        String string = typedArrayObtainStyledAttributes.getString(2);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue != null) {
            ClassLoader classLoader = context.getClassLoader();
            C0320h<String, Class<?>> c0320h = C0477n.f3083a;
            try {
                zIsAssignableFrom = Fragment.class.isAssignableFrom(C0477n.m1783b(classLoader, attributeValue));
            } catch (ClassNotFoundException unused) {
                zIsAssignableFrom = false;
            }
            if (zIsAssignableFrom) {
                int id = view != null ? view.getId() : 0;
                if (id == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                Fragment fragmentM1807G = resourceId != -1 ? this.f3089b.m1807G(resourceId) : null;
                if (fragmentM1807G == null && string != null) {
                    fragmentM1807G = this.f3089b.m1808H(string);
                }
                if (fragmentM1807G == null && id != -1) {
                    fragmentM1807G = this.f3089b.m1807G(id);
                }
                if (AbstractC0483r.m1800M(2)) {
                    StringBuilder sbM2191e = a.m2191e("onCreateView: id=0x");
                    sbM2191e.append(Integer.toHexString(resourceId));
                    sbM2191e.append(" fname=");
                    sbM2191e.append(attributeValue);
                    sbM2191e.append(" existing=");
                    sbM2191e.append(fragmentM1807G);
                    Log.v("FragmentManager", sbM2191e.toString());
                }
                if (fragmentM1807G == null) {
                    fragmentM1807G = this.f3089b.m1811K().mo1785a(context.getClassLoader(), attributeValue);
                    fragmentM1807G.f693n = true;
                    fragmentM1807G.f702w = resourceId != 0 ? resourceId : id;
                    fragmentM1807G.f703x = id;
                    fragmentM1807G.f704y = string;
                    fragmentM1807G.f694o = true;
                    AbstractC0483r abstractC0483r = this.f3089b;
                    fragmentM1807G.f698s = abstractC0483r;
                    AbstractC0479o<?> abstractC0479o = abstractC0483r.f3108n;
                    fragmentM1807G.f699t = abstractC0479o;
                    Context context2 = abstractC0479o.f3086c;
                    fragmentM1807G.m290W(attributeSet, fragmentM1807G.f682c);
                    this.f3089b.m1828b(fragmentM1807G);
                    AbstractC0483r abstractC0483r2 = this.f3089b;
                    abstractC0483r2.m1819T(fragmentM1807G, abstractC0483r2.f3107m);
                } else {
                    if (fragmentM1807G.f694o) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                    }
                    fragmentM1807G.f694o = true;
                    AbstractC0479o<?> abstractC0479o2 = this.f3089b.f3108n;
                    fragmentM1807G.f699t = abstractC0479o2;
                    Context context3 = abstractC0479o2.f3086c;
                    fragmentM1807G.m290W(attributeSet, fragmentM1807G.f682c);
                }
                AbstractC0483r abstractC0483r3 = this.f3089b;
                int i = abstractC0483r3.f3107m;
                if (i >= 1 || !fragmentM1807G.f693n) {
                    abstractC0483r3.m1819T(fragmentM1807G, i);
                } else {
                    abstractC0483r3.m1819T(fragmentM1807G, 1);
                }
                View view2 = fragmentM1807G.f667G;
                if (view2 == null) {
                    throw new IllegalStateException(a.m2202p("Fragment ", attributeValue, " did not create a view."));
                }
                if (resourceId != 0) {
                    view2.setId(resourceId);
                }
                if (fragmentM1807G.f667G.getTag() == null) {
                    fragmentM1807G.f667G.setTag(string);
                }
                return fragmentM1807G.f667G;
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
