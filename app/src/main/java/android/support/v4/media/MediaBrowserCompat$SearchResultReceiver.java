package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import java.util.ArrayList;
import p000a.p001a.p002a.p005b.C0002b;

/* JADX INFO: loaded from: classes.dex */
public class MediaBrowserCompat$SearchResultReceiver extends C0002b {
    @Override // p000a.p001a.p002a.p005b.C0002b
    /* JADX INFO: renamed from: j */
    public void mo0j(int i, Bundle bundle) {
        Parcelable[] parcelableArray;
        MediaSessionCompat.m2a(bundle);
        if (i != 0 || bundle == null || !bundle.containsKey("search_results") || (parcelableArray = bundle.getParcelableArray("search_results")) == null) {
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : parcelableArray) {
            arrayList.add((MediaBrowserCompat$MediaItem) parcelable);
        }
        throw null;
    }
}
