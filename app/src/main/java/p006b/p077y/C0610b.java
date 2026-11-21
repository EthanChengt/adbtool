package p006b.p077y;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;
import p006b.p025e.C0313a;
import c.a.a.a.a;

/* JADX INFO: renamed from: b.y.b */
/* JADX INFO: loaded from: classes.dex */
public class C0610b extends AbstractC0609a {

    /* JADX INFO: renamed from: d */
    public final SparseIntArray f3740d;

    /* JADX INFO: renamed from: e */
    public final Parcel f3741e;

    /* JADX INFO: renamed from: f */
    public final int f3742f;

    /* JADX INFO: renamed from: g */
    public final int f3743g;

    /* JADX INFO: renamed from: h */
    public final String f3744h;

    /* JADX INFO: renamed from: i */
    public int f3745i;

    /* JADX INFO: renamed from: j */
    public int f3746j;

    /* JADX INFO: renamed from: k */
    public int f3747k;

    public C0610b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C0313a(), new C0313a(), new C0313a());
    }

    public C0610b(Parcel parcel, int i, int i2, String str, C0313a<String, Method> c0313a, C0313a<String, Method> c0313a2, C0313a<String, Class> c0313a3) {
        super(c0313a, c0313a2, c0313a3);
        this.f3740d = new SparseIntArray();
        this.f3745i = -1;
        this.f3746j = 0;
        this.f3747k = -1;
        this.f3741e = parcel;
        this.f3742f = i;
        this.f3743g = i2;
        this.f3746j = i;
        this.f3744h = str;
    }

    @Override // p006b.p077y.AbstractC0609a
    /* JADX INFO: renamed from: a */
    public void mo2163a() {
        int i = this.f3745i;
        if (i >= 0) {
            int i2 = this.f3740d.get(i);
            int iDataPosition = this.f3741e.dataPosition();
            this.f3741e.setDataPosition(i2);
            this.f3741e.writeInt(iDataPosition - i2);
            this.f3741e.setDataPosition(iDataPosition);
        }
    }

    @Override // p006b.p077y.AbstractC0609a
    /* JADX INFO: renamed from: b */
    public AbstractC0609a mo2164b() {
        Parcel parcel = this.f3741e;
        int iDataPosition = parcel.dataPosition();
        int i = this.f3746j;
        if (i == this.f3742f) {
            i = this.f3743g;
        }
        return new C0610b(parcel, iDataPosition, i, a.m2203q(new StringBuilder(), this.f3744h, "  "), this.f3737a, this.f3738b, this.f3739c);
    }

    @Override // p006b.p077y.AbstractC0609a
    /* JADX INFO: renamed from: f */
    public boolean mo2168f() {
        return this.f3741e.readInt() != 0;
    }

    @Override // p006b.p077y.AbstractC0609a
    /* JADX INFO: renamed from: g */
    public byte[] mo2169g() {
        int i = this.f3741e.readInt();
        if (i < 0) {
            return null;
        }
        byte[] bArr = new byte[i];
        this.f3741e.readByteArray(bArr);
        return bArr;
    }

    @Override // p006b.p077y.AbstractC0609a
    /* JADX INFO: renamed from: h */
    public CharSequence mo2170h() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f3741e);
    }

    @Override // p006b.p077y.AbstractC0609a
    /* JADX INFO: renamed from: i */
    public boolean mo2171i(int i) {
        while (this.f3746j < this.f3743g) {
            int i2 = this.f3747k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.f3741e.setDataPosition(this.f3746j);
            int i3 = this.f3741e.readInt();
            this.f3747k = this.f3741e.readInt();
            this.f3746j += i3;
        }
        return this.f3747k == i;
    }

    @Override // p006b.p077y.AbstractC0609a
    /* JADX INFO: renamed from: j */
    public int mo2172j() {
        return this.f3741e.readInt();
    }

    @Override // p006b.p077y.AbstractC0609a
    /* JADX INFO: renamed from: l */
    public <T extends Parcelable> T mo2174l() {
        return (T) this.f3741e.readParcelable(C0610b.class.getClassLoader());
    }

    @Override // p006b.p077y.AbstractC0609a
    /* JADX INFO: renamed from: n */
    public String mo2176n() {
        return this.f3741e.readString();
    }

    @Override // p006b.p077y.AbstractC0609a
    /* JADX INFO: renamed from: p */
    public void mo2178p(int i) {
        mo2163a();
        this.f3745i = i;
        this.f3740d.put(i, this.f3741e.dataPosition());
        this.f3741e.writeInt(0);
        this.f3741e.writeInt(i);
    }

    @Override // p006b.p077y.AbstractC0609a
    /* JADX INFO: renamed from: q */
    public void mo2179q(boolean z) {
        this.f3741e.writeInt(z ? 1 : 0);
    }

    @Override // p006b.p077y.AbstractC0609a
    /* JADX INFO: renamed from: r */
    public void mo2180r(byte[] bArr) {
        if (bArr == null) {
            this.f3741e.writeInt(-1);
        } else {
            this.f3741e.writeInt(bArr.length);
            this.f3741e.writeByteArray(bArr);
        }
    }

    @Override // p006b.p077y.AbstractC0609a
    /* JADX INFO: renamed from: s */
    public void mo2181s(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f3741e, 0);
    }

    @Override // p006b.p077y.AbstractC0609a
    /* JADX INFO: renamed from: t */
    public void mo2182t(int i) {
        this.f3741e.writeInt(i);
    }

    @Override // p006b.p077y.AbstractC0609a
    /* JADX INFO: renamed from: u */
    public void mo2183u(Parcelable parcelable) {
        this.f3741e.writeParcelable(parcelable, 0);
    }

    @Override // p006b.p077y.AbstractC0609a
    /* JADX INFO: renamed from: v */
    public void mo2184v(String str) {
        this.f3741e.writeString(str);
    }
}
