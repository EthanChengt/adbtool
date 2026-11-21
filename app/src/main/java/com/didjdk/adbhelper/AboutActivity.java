package com.didjdk.adbhelper;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import c.c.a.ActivityC1119w2;

/* JADX INFO: loaded from: classes.dex */
public class AboutActivity extends ActivityC1119w2 {

    /* JADX INFO: renamed from: com.didjdk.adbhelper.AboutActivity$a */
    public class ViewOnClickListenerC1311a implements View.OnClickListener {
        public ViewOnClickListenerC1311a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("https://didjdk.github.io/adbhelper/privacy_policy.html"));
            AboutActivity.this.startActivity(intent);
        }
    }

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

    /* JADX INFO: renamed from: x */
    public final String m3009x() {
        InputStream inputStreamOpenRawResource = getResources().openRawResource(R.raw.b);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
                sb.append("\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        inputStreamOpenRawResource.close();
        return sb.toString();
    }
}
