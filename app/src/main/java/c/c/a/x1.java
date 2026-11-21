package c.c.a;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import com.didjdk.adbhelper.R;
import com.didjdk.adbhelper.UnlockActivity;
import java.util.Objects;
import java.util.Timer;
import p006b.p008b.p009c.DialogInterfaceC0193i;
import p006b.p067s.C0532j;
import b.s.m;
import c.c.a.x3.d;

/* JADX INFO: renamed from: c.c.a.x1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x1 implements View.OnClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ UnlockActivity f5471b;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        final UnlockActivity unlockActivity = this.f5471b;
        if (unlockActivity.f10092q) {
            DialogInterfaceC0193i.a aVar = new DialogInterfaceC0193i.a(unlockActivity);
            View viewInflate = View.inflate(unlockActivity, R.layout.b2, null);
            ((TextView) viewInflate.findViewById(R.id.dn)).setText(m.x(unlockActivity));
            final EditText editText = (EditText) viewInflate.findViewById(R.id.h4);
            AlertController.C0020b c0020b = aVar.f1245a;
            c0020b.f115d = "解锁高级功能";
            c0020b.f126o = viewInflate;
            c0020b.f118g = "解锁";
            c0020b.f119h = null;
            c0020b.f120i = "取消";
            c0020b.f121j = null;
            final DialogInterfaceC0193i dialogInterfaceC0193iM779a = aVar.m779a();
            dialogInterfaceC0193iM779a.show();
            String string = C0532j.m1940a(unlockActivity).getString("payment", "");
            editText.setText(string);
            editText.setSelection(string.length());
            new Timer().schedule(new d(unlockActivity, editText), 200L);
            AlertController alertController = dialogInterfaceC0193iM779a.f1244d;
            Objects.requireNonNull(alertController);
            alertController.f97o.setOnClickListener(new View.OnClickListener() { // from class: c.c.a.j2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    final UnlockActivity unlockActivity2 = unlockActivity;
                    EditText editText2 = editText;
                    final DialogInterfaceC0193i dialogInterfaceC0193i = dialogInterfaceC0193iM779a;
                    Objects.requireNonNull(unlockActivity2);
                    final String strTrim = editText2.getText().toString().replace(" ", "").trim();
                    if (strTrim.length() < 20 || !unlockActivity2.f10092q) {
                        return;
                    }
                    C0532j.m1940a(unlockActivity2).edit().putString("payment", strTrim).apply();
                    new Thread(new i2(unlockActivity2, strTrim, (b.b.c.i) dialogInterfaceC0193i)).start();
                }
            });
        }
    }
}
