package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import com.didjdk.adbhelper.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p006b.p008b.C0183a;
import p006b.p008b.C0184b;
import p006b.p008b.p016h.InterfaceC0216b;
import p006b.p008b.p018i.C0251d;
import p006b.p008b.p018i.C0253d1;
import p006b.p008b.p018i.C0264i0;
import p006b.p008b.p018i.C0294x0;
import p006b.p008b.p018i.ViewOnClickListenerC0282r0;
import p006b.p032h.p044j.C0418m;
import p006b.p047i.p048a.AbstractC0439a;
import p006b.p049j.p050a.AbstractC0442a;
import c.a.a.a.a;
import c.c.a.v3.i0.r;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends C0264i0 implements InterfaceC0216b {

    /* JADX INFO: renamed from: r0 */
    public static final C0049k f253r0 = new C0049k();

    /* JADX INFO: renamed from: A */
    public Rect f254A;

    /* JADX INFO: renamed from: B */
    public Rect f255B;

    /* JADX INFO: renamed from: C */
    public int[] f256C;

    /* JADX INFO: renamed from: D */
    public int[] f257D;

    /* JADX INFO: renamed from: E */
    public final ImageView f258E;

    /* JADX INFO: renamed from: F */
    public final Drawable f259F;

    /* JADX INFO: renamed from: G */
    public final int f260G;

    /* JADX INFO: renamed from: H */
    public final int f261H;

    /* JADX INFO: renamed from: I */
    public final Intent f262I;

    /* JADX INFO: renamed from: J */
    public final Intent f263J;

    /* JADX INFO: renamed from: K */
    public final CharSequence f264K;

    /* JADX INFO: renamed from: L */
    public InterfaceC0051m f265L;

    /* JADX INFO: renamed from: M */
    public InterfaceC0050l f266M;

    /* JADX INFO: renamed from: N */
    public View.OnFocusChangeListener f267N;

    /* JADX INFO: renamed from: O */
    public InterfaceC0052n f268O;

    /* JADX INFO: renamed from: P */
    public View.OnClickListener f269P;

    /* JADX INFO: renamed from: Q */
    public boolean f270Q;

    /* JADX INFO: renamed from: R */
    public boolean f271R;

    /* JADX INFO: renamed from: S */
    public AbstractC0439a f272S;

    /* JADX INFO: renamed from: T */
    public boolean f273T;

    /* JADX INFO: renamed from: U */
    public CharSequence f274U;

    /* JADX INFO: renamed from: V */
    public boolean f275V;

    /* JADX INFO: renamed from: W */
    public boolean f276W;

    /* JADX INFO: renamed from: a0 */
    public int f277a0;

    /* JADX INFO: renamed from: b0 */
    public boolean f278b0;

    /* JADX INFO: renamed from: c0 */
    public CharSequence f279c0;

    /* JADX INFO: renamed from: d0 */
    public CharSequence f280d0;

    /* JADX INFO: renamed from: e0 */
    public boolean f281e0;

    /* JADX INFO: renamed from: f0 */
    public int f282f0;

    /* JADX INFO: renamed from: g0 */
    public SearchableInfo f283g0;

    /* JADX INFO: renamed from: h0 */
    public Bundle f284h0;

    /* JADX INFO: renamed from: i0 */
    public final Runnable f285i0;

    /* JADX INFO: renamed from: j0 */
    public Runnable f286j0;

    /* JADX INFO: renamed from: k0 */
    public final WeakHashMap<String, Drawable.ConstantState> f287k0;

    /* JADX INFO: renamed from: l0 */
    public final View.OnClickListener f288l0;

    /* JADX INFO: renamed from: m0 */
    public View.OnKeyListener f289m0;

    /* JADX INFO: renamed from: n0 */
    public final TextView.OnEditorActionListener f290n0;

    /* JADX INFO: renamed from: o0 */
    public final AdapterView.OnItemClickListener f291o0;

    /* JADX INFO: renamed from: p0 */
    public final AdapterView.OnItemSelectedListener f292p0;

    /* JADX INFO: renamed from: q */
    public final SearchAutoComplete f293q;

    /* JADX INFO: renamed from: q0 */
    public TextWatcher f294q0;

    /* JADX INFO: renamed from: r */
    public final View f295r;

    /* JADX INFO: renamed from: s */
    public final View f296s;

    /* JADX INFO: renamed from: t */
    public final View f297t;

    /* JADX INFO: renamed from: u */
    public final ImageView f298u;

    /* JADX INFO: renamed from: v */
    public final ImageView f299v;

    /* JADX INFO: renamed from: w */
    public final ImageView f300w;

    /* JADX INFO: renamed from: x */
    public final ImageView f301x;

    /* JADX INFO: renamed from: y */
    public final View f302y;

    /* JADX INFO: renamed from: z */
    public C0054p f303z;

    public static class SearchAutoComplete extends C0251d {

        /* JADX INFO: renamed from: e */
        public int f304e;

        /* JADX INFO: renamed from: f */
        public SearchView f305f;

        /* JADX INFO: renamed from: g */
        public boolean f306g;

        /* JADX INFO: renamed from: h */
        public final Runnable f307h;

        /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$SearchAutoComplete$a */
        public class RunnableC0038a implements Runnable {
            public RunnableC0038a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                if (searchAutoComplete.f306g) {
                    ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                    searchAutoComplete.f306g = false;
                }
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet, R.attr.an);
            this.f307h = new RunnableC0038a();
            this.f304e = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                return (i < 640 || i2 < 480) ? 160 : 192;
            }
            return 192;
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f304e <= 0 || super.enoughToFilter();
        }

        @Override // p006b.p008b.p018i.C0251d, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f306g) {
                removeCallbacks(this.f307h);
                post(this.f307h);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            SearchView searchView = this.f305f;
            searchView.m74G(searchView.f271R);
            searchView.post(searchView.f285i0);
            if (searchView.f293q.hasFocus()) {
                searchView.m80s();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f305f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z) {
            Method method;
            super.onWindowFocusChanged(z);
            if (z && this.f305f.hasFocus() && getVisibility() == 0) {
                this.f306g = true;
                Context context = getContext();
                C0049k c0049k = SearchView.f253r0;
                if (!(context.getResources().getConfiguration().orientation == 2) || (method = SearchView.f253r0.f321c) == null) {
                    return;
                }
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f306g = false;
                removeCallbacks(this.f307h);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f306g = true;
                    return;
                }
                this.f306g = false;
                removeCallbacks(this.f307h);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f305f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f304e = i;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$a */
    public class C0039a implements TextWatcher {
        public C0039a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView searchView = SearchView.this;
            Editable text = searchView.f293q.getText();
            searchView.f280d0 = text;
            boolean z = !TextUtils.isEmpty(text);
            searchView.m73F(z);
            searchView.m75H(!z);
            searchView.m69B();
            searchView.m72E();
            if (searchView.f265L != null && !TextUtils.equals(charSequence, searchView.f279c0)) {
                r.this.m2656L0(charSequence.toString());
            }
            searchView.f279c0 = charSequence.toString();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$b */
    public class RunnableC0040b implements Runnable {
        public RunnableC0040b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.m70C();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$c */
    public class RunnableC0041c implements Runnable {
        public RunnableC0041c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0439a abstractC0439a = SearchView.this.f272S;
            if (abstractC0439a instanceof ViewOnClickListenerC0282r0) {
                abstractC0439a.mo1123b(null);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$d */
    public class ViewOnFocusChangeListenerC0042d implements View.OnFocusChangeListener {
        public ViewOnFocusChangeListenerC0042d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f267N;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$e */
    public class ViewOnLayoutChangeListenerC0043e implements View.OnLayoutChangeListener {
        public ViewOnLayoutChangeListenerC0043e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int dimensionPixelSize;
            SearchView searchView = SearchView.this;
            if (searchView.f302y.getWidth() > 1) {
                Resources resources = searchView.getContext().getResources();
                int paddingLeft = searchView.f296s.getPaddingLeft();
                Rect rect = new Rect();
                boolean zM1050b = C0253d1.m1050b(searchView);
                if (searchView.f270Q) {
                    dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.af) + resources.getDimensionPixelSize(R.dimen.ae);
                } else {
                    dimensionPixelSize = 0;
                }
                searchView.f293q.getDropDownBackground().getPadding(rect);
                searchView.f293q.setDropDownHorizontalOffset(zM1050b ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                searchView.f293q.setDropDownWidth((((searchView.f302y.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$f */
    public class ViewOnClickListenerC0044f implements View.OnClickListener {
        public ViewOnClickListenerC0044f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f298u) {
                searchView.m86y();
                return;
            }
            if (view == searchView.f300w) {
                searchView.m82u();
                return;
            }
            if (view == searchView.f299v) {
                searchView.m87z();
                return;
            }
            if (view != searchView.f301x) {
                if (view == searchView.f293q) {
                    searchView.m80s();
                    return;
                }
                return;
            }
            SearchableInfo searchableInfo = searchView.f283g0;
            if (searchableInfo == null) {
                return;
            }
            try {
                if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                        searchView.getContext().startActivity(searchView.m79r(searchView.f263J, searchableInfo));
                    }
                } else {
                    Intent intent = new Intent(searchView.f262I);
                    ComponentName searchActivity = searchableInfo.getSearchActivity();
                    intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                    searchView.getContext().startActivity(intent);
                }
            } catch (ActivityNotFoundException unused) {
                Log.w("SearchView", "Could not find voice search activity");
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$g */
    public class ViewOnKeyListenerC0045g implements View.OnKeyListener {
        public ViewOnKeyListenerC0045g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f283g0 == null) {
                return false;
            }
            if (searchView.f293q.isPopupShowing() && SearchView.this.f293q.getListSelection() != -1) {
                return SearchView.this.m68A(i, keyEvent);
            }
            if ((TextUtils.getTrimmedLength(SearchView.this.f293q.getText()) == 0) || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.m81t(0, null, searchView2.f293q.getText().toString());
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$h */
    public class C0046h implements TextView.OnEditorActionListener {
        public C0046h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.m87z();
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$i */
    public class C0047i implements AdapterView.OnItemClickListener {
        public C0047i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.m83v(i);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$j */
    public class C0048j implements AdapterView.OnItemSelectedListener {
        public C0048j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.m84w(i);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$k */
    public static class C0049k {

        /* JADX INFO: renamed from: a */
        public Method f319a;

        /* JADX INFO: renamed from: b */
        public Method f320b;

        /* JADX INFO: renamed from: c */
        public Method f321c;

        public C0049k() {
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f319a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f320b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f321c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$l */
    public interface InterfaceC0050l {
        /* JADX INFO: renamed from: a */
        boolean m88a();
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$m */
    public interface InterfaceC0051m {
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$n */
    public interface InterfaceC0052n {
        /* JADX INFO: renamed from: a */
        boolean m89a(int i);

        /* JADX INFO: renamed from: b */
        boolean m90b(int i);
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$o */
    public static class C0053o extends AbstractC0442a {
        public static final Parcelable.Creator<C0053o> CREATOR = new a();

        /* JADX INFO: renamed from: d */
        public boolean f322d;

        /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$o$a */
        public static class a implements Parcelable.ClassLoaderCreator<C0053o> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new C0053o(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new C0053o[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public C0053o createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0053o(parcel, classLoader);
            }
        }

        public C0053o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f322d = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public C0053o(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sbM2191e = a.m2191e("SearchView.SavedState{");
            sbM2191e.append(Integer.toHexString(System.identityHashCode(this)));
            sbM2191e.append(" isIconified=");
            sbM2191e.append(this.f322d);
            sbM2191e.append("}");
            return sbM2191e.toString();
        }

        @Override // p006b.p049j.p050a.AbstractC0442a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f2812b, i);
            parcel.writeValue(Boolean.valueOf(this.f322d));
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$p */
    public static class C0054p extends TouchDelegate {

        /* JADX INFO: renamed from: a */
        public final View f323a;

        /* JADX INFO: renamed from: b */
        public final Rect f324b;

        /* JADX INFO: renamed from: c */
        public final Rect f325c;

        /* JADX INFO: renamed from: d */
        public final Rect f326d;

        /* JADX INFO: renamed from: e */
        public final int f327e;

        /* JADX INFO: renamed from: f */
        public boolean f328f;

        public C0054p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f327e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f324b = new Rect();
            this.f326d = new Rect();
            this.f325c = new Rect();
            m91a(rect, rect2);
            this.f323a = view;
        }

        /* JADX INFO: renamed from: a */
        public void m91a(Rect rect, Rect rect2) {
            this.f324b.set(rect);
            this.f326d.set(rect);
            Rect rect3 = this.f326d;
            int i = this.f327e;
            rect3.inset(-i, -i);
            this.f325c.set(rect2);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x003d  */
        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            float width;
            int height;
            boolean z2;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z3 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z2 = this.f328f;
                    if (z2 && !this.f326d.contains(x, y)) {
                        z3 = z2;
                        z = false;
                    }
                } else if (action != 3) {
                    z = true;
                    z3 = false;
                } else {
                    z2 = this.f328f;
                    this.f328f = false;
                }
                z3 = z2;
                z = true;
            } else if (this.f324b.contains(x, y)) {
                this.f328f = true;
                z = true;
            } else {
                z = true;
                z3 = false;
            }
            if (!z3) {
                return false;
            }
            if (!z || this.f325c.contains(x, y)) {
                Rect rect = this.f325c;
                width = x - rect.left;
                height = y - rect.top;
            } else {
                width = this.f323a.getWidth() / 2;
                height = this.f323a.getHeight() / 2;
            }
            motionEvent.setLocation(width, height);
            return this.f323a.dispatchTouchEvent(motionEvent);
        }
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.o_);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f254A = new Rect();
        this.f255B = new Rect();
        this.f256C = new int[2];
        this.f257D = new int[2];
        this.f285i0 = new RunnableC0040b();
        this.f286j0 = new RunnableC0041c();
        this.f287k0 = new WeakHashMap<>();
        ViewOnClickListenerC0044f viewOnClickListenerC0044f = new ViewOnClickListenerC0044f();
        this.f288l0 = viewOnClickListenerC0044f;
        this.f289m0 = new ViewOnKeyListenerC0045g();
        C0046h c0046h = new C0046h();
        this.f290n0 = c0046h;
        C0047i c0047i = new C0047i();
        this.f291o0 = c0047i;
        C0048j c0048j = new C0048j();
        this.f292p0 = c0048j;
        this.f294q0 = new C0039a();
        C0294x0 c0294x0 = new C0294x0(context, context.obtainStyledAttributes(attributeSet, C0184b.f1220u, i, 0));
        LayoutInflater.from(context).inflate(c0294x0.m1164l(9, R.layout.z), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.mn);
        this.f293q = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f295r = findViewById(R.id.mj);
        View viewFindViewById = findViewById(R.id.mm);
        this.f296s = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.nm);
        this.f297t = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.mh);
        this.f298u = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.mk);
        this.f299v = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.mi);
        this.f300w = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.mo);
        this.f301x = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.ml);
        this.f258E = imageView5;
        Drawable drawableM1159g = c0294x0.m1159g(10);
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        viewFindViewById.setBackground(drawableM1159g);
        viewFindViewById2.setBackground(c0294x0.m1159g(14));
        imageView.setImageDrawable(c0294x0.m1159g(13));
        imageView2.setImageDrawable(c0294x0.m1159g(7));
        imageView3.setImageDrawable(c0294x0.m1159g(4));
        imageView4.setImageDrawable(c0294x0.m1159g(16));
        imageView5.setImageDrawable(c0294x0.m1159g(13));
        this.f259F = c0294x0.m1159g(12);
        C0183a.m756c(imageView, getResources().getString(R.string.v));
        this.f260G = c0294x0.m1164l(15, R.layout.y);
        this.f261H = c0294x0.m1164l(5, 0);
        imageView.setOnClickListener(viewOnClickListenerC0044f);
        imageView3.setOnClickListener(viewOnClickListenerC0044f);
        imageView2.setOnClickListener(viewOnClickListenerC0044f);
        imageView4.setOnClickListener(viewOnClickListenerC0044f);
        searchAutoComplete.setOnClickListener(viewOnClickListenerC0044f);
        searchAutoComplete.addTextChangedListener(this.f294q0);
        searchAutoComplete.setOnEditorActionListener(c0046h);
        searchAutoComplete.setOnItemClickListener(c0047i);
        searchAutoComplete.setOnItemSelectedListener(c0048j);
        searchAutoComplete.setOnKeyListener(this.f289m0);
        searchAutoComplete.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0042d());
        setIconifiedByDefault(c0294x0.m1153a(8, true));
        int iM1158f = c0294x0.m1158f(1, -1);
        if (iM1158f != -1) {
            setMaxWidth(iM1158f);
        }
        this.f264K = c0294x0.m1166n(6);
        this.f274U = c0294x0.m1166n(11);
        int iM1162j = c0294x0.m1162j(3, -1);
        if (iM1162j != -1) {
            setImeOptions(iM1162j);
        }
        int iM1162j2 = c0294x0.m1162j(2, -1);
        if (iM1162j2 != -1) {
            setInputType(iM1162j2);
        }
        setFocusable(c0294x0.m1153a(0, true));
        c0294x0.f2052b.recycle();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f262I = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f263J = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f302y = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0043e());
        }
        m74G(this.f270Q);
        m71D();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.ar);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.as);
    }

    private void setQuery(CharSequence charSequence) {
        this.f293q.setText(charSequence);
        this.f293q.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* JADX INFO: renamed from: A */
    public boolean m68A(int i, KeyEvent keyEvent) {
        if (this.f283g0 != null && this.f272S != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i == 66 || i == 84 || i == 61) {
                return m83v(this.f293q.getListSelection());
            }
            if (i == 21 || i == 22) {
                this.f293q.setSelection(i == 21 ? 0 : this.f293q.length());
                this.f293q.setListSelection(0);
                this.f293q.clearListSelection();
                C0049k c0049k = f253r0;
                SearchAutoComplete searchAutoComplete = this.f293q;
                Method method = c0049k.f321c;
                if (method != null) {
                    try {
                        method.invoke(searchAutoComplete, Boolean.TRUE);
                    } catch (Exception unused) {
                    }
                }
                return true;
            }
            if (i != 19 || this.f293q.getListSelection() == 0) {
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: B */
    public final void m69B() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f293q.getText());
        if (!z2 && (!this.f270Q || this.f281e0)) {
            z = false;
        }
        this.f300w.setVisibility(z ? 0 : 8);
        Drawable drawable = this.f300w.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    /* JADX INFO: renamed from: C */
    public void m70C() {
        int[] iArr = this.f293q.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f296s.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f297t.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
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
    /* JADX INFO: renamed from: D */
    public final void m71D() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f293q;
        CharSequence charSequence = queryHint;
        if (queryHint == null) {
            charSequence = "";
        }
        CharSequence charSequence2 = charSequence;
        if (this.f270Q && this.f259F != null) {
            charSequence2 = charSequence;
            double textSize = searchAutoComplete.getTextSize();
            Double.isNaN(textSize);
            Double.isNaN(textSize);
            int i = (int) (textSize * 1.25d);
            this.f259F.setBounds(0, 0, i, i);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(this.f259F), 1, 2, 33);
            spannableStringBuilder.append(charSequence);
            charSequence2 = spannableStringBuilder;
        }
        charSequence2 = charSequence;
        searchAutoComplete.setHint(charSequence2);
    }

    /* JADX INFO: renamed from: E */
    public final void m72E() {
        int i = 0;
        if (!((this.f273T || this.f278b0) && !this.f271R) || (this.f299v.getVisibility() != 0 && this.f301x.getVisibility() != 0)) {
            i = 8;
        }
        this.f297t.setVisibility(i);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0021  */
    /* JADX INFO: renamed from: F */
    public final void m73F(boolean z) {
        boolean z2 = this.f273T;
        int i = 0;
        if (z2) {
            if (!((z2 || this.f278b0) && !this.f271R) || !hasFocus() || (!z && this.f278b0)) {
                i = 8;
            }
        } else {
            i = 8;
        }
        this.f299v.setVisibility(i);
    }

    /* JADX INFO: renamed from: G */
    public final void m74G(boolean z) {
        this.f271R = z;
        int i = z ? 0 : 8;
        boolean z2 = !TextUtils.isEmpty(this.f293q.getText());
        this.f298u.setVisibility(i);
        m73F(z2);
        this.f295r.setVisibility(z ? 8 : 0);
        this.f258E.setVisibility((this.f258E.getDrawable() == null || this.f270Q) ? 8 : 0);
        m69B();
        m75H(!z2);
        m72E();
    }

    /* JADX INFO: renamed from: H */
    public final void m75H(boolean z) {
        int i = 8;
        if (this.f278b0 && !this.f271R && z) {
            this.f299v.setVisibility(8);
            i = 0;
        }
        this.f301x.setVisibility(i);
    }

    @Override // p006b.p008b.p016h.InterfaceC0216b
    /* JADX INFO: renamed from: c */
    public void mo76c() {
        if (this.f281e0) {
            return;
        }
        this.f281e0 = true;
        int imeOptions = this.f293q.getImeOptions();
        this.f282f0 = imeOptions;
        this.f293q.setImeOptions(imeOptions | 33554432);
        this.f293q.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f276W = true;
        super.clearFocus();
        this.f293q.clearFocus();
        this.f293q.setImeVisibility(false);
        this.f276W = false;
    }

    @Override // p006b.p008b.p016h.InterfaceC0216b
    /* JADX INFO: renamed from: e */
    public void mo77e() {
        this.f293q.setText("");
        SearchAutoComplete searchAutoComplete = this.f293q;
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f280d0 = "";
        clearFocus();
        m74G(true);
        this.f293q.setImeOptions(this.f282f0);
        this.f281e0 = false;
    }

    public int getImeOptions() {
        return this.f293q.getImeOptions();
    }

    public int getInputType() {
        return this.f293q.getInputType();
    }

    public int getMaxWidth() {
        return this.f277a0;
    }

    public CharSequence getQuery() {
        return this.f293q.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f274U;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f283g0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f264K : getContext().getText(this.f283g0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f261H;
    }

    public int getSuggestionRowLayout() {
        return this.f260G;
    }

    public AbstractC0439a getSuggestionsAdapter() {
        return this.f272S;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f285i0);
        post(this.f286j0);
        super.onDetachedFromWindow();
    }

    @Override // p006b.p008b.p018i.C0264i0, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.f293q;
            Rect rect = this.f254A;
            searchAutoComplete.getLocationInWindow(this.f256C);
            getLocationInWindow(this.f257D);
            int[] iArr = this.f256C;
            int i5 = iArr[1];
            int[] iArr2 = this.f257D;
            int i6 = i5 - iArr2[1];
            int i7 = iArr[0] - iArr2[0];
            rect.set(i7, i6, searchAutoComplete.getWidth() + i7, searchAutoComplete.getHeight() + i6);
            Rect rect2 = this.f255B;
            Rect rect3 = this.f254A;
            rect2.set(rect3.left, 0, rect3.right, i4 - i2);
            C0054p c0054p = this.f303z;
            if (c0054p != null) {
                c0054p.m91a(this.f255B, this.f254A);
                return;
            }
            C0054p c0054p2 = new C0054p(this.f255B, this.f254A, this.f293q);
            this.f303z = c0054p2;
            setTouchDelegate(c0054p2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0041 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0044  */
    /* JADX WARN: Code duplicated, block: B:28:0x0049  */
    @Override // p006b.p008b.p018i.C0264i0, android.view.View
    public void onMeasure(int i, int i2) {
        int preferredWidth;
        int mode;
        int size;
        if (this.f271R) {
            super.onMeasure(i, i2);
            return;
        }
        int mode2 = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                size2 = this.f277a0;
                if (size2 <= 0) {
                    size2 = getPreferredWidth();
                }
            } else if (mode2 == 1073741824 && (preferredWidth = this.f277a0) > 0) {
            }
            mode = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
            if (mode != Integer.MIN_VALUE) {
                size = Math.min(getPreferredHeight(), size);
            } else if (mode == 0) {
                size = getPreferredHeight();
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size2, 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        }
        preferredWidth = this.f277a0;
        if (preferredWidth <= 0) {
            preferredWidth = getPreferredWidth();
        }
        size2 = Math.min(preferredWidth, size2);
        mode = View.MeasureSpec.getMode(i2);
        size = View.MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE) {
            size = Math.min(getPreferredHeight(), size);
        } else if (mode == 0) {
            size = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size2, 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0053o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0053o c0053o = (C0053o) parcelable;
        super.onRestoreInstanceState(c0053o.f2812b);
        m74G(c0053o.f322d);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C0053o c0053o = new C0053o(super.onSaveInstanceState());
        c0053o.f322d = this.f271R;
        return c0053o;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.f285i0);
    }

    /* JADX INFO: renamed from: q */
    public final Intent m78q(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f280d0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f284h0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f283g0.getSearchActivity());
        return intent;
    }

    /* JADX INFO: renamed from: r */
    public final Intent m79r(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f284h0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i, Rect rect) {
        if (this.f276W || !isFocusable()) {
            return false;
        }
        if (this.f271R) {
            return super.requestFocus(i, rect);
        }
        boolean zRequestFocus = this.f293q.requestFocus(i, rect);
        if (zRequestFocus) {
            m74G(false);
        }
        return zRequestFocus;
    }

    /* JADX INFO: renamed from: s */
    public void m80s() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f293q.refreshAutoCompleteResults();
            return;
        }
        C0049k c0049k = f253r0;
        SearchAutoComplete searchAutoComplete = this.f293q;
        Method method = c0049k.f319a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        C0049k c0049k2 = f253r0;
        SearchAutoComplete searchAutoComplete2 = this.f293q;
        Method method2 = c0049k2.f320b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete2, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public void setAppSearchData(Bundle bundle) {
        this.f284h0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            m82u();
        } else {
            m86y();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f270Q == z) {
            return;
        }
        this.f270Q = z;
        m74G(z);
        m71D();
    }

    public void setImeOptions(int i) {
        this.f293q.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f293q.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f277a0 = i;
        requestLayout();
    }

    public void setOnCloseListener(InterfaceC0050l interfaceC0050l) {
        this.f266M = interfaceC0050l;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f267N = onFocusChangeListener;
    }

    public void setOnQueryTextListener(InterfaceC0051m interfaceC0051m) {
        this.f265L = interfaceC0051m;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f269P = onClickListener;
    }

    public void setOnSuggestionListener(InterfaceC0052n interfaceC0052n) {
        this.f268O = interfaceC0052n;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f274U = charSequence;
        m71D();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f275V = z;
        AbstractC0439a abstractC0439a = this.f272S;
        if (abstractC0439a instanceof ViewOnClickListenerC0282r0) {
            ((ViewOnClickListenerC0282r0) abstractC0439a).f1984r = z ? 2 : 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009f  */
    public void setSearchableInfo(SearchableInfo searchableInfo) {
        boolean z;
        this.f283g0 = searchableInfo;
        Intent intent = null;
        if (searchableInfo != null) {
            this.f293q.setThreshold(searchableInfo.getSuggestThreshold());
            this.f293q.setImeOptions(this.f283g0.getImeOptions());
            int inputType = this.f283g0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.f283g0.getSuggestAuthority() != null) {
                    inputType = inputType | 65536 | 524288;
                }
            }
            this.f293q.setInputType(inputType);
            AbstractC0439a abstractC0439a = this.f272S;
            if (abstractC0439a != null) {
                abstractC0439a.mo1123b(null);
            }
            if (this.f283g0.getSuggestAuthority() != null) {
                ViewOnClickListenerC0282r0 viewOnClickListenerC0282r0 = new ViewOnClickListenerC0282r0(getContext(), this, this.f283g0, this.f287k0);
                this.f272S = viewOnClickListenerC0282r0;
                this.f293q.setAdapter(viewOnClickListenerC0282r0);
                ((ViewOnClickListenerC0282r0) this.f272S).f1984r = this.f275V ? 2 : 1;
            }
            m71D();
        }
        SearchableInfo searchableInfo2 = this.f283g0;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.f283g0.getVoiceSearchLaunchWebSearch()) {
                intent = this.f262I;
            } else if (this.f283g0.getVoiceSearchLaunchRecognizer()) {
                intent = this.f263J;
            }
            z = (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
        }
        this.f278b0 = z;
        if (z) {
            this.f293q.setPrivateImeOptions("nm");
        }
        m74G(this.f271R);
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f273T = z;
        m74G(this.f271R);
    }

    public void setSuggestionsAdapter(AbstractC0439a abstractC0439a) {
        this.f272S = abstractC0439a;
        this.f293q.setAdapter(abstractC0439a);
    }

    /* JADX INFO: renamed from: t */
    public void m81t(int i, String str, String str2) {
        getContext().startActivity(m78q("android.intent.action.SEARCH", null, null, str2, i, null));
    }

    /* JADX INFO: renamed from: u */
    public void m82u() {
        if (!TextUtils.isEmpty(this.f293q.getText())) {
            this.f293q.setText("");
            this.f293q.requestFocus();
            this.f293q.setImeVisibility(true);
        } else if (this.f270Q) {
            InterfaceC0050l interfaceC0050l = this.f266M;
            if (interfaceC0050l == null || !interfaceC0050l.m88a()) {
                clearFocus();
                m74G(true);
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public boolean m83v(int i) {
        int position;
        String strM1121h;
        InterfaceC0052n interfaceC0052n = this.f268O;
        if (interfaceC0052n != null && interfaceC0052n.m90b(i)) {
            return false;
        }
        Cursor cursor = this.f272S.f2799d;
        if (cursor != null && cursor.moveToPosition(i)) {
            Intent intentM78q = null;
            try {
                int i2 = ViewOnClickListenerC0282r0.f1978z;
                String strM1121h2 = ViewOnClickListenerC0282r0.m1121h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (strM1121h2 == null) {
                    strM1121h2 = this.f283g0.getSuggestIntentAction();
                }
                if (strM1121h2 == null) {
                    strM1121h2 = "android.intent.action.SEARCH";
                }
                String str = strM1121h2;
                String strM1121h3 = ViewOnClickListenerC0282r0.m1121h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (strM1121h3 == null) {
                    strM1121h3 = this.f283g0.getSuggestIntentData();
                }
                if (strM1121h3 != null && (strM1121h = ViewOnClickListenerC0282r0.m1121h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    strM1121h3 = strM1121h3 + "/" + Uri.encode(strM1121h);
                }
                intentM78q = m78q(str, strM1121h3 == null ? null : Uri.parse(strM1121h3), ViewOnClickListenerC0282r0.m1121h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), ViewOnClickListenerC0282r0.m1121h(cursor, cursor.getColumnIndex("suggest_intent_query")), 0, null);
            } catch (RuntimeException e) {
                try {
                    position = cursor.getPosition();
                } catch (RuntimeException unused) {
                    position = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e);
            }
            if (intentM78q != null) {
                try {
                    getContext().startActivity(intentM78q);
                } catch (RuntimeException e2) {
                    Log.e("SearchView", "Failed launch activity: " + intentM78q, e2);
                }
            }
        }
        this.f293q.setImeVisibility(false);
        this.f293q.dismissDropDown();
        return true;
    }

    /* JADX INFO: renamed from: w */
    public boolean m84w(int i) {
        CharSequence charSequenceMo1124c;
        InterfaceC0052n interfaceC0052n = this.f268O;
        if (interfaceC0052n != null && interfaceC0052n.m89a(i)) {
            return false;
        }
        Editable text = this.f293q.getText();
        Cursor cursor = this.f272S.f2799d;
        if (cursor == null) {
            return true;
        }
        if (!cursor.moveToPosition(i) || (charSequenceMo1124c = this.f272S.mo1124c(cursor)) == null) {
            setQuery(text);
            return true;
        }
        setQuery(charSequenceMo1124c);
        return true;
    }

    /* JADX INFO: renamed from: x */
    public void m85x(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* JADX INFO: renamed from: y */
    public void m86y() {
        m74G(false);
        this.f293q.requestFocus();
        this.f293q.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f269P;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m87z() {
        Editable text = this.f293q.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        InterfaceC0051m interfaceC0051m = this.f265L;
        if (interfaceC0051m != null) {
            r.this.m2656L0(text.toString());
        }
        if (this.f283g0 != null) {
            m81t(0, null, text.toString());
        }
        this.f293q.setImeVisibility(false);
        this.f293q.dismissDropDown();
    }
}
