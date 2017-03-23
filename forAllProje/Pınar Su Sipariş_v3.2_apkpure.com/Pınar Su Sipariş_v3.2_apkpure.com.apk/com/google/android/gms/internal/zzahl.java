package com.google.android.gms.internal;

import com.google.android.gms.internal.zzahu.zza;
import java.util.Map;

public class zzahl extends zzahr<zzahl> {
    static final /* synthetic */ boolean $assertionsDisabled = (!zzahl.class.desiredAssertionStatus());
    private Map<Object, Object> zzbQT;

    public zzahl(Map<Object, Object> map, zzahu com_google_android_gms_internal_zzahu) {
        super(com_google_android_gms_internal_zzahu);
        this.zzbQT = map;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof zzahl)) {
            return false;
        }
        zzahl com_google_android_gms_internal_zzahl = (zzahl) obj;
        return this.zzbQT.equals(com_google_android_gms_internal_zzahl.zzbQT) && this.zzbQE.equals(com_google_android_gms_internal_zzahl.zzbQE);
    }

    public Object getValue() {
        return this.zzbQT;
    }

    public int hashCode() {
        return this.zzbQT.hashCode() + this.zzbQE.hashCode();
    }

    protected zza zzTg() {
        return zza.DeferredValue;
    }

    protected int zza(zzahl com_google_android_gms_internal_zzahl) {
        return 0;
    }

    public String zza(zza com_google_android_gms_internal_zzahu_zza) {
        String valueOf = String.valueOf(zzb(com_google_android_gms_internal_zzahu_zza));
        String valueOf2 = String.valueOf(this.zzbQT);
        return new StringBuilder((String.valueOf(valueOf).length() + 14) + String.valueOf(valueOf2).length()).append(valueOf).append("deferredValue:").append(valueOf2).toString();
    }

    public /* synthetic */ zzahu zzf(zzahu com_google_android_gms_internal_zzahu) {
        return zzi(com_google_android_gms_internal_zzahu);
    }

    public zzahl zzi(zzahu com_google_android_gms_internal_zzahu) {
        if ($assertionsDisabled || zzahy.zzp(com_google_android_gms_internal_zzahu)) {
            return new zzahl(this.zzbQT, com_google_android_gms_internal_zzahu);
        }
        throw new AssertionError();
    }
}
