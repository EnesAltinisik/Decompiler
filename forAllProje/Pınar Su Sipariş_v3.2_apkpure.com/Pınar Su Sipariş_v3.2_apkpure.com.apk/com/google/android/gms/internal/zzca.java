package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import org.json.JSONObject;

@zzig
public class zzca extends zzbv {
    private final zzfk zztQ;

    public zzca(Context context, AdSizeParcel adSizeParcel, zzjn com_google_android_gms_internal_zzjn, VersionInfoParcel versionInfoParcel, zzcc com_google_android_gms_internal_zzcc, zzfk com_google_android_gms_internal_zzfk) {
        super(context, adSizeParcel, com_google_android_gms_internal_zzjn, versionInfoParcel, com_google_android_gms_internal_zzcc);
        this.zztQ = com_google_android_gms_internal_zzfk;
        zzc(this.zztQ);
        zzcQ();
        zzi(3);
        String str = "Tracking ad unit: ";
        String valueOf = String.valueOf(this.zztl.zzdh());
        zzb.zzaU(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    protected void destroy() {
        synchronized (this.zzpp) {
            super.destroy();
            zzd(this.zztQ);
        }
    }

    protected void zzb(JSONObject jSONObject) {
        this.zztQ.zza("AFMA_updateActiveView", jSONObject);
    }

    public void zzcS() {
        destroy();
    }

    protected boolean zzcY() {
        return true;
    }
}
