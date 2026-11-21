package p006b.p067s;

import android.R;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import p006b.p008b.p010d.p011a.C0208a;
import p006b.p032h.p044j.C0418m;

/* JADX WARN: Unexpected interfaces in signature: [java.lang.Object] */
/* JADX INFO: renamed from: b.s.g */
/* JADX INFO: loaded from: classes.dex */
public class C0529g extends RecyclerView.AbstractC0132g<C0534l> implements Preference.InterfaceC0104c {

    /* JADX INFO: renamed from: c */
    public PreferenceGroup f3257c;

    /* JADX INFO: renamed from: d */
    public List<Preference> f3258d;

    /* JADX INFO: renamed from: e */
    public List<Preference> f3259e;

    /* JADX INFO: renamed from: f */
    public List<b> f3260f;

    /* JADX INFO: renamed from: h */
    public Runnable f3262h = new a();

    /* JADX INFO: renamed from: g */
    public Handler f3261g = new Handler();

    /* JADX INFO: renamed from: b.s.g$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0529g.this.m1935m();
        }
    }

    /* JADX INFO: renamed from: b.s.g$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public int f3264a;

        /* JADX INFO: renamed from: b */
        public int f3265b;

        /* JADX INFO: renamed from: c */
        public String f3266c;

        public b(Preference preference) {
            this.f3266c = preference.getClass().getName();
            this.f3264a = preference.f774E;
            this.f3265b = preference.f775F;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f3264a == bVar.f3264a && this.f3265b == bVar.f3265b && TextUtils.equals(this.f3266c, bVar.f3266c);
        }

        public int hashCode() {
            return this.f3266c.hashCode() + ((((527 + this.f3264a) * 31) + this.f3265b) * 31);
        }
    }

    public C0529g(PreferenceGroup preferenceGroup) {
        this.f3257c = preferenceGroup;
        this.f3257c.f776G = this;
        this.f3258d = new ArrayList();
        this.f3259e = new ArrayList();
        this.f3260f = new ArrayList();
        PreferenceGroup preferenceGroup2 = this.f3257c;
        m540h(preferenceGroup2 instanceof PreferenceScreen ? ((PreferenceScreen) preferenceGroup2).f817T : true);
        m1935m();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0132g
    /* JADX INFO: renamed from: a */
    public int mo533a() {
        return this.f3259e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0132g
    /* JADX INFO: renamed from: b */
    public long mo534b(int i) {
        if (this.f948b) {
            return m1933k(i).mo376c();
        }
        return -1L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0132g
    /* JADX INFO: renamed from: c */
    public int mo535c(int i) {
        b bVar = new b(m1933k(i));
        int iIndexOf = this.f3260f.indexOf(bVar);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        int size = this.f3260f.size();
        this.f3260f.add(bVar);
        return size;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0132g
    /* JADX INFO: renamed from: e */
    public void mo537e(RecyclerView.AbstractC0129d0 abstractC0129d0, int i) {
        m1933k(i).mo353p((C0534l) abstractC0129d0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0132g
    /* JADX INFO: renamed from: f */
    public RecyclerView.AbstractC0129d0 mo538f(ViewGroup viewGroup, int i) {
        b bVar = this.f3260f.get(i);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        TypedArray typedArrayObtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, C0536n.f3292a);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = C0208a.m884b(viewGroup.getContext(), R.drawable.list_selector_background);
        }
        typedArrayObtainStyledAttributes.recycle();
        View viewInflate = layoutInflaterFrom.inflate(bVar.f3264a, viewGroup, false);
        if (viewInflate.getBackground() == null) {
            WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
            viewInflate.setBackground(drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(R.id.widget_frame);
        if (viewGroup2 != null) {
            int i2 = bVar.f3265b;
            if (i2 != 0) {
                layoutInflaterFrom.inflate(i2, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new C0534l(viewInflate);
    }

    /* JADX INFO: renamed from: i */
    public final List<Preference> m1931i(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int iM395J = preferenceGroup.m395J();
        int i = 0;
        for (int i2 = 0; i2 < iM395J; i2++) {
            Preference preferenceM394I = preferenceGroup.m394I(i2);
            if (preferenceM394I.f804w) {
                if (!m1934l(preferenceGroup) || i < preferenceGroup.f815S) {
                    arrayList.add(preferenceM394I);
                } else {
                    arrayList2.add(preferenceM394I);
                }
                if (preferenceM394I instanceof PreferenceGroup) {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceM394I;
                    if (!preferenceGroup2.mo396K()) {
                        continue;
                    } else {
                        if (m1934l(preferenceGroup) && m1934l(preferenceGroup2)) {
                            throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                        }
                        for (Preference preference : m1931i(preferenceGroup2)) {
                            if (!m1934l(preferenceGroup) || i < preferenceGroup.f815S) {
                                arrayList.add(preference);
                            } else {
                                arrayList2.add(preference);
                            }
                            i++;
                        }
                    }
                } else {
                    i++;
                }
            }
        }
        if (m1934l(preferenceGroup) && i > preferenceGroup.f815S) {
            C0524b c0524b = new C0524b(preferenceGroup.f783b, arrayList2, preferenceGroup.f785d);
            c0524b.f787f = new C0530h(this, preferenceGroup);
            arrayList.add(c0524b);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public final void m1932j(List<Preference> list, PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            Collections.sort(preferenceGroup.f811O);
        }
        int iM395J = preferenceGroup.m395J();
        for (int i = 0; i < iM395J; i++) {
            Preference preferenceM394I = preferenceGroup.m394I(i);
            list.add(preferenceM394I);
            b bVar = new b(preferenceM394I);
            if (!this.f3260f.contains(bVar)) {
                this.f3260f.add(bVar);
            }
            if (preferenceM394I instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceM394I;
                if (preferenceGroup2.mo396K()) {
                    m1932j(list, preferenceGroup2);
                }
            }
            preferenceM394I.f776G = this;
        }
    }

    /* JADX INFO: renamed from: k */
    public Preference m1933k(int i) {
        if (i < 0 || i >= mo533a()) {
            return null;
        }
        return this.f3259e.get(i);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m1934l(PreferenceGroup preferenceGroup) {
        return preferenceGroup.f815S != Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: m */
    public void m1935m() {
        Iterator<Preference> it = this.f3258d.iterator();
        while (it.hasNext()) {
            it.next().f776G = null;
        }
        ArrayList arrayList = new ArrayList(this.f3258d.size());
        this.f3258d = arrayList;
        m1932j(arrayList, this.f3257c);
        this.f3259e = m1931i(this.f3257c);
        C0532j c0532j = this.f3257c.f784c;
        this.f947a.m542b();
        Iterator<Preference> it2 = this.f3258d.iterator();
        while (it2.hasNext()) {
            Objects.requireNonNull(it2.next());
        }
    }
}
