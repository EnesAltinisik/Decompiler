package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class zzahp implements Iterable<zzaht> {
    private static final zzadu<zzaht> zzbQW = new zzadu(Collections.emptyList(), null);
    private final zzaho zzbPG;
    private final zzahu zzbQX;
    private zzadu<zzaht> zzbQY;

    private zzahp(zzahu com_google_android_gms_internal_zzahu, zzaho com_google_android_gms_internal_zzaho) {
        this.zzbPG = com_google_android_gms_internal_zzaho;
        this.zzbQX = com_google_android_gms_internal_zzahu;
        this.zzbQY = null;
    }

    private zzahp(zzahu com_google_android_gms_internal_zzahu, zzaho com_google_android_gms_internal_zzaho, zzadu<zzaht> com_google_android_gms_internal_zzadu_com_google_android_gms_internal_zzaht) {
        this.zzbPG = com_google_android_gms_internal_zzaho;
        this.zzbQX = com_google_android_gms_internal_zzahu;
        this.zzbQY = com_google_android_gms_internal_zzadu_com_google_android_gms_internal_zzaht;
    }

    private void zzTE() {
        if (this.zzbQY != null) {
            return;
        }
        if (this.zzbPG.equals(zzahq.zzTH())) {
            this.zzbQY = zzbQW;
            return;
        }
        List arrayList = new ArrayList();
        Object obj = null;
        for (zzaht com_google_android_gms_internal_zzaht : this.zzbQX) {
            obj = (obj != null || this.zzbPG.zzl(com_google_android_gms_internal_zzaht.zzPj())) ? 1 : null;
            arrayList.add(new zzaht(com_google_android_gms_internal_zzaht.zzTK(), com_google_android_gms_internal_zzaht.zzPj()));
        }
        if (obj != null) {
            this.zzbQY = new zzadu(arrayList, this.zzbPG);
        } else {
            this.zzbQY = zzbQW;
        }
    }

    public static zzahp zza(zzahu com_google_android_gms_internal_zzahu, zzaho com_google_android_gms_internal_zzaho) {
        return new zzahp(com_google_android_gms_internal_zzahu, com_google_android_gms_internal_zzaho);
    }

    public static zzahp zzm(zzahu com_google_android_gms_internal_zzahu) {
        return new zzahp(com_google_android_gms_internal_zzahu, zzahx.zzTL());
    }

    public Iterator<zzaht> iterator() {
        zzTE();
        return this.zzbQY == zzbQW ? this.zzbQX.iterator() : this.zzbQY.iterator();
    }

    public zzahu zzPj() {
        return this.zzbQX;
    }

    public Iterator<zzaht> zzPw() {
        zzTE();
        return this.zzbQY == zzbQW ? this.zzbQX.zzPw() : this.zzbQY.zzPw();
    }

    public zzaht zzTF() {
        if (!(this.zzbQX instanceof zzahj)) {
            return null;
        }
        zzTE();
        if (this.zzbQY != zzbQW) {
            return (zzaht) this.zzbQY.zzPz();
        }
        zzahi zzTq = ((zzahj) this.zzbQX).zzTq();
        return new zzaht(zzTq, this.zzbQX.zzm(zzTq));
    }

    public zzaht zzTG() {
        if (!(this.zzbQX instanceof zzahj)) {
            return null;
        }
        zzTE();
        if (this.zzbQY != zzbQW) {
            return (zzaht) this.zzbQY.zzPA();
        }
        zzahi zzTr = ((zzahj) this.zzbQX).zzTr();
        return new zzaht(zzTr, this.zzbQX.zzm(zzTr));
    }

    public zzahi zza(zzahi com_google_android_gms_internal_zzahi, zzahu com_google_android_gms_internal_zzahu, zzaho com_google_android_gms_internal_zzaho) {
        if (this.zzbPG.equals(zzahq.zzTH()) || this.zzbPG.equals(com_google_android_gms_internal_zzaho)) {
            zzTE();
            if (this.zzbQY == zzbQW) {
                return this.zzbQX.zzl(com_google_android_gms_internal_zzahi);
            }
            zzaht com_google_android_gms_internal_zzaht = (zzaht) this.zzbQY.zzak(new zzaht(com_google_android_gms_internal_zzahi, com_google_android_gms_internal_zzahu));
            return com_google_android_gms_internal_zzaht != null ? com_google_android_gms_internal_zzaht.zzTK() : null;
        } else {
            throw new IllegalArgumentException("Index not available in IndexedNode!");
        }
    }

    public boolean zzb(zzaho com_google_android_gms_internal_zzaho) {
        return this.zzbPG.equals(com_google_android_gms_internal_zzaho);
    }

    public zzahp zzh(zzahi com_google_android_gms_internal_zzahi, zzahu com_google_android_gms_internal_zzahu) {
        zzahu zze = this.zzbQX.zze(com_google_android_gms_internal_zzahi, com_google_android_gms_internal_zzahu);
        if (this.zzbQY == zzbQW && !this.zzbPG.zzl(com_google_android_gms_internal_zzahu)) {
            return new zzahp(zze, this.zzbPG, zzbQW);
        }
        if (this.zzbQY == null || this.zzbQY == zzbQW) {
            return new zzahp(zze, this.zzbPG, null);
        }
        zzadu zzai = this.zzbQY.zzai(new zzaht(com_google_android_gms_internal_zzahi, this.zzbQX.zzm(com_google_android_gms_internal_zzahi)));
        if (!com_google_android_gms_internal_zzahu.isEmpty()) {
            zzai = zzai.zzaj(new zzaht(com_google_android_gms_internal_zzahi, com_google_android_gms_internal_zzahu));
        }
        return new zzahp(zze, this.zzbPG, zzai);
    }

    public zzahp zzn(zzahu com_google_android_gms_internal_zzahu) {
        return new zzahp(this.zzbQX.zzf(com_google_android_gms_internal_zzahu), this.zzbPG, this.zzbQY);
    }
}
