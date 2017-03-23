package com.google.android.gms.ads.internal.purchase;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.zzhl;
import com.google.android.gms.internal.zzig;
import com.google.android.gms.internal.zzjv;
import com.google.android.gms.internal.zzjw;
import com.google.android.gms.internal.zzka;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@zzig
public class zzc extends zzjv implements ServiceConnection {
    private Context mContext;
    private zzhl zzDw;
    private boolean zzJj;
    private zzb zzJk;
    private zzh zzJl;
    private List<zzf> zzJm;
    private zzk zzJn;
    private final Object zzpp;

    public zzc(Context context, zzhl com_google_android_gms_internal_zzhl, zzk com_google_android_gms_ads_internal_purchase_zzk) {
        this(context, com_google_android_gms_internal_zzhl, com_google_android_gms_ads_internal_purchase_zzk, new zzb(context), zzh.zzr(context.getApplicationContext()));
    }

    zzc(Context context, zzhl com_google_android_gms_internal_zzhl, zzk com_google_android_gms_ads_internal_purchase_zzk, zzb com_google_android_gms_ads_internal_purchase_zzb, zzh com_google_android_gms_ads_internal_purchase_zzh) {
        this.zzpp = new Object();
        this.zzJj = false;
        this.zzJm = null;
        this.mContext = context;
        this.zzDw = com_google_android_gms_internal_zzhl;
        this.zzJn = com_google_android_gms_ads_internal_purchase_zzk;
        this.zzJk = com_google_android_gms_ads_internal_purchase_zzb;
        this.zzJl = com_google_android_gms_ads_internal_purchase_zzh;
        this.zzJm = this.zzJl.zzg(10);
    }

    private void zze(long j) {
        do {
            if (!zzf(j)) {
                zzjw.v("Timeout waiting for pending transaction to be processed.");
            }
        } while (!this.zzJj);
    }

    private boolean zzf(long j) {
        long elapsedRealtime = 60000 - (SystemClock.elapsedRealtime() - j);
        if (elapsedRealtime <= 0) {
            return false;
        }
        try {
            this.zzpp.wait(elapsedRealtime);
        } catch (InterruptedException e) {
            zzb.zzaW("waitWithTimeout_lock interrupted");
        }
        return true;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.zzpp) {
            this.zzJk.zzS(iBinder);
            zzhl();
            this.zzJj = true;
            this.zzpp.notify();
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        zzb.zzaV("In-app billing service disconnected.");
        this.zzJk.destroy();
    }

    public void onStop() {
        synchronized (this.zzpp) {
            com.google.android.gms.common.stats.zzb.zzuH().zza(this.mContext, (ServiceConnection) this);
            this.zzJk.destroy();
        }
    }

    protected void zza(final zzf com_google_android_gms_ads_internal_purchase_zzf, String str, String str2) {
        final Intent intent = new Intent();
        zzu.zzcu();
        intent.putExtra("RESPONSE_CODE", 0);
        zzu.zzcu();
        intent.putExtra("INAPP_PURCHASE_DATA", str);
        zzu.zzcu();
        intent.putExtra("INAPP_DATA_SIGNATURE", str2);
        zzka.zzQu.post(new Runnable(this) {
            final /* synthetic */ zzc c;

            public void run() {
                try {
                    if (this.c.zzJn.zza(com_google_android_gms_ads_internal_purchase_zzf.zzJy, -1, intent)) {
                        this.c.zzDw.zza(new zzg(this.c.mContext, com_google_android_gms_ads_internal_purchase_zzf.zzJz, true, -1, intent, com_google_android_gms_ads_internal_purchase_zzf));
                    } else {
                        this.c.zzDw.zza(new zzg(this.c.mContext, com_google_android_gms_ads_internal_purchase_zzf.zzJz, false, -1, intent, com_google_android_gms_ads_internal_purchase_zzf));
                    }
                } catch (RemoteException e) {
                    zzb.zzaW("Fail to verify and dispatch pending transaction");
                }
            }
        });
    }

    public void zzbQ() {
        synchronized (this.zzpp) {
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            com.google.android.gms.common.stats.zzb.zzuH().zza(this.mContext, intent, (ServiceConnection) this, 1);
            zze(SystemClock.elapsedRealtime());
            com.google.android.gms.common.stats.zzb.zzuH().zza(this.mContext, (ServiceConnection) this);
            this.zzJk.destroy();
        }
    }

    protected void zzhl() {
        if (!this.zzJm.isEmpty()) {
            HashMap hashMap = new HashMap();
            for (zzf com_google_android_gms_ads_internal_purchase_zzf : this.zzJm) {
                hashMap.put(com_google_android_gms_ads_internal_purchase_zzf.zzJz, com_google_android_gms_ads_internal_purchase_zzf);
            }
            String str = null;
            while (true) {
                Bundle zzl = this.zzJk.zzl(this.mContext.getPackageName(), str);
                if (zzl == null || zzu.zzcu().zze(zzl) != 0) {
                    break;
                }
                ArrayList stringArrayList = zzl.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList stringArrayList2 = zzl.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList stringArrayList3 = zzl.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                String string = zzl.getString("INAPP_CONTINUATION_TOKEN");
                for (int i = 0; i < stringArrayList.size(); i++) {
                    if (hashMap.containsKey(stringArrayList.get(i))) {
                        str = (String) stringArrayList.get(i);
                        String str2 = (String) stringArrayList2.get(i);
                        String str3 = (String) stringArrayList3.get(i);
                        zzf com_google_android_gms_ads_internal_purchase_zzf2 = (zzf) hashMap.get(str);
                        if (com_google_android_gms_ads_internal_purchase_zzf2.zzJy.equals(zzu.zzcu().zzax(str2))) {
                            zza(com_google_android_gms_ads_internal_purchase_zzf2, str2, str3);
                            hashMap.remove(str);
                        }
                    }
                }
                if (string == null || hashMap.isEmpty()) {
                    break;
                }
                str = string;
            }
            for (String str4 : hashMap.keySet()) {
                this.zzJl.zza((zzf) hashMap.get(str4));
            }
        }
    }
}
