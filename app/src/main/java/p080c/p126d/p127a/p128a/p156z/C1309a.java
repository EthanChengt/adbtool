package p080c.p126d.p127a.p128a.p156z;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p006b.p025e.C0320h;
import p006b.p049j.p050a.AbstractC0442a;
import c.a.a.a.a;

/* JADX INFO: renamed from: c.d.a.a.z.a */
/* JADX INFO: loaded from: classes.dex */
public class C1309a extends AbstractC0442a {
    public static final Parcelable.Creator<C1309a> CREATOR = new a();

    /* JADX INFO: renamed from: d */
    public final C0320h<String, Bundle> f6323d;

    /* JADX INFO: renamed from: c.d.a.a.z.a$a */
    public static class a implements Parcelable.ClassLoaderCreator<C1309a> {
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C1309a(parcel, null, null);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C1309a[i];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public C1309a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new C1309a(parcel, classLoader, null);
        }
    }

    public C1309a(Parcel parcel, ClassLoader classLoader, a aVar) {
        super(parcel, classLoader);
        int i = parcel.readInt();
        String[] strArr = new String[i];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[i];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f6323d = new C0320h<>(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.f6323d.put(strArr[i2], bundleArr[i2]);
        }
    }

    public C1309a(Parcelable parcelable) {
        super(parcelable);
        this.f6323d = new C0320h<>();
    }

    public String toString() {
        StringBuilder sbM2191e = a.m2191e("ExtendableSavedState{");
        sbM2191e.append(Integer.toHexString(System.identityHashCode(this)));
        sbM2191e.append(" states=");
        sbM2191e.append(this.f6323d);
        sbM2191e.append("}");
        return sbM2191e.toString();
    }

    @Override // p006b.p049j.p050a.AbstractC0442a, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f2812b, i);
        int i2 = this.f6323d.f2197d;
        parcel.writeInt(i2);
        String[] strArr = new String[i2];
        Bundle[] bundleArr = new Bundle[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = this.f6323d.m1272h(i3);
            bundleArr[i3] = this.f6323d.m1276l(i3);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}
