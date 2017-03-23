package com.google.android.gms.internal;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.zzh;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.zzbv.zza;
import com.google.android.gms.internal.zzbv.zzd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.WeakHashMap;

@zzig
public class zzby implements zzbz {
    private final Object zzpp = new Object();
    private final VersionInfoParcel zzqP;
    private final WeakHashMap<zzjn, zzbv> zztN = new WeakHashMap();
    private final ArrayList<zzbv> zztO = new ArrayList();
    private final zzfj zztP;
    private final Context zztm;

    public zzby(Context context, VersionInfoParcel versionInfoParcel, zzfj com_google_android_gms_internal_zzfj) {
        this.zztm = context.getApplicationContext();
        this.zzqP = versionInfoParcel;
        this.zztP = com_google_android_gms_internal_zzfj;
    }

    public zzbv zza(AdSizeParcel adSizeParcel, zzjn com_google_android_gms_internal_zzjn) {
        return zza(adSizeParcel, com_google_android_gms_internal_zzjn, com_google_android_gms_internal_zzjn.zzHF.getView());
    }

    public zzbv zza(AdSizeParcel adSizeParcel, zzjn com_google_android_gms_internal_zzjn, View view) {
        return zza(adSizeParcel, com_google_android_gms_internal_zzjn, new zzd(view, com_google_android_gms_internal_zzjn), null);
    }

    public zzbv zza(AdSizeParcel adSizeParcel, zzjn com_google_android_gms_internal_zzjn, View view, zzfk com_google_android_gms_internal_zzfk) {
        return zza(adSizeParcel, com_google_android_gms_internal_zzjn, new zzd(view, com_google_android_gms_internal_zzjn), com_google_android_gms_internal_zzfk);
    }

    public zzbv zza(AdSizeParcel adSizeParcel, zzjn com_google_android_gms_internal_zzjn, zzh com_google_android_gms_ads_internal_formats_zzh) {
        return zza(adSizeParcel, com_google_android_gms_internal_zzjn, new zza(com_google_android_gms_ads_internal_formats_zzh), null);
    }

    public zzbv zza(AdSizeParcel adSizeParcel, zzjn com_google_android_gms_internal_zzjn, zzcc com_google_android_gms_internal_zzcc, zzfk com_google_android_gms_internal_zzfk) {
        zzbv com_google_android_gms_internal_zzbv;
        synchronized (this.zzpp) {
            if (zzh(com_google_android_gms_internal_zzjn)) {
                com_google_android_gms_internal_zzbv = (zzbv) this.zztN.get(com_google_android_gms_internal_zzjn);
            } else {
                if (com_google_android_gms_internal_zzfk != null) {
                    com_google_android_gms_internal_zzbv = new zzca(this.zztm, adSizeParcel, com_google_android_gms_internal_zzjn, this.zzqP, com_google_android_gms_internal_zzcc, com_google_android_gms_internal_zzfk);
                } else {
                    com_google_android_gms_internal_zzbv = new zzcb(this.zztm, adSizeParcel, com_google_android_gms_internal_zzjn, this.zzqP, com_google_android_gms_internal_zzcc, this.zztP);
                }
                com_google_android_gms_internal_zzbv.zza((zzbz) this);
                this.zztN.put(com_google_android_gms_internal_zzjn, com_google_android_gms_internal_zzbv);
                this.zztO.add(com_google_android_gms_internal_zzbv);
            }
        }
        return com_google_android_gms_internal_zzbv;
    }

    public void zza(zzbv com_google_android_gms_internal_zzbv) {
        synchronized (this.zzpp) {
            if (!com_google_android_gms_internal_zzbv.zzcU()) {
                this.zztO.remove(com_google_android_gms_internal_zzbv);
                Iterator it = this.zztN.entrySet().iterator();
                while (it.hasNext()) {
                    if (((Entry) it.next()).getValue() == com_google_android_gms_internal_zzbv) {
                        it.remove();
                    }
                }
            }
        }
    }

    public boolean zzh(zzjn com_google_android_gms_internal_zzjn) {
        boolean z;
        synchronized (this.zzpp) {
            zzbv com_google_android_gms_internal_zzbv = (zzbv) this.zztN.get(com_google_android_gms_internal_zzjn);
            z = com_google_android_gms_internal_zzbv != null && com_google_android_gms_internal_zzbv.zzcU();
        }
        return z;
    }

    public void zzi(zzjn com_google_android_gms_internal_zzjn) {
        synchronized (this.zzpp) {
            zzbv com_google_android_gms_internal_zzbv = (zzbv) this.zztN.get(com_google_android_gms_internal_zzjn);
            if (com_google_android_gms_internal_zzbv != null) {
                com_google_android_gms_internal_zzbv.zzcS();
            }
        }
    }

    public void zzj(zzjn com_google_android_gms_internal_zzjn) {
        synchronized (this.zzpp) {
            zzbv com_google_android_gms_internal_zzbv = (zzbv) this.zztN.get(com_google_android_gms_internal_zzjn);
            if (com_google_android_gms_internal_zzbv != null) {
                com_google_android_gms_internal_zzbv.stop();
            }
        }
    }

    public void zzk(zzjn com_google_android_gms_internal_zzjn) {
        synchronized (this.zzpp) {
            zzbv com_google_android_gms_internal_zzbv = (zzbv) this.zztN.get(com_google_android_gms_internal_zzjn);
            if (com_google_android_gms_internal_zzbv != null) {
                com_google_android_gms_internal_zzbv.pause();
            }
        }
    }

    public void zzl(zzjn com_google_android_gms_internal_zzjn) {
        synchronized (this.zzpp) {
            zzbv com_google_android_gms_internal_zzbv = (zzbv) this.zztN.get(com_google_android_gms_internal_zzjn);
            if (com_google_android_gms_internal_zzbv != null) {
                com_google_android_gms_internal_zzbv.resume();
            }
        }
    }
}
