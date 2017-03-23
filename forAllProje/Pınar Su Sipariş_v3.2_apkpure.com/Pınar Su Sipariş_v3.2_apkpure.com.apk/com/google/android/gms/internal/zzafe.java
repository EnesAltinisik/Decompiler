package com.google.android.gms.internal;

import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.RunLoop;
import java.util.HashMap;
import java.util.Map;

public class zzafe {
    private static final zzafe zzbMW = new zzafe();
    private final Map<zzaeu, Map<String, zzafc>> zzbMX = new HashMap();

    class AnonymousClass1 implements Runnable {
        final /* synthetic */ zzafc a;

        AnonymousClass1(zzafc com_google_android_gms_internal_zzafc) {
            this.a = com_google_android_gms_internal_zzafc;
        }

        public void run() {
            this.a.interrupt();
        }
    }

    class AnonymousClass2 implements Runnable {
        final /* synthetic */ zzafc a;

        AnonymousClass2(zzafc com_google_android_gms_internal_zzafc) {
            this.a = com_google_android_gms_internal_zzafc;
        }

        public void run() {
            this.a.resume();
        }
    }

    public static zzafc zza(zzaeu com_google_android_gms_internal_zzaeu, zzafd com_google_android_gms_internal_zzafd, FirebaseDatabase firebaseDatabase) throws DatabaseException {
        return zzbMW.zzb(com_google_android_gms_internal_zzaeu, com_google_android_gms_internal_zzafd, firebaseDatabase);
    }

    private zzafc zzb(zzaeu com_google_android_gms_internal_zzaeu, zzafd com_google_android_gms_internal_zzafd, FirebaseDatabase firebaseDatabase) throws DatabaseException {
        zzafc com_google_android_gms_internal_zzafc;
        com_google_android_gms_internal_zzaeu.zzQH();
        String str = com_google_android_gms_internal_zzafd.zzbJa;
        String str2 = com_google_android_gms_internal_zzafd.zzasB;
        str2 = new StringBuilder((String.valueOf(str).length() + 9) + String.valueOf(str2).length()).append("https://").append(str).append("/").append(str2).toString();
        synchronized (this.zzbMX) {
            if (!this.zzbMX.containsKey(com_google_android_gms_internal_zzaeu)) {
                this.zzbMX.put(com_google_android_gms_internal_zzaeu, new HashMap());
            }
            Map map = (Map) this.zzbMX.get(com_google_android_gms_internal_zzaeu);
            if (map.containsKey(str2)) {
                throw new IllegalStateException("createLocalRepo() called for existing repo.");
            }
            com_google_android_gms_internal_zzafc = new zzafc(com_google_android_gms_internal_zzafd, com_google_android_gms_internal_zzaeu, firebaseDatabase);
            map.put(str2, com_google_android_gms_internal_zzafc);
        }
        return com_google_android_gms_internal_zzafc;
    }

    public static void zzd(zzaeu com_google_android_gms_internal_zzaeu) {
        zzbMW.zzf(com_google_android_gms_internal_zzaeu);
    }

    public static void zze(zzaeu com_google_android_gms_internal_zzaeu) {
        zzbMW.zzg(com_google_android_gms_internal_zzaeu);
    }

    private void zzf(final zzaeu com_google_android_gms_internal_zzaeu) {
        RunLoop zzRc = com_google_android_gms_internal_zzaeu.zzRc();
        if (zzRc != null) {
            zzRc.scheduleNow(new Runnable(this) {
                final /* synthetic */ zzafe b;

                public void run() {
                    synchronized (this.b.zzbMX) {
                        if (this.b.zzbMX.containsKey(com_google_android_gms_internal_zzaeu)) {
                            Object obj = 1;
                            for (zzafc com_google_android_gms_internal_zzafc : ((Map) this.b.zzbMX.get(com_google_android_gms_internal_zzaeu)).values()) {
                                com_google_android_gms_internal_zzafc.interrupt();
                                Object obj2 = (obj == null || com_google_android_gms_internal_zzafc.zzRB()) ? null : 1;
                                obj = obj2;
                            }
                            if (obj != null) {
                                com_google_android_gms_internal_zzaeu.stop();
                            }
                        }
                    }
                }
            });
        }
    }

    private void zzg(final zzaeu com_google_android_gms_internal_zzaeu) {
        RunLoop zzRc = com_google_android_gms_internal_zzaeu.zzRc();
        if (zzRc != null) {
            zzRc.scheduleNow(new Runnable(this) {
                final /* synthetic */ zzafe b;

                public void run() {
                    synchronized (this.b.zzbMX) {
                        if (this.b.zzbMX.containsKey(com_google_android_gms_internal_zzaeu)) {
                            for (zzafc resume : ((Map) this.b.zzbMX.get(com_google_android_gms_internal_zzaeu)).values()) {
                                resume.resume();
                            }
                        }
                    }
                }
            });
        }
    }

    public static void zzk(zzafc com_google_android_gms_internal_zzafc) {
        com_google_android_gms_internal_zzafc.scheduleNow(new AnonymousClass1(com_google_android_gms_internal_zzafc));
    }

    public static void zzl(zzafc com_google_android_gms_internal_zzafc) {
        com_google_android_gms_internal_zzafc.scheduleNow(new AnonymousClass2(com_google_android_gms_internal_zzafc));
    }
}
