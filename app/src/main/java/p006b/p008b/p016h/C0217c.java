package p006b.p008b.p016h;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.didjdk.adbhelper.R;

/* JADX INFO: renamed from: b.b.h.c */
/* JADX INFO: loaded from: classes.dex */
public class C0217c extends ContextWrapper {

    /* JADX INFO: renamed from: a */
    public int f1484a;

    /* JADX INFO: renamed from: b */
    public Resources.Theme f1485b;

    /* JADX INFO: renamed from: c */
    public LayoutInflater f1486c;

    /* JADX INFO: renamed from: d */
    public Resources f1487d;

    public C0217c() {
        super(null);
    }

    public C0217c(Context context, int i) {
        super(context);
        this.f1484a = i;
    }

    public C0217c(Context context, Resources.Theme theme) {
        super(context);
        this.f1485b = theme;
    }

    /* JADX INFO: renamed from: a */
    public final void m905a() {
        if (this.f1485b == null) {
            this.f1485b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f1485b.setTo(theme);
            }
        }
        this.f1485b.applyStyle(this.f1484a, true);
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.f1487d == null) {
            this.f1487d = super.getResources();
        }
        return this.f1487d;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f1486c == null) {
            this.f1486c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f1486c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1485b;
        if (theme != null) {
            return theme;
        }
        if (this.f1484a == 0) {
            this.f1484a = R.style.k_;
        }
        m905a();
        return this.f1485b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        if (this.f1484a != i) {
            this.f1484a = i;
            m905a();
        }
    }
}
