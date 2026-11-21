package c.c.a.v3.m0;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.didjdk.adbhelper.R;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import p006b.p008b.p009c.DialogInterfaceC0193i;
import p006b.p067s.C0532j;
import b.s.m;
import c.a.a.a.a;
import c.c.a.q3;
import c.c.a.v3.g0;
import c.c.a.y3.c;
import c.c.a.y3.d;
import c.c.a.y3.e;
import c.c.a.y3.g;
import c.c.a.y3.h;
import c.c.a.y3.k;
import c.c.a.y3.ViewOnClickListenerC1154i;

/* JADX INFO: renamed from: c.c.a.v3.m0.z */
/* JADX INFO: loaded from: classes.dex */
public class C1102z extends g0 {

    /* JADX INFO: renamed from: A0 */
    public RecyclerView f5384A0;

    /* JADX INFO: renamed from: B0 */
    public List<C1101y> f5385B0;

    /* JADX INFO: renamed from: C0 */
    public C1100x f5386C0;

    /* JADX INFO: renamed from: X */
    public String f5387X;

    /* JADX INFO: renamed from: Y */
    public String f5388Y;

    /* JADX INFO: renamed from: Z */
    public q3 f5389Z;

    /* JADX INFO: renamed from: a0 */
    public StringBuilder f5390a0;

    /* JADX INFO: renamed from: p0 */
    public String f5405p0;

    /* JADX INFO: renamed from: t0 */
    public TextView f5409t0;

    /* JADX INFO: renamed from: u0 */
    public k f5410u0;

    /* JADX INFO: renamed from: v0 */
    public e f5411v0;

    /* JADX INFO: renamed from: w0 */
    public k f5412w0;

    /* JADX INFO: renamed from: z0 */
    public View f5415z0;

    /* JADX INFO: renamed from: b0 */
    public final String f5391b0 = a.q();

    /* JADX INFO: renamed from: c0 */
    public final String f5392c0 = a.q();

    /* JADX INFO: renamed from: d0 */
    public final String f5393d0 = a.q();

    /* JADX INFO: renamed from: e0 */
    public final String f5394e0 = a.q();

    /* JADX INFO: renamed from: f0 */
    public final String f5395f0 = a.q();

    /* JADX INFO: renamed from: g0 */
    public final String f5396g0 = a.q();

    /* JADX INFO: renamed from: h0 */
    public final String f5397h0 = a.q();

    /* JADX INFO: renamed from: i0 */
    public final String f5398i0 = a.q();

    /* JADX INFO: renamed from: j0 */
    public final String f5399j0 = a.q();

    /* JADX INFO: renamed from: k0 */
    public final String f5400k0 = a.q();

    /* JADX INFO: renamed from: l0 */
    public final String f5401l0 = a.q();

    /* JADX INFO: renamed from: m0 */
    public final String f5402m0 = a.q();

    /* JADX INFO: renamed from: n0 */
    public final String f5403n0 = a.q();

    /* JADX INFO: renamed from: o0 */
    public boolean f5404o0 = false;

    /* JADX INFO: renamed from: q0 */
    public boolean f5406q0 = true;

    /* JADX INFO: renamed from: r0 */
    public boolean f5407r0 = false;

    /* JADX INFO: renamed from: s0 */
    public boolean f5408s0 = false;

    /* JADX INFO: renamed from: x0 */
    public ArrayList<b> f5413x0 = new ArrayList<>();

    /* JADX INFO: renamed from: y0 */
    public ArrayList<b> f5414y0 = new ArrayList<>();

    /* JADX INFO: renamed from: c.c.a.v3.m0.z$a */
    public class a implements Handler.Callback {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v13, types: [int] */
        /* JADX WARN: Type inference failed for: r4v16 */
        /* JADX WARN: Type inference failed for: r4v42 */
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            final C1102z c1102z = C1102z.this;
            c1102z.f5390a0.append((String) message.obj);
            if (c1102z.f5390a0.toString().contains(c1102z.f5391b0)) {
                if (c1102z.f5408s0) {
                    c1102z.f5386C0.f947a.m542b();
                }
                String[] strArrSplit = c1102z.f5390a0.toString().split("\n");
                for (int i = 0; i < strArrSplit.length; i++) {
                    if (i > 0 && strArrSplit[i].contains(c1102z.f5391b0) && strArrSplit[i - 1].trim().matches("\\d{2,}")) {
                        c1102z.f5407r0 = true;
                        if (c1102z.f5408s0) {
                            c1102z.f5406q0 = false;
                            C1101y c1101y = c1102z.f5385B0.get(0);
                            c1101y.f5381e = true;
                            c1102z.f5406q0 = true;
                            c1101y.f5379c = c1102z.m337y(R.string.em);
                            c1102z.f5386C0.f947a.m542b();
                        }
                    }
                }
                StringBuilder sb = c1102z.f5390a0;
                sb.delete(0, c1102z.f5391b0.length() + sb.lastIndexOf(c1102z.f5391b0));
            }
            if (c1102z.f5390a0.toString().contains(c1102z.f5392c0)) {
                String string = c1102z.f5390a0.toString();
                c1102z.f5388Y = string;
                for (b bVar : c1102z.f5413x0) {
                    if (string.contains(bVar.f5419c)) {
                        c1102z.f5414y0.add(bVar);
                    }
                }
                StringBuilder sb2 = c1102z.f5390a0;
                sb2.delete(0, sb2.length());
            }
            if (c1102z.f5390a0.toString().contains(c1102z.f5393d0)) {
                c1102z.f5410u0.f5553a.dismiss();
                if (new File(c1102z.f5387X).exists()) {
                    final h c1153h = new h(c1102z.m303h());
                    c1153h.m2714e(c1102z.m337y(R.string.ep));
                    String strM337y = c1102z.m337y(R.string.aq);
                    c1153h.f5545g.setVisibility(0);
                    c1153h.f5545g.setText(strM337y);
                    c1153h.f5545g.setOnClickListener(new ViewOnClickListenerC1154i(c1153h));
                    c1153h.m2711b(c1102z.m337y(R.string.g5));
                    c1153h.f5544f.setOnClickListener(new View.OnClickListener() { // from class: c.c.a.v3.m0.l
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C1102z c1102z2 = c1102z;
                            h c1153h2 = c1153h;
                            String str = C0532j.m1940a(c1102z2.m303h()).getString("screencap_path", c1102z2.m303h().getExternalCacheDir().getAbsolutePath()) + "/screenshot_" + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + ".png";
                            q3 runnableC0964q3 = c1102z2.f5389Z;
                            StringBuilder sbM2191e = a.m2191e("mv ");
                            sbM2191e.append(c1102z2.f5387X);
                            sbM2191e.append(" ");
                            sbM2191e.append(str);
                            sbM2191e.append(" > /dev/null 2>&1");
                            runnableC0964q3.m2627c(sbM2191e.toString());
                            m.m1952H(c1102z2.m303h(), c1102z2.m337y(R.string.g8) + str);
                            c1153h2.f5539a.dismiss();
                        }
                    });
                    c1153h.m2712c(c1102z.m337y(R.string.ej));
                    c1153h.f5543e.setOnClickListener(new View.OnClickListener() { // from class: c.c.a.v3.m0.k
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C1102z c1102z2 = c1102z;
                            h c1153h2 = c1153h;
                            Objects.requireNonNull(c1102z2);
                            Uri uriMo197b = FileProvider.m194a(c1102z2.m303h(), "com.didjdk.adbhelper.fileprovider").mo197b(new File(c1102z2.m303h().getCacheDir(), "tmp/screenshot.png"));
                            Intent intent = new Intent("android.intent.action.VIEW");
                            intent.setDataAndType(uriMo197b, "image/*");
                            intent.addFlags(1);
                            c1102z2.m303h().startActivity(intent);
                            c1153h2.f5539a.dismiss();
                        }
                    });
                    c1153h.f5539a.show();
                }
                StringBuilder sb3 = c1102z.f5390a0;
                sb3.delete(0, sb3.length());
            }
            if (c1102z.f5390a0.toString().contains(c1102z.f5394e0)) {
                String[] strArrSplit2 = c1102z.f5390a0.toString().split("\n");
                if (strArrSplit2[strArrSplit2.length - 2].trim().matches(".+:.+")) {
                    String str = strArrSplit2[strArrSplit2.length - 2].trim().split(":")[1];
                } else {
                    m.m1952H(c1102z.m303h(), c1102z.m337y(R.string.bx));
                }
                StringBuilder sb4 = c1102z.f5390a0;
                sb4.delete(0, sb4.length());
            }
            if (c1102z.f5390a0.toString().contains(c1102z.f5397h0)) {
                k c1156k = c1102z.f5412w0;
                if (c1156k != null) {
                    c1156k.f5553a.dismiss();
                }
                float[] fArr = {1.0f, 1.0f, 1.0f};
                int i2 = 0;
                for (String str2 : c1102z.f5390a0.toString().split("\n")) {
                    if (i2 < 3) {
                        try {
                            fArr[i2] = Float.parseFloat(str2.trim());
                            i2++;
                        } catch (Exception unused) {
                        }
                    }
                }
                DialogInterfaceC0193i dialogInterfaceC0193iM779a = new DialogInterfaceC0193i.a(c1102z.m303h()).m779a();
                dialogInterfaceC0193iM779a.getWindow().setBackgroundDrawableResource(R.color.f3);
                View viewInflate = View.inflate(c1102z.m303h(), R.layout.ar, null);
                EditText editText = (EditText) viewInflate.findViewById(R.id.rf);
                StringBuilder sbM2191e = a.m2191e("");
                sbM2191e.append(fArr[0]);
                editText.setText(sbM2191e.toString());
                EditText editText2 = (EditText) viewInflate.findViewById(R.id.pj);
                StringBuilder sbM2191e2 = a.m2191e("");
                sbM2191e2.append(fArr[1]);
                editText2.setText(sbM2191e2.toString());
                EditText editText3 = (EditText) viewInflate.findViewById(R.id.bi);
                StringBuilder sbM2191e3 = a.m2191e("");
                sbM2191e3.append(fArr[2]);
                editText3.setText(sbM2191e3.toString());
                SeekBar seekBar = (SeekBar) viewInflate.findViewById(R.id.mr);
                seekBar.setProgress((int) (fArr[0] * 20.0f));
                seekBar.setOnSeekBarChangeListener(new C1072a0(c1102z, editText));
                SeekBar seekBar2 = (SeekBar) viewInflate.findViewById(R.id.mq);
                seekBar2.setProgress((int) (fArr[1] * 20.0f));
                seekBar2.setOnSeekBarChangeListener(new C1074b0(c1102z, editText2));
                SeekBar seekBar3 = (SeekBar) viewInflate.findViewById(R.id.mp);
                seekBar3.setProgress((int) (fArr[2] * 20.0f));
                seekBar3.setOnSeekBarChangeListener(new C1076c0(c1102z, editText3));
                ((Button) viewInflate.findViewById(R.id.jn)).setOnClickListener(new ViewOnClickListenerC1078d0(c1102z, editText, editText2, editText3, dialogInterfaceC0193iM779a));
                ((Button) viewInflate.findViewById(R.id.jk)).setOnClickListener(new ViewOnClickListenerC1080e0(c1102z, dialogInterfaceC0193iM779a));
                AlertController alertController = dialogInterfaceC0193iM779a.f1244d;
                alertController.f90h = viewInflate;
                alertController.f91i = 0;
                alertController.f96n = false;
                dialogInterfaceC0193iM779a.show();
                StringBuilder sb5 = c1102z.f5390a0;
                sb5.delete(0, sb5.length());
            }
            if (c1102z.f5390a0.toString().contains(c1102z.f5402m0)) {
                k c1156k2 = c1102z.f5412w0;
                if (c1156k2 != null) {
                    c1156k2.f5553a.dismiss();
                }
                String[] strArrSplit3 = c1102z.f5390a0.toString().split("\n");
                String strTrim = strArrSplit3[Math.max(0, strArrSplit3.length - 2)].trim();
                if (strTrim.equals("device_default") || strTrim.equals("enabled") || strTrim.equals("disabled")) {
                    final int Equals = strTrim.equals("enabled") ? 1 : 0;
                    if (strTrim.equals("disabled")) {
                        Equals = 2;
                    }
                    DialogInterfaceC0193i.a aVar = new DialogInterfaceC0193i.a(c1102z.m303h());
                    final String[] strArr = {"设备默认设置", "已启用", "已禁用"};
                    final String[] strArr2 = {"device_default", "enabled", "disabled"};
                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: c.c.a.v3.m0.q
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i3) {
                            C1102z c1102z2 = c1102z;
                            int i4 = Equals;
                            String[] strArr3 = strArr2;
                            String[] strArr4 = strArr;
                            Objects.requireNonNull(c1102z2);
                            if (i3 != i4) {
                                c1102z2.f5389Z.m2627c(c1102z2.f4967W + "shell settings put global cached_apps_freezer " + strArr3[i3] + ";echo " + c1102z2.f5403n0);
                                m.m1952H(c1102z2.m309k(), strArr4[i3]);
                            }
                            dialogInterface.dismiss();
                        }
                    };
                    AlertController.C0020b c0020b = aVar.f1245a;
                    c0020b.f123l = strArr;
                    c0020b.f125n = onClickListener;
                    c0020b.f130s = Equals;
                    c0020b.f129r = true;
                    c0020b.f115d = "暂停执行缓存的应用";
                    aVar.m779a().show();
                } else {
                    m.m1952H(c1102z.m309k(), "该设备可能不支持墓碑模式");
                }
                StringBuilder sb6 = c1102z.f5390a0;
                sb6.delete(0, sb6.length());
            }
            if (c1102z.f5390a0.toString().contains(c1102z.f5399j0)) {
                String strReplace = "";
                String string2 = strReplace;
                for (String str3 : c1102z.f5390a0.toString().split("\n")) {
                    if (str3.trim().matches("Physical size:.+")) {
                        strReplace = str3.replace("Physical size", "当前分辨率");
                    } else if (str3.trim().matches("Override size:.+")) {
                        StringBuilder sbM2191e4 = a.m2191e("\n");
                        sbM2191e4.append(str3.replace("Override size", "当前分辨率"));
                        string2 = sbM2191e4.toString();
                        strReplace = strReplace.replace("当前分辨率", "物理分辨率");
                    }
                }
                e c1150e = c1102z.f5411v0;
                if (c1150e != null) {
                    c1150e.f5520d.setText(strReplace + string2);
                }
                StringBuilder sb7 = c1102z.f5390a0;
                sb7.delete(0, sb7.length());
            }
            if (c1102z.f5390a0.toString().contains(c1102z.f5398i0)) {
                m.m1952H(c1102z.m303h(), "操作完成");
                StringBuilder sb8 = c1102z.f5390a0;
                sb8.delete(0, sb8.length());
            }
            if (c1102z.f5390a0.toString().contains(c1102z.f5400k0)) {
                m.m1952H(c1102z.m303h(), "操作完成");
                StringBuilder sb9 = c1102z.f5390a0;
                sb9.delete(0, sb9.length());
            }
            if (c1102z.f5390a0.toString().contains(c1102z.f5401l0)) {
                m.m1952H(c1102z.m303h(), "操作完成");
                StringBuilder sb10 = c1102z.f5390a0;
                sb10.delete(0, sb10.length());
            }
            if (c1102z.f5390a0.toString().contains(c1102z.f5403n0)) {
                StringBuilder sb11 = c1102z.f5390a0;
                sb11.delete(0, sb11.length());
            }
            if (c1102z.f5390a0.toString().contains(c1102z.f5395f0)) {
                c1102z.f5404o0 = true;
            }
            if (c1102z.f5404o0) {
                c1102z.f5409t0.append(((String) message.obj).replace(c1102z.f5395f0, "").replace(c1102z.f5396g0, ""));
                if (c1102z.f5390a0.toString().contains(c1102z.f5396g0)) {
                    c1102z.f5404o0 = false;
                    StringBuilder sb12 = c1102z.f5390a0;
                    sb12.delete(0, sb12.length());
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: c.c.a.v3.m0.z$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public int f5417a;

        /* JADX INFO: renamed from: b */
        public String f5418b;

        /* JADX INFO: renamed from: c */
        public String f5419c;

        /* JADX INFO: renamed from: d */
        public String f5420d;

        public b(String str, String str2, int i, String str3) {
            this.f5419c = str;
            this.f5418b = str2;
            this.f5417a = i;
            this.f5420d = str3;
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: I */
    public void mo276I(Context context) {
        super.mo276I(context);
    }

    @Override // c.c.a.v3.g0
    /* JADX INFO: renamed from: I0 */
    public void mo2641I0() {
        super.mo2641I0();
        this.f5413x0.add(new b("moe.shizuku.privileged.api", "Shizuku", R.mipmap.k, "sh /storage/emulated/0/Android/data/moe.shizuku.privileged.api/start.sh"));
        this.f5413x0.add(new b("com.catchingnow.icebox", "冰箱", R.mipmap.f, "sh /sdcard/Android/data/com.catchingnow.icebox/files/start.sh"));
        this.f5413x0.add(new b("me.piebridge.brevent", "黑域", R.mipmap.i, "sh /data/data/me.piebridge.brevent/brevent.sh"));
        this.f5413x0.add(new b("web1n.stopapp", "小黑屋", R.mipmap.l, "sh /storage/emulated/0/Android/data/web1n.stopapp/files/starter.sh"));
        this.f5413x0.add(new b("com.web1n.permissiondog", "权限狗", R.mipmap.h, "sh /storage/emulated/0/Android/data/com.web1n.permissiondog/files/starter.sh"));
        this.f5413x0.add(new b("com.modosa.apkinstaller", "安装狮", R.mipmap.d, "dpm set-device-owner com.modosa.apkinstaller/.receiver.AdminReceiver"));
        this.f5413x0.add(new b("com.omarea.vtools", "Scene5", R.mipmap.j, "sh /data/user/0/com.omarea.vtools/files/up.sh"));
        Collections.sort(this.f5413x0, new C1082f0(this));
        this.f5387X = m303h().getCacheDir() + "/tmp/screenshot.png";
        this.f5390a0 = new StringBuilder();
        q3 runnableC0964q3 = new q3(m303h());
        this.f5389Z = runnableC0964q3;
        runnableC0964q3.f4886h = true;
        runnableC0964q3.f4888j = new Handler(new a());
        q3 runnableC0964q4 = this.f5389Z;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4967W);
        sb.append("shell getprop service.adb.tcp.port;echo ");
        sb.append(this.f5391b0);
        sb.append(";");
        sb.append(this.f4967W);
        sb.append("shell pm list packages;echo ");
        a.m2193g(sb, this.f5392c0, runnableC0964q4);
    }

    /* JADX INFO: renamed from: K0 */
    public final void m2680K0(String str, final int i) {
        final h c1153h = new h(m303h());
        c1153h.f5540b.setVisibility(0);
        c1153h.f5540b.setText(str);
        c1153h.m2711b(m337y(R.string.aq));
        c1153h.m2712c(m337y(R.string.eg));
        c1153h.f5543e.setOnClickListener(new View.OnClickListener() { // from class: c.c.a.v3.m0.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Handler handler;
                Runnable runnable;
                final C1102z c1102z = this.f5332b;
                int i2 = i;
                h c1153h2 = c1153h;
                Objects.requireNonNull(c1102z);
                if (i2 == 0) {
                    c1102z.f5389Z.m2627c(c1102z.f4967W + "usb");
                    new Handler().postDelayed(new Runnable() { // from class: c.c.a.v3.m0.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            c1102z.m2646G0().f47f.m9a();
                        }
                    }, 2000L);
                    c1102z.f5406q0 = false;
                    throw null;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        c1102z.f5389Z.m2627c(c1102z.f4967W + "reboot");
                        handler = new Handler();
                        runnable = new Runnable() { // from class: c.c.a.v3.m0.t
                            @Override // java.lang.Runnable
                            public final void run() {
                                c1102z.m2646G0().f47f.m9a();
                            }
                        };
                    } else if (i2 == 3) {
                        c1102z.f5389Z.m2627c(c1102z.f4967W + "reboot recovery");
                        handler = new Handler();
                        runnable = new Runnable() { // from class: c.c.a.v3.m0.g
                            @Override // java.lang.Runnable
                            public final void run() {
                                c1102z.m2646G0().f47f.m9a();
                            }
                        };
                    } else {
                        if (i2 != 4) {
                            throw new IllegalStateException(a.m2198l("Unexpected value: ", i2));
                        }
                        c1102z.f5389Z.m2627c(c1102z.f4967W + "reboot bootloader");
                        handler = new Handler();
                        runnable = new Runnable() { // from class: c.c.a.v3.m0.r
                            @Override // java.lang.Runnable
                            public final void run() {
                                c1102z.m2646G0().f47f.m9a();
                            }
                        };
                    }
                    handler.postDelayed(runnable, 2000L);
                } else {
                    q3 runnableC0964q3 = c1102z.f5389Z;
                    StringBuilder sb = new StringBuilder();
                    sb.append(c1102z.f4967W);
                    sb.append("shell wm density ");
                    sb.append(c1102z.f5405p0);
                    sb.append(";");
                    sb.append(c1102z.f4967W);
                    sb.append("shell wm density;echo ");
                    a.m2193g(sb, c1102z.f5394e0, runnableC0964q3);
                }
                c1153h2.f5539a.dismiss();
            }
        });
        c1153h.f5539a.show();
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: P */
    public View mo283P(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.be, viewGroup, false);
        this.f5415z0 = viewInflate;
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.lo);
        this.f5384A0 = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(m309k()));
        this.f5385B0 = new ArrayList();
        C1100x c1100x = new C1100x(m309k(), this.f5385B0);
        this.f5386C0 = c1100x;
        this.f5384A0.setAdapter(c1100x);
        final C1101y c1101y = new C1101y("无线ADB调试");
        c1101y.f5377a = R.drawable.et;
        c1101y.f5380d = true;
        boolean z = this.f5407r0 || !m2646G0().f6466v;
        c1101y.f5381e = z;
        c1101y.f5379c = z ? "已打开" : "未开启";
        c1101y.f5383g = new CompoundButton.OnCheckedChangeListener() { // from class: c.c.a.v3.m0.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                final C1102z c1102z = this.f5325a;
                C1101y c1101y2 = c1101y;
                Objects.requireNonNull(c1102z);
                if (z2 && c1102z.f5406q0) {
                    q3 runnableC0964q3 = c1102z.f5389Z;
                    if (runnableC0964q3 != null) {
                        runnableC0964q3.m2627c(c1102z.f4967W + "tcpip 5555");
                        new Handler().postDelayed(new Runnable() { // from class: c.c.a.v3.m0.o
                            @Override // java.lang.Runnable
                            public final void run() {
                                c1102z.m2646G0().f47f.m9a();
                            }
                        }, 2000L);
                        return;
                    }
                    return;
                }
                if (z2 || !c1102z.f5406q0) {
                    return;
                }
                String strM337y = c1102z.m337y(R.string.ae);
                c1102z.f5406q0 = false;
                c1101y2.f5381e = true;
                c1102z.f5386C0.f947a.m542b();
                c1102z.f5406q0 = true;
                c1102z.m2680K0(strM337y, 0);
            }
        };
        C1101y c1101y2 = new C1101y("屏幕截图");
        c1101y2.f5377a = R.drawable.c3;
        c1101y2.f5379c = "一键获取屏幕截图";
        c1101y2.f5382f = new View.OnClickListener() { // from class: c.c.a.v3.m0.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1102z c1102z = this.f5340b;
                String strM2203q = a.m2203q(new StringBuilder(), c1102z.m2646G0().f6464t, "/screencap.png");
                q3 runnableC0964q3 = c1102z.f5389Z;
                StringBuilder sb = new StringBuilder();
                a.m2194h(sb, c1102z.f4967W, "shell screencap -p ", strM2203q, ";");
                a.m2194h(sb, c1102z.f4967W, "pull ", strM2203q, " ");
                sb.append(c1102z.f5387X);
                sb.append(";echo ");
                sb.append(c1102z.f5393d0);
                runnableC0964q3.m2627c(sb.toString());
                k c1156k = new k(c1102z.m303h());
                c1102z.f5410u0 = c1156k;
                String strM337y = c1102z.m337y(R.string.gc);
                c1156k.f5554b.setVisibility(0);
                c1156k.f5554b.setText(strM337y);
                c1102z.f5410u0.f5553a.show();
            }
        };
        this.f5385B0.add(c1101y);
        this.f5385B0.add(c1101y2);
        this.f5385B0.add(new C1101y("高级重启", "重启到其他模式", R.drawable.aw, new View.OnClickListener() { // from class: c.c.a.v3.m0.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final C1102z c1102z = this.f5356b;
                final g c1152g = new g(c1102z.m303h());
                c1152g.m2708f(c1102z.m337y(R.string.a6));
                final ArrayList arrayList = new ArrayList();
                arrayList.add(new d("正常重启"));
                arrayList.add(new d(c1102z.m337y(R.string.fp)));
                arrayList.add(new d(c1102z.m337y(R.string.fo)));
                c c1148c = new c(c1102z.m303h(), arrayList, new c.a() { // from class: c.c.a.v3.m0.s
                    @Override // c.c.a.y3.c.a
                    /* JADX INFO: renamed from: a */
                    public final void mo2640a(int i) {
                        C1102z c1102z2 = c1102z;
                        List list = arrayList;
                        g c1152g2 = c1152g;
                        c1102z2.m2680K0(c1102z2.m337y(R.string.h4) + ((d) list.get(i)).f5513b + c1102z2.m337y(R.string.i5), i + 2);
                        c1152g2.f5532b.dismiss();
                    }
                });
                c1152g.f5534d = c1148c;
                c1152g.f5536f.setAdapter(c1148c);
                c1152g.m2709g();
            }
        }));
        this.f5385B0.add(new C1101y("激活应用", "激活需要adb权限的应用", R.drawable.al, new View.OnClickListener() { // from class: c.c.a.v3.m0.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final C1102z c1102z = this.f5348b;
                if (c1102z.f5414y0.size() < 1) {
                    m.m1952H(c1102z.m303h(), "没有可激活的应用");
                    return;
                }
                final g c1152g = new g(c1102z.m303h());
                c1152g.m2708f(c1102z.m337y(R.string.a4));
                ArrayList arrayList = new ArrayList();
                for (C1102z.b bVar : c1102z.f5414y0) {
                    arrayList.add(new d(bVar.f5418b, bVar.f5417a));
                }
                c c1148c = new c(c1102z.m303h(), arrayList, new c.a() { // from class: c.c.a.v3.m0.f
                    @Override // c.c.a.y3.c.a
                    /* JADX INFO: renamed from: a */
                    public final void mo2640a(int i) {
                        C1102z c1102z2 = c1102z;
                        g c1152g2 = c1152g;
                        q3 runnableC0964q3 = c1102z2.f5389Z;
                        StringBuilder sbM2191e = a.m2191e("echo ");
                        sbM2191e.append(c1102z2.f5395f0);
                        sbM2191e.append(";");
                        sbM2191e.append(c1102z2.f4967W);
                        sbM2191e.append("shell ");
                        sbM2191e.append(c1102z2.f5414y0.get(i).f5420d);
                        sbM2191e.append(" 2>&1;echo ");
                        a.m2193g(sbM2191e, c1102z2.f5396g0, runnableC0964q3);
                        String str = c1102z2.f5414y0.get(i).f5420d;
                        DialogInterfaceC0193i.a aVar = new DialogInterfaceC0193i.a(c1102z2.m303h());
                        View viewInflate2 = View.inflate(c1102z2.m303h(), R.layout.b1, null);
                        TextView textView = (TextView) viewInflate2.findViewById(R.id.q9);
                        c1102z2.f5409t0 = textView;
                        textView.setText(str + "\n\n");
                        aVar.f1245a.f126o = viewInflate2;
                        aVar.m784f(R.string.c4);
                        aVar.m780b(R.string.b2, null);
                        aVar.m786h();
                        c1152g2.f5532b.dismiss();
                    }
                });
                c1152g.f5534d = c1148c;
                c1152g.f5536f.setAdapter(c1148c);
                c1152g.m2709g();
            }
        }));
        this.f5385B0.add(new C1101y("修改DPI", "修改屏幕密度", R.drawable.cz, new View.OnClickListener() { // from class: c.c.a.v3.m0.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final C1102z c1102z = this.f5328b;
                final e c1150e = new e(c1102z.m303h());
                c1150e.f5519c.setVisibility(0);
                c1150e.f5519c.setText("请输入DPI数值");
                c1150e.f5523g.setInputType(2);
                c1150e.m2699b(c1102z.m337y(R.string.aq));
                c1150e.m2700c(c1102z.m337y(R.string.eg));
                c1150e.f5525i.setOnClickListener(new View.OnClickListener() { // from class: c.c.a.v3.m0.u
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        C1102z c1102z2 = c1102z;
                        e c1150e2 = c1150e;
                        Objects.requireNonNull(c1102z2);
                        if (c1150e2.f5523g.getText().toString().isEmpty()) {
                            return;
                        }
                        c1102z2.f5405p0 = c1150e2.f5523g.getText().toString();
                        c1150e2.f5518b.dismiss();
                        c1102z2.m2680K0(c1102z2.m337y(R.string.ag), 1);
                    }
                });
                c1150e.m2702e();
            }
        }));
        this.f5385B0.add(new C1101y("修改分辨率", "调整屏幕分辨率大小", R.drawable.as, new View.OnClickListener() { // from class: c.c.a.v3.m0.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final C1102z c1102z = this.f5330b;
                e c1150e = new e(c1102z.m303h());
                c1102z.f5411v0 = c1150e;
                c1150e.f5519c.setVisibility(0);
                c1150e.f5519c.setText("修改分辨率");
                c1102z.f5411v0.f5520d.setVisibility(0);
                c1102z.f5411v0.f5520d.setText("");
                c1102z.f5411v0.f5521e.setHint("屏幕宽度");
                c1102z.f5411v0.f5523g.setInputType(2);
                c1102z.f5411v0.f5522f.setVisibility(0);
                c1102z.f5411v0.f5522f.setHint("屏幕长度");
                c1102z.f5411v0.f5524h.setInputType(2);
                c1102z.f5411v0.m2699b(c1102z.m337y(R.string.aq));
                c1102z.f5411v0.m2700c(c1102z.m337y(R.string.eg));
                c1102z.f5411v0.f5525i.setOnClickListener(new View.OnClickListener() { // from class: c.c.a.v3.m0.v
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        C1102z c1102z2 = c1102z;
                        String string = c1102z2.f5411v0.f5523g.getText().toString();
                        String string2 = c1102z2.f5411v0.f5524h.getText().toString();
                        if (string.isEmpty() || string2.isEmpty()) {
                            return;
                        }
                        q3 runnableC0964q3 = c1102z2.f5389Z;
                        StringBuilder sb = new StringBuilder();
                        a.m2194h(sb, c1102z2.f4967W, "shell wm size ", string, "x");
                        sb.append(string2);
                        sb.append(";echo ");
                        a.m2193g(sb, c1102z2.f5400k0, runnableC0964q3);
                        c1102z2.f5411v0.f5518b.dismiss();
                    }
                });
                q3 runnableC0964q3 = c1102z.f5389Z;
                StringBuilder sb = new StringBuilder();
                sb.append(c1102z.f4967W);
                sb.append("shell wm size;echo ");
                a.m2193g(sb, c1102z.f5399j0, runnableC0964q3);
                c1102z.f5411v0.m2702e();
            }
        }));
        this.f5385B0.add(new C1101y("动画调整", "调整系统动画缩放", R.drawable.ak, new View.OnClickListener() { // from class: c.c.a.v3.m0.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1102z c1102z = this.f5369b;
                c1102z.f5389Z.m2627c(c1102z.f4967W + "shell settings get global window_animation_scale;" + c1102z.f4967W + "shell settings get global transition_animation_scale;" + c1102z.f4967W + "shell settings get global animator_duration_scale;echo " + c1102z.f5397h0);
                k c1156k = new k(c1102z.m309k());
                c1102z.f5412w0 = c1156k;
                c1156k.f5553a.show();
            }
        }));
        this.f5385B0.add(new C1101y("熄屏待机", "可以在不锁屏的情况下熄灭屏幕", R.drawable.at, new View.OnClickListener() { // from class: c.c.a.v3.m0.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final C1102z c1102z = this.f5345b;
                final g c1152g = new g(c1102z.m303h());
                c1152g.f5533c.setVisibility(0);
                c1152g.f5533c.setText("请选择操作");
                ArrayList arrayList = new ArrayList();
                arrayList.add(new d("熄灭屏幕"));
                arrayList.add(new d("点亮屏幕"));
                c c1148c = new c(c1102z.m303h(), arrayList, new c.a() { // from class: c.c.a.v3.m0.i
                    @Override // c.c.a.y3.c.a
                    /* JADX INFO: renamed from: a */
                    public final void mo2640a(int i) {
                        C1102z c1102z2 = c1102z;
                        g c1152g2 = c1152g;
                        Objects.requireNonNull(c1102z2);
                        StringBuilder sb = new StringBuilder();
                        sb.append("shell CLASSPATH=");
                        String strM2203q = a.m2203q(sb, c1102z2.m2646G0().f6464t, "/scrcpy_server.apk app_process ./ com.genymobile.scrcpy.Server");
                        q3 runnableC0964q3 = c1102z2.f5389Z;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(c1102z2.f4967W);
                        sb2.append(strM2203q);
                        sb2.append(" spm ");
                        sb2.append(i * 2);
                        sb2.append(" 2>&1;echo ");
                        a.m2193g(sb2, c1102z2.f5401l0, runnableC0964q3);
                        c1152g2.f5532b.dismiss();
                    }
                });
                c1152g.f5534d = c1148c;
                c1152g.f5536f.setAdapter(c1148c);
                c1152g.m2709g();
            }
        }));
        this.f5385B0.add(new C1101y("墓碑模式", "暂停执行缓存的应用", R.drawable.ax, new View.OnClickListener() { // from class: c.c.a.v3.m0.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1102z c1102z = this.f5353b;
                c1102z.f5389Z.m2627c(c1102z.f4967W + "shell settings get global cached_apps_freezer;echo " + c1102z.f5402m0);
            }
        }));
        this.f5386C0.f947a.m542b();
        this.f5408s0 = true;
        m2646G0().f6456H.f4837a.set(1, this);
        if (m2646G0().f6470z == 1) {
            mo2641I0();
        }
        return this.f5415z0;
    }
}
