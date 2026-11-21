package p080c.p126d.p127a.p128a.p143m;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.didjdk.adbhelper.R;
import java.util.Calendar;
import java.util.Locale;
import c.a.a.a.a;
import p080c.p126d.p127a.p128a.C1161a;

/* JADX INFO: renamed from: c.d.a.a.m.f */
/* JADX INFO: loaded from: classes.dex */
public class C1230f extends BaseAdapter {

    /* JADX INFO: renamed from: e */
    public static final int f5882e;

    /* JADX INFO: renamed from: b */
    public final Calendar f5883b;

    /* JADX INFO: renamed from: c */
    public final int f5884c;

    /* JADX INFO: renamed from: d */
    public final int f5885d;

    static {
        f5882e = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public C1230f() {
        Calendar calendarM2729n = C1161a.m2729n();
        this.f5883b = calendarM2729n;
        this.f5884c = calendarM2729n.getMaximum(7);
        this.f5885d = calendarM2729n.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f5884c;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        int i2 = this.f5884c;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.f5885d;
        if (i3 > i2) {
            i3 -= i2;
        }
        return Integer.valueOf(i3);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"WrongConstant"})
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) a.m2188b(viewGroup, R.layout.c6, viewGroup, false);
        }
        Calendar calendar = this.f5883b;
        int i2 = i + this.f5885d;
        int i3 = this.f5884c;
        if (i2 > i3) {
            i2 -= i3;
        }
        calendar.set(7, i2);
        textView.setText(this.f5883b.getDisplayName(7, f5882e, Locale.getDefault()));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.di), this.f5883b.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
