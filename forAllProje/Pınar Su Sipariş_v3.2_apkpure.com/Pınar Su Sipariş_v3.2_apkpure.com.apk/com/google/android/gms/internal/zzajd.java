package com.google.android.gms.internal;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.zzaji.zza;
import com.google.android.gms.internal.zzaji.zzb;
import com.google.android.gms.internal.zzaji.zzc;
import com.google.android.gms.internal.zzaji.zzd;
import com.google.android.gms.internal.zzaji.zze;
import com.google.android.gms.internal.zzaji.zzf;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class zzajd implements Runnable {
    public final Context mContext;
    public final zzajh zzbTm;
    public final zzaje zzbTt;
    public final zzaje zzbTu;
    public final zzaje zzbTv;

    public zzajd(Context context, zzaje com_google_android_gms_internal_zzaje, zzaje com_google_android_gms_internal_zzaje2, zzaje com_google_android_gms_internal_zzaje3, zzajh com_google_android_gms_internal_zzajh) {
        this.mContext = context;
        this.zzbTt = com_google_android_gms_internal_zzaje;
        this.zzbTu = com_google_android_gms_internal_zzaje2;
        this.zzbTv = com_google_android_gms_internal_zzaje3;
        this.zzbTm = com_google_android_gms_internal_zzajh;
    }

    private zza zza(zzaje com_google_android_gms_internal_zzaje) {
        zza com_google_android_gms_internal_zzaji_zza = new zza();
        if (com_google_android_gms_internal_zzaje.zzUB() != null) {
            Map zzUB = com_google_android_gms_internal_zzaje.zzUB();
            List arrayList = new ArrayList();
            for (String str : zzUB.keySet()) {
                List arrayList2 = new ArrayList();
                Map map = (Map) zzUB.get(str);
                for (String str2 : map.keySet()) {
                    zzb com_google_android_gms_internal_zzaji_zzb = new zzb();
                    com_google_android_gms_internal_zzaji_zzb.zzaB = str2;
                    com_google_android_gms_internal_zzaji_zzb.zzbTF = (byte[]) map.get(str2);
                    arrayList2.add(com_google_android_gms_internal_zzaji_zzb);
                }
                zzd com_google_android_gms_internal_zzaji_zzd = new zzd();
                com_google_android_gms_internal_zzaji_zzd.zzasB = str;
                com_google_android_gms_internal_zzaji_zzd.zzbTJ = (zzb[]) arrayList2.toArray(new zzb[arrayList2.size()]);
                arrayList.add(com_google_android_gms_internal_zzaji_zzd);
            }
            com_google_android_gms_internal_zzaji_zza.zzbTD = (zzd[]) arrayList.toArray(new zzd[arrayList.size()]);
        }
        com_google_android_gms_internal_zzaji_zza.timestamp = com_google_android_gms_internal_zzaje.getTimestamp();
        return com_google_android_gms_internal_zzaji_zza;
    }

    public void run() {
        zzamj com_google_android_gms_internal_zzaji_zze = new zze();
        if (this.zzbTt != null) {
            com_google_android_gms_internal_zzaji_zze.zzbTK = zza(this.zzbTt);
        }
        if (this.zzbTu != null) {
            com_google_android_gms_internal_zzaji_zze.zzbTL = zza(this.zzbTu);
        }
        if (this.zzbTv != null) {
            com_google_android_gms_internal_zzaji_zze.zzbTM = zza(this.zzbTv);
        }
        if (this.zzbTm != null) {
            zzc com_google_android_gms_internal_zzaji_zzc = new zzc();
            com_google_android_gms_internal_zzaji_zzc.zzbTG = this.zzbTm.getLastFetchStatus();
            com_google_android_gms_internal_zzaji_zzc.zzbTH = this.zzbTm.isDeveloperModeEnabled();
            com_google_android_gms_internal_zzaji_zze.zzbTN = com_google_android_gms_internal_zzaji_zzc;
        }
        if (!(this.zzbTm == null || this.zzbTm.zzUE() == null)) {
            List arrayList = new ArrayList();
            Map zzUE = this.zzbTm.zzUE();
            for (String str : zzUE.keySet()) {
                if (zzUE.get(str) != null) {
                    zzf com_google_android_gms_internal_zzaji_zzf = new zzf();
                    com_google_android_gms_internal_zzaji_zzf.zzasB = str;
                    com_google_android_gms_internal_zzaji_zzf.zzbTQ = ((zzajc) zzUE.get(str)).zzUA();
                    com_google_android_gms_internal_zzaji_zzf.resourceId = ((zzajc) zzUE.get(str)).zzUz();
                    arrayList.add(com_google_android_gms_internal_zzaji_zzf);
                }
            }
            com_google_android_gms_internal_zzaji_zze.zzbTO = (zzf[]) arrayList.toArray(new zzf[arrayList.size()]);
        }
        byte[] toByteArray = zzamj.toByteArray(com_google_android_gms_internal_zzaji_zze);
        try {
            FileOutputStream openFileOutput = this.mContext.openFileOutput("persisted_config", 0);
            openFileOutput.write(toByteArray);
            openFileOutput.close();
        } catch (Throwable e) {
            Log.e("AsyncPersisterTask", "Could not persist config.", e);
        }
    }
}
