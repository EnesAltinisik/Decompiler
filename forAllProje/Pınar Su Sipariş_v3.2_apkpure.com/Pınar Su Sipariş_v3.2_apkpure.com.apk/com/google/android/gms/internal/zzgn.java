package com.google.android.gms.internal;

import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;

@zzig
public final class zzgn<NETWORK_EXTRAS extends NetworkExtras, SERVER_PARAMETERS extends MediationServerParameters> implements MediationBannerListener, MediationInterstitialListener {
    private final zzgc zzFD;

    public zzgn(zzgc com_google_android_gms_internal_zzgc) {
        this.zzFD = com_google_android_gms_internal_zzgc;
    }

    public void onClick(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        zzb.zzaU("Adapter called onClick.");
        if (zzm.zzdQ().zzjs()) {
            try {
                this.zzFD.onAdClicked();
                return;
            } catch (Throwable e) {
                zzb.zzd("Could not call onAdClicked.", e);
                return;
            }
        }
        zzb.zzaW("onClick must be called on the main UI thread.");
        zza.zzRt.post(new Runnable(this) {
            final /* synthetic */ zzgn a;

            {
                this.a = r1;
            }

            public void run() {
                try {
                    this.a.zzFD.onAdClicked();
                } catch (Throwable e) {
                    zzb.zzd("Could not call onAdClicked.", e);
                }
            }
        });
    }

    public void onDismissScreen(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        zzb.zzaU("Adapter called onDismissScreen.");
        if (zzm.zzdQ().zzjs()) {
            try {
                this.zzFD.onAdClosed();
                return;
            } catch (Throwable e) {
                zzb.zzd("Could not call onAdClosed.", e);
                return;
            }
        }
        zzb.zzaW("onDismissScreen must be called on the main UI thread.");
        zza.zzRt.post(new Runnable(this) {
            final /* synthetic */ zzgn a;

            {
                this.a = r1;
            }

            public void run() {
                try {
                    this.a.zzFD.onAdClosed();
                } catch (Throwable e) {
                    zzb.zzd("Could not call onAdClosed.", e);
                }
            }
        });
    }

    public void onDismissScreen(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        zzb.zzaU("Adapter called onDismissScreen.");
        if (zzm.zzdQ().zzjs()) {
            try {
                this.zzFD.onAdClosed();
                return;
            } catch (Throwable e) {
                zzb.zzd("Could not call onAdClosed.", e);
                return;
            }
        }
        zzb.zzaW("onDismissScreen must be called on the main UI thread.");
        zza.zzRt.post(new Runnable(this) {
            final /* synthetic */ zzgn a;

            {
                this.a = r1;
            }

            public void run() {
                try {
                    this.a.zzFD.onAdClosed();
                } catch (Throwable e) {
                    zzb.zzd("Could not call onAdClosed.", e);
                }
            }
        });
    }

    public void onFailedToReceiveAd(MediationBannerAdapter<?, ?> mediationBannerAdapter, final ErrorCode errorCode) {
        String valueOf = String.valueOf(errorCode);
        zzb.zzaU(new StringBuilder(String.valueOf(valueOf).length() + 47).append("Adapter called onFailedToReceiveAd with error. ").append(valueOf).toString());
        if (zzm.zzdQ().zzjs()) {
            try {
                this.zzFD.onAdFailedToLoad(zzgo.zza(errorCode));
                return;
            } catch (Throwable e) {
                zzb.zzd("Could not call onAdFailedToLoad.", e);
                return;
            }
        }
        zzb.zzaW("onFailedToReceiveAd must be called on the main UI thread.");
        zza.zzRt.post(new Runnable(this) {
            final /* synthetic */ zzgn b;

            public void run() {
                try {
                    this.b.zzFD.onAdFailedToLoad(zzgo.zza(errorCode));
                } catch (Throwable e) {
                    zzb.zzd("Could not call onAdFailedToLoad.", e);
                }
            }
        });
    }

    public void onFailedToReceiveAd(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter, final ErrorCode errorCode) {
        String valueOf = String.valueOf(errorCode);
        zzb.zzaU(new StringBuilder(String.valueOf(valueOf).length() + 47).append("Adapter called onFailedToReceiveAd with error ").append(valueOf).append(".").toString());
        if (zzm.zzdQ().zzjs()) {
            try {
                this.zzFD.onAdFailedToLoad(zzgo.zza(errorCode));
                return;
            } catch (Throwable e) {
                zzb.zzd("Could not call onAdFailedToLoad.", e);
                return;
            }
        }
        zzb.zzaW("onFailedToReceiveAd must be called on the main UI thread.");
        zza.zzRt.post(new Runnable(this) {
            final /* synthetic */ zzgn b;

            public void run() {
                try {
                    this.b.zzFD.onAdFailedToLoad(zzgo.zza(errorCode));
                } catch (Throwable e) {
                    zzb.zzd("Could not call onAdFailedToLoad.", e);
                }
            }
        });
    }

    public void onLeaveApplication(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        zzb.zzaU("Adapter called onLeaveApplication.");
        if (zzm.zzdQ().zzjs()) {
            try {
                this.zzFD.onAdLeftApplication();
                return;
            } catch (Throwable e) {
                zzb.zzd("Could not call onAdLeftApplication.", e);
                return;
            }
        }
        zzb.zzaW("onLeaveApplication must be called on the main UI thread.");
        zza.zzRt.post(new Runnable(this) {
            final /* synthetic */ zzgn a;

            {
                this.a = r1;
            }

            public void run() {
                try {
                    this.a.zzFD.onAdLeftApplication();
                } catch (Throwable e) {
                    zzb.zzd("Could not call onAdLeftApplication.", e);
                }
            }
        });
    }

    public void onLeaveApplication(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        zzb.zzaU("Adapter called onLeaveApplication.");
        if (zzm.zzdQ().zzjs()) {
            try {
                this.zzFD.onAdLeftApplication();
                return;
            } catch (Throwable e) {
                zzb.zzd("Could not call onAdLeftApplication.", e);
                return;
            }
        }
        zzb.zzaW("onLeaveApplication must be called on the main UI thread.");
        zza.zzRt.post(new Runnable(this) {
            final /* synthetic */ zzgn a;

            {
                this.a = r1;
            }

            public void run() {
                try {
                    this.a.zzFD.onAdLeftApplication();
                } catch (Throwable e) {
                    zzb.zzd("Could not call onAdLeftApplication.", e);
                }
            }
        });
    }

    public void onPresentScreen(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        zzb.zzaU("Adapter called onPresentScreen.");
        if (zzm.zzdQ().zzjs()) {
            try {
                this.zzFD.onAdOpened();
                return;
            } catch (Throwable e) {
                zzb.zzd("Could not call onAdOpened.", e);
                return;
            }
        }
        zzb.zzaW("onPresentScreen must be called on the main UI thread.");
        zza.zzRt.post(new Runnable(this) {
            final /* synthetic */ zzgn a;

            {
                this.a = r1;
            }

            public void run() {
                try {
                    this.a.zzFD.onAdOpened();
                } catch (Throwable e) {
                    zzb.zzd("Could not call onAdOpened.", e);
                }
            }
        });
    }

    public void onPresentScreen(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        zzb.zzaU("Adapter called onPresentScreen.");
        if (zzm.zzdQ().zzjs()) {
            try {
                this.zzFD.onAdOpened();
                return;
            } catch (Throwable e) {
                zzb.zzd("Could not call onAdOpened.", e);
                return;
            }
        }
        zzb.zzaW("onPresentScreen must be called on the main UI thread.");
        zza.zzRt.post(new Runnable(this) {
            final /* synthetic */ zzgn a;

            {
                this.a = r1;
            }

            public void run() {
                try {
                    this.a.zzFD.onAdOpened();
                } catch (Throwable e) {
                    zzb.zzd("Could not call onAdOpened.", e);
                }
            }
        });
    }

    public void onReceivedAd(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        zzb.zzaU("Adapter called onReceivedAd.");
        if (zzm.zzdQ().zzjs()) {
            try {
                this.zzFD.onAdLoaded();
                return;
            } catch (Throwable e) {
                zzb.zzd("Could not call onAdLoaded.", e);
                return;
            }
        }
        zzb.zzaW("onReceivedAd must be called on the main UI thread.");
        zza.zzRt.post(new Runnable(this) {
            final /* synthetic */ zzgn a;

            {
                this.a = r1;
            }

            public void run() {
                try {
                    this.a.zzFD.onAdLoaded();
                } catch (Throwable e) {
                    zzb.zzd("Could not call onAdLoaded.", e);
                }
            }
        });
    }

    public void onReceivedAd(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        zzb.zzaU("Adapter called onReceivedAd.");
        if (zzm.zzdQ().zzjs()) {
            try {
                this.zzFD.onAdLoaded();
                return;
            } catch (Throwable e) {
                zzb.zzd("Could not call onAdLoaded.", e);
                return;
            }
        }
        zzb.zzaW("onReceivedAd must be called on the main UI thread.");
        zza.zzRt.post(new Runnable(this) {
            final /* synthetic */ zzgn a;

            {
                this.a = r1;
            }

            public void run() {
                try {
                    this.a.zzFD.onAdLoaded();
                } catch (Throwable e) {
                    zzb.zzd("Could not call onAdLoaded.", e);
                }
            }
        });
    }
}
