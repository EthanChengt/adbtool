package com.didjdk.adbhelper;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p006b.p008b.p009c.ActivityC0194j;
import c.a.a.a.a;
import p080c.p084b.p085a.ComponentCallbacks2C0616b;
import p080c.p084b.p085a.ComponentCallbacks2C0623i;
import p080c.p084b.p085a.p088m.p091u.AbstractC0707k;
import p080c.p084b.p085a.p107q.C0846f;
import c.c.a.ViewOnClickListenerC0988v2;

/* JADX INFO: loaded from: classes.dex */
public class AppPickerActivity extends ActivityC0194j {

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ int f6328u = 0;

    /* JADX INFO: renamed from: q */
    public RecyclerView f6329q;

    /* JADX INFO: renamed from: r */
    public C1312a f6330r;

    /* JADX INFO: renamed from: s */
    public List<PackageInfo> f6331s;

    /* JADX INFO: renamed from: t */
    public ProgressBar f6332t;

    /* JADX INFO: renamed from: com.didjdk.adbhelper.AppPickerActivity$a */
    public class C1312a extends RecyclerView.AbstractC0132g<C1313b> {
        public C1312a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0132g
        /* JADX INFO: renamed from: a */
        public int mo533a() {
            return AppPickerActivity.this.f6331s.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0132g
        /* JADX INFO: renamed from: e */
        public void mo537e(RecyclerView.AbstractC0129d0 abstractC0129d0, int i) {
            C1313b c1313b = (C1313b) abstractC0129d0;
            PackageInfo packageInfo = AppPickerActivity.this.f6331s.get(i);
            ComponentCallbacks2C0623i componentCallbacks2C0623iM2209f = ComponentCallbacks2C0616b.m2209f(AppPickerActivity.this);
            componentCallbacks2C0623iM2209f.m2232l().m2227y(packageInfo.applicationInfo.loadIcon(AppPickerActivity.this.getPackageManager())).mo2218a(C0846f.m2573r(AbstractC0707k.f4168a)).m2226x(c1313b.f6335u);
            c1313b.f6337w.setText(packageInfo.applicationInfo.loadLabel(AppPickerActivity.this.getPackageManager()));
            c1313b.f6336v.setText(packageInfo.packageName);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0132g
        /* JADX INFO: renamed from: f */
        public RecyclerView.AbstractC0129d0 mo538f(ViewGroup viewGroup, int i) {
            C1313b c1313b = new C1313b(a.m2188b(viewGroup, R.layout.bj, viewGroup, false));
            c1313b.f6334t.setOnClickListener(new ViewOnClickListenerC0988v2(this, c1313b));
            return c1313b;
        }
    }

    /* JADX INFO: renamed from: com.didjdk.adbhelper.AppPickerActivity$b */
    public static class C1313b extends RecyclerView.AbstractC0129d0 {

        /* JADX INFO: renamed from: t */
        public View f6334t;

        /* JADX INFO: renamed from: u */
        public ImageView f6335u;

        /* JADX INFO: renamed from: v */
        public TextView f6336v;

        /* JADX INFO: renamed from: w */
        public TextView f6337w;

        public C1313b(View view) {
            super(view);
            this.f6334t = view;
            this.f6335u = (ImageView) view.findViewById(R.id.h8);
            this.f6336v = (TextView) view.findViewById(R.id.h_);
            this.f6337w = (TextView) view.findViewById(R.id.h9);
            view.findViewById(R.id.h7).setVisibility(8);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        setResult(-1, new Intent());
        this.f47f.m9a();
    }

    @Override // p006b.p008b.p009c.ActivityC0194j, p006b.p056m.p057b.ActivityC0459e, androidx.activity.ComponentActivity, p006b.p032h.p033b.ActivityC0361g, android.app.Activity
    public native void onCreate(Bundle bundle);

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return true;
        }
        setResult(-1, new Intent());
        finish();
        return true;
    }
}
