package c.c.a.v3.k0;

import com.didjdk.adbhelper.R;

/* JADX INFO: renamed from: c.c.a.v3.k0.v */
/* JADX INFO: loaded from: classes.dex */
public class C1056v {

    /* JADX INFO: renamed from: a */
    public String[] f5246a;

    /* JADX INFO: renamed from: b */
    public int f5247b;

    /* JADX INFO: renamed from: c */
    public String f5248c;

    /* JADX INFO: renamed from: d */
    public String f5249d;

    /* JADX INFO: renamed from: e */
    public String f5250e;

    /* JADX INFO: renamed from: f */
    public String f5251f;

    /* JADX INFO: renamed from: g */
    public String f5252g;

    /* JADX INFO: renamed from: h */
    public String f5253h;

    /* JADX INFO: renamed from: i */
    public String f5254i;

    /* JADX INFO: renamed from: j */
    public float f5255j;

    /* JADX INFO: renamed from: k */
    public String f5256k;

    /* JADX INFO: renamed from: l */
    public String f5257l;

    /* JADX INFO: renamed from: m */
    public String f5258m;

    /* JADX INFO: renamed from: n */
    public String f5259n;

    /* JADX INFO: renamed from: o */
    public int f5260o;

    /* JADX INFO: renamed from: p */
    public String f5261p;

    /* JADX INFO: renamed from: q */
    public boolean f5262q;

    /* JADX INFO: renamed from: r */
    public boolean f5263r = false;

    /* JADX WARN: Code duplicated, block: B:100:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:101:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:103:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:104:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:106:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:107:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:116:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:30:0x0074  */
    /* JADX WARN: Code duplicated, block: B:33:0x0088  */
    /* JADX WARN: Code duplicated, block: B:35:0x0096  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:45:0x010b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0110  */
    /* JADX WARN: Code duplicated, block: B:48:0x0121  */
    /* JADX WARN: Code duplicated, block: B:51:0x0131  */
    /* JADX WARN: Code duplicated, block: B:53:0x0137  */
    /* JADX WARN: Code duplicated, block: B:54:0x014c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0174  */
    /* JADX WARN: Code duplicated, block: B:64:0x0188  */
    /* JADX WARN: Code duplicated, block: B:65:0x018c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0196  */
    /* JADX WARN: Code duplicated, block: B:68:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:70:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:71:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:73:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:74:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:78:0x0235  */
    /* JADX WARN: Code duplicated, block: B:81:0x023f  */
    /* JADX WARN: Code duplicated, block: B:82:0x024c  */
    /* JADX WARN: Code duplicated, block: B:85:0x0252  */
    /* JADX WARN: Code duplicated, block: B:86:0x0256 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x0258  */
    /* JADX WARN: Code duplicated, block: B:89:0x025f  */
    /* JADX WARN: Code duplicated, block: B:91:0x0269  */
    /* JADX WARN: Code duplicated, block: B:92:0x0272  */
    /* JADX WARN: Code duplicated, block: B:94:0x027c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0285  */
    /* JADX WARN: Code duplicated, block: B:97:0x028f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0297  */
    public C1056v(String str, String str2, boolean z) {
        int i;
        String[] strArr;
        int i2;
        String str3;
        float f;
        StringBuilder sb;
        String str4;
        String string;
        int i3;
        String str5;
        int i4;
        String[] strArr2;
        int i5;
        this.f5262q = true;
        this.f5258m = str2;
        int i6 = z ? 6 : 8;
        String[] strArrSplit = str.trim().split("\\s+", i6);
        this.f5246a = strArrSplit;
        if (strArrSplit.length >= i6) {
            int i7 = i6 - 1;
            if (!strArrSplit[i7].equals(".") && !this.f5246a[i7].equals("..")) {
                this.f5262q = true;
                char cCharAt = this.f5246a[0].charAt(0);
                try {
                    if (cCharAt == '-') {
                        i = 2;
                    } else if (cCharAt == 'l') {
                        i = 1;
                    } else {
                        if (cCharAt != 'p') {
                            switch (cCharAt) {
                                case 'b':
                                    i = 3;
                                    break;
                                case 'c':
                                    i = 4;
                                    break;
                                case 'd':
                                    this.f5247b = 0;
                                    break;
                                default:
                                    this.f5262q = false;
                                    break;
                            }
                            if (this.f5246a[0].contains("?")) {
                                this.f5262q = false;
                            }
                            this.f5248c = this.f5246a[0].substring(1);
                            if (z) {
                                strArr2 = this.f5246a;
                                this.f5249d = strArr2[1];
                                this.f5250e = strArr2[2];
                                i5 = this.f5247b;
                                if (i5 == 2) {
                                    this.f5251f = strArr2[3];
                                    this.f5252g = strArr2[4];
                                    this.f5253h = strArr2[5].split("\\s+", 2)[0];
                                    str3 = this.f5246a[5].split("\\s+", 2)[1];
                                } else if (i5 != 0 || i5 == 1) {
                                    this.f5251f = "0";
                                    this.f5252g = strArr2[3];
                                    this.f5253h = strArr2[4];
                                    if (i5 == 1) {
                                        this.f5254i = strArr2[5].split(" ->")[0];
                                        String str6 = this.f5246a[5].split(" ->")[1];
                                    }
                                    if (this.f5247b == 0) {
                                        str3 = this.f5246a[5];
                                    }
                                } else {
                                    this.f5251f = strArr2[3].replace(",", "");
                                    this.f5252g = this.f5246a[5].split("\\s+", 3)[0];
                                    this.f5253h = this.f5246a[5].split("\\s+", 3)[1];
                                    str3 = this.f5246a[5].split("\\s+", 3)[2];
                                }
                                this.f5254i = str3;
                            } else {
                                strArr = this.f5246a;
                                String str7 = strArr[1];
                                this.f5249d = strArr[2];
                                this.f5250e = strArr[3];
                                i2 = this.f5247b;
                                if (i2 <= 2) {
                                    this.f5251f = strArr[4];
                                    this.f5252g = strArr[5];
                                    this.f5253h = strArr[6];
                                    if (i2 != 0 || i2 == 2) {
                                        this.f5254i = strArr[7];
                                    }
                                    if (i2 == 1) {
                                        this.f5254i = strArr[7].split(" ->", 2)[0];
                                        String str8 = this.f5246a[7].split(" ->")[1];
                                    }
                                } else {
                                    this.f5251f = strArr[4].replace(",", "");
                                    String[] strArr3 = this.f5246a;
                                    this.f5252g = strArr3[6];
                                    this.f5253h = strArr3[7].split("\\s+", 2)[0];
                                    str3 = this.f5246a[7].split("\\s+", 2)[1];
                                    this.f5254i = str3;
                                }
                            }
                            if (this.f5247b == 0) {
                                this.f5255j = 4096.0f;
                            }
                            this.f5255j = Float.parseFloat(this.f5251f);
                            if (this.f5247b == 0) {
                                string = "文件夹";
                            } else {
                                f = this.f5255j;
                                if (f >= 1.0737418E9f) {
                                    sb = new StringBuilder();
                                    sb.append(String.format("%.2f", Float.valueOf(this.f5255j / 1.0737418E9f)));
                                    str4 = " GB";
                                } else if (f >= 1048576.0f) {
                                    sb = new StringBuilder();
                                    sb.append(String.format("%.2f", Float.valueOf(this.f5255j / 1048576.0f)));
                                    str4 = " MB";
                                } else if (f >= 1024.0f) {
                                    sb = new StringBuilder();
                                    sb.append(String.format("%.2f", Float.valueOf(this.f5255j / 1024.0f)));
                                    str4 = " KB";
                                } else {
                                    sb = new StringBuilder();
                                    sb.append(String.format("%.0f", Float.valueOf(this.f5255j)));
                                    str4 = " B";
                                }
                                sb.append(str4);
                                string = sb.toString();
                            }
                            this.f5256k = string;
                            this.f5257l = this.f5258m + "/" + m2676a(this.f5254i);
                            if (this.f5247b == 0) {
                                this.f5259n = "";
                            }
                            if (this.f5254i.contains(".")) {
                                String str9 = this.f5254i;
                                this.f5259n = str9.substring(str9.lastIndexOf("."));
                            } else {
                                this.f5259n = ".";
                            }
                            i3 = this.f5247b;
                            if (i3 == 0) {
                                i4 = R.drawable.bd;
                            } else {
                                if (i3 == 1) {
                                    if (this.f5259n.equals(".apk")) {
                                        this.f5260o = R.drawable.bb;
                                        str5 = "application/vnd.android.package-archive";
                                    } else if (this.f5259n.equals(".zip")) {
                                        this.f5260o = R.drawable.bn;
                                        str5 = "application/zip";
                                    } else if (this.f5259n.equals(".txt")) {
                                        this.f5260o = R.drawable.bk;
                                        str5 = "text/plain";
                                    } else if (this.f5259n.equals(".pdf")) {
                                        this.f5260o = R.drawable.bh;
                                        str5 = "application/pdf";
                                    } else if (this.f5259n.equals(".jpg")) {
                                        this.f5260o = R.drawable.be;
                                        str5 = "image/jpeg";
                                    } else if (this.f5259n.equals(".png")) {
                                        this.f5260o = R.drawable.be;
                                        str5 = "image/png";
                                    } else if (!this.f5259n.equals(".mp3") || this.f5259n.equals(".m4a")) {
                                        this.f5260o = R.drawable.bg;
                                        str5 = "audio/*";
                                    } else if (this.f5259n.equals(".mp4")) {
                                        this.f5260o = R.drawable.e7;
                                        str5 = "video/*";
                                    } else {
                                        this.f5260o = R.drawable.bl;
                                        str5 = "*/*";
                                    }
                                    this.f5261p = str5;
                                    return;
                                }
                                i4 = R.drawable.bf;
                            }
                            this.f5260o = i4;
                            return;
                        }
                        i = 5;
                    }
                    this.f5255j = Float.parseFloat(this.f5251f);
                } catch (NumberFormatException unused) {
                    this.f5255j = 0.0f;
                }
                this.f5247b = i;
                if (this.f5246a[0].contains("?")) {
                    this.f5262q = false;
                }
                this.f5248c = this.f5246a[0].substring(1);
                if (z) {
                    strArr2 = this.f5246a;
                    this.f5249d = strArr2[1];
                    this.f5250e = strArr2[2];
                    i5 = this.f5247b;
                    if (i5 == 2) {
                        this.f5251f = strArr2[3];
                        this.f5252g = strArr2[4];
                        this.f5253h = strArr2[5].split("\\s+", 2)[0];
                        str3 = this.f5246a[5].split("\\s+", 2)[1];
                    } else if (i5 != 0) {
                        this.f5251f = "0";
                        this.f5252g = strArr2[3];
                        this.f5253h = strArr2[4];
                        if (i5 == 1) {
                            this.f5254i = strArr2[5].split(" ->")[0];
                            String str10 = this.f5246a[5].split(" ->")[1];
                        }
                        if (this.f5247b == 0) {
                            str3 = this.f5246a[5];
                        }
                    } else {
                        this.f5251f = "0";
                        this.f5252g = strArr2[3];
                        this.f5253h = strArr2[4];
                        if (i5 == 1) {
                            this.f5254i = strArr2[5].split(" ->")[0];
                            String str11 = this.f5246a[5].split(" ->")[1];
                        }
                        if (this.f5247b == 0) {
                            str3 = this.f5246a[5];
                        }
                    }
                    this.f5254i = str3;
                } else {
                    strArr = this.f5246a;
                    String str12 = strArr[1];
                    this.f5249d = strArr[2];
                    this.f5250e = strArr[3];
                    i2 = this.f5247b;
                    if (i2 <= 2) {
                        this.f5251f = strArr[4];
                        this.f5252g = strArr[5];
                        this.f5253h = strArr[6];
                        if (i2 != 0) {
                            this.f5254i = strArr[7];
                        } else {
                            this.f5254i = strArr[7];
                        }
                        if (i2 == 1) {
                            this.f5254i = strArr[7].split(" ->", 2)[0];
                            String str13 = this.f5246a[7].split(" ->")[1];
                        }
                    } else {
                        this.f5251f = strArr[4].replace(",", "");
                        String[] strArr4 = this.f5246a;
                        this.f5252g = strArr4[6];
                        this.f5253h = strArr4[7].split("\\s+", 2)[0];
                        str3 = this.f5246a[7].split("\\s+", 2)[1];
                        this.f5254i = str3;
                    }
                }
                if (this.f5247b == 0) {
                    this.f5255j = 4096.0f;
                }
                if (this.f5247b == 0) {
                    string = "文件夹";
                } else {
                    f = this.f5255j;
                    if (f >= 1.0737418E9f) {
                        sb = new StringBuilder();
                        sb.append(String.format("%.2f", Float.valueOf(this.f5255j / 1.0737418E9f)));
                        str4 = " GB";
                    } else if (f >= 1048576.0f) {
                        sb = new StringBuilder();
                        sb.append(String.format("%.2f", Float.valueOf(this.f5255j / 1048576.0f)));
                        str4 = " MB";
                    } else if (f >= 1024.0f) {
                        sb = new StringBuilder();
                        sb.append(String.format("%.2f", Float.valueOf(this.f5255j / 1024.0f)));
                        str4 = " KB";
                    } else {
                        sb = new StringBuilder();
                        sb.append(String.format("%.0f", Float.valueOf(this.f5255j)));
                        str4 = " B";
                    }
                    sb.append(str4);
                    string = sb.toString();
                }
                this.f5256k = string;
                this.f5257l = this.f5258m + "/" + m2676a(this.f5254i);
                if (this.f5247b == 0) {
                    this.f5259n = "";
                }
                if (this.f5254i.contains(".")) {
                    String str14 = this.f5254i;
                    this.f5259n = str14.substring(str14.lastIndexOf("."));
                } else {
                    this.f5259n = ".";
                }
                i3 = this.f5247b;
                if (i3 == 0) {
                    i4 = R.drawable.bd;
                } else {
                    if (i3 == 1) {
                        if (this.f5259n.equals(".apk")) {
                            this.f5260o = R.drawable.bb;
                            str5 = "application/vnd.android.package-archive";
                        } else if (this.f5259n.equals(".zip")) {
                            this.f5260o = R.drawable.bn;
                            str5 = "application/zip";
                        } else if (this.f5259n.equals(".txt")) {
                            this.f5260o = R.drawable.bk;
                            str5 = "text/plain";
                        } else if (this.f5259n.equals(".pdf")) {
                            this.f5260o = R.drawable.bh;
                            str5 = "application/pdf";
                        } else if (this.f5259n.equals(".jpg")) {
                            this.f5260o = R.drawable.be;
                            str5 = "image/jpeg";
                        } else if (this.f5259n.equals(".png")) {
                            this.f5260o = R.drawable.be;
                            str5 = "image/png";
                        } else if (this.f5259n.equals(".mp3")) {
                            this.f5260o = R.drawable.bg;
                            str5 = "audio/*";
                        } else {
                            this.f5260o = R.drawable.bg;
                            str5 = "audio/*";
                        }
                        this.f5261p = str5;
                        return;
                    }
                    i4 = R.drawable.bf;
                }
                this.f5260o = i4;
                return;
            }
        }
        this.f5262q = false;
    }

    /* JADX INFO: renamed from: a */
    public static String m2676a(String str) {
        return str.replaceAll("([\\s()/&'])", "\\\\$1");
    }
}
