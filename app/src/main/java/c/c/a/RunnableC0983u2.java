package c.c.a;

import android.content.pm.PackageInfo;
import com.didjdk.adbhelper.AppPickerActivity;
import java.text.Collator;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: renamed from: c.c.a.u2 */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC0983u2 implements Runnable {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AppPickerActivity f4922b;

    /* JADX INFO: renamed from: c.c.a.u2$a */
    public class a implements Comparator<PackageInfo> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Collator f4923b;

        public a(Collator collator) {
            this.f4923b = collator;
        }

        @Override // java.util.Comparator
        public int compare(PackageInfo packageInfo, PackageInfo packageInfo2) {
            return this.f4923b.getCollationKey(packageInfo.applicationInfo.loadLabel(RunnableC0983u2.this.f4922b.getPackageManager()).toString()).compareTo(this.f4923b.getCollationKey(packageInfo2.applicationInfo.loadLabel(RunnableC0983u2.this.f4922b.getPackageManager()).toString()));
        }
    }

    /* JADX INFO: renamed from: c.c.a.u2$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RunnableC0983u2.this.f4922b.f6332t.setVisibility(8);
            AppPickerActivity appPickerActivity = RunnableC0983u2.this.f4922b;
            appPickerActivity.f6329q.setAdapter(appPickerActivity.f6330r);
            RunnableC0983u2.this.f4922b.f6330r.f947a.m542b();
        }
    }

    public RunnableC0983u2(AppPickerActivity appPickerActivity) {
        this.f4922b = appPickerActivity;
    }

    @Override // java.lang.Runnable
    public void run() {
        for (PackageInfo packageInfo : this.f4922b.getPackageManager().getInstalledPackages(0)) {
            AppPickerActivity appPickerActivity = this.f4922b;
            int i = AppPickerActivity.f6328u;
            Objects.requireNonNull(appPickerActivity);
            int i2 = packageInfo.applicationInfo.flags;
            boolean z = true;
            boolean z2 = (i2 & 1) == 1;
            boolean z3 = (i2 & 128) == 1;
            if (!z2 && !z3) {
                z = false;
            }
            if (!z) {
                this.f4922b.f6331s.add(packageInfo);
            }
        }
        Collections.sort(this.f4922b.f6331s, new a(Collator.getInstance(Locale.CHINA)));
        this.f4922b.runOnUiThread(new b());
    }
}
