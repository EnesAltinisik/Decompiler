package com.google.android.gms.internal;

import com.google.android.gms.internal.zzagi.zza;

public class zzagf {
    private static final zzagj<Boolean> zzbOK = new zzagj<Boolean>() {
        public boolean a(Boolean bool) {
            return !bool.booleanValue();
        }

        public /* synthetic */ boolean zzap(Object obj) {
            return a((Boolean) obj);
        }
    };
    private static final zzagj<Boolean> zzbOL = new zzagj<Boolean>() {
        public boolean a(Boolean bool) {
            return bool.booleanValue();
        }

        public /* synthetic */ boolean zzap(Object obj) {
            return a((Boolean) obj);
        }
    };
    private static final zzagi<Boolean> zzbOM = new zzagi(Boolean.valueOf(true));
    private static final zzagi<Boolean> zzbON = new zzagi(Boolean.valueOf(false));
    private final zzagi<Boolean> zzbOJ;

    public zzagf() {
        this.zzbOJ = zzagi.zzSo();
    }

    private zzagf(zzagi<Boolean> com_google_android_gms_internal_zzagi_java_lang_Boolean) {
        this.zzbOJ = com_google_android_gms_internal_zzagi_java_lang_Boolean;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzagf)) {
            return false;
        }
        return this.zzbOJ.equals(((zzagf) obj).zzbOJ);
    }

    public int hashCode() {
        return this.zzbOJ.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.zzbOJ.toString());
        return new StringBuilder(String.valueOf(valueOf).length() + 14).append("{PruneForest:").append(valueOf).append("}").toString();
    }

    public boolean zzSj() {
        return this.zzbOJ.zzb(zzbOL);
    }

    public <T> T zza(T t, final zza<Void, T> com_google_android_gms_internal_zzagi_zza_java_lang_Void__T) {
        return this.zzbOJ.zzb((Object) t, new zza<Boolean, T>(this) {
            final /* synthetic */ zzagf b;

            public T a(zzafa com_google_android_gms_internal_zzafa, Boolean bool, T t) {
                return !bool.booleanValue() ? com_google_android_gms_internal_zzagi_zza_java_lang_Void__T.zza(com_google_android_gms_internal_zzafa, null, t) : t;
            }

            public /* synthetic */ Object zza(zzafa com_google_android_gms_internal_zzafa, Object obj, Object obj2) {
                return a(com_google_android_gms_internal_zzafa, (Boolean) obj, obj2);
            }
        });
    }

    public zzagf zzd(zzahi com_google_android_gms_internal_zzahi) {
        zzagi zze = this.zzbOJ.zze(com_google_android_gms_internal_zzahi);
        zzagi com_google_android_gms_internal_zzagi = zze == null ? new zzagi((Boolean) this.zzbOJ.getValue()) : (zze.getValue() != null || this.zzbOJ.getValue() == null) ? zze : zze.zzb(zzafa.zzRq(), (Boolean) this.zzbOJ.getValue());
        return new zzagf(com_google_android_gms_internal_zzagi);
    }

    public boolean zzw(zzafa com_google_android_gms_internal_zzafa) {
        Boolean bool = (Boolean) this.zzbOJ.zzH(com_google_android_gms_internal_zzafa);
        return bool != null && bool.booleanValue();
    }

    public boolean zzx(zzafa com_google_android_gms_internal_zzafa) {
        Boolean bool = (Boolean) this.zzbOJ.zzH(com_google_android_gms_internal_zzafa);
        return (bool == null || bool.booleanValue()) ? false : true;
    }

    public zzagf zzy(zzafa com_google_android_gms_internal_zzafa) {
        if (this.zzbOJ.zzb(com_google_android_gms_internal_zzafa, zzbOK) == null) {
            return this.zzbOJ.zzb(com_google_android_gms_internal_zzafa, zzbOL) != null ? this : new zzagf(this.zzbOJ.zza(com_google_android_gms_internal_zzafa, zzbOM));
        } else {
            throw new IllegalArgumentException("Can't prune path that was kept previously!");
        }
    }

    public zzagf zzz(zzafa com_google_android_gms_internal_zzafa) {
        return this.zzbOJ.zzb(com_google_android_gms_internal_zzafa, zzbOK) != null ? this : new zzagf(this.zzbOJ.zza(com_google_android_gms_internal_zzafa, zzbON));
    }
}
