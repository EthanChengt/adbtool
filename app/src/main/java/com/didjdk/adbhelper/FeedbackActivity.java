package com.didjdk.adbhelper;

import android.os.Bundle;
import android.view.MenuItem;
import c.c.a.ActivityC1119w2;

/* JADX INFO: loaded from: classes.dex */
public class FeedbackActivity extends ActivityC1119w2 {
    @Override // c.c.a.ActivityC1119w2, p006b.p008b.p009c.ActivityC0194j, p006b.p056m.p057b.ActivityC0459e, androidx.activity.ComponentActivity, p006b.p032h.p033b.ActivityC0361g, android.app.Activity
    public native void onCreate(Bundle bundle);

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return true;
        }
        onBackPressed();
        return true;
    }
}
