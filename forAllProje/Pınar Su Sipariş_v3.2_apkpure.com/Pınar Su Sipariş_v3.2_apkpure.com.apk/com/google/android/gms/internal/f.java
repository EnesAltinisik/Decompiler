package com.google.android.gms.internal;

import com.google.android.gms.internal.zzaej.zza;
import com.google.firebase.database.EventTarget;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.RunLoop;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

enum f implements zzafb {
    INSTANCE;

    public zzaej zza(zzaeu com_google_android_gms_internal_zzaeu, zzaef com_google_android_gms_internal_zzaef, zzaeh com_google_android_gms_internal_zzaeh, zza com_google_android_gms_internal_zzaej_zza) {
        return new zzaek(com_google_android_gms_internal_zzaeu.zzQZ(), com_google_android_gms_internal_zzaeh, com_google_android_gms_internal_zzaej_zza);
    }

    public zzaeq zza(ScheduledExecutorService scheduledExecutorService) {
        throw new RuntimeException("Authentication is not implemented yet");
    }

    public zzagd zza(zzaeu com_google_android_gms_internal_zzaeu, String str) {
        return null;
    }

    public zzahg zza(zzaeu com_google_android_gms_internal_zzaeu, zzahg.zza com_google_android_gms_internal_zzahg_zza, List<String> list) {
        return new zzahe(com_google_android_gms_internal_zzahg_zza, list);
    }

    public EventTarget zza(zzaeu com_google_android_gms_internal_zzaeu) {
        return new g(Executors.defaultThreadFactory(), zzafl.zzbNM);
    }

    public RunLoop zzb(zzaeu com_google_android_gms_internal_zzaeu) {
        final zzahf zzib = com_google_android_gms_internal_zzaeu.zzib("RunLoop");
        return new zzaip(this) {
            final /* synthetic */ f b;

            public void zzh(Throwable th) {
                zzahf com_google_android_gms_internal_zzahf = zzib;
                String valueOf = String.valueOf(FirebaseDatabase.getSdkVersion());
                com_google_android_gms_internal_zzahf.zze(new StringBuilder(String.valueOf(valueOf).length() + 89).append("Uncaught exception in Firebase Database runloop (").append(valueOf).append("). Please report to support@firebase.com").toString(), th);
            }
        };
    }

    public String zzc(zzaeu com_google_android_gms_internal_zzaeu) {
        String property = System.getProperty("java.vm.name", "Unknown JVM");
        String property2 = System.getProperty("java.specification.version", "Unknown");
        return new StringBuilder((String.valueOf(property2).length() + 1) + String.valueOf(property).length()).append(property2).append("/").append(property).toString();
    }
}
