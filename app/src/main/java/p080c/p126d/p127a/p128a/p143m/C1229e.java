package p080c.p126d.p127a.p128a.p143m;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: c.d.a.a.m.e */
/* JADX INFO: loaded from: classes.dex */
public class C1229e implements C1224a.c {
    public static final Parcelable.Creator<C1229e> CREATOR = new a();

    /* JADX INFO: renamed from: b */
    public final long f5881b;

    /* JADX INFO: renamed from: c.d.a.a.m.e$a */
    public static class a implements Parcelable.Creator<C1229e> {
        @Override // android.os.Parcelable.Creator
        public C1229e createFromParcel(Parcel parcel) {
            return new C1229e(parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        public C1229e[] newArray(int i) {
            return new C1229e[i];
        }
    }

    public C1229e(long j) {
        this.f5881b = j;
    }

    public C1229e(long j, a aVar) {
        this.f5881b = j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // p080c.p126d.p127a.p128a.p143m.C1224a.c
    /* JADX INFO: renamed from: e */
    public boolean mo2845e(long j) {
        return j >= this.f5881b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1229e) && this.f5881b == ((C1229e) obj).f5881b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f5881b)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f5881b);
    }
}
