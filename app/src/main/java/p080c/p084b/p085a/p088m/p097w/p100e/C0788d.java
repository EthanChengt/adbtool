package p080c.p084b.p085a.p088m.p097w.p100e;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.util.List;
import c.a.a.a.a;
import p080c.p084b.p085a.p088m.C0647o;
import p080c.p084b.p085a.p088m.InterfaceC0649q;
import p080c.p084b.p085a.p088m.p091u.InterfaceC0719w;

/* JADX INFO: renamed from: c.b.a.m.w.e.d */
/* JADX INFO: loaded from: classes.dex */
public class C0788d implements InterfaceC0649q<Uri, Drawable> {

    /* JADX INFO: renamed from: a */
    public final Context f4501a;

    public C0788d(Context context) {
        this.f4501a = context.getApplicationContext();
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0649q
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ InterfaceC0719w<Drawable> mo2287a(Uri uri, int i, int i2, C0647o c0647o) {
        return m2497c(uri);
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0649q
    /* JADX INFO: renamed from: b */
    public boolean mo2288b(Uri uri, C0647o c0647o) {
        return uri.getScheme().equals("android.resource");
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC0719w m2497c(Uri uri) {
        Context contextCreatePackageContext;
        int identifier;
        String authority = uri.getAuthority();
        if (authority.equals(this.f4501a.getPackageName())) {
            contextCreatePackageContext = this.f4501a;
        } else {
            try {
                contextCreatePackageContext = this.f4501a.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e) {
                if (!authority.contains(this.f4501a.getPackageName())) {
                    throw new IllegalArgumentException(a.m2199m("Failed to obtain context or unrecognized Uri format for: ", uri), e);
                }
                contextCreatePackageContext = this.f4501a;
            }
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri.getPathSegments();
            String authority2 = uri.getAuthority();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            identifier = contextCreatePackageContext.getResources().getIdentifier(str2, str, authority2);
            if (identifier == 0) {
                identifier = Resources.getSystem().getIdentifier(str2, str, "android");
            }
            if (identifier == 0) {
                throw new IllegalArgumentException(a.m2199m("Failed to find resource id for: ", uri));
            }
        } else {
            if (pathSegments.size() != 1) {
                throw new IllegalArgumentException(a.m2199m("Unrecognized Uri format: ", uri));
            }
            try {
                identifier = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e2) {
                throw new IllegalArgumentException(a.m2199m("Unrecognized Uri format: ", uri), e2);
            }
        }
        Drawable drawableM2496a = C0785a.m2496a(this.f4501a, contextCreatePackageContext, identifier, null);
        if (drawableM2496a != null) {
            return new C0787c(drawableM2496a);
        }
        return null;
    }
}
