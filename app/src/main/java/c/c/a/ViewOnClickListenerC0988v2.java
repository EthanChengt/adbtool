package c.c.a;

import android.content.Intent;
import android.view.View;
import com.didjdk.adbhelper.AppPickerActivity;
import java.util.Objects;
import c.a.a.a.a;
import c.c.a.y3.h;
import c.c.a.y3.ViewOnClickListenerC1154i;

/* JADX INFO: renamed from: c.c.a.v2 */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnClickListenerC0988v2 implements View.OnClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AppPickerActivity.C1313b f4934b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AppPickerActivity.C1312a f4935c;

    public ViewOnClickListenerC0988v2(AppPickerActivity.C1312a c1312a, AppPickerActivity.C1313b c1313b) {
        this.f4935c = c1312a;
        this.f4934b = c1313b;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int iM509e = this.f4934b.m509e();
        final String str = AppPickerActivity.this.f6331s.get(iM509e).applicationInfo.sourceDir;
        final h c1153h = new h(AppPickerActivity.this);
        StringBuilder sbM2191e = a.m2191e("确定要安装 ");
        sbM2191e.append((Object) AppPickerActivity.this.f6331s.get(iM509e).applicationInfo.loadLabel(AppPickerActivity.this.getPackageManager()));
        sbM2191e.append(" ?");
        c1153h.m2710a(sbM2191e.toString());
        c1153h.f5545g.setVisibility(0);
        c1153h.f5545g.setText("取消");
        c1153h.f5545g.setOnClickListener(new ViewOnClickListenerC1154i(c1153h));
        c1153h.m2713d("确定", new View.OnClickListener() { // from class: c.c.a.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ViewOnClickListenerC0988v2 viewOnClickListenerC0988v2 = this.f4759b;
                h c1153h2 = c1153h;
                String str2 = str;
                Objects.requireNonNull(viewOnClickListenerC0988v2);
                c1153h2.f5539a.dismiss();
                Intent intent = new Intent();
                intent.putExtra("selectedAPK_return", str2);
                AppPickerActivity.this.setResult(3, intent);
                AppPickerActivity.this.finish();
            }
        });
        c1153h.f5539a.show();
    }
}
