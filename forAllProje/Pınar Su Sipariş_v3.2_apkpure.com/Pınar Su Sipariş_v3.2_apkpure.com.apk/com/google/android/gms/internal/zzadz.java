package com.google.android.gms.internal;

import com.google.android.gms.internal.zzadx.zza;
import com.google.android.gms.internal.zzadx.zzb;
import java.util.Comparator;

public abstract class zzadz<K, V> implements zzadx<K, V> {
    private final K zzbIt;
    private final V zzbIu;
    private zzadx<K, V> zzbIv;
    private final zzadx<K, V> zzbIw;

    zzadz(K k, V v, zzadx<K, V> com_google_android_gms_internal_zzadx_K__V, zzadx<K, V> com_google_android_gms_internal_zzadx_K__V2) {
        zzadx zzPD;
        zzadx zzPD2;
        this.zzbIt = k;
        this.zzbIu = v;
        if (com_google_android_gms_internal_zzadx_K__V == null) {
            zzPD = zzadw.zzPD();
        }
        this.zzbIv = zzPD;
        if (com_google_android_gms_internal_zzadx_K__V2 == null) {
            zzPD2 = zzadw.zzPD();
        }
        this.zzbIw = zzPD2;
    }

    private zzadx<K, V> zzPJ() {
        if (this.zzbIv.isEmpty()) {
            return zzadw.zzPD();
        }
        if (!(zzPE().zzPC() || zzPE().zzPE().zzPC())) {
            this = zzPK();
        }
        return zza(null, null, ((zzadz) this.zzbIv).zzPJ(), null).zzPM();
    }

    private zzadz<K, V> zzPK() {
        zzadz<K, V> zzPP = zzPP();
        return zzPP.zzPF().zzPE().zzPC() ? zzPP.zza(null, null, null, ((zzadz) zzPP.zzPF()).zzPO()).zzPN().zzPP() : zzPP;
    }

    private zzadz<K, V> zzPL() {
        zzadz<K, V> zzPP = zzPP();
        return zzPP.zzPE().zzPE().zzPC() ? zzPP.zzPO().zzPP() : zzPP;
    }

    private zzadz<K, V> zzPM() {
        zzadz<K, V> zzPN;
        if (this.zzbIw.zzPC() && !this.zzbIv.zzPC()) {
            zzPN = zzPN();
        }
        if (zzPN.zzbIv.zzPC() && ((zzadz) zzPN.zzbIv).zzbIv.zzPC()) {
            zzPN = zzPN.zzPO();
        }
        return (zzPN.zzbIv.zzPC() && zzPN.zzbIw.zzPC()) ? zzPN.zzPP() : zzPN;
    }

    private zzadz<K, V> zzPN() {
        return (zzadz) this.zzbIw.zza(null, null, zzPB(), (zzadz) zza(null, null, zza.RED, null, ((zzadz) this.zzbIw).zzbIv), null);
    }

    private zzadz<K, V> zzPO() {
        return (zzadz) this.zzbIv.zza(null, null, zzPB(), null, (zzadz) zza(null, null, zza.RED, ((zzadz) this.zzbIv).zzbIw, null));
    }

    private zzadz<K, V> zzPP() {
        return (zzadz) zza(null, null, zza((zzadx) this), this.zzbIv.zza(null, null, zza(this.zzbIv), null, null), this.zzbIw.zza(null, null, zza(this.zzbIw), null, null));
    }

    private static zza zza(zzadx com_google_android_gms_internal_zzadx) {
        return com_google_android_gms_internal_zzadx.zzPC() ? zza.BLACK : zza.RED;
    }

    public K getKey() {
        return this.zzbIt;
    }

    public V getValue() {
        return this.zzbIu;
    }

    public boolean isEmpty() {
        return false;
    }

    protected abstract zza zzPB();

    public zzadx<K, V> zzPE() {
        return this.zzbIv;
    }

    public zzadx<K, V> zzPF() {
        return this.zzbIw;
    }

    public zzadx<K, V> zzPG() {
        return this.zzbIv.isEmpty() ? this : this.zzbIv.zzPG();
    }

    public zzadx<K, V> zzPH() {
        return this.zzbIw.isEmpty() ? this : this.zzbIw.zzPH();
    }

    public int zzPI() {
        return (this.zzbIv.zzPI() + 1) + this.zzbIw.zzPI();
    }

    public /* synthetic */ zzadx zza(Object obj, Object obj2, zza com_google_android_gms_internal_zzadx_zza, zzadx com_google_android_gms_internal_zzadx, zzadx com_google_android_gms_internal_zzadx2) {
        return zzb(obj, obj2, com_google_android_gms_internal_zzadx_zza, com_google_android_gms_internal_zzadx, com_google_android_gms_internal_zzadx2);
    }

    public zzadx<K, V> zza(K k, V v, Comparator<K> comparator) {
        int compare = comparator.compare(k, this.zzbIt);
        zzadz zza = compare < 0 ? zza(null, null, this.zzbIv.zza(k, v, comparator), null) : compare == 0 ? zza(k, v, null, null) : zza(null, null, null, this.zzbIw.zza(k, v, comparator));
        return zza.zzPM();
    }

    public zzadx<K, V> zza(K k, Comparator<K> comparator) {
        zzadz zza;
        if (comparator.compare(k, this.zzbIt) < 0) {
            if (!(this.zzbIv.isEmpty() || this.zzbIv.zzPC() || ((zzadz) this.zzbIv).zzbIv.zzPC())) {
                this = zzPK();
            }
            zza = zza(null, null, this.zzbIv.zza(k, comparator), null);
        } else {
            if (this.zzbIv.zzPC()) {
                this = zzPO();
            }
            if (!(this.zzbIw.isEmpty() || this.zzbIw.zzPC() || ((zzadz) this.zzbIw).zzbIv.zzPC())) {
                this = zzPL();
            }
            if (comparator.compare(k, this.zzbIt) == 0) {
                if (this.zzbIw.isEmpty()) {
                    return zzadw.zzPD();
                }
                zzadx zzPG = this.zzbIw.zzPG();
                this = zza(zzPG.getKey(), zzPG.getValue(), null, ((zzadz) this.zzbIw).zzPJ());
            }
            zza = zza(null, null, null, this.zzbIw.zza(k, comparator));
        }
        return zza.zzPM();
    }

    protected abstract zzadz<K, V> zza(K k, V v, zzadx<K, V> com_google_android_gms_internal_zzadx_K__V, zzadx<K, V> com_google_android_gms_internal_zzadx_K__V2);

    public void zza(zzb<K, V> com_google_android_gms_internal_zzadx_zzb_K__V) {
        this.zzbIv.zza(com_google_android_gms_internal_zzadx_zzb_K__V);
        com_google_android_gms_internal_zzadx_zzb_K__V.zzk(this.zzbIt, this.zzbIu);
        this.zzbIw.zza(com_google_android_gms_internal_zzadx_zzb_K__V);
    }

    public zzadz<K, V> zzb(K k, V v, zza com_google_android_gms_internal_zzadx_zza, zzadx<K, V> com_google_android_gms_internal_zzadx_K__V, zzadx<K, V> com_google_android_gms_internal_zzadx_K__V2) {
        Object obj;
        Object obj2;
        zzadx com_google_android_gms_internal_zzadx;
        zzadx com_google_android_gms_internal_zzadx2;
        if (k == null) {
            obj = this.zzbIt;
        }
        if (v == null) {
            obj2 = this.zzbIu;
        }
        if (com_google_android_gms_internal_zzadx_K__V == null) {
            com_google_android_gms_internal_zzadx = this.zzbIv;
        }
        if (com_google_android_gms_internal_zzadx_K__V2 == null) {
            com_google_android_gms_internal_zzadx2 = this.zzbIw;
        }
        return com_google_android_gms_internal_zzadx_zza == zza.RED ? new zzady(obj, obj2, com_google_android_gms_internal_zzadx, com_google_android_gms_internal_zzadx2) : new zzadv(obj, obj2, com_google_android_gms_internal_zzadx, com_google_android_gms_internal_zzadx2);
    }

    void zzb(zzadx<K, V> com_google_android_gms_internal_zzadx_K__V) {
        this.zzbIv = com_google_android_gms_internal_zzadx_K__V;
    }
}
