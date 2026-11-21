package p080c.p126d.p127a.p128a.p131c;

import android.util.Property;
import android.view.ViewGroup;
import com.didjdk.adbhelper.R;

/* JADX INFO: renamed from: c.d.a.a.c.c */
/* JADX INFO: loaded from: classes.dex */
public class C1184c extends Property<ViewGroup, Float> {

    /* JADX INFO: renamed from: a */
    public static final Property<ViewGroup, Float> f5668a = new C1184c("childrenAlpha");

    public C1184c(String str) {
        super(Float.class, str);
    }

    @Override // android.util.Property
    public Float get(ViewGroup viewGroup) {
        Float f = (Float) viewGroup.getTag(R.id.jz);
        return f != null ? f : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    public void set(ViewGroup viewGroup, Float f) {
        ViewGroup viewGroup2 = viewGroup;
        float fFloatValue = f.floatValue();
        viewGroup2.setTag(R.id.jz, Float.valueOf(fFloatValue));
        int childCount = viewGroup2.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup2.getChildAt(i).setAlpha(fFloatValue);
        }
    }
}
