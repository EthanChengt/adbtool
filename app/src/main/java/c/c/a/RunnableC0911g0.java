package c.c.a;

import android.os.Message;
import android.widget.Toast;
import com.didjdk.adbhelper.FastbootActivity;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.Objects;

/* JADX INFO: renamed from: c.c.a.g0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0911g0 implements Runnable {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FastbootActivity f4798b;

    @Override // java.lang.Runnable
    public final void run() {
        final FastbootActivity fastbootActivity = this.f4798b;
        Objects.requireNonNull(fastbootActivity);
        try {
            ServerSocket serverSocket = new ServerSocket(5007);
            while (fastbootActivity.d0) {
                Socket socketAccept = serverSocket.accept();
                if (!fastbootActivity.d0) {
                    break;
                }
                fastbootActivity.Z = socketAccept.getInputStream();
                fastbootActivity.a0 = socketAccept.getOutputStream();
                byte[] bArr = new byte[4];
                if (fastbootActivity.Z.read(bArr) == 4) {
                    fastbootActivity.a0.write(bArr);
                    fastbootActivity.a0.flush();
                }
                byte[] bArr2 = new byte[8];
                t3 c0979t3 = fastbootActivity.Y;
                int i = c0979t3 != null ? c0979t3.i : 512;
                while (fastbootActivity.Z.read(bArr2) > -1) {
                    int i2 = (int) ByteBuffer.wrap(bArr2).getLong();
                    String str = "";
                    int i3 = 0;
                    while (i3 < i2) {
                        byte[] bArr3 = new byte[i];
                        int iMin = Math.min(i2 - i3, i);
                        for (int i4 = 0; i4 < iMin; i4 += fastbootActivity.Z.read(bArr3, i4, iMin - i4)) {
                        }
                        i3 += iMin;
                        t3 c0979t4 = fastbootActivity.Y;
                        if (c0979t4 != null) {
                            c0979t4.b(c0979t4.b, bArr3, iMin);
                            if (fastbootActivity.M && fastbootActivity.K != null) {
                                Message message = new Message();
                                message.what = 4;
                                message.arg1 = i3;
                                message.arg2 = i2;
                                fastbootActivity.c0.sendMessage(message);
                            }
                        }
                        if (i3 <= iMin && i2 <= 64) {
                            str = new String(bArr3, 0, iMin);
                        }
                    }
                    fastbootActivity.M = false;
                    if (str.matches("download:.+")) {
                        try {
                            fastbootActivity.c0.sendEmptyMessage(3);
                            fastbootActivity.M = true;
                        } catch (Exception unused) {
                        }
                    }
                    if (fastbootActivity.Y != null) {
                        byte[] bArr4 = new byte[64];
                        while (true) {
                            t3 c0979t5 = fastbootActivity.Y;
                            int iBulkTransfer = c0979t5.a.bulkTransfer(c0979t5.c, bArr4, 64, 1000);
                            if (iBulkTransfer > -1) {
                                fastbootActivity.E(bArr4, iBulkTransfer);
                            }
                        }
                    } else {
                        byte[] bytes = "FAILno device".getBytes();
                        fastbootActivity.E(bytes, bytes.length);
                    }
                }
                socketAccept.close();
            }
            serverSocket.close();
        } catch (Exception e) {
            e.toString();
            fastbootActivity.runOnUiThread(new Runnable() { // from class: c.c.a.b0
                @Override // java.lang.Runnable
                public final void run() {
                    Toast.makeText(fastbootActivity.getApplicationContext(), e.toString(), 1).show();
                }
            });
            e.printStackTrace();
        }
    }
}
