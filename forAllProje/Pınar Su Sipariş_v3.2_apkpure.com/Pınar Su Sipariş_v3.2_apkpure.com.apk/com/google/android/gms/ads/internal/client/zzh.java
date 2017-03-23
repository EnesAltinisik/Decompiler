package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.reward.client.RewardedVideoAdRequestParcel;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.internal.zzig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@zzig
public class zzh {
    public static final zzh zzvr = new zzh();

    protected zzh() {
    }

    public static zzh zzdB() {
        return zzvr;
    }

    public AdRequestParcel zza(Context context, zzad com_google_android_gms_ads_internal_client_zzad) {
        Date birthday = com_google_android_gms_ads_internal_client_zzad.getBirthday();
        long time = birthday != null ? birthday.getTime() : -1;
        String contentUrl = com_google_android_gms_ads_internal_client_zzad.getContentUrl();
        int gender = com_google_android_gms_ads_internal_client_zzad.getGender();
        Collection keywords = com_google_android_gms_ads_internal_client_zzad.getKeywords();
        List unmodifiableList = !keywords.isEmpty() ? Collections.unmodifiableList(new ArrayList(keywords)) : null;
        boolean isTestDevice = com_google_android_gms_ads_internal_client_zzad.isTestDevice(context);
        int zzec = com_google_android_gms_ads_internal_client_zzad.zzec();
        Location location = com_google_android_gms_ads_internal_client_zzad.getLocation();
        Bundle networkExtrasBundle = com_google_android_gms_ads_internal_client_zzad.getNetworkExtrasBundle(AdMobAdapter.class);
        boolean manualImpressionsEnabled = com_google_android_gms_ads_internal_client_zzad.getManualImpressionsEnabled();
        String publisherProvidedId = com_google_android_gms_ads_internal_client_zzad.getPublisherProvidedId();
        SearchAdRequest zzdZ = com_google_android_gms_ads_internal_client_zzad.zzdZ();
        SearchAdRequestParcel searchAdRequestParcel = zzdZ != null ? new SearchAdRequestParcel(zzdZ) : null;
        String str = null;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            str = zzm.zzdQ().zza(Thread.currentThread().getStackTrace(), applicationContext.getPackageName());
        }
        return new AdRequestParcel(7, time, networkExtrasBundle, gender, unmodifiableList, isTestDevice, zzec, manualImpressionsEnabled, publisherProvidedId, searchAdRequestParcel, location, contentUrl, com_google_android_gms_ads_internal_client_zzad.zzeb(), com_google_android_gms_ads_internal_client_zzad.getCustomTargeting(), Collections.unmodifiableList(new ArrayList(com_google_android_gms_ads_internal_client_zzad.zzed())), com_google_android_gms_ads_internal_client_zzad.zzdY(), str, com_google_android_gms_ads_internal_client_zzad.isDesignedForFamilies());
    }

    public RewardedVideoAdRequestParcel zza(Context context, zzad com_google_android_gms_ads_internal_client_zzad, String str) {
        return new RewardedVideoAdRequestParcel(zza(context, com_google_android_gms_ads_internal_client_zzad), str);
    }
}
