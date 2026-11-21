package p006b.p008b.p009c;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatViewInflater;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import p006b.p008b.C0183a;
import p006b.p008b.C0184b;
import p006b.p008b.p010d.p011a.C0208a;
import p006b.p008b.p016h.AbstractC0215a;
import p006b.p008b.p016h.C0217c;
import p006b.p008b.p016h.C0218d;
import p006b.p008b.p016h.C0219e;
import p006b.p008b.p016h.C0220f;
import p006b.p008b.p016h.WindowCallbackC0222h;
import p006b.p008b.p016h.p017i.C0227e;
import p006b.p008b.p016h.p017i.C0227e.a;
import p006b.p008b.p016h.p017i.C0229g;
import p006b.p008b.p016h.p017i.InterfaceC0235m;
import p006b.p008b.p018i.C0250c1;
import p006b.p008b.p018i.C0253d1;
import p006b.p008b.p018i.C0265j;
import p006b.p008b.p018i.C0274n0;
import p006b.p008b.p018i.C0294x0;
import p006b.p008b.p018i.InterfaceC0249c0;
import p006b.p008b.p018i.InterfaceC0260g0;
import p006b.p025e.C0313a;
import p006b.p025e.C0317e;
import p006b.p025e.C0320h;
import p006b.p032h.p033b.C0355a;
import p006b.p032h.p033b.C0359e;
import p006b.p032h.p033b.C0360f;
import p006b.p032h.p033b.RunnableC0356b;
import p006b.p032h.p033b.RunnableC0357c;
import p006b.p032h.p044j.C0408c;
import p006b.p032h.p044j.C0418m;
import p006b.p032h.p044j.C0423r;
import p006b.p032h.p044j.C0425t;
import p006b.p061o.AbstractC0499d;
import p006b.p061o.C0503h;
import p006b.p061o.InterfaceC0502g;

/* JADX INFO: renamed from: b.b.c.m */
/* JADX INFO: loaded from: classes.dex */
public class LayoutInflaterFactory2C0197m extends AbstractC0196l implements C0229g.a, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: Z */
    public static final Map<Class<?>, Integer> f1251Z = new C0313a();

    /* JADX INFO: renamed from: a0 */
    public static final boolean f1252a0;

    /* JADX INFO: renamed from: b0 */
    public static final int[] f1253b0;

    /* JADX INFO: renamed from: c0 */
    public static boolean f1254c0;

    /* JADX INFO: renamed from: d0 */
    public static final boolean f1255d0;

    /* JADX INFO: renamed from: A */
    public boolean f1256A;

    /* JADX INFO: renamed from: B */
    public boolean f1257B;

    /* JADX INFO: renamed from: C */
    public boolean f1258C;

    /* JADX INFO: renamed from: D */
    public boolean f1259D;

    /* JADX INFO: renamed from: E */
    public boolean f1260E;

    /* JADX INFO: renamed from: F */
    public j[] f1261F;

    /* JADX INFO: renamed from: G */
    public j f1262G;

    /* JADX INFO: renamed from: H */
    public boolean f1263H;

    /* JADX INFO: renamed from: I */
    public boolean f1264I;

    /* JADX INFO: renamed from: J */
    public boolean f1265J;

    /* JADX INFO: renamed from: K */
    public boolean f1266K;

    /* JADX INFO: renamed from: L */
    public boolean f1267L;

    /* JADX INFO: renamed from: M */
    public int f1268M;

    /* JADX INFO: renamed from: N */
    public int f1269N;

    /* JADX INFO: renamed from: O */
    public boolean f1270O;

    /* JADX INFO: renamed from: P */
    public boolean f1271P;

    /* JADX INFO: renamed from: Q */
    public g f1272Q;

    /* JADX INFO: renamed from: R */
    public g f1273R;

    /* JADX INFO: renamed from: S */
    public boolean f1274S;

    /* JADX INFO: renamed from: T */
    public int f1275T;

    /* JADX INFO: renamed from: V */
    public boolean f1277V;

    /* JADX INFO: renamed from: W */
    public Rect f1278W;

    /* JADX INFO: renamed from: X */
    public Rect f1279X;

    /* JADX INFO: renamed from: Y */
    public AppCompatViewInflater f1280Y;

    /* JADX INFO: renamed from: d */
    public final Object f1281d;

    /* JADX INFO: renamed from: e */
    public final Context f1282e;

    /* JADX INFO: renamed from: f */
    public Window f1283f;

    /* JADX INFO: renamed from: g */
    public e f1284g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC0195k f1285h;

    /* JADX INFO: renamed from: i */
    public AbstractC0185a f1286i;

    /* JADX INFO: renamed from: j */
    public MenuInflater f1287j;

    /* JADX INFO: renamed from: k */
    public CharSequence f1288k;

    /* JADX INFO: renamed from: l */
    public InterfaceC0249c0 f1289l;

    /* JADX INFO: renamed from: m */
    public c f1290m;

    /* JADX INFO: renamed from: n */
    public k f1291n;

    /* JADX INFO: renamed from: o */
    public AbstractC0215a f1292o;

    /* JADX INFO: renamed from: p */
    public ActionBarContextView f1293p;

    /* JADX INFO: renamed from: q */
    public PopupWindow f1294q;

    /* JADX INFO: renamed from: r */
    public Runnable f1295r;

    /* JADX INFO: renamed from: t */
    public boolean f1297t;

    /* JADX INFO: renamed from: u */
    public ViewGroup f1298u;

    /* JADX INFO: renamed from: v */
    public TextView f1299v;

    /* JADX INFO: renamed from: w */
    public View f1300w;

    /* JADX INFO: renamed from: x */
    public boolean f1301x;

    /* JADX INFO: renamed from: y */
    public boolean f1302y;

    /* JADX INFO: renamed from: z */
    public boolean f1303z;

    /* JADX INFO: renamed from: s */
    public C0423r f1296s = null;

    /* JADX INFO: renamed from: U */
    public final Runnable f1276U = new b();

    /* JADX INFO: renamed from: b.b.c.m$a */
    public static class a implements Thread.UncaughtExceptionHandler {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Thread.UncaughtExceptionHandler f1304a;

        public a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f1304a = uncaughtExceptionHandler;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            String message;
            boolean z = false;
            if ((th instanceof Resources.NotFoundException) && (message = th.getMessage()) != null && (message.contains("drawable") || message.contains("Drawable"))) {
                z = true;
            }
            if (!z) {
                this.f1304a.uncaughtException(thread, th);
                return;
            }
            Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
            notFoundException.initCause(th.getCause());
            notFoundException.setStackTrace(th.getStackTrace());
            this.f1304a.uncaughtException(thread, notFoundException);
        }
    }

    /* JADX INFO: renamed from: b.b.c.m$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LayoutInflaterFactory2C0197m layoutInflaterFactory2C0197m = LayoutInflaterFactory2C0197m.this;
            if ((layoutInflaterFactory2C0197m.f1275T & 1) != 0) {
                layoutInflaterFactory2C0197m.m829H(0);
            }
            LayoutInflaterFactory2C0197m layoutInflaterFactory2C0197m2 = LayoutInflaterFactory2C0197m.this;
            if ((layoutInflaterFactory2C0197m2.f1275T & 4096) != 0) {
                layoutInflaterFactory2C0197m2.m829H(108);
            }
            LayoutInflaterFactory2C0197m layoutInflaterFactory2C0197m3 = LayoutInflaterFactory2C0197m.this;
            layoutInflaterFactory2C0197m3.f1274S = false;
            layoutInflaterFactory2C0197m3.f1275T = 0;
        }
    }

    /* JADX INFO: renamed from: b.b.c.m$c */
    public final class c implements InterfaceC0235m.a {
        public c() {
        }

        @Override // p006b.p008b.p016h.p017i.InterfaceC0235m.a
        /* JADX INFO: renamed from: a */
        public void mo60a(C0229g c0229g, boolean z) {
            LayoutInflaterFactory2C0197m.this.m826E(c0229g);
        }

        @Override // p006b.p008b.p016h.p017i.InterfaceC0235m.a
        /* JADX INFO: renamed from: b */
        public boolean mo61b(C0229g c0229g) {
            Window.Callback callbackM836O = LayoutInflaterFactory2C0197m.this.m836O();
            if (callbackM836O == null) {
                return true;
            }
            callbackM836O.onMenuOpened(108, c0229g);
            return true;
        }
    }

    /* JADX INFO: renamed from: b.b.c.m$d */
    public class d implements AbstractC0215a.a {

        /* JADX INFO: renamed from: a */
        public AbstractC0215a.a f1307a;

        /* JADX INFO: renamed from: b.b.c.m$d$a */
        public class a extends C0425t {
            public a() {
            }

            @Override // p006b.p032h.p044j.InterfaceC0424s
            /* JADX INFO: renamed from: a */
            public void mo849a(View view) {
                LayoutInflaterFactory2C0197m.this.f1293p.setVisibility(8);
                LayoutInflaterFactory2C0197m layoutInflaterFactory2C0197m = LayoutInflaterFactory2C0197m.this;
                PopupWindow popupWindow = layoutInflaterFactory2C0197m.f1294q;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C0197m.f1293p.getParent() instanceof View) {
                    C0418m.m1576s((View) LayoutInflaterFactory2C0197m.this.f1293p.getParent());
                }
                LayoutInflaterFactory2C0197m.this.f1293p.removeAllViews();
                LayoutInflaterFactory2C0197m.this.f1296s.m1594d(null);
                LayoutInflaterFactory2C0197m.this.f1296s = null;
            }
        }

        public d(AbstractC0215a.a aVar) {
            this.f1307a = aVar;
        }

        @Override // p006b.p008b.p016h.AbstractC0215a.a
        /* JADX INFO: renamed from: a */
        public boolean mo845a(AbstractC0215a abstractC0215a, Menu menu) {
            return this.f1307a.mo845a(abstractC0215a, menu);
        }

        @Override // p006b.p008b.p016h.AbstractC0215a.a
        /* JADX INFO: renamed from: b */
        public boolean mo846b(AbstractC0215a abstractC0215a, MenuItem menuItem) {
            return this.f1307a.mo846b(abstractC0215a, menuItem);
        }

        @Override // p006b.p008b.p016h.AbstractC0215a.a
        /* JADX INFO: renamed from: c */
        public boolean mo847c(AbstractC0215a abstractC0215a, Menu menu) {
            return this.f1307a.mo847c(abstractC0215a, menu);
        }

        @Override // p006b.p008b.p016h.AbstractC0215a.a
        /* JADX INFO: renamed from: d */
        public void mo848d(AbstractC0215a abstractC0215a) {
            this.f1307a.mo848d(abstractC0215a);
            LayoutInflaterFactory2C0197m layoutInflaterFactory2C0197m = LayoutInflaterFactory2C0197m.this;
            if (layoutInflaterFactory2C0197m.f1294q != null) {
                layoutInflaterFactory2C0197m.f1283f.getDecorView().removeCallbacks(LayoutInflaterFactory2C0197m.this.f1295r);
            }
            LayoutInflaterFactory2C0197m layoutInflaterFactory2C0197m2 = LayoutInflaterFactory2C0197m.this;
            if (layoutInflaterFactory2C0197m2.f1293p != null) {
                layoutInflaterFactory2C0197m2.m830I();
                LayoutInflaterFactory2C0197m layoutInflaterFactory2C0197m3 = LayoutInflaterFactory2C0197m.this;
                C0423r c0423rM1558a = C0418m.m1558a(layoutInflaterFactory2C0197m3.f1293p);
                c0423rM1558a.m1591a(0.0f);
                layoutInflaterFactory2C0197m3.f1296s = c0423rM1558a;
                C0423r c0423r = LayoutInflaterFactory2C0197m.this.f1296s;
                a aVar = new a();
                View view = c0423r.f2732a.get();
                if (view != null) {
                    c0423r.m1595e(view, aVar);
                }
            }
            LayoutInflaterFactory2C0197m layoutInflaterFactory2C0197m4 = LayoutInflaterFactory2C0197m.this;
            InterfaceC0195k interfaceC0195k = layoutInflaterFactory2C0197m4.f1285h;
            if (interfaceC0195k != null) {
                interfaceC0195k.mo788h(layoutInflaterFactory2C0197m4.f1292o);
            }
            LayoutInflaterFactory2C0197m.this.f1292o = null;
        }
    }

    /* JADX INFO: renamed from: b.b.c.m$f */
    public class f extends g {

        /* JADX INFO: renamed from: c */
        public final PowerManager f1311c;

        public f(Context context) {
            super();
            this.f1311c = (PowerManager) context.getSystemService("power");
        }

        @Override // p006b.p008b.p009c.LayoutInflaterFactory2C0197m.g
        /* JADX INFO: renamed from: b */
        public IntentFilter mo851b() {
            if (Build.VERSION.SDK_INT < 21) {
                return null;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // p006b.p008b.p009c.LayoutInflaterFactory2C0197m.g
        /* JADX INFO: renamed from: c */
        public int mo852c() {
            return (Build.VERSION.SDK_INT < 21 || !this.f1311c.isPowerSaveMode()) ? 1 : 2;
        }

        @Override // p006b.p008b.p009c.LayoutInflaterFactory2C0197m.g
        /* JADX INFO: renamed from: d */
        public void mo853d() {
            LayoutInflaterFactory2C0197m.this.m822A();
        }
    }

    /* JADX INFO: renamed from: b.b.c.m$g */
    public abstract class g {

        /* JADX INFO: renamed from: a */
        public BroadcastReceiver f1313a;

        /* JADX INFO: renamed from: b.b.c.m$g$a */
        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                g.this.mo853d();
            }
        }

        public g() {
        }

        /* JADX INFO: renamed from: a */
        public void m854a() {
            BroadcastReceiver broadcastReceiver = this.f1313a;
            if (broadcastReceiver != null) {
                try {
                    LayoutInflaterFactory2C0197m.this.f1282e.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f1313a = null;
            }
        }

        /* JADX INFO: renamed from: b */
        public abstract IntentFilter mo851b();

        /* JADX INFO: renamed from: c */
        public abstract int mo852c();

        /* JADX INFO: renamed from: d */
        public abstract void mo853d();

        /* JADX INFO: renamed from: e */
        public void m855e() {
            m854a();
            IntentFilter intentFilterMo851b = mo851b();
            if (intentFilterMo851b == null || intentFilterMo851b.countActions() == 0) {
                return;
            }
            if (this.f1313a == null) {
                this.f1313a = new a();
            }
            LayoutInflaterFactory2C0197m.this.f1282e.registerReceiver(this.f1313a, intentFilterMo851b);
        }
    }

    /* JADX INFO: renamed from: b.b.c.m$h */
    public class h extends g {

        /* JADX INFO: renamed from: c */
        public final C0206v f1316c;

        public h(C0206v c0206v) {
            super();
            this.f1316c = c0206v;
        }

        @Override // p006b.p008b.p009c.LayoutInflaterFactory2C0197m.g
        /* JADX INFO: renamed from: b */
        public IntentFilter mo851b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // p006b.p008b.p009c.LayoutInflaterFactory2C0197m.g
        /* JADX INFO: renamed from: c */
        public int mo852c() {
            boolean z;
            long j;
            long j2;
            C0206v c0206v = this.f1316c;
            C0206v.a aVar = c0206v.f1367c;
            if (aVar.f1369b > System.currentTimeMillis()) {
                z = aVar.f1368a;
            } else {
                Location locationM863a = C0360f.m1447g(c0206v.f1365a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c0206v.m863a("network") : null;
                Location locationM863a2 = C0360f.m1447g(c0206v.f1365a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c0206v.m863a("gps") : null;
                if (locationM863a2 == null || locationM863a == null ? locationM863a2 != null : locationM863a2.getTime() > locationM863a.getTime()) {
                    locationM863a = locationM863a2;
                }
                if (locationM863a != null) {
                    C0206v.a aVar2 = c0206v.f1367c;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (C0205u.f1360d == null) {
                        C0205u.f1360d = new C0205u();
                    }
                    C0205u c0205u = C0205u.f1360d;
                    c0205u.m862a(jCurrentTimeMillis - 86400000, locationM863a.getLatitude(), locationM863a.getLongitude());
                    c0205u.m862a(jCurrentTimeMillis, locationM863a.getLatitude(), locationM863a.getLongitude());
                    boolean z2 = c0205u.f1363c == 1;
                    long j3 = c0205u.f1362b;
                    long j4 = c0205u.f1361a;
                    c0205u.m862a(jCurrentTimeMillis + 86400000, locationM863a.getLatitude(), locationM863a.getLongitude());
                    long j5 = c0205u.f1362b;
                    if (j3 == -1 || j4 == -1) {
                        j = 43200000 + jCurrentTimeMillis;
                    } else {
                        if (jCurrentTimeMillis > j4) {
                            j2 = j5 + 0;
                        } else {
                            j2 = jCurrentTimeMillis > j3 ? j4 + 0 : j3 + 0;
                        }
                        j = j2 + 60000;
                    }
                    aVar2.f1368a = z2;
                    aVar2.f1369b = j;
                    z = aVar.f1368a;
                } else {
                    Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                    int i = Calendar.getInstance().get(11);
                    z = i < 6 || i >= 22;
                }
            }
            return z ? 2 : 1;
        }

        @Override // p006b.p008b.p009c.LayoutInflaterFactory2C0197m.g
        /* JADX INFO: renamed from: d */
        public void mo853d() {
            LayoutInflaterFactory2C0197m.this.m822A();
        }
    }

    /* JADX INFO: renamed from: b.b.c.m$i */
    public class i extends ContentFrameLayout {
        public i(Context context) {
            super(context, null);
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return LayoutInflaterFactory2C0197m.this.m828G(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                    LayoutInflaterFactory2C0197m layoutInflaterFactory2C0197m = LayoutInflaterFactory2C0197m.this;
                    layoutInflaterFactory2C0197m.m827F(layoutInflaterFactory2C0197m.m835N(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public void setBackgroundResource(int i) {
            setBackgroundDrawable(C0208a.m884b(getContext(), i));
        }
    }

    /* JADX INFO: renamed from: b.b.c.m$j */
    public static final class j {

        /* JADX INFO: renamed from: a */
        public int f1319a;

        /* JADX INFO: renamed from: b */
        public int f1320b;

        /* JADX INFO: renamed from: c */
        public int f1321c;

        /* JADX INFO: renamed from: d */
        public int f1322d;

        /* JADX INFO: renamed from: e */
        public ViewGroup f1323e;

        /* JADX INFO: renamed from: f */
        public View f1324f;

        /* JADX INFO: renamed from: g */
        public View f1325g;

        /* JADX INFO: renamed from: h */
        public C0229g f1326h;

        /* JADX INFO: renamed from: i */
        public C0227e f1327i;

        /* JADX INFO: renamed from: j */
        public Context f1328j;

        /* JADX INFO: renamed from: k */
        public boolean f1329k;

        /* JADX INFO: renamed from: l */
        public boolean f1330l;

        /* JADX INFO: renamed from: m */
        public boolean f1331m;

        /* JADX INFO: renamed from: n */
        public boolean f1332n;

        /* JADX INFO: renamed from: o */
        public boolean f1333o = false;

        /* JADX INFO: renamed from: p */
        public boolean f1334p;

        /* JADX INFO: renamed from: q */
        public Bundle f1335q;

        public j(int i) {
            this.f1319a = i;
        }

        /* JADX INFO: renamed from: a */
        public void m856a(C0229g c0229g) {
            C0227e c0227e;
            C0229g c0229g2 = this.f1326h;
            if (c0229g == c0229g2) {
                return;
            }
            if (c0229g2 != null) {
                c0229g2.m961u(this.f1327i);
            }
            this.f1326h = c0229g;
            if (c0229g == null || (c0227e = this.f1327i) == null) {
                return;
            }
            c0229g.m942b(c0227e, c0229g.f1630a);
        }
    }

    /* JADX INFO: renamed from: b.b.c.m$k */
    public final class k implements InterfaceC0235m.a {
        public k() {
        }

        @Override // p006b.p008b.p016h.p017i.InterfaceC0235m.a
        /* JADX INFO: renamed from: a */
        public void mo60a(C0229g c0229g, boolean z) {
            C0229g c0229gMo951k = c0229g.mo951k();
            boolean z2 = c0229gMo951k != c0229g;
            LayoutInflaterFactory2C0197m layoutInflaterFactory2C0197m = LayoutInflaterFactory2C0197m.this;
            if (z2) {
                c0229g = c0229gMo951k;
            }
            j jVarM833L = layoutInflaterFactory2C0197m.m833L(c0229g);
            if (jVarM833L != null) {
                if (!z2) {
                    LayoutInflaterFactory2C0197m.this.m827F(jVarM833L, z);
                } else {
                    LayoutInflaterFactory2C0197m.this.m825D(jVarM833L.f1319a, jVarM833L, c0229gMo951k);
                    LayoutInflaterFactory2C0197m.this.m827F(jVarM833L, true);
                }
            }
        }

        @Override // p006b.p008b.p016h.p017i.InterfaceC0235m.a
        /* JADX INFO: renamed from: b */
        public boolean mo61b(C0229g c0229g) {
            Window.Callback callbackM836O;
            if (c0229g != null) {
                return true;
            }
            LayoutInflaterFactory2C0197m layoutInflaterFactory2C0197m = LayoutInflaterFactory2C0197m.this;
            if (!layoutInflaterFactory2C0197m.f1303z || (callbackM836O = layoutInflaterFactory2C0197m.m836O()) == null || LayoutInflaterFactory2C0197m.this.f1267L) {
                return true;
            }
            callbackM836O.onMenuOpened(108, c0229g);
            return true;
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        boolean z = false;
        boolean z2 = i2 < 21;
        f1252a0 = z2;
        f1253b0 = new int[]{R.attr.windowBackground};
        if (i2 >= 21 && i2 <= 25) {
            z = true;
        }
        f1255d0 = z;
        if (!z2 || f1254c0) {
            return;
        }
        Thread.setDefaultUncaughtExceptionHandler(new a(Thread.getDefaultUncaughtExceptionHandler()));
        f1254c0 = true;
    }

    public LayoutInflaterFactory2C0197m(Context context, Window window, InterfaceC0195k interfaceC0195k, Object obj) {
        ActivityC0194j activityC0194j = null;
        this.f1268M = -100;
        this.f1282e = context;
        this.f1285h = interfaceC0195k;
        this.f1281d = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof ActivityC0194j)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    activityC0194j = (ActivityC0194j) context;
                    break;
                }
            }
            if (activityC0194j != null) {
                this.f1268M = activityC0194j.m791q().mo802f();
            }
        }
        if (this.f1268M == -100) {
            C0320h c0320h = (C0320h) f1251Z;
            Integer num = (Integer) c0320h.get(this.f1281d.getClass());
            if (num != null) {
                this.f1268M = num.intValue();
                c0320h.remove(this.f1281d.getClass());
            }
        }
        if (window != null) {
            m824C(window);
        }
        C0265j.m1081e();
    }

    /* JADX INFO: renamed from: A */
    public boolean m822A() {
        return m823B(true);
    }

    /* JADX WARN: Code duplicated, block: B:110:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:192:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:205:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:28:0x005a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B */
    public final boolean m823B(boolean z) throws IllegalAccessException {
        int i2;
        boolean z2;
        boolean z3;
        boolean z4;
        Object obj;
        Object obj2;
        boolean z5;
        g gVarM834M;
        int i3 = Build.VERSION.SDK_INT;
        if (this.f1267L) {
            return false;
        }
        int i4 = this.f1268M;
        int i5 = i4 != -100 ? i4 : -100;
        int iMo852c = -1;
        if (i5 != -100) {
            if (i5 == -1) {
                iMo852c = i5;
            } else {
                if (i5 != 0) {
                    if (i5 == 1 || i5 == 2) {
                        iMo852c = i5;
                    } else {
                        if (i5 != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        if (this.f1273R == null) {
                            this.f1273R = new f(this.f1282e);
                        }
                        gVarM834M = this.f1273R;
                    }
                } else if (i3 < 23 || ((UiModeManager) this.f1282e.getSystemService(UiModeManager.class)).getNightMode() != 0) {
                    gVarM834M = m834M();
                }
                iMo852c = gVarM834M.mo852c();
            }
        }
        int i6 = this.f1282e.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        if (iMo852c != 1) {
            i2 = iMo852c != 2 ? i6 : 32;
        } else {
            i2 = 16;
        }
        if (this.f1271P || !(this.f1281d instanceof Activity)) {
            this.f1271P = true;
            z2 = this.f1270O;
        } else {
            PackageManager packageManager = this.f1282e.getPackageManager();
            if (packageManager == null) {
                z2 = false;
            } else {
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f1282e, this.f1281d.getClass()), 0);
                    this.f1270O = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e2);
                    this.f1270O = false;
                }
                this.f1271P = true;
                z2 = this.f1270O;
            }
        }
        if ((f1255d0 || i2 != i6) && !z2 && !this.f1264I && (this.f1281d instanceof ContextThemeWrapper)) {
            Configuration configuration = new Configuration();
            configuration.uiMode = (configuration.uiMode & (-49)) | i2;
            try {
                ((ContextThemeWrapper) this.f1281d).applyOverrideConfiguration(configuration);
                z3 = true;
            } catch (IllegalStateException e3) {
                Log.e("AppCompatDelegate", "updateForNightMode. Calling applyOverrideConfiguration() failed with an exception. Will fall back to using Resources.updateConfiguration()", e3);
                z3 = false;
            }
        } else {
            z3 = false;
        }
        int i7 = this.f1282e.getResources().getConfiguration().uiMode & 48;
        Map map = null;
        obj = null;
        obj = null;
        Object obj3 = null;
        Object obj4 = null;
        if (!z3 && i7 != i2 && z && !z2 && this.f1264I) {
            Object obj5 = this.f1281d;
            if (obj5 instanceof Activity) {
                Activity activity = (Activity) obj5;
                int i8 = C0355a.f2536b;
                if (i3 >= 28) {
                    activity.recreate();
                } else {
                    Class<?> cls = C0359e.f2546a;
                    if (i3 >= 28) {
                        activity.recreate();
                    } else {
                        if ((!C0359e.m1408a() || C0359e.f2551f != null) && (C0359e.f2550e != null || C0359e.f2549d != null)) {
                            try {
                                Object obj6 = C0359e.f2548c.get(activity);
                                if (obj6 != null && (obj2 = C0359e.f2547b.get(activity)) != null) {
                                    Application application = activity.getApplication();
                                    C0359e.a aVar = new C0359e.a(activity);
                                    application.registerActivityLifecycleCallbacks(aVar);
                                    Handler handler = C0359e.f2552g;
                                    handler.post(new RunnableC0356b(aVar, obj6));
                                    try {
                                        if (C0359e.m1408a()) {
                                            Method method = C0359e.f2551f;
                                            Boolean bool = Boolean.FALSE;
                                            method.invoke(obj2, obj6, null, null, 0, bool, null, null, bool, bool);
                                        } else {
                                            activity.recreate();
                                        }
                                        handler.post(new RunnableC0357c(application, aVar));
                                    } catch (Throwable th) {
                                        C0359e.f2552g.post(new RunnableC0357c(application, aVar));
                                        throw th;
                                    }
                                }
                            } catch (Throwable unused) {
                            }
                        }
                        z5 = false;
                        if (!z5) {
                            activity.recreate();
                        }
                    }
                    z5 = true;
                    if (!z5) {
                        activity.recreate();
                    }
                }
                z3 = true;
            }
        }
        if (z3 || i7 == i2) {
            z4 = z3;
        } else {
            Resources resources = this.f1282e.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i2;
            resources.updateConfiguration(configuration2, null);
            if (i3 < 26 && i3 < 28) {
                if (i3 >= 24) {
                    if (!C0183a.f1197h) {
                        try {
                            Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                            C0183a.f1196g = declaredField;
                            declaredField.setAccessible(true);
                        } catch (NoSuchFieldException e4) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e4);
                        }
                        C0183a.f1197h = true;
                    }
                    Field field = C0183a.f1196g;
                    if (field != null) {
                        try {
                            obj = field.get(resources);
                        } catch (IllegalAccessException e5) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e5);
                            obj = null;
                        }
                        if (obj != null) {
                            if (!C0183a.f1191b) {
                                try {
                                    Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                    C0183a.f1190a = declaredField2;
                                    declaredField2.setAccessible(true);
                                } catch (NoSuchFieldException e6) {
                                    Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e6);
                                }
                                C0183a.f1191b = true;
                            }
                            Field field2 = C0183a.f1190a;
                            if (field2 != null) {
                                try {
                                    obj3 = field2.get(obj);
                                } catch (IllegalAccessException e7) {
                                    Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e7);
                                }
                            }
                            if (obj3 != null) {
                                C0183a.m754a(obj3);
                            }
                        }
                    }
                } else if (i3 >= 23) {
                    if (!C0183a.f1191b) {
                        try {
                            Field declaredField3 = Resources.class.getDeclaredField("mDrawableCache");
                            C0183a.f1190a = declaredField3;
                            declaredField3.setAccessible(true);
                        } catch (NoSuchFieldException e8) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e8);
                        }
                        C0183a.f1191b = true;
                    }
                    Field field3 = C0183a.f1190a;
                    if (field3 != null) {
                        try {
                            obj4 = field3.get(resources);
                        } catch (IllegalAccessException e9) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e9);
                        }
                    }
                    if (obj4 != null) {
                        C0183a.m754a(obj4);
                    }
                } else if (i3 >= 21) {
                    if (!C0183a.f1191b) {
                        try {
                            Field declaredField4 = Resources.class.getDeclaredField("mDrawableCache");
                            C0183a.f1190a = declaredField4;
                            declaredField4.setAccessible(true);
                        } catch (NoSuchFieldException e10) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e10);
                        }
                        C0183a.f1191b = true;
                    }
                    Field field4 = C0183a.f1190a;
                    if (field4 != null) {
                        try {
                            map = (Map) field4.get(resources);
                        } catch (IllegalAccessException e11) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e11);
                        }
                        if (map != null) {
                            map.clear();
                        }
                    }
                }
            }
            int i9 = this.f1269N;
            if (i9 != 0) {
                this.f1282e.setTheme(i9);
                if (i3 >= 23) {
                    this.f1282e.getTheme().applyStyle(this.f1269N, true);
                }
            }
            if (z2) {
                Object obj7 = this.f1281d;
                if (obj7 instanceof Activity) {
                    Activity activity2 = (Activity) obj7;
                    if (activity2 instanceof InterfaceC0502g) {
                        if (((C0503h) ((InterfaceC0502g) activity2).mo4a()).f3187b.compareTo(AbstractC0499d.b.STARTED) >= 0) {
                            activity2.onConfigurationChanged(configuration2);
                        }
                    } else if (this.f1266K) {
                        activity2.onConfigurationChanged(configuration2);
                    }
                }
            }
            z4 = true;
        }
        if (z4) {
            Object obj8 = this.f1281d;
            if (obj8 instanceof ActivityC0194j) {
                ((ActivityC0194j) obj8).m794t();
            }
        }
        if (i5 == 0) {
            m834M().m855e();
        } else {
            g gVar = this.f1272Q;
            if (gVar != null) {
                gVar.m854a();
            }
        }
        if (i5 == 3) {
            if (this.f1273R == null) {
                this.f1273R = new f(this.f1282e);
            }
            this.f1273R.m855e();
        } else {
            g gVar2 = this.f1273R;
            if (gVar2 != null) {
                gVar2.m854a();
            }
        }
        return z4;
    }

    /* JADX INFO: renamed from: C */
    public final void m824C(Window window) {
        if (this.f1283f != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof e) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        e eVar = new e(callback);
        this.f1284g = eVar;
        window.setCallback(eVar);
        C0294x0 c0294x0M1151p = C0294x0.m1151p(this.f1282e, null, f1253b0);
        Drawable drawableM1160h = c0294x0M1151p.m1160h(0);
        if (drawableM1160h != null) {
            window.setBackgroundDrawable(drawableM1160h);
        }
        c0294x0M1151p.f2052b.recycle();
        this.f1283f = window;
    }

    /* JADX INFO: renamed from: D */
    public void m825D(int i2, j jVar, Menu menu) {
        if (menu == null && jVar != null) {
            menu = jVar.f1326h;
        }
        if ((jVar == null || jVar.f1331m) && !this.f1267L) {
            this.f1284g.f1550b.onPanelClosed(i2, menu);
        }
    }

    /* JADX INFO: renamed from: E */
    public void m826E(C0229g c0229g) {
        if (this.f1260E) {
            return;
        }
        this.f1260E = true;
        this.f1289l.mo44l();
        Window.Callback callbackM836O = m836O();
        if (callbackM836O != null && !this.f1267L) {
            callbackM836O.onPanelClosed(108, c0229g);
        }
        this.f1260E = false;
    }

    /* JADX INFO: renamed from: F */
    public void m827F(j jVar, boolean z) {
        ViewGroup viewGroup;
        InterfaceC0249c0 interfaceC0249c0;
        if (z && jVar.f1319a == 0 && (interfaceC0249c0 = this.f1289l) != null && interfaceC0249c0.mo35c()) {
            m826E(jVar.f1326h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f1282e.getSystemService("window");
        if (windowManager != null && jVar.f1331m && (viewGroup = jVar.f1323e) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                m825D(jVar.f1319a, jVar, null);
            }
        }
        jVar.f1329k = false;
        jVar.f1330l = false;
        jVar.f1331m = false;
        jVar.f1324f = null;
        jVar.f1333o = true;
        if (this.f1262G == jVar) {
            this.f1262G = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: G */
    public boolean m828G(KeyEvent keyEvent) {
        View decorView;
        boolean z;
        boolean zMo36d;
        boolean zM841T;
        Object obj = this.f1281d;
        if (((obj instanceof C0408c.a) || (obj instanceof DialogC0203s)) && (decorView = this.f1283f.getDecorView()) != null && C0408c.m1542a(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f1284g.f1550b.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            if (keyCode == 4) {
                this.f1263H = (keyEvent.getFlags() & 128) != 0;
            } else if (keyCode == 82) {
                if (keyEvent.getRepeatCount() != 0) {
                    return true;
                }
                j jVarM835N = m835N(0);
                if (jVarM835N.f1331m) {
                    return true;
                }
                m841T(jVarM835N, keyEvent);
                return true;
            }
        } else if (keyCode == 4) {
            boolean z2 = this.f1263H;
            this.f1263H = false;
            j jVarM835N2 = m835N(0);
            if (jVarM835N2.f1331m) {
                if (z2) {
                    return true;
                }
                m827F(jVarM835N2, true);
                return true;
            }
            AbstractC0215a abstractC0215a = this.f1292o;
            if (abstractC0215a != null) {
                abstractC0215a.mo869c();
            } else {
                m837P();
                AbstractC0185a abstractC0185a = this.f1286i;
                z = abstractC0185a != null && abstractC0185a.mo758b();
                if (z) {
                    return true;
                }
            }
            if (z) {
                return true;
            }
        } else if (keyCode == 82) {
            if (this.f1292o != null) {
                return true;
            }
            j jVarM835N3 = m835N(0);
            InterfaceC0249c0 interfaceC0249c0 = this.f1289l;
            if (interfaceC0249c0 == null || !interfaceC0249c0.mo39g() || ViewConfiguration.get(this.f1282e).hasPermanentMenuKey()) {
                boolean z3 = jVarM835N3.f1331m;
                if (z3 || jVarM835N3.f1330l) {
                    m827F(jVarM835N3, true);
                    zMo36d = z3;
                } else if (jVarM835N3.f1329k) {
                    if (jVarM835N3.f1334p) {
                        jVarM835N3.f1329k = false;
                        zM841T = m841T(jVarM835N3, keyEvent);
                    } else {
                        zM841T = true;
                    }
                    if (zM841T) {
                        m839R(jVarM835N3, keyEvent);
                        zMo36d = true;
                    } else {
                        zMo36d = false;
                    }
                } else {
                    zMo36d = false;
                }
            } else if (this.f1289l.mo35c()) {
                zMo36d = this.f1289l.mo36d();
            } else if (this.f1267L || !m841T(jVarM835N3, keyEvent)) {
                zMo36d = false;
            } else {
                zMo36d = this.f1289l.mo37e();
            }
            if (!zMo36d) {
                return true;
            }
            AudioManager audioManager = (AudioManager) this.f1282e.getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
                return true;
            }
            Log.w("AppCompatDelegate", "Couldn't get audio manager");
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: H */
    public void m829H(int i2) {
        j jVarM835N = m835N(i2);
        if (jVarM835N.f1326h != null) {
            Bundle bundle = new Bundle();
            jVarM835N.f1326h.m963w(bundle);
            if (bundle.size() > 0) {
                jVarM835N.f1335q = bundle;
            }
            jVarM835N.f1326h.m966z();
            jVarM835N.f1326h.clear();
        }
        jVarM835N.f1334p = true;
        jVarM835N.f1333o = true;
        if ((i2 == 108 || i2 == 0) && this.f1289l != null) {
            j jVarM835N2 = m835N(0);
            jVarM835N2.f1329k = false;
            m841T(jVarM835N2, null);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m830I() {
        C0423r c0423r = this.f1296s;
        if (c0423r != null) {
            c0423r.m1592b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v8, types: [android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.view.View, android.view.ViewGroup, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13, types: [android.view.Window] */
    /* JADX WARN: Type inference failed for: r3v28, types: [java.lang.reflect.Method] */
    /* JADX INFO: renamed from: J */
    public final void m831J() {
        ViewGroup r1 = null;
        ViewGroup r2 = null;
        ViewGroup viewGroup = null;
        ViewGroup viewGroup2 = null;
        int[] iArr = C0184b.f1209j;
        if (this.f1297t) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = this.f1282e.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(115)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(124, false)) {
            mo815t(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(115, false)) {
            mo815t(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(116, false)) {
            mo815t(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            mo815t(10);
        }
        this.f1258C = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        m832K();
        this.f1283f.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f1282e);
        if (this.f1259D) {
            r1 = (ViewGroup) layoutInflaterFrom.inflate(this.f1257B ? com.didjdk.adbhelper.R.layout.w : com.didjdk.adbhelper.R.layout.v, (ViewGroup) null);
            if (Build.VERSION.SDK_INT >= 21) {
                C0418m.m1579v(r1, new C0198n(this));
            } else {
                ((InterfaceC0260g0) r1).setOnFitSystemWindowsListener(new C0199o(this));
            }
        } else if (this.f1258C) {
            viewGroup2 = (ViewGroup) layoutInflaterFrom.inflate(com.didjdk.adbhelper.R.layout.m, (ViewGroup) null);
            this.f1256A = false;
            this.f1303z = false;
        } else if (this.f1303z) {
            TypedValue typedValue = new TypedValue();
            this.f1282e.getTheme().resolveAttribute(com.didjdk.adbhelper.R.attr.j, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C0217c(this.f1282e, typedValue.resourceId) : this.f1282e).inflate(com.didjdk.adbhelper.R.layout.x, (ViewGroup) null);
            InterfaceC0249c0 interfaceC0249c0 = (InterfaceC0249c0) viewGroup.findViewById(com.didjdk.adbhelper.R.id.de);
            this.f1289l = interfaceC0249c0;
            interfaceC0249c0.setWindowCallback(m836O());
            if (this.f1256A) {
                this.f1289l.mo43k(109);
            }
            if (this.f1301x) {
                this.f1289l.mo43k(2);
            }
            r2 = viewGroup;
            if (this.f1302y) {
                this.f1289l.mo43k(5);
            }
        } else {
            r2 = null;
        }
        if (r2 == null) {
            r2 = r1;
            r2 = r1;
            r2 = viewGroup;
            r2 = viewGroup2;
            StringBuilder sbM2191e = c.a.a.a.c.a.a.a.a.m2191e("AppCompat does not support the current theme features: { windowActionBar: ");
            sbM2191e.append(this.f1303z);
            sbM2191e.append(", windowActionBarOverlay: ");
            sbM2191e.append(this.f1256A);
            sbM2191e.append(", android:windowIsFloating: ");
            sbM2191e.append(this.f1258C);
            sbM2191e.append(", windowActionModeOverlay: ");
            sbM2191e.append(this.f1257B);
            sbM2191e.append(", windowNoTitle: ");
            sbM2191e.append(this.f1259D);
            sbM2191e.append(" }");
            throw new IllegalArgumentException(sbM2191e.toString());
        }
        r2 = r1;
        r2 = r1;
        r2 = viewGroup;
        if (this.f1289l == null) {
            r2 = viewGroup2;
            this.f1299v = (TextView) r2.findViewById(com.didjdk.adbhelper.R.id.p9);
        }
        r2 = viewGroup2;
        Method method = C0253d1.f1815a;
        try {
            Method method2 = r2.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method2.isAccessible()) {
                method2.setAccessible(true);
            }
            method2.invoke(r2, new Object[0]);
        } catch (IllegalAccessException e2) {
            e = e2;
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e3) {
            e = e3;
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) r2.findViewById(com.didjdk.adbhelper.R.id.aq);
        ViewGroup viewGroup3 = (ViewGroup) this.f1283f.findViewById(R.id.content);
        if (viewGroup3 != null) {
            while (viewGroup3.getChildCount() > 0) {
                View childAt = viewGroup3.getChildAt(0);
                viewGroup3.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup3.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup3 instanceof FrameLayout) {
                ((FrameLayout) viewGroup3).setForeground(null);
            }
        }
        this.f1283f.setContentView(r2);
        contentFrameLayout.setAttachListener(new C0200p(this));
        this.f1298u = r2;
        Object obj = this.f1281d;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f1288k;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC0249c0 interfaceC0249c1 = this.f1289l;
            if (interfaceC0249c1 != null) {
                interfaceC0249c1.setWindowTitle(title);
            } else {
                AbstractC0185a abstractC0185a = this.f1286i;
                if (abstractC0185a != null) {
                    abstractC0185a.mo774r(title);
                } else {
                    TextView textView = this.f1299v;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f1298u.findViewById(R.id.content);
        View decorView = this.f1283f.getDecorView();
        contentFrameLayout2.f249h.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = this.f1282e.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(118)) {
            typedArrayObtainStyledAttributes2.getValue(118, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(119)) {
            typedArrayObtainStyledAttributes2.getValue(119, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f1297t = true;
        j jVarM835N = m835N(0);
        if (this.f1267L || jVarM835N.f1326h != null) {
            return;
        }
        m838Q(108);
    }

    /* JADX INFO: renamed from: K */
    public final void m832K() {
        if (this.f1283f == null) {
            Object obj = this.f1281d;
            if (obj instanceof Activity) {
                m824C(((Activity) obj).getWindow());
            }
        }
        if (this.f1283f == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* JADX INFO: renamed from: L */
    public j m833L(Menu menu) {
        j[] jVarArr = this.f1261F;
        int length = jVarArr != null ? jVarArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            j jVar = jVarArr[i2];
            if (jVar != null && jVar.f1326h == menu) {
                return jVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: M */
    public final g m834M() {
        if (this.f1272Q == null) {
            Context context = this.f1282e;
            if (C0206v.f1364d == null) {
                Context applicationContext = context.getApplicationContext();
                C0206v.f1364d = new C0206v(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f1272Q = new h(C0206v.f1364d);
        }
        return this.f1272Q;
    }

    /* JADX INFO: renamed from: N */
    public j m835N(int i2) {
        j[] jVarArr = this.f1261F;
        if (jVarArr == null || jVarArr.length <= i2) {
            j[] jVarArr2 = new j[i2 + 1];
            if (jVarArr != null) {
                System.arraycopy(jVarArr, 0, jVarArr2, 0, jVarArr.length);
            }
            this.f1261F = jVarArr2;
            jVarArr = jVarArr2;
        }
        j jVar = jVarArr[i2];
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j(i2);
        jVarArr[i2] = jVar2;
        return jVar2;
    }

    /* JADX INFO: renamed from: O */
    public final Window.Callback m836O() {
        return this.f1283f.getCallback();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    /* JADX WARN: Code duplicated, block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: P */
    public final void m837P() {
        C0207w c0207w;
        AbstractC0185a abstractC0185a;
        m831J();
        if (this.f1303z && this.f1286i == null) {
            Object obj = this.f1281d;
            if (!(obj instanceof Activity)) {
                if (obj instanceof Dialog) {
                    c0207w = new C0207w((Dialog) this.f1281d);
                }
                abstractC0185a = this.f1286i;
                if (abstractC0185a != null) {
                    abstractC0185a.mo768l(this.f1277V);
                }
            }
            c0207w = new C0207w((Activity) this.f1281d, this.f1256A);
            this.f1286i = c0207w;
            abstractC0185a = this.f1286i;
            if (abstractC0185a != null) {
                abstractC0185a.mo768l(this.f1277V);
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m838Q(int i2) {
        this.f1275T = (1 << i2) | this.f1275T;
        if (this.f1274S) {
            return;
        }
        View decorView = this.f1283f.getDecorView();
        Runnable runnable = this.f1276U;
        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
        decorView.postOnAnimation(runnable);
        this.f1274S = true;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x015b  */
    /* JADX WARN: Code duplicated, block: B:85:0x0160  */
    /* JADX WARN: Code duplicated, block: B:91:0x0175  */
    /* JADX WARN: Code duplicated, block: B:94:0x0179  */
    /* JADX WARN: Code duplicated, block: B:96:0x0181  */
    /* JADX WARN: Code duplicated, block: B:99:0x0197  */
    /* JADX INFO: renamed from: R */
    public final void m839R(j jVar, KeyEvent keyEvent) {
        boolean z;
        boolean z2;
        ViewGroup.LayoutParams layoutParams;
        ViewParent parent;
        int i2;
        ViewGroup.LayoutParams layoutParams2;
        if (jVar.f1331m || this.f1267L) {
            return;
        }
        if (jVar.f1319a == 0) {
            if ((this.f1282e.getResources().getConfiguration().screenLayout & 15) == 4) {
                return;
            }
        }
        Window.Callback callbackM836O = m836O();
        if (callbackM836O != null && !callbackM836O.onMenuOpened(jVar.f1319a, jVar.f1326h)) {
            m827F(jVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f1282e.getSystemService("window");
        if (windowManager != null && m841T(jVar, keyEvent)) {
            ViewGroup viewGroup = jVar.f1323e;
            if (viewGroup != null && !jVar.f1333o) {
                View view = jVar.f1325g;
                if (view != null && (layoutParams2 = view.getLayoutParams()) != null && layoutParams2.width == -1) {
                    i2 = -1;
                }
                jVar.f1330l = false;
                WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i2, -2, 0, 0, 1002, 8519680, -3);
                layoutParams3.gravity = jVar.f1321c;
                layoutParams3.windowAnimations = jVar.f1322d;
                windowManager.addView(jVar.f1323e, layoutParams3);
                jVar.f1331m = true;
            }
            if (viewGroup == null) {
                m837P();
                AbstractC0185a abstractC0185a = this.f1286i;
                Context contextMo761e = abstractC0185a != null ? abstractC0185a.mo761e() : null;
                if (contextMo761e == null) {
                    contextMo761e = this.f1282e;
                }
                TypedValue typedValue = new TypedValue();
                Resources.Theme themeNewTheme = contextMo761e.getResources().newTheme();
                themeNewTheme.setTo(contextMo761e.getTheme());
                themeNewTheme.resolveAttribute(com.didjdk.adbhelper.R.attr.c, typedValue, true);
                int i3 = typedValue.resourceId;
                if (i3 != 0) {
                    themeNewTheme.applyStyle(i3, true);
                }
                themeNewTheme.resolveAttribute(com.didjdk.adbhelper.R.attr.n6, typedValue, true);
                int i4 = typedValue.resourceId;
                if (i4 == 0) {
                    i4 = com.didjdk.adbhelper.R.style.jy;
                }
                themeNewTheme.applyStyle(i4, true);
                C0217c c0217c = new C0217c(contextMo761e, 0);
                c0217c.getTheme().setTo(themeNewTheme);
                jVar.f1328j = c0217c;
                TypedArray typedArrayObtainStyledAttributes = c0217c.obtainStyledAttributes(C0184b.f1209j);
                jVar.f1320b = typedArrayObtainStyledAttributes.getResourceId(84, 0);
                jVar.f1322d = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                typedArrayObtainStyledAttributes.recycle();
                jVar.f1323e = new i(jVar.f1328j);
                jVar.f1321c = 81;
            } else if (jVar.f1333o && viewGroup.getChildCount() > 0) {
                jVar.f1323e.removeAllViews();
            }
            View view2 = jVar.f1325g;
            if (view2 != null) {
                jVar.f1324f = view2;
            } else {
                if (jVar.f1326h != null) {
                    if (this.f1291n == null) {
                        this.f1291n = new k();
                    }
                    k kVar = this.f1291n;
                    if (jVar.f1327i == null) {
                        C0227e c0227e = new C0227e(jVar.f1328j, com.didjdk.adbhelper.R.layout.q);
                        jVar.f1327i = c0227e;
                        c0227e.f1619f = kVar;
                        C0229g c0229g = jVar.f1326h;
                        c0229g.m942b(c0227e, c0229g.f1630a);
                    }
                    C0227e c0227e2 = jVar.f1327i;
                    ViewGroup viewGroup2 = jVar.f1323e;
                    if (c0227e2.f1618e == null) {
                        c0227e2.f1618e = (ExpandedMenuView) c0227e2.f1616c.inflate(com.didjdk.adbhelper.R.layout.n, viewGroup2, false);
                        if (c0227e2.f1620g == null) {
                            c0227e2.f1620g = c0227e2.new a();
                        }
                        c0227e2.f1618e.setAdapter((ListAdapter) c0227e2.f1620g);
                        c0227e2.f1618e.setOnItemClickListener(c0227e2);
                    }
                    ExpandedMenuView expandedMenuView = c0227e2.f1618e;
                    jVar.f1324f = expandedMenuView;
                    if (expandedMenuView != null) {
                    }
                    if (!z) {
                        return;
                    }
                    if (jVar.f1324f == null && (jVar.f1325g != null || ((C0227e.a) jVar.f1327i.m936b()).getCount() > 0)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        return;
                    }
                    layoutParams = jVar.f1324f.getLayoutParams();
                    if (layoutParams == null) {
                        layoutParams = new ViewGroup.LayoutParams(-2, -2);
                    }
                    jVar.f1323e.setBackgroundResource(jVar.f1320b);
                    parent = jVar.f1324f.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(jVar.f1324f);
                    }
                    jVar.f1323e.addView(jVar.f1324f, layoutParams);
                    if (!jVar.f1324f.hasFocus()) {
                        jVar.f1324f.requestFocus();
                    }
                }
                z = false;
                if (!z) {
                    return;
                }
                if (jVar.f1324f == null) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!z2) {
                    return;
                }
                layoutParams = jVar.f1324f.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new ViewGroup.LayoutParams(-2, -2);
                }
                jVar.f1323e.setBackgroundResource(jVar.f1320b);
                parent = jVar.f1324f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(jVar.f1324f);
                }
                jVar.f1323e.addView(jVar.f1324f, layoutParams);
                if (!jVar.f1324f.hasFocus()) {
                    jVar.f1324f.requestFocus();
                }
            }
            z = true;
            if (!z) {
                return;
            }
            if (jVar.f1324f == null) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2) {
                return;
            }
            layoutParams = jVar.f1324f.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-2, -2);
            }
            jVar.f1323e.setBackgroundResource(jVar.f1320b);
            parent = jVar.f1324f.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(jVar.f1324f);
            }
            jVar.f1323e.addView(jVar.f1324f, layoutParams);
            if (!jVar.f1324f.hasFocus()) {
                jVar.f1324f.requestFocus();
            }
            i2 = -2;
            jVar.f1330l = false;
            WindowManager.LayoutParams layoutParams4 = new WindowManager.LayoutParams(i2, -2, 0, 0, 1002, 8519680, -3);
            layoutParams4.gravity = jVar.f1321c;
            layoutParams4.windowAnimations = jVar.f1322d;
            windowManager.addView(jVar.f1323e, layoutParams4);
            jVar.f1331m = true;
        }
    }

    /* JADX INFO: renamed from: S */
    public final boolean m840S(j jVar, int i2, KeyEvent keyEvent, int i3) {
        C0229g c0229g;
        boolean zPerformShortcut = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((jVar.f1329k || m841T(jVar, keyEvent)) && (c0229g = jVar.f1326h) != null) {
            zPerformShortcut = c0229g.performShortcut(i2, keyEvent, i3);
        }
        if (zPerformShortcut && (i3 & 1) == 0 && this.f1289l == null) {
            m827F(jVar, true);
        }
        return zPerformShortcut;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m841T(j jVar, KeyEvent keyEvent) {
        InterfaceC0249c0 interfaceC0249c0;
        InterfaceC0249c0 interfaceC0249c1;
        Resources.Theme themeNewTheme;
        InterfaceC0249c0 interfaceC0249c2;
        InterfaceC0249c0 interfaceC0249c3;
        if (this.f1267L) {
            return false;
        }
        if (jVar.f1329k) {
            return true;
        }
        j jVar2 = this.f1262G;
        if (jVar2 != null && jVar2 != jVar) {
            m827F(jVar2, false);
        }
        Window.Callback callbackM836O = m836O();
        if (callbackM836O != null) {
            jVar.f1325g = callbackM836O.onCreatePanelView(jVar.f1319a);
        }
        int i2 = jVar.f1319a;
        boolean z = i2 == 0 || i2 == 108;
        if (z && (interfaceC0249c3 = this.f1289l) != null) {
            interfaceC0249c3.mo38f();
        }
        if (jVar.f1325g == null && (!z || !(this.f1286i instanceof C0204t))) {
            C0229g c0229g = jVar.f1326h;
            if (c0229g == null || jVar.f1334p) {
                if (c0229g == null) {
                    Context context = this.f1282e;
                    int i3 = jVar.f1319a;
                    if ((i3 == 0 || i3 == 108) && this.f1289l != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(com.didjdk.adbhelper.R.attr.j, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            themeNewTheme.resolveAttribute(com.didjdk.adbhelper.R.attr.k, typedValue, true);
                        } else {
                            theme.resolveAttribute(com.didjdk.adbhelper.R.attr.k, typedValue, true);
                            themeNewTheme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (themeNewTheme == null) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                            }
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                        }
                        if (themeNewTheme != null) {
                            C0217c c0217c = new C0217c(context, 0);
                            c0217c.getTheme().setTo(themeNewTheme);
                            context = c0217c;
                        }
                    }
                    C0229g c0229g2 = new C0229g(context);
                    c0229g2.f1634e = this;
                    jVar.m856a(c0229g2);
                    if (jVar.f1326h == null) {
                        return false;
                    }
                }
                if (z && (interfaceC0249c1 = this.f1289l) != null) {
                    if (this.f1290m == null) {
                        this.f1290m = new c();
                    }
                    interfaceC0249c1.mo33a(jVar.f1326h, this.f1290m);
                }
                jVar.f1326h.m966z();
                if (!callbackM836O.onCreatePanelMenu(jVar.f1319a, jVar.f1326h)) {
                    jVar.m856a(null);
                    if (z && (interfaceC0249c0 = this.f1289l) != null) {
                        interfaceC0249c0.mo33a(null, this.f1290m);
                    }
                    return false;
                }
                jVar.f1334p = false;
            }
            jVar.f1326h.m966z();
            Bundle bundle = jVar.f1335q;
            if (bundle != null) {
                jVar.f1326h.m962v(bundle);
                jVar.f1335q = null;
            }
            if (!callbackM836O.onPreparePanel(0, jVar.f1325g, jVar.f1326h)) {
                if (z && (interfaceC0249c2 = this.f1289l) != null) {
                    interfaceC0249c2.mo33a(null, this.f1290m);
                }
                jVar.f1326h.m965y();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            jVar.f1332n = z2;
            jVar.f1326h.setQwertyMode(z2);
            jVar.f1326h.m965y();
        }
        jVar.f1329k = true;
        jVar.f1330l = false;
        this.f1262G = jVar;
        return true;
    }

    /* JADX INFO: renamed from: U */
    public final boolean m842U() {
        ViewGroup viewGroup;
        if (this.f1297t && (viewGroup = this.f1298u) != null) {
            WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
            if (viewGroup.isLaidOut()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: V */
    public final void m843V() {
        if (this.f1297t) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* JADX INFO: renamed from: W */
    public int m844W(int i2) {
        boolean z;
        boolean z2;
        ActionBarContextView actionBarContextView = this.f1293p;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1293p.getLayoutParams();
            boolean z3 = true;
            if (this.f1293p.isShown()) {
                if (this.f1278W == null) {
                    this.f1278W = new Rect();
                    this.f1279X = new Rect();
                }
                Rect rect = this.f1278W;
                Rect rect2 = this.f1279X;
                rect.set(0, i2, 0, 0);
                C0253d1.m1049a(this.f1298u, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i2 : 0)) {
                    marginLayoutParams.topMargin = i2;
                    View view = this.f1300w;
                    if (view == null) {
                        View view2 = new View(this.f1282e);
                        this.f1300w = view2;
                        view2.setBackgroundColor(this.f1282e.getResources().getColor(com.didjdk.adbhelper.R.color.g));
                        this.f1298u.addView(this.f1300w, -1, new ViewGroup.LayoutParams(-1, i2));
                    } else {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams.height != i2) {
                            layoutParams.height = i2;
                            this.f1300w.setLayoutParams(layoutParams);
                        }
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = this.f1300w != null;
                if (!this.f1257B && z3) {
                    i2 = 0;
                }
                boolean z4 = z3;
                z3 = z2;
                z = z4;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                z3 = false;
            }
            if (z3) {
                this.f1293p.setLayoutParams(marginLayoutParams);
            }
        }
        View view3 = this.f1300w;
        if (view3 != null) {
            view3.setVisibility(z ? 0 : 8);
        }
        return i2;
    }

    @Override // p006b.p008b.p016h.p017i.C0229g.a
    /* JADX INFO: renamed from: a */
    public boolean mo62a(C0229g c0229g, MenuItem menuItem) {
        j jVarM833L;
        Window.Callback callbackM836O = m836O();
        if (callbackM836O == null || this.f1267L || (jVarM833L = m833L(c0229g.mo951k())) == null) {
            return false;
        }
        return callbackM836O.onMenuItemSelected(jVarM833L.f1319a, menuItem);
    }

    @Override // p006b.p008b.p016h.p017i.C0229g.a
    /* JADX INFO: renamed from: b */
    public void mo63b(C0229g c0229g) {
        InterfaceC0249c0 interfaceC0249c0 = this.f1289l;
        if (interfaceC0249c0 == null || !interfaceC0249c0.mo39g() || (ViewConfiguration.get(this.f1282e).hasPermanentMenuKey() && !this.f1289l.mo34b())) {
            j jVarM835N = m835N(0);
            jVarM835N.f1333o = true;
            m827F(jVarM835N, false);
            m839R(jVarM835N, null);
            return;
        }
        Window.Callback callbackM836O = m836O();
        if (this.f1289l.mo35c()) {
            this.f1289l.mo36d();
            if (this.f1267L) {
                return;
            }
            callbackM836O.onPanelClosed(108, m835N(0).f1326h);
            return;
        }
        if (callbackM836O == null || this.f1267L) {
            return;
        }
        if (this.f1274S && (1 & this.f1275T) != 0) {
            this.f1283f.getDecorView().removeCallbacks(this.f1276U);
            this.f1276U.run();
        }
        j jVarM835N2 = m835N(0);
        C0229g c0229g2 = jVarM835N2.f1326h;
        if (c0229g2 == null || jVarM835N2.f1334p || !callbackM836O.onPreparePanel(0, jVarM835N2.f1325g, c0229g2)) {
            return;
        }
        callbackM836O.onMenuOpened(108, jVarM835N2.f1326h);
        this.f1289l.mo37e();
    }

    @Override // p006b.p008b.p009c.AbstractC0196l
    /* JADX INFO: renamed from: c */
    public void mo799c(View view, ViewGroup.LayoutParams layoutParams) {
        m831J();
        ((ViewGroup) this.f1298u.findViewById(R.id.content)).addView(view, layoutParams);
        this.f1284g.f1550b.onContentChanged();
    }

    @Override // p006b.p008b.p009c.AbstractC0196l
    /* JADX INFO: renamed from: d */
    public void mo800d(Context context) throws IllegalAccessException {
        m823B(false);
        this.f1264I = true;
    }

    @Override // p006b.p008b.p009c.AbstractC0196l
    /* JADX INFO: renamed from: e */
    public <T extends View> T mo801e(int i2) {
        m831J();
        return (T) this.f1283f.findViewById(i2);
    }

    @Override // p006b.p008b.p009c.AbstractC0196l
    /* JADX INFO: renamed from: f */
    public int mo802f() {
        return this.f1268M;
    }

    @Override // p006b.p008b.p009c.AbstractC0196l
    /* JADX INFO: renamed from: g */
    public MenuInflater mo803g() {
        if (this.f1287j == null) {
            m837P();
            AbstractC0185a abstractC0185a = this.f1286i;
            this.f1287j = new C0220f(abstractC0185a != null ? abstractC0185a.mo761e() : this.f1282e);
        }
        return this.f1287j;
    }

    @Override // p006b.p008b.p009c.AbstractC0196l
    /* JADX INFO: renamed from: h */
    public AbstractC0185a mo804h() {
        m837P();
        return this.f1286i;
    }

    @Override // p006b.p008b.p009c.AbstractC0196l
    /* JADX INFO: renamed from: i */
    public void mo805i() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f1282e);
        if (layoutInflaterFrom.getFactory() == null) {
            C0360f.m1422N(layoutInflaterFrom, this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof LayoutInflaterFactory2C0197m) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // p006b.p008b.p009c.AbstractC0196l
    /* JADX INFO: renamed from: j */
    public void mo806j() {
        m837P();
        AbstractC0185a abstractC0185a = this.f1286i;
        if (abstractC0185a == null || !abstractC0185a.mo762f()) {
            m838Q(0);
        }
    }

    @Override // p006b.p008b.p009c.AbstractC0196l
    /* JADX INFO: renamed from: k */
    public void mo807k(Configuration configuration) throws IllegalAccessException {
        if (this.f1303z && this.f1297t) {
            m837P();
            AbstractC0185a abstractC0185a = this.f1286i;
            if (abstractC0185a != null) {
                abstractC0185a.mo763g(configuration);
            }
        }
        C0265j c0265jM1079a = C0265j.m1079a();
        Context context = this.f1282e;
        synchronized (c0265jM1079a) {
            C0274n0 c0274n0 = c0265jM1079a.f1884a;
            synchronized (c0274n0) {
                C0317e<WeakReference<Drawable.ConstantState>> c0317e = c0274n0.f1948d.get(context);
                if (c0317e != null) {
                    c0317e.m1250b();
                }
            }
        }
        m823B(false);
    }

    @Override // p006b.p008b.p009c.AbstractC0196l
    /* JADX INFO: renamed from: l */
    public void mo808l(Bundle bundle) throws IllegalAccessException {
        this.f1264I = true;
        m823B(false);
        m832K();
        Object obj = this.f1281d;
        if (obj instanceof Activity) {
            String strM1464x = null;
            try {
                Activity activity = (Activity) obj;
                try {
                    strM1464x = C0360f.m1464x(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e2) {
                    throw new IllegalArgumentException(e2);
                }
            } catch (IllegalArgumentException unused) {
            }
            if (strM1464x != null) {
                AbstractC0185a abstractC0185a = this.f1286i;
                if (abstractC0185a == null) {
                    this.f1277V = true;
                } else {
                    abstractC0185a.mo768l(true);
                }
            }
        }
        this.f1265J = true;
    }

    @Override // p006b.p008b.p009c.AbstractC0196l
    /* JADX INFO: renamed from: m */
    public void mo809m() {
        synchronized (AbstractC0196l.f1250c) {
            AbstractC0196l.m798s(this);
        }
        if (this.f1274S) {
            this.f1283f.getDecorView().removeCallbacks(this.f1276U);
        }
        this.f1266K = false;
        this.f1267L = true;
        AbstractC0185a abstractC0185a = this.f1286i;
        if (abstractC0185a != null) {
            abstractC0185a.mo764h();
        }
        g gVar = this.f1272Q;
        if (gVar != null) {
            gVar.m854a();
        }
        g gVar2 = this.f1273R;
        if (gVar2 != null) {
            gVar2.m854a();
        }
    }

    @Override // p006b.p008b.p009c.AbstractC0196l
    /* JADX INFO: renamed from: n */
    public void mo810n(Bundle bundle) {
        m831J();
    }

    @Override // p006b.p008b.p009c.AbstractC0196l
    /* JADX INFO: renamed from: o */
    public void mo811o() {
        m837P();
        AbstractC0185a abstractC0185a = this.f1286i;
        if (abstractC0185a != null) {
            abstractC0185a.mo771o(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        AppCompatViewInflater appCompatViewInflater;
        boolean z2 = false;
        if (this.f1280Y == null) {
            String string = this.f1282e.obtainStyledAttributes(C0184b.f1209j).getString(114);
            if (string == null || AppCompatViewInflater.class.getName().equals(string)) {
                appCompatViewInflater = new AppCompatViewInflater();
            } else {
                try {
                    this.f1280Y = (AppCompatViewInflater) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    appCompatViewInflater = new AppCompatViewInflater();
                    this.f1280Y = appCompatViewInflater;
                }
            }
            this.f1280Y = appCompatViewInflater;
        }
        if (f1252a0) {
            if (!(attributeSet instanceof XmlPullParser)) {
                ViewParent parent = (ViewParent) view;
                if (parent != null) {
                    View decorView = this.f1283f.getDecorView();
                    while (true) {
                        if (parent == null) {
                            z2 = true;
                            break;
                        }
                        if (parent == decorView || !(parent instanceof View)) {
                            break;
                        }
                        WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
                        if (((View) parent).isAttachedToWindow()) {
                            break;
                        }
                        parent = parent.getParent();
                    }
                }
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z2 = true;
                break;
            }
            z = z2;
        } else {
            z = false;
        }
        return this.f1280Y.createView(view, str, context, attributeSet, z, f1252a0, true, C0250c1.m1023a());
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // p006b.p008b.p009c.AbstractC0196l
    /* JADX INFO: renamed from: p */
    public void mo812p(Bundle bundle) {
        if (this.f1268M != -100) {
            ((C0320h) f1251Z).put(this.f1281d.getClass(), Integer.valueOf(this.f1268M));
        }
    }

    @Override // p006b.p008b.p009c.AbstractC0196l
    /* JADX INFO: renamed from: q */
    public void mo813q() {
        this.f1266K = true;
        m822A();
        synchronized (AbstractC0196l.f1250c) {
            AbstractC0196l.m798s(this);
            AbstractC0196l.f1249b.add(new WeakReference<>(this));
        }
    }

    @Override // p006b.p008b.p009c.AbstractC0196l
    /* JADX INFO: renamed from: r */
    public void mo814r() {
        this.f1266K = false;
        synchronized (AbstractC0196l.f1250c) {
            AbstractC0196l.m798s(this);
        }
        m837P();
        AbstractC0185a abstractC0185a = this.f1286i;
        if (abstractC0185a != null) {
            abstractC0185a.mo771o(false);
        }
        if (this.f1281d instanceof Dialog) {
            g gVar = this.f1272Q;
            if (gVar != null) {
                gVar.m854a();
            }
            g gVar2 = this.f1273R;
            if (gVar2 != null) {
                gVar2.m854a();
            }
        }
    }

    @Override // p006b.p008b.p009c.AbstractC0196l
    /* JADX INFO: renamed from: t */
    public boolean mo815t(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i2 = 108;
        } else if (i2 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i2 = 109;
        }
        if (this.f1259D && i2 == 108) {
            return false;
        }
        if (this.f1303z && i2 == 1) {
            this.f1303z = false;
        }
        if (i2 == 1) {
            m843V();
            this.f1259D = true;
            return true;
        }
        if (i2 == 2) {
            m843V();
            this.f1301x = true;
            return true;
        }
        if (i2 == 5) {
            m843V();
            this.f1302y = true;
            return true;
        }
        if (i2 == 10) {
            m843V();
            this.f1257B = true;
            return true;
        }
        if (i2 == 108) {
            m843V();
            this.f1303z = true;
            return true;
        }
        if (i2 != 109) {
            return this.f1283f.requestFeature(i2);
        }
        m843V();
        this.f1256A = true;
        return true;
    }

    @Override // p006b.p008b.p009c.AbstractC0196l
    /* JADX INFO: renamed from: u */
    public void mo816u(int i2) {
        m831J();
        ViewGroup viewGroup = (ViewGroup) this.f1298u.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f1282e).inflate(i2, viewGroup);
        this.f1284g.f1550b.onContentChanged();
    }

    @Override // p006b.p008b.p009c.AbstractC0196l
    /* JADX INFO: renamed from: v */
    public void mo817v(View view) {
        m831J();
        ViewGroup viewGroup = (ViewGroup) this.f1298u.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f1284g.f1550b.onContentChanged();
    }

    @Override // p006b.p008b.p009c.AbstractC0196l
    /* JADX INFO: renamed from: w */
    public void mo818w(View view, ViewGroup.LayoutParams layoutParams) {
        m831J();
        ViewGroup viewGroup = (ViewGroup) this.f1298u.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f1284g.f1550b.onContentChanged();
    }

    @Override // p006b.p008b.p009c.AbstractC0196l
    /* JADX INFO: renamed from: x */
    public void mo819x(Toolbar toolbar) {
        Window window;
        Window.Callback callback;
        if (this.f1281d instanceof Activity) {
            m837P();
            AbstractC0185a abstractC0185a = this.f1286i;
            if (abstractC0185a instanceof C0207w) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.f1287j = null;
            if (abstractC0185a != null) {
                abstractC0185a.mo764h();
            }
            if (toolbar != null) {
                Object obj = this.f1281d;
                C0204t c0204t = new C0204t(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : this.f1288k, this.f1284g);
                this.f1286i = c0204t;
                window = this.f1283f;
                callback = c0204t.f1348c;
            } else {
                this.f1286i = null;
                window = this.f1283f;
                callback = this.f1284g;
            }
            window.setCallback(callback);
            mo806j();
        }
    }

    @Override // p006b.p008b.p009c.AbstractC0196l
    /* JADX INFO: renamed from: y */
    public void mo820y(int i2) {
        this.f1269N = i2;
    }

    @Override // p006b.p008b.p009c.AbstractC0196l
    /* JADX INFO: renamed from: z */
    public final void mo821z(CharSequence charSequence) {
        this.f1288k = charSequence;
        InterfaceC0249c0 interfaceC0249c0 = this.f1289l;
        if (interfaceC0249c0 != null) {
            interfaceC0249c0.setWindowTitle(charSequence);
            return;
        }
        AbstractC0185a abstractC0185a = this.f1286i;
        if (abstractC0185a != null) {
            abstractC0185a.mo774r(charSequence);
            return;
        }
        TextView textView = this.f1299v;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX INFO: renamed from: b.b.c.m$e */
    public class e extends WindowCallbackC0222h {
        public e(Window.Callback callback) {
            super(callback);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /* JADX INFO: renamed from: a */
        public final ActionMode m850a(ActionMode.Callback callback) {
            AbstractC0215a abstractC0215aMo789i;
            Context c0217c;
            InterfaceC0195k interfaceC0195k;
            InterfaceC0195k interfaceC0195k2;
            C0219e.a aVar = new C0219e.a(LayoutInflaterFactory2C0197m.this.f1282e, callback);
            LayoutInflaterFactory2C0197m layoutInflaterFactory2C0197m = LayoutInflaterFactory2C0197m.this;
            Objects.requireNonNull(layoutInflaterFactory2C0197m);
            AbstractC0215a abstractC0215a = layoutInflaterFactory2C0197m.f1292o;
            if (abstractC0215a != null) {
                abstractC0215a.mo869c();
            }
            d dVar = layoutInflaterFactory2C0197m.new d(aVar);
            layoutInflaterFactory2C0197m.m837P();
            AbstractC0185a abstractC0185a = layoutInflaterFactory2C0197m.f1286i;
            if (abstractC0185a != null) {
                AbstractC0215a abstractC0215aMo775s = abstractC0185a.mo775s(dVar);
                layoutInflaterFactory2C0197m.f1292o = abstractC0215aMo775s;
                if (abstractC0215aMo775s != null && (interfaceC0195k2 = layoutInflaterFactory2C0197m.f1285h) != null) {
                    interfaceC0195k2.mo787f(abstractC0215aMo775s);
                }
            }
            if (layoutInflaterFactory2C0197m.f1292o == null) {
                layoutInflaterFactory2C0197m.m830I();
                AbstractC0215a abstractC0215a2 = layoutInflaterFactory2C0197m.f1292o;
                if (abstractC0215a2 != null) {
                    abstractC0215a2.mo869c();
                }
                InterfaceC0195k interfaceC0195k3 = layoutInflaterFactory2C0197m.f1285h;
                if (interfaceC0195k3 == null || layoutInflaterFactory2C0197m.f1267L) {
                    abstractC0215aMo789i = null;
                } else {
                    try {
                        abstractC0215aMo789i = interfaceC0195k3.mo789i(dVar);
                    } catch (AbstractMethodError unused) {
                        abstractC0215aMo789i = null;
                    }
                }
                if (abstractC0215aMo789i != null) {
                    layoutInflaterFactory2C0197m.f1292o = abstractC0215aMo789i;
                } else {
                    if (layoutInflaterFactory2C0197m.f1293p == null) {
                        if (layoutInflaterFactory2C0197m.f1258C) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = layoutInflaterFactory2C0197m.f1282e.getTheme();
                            theme.resolveAttribute(com.didjdk.adbhelper.R.attr.j, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                Resources.Theme themeNewTheme = layoutInflaterFactory2C0197m.f1282e.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                c0217c = new C0217c(layoutInflaterFactory2C0197m.f1282e, 0);
                                c0217c.getTheme().setTo(themeNewTheme);
                            } else {
                                c0217c = layoutInflaterFactory2C0197m.f1282e;
                            }
                            layoutInflaterFactory2C0197m.f1293p = new ActionBarContextView(c0217c, null);
                            PopupWindow popupWindow = new PopupWindow(c0217c, (AttributeSet) null, com.didjdk.adbhelper.R.attr.x);
                            layoutInflaterFactory2C0197m.f1294q = popupWindow;
                            C0360f.m1436a0(popupWindow, 2);
                            layoutInflaterFactory2C0197m.f1294q.setContentView(layoutInflaterFactory2C0197m.f1293p);
                            layoutInflaterFactory2C0197m.f1294q.setWidth(-1);
                            c0217c.getTheme().resolveAttribute(com.didjdk.adbhelper.R.attr.d, typedValue, true);
                            layoutInflaterFactory2C0197m.f1293p.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, c0217c.getResources().getDisplayMetrics()));
                            layoutInflaterFactory2C0197m.f1294q.setHeight(-2);
                            layoutInflaterFactory2C0197m.f1295r = new RunnableC0201q(layoutInflaterFactory2C0197m);
                        } else {
                            ViewStubCompat viewStubCompat = (ViewStubCompat) layoutInflaterFactory2C0197m.f1298u.findViewById(com.didjdk.adbhelper.R.id.b4);
                            if (viewStubCompat != null) {
                                layoutInflaterFactory2C0197m.m837P();
                                AbstractC0185a abstractC0185a2 = layoutInflaterFactory2C0197m.f1286i;
                                Context contextMo761e = abstractC0185a2 != null ? abstractC0185a2.mo761e() : null;
                                if (contextMo761e == null) {
                                    contextMo761e = layoutInflaterFactory2C0197m.f1282e;
                                }
                                viewStubCompat.setLayoutInflater(LayoutInflater.from(contextMo761e));
                                layoutInflaterFactory2C0197m.f1293p = (ActionBarContextView) viewStubCompat.m126a();
                            }
                        }
                    }
                    if (layoutInflaterFactory2C0197m.f1293p != null) {
                        layoutInflaterFactory2C0197m.m830I();
                        layoutInflaterFactory2C0197m.f1293p.m32h();
                        C0218d c0218d = new C0218d(layoutInflaterFactory2C0197m.f1293p.getContext(), layoutInflaterFactory2C0197m.f1293p, dVar, layoutInflaterFactory2C0197m.f1294q == null);
                        if (dVar.mo847c(c0218d, c0218d.f1493i)) {
                            c0218d.mo875i();
                            layoutInflaterFactory2C0197m.f1293p.m30f(c0218d);
                            layoutInflaterFactory2C0197m.f1292o = c0218d;
                            if (layoutInflaterFactory2C0197m.m842U()) {
                                layoutInflaterFactory2C0197m.f1293p.setAlpha(0.0f);
                                C0423r c0423rM1558a = C0418m.m1558a(layoutInflaterFactory2C0197m.f1293p);
                                c0423rM1558a.m1591a(1.0f);
                                layoutInflaterFactory2C0197m.f1296s = c0423rM1558a;
                                C0202r c0202r = new C0202r(layoutInflaterFactory2C0197m);
                                View view = c0423rM1558a.f2732a.get();
                                if (view != null) {
                                    c0423rM1558a.m1595e(view, c0202r);
                                }
                            } else {
                                layoutInflaterFactory2C0197m.f1293p.setAlpha(1.0f);
                                layoutInflaterFactory2C0197m.f1293p.setVisibility(0);
                                layoutInflaterFactory2C0197m.f1293p.sendAccessibilityEvent(32);
                                if (layoutInflaterFactory2C0197m.f1293p.getParent() instanceof View) {
                                    C0418m.m1576s((View) layoutInflaterFactory2C0197m.f1293p.getParent());
                                }
                            }
                            if (layoutInflaterFactory2C0197m.f1294q != null) {
                                layoutInflaterFactory2C0197m.f1283f.getDecorView().post(layoutInflaterFactory2C0197m.f1295r);
                            }
                        } else {
                            layoutInflaterFactory2C0197m.f1292o = null;
                        }
                    }
                }
                AbstractC0215a abstractC0215a3 = layoutInflaterFactory2C0197m.f1292o;
                if (abstractC0215a3 != null && (interfaceC0195k = layoutInflaterFactory2C0197m.f1285h) != null) {
                    interfaceC0195k.mo787f(abstractC0215a3);
                }
                layoutInflaterFactory2C0197m.f1292o = layoutInflaterFactory2C0197m.f1292o;
            }
            AbstractC0215a abstractC0215a4 = layoutInflaterFactory2C0197m.f1292o;
            if (abstractC0215a4 != null) {
                return aVar.m906e(abstractC0215a4);
            }
            return null;
        }

        @Override // p006b.p008b.p016h.WindowCallbackC0222h, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return LayoutInflaterFactory2C0197m.this.m828G(keyEvent) || this.f1550b.dispatchKeyEvent(keyEvent);
        }

        @Override // p006b.p008b.p016h.WindowCallbackC0222h, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            boolean z;
            if (!this.f1550b.dispatchKeyShortcutEvent(keyEvent)) {
                LayoutInflaterFactory2C0197m layoutInflaterFactory2C0197m = LayoutInflaterFactory2C0197m.this;
                int keyCode = keyEvent.getKeyCode();
                layoutInflaterFactory2C0197m.m837P();
                AbstractC0185a abstractC0185a = layoutInflaterFactory2C0197m.f1286i;
                if (abstractC0185a == null || !abstractC0185a.mo765i(keyCode, keyEvent)) {
                    j jVar = layoutInflaterFactory2C0197m.f1262G;
                    if (jVar == null || !layoutInflaterFactory2C0197m.m840S(jVar, keyEvent.getKeyCode(), keyEvent, 1)) {
                        if (layoutInflaterFactory2C0197m.f1262G == null) {
                            j jVarM835N = layoutInflaterFactory2C0197m.m835N(0);
                            layoutInflaterFactory2C0197m.m841T(jVarM835N, keyEvent);
                            boolean zM840S = layoutInflaterFactory2C0197m.m840S(jVarM835N, keyEvent.getKeyCode(), keyEvent, 1);
                            jVarM835N.f1329k = false;
                            if (zM840S) {
                            }
                        }
                        z = false;
                    } else {
                        j jVar2 = layoutInflaterFactory2C0197m.f1262G;
                        if (jVar2 != null) {
                            jVar2.f1330l = true;
                        }
                    }
                    z = true;
                } else {
                    z = true;
                }
                if (!z) {
                    return false;
                }
            }
            return true;
        }

        @Override // p006b.p008b.p016h.WindowCallbackC0222h, android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // p006b.p008b.p016h.WindowCallbackC0222h, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof C0229g)) {
                return this.f1550b.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // p006b.p008b.p016h.WindowCallbackC0222h, android.view.Window.Callback
        public boolean onMenuOpened(int i, Menu menu) {
            this.f1550b.onMenuOpened(i, menu);
            LayoutInflaterFactory2C0197m layoutInflaterFactory2C0197m = LayoutInflaterFactory2C0197m.this;
            Objects.requireNonNull(layoutInflaterFactory2C0197m);
            if (i == 108) {
                layoutInflaterFactory2C0197m.m837P();
                AbstractC0185a abstractC0185a = layoutInflaterFactory2C0197m.f1286i;
                if (abstractC0185a != null) {
                    abstractC0185a.mo759c(true);
                }
            }
            return true;
        }

        @Override // p006b.p008b.p016h.WindowCallbackC0222h, android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) {
            this.f1550b.onPanelClosed(i, menu);
            LayoutInflaterFactory2C0197m layoutInflaterFactory2C0197m = LayoutInflaterFactory2C0197m.this;
            Objects.requireNonNull(layoutInflaterFactory2C0197m);
            if (i == 108) {
                layoutInflaterFactory2C0197m.m837P();
                AbstractC0185a abstractC0185a = layoutInflaterFactory2C0197m.f1286i;
                if (abstractC0185a != null) {
                    abstractC0185a.mo759c(false);
                    return;
                }
                return;
            }
            if (i == 0) {
                j jVarM835N = layoutInflaterFactory2C0197m.m835N(i);
                if (jVarM835N.f1331m) {
                    layoutInflaterFactory2C0197m.m827F(jVarM835N, false);
                }
            }
        }

        @Override // android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            C0229g c0229g = menu instanceof C0229g ? (C0229g) menu : null;
            if (i == 0 && c0229g == null) {
                return false;
            }
            if (c0229g != null) {
                c0229g.f1653x = true;
            }
            boolean zOnPreparePanel = this.f1550b.onPreparePanel(i, view, menu);
            if (c0229g != null) {
                c0229g.f1653x = false;
            }
            return zOnPreparePanel;
        }

        @Override // p006b.p008b.p016h.WindowCallbackC0222h, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            C0229g c0229g = LayoutInflaterFactory2C0197m.this.m835N(0).f1326h;
            if (c0229g != null) {
                this.f1550b.onProvideKeyboardShortcuts(list, c0229g, i);
            } else {
                this.f1550b.onProvideKeyboardShortcuts(list, menu, i);
            }
        }

        @Override // p006b.p008b.p016h.WindowCallbackC0222h, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            Objects.requireNonNull(LayoutInflaterFactory2C0197m.this);
            return m850a(callback);
        }

        @Override // p006b.p008b.p016h.WindowCallbackC0222h, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            Objects.requireNonNull(LayoutInflaterFactory2C0197m.this);
            if (i != 0) {
                return this.f1550b.onWindowStartingActionMode(callback, i);
            }
            return m850a(callback);
        }
    }
}
