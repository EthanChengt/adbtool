package p006b.p008b.p009c;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;

/* JADX INFO: renamed from: b.b.c.v */
/* JADX INFO: loaded from: classes.dex */
public class C0206v {

    /* JADX INFO: renamed from: d */
    public static C0206v f1364d;

    /* JADX INFO: renamed from: a */
    public final Context f1365a;

    /* JADX INFO: renamed from: b */
    public final LocationManager f1366b;

    /* JADX INFO: renamed from: c */
    public final a f1367c = new a();

    /* JADX INFO: renamed from: b.b.c.v$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public boolean f1368a;

        /* JADX INFO: renamed from: b */
        public long f1369b;
    }

    public C0206v(Context context, LocationManager locationManager) {
        this.f1365a = context;
        this.f1366b = locationManager;
    }

    /* JADX INFO: renamed from: a */
    public final Location m863a(String str) {
        try {
            if (this.f1366b.isProviderEnabled(str)) {
                return this.f1366b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }
}
