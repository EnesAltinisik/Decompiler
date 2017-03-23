package com.google.android.gms.measurement;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.support.v4.c.k;
import com.google.android.gms.b.dd;
import com.google.android.gms.b.dd.a;

public final class AppMeasurementService extends Service implements a {
    private dd a;

    private dd b() {
        if (this.a == null) {
            this.a = new dd(this);
        }
        return this.a;
    }

    public Context a() {
        return this;
    }

    public boolean a(int i) {
        return stopSelfResult(i);
    }

    public IBinder onBind(Intent intent) {
        return b().a(intent);
    }

    public void onCreate() {
        super.onCreate();
        b().a();
    }

    public void onDestroy() {
        b().b();
        super.onDestroy();
    }

    public void onRebind(Intent intent) {
        b().c(intent);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        b().a(intent, i, i2);
        k.a(intent);
        return 2;
    }

    public boolean onUnbind(Intent intent) {
        return b().b(intent);
    }
}
