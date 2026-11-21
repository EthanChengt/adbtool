package p080c.p084b.p085a;

import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.GeneratedAppGlideModule;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p006b.p056m.p057b.ActivityC0459e;
import c.a.a.a.a;
import p080c.p084b.p085a.p087l.InterfaceC0628a;
import p080c.p084b.p085a.p088m.InterfaceC0649q;
import p080c.p084b.p085a.p088m.p089t.C0662k;
import p080c.p084b.p085a.p088m.p091u.C0708l;
import p080c.p084b.p085a.p088m.p091u.p092c0.C0679e;
import p080c.p084b.p085a.p088m.p091u.p092c0.C0683i;
import p080c.p084b.p085a.p088m.p091u.p092c0.C0684j;
import p080c.p084b.p085a.p088m.p091u.p092c0.InterfaceC0676b;
import p080c.p084b.p085a.p088m.p091u.p092c0.InterfaceC0678d;
import p080c.p084b.p085a.p088m.p091u.p093d0.C0695g;
import p080c.p084b.p085a.p088m.p091u.p093d0.C0696h;
import p080c.p084b.p085a.p088m.p091u.p093d0.C0698j;
import p080c.p084b.p085a.p088m.p091u.p093d0.InterfaceC0697i;
import p080c.p084b.p085a.p088m.p091u.p094e0.ExecutorServiceC0701a;
import p080c.p084b.p085a.p088m.p095v.C0723a;
import p080c.p084b.p085a.p088m.p095v.C0724b;
import p080c.p084b.p085a.p088m.p095v.C0725c;
import p080c.p084b.p085a.p088m.p095v.C0726d;
import p080c.p084b.p085a.p088m.p095v.C0727e;
import p080c.p084b.p085a.p088m.p095v.C0728f;
import p080c.p084b.p085a.p088m.p095v.C0729g;
import p080c.p084b.p085a.p088m.p095v.C0733k;
import p080c.p084b.p085a.p088m.p095v.C0741s;
import p080c.p084b.p085a.p088m.p095v.C0742t;
import p080c.p084b.p085a.p088m.p095v.C0743u;
import p080c.p084b.p085a.p088m.p095v.C0744v;
import p080c.p084b.p085a.p088m.p095v.C0745w;
import p080c.p084b.p085a.p088m.p095v.C0746x;
import p080c.p084b.p085a.p088m.p095v.p096y.C0747a;
import p080c.p084b.p085a.p088m.p095v.p096y.C0748b;
import p080c.p084b.p085a.p088m.p095v.p096y.C0749c;
import p080c.p084b.p085a.p088m.p095v.p096y.C0750d;
import p080c.p084b.p085a.p088m.p095v.p096y.C0751e;
import p080c.p084b.p085a.p088m.p097w.p098c.C0754a;
import p080c.p084b.p085a.p088m.p097w.p098c.C0755a0;
import p080c.p084b.p085a.p088m.p097w.p098c.C0756b;
import p080c.p084b.p085a.p088m.p097w.p098c.C0757b0;
import p080c.p084b.p085a.p088m.p097w.p098c.C0758c;
import p080c.p084b.p085a.p088m.p097w.p098c.C0763g;
import p080c.p084b.p085a.p088m.p097w.p098c.C0764h;
import p080c.p084b.p085a.p088m.p097w.p098c.C0767k;
import p080c.p084b.p085a.p088m.p097w.p098c.C0769m;
import p080c.p084b.p085a.p088m.p097w.p098c.C0772p;
import p080c.p084b.p085a.p088m.p097w.p098c.C0776t;
import p080c.p084b.p085a.p088m.p097w.p098c.C0778v;
import p080c.p084b.p085a.p088m.p097w.p098c.C0780x;
import p080c.p084b.p085a.p088m.p097w.p098c.C0781y;
import p080c.p084b.p085a.p088m.p097w.p099d.C0783a;
import p080c.p084b.p085a.p088m.p097w.p100e.C0788d;
import p080c.p084b.p085a.p088m.p097w.p100e.C0789e;
import p080c.p084b.p085a.p088m.p097w.p101f.C0790a;
import p080c.p084b.p085a.p088m.p097w.p102g.C0792a;
import p080c.p084b.p085a.p088m.p097w.p102g.C0794c;
import p080c.p084b.p085a.p088m.p097w.p102g.C0795d;
import p080c.p084b.p085a.p088m.p097w.p102g.C0799h;
import p080c.p084b.p085a.p088m.p097w.p102g.C0801j;
import p080c.p084b.p085a.p088m.p097w.p103h.C0802a;
import p080c.p084b.p085a.p088m.p097w.p103h.C0803b;
import p080c.p084b.p085a.p088m.p097w.p103h.C0804c;
import p080c.p084b.p085a.p088m.p097w.p103h.C0805d;
import p080c.p084b.p085a.p104n.C0814f;
import p080c.p084b.p085a.p104n.C0824p;
import p080c.p084b.p085a.p104n.InterfaceC0812d;
import p080c.p084b.p085a.p105o.C0833e;
import p080c.p084b.p085a.p105o.InterfaceC0831c;
import p080c.p084b.p085a.p106p.C0836b;
import p080c.p084b.p085a.p107q.InterfaceC0845e;
import p080c.p084b.p085a.p107q.p108j.C0855f;
import p080c.p084b.p085a.p111s.C0872g;
import p080c.p084b.p085a.p111s.C0875j;

/* JADX INFO: renamed from: c.b.a.b */
/* JADX INFO: loaded from: classes.dex */
public class ComponentCallbacks2C0616b implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: j */
    public static volatile ComponentCallbacks2C0616b f3752j;

    /* JADX INFO: renamed from: k */
    public static volatile boolean f3753k;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0678d f3754b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0697i f3755c;

    /* JADX INFO: renamed from: d */
    public final C0618d f3756d;

    /* JADX INFO: renamed from: e */
    public final C0621g f3757e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC0676b f3758f;

    /* JADX INFO: renamed from: g */
    public final C0824p f3759g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC0812d f3760h;

    /* JADX INFO: renamed from: i */
    public final List<ComponentCallbacks2C0623i> f3761i = new ArrayList();

    /* JADX INFO: renamed from: c.b.a.b$a */
    public interface a {
    }

    public ComponentCallbacks2C0616b(Context context, C0708l c0708l, InterfaceC0697i interfaceC0697i, InterfaceC0678d interfaceC0678d, InterfaceC0676b interfaceC0676b, C0824p c0824p, InterfaceC0812d interfaceC0812d, int i, a aVar, Map<Class<?>, AbstractC0624j<?, ?>> map, List<InterfaceC0845e<Object>> list, C0619e c0619e) {
        InterfaceC0649q c0763g;
        InterfaceC0649q c0781y;
        this.f3754b = interfaceC0678d;
        this.f3758f = interfaceC0676b;
        this.f3755c = interfaceC0697i;
        this.f3759g = c0824p;
        this.f3760h = interfaceC0812d;
        Resources resources = context.getResources();
        C0621g c0621g = new C0621g();
        this.f3757e = c0621g;
        C0767k c0767k = new C0767k();
        C0836b c0836b = c0621g.f3802g;
        synchronized (c0836b) {
            c0836b.f4601a.add(c0767k);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 27) {
            C0772p c0772p = new C0772p();
            C0836b c0836b2 = c0621g.f3802g;
            synchronized (c0836b2) {
                c0836b2.f4601a.add(c0772p);
            }
        }
        List<ImageHeaderParser> listM2214e = c0621g.m2214e();
        C0792a c0792a = new C0792a(context, listM2214e, interfaceC0678d, interfaceC0676b);
        C0757b0 c0757b0 = new C0757b0(interfaceC0678d, new C0757b0.g());
        C0769m c0769m = new C0769m(c0621g.m2214e(), resources.getDisplayMetrics(), interfaceC0678d, interfaceC0676b);
        if (!c0619e.f3789a.containsKey(C0617c.b.class) || i2 < 28) {
            c0763g = new C0763g(c0769m);
            c0781y = new C0781y(c0769m, interfaceC0676b);
        } else {
            c0781y = new C0776t();
            c0763g = new C0764h();
        }
        C0788d c0788d = new C0788d(context);
        C0741s.c cVar = new C0741s.c(resources);
        C0741s.d dVar = new C0741s.d(resources);
        C0741s.b bVar = new C0741s.b(resources);
        C0741s.a aVar2 = new C0741s.a(resources);
        C0758c c0758c = new C0758c(interfaceC0676b);
        C0802a c0802a = new C0802a();
        C0805d c0805d = new C0805d();
        ContentResolver contentResolver = context.getContentResolver();
        c0621g.m2210a(ByteBuffer.class, new C0725c());
        c0621g.m2210a(InputStream.class, new C0742t(interfaceC0676b));
        c0621g.m2213d("Bitmap", ByteBuffer.class, Bitmap.class, c0763g);
        c0621g.m2213d("Bitmap", InputStream.class, Bitmap.class, c0781y);
        if (ParcelFileDescriptorRewinder.m3007c()) {
            c0621g.m2213d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new C0778v(c0769m));
        }
        c0621g.m2213d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, c0757b0);
        c0621g.m2213d("Bitmap", AssetFileDescriptor.class, Bitmap.class, new C0757b0(interfaceC0678d, new C0757b0.c(null)));
        C0744v.a<?> aVar3 = C0744v.a.f4361a;
        c0621g.m2212c(Bitmap.class, Bitmap.class, aVar3);
        c0621g.m2213d("Bitmap", Bitmap.class, Bitmap.class, new C0755a0());
        c0621g.m2211b(Bitmap.class, c0758c);
        c0621g.m2213d("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C0754a(resources, c0763g));
        c0621g.m2213d("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C0754a(resources, c0781y));
        c0621g.m2213d("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new C0754a(resources, c0757b0));
        c0621g.m2211b(BitmapDrawable.class, new C0756b(interfaceC0678d, c0758c));
        c0621g.m2213d("Gif", InputStream.class, C0794c.class, new C0801j(listM2214e, c0792a, interfaceC0676b));
        c0621g.m2213d("Gif", ByteBuffer.class, C0794c.class, c0792a);
        c0621g.m2211b(C0794c.class, new C0795d());
        c0621g.m2212c(InterfaceC0628a.class, InterfaceC0628a.class, aVar3);
        c0621g.m2213d("Bitmap", InterfaceC0628a.class, Bitmap.class, new C0799h(interfaceC0678d));
        c0621g.m2213d("legacy_append", Uri.class, Drawable.class, c0788d);
        c0621g.m2213d("legacy_append", Uri.class, Bitmap.class, new C0780x(c0788d, interfaceC0678d));
        c0621g.m2216g(new C0783a.a());
        c0621g.m2212c(File.class, ByteBuffer.class, new C0726d.b());
        c0621g.m2212c(File.class, InputStream.class, new C0728f.e());
        c0621g.m2213d("legacy_append", File.class, File.class, new C0790a());
        c0621g.m2212c(File.class, ParcelFileDescriptor.class, new C0728f.b());
        c0621g.m2212c(File.class, File.class, aVar3);
        c0621g.m2216g(new C0662k.a(interfaceC0676b));
        if (ParcelFileDescriptorRewinder.m3007c()) {
            c0621g.m2216g(new ParcelFileDescriptorRewinder.C1310a());
        }
        Class cls = Integer.TYPE;
        c0621g.m2212c(cls, InputStream.class, cVar);
        c0621g.m2212c(cls, ParcelFileDescriptor.class, bVar);
        c0621g.m2212c(Integer.class, InputStream.class, cVar);
        c0621g.m2212c(Integer.class, ParcelFileDescriptor.class, bVar);
        c0621g.m2212c(Integer.class, Uri.class, dVar);
        c0621g.m2212c(cls, AssetFileDescriptor.class, aVar2);
        c0621g.m2212c(Integer.class, AssetFileDescriptor.class, aVar2);
        c0621g.m2212c(cls, Uri.class, dVar);
        c0621g.m2212c(String.class, InputStream.class, new C0727e.c());
        c0621g.m2212c(Uri.class, InputStream.class, new C0727e.c());
        c0621g.m2212c(String.class, InputStream.class, new C0743u.c());
        c0621g.m2212c(String.class, ParcelFileDescriptor.class, new C0743u.b());
        c0621g.m2212c(String.class, AssetFileDescriptor.class, new C0743u.a());
        c0621g.m2212c(Uri.class, InputStream.class, new C0723a.c(context.getAssets()));
        c0621g.m2212c(Uri.class, ParcelFileDescriptor.class, new C0723a.b(context.getAssets()));
        c0621g.m2212c(Uri.class, InputStream.class, new C0748b.a(context));
        c0621g.m2212c(Uri.class, InputStream.class, new C0749c.a(context));
        if (i2 >= 29) {
            c0621g.m2212c(Uri.class, InputStream.class, new C0750d.c(context));
            c0621g.m2212c(Uri.class, ParcelFileDescriptor.class, new C0750d.b(context));
        }
        c0621g.m2212c(Uri.class, InputStream.class, new C0745w.d(contentResolver));
        c0621g.m2212c(Uri.class, ParcelFileDescriptor.class, new C0745w.b(contentResolver));
        c0621g.m2212c(Uri.class, AssetFileDescriptor.class, new C0745w.a(contentResolver));
        c0621g.m2212c(Uri.class, InputStream.class, new C0746x.a());
        c0621g.m2212c(URL.class, InputStream.class, new C0751e.a());
        c0621g.m2212c(Uri.class, File.class, new C0733k.a(context));
        c0621g.m2212c(C0729g.class, InputStream.class, new C0747a.a());
        c0621g.m2212c(byte[].class, ByteBuffer.class, new C0724b.a());
        c0621g.m2212c(byte[].class, InputStream.class, new C0724b.d());
        c0621g.m2212c(Uri.class, Uri.class, aVar3);
        c0621g.m2212c(Drawable.class, Drawable.class, aVar3);
        c0621g.m2213d("legacy_append", Drawable.class, Drawable.class, new C0789e());
        c0621g.m2217h(Bitmap.class, BitmapDrawable.class, new C0803b(resources));
        c0621g.m2217h(Bitmap.class, byte[].class, c0802a);
        c0621g.m2217h(Drawable.class, byte[].class, new C0804c(interfaceC0678d, c0802a, c0805d));
        c0621g.m2217h(C0794c.class, byte[].class, c0805d);
        if (i2 >= 23) {
            C0757b0 c0757b1 = new C0757b0(interfaceC0678d, new C0757b0.d());
            c0621g.m2213d("legacy_append", ByteBuffer.class, Bitmap.class, c0757b1);
            c0621g.m2213d("legacy_append", ByteBuffer.class, BitmapDrawable.class, new C0754a(resources, c0757b1));
        }
        this.f3756d = new C0618d(context, interfaceC0676b, c0621g, new C0855f(), aVar, map, list, c0708l, c0619e, i);
    }

    /* JADX INFO: renamed from: a */
    public static void m2204a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (f3753k) {
            throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
        }
        f3753k = true;
        C0617c c0617c = new C0617c();
        Context applicationContext = context.getApplicationContext();
        Collections.emptyList();
        if (Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Loading Glide modules");
        }
        ArrayList<InterfaceC0831c> arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
            if (applicationInfo.metaData != null) {
                if (Log.isLoggable("ManifestParser", 2)) {
                    Log.v("ManifestParser", "Got app info metadata: " + applicationInfo.metaData);
                }
                for (String str : applicationInfo.metaData.keySet()) {
                    if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                        arrayList.add(C0833e.m2537a(str));
                        if (Log.isLoggable("ManifestParser", 3)) {
                            Log.d("ManifestParser", "Loaded Glide module: " + str);
                        }
                    }
                }
                if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Finished loading Glide modules");
                }
            } else if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Got null app info metadata");
            }
            if (generatedAppGlideModule != null && !generatedAppGlideModule.m3006c().isEmpty()) {
                Set<Class<?>> setM3006c = generatedAppGlideModule.m3006c();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    InterfaceC0831c interfaceC0831c = (InterfaceC0831c) it.next();
                    if (setM3006c.contains(interfaceC0831c.getClass())) {
                        if (Log.isLoggable("Glide", 3)) {
                            Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + interfaceC0831c);
                        }
                        it.remove();
                    }
                }
            }
            if (Log.isLoggable("Glide", 3)) {
                for (InterfaceC0831c interfaceC0831c2 : arrayList) {
                    StringBuilder sbM2191e = a.m2191e("Discovered GlideModule from manifest: ");
                    sbM2191e.append(interfaceC0831c2.getClass());
                    Log.d("Glide", sbM2191e.toString());
                }
            }
            c0617c.f3775n = null;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC0831c) it2.next()).mo2535b(applicationContext, c0617c);
            }
            ExecutorServiceC0701a.b bVar = ExecutorServiceC0701a.b.f4090b;
            if (c0617c.f3768g == null) {
                int iM2365a = ExecutorServiceC0701a.m2365a();
                if (TextUtils.isEmpty("source")) {
                    throw new IllegalArgumentException(a.m2201o("Name must be non-null and non-empty, but given: ", "source"));
                }
                c0617c.f3768g = new ExecutorServiceC0701a(new ThreadPoolExecutor(iM2365a, iM2365a, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new ExecutorServiceC0701a.a("source", bVar, false)));
            }
            if (c0617c.f3769h == null) {
                int i = ExecutorServiceC0701a.f4083c;
                if (TextUtils.isEmpty("disk-cache")) {
                    throw new IllegalArgumentException(a.m2201o("Name must be non-null and non-empty, but given: ", "disk-cache"));
                }
                c0617c.f3769h = new ExecutorServiceC0701a(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new ExecutorServiceC0701a.a("disk-cache", bVar, true)));
            }
            if (c0617c.f3776o == null) {
                int i2 = ExecutorServiceC0701a.m2365a() >= 4 ? 2 : 1;
                if (TextUtils.isEmpty("animation")) {
                    throw new IllegalArgumentException(a.m2201o("Name must be non-null and non-empty, but given: ", "animation"));
                }
                c0617c.f3776o = new ExecutorServiceC0701a(new ThreadPoolExecutor(i2, i2, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new ExecutorServiceC0701a.a("animation", bVar, true)));
            }
            if (c0617c.f3771j == null) {
                c0617c.f3771j = new C0698j(new C0698j.a(applicationContext));
            }
            if (c0617c.f3772k == null) {
                c0617c.f3772k = new C0814f();
            }
            if (c0617c.f3765d == null) {
                int i3 = c0617c.f3771j.f4066a;
                if (i3 > 0) {
                    c0617c.f3765d = new C0684j(i3);
                } else {
                    c0617c.f3765d = new C0679e();
                }
            }
            if (c0617c.f3766e == null) {
                c0617c.f3766e = new C0683i(c0617c.f3771j.f4069d);
            }
            if (c0617c.f3767f == null) {
                c0617c.f3767f = new C0696h(c0617c.f3771j.f4067b);
            }
            if (c0617c.f3770i == null) {
                c0617c.f3770i = new C0695g(applicationContext);
            }
            if (c0617c.f3764c == null) {
                c0617c.f3764c = new C0708l(c0617c.f3767f, c0617c.f3770i, c0617c.f3769h, c0617c.f3768g, new ExecutorServiceC0701a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, ExecutorServiceC0701a.f4082b, TimeUnit.MILLISECONDS, new SynchronousQueue(), new ExecutorServiceC0701a.a("source-unlimited", bVar, false))), c0617c.f3776o, false);
            }
            List<InterfaceC0845e<Object>> list = c0617c.f3777p;
            c0617c.f3777p = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
            C0619e.a aVar = c0617c.f3763b;
            Objects.requireNonNull(aVar);
            C0619e c0619e = new C0619e(aVar);
            ComponentCallbacks2C0616b componentCallbacks2C0616b = new ComponentCallbacks2C0616b(applicationContext, c0617c.f3764c, c0617c.f3767f, c0617c.f3765d, c0617c.f3766e, new C0824p(c0617c.f3775n, c0619e), c0617c.f3772k, c0617c.f3773l, c0617c.f3774m, c0617c.f3762a, c0617c.f3777p, c0619e);
            for (InterfaceC0831c interfaceC0831c3 : arrayList) {
                try {
                    interfaceC0831c3.mo2536a(applicationContext, componentCallbacks2C0616b, componentCallbacks2C0616b.f3757e);
                } catch (AbstractMethodError e) {
                    StringBuilder sbM2191e2 = a.m2191e("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ");
                    sbM2191e2.append(interfaceC0831c3.getClass().getName());
                    throw new IllegalStateException(sbM2191e2.toString(), e);
                }
            }
            applicationContext.registerComponentCallbacks(componentCallbacks2C0616b);
            f3752j = componentCallbacks2C0616b;
            f3753k = false;
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException("Unable to find metadata to parse GlideModules", e2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static ComponentCallbacks2C0616b m2205b(Context context) {
        if (f3752j == null) {
            GeneratedAppGlideModule generatedAppGlideModule = null;
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
            } catch (IllegalAccessException e) {
                m2207d(e);
                throw null;
            } catch (InstantiationException e2) {
                m2207d(e2);
                throw null;
            } catch (NoSuchMethodException e3) {
                m2207d(e3);
                throw null;
            } catch (InvocationTargetException e4) {
                m2207d(e4);
                throw null;
            }
            synchronized (ComponentCallbacks2C0616b.class) {
                if (f3752j == null) {
                    m2204a(context, generatedAppGlideModule);
                }
            }
        }
        return f3752j;
    }

    /* JADX INFO: renamed from: c */
    public static C0824p m2206c(Context context) {
        Objects.requireNonNull(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return m2205b(context).f3759g;
    }

    /* JADX INFO: renamed from: d */
    public static void m2207d(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    /* JADX INFO: renamed from: e */
    public static ComponentCallbacks2C0623i m2208e(Context context) {
        Objects.requireNonNull(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return m2205b(context).f3759g.m2526b(context);
    }

    /* JADX INFO: renamed from: f */
    public static ComponentCallbacks2C0623i m2209f(ActivityC0459e activityC0459e) {
        Objects.requireNonNull(activityC0459e, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return m2205b(activityC0459e).f3759g.m2527c(activityC0459e);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        C0875j.m2609a();
        ((C0872g) this.f3755c).m2606e(0L);
        this.f3754b.mo2329b();
        this.f3758f.mo2321b();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        long j;
        C0875j.m2609a();
        synchronized (this.f3761i) {
            Iterator<ComponentCallbacks2C0623i> it = this.f3761i.iterator();
            while (it.hasNext()) {
                Objects.requireNonNull(it.next());
            }
        }
        C0696h c0696h = (C0696h) this.f3755c;
        Objects.requireNonNull(c0696h);
        if (i >= 40) {
            c0696h.m2606e(0L);
        } else if (i >= 20 || i == 15) {
            synchronized (c0696h) {
                j = c0696h.f4734b;
            }
            c0696h.m2606e(j / 2);
        }
        this.f3754b.mo2328a(i);
        this.f3758f.mo2320a(i);
    }
}
