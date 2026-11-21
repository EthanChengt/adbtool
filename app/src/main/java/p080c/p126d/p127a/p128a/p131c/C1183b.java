package p080c.p126d.p127a.p128a.p131c;

import android.animation.TypeEvaluator;
import c.a.a.a.a;

/* JADX INFO: renamed from: c.d.a.a.c.b */
/* JADX INFO: loaded from: classes.dex */
public class C1183b implements TypeEvaluator<Integer> {

    /* JADX INFO: renamed from: a */
    public static final C1183b f5667a = new C1183b();

    @Override // android.animation.TypeEvaluator
    public Integer evaluate(float f, Integer num, Integer num2) {
        int iIntValue = num.intValue();
        float f2 = ((iIntValue >> 24) & 255) / 255.0f;
        int iIntValue2 = num2.intValue();
        float f3 = ((iIntValue2 >> 24) & 255) / 255.0f;
        float fPow = (float) Math.pow(((iIntValue >> 16) & 255) / 255.0f, 2.2d);
        float fPow2 = (float) Math.pow(((iIntValue >> 8) & 255) / 255.0f, 2.2d);
        float fPow3 = (float) Math.pow((iIntValue & 255) / 255.0f, 2.2d);
        float fPow4 = (float) Math.pow(((iIntValue2 >> 16) & 255) / 255.0f, 2.2d);
        float fPow5 = (float) Math.pow(((iIntValue2 >> 8) & 255) / 255.0f, 2.2d);
        float fPow6 = (float) Math.pow((iIntValue2 & 255) / 255.0f, 2.2d);
        float fM2187a = a.m2187a(f3, f2, f, f2);
        float fM2187a2 = a.m2187a(fPow4, fPow, f, fPow);
        float fM2187a3 = a.m2187a(fPow5, fPow2, f, fPow2);
        float fM2187a4 = a.m2187a(fPow6, fPow3, f, fPow3);
        float fPow7 = ((float) Math.pow(fM2187a2, 0.45454545454545453d)) * 255.0f;
        float fPow8 = ((float) Math.pow(fM2187a3, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(fM2187a4, 0.45454545454545453d)) * 255.0f) | (Math.round(fPow7) << 16) | (Math.round(fM2187a * 255.0f) << 24) | (Math.round(fPow8) << 8));
    }
}
