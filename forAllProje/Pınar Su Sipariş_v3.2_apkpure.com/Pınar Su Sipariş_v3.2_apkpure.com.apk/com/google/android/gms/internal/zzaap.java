package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.util.zze;
import com.google.android.gms.common.util.zzh;
import com.google.android.gms.internal.zzaau.zza;

public abstract class zzaap {
    protected zzaat zzbuM;
    protected zzaar zzbuN;
    protected zze zzsd;
    private int zzwP;

    public zzaap(int i, zzaat com_google_android_gms_internal_zzaat, zzaar com_google_android_gms_internal_zzaar) {
        this(i, com_google_android_gms_internal_zzaat, com_google_android_gms_internal_zzaar, zzh.zzuW());
    }

    public zzaap(int i, zzaat com_google_android_gms_internal_zzaat, zzaar com_google_android_gms_internal_zzaar, zze com_google_android_gms_common_util_zze) {
        zzaa.zzz(com_google_android_gms_internal_zzaat.zzLN());
        this.zzwP = i;
        this.zzbuM = com_google_android_gms_internal_zzaat;
        this.zzbuN = com_google_android_gms_internal_zzaar;
        this.zzsd = com_google_android_gms_common_util_zze;
    }

    public void onFailure(int i) {
        String valueOf = String.valueOf(this.zzbuM.zzLN().getContainerId());
        String valueOf2 = String.valueOf(zzkX(i));
        zzun.v(new StringBuilder((String.valueOf(valueOf).length() + 61) + String.valueOf(valueOf2).length()).append("Failed to fetch the container resource for the container \"").append(valueOf).append("\": ").append(valueOf2).toString());
        zza(new zzaau(Status.zzaly, 0));
    }

    public void zzA(byte[] bArr) {
        zzaau com_google_android_gms_internal_zzaau;
        zzaau zzB = zzB(bArr);
        if (zzB == null || zzB.getStatus() != Status.zzalw) {
            com_google_android_gms_internal_zzaau = new zzaau(Status.zzaly, this.zzwP);
        } else {
            zzabc zzLT = zzB.zzLO().zzLT();
            com_google_android_gms_internal_zzaau = new zzaau(Status.zzalw, this.zzwP, new zza(this.zzbuM.zzLN(), bArr, zzLT, this.zzsd.currentTimeMillis()), zzB.zzLP());
        }
        zza(com_google_android_gms_internal_zzaau);
    }

    protected zzaau zzB(byte[] bArr) {
        zzaau com_google_android_gms_internal_zzaau = null;
        try {
            com_google_android_gms_internal_zzaau = this.zzbuN.zzC(bArr);
            if (com_google_android_gms_internal_zzaau == null) {
                zzun.zzaV("Parsed resource from is null");
            }
        } catch (zzaan e) {
            zzun.zzaV("Resource data is corrupted");
        }
        return com_google_android_gms_internal_zzaau;
    }

    protected abstract void zza(zzaau com_google_android_gms_internal_zzaau);

    public String zzkX(int i) {
        switch (i) {
            case 0:
                return "Resource not available";
            case 1:
                return "IOError";
            case 2:
                return "Server error";
            default:
                return "Unknown reason";
        }
    }
}
