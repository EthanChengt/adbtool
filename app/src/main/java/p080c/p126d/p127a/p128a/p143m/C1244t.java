package p080c.p126d.p127a.p128a.p143m;

import android.content.Context;
import android.icu.text.DateFormat;
import android.icu.util.TimeZone;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.didjdk.adbhelper.R;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import c.a.a.a.a;
import p080c.p126d.p127a.p128a.C1161a;

/* JADX INFO: renamed from: c.d.a.a.m.t */
/* JADX INFO: loaded from: classes.dex */
public class C1244t extends BaseAdapter {

    /* JADX INFO: renamed from: f */
    public static final int f5948f = C1161a.m2729n().getMaximum(4);

    /* JADX INFO: renamed from: b */
    public final C1243s f5949b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1228d<?> f5950c;

    /* JADX INFO: renamed from: d */
    public C1227c f5951d;

    /* JADX INFO: renamed from: e */
    public final C1224a f5952e;

    public C1244t(C1243s c1243s, InterfaceC1228d<?> interfaceC1228d, C1224a c1224a) {
        this.f5949b = c1243s;
        this.f5950c = interfaceC1228d;
        this.f5952e = c1224a;
    }

    /* JADX INFO: renamed from: a */
    public int m2875a() {
        return this.f5949b.m2872m();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Long getItem(int i) {
        if (i < this.f5949b.m2872m() || i > m2877c()) {
            return null;
        }
        C1243s c1243s = this.f5949b;
        int iM2872m = (i - c1243s.m2872m()) + 1;
        Calendar calendarM2725j = C1161a.m2725j(c1243s.f5941b);
        calendarM2725j.set(5, iM2872m);
        return Long.valueOf(calendarM2725j.getTimeInMillis());
    }

    /* JADX INFO: renamed from: c */
    public int m2877c() {
        return (this.f5949b.m2872m() + this.f5949b.f5946g) - 1;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return m2875a() + this.f5949b.f5946g;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i / this.f5949b.f5945f;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00ca  */
    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        C1226b c1226b;
        String str;
        int i2 = Build.VERSION.SDK_INT;
        Context context = viewGroup.getContext();
        if (this.f5951d == null) {
            this.f5951d = new C1227c(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) a.m2188b(viewGroup, R.layout.c5, viewGroup, false);
        }
        int iM2875a = i - m2875a();
        if (iM2875a >= 0) {
            C1243s c1243s = this.f5949b;
            if (iM2875a >= c1243s.f5946g) {
                textView.setVisibility(8);
                textView.setEnabled(false);
            } else {
                int i3 = iM2875a + 1;
                textView.setTag(c1243s);
                textView.setText(String.valueOf(i3));
                Calendar calendarM2725j = C1161a.m2725j(this.f5949b.f5941b);
                calendarM2725j.set(5, i3);
                long timeInMillis = calendarM2725j.getTimeInMillis();
                if (this.f5949b.f5944e == C1243s.m2870p().f5944e) {
                    Locale locale = Locale.getDefault();
                    if (i2 >= 24) {
                        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("MMMEd", locale);
                        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
                        str = instanceForSkeleton.format(new Date(timeInMillis));
                    } else {
                        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(0, locale);
                        dateInstance.setTimeZone(C1161a.m2727l());
                        str = dateInstance.format(new Date(timeInMillis));
                    }
                } else {
                    Locale locale2 = Locale.getDefault();
                    if (i2 >= 24) {
                        DateFormat instanceForSkeleton2 = DateFormat.getInstanceForSkeleton("yMMMEd", locale2);
                        instanceForSkeleton2.setTimeZone(TimeZone.getTimeZone("UTC"));
                        str = instanceForSkeleton2.format(new Date(timeInMillis));
                    } else {
                        java.text.DateFormat dateInstance2 = java.text.DateFormat.getDateInstance(0, locale2);
                        dateInstance2.setTimeZone(C1161a.m2727l());
                        str = dateInstance2.format(new Date(timeInMillis));
                    }
                }
                textView.setContentDescription(str);
                textView.setVisibility(0);
                textView.setEnabled(true);
            }
        } else {
            textView.setVisibility(8);
            textView.setEnabled(false);
        }
        Long item = getItem(i);
        if (item != null) {
            if (this.f5952e.f5856e.mo2845e(item.longValue())) {
                textView.setEnabled(true);
                Iterator<Long> it = this.f5950c.m2856i().iterator();
                while (it.hasNext()) {
                    if (C1161a.m2716a(item.longValue()) == C1161a.m2716a(it.next().longValue())) {
                        c1226b = this.f5951d.f5874b;
                    }
                }
                c1226b = C1161a.m2728m().getTimeInMillis() == item.longValue() ? this.f5951d.f5875c : this.f5951d.f5873a;
            } else {
                textView.setEnabled(false);
                c1226b = this.f5951d.f5879g;
            }
            c1226b.m2848b(textView);
        }
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }
}
