package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zzuu.zzc;
import com.google.android.gms.tagmanager.zzba;
import java.util.Map;

public class zzaaj extends zzvj {
    private final zzc zzbtj;
    private final zzba zzbuE;

    public zzaaj(zzba com_google_android_gms_tagmanager_zzba, zzc com_google_android_gms_internal_zzuu_zzc) {
        this.zzbuE = com_google_android_gms_tagmanager_zzba;
        this.zzbtj = com_google_android_gms_internal_zzuu_zzc;
    }

    protected zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        boolean z = true;
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        boolean z2 = com_google_android_gms_internal_zzabh_Arr.length == 1 || com_google_android_gms_internal_zzabh_Arr.length == 2;
        zzaa.zzaj(z2);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr[0] instanceof zzabp);
        zzabl com_google_android_gms_internal_zzabl = com_google_android_gms_internal_zzabh_Arr.length > 1 ? com_google_android_gms_internal_zzabh_Arr[1] : zzabl.zzbvN;
        if (!(com_google_android_gms_internal_zzabl == zzabl.zzbvN || (com_google_android_gms_internal_zzabl instanceof zzabn))) {
            z = false;
        }
        zzaa.zzaj(z);
        zzud zzLr = this.zzbtj.zzLr();
        String str = (String) ((zzabp) com_google_android_gms_internal_zzabh_Arr[0]).zzMk();
        Bundle bundle = null;
        if (com_google_android_gms_internal_zzabl != zzabl.zzbvN) {
            bundle = zzabq.zzao((Map) ((zzabn) com_google_android_gms_internal_zzabl).zzMk());
        }
        try {
            this.zzbuE.zza(zzLr.zzKW(), str, bundle, zzLr.currentTimeMillis());
        } catch (RemoteException e) {
            String str2 = "Error calling measurement proxy:";
            String valueOf = String.valueOf(e.getMessage());
            zzun.e(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
        return zzabl.zzbvN;
    }
}
