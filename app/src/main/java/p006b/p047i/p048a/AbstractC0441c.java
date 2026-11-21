package p006b.p047i.p048a;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: b.i.a.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0441c extends AbstractC0439a {

    /* JADX INFO: renamed from: j */
    public int f2808j;

    /* JADX INFO: renamed from: k */
    public int f2809k;

    /* JADX INFO: renamed from: l */
    public LayoutInflater f2810l;

    @Deprecated
    public AbstractC0441c(Context context, int i, Cursor cursor, boolean z) {
        super(context, null, z);
        this.f2809k = i;
        this.f2808j = i;
        this.f2810l = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // p006b.p047i.p048a.AbstractC0439a
    /* JADX INFO: renamed from: d */
    public View mo1125d(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f2810l.inflate(this.f2808j, viewGroup, false);
    }
}
