package p006b.p008b.p009c;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.didjdk.adbhelper.R;
import java.lang.ref.WeakReference;
import p006b.p008b.p016h.AbstractC0215a;
import p006b.p025e.C0315c;
import p006b.p032h.p044j.C0408c;

/* JADX INFO: renamed from: b.b.c.s */
/* JADX INFO: loaded from: classes.dex */
public class DialogC0203s extends Dialog implements InterfaceC0195k {

    /* JADX INFO: renamed from: b */
    public AbstractC0196l f1343b;

    /* JADX INFO: renamed from: c */
    public final C0408c.a f1344c;

    /* JADX INFO: renamed from: b.b.c.s$a */
    public class a implements C0408c.a {
        public a() {
        }

        @Override // p006b.p032h.p044j.C0408c.a
        /* JADX INFO: renamed from: e */
        public boolean mo860e(KeyEvent keyEvent) {
            return DialogC0203s.this.m859b(keyEvent);
        }
    }

    public DialogC0203s(Context context, int i) {
        int i2;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.fm, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = i;
        }
        super(context, i2);
        this.f1344c = new a();
        AbstractC0196l abstractC0196lM858a = m858a();
        if (i == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.fm, typedValue2, true);
            i = typedValue2.resourceId;
        }
        abstractC0196lM858a.mo820y(i);
        abstractC0196lM858a.mo808l(null);
    }

    /* JADX INFO: renamed from: a */
    public AbstractC0196l m858a() {
        if (this.f1343b == null) {
            C0315c<WeakReference<AbstractC0196l>> c0315c = AbstractC0196l.f1249b;
            this.f1343b = new LayoutInflaterFactory2C0197m(getContext(), getWindow(), this, this);
        }
        return this.f1343b;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m858a().mo799c(view, layoutParams);
    }

    /* JADX INFO: renamed from: b */
    public boolean m859b(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C0408c.m1543b(this.f1344c, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // p006b.p008b.p009c.InterfaceC0195k
    /* JADX INFO: renamed from: f */
    public void mo787f(AbstractC0215a abstractC0215a) {
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i) {
        return (T) m858a().mo801e(i);
    }

    @Override // p006b.p008b.p009c.InterfaceC0195k
    /* JADX INFO: renamed from: h */
    public void mo788h(AbstractC0215a abstractC0215a) {
    }

    @Override // p006b.p008b.p009c.InterfaceC0195k
    /* JADX INFO: renamed from: i */
    public AbstractC0215a mo789i(AbstractC0215a.a aVar) {
        return null;
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        m858a().mo806j();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        m858a().mo805i();
        super.onCreate(bundle);
        m858a().mo808l(bundle);
    }

    @Override // android.app.Dialog
    public void onStop() {
        super.onStop();
        m858a().mo814r();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        m858a().mo816u(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        m858a().mo817v(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m858a().mo818w(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        m858a().mo821z(getContext().getString(i));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        m858a().mo821z(charSequence);
    }
}
