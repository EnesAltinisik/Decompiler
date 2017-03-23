package com.google.android.gms.internal;

import com.google.android.gms.internal.zzahg.zza;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

public class zzahf {
    private final String prefix;
    private final zzahg zzbIW;
    private final String zzbQs;

    public zzahf(zzahg com_google_android_gms_internal_zzahg, String str) {
        this(com_google_android_gms_internal_zzahg, str, null);
    }

    public zzahf(zzahg com_google_android_gms_internal_zzahg, String str, String str2) {
        this.zzbIW = com_google_android_gms_internal_zzahg;
        this.zzbQs = str;
        this.prefix = str2;
    }

    private long zzTf() {
        return System.currentTimeMillis();
    }

    private String zzi(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        if (this.prefix == null) {
            return str;
        }
        String str2 = this.prefix;
        return new StringBuilder((String.valueOf(str2).length() + 3) + String.valueOf(str).length()).append(str2).append(" - ").append(str).toString();
    }

    private static String zzi(Throwable th) {
        Writer stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public void info(String str) {
        this.zzbIW.zzb(zza.INFO, this.zzbQs, zzi(str, new Object[0]), zzTf());
    }

    public void warn(String str) {
        zzf(str, null);
    }

    public boolean zzTe() {
        return this.zzbIW.zzQD().ordinal() <= zza.DEBUG.ordinal();
    }

    public void zza(String str, Throwable th, Object... objArr) {
        if (zzTe()) {
            String zzi = zzi(str, objArr);
            if (th != null) {
                String valueOf = String.valueOf(zzi(th));
                zzi = new StringBuilder((String.valueOf(zzi).length() + 1) + String.valueOf(valueOf).length()).append(zzi).append("\n").append(valueOf).toString();
            }
            this.zzbIW.zzb(zza.DEBUG, this.zzbQs, zzi, zzTf());
        }
    }

    public void zze(String str, Throwable th) {
        String valueOf = String.valueOf(zzi(str, new Object[0]));
        String valueOf2 = String.valueOf(zzi(th));
        this.zzbIW.zzb(zza.ERROR, this.zzbQs, new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length()).append(valueOf).append("\n").append(valueOf2).toString(), zzTf());
    }

    public void zzf(String str, Throwable th) {
        String zzi = zzi(str, new Object[0]);
        if (th != null) {
            String valueOf = String.valueOf(zzi(th));
            zzi = new StringBuilder((String.valueOf(zzi).length() + 1) + String.valueOf(valueOf).length()).append(zzi).append("\n").append(valueOf).toString();
        }
        this.zzbIW.zzb(zza.WARN, this.zzbQs, zzi, zzTf());
    }

    public void zzh(String str, Object... objArr) {
        zza(str, null, objArr);
    }
}
