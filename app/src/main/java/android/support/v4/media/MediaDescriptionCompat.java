package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new C0004a();

    /* JADX INFO: renamed from: b */
    public final String f6b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f7c;

    /* JADX INFO: renamed from: d */
    public final CharSequence f8d;

    /* JADX INFO: renamed from: e */
    public final CharSequence f9e;

    /* JADX INFO: renamed from: f */
    public final Bitmap f10f;

    /* JADX INFO: renamed from: g */
    public final Uri f11g;

    /* JADX INFO: renamed from: h */
    public final Bundle f12h;

    /* JADX INFO: renamed from: i */
    public final Uri f13i;

    /* JADX INFO: renamed from: j */
    public Object f14j;

    /* JADX INFO: renamed from: android.support.v4.media.MediaDescriptionCompat$a */
    public static class C0004a implements Parcelable.Creator<MediaDescriptionCompat> {
        @Override // android.os.Parcelable.Creator
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return Build.VERSION.SDK_INT < 21 ? new MediaDescriptionCompat(parcel) : MediaDescriptionCompat.m1j(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    }

    public MediaDescriptionCompat(Parcel parcel) {
        this.f6b = parcel.readString();
        this.f7c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f8d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f9e = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.f10f = (Bitmap) parcel.readParcelable(classLoader);
        this.f11g = (Uri) parcel.readParcelable(classLoader);
        this.f12h = parcel.readBundle(classLoader);
        this.f13i = (Uri) parcel.readParcelable(classLoader);
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f6b = str;
        this.f7c = charSequence;
        this.f8d = charSequence2;
        this.f9e = charSequence3;
        this.f10f = bitmap;
        this.f11g = uri;
        this.f12h = bundle;
        this.f13i = uri2;
    }

    /* JADX INFO: renamed from: j */
    public static MediaDescriptionCompat m1j(Object obj) {
        int i;
        Uri mediaUri;
        Bundle bundle;
        if (obj == null || (i = Build.VERSION.SDK_INT) < 21) {
            return null;
        }
        MediaDescription mediaDescription = (MediaDescription) obj;
        String mediaId = mediaDescription.getMediaId();
        CharSequence title = mediaDescription.getTitle();
        CharSequence subtitle = mediaDescription.getSubtitle();
        CharSequence description = mediaDescription.getDescription();
        Bitmap iconBitmap = mediaDescription.getIconBitmap();
        Uri iconUri = mediaDescription.getIconUri();
        Bundle extras = mediaDescription.getExtras();
        if (extras != null) {
            MediaSessionCompat.m2a(extras);
            mediaUri = (Uri) extras.getParcelable("android.support.v4.media.description.MEDIA_URI");
        } else {
            mediaUri = null;
        }
        if (mediaUri == null) {
            bundle = extras;
        } else if (extras.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && extras.size() == 2) {
            bundle = null;
        } else {
            extras.remove("android.support.v4.media.description.MEDIA_URI");
            extras.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
            bundle = extras;
        }
        if (mediaUri == null) {
            mediaUri = i >= 23 ? mediaDescription.getMediaUri() : null;
        }
        MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(mediaId, title, subtitle, description, iconBitmap, iconUri, bundle, mediaUri);
        mediaDescriptionCompat.f14j = obj;
        return mediaDescriptionCompat;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return ((Object) this.f7c) + ", " + ((Object) this.f8d) + ", " + ((Object) this.f9e);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 21) {
            parcel.writeString(this.f6b);
            TextUtils.writeToParcel(this.f7c, parcel, i);
            TextUtils.writeToParcel(this.f8d, parcel, i);
            TextUtils.writeToParcel(this.f9e, parcel, i);
            parcel.writeParcelable(this.f10f, i);
            parcel.writeParcelable(this.f11g, i);
            parcel.writeBundle(this.f12h);
            parcel.writeParcelable(this.f13i, i);
            return;
        }
        Object objBuild = this.f14j;
        if (objBuild == null && i2 >= 21) {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.f6b);
            builder.setTitle(this.f7c);
            builder.setSubtitle(this.f8d);
            builder.setDescription(this.f9e);
            builder.setIconBitmap(this.f10f);
            builder.setIconUri(this.f11g);
            Bundle bundle = this.f12h;
            if (i2 < 23 && this.f13i != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                    bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                }
                bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f13i);
            }
            builder.setExtras(bundle);
            if (i2 >= 23) {
                builder.setMediaUri(this.f13i);
            }
            objBuild = builder.build();
            this.f14j = objBuild;
        }
        ((MediaDescription) objBuild).writeToParcel(parcel, i);
    }
}
