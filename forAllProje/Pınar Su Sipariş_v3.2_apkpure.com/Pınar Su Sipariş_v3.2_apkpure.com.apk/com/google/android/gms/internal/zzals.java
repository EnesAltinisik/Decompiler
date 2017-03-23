package com.google.android.gms.internal;

import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public final class zzals extends zzakr<Time> {
    public static final zzaks zzbXD = new zzaks() {
        public <T> zzakr<T> zza(zzajz com_google_android_gms_internal_zzajz, zzalv<T> com_google_android_gms_internal_zzalv_T) {
            return com_google_android_gms_internal_zzalv_T.zzWl() == Time.class ? new zzals() : null;
        }
    };
    private final DateFormat zzbYd = new SimpleDateFormat("hh:mm:ss a");

    public synchronized void zza(zzaly com_google_android_gms_internal_zzaly, Time time) throws IOException {
        com_google_android_gms_internal_zzaly.zziU(time == null ? null : this.zzbYd.format(time));
    }

    public /* synthetic */ Object zzb(zzalw com_google_android_gms_internal_zzalw) throws IOException {
        return zzn(com_google_android_gms_internal_zzalw);
    }

    public synchronized Time zzn(zzalw com_google_android_gms_internal_zzalw) throws IOException {
        Time time;
        if (com_google_android_gms_internal_zzalw.zzWa() == zzalx.NULL) {
            com_google_android_gms_internal_zzalw.nextNull();
            time = null;
        } else {
            try {
                time = new Time(this.zzbYd.parse(com_google_android_gms_internal_zzalw.nextString()).getTime());
            } catch (Throwable e) {
                throw new zzako(e);
            }
        }
        return time;
    }
}
