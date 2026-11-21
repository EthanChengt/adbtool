package c.c.a;

import com.didjdk.adbhelper.UnlockActivity;
import java.util.Objects;
import org.json.JSONObject;
import p006b.p067s.C0532j;
import b.s.m;

/* JADX INFO: renamed from: c.c.a.d2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0898d2 implements Runnable {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ UnlockActivity f4780b;

    @Override // java.lang.Runnable
    public final void run() {
        final UnlockActivity unlockActivity = this.f4780b;
        Objects.requireNonNull(unlockActivity);
        m.m1952H(unlockActivity, "已取消解锁");
        unlockActivity.f10097v.setVisibility(8);
        unlockActivity.f10098w.setVisibility(0);
        unlockActivity.f10099x.setVisibility(8);
        new Thread(new Runnable() { // from class: c.c.a.t1
            @Override // java.lang.Runnable
            public final void run() {
                final UnlockActivity unlockActivity2 = unlockActivity;
                Objects.requireNonNull(unlockActivity2);
                try {
                    String string = C0532j.m1940a(unlockActivity2).getString("server_url", "");
                    unlockActivity2.f10093r = string;
                    if (string.isEmpty()) {
                        unlockActivity2.f10093r = m.m1966j(unlockActivity2.x("https://didjdk.github.io/adbhelper/pro/10/server_url"));
                        C0532j.m1940a(unlockActivity2).edit().putString("server_url", unlockActivity2.f10093r).apply();
                    }
                    JSONObject jSONObject = new JSONObject(unlockActivity2.x(unlockActivity2.f10093r + "/10/info.json"));
                    unlockActivity2.f10094s = jSONObject.getString("price");
                    unlockActivity2.f10095t = jSONObject.getString("notice");
                    unlockActivity2.f10092q = true;
                    unlockActivity2.runOnUiThread(new Runnable() { // from class: c.c.a.w1
                        @Override // java.lang.Runnable
                        public final void run() {
                            UnlockActivity unlockActivity3 = unlockActivity2;
                            unlockActivity3.f10096u.setText(unlockActivity3.f10094s);
                        }
                    });
                } catch (Exception unused) {
                    unlockActivity2.runOnUiThread(new Runnable() { // from class: c.c.a.v1
                        @Override // java.lang.Runnable
                        public final void run() {
                            UnlockActivity unlockActivity3 = unlockActivity2;
                            Objects.requireNonNull(unlockActivity3);
                            m.m1952H(unlockActivity3, "网络连接失败");
                        }
                    });
                }
            }
        }).start();
    }
}
