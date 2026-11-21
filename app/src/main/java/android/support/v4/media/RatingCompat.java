package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import c.a.a.a.a;

/* JADX INFO: loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new C0006a();

    /* JADX INFO: renamed from: b */
    public final int f17b;

    /* JADX INFO: renamed from: c */
    public final float f18c;

    /* JADX INFO: renamed from: android.support.v4.media.RatingCompat$a */
    public static class C0006a implements Parcelable.Creator<RatingCompat> {
        @Override // android.os.Parcelable.Creator
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }
    }

    public RatingCompat(int i, float f) {
        this.f17b = i;
        this.f18c = f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.f17b;
    }

    public String toString() {
        StringBuilder sbM2191e = a.m2191e("Rating:style=");
        sbM2191e.append(this.f17b);
        sbM2191e.append(" rating=");
        float f = this.f18c;
        sbM2191e.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sbM2191e.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f17b);
        parcel.writeFloat(this.f18c);
    }
}
