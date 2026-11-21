package p080c.p084b.p085a.p088m.p089t;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import c.a.a.a.a;

/* JADX INFO: renamed from: c.b.a.m.t.n */
/* JADX INFO: loaded from: classes.dex */
public class C0665n extends AbstractC0663l<InputStream> {

    /* JADX INFO: renamed from: e */
    public static final UriMatcher f3973e;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f3973e = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public C0665n(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // p080c.p084b.p085a.p088m.p089t.InterfaceC0655d
    /* JADX INFO: renamed from: a */
    public Class<InputStream> mo2291a() {
        return InputStream.class;
    }

    @Override // p080c.p084b.p085a.p088m.p089t.AbstractC0663l
    /* JADX INFO: renamed from: d */
    public void mo2292d(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0019  */
    /* JADX WARN: Code duplicated, block: B:12:0x001f  */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    @Override // p080c.p084b.p085a.p088m.p089t.AbstractC0663l
    /* JADX INFO: renamed from: f */
    public InputStream mo2293f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        Uri uriLookupContact;
        InputStream inputStreamOpenContactPhotoInputStream;
        int iMatch = f3973e.match(uri);
        if (iMatch == 1) {
            uriLookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
            if (uriLookupContact != null) {
                throw new FileNotFoundException("Contact cannot be found");
            }
            inputStreamOpenContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uriLookupContact, true);
        } else if (iMatch == 3) {
            inputStreamOpenContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
        } else if (iMatch != 5) {
            inputStreamOpenContactPhotoInputStream = contentResolver.openInputStream(uri);
        } else {
            uriLookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
            if (uriLookupContact != null) {
                throw new FileNotFoundException("Contact cannot be found");
            }
            inputStreamOpenContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uriLookupContact, true);
        }
        if (inputStreamOpenContactPhotoInputStream != null) {
            return inputStreamOpenContactPhotoInputStream;
        }
        throw new FileNotFoundException(a.m2199m("InputStream is null for ", uri));
    }
}
