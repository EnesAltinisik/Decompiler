package com.google.android.gms.internal;

import a.a.a.a.a.b.a;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.util.client.zzb;

@zzig
public class zzjr {
    final String zzPE;
    long zzPU = -1;
    long zzPV = -1;
    int zzPW = -1;
    int zzPX = 0;
    int zzPY = 0;
    private final Object zzpp = new Object();

    public zzjr(String str) {
        this.zzPE = str;
    }

    public static boolean zzA(Context context) {
        int identifier = context.getResources().getIdentifier("Theme.Translucent", "style", a.ANDROID_CLIENT_TYPE);
        if (identifier == 0) {
            zzb.zzaV("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
        try {
            if (identifier == context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), AdActivity.CLASS_NAME), 0).theme) {
                return true;
            }
            zzb.zzaV("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        } catch (NameNotFoundException e) {
            zzb.zzaW("Fail to fetch AdActivity theme");
            zzb.zzaV("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
    }

    public void zzb(AdRequestParcel adRequestParcel, long j) {
        synchronized (this.zzpp) {
            if (this.zzPV == -1) {
                this.zzPV = j;
                this.zzPU = this.zzPV;
            } else {
                this.zzPU = j;
            }
            if (adRequestParcel.extras == null || adRequestParcel.extras.getInt("gw", 2) != 1) {
                this.zzPW++;
                return;
            }
        }
    }

    public Bundle zze(Context context, String str) {
        Bundle bundle;
        synchronized (this.zzpp) {
            bundle = new Bundle();
            bundle.putString("session_id", this.zzPE);
            bundle.putLong("basets", this.zzPV);
            bundle.putLong("currts", this.zzPU);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.zzPW);
            bundle.putInt("pclick", this.zzPX);
            bundle.putInt("pimp", this.zzPY);
            bundle.putBoolean("support_transparent_background", zzA(context));
        }
        return bundle;
    }

    public long zziS() {
        return this.zzPV;
    }

    public void zzit() {
        synchronized (this.zzpp) {
            this.zzPY++;
        }
    }

    public void zziu() {
        synchronized (this.zzpp) {
            this.zzPX++;
        }
    }
}
