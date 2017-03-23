package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;

public class zzaga implements zzagd {
    static final /* synthetic */ boolean $assertionsDisabled = (!zzaga.class.desiredAssertionStatus());
    private final zzahf zzbHV;
    private final zzage zzbOE;
    private final zzagh zzbOF;
    private final zzafz zzbOG;
    private long zzbOH;

    public zzaga(zzaeu com_google_android_gms_internal_zzaeu, zzage com_google_android_gms_internal_zzage, zzafz com_google_android_gms_internal_zzafz) {
        this(com_google_android_gms_internal_zzaeu, com_google_android_gms_internal_zzage, com_google_android_gms_internal_zzafz, new zzaio());
    }

    public zzaga(zzaeu com_google_android_gms_internal_zzaeu, zzage com_google_android_gms_internal_zzage, zzafz com_google_android_gms_internal_zzafz, zzain com_google_android_gms_internal_zzain) {
        this.zzbOH = 0;
        this.zzbOE = com_google_android_gms_internal_zzage;
        this.zzbHV = com_google_android_gms_internal_zzaeu.zzib("Persistence");
        this.zzbOF = new zzagh(this.zzbOE, this.zzbHV, com_google_android_gms_internal_zzain);
        this.zzbOG = com_google_android_gms_internal_zzafz;
    }

    private void zzSi() {
        this.zzbOH++;
        if (this.zzbOG.zzaG(this.zzbOH)) {
            if (this.zzbHV.zzTe()) {
                this.zzbHV.zzh("Reached prune check threshold.", new Object[0]);
            }
            this.zzbOH = 0;
            int i = 1;
            long zzPq = this.zzbOE.zzPq();
            if (this.zzbHV.zzTe()) {
                this.zzbHV.zzh("Cache size: " + zzPq, new Object[0]);
            }
            while (i != 0 && this.zzbOG.zze(r2, this.zzbOF.zzSm())) {
                zzagf zza = this.zzbOF.zza(this.zzbOG);
                if (zza.zzSj()) {
                    this.zzbOE.zza(zzafa.zzRq(), zza);
                } else {
                    i = 0;
                }
                zzPq = this.zzbOE.zzPq();
                if (this.zzbHV.zzTe()) {
                    this.zzbHV.zzh("Cache size after prune: " + zzPq, new Object[0]);
                }
            }
        }
    }

    public List<zzafn> zzPp() {
        return this.zzbOE.zzPp();
    }

    public void zzPs() {
        this.zzbOE.zzPs();
    }

    public void zza(zzafa com_google_android_gms_internal_zzafa, zzaes com_google_android_gms_internal_zzaes, long j) {
        this.zzbOE.zza(com_google_android_gms_internal_zzafa, com_google_android_gms_internal_zzaes, j);
    }

    public void zza(zzafa com_google_android_gms_internal_zzafa, zzahu com_google_android_gms_internal_zzahu, long j) {
        this.zzbOE.zza(com_google_android_gms_internal_zzafa, com_google_android_gms_internal_zzahu, j);
    }

    public void zza(zzagu com_google_android_gms_internal_zzagu, zzahu com_google_android_gms_internal_zzahu) {
        if (com_google_android_gms_internal_zzagu.zzSO()) {
            this.zzbOE.zza(com_google_android_gms_internal_zzagu.zzPn(), com_google_android_gms_internal_zzahu);
        } else {
            this.zzbOE.zzb(com_google_android_gms_internal_zzagu.zzPn(), com_google_android_gms_internal_zzahu);
        }
        zzi(com_google_android_gms_internal_zzagu);
        zzSi();
    }

    public void zza(zzagu com_google_android_gms_internal_zzagu, Set<zzahi> set) {
        if ($assertionsDisabled || !com_google_android_gms_internal_zzagu.zzSO()) {
            zzagg zzl = this.zzbOF.zzl(com_google_android_gms_internal_zzagu);
            if ($assertionsDisabled || (zzl != null && zzl.zzbOT)) {
                this.zzbOE.zza(zzl.id, (Set) set);
                return;
            }
            throw new AssertionError("We only expect tracked keys for currently-active queries.");
        }
        throw new AssertionError("We should only track keys for filtered queries.");
    }

    public void zza(zzagu com_google_android_gms_internal_zzagu, Set<zzahi> set, Set<zzahi> set2) {
        if ($assertionsDisabled || !com_google_android_gms_internal_zzagu.zzSO()) {
            zzagg zzl = this.zzbOF.zzl(com_google_android_gms_internal_zzagu);
            if ($assertionsDisabled || (zzl != null && zzl.zzbOT)) {
                this.zzbOE.zza(zzl.id, (Set) set, (Set) set2);
                return;
            }
            throw new AssertionError("We only expect tracked keys for currently-active queries.");
        }
        throw new AssertionError("We should only track keys for filtered queries.");
    }

    public void zzat(long j) {
        this.zzbOE.zzat(j);
    }

    public void zzc(zzafa com_google_android_gms_internal_zzafa, zzaes com_google_android_gms_internal_zzaes) {
        Iterator it = com_google_android_gms_internal_zzaes.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            zzk(com_google_android_gms_internal_zzafa.zzh((zzafa) entry.getKey()), (zzahu) entry.getValue());
        }
    }

    public void zzd(zzafa com_google_android_gms_internal_zzafa, zzaes com_google_android_gms_internal_zzaes) {
        this.zzbOE.zza(com_google_android_gms_internal_zzafa, com_google_android_gms_internal_zzaes);
        zzSi();
    }

    public zzagm zzf(zzagu com_google_android_gms_internal_zzagu) {
        boolean z;
        Set zzaw;
        if (this.zzbOF.zzo(com_google_android_gms_internal_zzagu)) {
            zzagg zzl = this.zzbOF.zzl(com_google_android_gms_internal_zzagu);
            zzaw = (com_google_android_gms_internal_zzagu.zzSO() || zzl == null || !zzl.zzbOS) ? null : this.zzbOE.zzaw(zzl.id);
            z = true;
        } else {
            zzaw = this.zzbOF.zzB(com_google_android_gms_internal_zzagu.zzPn());
            z = false;
        }
        zzahu zza = this.zzbOE.zza(com_google_android_gms_internal_zzagu.zzPn());
        if (r0 == null) {
            return new zzagm(zzahp.zza(zza, com_google_android_gms_internal_zzagu.zzSK()), z, false);
        }
        zzahu zzTA = zzahn.zzTA();
        for (zzahi com_google_android_gms_internal_zzahi : r0) {
            zzTA = zzTA.zze(com_google_android_gms_internal_zzahi, zza.zzm(com_google_android_gms_internal_zzahi));
        }
        return new zzagm(zzahp.zza(zzTA, com_google_android_gms_internal_zzagu.zzSK()), z, true);
    }

    public <T> T zzf(Callable<T> callable) {
        this.zzbOE.beginTransaction();
        try {
            T call = callable.call();
            this.zzbOE.setTransactionSuccessful();
            this.zzbOE.endTransaction();
            return call;
        } catch (Throwable th) {
            this.zzbOE.endTransaction();
        }
    }

    public void zzg(zzagu com_google_android_gms_internal_zzagu) {
        this.zzbOF.zzg(com_google_android_gms_internal_zzagu);
    }

    public void zzh(zzagu com_google_android_gms_internal_zzagu) {
        this.zzbOF.zzh(com_google_android_gms_internal_zzagu);
    }

    public void zzi(zzagu com_google_android_gms_internal_zzagu) {
        if (com_google_android_gms_internal_zzagu.zzSO()) {
            this.zzbOF.zzA(com_google_android_gms_internal_zzagu.zzPn());
        } else {
            this.zzbOF.zzn(com_google_android_gms_internal_zzagu);
        }
    }

    public void zzk(zzafa com_google_android_gms_internal_zzafa, zzahu com_google_android_gms_internal_zzahu) {
        if (!this.zzbOF.zzD(com_google_android_gms_internal_zzafa)) {
            this.zzbOE.zza(com_google_android_gms_internal_zzafa, com_google_android_gms_internal_zzahu);
            this.zzbOF.zzC(com_google_android_gms_internal_zzafa);
        }
    }
}
