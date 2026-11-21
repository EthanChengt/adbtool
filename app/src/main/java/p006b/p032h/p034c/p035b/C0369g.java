package p006b.p032h.p034c.p035b;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p006b.p032h.p033b.C0360f;
import p006b.p032h.p036d.C0372c;
import c.a.a.a.a;

/* JADX INFO: renamed from: b.h.c.b.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0369g {

    /* JADX INFO: renamed from: b.h.c.b.g$a */
    public static abstract class a {

        /* JADX INFO: renamed from: b.h.c.b.g$a$a, reason: collision with other inner class name */
        public class RunnableC1392a implements Runnable {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Typeface f2587b;

            public RunnableC1392a(Typeface typeface) {
                this.f2587b = typeface;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.mo1179d(this.f2587b);
            }
        }

        /* JADX INFO: renamed from: b.h.c.b.g$a$b */
        public class b implements Runnable {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ int f2589b;

            public b(int i) {
                this.f2589b = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.mo1178c(this.f2589b);
            }
        }

        /* JADX INFO: renamed from: a */
        public final void m1485a(int i, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new b(i));
        }

        /* JADX INFO: renamed from: b */
        public final void m1486b(Typeface typeface, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new RunnableC1392a(typeface));
        }

        /* JADX INFO: renamed from: c */
        public abstract void mo1178c(int i);

        /* JADX INFO: renamed from: d */
        public abstract void mo1179d(Typeface typeface);
    }

    /* JADX INFO: renamed from: a */
    public static int m1474a(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i2;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1475b(TypedArray typedArray, int i, int i2, boolean z) {
        return typedArray.getBoolean(i, typedArray.getBoolean(i2, z));
    }

    /* JADX INFO: renamed from: c */
    public static Drawable m1476c(Resources resources, int i, Resources.Theme theme) {
        return Build.VERSION.SDK_INT >= 21 ? resources.getDrawable(i, theme) : resources.getDrawable(i);
    }

    /* JADX INFO: renamed from: d */
    public static C0363a m1477d(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i, int i2) {
        C0363a c0363aM1470a;
        if (m1482i(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return new C0363a(null, null, typedValue.data);
            }
            try {
                c0363aM1470a = C0363a.m1470a(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception e) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                c0363aM1470a = null;
            }
            if (c0363aM1470a != null) {
                return c0363aM1470a;
            }
        }
        return new C0363a(null, null, i2);
    }

    /* JADX INFO: renamed from: e */
    public static String m1478e(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (m1482i(xmlPullParser, str)) {
            return typedArray.getString(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static int m1479f(TypedArray typedArray, int i, int i2, int i3) {
        return typedArray.getResourceId(i, typedArray.getResourceId(i2, i3));
    }

    /* JADX INFO: renamed from: g */
    public static String m1480g(TypedArray typedArray, int i, int i2) {
        String string = typedArray.getString(i);
        return string == null ? typedArray.getString(i2) : string;
    }

    /* JADX INFO: renamed from: h */
    public static CharSequence[] m1481h(TypedArray typedArray, int i, int i2) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        return textArray == null ? typedArray.getTextArray(i2) : textArray;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m1482i(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a4  */
    /* JADX INFO: renamed from: j */
    public static Typeface m1483j(Context context, int i, TypedValue typedValue, int i2, a aVar, Handler handler, boolean z) {
        StringBuilder sb;
        String str;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            StringBuilder sbM2191e = a.m2191e("Resource \"");
            sbM2191e.append(resources.getResourceName(i));
            sbM2191e.append("\" (");
            sbM2191e.append(Integer.toHexString(i));
            sbM2191e.append(") is not a Font: ");
            sbM2191e.append(typedValue);
            throw new Resources.NotFoundException(sbM2191e.toString());
        }
        String string = charSequence.toString();
        Typeface typefaceM1492a = null;
        if (string.startsWith("res/")) {
            Typeface typefaceM1258a = C0372c.f2594b.m1258a(C0372c.m1494c(resources, i, i2));
            if (typefaceM1258a == null) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        InterfaceC0364b interfaceC0364bM1419K = C0360f.m1419K(resources.getXml(i), resources);
                        if (interfaceC0364bM1419K == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (aVar != null) {
                                aVar.m1485a(-3, handler);
                            }
                        } else {
                            typefaceM1492a = C0372c.m1492a(context, interfaceC0364bM1419K, resources, i, i2, aVar, handler, z);
                        }
                    } else {
                        typefaceM1258a = C0372c.m1493b(context, resources, i, string, i2);
                        if (aVar != null) {
                            if (typefaceM1258a != null) {
                                aVar.m1486b(typefaceM1258a, handler);
                            } else {
                                aVar.m1485a(-3, handler);
                            }
                        }
                    }
                } catch (IOException e) {
                    e = e;
                    sb = new StringBuilder();
                    str = "Failed to read xml resource ";
                    sb.append(str);
                    sb.append(string);
                    Log.e("ResourcesCompat", sb.toString(), e);
                    if (aVar != null) {
                        aVar.m1485a(-3, handler);
                    }
                } catch (XmlPullParserException e2) {
                    e = e2;
                    sb = new StringBuilder();
                    str = "Failed to parse xml resource ";
                    sb.append(str);
                    sb.append(string);
                    Log.e("ResourcesCompat", sb.toString(), e);
                    if (aVar != null) {
                        aVar.m1485a(-3, handler);
                    }
                }
            } else if (aVar != null) {
                aVar.m1486b(typefaceM1258a, handler);
            }
            typefaceM1492a = typefaceM1258a;
        } else if (aVar != null) {
            aVar.m1485a(-3, handler);
        }
        if (typefaceM1492a != null || aVar != null) {
            return typefaceM1492a;
        }
        StringBuilder sbM2191e2 = a.m2191e("Font resource ID #0x");
        sbM2191e2.append(Integer.toHexString(i));
        sbM2191e2.append(" could not be retrieved.");
        throw new Resources.NotFoundException(sbM2191e2.toString());
    }

    /* JADX INFO: renamed from: k */
    public static TypedArray m1484k(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
