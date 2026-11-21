package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.didjdk.adbhelper.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import p006b.p008b.C0184b;
import p006b.p008b.p009c.AbstractC0185a;
import p006b.p008b.p010d.p011a.C0208a;
import p006b.p008b.p016h.C0220f;
import p006b.p008b.p016h.InterfaceC0216b;
import p006b.p008b.p016h.p017i.C0229g;
import p006b.p008b.p016h.p017i.C0231i;
import p006b.p008b.p016h.p017i.InterfaceC0235m;
import p006b.p008b.p016h.p017i.SubMenuC0240r;
import p006b.p008b.p018i.C0248c;
import p006b.p008b.p018i.C0253d1;
import p006b.p008b.p018i.C0269l;
import p006b.p008b.p018i.C0273n;
import p006b.p008b.p018i.C0278p0;
import p006b.p008b.p018i.C0294x0;
import p006b.p008b.p018i.C0297z;
import p006b.p008b.p018i.C0298z0;
import p006b.p008b.p018i.InterfaceC0252d0;
import p006b.p032h.p044j.C0418m;
import p006b.p049j.p050a.AbstractC0442a;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* JADX INFO: renamed from: A */
    public ColorStateList f370A;

    /* JADX INFO: renamed from: B */
    public ColorStateList f371B;

    /* JADX INFO: renamed from: C */
    public boolean f372C;

    /* JADX INFO: renamed from: D */
    public boolean f373D;

    /* JADX INFO: renamed from: E */
    public final ArrayList<View> f374E;

    /* JADX INFO: renamed from: F */
    public final ArrayList<View> f375F;

    /* JADX INFO: renamed from: G */
    public final int[] f376G;

    /* JADX INFO: renamed from: H */
    public InterfaceC0061f f377H;

    /* JADX INFO: renamed from: I */
    public final ActionMenuView.InterfaceC0036e f378I;

    /* JADX INFO: renamed from: J */
    public C0298z0 f379J;

    /* JADX INFO: renamed from: K */
    public C0248c f380K;

    /* JADX INFO: renamed from: L */
    public C0059d f381L;

    /* JADX INFO: renamed from: M */
    public InterfaceC0235m.a f382M;

    /* JADX INFO: renamed from: N */
    public C0229g.a f383N;

    /* JADX INFO: renamed from: O */
    public boolean f384O;

    /* JADX INFO: renamed from: P */
    public final Runnable f385P;

    /* JADX INFO: renamed from: b */
    public ActionMenuView f386b;

    /* JADX INFO: renamed from: c */
    public TextView f387c;

    /* JADX INFO: renamed from: d */
    public TextView f388d;

    /* JADX INFO: renamed from: e */
    public ImageButton f389e;

    /* JADX INFO: renamed from: f */
    public ImageView f390f;

    /* JADX INFO: renamed from: g */
    public Drawable f391g;

    /* JADX INFO: renamed from: h */
    public CharSequence f392h;

    /* JADX INFO: renamed from: i */
    public ImageButton f393i;

    /* JADX INFO: renamed from: j */
    public View f394j;

    /* JADX INFO: renamed from: k */
    public Context f395k;

    /* JADX INFO: renamed from: l */
    public int f396l;

    /* JADX INFO: renamed from: m */
    public int f397m;

    /* JADX INFO: renamed from: n */
    public int f398n;

    /* JADX INFO: renamed from: o */
    public int f399o;

    /* JADX INFO: renamed from: p */
    public int f400p;

    /* JADX INFO: renamed from: q */
    public int f401q;

    /* JADX INFO: renamed from: r */
    public int f402r;

    /* JADX INFO: renamed from: s */
    public int f403s;

    /* JADX INFO: renamed from: t */
    public int f404t;

    /* JADX INFO: renamed from: u */
    public C0278p0 f405u;

    /* JADX INFO: renamed from: v */
    public int f406v;

    /* JADX INFO: renamed from: w */
    public int f407w;

    /* JADX INFO: renamed from: x */
    public int f408x;

    /* JADX INFO: renamed from: y */
    public CharSequence f409y;

    /* JADX INFO: renamed from: z */
    public CharSequence f410z;

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$a */
    public class C0056a implements ActionMenuView.InterfaceC0036e {
        public C0056a() {
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$b */
    public class RunnableC0057b implements Runnable {
        public RunnableC0057b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.m115u();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$c */
    public class ViewOnClickListenerC0058c implements View.OnClickListener {
        public ViewOnClickListenerC0058c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C0059d c0059d = Toolbar.this.f381L;
            C0231i c0231i = c0059d == null ? null : c0059d.f415c;
            if (c0231i != null) {
                c0231i.collapseActionView();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$d */
    public class C0059d implements InterfaceC0235m {

        /* JADX INFO: renamed from: b */
        public C0229g f414b;

        /* JADX INFO: renamed from: c */
        public C0231i f415c;

        public C0059d() {
        }

        @Override // p006b.p008b.p016h.p017i.InterfaceC0235m
        /* JADX INFO: renamed from: a */
        public void mo116a(C0229g c0229g, boolean z) {
        }

        @Override // p006b.p008b.p016h.p017i.InterfaceC0235m
        /* JADX INFO: renamed from: c */
        public int mo117c() {
            return 0;
        }

        @Override // p006b.p008b.p016h.p017i.InterfaceC0235m
        /* JADX INFO: renamed from: d */
        public boolean mo118d() {
            return false;
        }

        @Override // p006b.p008b.p016h.p017i.InterfaceC0235m
        /* JADX INFO: renamed from: e */
        public Parcelable mo119e() {
            return null;
        }

        @Override // p006b.p008b.p016h.p017i.InterfaceC0235m
        /* JADX INFO: renamed from: g */
        public void mo120g(Context context, C0229g c0229g) {
            C0231i c0231i;
            C0229g c0229g2 = this.f414b;
            if (c0229g2 != null && (c0231i = this.f415c) != null) {
                c0229g2.mo944d(c0231i);
            }
            this.f414b = c0229g;
        }

        @Override // p006b.p008b.p016h.p017i.InterfaceC0235m
        /* JADX INFO: renamed from: h */
        public void mo121h(Parcelable parcelable) {
        }

        @Override // p006b.p008b.p016h.p017i.InterfaceC0235m
        /* JADX INFO: renamed from: i */
        public boolean mo122i(C0229g c0229g, C0231i c0231i) {
            KeyEvent.Callback callback = Toolbar.this.f394j;
            if (callback instanceof InterfaceC0216b) {
                ((InterfaceC0216b) callback).mo77e();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f394j);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f393i);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f394j = null;
            int size = toolbar3.f375F.size();
            while (true) {
                size--;
                if (size < 0) {
                    toolbar3.f375F.clear();
                    this.f415c = null;
                    Toolbar.this.requestLayout();
                    c0231i.f1659C = false;
                    c0231i.f1674n.mo957q(false);
                    return true;
                }
                toolbar3.addView(toolbar3.f375F.get(size));
            }
        }

        @Override // p006b.p008b.p016h.p017i.InterfaceC0235m
        /* JADX INFO: renamed from: j */
        public boolean mo123j(C0229g c0229g, C0231i c0231i) {
            Toolbar.this.m97c();
            ViewParent parent = Toolbar.this.f393i.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f393i);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f393i);
            }
            Toolbar.this.f394j = c0231i.getActionView();
            this.f415c = c0231i;
            ViewParent parent2 = Toolbar.this.f394j.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f394j);
                }
                C0060e c0060eGenerateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                c0060eGenerateDefaultLayoutParams.f1226a = 8388611 | (toolbar4.f399o & 112);
                c0060eGenerateDefaultLayoutParams.f417b = 2;
                toolbar4.f394j.setLayoutParams(c0060eGenerateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f394j);
            }
            Toolbar toolbar6 = Toolbar.this;
            int childCount = toolbar6.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = toolbar6.getChildAt(childCount);
                if (((C0060e) childAt.getLayoutParams()).f417b != 2 && childAt != toolbar6.f386b) {
                    toolbar6.removeViewAt(childCount);
                    toolbar6.f375F.add(childAt);
                }
            }
            Toolbar.this.requestLayout();
            c0231i.f1659C = true;
            c0231i.f1674n.mo957q(false);
            KeyEvent.Callback callback = Toolbar.this.f394j;
            if (callback instanceof InterfaceC0216b) {
                ((InterfaceC0216b) callback).mo76c();
            }
            return true;
        }

        @Override // p006b.p008b.p016h.p017i.InterfaceC0235m
        /* JADX INFO: renamed from: m */
        public boolean mo124m(SubMenuC0240r subMenuC0240r) {
            return false;
        }

        @Override // p006b.p008b.p016h.p017i.InterfaceC0235m
        /* JADX INFO: renamed from: n */
        public void mo125n(boolean z) {
            if (this.f415c != null) {
                C0229g c0229g = this.f414b;
                boolean z2 = false;
                if (c0229g != null) {
                    int size = c0229g.size();
                    for (int i = 0; i < size; i++) {
                        if (this.f414b.getItem(i) == this.f415c) {
                            z2 = true;
                            break;
                        }
                    }
                }
                if (z2) {
                    return;
                }
                mo122i(this.f414b, this.f415c);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$e */
    public static class C0060e extends AbstractC0185a.a {

        /* JADX INFO: renamed from: b */
        public int f417b;

        public C0060e(int i, int i2) {
            super(i, i2);
            this.f417b = 0;
            this.f1226a = 8388627;
        }

        public C0060e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f417b = 0;
        }

        public C0060e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f417b = 0;
        }

        public C0060e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f417b = 0;
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public C0060e(C0060e c0060e) {
            super((AbstractC0185a.a) c0060e);
            this.f417b = 0;
            this.f417b = c0060e.f417b;
        }

        public C0060e(AbstractC0185a.a aVar) {
            super(aVar);
            this.f417b = 0;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$f */
    public interface InterfaceC0061f {
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$g */
    public static class C0062g extends AbstractC0442a {
        public static final Parcelable.Creator<C0062g> CREATOR = new a();

        /* JADX INFO: renamed from: d */
        public int f418d;

        /* JADX INFO: renamed from: e */
        public boolean f419e;

        /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$g$a */
        public static class a implements Parcelable.ClassLoaderCreator<C0062g> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new C0062g(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new C0062g[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public C0062g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0062g(parcel, classLoader);
            }
        }

        public C0062g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f418d = parcel.readInt();
            this.f419e = parcel.readInt() != 0;
        }

        public C0062g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // p006b.p049j.p050a.AbstractC0442a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f2812b, i);
            parcel.writeInt(this.f418d);
            parcel.writeInt(this.f419e ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.s8);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f408x = 8388627;
        this.f374E = new ArrayList<>();
        this.f375F = new ArrayList<>();
        this.f376G = new int[2];
        this.f378I = new C0056a();
        this.f385P = new RunnableC0057b();
        C0294x0 c0294x0M1152q = C0294x0.m1152q(getContext(), attributeSet, C0184b.f1224y, i, 0);
        this.f397m = c0294x0M1152q.m1164l(28, 0);
        this.f398n = c0294x0M1152q.m1164l(19, 0);
        this.f408x = c0294x0M1152q.f2052b.getInteger(0, this.f408x);
        this.f399o = c0294x0M1152q.f2052b.getInteger(2, 48);
        int iM1157e = c0294x0M1152q.m1157e(22, 0);
        iM1157e = c0294x0M1152q.m1167o(27) ? c0294x0M1152q.m1157e(27, iM1157e) : iM1157e;
        this.f404t = iM1157e;
        this.f403s = iM1157e;
        this.f402r = iM1157e;
        this.f401q = iM1157e;
        int iM1157e2 = c0294x0M1152q.m1157e(25, -1);
        if (iM1157e2 >= 0) {
            this.f401q = iM1157e2;
        }
        int iM1157e3 = c0294x0M1152q.m1157e(24, -1);
        if (iM1157e3 >= 0) {
            this.f402r = iM1157e3;
        }
        int iM1157e4 = c0294x0M1152q.m1157e(26, -1);
        if (iM1157e4 >= 0) {
            this.f403s = iM1157e4;
        }
        int iM1157e5 = c0294x0M1152q.m1157e(23, -1);
        if (iM1157e5 >= 0) {
            this.f404t = iM1157e5;
        }
        this.f400p = c0294x0M1152q.m1158f(13, -1);
        int iM1157e6 = c0294x0M1152q.m1157e(9, RecyclerView.UNDEFINED_DURATION);
        int iM1157e7 = c0294x0M1152q.m1157e(5, RecyclerView.UNDEFINED_DURATION);
        int iM1158f = c0294x0M1152q.m1158f(7, 0);
        int iM1158f2 = c0294x0M1152q.m1158f(8, 0);
        m98d();
        C0278p0 c0278p0 = this.f405u;
        c0278p0.f1965h = false;
        if (iM1158f != Integer.MIN_VALUE) {
            c0278p0.f1962e = iM1158f;
            c0278p0.f1958a = iM1158f;
        }
        if (iM1158f2 != Integer.MIN_VALUE) {
            c0278p0.f1963f = iM1158f2;
            c0278p0.f1959b = iM1158f2;
        }
        if (iM1157e6 != Integer.MIN_VALUE || iM1157e7 != Integer.MIN_VALUE) {
            c0278p0.m1118a(iM1157e6, iM1157e7);
        }
        this.f406v = c0294x0M1152q.m1157e(10, RecyclerView.UNDEFINED_DURATION);
        this.f407w = c0294x0M1152q.m1157e(6, RecyclerView.UNDEFINED_DURATION);
        this.f391g = c0294x0M1152q.m1159g(4);
        this.f392h = c0294x0M1152q.m1166n(3);
        CharSequence charSequenceM1166n = c0294x0M1152q.m1166n(21);
        if (!TextUtils.isEmpty(charSequenceM1166n)) {
            setTitle(charSequenceM1166n);
        }
        CharSequence charSequenceM1166n2 = c0294x0M1152q.m1166n(18);
        if (!TextUtils.isEmpty(charSequenceM1166n2)) {
            setSubtitle(charSequenceM1166n2);
        }
        this.f395k = getContext();
        setPopupTheme(c0294x0M1152q.m1164l(17, 0));
        Drawable drawableM1159g = c0294x0M1152q.m1159g(16);
        if (drawableM1159g != null) {
            setNavigationIcon(drawableM1159g);
        }
        CharSequence charSequenceM1166n3 = c0294x0M1152q.m1166n(15);
        if (!TextUtils.isEmpty(charSequenceM1166n3)) {
            setNavigationContentDescription(charSequenceM1166n3);
        }
        Drawable drawableM1159g2 = c0294x0M1152q.m1159g(11);
        if (drawableM1159g2 != null) {
            setLogo(drawableM1159g2);
        }
        CharSequence charSequenceM1166n4 = c0294x0M1152q.m1166n(12);
        if (!TextUtils.isEmpty(charSequenceM1166n4)) {
            setLogoDescription(charSequenceM1166n4);
        }
        if (c0294x0M1152q.m1167o(29)) {
            setTitleTextColor(c0294x0M1152q.m1155c(29));
        }
        if (c0294x0M1152q.m1167o(20)) {
            setSubtitleTextColor(c0294x0M1152q.m1155c(20));
        }
        if (c0294x0M1152q.m1167o(14)) {
            getMenuInflater().inflate(c0294x0M1152q.m1164l(14, 0), getMenu());
        }
        c0294x0M1152q.f2052b.recycle();
    }

    private MenuInflater getMenuInflater() {
        return new C0220f(getContext());
    }

    /* JADX INFO: renamed from: a */
    public final void m95a(List<View> list, int i) {
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        list.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                C0060e c0060e = (C0060e) childAt.getLayoutParams();
                if (c0060e.f417b == 0 && m114t(childAt) && m104j(c0060e.f1226a) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            View childAt2 = getChildAt(i3);
            C0060e c0060e2 = (C0060e) childAt2.getLayoutParams();
            if (c0060e2.f417b == 0 && m114t(childAt2) && m104j(c0060e2.f1226a) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m96b(View view, boolean z) {
        C0060e c0060eGenerateLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            c0060eGenerateLayoutParams = generateDefaultLayoutParams();
        } else {
            c0060eGenerateLayoutParams = !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (C0060e) layoutParams;
        }
        c0060eGenerateLayoutParams.f417b = 1;
        if (!z || this.f394j == null) {
            addView(view, c0060eGenerateLayoutParams);
        } else {
            view.setLayoutParams(c0060eGenerateLayoutParams);
            this.f375F.add(view);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m97c() {
        if (this.f393i == null) {
            C0269l c0269l = new C0269l(getContext(), null, R.attr.s7);
            this.f393i = c0269l;
            c0269l.setImageDrawable(this.f391g);
            this.f393i.setContentDescription(this.f392h);
            C0060e c0060eGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            c0060eGenerateDefaultLayoutParams.f1226a = 8388611 | (this.f399o & 112);
            c0060eGenerateDefaultLayoutParams.f417b = 2;
            this.f393i.setLayoutParams(c0060eGenerateDefaultLayoutParams);
            this.f393i.setOnClickListener(new ViewOnClickListenerC0058c());
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0060e);
    }

    /* JADX INFO: renamed from: d */
    public final void m98d() {
        if (this.f405u == null) {
            this.f405u = new C0278p0();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m99e() {
        m100f();
        ActionMenuView actionMenuView = this.f386b;
        if (actionMenuView.f223q == null) {
            C0229g c0229g = (C0229g) actionMenuView.getMenu();
            if (this.f381L == null) {
                this.f381L = new C0059d();
            }
            this.f386b.setExpandedActionViewsExclusive(true);
            c0229g.m942b(this.f381L, this.f395k);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m100f() {
        if (this.f386b == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f386b = actionMenuView;
            actionMenuView.setPopupTheme(this.f396l);
            this.f386b.setOnMenuItemClickListener(this.f378I);
            ActionMenuView actionMenuView2 = this.f386b;
            InterfaceC0235m.a aVar = this.f382M;
            C0229g.a aVar2 = this.f383N;
            actionMenuView2.f228v = aVar;
            actionMenuView2.f229w = aVar2;
            C0060e c0060eGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            c0060eGenerateDefaultLayoutParams.f1226a = 8388613 | (this.f399o & 112);
            this.f386b.setLayoutParams(c0060eGenerateDefaultLayoutParams);
            m96b(this.f386b, false);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m101g() {
        if (this.f389e == null) {
            this.f389e = new C0269l(getContext(), null, R.attr.s7);
            C0060e c0060eGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            c0060eGenerateDefaultLayoutParams.f1226a = 8388611 | (this.f399o & 112);
            this.f389e.setLayoutParams(c0060eGenerateDefaultLayoutParams);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0060e(getContext(), attributeSet);
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f393i;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f393i;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C0278p0 c0278p0 = this.f405u;
        if (c0278p0 != null) {
            return c0278p0.f1964g ? c0278p0.f1958a : c0278p0.f1959b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f407w;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C0278p0 c0278p0 = this.f405u;
        if (c0278p0 != null) {
            return c0278p0.f1958a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0278p0 c0278p0 = this.f405u;
        if (c0278p0 != null) {
            return c0278p0.f1959b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C0278p0 c0278p0 = this.f405u;
        if (c0278p0 != null) {
            return c0278p0.f1964g ? c0278p0.f1959b : c0278p0.f1958a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f406v;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        C0229g c0229g;
        ActionMenuView actionMenuView = this.f386b;
        return actionMenuView != null && (c0229g = actionMenuView.f223q) != null && c0229g.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.f407w, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f406v, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f390f;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f390f;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m99e();
        return this.f386b.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f389e;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f389e;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public C0248c getOuterActionMenuPresenter() {
        return this.f380K;
    }

    public Drawable getOverflowIcon() {
        m99e();
        return this.f386b.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f395k;
    }

    public int getPopupTheme() {
        return this.f396l;
    }

    public CharSequence getSubtitle() {
        return this.f410z;
    }

    public final TextView getSubtitleTextView() {
        return this.f388d;
    }

    public CharSequence getTitle() {
        return this.f409y;
    }

    public int getTitleMarginBottom() {
        return this.f404t;
    }

    public int getTitleMarginEnd() {
        return this.f402r;
    }

    public int getTitleMarginStart() {
        return this.f401q;
    }

    public int getTitleMarginTop() {
        return this.f403s;
    }

    public final TextView getTitleTextView() {
        return this.f387c;
    }

    public InterfaceC0252d0 getWrapper() {
        if (this.f379J == null) {
            this.f379J = new C0298z0(this, true);
        }
        return this.f379J;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C0060e generateDefaultLayoutParams() {
        return new C0060e(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public C0060e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0060e) {
            return new C0060e((C0060e) layoutParams);
        }
        if (layoutParams instanceof AbstractC0185a.a) {
            return new C0060e((AbstractC0185a.a) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0060e((ViewGroup.MarginLayoutParams) layoutParams) : new C0060e(layoutParams);
    }

    /* JADX INFO: renamed from: j */
    public final int m104j(int i) {
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        int layoutDirection = getLayoutDirection();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, layoutDirection) & 7;
        if (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) {
            return absoluteGravity;
        }
        return layoutDirection == 1 ? 5 : 3;
    }

    /* JADX INFO: renamed from: k */
    public final int m105k(View view, int i) {
        C0060e c0060e = (C0060e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = c0060e.f1226a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.f408x & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c0060e).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) c0060e).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) c0060e).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    /* JADX INFO: renamed from: l */
    public final int m106l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    /* JADX INFO: renamed from: m */
    public final int m107m(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m108n(View view) {
        return view.getParent() == this || this.f375F.contains(view);
    }

    /* JADX INFO: renamed from: o */
    public boolean m109o() {
        ActionMenuView actionMenuView = this.f386b;
        if (actionMenuView != null) {
            C0248c c0248c = actionMenuView.f227u;
            if (c0248c != null && c0248c.m1020p()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f385P);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f373D = false;
        }
        if (!this.f373D) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f373D = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f373D = false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0236  */
    /* JADX WARN: Code duplicated, block: B:101:0x0259  */
    /* JADX WARN: Code duplicated, block: B:103:0x025c  */
    /* JADX WARN: Code duplicated, block: B:104:0x027e  */
    /* JADX WARN: Code duplicated, block: B:106:0x0281  */
    /* JADX WARN: Code duplicated, block: B:107:0x0286  */
    /* JADX WARN: Code duplicated, block: B:110:0x0297 A[LOOP:0: B:109:0x0295->B:110:0x0297, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x02b9 A[LOOP:1: B:112:0x02b7->B:113:0x02b9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:116:0x02de A[LOOP:2: B:115:0x02dc->B:116:0x02de, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:120:0x031f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x0321  */
    /* JADX WARN: Code duplicated, block: B:122:0x0325  */
    /* JADX WARN: Code duplicated, block: B:125:0x0330 A[LOOP:3: B:124:0x032e->B:125:0x0330, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:20:0x005f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0063  */
    /* JADX WARN: Code duplicated, block: B:23:0x0068  */
    /* JADX WARN: Code duplicated, block: B:26:0x0074  */
    /* JADX WARN: Code duplicated, block: B:28:0x0078  */
    /* JADX WARN: Code duplicated, block: B:29:0x007d  */
    /* JADX WARN: Code duplicated, block: B:32:0x00af  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:44:0x00df  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:48:0x0115  */
    /* JADX WARN: Code duplicated, block: B:53:0x0122 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0124  */
    /* JADX WARN: Code duplicated, block: B:55:0x0127  */
    /* JADX WARN: Code duplicated, block: B:57:0x012b  */
    /* JADX WARN: Code duplicated, block: B:58:0x012e  */
    /* JADX WARN: Code duplicated, block: B:61:0x013e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0146 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:70:0x015f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0163  */
    /* JADX WARN: Code duplicated, block: B:74:0x0175  */
    /* JADX WARN: Code duplicated, block: B:75:0x0178  */
    /* JADX WARN: Code duplicated, block: B:77:0x0183  */
    /* JADX WARN: Code duplicated, block: B:79:0x018f  */
    /* JADX WARN: Code duplicated, block: B:80:0x019d  */
    /* JADX WARN: Code duplicated, block: B:82:0x01ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:87:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:88:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:91:0x0212  */
    /* JADX WARN: Code duplicated, block: B:93:0x0215  */
    /* JADX WARN: Code duplicated, block: B:95:0x021d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x021f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0222  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iM110p;
        int iM111q;
        int iMax;
        int iMin;
        boolean zM114t;
        boolean zM114t2;
        int measuredHeight;
        TextView textView;
        TextView textView2;
        C0060e c0060e;
        C0060e c0060e2;
        boolean z2;
        int i5;
        int i6;
        int paddingTop;
        int i7;
        int iMax2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int iMax3;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int size;
        int iM110p2;
        int i18;
        int i19;
        int size2;
        int i20;
        ArrayList<View> arrayList;
        int i21;
        int size3;
        int i22;
        int i23;
        int measuredWidth;
        int i24;
        int i25;
        int size4;
        int iM110p3;
        int i26;
        ImageView imageView;
        View view;
        ActionMenuView actionMenuView;
        ImageButton imageButton;
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        boolean z3 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i27 = width - paddingRight;
        int[] iArr = this.f376G;
        iArr[1] = 0;
        iArr[0] = 0;
        int minimumHeight = getMinimumHeight();
        int iMin2 = minimumHeight >= 0 ? Math.min(minimumHeight, i4 - i2) : 0;
        if (m114t(this.f389e)) {
            ImageButton imageButton2 = this.f389e;
            if (z3) {
                iM111q = m111q(imageButton2, i27, iArr, iMin2);
                iM110p = paddingLeft;
            } else {
                iM110p = m110p(imageButton2, paddingLeft, iArr, iMin2);
            }
            if (m114t(this.f393i)) {
                imageButton = this.f393i;
                if (z3) {
                    iM111q = m111q(imageButton, iM111q, iArr, iMin2);
                } else {
                    iM110p = m110p(imageButton, iM110p, iArr, iMin2);
                }
            }
            if (m114t(this.f386b)) {
                actionMenuView = this.f386b;
                if (z3) {
                    iM110p = m110p(actionMenuView, iM110p, iArr, iMin2);
                } else {
                    iM111q = m111q(actionMenuView, iM111q, iArr, iMin2);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iM110p);
            iArr[1] = Math.max(0, currentContentInsetRight - (i27 - iM111q));
            iMax = Math.max(iM110p, currentContentInsetLeft);
            iMin = Math.min(iM111q, i27 - currentContentInsetRight);
            if (m114t(this.f394j)) {
                view = this.f394j;
                if (z3) {
                    iMin = m111q(view, iMin, iArr, iMin2);
                } else {
                    iMax = m110p(view, iMax, iArr, iMin2);
                }
            }
            if (m114t(this.f390f)) {
                imageView = this.f390f;
                if (z3) {
                    iMin = m111q(imageView, iMin, iArr, iMin2);
                } else {
                    iMax = m110p(imageView, iMax, iArr, iMin2);
                }
            }
            zM114t = m114t(this.f387c);
            zM114t2 = m114t(this.f388d);
            if (zM114t) {
                C0060e c0060e3 = (C0060e) this.f387c.getLayoutParams();
                measuredHeight = this.f387c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0060e3).topMargin + ((ViewGroup.MarginLayoutParams) c0060e3).bottomMargin + 0;
            } else {
                measuredHeight = 0;
            }
            if (zM114t2) {
                C0060e c0060e4 = (C0060e) this.f388d.getLayoutParams();
                measuredHeight += this.f388d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0060e4).topMargin + ((ViewGroup.MarginLayoutParams) c0060e4).bottomMargin;
            }
            if (!zM114t || zM114t2) {
                if (zM114t) {
                    textView = this.f387c;
                } else {
                    textView = this.f388d;
                }
                if (zM114t2) {
                    textView2 = this.f388d;
                } else {
                    textView2 = this.f387c;
                }
                c0060e = (C0060e) textView.getLayoutParams();
                c0060e2 = (C0060e) textView2.getLayoutParams();
                z2 = (!zM114t && this.f387c.getMeasuredWidth() > 0) || (zM114t2 && this.f388d.getMeasuredWidth() > 0);
                i5 = this.f408x & 112;
                i6 = paddingLeft;
                if (i5 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0060e).topMargin + this.f403s;
                } else if (i5 != 80) {
                    iMax3 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                    i13 = ((ViewGroup.MarginLayoutParams) c0060e).topMargin;
                    i14 = this.f403s;
                    if (iMax3 < i13 + i14) {
                        iMax3 = i13 + i14;
                    } else {
                        i15 = (((height - paddingBottom) - measuredHeight) - iMax3) - paddingTop2;
                        i16 = ((ViewGroup.MarginLayoutParams) c0060e).bottomMargin;
                        i17 = this.f404t;
                        if (i15 < i16 + i17) {
                            iMax3 = Math.max(0, iMax3 - ((((ViewGroup.MarginLayoutParams) c0060e2).bottomMargin + i17) - i15));
                        }
                    }
                    paddingTop = paddingTop2 + iMax3;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c0060e2).bottomMargin) - this.f404t) - measuredHeight;
                }
                if (z3) {
                    if (z2) {
                        i10 = this.f401q;
                    } else {
                        i10 = 0;
                    }
                    int i28 = i10 - iArr[1];
                    iMin -= Math.max(0, i28);
                    iArr[1] = Math.max(0, -i28);
                    if (zM114t) {
                        C0060e c0060e5 = (C0060e) this.f387c.getLayoutParams();
                        int measuredWidth2 = iMin - this.f387c.getMeasuredWidth();
                        int measuredHeight2 = this.f387c.getMeasuredHeight() + paddingTop;
                        this.f387c.layout(measuredWidth2, paddingTop, iMin, measuredHeight2);
                        i11 = measuredWidth2 - this.f402r;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) c0060e5).bottomMargin;
                    } else {
                        i11 = iMin;
                    }
                    if (zM114t2) {
                        int i29 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C0060e) this.f388d.getLayoutParams())).topMargin;
                        this.f388d.layout(iMin - this.f388d.getMeasuredWidth(), i29, iMin, this.f388d.getMeasuredHeight() + i29);
                        i12 = iMin - this.f402r;
                    } else {
                        i12 = iMin;
                    }
                    if (z2) {
                        iMin = Math.min(i11, i12);
                    }
                    iMax = iMax;
                } else {
                    if (z2) {
                        i7 = this.f401q;
                    } else {
                        i7 = 0;
                    }
                    int i30 = i7 - iArr[0];
                    iMax2 = Math.max(0, i30) + iMax;
                    iArr[0] = Math.max(0, -i30);
                    if (zM114t) {
                        C0060e c0060e6 = (C0060e) this.f387c.getLayoutParams();
                        int measuredWidth3 = this.f387c.getMeasuredWidth() + iMax2;
                        int measuredHeight3 = this.f387c.getMeasuredHeight() + paddingTop;
                        this.f387c.layout(iMax2, paddingTop, measuredWidth3, measuredHeight3);
                        i8 = measuredWidth3 + this.f402r;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) c0060e6).bottomMargin;
                    } else {
                        i8 = iMax2;
                    }
                    if (zM114t2) {
                        int i31 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C0060e) this.f388d.getLayoutParams())).topMargin;
                        int measuredWidth4 = this.f388d.getMeasuredWidth() + iMax2;
                        this.f388d.layout(iMax2, i31, measuredWidth4, this.f388d.getMeasuredHeight() + i31);
                        i9 = measuredWidth4 + this.f402r;
                    } else {
                        i9 = iMax2;
                    }
                    if (z2) {
                        iMax = Math.max(i8, i9);
                    } else {
                        iMax = iMax2;
                    }
                }
            } else {
                i6 = paddingLeft;
                iMin2 = iMin2;
            }
            m95a(this.f374E, 3);
            size = this.f374E.size();
            iM110p2 = iMax;
            for (i18 = 0; i18 < size; i18++) {
                iM110p2 = m110p(this.f374E.get(i18), iM110p2, iArr, iMin2);
            }
            i19 = iMin2;
            m95a(this.f374E, 5);
            size2 = this.f374E.size();
            for (i20 = 0; i20 < size2; i20++) {
                iMin = m111q(this.f374E.get(i20), iMin, iArr, i19);
            }
            m95a(this.f374E, 1);
            arrayList = this.f374E;
            int i32 = iArr[0];
            i21 = iArr[1];
            size3 = arrayList.size();
            i22 = i32;
            i23 = 0;
            measuredWidth = 0;
            while (i23 < size3) {
                View view2 = arrayList.get(i23);
                C0060e c0060e7 = (C0060e) view2.getLayoutParams();
                int i33 = ((ViewGroup.MarginLayoutParams) c0060e7).leftMargin - i22;
                int i34 = ((ViewGroup.MarginLayoutParams) c0060e7).rightMargin - i21;
                int iMax4 = Math.max(0, i33);
                int iMax5 = Math.max(0, i34);
                int iMax6 = Math.max(0, -i33);
                int iMax7 = Math.max(0, -i34);
                measuredWidth += view2.getMeasuredWidth() + iMax4 + iMax5;
                i23++;
                i21 = iMax7;
                i22 = iMax6;
            }
            i24 = ((((width - i6) - paddingRight) / 2) + i6) - (measuredWidth / 2);
            i25 = measuredWidth + i24;
            if (i24 >= iM110p2) {
                if (i25 > iMin) {
                    iM110p2 = i24 - (i25 - iMin);
                } else {
                    iM110p2 = i24;
                }
            }
            size4 = this.f374E.size();
            iM110p3 = iM110p2;
            for (i26 = 0; i26 < size4; i26++) {
                iM110p3 = m110p(this.f374E.get(i26), iM110p3, iArr, i19);
            }
            this.f374E.clear();
        }
        iM110p = paddingLeft;
        iM111q = i27;
        if (m114t(this.f393i)) {
            imageButton = this.f393i;
            if (z3) {
                iM111q = m111q(imageButton, iM111q, iArr, iMin2);
            } else {
                iM110p = m110p(imageButton, iM110p, iArr, iMin2);
            }
        }
        if (m114t(this.f386b)) {
            actionMenuView = this.f386b;
            if (z3) {
                iM110p = m110p(actionMenuView, iM110p, iArr, iMin2);
            } else {
                iM111q = m111q(actionMenuView, iM111q, iArr, iMin2);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iM110p);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i27 - iM111q));
        iMax = Math.max(iM110p, currentContentInsetLeft2);
        iMin = Math.min(iM111q, i27 - currentContentInsetRight2);
        if (m114t(this.f394j)) {
            view = this.f394j;
            if (z3) {
                iMin = m111q(view, iMin, iArr, iMin2);
            } else {
                iMax = m110p(view, iMax, iArr, iMin2);
            }
        }
        if (m114t(this.f390f)) {
            imageView = this.f390f;
            if (z3) {
                iMin = m111q(imageView, iMin, iArr, iMin2);
            } else {
                iMax = m110p(imageView, iMax, iArr, iMin2);
            }
        }
        zM114t = m114t(this.f387c);
        zM114t2 = m114t(this.f388d);
        if (zM114t) {
            C0060e c0060e8 = (C0060e) this.f387c.getLayoutParams();
            measuredHeight = this.f387c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0060e8).topMargin + ((ViewGroup.MarginLayoutParams) c0060e8).bottomMargin + 0;
        } else {
            measuredHeight = 0;
        }
        if (zM114t2) {
            C0060e c0060e9 = (C0060e) this.f388d.getLayoutParams();
            measuredHeight += this.f388d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0060e9).topMargin + ((ViewGroup.MarginLayoutParams) c0060e9).bottomMargin;
        }
        if (zM114t) {
            if (zM114t) {
                textView = this.f387c;
            } else {
                textView = this.f388d;
            }
            if (zM114t2) {
                textView2 = this.f388d;
            } else {
                textView2 = this.f387c;
            }
            c0060e = (C0060e) textView.getLayoutParams();
            c0060e2 = (C0060e) textView2.getLayoutParams();
            if (zM114t) {
            }
            i5 = this.f408x & 112;
            i6 = paddingLeft;
            if (i5 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0060e).topMargin + this.f403s;
            } else if (i5 != 80) {
                iMax3 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i13 = ((ViewGroup.MarginLayoutParams) c0060e).topMargin;
                i14 = this.f403s;
                if (iMax3 < i13 + i14) {
                    iMax3 = i13 + i14;
                } else {
                    i15 = (((height - paddingBottom) - measuredHeight) - iMax3) - paddingTop2;
                    i16 = ((ViewGroup.MarginLayoutParams) c0060e).bottomMargin;
                    i17 = this.f404t;
                    if (i15 < i16 + i17) {
                        iMax3 = Math.max(0, iMax3 - ((((ViewGroup.MarginLayoutParams) c0060e2).bottomMargin + i17) - i15));
                    }
                }
                paddingTop = paddingTop2 + iMax3;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c0060e2).bottomMargin) - this.f404t) - measuredHeight;
            }
            if (z3) {
                if (z2) {
                    i10 = this.f401q;
                } else {
                    i10 = 0;
                }
                int i210 = i10 - iArr[1];
                iMin -= Math.max(0, i210);
                iArr[1] = Math.max(0, -i210);
                if (zM114t) {
                    C0060e c0060e10 = (C0060e) this.f387c.getLayoutParams();
                    int measuredWidth5 = iMin - this.f387c.getMeasuredWidth();
                    int measuredHeight4 = this.f387c.getMeasuredHeight() + paddingTop;
                    this.f387c.layout(measuredWidth5, paddingTop, iMin, measuredHeight4);
                    i11 = measuredWidth5 - this.f402r;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) c0060e10).bottomMargin;
                } else {
                    i11 = iMin;
                }
                if (zM114t2) {
                    int i211 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C0060e) this.f388d.getLayoutParams())).topMargin;
                    this.f388d.layout(iMin - this.f388d.getMeasuredWidth(), i211, iMin, this.f388d.getMeasuredHeight() + i211);
                    i12 = iMin - this.f402r;
                } else {
                    i12 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i11, i12);
                }
                iMax = iMax;
            } else {
                if (z2) {
                    i7 = this.f401q;
                } else {
                    i7 = 0;
                }
                int i35 = i7 - iArr[0];
                iMax2 = Math.max(0, i35) + iMax;
                iArr[0] = Math.max(0, -i35);
                if (zM114t) {
                    C0060e c0060e11 = (C0060e) this.f387c.getLayoutParams();
                    int measuredWidth6 = this.f387c.getMeasuredWidth() + iMax2;
                    int measuredHeight5 = this.f387c.getMeasuredHeight() + paddingTop;
                    this.f387c.layout(iMax2, paddingTop, measuredWidth6, measuredHeight5);
                    i8 = measuredWidth6 + this.f402r;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) c0060e11).bottomMargin;
                } else {
                    i8 = iMax2;
                }
                if (zM114t2) {
                    int i36 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C0060e) this.f388d.getLayoutParams())).topMargin;
                    int measuredWidth7 = this.f388d.getMeasuredWidth() + iMax2;
                    this.f388d.layout(iMax2, i36, measuredWidth7, this.f388d.getMeasuredHeight() + i36);
                    i9 = measuredWidth7 + this.f402r;
                } else {
                    i9 = iMax2;
                }
                if (z2) {
                    iMax = Math.max(i8, i9);
                } else {
                    iMax = iMax2;
                }
            }
        } else {
            if (zM114t) {
                textView = this.f387c;
            } else {
                textView = this.f388d;
            }
            if (zM114t2) {
                textView2 = this.f388d;
            } else {
                textView2 = this.f387c;
            }
            c0060e = (C0060e) textView.getLayoutParams();
            c0060e2 = (C0060e) textView2.getLayoutParams();
            if (zM114t) {
            }
            i5 = this.f408x & 112;
            i6 = paddingLeft;
            if (i5 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0060e).topMargin + this.f403s;
            } else if (i5 != 80) {
                iMax3 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i13 = ((ViewGroup.MarginLayoutParams) c0060e).topMargin;
                i14 = this.f403s;
                if (iMax3 < i13 + i14) {
                    iMax3 = i13 + i14;
                } else {
                    i15 = (((height - paddingBottom) - measuredHeight) - iMax3) - paddingTop2;
                    i16 = ((ViewGroup.MarginLayoutParams) c0060e).bottomMargin;
                    i17 = this.f404t;
                    if (i15 < i16 + i17) {
                        iMax3 = Math.max(0, iMax3 - ((((ViewGroup.MarginLayoutParams) c0060e2).bottomMargin + i17) - i15));
                    }
                }
                paddingTop = paddingTop2 + iMax3;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c0060e2).bottomMargin) - this.f404t) - measuredHeight;
            }
            if (z3) {
                if (z2) {
                    i10 = this.f401q;
                } else {
                    i10 = 0;
                }
                int i212 = i10 - iArr[1];
                iMin -= Math.max(0, i212);
                iArr[1] = Math.max(0, -i212);
                if (zM114t) {
                    C0060e c0060e12 = (C0060e) this.f387c.getLayoutParams();
                    int measuredWidth8 = iMin - this.f387c.getMeasuredWidth();
                    int measuredHeight6 = this.f387c.getMeasuredHeight() + paddingTop;
                    this.f387c.layout(measuredWidth8, paddingTop, iMin, measuredHeight6);
                    i11 = measuredWidth8 - this.f402r;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) c0060e12).bottomMargin;
                } else {
                    i11 = iMin;
                }
                if (zM114t2) {
                    int i213 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C0060e) this.f388d.getLayoutParams())).topMargin;
                    this.f388d.layout(iMin - this.f388d.getMeasuredWidth(), i213, iMin, this.f388d.getMeasuredHeight() + i213);
                    i12 = iMin - this.f402r;
                } else {
                    i12 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i11, i12);
                }
                iMax = iMax;
            } else {
                if (z2) {
                    i7 = this.f401q;
                } else {
                    i7 = 0;
                }
                int i37 = i7 - iArr[0];
                iMax2 = Math.max(0, i37) + iMax;
                iArr[0] = Math.max(0, -i37);
                if (zM114t) {
                    C0060e c0060e13 = (C0060e) this.f387c.getLayoutParams();
                    int measuredWidth9 = this.f387c.getMeasuredWidth() + iMax2;
                    int measuredHeight7 = this.f387c.getMeasuredHeight() + paddingTop;
                    this.f387c.layout(iMax2, paddingTop, measuredWidth9, measuredHeight7);
                    i8 = measuredWidth9 + this.f402r;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) c0060e13).bottomMargin;
                } else {
                    i8 = iMax2;
                }
                if (zM114t2) {
                    int i38 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C0060e) this.f388d.getLayoutParams())).topMargin;
                    int measuredWidth10 = this.f388d.getMeasuredWidth() + iMax2;
                    this.f388d.layout(iMax2, i38, measuredWidth10, this.f388d.getMeasuredHeight() + i38);
                    i9 = measuredWidth10 + this.f402r;
                } else {
                    i9 = iMax2;
                }
                if (z2) {
                    iMax = Math.max(i8, i9);
                } else {
                    iMax = iMax2;
                }
            }
        }
        m95a(this.f374E, 3);
        size = this.f374E.size();
        iM110p2 = iMax;
        while (i18 < size) {
            iM110p2 = m110p(this.f374E.get(i18), iM110p2, iArr, iMin2);
        }
        i19 = iMin2;
        m95a(this.f374E, 5);
        size2 = this.f374E.size();
        while (i20 < size2) {
            iMin = m111q(this.f374E.get(i20), iMin, iArr, i19);
        }
        m95a(this.f374E, 1);
        arrayList = this.f374E;
        int i39 = iArr[0];
        i21 = iArr[1];
        size3 = arrayList.size();
        i22 = i39;
        i23 = 0;
        measuredWidth = 0;
        while (i23 < size3) {
            View view3 = arrayList.get(i23);
            C0060e c0060e14 = (C0060e) view3.getLayoutParams();
            int i310 = ((ViewGroup.MarginLayoutParams) c0060e14).leftMargin - i22;
            int i311 = ((ViewGroup.MarginLayoutParams) c0060e14).rightMargin - i21;
            int iMax8 = Math.max(0, i310);
            int iMax9 = Math.max(0, i311);
            int iMax10 = Math.max(0, -i310);
            int iMax11 = Math.max(0, -i311);
            measuredWidth += view3.getMeasuredWidth() + iMax8 + iMax9;
            i23++;
            i21 = iMax11;
            i22 = iMax10;
        }
        i24 = ((((width - i6) - paddingRight) / 2) + i6) - (measuredWidth / 2);
        i25 = measuredWidth + i24;
        if (i24 >= iM110p2) {
            if (i25 > iMin) {
                iM110p2 = i24 - (i25 - iMin);
            } else {
                iM110p2 = i24;
            }
        }
        size4 = this.f374E.size();
        iM110p3 = iM110p2;
        while (i26 < size4) {
            iM110p3 = m110p(this.f374E.get(i26), iM110p3, iArr, i19);
        }
        this.f374E.clear();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        char c2;
        char c3;
        int iM106l;
        int iMax;
        int iCombineMeasuredStates;
        int iM106l2;
        int iCombineMeasuredStates2;
        int iMax2;
        int iM107m;
        int[] iArr = this.f376G;
        boolean z = true;
        if (C0253d1.m1050b(this)) {
            c2 = 1;
            c3 = 0;
        } else {
            c2 = 0;
            c3 = 1;
        }
        if (m114t(this.f389e)) {
            m113s(this.f389e, i, 0, i2, 0, this.f400p);
            iM106l = m106l(this.f389e) + this.f389e.getMeasuredWidth();
            iMax = Math.max(0, m107m(this.f389e) + this.f389e.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f389e.getMeasuredState());
        } else {
            iM106l = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (m114t(this.f393i)) {
            m113s(this.f393i, i, 0, i2, 0, this.f400p);
            iM106l = m106l(this.f393i) + this.f393i.getMeasuredWidth();
            iMax = Math.max(iMax, m107m(this.f393i) + this.f393i.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f393i.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iM106l) + 0;
        iArr[c2] = Math.max(0, currentContentInsetStart - iM106l);
        if (m114t(this.f386b)) {
            m113s(this.f386b, i, iMax3, i2, 0, this.f400p);
            iM106l2 = m106l(this.f386b) + this.f386b.getMeasuredWidth();
            iMax = Math.max(iMax, m107m(this.f386b) + this.f386b.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f386b.getMeasuredState());
        } else {
            iM106l2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = Math.max(currentContentInsetEnd, iM106l2) + iMax3;
        iArr[c3] = Math.max(0, currentContentInsetEnd - iM106l2);
        if (m114t(this.f394j)) {
            iMax4 += m112r(this.f394j, i, iMax4, i2, 0, iArr);
            iMax = Math.max(iMax, m107m(this.f394j) + this.f394j.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f394j.getMeasuredState());
        }
        if (m114t(this.f390f)) {
            iMax4 += m112r(this.f390f, i, iMax4, i2, 0, iArr);
            iMax = Math.max(iMax, m107m(this.f390f) + this.f390f.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f390f.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (((C0060e) childAt.getLayoutParams()).f417b == 0 && m114t(childAt)) {
                iMax4 += m112r(childAt, i, iMax4, i2, 0, iArr);
                iMax = Math.max(iMax, m107m(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i4 = this.f403s + this.f404t;
        int i5 = this.f401q + this.f402r;
        if (m114t(this.f387c)) {
            m112r(this.f387c, i, iMax4 + i5, i2, i4, iArr);
            int iM106l3 = m106l(this.f387c) + this.f387c.getMeasuredWidth();
            iM107m = m107m(this.f387c) + this.f387c.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f387c.getMeasuredState());
            iMax2 = iM106l3;
        } else {
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
            iM107m = 0;
        }
        if (m114t(this.f388d)) {
            iMax2 = Math.max(iMax2, m112r(this.f388d, i, iMax4 + i5, i2, iM107m + i4, iArr));
            iM107m = m107m(this.f388d) + this.f388d.getMeasuredHeight() + iM107m;
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f388d.getMeasuredState());
        }
        int iMax5 = Math.max(iMax, iM107m);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax5;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + iMax4 + iMax2, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16);
        if (!this.f384O) {
            z = false;
            break;
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            View childAt2 = getChildAt(i6);
            if (m114t(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                z = false;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, z ? 0 : iResolveSizeAndState2);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof C0062g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0062g c0062g = (C0062g) parcelable;
        super.onRestoreInstanceState(c0062g.f2812b);
        ActionMenuView actionMenuView = this.f386b;
        C0229g c0229g = actionMenuView != null ? actionMenuView.f223q : null;
        int i = c0062g.f418d;
        if (i != 0 && this.f381L != null && c0229g != null && (menuItemFindItem = c0229g.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (c0062g.f419e) {
            removeCallbacks(this.f385P);
            post(this.f385P);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        int i2;
        super.onRtlPropertiesChanged(i);
        m98d();
        C0278p0 c0278p0 = this.f405u;
        boolean z = i == 1;
        if (z == c0278p0.f1964g) {
            return;
        }
        c0278p0.f1964g = z;
        if (c0278p0.f1965h) {
            if (z) {
                int i3 = c0278p0.f1961d;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = c0278p0.f1962e;
                }
                c0278p0.f1958a = i3;
                i2 = c0278p0.f1960c;
                if (i2 == Integer.MIN_VALUE) {
                }
            } else {
                int i4 = c0278p0.f1960c;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = c0278p0.f1962e;
                }
                c0278p0.f1958a = i4;
                i2 = c0278p0.f1961d;
                if (i2 == Integer.MIN_VALUE) {
                }
            }
            c0278p0.f1959b = i2;
        }
        c0278p0.f1958a = c0278p0.f1962e;
        i2 = c0278p0.f1963f;
        c0278p0.f1959b = i2;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C0231i c0231i;
        C0062g c0062g = new C0062g(super.onSaveInstanceState());
        C0059d c0059d = this.f381L;
        if (c0059d != null && (c0231i = c0059d.f415c) != null) {
            c0062g.f418d = c0231i.f1661a;
        }
        c0062g.f419e = m109o();
        return c0062g;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f372C = false;
        }
        if (!this.f372C) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f372C = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f372C = false;
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final int m110p(View view, int i, int[] iArr, int i2) {
        C0060e c0060e = (C0060e) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c0060e).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int iM105k = m105k(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iM105k, iMax + measuredWidth, view.getMeasuredHeight() + iM105k);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) c0060e).rightMargin + iMax;
    }

    /* JADX INFO: renamed from: q */
    public final int m111q(View view, int i, int[] iArr, int i2) {
        C0060e c0060e = (C0060e) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c0060e).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iM105k = m105k(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iM105k, iMax, view.getMeasuredHeight() + iM105k);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) c0060e).leftMargin);
    }

    /* JADX INFO: renamed from: r */
    public final int m112r(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    /* JADX INFO: renamed from: s */
    public final void m113s(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m97c();
        }
        ImageButton imageButton = this.f393i;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(C0208a.m884b(getContext(), i));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            m97c();
            this.f393i.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f393i;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f391g);
            }
        }
    }

    public void setCollapsible(boolean z) {
        this.f384O = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = RecyclerView.UNDEFINED_DURATION;
        }
        if (i != this.f407w) {
            this.f407w = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = RecyclerView.UNDEFINED_DURATION;
        }
        if (i != this.f406v) {
            this.f406v = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(C0208a.m884b(getContext(), i));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f390f == null) {
                this.f390f = new C0273n(getContext(), null, 0);
            }
            if (!m108n(this.f390f)) {
                m96b(this.f390f, true);
            }
        } else {
            ImageView imageView = this.f390f;
            if (imageView != null && m108n(imageView)) {
                removeView(this.f390f);
                this.f375F.remove(this.f390f);
            }
        }
        ImageView imageView2 = this.f390f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f390f == null) {
            this.f390f = new C0273n(getContext(), null, 0);
        }
        ImageView imageView = this.f390f;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m101g();
        }
        ImageButton imageButton = this.f389e;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C0208a.m884b(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m101g();
            if (!m108n(this.f389e)) {
                m96b(this.f389e, true);
            }
        } else {
            ImageButton imageButton = this.f389e;
            if (imageButton != null && m108n(imageButton)) {
                removeView(this.f389e);
                this.f375F.remove(this.f389e);
            }
        }
        ImageButton imageButton2 = this.f389e;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m101g();
        this.f389e.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(InterfaceC0061f interfaceC0061f) {
        this.f377H = interfaceC0061f;
    }

    public void setOverflowIcon(Drawable drawable) {
        m99e();
        this.f386b.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f396l != i) {
            this.f396l = i;
            if (i == 0) {
                this.f395k = getContext();
            } else {
                this.f395k = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f388d;
            if (textView != null && m108n(textView)) {
                removeView(this.f388d);
                this.f375F.remove(this.f388d);
            }
        } else {
            if (this.f388d == null) {
                Context context = getContext();
                C0297z c0297z = new C0297z(context, null);
                this.f388d = c0297z;
                c0297z.setSingleLine();
                this.f388d.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f398n;
                if (i != 0) {
                    this.f388d.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f371B;
                if (colorStateList != null) {
                    this.f388d.setTextColor(colorStateList);
                }
            }
            if (!m108n(this.f388d)) {
                m96b(this.f388d, true);
            }
        }
        TextView textView2 = this.f388d;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f410z = charSequence;
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f371B = colorStateList;
        TextView textView = this.f388d;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f387c;
            if (textView != null && m108n(textView)) {
                removeView(this.f387c);
                this.f375F.remove(this.f387c);
            }
        } else {
            if (this.f387c == null) {
                Context context = getContext();
                C0297z c0297z = new C0297z(context, null);
                this.f387c = c0297z;
                c0297z.setSingleLine();
                this.f387c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f397m;
                if (i != 0) {
                    this.f387c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f370A;
                if (colorStateList != null) {
                    this.f387c.setTextColor(colorStateList);
                }
            }
            if (!m108n(this.f387c)) {
                m96b(this.f387c, true);
            }
        }
        TextView textView2 = this.f387c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f409y = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.f404t = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f402r = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f401q = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f403s = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f370A = colorStateList;
        TextView textView = this.f387c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* JADX INFO: renamed from: t */
    public final boolean m114t(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* JADX INFO: renamed from: u */
    public boolean m115u() {
        ActionMenuView actionMenuView = this.f386b;
        if (actionMenuView != null) {
            C0248c c0248c = actionMenuView.f227u;
            if (c0248c != null && c0248c.m1021q()) {
                return true;
            }
        }
        return false;
    }
}
