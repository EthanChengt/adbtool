package p080c.p126d.p127a.p128a.p154x;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: c.d.a.a.x.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1291b implements InterfaceC1292c {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1292c f6208a;

    /* JADX INFO: renamed from: b */
    public final float f6209b;

    public C1291b(float f, InterfaceC1292c interfaceC1292c) {
        while (interfaceC1292c instanceof C1291b) {
            interfaceC1292c = ((C1291b) interfaceC1292c).f6208a;
            f += ((C1291b) interfaceC1292c).f6209b;
        }
        this.f6208a = interfaceC1292c;
        this.f6209b = f;
    }

    @Override // p080c.p126d.p127a.p128a.p154x.InterfaceC1292c
    /* JADX INFO: renamed from: a */
    public float mo2958a(RectF rectF) {
        return Math.max(0.0f, this.f6208a.mo2958a(rectF) + this.f6209b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1291b)) {
            return false;
        }
        C1291b c1291b = (C1291b) obj;
        return this.f6208a.equals(c1291b.f6208a) && this.f6209b == c1291b.f6209b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6208a, Float.valueOf(this.f6209b)});
    }
}
