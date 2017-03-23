package com.google.android.gms.internal;

import com.google.android.gms.internal.zzaej.zza;
import com.google.firebase.database.EventTarget;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.RunLoop;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

enum e implements zzafb {
    INSTANCE;
    
    static ThreadFactory b;
    static final zzafl c = null;

    static {
        c = new zzafl() {
            public void zza(Thread thread, String str) {
            }

            public void zza(Thread thread, UncaughtExceptionHandler uncaughtExceptionHandler) {
                thread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
            }

            public void zza(Thread thread, boolean z) {
            }
        };
    }

    public static boolean a() {
        return c() != null;
    }

    private static ThreadFactory c() {
        if (b == null) {
            try {
                Class cls = Class.forName("com.google.appengine.api.ThreadManager");
                if (cls != null) {
                    b = (ThreadFactory) cls.getMethod("backgroundThreadFactory", new Class[0]).invoke(null, new Object[0]);
                }
            } catch (ClassNotFoundException e) {
                return null;
            } catch (Throwable e2) {
                throw new RuntimeException(e2);
            } catch (Throwable e22) {
                throw new RuntimeException(e22);
            } catch (Throwable e222) {
                throw new RuntimeException(e222);
            }
        }
        return b;
    }

    public void b() {
        zzaie.zza(b, new zzaid(this) {
            final /* synthetic */ e a;

            {
                this.a = r1;
            }

            public void zza(Thread thread, String str) {
                e.c.zza(thread, str);
            }
        });
    }

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
        return new g(c(), c);
    }

    public RunLoop zzb(zzaeu com_google_android_gms_internal_zzaeu) {
        final zzahf zzib = com_google_android_gms_internal_zzaeu.zzib("RunLoop");
        return new zzaip(this) {
            final /* synthetic */ e b;

            protected ThreadFactory getThreadFactory() {
                return e.b;
            }

            protected zzafl zzRp() {
                return e.c;
            }

            public void zzh(Throwable th) {
                zzahf com_google_android_gms_internal_zzahf = zzib;
                String valueOf = String.valueOf(FirebaseDatabase.getSdkVersion());
                com_google_android_gms_internal_zzahf.zze(new StringBuilder(String.valueOf(valueOf).length() + 89).append("Uncaught exception in Firebase Database runloop (").append(valueOf).append("). Please report to support@firebase.com").toString(), th);
            }
        };
    }

    public String zzc(zzaeu com_google_android_gms_internal_zzaeu) {
        String str = "AppEngine";
        String property = System.getProperty("java.specification.version", "Unknown");
        return new StringBuilder((String.valueOf(property).length() + 1) + String.valueOf(str).length()).append(property).append("/").append(str).toString();
    }
}
