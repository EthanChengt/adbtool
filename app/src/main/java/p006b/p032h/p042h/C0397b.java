package p006b.p032h.p042h;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import java.util.Objects;
import c.a.a.a.a;

/* JADX INFO: renamed from: b.h.h.b */
/* JADX INFO: loaded from: classes.dex */
public class C0397b implements Spannable {

    /* JADX INFO: renamed from: b.h.h.b$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final TextPaint f2682a;

        /* JADX INFO: renamed from: b */
        public final TextDirectionHeuristic f2683b;

        /* JADX INFO: renamed from: c */
        public final int f2684c;

        /* JADX INFO: renamed from: d */
        public final int f2685d;

        public a(PrecomputedText.Params params) {
            this.f2682a = params.getTextPaint();
            this.f2683b = params.getTextDirection();
            this.f2684c = params.getBreakStrategy();
            this.f2685d = params.getHyphenationFrequency();
        }

        public a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            this.f2682a = textPaint;
            this.f2683b = textDirectionHeuristic;
            this.f2684c = i;
            this.f2685d = i2;
        }

        /* JADX INFO: renamed from: a */
        public boolean m1531a(a aVar) {
            int i = Build.VERSION.SDK_INT;
            if ((i >= 23 && (this.f2684c != aVar.f2684c || this.f2685d != aVar.f2685d)) || this.f2682a.getTextSize() != aVar.f2682a.getTextSize() || this.f2682a.getTextScaleX() != aVar.f2682a.getTextScaleX() || this.f2682a.getTextSkewX() != aVar.f2682a.getTextSkewX()) {
                return false;
            }
            if ((i >= 21 && (this.f2682a.getLetterSpacing() != aVar.f2682a.getLetterSpacing() || !TextUtils.equals(this.f2682a.getFontFeatureSettings(), aVar.f2682a.getFontFeatureSettings()))) || this.f2682a.getFlags() != aVar.f2682a.getFlags()) {
                return false;
            }
            if (i >= 24) {
                if (!this.f2682a.getTextLocales().equals(aVar.f2682a.getTextLocales())) {
                    return false;
                }
            } else if (!this.f2682a.getTextLocale().equals(aVar.f2682a.getTextLocale())) {
                return false;
            }
            if (this.f2682a.getTypeface() == null) {
                return aVar.f2682a.getTypeface() == null;
            }
            return this.f2682a.getTypeface().equals(aVar.f2682a.getTypeface());
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return m1531a(aVar) && this.f2683b == aVar.f2683b;
        }

        public int hashCode() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                return Objects.hash(Float.valueOf(this.f2682a.getTextSize()), Float.valueOf(this.f2682a.getTextScaleX()), Float.valueOf(this.f2682a.getTextSkewX()), Float.valueOf(this.f2682a.getLetterSpacing()), Integer.valueOf(this.f2682a.getFlags()), this.f2682a.getTextLocales(), this.f2682a.getTypeface(), Boolean.valueOf(this.f2682a.isElegantTextHeight()), this.f2683b, Integer.valueOf(this.f2684c), Integer.valueOf(this.f2685d));
            }
            return i >= 21 ? Objects.hash(Float.valueOf(this.f2682a.getTextSize()), Float.valueOf(this.f2682a.getTextScaleX()), Float.valueOf(this.f2682a.getTextSkewX()), Float.valueOf(this.f2682a.getLetterSpacing()), Integer.valueOf(this.f2682a.getFlags()), this.f2682a.getTextLocale(), this.f2682a.getTypeface(), Boolean.valueOf(this.f2682a.isElegantTextHeight()), this.f2683b, Integer.valueOf(this.f2684c), Integer.valueOf(this.f2685d)) : Objects.hash(Float.valueOf(this.f2682a.getTextSize()), Float.valueOf(this.f2682a.getTextScaleX()), Float.valueOf(this.f2682a.getTextSkewX()), Integer.valueOf(this.f2682a.getFlags()), this.f2682a.getTextLocale(), this.f2682a.getTypeface(), this.f2683b, Integer.valueOf(this.f2684c), Integer.valueOf(this.f2685d));
        }

        public String toString() {
            StringBuilder sbM2191e;
            Object textLocale;
            StringBuilder sb = new StringBuilder("{");
            StringBuilder sbM2191e2 = a.m2191e("textSize=");
            sbM2191e2.append(this.f2682a.getTextSize());
            sb.append(sbM2191e2.toString());
            sb.append(", textScaleX=" + this.f2682a.getTextScaleX());
            sb.append(", textSkewX=" + this.f2682a.getTextSkewX());
            int i = Build.VERSION.SDK_INT;
            if (i >= 21) {
                StringBuilder sbM2191e3 = a.m2191e(", letterSpacing=");
                sbM2191e3.append(this.f2682a.getLetterSpacing());
                sb.append(sbM2191e3.toString());
                sb.append(", elegantTextHeight=" + this.f2682a.isElegantTextHeight());
            }
            if (i >= 24) {
                sbM2191e = a.m2191e(", textLocale=");
                textLocale = this.f2682a.getTextLocales();
            } else {
                sbM2191e = a.m2191e(", textLocale=");
                textLocale = this.f2682a.getTextLocale();
            }
            sbM2191e.append(textLocale);
            sb.append(sbM2191e.toString());
            StringBuilder sbM2191e4 = a.m2191e(", typeface=");
            sbM2191e4.append(this.f2682a.getTypeface());
            sb.append(sbM2191e4.toString());
            if (i >= 26) {
                StringBuilder sbM2191e5 = a.m2191e(", variationSettings=");
                sbM2191e5.append(this.f2682a.getFontVariationSettings());
                sb.append(sbM2191e5.toString());
            }
            StringBuilder sbM2191e6 = a.m2191e(", textDir=");
            sbM2191e6.append(this.f2683b);
            sb.append(sbM2191e6.toString());
            sb.append(", breakStrategy=" + this.f2684c);
            sb.append(", hyphenationFrequency=" + this.f2685d);
            sb.append("}");
            return sb.toString();
        }
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        throw null;
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        throw null;
    }

    @Override // java.lang.CharSequence
    public int length() {
        throw null;
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        throw null;
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (!(obj instanceof MetricAffectingSpan)) {
            throw null;
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (!(obj instanceof MetricAffectingSpan)) {
            throw null;
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        throw null;
    }

    @Override // java.lang.CharSequence
    public String toString() {
        throw null;
    }
}
