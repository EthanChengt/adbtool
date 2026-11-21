package c.c.a;

import android.view.View;
import android.widget.AdapterView;
import com.didjdk.adbhelper.FastbootActivity;
import com.didjdk.adbhelper.R;
import c.c.a.y3.e;

/* JADX INFO: renamed from: c.c.a.f3 */
/* JADX INFO: loaded from: classes.dex */
public class C0909f3 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FastbootActivity f4795b;

    public C0909f3(FastbootActivity fastbootActivity) {
        this.f4795b = fastbootActivity;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        String[] stringArray = this.f4795b.getResources().getStringArray(R.array.c);
        if (i != 2) {
            FastbootActivity fastbootActivity = this.f4795b;
            fastbootActivity.T = stringArray[i];
            fastbootActivity.F.setVisibility(4);
            return;
        }
        final e c1150e = new e(this.f4795b);
        c1150e.f5519c.setVisibility(0);
        c1150e.f5519c.setText("请输入分区名");
        c1150e.m2699b(this.f4795b.getString(R.string.aq));
        c1150e.m2700c(this.f4795b.getString(R.string.eg));
        c1150e.f5525i.setOnClickListener(new View.OnClickListener() { // from class: c.c.a.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C0909f3 c0909f3 = this.f5493b;
                e c1150e2 = c1150e;
                c0909f3.f4795b.T = c1150e2.f5523g.getText().toString();
                c0909f3.f4795b.F.setVisibility(0);
                FastbootActivity fastbootActivity2 = c0909f3.f4795b;
                fastbootActivity2.F.setText(fastbootActivity2.T);
                c1150e2.f5518b.dismiss();
            }
        });
        c1150e.m2702e();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
