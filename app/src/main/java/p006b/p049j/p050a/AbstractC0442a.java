package p006b.p049j.p050a;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: b.j.a.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0442a implements Parcelable {

    /* JADX INFO: renamed from: b */
    public final Parcelable f2812b;

    /* JADX INFO: renamed from: c */
    public static final AbstractC0442a f2811c = new a();
    public static final Parcelable.Creator<AbstractC0442a> CREATOR = new b();

    /* JADX INFO: renamed from: b.j.a.a$a */
    public static class a extends AbstractC0442a {
        public a() {
            super((a) null);
        }
    }

    /* JADX INFO: renamed from: b.j.a.a$b */
    public static class b implements Parcelable.ClassLoaderCreator<AbstractC0442a> {
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            if (parcel.readParcelable(null) == null) {
                return AbstractC0442a.f2811c;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new AbstractC0442a[i];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public AbstractC0442a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbstractC0442a.f2811c;
            }
            throw new IllegalStateException("superState must be null");
        }
    }

    public AbstractC0442a(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f2812b = parcelable == null ? f2811c : parcelable;
    }

    public AbstractC0442a(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.f2812b = parcelable == f2811c ? null : parcelable;
    }

    public AbstractC0442a(a aVar) {
        this.f2812b = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f2812b, i);
    }
}
