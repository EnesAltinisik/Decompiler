package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.util.zze;
import com.google.android.gms.measurement.AppMeasurement;

public class zzp extends b {
    private final String zzasg = zzFo().zzEu();
    private final long zzbbz = zzFo().zzEi();
    private final char zzbcX;
    private final zza zzbcY;
    private final zza zzbcZ;
    private final zza zzbda;
    private final zza zzbdb;
    private final zza zzbdc;
    private final zza zzbdd;
    private final zza zzbde;
    private final zza zzbdf;
    private final zza zzbdg;

    public class zza {
        private final int mPriority;
        final /* synthetic */ zzp zzbdi;
        private final boolean zzbdj;
        private final boolean zzbdk;

        zza(zzp com_google_android_gms_measurement_internal_zzp, int i, boolean z, boolean z2) {
            this.zzbdi = com_google_android_gms_measurement_internal_zzp;
            this.mPriority = i;
            this.zzbdj = z;
            this.zzbdk = z2;
        }

        public void log(String str) {
            this.zzbdi.zza(this.mPriority, this.zzbdj, this.zzbdk, str, null, null, null);
        }

        public void zzd(String str, Object obj, Object obj2, Object obj3) {
            this.zzbdi.zza(this.mPriority, this.zzbdj, this.zzbdk, str, obj, obj2, obj3);
        }

        public void zze(String str, Object obj, Object obj2) {
            this.zzbdi.zza(this.mPriority, this.zzbdj, this.zzbdk, str, obj, obj2, null);
        }

        public void zzj(String str, Object obj) {
            this.zzbdi.zza(this.mPriority, this.zzbdj, this.zzbdk, str, obj, null, null);
        }
    }

    zzp(zzx com_google_android_gms_measurement_internal_zzx) {
        super(com_google_android_gms_measurement_internal_zzx);
        if (zzFo().zzmX()) {
            this.zzbcX = zzFo().zzmW() ? 'P' : 'C';
        } else {
            this.zzbcX = zzFo().zzmW() ? 'p' : 'c';
        }
        this.zzbcY = new zza(this, 6, false, false);
        this.zzbcZ = new zza(this, 6, true, false);
        this.zzbda = new zza(this, 6, false, true);
        this.zzbdb = new zza(this, 5, false, false);
        this.zzbdc = new zza(this, 5, true, false);
        this.zzbdd = new zza(this, 5, false, true);
        this.zzbde = new zza(this, 4, false, false);
        this.zzbdf = new zza(this, 3, false, false);
        this.zzbdg = new zza(this, 2, false, false);
    }

    static String zza(boolean z, String str, Object obj, Object obj2, Object obj3) {
        if (str == null) {
            Object obj4 = "";
        }
        Object zzc = zzc(z, obj);
        Object zzc2 = zzc(z, obj2);
        Object zzc3 = zzc(z, obj3);
        StringBuilder stringBuilder = new StringBuilder();
        String str2 = "";
        if (!TextUtils.isEmpty(obj4)) {
            stringBuilder.append(obj4);
            str2 = ": ";
        }
        if (!TextUtils.isEmpty(zzc)) {
            stringBuilder.append(str2);
            stringBuilder.append(zzc);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(zzc2)) {
            stringBuilder.append(str2);
            stringBuilder.append(zzc2);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(zzc3)) {
            stringBuilder.append(str2);
            stringBuilder.append(zzc3);
        }
        return stringBuilder.toString();
    }

    static String zzc(boolean z, Object obj) {
        if (obj == null) {
            return "";
        }
        Object valueOf = obj instanceof Integer ? Long.valueOf((long) ((Integer) obj).intValue()) : obj;
        if (valueOf instanceof Long) {
            if (!z) {
                return String.valueOf(valueOf);
            }
            if (Math.abs(((Long) valueOf).longValue()) < 100) {
                return String.valueOf(valueOf);
            }
            String str = String.valueOf(valueOf).charAt(0) == '-' ? "-" : "";
            String valueOf2 = String.valueOf(Math.abs(((Long) valueOf).longValue()));
            return new StringBuilder((String.valueOf(str).length() + 43) + String.valueOf(str).length()).append(str).append(Math.round(Math.pow(10.0d, (double) (valueOf2.length() - 1)))).append("...").append(str).append(Math.round(Math.pow(10.0d, (double) valueOf2.length()) - 1.0d)).toString();
        } else if (valueOf instanceof Boolean) {
            return String.valueOf(valueOf);
        } else {
            if (!(valueOf instanceof Throwable)) {
                return z ? "-" : String.valueOf(valueOf);
            } else {
                Throwable th = (Throwable) valueOf;
                StringBuilder stringBuilder = new StringBuilder(z ? th.getClass().getName() : th.toString());
                String zzft = zzft(AppMeasurement.class.getCanonicalName());
                String zzft2 = zzft(zzx.class.getCanonicalName());
                for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                    if (!stackTraceElement.isNativeMethod()) {
                        String className = stackTraceElement.getClassName();
                        if (className != null) {
                            className = zzft(className);
                            if (className.equals(zzft) || className.equals(zzft2)) {
                                stringBuilder.append(": ");
                                stringBuilder.append(stackTraceElement);
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                return stringBuilder.toString();
            }
        }
    }

    private static String zzft(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf != -1 ? str.substring(0, lastIndexOf) : str;
    }

    public /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    public zza zzFE() {
        return this.zzbcY;
    }

    public zza zzFF() {
        return this.zzbcZ;
    }

    public zza zzFG() {
        return this.zzbdb;
    }

    public zza zzFH() {
        return this.zzbdc;
    }

    public zza zzFI() {
        return this.zzbdd;
    }

    public zza zzFJ() {
        return this.zzbde;
    }

    public zza zzFK() {
        return this.zzbdf;
    }

    public zza zzFL() {
        return this.zzbdg;
    }

    public String zzFM() {
        Pair zzop = zzFn().b.zzop();
        if (zzop == null || zzop == zzt.a) {
            return null;
        }
        String valueOf = String.valueOf(String.valueOf(zzop.second));
        String str = (String) zzop.first;
        return new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(str).length()).append(valueOf).append(":").append(str).toString();
    }

    public /* bridge */ /* synthetic */ void zzFb() {
        super.zzFb();
    }

    public /* bridge */ /* synthetic */ f zzFc() {
        return super.zzFc();
    }

    public /* bridge */ /* synthetic */ zzac zzFd() {
        return super.zzFd();
    }

    public /* bridge */ /* synthetic */ zzn zzFe() {
        return super.zzFe();
    }

    public /* bridge */ /* synthetic */ zzg zzFf() {
        return super.zzFf();
    }

    public /* bridge */ /* synthetic */ zzad zzFg() {
        return super.zzFg();
    }

    public /* bridge */ /* synthetic */ zze zzFh() {
        return super.zzFh();
    }

    public /* bridge */ /* synthetic */ zzal zzFi() {
        return super.zzFi();
    }

    public /* bridge */ /* synthetic */ zzv zzFj() {
        return super.zzFj();
    }

    public /* bridge */ /* synthetic */ zzaf zzFk() {
        return super.zzFk();
    }

    public /* bridge */ /* synthetic */ zzw zzFl() {
        return super.zzFl();
    }

    public /* bridge */ /* synthetic */ zzp zzFm() {
        return super.zzFm();
    }

    public /* bridge */ /* synthetic */ zzt zzFn() {
        return super.zzFn();
    }

    public /* bridge */ /* synthetic */ zzd zzFo() {
        return super.zzFo();
    }

    protected boolean zzX(int i) {
        return Log.isLoggable(this.zzasg, i);
    }

    protected void zza(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && zzX(i)) {
            zzn(i, zza(false, str, obj, obj2, obj3));
        }
        if (!z2 && i >= 5) {
            zzb(i, str, obj, obj2, obj3);
        }
    }

    public void zzb(int i, String str, Object obj, Object obj2, Object obj3) {
        zzaa.zzz(str);
        zzw zzFZ = this.zzbbl.zzFZ();
        if (zzFZ == null) {
            zzn(6, "Scheduler not set. Not logging error/warn.");
        } else if (!zzFZ.isInitialized()) {
            zzn(6, "Scheduler not initialized. Not logging error/warn.");
        } else if (zzFZ.zzGu()) {
            zzn(6, "Scheduler shutdown. Not logging error/warn.");
        } else {
            if (i < 0) {
                i = 0;
            }
            if (i >= "01VDIWEA?".length()) {
                i = "01VDIWEA?".length() - 1;
            }
            String valueOf = String.valueOf("1");
            char charAt = "01VDIWEA?".charAt(i);
            char c = this.zzbcX;
            long j = this.zzbbz;
            String valueOf2 = String.valueOf(zza(true, str, obj, obj2, obj3));
            valueOf = new StringBuilder((String.valueOf(valueOf).length() + 23) + String.valueOf(valueOf2).length()).append(valueOf).append(charAt).append(c).append(j).append(":").append(valueOf2).toString();
            if (valueOf.length() > 1024) {
                valueOf = str.substring(0, 1024);
            }
            zzFZ.zzg(new Runnable(this) {
                final /* synthetic */ zzp b;

                public void run() {
                    zzt zzFn = this.b.zzbbl.zzFn();
                    if (!zzFn.isInitialized() || zzFn.zzGu()) {
                        this.b.zzn(6, "Persisted config not initialized . Not logging error/warn.");
                    } else {
                        zzFn.b.zzbU(valueOf);
                    }
                }
            });
        }
    }

    public /* bridge */ /* synthetic */ void zzkN() {
        super.zzkN();
    }

    protected void zzkO() {
    }

    public /* bridge */ /* synthetic */ void zzlP() {
        super.zzlP();
    }

    public /* bridge */ /* synthetic */ zze zzlQ() {
        return super.zzlQ();
    }

    protected void zzn(int i, String str) {
        Log.println(i, this.zzasg, str);
    }
}
