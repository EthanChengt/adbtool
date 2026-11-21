package p006b.p067s;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.preference.DialogPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.didjdk.adbhelper.R;
import java.util.Objects;

/* JADX INFO: renamed from: b.s.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0528f extends Fragment implements C0532j.c, C0532j.a, C0532j.b, DialogPreference.InterfaceC0095a {

    /* JADX INFO: renamed from: W */
    public C0532j f3244W;

    /* JADX INFO: renamed from: X */
    public RecyclerView f3245X;

    /* JADX INFO: renamed from: Y */
    public boolean f3246Y;

    /* JADX INFO: renamed from: Z */
    public boolean f3247Z;

    /* JADX INFO: renamed from: V */
    public final c f3243V = new c();

    /* JADX INFO: renamed from: a0 */
    public int f3248a0 = R.layout.dc;

    /* JADX INFO: renamed from: b0 */
    public Handler f3249b0 = new a();

    /* JADX INFO: renamed from: c0 */
    public final Runnable f3250c0 = new b();

    /* JADX INFO: renamed from: b.s.f$a */
    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            AbstractC0528f abstractC0528f = AbstractC0528f.this;
            PreferenceScreen preferenceScreen = abstractC0528f.f3244W.f3281g;
            if (preferenceScreen != null) {
                abstractC0528f.f3245X.setAdapter(new C0529g(preferenceScreen));
                preferenceScreen.mo385n();
            }
        }
    }

    /* JADX INFO: renamed from: b.s.f$b */
    public class b implements Runnable {
        public b() {
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = AbstractC0528f.this.f3245X;
            recyclerView.focusableViewAvailable(recyclerView);
        }
    }

    /* JADX INFO: renamed from: b.s.f$c */
    public class c extends RecyclerView.AbstractC0139n {

        /* JADX INFO: renamed from: a */
        public Drawable f3253a;

        /* JADX INFO: renamed from: b */
        public int f3254b;

        /* JADX INFO: renamed from: c */
        public boolean f3255c = true;

        public c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0139n
        /* JADX INFO: renamed from: d */
        public void mo557d(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0123a0 c0123a0) {
            if (m1927g(view, recyclerView)) {
                rect.bottom = this.f3254b;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0139n
        /* JADX INFO: renamed from: f */
        public void mo559f(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0123a0 c0123a0) {
            if (this.f3253a == null) {
                return;
            }
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (m1927g(childAt, recyclerView)) {
                    int height = childAt.getHeight() + ((int) childAt.getY());
                    this.f3253a.setBounds(0, height, width, this.f3254b + height);
                    this.f3253a.draw(canvas);
                }
            }
        }

        /* JADX INFO: renamed from: g */
        public final boolean m1927g(View view, RecyclerView recyclerView) {
            RecyclerView.AbstractC0129d0 childViewHolder = recyclerView.getChildViewHolder(view);
            boolean z = false;
            if (!((childViewHolder instanceof C0534l) && ((C0534l) childViewHolder).f3291v)) {
                return false;
            }
            boolean z2 = this.f3255c;
            int iIndexOfChild = recyclerView.indexOfChild(view);
            if (iIndexOfChild >= recyclerView.getChildCount() - 1) {
                return z2;
            }
            RecyclerView.AbstractC0129d0 childViewHolder2 = recyclerView.getChildViewHolder(recyclerView.getChildAt(iIndexOfChild + 1));
            if ((childViewHolder2 instanceof C0534l) && ((C0534l) childViewHolder2).f3290u) {
                z = true;
            }
            return z;
        }
    }

    /* JADX INFO: renamed from: b.s.f$d */
    public interface d {
        /* JADX INFO: renamed from: a */
        boolean m1928a(AbstractC0528f abstractC0528f, Preference preference);
    }

    /* JADX INFO: renamed from: b.s.f$e */
    public interface e {
        /* JADX INFO: renamed from: a */
        boolean m1929a(AbstractC0528f abstractC0528f, Preference preference);
    }

    /* JADX INFO: renamed from: b.s.f$f */
    public interface f {
        /* JADX INFO: renamed from: a */
        boolean m1930a(AbstractC0528f abstractC0528f, PreferenceScreen preferenceScreen);
    }

    /* JADX INFO: renamed from: G0 */
    public abstract void mo1925G0(Bundle bundle, String str);

    /* JADX INFO: renamed from: H0 */
    public RecyclerView m1926H0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        RecyclerView recyclerView;
        if (m309k().getPackageManager().hasSystemFeature("android.hardware.type.automotive") && (recyclerView = (RecyclerView) viewGroup.findViewById(R.id.lr)) != null) {
            return recyclerView;
        }
        RecyclerView recyclerView2 = (RecyclerView) layoutInflater.inflate(R.layout.de, viewGroup, false);
        recyclerView2.setLayoutManager(new LinearLayoutManager(m309k()));
        recyclerView2.setAccessibilityDelegateCompat(new C0533k(recyclerView2));
        return recyclerView2;
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: L */
    public void mo279L(Bundle bundle) {
        super.mo279L(bundle);
        TypedValue typedValue = new TypedValue();
        m303h().getTheme().resolveAttribute(R.attr.nq, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = R.style.g_;
        }
        m303h().getTheme().applyStyle(i, false);
        C0532j c0532j = new C0532j(m309k());
        this.f3244W = c0532j;
        c0532j.f3284j = this;
        Bundle bundle2 = this.f686g;
        mo1925G0(bundle, bundle2 != null ? bundle2.getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null);
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: P */
    public View mo283P(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TypedArray typedArrayObtainStyledAttributes = m309k().obtainStyledAttributes(null, C0536n.f3299h, R.attr.nk, 0);
        this.f3248a0 = typedArrayObtainStyledAttributes.getResourceId(0, this.f3248a0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(3, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(m309k());
        View viewInflate = layoutInflaterCloneInContext.inflate(this.f3248a0, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(android.R.id.list_container);
        if (!(viewFindViewById instanceof ViewGroup)) {
            throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById;
        RecyclerView recyclerViewM1926H0 = m1926H0(layoutInflaterCloneInContext, viewGroup2);
        if (recyclerViewM1926H0 == null) {
            throw new RuntimeException("Could not create RecyclerView");
        }
        this.f3245X = recyclerViewM1926H0;
        recyclerViewM1926H0.addItemDecoration(this.f3243V);
        c cVar = this.f3243V;
        Objects.requireNonNull(cVar);
        cVar.f3254b = drawable != null ? drawable.getIntrinsicHeight() : 0;
        cVar.f3253a = drawable;
        AbstractC0528f.this.f3245X.invalidateItemDecorations();
        if (dimensionPixelSize != -1) {
            c cVar2 = this.f3243V;
            cVar2.f3254b = dimensionPixelSize;
            AbstractC0528f.this.f3245X.invalidateItemDecorations();
        }
        this.f3243V.f3255c = z;
        if (this.f3245X.getParent() == null) {
            viewGroup2.addView(this.f3245X);
        }
        this.f3249b0.post(this.f3250c0);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: R */
    public void mo285R() {
        this.f3249b0.removeCallbacks(this.f3250c0);
        this.f3249b0.removeMessages(1);
        if (this.f3246Y) {
            this.f3245X.setAdapter(null);
            PreferenceScreen preferenceScreen = this.f3244W.f3281g;
            if (preferenceScreen != null) {
                preferenceScreen.mo388s();
            }
        }
        this.f3245X = null;
        this.f665E = true;
    }

    @Override // androidx.preference.DialogPreference.InterfaceC0095a
    /* JADX INFO: renamed from: b */
    public <T extends Preference> T mo355b(CharSequence charSequence) {
        PreferenceScreen preferenceScreen;
        C0532j c0532j = this.f3244W;
        if (c0532j == null || (preferenceScreen = c0532j.f3281g) == null) {
            return null;
        }
        return (T) preferenceScreen.m393H(charSequence);
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: g0 */
    public void mo302g0(Bundle bundle) {
        PreferenceScreen preferenceScreen = this.f3244W.f3281g;
        if (preferenceScreen != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreen.mo375b(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: h0 */
    public void mo304h0() {
        this.f665E = true;
        C0532j c0532j = this.f3244W;
        c0532j.f3282h = this;
        c0532j.f3283i = this;
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: i0 */
    public void mo306i0() {
        this.f665E = true;
        C0532j c0532j = this.f3244W;
        c0532j.f3282h = null;
        c0532j.f3283i = null;
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: j0 */
    public void mo308j0(View view, Bundle bundle) {
        PreferenceScreen preferenceScreen;
        Bundle bundle2;
        PreferenceScreen preferenceScreen2;
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (preferenceScreen2 = this.f3244W.f3281g) != null) {
            preferenceScreen2.mo374a(bundle2);
        }
        if (this.f3246Y && (preferenceScreen = this.f3244W.f3281g) != null) {
            this.f3245X.setAdapter(new C0529g(preferenceScreen));
            preferenceScreen.mo385n();
        }
        this.f3247Z = true;
    }
}
