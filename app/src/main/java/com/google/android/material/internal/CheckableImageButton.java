package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.ImageButton;
import p006b.p008b.p018i.C0269l;
import p006b.p032h.p044j.C0418m;
import p006b.p049j.p050a.AbstractC0442a;
import p080c.p126d.p127a.p128a.p148r.C1264a;

/* JADX INFO: loaded from: classes.dex */
public class CheckableImageButton extends C0269l implements Checkable {

    /* JADX INFO: renamed from: g */
    public static final int[] f10300g = {R.attr.state_checked};

    /* JADX INFO: renamed from: d */
    public boolean f10301d;

    /* JADX INFO: renamed from: e */
    public boolean f10302e;

    /* JADX INFO: renamed from: f */
    public boolean f10303f;

    /* JADX INFO: renamed from: com.google.android.material.internal.CheckableImageButton$a */
    public static class C1362a extends AbstractC0442a {
        public static final Parcelable.Creator<C1362a> CREATOR = new a();

        /* JADX INFO: renamed from: d */
        public boolean f10304d;

        /* JADX INFO: renamed from: com.google.android.material.internal.CheckableImageButton$a$a */
        public static class a implements Parcelable.ClassLoaderCreator<C1362a> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new C1362a(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new C1362a[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public C1362a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C1362a(parcel, classLoader);
            }
        }

        public C1362a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f10304d = parcel.readInt() == 1;
        }

        public C1362a(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // p006b.p049j.p050a.AbstractC0442a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f2812b, i);
            parcel.writeInt(this.f10304d ? 1 : 0);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.didjdk.adbhelper.R.attr.ip);
        this.f10302e = true;
        this.f10303f = true;
        C0418m.m1577t(this, new C1264a(this));
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f10301d;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i) {
        if (!this.f10301d) {
            return super.onCreateDrawableState(i);
        }
        int[] iArr = f10300g;
        return ImageButton.mergeDrawableStates(super.onCreateDrawableState(i + iArr.length), iArr);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1362a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1362a c1362a = (C1362a) parcelable;
        super.onRestoreInstanceState(c1362a.f2812b);
        setChecked(c1362a.f10304d);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C1362a c1362a = new C1362a(super.onSaveInstanceState());
        c1362a.f10304d = this.f10301d;
        return c1362a;
    }

    public void setCheckable(boolean z) {
        if (this.f10302e != z) {
            this.f10302e = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.f10302e || this.f10301d == z) {
            return;
        }
        this.f10301d = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z) {
        this.f10303f = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.f10303f) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f10301d);
    }
}
