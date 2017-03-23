package com.google.android.gms.ads.internal.purchase;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.stats.zzb;
import com.google.android.gms.internal.zzhk.zza;
import com.google.android.gms.internal.zzig;

@zzig
public final class zzg extends zza implements ServiceConnection {
    private Context mContext;
    private int mResultCode;
    private boolean zzJA = false;
    private Intent zzJB;
    zzb zzJk;
    private String zzJq;
    private zzf zzJu;

    public zzg(Context context, String str, boolean z, int i, Intent intent, zzf com_google_android_gms_ads_internal_purchase_zzf) {
        this.zzJq = str;
        this.mResultCode = i;
        this.zzJB = intent;
        this.zzJA = z;
        this.mContext = context;
        this.zzJu = com_google_android_gms_ads_internal_purchase_zzf;
    }

    public void finishPurchase() {
        int zzd = zzu.zzcu().zzd(this.zzJB);
        if (this.mResultCode == -1 && zzd == 0) {
            this.zzJk = new zzb(this.mContext);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            zzb.zzuH().zza(this.mContext, intent, (ServiceConnection) this, 1);
        }
    }

    public String getProductId() {
        return this.zzJq;
    }

    public Intent getPurchaseData() {
        return this.zzJB;
    }

    public int getResultCode() {
        return this.mResultCode;
    }

    public boolean isVerified() {
        return this.zzJA;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.ads.internal.util.client.zzb.zzaV("In-app billing service connected.");
        this.zzJk.zzS(iBinder);
        String zzay = zzu.zzcu().zzay(zzu.zzcu().zze(this.zzJB));
        if (zzay != null) {
            if (this.zzJk.zzk(this.mContext.getPackageName(), zzay) == 0) {
                zzh.zzr(this.mContext).zza(this.zzJu);
            }
            zzb.zzuH().zza(this.mContext, (ServiceConnection) this);
            this.zzJk.destroy();
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.ads.internal.util.client.zzb.zzaV("In-app billing service disconnected.");
        this.zzJk.destroy();
    }
}
