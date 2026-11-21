package p006b.p054l.p055a;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import c.a.a.a.a;

/* JADX INFO: renamed from: b.l.a.a */
/* JADX INFO: loaded from: classes.dex */
public class C0449a {

    /* JADX INFO: renamed from: A */
    public static final byte[] f2855A;

    /* JADX INFO: renamed from: B */
    public static final byte[] f2856B;

    /* JADX INFO: renamed from: C */
    public static final byte[] f2857C;

    /* JADX INFO: renamed from: D */
    public static final byte[] f2858D;

    /* JADX INFO: renamed from: E */
    public static final byte[] f2859E;

    /* JADX INFO: renamed from: F */
    public static final byte[] f2860F;

    /* JADX INFO: renamed from: G */
    public static SimpleDateFormat f2861G;

    /* JADX INFO: renamed from: H */
    public static final String[] f2862H;

    /* JADX INFO: renamed from: I */
    public static final int[] f2863I;

    /* JADX INFO: renamed from: J */
    public static final byte[] f2864J;

    /* JADX INFO: renamed from: K */
    public static final d[] f2865K;

    /* JADX INFO: renamed from: L */
    public static final d[] f2866L;

    /* JADX INFO: renamed from: M */
    public static final d[] f2867M;

    /* JADX INFO: renamed from: N */
    public static final d[] f2868N;

    /* JADX INFO: renamed from: O */
    public static final d[] f2869O;

    /* JADX INFO: renamed from: P */
    public static final d f2870P;

    /* JADX INFO: renamed from: Q */
    public static final d[] f2871Q;

    /* JADX INFO: renamed from: R */
    public static final d[] f2872R;

    /* JADX INFO: renamed from: S */
    public static final d[] f2873S;

    /* JADX INFO: renamed from: T */
    public static final d[] f2874T;

    /* JADX INFO: renamed from: U */
    public static final d[][] f2875U;

    /* JADX INFO: renamed from: V */
    public static final d[] f2876V;

    /* JADX INFO: renamed from: W */
    public static final HashMap<Integer, d>[] f2877W;

    /* JADX INFO: renamed from: X */
    public static final HashMap<String, d>[] f2878X;

    /* JADX INFO: renamed from: Y */
    public static final HashSet<String> f2879Y;

    /* JADX INFO: renamed from: Z */
    public static final HashMap<Integer, Integer> f2880Z;

    /* JADX INFO: renamed from: a0 */
    public static final Charset f2881a0;

    /* JADX INFO: renamed from: b0 */
    public static final byte[] f2882b0;

    /* JADX INFO: renamed from: c0 */
    public static final byte[] f2883c0;

    /* JADX INFO: renamed from: q */
    public static final boolean f2884q = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: r */
    public static final int[] f2885r;

    /* JADX INFO: renamed from: s */
    public static final int[] f2886s;

    /* JADX INFO: renamed from: t */
    public static final byte[] f2887t;

    /* JADX INFO: renamed from: u */
    public static final byte[] f2888u;

    /* JADX INFO: renamed from: v */
    public static final byte[] f2889v;

    /* JADX INFO: renamed from: w */
    public static final byte[] f2890w;

    /* JADX INFO: renamed from: x */
    public static final byte[] f2891x;

    /* JADX INFO: renamed from: y */
    public static final byte[] f2892y;

    /* JADX INFO: renamed from: z */
    public static final byte[] f2893z;

    /* JADX INFO: renamed from: a */
    public FileDescriptor f2894a;

    /* JADX INFO: renamed from: b */
    public AssetManager.AssetInputStream f2895b;

    /* JADX INFO: renamed from: c */
    public int f2896c;

    /* JADX INFO: renamed from: d */
    public boolean f2897d;

    /* JADX INFO: renamed from: e */
    public final HashMap<String, c>[] f2898e;

    /* JADX INFO: renamed from: f */
    public Set<Integer> f2899f;

    /* JADX INFO: renamed from: g */
    public ByteOrder f2900g;

    /* JADX INFO: renamed from: h */
    public boolean f2901h;

    /* JADX INFO: renamed from: i */
    public int f2902i;

    /* JADX INFO: renamed from: j */
    public int f2903j;

    /* JADX INFO: renamed from: k */
    public int f2904k;

    /* JADX INFO: renamed from: l */
    public int f2905l;

    /* JADX INFO: renamed from: m */
    public int f2906m;

    /* JADX INFO: renamed from: n */
    public int f2907n;

    /* JADX INFO: renamed from: o */
    public int f2908o;

    /* JADX INFO: renamed from: p */
    public int f2909p;

    /* JADX INFO: renamed from: b.l.a.a$a */
    public class a extends MediaDataSource {

        /* JADX INFO: renamed from: b */
        public long f2910b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ b f2911c;

        public a(C0449a c0449a, b bVar) {
            this.f2911c = bVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // android.media.MediaDataSource
        public long getSize() {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j, byte[] bArr, int i, int i2) {
            if (i2 == 0) {
                return 0;
            }
            if (j < 0) {
                return -1;
            }
            try {
                long j2 = this.f2910b;
                if (j2 != j) {
                    if (j2 >= 0 && j >= j2 + ((long) this.f2911c.available())) {
                        return -1;
                    }
                    this.f2911c.m1702b(j);
                    this.f2910b = j;
                }
                if (i2 > this.f2911c.available()) {
                    i2 = this.f2911c.available();
                }
                b bVar = this.f2911c;
                int i3 = bVar.f2914b.read(bArr, i, i2);
                bVar.f2917e += i3;
                if (i3 >= 0) {
                    this.f2910b += (long) i3;
                    return i3;
                }
            } catch (IOException unused) {
            }
            this.f2910b = -1L;
            return -1;
        }
    }

    /* JADX INFO: renamed from: b.l.a.a$b */
    public static class b extends InputStream implements DataInput {

        /* JADX INFO: renamed from: f */
        public static final ByteOrder f2912f = ByteOrder.LITTLE_ENDIAN;

        /* JADX INFO: renamed from: g */
        public static final ByteOrder f2913g = ByteOrder.BIG_ENDIAN;

        /* JADX INFO: renamed from: b */
        public DataInputStream f2914b;

        /* JADX INFO: renamed from: c */
        public ByteOrder f2915c;

        /* JADX INFO: renamed from: d */
        public final int f2916d;

        /* JADX INFO: renamed from: e */
        public int f2917e;

        public b(InputStream inputStream) {
            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
            this.f2915c = byteOrder;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f2914b = dataInputStream;
            int iAvailable = dataInputStream.available();
            this.f2916d = iAvailable;
            this.f2917e = 0;
            this.f2914b.mark(iAvailable);
            this.f2915c = byteOrder;
        }

        public b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr));
        }

        /* JADX INFO: renamed from: a */
        public long m1701a() {
            return ((long) readInt()) & 4294967295L;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f2914b.available();
        }

        /* JADX INFO: renamed from: b */
        public void m1702b(long j) throws IOException {
            int i = this.f2917e;
            if (i > j) {
                this.f2917e = 0;
                this.f2914b.reset();
                this.f2914b.mark(this.f2916d);
            } else {
                j -= (long) i;
            }
            int i2 = (int) j;
            if (skipBytes(i2) != i2) {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        @Override // java.io.InputStream
        public int read() {
            this.f2917e++;
            return this.f2914b.read();
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.f2914b.read(bArr, i, i2);
            this.f2917e += i3;
            return i3;
        }

        @Override // java.io.DataInput
        public boolean readBoolean() {
            this.f2917e++;
            return this.f2914b.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() throws EOFException {
            int i = this.f2917e + 1;
            this.f2917e = i;
            if (i > this.f2916d) {
                throw new EOFException();
            }
            int i2 = this.f2914b.read();
            if (i2 >= 0) {
                return (byte) i2;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() {
            this.f2917e += 2;
            return this.f2914b.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            int length = this.f2917e + bArr.length;
            this.f2917e = length;
            if (length > this.f2916d) {
                throw new EOFException();
            }
            if (this.f2914b.read(bArr, 0, bArr.length) != bArr.length) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.f2917e + i2;
            this.f2917e = i3;
            if (i3 > this.f2916d) {
                throw new EOFException();
            }
            if (this.f2914b.read(bArr, i, i2) != i2) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            int i = this.f2917e + 4;
            this.f2917e = i;
            if (i > this.f2916d) {
                throw new EOFException();
            }
            int i2 = this.f2914b.read();
            int i3 = this.f2914b.read();
            int i4 = this.f2914b.read();
            int i5 = this.f2914b.read();
            if ((i2 | i3 | i4 | i5) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f2915c;
            if (byteOrder == f2912f) {
                return (i5 << 24) + (i4 << 16) + (i3 << 8) + i2;
            }
            if (byteOrder == f2913g) {
                return (i2 << 24) + (i3 << 16) + (i4 << 8) + i5;
            }
            StringBuilder sbM2191e = a.m2191e("Invalid byte order: ");
            sbM2191e.append(this.f2915c);
            throw new IOException(sbM2191e.toString());
        }

        @Override // java.io.DataInput
        public String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            int i = this.f2917e + 8;
            this.f2917e = i;
            if (i > this.f2916d) {
                throw new EOFException();
            }
            int i2 = this.f2914b.read();
            int i3 = this.f2914b.read();
            int i4 = this.f2914b.read();
            int i5 = this.f2914b.read();
            int i6 = this.f2914b.read();
            int i7 = this.f2914b.read();
            int i8 = this.f2914b.read();
            int i9 = this.f2914b.read();
            if ((i2 | i3 | i4 | i5 | i6 | i7 | i8 | i9) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f2915c;
            if (byteOrder == f2912f) {
                return (((long) i9) << 56) + (((long) i8) << 48) + (((long) i7) << 40) + (((long) i6) << 32) + (((long) i5) << 24) + (((long) i4) << 16) + (((long) i3) << 8) + ((long) i2);
            }
            if (byteOrder == f2913g) {
                return (((long) i2) << 56) + (((long) i3) << 48) + (((long) i4) << 40) + (((long) i5) << 32) + (((long) i6) << 24) + (((long) i7) << 16) + (((long) i8) << 8) + ((long) i9);
            }
            StringBuilder sbM2191e = a.m2191e("Invalid byte order: ");
            sbM2191e.append(this.f2915c);
            throw new IOException(sbM2191e.toString());
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            int i = this.f2917e + 2;
            this.f2917e = i;
            if (i > this.f2916d) {
                throw new EOFException();
            }
            int i2 = this.f2914b.read();
            int i3 = this.f2914b.read();
            if ((i2 | i3) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f2915c;
            if (byteOrder == f2912f) {
                return (short) ((i3 << 8) + i2);
            }
            if (byteOrder == f2913g) {
                return (short) ((i2 << 8) + i3);
            }
            StringBuilder sbM2191e = a.m2191e("Invalid byte order: ");
            sbM2191e.append(this.f2915c);
            throw new IOException(sbM2191e.toString());
        }

        @Override // java.io.DataInput
        public String readUTF() {
            this.f2917e += 2;
            return this.f2914b.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() {
            this.f2917e++;
            return this.f2914b.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            int i = this.f2917e + 2;
            this.f2917e = i;
            if (i > this.f2916d) {
                throw new EOFException();
            }
            int i2 = this.f2914b.read();
            int i3 = this.f2914b.read();
            if ((i2 | i3) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f2915c;
            if (byteOrder == f2912f) {
                return (i3 << 8) + i2;
            }
            if (byteOrder == f2913g) {
                return (i2 << 8) + i3;
            }
            StringBuilder sbM2191e = a.m2191e("Invalid byte order: ");
            sbM2191e.append(this.f2915c);
            throw new IOException(sbM2191e.toString());
        }

        @Override // java.io.DataInput
        public int skipBytes(int i) {
            int iMin = Math.min(i, this.f2916d - this.f2917e);
            int iSkipBytes = 0;
            while (iSkipBytes < iMin) {
                iSkipBytes += this.f2914b.skipBytes(iMin - iSkipBytes);
            }
            this.f2917e += iSkipBytes;
            return iSkipBytes;
        }
    }

    /* JADX INFO: renamed from: b.l.a.a$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public final int f2918a;

        /* JADX INFO: renamed from: b */
        public final int f2919b;

        /* JADX INFO: renamed from: c */
        public final byte[] f2920c;

        public c(int i, int i2, long j, byte[] bArr) {
            this.f2918a = i;
            this.f2919b = i2;
            this.f2920c = bArr;
        }

        public c(int i, int i2, byte[] bArr) {
            this.f2918a = i;
            this.f2919b = i2;
            this.f2920c = bArr;
        }

        /* JADX INFO: renamed from: a */
        public static c m1703a(String str) {
            byte[] bytes = (str + (char) 0).getBytes(C0449a.f2881a0);
            return new c(2, bytes.length, bytes);
        }

        /* JADX INFO: renamed from: b */
        public static c m1704b(long j, ByteOrder byteOrder) {
            long[] jArr = {j};
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C0449a.f2863I[4] * 1]);
            byteBufferWrap.order(byteOrder);
            for (int i = 0; i < 1; i++) {
                byteBufferWrap.putInt((int) jArr[i]);
            }
            return new c(4, 1, byteBufferWrap.array());
        }

        /* JADX INFO: renamed from: c */
        public static c m1705c(e eVar, ByteOrder byteOrder) {
            e[] eVarArr = {eVar};
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C0449a.f2863I[5] * 1]);
            byteBufferWrap.order(byteOrder);
            for (int i = 0; i < 1; i++) {
                e eVar2 = eVarArr[i];
                byteBufferWrap.putInt((int) eVar2.f2925a);
                byteBufferWrap.putInt((int) eVar2.f2926b);
            }
            return new c(5, 1, byteBufferWrap.array());
        }

        /* JADX INFO: renamed from: d */
        public static c m1706d(int i, ByteOrder byteOrder) {
            int[] iArr = {i};
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C0449a.f2863I[3] * 1]);
            byteBufferWrap.order(byteOrder);
            for (int i2 = 0; i2 < 1; i2++) {
                byteBufferWrap.putShort((short) iArr[i2]);
            }
            return new c(3, 1, byteBufferWrap.array());
        }

        /* JADX INFO: renamed from: e */
        public double m1707e(ByteOrder byteOrder) throws Throwable {
            Object objM1710h = m1710h(byteOrder);
            if (objM1710h == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (objM1710h instanceof String) {
                return Double.parseDouble((String) objM1710h);
            }
            if (objM1710h instanceof long[]) {
                long[] jArr = (long[]) objM1710h;
                if (jArr.length == 1) {
                    return jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objM1710h instanceof int[]) {
                int[] iArr = (int[]) objM1710h;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objM1710h instanceof double[]) {
                double[] dArr = (double[]) objM1710h;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objM1710h instanceof e[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            e[] eVarArr = (e[]) objM1710h;
            if (eVarArr.length != 1) {
                throw new NumberFormatException("There are more than one component");
            }
            e eVar = eVarArr[0];
            double d = eVar.f2925a;
            double d2 = eVar.f2926b;
            Double.isNaN(d);
            Double.isNaN(d2);
            Double.isNaN(d);
            Double.isNaN(d2);
            return d / d2;
        }

        /* JADX INFO: renamed from: f */
        public int m1708f(ByteOrder byteOrder) throws Throwable {
            Object objM1710h = m1710h(byteOrder);
            if (objM1710h == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (objM1710h instanceof String) {
                return Integer.parseInt((String) objM1710h);
            }
            if (objM1710h instanceof long[]) {
                long[] jArr = (long[]) objM1710h;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objM1710h instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) objM1710h;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        /* JADX INFO: renamed from: g */
        public String m1709g(ByteOrder byteOrder) throws Throwable {
            Object objM1710h = m1710h(byteOrder);
            if (objM1710h == null) {
                return null;
            }
            if (objM1710h instanceof String) {
                return (String) objM1710h;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            if (objM1710h instanceof long[]) {
                long[] jArr = (long[]) objM1710h;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (objM1710h instanceof int[]) {
                int[] iArr = (int[]) objM1710h;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (objM1710h instanceof double[]) {
                double[] dArr = (double[]) objM1710h;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (!(objM1710h instanceof e[])) {
                return null;
            }
            e[] eVarArr = (e[]) objM1710h;
            while (i < eVarArr.length) {
                sb.append(eVarArr[i].f2925a);
                sb.append('/');
                sb.append(eVarArr[i].f2926b);
                i++;
                if (i != eVarArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }

        /* JADX WARN: Code duplicated, block: B:176:0x01a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Not initialized variable reg: 3, insn: 0x019f: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:152:0x019f */
        /* JADX INFO: renamed from: h */
        public Object m1710h(ByteOrder byteOrder) throws Throwable {
            b bVar;
            InputStream inputStream;
            byte b2;
            byte[] bArr;
            InputStream inputStream2 = null;
            try {
                try {
                    bVar = new b(this.f2920c);
                    try {
                        bVar.f2915c = byteOrder;
                        boolean z = true;
                        int length = 0;
                        switch (this.f2918a) {
                            case 1:
                            case 6:
                                byte[] bArr2 = this.f2920c;
                                if (bArr2.length != 1 || bArr2[0] < 0 || bArr2[0] > 1) {
                                    String str = new String(this.f2920c, C0449a.f2881a0);
                                    try {
                                        bVar.close();
                                        break;
                                    } catch (IOException e) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e);
                                    }
                                    return str;
                                }
                                String str2 = new String(new char[]{(char) (this.f2920c[0] + 48)});
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException e2) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e2);
                                }
                                return str2;
                            case RecyclerView.SCROLL_STATE_SETTLING /* 2 */:
                            case 7:
                                if (this.f2919b >= C0449a.f2864J.length) {
                                    int i = 0;
                                    while (true) {
                                        bArr = C0449a.f2864J;
                                        if (i < bArr.length) {
                                            if (this.f2920c[i] != bArr[i]) {
                                                z = false;
                                            } else {
                                                i++;
                                            }
                                        }
                                    }
                                    if (z) {
                                        length = bArr.length;
                                    }
                                }
                                StringBuilder sb = new StringBuilder();
                                while (length < this.f2919b && (b2 = this.f2920c[length]) != 0) {
                                    if (b2 >= 32) {
                                        sb.append((char) b2);
                                    } else {
                                        sb.append('?');
                                    }
                                    length++;
                                }
                                String string = sb.toString();
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException e3) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e3);
                                }
                                return string;
                            case 3:
                                int[] iArr = new int[this.f2919b];
                                while (length < this.f2919b) {
                                    iArr[length] = bVar.readUnsignedShort();
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException e4) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e4);
                                }
                                return iArr;
                            case 4:
                                long[] jArr = new long[this.f2919b];
                                while (length < this.f2919b) {
                                    jArr[length] = bVar.m1701a();
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException e5) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e5);
                                }
                                return jArr;
                            case 5:
                                e[] eVarArr = new e[this.f2919b];
                                while (length < this.f2919b) {
                                    eVarArr[length] = new e(bVar.m1701a(), bVar.m1701a());
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException e6) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e6);
                                }
                                return eVarArr;
                            case 8:
                                int[] iArr2 = new int[this.f2919b];
                                while (length < this.f2919b) {
                                    iArr2[length] = bVar.readShort();
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException e7) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e7);
                                }
                                return iArr2;
                            case 9:
                                int[] iArr3 = new int[this.f2919b];
                                while (length < this.f2919b) {
                                    iArr3[length] = bVar.readInt();
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException e8) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e8);
                                }
                                return iArr3;
                            case 10:
                                e[] eVarArr2 = new e[this.f2919b];
                                while (length < this.f2919b) {
                                    eVarArr2[length] = new e(bVar.readInt(), bVar.readInt());
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException e9) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e9);
                                }
                                return eVarArr2;
                            case 11:
                                double[] dArr = new double[this.f2919b];
                                while (length < this.f2919b) {
                                    dArr[length] = bVar.readFloat();
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException e10) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e10);
                                }
                                return dArr;
                            case 12:
                                double[] dArr2 = new double[this.f2919b];
                                while (length < this.f2919b) {
                                    dArr2[length] = bVar.readDouble();
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException e11) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e11);
                                }
                                return dArr2;
                            default:
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException e12) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e12);
                                }
                                return null;
                        }
                    } catch (IOException e13) {
                        e = e13;
                        Log.w("ExifInterface", "IOException occurred during reading a value", e);
                        if (bVar != null) {
                            try {
                                bVar.close();
                            } catch (IOException e14) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e14);
                            }
                        }
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    inputStream2 = inputStream;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException e15) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e15);
                        }
                    }
                    throw th;
                }
            } catch (IOException e16) {
                e = e16;
                bVar = null;
            } catch (Throwable th2) {
                th = th2;
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                throw th;
            }
        }

        public String toString() {
            StringBuilder sbM2191e = a.m2191e("(");
            sbM2191e.append(C0449a.f2862H[this.f2918a]);
            sbM2191e.append(", data length:");
            sbM2191e.append(this.f2920c.length);
            sbM2191e.append(")");
            return sbM2191e.toString();
        }
    }

    /* JADX INFO: renamed from: b.l.a.a$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        public final int f2921a;

        /* JADX INFO: renamed from: b */
        public final String f2922b;

        /* JADX INFO: renamed from: c */
        public final int f2923c;

        /* JADX INFO: renamed from: d */
        public final int f2924d;

        public d(String str, int i, int i2) {
            this.f2922b = str;
            this.f2921a = i;
            this.f2923c = i2;
            this.f2924d = -1;
        }

        public d(String str, int i, int i2, int i3) {
            this.f2922b = str;
            this.f2921a = i;
            this.f2923c = i2;
            this.f2924d = i3;
        }
    }

    /* JADX INFO: renamed from: b.l.a.a$e */
    public static class e {

        /* JADX INFO: renamed from: a */
        public final long f2925a;

        /* JADX INFO: renamed from: b */
        public final long f2926b;

        public e(long j, long j2) {
            if (j2 == 0) {
                this.f2925a = 0L;
                this.f2926b = 1L;
            } else {
                this.f2925a = j;
                this.f2926b = j2;
            }
        }

        public String toString() {
            return this.f2925a + "/" + this.f2926b;
        }
    }

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        f2885r = new int[]{8, 8, 8};
        f2886s = new int[]{8};
        f2887t = new byte[]{-1, -40, -1};
        f2888u = new byte[]{102, 116, 121, 112};
        f2889v = new byte[]{109, 105, 102, 49};
        f2890w = new byte[]{104, 101, 105, 99};
        f2891x = new byte[]{79, 76, 89, 77, 80, 0};
        f2892y = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        f2893z = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        f2855A = new byte[]{101, 88, 73, 102};
        f2856B = new byte[]{73, 72, 68, 82};
        f2857C = new byte[]{73, 69, 78, 68};
        f2858D = new byte[]{82, 73, 70, 70};
        f2859E = new byte[]{87, 69, 66, 80};
        f2860F = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        "XMP ".getBytes(Charset.defaultCharset());
        f2862H = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f2863I = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f2864J = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        d[] dVarArr = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ImageWidth", 256, 3, 4), new d("ImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1)};
        f2865K = dVarArr;
        d[] dVarArr2 = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d("PixelXDimension", 40962, 3, 4), new d("PixelYDimension", 40963, 3, 4), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        f2866L = dVarArr2;
        d[] dVarArr3 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d("GPSLatitude", 2, 5), new d("GPSLongitudeRef", 3, 2), new d("GPSLongitude", 4, 5), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)};
        f2867M = dVarArr3;
        d[] dVarArr4 = {new d("InteroperabilityIndex", 1, 2)};
        f2868N = dVarArr4;
        d[] dVarArr5 = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ThumbnailImageWidth", 256, 3, 4), new d("ThumbnailImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        f2869O = dVarArr5;
        f2870P = new d("StripOffsets", 273, 3);
        d[] dVarArr6 = {new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)};
        f2871Q = dVarArr6;
        d[] dVarArr7 = {new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)};
        f2872R = dVarArr7;
        d[] dVarArr8 = {new d("AspectFrame", 4371, 3)};
        f2873S = dVarArr8;
        d[] dVarArr9 = {new d("ColorSpace", 55, 3)};
        f2874T = dVarArr9;
        d[][] dVarArr10 = {dVarArr, dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr, dVarArr6, dVarArr7, dVarArr8, dVarArr9};
        f2875U = dVarArr10;
        f2876V = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
        f2877W = new HashMap[dVarArr10.length];
        f2878X = new HashMap[dVarArr10.length];
        f2879Y = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f2880Z = new HashMap<>();
        Charset charsetForName = Charset.forName("US-ASCII");
        f2881a0 = charsetForName;
        f2882b0 = "Exif\u0000\u0000".getBytes(charsetForName);
        f2883c0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        f2861G = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            d[][] dVarArr11 = f2875U;
            if (i >= dVarArr11.length) {
                HashMap<Integer, Integer> map = f2880Z;
                d[] dVarArr12 = f2876V;
                map.put(Integer.valueOf(dVarArr12[0].f2921a), 5);
                map.put(Integer.valueOf(dVarArr12[1].f2921a), 1);
                map.put(Integer.valueOf(dVarArr12[2].f2921a), 2);
                map.put(Integer.valueOf(dVarArr12[3].f2921a), 3);
                map.put(Integer.valueOf(dVarArr12[4].f2921a), 7);
                map.put(Integer.valueOf(dVarArr12[5].f2921a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
                return;
            }
            f2877W[i] = new HashMap<>();
            f2878X[i] = new HashMap<>();
            for (d dVar : dVarArr11[i]) {
                f2877W[i].put(Integer.valueOf(dVar.f2921a), dVar);
                f2878X[i].put(dVar.f2922b, dVar);
            }
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0057  */
    public C0449a(InputStream inputStream) throws IOException {
        boolean z;
        d[][] dVarArr = f2875U;
        this.f2898e = new HashMap[dVarArr.length];
        this.f2899f = new HashSet(dVarArr.length);
        this.f2900g = ByteOrder.BIG_ENDIAN;
        Objects.requireNonNull(inputStream, "inputStream cannot be null");
        FileDescriptor fd = null;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.f2895b = (AssetManager.AssetInputStream) inputStream;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            FileDescriptor fd2 = fileInputStream.getFD();
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    Os.lseek(fd2, 0L, OsConstants.SEEK_CUR);
                    z = true;
                } catch (Exception unused) {
                    if (f2884q) {
                        Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                    }
                    z = false;
                }
            } else {
                z = false;
            }
            if (z) {
                this.f2895b = null;
                fd = fileInputStream.getFD();
            } else {
                this.f2895b = null;
            }
        } else {
            this.f2895b = null;
        }
        this.f2894a = fd;
        for (int i = 0; i < f2875U.length; i++) {
            try {
                try {
                    this.f2898e[i] = new HashMap<>();
                } catch (Throwable th) {
                    m1678a();
                    if (f2884q) {
                        m1694s();
                    }
                    throw th;
                }
            } catch (IOException e2) {
                boolean z2 = f2884q;
                if (z2) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e2);
                }
                m1678a();
                if (!z2) {
                    return;
                }
            }
        }
        if (!this.f2897d) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.f2896c = m1683h(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        b bVar = new b(inputStream);
        if (!this.f2897d) {
            switch (this.f2896c) {
                case 0:
                case 1:
                case RecyclerView.SCROLL_STATE_SETTLING /* 2 */:
                case 3:
                case 5:
                case 6:
                case 8:
                case 11:
                    m1687l(bVar);
                    break;
                case 4:
                    m1682g(bVar, 0, 0);
                    break;
                case 7:
                    m1684i(bVar);
                    break;
                case 9:
                    m1686k(bVar);
                    break;
                case 10:
                    m1688m(bVar);
                    break;
                case 12:
                    m1681f(bVar);
                    break;
                case 13:
                    m1685j(bVar);
                    break;
                case 14:
                    m1690o(bVar);
                    break;
            }
        } else {
            m1689n(bVar);
        }
        m1698w(bVar);
        m1678a();
        if (!f2884q) {
            return;
        }
        m1694s();
    }

    /* JADX INFO: renamed from: b */
    public static String m1674b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b2)));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public static long[] m1675c(Object obj) {
        if (!(obj instanceof int[])) {
            if (obj instanceof long[]) {
                return (long[]) obj;
            }
            return null;
        }
        int[] iArr = (int[]) obj;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    /* JADX INFO: renamed from: x */
    public static boolean m1676x(byte[] bArr, byte[] bArr2) {
        if (bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr2.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: A */
    public final void m1677A() throws Throwable {
        m1699y(0, 5);
        m1699y(0, 4);
        m1699y(5, 4);
        c cVar = this.f2898e[1].get("PixelXDimension");
        c cVar2 = this.f2898e[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            this.f2898e[0].put("ImageWidth", cVar);
            this.f2898e[0].put("ImageLength", cVar2);
        }
        if (this.f2898e[4].isEmpty() && m1692q(this.f2898e[5])) {
            HashMap<String, c>[] mapArr = this.f2898e;
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap<>();
        }
        if (m1692q(this.f2898e[4])) {
            return;
        }
        Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
    }

    /* JADX INFO: renamed from: a */
    public final void m1678a() {
        String strM1679d = m1679d("DateTimeOriginal");
        if (strM1679d != null && m1679d("DateTime") == null) {
            this.f2898e[0].put("DateTime", c.m1703a(strM1679d));
        }
        if (m1679d("ImageWidth") == null) {
            this.f2898e[0].put("ImageWidth", c.m1704b(0L, this.f2900g));
        }
        if (m1679d("ImageLength") == null) {
            this.f2898e[0].put("ImageLength", c.m1704b(0L, this.f2900g));
        }
        if (m1679d("Orientation") == null) {
            this.f2898e[0].put("Orientation", c.m1704b(0L, this.f2900g));
        }
        if (m1679d("LightSource") == null) {
            this.f2898e[1].put("LightSource", c.m1704b(0L, this.f2900g));
        }
    }

    /* JADX INFO: renamed from: d */
    public String m1679d(String str) {
        String string;
        c cVarM1680e = m1680e(str);
        if (cVarM1680e != null) {
            if (!f2879Y.contains(str)) {
                return cVarM1680e.m1709g(this.f2900g);
            }
            if (str.equals("GPSTimeStamp")) {
                int i = cVarM1680e.f2918a;
                if (i == 5 || i == 10) {
                    e[] eVarArr = (e[]) cVarM1680e.m1710h(this.f2900g);
                    if (eVarArr != null && eVarArr.length == 3) {
                        return String.format("%02d:%02d:%02d", Integer.valueOf((int) (eVarArr[0].f2925a / eVarArr[0].f2926b)), Integer.valueOf((int) (eVarArr[1].f2925a / eVarArr[1].f2926b)), Integer.valueOf((int) (eVarArr[2].f2925a / eVarArr[2].f2926b)));
                    }
                    StringBuilder sbM2191e = a.m2191e("Invalid GPS Timestamp array. array=");
                    sbM2191e.append(Arrays.toString(eVarArr));
                    string = sbM2191e.toString();
                } else {
                    StringBuilder sbM2191e2 = a.m2191e("GPS Timestamp format is not rational. format=");
                    sbM2191e2.append(cVarM1680e.f2918a);
                    string = sbM2191e2.toString();
                }
                Log.w("ExifInterface", string);
                return null;
            }
            try {
                return Double.toString(cVarM1680e.m1707e(this.f2900g));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final c m1680e(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (f2884q) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < f2875U.length; i++) {
            c cVar = this.f2898e[i].get(str);
            if (cVar != null) {
                return cVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final void m1681f(b bVar) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                mediaMetadataRetriever.setDataSource(new a(this, bVar));
            } else {
                FileDescriptor fileDescriptor = this.f2894a;
                if (fileDescriptor == null) {
                    mediaMetadataRetriever.release();
                    return;
                }
                mediaMetadataRetriever.setDataSource(fileDescriptor);
            }
            String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(33);
            String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(34);
            String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(26);
            String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(17);
            String strExtractMetadata7 = null;
            if ("yes".equals(strExtractMetadata5)) {
                strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(29);
                strExtractMetadata = mediaMetadataRetriever.extractMetadata(30);
                strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(31);
            } else if ("yes".equals(strExtractMetadata6)) {
                strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(18);
                strExtractMetadata = mediaMetadataRetriever.extractMetadata(19);
                strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(24);
            } else {
                strExtractMetadata = null;
                strExtractMetadata2 = null;
            }
            if (strExtractMetadata7 != null) {
                this.f2898e[0].put("ImageWidth", c.m1706d(Integer.parseInt(strExtractMetadata7), this.f2900g));
            }
            if (strExtractMetadata != null) {
                this.f2898e[0].put("ImageLength", c.m1706d(Integer.parseInt(strExtractMetadata), this.f2900g));
            }
            if (strExtractMetadata2 != null) {
                int i = 1;
                int i2 = Integer.parseInt(strExtractMetadata2);
                if (i2 == 90) {
                    i = 6;
                } else if (i2 == 180) {
                    i = 3;
                } else if (i2 == 270) {
                    i = 8;
                }
                this.f2898e[0].put("Orientation", c.m1706d(i, this.f2900g));
            }
            if (strExtractMetadata3 != null && strExtractMetadata4 != null) {
                int i3 = Integer.parseInt(strExtractMetadata3);
                int i4 = Integer.parseInt(strExtractMetadata4);
                if (i4 <= 6) {
                    throw new IOException("Invalid exif length");
                }
                bVar.m1702b(i3);
                byte[] bArr = new byte[6];
                if (bVar.read(bArr) != 6) {
                    throw new IOException("Can't read identifier");
                }
                int i5 = i3 + 6;
                int i6 = i4 - 6;
                if (!Arrays.equals(bArr, f2882b0)) {
                    throw new IOException("Invalid identifier");
                }
                byte[] bArr2 = new byte[i6];
                if (bVar.read(bArr2) != i6) {
                    throw new IOException("Can't read exif");
                }
                this.f2905l = i5;
                m1696u(bArr2, 0);
            }
            if (f2884q) {
                Log.d("ExifInterface", "Heif meta: " + strExtractMetadata7 + "x" + strExtractMetadata + ", rotation " + strExtractMetadata2);
            }
            mediaMetadataRetriever.release();
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b7 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:36:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:57:0x0165  */
    /* JADX WARN: Code duplicated, block: B:59:0x016b A[LOOP:0: B:10:0x003e->B:59:0x016b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0178 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0170 A[SYNTHETIC] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /* JADX INFO: renamed from: g */
    public final void m1682g(p006b.p054l.p055a.C0449a.b r18, int r19, int r20) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p054l.p055a.C0449a.m1682g(b.l.a.a$b, int, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0127  */
    /* JADX WARN: Code duplicated, block: B:106:0x0129  */
    /* JADX WARN: Code duplicated, block: B:121:0x0144 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:123:0x0147  */
    /* JADX WARN: Code duplicated, block: B:126:0x014d  */
    /* JADX WARN: Code duplicated, block: B:129:0x0155 A[LOOP:2: B:124:0x0148->B:129:0x0155, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:132:0x015b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:134:0x015e  */
    /* JADX WARN: Code duplicated, block: B:137:0x0164  */
    /* JADX WARN: Code duplicated, block: B:140:0x016b A[LOOP:3: B:135:0x015f->B:140:0x016b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:144:0x0174  */
    /* JADX WARN: Code duplicated, block: B:147:0x0181 A[LOOP:4: B:142:0x016f->B:147:0x0181, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:150:0x0187 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:152:0x018a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:157:0x0190  */
    /* JADX WARN: Code duplicated, block: B:165:0x0112 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x00d9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x0158 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x0153 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x016e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x017f A[EDGE_INSN: B:182:0x017f->B:146:0x017f BREAK  A[LOOP:3: B:135:0x015f->B:140:0x016b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x017f A[EDGE_INSN: B:183:0x017f->B:146:0x017f BREAK  A[LOOP:3: B:135:0x015f->B:140:0x016b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x0184 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00d6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:80:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:99:0x0110 A[RETURN] */
    /* JADX INFO: renamed from: h */
    public final int m1683h(BufferedInputStream bufferedInputStream) throws Throwable {
        boolean z;
        boolean z2;
        b bVar;
        b bVar2;
        boolean z3;
        b bVar3;
        b bVar4;
        boolean z4;
        b bVar5;
        b bVar6;
        boolean z5;
        int i;
        byte[] bArr;
        boolean z6;
        int i2;
        byte[] bArr2;
        int i3;
        byte[] bArr3;
        boolean z7;
        b bVar7;
        short s;
        bufferedInputStream.mark(5000);
        byte[] bArr4 = new byte[5000];
        bufferedInputStream.read(bArr4);
        bufferedInputStream.reset();
        int i4 = 0;
        while (true) {
            byte[] bArr5 = f2887t;
            if (i4 >= bArr5.length) {
                z = true;
                break;
            }
            if (bArr4[i4] != bArr5[i4]) {
                z = false;
                break;
            }
            i4++;
        }
        if (z) {
            return 4;
        }
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        int i5 = 0;
        while (true) {
            if (i5 >= bytes.length) {
                z2 = true;
                break;
            }
            if (bArr4[i5] != bytes[i5]) {
                z2 = false;
                break;
            }
            i5++;
        }
        if (z2) {
            return 9;
        }
        try {
            bVar2 = new b(bArr4);
            try {
                long j = bVar2.readInt();
                byte[] bArr6 = new byte[4];
                bVar2.read(bArr6);
                if (Arrays.equals(bArr6, f2888u)) {
                    long j2 = 16;
                    if (j == 1) {
                        j = bVar2.readLong();
                        if (j < 16) {
                        }
                    } else {
                        j2 = 8;
                    }
                    long j3 = 5000;
                    if (j > j3) {
                        j = j3;
                    }
                    long j4 = j - j2;
                    if (j4 >= 8) {
                        byte[] bArr7 = new byte[4];
                        long j5 = 0;
                        boolean z8 = false;
                        boolean z9 = false;
                        while (true) {
                            if (j5 < j4 / 4 && bVar2.read(bArr7) == 4) {
                                if (j5 != 1) {
                                    if (Arrays.equals(bArr7, f2889v)) {
                                        z8 = true;
                                    } else if (Arrays.equals(bArr7, f2890w)) {
                                        z9 = true;
                                    }
                                    if (z8 && z9) {
                                        bVar2.close();
                                        z3 = true;
                                    }
                                }
                                j5++;
                            }
                            if (z3) {
                                return 12;
                            }
                            try {
                                bVar4 = new b(bArr4);
                                try {
                                    ByteOrder byteOrderM1695t = m1695t(bVar4);
                                    this.f2900g = byteOrderM1695t;
                                    bVar4.f2915c = byteOrderM1695t;
                                    s = bVar4.readShort();
                                    if (s != 20306 || s == 21330) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    bVar4.close();
                                } catch (Exception unused) {
                                    if (bVar4 != null) {
                                        bVar4.close();
                                    }
                                    z4 = false;
                                } catch (Throwable th) {
                                    th = th;
                                    bVar3 = bVar4;
                                    if (bVar3 != null) {
                                        bVar3.close();
                                    }
                                    throw th;
                                }
                            } catch (Exception unused2) {
                                bVar4 = null;
                            } catch (Throwable th2) {
                                th = th2;
                                bVar3 = null;
                            }
                            if (z4) {
                                return 7;
                            }
                            try {
                                bVar7 = new b(bArr4);
                                try {
                                    ByteOrder byteOrderM1695t2 = m1695t(bVar7);
                                    this.f2900g = byteOrderM1695t2;
                                    bVar7.f2915c = byteOrderM1695t2;
                                    if (bVar7.readShort() == 85) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    bVar7.close();
                                } catch (Exception unused3) {
                                    bVar6 = bVar7;
                                    if (bVar6 != null) {
                                        bVar6.close();
                                    }
                                    z5 = false;
                                } catch (Throwable th3) {
                                    th = th3;
                                    bVar5 = bVar7;
                                    if (bVar5 != null) {
                                        bVar5.close();
                                    }
                                    throw th;
                                }
                            } catch (Exception unused4) {
                                bVar6 = null;
                            } catch (Throwable th4) {
                                th = th4;
                                bVar5 = null;
                            }
                            if (z5) {
                                return 10;
                            }
                            i = 0;
                            while (true) {
                                bArr = f2893z;
                                if (i >= bArr.length) {
                                    z6 = true;
                                    break;
                                }
                                if (bArr4[i] != bArr[i]) {
                                    z6 = false;
                                    break;
                                }
                                i++;
                            }
                            if (z6) {
                                return 13;
                            }
                            i2 = 0;
                            while (true) {
                                bArr2 = f2858D;
                                if (i2 >= bArr2.length) {
                                    i3 = 0;
                                    while (true) {
                                        bArr3 = f2859E;
                                        if (i3 >= bArr3.length) {
                                            z7 = true;
                                        } else {
                                            if (bArr4[f2858D.length + i3 + 4] != bArr3[i3]) {
                                                break;
                                            }
                                            i3++;
                                        }
                                        if (z7) {
                                            return 14;
                                        }
                                        return 0;
                                    }
                                }
                                if (bArr4[i2] != bArr2[i2]) {
                                    break;
                                }
                                i2++;
                            }
                            z7 = false;
                            if (z7) {
                                return 14;
                            }
                            return 0;
                        }
                    }
                }
            } catch (Exception e2) {
                e = e2;
                try {
                    if (f2884q) {
                        Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                    }
                    if (bVar2 != null) {
                    }
                    z3 = false;
                    if (z3) {
                        return 12;
                    }
                    bVar4 = new b(bArr4);
                    ByteOrder byteOrderM1695t3 = m1695t(bVar4);
                    this.f2900g = byteOrderM1695t3;
                    bVar4.f2915c = byteOrderM1695t3;
                    s = bVar4.readShort();
                    if (s != 20306) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    bVar4.close();
                    if (z4) {
                        return 7;
                    }
                    bVar7 = new b(bArr4);
                    ByteOrder byteOrderM1695t4 = m1695t(bVar7);
                    this.f2900g = byteOrderM1695t4;
                    bVar7.f2915c = byteOrderM1695t4;
                    if (bVar7.readShort() == 85) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    bVar7.close();
                    if (z5) {
                        return 10;
                    }
                    i = 0;
                    while (true) {
                        bArr = f2893z;
                        if (i >= bArr.length) {
                            z6 = true;
                            break;
                        }
                        if (bArr4[i] != bArr[i]) {
                            z6 = false;
                            break;
                        }
                        i++;
                    }
                    if (z6) {
                        return 13;
                    }
                    i2 = 0;
                    while (true) {
                        bArr2 = f2858D;
                        if (i2 >= bArr2.length) {
                            i3 = 0;
                            while (true) {
                                bArr3 = f2859E;
                                if (i3 >= bArr3.length) {
                                    z7 = true;
                                } else {
                                    if (bArr4[f2858D.length + i3 + 4] != bArr3[i3]) {
                                        break;
                                        break;
                                    }
                                    i3++;
                                }
                                if (z7) {
                                    return 14;
                                }
                                return 0;
                            }
                        }
                        if (bArr4[i2] != bArr2[i2]) {
                            break;
                            break;
                        }
                        i2++;
                    }
                    z7 = false;
                    if (z7) {
                        return 14;
                    }
                    return 0;
                } catch (Throwable th5) {
                    th = th5;
                    bVar = bVar2;
                    bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.close();
                    }
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                if (bVar2 != null) {
                    bVar2.close();
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            bVar2 = null;
        } catch (Throwable th7) {
            th = th7;
            bVar = null;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            throw th;
        }
        bVar2.close();
        z3 = false;
        if (z3) {
            return 12;
        }
        bVar4 = new b(bArr4);
        ByteOrder byteOrderM1695t5 = m1695t(bVar4);
        this.f2900g = byteOrderM1695t5;
        bVar4.f2915c = byteOrderM1695t5;
        s = bVar4.readShort();
        if (s != 20306) {
            z4 = true;
        } else {
            z4 = true;
        }
        bVar4.close();
        if (z4) {
            return 7;
        }
        bVar7 = new b(bArr4);
        ByteOrder byteOrderM1695t6 = m1695t(bVar7);
        this.f2900g = byteOrderM1695t6;
        bVar7.f2915c = byteOrderM1695t6;
        if (bVar7.readShort() == 85) {
            z5 = true;
        } else {
            z5 = false;
        }
        bVar7.close();
        if (z5) {
            return 10;
        }
        i = 0;
        while (true) {
            bArr = f2893z;
            if (i >= bArr.length) {
                z6 = true;
                break;
            }
            if (bArr4[i] != bArr[i]) {
                z6 = false;
                break;
            }
            i++;
        }
        if (z6) {
            return 13;
        }
        i2 = 0;
        while (true) {
            bArr2 = f2858D;
            if (i2 >= bArr2.length) {
                i3 = 0;
                while (true) {
                    bArr3 = f2859E;
                    if (i3 >= bArr3.length) {
                        z7 = true;
                    } else {
                        if (bArr4[f2858D.length + i3 + 4] != bArr3[i3]) {
                            break;
                            break;
                        }
                        i3++;
                    }
                    if (z7) {
                        return 14;
                    }
                    return 0;
                }
            }
            if (bArr4[i2] != bArr2[i2]) {
                break;
                break;
            }
            i2++;
        }
        z7 = false;
        if (z7) {
            return 14;
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x008a  */
    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: i */
    public final void m1684i(b bVar) throws Throwable {
        c cVar;
        c cVar2;
        c cVar3;
        int[] iArr;
        long j;
        m1687l(bVar);
        c cVar4 = this.f2898e[1].get("MakerNote");
        if (cVar4 != null) {
            b bVar2 = new b(cVar4.f2920c);
            bVar2.f2915c = this.f2900g;
            byte[] bArr = f2891x;
            byte[] bArr2 = new byte[bArr.length];
            bVar2.readFully(bArr2);
            bVar2.m1702b(0L);
            byte[] bArr3 = f2892y;
            byte[] bArr4 = new byte[bArr3.length];
            bVar2.readFully(bArr4);
            if (!Arrays.equals(bArr2, bArr)) {
                j = Arrays.equals(bArr4, bArr3) ? 12L : 8L;
                m1697v(bVar2, 6);
                cVar = this.f2898e[7].get("PreviewImageStart");
                cVar2 = this.f2898e[7].get("PreviewImageLength");
                if (cVar != null && cVar2 != null) {
                    this.f2898e[5].put("JPEGInterchangeFormat", cVar);
                    this.f2898e[5].put("JPEGInterchangeFormatLength", cVar2);
                }
                cVar3 = this.f2898e[8].get("AspectFrame");
                if (cVar3 != null) {
                    iArr = (int[]) cVar3.m1710h(this.f2900g);
                    if (iArr != null || iArr.length != 4) {
                        StringBuilder sbM2191e = a.m2191e("Invalid aspect frame values. frame=");
                        sbM2191e.append(Arrays.toString(iArr));
                        Log.w("ExifInterface", sbM2191e.toString());
                    } else {
                        if (iArr[2] <= iArr[0] || iArr[3] <= iArr[1]) {
                            return;
                        }
                        int i = (iArr[2] - iArr[0]) + 1;
                        int i2 = (iArr[3] - iArr[1]) + 1;
                        if (i < i2) {
                            int i3 = i + i2;
                            i2 = i3 - i2;
                            i = i3 - i2;
                        }
                        c cVarM1706d = c.m1706d(i, this.f2900g);
                        c cVarM1706d2 = c.m1706d(i2, this.f2900g);
                        this.f2898e[0].put("ImageWidth", cVarM1706d);
                        this.f2898e[0].put("ImageLength", cVarM1706d2);
                        return;
                    }
                }
            }
            bVar2.m1702b(j);
            m1697v(bVar2, 6);
            cVar = this.f2898e[7].get("PreviewImageStart");
            cVar2 = this.f2898e[7].get("PreviewImageLength");
            if (cVar != null) {
                this.f2898e[5].put("JPEGInterchangeFormat", cVar);
                this.f2898e[5].put("JPEGInterchangeFormatLength", cVar2);
            }
            cVar3 = this.f2898e[8].get("AspectFrame");
            if (cVar3 != null) {
                iArr = (int[]) cVar3.m1710h(this.f2900g);
                if (iArr != null) {
                }
                StringBuilder sbM2191e2 = a.m2191e("Invalid aspect frame values. frame=");
                sbM2191e2.append(Arrays.toString(iArr));
                Log.w("ExifInterface", sbM2191e2.toString());
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m1685j(b bVar) throws Throwable {
        if (f2884q) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.f2915c = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f2893z;
        bVar.skipBytes(bArr.length);
        int length = bArr.length + 0;
        while (true) {
            try {
                int i = bVar.readInt();
                int i2 = length + 4;
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i3 = i2 + 4;
                if (i3 == 16 && !Arrays.equals(bArr2, f2856B)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f2857C)) {
                    return;
                }
                if (Arrays.equals(bArr2, f2855A)) {
                    byte[] bArr3 = new byte[i];
                    if (bVar.read(bArr3) != i) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + m1674b(bArr2));
                    }
                    int i4 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i4) {
                        this.f2905l = i3;
                        m1696u(bArr3, 0);
                        m1677A();
                        return;
                    } else {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i4 + ", calculated CRC value: " + crc32.getValue());
                    }
                }
                int i5 = i + 4;
                bVar.skipBytes(i5);
                length = i3 + i5;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m1686k(b bVar) throws IOException {
        bVar.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        bVar.read(bArr);
        bVar.skipBytes(4);
        bVar.read(bArr2);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        m1682g(bVar, i, 5);
        bVar.m1702b(i2);
        bVar.f2915c = ByteOrder.BIG_ENDIAN;
        int i3 = bVar.readInt();
        if (f2884q) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i3);
        }
        for (int i4 = 0; i4 < i3; i4++) {
            int unsignedShort = bVar.readUnsignedShort();
            int unsignedShort2 = bVar.readUnsignedShort();
            if (unsignedShort == f2870P.f2921a) {
                short s = bVar.readShort();
                short s2 = bVar.readShort();
                c cVarM1706d = c.m1706d(s, this.f2900g);
                c cVarM1706d2 = c.m1706d(s2, this.f2900g);
                this.f2898e[0].put("ImageLength", cVarM1706d);
                this.f2898e[0].put("ImageWidth", cVarM1706d2);
                if (f2884q) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s) + ", width: " + ((int) s2));
                    return;
                }
                return;
            }
            bVar.skipBytes(unsignedShort2);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m1687l(b bVar) throws Throwable {
        c cVar;
        m1693r(bVar, bVar.available());
        m1697v(bVar, 0);
        m1700z(bVar, 0);
        m1700z(bVar, 5);
        m1700z(bVar, 4);
        m1677A();
        if (this.f2896c != 8 || (cVar = this.f2898e[1].get("MakerNote")) == null) {
            return;
        }
        b bVar2 = new b(cVar.f2920c);
        bVar2.f2915c = this.f2900g;
        bVar2.m1702b(6L);
        m1697v(bVar2, 9);
        c cVar2 = this.f2898e[9].get("ColorSpace");
        if (cVar2 != null) {
            this.f2898e[1].put("ColorSpace", cVar2);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m1688m(b bVar) throws Throwable {
        m1687l(bVar);
        if (this.f2898e[0].get("JpgFromRaw") != null) {
            m1682g(bVar, this.f2909p, 5);
        }
        c cVar = this.f2898e[0].get("ISO");
        c cVar2 = this.f2898e[1].get("PhotographicSensitivity");
        if (cVar == null || cVar2 != null) {
            return;
        }
        this.f2898e[1].put("PhotographicSensitivity", cVar);
    }

    /* JADX INFO: renamed from: n */
    public final void m1689n(b bVar) throws IOException {
        byte[] bArr = f2882b0;
        bVar.skipBytes(bArr.length);
        byte[] bArr2 = new byte[bVar.available()];
        bVar.readFully(bArr2);
        this.f2905l = bArr.length;
        m1696u(bArr2, 0);
    }

    /* JADX INFO: renamed from: o */
    public final void m1690o(b bVar) throws IOException {
        if (f2884q) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.f2915c = ByteOrder.LITTLE_ENDIAN;
        bVar.skipBytes(f2858D.length);
        int i = bVar.readInt() + 8;
        int iSkipBytes = bVar.skipBytes(f2859E.length) + 8;
        while (true) {
            try {
                byte[] bArr = new byte[4];
                if (bVar.read(bArr) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i2 = bVar.readInt();
                int i3 = iSkipBytes + 4 + 4;
                if (Arrays.equals(f2860F, bArr)) {
                    byte[] bArr2 = new byte[i2];
                    if (bVar.read(bArr2) == i2) {
                        this.f2905l = i3;
                        m1696u(bArr2, 0);
                        this.f2905l = i3;
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + m1674b(bArr));
                    }
                }
                if (i2 % 2 == 1) {
                    i2++;
                }
                int i4 = i3 + i2;
                if (i4 == i) {
                    return;
                }
                if (i4 > i) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                int iSkipBytes2 = bVar.skipBytes(i2);
                if (iSkipBytes2 != i2) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                iSkipBytes = i3 + iSkipBytes2;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m1691p(b bVar, HashMap map) throws Throwable {
        c cVar = (c) map.get("JPEGInterchangeFormat");
        c cVar2 = (c) map.get("JPEGInterchangeFormatLength");
        if (cVar == null || cVar2 == null) {
            return;
        }
        int iM1708f = cVar.m1708f(this.f2900g);
        int iM1708f2 = cVar2.m1708f(this.f2900g);
        if (this.f2896c == 7) {
            iM1708f += this.f2906m;
        }
        int iMin = Math.min(iM1708f2, bVar.f2916d - iM1708f);
        if (iM1708f > 0 && iMin > 0) {
            int i = this.f2905l + iM1708f;
            this.f2902i = i;
            this.f2903j = iMin;
            if (this.f2895b == null && this.f2894a == null) {
                bVar.m1702b(i);
                bVar.readFully(new byte[iMin]);
            }
        }
        if (f2884q) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iM1708f + ", length: " + iMin);
        }
    }

    /* JADX INFO: renamed from: q */
    public final boolean m1692q(HashMap map) {
        c cVar = (c) map.get("ImageLength");
        c cVar2 = (c) map.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        return cVar.m1708f(this.f2900g) <= 512 && cVar2.m1708f(this.f2900g) <= 512;
    }

    /* JADX INFO: renamed from: r */
    public final void m1693r(b bVar, int i) throws IOException {
        ByteOrder byteOrderM1695t = m1695t(bVar);
        this.f2900g = byteOrderM1695t;
        bVar.f2915c = byteOrderM1695t;
        int unsignedShort = bVar.readUnsignedShort();
        int i2 = this.f2896c;
        if (i2 != 7 && i2 != 10 && unsignedShort != 42) {
            StringBuilder sbM2191e = a.m2191e("Invalid start code: ");
            sbM2191e.append(Integer.toHexString(unsignedShort));
            throw new IOException(sbM2191e.toString());
        }
        int i3 = bVar.readInt();
        if (i3 < 8 || i3 >= i) {
            throw new IOException(a.m2198l("Invalid first Ifd offset: ", i3));
        }
        int i4 = i3 - 8;
        if (i4 > 0 && bVar.skipBytes(i4) != i4) {
            throw new IOException(a.m2198l("Couldn't jump to first Ifd: ", i4));
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m1694s() {
        for (int i = 0; i < this.f2898e.length; i++) {
            Log.d("ExifInterface", "The size of tag group[" + i + "]: " + this.f2898e[i].size());
            for (Map.Entry<String, c> entry : this.f2898e[i].entrySet()) {
                c value = entry.getValue();
                StringBuilder sbM2191e = a.m2191e("tagName: ");
                sbM2191e.append(entry.getKey());
                sbM2191e.append(", tagType: ");
                sbM2191e.append(value.toString());
                sbM2191e.append(", tagValue: '");
                sbM2191e.append(value.m1709g(this.f2900g));
                sbM2191e.append("'");
                Log.d("ExifInterface", sbM2191e.toString());
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final ByteOrder m1695t(b bVar) throws IOException {
        short s = bVar.readShort();
        if (s == 18761) {
            if (f2884q) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s == 19789) {
            if (f2884q) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        StringBuilder sbM2191e = a.m2191e("Invalid byte order: ");
        sbM2191e.append(Integer.toHexString(s));
        throw new IOException(sbM2191e.toString());
    }

    /* JADX INFO: renamed from: u */
    public final void m1696u(byte[] bArr, int i) throws IOException {
        b bVar = new b(bArr);
        m1693r(bVar, bArr.length);
        m1697v(bVar, i);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0203  */
    /* JADX WARN: Code duplicated, block: B:106:0x021d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0223 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x0225  */
    /* JADX WARN: Code duplicated, block: B:110:0x023d  */
    /* JADX WARN: Code duplicated, block: B:113:0x0251  */
    /* JADX WARN: Code duplicated, block: B:115:0x026f  */
    /* JADX WARN: Code duplicated, block: B:117:0x0276  */
    /* JADX WARN: Code duplicated, block: B:119:0x0279  */
    /* JADX WARN: Code duplicated, block: B:121:0x027d  */
    /* JADX WARN: Code duplicated, block: B:123:0x0281  */
    /* JADX WARN: Code duplicated, block: B:127:0x028b  */
    /* JADX WARN: Code duplicated, block: B:128:0x0290  */
    /* JADX WARN: Code duplicated, block: B:129:0x0295  */
    /* JADX WARN: Code duplicated, block: B:133:0x029d  */
    /* JADX WARN: Code duplicated, block: B:136:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:143:0x02fc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:144:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:147:0x0315  */
    /* JADX WARN: Code duplicated, block: B:149:0x0345  */
    /* JADX WARN: Code duplicated, block: B:152:0x0352  */
    /* JADX WARN: Code duplicated, block: B:154:0x035c  */
    /* JADX WARN: Code duplicated, block: B:191:0x038b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x00fc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:64:0x011f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0122  */
    /* JADX WARN: Code duplicated, block: B:73:0x013b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x013d  */
    /* JADX WARN: Code duplicated, block: B:81:0x0172 A[PHI: r10
      0x0172: PHI (r10v11 long) = (r10v3 long), (r10v6 long) binds: [B:80:0x0170, B:109:0x0239] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:82:0x0177  */
    /* JADX WARN: Code duplicated, block: B:84:0x017f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0185  */
    /* JADX WARN: Code duplicated, block: B:87:0x019c  */
    /* JADX WARN: Code duplicated, block: B:90:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:92:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:93:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:95:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:99:0x01fc  */
    /* JADX WARN: Instruction removed from duplicated block: B:108:0x0225, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:113:0x0251, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:144:0x02fe, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:74:0x013d, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:86:0x0185, please report this as an issue */
    /* JADX INFO: renamed from: v */
    public final void m1697v(b bVar, int i) throws IOException {
        StringBuilder sb;
        String str;
        short s;
        short s2;
        boolean z;
        long j;
        boolean z2;
        int i2;
        int i3;
        Integer num;
        long j2;
        long jM1701a;
        int i4;
        int unsignedShort;
        String str2;
        int i5;
        int i6;
        long j3;
        int i7;
        long j4;
        this.f2899f.add(Integer.valueOf(bVar.f2917e));
        if (bVar.f2917e + 2 > bVar.f2916d) {
            return;
        }
        short s3 = bVar.readShort();
        if (f2884q) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) s3));
        }
        if ((s3 * 12) + bVar.f2917e > bVar.f2916d || s3 <= 0) {
            return;
        }
        char c2 = 0;
        short s4 = 0;
        while (s4 < s3) {
            int unsignedShort2 = bVar.readUnsignedShort();
            int unsignedShort3 = bVar.readUnsignedShort();
            int i8 = bVar.readInt();
            long j5 = ((long) bVar.f2917e) + 4;
            d dVar = f2877W[i].get(Integer.valueOf(unsignedShort2));
            boolean z3 = f2884q;
            if (z3) {
                Object[] objArr = new Object[5];
                objArr[c2] = Integer.valueOf(i);
                objArr[1] = Integer.valueOf(unsignedShort2);
                objArr[2] = dVar != null ? dVar.f2922b : null;
                objArr[3] = Integer.valueOf(unsignedShort3);
                objArr[4] = Integer.valueOf(i8);
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", objArr));
            }
            if (dVar == null) {
                if (z3) {
                    Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + unsignedShort2);
                }
                s = s3;
            } else {
                if (unsignedShort3 > 0) {
                    int[] iArr = f2863I;
                    if (unsignedShort3 < iArr.length) {
                        int i9 = dVar.f2923c;
                        if (i9 == 7 || unsignedShort3 == 7 || i9 == unsignedShort3 || (i2 = dVar.f2924d) == unsignedShort3) {
                            s = s3;
                        } else {
                            s = s3;
                            if (((i9 != 4 && i2 != 4) || unsignedShort3 != 3) && (((i9 != 9 && i2 != 9) || unsignedShort3 != 8) && ((i9 != 12 && i2 != 12) || unsignedShort3 != 11))) {
                                z = false;
                            }
                            if (!z) {
                                if (unsignedShort3 == 7) {
                                    unsignedShort3 = i9;
                                }
                                s2 = s4;
                                j = ((long) i8) * ((long) iArr[unsignedShort3]);
                                if (j >= 0 || j > 2147483647L) {
                                    if (z3) {
                                        Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + i8);
                                    }
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                            } else if (z3) {
                                StringBuilder sbM2191e = a.m2191e("Skip the tag entry since data format (");
                                sbM2191e.append(f2862H[unsignedShort3]);
                                sbM2191e.append(") is unexpected for tag: ");
                                sbM2191e.append(dVar.f2922b);
                                Log.d("ExifInterface", sbM2191e.toString());
                            }
                        }
                        z = true;
                        if (!z) {
                            if (unsignedShort3 == 7) {
                                unsignedShort3 = i9;
                            }
                            s2 = s4;
                            j = ((long) i8) * ((long) iArr[unsignedShort3]);
                            if (j >= 0) {
                                if (z3) {
                                    Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + i8);
                                }
                                z2 = false;
                            } else {
                                if (z3) {
                                    Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + i8);
                                }
                                z2 = false;
                            }
                        } else if (z3) {
                            StringBuilder sbM2191e2 = a.m2191e("Skip the tag entry since data format (");
                            sbM2191e2.append(f2862H[unsignedShort3]);
                            sbM2191e2.append(") is unexpected for tag: ");
                            sbM2191e2.append(dVar.f2922b);
                            Log.d("ExifInterface", sbM2191e2.toString());
                        }
                    }
                    if (z2) {
                        if (j > 4) {
                            i5 = bVar.readInt();
                            if (z3) {
                                Log.d("ExifInterface", "seek to data offset: " + i5);
                            }
                            i6 = this.f2896c;
                            if (i6 == 7) {
                                if ("MakerNote".equals(dVar.f2922b)) {
                                    this.f2906m = i5;
                                } else if (i != 6 && "ThumbnailImage".equals(dVar.f2922b)) {
                                    this.f2907n = i5;
                                    this.f2908o = i8;
                                    c cVarM1706d = c.m1706d(6, this.f2900g);
                                    j3 = j5;
                                    c cVarM1704b = c.m1704b(this.f2907n, this.f2900g);
                                    i7 = i8;
                                    c cVarM1704b2 = c.m1704b(this.f2908o, this.f2900g);
                                    this.f2898e[4].put("Compression", cVarM1706d);
                                    this.f2898e[4].put("JPEGInterchangeFormat", cVarM1704b);
                                    this.f2898e[4].put("JPEGInterchangeFormatLength", cVarM1704b2);
                                }
                                j3 = j5;
                                i7 = i8;
                            } else {
                                j3 = j5;
                                i7 = i8;
                                if (i6 == 10 && "JpgFromRaw".equals(dVar.f2922b)) {
                                    this.f2909p = i5;
                                }
                            }
                            j4 = i5;
                            i3 = i7;
                            if (j4 + j <= bVar.f2916d) {
                                bVar.m1702b(j4);
                                j5 = j3;
                            } else {
                                if (z3) {
                                    Log.d("ExifInterface", "Skip the tag entry since data offset is invalid: " + i5);
                                }
                                j5 = j3;
                                bVar.m1702b(j5);
                            }
                        } else {
                            unsignedShort3 = unsignedShort3;
                            i3 = i8;
                        }
                        num = f2880Z.get(Integer.valueOf(unsignedShort2));
                        if (z3) {
                            Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j);
                        }
                        if (num != null) {
                            jM1701a = -1;
                            i4 = unsignedShort3;
                            if (i4 != 3) {
                                if (i4 == 4) {
                                    jM1701a = bVar.m1701a();
                                } else if (i4 == 8) {
                                    unsignedShort = bVar.readShort();
                                } else if (i4 != 9 || i4 == 13) {
                                    unsignedShort = bVar.readInt();
                                }
                                if (z3) {
                                    Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(jM1701a), dVar.f2922b));
                                }
                                if (jM1701a > 0 || jM1701a >= bVar.f2916d) {
                                    if (z3) {
                                        str2 = "Skip jump into the IFD since its offset is invalid: " + jM1701a;
                                        Log.d("ExifInterface", str2);
                                    }
                                } else if (!this.f2899f.contains(Integer.valueOf((int) jM1701a))) {
                                    bVar.m1702b(jM1701a);
                                    m1697v(bVar, num.intValue());
                                } else if (z3) {
                                    str2 = "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + jM1701a + ")";
                                    Log.d("ExifInterface", str2);
                                }
                                j2 = j5;
                            } else {
                                unsignedShort = bVar.readUnsignedShort();
                            }
                            jM1701a = unsignedShort;
                            if (z3) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(jM1701a), dVar.f2922b));
                            }
                            if (jM1701a > 0) {
                                if (z3) {
                                    str2 = "Skip jump into the IFD since its offset is invalid: " + jM1701a;
                                    Log.d("ExifInterface", str2);
                                }
                            } else if (z3) {
                                str2 = "Skip jump into the IFD since its offset is invalid: " + jM1701a;
                                Log.d("ExifInterface", str2);
                            }
                            j2 = j5;
                        } else {
                            int i10 = bVar.f2917e + this.f2905l;
                            byte[] bArr = new byte[(int) j];
                            bVar.readFully(bArr);
                            j2 = j5;
                            c cVar = new c(unsignedShort3, i3, i10, bArr);
                            this.f2898e[i].put(dVar.f2922b, cVar);
                            if ("DNGVersion".equals(dVar.f2922b)) {
                                this.f2896c = 3;
                            }
                            if (((!"Make".equals(dVar.f2922b) || "Model".equals(dVar.f2922b)) && cVar.m1709g(this.f2900g).contains("PENTAX")) || ("Compression".equals(dVar.f2922b) && cVar.m1708f(this.f2900g) == 65535)) {
                                this.f2896c = 8;
                            }
                            if (bVar.f2917e != j2) {
                            }
                        }
                        bVar.m1702b(j2);
                    } else {
                        bVar.m1702b(j5);
                    }
                    s4 = (short) (s2 + 1);
                    c2 = 0;
                    s3 = s;
                }
                s = s3;
                s2 = s4;
                if (z3) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + unsignedShort3);
                }
                z2 = false;
                j = 0;
                if (z2) {
                    if (j > 4) {
                        i5 = bVar.readInt();
                        if (z3) {
                            Log.d("ExifInterface", "seek to data offset: " + i5);
                        }
                        i6 = this.f2896c;
                        if (i6 == 7) {
                            if ("MakerNote".equals(dVar.f2922b)) {
                                this.f2906m = i5;
                            } else if (i != 6) {
                            }
                            j3 = j5;
                            i7 = i8;
                        } else {
                            j3 = j5;
                            i7 = i8;
                            if (i6 == 10) {
                                this.f2909p = i5;
                            }
                        }
                        j4 = i5;
                        i3 = i7;
                        if (j4 + j <= bVar.f2916d) {
                            bVar.m1702b(j4);
                            j5 = j3;
                        } else {
                            if (z3) {
                                Log.d("ExifInterface", "Skip the tag entry since data offset is invalid: " + i5);
                            }
                            j5 = j3;
                            bVar.m1702b(j5);
                        }
                    } else {
                        unsignedShort3 = unsignedShort3;
                        i3 = i8;
                    }
                    num = f2880Z.get(Integer.valueOf(unsignedShort2));
                    if (z3) {
                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j);
                    }
                    if (num != null) {
                        jM1701a = -1;
                        i4 = unsignedShort3;
                        if (i4 != 3) {
                            if (i4 == 4) {
                                jM1701a = bVar.m1701a();
                            } else if (i4 == 8) {
                                if (i4 != 9) {
                                }
                                unsignedShort = bVar.readInt();
                            } else {
                                unsignedShort = bVar.readShort();
                            }
                            if (z3) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(jM1701a), dVar.f2922b));
                            }
                            if (jM1701a > 0) {
                                if (z3) {
                                    str2 = "Skip jump into the IFD since its offset is invalid: " + jM1701a;
                                    Log.d("ExifInterface", str2);
                                }
                            } else if (z3) {
                                str2 = "Skip jump into the IFD since its offset is invalid: " + jM1701a;
                                Log.d("ExifInterface", str2);
                            }
                            j2 = j5;
                        } else {
                            unsignedShort = bVar.readUnsignedShort();
                        }
                        jM1701a = unsignedShort;
                        if (z3) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(jM1701a), dVar.f2922b));
                        }
                        if (jM1701a > 0) {
                            if (z3) {
                                str2 = "Skip jump into the IFD since its offset is invalid: " + jM1701a;
                                Log.d("ExifInterface", str2);
                            }
                        } else if (z3) {
                            str2 = "Skip jump into the IFD since its offset is invalid: " + jM1701a;
                            Log.d("ExifInterface", str2);
                        }
                        j2 = j5;
                    } else {
                        int i11 = bVar.f2917e + this.f2905l;
                        byte[] bArr2 = new byte[(int) j];
                        bVar.readFully(bArr2);
                        j2 = j5;
                        c cVar2 = new c(unsignedShort3, i3, i11, bArr2);
                        this.f2898e[i].put(dVar.f2922b, cVar2);
                        if ("DNGVersion".equals(dVar.f2922b)) {
                            this.f2896c = 3;
                        }
                        if (!"Make".equals(dVar.f2922b)) {
                        }
                        this.f2896c = 8;
                        if (bVar.f2917e != j2) {
                        }
                    }
                    bVar.m1702b(j2);
                } else {
                    bVar.m1702b(j5);
                }
                s4 = (short) (s2 + 1);
                c2 = 0;
                s3 = s;
            }
            s2 = s4;
            z2 = false;
            j = 0;
            if (z2) {
                if (j > 4) {
                    i5 = bVar.readInt();
                    if (z3) {
                        Log.d("ExifInterface", "seek to data offset: " + i5);
                    }
                    i6 = this.f2896c;
                    if (i6 == 7) {
                        if ("MakerNote".equals(dVar.f2922b)) {
                            this.f2906m = i5;
                        } else if (i != 6) {
                        }
                        j3 = j5;
                        i7 = i8;
                    } else {
                        j3 = j5;
                        i7 = i8;
                        if (i6 == 10) {
                            this.f2909p = i5;
                        }
                    }
                    j4 = i5;
                    i3 = i7;
                    if (j4 + j <= bVar.f2916d) {
                        bVar.m1702b(j4);
                        j5 = j3;
                    } else {
                        if (z3) {
                            Log.d("ExifInterface", "Skip the tag entry since data offset is invalid: " + i5);
                        }
                        j5 = j3;
                        bVar.m1702b(j5);
                    }
                } else {
                    unsignedShort3 = unsignedShort3;
                    i3 = i8;
                }
                num = f2880Z.get(Integer.valueOf(unsignedShort2));
                if (z3) {
                    Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j);
                }
                if (num != null) {
                    jM1701a = -1;
                    i4 = unsignedShort3;
                    if (i4 != 3) {
                        if (i4 == 4) {
                            jM1701a = bVar.m1701a();
                        } else if (i4 == 8) {
                            if (i4 != 9) {
                            }
                            unsignedShort = bVar.readInt();
                        } else {
                            unsignedShort = bVar.readShort();
                        }
                        if (z3) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(jM1701a), dVar.f2922b));
                        }
                        if (jM1701a > 0) {
                            if (z3) {
                                str2 = "Skip jump into the IFD since its offset is invalid: " + jM1701a;
                                Log.d("ExifInterface", str2);
                            }
                        } else if (z3) {
                            str2 = "Skip jump into the IFD since its offset is invalid: " + jM1701a;
                            Log.d("ExifInterface", str2);
                        }
                        j2 = j5;
                    } else {
                        unsignedShort = bVar.readUnsignedShort();
                    }
                    jM1701a = unsignedShort;
                    if (z3) {
                        Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(jM1701a), dVar.f2922b));
                    }
                    if (jM1701a > 0) {
                        if (z3) {
                            str2 = "Skip jump into the IFD since its offset is invalid: " + jM1701a;
                            Log.d("ExifInterface", str2);
                        }
                    } else if (z3) {
                        str2 = "Skip jump into the IFD since its offset is invalid: " + jM1701a;
                        Log.d("ExifInterface", str2);
                    }
                    j2 = j5;
                } else {
                    int i12 = bVar.f2917e + this.f2905l;
                    byte[] bArr3 = new byte[(int) j];
                    bVar.readFully(bArr3);
                    j2 = j5;
                    c cVar3 = new c(unsignedShort3, i3, i12, bArr3);
                    this.f2898e[i].put(dVar.f2922b, cVar3);
                    if ("DNGVersion".equals(dVar.f2922b)) {
                        this.f2896c = 3;
                    }
                    if (!"Make".equals(dVar.f2922b)) {
                    }
                    this.f2896c = 8;
                    if (bVar.f2917e != j2) {
                    }
                }
                bVar.m1702b(j2);
            } else {
                bVar.m1702b(j5);
            }
            s4 = (short) (s2 + 1);
            c2 = 0;
            s3 = s;
        }
        if (bVar.f2917e + 4 <= bVar.f2916d) {
            int i13 = bVar.readInt();
            boolean z4 = f2884q;
            if (z4) {
                Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(i13)));
            }
            long j6 = i13;
            if (j6 <= 0 || i13 >= bVar.f2916d) {
                if (!z4) {
                    return;
                }
                sb = new StringBuilder();
                str = "Stop reading file since a wrong offset may cause an infinite loop: ";
            } else {
                if (!this.f2899f.contains(Integer.valueOf(i13))) {
                    bVar.m1702b(j6);
                    if (this.f2898e[4].isEmpty()) {
                        m1697v(bVar, 4);
                        return;
                    } else {
                        if (this.f2898e[5].isEmpty()) {
                            m1697v(bVar, 5);
                            return;
                        }
                        return;
                    }
                }
                if (!z4) {
                    return;
                }
                sb = new StringBuilder();
                str = "Stop reading file since re-reading an IFD may cause an infinite loop: ";
            }
            sb.append(str);
            sb.append(i13);
            Log.d("ExifInterface", sb.toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0071  */
    /* JADX INFO: renamed from: w */
    public final void m1698w(b bVar) throws Throwable {
        boolean z;
        String str;
        c cVar;
        int iM1708f;
        HashMap<String, c> map = this.f2898e[4];
        c cVar2 = map.get("Compression");
        if (cVar2 != null) {
            int iM1708f2 = cVar2.m1708f(this.f2900g);
            this.f2904k = iM1708f2;
            if (iM1708f2 != 1) {
                if (iM1708f2 != 6) {
                    if (iM1708f2 != 7) {
                        return;
                    }
                }
            }
            c cVar3 = map.get("BitsPerSample");
            if (cVar3 != null) {
                int[] iArr = (int[]) cVar3.m1710h(this.f2900g);
                int[] iArr2 = f2885r;
                if (Arrays.equals(iArr2, iArr) || (this.f2896c == 3 && (cVar = map.get("PhotometricInterpretation")) != null && (((iM1708f = cVar.m1708f(this.f2900g)) == 1 && Arrays.equals(iArr, f2886s)) || (iM1708f == 6 && Arrays.equals(iArr, iArr2))))) {
                    z = true;
                } else {
                    if (f2884q) {
                        Log.d("ExifInterface", "Unsupported data type value");
                    }
                    z = false;
                }
            } else {
                if (f2884q) {
                    Log.d("ExifInterface", "Unsupported data type value");
                }
                z = false;
            }
            if (z) {
                c cVar4 = map.get("StripOffsets");
                c cVar5 = map.get("StripByteCounts");
                if (cVar4 == null || cVar5 == null) {
                    return;
                }
                long[] jArrM1675c = m1675c(cVar4.m1710h(this.f2900g));
                long[] jArrM1675c2 = m1675c(cVar5.m1710h(this.f2900g));
                if (jArrM1675c == null || jArrM1675c.length == 0) {
                    str = "stripOffsets should not be null or have zero length.";
                } else if (jArrM1675c2 == null || jArrM1675c2.length == 0) {
                    str = "stripByteCounts should not be null or have zero length.";
                } else {
                    if (jArrM1675c.length == jArrM1675c2.length) {
                        long j = 0;
                        for (long j2 : jArrM1675c2) {
                            j += j2;
                        }
                        int i = (int) j;
                        byte[] bArr = new byte[i];
                        this.f2901h = true;
                        int i2 = 0;
                        int i3 = 0;
                        for (int i4 = 0; i4 < jArrM1675c.length; i4++) {
                            int i5 = (int) jArrM1675c[i4];
                            int i6 = (int) jArrM1675c2[i4];
                            if (i4 < jArrM1675c.length - 1 && i5 + i6 != jArrM1675c[i4 + 1]) {
                                this.f2901h = false;
                            }
                            int i7 = i5 - i2;
                            if (i7 < 0) {
                                Log.d("ExifInterface", "Invalid strip offset value");
                            }
                            bVar.m1702b(i7);
                            int i8 = i2 + i7;
                            byte[] bArr2 = new byte[i6];
                            bVar.read(bArr2);
                            i2 = i8 + i6;
                            System.arraycopy(bArr2, 0, bArr, i3, i6);
                            i3 += i6;
                        }
                        if (this.f2901h) {
                            this.f2902i = ((int) jArrM1675c[0]) + this.f2905l;
                            this.f2903j = i;
                            return;
                        }
                        return;
                    }
                    str = "stripOffsets and stripByteCounts should have same length.";
                }
                Log.w("ExifInterface", str);
                return;
            }
            return;
        }
        this.f2904k = 6;
        m1691p(bVar, map);
    }

    /* JADX INFO: renamed from: y */
    public final void m1699y(int i, int i2) throws Throwable {
        String str;
        if (this.f2898e[i].isEmpty() || this.f2898e[i2].isEmpty()) {
            if (f2884q) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        c cVar = this.f2898e[i].get("ImageLength");
        c cVar2 = this.f2898e[i].get("ImageWidth");
        c cVar3 = this.f2898e[i2].get("ImageLength");
        c cVar4 = this.f2898e[i2].get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            if (!f2884q) {
                return;
            } else {
                str = "First image does not contain valid size information";
            }
        } else {
            if (cVar3 != null && cVar4 != null) {
                int iM1708f = cVar.m1708f(this.f2900g);
                int iM1708f2 = cVar2.m1708f(this.f2900g);
                int iM1708f3 = cVar3.m1708f(this.f2900g);
                int iM1708f4 = cVar4.m1708f(this.f2900g);
                if (iM1708f >= iM1708f3 || iM1708f2 >= iM1708f4) {
                    return;
                }
                HashMap<String, c>[] mapArr = this.f2898e;
                HashMap<String, c> map = mapArr[i];
                mapArr[i] = mapArr[i2];
                mapArr[i2] = map;
                return;
            }
            if (!f2884q) {
                return;
            } else {
                str = "Second image does not contain valid size information";
            }
        }
        Log.d("ExifInterface", str);
    }

    /* JADX INFO: renamed from: z */
    public final void m1700z(b bVar, int i) throws Throwable {
        c cVar;
        StringBuilder sbM2191e;
        String string;
        c cVarM1706d;
        c cVarM1706d2;
        c cVar2 = this.f2898e[i].get("DefaultCropSize");
        c cVar3 = this.f2898e[i].get("SensorTopBorder");
        c cVar4 = this.f2898e[i].get("SensorLeftBorder");
        c cVar5 = this.f2898e[i].get("SensorBottomBorder");
        c cVar6 = this.f2898e[i].get("SensorRightBorder");
        if (cVar2 == null) {
            if (cVar3 == null || cVar4 == null || cVar5 == null || cVar6 == null) {
                c cVar7 = this.f2898e[i].get("ImageLength");
                c cVar8 = this.f2898e[i].get("ImageWidth");
                if ((cVar7 == null || cVar8 == null) && (cVar = this.f2898e[i].get("JPEGInterchangeFormat")) != null) {
                    m1682g(bVar, cVar.m1708f(this.f2900g), i);
                    return;
                }
                return;
            }
            int iM1708f = cVar3.m1708f(this.f2900g);
            int iM1708f2 = cVar5.m1708f(this.f2900g);
            int iM1708f3 = cVar6.m1708f(this.f2900g);
            int iM1708f4 = cVar4.m1708f(this.f2900g);
            if (iM1708f2 <= iM1708f || iM1708f3 <= iM1708f4) {
                return;
            }
            c cVarM1706d3 = c.m1706d(iM1708f2 - iM1708f, this.f2900g);
            c cVarM1706d4 = c.m1706d(iM1708f3 - iM1708f4, this.f2900g);
            this.f2898e[i].put("ImageLength", cVarM1706d3);
            this.f2898e[i].put("ImageWidth", cVarM1706d4);
            return;
        }
        if (cVar2.f2918a == 5) {
            e[] eVarArr = (e[]) cVar2.m1710h(this.f2900g);
            if (eVarArr == null || eVarArr.length != 2) {
                sbM2191e = a.m2191e("Invalid crop size values. cropSize=");
                string = Arrays.toString(eVarArr);
                sbM2191e.append(string);
                Log.w("ExifInterface", sbM2191e.toString());
                return;
            }
            cVarM1706d = c.m1705c(eVarArr[0], this.f2900g);
            cVarM1706d2 = c.m1705c(eVarArr[1], this.f2900g);
            this.f2898e[i].put("ImageWidth", cVarM1706d);
            this.f2898e[i].put("ImageLength", cVarM1706d2);
        }
        int[] iArr = (int[]) cVar2.m1710h(this.f2900g);
        if (iArr == null || iArr.length != 2) {
            sbM2191e = a.m2191e("Invalid crop size values. cropSize=");
            string = Arrays.toString(iArr);
            sbM2191e.append(string);
            Log.w("ExifInterface", sbM2191e.toString());
            return;
        }
        cVarM1706d = c.m1706d(iArr[0], this.f2900g);
        cVarM1706d2 = c.m1706d(iArr[1], this.f2900g);
        this.f2898e[i].put("ImageWidth", cVarM1706d);
        this.f2898e[i].put("ImageLength", cVarM1706d2);
    }
}
