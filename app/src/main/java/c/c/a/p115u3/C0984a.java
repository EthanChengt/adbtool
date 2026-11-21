package c.c.a.p115u3;

/* JADX INFO: renamed from: c.c.a.u3.a */
/* JADX INFO: loaded from: classes.dex */
public class C0984a {

    /* JADX INFO: renamed from: a */
    public String f4926a;

    /* JADX INFO: renamed from: b */
    public String f4927b;

    /* JADX INFO: renamed from: c */
    public String f4928c;

    /* JADX INFO: renamed from: d */
    public String f4929d;

    public C0984a(String str) {
        String strSubstring;
        String[] strArrSplit = str.split("\\s+");
        this.f4926a = strArrSplit[0];
        this.f4927b = strArrSplit[1];
        if (strArrSplit.length == 6) {
            strArrSplit[2].substring(8);
            this.f4928c = strArrSplit[3].substring(6);
            strArrSplit[4].substring(6);
            strSubstring = strArrSplit[5].substring(13);
        } else {
            strSubstring = str.contains("transport_id:") ? str.substring(str.lastIndexOf("transport_id:") + 13) : "1";
        }
        this.f4929d = strSubstring;
    }
}
