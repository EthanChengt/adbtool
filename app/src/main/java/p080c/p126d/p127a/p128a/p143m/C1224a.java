package p080c.p126d.p127a.p128a.p143m;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p080c.p126d.p127a.p128a.C1161a;

/* JADX INFO: renamed from: c.d.a.a.m.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1224a implements Parcelable {
    public static final Parcelable.Creator<C1224a> CREATOR = new a();

    /* JADX INFO: renamed from: b */
    public final C1243s f5853b;

    /* JADX INFO: renamed from: c */
    public final C1243s f5854c;

    /* JADX INFO: renamed from: d */
    public final C1243s f5855d;

    /* JADX INFO: renamed from: e */
    public final c f5856e;

    /* JADX INFO: renamed from: f */
    public final int f5857f;

    /* JADX INFO: renamed from: g */
    public final int f5858g;

    /* JADX INFO: renamed from: c.d.a.a.m.a$a */
    public static class a implements Parcelable.Creator<C1224a> {
        @Override // android.os.Parcelable.Creator
        public C1224a createFromParcel(Parcel parcel) {
            return new C1224a((C1243s) parcel.readParcelable(C1243s.class.getClassLoader()), (C1243s) parcel.readParcelable(C1243s.class.getClassLoader()), (C1243s) parcel.readParcelable(C1243s.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), null);
        }

        @Override // android.os.Parcelable.Creator
        public C1224a[] newArray(int i) {
            return new C1224a[i];
        }
    }

    /* JADX INFO: renamed from: c.d.a.a.m.a$b */
    public static final class b {

        /* JADX INFO: renamed from: e */
        public static final long f5859e = C1161a.m2716a(C1243s.m2868k(1900, 0).f5947h);

        /* JADX INFO: renamed from: f */
        public static final long f5860f = C1161a.m2716a(C1243s.m2868k(2100, 11).f5947h);

        /* JADX INFO: renamed from: a */
        public long f5861a;

        /* JADX INFO: renamed from: b */
        public long f5862b;

        /* JADX INFO: renamed from: c */
        public Long f5863c;

        /* JADX INFO: renamed from: d */
        public c f5864d;

        public b(C1224a c1224a) {
            this.f5861a = f5859e;
            this.f5862b = f5860f;
            this.f5864d = new C1229e(Long.MIN_VALUE);
            this.f5861a = c1224a.f5853b.f5947h;
            this.f5862b = c1224a.f5854c.f5947h;
            this.f5863c = Long.valueOf(c1224a.f5855d.f5947h);
            this.f5864d = c1224a.f5856e;
        }
    }

    /* JADX INFO: renamed from: c.d.a.a.m.a$c */
    public interface c extends Parcelable {
        /* JADX INFO: renamed from: e */
        boolean mo2845e(long j);
    }

    public C1224a(C1243s c1243s, C1243s c1243s2, C1243s c1243s3, c cVar, a aVar) {
        this.f5853b = c1243s;
        this.f5854c = c1243s2;
        this.f5855d = c1243s3;
        this.f5856e = cVar;
        if (c1243s.f5941b.compareTo(c1243s3.f5941b) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (c1243s3.f5941b.compareTo(c1243s2.f5941b) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        this.f5858g = c1243s.m2874o(c1243s2) + 1;
        this.f5857f = (c1243s2.f5944e - c1243s.f5944e) + 1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1224a)) {
            return false;
        }
        C1224a c1224a = (C1224a) obj;
        return this.f5853b.equals(c1224a.f5853b) && this.f5854c.equals(c1224a.f5854c) && this.f5855d.equals(c1224a.f5855d) && this.f5856e.equals(c1224a.f5856e);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5853b, this.f5854c, this.f5855d, this.f5856e});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f5853b, 0);
        parcel.writeParcelable(this.f5854c, 0);
        parcel.writeParcelable(this.f5855d, 0);
        parcel.writeParcelable(this.f5856e, 0);
    }
}
