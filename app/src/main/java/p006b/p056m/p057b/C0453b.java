package p006b.p056m.p057b;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

/* JADX INFO: renamed from: b.m.b.b */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class C0453b implements Parcelable {
    public static final Parcelable.Creator<C0453b> CREATOR = new a();

    /* JADX INFO: renamed from: b */
    public final int[] f2956b;

    /* JADX INFO: renamed from: c */
    public final ArrayList<String> f2957c;

    /* JADX INFO: renamed from: d */
    public final int[] f2958d;

    /* JADX INFO: renamed from: e */
    public final int[] f2959e;

    /* JADX INFO: renamed from: f */
    public final int f2960f;

    /* JADX INFO: renamed from: g */
    public final String f2961g;

    /* JADX INFO: renamed from: h */
    public final int f2962h;

    /* JADX INFO: renamed from: i */
    public final int f2963i;

    /* JADX INFO: renamed from: j */
    public final CharSequence f2964j;

    /* JADX INFO: renamed from: k */
    public final int f2965k;

    /* JADX INFO: renamed from: l */
    public final CharSequence f2966l;

    /* JADX INFO: renamed from: m */
    public final ArrayList<String> f2967m;

    /* JADX INFO: renamed from: n */
    public final ArrayList<String> f2968n;

    /* JADX INFO: renamed from: o */
    public final boolean f2969o;

    /* JADX INFO: renamed from: b.m.b.b$a */
    public static class a implements Parcelable.Creator<C0453b> {
        @Override // android.os.Parcelable.Creator
        public C0453b createFromParcel(Parcel parcel) {
            return new C0453b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public C0453b[] newArray(int i) {
            return new C0453b[i];
        }
    }

    public C0453b(Parcel parcel) {
        this.f2956b = parcel.createIntArray();
        this.f2957c = parcel.createStringArrayList();
        this.f2958d = parcel.createIntArray();
        this.f2959e = parcel.createIntArray();
        this.f2960f = parcel.readInt();
        this.f2961g = parcel.readString();
        this.f2962h = parcel.readInt();
        this.f2963i = parcel.readInt();
        this.f2964j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2965k = parcel.readInt();
        this.f2966l = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2967m = parcel.createStringArrayList();
        this.f2968n = parcel.createStringArrayList();
        this.f2969o = parcel.readInt() != 0;
    }

    public C0453b(C0451a c0451a) {
        int size = c0451a.f2932a.size();
        this.f2956b = new int[size * 5];
        if (!c0451a.f2938g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f2957c = new ArrayList<>(size);
        this.f2958d = new int[size];
        this.f2959e = new int[size];
        int i = 0;
        int i2 = 0;
        while (i < size) {
            AbstractC0452a0.a aVar = c0451a.f2932a.get(i);
            int i3 = i2 + 1;
            this.f2956b[i2] = aVar.f2948a;
            ArrayList<String> arrayList = this.f2957c;
            Fragment fragment = aVar.f2949b;
            arrayList.add(fragment != null ? fragment.f685f : null);
            int[] iArr = this.f2956b;
            int i4 = i3 + 1;
            iArr[i3] = aVar.f2950c;
            int i5 = i4 + 1;
            iArr[i4] = aVar.f2951d;
            int i6 = i5 + 1;
            iArr[i5] = aVar.f2952e;
            iArr[i6] = aVar.f2953f;
            this.f2958d[i] = aVar.f2954g.ordinal();
            this.f2959e[i] = aVar.f2955h.ordinal();
            i++;
            i2 = i6 + 1;
        }
        this.f2960f = c0451a.f2937f;
        this.f2961g = c0451a.f2940i;
        this.f2962h = c0451a.f2931s;
        this.f2963i = c0451a.f2941j;
        this.f2964j = c0451a.f2942k;
        this.f2965k = c0451a.f2943l;
        this.f2966l = c0451a.f2944m;
        this.f2967m = c0451a.f2945n;
        this.f2968n = c0451a.f2946o;
        this.f2969o = c0451a.f2947p;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f2956b);
        parcel.writeStringList(this.f2957c);
        parcel.writeIntArray(this.f2958d);
        parcel.writeIntArray(this.f2959e);
        parcel.writeInt(this.f2960f);
        parcel.writeString(this.f2961g);
        parcel.writeInt(this.f2962h);
        parcel.writeInt(this.f2963i);
        TextUtils.writeToParcel(this.f2964j, parcel, 0);
        parcel.writeInt(this.f2965k);
        TextUtils.writeToParcel(this.f2966l, parcel, 0);
        parcel.writeStringList(this.f2967m);
        parcel.writeStringList(this.f2968n);
        parcel.writeInt(this.f2969o ? 1 : 0);
    }
}
