package com.google.android.gms.internal;

import com.google.android.gms.internal.zzahb.zza;

public class zzagz implements zzahb {
    static final /* synthetic */ boolean $assertionsDisabled = (!zzagz.class.desiredAssertionStatus());
    private final zzaho zzbPG;

    public zzagz(zzaho com_google_android_gms_internal_zzaho) {
        this.zzbPG = com_google_android_gms_internal_zzaho;
    }

    public zzaho zzSK() {
        return this.zzbPG;
    }

    public zzahb zzTa() {
        return this;
    }

    public boolean zzTb() {
        return false;
    }

    public zzahp zza(zzahp com_google_android_gms_internal_zzahp, zzahi com_google_android_gms_internal_zzahi, zzahu com_google_android_gms_internal_zzahu, zzafa com_google_android_gms_internal_zzafa, zza com_google_android_gms_internal_zzahb_zza, zzagy com_google_android_gms_internal_zzagy) {
        if ($assertionsDisabled || com_google_android_gms_internal_zzahp.zzb(this.zzbPG)) {
            zzahu zzPj = com_google_android_gms_internal_zzahp.zzPj();
            zzahu zzm = zzPj.zzm(com_google_android_gms_internal_zzahi);
            if (zzm.zzO(com_google_android_gms_internal_zzafa).equals(com_google_android_gms_internal_zzahu.zzO(com_google_android_gms_internal_zzafa)) && zzm.isEmpty() == com_google_android_gms_internal_zzahu.isEmpty()) {
                return com_google_android_gms_internal_zzahp;
            }
            if (com_google_android_gms_internal_zzagy != null) {
                if (com_google_android_gms_internal_zzahu.isEmpty()) {
                    if (zzPj.zzk(com_google_android_gms_internal_zzahi)) {
                        com_google_android_gms_internal_zzagy.zza(zzago.zzd(com_google_android_gms_internal_zzahi, zzm));
                    } else if (!($assertionsDisabled || zzPj.zzTo())) {
                        throw new AssertionError("A child remove without an old child only makes sense on a leaf node");
                    }
                } else if (zzm.isEmpty()) {
                    com_google_android_gms_internal_zzagy.zza(zzago.zzc(com_google_android_gms_internal_zzahi, com_google_android_gms_internal_zzahu));
                } else {
                    com_google_android_gms_internal_zzagy.zza(zzago.zza(com_google_android_gms_internal_zzahi, com_google_android_gms_internal_zzahu, zzm));
                }
            }
            return (zzPj.zzTo() && com_google_android_gms_internal_zzahu.isEmpty()) ? com_google_android_gms_internal_zzahp : com_google_android_gms_internal_zzahp.zzh(com_google_android_gms_internal_zzahi, com_google_android_gms_internal_zzahu);
        } else {
            throw new AssertionError("The index must match the filter");
        }
    }

    public zzahp zza(zzahp com_google_android_gms_internal_zzahp, zzahp com_google_android_gms_internal_zzahp2, zzagy com_google_android_gms_internal_zzagy) {
        if ($assertionsDisabled || com_google_android_gms_internal_zzahp2.zzb(this.zzbPG)) {
            if (com_google_android_gms_internal_zzagy != null) {
                for (zzaht com_google_android_gms_internal_zzaht : com_google_android_gms_internal_zzahp.zzPj()) {
                    if (!com_google_android_gms_internal_zzahp2.zzPj().zzk(com_google_android_gms_internal_zzaht.zzTK())) {
                        com_google_android_gms_internal_zzagy.zza(zzago.zzd(com_google_android_gms_internal_zzaht.zzTK(), com_google_android_gms_internal_zzaht.zzPj()));
                    }
                }
                if (!com_google_android_gms_internal_zzahp2.zzPj().zzTo()) {
                    for (zzaht com_google_android_gms_internal_zzaht2 : com_google_android_gms_internal_zzahp2.zzPj()) {
                        if (com_google_android_gms_internal_zzahp.zzPj().zzk(com_google_android_gms_internal_zzaht2.zzTK())) {
                            zzahu zzm = com_google_android_gms_internal_zzahp.zzPj().zzm(com_google_android_gms_internal_zzaht2.zzTK());
                            if (!zzm.equals(com_google_android_gms_internal_zzaht2.zzPj())) {
                                com_google_android_gms_internal_zzagy.zza(zzago.zza(com_google_android_gms_internal_zzaht2.zzTK(), com_google_android_gms_internal_zzaht2.zzPj(), zzm));
                            }
                        } else {
                            com_google_android_gms_internal_zzagy.zza(zzago.zzc(com_google_android_gms_internal_zzaht2.zzTK(), com_google_android_gms_internal_zzaht2.zzPj()));
                        }
                    }
                }
            }
            return com_google_android_gms_internal_zzahp2;
        }
        throw new AssertionError("Can't use IndexedNode that doesn't have filter's index");
    }

    public zzahp zza(zzahp com_google_android_gms_internal_zzahp, zzahu com_google_android_gms_internal_zzahu) {
        return com_google_android_gms_internal_zzahp.zzPj().isEmpty() ? com_google_android_gms_internal_zzahp : com_google_android_gms_internal_zzahp.zzn(com_google_android_gms_internal_zzahu);
    }
}
