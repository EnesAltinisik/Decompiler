package com.google.firebase.crash.internal.service;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import android.support.annotation.Keep;
import android.util.Log;
import com.google.android.gms.dynamic.zze;
import com.google.firebase.crash.internal.zzf;
import com.google.firebase.crash.internal.zzg;
import com.google.firebase.crash.internal.zzg.zza;

public final class FirebaseCrashSenderService extends IntentService {
    public static final String ACTION_SEND = String.valueOf(zzbGK).concat(".SEND");
    private static final String LOG_TAG = FirebaseCrashSenderService.class.getSimpleName();
    private static final String zzbGK = FirebaseCrashSenderService.class.getName();
    public static final String zzbGO = String.valueOf(zzbGK).concat(".API_KEY");
    private zzf zzbGR;

    @Keep
    public FirebaseCrashSenderService() {
        super(FirebaseCrashSenderService.class.getSimpleName());
    }

    public void onCreate() {
        Throwable e;
        super.onCreate();
        try {
            zzg.zzPc().zzah(getApplicationContext());
            this.zzbGR = zzg.zzPc().zzPf();
            this.zzbGR.zzH(zze.zzD(this));
            return;
        } catch (RemoteException e2) {
            e = e2;
        } catch (zza e3) {
            e = e3;
        }
        Log.e(LOG_TAG, "Unexpected failure remoting onCreate()", e);
        this.zzbGR = null;
    }

    public void onDestroy() {
        if (this.zzbGR != null) {
            try {
                this.zzbGR.onDestroy();
            } catch (Throwable e) {
                Log.e(LOG_TAG, "Unexpected failure remoting onDestroy()", e);
            }
        }
        super.onDestroy();
    }

    protected void onHandleIntent(Intent intent) {
        if (this.zzbGR != null) {
            try {
                this.zzbGR.zzI(zze.zzD(intent));
            } catch (Throwable e) {
                Log.e(LOG_TAG, "Unexpected failure remoting onRunTask()", e);
            }
        }
    }
}
