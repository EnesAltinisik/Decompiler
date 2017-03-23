package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.customtabs.CustomTabsIntent;
import android.support.customtabs.CustomTabsIntent.Builder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdLauncherIntentInfoParcel;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzg;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.internal.zzdi.zza;

@zzig
public class zzgp implements MediationInterstitialAdapter {
    private Uri mUri;
    private Activity zzFN;
    private zzdi zzFO;
    private MediationInterstitialListener zzFP;

    public static boolean zzp(Context context) {
        return zzdi.zzo(context);
    }

    public void onDestroy() {
        zzb.zzaU("Destroying AdMobCustomTabsAdapter adapter.");
        try {
            this.zzFO.zzd(this.zzFN);
        } catch (Throwable e) {
            zzb.zzb("Exception while unbinding from CustomTabsService.", e);
        }
    }

    public void onPause() {
        zzb.zzaU("Pausing AdMobCustomTabsAdapter adapter.");
    }

    public void onResume() {
        zzb.zzaU("Resuming AdMobCustomTabsAdapter adapter.");
    }

    public void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.zzFP = mediationInterstitialListener;
        if (this.zzFP == null) {
            zzb.zzaW("Listener not set for mediation. Returning.");
        } else if (!(context instanceof Activity)) {
            zzb.zzaW("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.zzFP.onAdFailedToLoad(this, 0);
        } else if (zzp(context)) {
            Object string = bundle.getString("tab_url");
            if (TextUtils.isEmpty(string)) {
                zzb.zzaW("The tab_url retrieved from mediation metadata is empty. Bailing out.");
                this.zzFP.onAdFailedToLoad(this, 0);
                return;
            }
            this.zzFN = (Activity) context;
            this.mUri = Uri.parse(string);
            this.zzFO = new zzdi();
            this.zzFO.zza(new zza(this) {
                final /* synthetic */ zzgp a;

                {
                    this.a = r1;
                }

                public void zzeH() {
                    zzb.zzaU("Hinting CustomTabsService for the load of the new url.");
                }

                public void zzeI() {
                    zzb.zzaU("Disconnecting from CustomTabs service.");
                }
            });
            this.zzFO.zze(this.zzFN);
            this.zzFP.onAdLoaded(this);
        } else {
            zzb.zzaW("Default browser does not support custom tabs. Bailing out.");
            this.zzFP.onAdFailedToLoad(this, 0);
        }
    }

    public void showInterstitial() {
        CustomTabsIntent build = new Builder(this.zzFO.zzeF()).build();
        build.intent.setData(this.mUri);
        final AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(new AdLauncherIntentInfoParcel(build.intent), null, new zzg(this) {
            final /* synthetic */ zzgp a;

            {
                this.a = r1;
            }

            public void onPause() {
                zzb.zzaU("AdMobCustomTabsAdapter overlay is paused.");
            }

            public void onResume() {
                zzb.zzaU("AdMobCustomTabsAdapter overlay is resumed.");
            }

            public void zzbs() {
                zzb.zzaU("AdMobCustomTabsAdapter overlay is closed.");
                this.a.zzFP.onAdClosed(this.a);
                this.a.zzFO.zzd(this.a.zzFN);
            }

            public void zzbt() {
                zzb.zzaU("Opening AdMobCustomTabsAdapter overlay.");
                this.a.zzFP.onAdOpened(this.a);
            }
        }, null, new VersionInfoParcel(0, 0, false));
        zzka.zzQu.post(new Runnable(this) {
            final /* synthetic */ zzgp b;

            public void run() {
                zzu.zzci().zza(this.b.zzFN, adOverlayInfoParcel);
            }
        });
        zzu.zzcn().zzE(false);
    }
}
