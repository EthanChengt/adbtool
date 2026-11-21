package c.c.a;

import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbEndpoint;
import android.hardware.usb.UsbInterface;
import android.os.Handler;
import com.didjdk.adbhelper.ConnectActivity;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: c.c.a.t3 */
/* JADX INFO: loaded from: classes.dex */
public class t3 {

    /* JADX INFO: renamed from: a */
    public final UsbDeviceConnection a;

    /* JADX INFO: renamed from: b */
    public final UsbEndpoint b;

    /* JADX INFO: renamed from: c */
    public final UsbEndpoint c;

    /* JADX INFO: renamed from: d */
    public final UsbInterface d;

    /* JADX INFO: renamed from: e */
    public ServerSocket e;

    /* JADX INFO: renamed from: f */
    public InputStream f;

    /* JADX INFO: renamed from: g */
    public OutputStream g;

    /* JADX INFO: renamed from: h */
    public ConnectActivity h;

    /* JADX INFO: renamed from: i */
    public int i;

    /* JADX INFO: renamed from: j */
    public int j;

    /* JADX INFO: renamed from: k */
    public Handler k;

    /* JADX INFO: renamed from: l */
    public boolean l = false;

    /* JADX INFO: renamed from: m */
    public boolean m = false;

    /* JADX INFO: renamed from: n */
    public boolean n = false;

    public t3(UsbDeviceConnection usbDeviceConnection, UsbInterface usbInterface) {
        this.i = 512;
        this.j = 512;
        this.a = usbDeviceConnection;
        this.d = usbInterface;
        UsbEndpoint usbEndpoint = null;
        UsbEndpoint usbEndpoint2 = null;
        for (int i = 0; i < usbInterface.getEndpointCount(); i++) {
            UsbEndpoint endpoint = usbInterface.getEndpoint(i);
            if (endpoint.getType() == 2) {
                if (endpoint.getDirection() == 0) {
                    usbEndpoint = endpoint;
                } else {
                    usbEndpoint2 = endpoint;
                }
            }
        }
        if (usbEndpoint == null || usbEndpoint2 == null) {
            throw new IllegalArgumentException("not all endpoints found");
        }
        this.b = usbEndpoint;
        this.c = usbEndpoint2;
        this.i = usbEndpoint.getMaxPacketSize();
        this.j = usbEndpoint2.getMaxPacketSize();
    }

    /* JADX INFO: renamed from: a */
    public static native void a(t3 c0979t3);

    /* JADX INFO: renamed from: b */
    public final native void b(UsbEndpoint usbEndpoint, byte[] bArr, int i);

    /* JADX INFO: renamed from: c */
    public native void c();

    /* JADX INFO: renamed from: d */
    public native void d();

    /* JADX INFO: renamed from: e */
    public final native void e();

    /* JADX INFO: renamed from: f */
    public final native void f(String str);

    /* JADX INFO: renamed from: g */
    public final native void g(String str, ByteBuffer byteBuffer);

    /* JADX INFO: renamed from: h */
    public final native void h(byte[] bArr);

    /* JADX INFO: renamed from: i */
    public final native void i(byte[] bArr);
}
