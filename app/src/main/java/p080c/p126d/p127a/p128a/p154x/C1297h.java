package p080c.p126d.p127a.p128a.p154x;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: c.d.a.a.x.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1297h implements InterfaceC1292c {

    /* JADX INFO: renamed from: a */
    public final float f6255a;

    public C1297h(float f) {
        this.f6255a = f;
    }

    @Override // p080c.p126d.p127a.p128a.p154x.InterfaceC1292c
    /* JADX INFO: renamed from: a */
    public float mo2958a(RectF rectF) {
        return rectF.height() * this.f6255a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1297h) && this.f6255a == ((C1297h) obj).f6255a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f6255a)});
    }
}
