package c.c.a;

import android.content.Intent;
import android.content.SharedPreferences;
import android.util.SparseBooleanArray;
import android.view.View;
import com.didjdk.adbhelper.FilePickerActivity;
import com.didjdk.adbhelper.R;
import java.io.File;
import java.util.Objects;
import p006b.p067s.C0532j;
import c.a.a.a.a;
import c.c.a.y3.h;

/* JADX INFO: renamed from: c.c.a.j3 */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnClickListenerC0929j3 implements View.OnClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FilePickerActivity.C1329g f4829b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ FilePickerActivity.C1328f f4830c;

    /* JADX INFO: renamed from: c.c.a.j3$a */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ File f4831b;

        public a(File file) {
            this.f4831b = file;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent = new Intent();
            SharedPreferences.Editor editorEdit = C0532j.m1940a(FilePickerActivity.this).edit();
            StringBuilder sbM2191e = a.m2191e("last_used_directory");
            sbM2191e.append(FilePickerActivity.this.f6429q);
            editorEdit.putString(sbM2191e.toString(), FilePickerActivity.this.f6435w).apply();
            intent.putExtra("selectedAPK_return", this.f4831b.getAbsolutePath());
            FilePickerActivity.this.setResult(3, intent);
            FilePickerActivity.this.finish();
        }
    }

    public ViewOnClickListenerC0929j3(FilePickerActivity.C1328f c1328f, FilePickerActivity.C1329g c1329g) {
        this.f4830c = c1328f;
        this.f4829b = c1329g;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int iM509e = this.f4829b.m509e();
        File file = FilePickerActivity.this.f6434v[iM509e];
        if (file.isDirectory()) {
            FilePickerActivity filePickerActivity = FilePickerActivity.this;
            Objects.requireNonNull(filePickerActivity);
            filePickerActivity.f6435w = file.getAbsolutePath();
            filePickerActivity.f6436x = new File(filePickerActivity.f6435w);
            filePickerActivity.m3025B();
            filePickerActivity.f6432t.scrollToPosition(0);
            FilePickerActivity.this.f6438z.add(Integer.valueOf(iM509e + 5));
            return;
        }
        FilePickerActivity filePickerActivity2 = FilePickerActivity.this;
        int i = filePickerActivity2.f6429q;
        if (i == 3) {
            h c1153h = new h(filePickerActivity2);
            c1153h.m2714e(FilePickerActivity.this.getString(R.string.ha) + file.getName() + "?");
            c1153h.m2711b(FilePickerActivity.this.getString(R.string.aq));
            c1153h.m2712c(FilePickerActivity.this.getString(R.string.eg));
            c1153h.f5543e.setOnClickListener(new a(file));
            c1153h.f5539a.show();
            return;
        }
        if (i != 4) {
            SparseBooleanArray sparseBooleanArray = filePickerActivity2.f6437y;
            sparseBooleanArray.put(iM509e, !sparseBooleanArray.get(iM509e));
            this.f4830c.m536d(iM509e);
            return;
        }
        Intent intent = new Intent();
        SharedPreferences.Editor editorEdit = C0532j.m1940a(FilePickerActivity.this).edit();
        StringBuilder sbM2191e = a.m2191e("last_used_directory");
        sbM2191e.append(FilePickerActivity.this.f6429q);
        editorEdit.putString(sbM2191e.toString(), FilePickerActivity.this.f6435w).apply();
        intent.putExtra("selectedFile_return", file.getAbsolutePath());
        FilePickerActivity.this.setResult(4, intent);
        FilePickerActivity.this.finish();
    }
}
