package c.c.a;

import android.os.Build;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.didjdk.adbhelper.AboutActivity;
import com.didjdk.adbhelper.R;
import java.util.Objects;
import p006b.p008b.p009c.DialogInterfaceC0193i;

/* JADX INFO: renamed from: c.c.a.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0880a implements View.OnClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AboutActivity f4751b;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AboutActivity aboutActivity = this.f4751b;
        Objects.requireNonNull(aboutActivity);
        DialogInterfaceC0193i.a aVar = new DialogInterfaceC0193i.a(aboutActivity);
        View viewInflate = View.inflate(aboutActivity, R.layout.av, null);
        aVar.m785g(viewInflate);
        aVar.m784f(R.string.el);
        aVar.m780b(R.string.b2, null);
        aVar.m786h();
        TextView textView = (TextView) viewInflate.findViewById(R.id.dl);
        int i = Build.VERSION.SDK_INT;
        String strM3009x = aboutActivity.m3009x();
        textView.setText(i >= 24 ? Html.fromHtml(strM3009x, 63) : Html.fromHtml(strM3009x));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
