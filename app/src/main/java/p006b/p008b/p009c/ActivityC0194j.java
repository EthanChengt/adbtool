package p006b.p008b.p009c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p006b.p008b.p016h.AbstractC0215a;
import p006b.p008b.p018i.C0250c1;
import p006b.p025e.C0315c;
import p006b.p032h.p033b.C0355a;
import p006b.p032h.p033b.C0360f;
import p006b.p032h.p034c.C0362a;
import p006b.p056m.p057b.ActivityC0459e;

/* JADX INFO: renamed from: b.b.c.j */
/* JADX INFO: loaded from: classes.dex */
public class ActivityC0194j extends ActivityC0459e implements InterfaceC0195k {

    /* JADX INFO: renamed from: o */
    public AbstractC0196l f1247o;

    /* JADX INFO: renamed from: p */
    public Resources f1248p;

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m791q().mo799c(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        m791q().mo800d(context);
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        AbstractC0185a abstractC0185aM792r = m792r();
        if (getWindow().hasFeature(0)) {
            if (abstractC0185aM792r == null || !abstractC0185aM792r.mo757a()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // p006b.p032h.p033b.ActivityC0361g, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC0185a abstractC0185aM792r = m792r();
        if (keyCode == 82 && abstractC0185aM792r != null && abstractC0185aM792r.mo766j(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // p006b.p008b.p009c.InterfaceC0195k
    /* JADX INFO: renamed from: f */
    public void mo787f(AbstractC0215a abstractC0215a) {
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        return (T) m791q().mo801e(i);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return m791q().mo803g();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.f1248p == null && C0250c1.m1023a()) {
            this.f1248p = new C0250c1(this, super.getResources());
        }
        Resources resources = this.f1248p;
        return resources == null ? super.getResources() : resources;
    }

    @Override // p006b.p008b.p009c.InterfaceC0195k
    /* JADX INFO: renamed from: h */
    public void mo788h(AbstractC0215a abstractC0215a) {
    }

    @Override // p006b.p008b.p009c.InterfaceC0195k
    /* JADX INFO: renamed from: i */
    public AbstractC0215a mo789i(AbstractC0215a.a aVar) {
        return null;
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        m791q().mo806j();
    }

    @Override // p006b.p056m.p057b.ActivityC0459e, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f1248p != null) {
            this.f1248p.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        m791q().mo807k(configuration);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
    }

    @Override // p006b.p056m.p057b.ActivityC0459e, androidx.activity.ComponentActivity, p006b.p032h.p033b.ActivityC0361g, android.app.Activity
    public void onCreate(Bundle bundle) {
        AbstractC0196l abstractC0196lM791q = m791q();
        abstractC0196lM791q.mo805i();
        abstractC0196lM791q.mo808l(bundle);
        super.onCreate(bundle);
    }

    @Override // p006b.p056m.p057b.ActivityC0459e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m791q().mo809m();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (m796v(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // p006b.p056m.p057b.ActivityC0459e, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent intentM1462v;
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        AbstractC0185a abstractC0185aM792r = m792r();
        if (menuItem.getItemId() != 16908332 || abstractC0185aM792r == null || (abstractC0185aM792r.mo760d() & 4) == 0 || (intentM1462v = C0360f.m1462v(this)) == null) {
            return false;
        }
        if (!shouldUpRecreateTask(intentM1462v)) {
            navigateUpTo(intentM1462v);
            return true;
        }
        ArrayList arrayList = new ArrayList();
        Intent intentM793s = m793s();
        if (intentM793s == null) {
            intentM793s = C0360f.m1462v(this);
        }
        if (intentM793s != null) {
            ComponentName component = intentM793s.getComponent();
            if (component == null) {
                component = intentM793s.resolveActivity(getPackageManager());
            }
            int size = arrayList.size();
            while (true) {
                try {
                    Intent intentM1463w = C0360f.m1463w(this, component);
                    if (intentM1463w == null) {
                        break;
                    }
                    arrayList.add(size, intentM1463w);
                    component = intentM1463w.getComponent();
                } catch (PackageManager.NameNotFoundException e) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e);
                }
            }
            arrayList.add(intentM793s);
        }
        m795u();
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        Object obj = C0362a.f2571a;
        startActivities(intentArr, null);
        try {
            int i2 = C0355a.f2536b;
            finishAffinity();
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // p006b.p056m.p057b.ActivityC0459e, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        m791q().mo810n(bundle);
    }

    @Override // p006b.p056m.p057b.ActivityC0459e, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        m791q().mo811o();
    }

    @Override // p006b.p056m.p057b.ActivityC0459e, androidx.activity.ComponentActivity, p006b.p032h.p033b.ActivityC0361g, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        m791q().mo812p(bundle);
    }

    @Override // p006b.p056m.p057b.ActivityC0459e, android.app.Activity
    public void onStart() {
        super.onStart();
        m791q().mo813q();
    }

    @Override // p006b.p056m.p057b.ActivityC0459e, android.app.Activity
    public void onStop() {
        super.onStop();
        m791q().mo814r();
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        m791q().mo821z(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        AbstractC0185a abstractC0185aM792r = m792r();
        if (getWindow().hasFeature(0)) {
            if (abstractC0185aM792r == null || !abstractC0185aM792r.mo767k()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // p006b.p056m.p057b.ActivityC0459e
    /* JADX INFO: renamed from: p */
    public void mo790p() {
        m791q().mo806j();
    }

    /* JADX INFO: renamed from: q */
    public AbstractC0196l m791q() {
        if (this.f1247o == null) {
            C0315c<WeakReference<AbstractC0196l>> c0315c = AbstractC0196l.f1249b;
            this.f1247o = new LayoutInflaterFactory2C0197m(this, null, this, this);
        }
        return this.f1247o;
    }

    /* JADX INFO: renamed from: r */
    public AbstractC0185a m792r() {
        return m791q().mo804h();
    }

    /* JADX INFO: renamed from: s */
    public Intent m793s() {
        return C0360f.m1462v(this);
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        m791q().mo816u(i);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        m791q().mo817v(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m791q().mo818w(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        m791q().mo820y(i);
    }

    /* JADX INFO: renamed from: t */
    public void m794t() {
    }

    /* JADX INFO: renamed from: u */
    public void m795u() {
    }

    /* JADX INFO: renamed from: v */
    public final boolean m796v(KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    /* JADX INFO: renamed from: w */
    public void m797w(Toolbar toolbar) {
        m791q().mo819x(toolbar);
    }
}
