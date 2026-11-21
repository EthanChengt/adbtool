package p080c.p084b.p085a.p088m.p097w;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import java.io.IOException;
import c.a.a.a.a;
import p080c.p084b.p085a.p088m.C0646n;
import p080c.p084b.p085a.p088m.C0647o;
import p080c.p084b.p085a.p088m.EnumC0634b;
import p080c.p084b.p085a.p088m.EnumC0648p;
import p080c.p084b.p085a.p088m.InterfaceC0649q;
import p080c.p084b.p085a.p088m.p091u.InterfaceC0719w;
import p080c.p084b.p085a.p088m.p097w.p098c.AbstractC0768l;
import p080c.p084b.p085a.p088m.p097w.p098c.C0760d;
import p080c.p084b.p085a.p088m.p097w.p098c.C0761e;
import p080c.p084b.p085a.p088m.p097w.p098c.C0769m;
import p080c.p084b.p085a.p088m.p097w.p098c.C0774r;

/* JADX INFO: renamed from: c.b.a.m.w.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0752a<T> implements InterfaceC0649q<ImageDecoder.Source, T> {

    /* JADX INFO: renamed from: a */
    public final C0774r f4395a = C0774r.m2483a();

    /* JADX INFO: renamed from: c.b.a.m.w.a$a */
    public class a implements ImageDecoder.OnHeaderDecodedListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f4396a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f4397b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f4398c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ EnumC0634b f4399d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ AbstractC0768l f4400e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ EnumC0648p f4401f;

        /* JADX INFO: renamed from: c.b.a.m.w.a$a$a, reason: collision with other inner class name */
        public class C1399a implements ImageDecoder.OnPartialImageListener {
            public C1399a(a aVar) {
            }

            @Override // android.graphics.ImageDecoder.OnPartialImageListener
            public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
                return false;
            }
        }

        public a(int i, int i2, boolean z, EnumC0634b enumC0634b, AbstractC0768l abstractC0768l, EnumC0648p enumC0648p) {
            this.f4396a = i;
            this.f4397b = i2;
            this.f4398c = z;
            this.f4399d = enumC0634b;
            this.f4400e = abstractC0768l;
            this.f4401f = enumC0648p;
        }

        @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
        @SuppressLint({"Override"})
        public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            ColorSpace.Named named;
            boolean z = false;
            if (AbstractC0752a.this.f4395a.m2484b(this.f4396a, this.f4397b, this.f4398c, false)) {
                imageDecoder.setAllocator(3);
            } else {
                imageDecoder.setAllocator(1);
            }
            if (this.f4399d == EnumC0634b.PREFER_RGB_565) {
                imageDecoder.setMemorySizePolicy(0);
            }
            imageDecoder.setOnPartialImageListener(new C1399a(this));
            Size size = imageInfo.getSize();
            int width = this.f4396a;
            if (width == Integer.MIN_VALUE) {
                width = size.getWidth();
            }
            int height = this.f4397b;
            if (height == Integer.MIN_VALUE) {
                height = size.getHeight();
            }
            float fMo2468b = this.f4400e.mo2468b(size.getWidth(), size.getHeight(), width, height);
            int iRound = Math.round(size.getWidth() * fMo2468b);
            int iRound2 = Math.round(size.getHeight() * fMo2468b);
            if (Log.isLoggable("ImageDecoder", 2)) {
                StringBuilder sbM2191e = a.m2191e("Resizing from [");
                sbM2191e.append(size.getWidth());
                sbM2191e.append("x");
                sbM2191e.append(size.getHeight());
                sbM2191e.append("] to [");
                sbM2191e.append(iRound);
                sbM2191e.append("x");
                sbM2191e.append(iRound2);
                sbM2191e.append("] scaleFactor: ");
                sbM2191e.append(fMo2468b);
                Log.v("ImageDecoder", sbM2191e.toString());
            }
            imageDecoder.setTargetSize(iRound, iRound2);
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                if (this.f4401f == EnumC0648p.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
                    z = true;
                }
                if (z) {
                    named = ColorSpace.Named.DISPLAY_P3;
                }
                imageDecoder.setTargetColorSpace(ColorSpace.get(named));
            }
            if (i < 26) {
                return;
            }
            named = ColorSpace.Named.SRGB;
            imageDecoder.setTargetColorSpace(ColorSpace.get(named));
        }
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0649q
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo2288b(ImageDecoder.Source source, C0647o c0647o) {
        return true;
    }

    @Override // p080c.p084b.p085a.p088m.InterfaceC0649q
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC0719w<T> mo2287a(ImageDecoder.Source source, int i, int i2, C0647o c0647o) throws IOException {
        EnumC0634b enumC0634b = (EnumC0634b) c0647o.m2285c(C0769m.f4443f);
        AbstractC0768l abstractC0768l = (AbstractC0768l) c0647o.m2285c(AbstractC0768l.f4438f);
        C0646n<Boolean> c0646n = C0769m.f4446i;
        C0760d c0760d = (C0760d) this;
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new a(i, i2, c0647o.m2285c(c0646n) != null && ((Boolean) c0647o.m2285c(c0646n)).booleanValue(), enumC0634b, abstractC0768l, (EnumC0648p) c0647o.m2285c(C0769m.f4444g)));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            StringBuilder sbM2191e = a.m2191e("Decoded [");
            sbM2191e.append(bitmapDecodeBitmap.getWidth());
            sbM2191e.append("x");
            sbM2191e.append(bitmapDecodeBitmap.getHeight());
            sbM2191e.append("] for [");
            sbM2191e.append(i);
            sbM2191e.append("x");
            sbM2191e.append(i2);
            sbM2191e.append("]");
            Log.v("BitmapImageDecoder", sbM2191e.toString());
        }
        return new C0761e(bitmapDecodeBitmap, c0760d.f4421b);
    }
}
