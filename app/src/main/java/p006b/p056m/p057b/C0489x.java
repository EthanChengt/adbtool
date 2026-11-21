package p006b.p056m.p057b;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;

/* JADX INFO: renamed from: b.m.b.x */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class C0489x implements Parcelable {
    public static final Parcelable.Creator<C0489x> CREATOR = new a();

    /* JADX INFO: renamed from: b */
    public final String f3150b;

    /* JADX INFO: renamed from: c */
    public final String f3151c;

    /* JADX INFO: renamed from: d */
    public final boolean f3152d;

    /* JADX INFO: renamed from: e */
    public final int f3153e;

    /* JADX INFO: renamed from: f */
    public final int f3154f;

    /* JADX INFO: renamed from: g */
    public final String f3155g;

    /* JADX INFO: renamed from: h */
    public final boolean f3156h;

    /* JADX INFO: renamed from: i */
    public final boolean f3157i;

    /* JADX INFO: renamed from: j */
    public final boolean f3158j;

    /* JADX INFO: renamed from: k */
    public final Bundle f3159k;

    /* JADX INFO: renamed from: l */
    public final boolean f3160l;

    /* JADX INFO: renamed from: m */
    public final int f3161m;

    /* JADX INFO: renamed from: n */
    public Bundle f3162n;

    /* JADX INFO: renamed from: b.m.b.x$a */
    public static class a implements Parcelable.Creator<C0489x> {
        @Override // android.os.Parcelable.Creator
        public C0489x createFromParcel(Parcel parcel) {
            return new C0489x(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public C0489x[] newArray(int i) {
            return new C0489x[i];
        }
    }

    public C0489x(Parcel parcel) {
        this.f3150b = parcel.readString();
        this.f3151c = parcel.readString();
        this.f3152d = parcel.readInt() != 0;
        this.f3153e = parcel.readInt();
        this.f3154f = parcel.readInt();
        this.f3155g = parcel.readString();
        this.f3156h = parcel.readInt() != 0;
        this.f3157i = parcel.readInt() != 0;
        this.f3158j = parcel.readInt() != 0;
        this.f3159k = parcel.readBundle();
        this.f3160l = parcel.readInt() != 0;
        this.f3162n = parcel.readBundle();
        this.f3161m = parcel.readInt();
    }

    public C0489x(Fragment fragment) {
        this.f3150b = fragment.getClass().getName();
        this.f3151c = fragment.f685f;
        this.f3152d = fragment.f693n;
        this.f3153e = fragment.f702w;
        this.f3154f = fragment.f703x;
        this.f3155g = fragment.f704y;
        this.f3156h = fragment.f662B;
        this.f3157i = fragment.f692m;
        this.f3158j = fragment.f661A;
        this.f3159k = fragment.f686g;
        this.f3160l = fragment.f705z;
        this.f3161m = fragment.f676P.ordinal();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f3150b);
        sb.append(" (");
        sb.append(this.f3151c);
        sb.append(")}:");
        if (this.f3152d) {
            sb.append(" fromLayout");
        }
        if (this.f3154f != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f3154f));
        }
        String str = this.f3155g;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f3155g);
        }
        if (this.f3156h) {
            sb.append(" retainInstance");
        }
        if (this.f3157i) {
            sb.append(" removing");
        }
        if (this.f3158j) {
            sb.append(" detached");
        }
        if (this.f3160l) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3150b);
        parcel.writeString(this.f3151c);
        parcel.writeInt(this.f3152d ? 1 : 0);
        parcel.writeInt(this.f3153e);
        parcel.writeInt(this.f3154f);
        parcel.writeString(this.f3155g);
        parcel.writeInt(this.f3156h ? 1 : 0);
        parcel.writeInt(this.f3157i ? 1 : 0);
        parcel.writeInt(this.f3158j ? 1 : 0);
        parcel.writeBundle(this.f3159k);
        parcel.writeInt(this.f3160l ? 1 : 0);
        parcel.writeBundle(this.f3162n);
        parcel.writeInt(this.f3161m);
    }
}
