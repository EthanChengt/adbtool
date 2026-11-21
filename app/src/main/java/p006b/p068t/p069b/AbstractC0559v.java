package p006b.p068t.p069b;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: b.t.b.v */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0559v extends RecyclerView.AbstractC0137l {

    /* JADX INFO: renamed from: g */
    public boolean f3450g = true;

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0137l
    /* JADX INFO: renamed from: a */
    public boolean mo549a(RecyclerView.AbstractC0129d0 abstractC0129d0, RecyclerView.AbstractC0129d0 abstractC0129d1, RecyclerView.AbstractC0137l.c cVar, RecyclerView.AbstractC0137l.c cVar2) {
        int i;
        int i2;
        int i3 = cVar.f955a;
        int i4 = cVar.f956b;
        if (abstractC0129d1.m525u()) {
            int i5 = cVar.f955a;
            i2 = cVar.f956b;
            i = i5;
        } else {
            i = cVar2.f955a;
            i2 = cVar2.f956b;
        }
        C0548k c0548k = (C0548k) this;
        if (abstractC0129d0 == abstractC0129d1) {
            return c0548k.mo2016i(abstractC0129d0, i3, i4, i, i2);
        }
        float translationX = abstractC0129d0.f927a.getTranslationX();
        float translationY = abstractC0129d0.f927a.getTranslationY();
        float alpha = abstractC0129d0.f927a.getAlpha();
        c0548k.m2021n(abstractC0129d0);
        abstractC0129d0.f927a.setTranslationX(translationX);
        abstractC0129d0.f927a.setTranslationY(translationY);
        abstractC0129d0.f927a.setAlpha(alpha);
        c0548k.m2021n(abstractC0129d1);
        abstractC0129d1.f927a.setTranslationX(-((int) ((i - i3) - translationX)));
        abstractC0129d1.f927a.setTranslationY(-((int) ((i2 - i4) - translationY)));
        abstractC0129d1.f927a.setAlpha(0.0f);
        c0548k.f3353k.add(new C0548k.a(abstractC0129d0, abstractC0129d1, i3, i4, i, i2));
        return true;
    }

    /* JADX INFO: renamed from: i */
    public abstract boolean mo2016i(RecyclerView.AbstractC0129d0 abstractC0129d0, int i, int i2, int i3, int i4);
}
