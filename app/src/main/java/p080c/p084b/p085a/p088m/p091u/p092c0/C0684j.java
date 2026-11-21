package p080c.p084b.p085a.p088m.p091u.p092c0;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import c.a.a.a.a;
import p080c.p084b.p085a.p111s.C0875j;

/* JADX INFO: renamed from: c.b.a.m.u.c0.j */
/* JADX INFO: loaded from: classes.dex */
public class C0684j implements InterfaceC0678d {

    /* JADX INFO: renamed from: j */
    public static final Bitmap.Config f4020j = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: a */
    public final InterfaceC0685k f4021a;

    /* JADX INFO: renamed from: b */
    public final Set<Bitmap.Config> f4022b;

    /* JADX INFO: renamed from: c */
    public final a f4023c;

    /* JADX INFO: renamed from: d */
    public long f4024d;

    /* JADX INFO: renamed from: e */
    public long f4025e;

    /* JADX INFO: renamed from: f */
    public int f4026f;

    /* JADX INFO: renamed from: g */
    public int f4027g;

    /* JADX INFO: renamed from: h */
    public int f4028h;

    /* JADX INFO: renamed from: i */
    public int f4029i;

    /* JADX INFO: renamed from: c.b.a.m.u.c0.j$a */
    public interface a {
    }

    /* JADX INFO: renamed from: c.b.a.m.u.c0.j$b */
    public static final class b implements a {
    }

    public C0684j(long j) {
        C0687m c0687m = new C0687m();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        Set<Bitmap.Config> setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f4024d = j;
        this.f4021a = c0687m;
        this.f4022b = setUnmodifiableSet;
        this.f4023c = new b();
    }

    @Override // p080c.p084b.p085a.p088m.p091u.p092c0.InterfaceC0678d
    @SuppressLint({"InlinedApi"})
    /* JADX INFO: renamed from: a */
    public void mo2328a(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i);
        }
        if (i >= 40 || (Build.VERSION.SDK_INT >= 23 && i >= 20)) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "clearMemory");
            }
            m2347i(0L);
        } else if (i >= 20 || i == 15) {
            m2347i(this.f4024d / 2);
        }
    }

    @Override // p080c.p084b.p085a.p088m.p091u.p092c0.InterfaceC0678d
    /* JADX INFO: renamed from: b */
    public void mo2329b() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        m2347i(0L);
    }

    @Override // p080c.p084b.p085a.p088m.p091u.p092c0.InterfaceC0678d
    /* JADX INFO: renamed from: c */
    public Bitmap mo2330c(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapM2346h = m2346h(i, i2, config);
        if (bitmapM2346h != null) {
            return bitmapM2346h;
        }
        if (config == null) {
            config = f4020j;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // p080c.p084b.p085a.p088m.p091u.p092c0.InterfaceC0678d
    /* JADX INFO: renamed from: d */
    public Bitmap mo2331d(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapM2346h = m2346h(i, i2, config);
        if (bitmapM2346h != null) {
            bitmapM2346h.eraseColor(0);
            return bitmapM2346h;
        }
        if (config == null) {
            config = f4020j;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // p080c.p084b.p085a.p088m.p091u.p092c0.InterfaceC0678d
    /* JADX INFO: renamed from: e */
    public synchronized void mo2332e(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                Objects.requireNonNull((C0687m) this.f4021a);
                if (C0875j.m2612d(bitmap) <= this.f4024d && this.f4022b.contains(bitmap.getConfig())) {
                    Objects.requireNonNull((C0687m) this.f4021a);
                    int iM2612d = C0875j.m2612d(bitmap);
                    ((C0687m) this.f4021a).m2353f(bitmap);
                    Objects.requireNonNull((b) this.f4023c);
                    this.f4028h++;
                    this.f4025e += (long) iM2612d;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Put bitmap in pool=");
                        sb.append(((C0687m) this.f4021a).m2352e(bitmap));
                        Log.v("LruBitmapPool", sb.toString());
                    }
                    m2344f();
                    m2347i(this.f4024d);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Reject bitmap from pool, bitmap: ");
                sb2.append(((C0687m) this.f4021a).m2352e(bitmap));
                sb2.append(", is mutable: ");
                sb2.append(bitmap.isMutable());
                sb2.append(", is allowed config: ");
                sb2.append(this.f4022b.contains(bitmap.getConfig()));
                Log.v("LruBitmapPool", sb2.toString());
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m2344f() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            m2345g();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m2345g() {
        StringBuilder sbM2191e = a.m2191e("Hits=");
        sbM2191e.append(this.f4026f);
        sbM2191e.append(", misses=");
        sbM2191e.append(this.f4027g);
        sbM2191e.append(", puts=");
        sbM2191e.append(this.f4028h);
        sbM2191e.append(", evictions=");
        sbM2191e.append(this.f4029i);
        sbM2191e.append(", currentSize=");
        sbM2191e.append(this.f4025e);
        sbM2191e.append(", maxSize=");
        sbM2191e.append(this.f4024d);
        sbM2191e.append("\nStrategy=");
        sbM2191e.append(this.f4021a);
        Log.v("LruBitmapPool", sbM2191e.toString());
    }

    /* JADX INFO: renamed from: h */
    public final synchronized Bitmap m2346h(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapM2350b;
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
        bitmapM2350b = ((C0687m) this.f4021a).m2350b(i, i2, config != null ? config : f4020j);
        if (bitmapM2350b == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Missing bitmap=");
                Objects.requireNonNull((C0687m) this.f4021a);
                sb.append(C0687m.m2348c(C0875j.m2611c(i, i2, config), config));
                Log.d("LruBitmapPool", sb.toString());
            }
            this.f4027g++;
        } else {
            this.f4026f++;
            long j = this.f4025e;
            Objects.requireNonNull((C0687m) this.f4021a);
            this.f4025e = j - ((long) C0875j.m2612d(bitmapM2350b));
            Objects.requireNonNull((b) this.f4023c);
            bitmapM2350b.setHasAlpha(true);
            bitmapM2350b.setPremultiplied(true);
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Get bitmap=");
            Objects.requireNonNull((C0687m) this.f4021a);
            sb2.append(C0687m.m2348c(C0875j.m2611c(i, i2, config), config));
            Log.v("LruBitmapPool", sb2.toString());
        }
        m2344f();
        return bitmapM2350b;
    }

    /* JADX INFO: renamed from: i */
    public final synchronized void m2347i(long j) {
        while (this.f4025e > j) {
            C0687m c0687m = (C0687m) this.f4021a;
            Bitmap bitmapM2335c = c0687m.f4036b.m2335c();
            if (bitmapM2335c != null) {
                c0687m.m2349a(Integer.valueOf(C0875j.m2612d(bitmapM2335c)), bitmapM2335c);
            }
            if (bitmapM2335c == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    m2345g();
                }
                this.f4025e = 0L;
                return;
            }
            Objects.requireNonNull((b) this.f4023c);
            long j2 = this.f4025e;
            Objects.requireNonNull((C0687m) this.f4021a);
            this.f4025e = j2 - ((long) C0875j.m2612d(bitmapM2335c));
            this.f4029i++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Evicting bitmap=");
                sb.append(((C0687m) this.f4021a).m2352e(bitmapM2335c));
                Log.d("LruBitmapPool", sb.toString());
            }
            m2344f();
            bitmapM2335c.recycle();
        }
    }
}
