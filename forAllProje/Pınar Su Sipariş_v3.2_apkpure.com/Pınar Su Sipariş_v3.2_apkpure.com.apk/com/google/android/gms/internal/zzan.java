package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.ads.afma.nano.Google3NanoAfmaSignals.AFMASignals;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class zzan extends zzao {
    private static final String TAG = zzan.class.getSimpleName();
    private Info zzoc;

    protected zzan(Context context) {
        super(context, "");
    }

    public static zzan zze(Context context) {
        zzao.zza(context, true);
        return new zzan(context);
    }

    public String zza(String str, String str2) {
        return h.a(str, str2, true);
    }

    public void zza(Info info) {
        this.zzoc = info;
    }

    protected void zza(zzav com_google_android_gms_internal_zzav, AFMASignals aFMASignals) {
        if (!com_google_android_gms_internal_zzav.zzaI()) {
            zza(zzb(com_google_android_gms_internal_zzav, aFMASignals));
        } else if (this.zzoc != null) {
            Object id = this.zzoc.getId();
            if (!TextUtils.isEmpty(id)) {
                aFMASignals.didSignal = zzaw.zzo(id);
                aFMASignals.didSignalType = Integer.valueOf(5);
                aFMASignals.didOptOut = Boolean.valueOf(this.zzoc.isLimitAdTrackingEnabled());
            }
            this.zzoc = null;
        }
    }

    protected List<Callable<Void>> zzb(zzav com_google_android_gms_internal_zzav, AFMASignals aFMASignals) {
        List<Callable<Void>> arrayList = new ArrayList();
        if (com_google_android_gms_internal_zzav.zzaD() == null) {
            return arrayList;
        }
        zzav com_google_android_gms_internal_zzav2 = com_google_android_gms_internal_zzav;
        arrayList.add(new zzbf(com_google_android_gms_internal_zzav2, zzat.zzal(), zzat.zzam(), aFMASignals, com_google_android_gms_internal_zzav.zzT(), 24));
        return arrayList;
    }

    protected AFMASignals zzd(Context context) {
        return null;
    }
}
