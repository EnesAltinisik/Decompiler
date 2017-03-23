package com.google.firebase.crash.internal.service;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import android.support.annotation.Keep;
import android.util.Log;
import com.google.firebase.crash.internal.zze;
import com.google.firebase.crash.internal.zzg;
import com.google.firebase.crash.internal.zzg.zza;

public final class FirebaseCrashReceiverService extends IntentService {
    private static final String LOG_TAG = FirebaseCrashReceiverService.class.getSimpleName();
    private static final String zzbGK = FirebaseCrashReceiverService.class.getName();
    public static final String zzbGL = String.valueOf(zzbGK).concat(".SAVE");
    public static final String zzbGM = String.valueOf(zzbGK).concat(".CRASH_REPORT");
    public static final String zzbGN = String.valueOf(zzbGK).concat(".CRASH_TIME");
    public static final String zzbGO = String.valueOf(zzbGK).concat(".API_KEY");
    public static final String zzbGP = String.valueOf(zzbGK).concat(".IS_FATAL");
    private zze zzbGQ;

    @Keep
    public FirebaseCrashReceiverService() {
        super(FirebaseCrashReceiverService.class.getSimpleName());
    }

    public void onCreate() {
        Throwable e;
        super.onCreate();
        try {
            zzg.zzPc().zzah(getApplicationContext());
            this.zzbGQ = zzg.zzPc().zzPe();
            this.zzbGQ.zzH(com.google.android.gms.dynamic.zze.zzD(this));
            return;
        } catch (RemoteException e2) {
            e = e2;
        } catch (zza e3) {
            e = e3;
        }
        Log.e(LOG_TAG, "Unexpected failure remoting onCreate()", e);
        this.zzbGQ = null;
    }

    public void onDestroy() {
        if (this.zzbGQ != null) {
            try {
                this.zzbGQ.onDestroy();
            } catch (Throwable e) {
                Log.e(LOG_TAG, "Unexpected failure remoting onDestroy()", e);
            }
        }
        super.onDestroy();
    }

    protected void onHandleIntent(Intent intent) {
        if (this.zzbGQ != null) {
            try {
                this.zzbGQ.zzI(com.google.android.gms.dynamic.zze.zzD(intent));
            } catch (Throwable e) {
                Log.e(LOG_TAG, "Unexpected failure remoting onHandleIntent()", e);
            }
        }
    }
}
