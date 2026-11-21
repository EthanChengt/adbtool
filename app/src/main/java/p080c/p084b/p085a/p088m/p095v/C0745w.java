package p080c.p084b.p085a.p088m.p095v;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p080c.p084b.p085a.p088m.C0647o;
import p080c.p084b.p085a.p088m.p089t.C0652a;
import p080c.p084b.p085a.p088m.p089t.C0660i;
import p080c.p084b.p085a.p088m.p089t.C0665n;
import p080c.p084b.p085a.p088m.p089t.InterfaceC0655d;
import p080c.p084b.p085a.p110r.C0865d;

/* JADX INFO: renamed from: c.b.a.m.v.w */
/* JADX INFO: loaded from: classes.dex */
public class C0745w<Data> implements InterfaceC0736n<Uri, Data> {

    /* JADX INFO: renamed from: b */
    public static final Set<String> f4363b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "android.resource", "content")));

    /* JADX INFO: renamed from: a */
    public final c<Data> f4364a;

    /* JADX INFO: renamed from: c.b.a.m.v.w$a */
    public static final class a implements InterfaceC0737o<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {

        /* JADX INFO: renamed from: a */
        public final ContentResolver f4365a;

        public a(ContentResolver contentResolver) {
            this.f4365a = contentResolver;
        }

        @Override // p080c.p084b.p085a.p088m.p095v.C0745w.c
        /* JADX INFO: renamed from: a */
        public InterfaceC0655d<AssetFileDescriptor> mo2448a(Uri uri) {
            return new C0652a(this.f4365a, uri);
        }

        @Override // p080c.p084b.p085a.p088m.p095v.InterfaceC0737o
        /* JADX INFO: renamed from: b */
        public InterfaceC0736n<Uri, AssetFileDescriptor> mo2429b(C0740r c0740r) {
            return new C0745w(this);
        }
    }

    /* JADX INFO: renamed from: c.b.a.m.v.w$b */
    public static class b implements InterfaceC0737o<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {

        /* JADX INFO: renamed from: a */
        public final ContentResolver f4366a;

        public b(ContentResolver contentResolver) {
            this.f4366a = contentResolver;
        }

        @Override // p080c.p084b.p085a.p088m.p095v.C0745w.c
        /* JADX INFO: renamed from: a */
        public InterfaceC0655d<ParcelFileDescriptor> mo2448a(Uri uri) {
            return new C0660i(this.f4366a, uri);
        }

        @Override // p080c.p084b.p085a.p088m.p095v.InterfaceC0737o
        /* JADX INFO: renamed from: b */
        public InterfaceC0736n<Uri, ParcelFileDescriptor> mo2429b(C0740r c0740r) {
            return new C0745w(this);
        }
    }

    /* JADX INFO: renamed from: c.b.a.m.v.w$c */
    public interface c<Data> {
        /* JADX INFO: renamed from: a */
        InterfaceC0655d<Data> mo2448a(Uri uri);
    }

    /* JADX INFO: renamed from: c.b.a.m.v.w$d */
    public static class d implements InterfaceC0737o<Uri, InputStream>, c<InputStream> {

        /* JADX INFO: renamed from: a */
        public final ContentResolver f4367a;

        public d(ContentResolver contentResolver) {
            this.f4367a = contentResolver;
        }

        @Override // p080c.p084b.p085a.p088m.p095v.C0745w.c
        /* JADX INFO: renamed from: a */
        public InterfaceC0655d<InputStream> mo2448a(Uri uri) {
            return new C0665n(this.f4367a, uri);
        }

        @Override // p080c.p084b.p085a.p088m.p095v.InterfaceC0737o
        /* JADX INFO: renamed from: b */
        public InterfaceC0736n<Uri, InputStream> mo2429b(C0740r c0740r) {
            return new C0745w(this);
        }
    }

    public C0745w(c<Data> cVar) {
        this.f4364a = cVar;
    }

    @Override // p080c.p084b.p085a.p088m.p095v.InterfaceC0736n
    /* JADX INFO: renamed from: a */
    public InterfaceC0736n.a mo2426a(Uri uri, int i, int i2, C0647o c0647o) {
        Uri uri2 = uri;
        return new InterfaceC0736n.a(new C0865d(uri2), this.f4364a.mo2448a(uri2));
    }

    @Override // p080c.p084b.p085a.p088m.p095v.InterfaceC0736n
    /* JADX INFO: renamed from: b */
    public boolean mo2427b(Uri uri) {
        return f4363b.contains(uri.getScheme());
    }
}
