package c.c.a;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.util.Log;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: renamed from: c.c.a.e3 */
/* JADX INFO: loaded from: classes.dex */
public class C0904e3 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: e */
    public static C0904e3 f4786e = new C0904e3();

    /* JADX INFO: renamed from: a */
    public Thread.UncaughtExceptionHandler f4787a;

    /* JADX INFO: renamed from: b */
    public Context f4788b;

    /* JADX INFO: renamed from: c */
    public StringBuilder f4789c;

    /* JADX INFO: renamed from: d */
    public DateFormat f4790d;

    public C0904e3() {
        new HashMap();
        this.f4789c = new StringBuilder();
        this.f4790d = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        boolean z;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        if (th == null) {
            z = false;
        } else {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            Throwable cause = th;
            do {
                cause.printStackTrace(printWriter);
                cause = cause.getCause();
            } while (cause != null);
            printWriter.close();
            String string = stringWriter.toString();
            new C0899d3(this).start();
            StringBuilder sb = this.f4789c;
            sb.append(this.f4790d.format(new Date()));
            sb.append("\n");
            sb.append("Version=");
            sb.append("1.3.1");
            sb.append("(");
            sb.append(17);
            sb.append(")\n");
            sb.append("API=");
            sb.append(Build.VERSION.SDK_INT);
            sb.append("\n");
            sb.append("Device=");
            sb.append(Build.MANUFACTURER);
            sb.append(" ");
            sb.append(Build.MODEL);
            sb.append("\n");
            this.f4789c.append(string);
            try {
                System.currentTimeMillis();
                this.f4790d.format(new Date());
                if (Environment.getExternalStorageState().equals("mounted")) {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f4788b.getFilesDir().getAbsolutePath() + "/crash.log");
                    fileOutputStream.write(this.f4789c.toString().getBytes());
                    fileOutputStream.close();
                }
            } catch (Exception e) {
                Log.e("CrashHandler", "an error occured while writing file...", e);
            }
            z = true;
        }
        if (!z && (uncaughtExceptionHandler = this.f4787a) != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
            return;
        }
        try {
            Thread.sleep(3000L);
        } catch (InterruptedException e2) {
            Log.e("CrashHandler", "error : ", e2);
        }
        Process.killProcess(Process.myPid());
        System.exit(1);
    }
}
