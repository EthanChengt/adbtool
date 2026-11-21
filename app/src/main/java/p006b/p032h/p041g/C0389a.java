package p006b.p032h.p041g;

import android.util.Base64;
import java.util.List;
import java.util.Objects;
import c.a.a.a.a;

/* JADX INFO: renamed from: b.h.g.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0389a {

    /* JADX INFO: renamed from: a */
    public final String f2627a;

    /* JADX INFO: renamed from: b */
    public final String f2628b;

    /* JADX INFO: renamed from: c */
    public final String f2629c;

    /* JADX INFO: renamed from: d */
    public final List<List<byte[]>> f2630d;

    /* JADX INFO: renamed from: e */
    public final String f2631e;

    public C0389a(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f2627a = str;
        this.f2628b = str2;
        this.f2629c = str3;
        Objects.requireNonNull(list);
        this.f2630d = list;
        this.f2631e = str + "-" + str2 + "-" + str3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sbM2191e = a.m2191e("FontRequest {mProviderAuthority: ");
        sbM2191e.append(this.f2627a);
        sbM2191e.append(", mProviderPackage: ");
        sbM2191e.append(this.f2628b);
        sbM2191e.append(", mQuery: ");
        sbM2191e.append(this.f2629c);
        sbM2191e.append(", mCertificates:");
        sb.append(sbM2191e.toString());
        for (int i = 0; i < this.f2630d.size(); i++) {
            sb.append(" [");
            List<byte[]> list = this.f2630d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        return a.m2203q(sb, "}", "mCertificatesArray: 0");
    }
}
