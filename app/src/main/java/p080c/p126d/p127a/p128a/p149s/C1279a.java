package p080c.p126d.p127a.p128a.p149s;

import android.content.Intent;
import android.view.MenuItem;
import com.didjdk.adbhelper.MainActivity;
import com.didjdk.adbhelper.R;
import com.didjdk.adbhelper.SettingsActivity;
import com.google.android.material.navigation.NavigationView;
import java.util.Objects;
import p006b.p008b.p016h.p017i.C0229g;
import c.c.a.C0892c1;
import c.c.a.ViewOnClickListenerC0944m3;
import c.c.a.y3.h;

/* JADX INFO: renamed from: c.d.a.a.s.a */
/* JADX INFO: loaded from: classes.dex */
public class C1279a implements C0229g.a {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ NavigationView f6156b;

    public C1279a(NavigationView navigationView) {
        this.f6156b = navigationView;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // p006b.p008b.p016h.p017i.C0229g.a
    /* JADX INFO: renamed from: a */
    public boolean mo62a(C0229g c0229g, MenuItem menuItem) {
        int i;
        NavigationView.InterfaceC1364a interfaceC1364a = this.f6156b.f10321i;
        if (interfaceC1364a != null) {
            MainActivity mainActivity = ((C0892c1) interfaceC1364a).f4772a;
            Objects.requireNonNull(mainActivity);
            switch (menuItem.getItemId()) {
                case R.id.k_ /* 2131296662 */:
                    i = 4;
                    mainActivity.z(i);
                    break;
                case R.id.ka /* 2131296663 */:
                    i = 6;
                    mainActivity.z(i);
                    break;
                case R.id.kb /* 2131296664 */:
                    mainActivity.z(0);
                    break;
                case R.id.kc /* 2131296665 */:
                    h c1153h = new h(mainActivity);
                    c1153h.m2714e(mainActivity.getString(R.string.h6));
                    c1153h.m2711b(mainActivity.getString(R.string.aq));
                    c1153h.m2712c(mainActivity.getString(R.string.eg));
                    c1153h.f5543e.setOnClickListener(new ViewOnClickListenerC0944m3(mainActivity));
                    c1153h.f5539a.show();
                    break;
                case R.id.kd /* 2131296666 */:
                    i = 3;
                    mainActivity.z(i);
                    break;
                case R.id.ke /* 2131296667 */:
                    i = 5;
                    mainActivity.z(i);
                    break;
                case R.id.kf /* 2131296668 */:
                    i = 2;
                    mainActivity.z(i);
                    break;
                case R.id.kk /* 2131296673 */:
                    mainActivity.startActivity(new Intent(mainActivity, (Class<?>) SettingsActivity.class));
                    break;
                case R.id.kl /* 2131296674 */:
                    i = 1;
                    mainActivity.z(i);
                    break;
            }
        }
        return false;
    }

    @Override // p006b.p008b.p016h.p017i.C0229g.a
    /* JADX INFO: renamed from: b */
    public void mo63b(C0229g c0229g) {
    }
}
