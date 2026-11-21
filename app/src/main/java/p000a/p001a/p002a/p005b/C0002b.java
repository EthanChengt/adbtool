package p000a.p001a.p002a.p005b;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: a.a.a.b.b */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class C0002b implements Parcelable {
    public static final Parcelable.Creator<C0002b> CREATOR = new a();

    /* JADX INFO: renamed from: b */
    public InterfaceC0001a f2b;

    /* JADX INFO: renamed from: a.a.a.b.b$a */
    public static class a implements Parcelable.Creator<C0002b> {
        @Override // android.os.Parcelable.Creator
        public C0002b createFromParcel(Parcel parcel) {
            return new C0002b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public C0002b[] newArray(int i) {
            return new C0002b[i];
        }
    }

    /* JADX INFO: renamed from: a.a.a.b.b$b */
    public class b extends InterfaceC0001a.a {
        public b() {
        }
    }

    public C0002b(Parcel parcel) {
        InterfaceC0001a c1389a;
        IBinder strongBinder = parcel.readStrongBinder();
        int i = InterfaceC0001a.a.f0a;
        if (strongBinder == null) {
            c1389a = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            c1389a = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0001a)) ? new InterfaceC0001a.a.C1389a(strongBinder) : (InterfaceC0001a) iInterfaceQueryLocalInterface;
        }
        this.f2b = c1389a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: j */
    public void mo0j(int i, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f2b == null) {
                this.f2b = new b();
            }
            parcel.writeStrongBinder(this.f2b.asBinder());
        }
    }
}
