package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import p006b.p008b.C0183a;
import p006b.p008b.C0184b;
import p006b.p008b.p016h.p017i.C0229g;
import p006b.p008b.p016h.p017i.C0231i;
import p006b.p008b.p016h.p017i.InterfaceC0236n;
import p006b.p008b.p016h.p017i.InterfaceC0238p;
import p006b.p008b.p018i.AbstractViewOnTouchListenerC0262h0;
import p006b.p008b.p018i.C0248c;
import p006b.p008b.p018i.C0297z;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends C0297z implements InterfaceC0236n.a, View.OnClickListener, ActionMenuView.InterfaceC0032a {

    /* JADX INFO: renamed from: f */
    public C0231i f137f;

    /* JADX INFO: renamed from: g */
    public CharSequence f138g;

    /* JADX INFO: renamed from: h */
    public Drawable f139h;

    /* JADX INFO: renamed from: i */
    public C0229g.b f140i;

    /* JADX INFO: renamed from: j */
    public AbstractViewOnTouchListenerC0262h0 f141j;

    /* JADX INFO: renamed from: k */
    public AbstractC0025b f142k;

    /* JADX INFO: renamed from: l */
    public boolean f143l;

    /* JADX INFO: renamed from: m */
    public boolean f144m;

    /* JADX INFO: renamed from: n */
    public int f145n;

    /* JADX INFO: renamed from: o */
    public int f146o;

    /* JADX INFO: renamed from: p */
    public int f147p;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.ActionMenuItemView$a */
    public class C0024a extends AbstractViewOnTouchListenerC0262h0 {
        public C0024a() {
            super(ActionMenuItemView.this);
        }

        @Override // p006b.p008b.p018i.AbstractViewOnTouchListenerC0262h0
        /* JADX INFO: renamed from: b */
        public InterfaceC0238p mo21b() {
            C0248c.a aVar;
            AbstractC0025b abstractC0025b = ActionMenuItemView.this.f142k;
            if (abstractC0025b == null || (aVar = C0248c.this.f1797w) == null) {
                return null;
            }
            return aVar.m989a();
        }

        @Override // p006b.p008b.p018i.AbstractViewOnTouchListenerC0262h0
        /* JADX INFO: renamed from: c */
        public boolean mo22c() {
            InterfaceC0238p interfaceC0238pMo21b;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            C0229g.b bVar = actionMenuItemView.f140i;
            return bVar != null && bVar.mo23a(actionMenuItemView.f137f) && (interfaceC0238pMo21b = mo21b()) != null && interfaceC0238pMo21b.mo921b();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.ActionMenuItemView$b */
    public static abstract class AbstractC0025b {
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f143l = m19e();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0184b.f1202c, 0, 0);
        this.f145n = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f147p = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f146o = -1;
        setSaveEnabled(false);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0032a
    /* JADX INFO: renamed from: a */
    public boolean mo15a() {
        return m17c();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0032a
    /* JADX INFO: renamed from: b */
    public boolean mo16b() {
        return m17c() && this.f137f.getIcon() == null;
    }

    /* JADX INFO: renamed from: c */
    public boolean m17c() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0236n.a
    /* JADX INFO: renamed from: d */
    public void mo18d(C0231i c0231i, int i) {
        this.f137f = c0231i;
        setIcon(c0231i.getIcon());
        setTitle(c0231i.getTitleCondensed());
        setId(c0231i.f1661a);
        setVisibility(c0231i.isVisible() ? 0 : 8);
        setEnabled(c0231i.isEnabled());
        if (c0231i.hasSubMenu() && this.f141j == null) {
            this.f141j = new C0024a();
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m19e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    /* JADX INFO: renamed from: f */
    public final void m20f() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f138g);
        if (this.f139h != null) {
            if (!((this.f137f.f1685y & 4) == 4) || (!this.f143l && !this.f144m)) {
                z = false;
            }
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.f138g : null);
        CharSequence charSequence = this.f137f.f1677q;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = z3 ? null : this.f137f.f1665e;
        }
        setContentDescription(charSequence);
        CharSequence charSequence2 = this.f137f.f1678r;
        if (TextUtils.isEmpty(charSequence2)) {
            C0183a.m756c(this, z3 ? null : this.f137f.f1665e);
        } else {
            C0183a.m756c(this, charSequence2);
        }
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0236n.a
    public C0231i getItemData() {
        return this.f137f;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C0229g.b bVar = this.f140i;
        if (bVar != null) {
            bVar.mo23a(this.f137f);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f143l = m19e();
        m20f();
    }

    @Override // p006b.p008b.p018i.C0297z, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        boolean zM17c = m17c();
        if (zM17c && (i3 = this.f146o) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, this.f145n) : this.f145n;
        if (mode != 1073741824 && this.f145n > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (zM17c || this.f139h == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f139h.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewOnTouchListenerC0262h0 abstractViewOnTouchListenerC0262h0;
        if (this.f137f.hasSubMenu() && (abstractViewOnTouchListenerC0262h0 = this.f141j) != null && abstractViewOnTouchListenerC0262h0.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f144m != z) {
            this.f144m = z;
            C0231i c0231i = this.f137f;
            if (c0231i != null) {
                c0231i.f1674n.m956p();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f139h = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f147p;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        m20f();
    }

    public void setItemInvoker(C0229g.b bVar) {
        this.f140i = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.f146o = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC0025b abstractC0025b) {
        this.f142k = abstractC0025b;
    }

    public void setTitle(CharSequence charSequence) {
        this.f138g = charSequence;
        m20f();
    }
}
