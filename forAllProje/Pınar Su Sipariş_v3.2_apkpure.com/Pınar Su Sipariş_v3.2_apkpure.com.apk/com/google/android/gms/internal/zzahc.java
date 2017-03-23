package com.google.android.gms.internal;

import com.google.android.gms.internal.zzahb.zza;
import java.util.Iterator;

public class zzahc implements zzahb {
    private final zzaho zzbPG;
    private final zzagz zzbQn;
    private final zzaht zzbQo;
    private final zzaht zzbQp;

    public zzahc(zzagt com_google_android_gms_internal_zzagt) {
        this.zzbQn = new zzagz(com_google_android_gms_internal_zzagt.zzSK());
        this.zzbPG = com_google_android_gms_internal_zzagt.zzSK();
        this.zzbQo = zzd(com_google_android_gms_internal_zzagt);
        this.zzbQp = zze(com_google_android_gms_internal_zzagt);
    }

    private static zzaht zzd(zzagt com_google_android_gms_internal_zzagt) {
        if (!com_google_android_gms_internal_zzagt.zzSC()) {
            return com_google_android_gms_internal_zzagt.zzSK().zzTB();
        }
        return com_google_android_gms_internal_zzagt.zzSK().zzg(com_google_android_gms_internal_zzagt.zzSE(), com_google_android_gms_internal_zzagt.zzSD());
    }

    private static zzaht zze(zzagt com_google_android_gms_internal_zzagt) {
        if (!com_google_android_gms_internal_zzagt.zzSF()) {
            return com_google_android_gms_internal_zzagt.zzSK().zzTC();
        }
        return com_google_android_gms_internal_zzagt.zzSK().zzg(com_google_android_gms_internal_zzagt.zzSH(), com_google_android_gms_internal_zzagt.zzSG());
    }

    public zzaho zzSK() {
        return this.zzbPG;
    }

    public zzahb zzTa() {
        return this.zzbQn;
    }

    public boolean zzTb() {
        return true;
    }

    public zzaht zzTc() {
        return this.zzbQo;
    }

    public zzaht zzTd() {
        return this.zzbQp;
    }

    public zzahp zza(zzahp com_google_android_gms_internal_zzahp, zzahi com_google_android_gms_internal_zzahi, zzahu com_google_android_gms_internal_zzahu, zzafa com_google_android_gms_internal_zzafa, zza com_google_android_gms_internal_zzahb_zza, zzagy com_google_android_gms_internal_zzagy) {
        return this.zzbQn.zza(com_google_android_gms_internal_zzahp, com_google_android_gms_internal_zzahi, !zza(new zzaht(com_google_android_gms_internal_zzahi, com_google_android_gms_internal_zzahu)) ? zzahn.zzTA() : com_google_android_gms_internal_zzahu, com_google_android_gms_internal_zzafa, com_google_android_gms_internal_zzahb_zza, com_google_android_gms_internal_zzagy);
    }

    public zzahp zza(zzahp com_google_android_gms_internal_zzahp, zzahp com_google_android_gms_internal_zzahp2, zzagy com_google_android_gms_internal_zzagy) {
        zzahp zza;
        if (com_google_android_gms_internal_zzahp2.zzPj().zzTo()) {
            zza = zzahp.zza(zzahn.zzTA(), this.zzbPG);
        } else {
            zzahp zzn = com_google_android_gms_internal_zzahp2.zzn(zzahy.zzTM());
            Iterator it = com_google_android_gms_internal_zzahp2.iterator();
            zza = zzn;
            while (it.hasNext()) {
                zzaht com_google_android_gms_internal_zzaht = (zzaht) it.next();
                zza = !zza(com_google_android_gms_internal_zzaht) ? zza.zzh(com_google_android_gms_internal_zzaht.zzTK(), zzahn.zzTA()) : zza;
            }
        }
        return this.zzbQn.zza(com_google_android_gms_internal_zzahp, zza, com_google_android_gms_internal_zzagy);
    }

    public zzahp zza(zzahp com_google_android_gms_internal_zzahp, zzahu com_google_android_gms_internal_zzahu) {
        return com_google_android_gms_internal_zzahp;
    }

    public boolean zza(zzaht com_google_android_gms_internal_zzaht) {
        return this.zzbPG.compare(zzTc(), com_google_android_gms_internal_zzaht) <= 0 && this.zzbPG.compare(com_google_android_gms_internal_zzaht, zzTd()) <= 0;
    }
}
