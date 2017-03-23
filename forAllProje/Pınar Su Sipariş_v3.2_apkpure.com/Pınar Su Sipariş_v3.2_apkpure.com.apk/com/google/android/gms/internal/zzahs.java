package com.google.android.gms.internal;

import com.google.android.gms.internal.zzahu.zza;

public class zzahs extends zzahr<zzahs> {
    private final long value;

    public zzahs(Long l, zzahu com_google_android_gms_internal_zzahu) {
        super(com_google_android_gms_internal_zzahu);
        this.value = l.longValue();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof zzahs)) {
            return false;
        }
        zzahs com_google_android_gms_internal_zzahs = (zzahs) obj;
        return this.value == com_google_android_gms_internal_zzahs.value && this.zzbQE.equals(com_google_android_gms_internal_zzahs.zzbQE);
    }

    public Object getValue() {
        return Long.valueOf(this.value);
    }

    public int hashCode() {
        return ((int) (this.value ^ (this.value >>> 32))) + this.zzbQE.hashCode();
    }

    protected zza zzTg() {
        return zza.Number;
    }

    protected int zza(zzahs com_google_android_gms_internal_zzahs) {
        return zzaiv.zzf(this.value, com_google_android_gms_internal_zzahs.value);
    }

    public String zza(zza com_google_android_gms_internal_zzahu_zza) {
        String valueOf = String.valueOf(String.valueOf(zzb(com_google_android_gms_internal_zzahu_zza)).concat("number:"));
        String valueOf2 = String.valueOf(zzaiv.zzn((double) this.value));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public /* synthetic */ zzahu zzf(zzahu com_google_android_gms_internal_zzahu) {
        return zzo(com_google_android_gms_internal_zzahu);
    }

    public zzahs zzo(zzahu com_google_android_gms_internal_zzahu) {
        return new zzahs(Long.valueOf(this.value), com_google_android_gms_internal_zzahu);
    }
}
