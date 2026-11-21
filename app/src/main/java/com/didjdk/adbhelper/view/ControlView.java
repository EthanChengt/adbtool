package com.didjdk.adbhelper.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.didjdk.adbhelper.RemoteActivity;
import java.nio.ByteBuffer;
import c.c.a.q3;
import c.c.a.p122w3.p123j.C1129a;

/* JADX INFO: loaded from: classes.dex */
public class ControlView extends FrameLayout {

    /* JADX INFO: renamed from: b */
    public int f10100b;

    /* JADX INFO: renamed from: c */
    public int f10101c;

    /* JADX INFO: renamed from: d */
    public int f10102d;

    /* JADX INFO: renamed from: e */
    public int f10103e;

    /* JADX INFO: renamed from: f */
    public int f10104f;

    /* JADX INFO: renamed from: g */
    public int f10105g;

    /* JADX INFO: renamed from: h */
    public C1129a f10106h;

    /* JADX INFO: renamed from: i */
    public boolean f10107i;

    /* JADX INFO: renamed from: j */
    public RemoteActivity f10108j;

    /* JADX INFO: renamed from: k */
    public int f10109k;

    /* JADX INFO: renamed from: l */
    public int f10110l;

    /* JADX INFO: renamed from: m */
    public int f10111m;

    /* JADX INFO: renamed from: n */
    public long f10112n;

    public ControlView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10107i = false;
    }

    /* JADX INFO: renamed from: a */
    public final int m3039a(float f) {
        try {
            return (((int) (f - this.f10104f)) * this.f10100b) / this.f10102d;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m3040b(float f) {
        try {
            return (((int) (f - this.f10105g)) * this.f10101c) / this.f10103e;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m3041c(int i, int i2, int i3, int i4) {
        this.f10100b = i;
        this.f10101c = i2;
        this.f10102d = i3;
        this.f10103e = i4;
        this.f10104f = (getWidth() - i3) / 2;
        this.f10105g = (getHeight() - i4) / 2;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        q3 runnableC0964q3;
        StringBuilder sb;
        super.onTouchEvent(motionEvent);
        if (this.f10107i) {
            int action = motionEvent.getAction();
            int iM3039a = m3039a(motionEvent.getX());
            int iM3040b = m3040b(motionEvent.getY());
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (action == 0) {
                this.f10109k = 0;
                this.f10110l = m3039a(motionEvent.getX());
                this.f10111m = m3040b(motionEvent.getY());
                this.f10112n = SystemClock.uptimeMillis();
            } else if (action == 1) {
                int i = this.f10109k;
                if (i == 0) {
                    runnableC0964q3 = this.f10108j.f10058L;
                    sb = new StringBuilder();
                    sb.append(this.f10108j.f10068q);
                    sb.append("shell input tap ");
                    sb.append(iM3039a);
                    sb.append(" ");
                    sb.append(iM3040b);
                } else if (i == 2) {
                    runnableC0964q3 = this.f10108j.f10058L;
                    sb = new StringBuilder();
                    sb.append(this.f10108j.f10068q);
                    sb.append("shell input swipe ");
                    sb.append(this.f10110l);
                    sb.append(" ");
                    sb.append(this.f10111m);
                    sb.append(" ");
                    sb.append(iM3039a);
                    sb.append(" ");
                    sb.append(iM3040b);
                    sb.append(" ");
                    sb.append(jUptimeMillis - this.f10112n);
                }
                runnableC0964q3.m2627c(sb.toString());
            } else if (action == 2) {
                this.f10109k = 2;
            }
            return true;
        }
        if (this.f10106h == null) {
            return true;
        }
        long jUptimeMillis2 = SystemClock.uptimeMillis();
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        int iM3039a2 = m3039a(motionEvent.getX(actionIndex));
        int iM3040b2 = m3040b(motionEvent.getY(actionIndex));
        int pointerCount = motionEvent.getPointerCount();
        int i2 = this.f10100b;
        int i3 = this.f10101c;
        int buttonState = motionEvent.getButtonState();
        int i4 = 36;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i5 = 0;
                    while (i5 < pointerCount) {
                        int pointerId2 = motionEvent.getPointerId(i5);
                        int iM3039a3 = m3039a(motionEvent.getX(i5));
                        int iM3040b3 = m3040b(motionEvent.getY(i5));
                        int i6 = this.f10100b;
                        int i7 = this.f10101c;
                        C1129a c1129a = this.f10106h;
                        long j = jUptimeMillis2;
                        long j2 = pointerId2;
                        byte[] bArr = new byte[i4];
                        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                        byteBufferWrap.put((byte) 2);
                        byteBufferWrap.put((byte) 2);
                        byteBufferWrap.putLong(j2);
                        byteBufferWrap.putInt(iM3039a3);
                        byteBufferWrap.putInt(iM3040b3);
                        byteBufferWrap.putShort((short) i6);
                        byteBufferWrap.putShort((short) i7);
                        byteBufferWrap.putShort((short) -1);
                        byteBufferWrap.putInt(buttonState);
                        byteBufferWrap.putLong(j);
                        c1129a.m2685a(bArr);
                        i5++;
                        jUptimeMillis2 = j;
                        i4 = 36;
                    }
                    return true;
                }
                if (actionMasked != 5) {
                    if (actionMasked != 6) {
                        return true;
                    }
                }
            }
            C1129a c1129a2 = this.f10106h;
            byte[] bArr2 = new byte[36];
            ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr2);
            byteBufferWrap2.put((byte) 2);
            byteBufferWrap2.put((byte) 1);
            byteBufferWrap2.putLong(pointerId);
            byteBufferWrap2.putInt(iM3039a2);
            byteBufferWrap2.putInt(iM3040b2);
            byteBufferWrap2.putShort((short) i2);
            byteBufferWrap2.putShort((short) i3);
            byteBufferWrap2.putShort((short) -1);
            byteBufferWrap2.putInt(buttonState);
            byteBufferWrap2.putLong(jUptimeMillis2);
            c1129a2.m2685a(bArr2);
            return true;
        }
        C1129a c1129a3 = this.f10106h;
        byte[] bArr3 = new byte[36];
        ByteBuffer byteBufferWrap3 = ByteBuffer.wrap(bArr3);
        byteBufferWrap3.put((byte) 2);
        byteBufferWrap3.put((byte) 0);
        byteBufferWrap3.putLong(pointerId);
        byteBufferWrap3.putInt(iM3039a2);
        byteBufferWrap3.putInt(iM3040b2);
        byteBufferWrap3.putShort((short) i2);
        byteBufferWrap3.putShort((short) i3);
        byteBufferWrap3.putShort((short) -1);
        byteBufferWrap3.putInt(buttonState);
        byteBufferWrap3.putLong(jUptimeMillis2);
        c1129a3.m2685a(bArr3);
        return true;
    }

    public void setMessageSender(C1129a c1129a) {
        this.f10106h = c1129a;
    }
}
