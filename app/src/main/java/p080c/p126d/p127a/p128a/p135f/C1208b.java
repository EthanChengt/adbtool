package p080c.p126d.p127a.p128a.p135f;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: renamed from: c.d.a.a.f.b */
/* JADX INFO: loaded from: classes.dex */
public class C1208b extends FloatingActionButton.AbstractC1359a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5738a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ BottomAppBar f5739b;

    /* JADX INFO: renamed from: c.d.a.a.f.b$a */
    public class a extends FloatingActionButton.AbstractC1359a {
        public a() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.AbstractC1359a
        /* JADX INFO: renamed from: b */
        public void mo2790b(FloatingActionButton floatingActionButton) {
            BottomAppBar.m3061w(C1208b.this.f5739b);
        }
    }

    public C1208b(BottomAppBar bottomAppBar, int i) {
        this.f5739b = bottomAppBar;
        this.f5738a = i;
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.AbstractC1359a
    /* JADX INFO: renamed from: a */
    public void mo2789a(FloatingActionButton floatingActionButton) {
        BottomAppBar bottomAppBar = this.f5739b;
        int i = this.f5738a;
        int i2 = BottomAppBar.f10160b0;
        floatingActionButton.setTranslationX(bottomAppBar.m3063B(i));
        floatingActionButton.m3126o(new a(), true);
    }
}
