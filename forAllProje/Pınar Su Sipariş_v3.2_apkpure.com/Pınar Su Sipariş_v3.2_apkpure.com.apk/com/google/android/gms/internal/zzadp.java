package com.google.android.gms.internal;

import a.a.a.a.a.d.b;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.internal.zzaej.zza;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.EventTarget;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.RunLoop;
import com.google.firebase.database.connection.idl.ConnectionConfig;
import com.google.firebase.database.connection.idl.zzc;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

public class zzadp implements zzafb {
    private final FirebaseApp zzbHJ;
    private final Context zzbHO;
    private final Set<String> zzbHP = new HashSet();

    public zzadp(FirebaseApp firebaseApp) {
        this.zzbHJ = firebaseApp;
        if (this.zzbHJ == null) {
            Log.e("FirebaseDatabase", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            Log.e("FirebaseDatabase", "ERROR: You must call FirebaseApp.initializeApp() before using Firebase Database.");
            Log.e("FirebaseDatabase", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            throw new RuntimeException("You need to call FirebaseApp.initializeApp() before using Firebase Database.");
        }
        this.zzbHO = this.zzbHJ.getApplicationContext();
    }

    public zzaej zza(zzaeu com_google_android_gms_internal_zzaeu, zzaef com_google_android_gms_internal_zzaef, zzaeh com_google_android_gms_internal_zzaeh, zza com_google_android_gms_internal_zzaej_zza) {
        return zzc.zza(this.zzbHO, new ConnectionConfig(com_google_android_gms_internal_zzaeh, com_google_android_gms_internal_zzaeu.zzQD(), com_google_android_gms_internal_zzaeu.zzQY(), com_google_android_gms_internal_zzaeu.zzPW(), FirebaseDatabase.getSdkVersion(), com_google_android_gms_internal_zzaeu.zziJ()), com_google_android_gms_internal_zzaef, com_google_android_gms_internal_zzaej_zza);
    }

    public zzaeq zza(ScheduledExecutorService scheduledExecutorService) {
        return new zzadn(this.zzbHJ, scheduledExecutorService);
    }

    public zzagd zza(zzaeu com_google_android_gms_internal_zzaeu, String str) {
        String zzRd = com_google_android_gms_internal_zzaeu.zzRd();
        String stringBuilder = new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(zzRd).length()).append(str).append(b.ROLL_OVER_FILE_NAME_SEPARATOR).append(zzRd).toString();
        if (this.zzbHP.contains(stringBuilder)) {
            throw new DatabaseException(new StringBuilder(String.valueOf(zzRd).length() + 47).append("SessionPersistenceKey '").append(zzRd).append("' has already been used.").toString());
        }
        this.zzbHP.add(stringBuilder);
        return new zzaga(com_google_android_gms_internal_zzaeu, new zzadq(this.zzbHO, com_google_android_gms_internal_zzaeu, stringBuilder), new zzagb(com_google_android_gms_internal_zzaeu.zzRa()));
    }

    public zzahg zza(zzaeu com_google_android_gms_internal_zzaeu, zzahg.zza com_google_android_gms_internal_zzahg_zza, List<String> list) {
        return new zzahd(com_google_android_gms_internal_zzahg_zza, list);
    }

    public EventTarget zza(zzaeu com_google_android_gms_internal_zzaeu) {
        return new zzado();
    }

    public RunLoop zzb(zzaeu com_google_android_gms_internal_zzaeu) {
        final zzahf zzib = com_google_android_gms_internal_zzaeu.zzib("RunLoop");
        return new zzaip(this) {
            final /* synthetic */ zzadp b;

            public void zzh(final Throwable th) {
                String valueOf = String.valueOf(FirebaseDatabase.getSdkVersion());
                valueOf = new StringBuilder(String.valueOf(valueOf).length() + 80).append("Uncaught exception in Firebase runloop (").append(valueOf).append("). Please report to support@firebase.com").toString();
                zzib.zze(valueOf, th);
                new Handler(this.b.zzbHO.getMainLooper()).post(new Runnable(this) {
                    final /* synthetic */ AnonymousClass1 c;

                    public void run() {
                        throw new RuntimeException(valueOf, th);
                    }
                });
            }
        };
    }

    public String zzc(zzaeu com_google_android_gms_internal_zzaeu) {
        return VERSION.SDK_INT + "/Android";
    }
}
