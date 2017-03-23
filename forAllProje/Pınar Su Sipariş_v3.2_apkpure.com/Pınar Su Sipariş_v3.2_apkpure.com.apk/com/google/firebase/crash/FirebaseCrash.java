package com.google.firebase.crash;

import android.content.Context;
import android.os.Looper;
import android.support.annotation.Keep;
import android.util.Log;
import com.google.android.gms.dynamic.zze;
import com.google.firebase.FirebaseApp;
import com.google.firebase.crash.internal.FirebaseCrashOptions;
import com.google.firebase.crash.internal.config.flag.Flags;
import com.google.firebase.crash.internal.zza;
import com.google.firebase.crash.internal.zzb;
import com.google.firebase.crash.internal.zzd;
import com.google.firebase.crash.internal.zzg;
import com.google.firebase.crash.internal.zzh;
import com.google.firebase.iid.zzc;

public class FirebaseCrash {
    private static final String LOG_TAG = FirebaseCrash.class.getSimpleName();
    private static volatile FirebaseCrash zzbGs;
    private zzd zzbGq;
    private zza zzbGr;
    private boolean zzbcc;

    public FirebaseCrash(FirebaseApp firebaseApp, boolean z) {
        this.zzbcc = z;
        Context applicationContext = firebaseApp.getApplicationContext();
        if (applicationContext == null) {
            Log.w(LOG_TAG, "Application context is missing, disabling api");
            this.zzbcc = false;
        }
        if (this.zzbcc) {
            try {
                FirebaseCrashOptions firebaseCrashOptions = new FirebaseCrashOptions(firebaseApp.getOptions().getApplicationId(), firebaseApp.getOptions().getApiKey());
                zzg.zzPc().zzah(applicationContext);
                this.zzbGq = zzg.zzPc().zzPd();
                this.zzbGq.zza(zze.zzD(applicationContext), firebaseCrashOptions);
                this.zzbGr = new zza(applicationContext);
                zzOZ();
                String str = LOG_TAG;
                String str2 = "FirebaseCrash reporting initialized ";
                String valueOf = String.valueOf(zzg.zzPc().toString());
                Log.i(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                return;
            } catch (Throwable e) {
                Log.e(LOG_TAG, "Failed to initialize crash reporting", e);
                this.zzbcc = false;
                return;
            }
        }
        Log.i(LOG_TAG, "Crash reporting is disabled");
    }

    @Keep
    public static FirebaseCrash getInstance(FirebaseApp firebaseApp) {
        Flags.initialize(firebaseApp.getApplicationContext());
        FirebaseCrash firebaseCrash = new FirebaseCrash(firebaseApp, ((Boolean) Flags.zzbGz.get()).booleanValue());
        synchronized (FirebaseCrash.class) {
            if (zzbGs == null) {
                zzbGs = firebaseCrash;
            }
        }
        return firebaseCrash;
    }

    private boolean isEnabled() {
        return this.zzbcc;
    }

    public static boolean isSingletonInitialized() {
        return zzbGs != null;
    }

    public static void log(String str) {
        try {
            zzOW().zzhJ(str);
        } catch (zzb e) {
            Log.v(LOG_TAG, e.getMessage());
        }
    }

    public static void logcat(int i, String str, String str2) {
        try {
            zzOW().zzf(i, str, str2);
        } catch (zzb e) {
            Log.v(LOG_TAG, e.getMessage());
        }
    }

    public static void report(Throwable th) {
        try {
            zzOW().zzf(th);
        } catch (zzb e) {
            Log.v(LOG_TAG, e.getMessage());
        }
    }

    public static FirebaseCrash zzOW() {
        if (zzbGs == null) {
            synchronized (FirebaseCrash.class) {
                if (zzbGs == null) {
                    zzbGs = getInstance(FirebaseApp.getInstance());
                }
            }
        }
        return zzbGs;
    }

    private zzd zzOX() {
        return this.zzbGq;
    }

    private static boolean zzOY() {
        return Looper.getMainLooper().getThread().getId() == Thread.currentThread().getId();
    }

    private void zzOZ() {
        if (zzOY()) {
            Thread.setDefaultUncaughtExceptionHandler(new zzh(Thread.getDefaultUncaughtExceptionHandler(), this));
            return;
        }
        throw new RuntimeException("FirebaseCrash reporting may only be initialized on the main thread (preferably in your app's Application.onCreate)");
    }

    private String zzPa() {
        return zzc.zzUl().getId();
    }

    public void zzf(int i, String str, String str2) throws zzb {
        if (str2 != null) {
            if (str == null) {
                str = "";
            }
            Log.println(i, str, str2);
            zzhJ(str2);
        }
    }

    public void zzf(Throwable th) throws zzb {
        if (isEnabled()) {
            zzd zzOX = zzOX();
            if (zzOX != null && th != null) {
                this.zzbGr.zza(false, System.currentTimeMillis());
                try {
                    zzOX.zzhK(zzPa());
                    zzOX.zzF(zze.zzD(th));
                    return;
                } catch (Throwable e) {
                    Log.e(LOG_TAG, "report remoting failed", e);
                    return;
                }
            }
            return;
        }
        throw new zzb("Firebase Crash Reporting is disabled.");
    }

    public void zzg(Throwable th) throws zzb {
        if (isEnabled()) {
            zzd zzOX = zzOX();
            if (zzOX != null && th != null) {
                try {
                    this.zzbGr.zza(true, System.currentTimeMillis());
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    zzOX.zzhK(zzPa());
                    zzOX.zzG(zze.zzD(th));
                    return;
                } catch (Throwable e2) {
                    Log.e(LOG_TAG, "report remoting failed", e2);
                    return;
                }
            }
            return;
        }
        throw new zzb("Firebase Crash Reporting is disabled.");
    }

    public void zzhJ(String str) throws zzb {
        if (isEnabled()) {
            zzd zzOX = zzOX();
            if (zzOX != null && str != null) {
                try {
                    zzOX.log(str);
                    return;
                } catch (Throwable e) {
                    Log.e(LOG_TAG, "log remoting failed", e);
                    return;
                }
            }
            return;
        }
        throw new zzb("Firebase Crash Reporting is disabled.");
    }
}
