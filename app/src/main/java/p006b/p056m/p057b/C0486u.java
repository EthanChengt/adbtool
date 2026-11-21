package p006b.p056m.p057b;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: b.m.b.u */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class C0486u implements Parcelable {
    public static final Parcelable.Creator<C0486u> CREATOR = new a();

    /* JADX INFO: renamed from: b */
    public ArrayList<C0489x> f3134b;

    /* JADX INFO: renamed from: c */
    public ArrayList<String> f3135c;

    /* JADX INFO: renamed from: d */
    public C0453b[] f3136d;

    /* JADX INFO: renamed from: e */
    public int f3137e;

    /* JADX INFO: renamed from: f */
    public String f3138f;

    /* JADX INFO: renamed from: b.m.b.u$a */
    public static class a implements Parcelable.Creator<C0486u> {
        @Override // android.os.Parcelable.Creator
        public C0486u createFromParcel(Parcel parcel) {
            return new C0486u(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public C0486u[] newArray(int i) {
            return new C0486u[i];
        }
    }

    public C0486u() {
        this.f3138f = null;
    }

    public C0486u(Parcel parcel) {
        this.f3138f = null;
        this.f3134b = parcel.createTypedArrayList(C0489x.CREATOR);
        this.f3135c = parcel.createStringArrayList();
        this.f3136d = (C0453b[]) parcel.createTypedArray(C0453b.CREATOR);
        this.f3137e = parcel.readInt();
        this.f3138f = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f3134b);
        parcel.writeStringList(this.f3135c);
        parcel.writeTypedArray(this.f3136d, i);
        parcel.writeInt(this.f3137e);
        parcel.writeString(this.f3138f);
    }
}
