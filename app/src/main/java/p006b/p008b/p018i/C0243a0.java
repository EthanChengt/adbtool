package p006b.p008b.p018i;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: b.b.i.a0 */
/* JADX INFO: loaded from: classes.dex */
public class C0243a0 {

    /* JADX INFO: renamed from: k */
    public static final RectF f1749k = new RectF();

    /* JADX INFO: renamed from: l */
    public static ConcurrentHashMap<String, Method> f1750l = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: m */
    public static ConcurrentHashMap<String, Field> f1751m = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a */
    public int f1752a = 0;

    /* JADX INFO: renamed from: b */
    public boolean f1753b = false;

    /* JADX INFO: renamed from: c */
    public float f1754c = -1.0f;

    /* JADX INFO: renamed from: d */
    public float f1755d = -1.0f;

    /* JADX INFO: renamed from: e */
    public float f1756e = -1.0f;

    /* JADX INFO: renamed from: f */
    public int[] f1757f = new int[0];

    /* JADX INFO: renamed from: g */
    public boolean f1758g = false;

    /* JADX INFO: renamed from: h */
    public TextPaint f1759h;

    /* JADX INFO: renamed from: i */
    public final TextView f1760i;

    /* JADX INFO: renamed from: j */
    public final Context f1761j;

    public C0243a0(TextView textView) {
        this.f1760i = textView;
        this.f1761j = textView.getContext();
    }

    /* JADX INFO: renamed from: d */
    public static Method m1001d(String str) {
        try {
            Method declaredMethod = f1750l.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                declaredMethod.setAccessible(true);
                f1750l.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static <T> T m1002e(Object obj, String str, T t) {
        try {
            return (T) m1001d(str).invoke(obj, new Object[0]);
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            return t;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m1003a() {
        if (m1009i() && this.f1752a != 0) {
            if (this.f1753b) {
                if (this.f1760i.getMeasuredHeight() <= 0 || this.f1760i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = Build.VERSION.SDK_INT >= 29 ? this.f1760i.isHorizontallyScrollable() : ((Boolean) m1002e(this.f1760i, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue() ? 1048576 : (this.f1760i.getMeasuredWidth() - this.f1760i.getTotalPaddingLeft()) - this.f1760i.getTotalPaddingRight();
                int height = (this.f1760i.getHeight() - this.f1760i.getCompoundPaddingBottom()) - this.f1760i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f1749k;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float fM1005c = m1005c(rectF);
                    if (fM1005c != this.f1760i.getTextSize()) {
                        m1006f(0, fM1005c);
                    }
                }
            }
            this.f1753b = true;
        }
    }

    /* JADX INFO: renamed from: b */
    public final int[] m1004b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0128  */
    /* JADX INFO: renamed from: c */
    public final int m1005c(RectF rectF) {
        byte b2;
        StaticLayout staticLayout;
        boolean z;
        TextDirectionHeuristic textDirectionHeuristic;
        CharSequence transformation;
        int length = this.f1757f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i = length - 1;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i3 <= i) {
            int i5 = (i3 + i) / 2;
            int i6 = this.f1757f[i5];
            CharSequence text = this.f1760i.getText();
            TransformationMethod transformationMethod = this.f1760i.getTransformationMethod();
            if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f1760i)) != null) {
                text = transformation;
            }
            int i7 = Build.VERSION.SDK_INT;
            int maxLines = this.f1760i.getMaxLines();
            TextPaint textPaint = this.f1759h;
            if (textPaint == null) {
                this.f1759h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f1759h.set(this.f1760i.getPaint());
            this.f1759h.setTextSize(i6);
            Layout.Alignment alignment = (Layout.Alignment) m1002e(this.f1760i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
            int iRound = Math.round(rectF.right);
            if (i7 >= 23) {
                StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(text, i2, text.length(), this.f1759h, iRound);
                builderObtain.setAlignment(alignment).setLineSpacing(this.f1760i.getLineSpacingExtra(), this.f1760i.getLineSpacingMultiplier()).setIncludePad(this.f1760i.getIncludeFontPadding()).setBreakStrategy(this.f1760i.getBreakStrategy()).setHyphenationFrequency(this.f1760i.getHyphenationFrequency()).setMaxLines(maxLines == -1 ? Integer.MAX_VALUE : maxLines);
                if (i7 >= 29) {
                    try {
                        textDirectionHeuristic = this.f1760i.getTextDirectionHeuristic();
                    } catch (ClassCastException unused) {
                        Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
                    }
                } else {
                    textDirectionHeuristic = (TextDirectionHeuristic) m1002e(this.f1760i, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR);
                }
                builderObtain.setTextDirection(textDirectionHeuristic);
                staticLayout = builderObtain.build();
                b2 = -1;
            } else {
                b2 = -1;
                staticLayout = new StaticLayout(text, this.f1759h, iRound, alignment, this.f1760i.getLineSpacingMultiplier(), this.f1760i.getLineSpacingExtra(), this.f1760i.getIncludeFontPadding());
            }
            if (maxLines != b2 && (staticLayout.getLineCount() > maxLines || staticLayout.getLineEnd(staticLayout.getLineCount() - 1) != text.length())) {
                z = false;
            } else if (staticLayout.getHeight() > rectF.bottom) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                int i8 = i5 + 1;
                i2 = 0;
                i4 = i3;
                i3 = i8;
            } else {
                i4 = i5 - 1;
                i = i4;
                i2 = 0;
            }
        }
        return this.f1757f[i4];
    }

    /* JADX INFO: renamed from: f */
    public void m1006f(int i, float f) {
        Context context = this.f1761j;
        float fApplyDimension = TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        if (fApplyDimension != this.f1760i.getPaint().getTextSize()) {
            this.f1760i.getPaint().setTextSize(fApplyDimension);
            boolean zIsInLayout = this.f1760i.isInLayout();
            if (this.f1760i.getLayout() != null) {
                this.f1753b = false;
                try {
                    Method methodM1001d = m1001d("nullLayouts");
                    if (methodM1001d != null) {
                        methodM1001d.invoke(this.f1760i, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (zIsInLayout) {
                    this.f1760i.forceLayout();
                } else {
                    this.f1760i.requestLayout();
                }
                this.f1760i.invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m1007g() {
        if (m1009i() && this.f1752a == 1) {
            if (!this.f1758g || this.f1757f.length == 0) {
                int iFloor = ((int) Math.floor((this.f1756e - this.f1755d) / this.f1754c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i = 0; i < iFloor; i++) {
                    iArr[i] = Math.round((i * this.f1754c) + this.f1755d);
                }
                this.f1757f = m1004b(iArr);
            }
            this.f1753b = true;
        } else {
            this.f1753b = false;
        }
        return this.f1753b;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m1008h() {
        int[] iArr = this.f1757f;
        int length = iArr.length;
        boolean z = length > 0;
        this.f1758g = z;
        if (z) {
            this.f1752a = 1;
            this.f1755d = iArr[0];
            this.f1756e = iArr[length - 1];
            this.f1754c = -1.0f;
        }
        return z;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m1009i() {
        return !(this.f1760i instanceof C0267k);
    }

    /* JADX INFO: renamed from: j */
    public final void m1010j(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        }
        if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
        this.f1752a = 1;
        this.f1755d = f;
        this.f1756e = f2;
        this.f1754c = f3;
        this.f1758g = false;
    }
}
