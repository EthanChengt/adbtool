package com.didjdk.adbhelper;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Environment;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.didjdk.adbhelper.FilePickerActivity;
import java.io.File;
import java.io.FileFilter;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import p006b.p067s.C0532j;
import b.s.m;
import c.a.a.a.a;
import p080c.p084b.p085a.ComponentCallbacks2C0616b;
import p080c.p084b.p085a.p088m.p091u.AbstractC0707k;
import p080c.p084b.p085a.p107q.C0846f;
import c.c.a.ActivityC1119w2;
import c.c.a.ViewOnClickListenerC0929j3;

/* JADX INFO: loaded from: classes.dex */
public class FilePickerActivity extends ActivityC1119w2 implements View.OnClickListener {

    /* JADX INFO: renamed from: B */
    public static final /* synthetic */ int f6427B = 0;

    /* JADX INFO: renamed from: q */
    public int f6429q;

    /* JADX INFO: renamed from: s */
    public TextView f6431s;

    /* JADX INFO: renamed from: t */
    public RecyclerView f6432t;

    /* JADX INFO: renamed from: u */
    public C1328f f6433u;

    /* JADX INFO: renamed from: v */
    public File[] f6434v;

    /* JADX INFO: renamed from: w */
    public String f6435w;

    /* JADX INFO: renamed from: x */
    public File f6436x;

    /* JADX INFO: renamed from: r */
    public boolean f6430r = false;

    /* JADX INFO: renamed from: y */
    public final SparseBooleanArray f6437y = new SparseBooleanArray();

    /* JADX INFO: renamed from: z */
    public final ArrayList<Integer> f6438z = new ArrayList<>();

    /* JADX INFO: renamed from: A */
    public final ArrayList<String> f6428A = new ArrayList<>();

    /* JADX INFO: renamed from: com.didjdk.adbhelper.FilePickerActivity$a */
    public class C1323a implements FileFilter {
        public C1323a(FilePickerActivity filePickerActivity) {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return file.isDirectory() && !file.isHidden();
        }
    }

    /* JADX INFO: renamed from: com.didjdk.adbhelper.FilePickerActivity$b */
    public class C1324b implements FileFilter {
        public C1324b(FilePickerActivity filePickerActivity) {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return !file.isHidden() && (file.isDirectory() || (file.isFile() && file.getName().trim().matches(".+\\.apk")));
        }
    }

    /* JADX INFO: renamed from: com.didjdk.adbhelper.FilePickerActivity$c */
    public class C1325c implements FileFilter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ FileFilter f6439a;

        public C1325c(FilePickerActivity filePickerActivity, FileFilter fileFilter) {
            this.f6439a = fileFilter;
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return !file.isHidden() && ((file.isDirectory() && file.listFiles(this.f6439a).length > 0) || (file.isFile() && file.getName().trim().matches(".+\\.apk")));
        }
    }

    /* JADX INFO: renamed from: com.didjdk.adbhelper.FilePickerActivity$d */
    public class C1326d implements Comparator<File> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Collator f6440b;

        public C1326d(FilePickerActivity filePickerActivity, Collator collator) {
            this.f6440b = collator;
        }

        @Override // java.util.Comparator
        public int compare(File file, File file2) {
            return this.f6440b.getCollationKey(file.getName()).compareTo(this.f6440b.getCollationKey(file2.getName()));
        }
    }

    /* JADX INFO: renamed from: com.didjdk.adbhelper.FilePickerActivity$e */
    public class C1327e implements Comparator<File> {
        public C1327e(FilePickerActivity filePickerActivity) {
        }

        @Override // java.util.Comparator
        public int compare(File file, File file2) {
            Integer num = 1;
            return (file.isDirectory() ? 0 : num).compareTo(file2.isDirectory() ? 0 : 1);
        }
    }

    /* JADX INFO: renamed from: com.didjdk.adbhelper.FilePickerActivity$f */
    public class C1328f extends RecyclerView.AbstractC0132g<C1329g> {
        public C1328f() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0132g
        /* JADX INFO: renamed from: a */
        public int mo533a() {
            File[] fileArr = FilePickerActivity.this.f6434v;
            if (fileArr != null) {
                return fileArr.length;
            }
            return 0;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x007b A[Catch: Exception -> 0x0115, TryCatch #1 {Exception -> 0x0115, blocks: (B:17:0x0075, B:19:0x007b, B:21:0x007f, B:22:0x0088, B:25:0x0096, B:33:0x010d, B:28:0x00b8, B:31:0x00d9, B:32:0x00f4), top: B:42:0x0075 }] */
        /* JADX WARN: Code duplicated, block: B:21:0x007f A[Catch: Exception -> 0x0115, TryCatch #1 {Exception -> 0x0115, blocks: (B:17:0x0075, B:19:0x007b, B:21:0x007f, B:22:0x0088, B:25:0x0096, B:33:0x010d, B:28:0x00b8, B:31:0x00d9, B:32:0x00f4), top: B:42:0x0075 }] */
        /* JADX WARN: Code duplicated, block: B:22:0x0088 A[Catch: Exception -> 0x0115, TRY_LEAVE, TryCatch #1 {Exception -> 0x0115, blocks: (B:17:0x0075, B:19:0x007b, B:21:0x007f, B:22:0x0088, B:25:0x0096, B:33:0x010d, B:28:0x00b8, B:31:0x00d9, B:32:0x00f4), top: B:42:0x0075 }] */
        /* JADX WARN: Code duplicated, block: B:25:0x0096 A[Catch: Exception -> 0x0115, TRY_ENTER, TryCatch #1 {Exception -> 0x0115, blocks: (B:17:0x0075, B:19:0x007b, B:21:0x007f, B:22:0x0088, B:25:0x0096, B:33:0x010d, B:28:0x00b8, B:31:0x00d9, B:32:0x00f4), top: B:42:0x0075 }] */
        /* JADX WARN: Code duplicated, block: B:26:0x00b1  */
        /* JADX WARN: Code duplicated, block: B:28:0x00b8 A[Catch: Exception -> 0x0115, TryCatch #1 {Exception -> 0x0115, blocks: (B:17:0x0075, B:19:0x007b, B:21:0x007f, B:22:0x0088, B:25:0x0096, B:33:0x010d, B:28:0x00b8, B:31:0x00d9, B:32:0x00f4), top: B:42:0x0075 }] */
        /* JADX WARN: Code duplicated, block: B:29:0x00d3  */
        /* JADX WARN: Code duplicated, block: B:31:0x00d9 A[Catch: Exception -> 0x0115, TryCatch #1 {Exception -> 0x0115, blocks: (B:17:0x0075, B:19:0x007b, B:21:0x007f, B:22:0x0088, B:25:0x0096, B:33:0x010d, B:28:0x00b8, B:31:0x00d9, B:32:0x00f4), top: B:42:0x0075 }] */
        /* JADX WARN: Code duplicated, block: B:32:0x00f4 A[Catch: Exception -> 0x0115, TryCatch #1 {Exception -> 0x0115, blocks: (B:17:0x0075, B:19:0x007b, B:21:0x007f, B:22:0x0088, B:25:0x0096, B:33:0x010d, B:28:0x00b8, B:31:0x00d9, B:32:0x00f4), top: B:42:0x0075 }] */
        /* JADX WARN: Code duplicated, block: B:35:0x0115  */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0132g
        /* JADX INFO: renamed from: e */
        public void mo537e(RecyclerView.AbstractC0129d0 abstractC0129d0, int i) {
            ImageView imageView;
            int i2;
            Drawable drawableLoadIcon;
            FilePickerActivity filePickerActivity;
            String string;
            long length;
            StringBuilder sb;
            String str;
            C1329g c1329g = (C1329g) abstractC0129d0;
            File file = FilePickerActivity.this.f6434v[i];
            try {
                if (!file.isDirectory()) {
                    FilePickerActivity filePickerActivity2 = FilePickerActivity.this;
                    if (filePickerActivity2.f6429q == 3) {
                        String absolutePath = file.getAbsolutePath();
                        PackageManager packageManager = filePickerActivity2.getPackageManager();
                        PackageInfo packageArchiveInfo = packageManager.getPackageArchiveInfo(absolutePath, 1);
                        if (packageArchiveInfo != null) {
                            ApplicationInfo applicationInfo = packageArchiveInfo.applicationInfo;
                            applicationInfo.sourceDir = absolutePath;
                            applicationInfo.publicSourceDir = absolutePath;
                            try {
                                drawableLoadIcon = applicationInfo.loadIcon(packageManager);
                            } catch (OutOfMemoryError unused) {
                                drawableLoadIcon = null;
                            }
                        } else {
                            drawableLoadIcon = null;
                        }
                        ComponentCallbacks2C0616b.m2209f(FilePickerActivity.this).m2232l().m2227y(drawableLoadIcon).mo2218a(C0846f.m2573r(AbstractC0707k.f4168a)).m2546e(R.drawable.bb).m2226x(c1329g.f6443u);
                    } else {
                        imageView = c1329g.f6443u;
                        i2 = R.drawable.ba;
                    }
                    c1329g.f6444v.setText(file.getName());
                    TextView textView = c1329g.f6445w;
                    filePickerActivity = FilePickerActivity.this;
                    Objects.requireNonNull(filePickerActivity);
                    if (file.isDirectory()) {
                        length = file.length();
                        if (length >= 1073741824) {
                            sb = new StringBuilder();
                            sb.append(String.format("%.2f", Float.valueOf(length / 1.0737418E9f)));
                            str = " GB";
                        } else if (length >= 1048576) {
                            sb = new StringBuilder();
                            sb.append(String.format("%.2f", Float.valueOf(length / 1048576.0f)));
                            str = " MB";
                        } else if (length >= 1024) {
                            sb = new StringBuilder();
                            sb.append(String.format("%.2f", Float.valueOf(length / 1024.0f)));
                            str = " KB";
                        } else {
                            sb = new StringBuilder();
                            sb.append(String.format("%.0f", Float.valueOf(length)));
                            str = " B";
                        }
                        sb.append(str);
                        string = sb.toString();
                    } else if (filePickerActivity.f6429q == 0) {
                        string = filePickerActivity.getString(R.string.cf);
                    } else {
                        string = "";
                    }
                    textView.setText(string);
                    c1329g.f6447y.setChecked(FilePickerActivity.this.f6437y.get(i));
                }
                imageView = c1329g.f6443u;
                i2 = R.drawable.dx;
                if (file.isDirectory()) {
                    length = file.length();
                    if (length >= 1073741824) {
                        sb = new StringBuilder();
                        sb.append(String.format("%.2f", Float.valueOf(length / 1.0737418E9f)));
                        str = " GB";
                    } else if (length >= 1048576) {
                        sb = new StringBuilder();
                        sb.append(String.format("%.2f", Float.valueOf(length / 1048576.0f)));
                        str = " MB";
                    } else if (length >= 1024) {
                        sb = new StringBuilder();
                        sb.append(String.format("%.2f", Float.valueOf(length / 1024.0f)));
                        str = " KB";
                    } else {
                        sb = new StringBuilder();
                        sb.append(String.format("%.0f", Float.valueOf(length)));
                        str = " B";
                    }
                    sb.append(str);
                    string = sb.toString();
                } else if (filePickerActivity.f6429q == 0) {
                    string = filePickerActivity.getString(R.string.cf);
                } else {
                    string = "";
                }
            } catch (Exception unused2) {
            }
            imageView.setImageResource(i2);
            c1329g.f6444v.setText(file.getName());
            TextView textView2 = c1329g.f6445w;
            filePickerActivity = FilePickerActivity.this;
            Objects.requireNonNull(filePickerActivity);
            textView2.setText(string);
            c1329g.f6447y.setChecked(FilePickerActivity.this.f6437y.get(i));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0132g
        /* JADX INFO: renamed from: f */
        public RecyclerView.AbstractC0129d0 mo538f(ViewGroup viewGroup, int i) {
            final C1329g c1329g = new C1329g(FilePickerActivity.this, a.m2188b(viewGroup, R.layout.bp, viewGroup, false));
            c1329g.f6442t.setOnClickListener(new ViewOnClickListenerC0929j3(this, c1329g));
            c1329g.f6442t.setOnLongClickListener(new View.OnLongClickListener() { // from class: c.c.a.t0
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    c1329g.m509e();
                    return true;
                }
            });
            c1329g.f6447y.setOnClickListener(new View.OnClickListener() { // from class: c.c.a.s0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FilePickerActivity.C1328f c1328f = this.f4895b;
                    FilePickerActivity.C1329g c1329g2 = c1329g;
                    Objects.requireNonNull(c1328f);
                    int iM509e = c1329g2.m509e();
                    SparseBooleanArray sparseBooleanArray = FilePickerActivity.this.f6437y;
                    sparseBooleanArray.put(iM509e, !sparseBooleanArray.get(iM509e));
                }
            });
            return c1329g;
        }
    }

    /* JADX INFO: renamed from: com.didjdk.adbhelper.FilePickerActivity$g */
    public class C1329g extends RecyclerView.AbstractC0129d0 {

        /* JADX INFO: renamed from: t */
        public View f6442t;

        /* JADX INFO: renamed from: u */
        public ImageView f6443u;

        /* JADX INFO: renamed from: v */
        public TextView f6444v;

        /* JADX INFO: renamed from: w */
        public TextView f6445w;

        /* JADX INFO: renamed from: x */
        public TextView f6446x;

        /* JADX INFO: renamed from: y */
        public CheckBox f6447y;

        public C1329g(FilePickerActivity filePickerActivity, View view) {
            super(view);
            this.f6442t = view;
            this.f6443u = (ImageView) view.findViewById(R.id.gn);
            this.f6444v = (TextView) view.findViewById(R.id.ps);
            this.f6445w = (TextView) view.findViewById(R.id.pt);
            TextView textView = (TextView) view.findViewById(R.id.pu);
            this.f6446x = textView;
            textView.setVisibility(8);
            CheckBox checkBox = (CheckBox) view.findViewById(R.id.cl);
            this.f6447y = checkBox;
            int i = filePickerActivity.f6429q;
            if (i == 0) {
                checkBox.setVisibility(0);
            } else if (i == 1 || i == 2 || i == 3 || i == 4) {
                checkBox.setVisibility(4);
                this.f6445w.setVisibility(8);
            }
            view.findViewById(R.id.f5).setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m3024A() {
        Arrays.sort(this.f6434v, new C1326d(this, Collator.getInstance(Locale.CHINA)));
        Arrays.sort(this.f6434v, new C1327e(this));
    }

    /* JADX INFO: renamed from: B */
    public final void m3025B() {
        if (!this.f6436x.exists()) {
            this.f6435w = Environment.getExternalStorageDirectory().getAbsolutePath();
            this.f6436x = new File(this.f6435w);
        }
        this.f6437y.clear();
        m3026x();
        this.f6431s.setText(this.f6435w);
        m3024A();
        this.f6433u.f947a.m542b();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (!this.f6435w.equals(Environment.getExternalStorageDirectory().getAbsolutePath())) {
            m3027y();
        } else {
            setResult(-1, new Intent());
            this.f47f.m9a();
        }
    }

    @Override // android.view.View.OnClickListener
    @SuppressLint({"NonConstantResourceId"})
    public void onClick(View view) {
        if (this.f6430r) {
            int id = view.getId();
            if (id != R.id.qs) {
                if (id != R.id.qy) {
                    return;
                }
                m3027y();
                return;
            }
            Intent intent = new Intent();
            SharedPreferences.Editor editorEdit = C0532j.m1940a(this).edit();
            StringBuilder sbM2191e = a.m2191e("last_used_directory");
            sbM2191e.append(this.f6429q);
            editorEdit.putString(sbM2191e.toString(), this.f6435w).apply();
            int i = this.f6429q;
            if (i != 0) {
                if (i == 1) {
                    intent.putExtra("currentDirectory_return", this.f6435w);
                    setResult(1, intent);
                    finish();
                } else if (i != 2) {
                    return;
                }
                intent.putExtra("currentDirectory_return", this.f6435w);
                setResult(2, intent);
            } else {
                this.f6428A.clear();
                for (int i2 = 0; i2 < this.f6434v.length; i2++) {
                    if (this.f6437y.get(i2)) {
                        this.f6428A.add(this.f6434v[i2].getAbsolutePath());
                    }
                }
                if (this.f6428A.size() > 5 && !m.J(this)) {
                    m.m1952H(this, "未解锁高级功能最多选择5项");
                    return;
                } else {
                    intent.putExtra("selectedFiles_return", this.f6428A);
                    setResult(0, intent);
                }
            }
            finish();
        }
    }

    @Override // c.c.a.ActivityC1119w2, p006b.p008b.p009c.ActivityC0194j, p006b.p056m.p057b.ActivityC0459e, androidx.activity.ComponentActivity, p006b.p032h.p033b.ActivityC0361g, android.app.Activity
    public native void onCreate(Bundle bundle);

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            setResult(-1, new Intent());
            finish();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // p006b.p056m.p057b.ActivityC0459e, android.app.Activity, p006b.p032h.p033b.C0355a.b
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i != 1) {
            return;
        }
        if (iArr.length <= 0 || iArr[0] != 0) {
            m.m1952H(this, getString(R.string.eb));
        } else {
            m3028z();
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m3026x() {
        int i = this.f6429q;
        if (i == 0) {
            this.f6434v = this.f6436x.listFiles(new FileFilter() { // from class: c.c.a.v0
                @Override // java.io.FileFilter
                public final boolean accept(File file) {
                    int i2 = FilePickerActivity.f6427B;
                    return !file.isHidden();
                }
            });
            return;
        }
        if (i == 1 || i == 2) {
            this.f6434v = this.f6436x.listFiles(new C1323a(this));
            return;
        }
        if (i == 3) {
            this.f6434v = this.f6436x.listFiles(new C1325c(this, new C1324b(this)));
        } else {
            if (i != 4) {
                return;
            }
            this.f6434v = this.f6436x.listFiles(new FileFilter() { // from class: c.c.a.u0
                @Override // java.io.FileFilter
                public final boolean accept(File file) {
                    int i2 = FilePickerActivity.f6427B;
                    return !file.isHidden();
                }
            });
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m3027y() {
        if (this.f6435w.equals(Environment.getExternalStorageDirectory().getAbsolutePath()) || !this.f6430r) {
            return;
        }
        this.f6435w = this.f6436x.getParent();
        this.f6436x = this.f6436x.getParentFile();
        m3025B();
        if (this.f6438z.size() > 0) {
            RecyclerView recyclerView = this.f6432t;
            ArrayList<Integer> arrayList = this.f6438z;
            recyclerView.scrollToPosition(arrayList.get(arrayList.size() - 1).intValue());
            ArrayList<Integer> arrayList2 = this.f6438z;
            arrayList2.remove(arrayList2.size() - 1);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m3028z() {
        File file = new File(this.f6435w);
        this.f6436x = file;
        if (!file.exists()) {
            this.f6435w = Environment.getExternalStorageDirectory().getAbsolutePath();
            this.f6436x = new File(this.f6435w);
            SharedPreferences.Editor editorEdit = C0532j.m1940a(this).edit();
            StringBuilder sbM2191e = a.m2191e("last_used_directory");
            sbM2191e.append(this.f6429q);
            editorEdit.putString(sbM2191e.toString(), this.f6435w).apply();
        }
        this.f6431s.setText(this.f6435w);
        this.f6430r = true;
        m3026x();
        m3024A();
        this.f6432t = (RecyclerView) findViewById(R.id.ln);
        this.f6432t.setLayoutManager(new LinearLayoutManager(1, false));
        C1328f c1328f = new C1328f();
        this.f6433u = c1328f;
        this.f6432t.setAdapter(c1328f);
        this.f6433u.f947a.m542b();
    }
}
