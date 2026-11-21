package com.didjdk.adbhelper;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.XmlResourceParser;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.appcompat.app.AlertController;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import p006b.p008b.p009c.DialogInterfaceC0193i;
import p006b.p067s.AbstractC0528f;
import p006b.p067s.C0531i;
import p006b.p067s.C0532j;
import b.s.m;
import c.a.a.a.a;
import c.c.a.ActivityC1119w2;

/* JADX INFO: loaded from: classes.dex */
public class SettingsActivity extends ActivityC1119w2 {

    /* JADX INFO: renamed from: q */
    public C1333a f10078q;

    /* JADX INFO: renamed from: com.didjdk.adbhelper.SettingsActivity$a */
    public static class C1333a extends AbstractC0528f {

        /* JADX INFO: renamed from: g0 */
        public static final /* synthetic */ int f10079g0 = 0;

        /* JADX INFO: renamed from: d0 */
        public Preference f10080d0;

        /* JADX INFO: renamed from: e0 */
        public Preference f10081e0;

        /* JADX INFO: renamed from: f0 */
        public Preference f10082f0;

        /* JADX INFO: renamed from: com.didjdk.adbhelper.SettingsActivity$a$a */
        public class a implements Preference.InterfaceC0105d {
            public a() {
            }

            @Override // androidx.preference.Preference.InterfaceC0105d
            /* JADX INFO: renamed from: a */
            public boolean mo392a(Preference preference) {
                m.m1959c(C1333a.this.m303h());
                try {
                    C1333a c1333a = C1333a.this;
                    c1333a.f10080d0.mo364E(m.m1977u(c1333a.m303h()));
                    m.m1947C(C1333a.this.m303h());
                    m.m1952H(C1333a.this.m303h(), C1333a.this.m303h().getString(R.string.ap));
                    return false;
                } catch (Exception e) {
                    e.printStackTrace();
                    return false;
                }
            }
        }

        /* JADX INFO: renamed from: com.didjdk.adbhelper.SettingsActivity$a$b */
        public class b implements Preference.InterfaceC0105d {
            public b() {
            }

            @Override // androidx.preference.Preference.InterfaceC0105d
            /* JADX INFO: renamed from: a */
            public boolean mo392a(Preference preference) {
                Intent intent = new Intent(C1333a.this.m303h(), (Class<?>) FilePickerActivity.class);
                intent.putExtra("picker_mode", 1);
                C1333a.this.m273F0(intent, 1);
                return false;
            }
        }

        /* JADX INFO: renamed from: com.didjdk.adbhelper.SettingsActivity$a$c */
        public class c implements Preference.InterfaceC0105d {

            /* JADX INFO: renamed from: com.didjdk.adbhelper.SettingsActivity$a$c$a */
            public class a implements DialogInterface.OnClickListener {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ String f10086b;

                public a(String str) {
                    this.f10086b = str;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    ((ClipboardManager) C1333a.this.m303h().getSystemService("clipboard")).setText(this.f10086b);
                    Toast.makeText(C1333a.this.m303h(), "已复制", 0).show();
                }
            }

            public c() {
            }

            @Override // androidx.preference.Preference.InterfaceC0105d
            /* JADX INFO: renamed from: a */
            public boolean mo392a(Preference preference) {
                String string;
                FileInputStream fileInputStream;
                BufferedReader bufferedReader;
                StringBuilder sb;
                C1333a c1333a = C1333a.this;
                int i = C1333a.f10079g0;
                Objects.requireNonNull(c1333a);
                try {
                    try {
                        fileInputStream = new FileInputStream(new File(c1333a.m303h().getFilesDir().getAbsolutePath(), "crash.log"));
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
                    } catch (FileNotFoundException e2) {
                        e2.printStackTrace();
                        fileInputStream = null;
                    }
                    bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
                    sb = new StringBuilder();
                    fileInputStream.close();
                    string = sb.toString();
                } catch (Exception unused) {
                    string = "null";
                }
                DialogInterfaceC0193i.a aVar = new DialogInterfaceC0193i.a(C1333a.this.m303h());
                AlertController.C0020b c0020b = aVar.f1245a;
                c0020b.f117f = string;
                c0020b.f118g = "确定";
                c0020b.f119h = null;
                a aVar2 = new a(string);
                c0020b.f120i = "复制到剪切板";
                c0020b.f121j = aVar2;
                aVar.m779a().show();
                return false;
            }
        }

        /* JADX INFO: renamed from: com.didjdk.adbhelper.SettingsActivity$a$d */
        public class d implements Preference.InterfaceC0105d {
            public d() {
            }

            @Override // androidx.preference.Preference.InterfaceC0105d
            /* JADX INFO: renamed from: a */
            public boolean mo392a(Preference preference) {
                C1333a.this.m271E0(new Intent(C1333a.this.m303h(), (Class<?>) AboutActivity.class));
                return false;
            }
        }

        /* JADX INFO: renamed from: com.didjdk.adbhelper.SettingsActivity$a$e */
        public class e implements Preference.InterfaceC0105d {
            public e() {
            }

            @Override // androidx.preference.Preference.InterfaceC0105d
            /* JADX INFO: renamed from: a */
            public boolean mo392a(Preference preference) {
                C1333a.this.m271E0(new Intent(C1333a.this.m303h(), (Class<?>) UnlockActivity.class));
                return false;
            }
        }

        /* JADX INFO: renamed from: com.didjdk.adbhelper.SettingsActivity$a$f */
        public class f implements Preference.InterfaceC0105d {
            public f() {
            }

            @Override // androidx.preference.Preference.InterfaceC0105d
            /* JADX INFO: renamed from: a */
            public boolean mo392a(Preference preference) {
                Intent intent = new Intent("android.intent.action.SENDTO");
                intent.setData(Uri.parse("mailto:didjdk@163.com"));
                if (intent.resolveActivity(C1333a.this.m303h().getPackageManager()) == null) {
                    return false;
                }
                C1333a.this.m271E0(intent);
                return false;
            }
        }

        @Override // p006b.p067s.AbstractC0528f
        /* JADX INFO: renamed from: G0 */
        public void mo1925G0(Bundle bundle, String str) {
            Preference preferenceM393H;
            C0532j c0532j = this.f3244W;
            if (c0532j == null) {
                throw new RuntimeException("This should be called after super.onCreate.");
            }
            Context contextM309k = m309k();
            c0532j.f3279e = true;
            C0531i c0531i = new C0531i(contextM309k, c0532j);
            XmlResourceParser xml = contextM309k.getResources().getXml(R.xml.b);
            try {
                Preference preferenceM1938c = c0531i.m1938c(xml, null);
                xml.close();
                PreferenceScreen preferenceScreen = (PreferenceScreen) preferenceM1938c;
                preferenceScreen.m386o(c0532j);
                SharedPreferences.Editor editor = c0532j.f3278d;
                if (editor != null) {
                    editor.apply();
                }
                boolean z = false;
                c0532j.f3279e = false;
                Preference preference = preferenceScreen;
                if (str != null) {
                    preferenceM393H = preferenceScreen.m393H(str);
                    if (!(preferenceM393H instanceof PreferenceScreen)) {
                        preference = preferenceM393H;
                        throw new IllegalArgumentException(a.m2202p("Preference object with key ", str, " is not a PreferenceScreen"));
                    }
                }
                preference = preferenceM393H;
                PreferenceScreen preferenceScreen2 = (PreferenceScreen) preference;
                C0532j c0532j2 = this.f3244W;
                PreferenceScreen preferenceScreen3 = c0532j2.f3281g;
                if (preferenceScreen2 != preferenceScreen3) {
                    if (preferenceScreen3 != null) {
                        preferenceScreen3.mo388s();
                    }
                    c0532j2.f3281g = preferenceScreen2;
                    z = true;
                }
                if (z && preferenceScreen2 != null) {
                    this.f3246Y = true;
                    if (this.f3247Z && !this.f3249b0.hasMessages(1)) {
                        this.f3249b0.obtainMessage(1).sendToTarget();
                    }
                }
                Preference preferenceMo355b = mo355b("clear_cache");
                this.f10080d0 = preferenceMo355b;
                try {
                    preferenceMo355b.mo364E(m.m1977u(m303h()));
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                this.f10080d0.f787f = new a();
                Preference preferenceMo355b2 = mo355b("screencap_path");
                this.f10081e0 = preferenceMo355b2;
                preferenceMo355b2.mo364E(C0532j.m1940a(m303h()).getString("screencap_path", m303h().getExternalCacheDir().getAbsolutePath()));
                this.f10081e0.f787f = new b();
                mo355b("show_log").f787f = new c();
                mo355b("about_app").f787f = new d();
                Preference preferenceMo355b3 = mo355b("unlock_advanced");
                this.f10082f0 = preferenceMo355b3;
                preferenceMo355b3.f787f = new e();
                mo355b("contact_author").f787f = new f();
            } catch (Throwable th) {
                xml.close();
                throw th;
            }
        }
    }

    @Override // p006b.p056m.p057b.ActivityC0459e, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == 1) {
            String stringExtra = intent.getStringExtra("currentDirectory_return");
            C0532j.m1940a(this).edit().putString("screencap_path", stringExtra).apply();
            this.f10078q.f10081e0.mo364E(stringExtra);
        }
        super.onActivityResult(i, i2, intent);
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

    @Override // p006b.p056m.p057b.ActivityC0459e, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f10078q.f10082f0.mo364E(m.J(this) ? "已解锁" : "未解锁");
    }
}
