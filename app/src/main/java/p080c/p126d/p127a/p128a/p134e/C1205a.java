package p080c.p126d.p127a.p128a.p134e;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import com.didjdk.adbhelper.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import p006b.p032h.p044j.C0418m;
import p080c.p126d.p127a.p128a.C1161a;
import p080c.p126d.p127a.p128a.C1164b;
import p080c.p126d.p127a.p128a.p148r.C1276m;
import p080c.p126d.p127a.p128a.p148r.C1277n;
import p080c.p126d.p127a.p128a.p151u.C1283b;
import p080c.p126d.p127a.p128a.p154x.C1296g;

/* JADX INFO: renamed from: c.d.a.a.e.a */
/* JADX INFO: loaded from: classes.dex */
public class C1205a extends Drawable implements C1276m.b {

    /* JADX INFO: renamed from: b */
    public final WeakReference<Context> f5713b;

    /* JADX INFO: renamed from: c */
    public final C1296g f5714c;

    /* JADX INFO: renamed from: d */
    public final C1276m f5715d;

    /* JADX INFO: renamed from: e */
    public final Rect f5716e;

    /* JADX INFO: renamed from: f */
    public final float f5717f;

    /* JADX INFO: renamed from: g */
    public final float f5718g;

    /* JADX INFO: renamed from: h */
    public final float f5719h;

    /* JADX INFO: renamed from: i */
    public final a f5720i;

    /* JADX INFO: renamed from: j */
    public float f5721j;

    /* JADX INFO: renamed from: k */
    public float f5722k;

    /* JADX INFO: renamed from: l */
    public int f5723l;

    /* JADX INFO: renamed from: m */
    public float f5724m;

    /* JADX INFO: renamed from: n */
    public float f5725n;

    /* JADX INFO: renamed from: o */
    public float f5726o;

    /* JADX INFO: renamed from: p */
    public WeakReference<View> f5727p;

    /* JADX INFO: renamed from: q */
    public WeakReference<ViewGroup> f5728q;

    /* JADX INFO: renamed from: c.d.a.a.e.a$a */
    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C1402a();

        /* JADX INFO: renamed from: b */
        public int f5729b;

        /* JADX INFO: renamed from: c */
        public int f5730c;

        /* JADX INFO: renamed from: d */
        public int f5731d;

        /* JADX INFO: renamed from: e */
        public int f5732e;

        /* JADX INFO: renamed from: f */
        public int f5733f;

        /* JADX INFO: renamed from: g */
        public CharSequence f5734g;

        /* JADX INFO: renamed from: h */
        public int f5735h;

        /* JADX INFO: renamed from: i */
        public int f5736i;

        /* JADX INFO: renamed from: c.d.a.a.e.a$a$a, reason: collision with other inner class name */
        public static class C1402a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public a[] newArray(int i) {
                return new a[i];
            }
        }

        public a(Context context) {
            this.f5731d = 255;
            this.f5732e = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.jf, C1164b.f5588z);
            typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
            ColorStateList colorStateListM2723h = C1161a.m2723h(context, typedArrayObtainStyledAttributes, 3);
            C1161a.m2723h(context, typedArrayObtainStyledAttributes, 4);
            C1161a.m2723h(context, typedArrayObtainStyledAttributes, 5);
            typedArrayObtainStyledAttributes.getInt(2, 0);
            typedArrayObtainStyledAttributes.getInt(1, 1);
            int i = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
            typedArrayObtainStyledAttributes.getResourceId(i, 0);
            typedArrayObtainStyledAttributes.getString(i);
            typedArrayObtainStyledAttributes.getBoolean(14, false);
            C1161a.m2723h(context, typedArrayObtainStyledAttributes, 6);
            typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
            typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
            typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
            this.f5730c = colorStateListM2723h.getDefaultColor();
            this.f5734g = context.getString(R.string.d8);
            this.f5735h = R.plurals.a;
        }

        public a(Parcel parcel) {
            this.f5731d = 255;
            this.f5732e = -1;
            this.f5729b = parcel.readInt();
            this.f5730c = parcel.readInt();
            this.f5731d = parcel.readInt();
            this.f5732e = parcel.readInt();
            this.f5733f = parcel.readInt();
            this.f5734g = parcel.readString();
            this.f5735h = parcel.readInt();
            this.f5736i = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f5729b);
            parcel.writeInt(this.f5730c);
            parcel.writeInt(this.f5731d);
            parcel.writeInt(this.f5732e);
            parcel.writeInt(this.f5733f);
            parcel.writeString(this.f5734g.toString());
            parcel.writeInt(this.f5735h);
            parcel.writeInt(this.f5736i);
        }
    }

    public C1205a(Context context) {
        C1283b c1283b;
        Context context2;
        WeakReference<Context> weakReference = new WeakReference<>(context);
        this.f5713b = weakReference;
        C1277n.m2945c(context, C1277n.f6152b, "Theme.MaterialComponents");
        Resources resources = context.getResources();
        this.f5716e = new Rect();
        this.f5714c = new C1296g();
        this.f5717f = resources.getDimensionPixelSize(R.dimen.dt);
        this.f5719h = resources.getDimensionPixelSize(R.dimen.ds);
        this.f5718g = resources.getDimensionPixelSize(R.dimen.dw);
        C1276m c1276m = new C1276m(this);
        this.f5715d = c1276m;
        c1276m.f6144a.setTextAlign(Paint.Align.CENTER);
        this.f5720i = new a(context);
        Context context3 = weakReference.get();
        if (context3 == null || c1276m.f6149f == (c1283b = new C1283b(context3, R.style.jf)) || (context2 = weakReference.get()) == null) {
            return;
        }
        c1276m.m2940b(c1283b, context2);
        m2787e();
    }

    @Override // p080c.p126d.p127a.p128a.p148r.C1276m.b
    /* JADX INFO: renamed from: a */
    public void mo2783a() {
        invalidateSelf();
    }

    /* JADX INFO: renamed from: b */
    public final String m2784b() {
        if (m2785c() <= this.f5723l) {
            return Integer.toString(m2785c());
        }
        Context context = this.f5713b.get();
        return context == null ? "" : context.getString(R.string.d_, Integer.valueOf(this.f5723l), "+");
    }

    /* JADX INFO: renamed from: c */
    public int m2785c() {
        if (m2786d()) {
            return this.f5720i.f5732e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public boolean m2786d() {
        return this.f5720i.f5732e != -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (getBounds().isEmpty() || this.f5720i.f5731d == 0 || !isVisible()) {
            return;
        }
        this.f5714c.draw(canvas);
        if (m2786d()) {
            Rect rect = new Rect();
            String strM2784b = m2784b();
            this.f5715d.f6144a.getTextBounds(strM2784b, 0, strM2784b.length(), rect);
            canvas.drawText(strM2784b, this.f5721j, this.f5722k + (rect.height() / 2), this.f5715d.f6144a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c5  */
    /* JADX INFO: renamed from: e */
    public final void m2787e() {
        float fM2939a;
        float f;
        Context context = this.f5713b.get();
        WeakReference<View> weakReference = this.f5727p;
        View view = weakReference != null ? weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.f5716e);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference<ViewGroup> weakReference2 = this.f5728q;
        ViewGroup viewGroup = weakReference2 != null ? weakReference2.get() : null;
        if (viewGroup != null) {
            if (viewGroup == null) {
                viewGroup = (ViewGroup) view.getParent();
            }
            viewGroup.offsetDescendantRectToMyCoords(view, rect2);
        }
        int i = this.f5720i.f5736i;
        this.f5722k = (i == 8388691 || i == 8388693) ? rect2.bottom : rect2.top;
        if (m2785c() <= 9) {
            fM2939a = !m2786d() ? this.f5717f : this.f5718g;
            this.f5724m = fM2939a;
            this.f5726o = fM2939a;
        } else {
            float f2 = this.f5718g;
            this.f5724m = f2;
            this.f5726o = f2;
            fM2939a = (this.f5715d.m2939a(m2784b()) / 2.0f) + this.f5719h;
        }
        this.f5725n = fM2939a;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(m2786d() ? R.dimen.du : R.dimen.dr);
        int i2 = this.f5720i.f5736i;
        if (i2 == 8388659 || i2 == 8388691) {
            WeakHashMap<View, String> weakHashMap = C0418m.f2718a;
            if (view.getLayoutDirection() == 0) {
                f = (rect2.left - this.f5725n) + dimensionPixelSize;
            } else {
                f = (rect2.right + this.f5725n) - dimensionPixelSize;
            }
        } else {
            WeakHashMap<View, String> weakHashMap2 = C0418m.f2718a;
            if (view.getLayoutDirection() == 0) {
                f = (rect2.right + this.f5725n) - dimensionPixelSize;
            } else {
                f = (rect2.left - this.f5725n) + dimensionPixelSize;
            }
        }
        this.f5721j = f;
        Rect rect3 = this.f5716e;
        float f3 = this.f5722k;
        float f4 = this.f5725n;
        float f5 = this.f5726o;
        rect3.set((int) (f - f4), (int) (f3 - f5), (int) (f + f4), (int) (f3 + f5));
        C1296g c1296g = this.f5714c;
        c1296g.f6211b.f6233a = c1296g.f6211b.f6233a.m2989e(this.f5724m);
        c1296g.invalidateSelf();
        if (rect.equals(this.f5716e)) {
            return;
        }
        this.f5714c.setBounds(this.f5716e);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f5720i.f5731d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f5716e.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f5716e.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable, p080c.p126d.p127a.p128a.p148r.C1276m.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f5720i.f5731d = i;
        this.f5715d.f6144a.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
