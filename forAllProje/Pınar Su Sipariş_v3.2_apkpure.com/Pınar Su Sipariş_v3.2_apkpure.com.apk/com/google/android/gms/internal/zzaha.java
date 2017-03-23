package com.google.android.gms.internal;

import com.google.android.gms.internal.zzahb.zza;
import java.util.Iterator;

public class zzaha implements zzahb {
    static final /* synthetic */ boolean $assertionsDisabled = (!zzaha.class.desiredAssertionStatus());
    private final zzaho zzbPG;
    private final zzahc zzbQk;
    private final int zzbQl;
    private final boolean zzbQm;

    public zzaha(zzagt com_google_android_gms_internal_zzagt) {
        this.zzbQk = new zzahc(com_google_android_gms_internal_zzagt);
        this.zzbPG = com_google_android_gms_internal_zzagt.zzSK();
        this.zzbQl = com_google_android_gms_internal_zzagt.getLimit();
        this.zzbQm = !com_google_android_gms_internal_zzagt.zzSM();
    }

    private zzahp zza(zzahp com_google_android_gms_internal_zzahp, zzahi com_google_android_gms_internal_zzahi, zzahu com_google_android_gms_internal_zzahu, zza com_google_android_gms_internal_zzahb_zza, zzagy com_google_android_gms_internal_zzagy) {
        if ($assertionsDisabled || com_google_android_gms_internal_zzahp.zzPj().getChildCount() == this.zzbQl) {
            zzaht com_google_android_gms_internal_zzaht = new zzaht(com_google_android_gms_internal_zzahi, com_google_android_gms_internal_zzahu);
            zzaht zzTF = this.zzbQm ? com_google_android_gms_internal_zzahp.zzTF() : com_google_android_gms_internal_zzahp.zzTG();
            boolean zza = this.zzbQk.zza(com_google_android_gms_internal_zzaht);
            if (com_google_android_gms_internal_zzahp.zzPj().zzk(com_google_android_gms_internal_zzahi)) {
                zzahu zzm = com_google_android_gms_internal_zzahp.zzPj().zzm(com_google_android_gms_internal_zzahi);
                zzaht zza2 = com_google_android_gms_internal_zzahb_zza.zza(this.zzbPG, zzTF, this.zzbQm);
                while (zza2 != null && (zza2.zzTK().equals(com_google_android_gms_internal_zzahi) || com_google_android_gms_internal_zzahp.zzPj().zzk(zza2.zzTK()))) {
                    zza2 = com_google_android_gms_internal_zzahb_zza.zza(this.zzbPG, zza2, this.zzbQm);
                }
                Object obj = (!zza || com_google_android_gms_internal_zzahu.isEmpty() || (zza2 == null ? 1 : this.zzbPG.zza(zza2, com_google_android_gms_internal_zzaht, this.zzbQm)) < 0) ? null : 1;
                if (obj != null) {
                    if (com_google_android_gms_internal_zzagy != null) {
                        com_google_android_gms_internal_zzagy.zza(zzago.zza(com_google_android_gms_internal_zzahi, com_google_android_gms_internal_zzahu, zzm));
                    }
                    return com_google_android_gms_internal_zzahp.zzh(com_google_android_gms_internal_zzahi, com_google_android_gms_internal_zzahu);
                }
                if (com_google_android_gms_internal_zzagy != null) {
                    com_google_android_gms_internal_zzagy.zza(zzago.zzd(com_google_android_gms_internal_zzahi, zzm));
                }
                com_google_android_gms_internal_zzahp = com_google_android_gms_internal_zzahp.zzh(com_google_android_gms_internal_zzahi, zzahn.zzTA());
                obj = (zza2 == null || !this.zzbQk.zza(zza2)) ? null : 1;
                if (obj == null) {
                    return com_google_android_gms_internal_zzahp;
                }
                if (com_google_android_gms_internal_zzagy != null) {
                    com_google_android_gms_internal_zzagy.zza(zzago.zzc(zza2.zzTK(), zza2.zzPj()));
                }
                return com_google_android_gms_internal_zzahp.zzh(zza2.zzTK(), zza2.zzPj());
            } else if (com_google_android_gms_internal_zzahu.isEmpty() || !zza || this.zzbPG.zza(zzTF, com_google_android_gms_internal_zzaht, this.zzbQm) < 0) {
                return com_google_android_gms_internal_zzahp;
            } else {
                if (com_google_android_gms_internal_zzagy != null) {
                    com_google_android_gms_internal_zzagy.zza(zzago.zzd(zzTF.zzTK(), zzTF.zzPj()));
                    com_google_android_gms_internal_zzagy.zza(zzago.zzc(com_google_android_gms_internal_zzahi, com_google_android_gms_internal_zzahu));
                }
                return com_google_android_gms_internal_zzahp.zzh(com_google_android_gms_internal_zzahi, com_google_android_gms_internal_zzahu).zzh(zzTF.zzTK(), zzahn.zzTA());
            }
        }
        throw new AssertionError();
    }

    public zzaho zzSK() {
        return this.zzbPG;
    }

    public zzahb zzTa() {
        return this.zzbQk.zzTa();
    }

    public boolean zzTb() {
        return true;
    }

    public zzahp zza(zzahp com_google_android_gms_internal_zzahp, zzahi com_google_android_gms_internal_zzahi, zzahu com_google_android_gms_internal_zzahu, zzafa com_google_android_gms_internal_zzafa, zza com_google_android_gms_internal_zzahb_zza, zzagy com_google_android_gms_internal_zzagy) {
        zzahu zzTA = !this.zzbQk.zza(new zzaht(com_google_android_gms_internal_zzahi, com_google_android_gms_internal_zzahu)) ? zzahn.zzTA() : com_google_android_gms_internal_zzahu;
        return com_google_android_gms_internal_zzahp.zzPj().zzm(com_google_android_gms_internal_zzahi).equals(zzTA) ? com_google_android_gms_internal_zzahp : com_google_android_gms_internal_zzahp.zzPj().getChildCount() < this.zzbQl ? this.zzbQk.zzTa().zza(com_google_android_gms_internal_zzahp, com_google_android_gms_internal_zzahi, zzTA, com_google_android_gms_internal_zzafa, com_google_android_gms_internal_zzahb_zza, com_google_android_gms_internal_zzagy) : zza(com_google_android_gms_internal_zzahp, com_google_android_gms_internal_zzahi, zzTA, com_google_android_gms_internal_zzahb_zza, com_google_android_gms_internal_zzagy);
    }

    public zzahp zza(zzahp com_google_android_gms_internal_zzahp, zzahp com_google_android_gms_internal_zzahp2, zzagy com_google_android_gms_internal_zzagy) {
        zzahp zza;
        if (com_google_android_gms_internal_zzahp2.zzPj().zzTo() || com_google_android_gms_internal_zzahp2.zzPj().isEmpty()) {
            zza = zzahp.zza(zzahn.zzTA(), this.zzbPG);
        } else {
            Object zzTc;
            Iterator it;
            int i;
            zzahp zzn = com_google_android_gms_internal_zzahp2.zzn(zzahy.zzTM());
            if (this.zzbQm) {
                Iterator zzPw = com_google_android_gms_internal_zzahp2.zzPw();
                Object zzTd = this.zzbQk.zzTd();
                zzTc = this.zzbQk.zzTc();
                it = zzPw;
                i = -1;
            } else {
                Iterator it2 = com_google_android_gms_internal_zzahp2.iterator();
                zzaht zzTc2 = this.zzbQk.zzTc();
                zzaht zzTd2 = this.zzbQk.zzTd();
                zzaht com_google_android_gms_internal_zzaht = zzTc2;
                i = 1;
                it = it2;
            }
            int i2 = 0;
            zza = zzn;
            Object obj = null;
            while (it.hasNext()) {
                int i3;
                zzahp com_google_android_gms_internal_zzahp3;
                zzaht com_google_android_gms_internal_zzaht2 = (zzaht) it.next();
                if (obj == null && this.zzbPG.compare(r5, com_google_android_gms_internal_zzaht2) * i <= 0) {
                    obj = 1;
                }
                Object obj2 = (obj == null || i2 >= this.zzbQl || this.zzbPG.compare(com_google_android_gms_internal_zzaht2, zzTc) * i > 0) ? null : 1;
                if (obj2 != null) {
                    i3 = i2 + 1;
                    com_google_android_gms_internal_zzahp3 = zza;
                } else {
                    zza = zza.zzh(com_google_android_gms_internal_zzaht2.zzTK(), zzahn.zzTA());
                    i3 = i2;
                    com_google_android_gms_internal_zzahp3 = zza;
                }
                zza = com_google_android_gms_internal_zzahp3;
                i2 = i3;
            }
        }
        return this.zzbQk.zzTa().zza(com_google_android_gms_internal_zzahp, zza, com_google_android_gms_internal_zzagy);
    }

    public zzahp zza(zzahp com_google_android_gms_internal_zzahp, zzahu com_google_android_gms_internal_zzahu) {
        return com_google_android_gms_internal_zzahp;
    }
}
