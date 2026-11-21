package p006b.p067s;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.preference.PreferenceScreen;

/* JADX INFO: renamed from: b.s.j */
/* JADX INFO: loaded from: classes.dex */
public class C0532j {

    /* JADX INFO: renamed from: a */
    public Context f3275a;

    /* JADX INFO: renamed from: b */
    public long f3276b = 0;

    /* JADX INFO: renamed from: c */
    public SharedPreferences f3277c = null;

    /* JADX INFO: renamed from: d */
    public SharedPreferences.Editor f3278d;

    /* JADX INFO: renamed from: e */
    public boolean f3279e;

    /* JADX INFO: renamed from: f */
    public String f3280f;

    /* JADX INFO: renamed from: g */
    public PreferenceScreen f3281g;

    /* JADX INFO: renamed from: h */
    public c f3282h;

    /* JADX INFO: renamed from: i */
    public a f3283i;

    /* JADX INFO: renamed from: j */
    public b f3284j;

    /* JADX INFO: renamed from: b.s.j$a */
    public interface a {
    }

    /* JADX INFO: renamed from: b.s.j$b */
    public interface b {
    }

    /* JADX INFO: renamed from: b.s.j$c */
    public interface c {
    }

    public C0532j(Context context) {
        this.f3275a = context;
        this.f3280f = context.getPackageName() + "_preferences";
    }

    /* JADX INFO: renamed from: a */
    public static SharedPreferences m1940a(Context context) {
        return context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
    }

    /* JADX INFO: renamed from: b */
    public SharedPreferences.Editor m1941b() {
        if (!this.f3279e) {
            return m1942c().edit();
        }
        if (this.f3278d == null) {
            this.f3278d = m1942c().edit();
        }
        return this.f3278d;
    }

    /* JADX INFO: renamed from: c */
    public SharedPreferences m1942c() {
        if (this.f3277c == null) {
            this.f3277c = this.f3275a.getSharedPreferences(this.f3280f, 0);
        }
        return this.f3277c;
    }
}
