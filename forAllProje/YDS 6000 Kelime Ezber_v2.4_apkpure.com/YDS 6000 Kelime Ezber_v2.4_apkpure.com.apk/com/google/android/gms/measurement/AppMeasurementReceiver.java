package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import android.support.v4.c.k;
import com.google.android.gms.b.cs;
import com.google.android.gms.b.cs.a;

public final class AppMeasurementReceiver extends k implements a {
    private cs a;

    private cs a() {
        if (this.a == null) {
            this.a = new cs(this);
        }
        return this.a;
    }

    public void a(Context context, Intent intent) {
        k.a_(context, intent);
    }

    public void onReceive(Context context, Intent intent) {
        a().a(context, intent);
    }
}
