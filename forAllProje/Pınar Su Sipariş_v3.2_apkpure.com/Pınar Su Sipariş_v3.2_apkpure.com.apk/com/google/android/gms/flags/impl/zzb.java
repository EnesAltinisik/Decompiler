package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.internal.zzsi;
import java.util.concurrent.Callable;

public class zzb {
    private static SharedPreferences zzaIQ = null;

    class AnonymousClass1 implements Callable<SharedPreferences> {
        final /* synthetic */ Context a;

        AnonymousClass1(Context context) {
            this.a = context;
        }

        public SharedPreferences a() {
            return this.a.getSharedPreferences("google_sdk_flags", 1);
        }

        public /* synthetic */ Object call() throws Exception {
            return a();
        }
    }

    public static SharedPreferences zzn(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            if (zzaIQ == null) {
                zzaIQ = (SharedPreferences) zzsi.zzb(new AnonymousClass1(context));
            }
            sharedPreferences = zzaIQ;
        }
        return sharedPreferences;
    }
}
