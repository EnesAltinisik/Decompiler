package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class zzafq {
    static final /* synthetic */ boolean $assertionsDisabled = (!zzafq.class.desiredAssertionStatus());
    private static final zzagj<zzafn> zzbOb = new zzagj<zzafn>() {
        public boolean a(zzafn com_google_android_gms_internal_zzafn) {
            return com_google_android_gms_internal_zzafn.isVisible();
        }

        public /* synthetic */ boolean zzap(Object obj) {
            return a((zzafn) obj);
        }
    };
    private zzaes zzbNY = zzaes.zzQN();
    private List<zzafn> zzbNZ = new ArrayList();
    private Long zzbOa = Long.valueOf(-1);

    private void zzRU() {
        this.zzbNY = zza(this.zzbNZ, zzbOb, zzafa.zzRq());
        if (this.zzbNZ.size() > 0) {
            this.zzbOa = Long.valueOf(((zzafn) this.zzbNZ.get(this.zzbNZ.size() - 1)).zzRN());
        } else {
            this.zzbOa = Long.valueOf(-1);
        }
    }

    private static zzaes zza(List<zzafn> list, zzagj<zzafn> com_google_android_gms_internal_zzagj_com_google_android_gms_internal_zzafn, zzafa com_google_android_gms_internal_zzafa) {
        zzaes zzQN = zzaes.zzQN();
        zzaes com_google_android_gms_internal_zzaes = zzQN;
        for (zzafn com_google_android_gms_internal_zzafn : list) {
            if (com_google_android_gms_internal_zzagj_com_google_android_gms_internal_zzafn.zzap(com_google_android_gms_internal_zzafn)) {
                zzafa zzPn = com_google_android_gms_internal_zzafn.zzPn();
                if (com_google_android_gms_internal_zzafn.zzRQ()) {
                    if (com_google_android_gms_internal_zzafa.zzi(zzPn)) {
                        zzQN = com_google_android_gms_internal_zzaes.zze(zzafa.zza(com_google_android_gms_internal_zzafa, zzPn), com_google_android_gms_internal_zzafn.zzRO());
                    } else if (zzPn.zzi(com_google_android_gms_internal_zzafa)) {
                        zzQN = com_google_android_gms_internal_zzaes.zze(zzafa.zzRq(), com_google_android_gms_internal_zzafn.zzRO().zzO(zzafa.zza(zzPn, com_google_android_gms_internal_zzafa)));
                    }
                    com_google_android_gms_internal_zzaes = zzQN;
                } else {
                    if (com_google_android_gms_internal_zzafa.zzi(zzPn)) {
                        zzQN = com_google_android_gms_internal_zzaes.zzb(zzafa.zza(com_google_android_gms_internal_zzafa, zzPn), com_google_android_gms_internal_zzafn.zzRP());
                    } else if (zzPn.zzi(com_google_android_gms_internal_zzafa)) {
                        zzPn = zzafa.zza(zzPn, com_google_android_gms_internal_zzafa);
                        if (zzPn.isEmpty()) {
                            zzQN = com_google_android_gms_internal_zzaes.zzb(zzafa.zzRq(), com_google_android_gms_internal_zzafn.zzRP());
                        } else {
                            zzahu zzf = com_google_android_gms_internal_zzafn.zzRP().zzf(zzPn);
                            if (zzf != null) {
                                zzQN = com_google_android_gms_internal_zzaes.zze(zzafa.zzRq(), zzf);
                            }
                        }
                    }
                    com_google_android_gms_internal_zzaes = zzQN;
                }
            }
            zzQN = com_google_android_gms_internal_zzaes;
            com_google_android_gms_internal_zzaes = zzQN;
        }
        return com_google_android_gms_internal_zzaes;
    }

    private boolean zza(zzafn com_google_android_gms_internal_zzafn, zzafa com_google_android_gms_internal_zzafa) {
        if (com_google_android_gms_internal_zzafn.zzRQ()) {
            return com_google_android_gms_internal_zzafn.zzPn().zzi(com_google_android_gms_internal_zzafa);
        }
        Iterator it = com_google_android_gms_internal_zzafn.zzRP().iterator();
        while (it.hasNext()) {
            if (com_google_android_gms_internal_zzafn.zzPn().zzh((zzafa) ((Entry) it.next()).getKey()).zzi(com_google_android_gms_internal_zzafa)) {
                return true;
            }
        }
        return false;
    }

    public List<zzafn> zzRT() {
        List arrayList = new ArrayList(this.zzbNZ);
        this.zzbNY = zzaes.zzQN();
        this.zzbNZ = new ArrayList();
        return arrayList;
    }

    public zzaht zza(zzafa com_google_android_gms_internal_zzafa, zzahu com_google_android_gms_internal_zzahu, zzaht com_google_android_gms_internal_zzaht, boolean z, zzaho com_google_android_gms_internal_zzaho) {
        zzaht com_google_android_gms_internal_zzaht2 = null;
        zzaes zzg = this.zzbNY.zzg(com_google_android_gms_internal_zzafa);
        zzahu zzf = zzg.zzf(zzafa.zzRq());
        if (zzf == null) {
            if (com_google_android_gms_internal_zzahu != null) {
                zzf = zzg.zzb(com_google_android_gms_internal_zzahu);
            }
            return com_google_android_gms_internal_zzaht2;
        }
        for (zzaht com_google_android_gms_internal_zzaht3 : r0) {
            zzaht com_google_android_gms_internal_zzaht32;
            if (com_google_android_gms_internal_zzaho.zza(com_google_android_gms_internal_zzaht32, com_google_android_gms_internal_zzaht, z) <= 0 || (com_google_android_gms_internal_zzaht2 != null && com_google_android_gms_internal_zzaho.zza(com_google_android_gms_internal_zzaht32, com_google_android_gms_internal_zzaht2, z) >= 0)) {
                com_google_android_gms_internal_zzaht32 = com_google_android_gms_internal_zzaht2;
            }
            com_google_android_gms_internal_zzaht2 = com_google_android_gms_internal_zzaht32;
        }
        return com_google_android_gms_internal_zzaht2;
    }

    public zzahu zza(zzafa com_google_android_gms_internal_zzafa, zzafa com_google_android_gms_internal_zzafa2, zzahu com_google_android_gms_internal_zzahu, zzahu com_google_android_gms_internal_zzahu2) {
        if (!$assertionsDisabled && com_google_android_gms_internal_zzahu == null && com_google_android_gms_internal_zzahu2 == null) {
            throw new AssertionError("Either existingEventSnap or existingServerSnap must exist");
        }
        zzafa zzh = com_google_android_gms_internal_zzafa.zzh(com_google_android_gms_internal_zzafa2);
        if (this.zzbNY.zze(zzh)) {
            return null;
        }
        zzaes zzg = this.zzbNY.zzg(zzh);
        return zzg.isEmpty() ? com_google_android_gms_internal_zzahu2.zzO(com_google_android_gms_internal_zzafa2) : zzg.zzb(com_google_android_gms_internal_zzahu2.zzO(com_google_android_gms_internal_zzafa2));
    }

    public zzahu zza(zzafa com_google_android_gms_internal_zzafa, zzahi com_google_android_gms_internal_zzahi, zzagm com_google_android_gms_internal_zzagm) {
        zzafa zza = com_google_android_gms_internal_zzafa.zza(com_google_android_gms_internal_zzahi);
        zzahu zzf = this.zzbNY.zzf(zza);
        return zzf != null ? zzf : com_google_android_gms_internal_zzagm.zzf(com_google_android_gms_internal_zzahi) ? this.zzbNY.zzg(zza).zzb(com_google_android_gms_internal_zzagm.zzPj().zzm(com_google_android_gms_internal_zzahi)) : null;
    }

    public zzahu zza(final zzafa com_google_android_gms_internal_zzafa, zzahu com_google_android_gms_internal_zzahu, final List<Long> list, final boolean z) {
        zzaes zzg;
        if (!list.isEmpty() || z) {
            zzg = this.zzbNY.zzg(com_google_android_gms_internal_zzafa);
            if (!z && zzg.isEmpty()) {
                return com_google_android_gms_internal_zzahu;
            }
            if (!z && com_google_android_gms_internal_zzahu == null && !zzg.zze(zzafa.zzRq())) {
                return null;
            }
            zzg = zza(this.zzbNZ, new zzagj<zzafn>(this) {
                final /* synthetic */ zzafq d;

                public boolean a(zzafn com_google_android_gms_internal_zzafn) {
                    return (com_google_android_gms_internal_zzafn.isVisible() || z) && !list.contains(Long.valueOf(com_google_android_gms_internal_zzafn.zzRN())) && (com_google_android_gms_internal_zzafn.zzPn().zzi(com_google_android_gms_internal_zzafa) || com_google_android_gms_internal_zzafa.zzi(com_google_android_gms_internal_zzafn.zzPn()));
                }

                public /* synthetic */ boolean zzap(Object obj) {
                    return a((zzafn) obj);
                }
            }, com_google_android_gms_internal_zzafa);
            if (com_google_android_gms_internal_zzahu == null) {
                com_google_android_gms_internal_zzahu = zzahn.zzTA();
            }
            return zzg.zzb(com_google_android_gms_internal_zzahu);
        }
        zzahu zzf = this.zzbNY.zzf(com_google_android_gms_internal_zzafa);
        if (zzf != null) {
            return zzf;
        }
        zzg = this.zzbNY.zzg(com_google_android_gms_internal_zzafa);
        if (zzg.isEmpty()) {
            return com_google_android_gms_internal_zzahu;
        }
        if (com_google_android_gms_internal_zzahu == null && !zzg.zze(zzafa.zzRq())) {
            return null;
        }
        if (com_google_android_gms_internal_zzahu == null) {
            com_google_android_gms_internal_zzahu = zzahn.zzTA();
        }
        return zzg.zzb(com_google_android_gms_internal_zzahu);
    }

    public void zza(zzafa com_google_android_gms_internal_zzafa, zzaes com_google_android_gms_internal_zzaes, Long l) {
        if ($assertionsDisabled || l.longValue() > this.zzbOa.longValue()) {
            this.zzbNZ.add(new zzafn(l.longValue(), com_google_android_gms_internal_zzafa, com_google_android_gms_internal_zzaes));
            this.zzbNY = this.zzbNY.zzb(com_google_android_gms_internal_zzafa, com_google_android_gms_internal_zzaes);
            this.zzbOa = l;
            return;
        }
        throw new AssertionError();
    }

    public void zza(zzafa com_google_android_gms_internal_zzafa, zzahu com_google_android_gms_internal_zzahu, Long l, boolean z) {
        if ($assertionsDisabled || l.longValue() > this.zzbOa.longValue()) {
            this.zzbNZ.add(new zzafn(l.longValue(), com_google_android_gms_internal_zzafa, com_google_android_gms_internal_zzahu, z));
            if (z) {
                this.zzbNY = this.zzbNY.zze(com_google_android_gms_internal_zzafa, com_google_android_gms_internal_zzahu);
            }
            this.zzbOa = l;
            return;
        }
        throw new AssertionError();
    }

    public zzafn zzaE(long j) {
        for (zzafn com_google_android_gms_internal_zzafn : this.zzbNZ) {
            if (com_google_android_gms_internal_zzafn.zzRN() == j) {
                return com_google_android_gms_internal_zzafn;
            }
        }
        return null;
    }

    public boolean zzaF(long j) {
        zzafn com_google_android_gms_internal_zzafn;
        zzafn com_google_android_gms_internal_zzafn2 = null;
        int i = 0;
        for (zzafn com_google_android_gms_internal_zzafn3 : this.zzbNZ) {
            if (com_google_android_gms_internal_zzafn3.zzRN() == j) {
                com_google_android_gms_internal_zzafn2 = com_google_android_gms_internal_zzafn3;
                break;
            }
            i++;
        }
        if ($assertionsDisabled || com_google_android_gms_internal_zzafn2 != null) {
            this.zzbNZ.remove(com_google_android_gms_internal_zzafn2);
            boolean isVisible = com_google_android_gms_internal_zzafn2.isVisible();
            int size = this.zzbNZ.size() - 1;
            boolean z = false;
            while (isVisible && size >= 0) {
                boolean z2;
                com_google_android_gms_internal_zzafn3 = (zzafn) this.zzbNZ.get(size);
                if (com_google_android_gms_internal_zzafn3.isVisible()) {
                    if (size >= i && zza(com_google_android_gms_internal_zzafn3, com_google_android_gms_internal_zzafn2.zzPn())) {
                        z2 = z;
                        z = false;
                        size--;
                        isVisible = z;
                        z = z2;
                    } else if (com_google_android_gms_internal_zzafn2.zzPn().zzi(com_google_android_gms_internal_zzafn3.zzPn())) {
                        z2 = true;
                        z = isVisible;
                        size--;
                        isVisible = z;
                        z = z2;
                    }
                }
                z2 = z;
                z = isVisible;
                size--;
                isVisible = z;
                z = z2;
            }
            if (!isVisible) {
                return false;
            }
            if (z) {
                zzRU();
                return true;
            } else if (com_google_android_gms_internal_zzafn2.zzRQ()) {
                this.zzbNY = this.zzbNY.zzd(com_google_android_gms_internal_zzafn2.zzPn());
                return true;
            } else {
                Iterator it = com_google_android_gms_internal_zzafn2.zzRP().iterator();
                while (it.hasNext()) {
                    this.zzbNY = this.zzbNY.zzd(com_google_android_gms_internal_zzafn2.zzPn().zzh((zzafa) ((Entry) it.next()).getKey()));
                }
                return true;
            }
        }
        throw new AssertionError("removeWrite called with nonexistent writeId");
    }

    public zzahu zzj(zzafa com_google_android_gms_internal_zzafa, zzahu com_google_android_gms_internal_zzahu) {
        zzahn zzTA = zzahn.zzTA();
        zzahu<zzaht> zzf = this.zzbNY.zzf(com_google_android_gms_internal_zzafa);
        zzahu com_google_android_gms_internal_zzahu2;
        if (zzf == null) {
            zzaes zzg = this.zzbNY.zzg(com_google_android_gms_internal_zzafa);
            com_google_android_gms_internal_zzahu2 = zzTA;
            for (zzaht com_google_android_gms_internal_zzaht : com_google_android_gms_internal_zzahu) {
                com_google_android_gms_internal_zzahu2 = com_google_android_gms_internal_zzahu2.zze(com_google_android_gms_internal_zzaht.zzTK(), zzg.zzg(new zzafa(com_google_android_gms_internal_zzaht.zzTK())).zzb(com_google_android_gms_internal_zzaht.zzPj()));
            }
            for (zzaht com_google_android_gms_internal_zzaht2 : zzg.zzQP()) {
                com_google_android_gms_internal_zzahu2 = com_google_android_gms_internal_zzahu2.zze(com_google_android_gms_internal_zzaht2.zzTK(), com_google_android_gms_internal_zzaht2.zzPj());
            }
            return com_google_android_gms_internal_zzahu2;
        } else if (zzf.zzTo()) {
            return zzTA;
        } else {
            com_google_android_gms_internal_zzahu2 = zzTA;
            for (zzaht com_google_android_gms_internal_zzaht22 : zzf) {
                com_google_android_gms_internal_zzahu2 = com_google_android_gms_internal_zzahu2.zze(com_google_android_gms_internal_zzaht22.zzTK(), com_google_android_gms_internal_zzaht22.zzPj());
            }
            return com_google_android_gms_internal_zzahu2;
        }
    }

    public zzafr zzu(zzafa com_google_android_gms_internal_zzafa) {
        return new zzafr(com_google_android_gms_internal_zzafa, this);
    }

    public zzahu zzv(zzafa com_google_android_gms_internal_zzafa) {
        return this.zzbNY.zzf(com_google_android_gms_internal_zzafa);
    }
}
