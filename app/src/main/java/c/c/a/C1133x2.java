package c.c.a;

import android.text.Editable;
import android.text.TextWatcher;
import com.didjdk.adbhelper.ConnectActivity;

/* JADX INFO: renamed from: c.c.a.x2 */
/* JADX INFO: loaded from: classes.dex */
public class C1133x2 implements TextWatcher {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ConnectActivity f5472b;

    public C1133x2(ConnectActivity connectActivity) {
        this.f5472b = connectActivity;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ConnectActivity connectActivity = this.f5472b;
        if (connectActivity.f6367u) {
            connectActivity.f6372z.showDropDown();
        }
    }
}
