package p080c.p126d.p127a.p128a.p131c;

import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: c.d.a.a.c.d */
/* JADX INFO: loaded from: classes.dex */
public class C1185d extends Property<Drawable, Integer> {

    /* JADX INFO: renamed from: b */
    public static final Property<Drawable, Integer> f5669b = new C1185d();

    /* JADX INFO: renamed from: a */
    public final WeakHashMap<Drawable, Integer> f5670a;

    public C1185d() {
        super(Integer.class, "drawableAlphaCompat");
        this.f5670a = new WeakHashMap<>();
    }

    @Override // android.util.Property
    public Integer get(Drawable drawable) {
        return Integer.valueOf(drawable.getAlpha());
    }

    @Override // android.util.Property
    public void set(Drawable drawable, Integer num) {
        drawable.setAlpha(num.intValue());
    }
}
