package p006b.p008b.p012e.p013a;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

/* JADX INFO: renamed from: b.b.e.a.d */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedAPI"})
public class C0212d extends C0210b {

    /* JADX INFO: renamed from: o */
    public a f1475o;

    /* JADX INFO: renamed from: p */
    public boolean f1476p;

    /* JADX INFO: renamed from: b.b.e.a.d$a */
    public static class a extends C0210b.c {

        /* JADX INFO: renamed from: J */
        public int[][] f1477J;

        public a(a aVar, C0212d c0212d, Resources resources) {
            super(aVar, c0212d, resources);
            if (aVar != null) {
                this.f1477J = aVar.f1477J;
            } else {
                this.f1477J = new int[this.f1454g.length][];
            }
        }

        @Override // p006b.p008b.p012e.p013a.C0210b.c
        /* JADX INFO: renamed from: e */
        public void mo892e() {
            int[][] iArr = this.f1477J;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.f1477J;
                iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
            }
            this.f1477J = iArr2;
        }

        /* JADX INFO: renamed from: g */
        public int m904g(int[] iArr) {
            int[][] iArr2 = this.f1477J;
            int i = this.f1455h;
            for (int i2 = 0; i2 < i; i2++) {
                if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                    return i2;
                }
            }
            return -1;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C0212d(this, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C0212d(this, resources);
        }
    }

    public C0212d(a aVar) {
    }

    public C0212d(a aVar, Resources resources) {
        mo887e(new a(aVar, this, resources));
        onStateChange(getState());
    }

    @Override // p006b.p008b.p012e.p013a.C0210b, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // p006b.p008b.p012e.p013a.C0210b
    /* JADX INFO: renamed from: e */
    public void mo887e(C0210b.c cVar) {
        this.f1425b = cVar;
        int i = this.f1431h;
        if (i >= 0) {
            Drawable drawableM902d = cVar.m902d(i);
            this.f1427d = drawableM902d;
            if (drawableM902d != null) {
                m897c(drawableM902d);
            }
        }
        this.f1428e = null;
        if (cVar instanceof a) {
            this.f1475o = (a) cVar;
        }
    }

    @Override // p006b.p008b.p012e.p013a.C0210b
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public a mo886b() {
        return new a(this.f1475o, this, null);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // p006b.p008b.p012e.p013a.C0210b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f1476p) {
            super.mutate();
            if (this == this) {
                this.f1475o.mo892e();
                this.f1476p = true;
            }
        }
        return this;
    }

    @Override // p006b.p008b.p012e.p013a.C0210b, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        int iM904g = this.f1475o.m904g(iArr);
        if (iM904g < 0) {
            iM904g = this.f1475o.m904g(StateSet.WILD_CARD);
        }
        return m898d(iM904g) || zOnStateChange;
    }
}
