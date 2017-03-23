package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.customtabs.CustomTabsClient;
import android.support.customtabs.CustomTabsServiceConnection;
import android.support.customtabs.CustomTabsSession;
import java.util.List;

@zzig
public class zzdi implements zzamr {
    private CustomTabsSession zzAl;
    private CustomTabsClient zzAm;
    private CustomTabsServiceConnection zzAn;
    private zza zzAo;

    public interface zza {
        void zzeH();

        void zzeI();
    }

    public static boolean zzo(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        List queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        if (queryIntentActivities == null || resolveActivity == null) {
            return false;
        }
        for (int i = 0; i < queryIntentActivities.size(); i++) {
            if (resolveActivity.activityInfo.name.equals(((ResolveInfo) queryIntentActivities.get(i)).activityInfo.name)) {
                return resolveActivity.activityInfo.packageName.equals(zzamp.zzbH(context));
            }
        }
        return false;
    }

    public boolean mayLaunchUrl(Uri uri, Bundle bundle, List<Bundle> list) {
        if (this.zzAm == null) {
            return false;
        }
        CustomTabsSession zzeF = zzeF();
        return zzeF != null ? zzeF.mayLaunchUrl(uri, bundle, list) : false;
    }

    public void zza(CustomTabsClient customTabsClient) {
        this.zzAm = customTabsClient;
        this.zzAm.warmup(0);
        if (this.zzAo != null) {
            this.zzAo.zzeH();
        }
    }

    public void zza(zza com_google_android_gms_internal_zzdi_zza) {
        this.zzAo = com_google_android_gms_internal_zzdi_zza;
    }

    public void zzd(Activity activity) {
        if (this.zzAn != null) {
            activity.unbindService(this.zzAn);
            this.zzAm = null;
            this.zzAl = null;
            this.zzAn = null;
        }
    }

    public void zze(Activity activity) {
        if (this.zzAm == null) {
            String zzbH = zzamp.zzbH(activity);
            if (zzbH != null) {
                this.zzAn = new zzamq(this);
                CustomTabsClient.bindCustomTabsService(activity, zzbH, this.zzAn);
            }
        }
    }

    public CustomTabsSession zzeF() {
        if (this.zzAm == null) {
            this.zzAl = null;
        } else if (this.zzAl == null) {
            this.zzAl = this.zzAm.newSession(null);
        }
        return this.zzAl;
    }

    public void zzeG() {
        this.zzAm = null;
        this.zzAl = null;
        if (this.zzAo != null) {
            this.zzAo.zzeI();
        }
    }
}
