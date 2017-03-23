package com.google.android.gms.internal;

public final class zzall implements zzaks {
    private final zzakz zzbWa;

    public zzall(zzakz com_google_android_gms_internal_zzakz) {
        this.zzbWa = com_google_android_gms_internal_zzakz;
    }

    static zzakr<?> zza(zzakz com_google_android_gms_internal_zzakz, zzajz com_google_android_gms_internal_zzajz, zzalv<?> com_google_android_gms_internal_zzalv_, zzakt com_google_android_gms_internal_zzakt) {
        Class value = com_google_android_gms_internal_zzakt.value();
        if (zzakr.class.isAssignableFrom(value)) {
            return (zzakr) com_google_android_gms_internal_zzakz.zzb(zzalv.zzr(value)).zzVT();
        }
        if (zzaks.class.isAssignableFrom(value)) {
            return ((zzaks) com_google_android_gms_internal_zzakz.zzb(zzalv.zzr(value)).zzVT()).zza(com_google_android_gms_internal_zzajz, com_google_android_gms_internal_zzalv_);
        }
        throw new IllegalArgumentException("@JsonAdapter value must be TypeAdapter or TypeAdapterFactory reference.");
    }

    public <T> zzakr<T> zza(zzajz com_google_android_gms_internal_zzajz, zzalv<T> com_google_android_gms_internal_zzalv_T) {
        zzakt com_google_android_gms_internal_zzakt = (zzakt) com_google_android_gms_internal_zzalv_T.zzWl().getAnnotation(zzakt.class);
        return com_google_android_gms_internal_zzakt == null ? null : zza(this.zzbWa, com_google_android_gms_internal_zzajz, com_google_android_gms_internal_zzalv_T, com_google_android_gms_internal_zzakt);
    }
}
