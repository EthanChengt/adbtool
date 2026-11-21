package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import java.nio.charset.Charset;
import java.util.Objects;
import p006b.p077y.AbstractC0609a;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Code duplicated, block: B:20:0x007d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0082  */
    public static IconCompat read(AbstractC0609a abstractC0609a) {
        Object str;
        IconCompat iconCompat = new IconCompat();
        iconCompat.f574a = abstractC0609a.m2173k(iconCompat.f574a, 1);
        byte[] bArrMo2169g = iconCompat.f576c;
        if (abstractC0609a.mo2171i(2)) {
            bArrMo2169g = abstractC0609a.mo2169g();
        }
        iconCompat.f576c = bArrMo2169g;
        iconCompat.f577d = abstractC0609a.m2175m(iconCompat.f577d, 3);
        iconCompat.f578e = abstractC0609a.m2173k(iconCompat.f578e, 4);
        iconCompat.f579f = abstractC0609a.m2173k(iconCompat.f579f, 5);
        iconCompat.f580g = (ColorStateList) abstractC0609a.m2175m(iconCompat.f580g, 6);
        String strMo2176n = iconCompat.f582i;
        if (abstractC0609a.mo2171i(7)) {
            strMo2176n = abstractC0609a.mo2176n();
        }
        iconCompat.f582i = strMo2176n;
        iconCompat.f581h = PorterDuff.Mode.valueOf(strMo2176n);
        int i = iconCompat.f574a;
        if (i != -1) {
            if (i == 1) {
                str = iconCompat.f577d;
                if (str != null) {
                    byte[] bArr = iconCompat.f576c;
                    iconCompat.f575b = bArr;
                    iconCompat.f574a = 3;
                    iconCompat.f578e = 0;
                    iconCompat.f579f = bArr.length;
                }
            } else {
                if (i != 2) {
                    if (i == 3) {
                        iconCompat.f575b = iconCompat.f576c;
                    } else if (i != 4) {
                        if (i == 5) {
                            str = iconCompat.f577d;
                            if (str != null) {
                                byte[] bArr2 = iconCompat.f576c;
                                iconCompat.f575b = bArr2;
                                iconCompat.f574a = 3;
                                iconCompat.f578e = 0;
                                iconCompat.f579f = bArr2.length;
                            }
                        }
                    }
                }
                str = new String(iconCompat.f576c, Charset.forName("UTF-16"));
            }
            return iconCompat;
        }
        str = iconCompat.f577d;
        if (str == null) {
            throw new IllegalArgumentException("Invalid icon");
        }
        iconCompat.f575b = str;
        return iconCompat;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0049  */
    public static void write(IconCompat iconCompat, AbstractC0609a abstractC0609a) {
        Objects.requireNonNull(abstractC0609a);
        iconCompat.f582i = iconCompat.f581h.name();
        int i = iconCompat.f574a;
        if (i == -1 || i == 1) {
            iconCompat.f577d = (Parcelable) iconCompat.f575b;
        } else if (i == 2) {
            iconCompat.f576c = ((String) iconCompat.f575b).getBytes(Charset.forName("UTF-16"));
        } else if (i == 3) {
            iconCompat.f576c = (byte[]) iconCompat.f575b;
        } else if (i == 4) {
            iconCompat.f576c = iconCompat.f575b.toString().getBytes(Charset.forName("UTF-16"));
        } else if (i == 5) {
            iconCompat.f577d = (Parcelable) iconCompat.f575b;
        }
        int i2 = iconCompat.f574a;
        if (-1 != i2) {
            abstractC0609a.mo2178p(1);
            abstractC0609a.mo2182t(i2);
        }
        byte[] bArr = iconCompat.f576c;
        if (bArr != null) {
            abstractC0609a.mo2178p(2);
            abstractC0609a.mo2180r(bArr);
        }
        Parcelable parcelable = iconCompat.f577d;
        if (parcelable != null) {
            abstractC0609a.mo2178p(3);
            abstractC0609a.mo2183u(parcelable);
        }
        int i3 = iconCompat.f578e;
        if (i3 != 0) {
            abstractC0609a.mo2178p(4);
            abstractC0609a.mo2182t(i3);
        }
        int i4 = iconCompat.f579f;
        if (i4 != 0) {
            abstractC0609a.mo2178p(5);
            abstractC0609a.mo2182t(i4);
        }
        ColorStateList colorStateList = iconCompat.f580g;
        if (colorStateList != null) {
            abstractC0609a.mo2178p(6);
            abstractC0609a.mo2183u(colorStateList);
        }
        String str = iconCompat.f582i;
        if (str != null) {
            abstractC0609a.mo2178p(7);
            abstractC0609a.mo2184v(str);
        }
    }
}
