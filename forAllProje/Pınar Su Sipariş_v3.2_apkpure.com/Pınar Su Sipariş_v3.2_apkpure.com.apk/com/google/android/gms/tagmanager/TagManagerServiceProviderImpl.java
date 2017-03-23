package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzum;
import com.google.android.gms.internal.zzvc;
import com.google.android.gms.tagmanager.zzbc.zza;

@DynamiteApi
public class TagManagerServiceProviderImpl extends zza {
    private static volatile zzvc zzbrC;

    public zzum getService(zzd com_google_android_gms_dynamic_zzd, zzba com_google_android_gms_tagmanager_zzba, zzax com_google_android_gms_tagmanager_zzax) throws RemoteException {
        zzum com_google_android_gms_internal_zzum = zzbrC;
        if (com_google_android_gms_internal_zzum == null) {
            synchronized (TagManagerServiceProviderImpl.class) {
                com_google_android_gms_internal_zzum = zzbrC;
                if (com_google_android_gms_internal_zzum == null) {
                    zzvc com_google_android_gms_internal_zzvc = new zzvc((Context) zze.zzx(com_google_android_gms_dynamic_zzd), com_google_android_gms_tagmanager_zzba, com_google_android_gms_tagmanager_zzax);
                    zzbrC = com_google_android_gms_internal_zzvc;
                    com_google_android_gms_internal_zzum = com_google_android_gms_internal_zzvc;
                }
            }
        }
        return com_google_android_gms_internal_zzum;
    }
}
