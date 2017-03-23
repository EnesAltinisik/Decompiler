package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.b.cs;
import com.google.android.gms.b.cs.a;

public final class AppMeasurementInstallReferrerReceiver extends BroadcastReceiver implements a {
    private cs a;

    private cs a() {
        if (this.a == null) {
            this.a = new cs(this);
        }
        return this.a;
    }

    public void a(Context context, Intent intent) {
    }

    public void onReceive(Context context, Intent intent) {
        a().a(context, intent);
    }
}
