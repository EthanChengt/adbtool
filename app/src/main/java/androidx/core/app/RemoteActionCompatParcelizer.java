package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;
import p006b.p077y.AbstractC0609a;
import p006b.p077y.InterfaceC0611c;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC0609a abstractC0609a) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        InterfaceC0611c interfaceC0611cM2177o = remoteActionCompat.f561a;
        if (abstractC0609a.mo2171i(1)) {
            interfaceC0611cM2177o = abstractC0609a.m2177o();
        }
        remoteActionCompat.f561a = (IconCompat) interfaceC0611cM2177o;
        CharSequence charSequenceMo2170h = remoteActionCompat.f562b;
        if (abstractC0609a.mo2171i(2)) {
            charSequenceMo2170h = abstractC0609a.mo2170h();
        }
        remoteActionCompat.f562b = charSequenceMo2170h;
        CharSequence charSequenceMo2170h2 = remoteActionCompat.f563c;
        if (abstractC0609a.mo2171i(3)) {
            charSequenceMo2170h2 = abstractC0609a.mo2170h();
        }
        remoteActionCompat.f563c = charSequenceMo2170h2;
        remoteActionCompat.f564d = (PendingIntent) abstractC0609a.m2175m(remoteActionCompat.f564d, 4);
        boolean zMo2168f = remoteActionCompat.f565e;
        if (abstractC0609a.mo2171i(5)) {
            zMo2168f = abstractC0609a.mo2168f();
        }
        remoteActionCompat.f565e = zMo2168f;
        boolean zMo2168f2 = remoteActionCompat.f566f;
        if (abstractC0609a.mo2171i(6)) {
            zMo2168f2 = abstractC0609a.mo2168f();
        }
        remoteActionCompat.f566f = zMo2168f2;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC0609a abstractC0609a) {
        Objects.requireNonNull(abstractC0609a);
        IconCompat iconCompat = remoteActionCompat.f561a;
        abstractC0609a.mo2178p(1);
        abstractC0609a.m2185w(iconCompat);
        CharSequence charSequence = remoteActionCompat.f562b;
        abstractC0609a.mo2178p(2);
        abstractC0609a.mo2181s(charSequence);
        CharSequence charSequence2 = remoteActionCompat.f563c;
        abstractC0609a.mo2178p(3);
        abstractC0609a.mo2181s(charSequence2);
        PendingIntent pendingIntent = remoteActionCompat.f564d;
        abstractC0609a.mo2178p(4);
        abstractC0609a.mo2183u(pendingIntent);
        boolean z = remoteActionCompat.f565e;
        abstractC0609a.mo2178p(5);
        abstractC0609a.mo2179q(z);
        boolean z2 = remoteActionCompat.f566f;
        abstractC0609a.mo2178p(6);
        abstractC0609a.mo2179q(z2);
    }
}
