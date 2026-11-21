package p006b.p056m.p057b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p006b.p007a.InterfaceC0182c;
import p006b.p025e.C0316d;
import p006b.p025e.C0321i;
import p006b.p032h.p033b.C0355a;
import p006b.p032h.p033b.C0360f;
import p006b.p061o.AbstractC0499d;
import p006b.p061o.C0503h;
import p006b.p061o.C0515t;
import p006b.p061o.InterfaceC0516u;
import p006b.p062p.p063a.AbstractC0517a;

/* JADX INFO: renamed from: b.m.b.e */
/* JADX INFO: loaded from: classes.dex */
public class ActivityC0459e extends ComponentActivity implements C0355a.b, C0355a.c {

    /* JADX INFO: renamed from: g */
    public final C0475m f2995g;

    /* JADX INFO: renamed from: h */
    public final C0503h f2996h;

    /* JADX INFO: renamed from: i */
    public boolean f2997i;

    /* JADX INFO: renamed from: j */
    public boolean f2998j;

    /* JADX INFO: renamed from: k */
    public boolean f2999k;

    /* JADX INFO: renamed from: l */
    public boolean f3000l;

    /* JADX INFO: renamed from: m */
    public int f3001m;

    /* JADX INFO: renamed from: n */
    public C0321i<String> f3002n;

    /* JADX INFO: renamed from: b.m.b.e$a */
    public class a extends AbstractC0479o<ActivityC0459e> implements InterfaceC0516u, InterfaceC0182c {
        public a() {
            super(ActivityC0459e.this);
        }

        @Override // p006b.p061o.InterfaceC0502g
        /* JADX INFO: renamed from: a */
        public AbstractC0499d mo4a() {
            return ActivityC0459e.this.f2996h;
        }

        @Override // p006b.p056m.p057b.AbstractC0471k
        /* JADX INFO: renamed from: b */
        public View mo1729b(int i) {
            return ActivityC0459e.this.findViewById(i);
        }

        @Override // p006b.p007a.InterfaceC0182c
        /* JADX INFO: renamed from: c */
        public OnBackPressedDispatcher mo5c() {
            return ActivityC0459e.this.f47f;
        }

        @Override // p006b.p056m.p057b.AbstractC0471k
        /* JADX INFO: renamed from: e */
        public boolean mo1730e() {
            Window window = ActivityC0459e.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // p006b.p056m.p057b.AbstractC0479o
        /* JADX INFO: renamed from: f */
        public void mo1736f(Fragment fragment) {
            ActivityC0459e.this.m1735o();
        }

        @Override // p006b.p061o.InterfaceC0516u
        /* JADX INFO: renamed from: g */
        public C0515t mo7g() {
            return ActivityC0459e.this.mo7g();
        }

        @Override // p006b.p056m.p057b.AbstractC0479o
        /* JADX INFO: renamed from: h */
        public ActivityC0459e mo1737h() {
            return ActivityC0459e.this;
        }

        @Override // p006b.p056m.p057b.AbstractC0479o
        /* JADX INFO: renamed from: i */
        public LayoutInflater mo1738i() {
            return ActivityC0459e.this.getLayoutInflater().cloneInContext(ActivityC0459e.this);
        }

        @Override // p006b.p056m.p057b.AbstractC0479o
        /* JADX INFO: renamed from: j */
        public boolean mo1739j(Fragment fragment) {
            return !ActivityC0459e.this.isFinishing();
        }

        @Override // p006b.p056m.p057b.AbstractC0479o
        /* JADX INFO: renamed from: k */
        public void mo1740k(Fragment fragment, Intent intent, int i, Bundle bundle) {
            ActivityC0459e activityC0459e = ActivityC0459e.this;
            activityC0459e.f3000l = true;
            try {
                if (i == -1) {
                    int i2 = C0355a.f2536b;
                    activityC0459e.startActivityForResult(intent, -1, bundle);
                } else {
                    ActivityC0459e.m1731l(i);
                    int iM1733k = ((activityC0459e.m1733k(fragment) + 1) << 16) + (i & 65535);
                    int i3 = C0355a.f2536b;
                    activityC0459e.startActivityForResult(intent, iM1733k, bundle);
                }
                activityC0459e.f3000l = false;
            } catch (Throwable th) {
                activityC0459e.f3000l = false;
                throw th;
            }
        }

        @Override // p006b.p056m.p057b.AbstractC0479o
        /* JADX INFO: renamed from: l */
        public void mo1741l() {
            ActivityC0459e.this.mo790p();
        }
    }

    public ActivityC0459e() {
        a aVar = new a();
        C0360f.m1445f(aVar, "callbacks == null");
        this.f2995g = new C0475m(aVar);
        this.f2996h = new C0503h(this);
        this.f2999k = true;
    }

    /* JADX INFO: renamed from: l */
    public static void m1731l(int i) {
        if ((i & (-65536)) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    /* JADX INFO: renamed from: n */
    public static boolean m1732n(AbstractC0483r abstractC0483r, AbstractC0499d.b bVar) {
        boolean zM1732n = false;
        for (Fragment fragment : abstractC0483r.f3097c.m1881g()) {
            if (fragment != null) {
                AbstractC0479o<?> abstractC0479o = fragment.f699t;
                if ((abstractC0479o == null ? null : abstractC0479o.mo1737h()) != null) {
                    zM1732n |= m1732n(fragment.m307j(), bVar);
                }
                if (fragment.f677Q.f3187b.compareTo(AbstractC0499d.b.STARTED) >= 0) {
                    fragment.f677Q.m1900f(bVar);
                    zM1732n = true;
                }
            }
        }
        return zM1732n;
    }

    @Override // p006b.p032h.p033b.C0355a.c
    /* JADX INFO: renamed from: b */
    public final void mo1407b(int i) {
        if (i != -1) {
            m1731l(i);
        }
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f2997i);
        printWriter.print(" mResumed=");
        printWriter.print(this.f2998j);
        printWriter.print(" mStopped=");
        printWriter.print(this.f2999k);
        if (getApplication() != null) {
            AbstractC0517a.m1914b(this).mo1915a(str2, fileDescriptor, printWriter, strArr);
        }
        this.f2995g.f3082a.f3088e.m1860x(str, fileDescriptor, printWriter, strArr);
    }

    /* JADX INFO: renamed from: k */
    public final int m1733k(Fragment fragment) {
        if (this.f3002n.m1285i() >= 65534) {
            throw new IllegalStateException("Too many pending Fragment activity results.");
        }
        while (true) {
            C0321i<String> c0321i = this.f3002n;
            int i = this.f3001m;
            if (c0321i.f2199b) {
                c0321i.m1279c();
            }
            if (C0316d.m1243a(c0321i.f2200c, c0321i.f2202e, i) < 0) {
                int i2 = this.f3001m;
                this.f3002n.m1283g(i2, fragment.f685f);
                this.f3001m = (this.f3001m + 1) % 65534;
                return i2;
            }
            this.f3001m = (this.f3001m + 1) % 65534;
        }
    }

    /* JADX INFO: renamed from: m */
    public AbstractC0483r m1734m() {
        return this.f2995g.f3082a.f3088e;
    }

    /* JADX INFO: renamed from: o */
    public void m1735o() {
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.f2995g.m1776a();
        int i3 = i >> 16;
        if (i3 == 0) {
            int i4 = C0355a.f2536b;
            super.onActivityResult(i, i2, intent);
            return;
        }
        int i5 = i3 - 1;
        String strM1280d = this.f3002n.m1280d(i5);
        this.f3002n.m1284h(i5);
        if (strM1280d == null) {
            Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
            return;
        }
        Fragment fragmentM1809I = this.f2995g.f3082a.f3088e.m1809I(strM1280d);
        if (fragmentM1809I != null) {
            fragmentM1809I.m274G();
            return;
        }
        Log.w("FragmentActivity", "Activity result no fragment exists for who: " + strM1280d);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2995g.m1776a();
        this.f2995g.f3082a.f3088e.m1844j(configuration);
    }

    @Override // androidx.activity.ComponentActivity, p006b.p032h.p033b.ActivityC0361g, android.app.Activity
    public void onCreate(Bundle bundle) {
        AbstractC0479o<?> abstractC0479o = this.f2995g.f3082a;
        abstractC0479o.f3088e.m1830c(abstractC0479o, abstractC0479o, null);
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            AbstractC0479o<?> abstractC0479o2 = this.f2995g.f3082a;
            if (!(abstractC0479o2 instanceof InterfaceC0516u)) {
                throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
            }
            abstractC0479o2.f3088e.m1829b0(parcelable);
            if (bundle.containsKey("android:support:next_request_index")) {
                this.f3001m = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.f3002n = new C0321i<>(intArray.length);
                    for (int i = 0; i < intArray.length; i++) {
                        this.f3002n.m1283g(intArray[i], stringArray[i]);
                    }
                }
            }
        }
        if (this.f3002n == null) {
            this.f3002n = new C0321i<>(10);
            this.f3001m = 0;
        }
        super.onCreate(bundle);
        this.f2996h.m1899d(AbstractC0499d.a.ON_CREATE);
        this.f2995g.f3082a.f3088e.m1848l();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return super.onCreatePanelMenu(i, menu);
        }
        boolean zOnCreatePanelMenu = super.onCreatePanelMenu(i, menu);
        C0475m c0475m = this.f2995g;
        return zOnCreatePanelMenu | c0475m.f3082a.f3088e.m1849m(menu, getMenuInflater());
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = this.f2995g.f3082a.f3088e.f3100f.onCreateView(view, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f2995g.f3082a.f3088e.m1850n();
        this.f2996h.m1899d(AbstractC0499d.a.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.f2995g.f3082a.f3088e.m1851o();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.f2995g.f3082a.f3088e.m1853q(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.f2995g.f3082a.f3088e.m1846k(menuItem);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        this.f2995g.f3082a.f3088e.m1852p(z);
    }

    @Override // android.app.Activity
    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        super.onNewIntent(intent);
        this.f2995g.m1776a();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.f2995g.f3082a.f3088e.m1854r(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f2998j = false;
        this.f2995g.f3082a.f3088e.m1858v(3);
        this.f2996h.m1899d(AbstractC0499d.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        this.f2995g.f3082a.f3088e.m1856t(z);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.f2996h.m1899d(AbstractC0499d.a.ON_RESUME);
        AbstractC0483r abstractC0483r = this.f2995g.f3082a.f3088e;
        abstractC0483r.f3114t = false;
        abstractC0483r.f3115u = false;
        abstractC0483r.m1858v(4);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        return i == 0 ? super.onPreparePanel(0, view, menu) | this.f2995g.f3082a.f3088e.m1857u(menu) : super.onPreparePanel(i, view, menu);
    }

    @Override // android.app.Activity, p006b.p032h.p033b.C0355a.b
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f2995g.m1776a();
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String strM1280d = this.f3002n.m1280d(i3);
            this.f3002n.m1284h(i3);
            if (strM1280d == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment fragmentM1809I = this.f2995g.f3082a.f3088e.m1809I(strM1280d);
            if (fragmentM1809I != null) {
                fragmentM1809I.m299e0();
                return;
            }
            Log.w("FragmentActivity", "Activity result no fragment exists for who: " + strM1280d);
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        this.f2998j = true;
        this.f2995g.m1776a();
        this.f2995g.f3082a.f3088e.m1802B(true);
    }

    @Override // androidx.activity.ComponentActivity, p006b.p032h.p033b.ActivityC0361g, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        while (m1732n(m1734m(), AbstractC0499d.b.CREATED)) {
        }
        this.f2996h.m1899d(AbstractC0499d.a.ON_STOP);
        Parcelable parcelableM1831c0 = this.f2995g.f3082a.f3088e.m1831c0();
        if (parcelableM1831c0 != null) {
            bundle.putParcelable("android:support:fragments", parcelableM1831c0);
        }
        if (this.f3002n.m1285i() > 0) {
            bundle.putInt("android:support:next_request_index", this.f3001m);
            int[] iArr = new int[this.f3002n.m1285i()];
            String[] strArr = new String[this.f3002n.m1285i()];
            for (int i = 0; i < this.f3002n.m1285i(); i++) {
                iArr[i] = this.f3002n.m1282f(i);
                strArr[i] = this.f3002n.m1286j(i);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        this.f2999k = false;
        if (!this.f2997i) {
            this.f2997i = true;
            AbstractC0483r abstractC0483r = this.f2995g.f3082a.f3088e;
            abstractC0483r.f3114t = false;
            abstractC0483r.f3115u = false;
            abstractC0483r.m1858v(2);
        }
        this.f2995g.m1776a();
        this.f2995g.f3082a.f3088e.m1802B(true);
        this.f2996h.m1899d(AbstractC0499d.a.ON_START);
        AbstractC0483r abstractC0483r2 = this.f2995g.f3082a.f3088e;
        abstractC0483r2.f3114t = false;
        abstractC0483r2.f3115u = false;
        abstractC0483r2.m1858v(3);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f2995g.m1776a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.f2999k = true;
        while (m1732n(m1734m(), AbstractC0499d.b.CREATED)) {
        }
        AbstractC0483r abstractC0483r = this.f2995g.f3082a.f3088e;
        abstractC0483r.f3115u = true;
        abstractC0483r.m1858v(2);
        this.f2996h.m1899d(AbstractC0499d.a.ON_STOP);
    }

    @Deprecated
    /* JADX INFO: renamed from: p */
    public void mo790p() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        if (!this.f3000l && i != -1) {
            m1731l(i);
        }
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (!this.f3000l && i != -1) {
            m1731l(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        if (i != -1) {
            m1731l(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (i != -1) {
            m1731l(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = this.f2995g.f3082a.f3088e.f3100f.onCreateView(null, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewOnCreateView;
    }
}
