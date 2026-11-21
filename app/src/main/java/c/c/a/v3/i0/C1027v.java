package c.c.a.v3.i0;

import java.io.File;
import org.json.JSONObject;

/* JADX INFO: renamed from: c.c.a.v3.i0.v */
/* JADX INFO: loaded from: classes.dex */
public class C1027v {

    /* JADX INFO: renamed from: a */
    public String f5089a;

    /* JADX INFO: renamed from: b */
    public long f5090b;

    /* JADX INFO: renamed from: c */
    public String f5091c;

    /* JADX INFO: renamed from: d */
    public String f5092d;

    /* JADX INFO: renamed from: e */
    public boolean f5093e;

    /* JADX INFO: renamed from: f */
    public boolean f5094f;

    /* JADX INFO: renamed from: g */
    public boolean f5095g;

    /* JADX INFO: renamed from: h */
    public String f5096h;

    /* JADX INFO: renamed from: i */
    public String f5097i;

    /* JADX INFO: renamed from: j */
    public int f5098j;

    /* JADX INFO: renamed from: k */
    public int f5099k;

    /* JADX INFO: renamed from: l */
    public long f5100l;

    /* JADX INFO: renamed from: m */
    public long f5101m;

    /* JADX INFO: renamed from: n */
    public int f5102n;

    /* JADX INFO: renamed from: o */
    public String f5103o;

    /* JADX INFO: renamed from: p */
    public File f5104p;

    public C1027v() {
        this.f5096h = "";
    }

    public C1027v(JSONObject jSONObject) {
        this.f5096h = "";
        this.f5091c = jSONObject.optString("package");
        this.f5089a = jSONObject.optString("apkPath");
        this.f5090b = jSONObject.optLong("apkSize");
        this.f5092d = jSONObject.optString("label");
        this.f5093e = jSONObject.optBoolean("hasIcon");
        this.f5102n = jSONObject.optInt("flags");
        this.f5094f = jSONObject.optBoolean("enabled");
        this.f5097i = jSONObject.optString("versionName");
        jSONObject.optInt("versionCode");
        this.f5098j = jSONObject.optInt("minSdkVersion");
        this.f5099k = jSONObject.optInt("targetSdkVersion");
        this.f5100l = jSONObject.optLong("firstInstallTime");
        this.f5101m = jSONObject.optLong("lastUpdateTime");
        this.f5096h = jSONObject.optString("mainActivity");
        jSONObject.optString("permission");
        this.f5095g = (this.f5102n & 1) != 0;
    }
}
