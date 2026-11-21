package c.c.a;

import android.os.Bundle;
import p006b.p008b.p009c.ActivityC0194j;

/* JADX INFO: renamed from: c.c.a.w2 */
/* JADX INFO: loaded from: classes.dex */
public class ActivityC1119w2 extends ActivityC0194j {
    @Override // p006b.p008b.p009c.ActivityC0194j, p006b.p056m.p057b.ActivityC0459e, androidx.activity.ComponentActivity, p006b.p032h.p033b.ActivityC0361g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0973s2.f4898a.add(this);
    }

    @Override // p006b.p008b.p009c.ActivityC0194j, p006b.p056m.p057b.ActivityC0459e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C0973s2.f4898a.remove(this);
    }
}
