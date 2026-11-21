package c.a.a.a;

import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import org.xmlpull.v1.XmlPullParser;
import c.c.a.q3;
import c.c.a.x3.f;

/* JADX INFO: renamed from: c.a.a.a.a */
/* JADX INFO: compiled from: outline */
/* JADX INFO: loaded from: classes.dex */
public class a {
    /* JADX INFO: renamed from: a */
    public static float m2187a(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    /* JADX INFO: renamed from: b */
    public static View m2188b(ViewGroup viewGroup, int i, ViewGroup viewGroup2, boolean z) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup2, z);
    }

    /* JADX INFO: renamed from: c */
    public static String m2189c(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        return str2.replaceAll(sb.toString(), str3).trim();
    }

    /* JADX INFO: renamed from: d */
    public static String m2190d(XmlPullParser xmlPullParser, StringBuilder sb, String str) {
        sb.append(xmlPullParser.getPositionDescription());
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: e */
    public static StringBuilder m2191e(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    /* JADX INFO: renamed from: f */
    public static void m2192f(StringBuilder sb, Fragment fragment, String str) {
        sb.append(fragment);
        Log.d(str, sb.toString());
    }

    /* JADX INFO: renamed from: g */
    public static native void g(StringBuilder sb, String str, q3 runnableC0964q3);
    public static void m2193g(StringBuilder sb, String str, q3 runnableC0964q3) {
        g(sb, str, runnableC0964q3);
    }

    /* JADX INFO: renamed from: h */
    public static void m2194h(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m2195i(StringBuilder sb, String str, String str2) {
        sb.append(str);
        return str2.contains(sb.toString());
    }

    /* JADX INFO: renamed from: j */
    public static String q() {
        return new f().toString();
    }

    /* JADX INFO: renamed from: k */
    public static String m2197k(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.exceptionLabel());
        return sb.toString();
    }

    /* JADX INFO: renamed from: l */
    public static String m2198l(String str, int i) {
        return str + i;
    }

    /* JADX INFO: renamed from: m */
    public static String m2199m(String str, Uri uri) {
        return str + uri;
    }

    /* JADX INFO: renamed from: n */
    public static String m2200n(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    /* JADX INFO: renamed from: o */
    public static String m2201o(String str, String str2) {
        return str + str2;
    }

    /* JADX INFO: renamed from: p */
    public static String m2202p(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* JADX INFO: renamed from: q */
    public static String m2203q(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }
}
