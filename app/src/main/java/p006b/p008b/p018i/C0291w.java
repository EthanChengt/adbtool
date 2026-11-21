package p006b.p008b.p018i;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.AlertController;
import java.util.Objects;
import java.util.WeakHashMap;
import p006b.p008b.C0184b;
import p006b.p008b.p009c.DialogInterfaceC0193i;
import p006b.p008b.p010d.p011a.C0208a;
import p006b.p008b.p016h.C0217c;
import p006b.p032h.p044j.C0418m;
import p006b.p032h.p044j.InterfaceC0417l;

/* JADX INFO: renamed from: b.b.i.w */
/* JADX INFO: loaded from: classes.dex */
public class C0291w extends Spinner implements InterfaceC0417l {

    /* JADX INFO: renamed from: j */
    public static final int[] f2022j = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: b */
    public final C0254e f2023b;

    /* JADX INFO: renamed from: c */
    public final Context f2024c;

    /* JADX INFO: renamed from: d */
    public AbstractViewOnTouchListenerC0262h0 f2025d;

    /* JADX INFO: renamed from: e */
    public SpinnerAdapter f2026e;

    /* JADX INFO: renamed from: f */
    public final boolean f2027f;

    /* JADX INFO: renamed from: g */
    public f f2028g;

    /* JADX INFO: renamed from: h */
    public int f2029h;

    /* JADX INFO: renamed from: i */
    public final Rect f2030i;

    /* JADX INFO: renamed from: b.b.i.w$a */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!C0291w.this.getInternalPopup().mo1139b()) {
                C0291w.this.m1137b();
            }
            ViewTreeObserver viewTreeObserver = C0291w.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* JADX INFO: renamed from: b.b.i.w$b */
    public class b implements f, DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b */
        public DialogInterfaceC0193i f2032b;

        /* JADX INFO: renamed from: c */
        public ListAdapter f2033c;

        /* JADX INFO: renamed from: d */
        public CharSequence f2034d;

        public b() {
        }

        @Override // p006b.p008b.p018i.C0291w.f
        /* JADX INFO: renamed from: a */
        public void mo1138a(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // p006b.p008b.p018i.C0291w.f
        /* JADX INFO: renamed from: b */
        public boolean mo1139b() {
            DialogInterfaceC0193i dialogInterfaceC0193i = this.f2032b;
            if (dialogInterfaceC0193i != null) {
                return dialogInterfaceC0193i.isShowing();
            }
            return false;
        }

        @Override // p006b.p008b.p018i.C0291w.f
        /* JADX INFO: renamed from: c */
        public int mo1140c() {
            return 0;
        }

        @Override // p006b.p008b.p018i.C0291w.f
        /* JADX INFO: renamed from: d */
        public void mo1141d(int i, int i2) {
            if (this.f2033c == null) {
                return;
            }
            DialogInterfaceC0193i.a aVar = new DialogInterfaceC0193i.a(C0291w.this.getPopupContext());
            CharSequence charSequence = this.f2034d;
            if (charSequence != null) {
                aVar.f1245a.f115d = charSequence;
            }
            ListAdapter listAdapter = this.f2033c;
            int selectedItemPosition = C0291w.this.getSelectedItemPosition();
            AlertController.C0020b c0020b = aVar.f1245a;
            c0020b.f124m = listAdapter;
            c0020b.f125n = this;
            c0020b.f130s = selectedItemPosition;
            c0020b.f129r = true;
            DialogInterfaceC0193i dialogInterfaceC0193iM779a = aVar.m779a();
            this.f2032b = dialogInterfaceC0193iM779a;
            ListView listView = dialogInterfaceC0193iM779a.f1244d.f89g;
            listView.setTextDirection(i);
            listView.setTextAlignment(i2);
            this.f2032b.show();
        }

        @Override // p006b.p008b.p018i.C0291w.f
        public void dismiss() {
            DialogInterfaceC0193i dialogInterfaceC0193i = this.f2032b;
            if (dialogInterfaceC0193i != null) {
                dialogInterfaceC0193i.dismiss();
                this.f2032b = null;
            }
        }

        @Override // p006b.p008b.p018i.C0291w.f
        /* JADX INFO: renamed from: g */
        public int mo1142g() {
            return 0;
        }

        @Override // p006b.p008b.p018i.C0291w.f
        /* JADX INFO: renamed from: i */
        public Drawable mo1143i() {
            return null;
        }

        @Override // p006b.p008b.p018i.C0291w.f
        /* JADX INFO: renamed from: j */
        public CharSequence mo1144j() {
            return this.f2034d;
        }

        @Override // p006b.p008b.p018i.C0291w.f
        /* JADX INFO: renamed from: l */
        public void mo1145l(CharSequence charSequence) {
            this.f2034d = charSequence;
        }

        @Override // p006b.p008b.p018i.C0291w.f
        /* JADX INFO: renamed from: m */
        public void mo1146m(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // p006b.p008b.p018i.C0291w.f
        /* JADX INFO: renamed from: n */
        public void mo1147n(int i) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // p006b.p008b.p018i.C0291w.f
        /* JADX INFO: renamed from: o */
        public void mo1095o(ListAdapter listAdapter) {
            this.f2033c = listAdapter;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            C0291w.this.setSelection(i);
            if (C0291w.this.getOnItemClickListener() != null) {
                C0291w.this.performItemClick(null, i, this.f2033c.getItemId(i));
            }
            DialogInterfaceC0193i dialogInterfaceC0193i = this.f2032b;
            if (dialogInterfaceC0193i != null) {
                dialogInterfaceC0193i.dismiss();
                this.f2032b = null;
            }
        }

        @Override // p006b.p008b.p018i.C0291w.f
        /* JADX INFO: renamed from: p */
        public void mo1148p(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }
    }

    /* JADX INFO: renamed from: b.b.i.w$c */
    public static class c implements ListAdapter, SpinnerAdapter {

        /* JADX INFO: renamed from: b */
        public SpinnerAdapter f2036b;

        /* JADX INFO: renamed from: c */
        public ListAdapter f2037c;

        public c(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f2036b = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f2037c = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                    ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                        themedSpinnerAdapter.setDropDownViewTheme(theme);
                        return;
                    }
                    return;
                }
                if (spinnerAdapter instanceof InterfaceC0286t0) {
                    InterfaceC0286t0 interfaceC0286t0 = (InterfaceC0286t0) spinnerAdapter;
                    if (interfaceC0286t0.getDropDownViewTheme() == null) {
                        interfaceC0286t0.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f2037c;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f2036b;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f2036b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f2036b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f2036b;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f2036b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f2036b;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f2037c;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f2036b;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f2036b;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* JADX INFO: renamed from: b.b.i.w$d */
    public class d extends C0268k0 implements f {

        /* JADX INFO: renamed from: E */
        public CharSequence f2038E;

        /* JADX INFO: renamed from: F */
        public ListAdapter f2039F;

        /* JADX INFO: renamed from: G */
        public final Rect f2040G;

        /* JADX INFO: renamed from: H */
        public int f2041H;

        /* JADX INFO: renamed from: b.b.i.w$d$a */
        public class a implements AdapterView.OnItemClickListener {
            public a(C0291w c0291w) {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C0291w.this.setSelection(i);
                if (C0291w.this.getOnItemClickListener() != null) {
                    d dVar = d.this;
                    C0291w.this.performItemClick(view, i, dVar.f2039F.getItemId(i));
                }
                d.this.dismiss();
            }
        }

        /* JADX INFO: renamed from: b.b.i.w$d$b */
        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                d dVar = d.this;
                C0291w c0291w = C0291w.this;
                Objects.requireNonNull(dVar);
                WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
                if (!(c0291w.isAttachedToWindow() && c0291w.getGlobalVisibleRect(dVar.f2040G))) {
                    d.this.dismiss();
                } else {
                    d.this.m1149t();
                    d.this.mo922f();
                }
            }
        }

        /* JADX INFO: renamed from: b.b.i.w$d$c */
        public class c implements PopupWindow.OnDismissListener {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f2045b;

            public c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f2045b = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = C0291w.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f2045b);
                }
            }
        }

        public d(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i, 0);
            this.f2040G = new Rect();
            this.f1914q = C0291w.this;
            m1098s(true);
            this.f1912o = 0;
            this.f1915r = new a(C0291w.this);
        }

        @Override // p006b.p008b.p018i.C0291w.f
        /* JADX INFO: renamed from: d */
        public void mo1141d(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            boolean zMo921b = mo921b();
            m1149t();
            this.f1898A.setInputMethodMode(2);
            mo922f();
            C0258f0 c0258f0 = this.f1901d;
            c0258f0.setChoiceMode(1);
            c0258f0.setTextDirection(i);
            c0258f0.setTextAlignment(i2);
            int selectedItemPosition = C0291w.this.getSelectedItemPosition();
            C0258f0 c0258f1 = this.f1901d;
            if (mo921b() && c0258f1 != null) {
                c0258f1.setListSelectionHidden(false);
                c0258f1.setSelection(selectedItemPosition);
                if (c0258f1.getChoiceMode() != 0) {
                    c0258f1.setItemChecked(selectedItemPosition, true);
                }
            }
            if (zMo921b || (viewTreeObserver = C0291w.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            this.f1898A.setOnDismissListener(new c(bVar));
        }

        @Override // p006b.p008b.p018i.C0291w.f
        /* JADX INFO: renamed from: j */
        public CharSequence mo1144j() {
            return this.f2038E;
        }

        @Override // p006b.p008b.p018i.C0291w.f
        /* JADX INFO: renamed from: l */
        public void mo1145l(CharSequence charSequence) {
            this.f2038E = charSequence;
        }

        @Override // p006b.p008b.p018i.C0268k0, p006b.p008b.p018i.C0291w.f
        /* JADX INFO: renamed from: o */
        public void mo1095o(ListAdapter listAdapter) {
            super.mo1095o(listAdapter);
            this.f2039F = listAdapter;
        }

        @Override // p006b.p008b.p018i.C0291w.f
        /* JADX INFO: renamed from: p */
        public void mo1148p(int i) {
            this.f2041H = i;
        }

        /* JADX WARN: Code duplicated, block: B:23:0x008d  */
        /* JADX WARN: Code duplicated, block: B:24:0x0096  */
        /* JADX INFO: renamed from: t */
        public void m1149t() {
            int iMax;
            int i;
            Drawable drawableM1092i = m1092i();
            int i2 = 0;
            if (drawableM1092i != null) {
                drawableM1092i.getPadding(C0291w.this.f2030i);
                i2 = C0253d1.m1050b(C0291w.this) ? C0291w.this.f2030i.right : -C0291w.this.f2030i.left;
            } else {
                Rect rect = C0291w.this.f2030i;
                rect.right = 0;
                rect.left = 0;
            }
            int paddingLeft = C0291w.this.getPaddingLeft();
            int paddingRight = C0291w.this.getPaddingRight();
            int width = C0291w.this.getWidth();
            C0291w c0291w = C0291w.this;
            int i3 = c0291w.f2029h;
            if (i3 != -2) {
                if (i3 == -1) {
                    iMax = (width - paddingLeft) - paddingRight;
                } else {
                    m1097r(i3);
                }
                if (C0253d1.m1050b(C0291w.this)) {
                    i = (((width - paddingRight) - this.f1903f) - this.f2041H) + i2;
                } else {
                    i = paddingLeft + this.f2041H + i2;
                }
                this.f1904g = i;
            }
            int iM1136a = c0291w.m1136a((SpinnerAdapter) this.f2039F, m1092i());
            int i4 = C0291w.this.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = C0291w.this.f2030i;
            int i5 = (i4 - rect2.left) - rect2.right;
            if (iM1136a > i5) {
                iM1136a = i5;
            }
            iMax = Math.max(iM1136a, (width - paddingLeft) - paddingRight);
            m1097r(iMax);
            if (C0253d1.m1050b(C0291w.this)) {
                i = (((width - paddingRight) - this.f1903f) - this.f2041H) + i2;
            } else {
                i = paddingLeft + this.f2041H + i2;
            }
            this.f1904g = i;
        }
    }

    /* JADX INFO: renamed from: b.b.i.w$e */
    public static class e extends View.BaseSavedState {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* JADX INFO: renamed from: b */
        public boolean f2047b;

        /* JADX INFO: renamed from: b.b.i.w$e$a */
        public static class a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public e[] newArray(int i) {
                return new e[i];
            }
        }

        public e(Parcel parcel) {
            super(parcel);
            this.f2047b = parcel.readByte() != 0;
        }

        public e(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f2047b ? (byte) 1 : (byte) 0);
        }
    }

    /* JADX INFO: renamed from: b.b.i.w$f */
    public interface f {
        /* JADX INFO: renamed from: a */
        void mo1138a(int i);

        /* JADX INFO: renamed from: b */
        boolean mo1139b();

        /* JADX INFO: renamed from: c */
        int mo1140c();

        /* JADX INFO: renamed from: d */
        void mo1141d(int i, int i2);

        void dismiss();

        /* JADX INFO: renamed from: g */
        int mo1142g();

        /* JADX INFO: renamed from: i */
        Drawable mo1143i();

        /* JADX INFO: renamed from: j */
        CharSequence mo1144j();

        /* JADX INFO: renamed from: l */
        void mo1145l(CharSequence charSequence);

        /* JADX INFO: renamed from: m */
        void mo1146m(Drawable drawable);

        /* JADX INFO: renamed from: n */
        void mo1147n(int i);

        /* JADX INFO: renamed from: o */
        void mo1095o(ListAdapter listAdapter);

        /* JADX INFO: renamed from: p */
        void mo1148p(int i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:25:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x005b  */
    /* JADX WARN: Code duplicated, block: B:28:0x008e  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c9  */
    public C0291w(Context context, AttributeSet attributeSet, int i) throws Throwable {
        Exception e2;
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, i);
        int[] iArr = C0184b.f1221v;
        this.f2030i = new Rect();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        this.f2023b = new C0254e(this);
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f2024c = new C0217c(context, resourceId);
        } else {
            this.f2024c = context;
        }
        TypedArray typedArray = null;
        int i2 = -1;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2022j, i, 0);
            try {
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(0)) {
                        i2 = typedArrayObtainStyledAttributes.getInt(0, 0);
                    }
                } catch (Exception e3) {
                    e2 = e3;
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e2);
                    if (typedArrayObtainStyledAttributes != null) {
                    }
                    if (i2 != 0) {
                        b bVar = new b();
                        this.f2028g = bVar;
                        bVar.mo1145l(typedArrayObtainStyledAttributes2.getString(2));
                    } else if (i2 == 1) {
                        d dVar = new d(this.f2024c, attributeSet, i);
                        C0294x0 c0294x0M1152q = C0294x0.m1152q(this.f2024c, attributeSet, iArr, i, 0);
                        this.f2029h = c0294x0M1152q.m1163k(3, -2);
                        dVar.f1898A.setBackgroundDrawable(c0294x0M1152q.m1159g(1));
                        dVar.f2038E = typedArrayObtainStyledAttributes2.getString(2);
                        c0294x0M1152q.f2052b.recycle();
                        this.f2028g = dVar;
                        this.f2025d = new C0289v(this, this, dVar);
                    }
                    textArray = typedArrayObtainStyledAttributes2.getTextArray(0);
                    if (textArray != null) {
                        ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
                        arrayAdapter.setDropDownViewResource(com.didjdk.adbhelper.R.layout.dn);
                        setAdapter((SpinnerAdapter) arrayAdapter);
                    }
                    typedArrayObtainStyledAttributes2.recycle();
                    this.f2027f = true;
                    spinnerAdapter = this.f2026e;
                    if (spinnerAdapter != null) {
                        setAdapter(spinnerAdapter);
                        this.f2026e = null;
                    }
                    this.f2023b.m1054d(attributeSet, i);
                }
            } catch (Throwable th) {
                th = th;
                typedArray = typedArrayObtainStyledAttributes;
                if (typedArray != null) {
                    typedArray.recycle();
                }
                throw th;
            }
        } catch (Exception e4) {
            e2 = e4;
            typedArrayObtainStyledAttributes = null;
        } catch (Throwable th2) {
            th = th2;
            if (typedArray != null) {
                typedArray.recycle();
            }
            throw th;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (i2 != 0) {
            b bVar2 = new b();
            this.f2028g = bVar2;
            bVar2.mo1145l(typedArrayObtainStyledAttributes2.getString(2));
        } else if (i2 == 1) {
            d dVar2 = new d(this.f2024c, attributeSet, i);
            C0294x0 c0294x0M1152q2 = C0294x0.m1152q(this.f2024c, attributeSet, iArr, i, 0);
            this.f2029h = c0294x0M1152q2.m1163k(3, -2);
            dVar2.f1898A.setBackgroundDrawable(c0294x0M1152q2.m1159g(1));
            dVar2.f2038E = typedArrayObtainStyledAttributes2.getString(2);
            c0294x0M1152q2.f2052b.recycle();
            this.f2028g = dVar2;
            this.f2025d = new C0289v(this, this, dVar2);
        }
        textArray = typedArrayObtainStyledAttributes2.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter2.setDropDownViewResource(com.didjdk.adbhelper.R.layout.dn);
            setAdapter((SpinnerAdapter) arrayAdapter2);
        }
        typedArrayObtainStyledAttributes2.recycle();
        this.f2027f = true;
        spinnerAdapter = this.f2026e;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f2026e = null;
        }
        this.f2023b.m1054d(attributeSet, i);
    }

    /* JADX INFO: renamed from: a */
    public int m1136a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        drawable.getPadding(this.f2030i);
        Rect rect = this.f2030i;
        return iMax2 + rect.left + rect.right;
    }

    /* JADX INFO: renamed from: b */
    public void m1137b() {
        this.f2028g.mo1141d(getTextDirection(), getTextAlignment());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0254e c0254e = this.f2023b;
        if (c0254e != null) {
            c0254e.m1051a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        f fVar = this.f2028g;
        return fVar != null ? fVar.mo1140c() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        f fVar = this.f2028g;
        return fVar != null ? fVar.mo1142g() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f2028g != null ? this.f2029h : super.getDropDownWidth();
    }

    public final f getInternalPopup() {
        return this.f2028g;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        f fVar = this.f2028g;
        return fVar != null ? fVar.mo1143i() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f2024c;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        f fVar = this.f2028g;
        return fVar != null ? fVar.mo1144j() : super.getPrompt();
    }

    @Override // p006b.p032h.p044j.InterfaceC0417l
    public ColorStateList getSupportBackgroundTintList() {
        C0254e c0254e = this.f2023b;
        if (c0254e != null) {
            return c0254e.m1052b();
        }
        return null;
    }

    @Override // p006b.p032h.p044j.InterfaceC0417l
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0254e c0254e = this.f2023b;
        if (c0254e != null) {
            return c0254e.m1053c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f fVar = this.f2028g;
        if (fVar == null || !fVar.mo1139b()) {
            return;
        }
        this.f2028g.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f2028g == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m1136a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.getSuperState());
        if (!eVar.f2047b || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new a());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        f fVar = this.f2028g;
        eVar.f2047b = fVar != null && fVar.mo1139b();
        return eVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewOnTouchListenerC0262h0 abstractViewOnTouchListenerC0262h0 = this.f2025d;
        if (abstractViewOnTouchListenerC0262h0 == null || !abstractViewOnTouchListenerC0262h0.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        f fVar = this.f2028g;
        if (fVar == null) {
            return super.performClick();
        }
        if (fVar.mo1139b()) {
            return true;
        }
        m1137b();
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f2027f) {
            this.f2026e = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f2028g != null) {
            Context context = this.f2024c;
            if (context == null) {
                context = getContext();
            }
            this.f2028g.mo1095o(new c(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0254e c0254e = this.f2023b;
        if (c0254e != null) {
            c0254e.m1055e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0254e c0254e = this.f2023b;
        if (c0254e != null) {
            c0254e.m1056f(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        f fVar = this.f2028g;
        if (fVar == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            fVar.mo1148p(i);
            this.f2028g.mo1138a(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        f fVar = this.f2028g;
        if (fVar != null) {
            fVar.mo1147n(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f2028g != null) {
            this.f2029h = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        f fVar = this.f2028g;
        if (fVar != null) {
            fVar.mo1146m(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C0208a.m884b(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        f fVar = this.f2028g;
        if (fVar != null) {
            fVar.mo1145l(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // p006b.p032h.p044j.InterfaceC0417l
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0254e c0254e = this.f2023b;
        if (c0254e != null) {
            c0254e.m1058h(colorStateList);
        }
    }

    @Override // p006b.p032h.p044j.InterfaceC0417l
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0254e c0254e = this.f2023b;
        if (c0254e != null) {
            c0254e.m1059i(mode);
        }
    }
}
