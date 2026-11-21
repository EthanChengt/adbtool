package p080c.p084b.p085a.p086k;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import c.a.a.a.a;

/* JADX INFO: renamed from: c.b.a.k.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0625a implements Closeable {

    /* JADX INFO: renamed from: b */
    public final File f3834b;

    /* JADX INFO: renamed from: c */
    public final File f3835c;

    /* JADX INFO: renamed from: d */
    public final File f3836d;

    /* JADX INFO: renamed from: e */
    public final File f3837e;

    /* JADX INFO: renamed from: f */
    public final int f3838f;

    /* JADX INFO: renamed from: g */
    public long f3839g;

    /* JADX INFO: renamed from: h */
    public final int f3840h;

    /* JADX INFO: renamed from: j */
    public Writer f3842j;

    /* JADX INFO: renamed from: l */
    public int f3844l;

    /* JADX INFO: renamed from: i */
    public long f3841i = 0;

    /* JADX INFO: renamed from: k */
    public final LinkedHashMap<String, d> f3843k = new LinkedHashMap<>(0, 0.75f, true);

    /* JADX INFO: renamed from: m */
    public long f3845m = 0;

    /* JADX INFO: renamed from: n */
    public final ThreadPoolExecutor f3846n = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b(null));

    /* JADX INFO: renamed from: o */
    public final Callable<Void> f3847o = new a();

    /* JADX INFO: renamed from: c.b.a.k.a$a */
    public class a implements Callable<Void> {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        public Void call() {
            synchronized (C0625a.this) {
                C0625a c0625a = C0625a.this;
                if (c0625a.f3842j != null) {
                    c0625a.m2254o();
                    if (C0625a.this.m2249h()) {
                        C0625a.this.m2253m();
                        C0625a.this.f3844l = 0;
                    }
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: c.b.a.k.a$b */
    public static final class b implements ThreadFactory {
        public b(a aVar) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    /* JADX INFO: renamed from: c.b.a.k.a$c */
    public final class c {

        /* JADX INFO: renamed from: a */
        public final d f3849a;

        /* JADX INFO: renamed from: b */
        public final boolean[] f3850b;

        /* JADX INFO: renamed from: c */
        public boolean f3851c;

        public c(d dVar, a aVar) {
            this.f3849a = dVar;
            this.f3850b = dVar.f3857e ? null : new boolean[C0625a.this.f3840h];
        }

        /* JADX INFO: renamed from: a */
        public void m2255a() {
            C0625a.m2240a(C0625a.this, this, false);
        }

        /* JADX INFO: renamed from: b */
        public File m2256b(int i) {
            File file;
            synchronized (C0625a.this) {
                d dVar = this.f3849a;
                if (dVar.f3858f != this) {
                    throw new IllegalStateException();
                }
                if (!dVar.f3857e) {
                    this.f3850b[i] = true;
                }
                file = dVar.f3856d[i];
                C0625a.this.f3834b.mkdirs();
            }
            return file;
        }
    }

    /* JADX INFO: renamed from: c.b.a.k.a$d */
    public final class d {

        /* JADX INFO: renamed from: a */
        public final String f3853a;

        /* JADX INFO: renamed from: b */
        public final long[] f3854b;

        /* JADX INFO: renamed from: c */
        public File[] f3855c;

        /* JADX INFO: renamed from: d */
        public File[] f3856d;

        /* JADX INFO: renamed from: e */
        public boolean f3857e;

        /* JADX INFO: renamed from: f */
        public c f3858f;

        /* JADX INFO: renamed from: g */
        public long f3859g;

        public d(String str, a aVar) {
            this.f3853a = str;
            int i = C0625a.this.f3840h;
            this.f3854b = new long[i];
            this.f3855c = new File[i];
            this.f3856d = new File[i];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i2 = 0; i2 < C0625a.this.f3840h; i2++) {
                sb.append(i2);
                this.f3855c[i2] = new File(C0625a.this.f3834b, sb.toString());
                sb.append(".tmp");
                this.f3856d[i2] = new File(C0625a.this.f3834b, sb.toString());
                sb.setLength(length);
            }
        }

        /* JADX INFO: renamed from: a */
        public String m2257a() {
            StringBuilder sb = new StringBuilder();
            for (long j : this.f3854b) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        /* JADX INFO: renamed from: b */
        public final IOException m2258b(String[] strArr) throws IOException {
            StringBuilder sbM2191e = a.m2191e("unexpected journal line: ");
            sbM2191e.append(Arrays.toString(strArr));
            throw new IOException(sbM2191e.toString());
        }
    }

    /* JADX INFO: renamed from: c.b.a.k.a$e */
    public final class e {

        /* JADX INFO: renamed from: a */
        public final File[] f3861a;

        public e(C0625a c0625a, String str, long j, File[] fileArr, long[] jArr, a aVar) {
            this.f3861a = fileArr;
        }
    }

    public C0625a(File file, int i, int i2, long j) {
        this.f3834b = file;
        this.f3838f = i;
        this.f3835c = new File(file, "journal");
        this.f3836d = new File(file, "journal.tmp");
        this.f3837e = new File(file, "journal.bkp");
        this.f3840h = i2;
        this.f3839g = j;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0049 A[Catch: all -> 0x00f7, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x000a, B:10:0x000f, B:12:0x0013, B:14:0x0019, B:16:0x0023, B:17:0x0028, B:18:0x002b, B:19:0x0044, B:20:0x0045, B:22:0x0049, B:24:0x004f, B:26:0x0055, B:28:0x0072, B:27:0x006f, B:29:0x0075, B:31:0x0087, B:33:0x00ac, B:35:0x00d5, B:37:0x00e2, B:39:0x00e8, B:34:0x00b6, B:42:0x00f1, B:43:0x00f6), top: B:49:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x004f A[Catch: all -> 0x00f7, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x000a, B:10:0x000f, B:12:0x0013, B:14:0x0019, B:16:0x0023, B:17:0x0028, B:18:0x002b, B:19:0x0044, B:20:0x0045, B:22:0x0049, B:24:0x004f, B:26:0x0055, B:28:0x0072, B:27:0x006f, B:29:0x0075, B:31:0x0087, B:33:0x00ac, B:35:0x00d5, B:37:0x00e2, B:39:0x00e8, B:34:0x00b6, B:42:0x00f1, B:43:0x00f6), top: B:49:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0055 A[Catch: all -> 0x00f7, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x000a, B:10:0x000f, B:12:0x0013, B:14:0x0019, B:16:0x0023, B:17:0x0028, B:18:0x002b, B:19:0x0044, B:20:0x0045, B:22:0x0049, B:24:0x004f, B:26:0x0055, B:28:0x0072, B:27:0x006f, B:29:0x0075, B:31:0x0087, B:33:0x00ac, B:35:0x00d5, B:37:0x00e2, B:39:0x00e8, B:34:0x00b6, B:42:0x00f1, B:43:0x00f6), top: B:49:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x006f A[Catch: all -> 0x00f7, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x000a, B:10:0x000f, B:12:0x0013, B:14:0x0019, B:16:0x0023, B:17:0x0028, B:18:0x002b, B:19:0x0044, B:20:0x0045, B:22:0x0049, B:24:0x004f, B:26:0x0055, B:28:0x0072, B:27:0x006f, B:29:0x0075, B:31:0x0087, B:33:0x00ac, B:35:0x00d5, B:37:0x00e2, B:39:0x00e8, B:34:0x00b6, B:42:0x00f1, B:43:0x00f6), top: B:49:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0087 A[Catch: all -> 0x00f7, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x000a, B:10:0x000f, B:12:0x0013, B:14:0x0019, B:16:0x0023, B:17:0x0028, B:18:0x002b, B:19:0x0044, B:20:0x0045, B:22:0x0049, B:24:0x004f, B:26:0x0055, B:28:0x0072, B:27:0x006f, B:29:0x0075, B:31:0x0087, B:33:0x00ac, B:35:0x00d5, B:37:0x00e2, B:39:0x00e8, B:34:0x00b6, B:42:0x00f1, B:43:0x00f6), top: B:49:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00ac A[Catch: all -> 0x00f7, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x000a, B:10:0x000f, B:12:0x0013, B:14:0x0019, B:16:0x0023, B:17:0x0028, B:18:0x002b, B:19:0x0044, B:20:0x0045, B:22:0x0049, B:24:0x004f, B:26:0x0055, B:28:0x0072, B:27:0x006f, B:29:0x0075, B:31:0x0087, B:33:0x00ac, B:35:0x00d5, B:37:0x00e2, B:39:0x00e8, B:34:0x00b6, B:42:0x00f1, B:43:0x00f6), top: B:49:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00b6 A[Catch: all -> 0x00f7, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x000a, B:10:0x000f, B:12:0x0013, B:14:0x0019, B:16:0x0023, B:17:0x0028, B:18:0x002b, B:19:0x0044, B:20:0x0045, B:22:0x0049, B:24:0x004f, B:26:0x0055, B:28:0x0072, B:27:0x006f, B:29:0x0075, B:31:0x0087, B:33:0x00ac, B:35:0x00d5, B:37:0x00e2, B:39:0x00e8, B:34:0x00b6, B:42:0x00f1, B:43:0x00f6), top: B:49:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00e8 A[Catch: all -> 0x00f7, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x000a, B:10:0x000f, B:12:0x0013, B:14:0x0019, B:16:0x0023, B:17:0x0028, B:18:0x002b, B:19:0x0044, B:20:0x0045, B:22:0x0049, B:24:0x004f, B:26:0x0055, B:28:0x0072, B:27:0x006f, B:29:0x0075, B:31:0x0087, B:33:0x00ac, B:35:0x00d5, B:37:0x00e2, B:39:0x00e8, B:34:0x00b6, B:42:0x00f1, B:43:0x00f6), top: B:49:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0072 A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static void m2240a(C0625a c0625a, c cVar, boolean z) {
        File file;
        synchronized (c0625a) {
            d dVar = cVar.f3849a;
            if (dVar.f3858f != cVar) {
                throw new IllegalStateException();
            }
            if (!z || dVar.f3857e) {
                for (int i = 0; i < c0625a.f3840h; i++) {
                    file = dVar.f3856d[i];
                    if (z) {
                        m2242d(file);
                    } else if (file.exists()) {
                        File file2 = dVar.f3855c[i];
                        file.renameTo(file2);
                        long j = dVar.f3854b[i];
                        long length = file2.length();
                        dVar.f3854b[i] = length;
                        c0625a.f3841i = (c0625a.f3841i - j) + length;
                    }
                }
                c0625a.f3844l++;
                dVar.f3858f = null;
                if (dVar.f3857e || z) {
                    dVar.f3857e = true;
                    c0625a.f3842j.append((CharSequence) "CLEAN");
                    c0625a.f3842j.append(' ');
                    c0625a.f3842j.append((CharSequence) dVar.f3853a);
                    c0625a.f3842j.append((CharSequence) dVar.m2257a());
                    c0625a.f3842j.append('\n');
                    if (z) {
                        long j2 = c0625a.f3845m;
                        c0625a.f3845m = 1 + j2;
                        dVar.f3859g = j2;
                    }
                } else {
                    c0625a.f3843k.remove(dVar.f3853a);
                    c0625a.f3842j.append((CharSequence) "REMOVE");
                    c0625a.f3842j.append(' ');
                    c0625a.f3842j.append((CharSequence) dVar.f3853a);
                    c0625a.f3842j.append('\n');
                }
                m2243f(c0625a.f3842j);
                if (c0625a.f3841i <= c0625a.f3839g || c0625a.m2249h()) {
                    c0625a.f3846n.submit(c0625a.f3847o);
                }
            } else {
                for (int i2 = 0; i2 < c0625a.f3840h; i2++) {
                    if (!cVar.f3850b[i2]) {
                        cVar.m2255a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i2);
                    }
                    if (!dVar.f3856d[i2].exists()) {
                        cVar.m2255a();
                    }
                }
                while (i < c0625a.f3840h) {
                    file = dVar.f3856d[i];
                    if (z) {
                        m2242d(file);
                    } else if (file.exists()) {
                        File file3 = dVar.f3855c[i];
                        file.renameTo(file3);
                        long j3 = dVar.f3854b[i];
                        long length2 = file3.length();
                        dVar.f3854b[i] = length2;
                        c0625a.f3841i = (c0625a.f3841i - j3) + length2;
                    }
                }
                c0625a.f3844l++;
                dVar.f3858f = null;
                if (dVar.f3857e || z) {
                    dVar.f3857e = true;
                    c0625a.f3842j.append((CharSequence) "CLEAN");
                    c0625a.f3842j.append(' ');
                    c0625a.f3842j.append((CharSequence) dVar.f3853a);
                    c0625a.f3842j.append((CharSequence) dVar.m2257a());
                    c0625a.f3842j.append('\n');
                    if (z) {
                        long j4 = c0625a.f3845m;
                        c0625a.f3845m = 1 + j4;
                        dVar.f3859g = j4;
                    }
                } else {
                    c0625a.f3843k.remove(dVar.f3853a);
                    c0625a.f3842j.append((CharSequence) "REMOVE");
                    c0625a.f3842j.append(' ');
                    c0625a.f3842j.append((CharSequence) dVar.f3853a);
                    c0625a.f3842j.append('\n');
                }
                m2243f(c0625a.f3842j);
                if (c0625a.f3841i <= c0625a.f3839g) {
                    c0625a.f3846n.submit(c0625a.f3847o);
                } else {
                    c0625a.f3846n.submit(c0625a.f3847o);
                }
            }
        }
    }

    @TargetApi(26)
    /* JADX INFO: renamed from: c */
    public static void m2241c(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m2242d(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    @TargetApi(26)
    /* JADX INFO: renamed from: f */
    public static void m2243f(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: renamed from: i */
    public static C0625a m2244i(File file, int i, int i2, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                m2245n(file2, file3, false);
            }
        }
        C0625a c0625a = new C0625a(file, i, i2, j);
        if (c0625a.f3835c.exists()) {
            try {
                c0625a.m2251k();
                c0625a.m2250j();
                return c0625a;
            } catch (IOException e2) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e2.getMessage() + ", removing");
                c0625a.close();
                C0627c.m2261a(c0625a.f3834b);
            }
        }
        file.mkdirs();
        C0625a c0625a2 = new C0625a(file, i, i2, j);
        c0625a2.m2253m();
        return c0625a2;
    }

    /* JADX INFO: renamed from: n */
    public static void m2245n(File file, File file2, boolean z) throws IOException {
        if (z) {
            m2242d(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2246b() {
        if (this.f3842j == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.f3842j == null) {
            return;
        }
        Iterator it = new ArrayList(this.f3843k.values()).iterator();
        while (it.hasNext()) {
            c cVar = ((d) it.next()).f3858f;
            if (cVar != null) {
                cVar.m2255a();
            }
        }
        m2254o();
        m2241c(this.f3842j);
        this.f3842j = null;
    }

    /* JADX INFO: renamed from: e */
    public c m2247e(String str) {
        synchronized (this) {
            m2246b();
            d dVar = this.f3843k.get(str);
            if (dVar == null) {
                dVar = new d(str, null);
                this.f3843k.put(str, dVar);
            } else if (dVar.f3858f != null) {
                return null;
            }
            c cVar = new c(dVar, null);
            dVar.f3858f = cVar;
            this.f3842j.append((CharSequence) "DIRTY");
            this.f3842j.append(' ');
            this.f3842j.append((CharSequence) str);
            this.f3842j.append('\n');
            m2243f(this.f3842j);
            return cVar;
        }
    }

    /* JADX INFO: renamed from: g */
    public synchronized e m2248g(String str) {
        m2246b();
        d dVar = this.f3843k.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f3857e) {
            return null;
        }
        for (File file : dVar.f3855c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f3844l++;
        this.f3842j.append((CharSequence) "READ");
        this.f3842j.append(' ');
        this.f3842j.append((CharSequence) str);
        this.f3842j.append('\n');
        if (m2249h()) {
            this.f3846n.submit(this.f3847o);
        }
        return new e(this, str, dVar.f3859g, dVar.f3855c, dVar.f3854b, null);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m2249h() {
        int i = this.f3844l;
        return i >= 2000 && i >= this.f3843k.size();
    }

    /* JADX INFO: renamed from: j */
    public final void m2250j() throws IOException {
        m2242d(this.f3836d);
        Iterator<d> it = this.f3843k.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i = 0;
            if (next.f3858f == null) {
                while (i < this.f3840h) {
                    this.f3841i += next.f3854b[i];
                    i++;
                }
            } else {
                next.f3858f = null;
                while (i < this.f3840h) {
                    m2242d(next.f3855c[i]);
                    m2242d(next.f3856d[i]);
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m2251k() {
        C0626b c0626b = new C0626b(new FileInputStream(this.f3835c), C0627c.f3868a);
        try {
            String strM2260b = c0626b.m2260b();
            String strM2260b2 = c0626b.m2260b();
            String strM2260b3 = c0626b.m2260b();
            String strM2260b4 = c0626b.m2260b();
            String strM2260b5 = c0626b.m2260b();
            if (!"libcore.io.DiskLruCache".equals(strM2260b) || !"1".equals(strM2260b2) || !Integer.toString(this.f3838f).equals(strM2260b3) || !Integer.toString(this.f3840h).equals(strM2260b4) || !"".equals(strM2260b5)) {
                throw new IOException("unexpected journal header: [" + strM2260b + ", " + strM2260b2 + ", " + strM2260b4 + ", " + strM2260b5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    m2252l(c0626b.m2260b());
                    i++;
                } catch (EOFException unused) {
                    this.f3844l = i - this.f3843k.size();
                    if (c0626b.f3866f == -1) {
                        m2253m();
                    } else {
                        this.f3842j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f3835c, true), C0627c.f3868a));
                    }
                    try {
                        c0626b.close();
                        return;
                    } catch (RuntimeException e2) {
                        throw e2;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                c0626b.close();
            } catch (RuntimeException e3) {
                throw e3;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m2252l(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException(a.m2201o("unexpected journal line: ", str));
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                this.f3843k.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        d dVar = this.f3843k.get(strSubstring);
        if (dVar == null) {
            dVar = new d(strSubstring, null);
            this.f3843k.put(strSubstring, dVar);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f3858f = new c(dVar, null);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException(a.m2201o("unexpected journal line: ", str));
                }
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
        dVar.f3857e = true;
        dVar.f3858f = null;
        if (strArrSplit.length != C0625a.this.f3840h) {
            dVar.m2258b(strArrSplit);
            throw null;
        }
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            try {
                dVar.f3854b[i2] = Long.parseLong(strArrSplit[i2]);
            } catch (NumberFormatException unused) {
                dVar.m2258b(strArrSplit);
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final synchronized void m2253m() {
        Writer writer = this.f3842j;
        if (writer != null) {
            m2241c(writer);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f3836d), C0627c.f3868a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f3838f));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f3840h));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (d dVar : this.f3843k.values()) {
                bufferedWriter.write(dVar.f3858f != null ? "DIRTY " + dVar.f3853a + '\n' : "CLEAN " + dVar.f3853a + dVar.m2257a() + '\n');
            }
            m2241c(bufferedWriter);
            if (this.f3835c.exists()) {
                m2245n(this.f3835c, this.f3837e, true);
            }
            m2245n(this.f3836d, this.f3835c, false);
            this.f3837e.delete();
            this.f3842j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f3835c, true), C0627c.f3868a));
        } catch (Throwable th) {
            m2241c(bufferedWriter);
            throw th;
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m2254o() {
        while (this.f3841i > this.f3839g) {
            String key = this.f3843k.entrySet().iterator().next().getKey();
            synchronized (this) {
                m2246b();
                d dVar = this.f3843k.get(key);
                if (dVar != null && dVar.f3858f == null) {
                    for (int i = 0; i < this.f3840h; i++) {
                        File file = dVar.f3855c[i];
                        if (file.exists() && !file.delete()) {
                            throw new IOException("failed to delete " + file);
                        }
                        long j = this.f3841i;
                        long[] jArr = dVar.f3854b;
                        this.f3841i = j - jArr[i];
                        jArr[i] = 0;
                    }
                    this.f3844l++;
                    this.f3842j.append((CharSequence) "REMOVE");
                    this.f3842j.append(' ');
                    this.f3842j.append((CharSequence) key);
                    this.f3842j.append('\n');
                    this.f3843k.remove(key);
                    if (m2249h()) {
                        this.f3846n.submit(this.f3847o);
                    }
                }
            }
        }
    }
}
