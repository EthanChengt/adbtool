package p006b.p073w;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import c.a.a.a.a;

/* JADX INFO: renamed from: b.w.q */
/* JADX INFO: loaded from: classes.dex */
public class C0592q {

    /* JADX INFO: renamed from: b */
    public View f3623b;

    /* JADX INFO: renamed from: a */
    public final Map<String, Object> f3622a = new HashMap();

    /* JADX INFO: renamed from: c */
    public final ArrayList<AbstractC0584i> f3624c = new ArrayList<>();

    @Deprecated
    public C0592q() {
    }

    public C0592q(View view) {
        this.f3623b = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0592q)) {
            return false;
        }
        C0592q c0592q = (C0592q) obj;
        return this.f3623b == c0592q.f3623b && this.f3622a.equals(c0592q.f3622a);
    }

    public int hashCode() {
        return this.f3622a.hashCode() + (this.f3623b.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sbM2191e = a.m2191e("TransitionValues@");
        sbM2191e.append(Integer.toHexString(hashCode()));
        sbM2191e.append(":\n");
        String strM2201o = a.m2201o(sbM2191e.toString() + "    view = " + this.f3623b + "\n", "    values:");
        for (String str : this.f3622a.keySet()) {
            strM2201o = strM2201o + "    " + str + ": " + this.f3622a.get(str) + "\n";
        }
        return strM2201o;
    }
}
