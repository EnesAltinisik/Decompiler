package com.google.android.gms.analytics;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.google.android.gms.analytics.internal.zzaf;
import com.google.android.gms.analytics.internal.zzao;
import com.google.android.gms.analytics.internal.zzf;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zztx;

public class CampaignTrackingService extends Service {
    private static Boolean zzTP;
    private Handler mHandler;

    private Handler getHandler() {
        Handler handler = this.mHandler;
        if (handler != null) {
            return handler;
        }
        handler = new Handler(getMainLooper());
        this.mHandler = handler;
        return handler;
    }

    public static boolean zzV(Context context) {
        zzaa.zzz(context);
        if (zzTP != null) {
            return zzTP.booleanValue();
        }
        boolean zzj = zzao.zzj(context, "com.google.android.gms.analytics.CampaignTrackingService");
        zzTP = Boolean.valueOf(zzj);
        return zzj;
    }

    private void zzkp() {
        try {
            synchronized (CampaignTrackingReceiver.zzrs) {
                zztx com_google_android_gms_internal_zztx = CampaignTrackingReceiver.zzTN;
                if (com_google_android_gms_internal_zztx != null && com_google_android_gms_internal_zztx.isHeld()) {
                    com_google_android_gms_internal_zztx.release();
                }
            }
        } catch (SecurityException e) {
        }
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        zzf.zzX(this).zzlR().zzbG("CampaignTrackingService is starting up");
    }

    public void onDestroy() {
        zzf.zzX(this).zzlR().zzbG("CampaignTrackingService is shutting down");
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, final int i2) {
        zzkp();
        zzf zzX = zzf.zzX(this);
        final zzaf zzlR = zzX.zzlR();
        String str = null;
        if (zzX.zzlS().zzmW()) {
            zzlR.zzbK("Unexpected installation campaign (package side)");
        } else {
            str = intent.getStringExtra(Constants.REFERRER);
        }
        final Handler handler = getHandler();
        if (TextUtils.isEmpty(str)) {
            if (!zzX.zzlS().zzmW()) {
                zzlR.zzbJ("No campaign found on com.android.vending.INSTALL_REFERRER \"referrer\" extra");
            }
            zzX.zzlT().zzf(new Runnable(this) {
                final /* synthetic */ CampaignTrackingService d;

                public void run() {
                    this.d.zza(zzlR, handler, i2);
                }
            });
        } else {
            int zzna = zzX.zzlS().zzna();
            if (str.length() > zzna) {
                zzlR.zzc("Campaign data exceed the maximum supported size and will be clipped. size, limit", Integer.valueOf(str.length()), Integer.valueOf(zzna));
                str = str.substring(0, zzna);
            }
            zzlR.zza("CampaignTrackingService called. startId, campaign", Integer.valueOf(i2), str);
            zzX.zzkw().zza(str, new Runnable(this) {
                final /* synthetic */ CampaignTrackingService d;

                public void run() {
                    this.d.zza(zzlR, handler, i2);
                }
            });
        }
        return 2;
    }

    protected void zza(final zzaf com_google_android_gms_analytics_internal_zzaf, Handler handler, final int i) {
        handler.post(new Runnable(this) {
            final /* synthetic */ CampaignTrackingService c;

            public void run() {
                boolean stopSelfResult = this.c.stopSelfResult(i);
                if (stopSelfResult) {
                    com_google_android_gms_analytics_internal_zzaf.zza("Install campaign broadcast processed", Boolean.valueOf(stopSelfResult));
                }
            }
        });
    }
}
