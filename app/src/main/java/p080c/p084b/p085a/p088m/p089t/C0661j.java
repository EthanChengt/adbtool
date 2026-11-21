package p080c.p084b.p085a.p088m.p089t;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import c.a.a.a.a;
import p080c.p084b.p085a.EnumC0620f;
import p080c.p084b.p085a.p088m.C0637e;
import p080c.p084b.p085a.p088m.EnumC0633a;
import p080c.p084b.p085a.p088m.p095v.C0729g;
import p080c.p084b.p085a.p111s.C0868c;
import p080c.p084b.p085a.p111s.C0871f;

/* JADX INFO: renamed from: c.b.a.m.t.j */
/* JADX INFO: loaded from: classes.dex */
public class C0661j implements InterfaceC0655d<InputStream> {

    /* JADX INFO: renamed from: g */
    public static final b f3962g = new a();

    /* JADX INFO: renamed from: b */
    public final C0729g f3963b;

    /* JADX INFO: renamed from: c */
    public final int f3964c;

    /* JADX INFO: renamed from: d */
    public HttpURLConnection f3965d;

    /* JADX INFO: renamed from: e */
    public InputStream f3966e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f3967f;

    /* JADX INFO: renamed from: c.b.a.m.t.j$a */
    public static class a implements b {
    }

    /* JADX INFO: renamed from: c.b.a.m.t.j$b */
    public interface b {
    }

    public C0661j(C0729g c0729g, int i) {
        this.f3963b = c0729g;
        this.f3964c = i;
    }

    /* JADX INFO: renamed from: d */
    public static int m2305d(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e);
            return -1;
        }
    }

    @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0655d
    /* JADX INFO: renamed from: a */
    public Class<InputStream> mo2291a() {
        return InputStream.class;
    }

    @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0655d
    /* JADX INFO: renamed from: b */
    public void mo2294b() {
        InputStream inputStream = this.f3966e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f3965d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f3965d = null;
    }

    @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0655d
    /* JADX INFO: renamed from: c */
    public EnumC0633a mo2295c() {
        return EnumC0633a.REMOTE;
    }

    @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0655d
    public void cancel() {
        this.f3967f = true;
    }

    @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0655d
    /* JADX INFO: renamed from: e */
    public void mo2297e(EnumC0620f enumC0620f, InterfaceC0655d.a<? super InputStream> aVar) {
        StringBuilder sb;
        int i = C0871f.f4732b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            aVar.mo2300f(m2306f(this.f3963b.m2437d(), 0, null, this.f3963b.f4303b.mo2438a()));
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
                sb.append("Finished http url fetcher fetch in ");
                sb.append(C0871f.m2603a(jElapsedRealtimeNanos));
                String string = sb.toString();
            }
        } catch (IOException e) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to load data for url", e);
            }
            aVar.mo2299d(e);
            if (!Log.isLoggable("HttpUrlFetcher", 2)) {
            } else {
                sb = new StringBuilder();
            }
        } finally {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                StringBuilder sbM2191e = a.m2191e("Finished http url fetcher fetch in ");
                sbM2191e.append(C0871f.m2603a(jElapsedRealtimeNanos));
                Log.v("HttpUrlFetcher", sbM2191e.toString());
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final InputStream m2306f(URL url, int i, URL url2, Map<String, String> map) throws C0637e {
        InputStream inputStream;
        if (i >= 5) {
            throw new C0637e("Too many (> 5) redirects!", -1, null);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new C0637e("In re-direct loop", -1, null);
                }
            } catch (URISyntaxException unused) {
            }
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
            }
            httpURLConnection.setConnectTimeout(this.f3964c);
            httpURLConnection.setReadTimeout(this.f3964c);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.f3965d = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.f3966e = this.f3965d.getInputStream();
                if (this.f3967f) {
                    return null;
                }
                int iM2305d = m2305d(this.f3965d);
                int i2 = iM2305d / 100;
                if (i2 == 2) {
                    HttpURLConnection httpURLConnection2 = this.f3965d;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            inputStream = new C0868c(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                            }
                            inputStream = httpURLConnection2.getInputStream();
                        }
                        this.f3966e = inputStream;
                        return inputStream;
                    } catch (IOException e) {
                        throw new C0637e("Failed to obtain InputStream", m2305d(httpURLConnection2), e);
                    }
                }
                if (!(i2 == 3)) {
                    if (iM2305d == -1) {
                        throw new C0637e("Http request failed", iM2305d, null);
                    }
                    try {
                        throw new C0637e(this.f3965d.getResponseMessage(), iM2305d, null);
                    } catch (IOException e2) {
                        throw new C0637e("Failed to get a response message", iM2305d, e2);
                    }
                }
                String headerField = this.f3965d.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new C0637e("Received empty or null redirect url", iM2305d, null);
                }
                try {
                    URL url3 = new URL(url, headerField);
                    mo2294b();
                    return m2306f(url3, i + 1, url, map);
                } catch (MalformedURLException e3) {
                    throw new C0637e(a.m2201o("Bad redirect url: ", headerField), iM2305d, e3);
                }
            } catch (IOException e4) {
                throw new C0637e("Failed to connect or obtain data", m2305d(this.f3965d), e4);
            }
        } catch (IOException e5) {
            throw new C0637e("URL.openConnection threw", 0, e5);
        }
    }
}
