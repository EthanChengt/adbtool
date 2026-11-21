package androidx.preference;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.didjdk.adbhelper.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import p006b.p008b.p010d.p011a.C0208a;
import p006b.p032h.p034c.p035b.C0369g;
import p006b.p032h.p044j.C0418m;
import p006b.p032h.p044j.p045w.C0429b;
import p006b.p056m.p057b.AbstractC0483r;
import p006b.p056m.p057b.C0451a;
import p006b.p067s.AbstractC0528f;
import p006b.p067s.C0529g;
import p006b.p067s.C0532j;
import p006b.p067s.C0534l;
import p006b.p067s.C0536n;
import c.a.a.a.a;

/* JADX INFO: loaded from: classes.dex */
public class Preference implements Comparable<Preference> {

    /* JADX INFO: renamed from: A */
    public boolean f770A;

    /* JADX INFO: renamed from: B */
    public boolean f771B;

    /* JADX INFO: renamed from: C */
    public boolean f772C;

    /* JADX INFO: renamed from: D */
    public boolean f773D;

    /* JADX INFO: renamed from: E */
    public int f774E;

    /* JADX INFO: renamed from: F */
    public int f775F;

    /* JADX INFO: renamed from: G */
    public InterfaceC0104c f776G;

    /* JADX INFO: renamed from: H */
    public List<Preference> f777H;

    /* JADX INFO: renamed from: I */
    public PreferenceGroup f778I;

    /* JADX INFO: renamed from: J */
    public boolean f779J;

    /* JADX INFO: renamed from: K */
    public ViewOnCreateContextMenuListenerC0106e f780K;

    /* JADX INFO: renamed from: L */
    public InterfaceC0107f f781L;

    /* JADX INFO: renamed from: M */
    public final View.OnClickListener f782M;

    /* JADX INFO: renamed from: b */
    public Context f783b;

    /* JADX INFO: renamed from: c */
    public C0532j f784c;

    /* JADX INFO: renamed from: d */
    public long f785d;

    /* JADX INFO: renamed from: e */
    public boolean f786e;

    /* JADX INFO: renamed from: f */
    public InterfaceC0105d f787f;

    /* JADX INFO: renamed from: g */
    public int f788g;

    /* JADX INFO: renamed from: h */
    public CharSequence f789h;

    /* JADX INFO: renamed from: i */
    public CharSequence f790i;

    /* JADX INFO: renamed from: j */
    public int f791j;

    /* JADX INFO: renamed from: k */
    public Drawable f792k;

    /* JADX INFO: renamed from: l */
    public String f793l;

    /* JADX INFO: renamed from: m */
    public Intent f794m;

    /* JADX INFO: renamed from: n */
    public String f795n;

    /* JADX INFO: renamed from: o */
    public Bundle f796o;

    /* JADX INFO: renamed from: p */
    public boolean f797p;

    /* JADX INFO: renamed from: q */
    public boolean f798q;

    /* JADX INFO: renamed from: r */
    public boolean f799r;

    /* JADX INFO: renamed from: s */
    public String f800s;

    /* JADX INFO: renamed from: t */
    public Object f801t;

    /* JADX INFO: renamed from: u */
    public boolean f802u;

    /* JADX INFO: renamed from: v */
    public boolean f803v;

    /* JADX INFO: renamed from: w */
    public boolean f804w;

    /* JADX INFO: renamed from: x */
    public boolean f805x;

    /* JADX INFO: renamed from: y */
    public boolean f806y;

    /* JADX INFO: renamed from: z */
    public boolean f807z;

    /* JADX INFO: renamed from: androidx.preference.Preference$a */
    public class ViewOnClickListenerC0102a implements View.OnClickListener {
        public ViewOnClickListenerC0102a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Preference.this.mo351A(view);
        }
    }

    /* JADX INFO: renamed from: androidx.preference.Preference$b */
    public static class C0103b extends AbsSavedState {
        public static final Parcelable.Creator<C0103b> CREATOR = new a();

        /* JADX INFO: renamed from: androidx.preference.Preference$b$a */
        public static class a implements Parcelable.Creator<C0103b> {
            @Override // android.os.Parcelable.Creator
            public C0103b createFromParcel(Parcel parcel) {
                return new C0103b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public C0103b[] newArray(int i) {
                return new C0103b[i];
            }
        }

        public C0103b(Parcel parcel) {
            super(parcel);
        }

        public C0103b(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX INFO: renamed from: androidx.preference.Preference$c */
    public interface InterfaceC0104c {
    }

    /* JADX INFO: renamed from: androidx.preference.Preference$d */
    public interface InterfaceC0105d {
        /* JADX INFO: renamed from: a */
        boolean mo392a(Preference preference);
    }

    /* JADX INFO: renamed from: androidx.preference.Preference$e */
    public static class ViewOnCreateContextMenuListenerC0106e implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: b */
        public final Preference f809b;

        public ViewOnCreateContextMenuListenerC0106e(Preference preference) {
            this.f809b = preference;
        }

        @Override // android.view.View.OnCreateContextMenuListener
        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            CharSequence charSequenceMo368i = this.f809b.mo368i();
            if (!this.f809b.f772C || TextUtils.isEmpty(charSequenceMo368i)) {
                return;
            }
            contextMenu.setHeaderTitle(charSequenceMo368i);
            contextMenu.add(0, 0, 0, R.string.ba).setOnMenuItemClickListener(this);
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            ClipboardManager clipboardManager = (ClipboardManager) this.f809b.f783b.getSystemService("clipboard");
            CharSequence charSequenceMo368i = this.f809b.mo368i();
            clipboardManager.setPrimaryClip(ClipData.newPlainText("Preference", charSequenceMo368i));
            Context context = this.f809b.f783b;
            Toast.makeText(context, context.getString(R.string.fj, charSequenceMo368i), 0).show();
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.preference.Preference$f */
    public interface InterfaceC0107f<T extends Preference> {
        /* JADX INFO: renamed from: a */
        CharSequence mo363a(T t);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0369g.m1474a(context, R.attr.np, android.R.attr.preferenceStyle), 0);
    }

    /* JADX INFO: renamed from: A */
    public void mo351A(View view) {
        C0532j.c cVar;
        if (mo383k() && this.f798q) {
            mo354q();
            InterfaceC0105d interfaceC0105d = this.f787f;
            if (interfaceC0105d == null || !interfaceC0105d.mo392a(this)) {
                C0532j c0532j = this.f784c;
                if (c0532j != null && (cVar = c0532j.f3282h) != null) {
                    AbstractC0528f abstractC0528f = (AbstractC0528f) cVar;
                    boolean z = true;
                    if (this.f795n != null) {
                        if (!(abstractC0528f.m303h() instanceof AbstractC0528f.e ? ((AbstractC0528f.e) abstractC0528f.m303h()).m1929a(abstractC0528f, this) : false)) {
                            Log.w("PreferenceFragment", "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
                            AbstractC0483r abstractC0483rM1734m = abstractC0528f.m320p0().m1734m();
                            if (this.f796o == null) {
                                this.f796o = new Bundle();
                            }
                            Bundle bundle = this.f796o;
                            Fragment fragmentMo1785a = abstractC0483rM1734m.m1811K().mo1785a(abstractC0528f.m320p0().getClassLoader(), this.f795n);
                            fragmentMo1785a.m332v0(bundle);
                            fragmentMo1785a.m267C0(abstractC0528f, 0);
                            C0451a c0451a = new C0451a(abstractC0483rM1734m);
                            c0451a.m1725f(((View) abstractC0528f.f667G.getParent()).getId(), fragmentMo1785a);
                            if (!c0451a.f2939h) {
                                throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
                            }
                            c0451a.f2938g = true;
                            c0451a.f2940i = null;
                            c0451a.mo1713c();
                        }
                    } else {
                        z = false;
                    }
                    if (z) {
                        return;
                    }
                }
                Intent intent = this.f794m;
                if (intent != null) {
                    this.f783b.startActivity(intent);
                }
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public boolean m370B(String str) {
        if (!m373G()) {
            return false;
        }
        if (TextUtils.equals(str, m379f(null))) {
            return true;
        }
        m381h();
        SharedPreferences.Editor editorM1941b = this.f784c.m1941b();
        editorM1941b.putString(this.f793l, str);
        if (!this.f784c.f3279e) {
            editorM1941b.apply();
        }
        return true;
    }

    /* JADX INFO: renamed from: C */
    public final void m371C(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                m371C(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public void m372D(int i) {
        if (i != this.f788g) {
            this.f788g = i;
            InterfaceC0104c interfaceC0104c = this.f776G;
            if (interfaceC0104c != null) {
                C0529g c0529g = (C0529g) interfaceC0104c;
                c0529g.f3261g.removeCallbacks(c0529g.f3262h);
                c0529g.f3261g.post(c0529g.f3262h);
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public void mo364E(CharSequence charSequence) {
        if (this.f781L != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        }
        if (TextUtils.equals(this.f790i, charSequence)) {
            return;
        }
        this.f790i = charSequence;
        mo356l();
    }

    /* JADX INFO: renamed from: F */
    public boolean mo357F() {
        return !mo383k();
    }

    /* JADX INFO: renamed from: G */
    public boolean m373G() {
        return this.f784c != null && this.f799r && m382j();
    }

    /* JADX INFO: renamed from: a */
    public void mo374a(Bundle bundle) {
        Parcelable parcelable;
        if (!m382j() || (parcelable = bundle.getParcelable(this.f793l)) == null) {
            return;
        }
        this.f779J = false;
        mo360w(parcelable);
        if (!this.f779J) {
            throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo375b(Bundle bundle) {
        if (m382j()) {
            this.f779J = false;
            Parcelable parcelableMo361x = mo361x();
            if (!this.f779J) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            }
            if (parcelableMo361x != null) {
                bundle.putParcelable(this.f793l, parcelableMo361x);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public long mo376c() {
        return this.f785d;
    }

    @Override // java.lang.Comparable
    public int compareTo(Preference preference) {
        Preference preference2 = preference;
        int i = this.f788g;
        int i2 = preference2.f788g;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.f789h;
        CharSequence charSequence2 = preference2.f789h;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference2.f789h.toString());
    }

    /* JADX INFO: renamed from: d */
    public boolean m377d(boolean z) {
        if (!m373G()) {
            return z;
        }
        m381h();
        return this.f784c.m1942c().getBoolean(this.f793l, z);
    }

    /* JADX INFO: renamed from: e */
    public int m378e(int i) {
        if (!m373G()) {
            return i;
        }
        m381h();
        return this.f784c.m1942c().getInt(this.f793l, i);
    }

    /* JADX INFO: renamed from: f */
    public String m379f(String str) {
        if (!m373G()) {
            return str;
        }
        m381h();
        return this.f784c.m1942c().getString(this.f793l, str);
    }

    /* JADX INFO: renamed from: g */
    public Set<String> m380g(Set<String> set) {
        if (!m373G()) {
            return set;
        }
        m381h();
        return this.f784c.m1942c().getStringSet(this.f793l, set);
    }

    /* JADX INFO: renamed from: h */
    public void m381h() {
        C0532j c0532j = this.f784c;
    }

    /* JADX INFO: renamed from: i */
    public CharSequence mo368i() {
        InterfaceC0107f interfaceC0107f = this.f781L;
        return interfaceC0107f != null ? interfaceC0107f.mo363a(this) : this.f790i;
    }

    /* JADX INFO: renamed from: j */
    public boolean m382j() {
        return !TextUtils.isEmpty(this.f793l);
    }

    /* JADX INFO: renamed from: k */
    public boolean mo383k() {
        return this.f797p && this.f802u && this.f803v;
    }

    /* JADX INFO: renamed from: l */
    public void mo356l() {
        InterfaceC0104c interfaceC0104c = this.f776G;
        if (interfaceC0104c != null) {
            C0529g c0529g = (C0529g) interfaceC0104c;
            int iIndexOf = c0529g.f3259e.indexOf(this);
            if (iIndexOf != -1) {
                c0529g.f947a.m543c(iIndexOf, 1, this);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public void mo384m(boolean z) {
        List<Preference> list = this.f777H;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).m387r(z);
        }
    }

    /* JADX INFO: renamed from: n */
    public void mo385n() {
        PreferenceScreen preferenceScreen;
        if (TextUtils.isEmpty(this.f800s)) {
            return;
        }
        String str = this.f800s;
        C0532j c0532j = this.f784c;
        Preference preferenceM393H = null;
        if (c0532j != null && (preferenceScreen = c0532j.f3281g) != null) {
            preferenceM393H = preferenceScreen.m393H(str);
        }
        if (preferenceM393H != null) {
            if (preferenceM393H.f777H == null) {
                preferenceM393H.f777H = new ArrayList();
            }
            preferenceM393H.f777H.add(this);
            m387r(preferenceM393H.mo357F());
            return;
        }
        StringBuilder sbM2191e = a.m2191e("Dependency \"");
        sbM2191e.append(this.f800s);
        sbM2191e.append("\" not found for preference \"");
        sbM2191e.append(this.f793l);
        sbM2191e.append("\" (title: \"");
        sbM2191e.append((Object) this.f789h);
        sbM2191e.append("\"");
        throw new IllegalStateException(sbM2191e.toString());
    }

    /* JADX INFO: renamed from: o */
    public void m386o(C0532j c0532j) {
        SharedPreferences sharedPreferencesM1942c;
        long j;
        this.f784c = c0532j;
        if (!this.f786e) {
            synchronized (c0532j) {
                j = c0532j.f3276b;
                c0532j.f3276b = 1 + j;
            }
            this.f785d = j;
        }
        m381h();
        if (m373G()) {
            if (this.f784c != null) {
                m381h();
                sharedPreferencesM1942c = this.f784c.m1942c();
            } else {
                sharedPreferencesM1942c = null;
            }
            if (sharedPreferencesM1942c.contains(this.f793l)) {
                m391z(null);
                return;
            }
        }
        Object obj = this.f801t;
        if (obj != null) {
            m391z(obj);
        }
    }

    /* JADX INFO: renamed from: p */
    public void mo353p(C0534l c0534l) {
        Integer numValueOf;
        View view = c0534l.f927a;
        view.setOnClickListener(this.f782M);
        view.setId(0);
        TextView textView = (TextView) c0534l.m1944w(android.R.id.summary);
        if (textView != null) {
            CharSequence charSequenceMo368i = mo368i();
            if (TextUtils.isEmpty(charSequenceMo368i)) {
                textView.setVisibility(8);
                numValueOf = null;
            } else {
                textView.setText(charSequenceMo368i);
                textView.setVisibility(0);
                numValueOf = Integer.valueOf(textView.getCurrentTextColor());
            }
        } else {
            numValueOf = null;
        }
        TextView textView2 = (TextView) c0534l.m1944w(android.R.id.title);
        if (textView2 != null) {
            CharSequence charSequence = this.f789h;
            if (TextUtils.isEmpty(charSequence)) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(charSequence);
                textView2.setVisibility(0);
                if (this.f807z) {
                    textView2.setSingleLine(this.f770A);
                }
                if (!this.f798q && mo383k() && numValueOf != null) {
                    textView2.setTextColor(numValueOf.intValue());
                }
            }
        }
        ImageView imageView = (ImageView) c0534l.m1944w(android.R.id.icon);
        if (imageView != null) {
            int i = this.f791j;
            if (i != 0 || this.f792k != null) {
                if (this.f792k == null) {
                    this.f792k = C0208a.m884b(this.f783b, i);
                }
                Drawable drawable = this.f792k;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                }
            }
            if (this.f792k != null) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(this.f771B ? 4 : 8);
            }
        }
        View viewM1944w = c0534l.m1944w(R.id.fv);
        if (viewM1944w == null) {
            viewM1944w = c0534l.m1944w(android.R.id.icon_frame);
        }
        if (viewM1944w != null) {
            if (this.f792k != null) {
                viewM1944w.setVisibility(0);
            } else {
                viewM1944w.setVisibility(this.f771B ? 4 : 8);
            }
        }
        m371C(view, this.f773D ? mo383k() : true);
        boolean z = this.f798q;
        view.setFocusable(z);
        view.setClickable(z);
        c0534l.f3290u = this.f805x;
        c0534l.f3291v = this.f806y;
        boolean z2 = this.f772C;
        if (z2 && this.f780K == null) {
            this.f780K = new ViewOnCreateContextMenuListenerC0106e(this);
        }
        view.setOnCreateContextMenuListener(z2 ? this.f780K : null);
        view.setLongClickable(z2);
        if (!z2 || z) {
            return;
        }
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        view.setBackground(null);
    }

    /* JADX INFO: renamed from: q */
    public void mo354q() {
    }

    /* JADX INFO: renamed from: r */
    public void m387r(boolean z) {
        if (this.f802u == z) {
            this.f802u = !z;
            mo384m(mo357F());
            mo356l();
        }
    }

    /* JADX INFO: renamed from: s */
    public void mo388s() {
        List<Preference> list;
        PreferenceScreen preferenceScreen;
        String str = this.f800s;
        if (str != null) {
            C0532j c0532j = this.f784c;
            Preference preferenceM393H = null;
            if (c0532j != null && (preferenceScreen = c0532j.f3281g) != null) {
                preferenceM393H = preferenceScreen.m393H(str);
            }
            if (preferenceM393H == null || (list = preferenceM393H.f777H) == null) {
                return;
            }
            list.remove(this);
        }
    }

    /* JADX INFO: renamed from: t */
    public Object mo359t(TypedArray typedArray, int i) {
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.f789h;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence charSequenceMo368i = mo368i();
        if (!TextUtils.isEmpty(charSequenceMo368i)) {
            sb.append(charSequenceMo368i);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    @Deprecated
    /* JADX INFO: renamed from: u */
    public void mo389u(C0429b c0429b) {
    }

    /* JADX INFO: renamed from: v */
    public void m390v(boolean z) {
        if (this.f803v == z) {
            this.f803v = !z;
            mo384m(mo357F());
            mo356l();
        }
    }

    /* JADX INFO: renamed from: w */
    public void mo360w(Parcelable parcelable) {
        this.f779J = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    /* JADX INFO: renamed from: x */
    public Parcelable mo361x() {
        this.f779J = true;
        return AbsSavedState.EMPTY_STATE;
    }

    /* JADX INFO: renamed from: y */
    public void mo362y(Object obj) {
    }

    @Deprecated
    /* JADX INFO: renamed from: z */
    public void m391z(Object obj) {
        mo362y(obj);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0103 A[PHI: r6
      0x0103: PHI (r6v37 int) = (r6v36 int), (r6v49 int) binds: [B:18:0x00f8, B:21:0x0101] A[DONT_GENERATE, DONT_INLINE]] */
    public Preference(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f788g = Integer.MAX_VALUE;
        this.f797p = true;
        this.f798q = true;
        this.f799r = true;
        this.f802u = true;
        this.f803v = true;
        this.f804w = true;
        this.f805x = true;
        this.f806y = true;
        this.f770A = true;
        this.f773D = true;
        this.f774E = R.layout.d5;
        this.f782M = new ViewOnClickListenerC0102a();
        this.f783b = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0536n.f3298g, i, i2);
        this.f791j = C0369g.m1479f(typedArrayObtainStyledAttributes, 23, 0, 0);
        String string = typedArrayObtainStyledAttributes.getString(26);
        this.f793l = string == null ? typedArrayObtainStyledAttributes.getString(6) : string;
        CharSequence text = typedArrayObtainStyledAttributes.getText(34);
        this.f789h = text == null ? typedArrayObtainStyledAttributes.getText(4) : text;
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(33);
        this.f790i = text2 == null ? typedArrayObtainStyledAttributes.getText(7) : text2;
        this.f788g = typedArrayObtainStyledAttributes.getInt(28, typedArrayObtainStyledAttributes.getInt(8, Integer.MAX_VALUE));
        String string2 = typedArrayObtainStyledAttributes.getString(22);
        this.f795n = string2 == null ? typedArrayObtainStyledAttributes.getString(13) : string2;
        this.f774E = typedArrayObtainStyledAttributes.getResourceId(27, typedArrayObtainStyledAttributes.getResourceId(3, R.layout.d5));
        this.f775F = typedArrayObtainStyledAttributes.getResourceId(35, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        this.f797p = typedArrayObtainStyledAttributes.getBoolean(21, typedArrayObtainStyledAttributes.getBoolean(2, true));
        this.f798q = typedArrayObtainStyledAttributes.getBoolean(30, typedArrayObtainStyledAttributes.getBoolean(5, true));
        this.f799r = typedArrayObtainStyledAttributes.getBoolean(29, typedArrayObtainStyledAttributes.getBoolean(1, true));
        String string3 = typedArrayObtainStyledAttributes.getString(19);
        this.f800s = string3 == null ? typedArrayObtainStyledAttributes.getString(10) : string3;
        this.f805x = typedArrayObtainStyledAttributes.getBoolean(16, typedArrayObtainStyledAttributes.getBoolean(16, this.f798q));
        this.f806y = typedArrayObtainStyledAttributes.getBoolean(17, typedArrayObtainStyledAttributes.getBoolean(17, this.f798q));
        int i3 = 18;
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            this.f801t = mo359t(typedArrayObtainStyledAttributes, i3);
        } else {
            i3 = 11;
            if (typedArrayObtainStyledAttributes.hasValue(11)) {
                this.f801t = mo359t(typedArrayObtainStyledAttributes, i3);
            }
        }
        this.f773D = typedArrayObtainStyledAttributes.getBoolean(31, typedArrayObtainStyledAttributes.getBoolean(12, true));
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(32);
        this.f807z = zHasValue;
        if (zHasValue) {
            this.f770A = typedArrayObtainStyledAttributes.getBoolean(32, typedArrayObtainStyledAttributes.getBoolean(14, true));
        }
        this.f771B = typedArrayObtainStyledAttributes.getBoolean(24, typedArrayObtainStyledAttributes.getBoolean(15, false));
        this.f804w = typedArrayObtainStyledAttributes.getBoolean(25, typedArrayObtainStyledAttributes.getBoolean(25, true));
        this.f772C = typedArrayObtainStyledAttributes.getBoolean(20, typedArrayObtainStyledAttributes.getBoolean(20, false));
        typedArrayObtainStyledAttributes.recycle();
    }
}
