package com.google.android.gms.internal;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public final class zzalk extends zzakr<Date> {
    public static final zzaks zzbXD = new zzaks() {
        public <T> zzakr<T> zza(zzajz com_google_android_gms_internal_zzajz, zzalv<T> com_google_android_gms_internal_zzalv_T) {
            return com_google_android_gms_internal_zzalv_T.zzWl() == Date.class ? new zzalk() : null;
        }
    };
    private final DateFormat zzbVN = DateFormat.getDateTimeInstance(2, 2, Locale.US);
    private final DateFormat zzbVO = DateFormat.getDateTimeInstance(2, 2);
    private final DateFormat zzbVP = zzVZ();

    private static DateFormat zzVZ() {
        DateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat;
    }

    private synchronized Date zziS(String str) {
        Date parse;
        try {
            parse = this.zzbVO.parse(str);
        } catch (ParseException e) {
            try {
                parse = this.zzbVN.parse(str);
            } catch (ParseException e2) {
                try {
                    parse = this.zzbVP.parse(str);
                } catch (Throwable e3) {
                    throw new zzako(str, e3);
                }
            }
        }
        return parse;
    }

    public synchronized void zza(zzaly com_google_android_gms_internal_zzaly, Date date) throws IOException {
        if (date == null) {
            com_google_android_gms_internal_zzaly.zzWk();
        } else {
            com_google_android_gms_internal_zzaly.zziU(this.zzbVN.format(date));
        }
    }

    public /* synthetic */ Object zzb(zzalw com_google_android_gms_internal_zzalw) throws IOException {
        return zzk(com_google_android_gms_internal_zzalw);
    }

    public Date zzk(zzalw com_google_android_gms_internal_zzalw) throws IOException {
        if (com_google_android_gms_internal_zzalw.zzWa() != zzalx.NULL) {
            return zziS(com_google_android_gms_internal_zzalw.nextString());
        }
        com_google_android_gms_internal_zzalw.nextNull();
        return null;
    }
}
