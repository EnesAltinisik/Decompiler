package com.google.android.gms.internal;

import com.google.android.gms.internal.zzahu.zza;

public class zzahh extends zzahr<zzahh> {
    private final boolean value;

    public zzahh(Boolean bool, zzahu com_google_android_gms_internal_zzahu) {
        super(com_google_android_gms_internal_zzahu);
        this.value = bool.booleanValue();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof zzahh)) {
            return false;
        }
        zzahh com_google_android_gms_internal_zzahh = (zzahh) obj;
        return this.value == com_google_android_gms_internal_zzahh.value && this.zzbQE.equals(com_google_android_gms_internal_zzahh.zzbQE);
    }

    public Object getValue() {
        return Boolean.valueOf(this.value);
    }

    public int hashCode() {
        return (this.value ? 1 : 0) + this.zzbQE.hashCode();
    }

    protected zza zzTg() {
        return zza.Boolean;
    }

    protected int zza(zzahh com_google_android_gms_internal_zzahh) {
        return this.value == com_google_android_gms_internal_zzahh.value ? 0 : this.value ? 1 : -1;
    }

    public String zza(zza com_google_android_gms_internal_zzahu_zza) {
        String valueOf = String.valueOf(zzb(com_google_android_gms_internal_zzahu_zza));
        return new StringBuilder(String.valueOf(valueOf).length() + 13).append(valueOf).append("boolean:").append(this.value).toString();
    }

    public zzahh zze(zzahu com_google_android_gms_internal_zzahu) {
        return new zzahh(Boolean.valueOf(this.value), com_google_android_gms_internal_zzahu);
    }

    public /* synthetic */ zzahu zzf(zzahu com_google_android_gms_internal_zzahu) {
        return zze(com_google_android_gms_internal_zzahu);
    }
}
