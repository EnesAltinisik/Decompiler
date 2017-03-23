package com.google.android.gms.internal;

import com.google.android.gms.internal.zzahu.zza;

public class zzaia extends zzahr<zzaia> {
    private final String value;

    public zzaia(String str, zzahu com_google_android_gms_internal_zzahu) {
        super(com_google_android_gms_internal_zzahu);
        this.value = str;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof zzaia)) {
            return false;
        }
        zzaia com_google_android_gms_internal_zzaia = (zzaia) obj;
        return this.value.equals(com_google_android_gms_internal_zzaia.value) && this.zzbQE.equals(com_google_android_gms_internal_zzaia.zzbQE);
    }

    public Object getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + this.zzbQE.hashCode();
    }

    protected zza zzTg() {
        return zza.String;
    }

    protected int zza(zzaia com_google_android_gms_internal_zzaia) {
        return this.value.compareTo(com_google_android_gms_internal_zzaia.value);
    }

    public String zza(zza com_google_android_gms_internal_zzahu_zza) {
        String valueOf;
        String str;
        switch (com_google_android_gms_internal_zzahu_zza) {
            case V1:
                valueOf = String.valueOf(zzb(com_google_android_gms_internal_zzahu_zza));
                str = this.value;
                return new StringBuilder((String.valueOf(valueOf).length() + 7) + String.valueOf(str).length()).append(valueOf).append("string:").append(str).toString();
            case V2:
                valueOf = String.valueOf(zzb(com_google_android_gms_internal_zzahu_zza));
                str = String.valueOf(zzaiv.zzin(this.value));
                return new StringBuilder((String.valueOf(valueOf).length() + 7) + String.valueOf(str).length()).append(valueOf).append("string:").append(str).toString();
            default:
                str = String.valueOf(com_google_android_gms_internal_zzahu_zza);
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 38).append("Invalid hash version for string node: ").append(str).toString());
        }
    }

    public /* synthetic */ zzahu zzf(zzahu com_google_android_gms_internal_zzahu) {
        return zzr(com_google_android_gms_internal_zzahu);
    }

    public zzaia zzr(zzahu com_google_android_gms_internal_zzahu) {
        return new zzaia(this.value, com_google_android_gms_internal_zzahu);
    }
}
