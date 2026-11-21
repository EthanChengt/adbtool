package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import com.didjdk.adbhelper.R;
import p006b.p067s.C0534l;
import p006b.p067s.C0536n;

/* JADX INFO: loaded from: classes.dex */
public class SeekBarPreference extends Preference {

    /* JADX INFO: renamed from: N */
    public int f818N;

    /* JADX INFO: renamed from: O */
    public int f819O;

    /* JADX INFO: renamed from: P */
    public int f820P;

    /* JADX INFO: renamed from: Q */
    public int f821Q;

    /* JADX INFO: renamed from: R */
    public boolean f822R;

    /* JADX INFO: renamed from: S */
    public SeekBar f823S;

    /* JADX INFO: renamed from: T */
    public TextView f824T;

    /* JADX INFO: renamed from: U */
    public boolean f825U;

    /* JADX INFO: renamed from: V */
    public boolean f826V;

    /* JADX INFO: renamed from: W */
    public boolean f827W;

    /* JADX INFO: renamed from: X */
    public SeekBar.OnSeekBarChangeListener f828X;

    /* JADX INFO: renamed from: Y */
    public View.OnKeyListener f829Y;

    /* JADX INFO: renamed from: androidx.preference.SeekBarPreference$a */
    public class C0109a implements SeekBar.OnSeekBarChangeListener {
        public C0109a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if (seekBarPreference.f827W || !seekBarPreference.f822R) {
                    int progress = seekBar.getProgress() + seekBarPreference.f819O;
                    if (progress != seekBarPreference.f818N) {
                        seekBarPreference.m398H(progress, false);
                        return;
                    }
                    return;
                }
            }
            SeekBarPreference seekBarPreference2 = SeekBarPreference.this;
            seekBarPreference2.m399I(i + seekBarPreference2.f819O);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f822R = true;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            int progress;
            SeekBarPreference.this.f822R = false;
            int progress2 = seekBar.getProgress();
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            int i = seekBarPreference.f819O;
            if (progress2 + i == seekBarPreference.f818N || (progress = seekBar.getProgress() + i) == seekBarPreference.f818N) {
                return;
            }
            seekBarPreference.m398H(progress, false);
        }
    }

    /* JADX INFO: renamed from: androidx.preference.SeekBarPreference$b */
    public class ViewOnKeyListenerC0110b implements View.OnKeyListener {
        public ViewOnKeyListenerC0110b() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if ((!seekBarPreference.f825U && (i == 21 || i == 22)) || i == 23 || i == 66) {
                return false;
            }
            SeekBar seekBar = seekBarPreference.f823S;
            if (seekBar != null) {
                return seekBar.onKeyDown(i, keyEvent);
            }
            Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.preference.SeekBarPreference$c */
    public static class C0111c extends Preference.C0103b {
        public static final Parcelable.Creator<C0111c> CREATOR = new a();

        /* JADX INFO: renamed from: b */
        public int f832b;

        /* JADX INFO: renamed from: c */
        public int f833c;

        /* JADX INFO: renamed from: d */
        public int f834d;

        /* JADX INFO: renamed from: androidx.preference.SeekBarPreference$c$a */
        public static class a implements Parcelable.Creator<C0111c> {
            @Override // android.os.Parcelable.Creator
            public C0111c createFromParcel(Parcel parcel) {
                return new C0111c(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public C0111c[] newArray(int i) {
                return new C0111c[i];
            }
        }

        public C0111c(Parcel parcel) {
            super(parcel);
            this.f832b = parcel.readInt();
            this.f833c = parcel.readInt();
            this.f834d = parcel.readInt();
        }

        public C0111c(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f832b);
            parcel.writeInt(this.f833c);
            parcel.writeInt(this.f834d);
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ob, 0);
        this.f828X = new C0109a();
        this.f829Y = new ViewOnKeyListenerC0110b();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0536n.f3302k, R.attr.ob, 0);
        this.f819O = typedArrayObtainStyledAttributes.getInt(3, 0);
        int i = typedArrayObtainStyledAttributes.getInt(1, 100);
        int i2 = this.f819O;
        i = i < i2 ? i2 : i;
        if (i != this.f820P) {
            this.f820P = i;
            mo356l();
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(4, 0);
        if (i3 != this.f821Q) {
            this.f821Q = Math.min(this.f820P - this.f819O, Math.abs(i3));
            mo356l();
        }
        this.f825U = typedArrayObtainStyledAttributes.getBoolean(2, true);
        this.f826V = typedArrayObtainStyledAttributes.getBoolean(5, false);
        this.f827W = typedArrayObtainStyledAttributes.getBoolean(6, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: H */
    public final void m398H(int i, boolean z) {
        int i2 = this.f819O;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.f820P;
        if (i > i3) {
            i = i3;
        }
        if (i != this.f818N) {
            this.f818N = i;
            m399I(i);
            if (m373G() && i != m378e(i ^ (-1))) {
                m381h();
                SharedPreferences.Editor editorM1941b = this.f784c.m1941b();
                editorM1941b.putInt(this.f793l, i);
                if (!this.f784c.f3279e) {
                    editorM1941b.apply();
                }
            }
            if (z) {
                mo356l();
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public void m399I(int i) {
        TextView textView = this.f824T;
        if (textView != null) {
            textView.setText(String.valueOf(i));
        }
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: p */
    public void mo353p(C0534l c0534l) {
        super.mo353p(c0534l);
        c0534l.f927a.setOnKeyListener(this.f829Y);
        this.f823S = (SeekBar) c0534l.m1944w(R.id.ms);
        TextView textView = (TextView) c0534l.m1944w(R.id.mt);
        this.f824T = textView;
        if (this.f826V) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.f824T = null;
        }
        SeekBar seekBar = this.f823S;
        if (seekBar == null) {
            Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.f828X);
        this.f823S.setMax(this.f820P - this.f819O);
        int i = this.f821Q;
        if (i != 0) {
            this.f823S.setKeyProgressIncrement(i);
        } else {
            this.f821Q = this.f823S.getKeyProgressIncrement();
        }
        this.f823S.setProgress(this.f818N - this.f819O);
        m399I(this.f818N);
        this.f823S.setEnabled(mo383k());
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: t */
    public Object mo359t(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: w */
    public void mo360w(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C0111c.class)) {
            super.mo360w(parcelable);
            return;
        }
        C0111c c0111c = (C0111c) parcelable;
        super.mo360w(c0111c.getSuperState());
        this.f818N = c0111c.f832b;
        this.f819O = c0111c.f833c;
        this.f820P = c0111c.f834d;
        mo356l();
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: x */
    public Parcelable mo361x() {
        Parcelable parcelableMo361x = super.mo361x();
        if (this.f799r) {
            return parcelableMo361x;
        }
        C0111c c0111c = new C0111c(parcelableMo361x);
        c0111c.f832b = this.f818N;
        c0111c.f833c = this.f819O;
        c0111c.f834d = this.f820P;
        return c0111c;
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: y */
    public void mo362y(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        m398H(m378e(((Integer) obj).intValue()), true);
    }
}
