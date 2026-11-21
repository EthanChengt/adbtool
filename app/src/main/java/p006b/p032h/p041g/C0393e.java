package p006b.p032h.p041g;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import p006b.p025e.C0318f;
import p006b.p025e.C0320h;
import p006b.p032h.p033b.C0360f;
import p006b.p032h.p036d.C0372c;
import c.a.a.a.a;

/* JADX INFO: renamed from: b.h.g.e */
/* JADX INFO: loaded from: classes.dex */
public class C0393e {

    /* JADX INFO: renamed from: a */
    public static final C0318f<String, Typeface> f2639a = new C0318f<>(16);

    /* JADX INFO: renamed from: b */
    public static final C0394f f2640b = new C0394f("fonts", 10, 10000);

    /* JADX INFO: renamed from: c */
    public static final Object f2641c = new Object();

    /* JADX INFO: renamed from: d */
    public static final C0320h<String, ArrayList<C0394f.c<d>>> f2642d = new C0320h<>();

    /* JADX INFO: renamed from: e */
    public static final Comparator<byte[]> f2643e = new a();

    /* JADX INFO: renamed from: b.h.g.e$a */
    public static class a implements Comparator<byte[]> {
        @Override // java.util.Comparator
        public int compare(byte[] bArr, byte[] bArr2) {
            int length;
            int length2;
            byte[] bArr3 = bArr;
            byte[] bArr4 = bArr2;
            if (bArr3.length == bArr4.length) {
                for (int i = 0; i < bArr3.length; i++) {
                    if (bArr3[i] != bArr4[i]) {
                        length = bArr3[i];
                        length2 = bArr4[i];
                    }
                }
                return 0;
            }
            length = bArr3.length;
            length2 = bArr4.length;
            return length - length2;
        }
    }

    /* JADX INFO: renamed from: b.h.g.e$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final int f2644a;

        /* JADX INFO: renamed from: b */
        public final c[] f2645b;

        public b(int i, c[] cVarArr) {
            this.f2644a = i;
            this.f2645b = cVarArr;
        }
    }

    /* JADX INFO: renamed from: b.h.g.e$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public final Uri f2646a;

        /* JADX INFO: renamed from: b */
        public final int f2647b;

        /* JADX INFO: renamed from: c */
        public final int f2648c;

        /* JADX INFO: renamed from: d */
        public final boolean f2649d;

        /* JADX INFO: renamed from: e */
        public final int f2650e;

        public c(Uri uri, int i, int i2, boolean z, int i3) {
            Objects.requireNonNull(uri);
            this.f2646a = uri;
            this.f2647b = i;
            this.f2648c = i2;
            this.f2649d = z;
            this.f2650e = i3;
        }
    }

    /* JADX INFO: renamed from: b.h.g.e$d */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public final Typeface f2651a;

        /* JADX INFO: renamed from: b */
        public final int f2652b;

        public d(Typeface typeface, int i) {
            this.f2651a = typeface;
            this.f2652b = i;
        }
    }

    /* JADX INFO: renamed from: a */
    public static b m1524a(Context context, CancellationSignal cancellationSignal, C0389a c0389a) throws PackageManager.NameNotFoundException {
        Cursor cursorQuery;
        boolean z;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = c0389a.f2627a;
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException(a.m2201o("No package found for authority: ", str));
        }
        if (!providerInfoResolveContentProvider.packageName.equals(c0389a.f2628b)) {
            throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + c0389a.f2628b);
        }
        Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        Collections.sort(arrayList, f2643e);
        List<List<byte[]>> listM1420L = c0389a.f2630d;
        if (listM1420L == null) {
            listM1420L = C0360f.m1420L(resources, 0);
        }
        int i = 0;
        while (true) {
            cursorQuery = null;
            if (i >= listM1420L.size()) {
                providerInfoResolveContentProvider = null;
                break;
            }
            ArrayList arrayList2 = new ArrayList(listM1420L.get(i));
            Collections.sort(arrayList2, f2643e);
            if (arrayList.size() != arrayList2.size()) {
                z = false;
                break;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= arrayList.size()) {
                    z = true;
                    break;
                }
                if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                    z = false;
                    break;
                }
                i2++;
            }
            if (z) {
                break;
            }
            i++;
        }
        if (providerInfoResolveContentProvider == null) {
            return new b(1, null);
        }
        String str2 = providerInfoResolveContentProvider.authority;
        ArrayList arrayList3 = new ArrayList();
        Uri uriBuild = new Uri.Builder().scheme("content").authority(str2).build();
        Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str2).appendPath("file").build();
        try {
            cursorQuery = context.getContentResolver().query(uriBuild, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{c0389a.f2629c}, null, null);
            if (cursorQuery != null && cursorQuery.getCount() > 0) {
                int columnIndex = cursorQuery.getColumnIndex("result_code");
                arrayList3 = new ArrayList();
                int columnIndex2 = cursorQuery.getColumnIndex("_id");
                int columnIndex3 = cursorQuery.getColumnIndex("file_id");
                int columnIndex4 = cursorQuery.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursorQuery.getColumnIndex("font_weight");
                int columnIndex6 = cursorQuery.getColumnIndex("font_italic");
                while (cursorQuery.moveToNext()) {
                    arrayList3.add(new c(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3)), columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorQuery.getInt(columnIndex6) == 1, columnIndex != -1 ? cursorQuery.getInt(columnIndex) : 0));
                }
            }
            return new b(0, (c[]) arrayList3.toArray(new c[0]));
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static d m1525b(Context context, C0389a c0389a, int i) {
        try {
            b bVarM1524a = m1524a(context, null, c0389a);
            int i2 = bVarM1524a.f2644a;
            if (i2 != 0) {
                return new d(null, i2 == 1 ? -2 : -3);
            }
            Typeface typefaceMo1498b = C0372c.f2593a.mo1498b(context, null, bVarM1524a.f2645b, i);
            return new d(typefaceMo1498b, typefaceMo1498b != null ? 0 : -3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new d(null, -1);
        }
    }
}
