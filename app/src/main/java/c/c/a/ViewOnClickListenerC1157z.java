package c.c.a;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import com.didjdk.adbhelper.FastbootActivity;
import com.didjdk.adbhelper.R;
import java.util.Objects;
import p006b.p008b.p009c.DialogInterfaceC0193i;
import b.s.m;
import c.a.a.a.a;
import c.c.a.y3.h;

/* JADX INFO: renamed from: c.c.a.z */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC1157z implements View.OnClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FastbootActivity f5555b;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        final FastbootActivity fastbootActivity = this.f5555b;
        if (!fastbootActivity.s) {
            str = "设备未连接";
        } else {
            if (!fastbootActivity.E.getText().toString().trim().isEmpty()) {
                final h c1153h = new h(fastbootActivity);
                StringBuilder sbM2191e = a.m2191e("刷入");
                sbM2191e.append(fastbootActivity.T);
                sbM2191e.append("分区");
                c1153h.m2714e(sbM2191e.toString());
                c1153h.m2710a("是否将" + fastbootActivity.E.getText().toString() + "刷入" + fastbootActivity.T + "分区？\n\n一旦刷入，该分区原有数据将被覆盖，请提前备份原分区。");
                c1153h.m2711b(fastbootActivity.getString(R.string.aq));
                c1153h.m2713d(fastbootActivity.getString(R.string.eg), new View.OnClickListener() { // from class: c.c.a.j0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        FastbootActivity fastbootActivity2 = fastbootActivity;
                        h c1153h2 = c1153h;
                        Objects.requireNonNull(fastbootActivity2);
                        c1153h2.f5539a.dismiss();
                        fastbootActivity2.w = true;
                        StringBuilder sbM2191e2 = a.m2191e("fastboot flash ");
                        sbM2191e2.append(fastbootActivity2.T);
                        sbM2191e2.append(" \"");
                        sbM2191e2.append(fastbootActivity2.E.getText().toString());
                        sbM2191e2.append("\"");
                        String string = sbM2191e2.toString();
                        DialogInterfaceC0193i.a aVar = new DialogInterfaceC0193i.a(fastbootActivity2);
                        View viewInflate = View.inflate(fastbootActivity2, R.layout.b1, null);
                        fastbootActivity2.J = (TextView) viewInflate.findViewById(R.id.q9);
                        ProgressBar progressBar = (ProgressBar) viewInflate.findViewById(R.id.o2);
                        fastbootActivity2.K = progressBar;
                        progressBar.setVisibility(0);
                        TextView textView = (TextView) viewInflate.findViewById(R.id.o3);
                        fastbootActivity2.L = textView;
                        textView.setVisibility(0);
                        AlertController.C0020b c0020b = aVar.f1245a;
                        c0020b.f126o = viewInflate;
                        c0020b.f115d = "正在刷入";
                        aVar.m780b(R.string.b2, null);
                        aVar.m786h();
                        fastbootActivity2.J.setText(fastbootActivity2.z(string + "\n\n", 0));
                        fastbootActivity2.N.append(fastbootActivity2.z(string + "\n", 0));
                        a.m2193g(a.m2191e(string), fastbootActivity2.U, fastbootActivity2.R);
                    }
                });
                c1153h.f5539a.show();
                return;
            }
            str = "请选择镜像文件";
        }
        m.m1952H(fastbootActivity, str);
    }
}
