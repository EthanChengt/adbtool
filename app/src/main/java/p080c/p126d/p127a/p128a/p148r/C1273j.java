package p080c.p126d.p127a.p128a.p148r;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* JADX INFO: renamed from: c.d.a.a.r.j */
/* JADX INFO: loaded from: classes.dex */
public class C1273j extends SparseArray<Parcelable> implements Parcelable {
    public static final Parcelable.Creator<C1273j> CREATOR = new a();

    /* JADX INFO: renamed from: c.d.a.a.r.j$a */
    public static class a implements Parcelable.ClassLoaderCreator<C1273j> {
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C1273j(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C1273j[i];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public C1273j createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new C1273j(parcel, classLoader);
        }
    }

    public C1273j() {
    }

    public C1273j(Parcel parcel, ClassLoader classLoader) {
        int i = parcel.readInt();
        int[] iArr = new int[i];
        parcel.readIntArray(iArr);
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        for (int i2 = 0; i2 < i; i2++) {
            put(iArr[i2], parcelableArray[i2]);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int size = size();
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = keyAt(i2);
            parcelableArr[i2] = valueAt(i2);
        }
        parcel.writeInt(size);
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
