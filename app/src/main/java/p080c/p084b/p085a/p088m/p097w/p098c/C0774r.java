package p080c.p084b.p085a.p088m.p097w.p098c;

import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: c.b.a.m.w.c.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0774r {

    /* JADX INFO: renamed from: g */
    public static final boolean f4460g;

    /* JADX INFO: renamed from: h */
    public static final boolean f4461h;

    /* JADX INFO: renamed from: i */
    public static final File f4462i;

    /* JADX INFO: renamed from: j */
    public static volatile C0774r f4463j;

    /* JADX INFO: renamed from: k */
    public static volatile int f4464k;

    /* JADX INFO: renamed from: a */
    public final boolean f4465a;

    /* JADX INFO: renamed from: b */
    public final int f4466b;

    /* JADX INFO: renamed from: c */
    public final int f4467c;

    /* JADX INFO: renamed from: d */
    public int f4468d;

    /* JADX INFO: renamed from: e */
    public boolean f4469e;

    /* JADX INFO: renamed from: f */
    public final AtomicBoolean f4470f;

    static {
        int i = Build.VERSION.SDK_INT;
        f4460g = i < 29;
        f4461h = i >= 26;
        f4462i = new File("/proc/self/fd");
        f4464k = -1;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x009f  */
    public C0774r() {
        boolean z;
        boolean z2;
        int i = Build.VERSION.SDK_INT;
        this.f4469e = true;
        this.f4470f = new AtomicBoolean(false);
        if (i == 26) {
            Iterator it = Arrays.asList("SC-04J", "SM-N935", "SM-J720", "SM-G570F", "SM-G570M", "SM-G960", "SM-G965", "SM-G935", "SM-G930", "SM-A520", "SM-A720F", "moto e5", "moto e5 play", "moto e5 plus", "moto e5 cruise", "moto g(6) forge", "moto g(6) play").iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                } else {
                    if (Build.MODEL.startsWith((String) it.next())) {
                        z = true;
                        break;
                    }
                }
            }
        } else {
            z = false;
            break;
        }
        if (!z) {
            z2 = i != 27 ? false : Arrays.asList("LG-M250", "LG-M320", "LG-Q710AL", "LG-Q710PL", "LGM-K121K", "LGM-K121L", "LGM-K121S", "LGM-X320K", "LGM-X320L", "LGM-X320S", "LGM-X401L", "LGM-X401S", "LM-Q610.FG", "LM-Q610.FGN", "LM-Q617.FG", "LM-Q617.FGN", "LM-Q710.FG", "LM-Q710.FGN", "LM-X220PM", "LM-X220QMA", "LM-X410PM").contains(Build.MODEL) ? false : true;
        }
        this.f4465a = z2;
        if (i >= 28) {
            this.f4466b = 20000;
            this.f4467c = 0;
        } else {
            this.f4466b = 700;
            this.f4467c = 128;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0774r m2483a() {
        if (f4463j == null) {
            synchronized (C0774r.class) {
                if (f4463j == null) {
                    f4463j = new C0774r();
                }
            }
        }
        return f4463j;
    }

    /* JADX INFO: renamed from: b */
    public boolean m2484b(int i, int i2, boolean z, boolean z2) {
        boolean z3;
        if (!z) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by caller");
            }
            return false;
        }
        if (!this.f4465a) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by device model");
            }
            return false;
        }
        if (!f4461h) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
            }
            return false;
        }
        if (f4460g && !this.f4470f.get()) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by app state");
            }
            return false;
        }
        if (z2) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
            }
            return false;
        }
        int i3 = this.f4467c;
        if (i < i3) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because width is too small");
            }
            return false;
        }
        if (i2 < i3) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because height is too small");
            }
            return false;
        }
        synchronized (this) {
            int i4 = this.f4468d + 1;
            this.f4468d = i4;
            if (i4 >= 50) {
                this.f4468d = 0;
                int length = f4462i.list().length;
                long j = f4464k != -1 ? f4464k : this.f4466b;
                boolean z4 = ((long) length) < j;
                this.f4469e = z4;
                if (!z4 && Log.isLoggable("Downsampler", 5)) {
                    Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + j);
                }
            }
            z3 = this.f4469e;
        }
        if (z3) {
            return true;
        }
        if (Log.isLoggable("HardwareConfig", 2)) {
            Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
        }
        return false;
    }
}
