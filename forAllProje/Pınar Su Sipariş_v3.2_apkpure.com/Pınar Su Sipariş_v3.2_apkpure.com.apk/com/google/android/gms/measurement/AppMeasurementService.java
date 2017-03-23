package com.google.android.gms.measurement;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.zzae;
import com.google.android.gms.measurement.internal.zzae.zza;

public final class AppMeasurementService extends Service implements zza {
    private zzae zzbbq;

    private zzae zzDZ() {
        if (this.zzbbq == null) {
            this.zzbbq = new zzae(this);
        }
        return this.zzbbq;
    }

    public boolean callServiceStopSelfResult(int i) {
        return stopSelfResult(i);
    }

    public Context getContext() {
        return this;
    }

    public IBinder onBind(Intent intent) {
        return zzDZ().onBind(intent);
    }

    public void onCreate() {
        super.onCreate();
        zzDZ().onCreate();
    }

    public void onDestroy() {
        zzDZ().onDestroy();
        super.onDestroy();
    }

    public void onRebind(Intent intent) {
        zzDZ().onRebind(intent);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return zzDZ().onStartCommand(intent, i, i2);
    }

    public boolean onUnbind(Intent intent) {
        return zzDZ().onUnbind(intent);
    }
}
