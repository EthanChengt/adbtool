package p080c.p126d.p127a.p128a.p154x;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: c.d.a.a.x.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1290a implements InterfaceC1292c {

    /* JADX INFO: renamed from: a */
    public final float f6207a;

    public C1290a(float f) {
        this.f6207a = f;
    }

    @Override // p080c.p126d.p127a.p128a.p154x.InterfaceC1292c
    /* JADX INFO: renamed from: a */
    public float mo2958a(RectF rectF) {
        return this.f6207a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1290a) && this.f6207a == ((C1290a) obj).f6207a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f6207a)});
    }
}
