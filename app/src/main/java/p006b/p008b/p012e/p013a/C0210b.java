package p006b.p008b.p012e.p013a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.SparseArray;
import java.util.Objects;
import p006b.p032h.p033b.C0360f;

/* JADX INFO: renamed from: b.b.e.a.b */
/* JADX INFO: loaded from: classes.dex */
public class C0210b extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ int f1424n = 0;

    /* JADX INFO: renamed from: b */
    public c f1425b;

    /* JADX INFO: renamed from: c */
    public Rect f1426c;

    /* JADX INFO: renamed from: d */
    public Drawable f1427d;

    /* JADX INFO: renamed from: e */
    public Drawable f1428e;

    /* JADX INFO: renamed from: g */
    public boolean f1430g;

    /* JADX INFO: renamed from: i */
    public boolean f1432i;

    /* JADX INFO: renamed from: j */
    public Runnable f1433j;

    /* JADX INFO: renamed from: k */
    public long f1434k;

    /* JADX INFO: renamed from: l */
    public long f1435l;

    /* JADX INFO: renamed from: m */
    public b f1436m;

    /* JADX INFO: renamed from: f */
    public int f1429f = 255;

    /* JADX INFO: renamed from: h */
    public int f1431h = -1;

    /* JADX INFO: renamed from: b.b.e.a.b$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0210b.this.m896a(true);
            C0210b.this.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: b.b.e.a.b$b */
    public static class b implements Drawable.Callback {

        /* JADX INFO: renamed from: b */
        public Drawable.Callback f1438b;

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Drawable.Callback callback = this.f1438b;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f1438b;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* JADX INFO: renamed from: b.b.e.a.b$c */
    public static abstract class c extends Drawable.ConstantState {

        /* JADX INFO: renamed from: A */
        public int f1439A;

        /* JADX INFO: renamed from: B */
        public int f1440B;

        /* JADX INFO: renamed from: C */
        public boolean f1441C;

        /* JADX INFO: renamed from: D */
        public ColorFilter f1442D;

        /* JADX INFO: renamed from: E */
        public boolean f1443E;

        /* JADX INFO: renamed from: F */
        public ColorStateList f1444F;

        /* JADX INFO: renamed from: G */
        public PorterDuff.Mode f1445G;

        /* JADX INFO: renamed from: H */
        public boolean f1446H;

        /* JADX INFO: renamed from: I */
        public boolean f1447I;

        /* JADX INFO: renamed from: a */
        public final C0210b f1448a;

        /* JADX INFO: renamed from: b */
        public Resources f1449b;

        /* JADX INFO: renamed from: c */
        public int f1450c;

        /* JADX INFO: renamed from: d */
        public int f1451d;

        /* JADX INFO: renamed from: e */
        public int f1452e;

        /* JADX INFO: renamed from: f */
        public SparseArray<Drawable.ConstantState> f1453f;

        /* JADX INFO: renamed from: g */
        public Drawable[] f1454g;

        /* JADX INFO: renamed from: h */
        public int f1455h;

        /* JADX INFO: renamed from: i */
        public boolean f1456i;

        /* JADX INFO: renamed from: j */
        public boolean f1457j;

        /* JADX INFO: renamed from: k */
        public Rect f1458k;

        /* JADX INFO: renamed from: l */
        public boolean f1459l;

        /* JADX INFO: renamed from: m */
        public boolean f1460m;

        /* JADX INFO: renamed from: n */
        public int f1461n;

        /* JADX INFO: renamed from: o */
        public int f1462o;

        /* JADX INFO: renamed from: p */
        public int f1463p;

        /* JADX INFO: renamed from: q */
        public int f1464q;

        /* JADX INFO: renamed from: r */
        public boolean f1465r;

        /* JADX INFO: renamed from: s */
        public int f1466s;

        /* JADX INFO: renamed from: t */
        public boolean f1467t;

        /* JADX INFO: renamed from: u */
        public boolean f1468u;

        /* JADX INFO: renamed from: v */
        public boolean f1469v;

        /* JADX INFO: renamed from: w */
        public boolean f1470w;

        /* JADX INFO: renamed from: x */
        public boolean f1471x;

        /* JADX INFO: renamed from: y */
        public boolean f1472y;

        /* JADX INFO: renamed from: z */
        public int f1473z;

        public c(c cVar, C0210b c0210b, Resources resources) {
            this.f1450c = 160;
            this.f1456i = false;
            this.f1459l = false;
            this.f1471x = true;
            this.f1439A = 0;
            this.f1440B = 0;
            this.f1448a = c0210b;
            this.f1449b = resources != null ? resources : cVar != null ? cVar.f1449b : null;
            int i = cVar != null ? cVar.f1450c : 0;
            int i2 = C0210b.f1424n;
            i = resources != null ? resources.getDisplayMetrics().densityDpi : i;
            int i3 = i != 0 ? i : 160;
            this.f1450c = i3;
            if (cVar == null) {
                this.f1454g = new Drawable[10];
                this.f1455h = 0;
                return;
            }
            this.f1451d = cVar.f1451d;
            this.f1452e = cVar.f1452e;
            this.f1469v = true;
            this.f1470w = true;
            this.f1456i = cVar.f1456i;
            this.f1459l = cVar.f1459l;
            this.f1471x = cVar.f1471x;
            this.f1472y = cVar.f1472y;
            this.f1473z = cVar.f1473z;
            this.f1439A = cVar.f1439A;
            this.f1440B = cVar.f1440B;
            this.f1441C = cVar.f1441C;
            this.f1442D = cVar.f1442D;
            this.f1443E = cVar.f1443E;
            this.f1444F = cVar.f1444F;
            this.f1445G = cVar.f1445G;
            this.f1446H = cVar.f1446H;
            this.f1447I = cVar.f1447I;
            if (cVar.f1450c == i3) {
                if (cVar.f1457j) {
                    this.f1458k = new Rect(cVar.f1458k);
                    this.f1457j = true;
                }
                if (cVar.f1460m) {
                    this.f1461n = cVar.f1461n;
                    this.f1462o = cVar.f1462o;
                    this.f1463p = cVar.f1463p;
                    this.f1464q = cVar.f1464q;
                    this.f1460m = true;
                }
            }
            if (cVar.f1465r) {
                this.f1466s = cVar.f1466s;
                this.f1465r = true;
            }
            if (cVar.f1467t) {
                this.f1468u = cVar.f1468u;
                this.f1467t = true;
            }
            Drawable[] drawableArr = cVar.f1454g;
            this.f1454g = new Drawable[drawableArr.length];
            this.f1455h = cVar.f1455h;
            SparseArray<Drawable.ConstantState> sparseArray = cVar.f1453f;
            this.f1453f = sparseArray != null ? sparseArray.clone() : new SparseArray<>(this.f1455h);
            int i4 = this.f1455h;
            for (int i5 = 0; i5 < i4; i5++) {
                if (drawableArr[i5] != null) {
                    Drawable.ConstantState constantState = drawableArr[i5].getConstantState();
                    if (constantState != null) {
                        this.f1453f.put(i5, constantState);
                    } else {
                        this.f1454g[i5] = drawableArr[i5];
                    }
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public final int m899a(Drawable drawable) {
            int i = this.f1455h;
            if (i >= this.f1454g.length) {
                int i2 = i + 10;
                C0212d.a aVar = (C0212d.a) this;
                Drawable[] drawableArr = new Drawable[i2];
                System.arraycopy(aVar.f1454g, 0, drawableArr, 0, i);
                aVar.f1454g = drawableArr;
                int[][] iArr = new int[i2][];
                System.arraycopy(aVar.f1477J, 0, iArr, 0, i);
                aVar.f1477J = iArr;
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f1448a);
            this.f1454g[i] = drawable;
            this.f1455h++;
            this.f1452e = drawable.getChangingConfigurations() | this.f1452e;
            this.f1465r = false;
            this.f1467t = false;
            this.f1458k = null;
            this.f1457j = false;
            this.f1460m = false;
            this.f1469v = false;
            return i;
        }

        /* JADX INFO: renamed from: b */
        public void m900b() {
            this.f1460m = true;
            m901c();
            int i = this.f1455h;
            Drawable[] drawableArr = this.f1454g;
            this.f1462o = -1;
            this.f1461n = -1;
            this.f1464q = 0;
            this.f1463p = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f1461n) {
                    this.f1461n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f1462o) {
                    this.f1462o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f1463p) {
                    this.f1463p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f1464q) {
                    this.f1464q = minimumHeight;
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m901c() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f1453f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    int iKeyAt = this.f1453f.keyAt(i);
                    Drawable.ConstantState constantStateValueAt = this.f1453f.valueAt(i);
                    Drawable[] drawableArr = this.f1454g;
                    Drawable drawableNewDrawable = constantStateValueAt.newDrawable(this.f1449b);
                    if (Build.VERSION.SDK_INT >= 23) {
                        drawableNewDrawable.setLayoutDirection(this.f1473z);
                    }
                    Drawable drawableMutate = drawableNewDrawable.mutate();
                    drawableMutate.setCallback(this.f1448a);
                    drawableArr[iKeyAt] = drawableMutate;
                }
                this.f1453f = null;
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i = this.f1455h;
            Drawable[] drawableArr = this.f1454g;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f1453f.get(i2);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: d */
        public final Drawable m902d(int i) {
            int iIndexOfKey;
            Drawable drawable = this.f1454g[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f1453f;
            if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable drawableNewDrawable = this.f1453f.valueAt(iIndexOfKey).newDrawable(this.f1449b);
            if (Build.VERSION.SDK_INT >= 23) {
                drawableNewDrawable.setLayoutDirection(this.f1473z);
            }
            Drawable drawableMutate = drawableNewDrawable.mutate();
            drawableMutate.setCallback(this.f1448a);
            this.f1454g[i] = drawableMutate;
            this.f1453f.removeAt(iIndexOfKey);
            if (this.f1453f.size() == 0) {
                this.f1453f = null;
            }
            return drawableMutate;
        }

        /* JADX INFO: renamed from: e */
        public abstract void mo892e();

        /* JADX INFO: renamed from: f */
        public final void m903f(Resources resources) {
            if (resources != null) {
                this.f1449b = resources;
                int i = C0210b.f1424n;
                int i2 = resources.getDisplayMetrics().densityDpi;
                if (i2 == 0) {
                    i2 = 160;
                }
                int i3 = this.f1450c;
                this.f1450c = i2;
                if (i3 != i2) {
                    this.f1460m = false;
                    this.f1457j = false;
                }
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f1451d | this.f1452e;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m896a(boolean z) {
        boolean z2;
        boolean z3 = true;
        this.f1430g = true;
        long jUptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable = this.f1427d;
        if (drawable != null) {
            long j = this.f1434k;
            if (j == 0) {
                z2 = false;
            } else if (j <= jUptimeMillis) {
                drawable.setAlpha(this.f1429f);
                this.f1434k = 0L;
                z2 = false;
            } else {
                drawable.setAlpha(((255 - (((int) ((j - jUptimeMillis) * 255)) / this.f1425b.f1439A)) * this.f1429f) / 255);
                z2 = true;
            }
        } else {
            this.f1434k = 0L;
            z2 = false;
        }
        Drawable drawable2 = this.f1428e;
        if (drawable2 != null) {
            long j2 = this.f1435l;
            if (j2 == 0) {
                z3 = z2;
            } else if (j2 <= jUptimeMillis) {
                drawable2.setVisible(false, false);
                this.f1428e = null;
                this.f1435l = 0L;
                z3 = z2;
            } else {
                drawable2.setAlpha(((((int) ((j2 - jUptimeMillis) * 255)) / this.f1425b.f1440B) * this.f1429f) / 255);
            }
        } else {
            this.f1435l = 0L;
            z3 = z2;
        }
        if (z && z3) {
            scheduleSelf(this.f1433j, jUptimeMillis + 16);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        c cVar = this.f1425b;
        Objects.requireNonNull(cVar);
        if (theme != null) {
            cVar.m901c();
            int i = cVar.f1455h;
            Drawable[] drawableArr = cVar.f1454g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2] != null && drawableArr[i2].canApplyTheme()) {
                    drawableArr[i2].applyTheme(theme);
                    cVar.f1452e |= drawableArr[i2].getChangingConfigurations();
                }
            }
            cVar.m903f(theme.getResources());
        }
    }

    /* JADX INFO: renamed from: b */
    public c mo886b() {
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public final void m897c(Drawable drawable) {
        if (this.f1436m == null) {
            this.f1436m = new b();
        }
        b bVar = this.f1436m;
        bVar.f1438b = drawable.getCallback();
        drawable.setCallback(bVar);
        try {
            if (this.f1425b.f1439A <= 0 && this.f1430g) {
                drawable.setAlpha(this.f1429f);
            }
            c cVar = this.f1425b;
            if (cVar.f1443E) {
                drawable.setColorFilter(cVar.f1442D);
            } else {
                if (cVar.f1446H) {
                    C0360f.m1433Y(drawable, cVar.f1444F);
                }
                c cVar2 = this.f1425b;
                if (cVar2.f1447I) {
                    C0360f.m1434Z(drawable, cVar2.f1445G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f1425b.f1471x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            int i = Build.VERSION.SDK_INT;
            if (i >= 23) {
                drawable.setLayoutDirection(getLayoutDirection());
            }
            drawable.setAutoMirrored(this.f1425b.f1441C);
            Rect rect = this.f1426c;
            if (i >= 21 && rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            b bVar2 = this.f1436m;
            Drawable.Callback callback = bVar2.f1438b;
            bVar2.f1438b = null;
            drawable.setCallback(callback);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.f1425b.canApplyTheme();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    /* JADX INFO: renamed from: d */
    public boolean m898d(int i) {
        if (i == this.f1431h) {
            return false;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f1425b.f1440B > 0) {
            Drawable drawable = this.f1428e;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            Drawable drawable2 = this.f1427d;
            if (drawable2 != null) {
                this.f1428e = drawable2;
                this.f1435l = ((long) this.f1425b.f1440B) + jUptimeMillis;
            } else {
                this.f1428e = null;
                this.f1435l = 0L;
            }
        } else {
            Drawable drawable3 = this.f1427d;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i >= 0) {
            c cVar = this.f1425b;
            if (i < cVar.f1455h) {
                Drawable drawableM902d = cVar.m902d(i);
                this.f1427d = drawableM902d;
                this.f1431h = i;
                if (drawableM902d != null) {
                    int i2 = this.f1425b.f1439A;
                    if (i2 > 0) {
                        this.f1434k = jUptimeMillis + ((long) i2);
                    }
                    m897c(drawableM902d);
                }
            } else {
                this.f1427d = null;
                this.f1431h = -1;
            }
        } else {
            this.f1427d = null;
            this.f1431h = -1;
        }
        if (this.f1434k != 0 || this.f1435l != 0) {
            Runnable runnable = this.f1433j;
            if (runnable == null) {
                this.f1433j = new a();
            } else {
                unscheduleSelf(runnable);
            }
            m896a(true);
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f1427d;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f1428e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* JADX INFO: renamed from: e */
    public void mo887e(c cVar) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f1429f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f1425b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z;
        c cVar = this.f1425b;
        synchronized (cVar) {
            z = false;
            if (!cVar.f1469v) {
                cVar.m901c();
                cVar.f1469v = true;
                int i = cVar.f1455h;
                Drawable[] drawableArr = cVar.f1454g;
                int i2 = 0;
                while (true) {
                    if (i2 >= i) {
                        cVar.f1470w = true;
                        z = true;
                        break;
                    }
                    if (drawableArr[i2].getConstantState() == null) {
                        cVar.f1470w = false;
                    } else {
                        i2++;
                    }
                }
            } else {
                z = cVar.f1470w;
            }
            break;
        }
        if (!z) {
            return null;
        }
        this.f1425b.f1451d = getChangingConfigurations();
        return this.f1425b;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f1427d;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f1426c;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        c cVar = this.f1425b;
        if (cVar.f1459l) {
            if (!cVar.f1460m) {
                cVar.m900b();
            }
            return cVar.f1462o;
        }
        Drawable drawable = this.f1427d;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        c cVar = this.f1425b;
        if (cVar.f1459l) {
            if (!cVar.f1460m) {
                cVar.m900b();
            }
            return cVar.f1461n;
        }
        Drawable drawable = this.f1427d;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        c cVar = this.f1425b;
        if (cVar.f1459l) {
            if (!cVar.f1460m) {
                cVar.m900b();
            }
            return cVar.f1464q;
        }
        Drawable drawable = this.f1427d;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        c cVar = this.f1425b;
        if (cVar.f1459l) {
            if (!cVar.f1460m) {
                cVar.m900b();
            }
            return cVar.f1463p;
        }
        Drawable drawable = this.f1427d;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f1427d;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        c cVar = this.f1425b;
        if (cVar.f1465r) {
            return cVar.f1466s;
        }
        cVar.m901c();
        int i = cVar.f1455h;
        Drawable[] drawableArr = cVar.f1454g;
        int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
        for (int i2 = 1; i2 < i; i2++) {
            opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
        }
        cVar.f1466s = opacity;
        cVar.f1465r = true;
        return opacity;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = this.f1427d;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean padding;
        c cVar = this.f1425b;
        Rect rect2 = null;
        if (!cVar.f1456i) {
            Rect rect3 = cVar.f1458k;
            if (rect3 != null || cVar.f1457j) {
                rect2 = rect3;
            } else {
                cVar.m901c();
                Rect rect4 = new Rect();
                int i = cVar.f1455h;
                Drawable[] drawableArr = cVar.f1454g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i3 = rect4.left;
                        if (i3 > rect2.left) {
                            rect2.left = i3;
                        }
                        int i4 = rect4.top;
                        if (i4 > rect2.top) {
                            rect2.top = i4;
                        }
                        int i5 = rect4.right;
                        if (i5 > rect2.right) {
                            rect2.right = i5;
                        }
                        int i6 = rect4.bottom;
                        if (i6 > rect2.bottom) {
                            rect2.bottom = i6;
                        }
                    }
                }
                cVar.f1457j = true;
                cVar.f1458k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            padding = (((rect2.left | rect2.top) | rect2.bottom) | rect2.right) != 0;
        } else {
            Drawable drawable = this.f1427d;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (this.f1425b.f1441C && C0360f.m1461u(this) == 1) {
            int i7 = rect.left;
            rect.left = rect.right;
            rect.right = i7;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        c cVar = this.f1425b;
        if (cVar != null) {
            cVar.f1465r = false;
            cVar.f1467t = false;
        }
        if (drawable != this.f1427d || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f1425b.f1441C;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f1428e;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f1428e = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f1427d;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f1430g) {
                this.f1427d.setAlpha(this.f1429f);
            }
        }
        if (this.f1435l != 0) {
            this.f1435l = 0L;
            z = true;
        }
        if (this.f1434k != 0) {
            this.f1434k = 0L;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f1432i && super.mutate() == this) {
            c cVarMo886b = mo886b();
            cVarMo886b.mo892e();
            mo887e(cVarMo886b);
            this.f1432i = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1428e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f1427d;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        c cVar = this.f1425b;
        int i2 = this.f1431h;
        int i3 = cVar.f1455h;
        Drawable[] drawableArr = cVar.f1454g;
        boolean z = false;
        for (int i4 = 0; i4 < i3; i4++) {
            if (drawableArr[i4] != null) {
                boolean layoutDirection = Build.VERSION.SDK_INT >= 23 ? drawableArr[i4].setLayoutDirection(i) : false;
                if (i4 == i2) {
                    z = layoutDirection;
                }
            }
        }
        cVar.f1473z = i;
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f1428e;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f1427d;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f1428e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f1427d;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable != this.f1427d || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f1430g && this.f1429f == i) {
            return;
        }
        this.f1430g = true;
        this.f1429f = i;
        Drawable drawable = this.f1427d;
        if (drawable != null) {
            if (this.f1434k == 0) {
                drawable.setAlpha(i);
            } else {
                m896a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        c cVar = this.f1425b;
        if (cVar.f1441C != z) {
            cVar.f1441C = z;
            Drawable drawable = this.f1427d;
            if (drawable != null) {
                drawable.setAutoMirrored(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        c cVar = this.f1425b;
        cVar.f1443E = true;
        if (cVar.f1442D != colorFilter) {
            cVar.f1442D = colorFilter;
            Drawable drawable = this.f1427d;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        c cVar = this.f1425b;
        if (cVar.f1471x != z) {
            cVar.f1471x = z;
            Drawable drawable = this.f1427d;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f1427d;
        if (drawable != null) {
            C0360f.m1424P(drawable, f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f1426c;
        if (rect == null) {
            this.f1426c = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f1427d;
        if (drawable != null) {
            C0360f.m1425Q(drawable, i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        c cVar = this.f1425b;
        cVar.f1446H = true;
        if (cVar.f1444F != colorStateList) {
            cVar.f1444F = colorStateList;
            C0360f.m1433Y(this.f1427d, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f1425b;
        cVar.f1447I = true;
        if (cVar.f1445G != mode) {
            cVar.f1445G = mode;
            C0360f.m1434Z(this.f1427d, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f1428e;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f1427d;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f1427d || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
