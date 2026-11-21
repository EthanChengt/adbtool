package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import p000a.p001a.p002a.p005b.C0002b;

/* JADX INFO: loaded from: classes.dex */
public class MediaBrowserCompat$ItemReceiver extends C0002b {
    @Override // p000a.p001a.p002a.p005b.C0002b
    /* JADX INFO: renamed from: j */
    public void mo0j(int i, Bundle bundle) {
        MediaSessionCompat.m2a(bundle);
        if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
            throw null;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable != null && !(parcelable instanceof MediaBrowserCompat$MediaItem)) {
            throw null;
        }
        throw null;
    }
}
