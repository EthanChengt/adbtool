package c.c.a.v3.m0;

import android.widget.EditText;
import android.widget.SeekBar;

/* JADX INFO: renamed from: c.c.a.v3.m0.c0 */
/* JADX INFO: loaded from: classes.dex */
public class C1076c0 implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ EditText f5331a;

    public C1076c0(C1102z c1102z, EditText editText) {
        this.f5331a = editText;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.f5331a.setText(String.format("%.2f", Float.valueOf(i / 20.0f)));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
    }
}
