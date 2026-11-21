package p006b.p026f.p029b;

import android.content.Context;
import android.util.AttributeSet;
import p006b.p026f.p027a.p028h.C0329a;

/* JADX INFO: renamed from: b.f.b.a */
/* JADX INFO: loaded from: classes.dex */
public class C0343a extends AbstractC0344b {

    /* JADX INFO: renamed from: g */
    public int f2420g;

    /* JADX INFO: renamed from: h */
    public int f2421h;

    /* JADX INFO: renamed from: i */
    public C0329a f2422i;

    public C0343a(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // p006b.p026f.p029b.AbstractC0344b
    /* JADX INFO: renamed from: b */
    public void mo1391b(AttributeSet attributeSet) {
        super.mo1391b(null);
        C0329a c0329a = new C0329a();
        this.f2422i = c0329a;
        this.f2426e = c0329a;
        m1396f();
    }

    public int getType() {
        return this.f2420g;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f2422i.f2255m0 = z;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    public void setType(int i) {
        this.f2420g = i;
        this.f2421h = i;
        if (1 == getResources().getConfiguration().getLayoutDirection()) {
            int i2 = this.f2420g;
            if (i2 == 5) {
                this.f2421h = 1;
            } else if (i2 == 6) {
                this.f2421h = 0;
            }
        } else {
            int i3 = this.f2420g;
            if (i3 == 5) {
                this.f2421h = 0;
            } else if (i3 == 6) {
                this.f2421h = 1;
            }
        }
        this.f2422i.f2253k0 = this.f2421h;
    }
}
