package p006b.p032h.p034c.p035b;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Xml;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;
import p006b.p032h.C0354a;
import p006b.p032h.p033b.C0360f;

/* JADX INFO: renamed from: b.h.c.b.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0363a {

    /* JADX INFO: renamed from: a */
    public final Shader f2572a;

    /* JADX INFO: renamed from: b */
    public final ColorStateList f2573b;

    /* JADX INFO: renamed from: c */
    public int f2574c;

    public C0363a(Shader shader, ColorStateList colorStateList, int i) {
        this.f2572a = shader;
        this.f2573b = colorStateList;
        this.f2574c = i;
    }

    /* JADX INFO: renamed from: a */
    public static C0363a m1470a(Resources resources, int i, Resources.Theme theme) {
        int next;
        float f;
        float f2;
        float f3;
        Shader radialGradient;
        Shader.TileMode tileMode;
        Shader.TileMode tileMode2;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.hashCode();
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList colorStateListM1454n = C0360f.m1454n(resources, xml, attributeSetAsAttributeSet, theme);
                return new C0363a(null, colorStateListM1454n, colorStateListM1454n.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray typedArrayM1484k = C0369g.m1484k(resources, theme, attributeSetAsAttributeSet, C0354a.f2534d);
        float f4 = !C0369g.m1482i(xml, "startX") ? 0.0f : typedArrayM1484k.getFloat(8, 0.0f);
        float f5 = !C0369g.m1482i(xml, "startY") ? 0.0f : typedArrayM1484k.getFloat(9, 0.0f);
        float f6 = !C0369g.m1482i(xml, "endX") ? 0.0f : typedArrayM1484k.getFloat(10, 0.0f);
        float f7 = !C0369g.m1482i(xml, "endY") ? 0.0f : typedArrayM1484k.getFloat(11, 0.0f);
        float f8 = !C0369g.m1482i(xml, "centerX") ? 0.0f : typedArrayM1484k.getFloat(3, 0.0f);
        float f9 = !C0369g.m1482i(xml, "centerY") ? 0.0f : typedArrayM1484k.getFloat(4, 0.0f);
        int i2 = !C0369g.m1482i(xml, "type") ? 0 : typedArrayM1484k.getInt(2, 0);
        int color = !C0369g.m1482i(xml, "startColor") ? 0 : typedArrayM1484k.getColor(0, 0);
        boolean zM1482i = C0369g.m1482i(xml, "centerColor");
        int color2 = !C0369g.m1482i(xml, "centerColor") ? 0 : typedArrayM1484k.getColor(7, 0);
        int color3 = !C0369g.m1482i(xml, "endColor") ? 0 : typedArrayM1484k.getColor(1, 0);
        float f10 = f8;
        int i3 = C0369g.m1482i(xml, "tileMode") ? typedArrayM1484k.getInt(6, 0) : 0;
        float f11 = !C0369g.m1482i(xml, "gradientRadius") ? 0.0f : typedArrayM1484k.getFloat(5, 0.0f);
        typedArrayM1484k.recycle();
        int depth = xml.getDepth() + 1;
        float f12 = f11;
        ArrayList arrayList = new ArrayList(20);
        float f13 = f7;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f = f6;
            if (next2 == 1) {
                f2 = f5;
                break;
            }
            int depth2 = xml.getDepth();
            f2 = f5;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray typedArrayM1484k2 = C0369g.m1484k(resources, theme, attributeSetAsAttributeSet, C0354a.f2535e);
                boolean zHasValue = typedArrayM1484k2.hasValue(0);
                boolean zHasValue2 = typedArrayM1484k2.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color4 = typedArrayM1484k2.getColor(0, 0);
                float f14 = typedArrayM1484k2.getFloat(1, 0.0f);
                typedArrayM1484k2.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f14));
            }
            f6 = f;
            f5 = f2;
        }
        C0368f c0368f = arrayList2.size() > 0 ? new C0368f(arrayList2, arrayList) : null;
        if (c0368f == null) {
            c0368f = zM1482i ? new C0368f(color, color2, color3) : new C0368f(color, color3);
        }
        if (i2 != 1) {
            if (i2 != 2) {
                int[] iArr = c0368f.f2585a;
                float[] fArr = c0368f.f2586b;
                if (i3 != 1) {
                    tileMode2 = i3 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
                } else {
                    tileMode2 = Shader.TileMode.REPEAT;
                }
                radialGradient = new LinearGradient(f4, f2, f, f13, iArr, fArr, tileMode2);
            } else {
                radialGradient = new SweepGradient(f10, f9, c0368f.f2585a, c0368f.f2586b);
            }
        } else {
            if (f12 <= 0.0f) {
                f3 = f9;
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            int[] iArr2 = c0368f.f2585a;
            float[] fArr2 = c0368f.f2586b;
            if (i3 == 1) {
                f3 = f9;
                tileMode = Shader.TileMode.REPEAT;
            } else if (i3 != 2) {
                f3 = f9;
                tileMode = Shader.TileMode.CLAMP;
            } else {
                f3 = f9;
                tileMode = Shader.TileMode.MIRROR;
            }
            radialGradient = new RadialGradient(f10, f3, f12, iArr2, fArr2, tileMode);
        }
        return new C0363a(radialGradient, null, 0);
    }

    /* JADX INFO: renamed from: b */
    public boolean m1471b() {
        return this.f2572a != null;
    }

    /* JADX INFO: renamed from: c */
    public boolean m1472c() {
        ColorStateList colorStateList;
        return this.f2572a == null && (colorStateList = this.f2573b) != null && colorStateList.isStateful();
    }

    /* JADX INFO: renamed from: d */
    public boolean m1473d(int[] iArr) {
        if (m1472c()) {
            ColorStateList colorStateList = this.f2573b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f2574c) {
                this.f2574c = colorForState;
                return true;
            }
        }
        return false;
    }
}
