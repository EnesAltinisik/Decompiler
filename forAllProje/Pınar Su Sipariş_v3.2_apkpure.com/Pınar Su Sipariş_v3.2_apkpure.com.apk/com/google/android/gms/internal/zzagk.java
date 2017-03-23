package com.google.android.gms.internal;

import java.util.Map.Entry;

public class zzagk<T> {
    static final /* synthetic */ boolean $assertionsDisabled = (!zzagk.class.desiredAssertionStatus());
    private zzahi zzbPi;
    private zzagk<T> zzbPj;
    private zzagl<T> zzbPk;

    public interface zzb<T> {
        void zzd(zzagk<T> com_google_android_gms_internal_zzagk_T);
    }

    public interface zza<T> {
        boolean zze(zzagk<T> com_google_android_gms_internal_zzagk_T);
    }

    public zzagk() {
        this(null, null, new zzagl());
    }

    public zzagk(zzahi com_google_android_gms_internal_zzahi, zzagk<T> com_google_android_gms_internal_zzagk_T, zzagl<T> com_google_android_gms_internal_zzagl_T) {
        this.zzbPi = com_google_android_gms_internal_zzahi;
        this.zzbPj = com_google_android_gms_internal_zzagk_T;
        this.zzbPk = com_google_android_gms_internal_zzagl_T;
    }

    private void zzSq() {
        if (this.zzbPj != null) {
            this.zzbPj.zza(this.zzbPi, this);
        }
    }

    private void zza(zzahi com_google_android_gms_internal_zzahi, zzagk<T> com_google_android_gms_internal_zzagk_T) {
        boolean isEmpty = com_google_android_gms_internal_zzagk_T.isEmpty();
        boolean containsKey = this.zzbPk.zzbNf.containsKey(com_google_android_gms_internal_zzahi);
        if (isEmpty && containsKey) {
            this.zzbPk.zzbNf.remove(com_google_android_gms_internal_zzahi);
            zzSq();
        } else if (!isEmpty && !containsKey) {
            this.zzbPk.zzbNf.put(com_google_android_gms_internal_zzahi, com_google_android_gms_internal_zzagk_T.zzbPk);
            zzSq();
        }
    }

    public T getValue() {
        return this.zzbPk.zzbIu;
    }

    public boolean hasChildren() {
        return !this.zzbPk.zzbNf.isEmpty();
    }

    public boolean isEmpty() {
        return this.zzbPk.zzbIu == null && this.zzbPk.zzbNf.isEmpty();
    }

    public void setValue(T t) {
        this.zzbPk.zzbIu = t;
        zzSq();
    }

    public String toString() {
        return toString("");
    }

    String toString(String str) {
        String asString = this.zzbPi == null ? "<anon>" : this.zzbPi.asString();
        String valueOf = String.valueOf(this.zzbPk.toString(String.valueOf(str).concat("\t")));
        return new StringBuilder(((String.valueOf(str).length() + 1) + String.valueOf(asString).length()) + String.valueOf(valueOf).length()).append(str).append(asString).append("\n").append(valueOf).toString();
    }

    public zzagk<T> zzL(zzafa com_google_android_gms_internal_zzafa) {
        zzagk<T> com_google_android_gms_internal_zzagk_T;
        zzahi zzRt = com_google_android_gms_internal_zzafa.zzRt();
        while (zzRt != null) {
            zzagk<T> com_google_android_gms_internal_zzagk = new zzagk(zzRt, com_google_android_gms_internal_zzagk_T, com_google_android_gms_internal_zzagk_T.zzbPk.zzbNf.containsKey(zzRt) ? (zzagl) com_google_android_gms_internal_zzagk_T.zzbPk.zzbNf.get(zzRt) : new zzagl());
            com_google_android_gms_internal_zzafa = com_google_android_gms_internal_zzafa.zzRu();
            zzRt = com_google_android_gms_internal_zzafa.zzRt();
            com_google_android_gms_internal_zzagk_T = com_google_android_gms_internal_zzagk;
        }
        return com_google_android_gms_internal_zzagk_T;
    }

    public zzafa zzPn() {
        if (this.zzbPj != null) {
            if ($assertionsDisabled || this.zzbPi != null) {
                return this.zzbPj.zzPn().zza(this.zzbPi);
            }
            throw new AssertionError();
        } else if (this.zzbPi == null) {
            return zzafa.zzRq();
        } else {
            return new zzafa(this.zzbPi);
        }
    }

    public void zza(zzb<T> com_google_android_gms_internal_zzagk_zzb_T) {
        zza(com_google_android_gms_internal_zzagk_zzb_T, false, false);
    }

    public void zza(final zzb<T> com_google_android_gms_internal_zzagk_zzb_T, boolean z, final boolean z2) {
        if (z && !z2) {
            com_google_android_gms_internal_zzagk_zzb_T.zzd(this);
        }
        zzb(new zzb<T>(this) {
            final /* synthetic */ zzagk c;

            public void zzd(zzagk<T> com_google_android_gms_internal_zzagk_T) {
                com_google_android_gms_internal_zzagk_T.zza(com_google_android_gms_internal_zzagk_zzb_T, true, z2);
            }
        });
        if (z && z2) {
            com_google_android_gms_internal_zzagk_zzb_T.zzd(this);
        }
    }

    public boolean zza(zza<T> com_google_android_gms_internal_zzagk_zza_T) {
        return zza((zza) com_google_android_gms_internal_zzagk_zza_T, false);
    }

    public boolean zza(zza<T> com_google_android_gms_internal_zzagk_zza_T, boolean z) {
        if (!z) {
            this = this.zzbPj;
        }
        while (this != null) {
            if (com_google_android_gms_internal_zzagk_zza_T.zze(this)) {
                return true;
            }
            this = this.zzbPj;
        }
        return false;
    }

    public void zzb(zzb<T> com_google_android_gms_internal_zzagk_zzb_T) {
        Object[] toArray = this.zzbPk.zzbNf.entrySet().toArray();
        for (Object obj : toArray) {
            Entry entry = (Entry) obj;
            com_google_android_gms_internal_zzagk_zzb_T.zzd(new zzagk((zzahi) entry.getKey(), this, (zzagl) entry.getValue()));
        }
    }
}
