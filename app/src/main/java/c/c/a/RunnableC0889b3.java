package c.c.a;

import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbInterface;
import android.os.Build;
import android.os.Looper;
import com.didjdk.adbhelper.ConnectActivity;
import com.didjdk.adbhelper.MyApplication;
import c.a.a.a.a;

/* JADX INFO: renamed from: c.c.a.b3 */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC0889b3 implements Runnable {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ UsbDeviceConnection f4766b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ UsbInterface f4767c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ConnectActivity f4768d;

    public RunnableC0889b3(ConnectActivity connectActivity, UsbDeviceConnection usbDeviceConnection, UsbInterface usbInterface) {
        this.f4768d = connectActivity;
        this.f4766b = usbDeviceConnection;
        this.f4767c = usbInterface;
    }

    @Override // java.lang.Runnable
    public void run() {
        ConnectActivity connectActivity;
        while (true) {
            connectActivity = this.f4768d;
            if (connectActivity.f6353K) {
                break;
            }
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        connectActivity.f6370x.sendEmptyMessage(0);
        this.f4768d.f6358P = new t3(this.f4766b, this.f4767c);
        ConnectActivity connectActivity2 = this.f4768d;
        t3 c0979t3 = connectActivity2.f6358P;
        c0979t3.h = connectActivity2;
        Looper.prepare();
        int vendorId = connectActivity2.f6359Q.getVendorId();
        int productId = connectActivity2.f6359Q.getProductId();
        if (vendorId == 8921 && productId == 10089) {
            c0979t3.m = true;
        }
        StringBuilder sbM2191e = a.m2191e("VendorId: ");
        sbM2191e.append(connectActivity2.f6359Q.getVendorId());
        sbM2191e.append("\n");
        c0979t3.f(sbM2191e.toString());
        c0979t3.f("ProductId: " + connectActivity2.f6359Q.getProductId() + "\n");
        c0979t3.f("DeviceName: " + connectActivity2.f6359Q.getDeviceName() + "\n");
        if (Build.VERSION.SDK_INT >= 21) {
            StringBuilder sbM2191e2 = a.m2191e("ManufacturerName: ");
            sbM2191e2.append(connectActivity2.f6359Q.getManufacturerName());
            sbM2191e2.append("\n");
            c0979t3.f(sbM2191e2.toString());
            c0979t3.f("ProductName: " + connectActivity2.f6359Q.getProductName() + "\n");
            c0979t3.f("SerialNumber: " + connectActivity2.f6359Q.getSerialNumber() + "\n");
        }
        StringBuilder sbM2191e3 = a.m2191e("maxOut: ");
        sbM2191e3.append(c0979t3.i);
        sbM2191e3.append("\n");
        c0979t3.f(sbM2191e3.toString());
        c0979t3.f("maxIn: " + c0979t3.j + "\n");
        new Thread(new s3(c0979t3)).start();
        MyApplication myApplication = (MyApplication) this.f4768d.getApplication();
        ConnectActivity connectActivity3 = this.f4768d;
        myApplication.f6475b = connectActivity3.f6358P;
        connectActivity3.f6348F = connectActivity3.f6364r;
    }
}
