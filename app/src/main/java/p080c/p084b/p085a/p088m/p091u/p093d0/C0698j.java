package p080c.p084b.p085a.p088m.p091u.p093d0;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import c.a.a.a.a;

/* JADX INFO: renamed from: c.b.a.m.u.d0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0698j {

    /* JADX INFO: renamed from: a */
    public final int f4066a;

    /* JADX INFO: renamed from: b */
    public final int f4067b;

    /* JADX INFO: renamed from: c */
    public final Context f4068c;

    /* JADX INFO: renamed from: d */
    public final int f4069d;

    /* JADX INFO: renamed from: c.b.a.m.u.d0.j$a */
    public static final class a {

        /* JADX INFO: renamed from: e */
        public static final int f4070e;

        /* JADX INFO: renamed from: a */
        public final Context f4071a;

        /* JADX INFO: renamed from: b */
        public ActivityManager f4072b;

        /* JADX INFO: renamed from: c */
        public c f4073c;

        /* JADX INFO: renamed from: d */
        public float f4074d;

        static {
            f4070e = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public a(Context context) {
            this.f4074d = f4070e;
            this.f4071a = context;
            this.f4072b = (ActivityManager) context.getSystemService("activity");
            this.f4073c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 26 || !this.f4072b.isLowRamDevice()) {
                return;
            }
            this.f4074d = 0.0f;
        }
    }

    /* JADX INFO: renamed from: c.b.a.m.u.d0.j$b */
    public static final class b implements c {

        /* JADX INFO: renamed from: a */
        public final DisplayMetrics f4075a;

        public b(DisplayMetrics displayMetrics) {
            this.f4075a = displayMetrics;
        }
    }

    /* JADX INFO: renamed from: c.b.a.m.u.d0.j$c */
    public interface c {
    }

    public C0698j(a aVar) {
        this.f4068c = aVar.f4071a;
        int i = aVar.f4072b.isLowRamDevice() ? 2097152 : 4194304;
        this.f4069d = i;
        ActivityManager activityManager = aVar.f4072b;
        int iRound = Math.round(activityManager.getMemoryClass() * 1024 * 1024 * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = ((b) aVar.f4073c).f4075a;
        float f = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        int iRound2 = Math.round(aVar.f4074d * f);
        int iRound3 = Math.round(f * 2.0f);
        int i2 = iRound - i;
        int i3 = iRound3 + iRound2;
        if (i3 <= i2) {
            this.f4067b = iRound3;
            this.f4066a = iRound2;
        } else {
            float f2 = i2 / (aVar.f4074d + 2.0f);
            this.f4067b = Math.round(2.0f * f2);
            this.f4066a = Math.round(f2 * aVar.f4074d);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sbM2191e = a.m2191e("Calculation complete, Calculated memory cache size: ");
            sbM2191e.append(m2361a(this.f4067b));
            sbM2191e.append(", pool size: ");
            sbM2191e.append(m2361a(this.f4066a));
            sbM2191e.append(", byte array size: ");
            sbM2191e.append(m2361a(i));
            sbM2191e.append(", memory class limited? ");
            sbM2191e.append(i3 > iRound);
            sbM2191e.append(", max size: ");
            sbM2191e.append(m2361a(iRound));
            sbM2191e.append(", memoryClass: ");
            sbM2191e.append(aVar.f4072b.getMemoryClass());
            sbM2191e.append(", isLowMemoryDevice: ");
            sbM2191e.append(aVar.f4072b.isLowRamDevice());
            Log.d("MemorySizeCalculator", sbM2191e.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m2361a(int i) {
        return Formatter.formatFileSize(this.f4068c, i);
    }
}
