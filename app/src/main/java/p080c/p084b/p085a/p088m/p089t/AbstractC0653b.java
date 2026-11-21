package p080c.p084b.p085a.p088m.p089t;

import android.content.res.AssetManager;
import android.util.Log;
import java.io.IOException;
import p080c.p084b.p085a.EnumC0620f;
import p080c.p084b.p085a.p088m.EnumC0633a;

/* JADX INFO: renamed from: c.b.a.m.t.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0653b<T> implements InterfaceC0655d<T> {

    /* JADX INFO: renamed from: b */
    public final String f3947b;

    /* JADX INFO: renamed from: c */
    public final AssetManager f3948c;

    /* JADX INFO: renamed from: d */
    public T f3949d;

    public AbstractC0653b(AssetManager assetManager, String str) {
        this.f3948c = assetManager;
        this.f3947b = str;
    }

    @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0655d
    /* JADX INFO: renamed from: b */
    public void mo2294b() {
        T t = this.f3949d;
        if (t == null) {
            return;
        }
        try {
            mo2296d(t);
        } catch (IOException unused) {
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
    public abstract void mo2296d(T t);

    @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0655d
    /* JADX INFO: renamed from: e */
    public void mo2297e(EnumC0620f enumC0620f, InterfaceC0655d.a<? super T> aVar) {
        try {
            T tMo2298f = mo2298f(this.f3948c, this.f3947b);
            this.f3949d = tMo2298f;
            aVar.mo2300f(tMo2298f);
        } catch (IOException e) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e);
            }
            aVar.mo2299d(e);
        }
    }

    /* JADX INFO: renamed from: f */
    public abstract T mo2298f(AssetManager assetManager, String str);
}
