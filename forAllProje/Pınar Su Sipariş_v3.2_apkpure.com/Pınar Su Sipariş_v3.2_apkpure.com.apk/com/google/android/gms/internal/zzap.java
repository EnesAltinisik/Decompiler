package com.google.android.gms.internal;

import android.content.Context;
import com.google.ads.afma.nano.Google3NanoAfmaSignals.AFMASignals;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class zzap extends zzao {
    private static final String TAG = zzap.class.getSimpleName();

    protected zzap(Context context, String str, boolean z) {
        super(context, str, z);
    }

    public static zzap zza(String str, Context context, boolean z) {
        zzao.zza(context, z);
        return new zzap(context, str, z);
    }

    protected List<Callable<Void>> zzb(zzav com_google_android_gms_internal_zzav, AFMASignals aFMASignals) {
        if (com_google_android_gms_internal_zzav.zzaD() == null || !this.zzod) {
            return super.zzb(com_google_android_gms_internal_zzav, aFMASignals);
        }
        int zzT = com_google_android_gms_internal_zzav.zzT();
        List<Callable<Void>> arrayList = new ArrayList();
        arrayList.addAll(super.zzb(com_google_android_gms_internal_zzav, aFMASignals));
        arrayList.add(new zzbf(com_google_android_gms_internal_zzav, zzat.zzal(), zzat.zzam(), aFMASignals, zzT, 24));
        return arrayList;
    }
}
