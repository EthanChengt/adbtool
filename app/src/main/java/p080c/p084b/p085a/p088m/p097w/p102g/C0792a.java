package p080c.p084b.p085a.p088m.p097w.p102g;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import b.s.m;
import c.a.a.a.a;
import p080c.p084b.p085a.p087l.C0630c;
import p080c.p084b.p085a.p087l.C0631d;
import p080c.p084b.p085a.p087l.C0632e;
import p080c.p084b.p085a.p088m.C0639g;
import p080c.p084b.p085a.p088m.C0647o;
import p080c.p084b.p085a.p088m.EnumC0634b;
import p080c.p084b.p085a.p088m.InterfaceC0649q;
import p080c.p084b.p085a.p088m.p091u.InterfaceC0719w;
import p080c.p084b.p085a.p088m.p091u.p092c0.InterfaceC0676b;
import p080c.p084b.p085a.p088m.p091u.p092c0.InterfaceC0678d;
import p080c.p084b.p085a.p088m.p097w.C0753b;
import p080c.p084b.p085a.p111s.C0871f;
import p080c.p084b.p085a.p111s.C0875j;

/* JADX INFO: renamed from: c.b.a.m.w.g.a */
/* JADX INFO: loaded from: classes.dex */
public class C0792a implements InterfaceC0649q<ByteBuffer, C0794c> {

    /* JADX INFO: renamed from: f */
    public static final a f4503f = new a();

    /* JADX INFO: renamed from: g */
    public static final b f4504g = new b();

    /* JADX INFO: renamed from: a */
    public final Context f4505a;

    /* JADX INFO: renamed from: b */
    public final List<ImageHeaderParser> f4506b;

    /* JADX INFO: renamed from: c */
    public final b f4507c;

    /* JADX INFO: renamed from: d */
    public final a f4508d;

    /* JADX INFO: renamed from: e */
    public final C0793b f4509e;

    /* JADX INFO: renamed from: c.b.a.m.w.g.a$a */
    public static class a {
    }

    /* JADX INFO: renamed from: c.b.a.m.w.g.a$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final Queue<C0631d> f4510a;

        public b() {
            char[] cArr = C0875j.f4742a;
            this.f4510a = new ArrayDeque(0);
        }

        /* JADX INFO: renamed from: a */
        public synchronized void m2500a(C0631d c0631d) {
            c0631d.f3892b = null;
            c0631d.f3893c = null;
            this.f4510a.offer(c0631d);
        }
    }

    public C0792a(Context context, List<ImageHeaderParser> list, InterfaceC0678d interfaceC0678d, InterfaceC0676b interfaceC0676b) {
        b bVar = f4504g;
        a aVar = f4503f;
        this.f4505a = context.getApplicationContext();
        this.f4506b = list;
        this.f4508d = aVar;
        this.f4509e = new C0793b(interfaceC0678d, interfaceC0676b);
        this.f4507c = bVar;
    }

    /* JADX INFO: renamed from: d */
    public static int m2498d(C0630c c0630c, int i, int i2) {
        int iMin = Math.min(c0630c.f3886g / i2, c0630c.f3885f / i);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + iMax + ", target dimens: [" + i + "x" + i2 + "], actual dimens: [" + c0630c.f3885f + "x" + c0630c.f3886g + "]");
        }
        return iMax;
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0649q
    /* JADX INFO: renamed from: a */
    public InterfaceC0719w<C0794c> mo2287a(ByteBuffer byteBuffer, int i, int i2, C0647o c0647o) {
        C0631d c0631d;
        ByteBuffer byteBuffer2 = byteBuffer;
        b bVar = this.f4507c;
        synchronized (bVar) {
            C0631d c0631dPoll = bVar.f4510a.poll();
            if (c0631dPoll == null) {
                c0631dPoll = new C0631d();
            }
            c0631d = c0631dPoll;
            c0631d.f3892b = null;
            Arrays.fill(c0631d.f3891a, (byte) 0);
            c0631d.f3893c = new C0630c();
            c0631d.f3894d = 0;
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer2.asReadOnlyBuffer();
            c0631d.f3892b = byteBufferAsReadOnlyBuffer;
            byteBufferAsReadOnlyBuffer.position(0);
            c0631d.f3892b.order(ByteOrder.LITTLE_ENDIAN);
        }
        try {
            return m2499c(byteBuffer2, i, i2, c0631d, c0647o);
        } finally {
            this.f4507c.m2500a(c0631d);
        }
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0649q
    /* JADX INFO: renamed from: b */
    public boolean mo2288b(ByteBuffer byteBuffer, C0647o c0647o) {
        ByteBuffer byteBuffer2 = byteBuffer;
        if (!((Boolean) c0647o.m2285c(C0800i.f4549b)).booleanValue()) {
            if ((byteBuffer2 == null ? ImageHeaderParser.ImageType.UNKNOWN : m.m1979w(this.f4506b, new C0639g(byteBuffer2))) == ImageHeaderParser.ImageType.GIF) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final C0796e m2499c(ByteBuffer byteBuffer, int i, int i2, C0631d c0631d, C0647o c0647o) {
        int i3 = C0871f.f4732b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            C0630c c0630cM2270b = c0631d.m2270b();
            if (c0630cM2270b.f3882c > 0 && c0630cM2270b.f3881b == 0) {
                Bitmap.Config config = c0647o.m2285c(C0800i.f4548a) == EnumC0634b.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int iM2498d = m2498d(c0630cM2270b, i, i2);
                a aVar = this.f4508d;
                C0793b c0793b = this.f4509e;
                Objects.requireNonNull(aVar);
                C0632e c0632e = new C0632e(c0793b, c0630cM2270b, byteBuffer, iM2498d);
                c0632e.m2277i(config);
                c0632e.f3906k = (c0632e.f3906k + 1) % c0632e.f3907l.f3882c;
                Bitmap bitmapMo2264c = c0632e.mo2264c();
                if (bitmapMo2264c == null) {
                    return null;
                }
                return new C0796e(new C0794c(this.f4505a, c0632e, (C0753b) C0753b.f4403b, i, i2, bitmapMo2264c));
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                StringBuilder sbM2191e = a.m2191e("Decoded GIF from stream in ");
                sbM2191e.append(C0871f.m2603a(jElapsedRealtimeNanos));
                Log.v("BufferGifDecoder", sbM2191e.toString());
            }
        }
    }
}
