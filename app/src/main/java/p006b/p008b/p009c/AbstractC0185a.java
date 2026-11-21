package p006b.p008b.p009c;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import p006b.p008b.C0184b;
import p006b.p008b.p016h.AbstractC0215a;

/* JADX INFO: renamed from: b.b.c.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0185a {

    /* JADX INFO: renamed from: b.b.c.a$a */
    public static class a extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a */
        public int f1226a;

        public a(int i, int i2) {
            super(i, i2);
            this.f1226a = 0;
            this.f1226a = 8388627;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1226a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0184b.f1201b);
            this.f1226a = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1226a = 0;
        }

        public a(a aVar) {
            super((ViewGroup.MarginLayoutParams) aVar);
            this.f1226a = 0;
            this.f1226a = aVar.f1226a;
        }
    }

    /* JADX INFO: renamed from: b.b.c.a$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void m776a(boolean z);
    }

    /* JADX INFO: renamed from: b.b.c.a$c */
    @Deprecated
    public static abstract class c {
        /* JADX INFO: renamed from: a */
        public abstract void m777a();
    }

    /* JADX INFO: renamed from: a */
    public boolean mo757a() {
        return false;
    }

    /* JADX INFO: renamed from: b */
    public abstract boolean mo758b();

    /* JADX INFO: renamed from: c */
    public abstract void mo759c(boolean z);

    /* JADX INFO: renamed from: d */
    public abstract int mo760d();

    /* JADX INFO: renamed from: e */
    public abstract Context mo761e();

    /* JADX INFO: renamed from: f */
    public boolean mo762f() {
        return false;
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo763g(Configuration configuration);

    /* JADX INFO: renamed from: h */
    public void mo764h() {
    }

    /* JADX INFO: renamed from: i */
    public abstract boolean mo765i(int i, KeyEvent keyEvent);

    /* JADX INFO: renamed from: j */
    public boolean mo766j(KeyEvent keyEvent) {
        return false;
    }

    /* JADX INFO: renamed from: k */
    public boolean mo767k() {
        return false;
    }

    /* JADX INFO: renamed from: l */
    public abstract void mo768l(boolean z);

    /* JADX INFO: renamed from: m */
    public abstract void mo769m(boolean z);

    /* JADX INFO: renamed from: n */
    public abstract void mo770n(boolean z);

    /* JADX INFO: renamed from: o */
    public abstract void mo771o(boolean z);

    /* JADX INFO: renamed from: p */
    public abstract void mo772p(int i);

    /* JADX INFO: renamed from: q */
    public abstract void mo773q(CharSequence charSequence);

    /* JADX INFO: renamed from: r */
    public abstract void mo774r(CharSequence charSequence);

    /* JADX INFO: renamed from: s */
    public AbstractC0215a mo775s(AbstractC0215a.a aVar) {
        return null;
    }
}
