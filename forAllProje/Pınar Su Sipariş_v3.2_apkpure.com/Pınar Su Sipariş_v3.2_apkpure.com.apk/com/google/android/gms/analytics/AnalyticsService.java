package com.google.android.gms.analytics;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.analytics.internal.zzak;
import com.google.android.gms.analytics.internal.zzak.zza;

public final class AnalyticsService extends Service implements zza {
    private zzak zzTH;

    private zzak zzkm() {
        if (this.zzTH == null) {
            this.zzTH = new zzak(this);
        }
        return this.zzTH;
    }

    public boolean callServiceStopSelfResult(int i) {
        return stopSelfResult(i);
    }

    public Context getContext() {
        return this;
    }

    public IBinder onBind(Intent intent) {
        return zzkm().onBind(intent);
    }

    public void onCreate() {
        super.onCreate();
        zzkm().onCreate();
    }

    public void onDestroy() {
        zzkm().onDestroy();
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return zzkm().onStartCommand(intent, i, i2);
    }
}
