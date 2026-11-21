package p080c.p126d.p127a.p128a.p143m;

import android.os.Parcel;
import android.os.Parcelable;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import p080c.p126d.p127a.p128a.C1161a;

/* JADX INFO: renamed from: c.d.a.a.m.s */
/* JADX INFO: loaded from: classes.dex */
public final class C1243s implements Comparable<C1243s>, Parcelable {
    public static final Parcelable.Creator<C1243s> CREATOR = new a();

    /* JADX INFO: renamed from: b */
    public final Calendar f5941b;

    /* JADX INFO: renamed from: c */
    public final String f5942c;

    /* JADX INFO: renamed from: d */
    public final int f5943d;

    /* JADX INFO: renamed from: e */
    public final int f5944e;

    /* JADX INFO: renamed from: f */
    public final int f5945f;

    /* JADX INFO: renamed from: g */
    public final int f5946g;

    /* JADX INFO: renamed from: h */
    public final long f5947h;

    /* JADX INFO: renamed from: c.d.a.a.m.s$a */
    public static class a implements Parcelable.Creator<C1243s> {
        @Override // android.os.Parcelable.Creator
        public C1243s createFromParcel(Parcel parcel) {
            return C1243s.m2868k(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public C1243s[] newArray(int i) {
            return new C1243s[i];
        }
    }

    public C1243s(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarM2725j = C1161a.m2725j(calendar);
        this.f5941b = calendarM2725j;
        this.f5943d = calendarM2725j.get(2);
        this.f5944e = calendarM2725j.get(1);
        this.f5945f = calendarM2725j.getMaximum(7);
        this.f5946g = calendarM2725j.getActualMaximum(5);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMM, yyyy", Locale.getDefault());
        simpleDateFormat.setTimeZone(C1161a.m2727l());
        this.f5942c = simpleDateFormat.format(calendarM2725j.getTime());
        this.f5947h = calendarM2725j.getTimeInMillis();
    }

    /* JADX INFO: renamed from: k */
    public static C1243s m2868k(int i, int i2) {
        Calendar calendarM2729n = C1161a.m2729n();
        calendarM2729n.set(1, i);
        calendarM2729n.set(2, i2);
        return new C1243s(calendarM2729n);
    }

    /* JADX INFO: renamed from: l */
    public static C1243s m2869l(long j) {
        Calendar calendarM2729n = C1161a.m2729n();
        calendarM2729n.setTimeInMillis(j);
        return new C1243s(calendarM2729n);
    }

    /* JADX INFO: renamed from: p */
    public static C1243s m2870p() {
        return new C1243s(C1161a.m2728m());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1243s)) {
            return false;
        }
        C1243s c1243s = (C1243s) obj;
        return this.f5943d == c1243s.f5943d && this.f5944e == c1243s.f5944e;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5943d), Integer.valueOf(this.f5944e)});
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public int compareTo(C1243s c1243s) {
        return this.f5941b.compareTo(c1243s.f5941b);
    }

    /* JADX INFO: renamed from: m */
    public int m2872m() {
        int firstDayOfWeek = this.f5941b.get(7) - this.f5941b.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f5945f : firstDayOfWeek;
    }

    /* JADX INFO: renamed from: n */
    public C1243s m2873n(int i) {
        Calendar calendarM2725j = C1161a.m2725j(this.f5941b);
        calendarM2725j.add(2, i);
        return new C1243s(calendarM2725j);
    }

    /* JADX INFO: renamed from: o */
    public int m2874o(C1243s c1243s) {
        if (!(this.f5941b instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (c1243s.f5943d - this.f5943d) + ((c1243s.f5944e - this.f5944e) * 12);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f5944e);
        parcel.writeInt(this.f5943d);
    }
}
