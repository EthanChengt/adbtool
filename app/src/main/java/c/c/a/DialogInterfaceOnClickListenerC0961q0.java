package c.c.a;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.media.MediaScannerConnection;
import android.os.Build;
import com.didjdk.adbhelper.FeedbackActivity;
import com.didjdk.adbhelper.R;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Objects;
import b.s.m;

/* JADX INFO: renamed from: c.c.a.q0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0961q0 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FeedbackActivity f4877b;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        FeedbackActivity feedbackActivity = this.f4877b;
        Objects.requireNonNull(feedbackActivity);
        String string = C0894c3.f4774a;
        File file = new File(string);
        if (file.exists()) {
            file.delete();
        }
        boolean z = false;
        try {
            Drawable drawable = Build.VERSION.SDK_INT >= 21 ? feedbackActivity.getDrawable(R.drawable.ew) : null;
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            drawable.draw(canvas);
            bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            MediaScannerConnection.scanFile(feedbackActivity, new String[]{string}, null, null);
            z = true;
        } catch (Exception unused) {
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append(feedbackActivity.getString(R.string.g8));
        } else {
            sb.append(string);
            string = feedbackActivity.getString(R.string.g7);
        }
        sb.append(string);
        m.m1952H(feedbackActivity, sb.toString());
    }
}
