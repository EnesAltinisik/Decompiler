package com.google.android.gms.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.zzad;
import com.google.android.gms.ads.internal.client.zzad.zza;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.common.internal.zzaa;
import java.util.Date;
import java.util.Set;

public final class AdRequest {
    public static final String DEVICE_ID_EMULATOR = zzad.DEVICE_ID_EMULATOR;
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_FILL = 3;
    public static final int GENDER_FEMALE = 2;
    public static final int GENDER_MALE = 1;
    public static final int GENDER_UNKNOWN = 0;
    public static final int MAX_CONTENT_URL_LENGTH = 512;
    private final zzad zzpg;

    public static final class Builder {
        private final zza zzph = new zza();

        public Builder() {
            this.zzph.zzG(AdRequest.DEVICE_ID_EMULATOR);
        }

        public Builder addCustomEventExtrasBundle(Class<? extends CustomEvent> cls, Bundle bundle) {
            this.zzph.zzb(cls, bundle);
            return this;
        }

        public Builder addKeyword(String str) {
            this.zzph.zzF(str);
            return this;
        }

        public Builder addNetworkExtras(NetworkExtras networkExtras) {
            this.zzph.zza(networkExtras);
            return this;
        }

        public Builder addNetworkExtrasBundle(Class<? extends MediationAdapter> cls, Bundle bundle) {
            this.zzph.zza(cls, bundle);
            if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
                this.zzph.zzH(AdRequest.DEVICE_ID_EMULATOR);
            }
            return this;
        }

        public Builder addTestDevice(String str) {
            this.zzph.zzG(str);
            return this;
        }

        public AdRequest build() {
            return new AdRequest();
        }

        public Builder setBirthday(Date date) {
            this.zzph.zza(date);
            return this;
        }

        public Builder setContentUrl(String str) {
            zzaa.zzb((Object) str, (Object) "Content URL must be non-null.");
            zzaa.zzh(str, "Content URL must be non-empty.");
            zzaa.zzb(str.length() <= 512, "Content URL must not exceed %d in length.  Provided length was %d.", Integer.valueOf(512), Integer.valueOf(str.length()));
            this.zzph.zzI(str);
            return this;
        }

        public Builder setGender(int i) {
            this.zzph.zzr(i);
            return this;
        }

        public Builder setIsDesignedForFamilies(boolean z) {
            this.zzph.zzn(z);
            return this;
        }

        public Builder setLocation(Location location) {
            this.zzph.zzb(location);
            return this;
        }

        public Builder setRequestAgent(String str) {
            this.zzph.zzK(str);
            return this;
        }

        public Builder tagForChildDirectedTreatment(boolean z) {
            this.zzph.zzm(z);
            return this;
        }
    }

    private AdRequest(Builder builder) {
        this.zzpg = new zzad(builder.zzph);
    }

    public Date getBirthday() {
        return this.zzpg.getBirthday();
    }

    public String getContentUrl() {
        return this.zzpg.getContentUrl();
    }

    public <T extends CustomEvent> Bundle getCustomEventExtrasBundle(Class<T> cls) {
        return this.zzpg.getCustomEventExtrasBundle(cls);
    }

    public int getGender() {
        return this.zzpg.getGender();
    }

    public Set<String> getKeywords() {
        return this.zzpg.getKeywords();
    }

    public Location getLocation() {
        return this.zzpg.getLocation();
    }

    @Deprecated
    public <T extends NetworkExtras> T getNetworkExtras(Class<T> cls) {
        return this.zzpg.getNetworkExtras(cls);
    }

    public <T extends MediationAdapter> Bundle getNetworkExtrasBundle(Class<T> cls) {
        return this.zzpg.getNetworkExtrasBundle(cls);
    }

    public boolean isTestDevice(Context context) {
        return this.zzpg.isTestDevice(context);
    }

    public zzad zzaX() {
        return this.zzpg;
    }
}
