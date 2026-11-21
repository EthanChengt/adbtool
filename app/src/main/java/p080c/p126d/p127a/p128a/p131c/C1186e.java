package p080c.p126d.p127a.p128a.p131c;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* JADX INFO: renamed from: c.d.a.a.c.e */
/* JADX INFO: loaded from: classes.dex */
public class C1186e extends Property<ImageView, Matrix> {

    /* JADX INFO: renamed from: a */
    public final Matrix f5671a;

    public C1186e() {
        super(Matrix.class, "imageMatrixProperty");
        this.f5671a = new Matrix();
    }

    @Override // android.util.Property
    public Matrix get(ImageView imageView) {
        this.f5671a.set(imageView.getImageMatrix());
        return this.f5671a;
    }

    @Override // android.util.Property
    public void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
