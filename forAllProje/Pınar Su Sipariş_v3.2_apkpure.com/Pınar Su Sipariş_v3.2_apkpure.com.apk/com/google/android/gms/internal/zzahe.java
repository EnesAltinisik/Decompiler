package com.google.android.gms.internal;

import com.google.android.gms.internal.zzahg.zza;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class zzahe implements zzahg {
    private final Set<String> zzbQq;
    private final zza zzbQr;

    public zzahe(zza com_google_android_gms_internal_zzahg_zza, List<String> list) {
        if (list != null) {
            this.zzbQq = new HashSet(list);
        } else {
            this.zzbQq = null;
        }
        this.zzbQr = com_google_android_gms_internal_zzahg_zza;
    }

    public zza zzQD() {
        return this.zzbQr;
    }

    protected String zza(zza com_google_android_gms_internal_zzahg_zza, String str, String str2, long j) {
        String valueOf = String.valueOf(new Date(j).toString());
        String valueOf2 = String.valueOf(com_google_android_gms_internal_zzahg_zza);
        return new StringBuilder((((String.valueOf(valueOf).length() + 6) + String.valueOf(valueOf2).length()) + String.valueOf(str).length()) + String.valueOf(str2).length()).append(valueOf).append(" [").append(valueOf2).append("] ").append(str).append(": ").append(str2).toString();
    }

    protected boolean zza(zza com_google_android_gms_internal_zzahg_zza, String str) {
        return com_google_android_gms_internal_zzahg_zza.ordinal() >= this.zzbQr.ordinal() && (this.zzbQq == null || com_google_android_gms_internal_zzahg_zza.ordinal() > zza.DEBUG.ordinal() || this.zzbQq.contains(str));
    }

    protected void zzam(String str, String str2) {
        System.err.println(str2);
    }

    protected void zzan(String str, String str2) {
        System.out.println(str2);
    }

    protected void zzao(String str, String str2) {
        System.out.println(str2);
    }

    protected void zzap(String str, String str2) {
        System.out.println(str2);
    }

    public void zzb(zza com_google_android_gms_internal_zzahg_zza, String str, String str2, long j) {
        if (zza(com_google_android_gms_internal_zzahg_zza, str)) {
            String zza = zza(com_google_android_gms_internal_zzahg_zza, str, str2, j);
            switch (com_google_android_gms_internal_zzahg_zza) {
                case ERROR:
                    zzam(str, zza);
                    return;
                case WARN:
                    zzan(str, zza);
                    return;
                case INFO:
                    zzao(str, zza);
                    return;
                case DEBUG:
                    zzap(str, zza);
                    return;
                default:
                    throw new RuntimeException("Should not reach here!");
            }
        }
    }
}
