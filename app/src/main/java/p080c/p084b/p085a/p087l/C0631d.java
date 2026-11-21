package p080c.p084b.p085a.p087l;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.Objects;

/* JADX INFO: renamed from: c.b.a.l.d */
/* JADX INFO: loaded from: classes.dex */
public class C0631d {

    /* JADX INFO: renamed from: b */
    public ByteBuffer f3892b;

    /* JADX INFO: renamed from: c */
    public C0630c f3893c;

    /* JADX INFO: renamed from: a */
    public final byte[] f3891a = new byte[256];

    /* JADX INFO: renamed from: d */
    public int f3894d = 0;

    /* JADX INFO: renamed from: a */
    public final boolean m2269a() {
        return this.f3893c.f3881b != 0;
    }

    /* JADX INFO: renamed from: b */
    public C0630c m2270b() {
        if (this.f3892b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (m2269a()) {
            return this.f3893c;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) m2271c());
        }
        if (sb.toString().startsWith("GIF")) {
            this.f3893c.f3885f = m2274f();
            this.f3893c.f3886g = m2274f();
            int iM2271c = m2271c();
            C0630c c0630c = this.f3893c;
            c0630c.f3887h = (iM2271c & 128) != 0;
            c0630c.f3888i = (int) Math.pow(2.0d, (iM2271c & 7) + 1);
            this.f3893c.f3889j = m2271c();
            C0630c c0630c2 = this.f3893c;
            m2271c();
            Objects.requireNonNull(c0630c2);
            if (this.f3893c.f3887h && !m2269a()) {
                C0630c c0630c3 = this.f3893c;
                c0630c3.f3880a = m2273e(c0630c3.f3888i);
                C0630c c0630c4 = this.f3893c;
                c0630c4.f3890k = c0630c4.f3880a[c0630c4.f3889j];
            }
        } else {
            this.f3893c.f3881b = 1;
        }
        if (!m2269a()) {
            boolean z = false;
            while (!z && !m2269a() && this.f3893c.f3882c <= Integer.MAX_VALUE) {
                int iM2271c2 = m2271c();
                if (iM2271c2 == 33) {
                    int iM2271c3 = m2271c();
                    if (iM2271c3 != 1) {
                        if (iM2271c3 == 249) {
                            this.f3893c.f3883d = new C0629b();
                            m2271c();
                            int iM2271c4 = m2271c();
                            C0629b c0629b = this.f3893c.f3883d;
                            int i2 = (iM2271c4 & 28) >> 2;
                            c0629b.f3875g = i2;
                            if (i2 == 0) {
                                c0629b.f3875g = 1;
                            }
                            c0629b.f3874f = (iM2271c4 & 1) != 0;
                            int iM2274f = m2274f();
                            if (iM2274f < 2) {
                                iM2274f = 10;
                            }
                            C0629b c0629b2 = this.f3893c.f3883d;
                            c0629b2.f3877i = iM2274f * 10;
                            c0629b2.f3876h = m2271c();
                            m2271c();
                        } else if (iM2271c3 != 254 && iM2271c3 == 255) {
                            m2272d();
                            StringBuilder sb2 = new StringBuilder();
                            for (int i3 = 0; i3 < 11; i3++) {
                                sb2.append((char) this.f3891a[i3]);
                            }
                            if (sb2.toString().equals("NETSCAPE2.0")) {
                                do {
                                    m2272d();
                                    byte[] bArr = this.f3891a;
                                    if (bArr[0] == 1) {
                                        byte b2 = bArr[1];
                                        byte b3 = bArr[2];
                                        Objects.requireNonNull(this.f3893c);
                                    }
                                    if (this.f3894d <= 0) {
                                        break;
                                    }
                                } while (!m2269a());
                            }
                        }
                    }
                    m2275g();
                } else if (iM2271c2 == 44) {
                    C0630c c0630c5 = this.f3893c;
                    if (c0630c5.f3883d == null) {
                        c0630c5.f3883d = new C0629b();
                    }
                    c0630c5.f3883d.f3869a = m2274f();
                    this.f3893c.f3883d.f3870b = m2274f();
                    this.f3893c.f3883d.f3871c = m2274f();
                    this.f3893c.f3883d.f3872d = m2274f();
                    int iM2271c5 = m2271c();
                    boolean z2 = (iM2271c5 & 128) != 0;
                    int iPow = (int) Math.pow(2.0d, (iM2271c5 & 7) + 1);
                    C0629b c0629b3 = this.f3893c.f3883d;
                    c0629b3.f3873e = (iM2271c5 & 64) != 0;
                    if (z2) {
                        c0629b3.f3879k = m2273e(iPow);
                    } else {
                        c0629b3.f3879k = null;
                    }
                    this.f3893c.f3883d.f3878j = this.f3892b.position();
                    m2271c();
                    m2275g();
                    if (!m2269a()) {
                        C0630c c0630c6 = this.f3893c;
                        c0630c6.f3882c++;
                        c0630c6.f3884e.add(c0630c6.f3883d);
                    }
                } else if (iM2271c2 != 59) {
                    this.f3893c.f3881b = 1;
                } else {
                    z = true;
                }
            }
            C0630c c0630c7 = this.f3893c;
            if (c0630c7.f3882c < 0) {
                c0630c7.f3881b = 1;
            }
        }
        return this.f3893c;
    }

    /* JADX INFO: renamed from: c */
    public final int m2271c() {
        try {
            return this.f3892b.get() & 255;
        } catch (Exception unused) {
            this.f3893c.f3881b = 1;
            return 0;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2272d() {
        int iM2271c = m2271c();
        this.f3894d = iM2271c;
        if (iM2271c <= 0) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            try {
                int i3 = this.f3894d;
                if (i >= i3) {
                    return;
                }
                i2 = i3 - i;
                this.f3892b.get(this.f3891a, i, i2);
                i += i2;
            } catch (Exception e) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    Log.d("GifHeaderParser", "Error Reading Block n: " + i + " count: " + i2 + " blockSize: " + this.f3894d, e);
                }
                this.f3893c.f3881b = 1;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final int[] m2273e(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.f3892b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = i3 + 1;
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                int i7 = i2 + 1;
                iArr[i2] = ((bArr[i3] & 255) << 16) | (-16777216) | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
                i3 = i6;
                i2 = i7;
            }
        } catch (BufferUnderflowException e) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e);
            }
            this.f3893c.f3881b = 1;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: f */
    public final int m2274f() {
        return this.f3892b.getShort();
    }

    /* JADX INFO: renamed from: g */
    public final void m2275g() {
        int iM2271c;
        do {
            iM2271c = m2271c();
            this.f3892b.position(Math.min(this.f3892b.position() + iM2271c, this.f3892b.limit()));
        } while (iM2271c > 0);
    }
}
