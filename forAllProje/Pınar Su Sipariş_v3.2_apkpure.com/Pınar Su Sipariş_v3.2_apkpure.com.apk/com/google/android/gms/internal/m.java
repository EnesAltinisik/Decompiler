package com.google.android.gms.internal;

import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

final class m implements zzake<Date>, zzakn<Date> {
    private final DateFormat a;
    private final DateFormat b;
    private final DateFormat c;

    m() {
        this(DateFormat.getDateTimeInstance(2, 2, Locale.US), DateFormat.getDateTimeInstance(2, 2));
    }

    public m(int i, int i2) {
        this(DateFormat.getDateTimeInstance(i, i2, Locale.US), DateFormat.getDateTimeInstance(i, i2));
    }

    m(String str) {
        this(new SimpleDateFormat(str, Locale.US), new SimpleDateFormat(str));
    }

    m(DateFormat dateFormat, DateFormat dateFormat2) {
        this.a = dateFormat;
        this.b = dateFormat2;
        this.c = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        this.c.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    private Date a(zzakf com_google_android_gms_internal_zzakf) {
        Date parse;
        synchronized (this.b) {
            try {
                parse = this.b.parse(com_google_android_gms_internal_zzakf.zzVA());
            } catch (ParseException e) {
                try {
                    parse = this.a.parse(com_google_android_gms_internal_zzakf.zzVA());
                } catch (ParseException e2) {
                    try {
                        parse = this.c.parse(com_google_android_gms_internal_zzakf.zzVA());
                    } catch (Throwable e3) {
                        throw new zzako(com_google_android_gms_internal_zzakf.zzVA(), e3);
                    }
                }
            }
        }
        return parse;
    }

    public zzakf a(Date date, Type type, zzakm com_google_android_gms_internal_zzakm) {
        zzakf com_google_android_gms_internal_zzakl;
        synchronized (this.b) {
            com_google_android_gms_internal_zzakl = new zzakl(this.a.format(date));
        }
        return com_google_android_gms_internal_zzakl;
    }

    public Date a(zzakf com_google_android_gms_internal_zzakf, Type type, zzakd com_google_android_gms_internal_zzakd) throws zzakj {
        if (com_google_android_gms_internal_zzakf instanceof zzakl) {
            Date a = a(com_google_android_gms_internal_zzakf);
            if (type == Date.class) {
                return a;
            }
            if (type == Timestamp.class) {
                return new Timestamp(a.getTime());
            }
            if (type == java.sql.Date.class) {
                return new java.sql.Date(a.getTime());
            }
            String valueOf = String.valueOf(getClass());
            String valueOf2 = String.valueOf(type);
            throw new IllegalArgumentException(new StringBuilder((String.valueOf(valueOf).length() + 23) + String.valueOf(valueOf2).length()).append(valueOf).append(" cannot deserialize to ").append(valueOf2).toString());
        }
        throw new zzakj("The date should be a string value");
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(m.class.getSimpleName());
        stringBuilder.append('(').append(this.b.getClass().getSimpleName()).append(')');
        return stringBuilder.toString();
    }

    public /* synthetic */ zzakf zza(Object obj, Type type, zzakm com_google_android_gms_internal_zzakm) {
        return a((Date) obj, type, com_google_android_gms_internal_zzakm);
    }

    public /* synthetic */ Object zzb(zzakf com_google_android_gms_internal_zzakf, Type type, zzakd com_google_android_gms_internal_zzakd) throws zzakj {
        return a(com_google_android_gms_internal_zzakf, type, com_google_android_gms_internal_zzakd);
    }
}
