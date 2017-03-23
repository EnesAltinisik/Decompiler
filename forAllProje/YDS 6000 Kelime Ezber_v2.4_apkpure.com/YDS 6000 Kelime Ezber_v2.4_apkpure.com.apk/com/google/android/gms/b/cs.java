package com.google.android.gms.b;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.measurement.AppMeasurement;

public final class cs {
    private final a a;

    public interface a {
        void a(Context context, Intent intent);
    }

    public cs(a aVar) {
        c.a((Object) aVar);
        this.a = aVar;
    }

    public static boolean a(Context context, boolean z) {
        c.a((Object) context);
        return dl.a(context, z ? "com.google.android.gms.measurement.PackageMeasurementReceiver" : "com.google.android.gms.measurement.AppMeasurementReceiver", false);
    }

    public void a(Context context, Intent intent) {
        final cv a = cv.a(context);
        final co f = a.f();
        if (intent == null) {
            f.z().a("Receiver called with null intent");
            return;
        }
        a.d().R();
        String action = intent.getAction();
        f.D().a("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            dd.a(context, false);
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            this.a.a(context, className);
        } else if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            action = intent.getStringExtra("referrer");
            if (action == null) {
                f.D().a("Install referrer extras are null");
                return;
            }
            final Bundle a2 = a.o().a(Uri.parse(action));
            if (a2 == null) {
                f.D().a("No campaign defined in install referrer broadcast");
                return;
            }
            final long longExtra = 1000 * intent.getLongExtra("referrer_timestamp_seconds", 0);
            if (longExtra == 0) {
                f.z().a("Install referrer is missing timestamp");
            }
            final Context context2 = context;
            a.h().a(new Runnable(this) {
                public void run() {
                    dk c = a.p().c(a.x().x(), "_fot");
                    long longValue = (c == null || !(c.d instanceof Long)) ? 0 : ((Long) c.d).longValue();
                    long j = longExtra;
                    longValue = (longValue <= 0 || (j < longValue && j > 0)) ? j : longValue - 1;
                    if (longValue > 0) {
                        a2.putLong("click_timestamp", longValue);
                    }
                    AppMeasurement.getInstance(context2).logEventInternal("auto", "_cmp", a2);
                    f.D().a("Install campaign recorded");
                }
            });
        }
    }
}
