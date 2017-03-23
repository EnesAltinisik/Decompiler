package com.google.firebase.crash.internal;

import android.util.Log;
import com.google.firebase.crash.FirebaseCrash;
import java.lang.Thread.UncaughtExceptionHandler;

public class zzh implements UncaughtExceptionHandler {
    private final FirebaseCrash zzbGx;
    private final UncaughtExceptionHandler zzbGy;

    public zzh(UncaughtExceptionHandler uncaughtExceptionHandler, FirebaseCrash firebaseCrash) {
        this.zzbGx = firebaseCrash;
        this.zzbGy = uncaughtExceptionHandler;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        Log.e("UncaughtException", "", th);
        try {
            this.zzbGx.zzg(th);
        } catch (zzb e) {
            try {
                Log.v("UncaughtException", e.getMessage());
            } catch (Throwable e2) {
                Log.e("UncaughtException", "Ouch!  My own exception handler threw an exception.", e2);
            }
        }
        if (this.zzbGy != null) {
            this.zzbGy.uncaughtException(thread, th);
        }
    }
}
