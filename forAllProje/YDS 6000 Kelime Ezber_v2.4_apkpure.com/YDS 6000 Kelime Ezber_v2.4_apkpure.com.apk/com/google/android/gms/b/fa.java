package com.google.android.gms.b;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.AppMeasurement.c;
import com.google.firebase.crash.FirebaseCrash;

public class fa {
    final c a = new c(this) {
        public void a(String str, String str2, Bundle bundle, long j) {
            if (!str.equals("crash")) {
                FirebaseCrash.a(str2, j, bundle);
            }
        }
    };
    private final Context b;
    private boolean c = false;
    private AppMeasurement d = null;

    public fa(Context context) {
        this.b = context;
        try {
            this.d = AppMeasurement.getInstance(this.b);
        } catch (NoClassDefFoundError e) {
            String valueOf = String.valueOf(e);
            Log.w("FirebaseCrashAnalytics", new StringBuilder(String.valueOf(valueOf).length() + 50).append("Unable to log event, missing measurement library: ").append(valueOf).toString());
        }
    }

    private void a(Bundle bundle) {
        if (this.d != null) {
            this.d.logEventInternal("crash", "_ae", bundle);
        }
    }

    public void a() {
        try {
            if (!this.c && this.d != null) {
                this.d.a(this.a);
                this.c = true;
            }
        } catch (IllegalStateException e) {
            Log.d("FirebaseCrashAnalytics", "Firebase Analytics breadcrumbs is not supported");
        }
    }

    public void a(boolean z, long j) {
        Bundle bundle = new Bundle();
        if (z) {
            bundle.putInt("fatal", 1);
        } else {
            bundle.putInt("fatal", 0);
        }
        bundle.putLong("timestamp", j);
        a(bundle);
    }
}
