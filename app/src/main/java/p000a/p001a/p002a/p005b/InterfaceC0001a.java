package p000a.p001a.p002a.p005b;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: renamed from: a.a.a.b.a */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0001a extends IInterface {

    /* JADX INFO: renamed from: a.a.a.b.a$a */
    public static abstract class a extends Binder implements InterfaceC0001a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int f0a = 0;

        /* JADX INFO: renamed from: a.a.a.b.a$a$a, reason: collision with other inner class name */
        public static class C1389a implements InterfaceC0001a {

            /* JADX INFO: renamed from: a */
            public IBinder f1a;

            public C1389a(IBinder iBinder) {
                this.f1a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f1a;
            }
        }

        public a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString("android.support.v4.os.IResultReceiver");
                return true;
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
