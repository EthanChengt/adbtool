package p080c.p084b.p085a.p088m.p097w.p098c;

import android.graphics.Bitmap;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.Queue;
import p080c.p084b.p085a.p088m.C0647o;
import p080c.p084b.p085a.p088m.InterfaceC0649q;
import p080c.p084b.p085a.p088m.p091u.InterfaceC0719w;
import p080c.p084b.p085a.p088m.p091u.p092c0.InterfaceC0676b;
import p080c.p084b.p085a.p088m.p091u.p092c0.InterfaceC0678d;
import p080c.p084b.p085a.p111s.C0869d;
import p080c.p084b.p085a.p111s.C0873h;

/* JADX INFO: renamed from: c.b.a.m.w.c.y */
/* JADX INFO: loaded from: classes.dex */
public class C0781y implements InterfaceC0649q<InputStream, Bitmap> {

    /* JADX INFO: renamed from: a */
    public final C0769m f4489a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0676b f4490b;

    /* JADX INFO: renamed from: c.b.a.m.w.c.y$a */
    public static class a implements C0769m.b {

        /* JADX INFO: renamed from: a */
        public final C0779w f4491a;

        /* JADX INFO: renamed from: b */
        public final C0869d f4492b;

        public a(C0779w c0779w, C0869d c0869d) {
            this.f4491a = c0779w;
            this.f4492b = c0869d;
        }

        @Override // p080c.p084b.p085a.p088m.p097w.p098c.C0769m.b
        /* JADX INFO: renamed from: a */
        public void mo2480a(InterfaceC0678d interfaceC0678d, Bitmap bitmap) throws IOException {
            IOException iOException = this.f4492b.f4728c;
            if (iOException != null) {
                if (bitmap == null) {
                    throw iOException;
                }
                interfaceC0678d.mo2332e(bitmap);
                throw iOException;
            }
        }

        @Override // p080c.p084b.p085a.p088m.p097w.p098c.C0769m.b
        /* JADX INFO: renamed from: b */
        public void mo2481b() {
            C0779w c0779w = this.f4491a;
            synchronized (c0779w) {
                c0779w.f4483d = c0779w.f4481b.length;
            }
        }
    }

    public C0781y(C0769m c0769m, InterfaceC0676b interfaceC0676b) {
        this.f4489a = c0769m;
        this.f4490b = interfaceC0676b;
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0649q
    /* JADX INFO: renamed from: a */
    public InterfaceC0719w<Bitmap> mo2287a(InputStream inputStream, int i, int i2, C0647o c0647o) {
        C0779w c0779w;
        boolean z;
        C0869d c0869dPoll;
        InputStream inputStream2 = inputStream;
        if (inputStream2 instanceof C0779w) {
            c0779w = (C0779w) inputStream2;
            z = false;
        } else {
            c0779w = new C0779w(inputStream2, this.f4490b);
            z = true;
        }
        Queue<C0869d> queue = C0869d.f4726d;
        synchronized (queue) {
            c0869dPoll = queue.poll();
        }
        if (c0869dPoll == null) {
            c0869dPoll = new C0869d();
        }
        c0869dPoll.f4727b = c0779w;
        try {
            return this.f4489a.m2478b(new C0873h(c0869dPoll), i, i2, c0647o, new a(c0779w, c0869dPoll));
        } finally {
            c0869dPoll.m2602a();
            if (z) {
                c0779w.m2492b();
            }
        }
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0649q
    /* JADX INFO: renamed from: b */
    public boolean mo2288b(InputStream inputStream, C0647o c0647o) {
        Objects.requireNonNull(this.f4489a);
        return true;
    }
}
