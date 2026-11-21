package p080c.p126d.p127a.p128a.p130b0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import com.didjdk.adbhelper.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import p006b.p032h.p044j.C0418m;
import p080c.p126d.p127a.p128a.C1161a;
import p080c.p126d.p127a.p128a.p131c.C1182a;

/* JADX INFO: renamed from: c.d.a.a.b0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1179o {

    /* JADX INFO: renamed from: a */
    public final Context f5630a;

    /* JADX INFO: renamed from: b */
    public final TextInputLayout f5631b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f5632c;

    /* JADX INFO: renamed from: d */
    public int f5633d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f5634e;

    /* JADX INFO: renamed from: f */
    public int f5635f;

    /* JADX INFO: renamed from: g */
    public Animator f5636g;

    /* JADX INFO: renamed from: h */
    public final float f5637h;

    /* JADX INFO: renamed from: i */
    public int f5638i;

    /* JADX INFO: renamed from: j */
    public int f5639j;

    /* JADX INFO: renamed from: k */
    public CharSequence f5640k;

    /* JADX INFO: renamed from: l */
    public boolean f5641l;

    /* JADX INFO: renamed from: m */
    public TextView f5642m;

    /* JADX INFO: renamed from: n */
    public int f5643n;

    /* JADX INFO: renamed from: o */
    public ColorStateList f5644o;

    /* JADX INFO: renamed from: p */
    public CharSequence f5645p;

    /* JADX INFO: renamed from: q */
    public boolean f5646q;

    /* JADX INFO: renamed from: r */
    public TextView f5647r;

    /* JADX INFO: renamed from: s */
    public int f5648s;

    /* JADX INFO: renamed from: t */
    public ColorStateList f5649t;

    /* JADX INFO: renamed from: u */
    public Typeface f5650u;

    /* JADX INFO: renamed from: c.d.a.a.b0.o$a */
    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f5651a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ TextView f5652b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f5653c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ TextView f5654d;

        public a(int i, TextView textView, int i2, TextView textView2) {
            this.f5651a = i;
            this.f5652b = textView;
            this.f5653c = i2;
            this.f5654d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            TextView textView;
            C1179o c1179o = C1179o.this;
            c1179o.f5638i = this.f5651a;
            c1179o.f5636g = null;
            TextView textView2 = this.f5652b;
            if (textView2 != null) {
                textView2.setVisibility(4);
                if (this.f5653c == 1 && (textView = C1179o.this.f5642m) != null) {
                    textView.setText((CharSequence) null);
                }
                TextView textView3 = this.f5654d;
                if (textView3 != null) {
                    textView3.setTranslationY(0.0f);
                    this.f5654d.setAlpha(1.0f);
                }
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f5654d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public C1179o(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f5630a = context;
        this.f5631b = textInputLayout;
        this.f5637h = context.getResources().getDimensionPixelSize(R.dimen.d1);
    }

    /* JADX INFO: renamed from: a */
    public void m2751a(TextView textView, int i) {
        if (this.f5632c == null && this.f5634e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f5630a);
            this.f5632c = linearLayout;
            linearLayout.setOrientation(0);
            this.f5631b.addView(this.f5632c, -1, -2);
            FrameLayout frameLayout = new FrameLayout(this.f5630a);
            this.f5634e = frameLayout;
            this.f5632c.addView(frameLayout, -1, new FrameLayout.LayoutParams(-2, -2));
            this.f5632c.addView(new Space(this.f5630a), new LinearLayout.LayoutParams(0, 0, 1.0f));
            if (this.f5631b.getEditText() != null) {
                m2752b();
            }
        }
        if (i == 0 || i == 1) {
            this.f5634e.setVisibility(0);
            this.f5634e.addView(textView);
            this.f5635f++;
        } else {
            this.f5632c.addView(textView, i);
        }
        this.f5632c.setVisibility(0);
        this.f5633d++;
    }

    /* JADX INFO: renamed from: b */
    public void m2752b() {
        if ((this.f5632c == null || this.f5631b.getEditText() == null) ? false : true) {
            LinearLayout linearLayout = this.f5632c;
            EditText editText = this.f5631b.getEditText();
            WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
            linearLayout.setPaddingRelative(editText.getPaddingStart(), 0, this.f5631b.getEditText().getPaddingEnd(), 0);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m2753c() {
        Animator animator = this.f5636g;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2754d(List<Animator> list, boolean z, TextView textView, int i, int i2, int i3) {
        if (textView == null || !z) {
            return;
        }
        if (i == i3 || i == i2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, i3 == i ? 1.0f : 0.0f);
            objectAnimatorOfFloat.setDuration(167L);
            objectAnimatorOfFloat.setInterpolator(C1182a.f5662a);
            list.add(objectAnimatorOfFloat);
            if (i3 == i) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f5637h, 0.0f);
                objectAnimatorOfFloat2.setDuration(217L);
                objectAnimatorOfFloat2.setInterpolator(C1182a.f5665d);
                list.add(objectAnimatorOfFloat2);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m2755e() {
        return (this.f5639j != 1 || this.f5642m == null || TextUtils.isEmpty(this.f5640k)) ? false : true;
    }

    /* JADX INFO: renamed from: f */
    public final TextView m2756f(int i) {
        if (i == 1) {
            return this.f5642m;
        }
        if (i != 2) {
            return null;
        }
        return this.f5647r;
    }

    /* JADX INFO: renamed from: g */
    public int m2757g() {
        TextView textView = this.f5642m;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* JADX INFO: renamed from: h */
    public void m2758h() {
        this.f5640k = null;
        m2753c();
        if (this.f5638i == 1) {
            this.f5639j = (!this.f5646q || TextUtils.isEmpty(this.f5645p)) ? 0 : 2;
        }
        m2761k(this.f5638i, this.f5639j, m2760j(this.f5642m, null));
    }

    /* JADX INFO: renamed from: i */
    public void m2759i(TextView textView, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f5632c;
        if (linearLayout == null) {
            return;
        }
        if (!(i == 0 || i == 1) || (frameLayout = this.f5634e) == null) {
            linearLayout.removeView(textView);
        } else {
            int i2 = this.f5635f - 1;
            this.f5635f = i2;
            if (i2 == 0) {
                frameLayout.setVisibility(8);
            }
            this.f5634e.removeView(textView);
        }
        int i3 = this.f5633d - 1;
        this.f5633d = i3;
        LinearLayout linearLayout2 = this.f5632c;
        if (i3 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m2760j(TextView textView, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.f5631b;
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        return textInputLayout.isLaidOut() && this.f5631b.isEnabled() && !(this.f5639j == this.f5638i && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    /* JADX INFO: renamed from: k */
    public final void m2761k(int i, int i2, boolean z) {
        TextView textViewM2756f;
        TextView textViewM2756f2;
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f5636g = animatorSet;
            ArrayList arrayList = new ArrayList();
            m2754d(arrayList, this.f5646q, this.f5647r, 2, i, i2);
            m2754d(arrayList, this.f5641l, this.f5642m, 1, i, i2);
            C1161a.m2734s(animatorSet, arrayList);
            animatorSet.addListener(new a(i2, m2756f(i), i, m2756f(i2)));
            animatorSet.start();
        } else if (i != i2) {
            if (i2 != 0 && (textViewM2756f2 = m2756f(i2)) != null) {
                textViewM2756f2.setVisibility(0);
                textViewM2756f2.setAlpha(1.0f);
            }
            if (i != 0 && (textViewM2756f = m2756f(i)) != null) {
                textViewM2756f.setVisibility(4);
                if (i == 1) {
                    textViewM2756f.setText((CharSequence) null);
                }
            }
            this.f5638i = i2;
        }
        this.f5631b.m3186s();
        this.f5631b.m3189v(z, false);
        this.f5631b.m3190w();
    }
}
