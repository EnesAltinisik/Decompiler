package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.analytics.CampaignTrackingReceiver;
import com.google.android.gms.analytics.CampaignTrackingService;

public final class InstallReferrerReceiver extends CampaignTrackingReceiver {
    protected void zzh(Context context, String str) {
        zzbe.zzgB(str);
        zzbe.zzr(context, str);
    }

    protected Class<? extends CampaignTrackingService> zzko() {
        return InstallReferrerService.class;
    }
}
