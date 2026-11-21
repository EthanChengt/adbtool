package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.didjdk.adbhelper.R;
import java.util.Objects;
import java.util.WeakHashMap;
import p006b.p008b.C0184b;
import p006b.p008b.p016h.p017i.C0231i;
import p006b.p008b.p016h.p017i.InterfaceC0236n;
import p006b.p008b.p018i.C0294x0;
import p006b.p032h.p044j.C0418m;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC0236n.a, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: b */
    public C0231i f151b;

    /* JADX INFO: renamed from: c */
    public ImageView f152c;

    /* JADX INFO: renamed from: d */
    public RadioButton f153d;

    /* JADX INFO: renamed from: e */
    public TextView f154e;

    /* JADX INFO: renamed from: f */
    public CheckBox f155f;

    /* JADX INFO: renamed from: g */
    public TextView f156g;

    /* JADX INFO: renamed from: h */
    public ImageView f157h;

    /* JADX INFO: renamed from: i */
    public ImageView f158i;

    /* JADX INFO: renamed from: j */
    public LinearLayout f159j;

    /* JADX INFO: renamed from: k */
    public Drawable f160k;

    /* JADX INFO: renamed from: l */
    public int f161l;

    /* JADX INFO: renamed from: m */
    public Context f162m;

    /* JADX INFO: renamed from: n */
    public boolean f163n;

    /* JADX INFO: renamed from: o */
    public Drawable f164o;

    /* JADX INFO: renamed from: p */
    public boolean f165p;

    /* JADX INFO: renamed from: q */
    public LayoutInflater f166q;

    /* JADX INFO: renamed from: r */
    public boolean f167r;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0294x0 c0294x0M1152q = C0294x0.m1152q(getContext(), attributeSet, C0184b.f1217r, R.attr.lm, 0);
        this.f160k = c0294x0M1152q.m1159g(5);
        this.f161l = c0294x0M1152q.m1164l(1, -1);
        this.f163n = c0294x0M1152q.m1153a(7, false);
        this.f162m = context;
        this.f164o = c0294x0M1152q.m1159g(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.g4, 0);
        this.f165p = typedArrayObtainStyledAttributes.hasValue(0);
        c0294x0M1152q.f2052b.recycle();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f166q == null) {
            this.f166q = LayoutInflater.from(getContext());
        }
        return this.f166q;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f157h;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m25a() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.o, (ViewGroup) this, false);
        this.f155f = checkBox;
        LinearLayout linearLayout = this.f159j;
        if (linearLayout != null) {
            linearLayout.addView(checkBox, -1);
        } else {
            addView(checkBox, -1);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f158i;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f158i.getLayoutParams();
        rect.top = this.f158i.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX INFO: renamed from: b */
    public final void m26b() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.r, (ViewGroup) this, false);
        this.f153d = radioButton;
        LinearLayout linearLayout = this.f159j;
        if (linearLayout != null) {
            linearLayout.addView(radioButton, -1);
        } else {
            addView(radioButton, -1);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m27c(boolean z) {
        int i;
        String string;
        int i2 = (z && this.f151b.m978n()) ? 0 : 8;
        if (i2 == 0) {
            TextView textView = this.f156g;
            C0231i c0231i = this.f151b;
            char cM969e = c0231i.m969e();
            if (cM969e == 0) {
                string = "";
            } else {
                Resources resources = c0231i.f1674n.f1630a.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(c0231i.f1674n.f1630a).hasPermanentMenuKey()) {
                    sb.append(resources.getString(R.string.r));
                }
                int i3 = c0231i.f1674n.mo954n() ? c0231i.f1671k : c0231i.f1669i;
                C0231i.m967c(sb, i3, 65536, resources.getString(R.string.n));
                C0231i.m967c(sb, i3, 4096, resources.getString(R.string.j));
                C0231i.m967c(sb, i3, 2, resources.getString(R.string.i));
                C0231i.m967c(sb, i3, 1, resources.getString(R.string.o));
                C0231i.m967c(sb, i3, 4, resources.getString(R.string.q));
                C0231i.m967c(sb, i3, 8, resources.getString(R.string.m));
                if (cM969e == '\b') {
                    i = R.string.k;
                } else if (cM969e != '\n') {
                    if (cM969e != ' ') {
                        sb.append(cM969e);
                    } else {
                        i = R.string.p;
                    }
                    string = sb.toString();
                } else {
                    i = R.string.l;
                }
                sb.append(resources.getString(i));
                string = sb.toString();
            }
            textView.setText(string);
        }
        if (this.f156g.getVisibility() != i2) {
            this.f156g.setVisibility(i2);
        }
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0236n.a
    /* JADX INFO: renamed from: d */
    public void mo18d(C0231i c0231i, int i) {
        this.f151b = c0231i;
        setVisibility(c0231i.isVisible() ? 0 : 8);
        setTitle(c0231i.f1665e);
        setCheckable(c0231i.isCheckable());
        boolean zM978n = c0231i.m978n();
        c0231i.m969e();
        m27c(zM978n);
        setIcon(c0231i.getIcon());
        setEnabled(c0231i.isEnabled());
        setSubMenuArrowVisible(c0231i.hasSubMenu());
        setContentDescription(c0231i.f1677q);
    }

    @Override // p006b.p008b.p016h.p017i.InterfaceC0236n.a
    public C0231i getItemData() {
        return this.f151b;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        Drawable drawable = this.f160k;
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        setBackground(drawable);
        TextView textView = (TextView) findViewById(R.id.p9);
        this.f154e = textView;
        int i = this.f161l;
        if (i != -1) {
            textView.setTextAppearance(this.f162m, i);
        }
        this.f156g = (TextView) findViewById(R.id.my);
        ImageView imageView = (ImageView) findViewById(R.id.nl);
        this.f157h = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f164o);
        }
        this.f158i = (ImageView) findViewById(R.id.fo);
        this.f159j = (LinearLayout) findViewById(R.id.d7);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f152c != null && this.f163n) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f152c.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (!z && this.f153d == null && this.f155f == null) {
            return;
        }
        if (this.f151b.m972h()) {
            if (this.f153d == null) {
                m26b();
            }
            compoundButton = this.f153d;
            compoundButton2 = this.f155f;
        } else {
            if (this.f155f == null) {
                m25a();
            }
            compoundButton = this.f155f;
            compoundButton2 = this.f153d;
        }
        if (z) {
            compoundButton.setChecked(this.f151b.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
                return;
            }
            compoundButton2.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f155f;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f153d;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f151b.m972h()) {
            if (this.f153d == null) {
                m26b();
            }
            compoundButton = this.f153d;
        } else {
            if (this.f155f == null) {
                m25a();
            }
            compoundButton = this.f155f;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f167r = z;
        this.f163n = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f158i;
        if (imageView != null) {
            imageView.setVisibility((this.f165p || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        Objects.requireNonNull(this.f151b.f1674n);
        boolean z = this.f167r;
        if (z || this.f163n) {
            ImageView imageView = this.f152c;
            if (imageView == null && drawable == null && !this.f163n) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.p, (ViewGroup) this, false);
                this.f152c = imageView2;
                LinearLayout linearLayout = this.f159j;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f163n) {
                this.f152c.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f152c;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f152c.getVisibility() != 0) {
                this.f152c.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        int i;
        TextView textView;
        if (charSequence != null) {
            this.f154e.setText(charSequence);
            if (this.f154e.getVisibility() == 0) {
                return;
            }
            textView = this.f154e;
            i = 0;
        } else {
            i = 8;
            if (this.f154e.getVisibility() == 8) {
                return;
            } else {
                textView = this.f154e;
            }
        }
        textView.setVisibility(i);
    }
}
