package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener;
import com.google.android.gms.ads.formats.NativeContentAd.OnContentAdLoadedListener;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomClickListener;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener;
import com.google.android.gms.ads.internal.client.zzad;
import com.google.android.gms.ads.internal.client.zzc;
import com.google.android.gms.ads.internal.client.zzh;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zzdy;
import com.google.android.gms.internal.zzdz;
import com.google.android.gms.internal.zzea;
import com.google.android.gms.internal.zzeb;
import com.google.android.gms.internal.zzfz;

public class AdLoader {
    private final Context mContext;
    private final zzh zzpd;
    private final zzr zzpe;

    public static class Builder {
        private final Context mContext;
        private final zzs zzpf;

        Builder(Context context, zzs com_google_android_gms_ads_internal_client_zzs) {
            this.mContext = context;
            this.zzpf = com_google_android_gms_ads_internal_client_zzs;
        }

        public Builder(Context context, String str) {
            this((Context) zzaa.zzb((Object) context, (Object) "context cannot be null"), zzm.zzdR().zzb(context, str, new zzfz()));
        }

        public AdLoader build() {
            try {
                return new AdLoader(this.mContext, this.zzpf.zzbM());
            } catch (Throwable e) {
                zzb.zzb("Failed to build AdLoader.", e);
                return null;
            }
        }

        public Builder forAppInstallAd(OnAppInstallAdLoadedListener onAppInstallAdLoadedListener) {
            try {
                this.zzpf.zza(new zzdy(onAppInstallAdLoadedListener));
            } catch (Throwable e) {
                zzb.zzd("Failed to add app install ad listener", e);
            }
            return this;
        }

        public Builder forContentAd(OnContentAdLoadedListener onContentAdLoadedListener) {
            try {
                this.zzpf.zza(new zzdz(onContentAdLoadedListener));
            } catch (Throwable e) {
                zzb.zzd("Failed to add content ad listener", e);
            }
            return this;
        }

        public Builder forCustomTemplateAd(String str, OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener, OnCustomClickListener onCustomClickListener) {
            try {
                this.zzpf.zza(str, new zzeb(onCustomTemplateAdLoadedListener), onCustomClickListener == null ? null : new zzea(onCustomClickListener));
            } catch (Throwable e) {
                zzb.zzd("Failed to add custom template ad listener", e);
            }
            return this;
        }

        public Builder withAdListener(AdListener adListener) {
            try {
                this.zzpf.zzb(new zzc(adListener));
            } catch (Throwable e) {
                zzb.zzd("Failed to set AdListener.", e);
            }
            return this;
        }

        public Builder withCorrelator(Correlator correlator) {
            zzaa.zzz(correlator);
            try {
                this.zzpf.zzb(correlator.zzaY());
            } catch (Throwable e) {
                zzb.zzd("Failed to set correlator.", e);
            }
            return this;
        }

        public Builder withNativeAdOptions(NativeAdOptions nativeAdOptions) {
            try {
                this.zzpf.zza(new NativeAdOptionsParcel(nativeAdOptions));
            } catch (Throwable e) {
                zzb.zzd("Failed to specify native ad options", e);
            }
            return this;
        }
    }

    AdLoader(Context context, zzr com_google_android_gms_ads_internal_client_zzr) {
        this(context, com_google_android_gms_ads_internal_client_zzr, zzh.zzdB());
    }

    AdLoader(Context context, zzr com_google_android_gms_ads_internal_client_zzr, zzh com_google_android_gms_ads_internal_client_zzh) {
        this.mContext = context;
        this.zzpe = com_google_android_gms_ads_internal_client_zzr;
        this.zzpd = com_google_android_gms_ads_internal_client_zzh;
    }

    private void zza(zzad com_google_android_gms_ads_internal_client_zzad) {
        try {
            this.zzpe.zzf(this.zzpd.zza(this.mContext, com_google_android_gms_ads_internal_client_zzad));
        } catch (Throwable e) {
            zzb.zzb("Failed to load ad.", e);
        }
    }

    public String getMediationAdapterClassName() {
        try {
            return this.zzpe.getMediationAdapterClassName();
        } catch (Throwable e) {
            zzb.zzd("Failed to get the mediation adapter class name.", e);
            return null;
        }
    }

    public boolean isLoading() {
        try {
            return this.zzpe.isLoading();
        } catch (Throwable e) {
            zzb.zzd("Failed to check if ad is loading.", e);
            return false;
        }
    }

    public void loadAd(AdRequest adRequest) {
        zza(adRequest.zzaX());
    }

    public void loadAd(PublisherAdRequest publisherAdRequest) {
        zza(publisherAdRequest.zzaX());
    }
}
