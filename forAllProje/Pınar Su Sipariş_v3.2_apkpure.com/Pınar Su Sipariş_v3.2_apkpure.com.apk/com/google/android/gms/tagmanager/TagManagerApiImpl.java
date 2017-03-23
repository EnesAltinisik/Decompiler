package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzun;
import com.google.android.gms.internal.zzur;
import com.google.android.gms.internal.zzvb;
import com.google.android.gms.tagmanager.zzbb.zza;

@DynamiteApi
public class TagManagerApiImpl extends zza {
    private zzvb zzbrB;

    public void initialize(zzd com_google_android_gms_dynamic_zzd, zzba com_google_android_gms_tagmanager_zzba, zzax com_google_android_gms_tagmanager_zzax) throws RemoteException {
        this.zzbrB = zzvb.zza((Context) zze.zzx(com_google_android_gms_dynamic_zzd), com_google_android_gms_tagmanager_zzba, com_google_android_gms_tagmanager_zzax);
        this.zzbrB.initialize();
    }

    @Deprecated
    public void preview(Intent intent, zzd com_google_android_gms_dynamic_zzd) {
        zzun.zzaW("Deprecated. Please use previewIntent instead.");
    }

    public void previewIntent(Intent intent, zzd com_google_android_gms_dynamic_zzd, zzd com_google_android_gms_dynamic_zzd2, zzba com_google_android_gms_tagmanager_zzba, zzax com_google_android_gms_tagmanager_zzax) {
        Context context = (Context) zze.zzx(com_google_android_gms_dynamic_zzd);
        Context context2 = (Context) zze.zzx(com_google_android_gms_dynamic_zzd2);
        this.zzbrB = zzvb.zza(context, com_google_android_gms_tagmanager_zzba, com_google_android_gms_tagmanager_zzax);
        new zzur(intent, context, context2, this.zzbrB).zzLh();
    }
}
