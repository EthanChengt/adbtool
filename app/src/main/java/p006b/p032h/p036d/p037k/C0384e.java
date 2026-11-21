package p006b.p032h.p036d.p037k;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* JADX INFO: renamed from: b.h.d.k.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0384e extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public int f2620a;

    /* JADX INFO: renamed from: b */
    public Drawable.ConstantState f2621b;

    /* JADX INFO: renamed from: c */
    public ColorStateList f2622c;

    /* JADX INFO: renamed from: d */
    public PorterDuff.Mode f2623d;

    public C0384e(C0384e c0384e) {
        this.f2622c = null;
        this.f2623d = C0382c.f2612h;
        if (c0384e != null) {
            this.f2620a = c0384e.f2620a;
            this.f2621b = c0384e.f2621b;
            this.f2622c = c0384e.f2622c;
            this.f2623d = c0384e.f2623d;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i = this.f2620a;
        Drawable.ConstantState constantState = this.f2621b;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        return Build.VERSION.SDK_INT >= 21 ? new C0383d(this, resources) : new C0382c(this, resources);
    }
}
