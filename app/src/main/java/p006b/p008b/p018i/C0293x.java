package p006b.p008b.p018i;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* JADX INFO: renamed from: b.b.i.x */
/* JADX INFO: loaded from: classes.dex */
public final class C0293x {

    /* JADX INFO: renamed from: a */
    public TextView f2049a;

    /* JADX INFO: renamed from: b */
    public TextClassifier f2050b;

    public C0293x(TextView textView) {
        this.f2049a = textView;
    }

    /* JADX INFO: renamed from: a */
    public TextClassifier m1150a() {
        TextClassifier textClassifier = this.f2050b;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) this.f2049a.getContext().getSystemService(TextClassificationManager.class);
        return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
    }
}
