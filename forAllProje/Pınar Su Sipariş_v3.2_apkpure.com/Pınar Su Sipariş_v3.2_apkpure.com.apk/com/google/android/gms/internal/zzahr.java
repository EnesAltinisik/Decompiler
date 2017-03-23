package com.google.android.gms.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public abstract class zzahr<T extends zzahr> implements zzahu {
    static final /* synthetic */ boolean $assertionsDisabled = (!zzahr.class.desiredAssertionStatus());
    protected final zzahu zzbQE;
    private String zzbQF;

    protected enum zza {
        DeferredValue,
        Boolean,
        Number,
        String
    }

    zzahr(zzahu com_google_android_gms_internal_zzahu) {
        this.zzbQE = com_google_android_gms_internal_zzahu;
    }

    private static int zza(zzahs com_google_android_gms_internal_zzahs, zzahm com_google_android_gms_internal_zzahm) {
        return Double.valueOf((double) ((Long) com_google_android_gms_internal_zzahs.getValue()).longValue()).compareTo((Double) com_google_android_gms_internal_zzahm.getValue());
    }

    public /* synthetic */ int compareTo(Object obj) {
        return zzg((zzahu) obj);
    }

    public int getChildCount() {
        return 0;
    }

    public Object getValue(boolean z) {
        if (!z || this.zzbQE.isEmpty()) {
            return getValue();
        }
        Map hashMap = new HashMap();
        hashMap.put(".value", getValue());
        hashMap.put(".priority", this.zzbQE.getValue());
        return hashMap;
    }

    public boolean isEmpty() {
        return false;
    }

    public Iterator<zzaht> iterator() {
        return Collections.emptyList().iterator();
    }

    public String toString() {
        String obj = getValue(true).toString();
        return obj.length() <= 100 ? obj : String.valueOf(obj.substring(0, 100)).concat("...");
    }

    public zzahu zzO(zzafa com_google_android_gms_internal_zzafa) {
        return com_google_android_gms_internal_zzafa.isEmpty() ? this : com_google_android_gms_internal_zzafa.zzRt().zzTl() ? this.zzbQE : zzahn.zzTA();
    }

    public Iterator<zzaht> zzPw() {
        return Collections.emptyList().iterator();
    }

    protected abstract zza zzTg();

    public String zzTn() {
        if (this.zzbQF == null) {
            this.zzbQF = zzaiv.zzim(zza(com.google.android.gms.internal.zzahu.zza.V1));
        }
        return this.zzbQF;
    }

    public boolean zzTo() {
        return true;
    }

    public zzahu zzTp() {
        return this.zzbQE;
    }

    protected abstract int zza(T t);

    protected String zzb(com.google.android.gms.internal.zzahu.zza com_google_android_gms_internal_zzahu_zza) {
        switch (com_google_android_gms_internal_zzahu_zza) {
            case V1:
            case V2:
                if (this.zzbQE.isEmpty()) {
                    return "";
                }
                String valueOf = String.valueOf(this.zzbQE.zza(com_google_android_gms_internal_zzahu_zza));
                return new StringBuilder(String.valueOf(valueOf).length() + 10).append("priority:").append(valueOf).append(":").toString();
            default:
                String valueOf2 = String.valueOf(com_google_android_gms_internal_zzahu_zza);
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf2).length() + 22).append("Unknown hash version: ").append(valueOf2).toString());
        }
    }

    protected int zzc(zzahr<?> com_google_android_gms_internal_zzahr_) {
        zza zzTg = zzTg();
        Enum zzTg2 = com_google_android_gms_internal_zzahr_.zzTg();
        return zzTg.equals(zzTg2) ? zza(com_google_android_gms_internal_zzahr_) : zzTg.compareTo(zzTg2);
    }

    public zzahu zze(zzahi com_google_android_gms_internal_zzahi, zzahu com_google_android_gms_internal_zzahu) {
        return com_google_android_gms_internal_zzahi.zzTl() ? zzf(com_google_android_gms_internal_zzahu) : !com_google_android_gms_internal_zzahu.isEmpty() ? zzahn.zzTA().zze(com_google_android_gms_internal_zzahi, com_google_android_gms_internal_zzahu).zzf(this.zzbQE) : this;
    }

    public int zzg(zzahu com_google_android_gms_internal_zzahu) {
        if (com_google_android_gms_internal_zzahu.isEmpty()) {
            return 1;
        }
        if (com_google_android_gms_internal_zzahu instanceof zzahj) {
            return -1;
        }
        if ($assertionsDisabled || com_google_android_gms_internal_zzahu.zzTo()) {
            return ((this instanceof zzahs) && (com_google_android_gms_internal_zzahu instanceof zzahm)) ? zza((zzahs) this, (zzahm) com_google_android_gms_internal_zzahu) : ((this instanceof zzahm) && (com_google_android_gms_internal_zzahu instanceof zzahs)) ? zza((zzahs) com_google_android_gms_internal_zzahu, (zzahm) this) * -1 : zzc((zzahr) com_google_android_gms_internal_zzahu);
        } else {
            throw new AssertionError("Node is not leaf node!");
        }
    }

    public boolean zzk(zzahi com_google_android_gms_internal_zzahi) {
        return false;
    }

    public zzahi zzl(zzahi com_google_android_gms_internal_zzahi) {
        return null;
    }

    public zzahu zzl(zzafa com_google_android_gms_internal_zzafa, zzahu com_google_android_gms_internal_zzahu) {
        zzahi zzRt = com_google_android_gms_internal_zzafa.zzRt();
        if (zzRt == null) {
            return com_google_android_gms_internal_zzahu;
        }
        if (com_google_android_gms_internal_zzahu.isEmpty() && !zzRt.zzTl()) {
            return this;
        }
        if ($assertionsDisabled || !com_google_android_gms_internal_zzafa.zzRt().zzTl() || com_google_android_gms_internal_zzafa.size() == 1) {
            return zze(zzRt, zzahn.zzTA().zzl(com_google_android_gms_internal_zzafa.zzRu(), com_google_android_gms_internal_zzahu));
        }
        throw new AssertionError();
    }

    public zzahu zzm(zzahi com_google_android_gms_internal_zzahi) {
        return com_google_android_gms_internal_zzahi.zzTl() ? this.zzbQE : zzahn.zzTA();
    }
}
