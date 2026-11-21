package c.c.a.v3.m0;

import android.view.View;
import android.widget.CompoundButton;

/* JADX INFO: renamed from: c.c.a.v3.m0.y */
/* JADX INFO: loaded from: classes.dex */
public class C1101y {

    /* JADX INFO: renamed from: a */
    public int f5377a;

    /* JADX INFO: renamed from: b */
    public String f5378b;

    /* JADX INFO: renamed from: c */
    public String f5379c;

    /* JADX INFO: renamed from: d */
    public boolean f5380d = false;

    /* JADX INFO: renamed from: e */
    public boolean f5381e;

    /* JADX INFO: renamed from: f */
    public View.OnClickListener f5382f;

    /* JADX INFO: renamed from: g */
    public CompoundButton.OnCheckedChangeListener f5383g;

    public C1101y(String str) {
        this.f5378b = str;
    }

    public C1101y(String str, String str2, int i, View.OnClickListener onClickListener) {
        this.f5378b = str;
        this.f5377a = i;
        this.f5379c = str2;
        this.f5382f = onClickListener;
    }
}
