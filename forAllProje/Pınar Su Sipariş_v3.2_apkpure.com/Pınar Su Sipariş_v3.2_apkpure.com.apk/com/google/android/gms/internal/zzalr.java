package com.google.android.gms.internal;

import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public final class zzalr extends zzakr<Date> {
    public static final zzaks zzbXD = new zzaks() {
        public <T> zzakr<T> zza(zzajz com_google_android_gms_internal_zzajz, zzalv<T> com_google_android_gms_internal_zzalv_T) {
            return com_google_android_gms_internal_zzalv_T.zzWl() == Date.class ? new zzalr() : null;
        }
    };
    private final DateFormat zzbYd = new SimpleDateFormat("MMM d, yyyy");

    public synchronized void zza(zzaly com_google_android_gms_internal_zzaly, Date date) throws IOException {
        com_google_android_gms_internal_zzaly.zziU(date == null ? null : this.zzbYd.format(date));
    }

    public /* synthetic */ Object zzb(zzalw com_google_android_gms_internal_zzalw) throws IOException {
        return zzm(com_google_android_gms_internal_zzalw);
    }

    public synchronized Date zzm(zzalw com_google_android_gms_internal_zzalw) throws IOException {
        Date date;
        if (com_google_android_gms_internal_zzalw.zzWa() == zzalx.NULL) {
            com_google_android_gms_internal_zzalw.nextNull();
            date = null;
        } else {
            try {
                date = new Date(this.zzbYd.parse(com_google_android_gms_internal_zzalw.nextString()).getTime());
            } catch (Throwable e) {
                throw new zzako(e);
            }
        }
        return date;
    }
}
