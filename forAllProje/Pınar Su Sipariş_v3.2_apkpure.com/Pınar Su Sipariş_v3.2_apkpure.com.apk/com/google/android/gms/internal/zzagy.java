package com.google.android.gms.internal;

import com.google.android.gms.internal.zzagq.zza;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class zzagy {
    static final /* synthetic */ boolean $assertionsDisabled = (!zzagy.class.desiredAssertionStatus());
    private final Map<zzahi, zzago> zzbQj = new HashMap();

    public List<zzago> zzSZ() {
        return new ArrayList(this.zzbQj.values());
    }

    public void zza(zzago com_google_android_gms_internal_zzago) {
        zza zzSw = com_google_android_gms_internal_zzago.zzSw();
        zzahi zzSv = com_google_android_gms_internal_zzago.zzSv();
        if (!$assertionsDisabled && zzSw != zza.CHILD_ADDED && zzSw != zza.CHILD_CHANGED && zzSw != zza.CHILD_REMOVED) {
            throw new AssertionError("Only child changes supported for tracking");
        } else if (!$assertionsDisabled && com_google_android_gms_internal_zzago.zzSv().zzTl()) {
            throw new AssertionError();
        } else if (this.zzbQj.containsKey(zzSv)) {
            zzago com_google_android_gms_internal_zzago2 = (zzago) this.zzbQj.get(zzSv);
            zza zzSw2 = com_google_android_gms_internal_zzago2.zzSw();
            if (zzSw == zza.CHILD_ADDED && zzSw2 == zza.CHILD_REMOVED) {
                this.zzbQj.put(com_google_android_gms_internal_zzago.zzSv(), zzago.zza(zzSv, com_google_android_gms_internal_zzago.zzSt(), com_google_android_gms_internal_zzago2.zzSt()));
            } else if (zzSw == zza.CHILD_REMOVED && zzSw2 == zza.CHILD_ADDED) {
                this.zzbQj.remove(zzSv);
            } else if (zzSw == zza.CHILD_REMOVED && zzSw2 == zza.CHILD_CHANGED) {
                this.zzbQj.put(zzSv, zzago.zzb(zzSv, com_google_android_gms_internal_zzago2.zzSy()));
            } else if (zzSw == zza.CHILD_CHANGED && zzSw2 == zza.CHILD_ADDED) {
                this.zzbQj.put(zzSv, zzago.zza(zzSv, com_google_android_gms_internal_zzago.zzSt()));
            } else if (zzSw == zza.CHILD_CHANGED && zzSw2 == zza.CHILD_CHANGED) {
                this.zzbQj.put(zzSv, zzago.zza(zzSv, com_google_android_gms_internal_zzago.zzSt(), com_google_android_gms_internal_zzago2.zzSy()));
            } else {
                String valueOf = String.valueOf(com_google_android_gms_internal_zzago);
                String valueOf2 = String.valueOf(com_google_android_gms_internal_zzago2);
                throw new IllegalStateException(new StringBuilder((String.valueOf(valueOf).length() + 48) + String.valueOf(valueOf2).length()).append("Illegal combination of changes: ").append(valueOf).append(" occurred after ").append(valueOf2).toString());
            }
        } else {
            this.zzbQj.put(com_google_android_gms_internal_zzago.zzSv(), com_google_android_gms_internal_zzago);
        }
    }
}
