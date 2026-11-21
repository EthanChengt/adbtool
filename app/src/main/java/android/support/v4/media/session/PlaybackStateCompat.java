package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;
import c.a.a.a.a;

/* JADX INFO: loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new C0013a();

    /* JADX INFO: renamed from: b */
    public final int f29b;

    /* JADX INFO: renamed from: c */
    public final long f30c;

    /* JADX INFO: renamed from: d */
    public final long f31d;

    /* JADX INFO: renamed from: e */
    public final float f32e;

    /* JADX INFO: renamed from: f */
    public final long f33f;

    /* JADX INFO: renamed from: g */
    public final int f34g;

    /* JADX INFO: renamed from: h */
    public final CharSequence f35h;

    /* JADX INFO: renamed from: i */
    public final long f36i;

    /* JADX INFO: renamed from: j */
    public List<CustomAction> f37j;

    /* JADX INFO: renamed from: k */
    public final long f38k;

    /* JADX INFO: renamed from: l */
    public final Bundle f39l;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new C0012a();

        /* JADX INFO: renamed from: b */
        public final String f40b;

        /* JADX INFO: renamed from: c */
        public final CharSequence f41c;

        /* JADX INFO: renamed from: d */
        public final int f42d;

        /* JADX INFO: renamed from: e */
        public final Bundle f43e;

        /* JADX INFO: renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction$a */
        public static class C0012a implements Parcelable.Creator<CustomAction> {
            @Override // android.os.Parcelable.Creator
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        public CustomAction(Parcel parcel) {
            this.f40b = parcel.readString();
            this.f41c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f42d = parcel.readInt();
            this.f43e = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder sbM2191e = a.m2191e("Action:mName='");
            sbM2191e.append((Object) this.f41c);
            sbM2191e.append(", mIcon=");
            sbM2191e.append(this.f42d);
            sbM2191e.append(", mExtras=");
            sbM2191e.append(this.f43e);
            return sbM2191e.toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f40b);
            TextUtils.writeToParcel(this.f41c, parcel, i);
            parcel.writeInt(this.f42d);
            parcel.writeBundle(this.f43e);
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.session.PlaybackStateCompat$a */
    public static class C0013a implements Parcelable.Creator<PlaybackStateCompat> {
        @Override // android.os.Parcelable.Creator
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f29b = parcel.readInt();
        this.f30c = parcel.readLong();
        this.f32e = parcel.readFloat();
        this.f36i = parcel.readLong();
        this.f31d = parcel.readLong();
        this.f33f = parcel.readLong();
        this.f35h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f37j = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f38k = parcel.readLong();
        this.f39l = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f34g = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f29b + ", position=" + this.f30c + ", buffered position=" + this.f31d + ", speed=" + this.f32e + ", updated=" + this.f36i + ", actions=" + this.f33f + ", error code=" + this.f34g + ", error message=" + this.f35h + ", custom actions=" + this.f37j + ", active item id=" + this.f38k + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f29b);
        parcel.writeLong(this.f30c);
        parcel.writeFloat(this.f32e);
        parcel.writeLong(this.f36i);
        parcel.writeLong(this.f31d);
        parcel.writeLong(this.f33f);
        TextUtils.writeToParcel(this.f35h, parcel, i);
        parcel.writeTypedList(this.f37j);
        parcel.writeLong(this.f38k);
        parcel.writeBundle(this.f39l);
        parcel.writeInt(this.f34g);
    }
}
