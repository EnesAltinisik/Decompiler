package com.google.android.gms.internal;

import java.io.IOException;

public abstract class zzamd<M extends zzamd<M>> extends zzamj {
    protected zzamf zzcaa;

    public M clone() throws CloneNotSupportedException {
        zzamd com_google_android_gms_internal_zzamd = (zzamd) super.clone();
        zzamh.zza(this, com_google_android_gms_internal_zzamd);
        return com_google_android_gms_internal_zzamd;
    }

    public final <T> T getExtension(zzame<M, T> com_google_android_gms_internal_zzame_M__T) {
        if (this.zzcaa == null) {
            return null;
        }
        p zzok = this.zzcaa.zzok(zzamm.zzoo(com_google_android_gms_internal_zzame_M__T.tag));
        return zzok != null ? zzok.a((zzame) com_google_android_gms_internal_zzame_M__T) : null;
    }

    public final zzamf getUnknownFieldArray() {
        return this.zzcaa;
    }

    public final boolean hasExtension(zzame<M, ?> com_google_android_gms_internal_zzame_M__) {
        return (this.zzcaa == null || this.zzcaa.zzok(zzamm.zzoo(com_google_android_gms_internal_zzame_M__.tag)) == null) ? false : true;
    }

    public final <T> M setExtension(zzame<M, T> com_google_android_gms_internal_zzame_M__T, T t) {
        p pVar = null;
        int zzoo = zzamm.zzoo(com_google_android_gms_internal_zzame_M__T.tag);
        if (t != null) {
            if (this.zzcaa == null) {
                this.zzcaa = new zzamf();
            } else {
                pVar = this.zzcaa.zzok(zzoo);
            }
            if (pVar == null) {
                this.zzcaa.zza(zzoo, new p(com_google_android_gms_internal_zzame_M__T, t));
            } else {
                pVar.a(com_google_android_gms_internal_zzame_M__T, t);
            }
        } else if (this.zzcaa != null) {
            this.zzcaa.remove(zzoo);
            if (this.zzcaa.isEmpty()) {
                this.zzcaa = null;
            }
        }
        return this;
    }

    public void writeTo(zzamc com_google_android_gms_internal_zzamc) throws IOException {
        if (this.zzcaa != null) {
            for (int i = 0; i < this.zzcaa.size(); i++) {
                this.zzcaa.zzol(i).a(com_google_android_gms_internal_zzamc);
            }
        }
    }

    protected final boolean zza(zzamb com_google_android_gms_internal_zzamb, int i) throws IOException {
        int position = com_google_android_gms_internal_zzamb.getPosition();
        if (!com_google_android_gms_internal_zzamb.zznU(i)) {
            return false;
        }
        int zzoo = zzamm.zzoo(i);
        q qVar = new q(i, com_google_android_gms_internal_zzamb.zzD(position, com_google_android_gms_internal_zzamb.getPosition() - position));
        p pVar = null;
        if (this.zzcaa == null) {
            this.zzcaa = new zzamf();
        } else {
            pVar = this.zzcaa.zzok(zzoo);
        }
        if (pVar == null) {
            pVar = new p();
            this.zzcaa.zza(zzoo, pVar);
        }
        pVar.a(qVar);
        return true;
    }

    protected int zzy() {
        int i = 0;
        if (this.zzcaa == null) {
            return 0;
        }
        int i2 = 0;
        while (i < this.zzcaa.size()) {
            i2 += this.zzcaa.zzol(i).a();
            i++;
        }
        return i2;
    }
}
