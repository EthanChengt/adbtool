package com.didjdk.adbhelper;

import android.app.Application;
import c.c.a.C0904e3;
import c.c.a.t3;

/* JADX INFO: loaded from: classes.dex */
public class MyApplication extends Application {

    /* JADX INFO: renamed from: b */
    public t3 f6475b;

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        C0904e3 c0904e3 = C0904e3.f4786e;
        c0904e3.f4788b = getApplicationContext();
        c0904e3.f4787a = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(c0904e3);
        try {
            System.loadLibrary("adbhelper");
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
    }
}
