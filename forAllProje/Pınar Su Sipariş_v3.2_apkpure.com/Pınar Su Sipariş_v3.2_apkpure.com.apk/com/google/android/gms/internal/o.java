package com.google.android.gms.internal;

import com.google.android.gms.internal.zzalq.zza;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

final class o<T> extends zzakr<T> {
    private final zzajz a;
    private final zzakr<T> b;
    private final Type c;

    o(zzajz com_google_android_gms_internal_zzajz, zzakr<T> com_google_android_gms_internal_zzakr_T, Type type) {
        this.a = com_google_android_gms_internal_zzajz;
        this.b = com_google_android_gms_internal_zzakr_T;
        this.c = type;
    }

    private Type a(Type type, Object obj) {
        return obj != null ? (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type : type;
    }

    public void zza(zzaly com_google_android_gms_internal_zzaly, T t) throws IOException {
        zzakr com_google_android_gms_internal_zzakr = this.b;
        Type a = a(this.c, t);
        if (a != this.c) {
            com_google_android_gms_internal_zzakr = this.a.zza(zzalv.zzl(a));
            if ((com_google_android_gms_internal_zzakr instanceof zza) && !(this.b instanceof zza)) {
                com_google_android_gms_internal_zzakr = this.b;
            }
        }
        com_google_android_gms_internal_zzakr.zza(com_google_android_gms_internal_zzaly, t);
    }

    public T zzb(zzalw com_google_android_gms_internal_zzalw) throws IOException {
        return this.b.zzb(com_google_android_gms_internal_zzalw);
    }
}
