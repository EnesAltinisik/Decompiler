package com.google.android.gms.ads.internal.purchase;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.zzhg;
import com.google.android.gms.internal.zzhi.zza;
import com.google.android.gms.internal.zzig;

@zzig
public class zze extends zza implements ServiceConnection {
    private final Activity mActivity;
    private zzb zzJk;
    zzh zzJl;
    private zzk zzJn;
    private Context zzJs;
    private zzhg zzJt;
    private zzf zzJu;
    private zzj zzJv;
    private String zzJw = null;

    public zze(Activity activity) {
        this.mActivity = activity;
        this.zzJl = zzh.zzr(this.mActivity.getApplicationContext());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1001) {
            boolean z = false;
            try {
                int zzd = zzu.zzcu().zzd(intent);
                if (i2 == -1) {
                    zzu.zzcu();
                    if (zzd == 0) {
                        if (this.zzJn.zza(this.zzJw, i2, intent)) {
                            z = true;
                        }
                        this.zzJt.recordPlayBillingResolution(zzd);
                        this.mActivity.finish();
                        zza(this.zzJt.getProductId(), z, i2, intent);
                    }
                }
                this.zzJl.zza(this.zzJu);
                this.zzJt.recordPlayBillingResolution(zzd);
                this.mActivity.finish();
                zza(this.zzJt.getProductId(), z, i2, intent);
            } catch (RemoteException e) {
                zzb.zzaW("Fail to process purchase result.");
                this.mActivity.finish();
            } finally {
                this.zzJw = null;
            }
        }
    }

    public void onCreate() {
        GInAppPurchaseManagerInfoParcel zzc = GInAppPurchaseManagerInfoParcel.zzc(this.mActivity.getIntent());
        this.zzJv = zzc.zzJg;
        this.zzJn = zzc.zzsU;
        this.zzJt = zzc.zzJe;
        this.zzJk = new zzb(this.mActivity.getApplicationContext());
        this.zzJs = zzc.zzJf;
        if (this.mActivity.getResources().getConfiguration().orientation == 2) {
            this.mActivity.setRequestedOrientation(zzu.zzcm().zzje());
        } else {
            this.mActivity.setRequestedOrientation(zzu.zzcm().zzjf());
        }
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        this.mActivity.bindService(intent, this, 1);
    }

    public void onDestroy() {
        this.mActivity.unbindService(this);
        this.zzJk.destroy();
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Throwable e;
        this.zzJk.zzS(iBinder);
        try {
            this.zzJw = this.zzJn.zzho();
            Bundle zzb = this.zzJk.zzb(this.mActivity.getPackageName(), this.zzJt.getProductId(), this.zzJw);
            PendingIntent pendingIntent = (PendingIntent) zzb.getParcelable("BUY_INTENT");
            if (pendingIntent == null) {
                int zze = zzu.zzcu().zze(zzb);
                this.zzJt.recordPlayBillingResolution(zze);
                zza(this.zzJt.getProductId(), false, zze, null);
                this.mActivity.finish();
                return;
            }
            this.zzJu = new zzf(this.zzJt.getProductId(), this.zzJw);
            this.zzJl.zzb(this.zzJu);
            this.mActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1001, new Intent(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue());
        } catch (RemoteException e2) {
            e = e2;
            zzb.zzd("Error when connecting in-app billing service", e);
            this.mActivity.finish();
        } catch (SendIntentException e3) {
            e = e3;
            zzb.zzd("Error when connecting in-app billing service", e);
            this.mActivity.finish();
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        zzb.zzaV("In-app billing service disconnected.");
        this.zzJk.destroy();
    }

    protected void zza(String str, boolean z, int i, Intent intent) {
        if (this.zzJv != null) {
            this.zzJv.zza(str, z, i, intent, this.zzJu);
        }
    }
}
