package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new C0011a();

    /* JADX INFO: renamed from: b */
    public int f24b;

    /* JADX INFO: renamed from: c */
    public int f25c;

    /* JADX INFO: renamed from: d */
    public int f26d;

    /* JADX INFO: renamed from: e */
    public int f27e;

    /* JADX INFO: renamed from: f */
    public int f28f;

    /* JADX INFO: renamed from: android.support.v4.media.session.ParcelableVolumeInfo$a */
    public static class C0011a implements Parcelable.Creator<ParcelableVolumeInfo> {
        @Override // android.os.Parcelable.Creator
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ParcelableVolumeInfo[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f24b = parcel.readInt();
        this.f26d = parcel.readInt();
        this.f27e = parcel.readInt();
        this.f28f = parcel.readInt();
        this.f25c = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f24b);
        parcel.writeInt(this.f26d);
        parcel.writeInt(this.f27e);
        parcel.writeInt(this.f28f);
        parcel.writeInt(this.f25c);
    }
}
