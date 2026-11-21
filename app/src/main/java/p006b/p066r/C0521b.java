package p006b.p066r;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import c.a.a.a.a;

/* JADX INFO: renamed from: b.r.b */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(21)
public class C0521b implements InterfaceC0520a {

    /* JADX INFO: renamed from: a */
    public AudioAttributes f3217a;

    /* JADX INFO: renamed from: b */
    public int f3218b = -1;

    public boolean equals(Object obj) {
        if (obj instanceof C0521b) {
            return this.f3217a.equals(((C0521b) obj).f3217a);
        }
        return false;
    }

    public int hashCode() {
        return this.f3217a.hashCode();
    }

    public String toString() {
        StringBuilder sbM2191e = a.m2191e("AudioAttributesCompat: audioattributes=");
        sbM2191e.append(this.f3217a);
        return sbM2191e.toString();
    }
}
