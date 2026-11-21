package p080c.p126d.p127a.p128a.p130b0;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: c.d.a.a.b0.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1178n {

    /* JADX INFO: renamed from: a */
    public TextInputLayout f5627a;

    /* JADX INFO: renamed from: b */
    public Context f5628b;

    /* JADX INFO: renamed from: c */
    public CheckableImageButton f5629c;

    public AbstractC1178n(TextInputLayout textInputLayout) {
        this.f5627a = textInputLayout;
        this.f5628b = textInputLayout.getContext();
        this.f5629c = textInputLayout.getEndIconView();
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo2741a();

    /* JADX INFO: renamed from: b */
    public boolean mo2747b(int i) {
        return true;
    }

    /* JADX INFO: renamed from: c */
    public boolean mo2748c() {
        return false;
    }
}
