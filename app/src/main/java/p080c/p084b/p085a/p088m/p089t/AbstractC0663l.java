package p080c.p084b.p085a.p088m.p089t;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;
import p080c.p084b.p085a.EnumC0620f;
import p080c.p084b.p085a.p088m.EnumC0633a;

/* JADX INFO: renamed from: c.b.a.m.t.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0663l<T> implements InterfaceC0655d<T> {

    /* JADX INFO: renamed from: b */
    public final Uri f3970b;

    /* JADX INFO: renamed from: c */
    public final ContentResolver f3971c;

    /* JADX INFO: renamed from: d */
    public T f3972d;

    public AbstractC0663l(ContentResolver contentResolver, Uri uri) {
        this.f3971c = contentResolver;
        this.f3970b = uri;
    }

    @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0655d
    /* JADX INFO: renamed from: b */
    public void mo2294b() {
        T t = this.f3972d;
        if (t != null) {
            try {
                mo2292d(t);
            } catch (IOException unused) {
            }
        }
    }

    @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0655d
    /* JADX INFO: renamed from: c */
    public EnumC0633a mo2295c() {
        return EnumC0633a.LOCAL;
    }

    @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0655d
    public void cancel() {
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo2292d(T t);

    @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0655d
    /* JADX INFO: renamed from: e */
    public final void mo2297e(EnumC0620f enumC0620f, InterfaceC0655d.a<? super T> aVar) {
        try {
            T tMo2293f = mo2293f(this.f3970b, this.f3971c);
            this.f3972d = tMo2293f;
            aVar.mo2300f(tMo2293f);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e);
            }
            aVar.mo2299d(e);
        }
    }

    /* JADX INFO: renamed from: f */
    public abstract T mo2293f(Uri uri, ContentResolver contentResolver);
}
