package com.google.android.gms.ads.search;

import android.content.Context;
import android.graphics.Color;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzad;
import com.google.android.gms.ads.internal.client.zzad.zza;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;

public final class SearchAdRequest {
    public static final int BORDER_TYPE_DASHED = 1;
    public static final int BORDER_TYPE_DOTTED = 2;
    public static final int BORDER_TYPE_NONE = 0;
    public static final int BORDER_TYPE_SOLID = 3;
    public static final int CALL_BUTTON_COLOR_DARK = 2;
    public static final int CALL_BUTTON_COLOR_LIGHT = 0;
    public static final int CALL_BUTTON_COLOR_MEDIUM = 1;
    public static final String DEVICE_ID_EMULATOR = zzad.DEVICE_ID_EMULATOR;
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_FILL = 3;
    private final int mBackgroundColor;
    private final int zzTA;
    private final String zzTB;
    private final int zzTC;
    private final int zzTD;
    private final int zzTs;
    private final int zzTt;
    private final int zzTu;
    private final int zzTv;
    private final int zzTw;
    private final int zzTx;
    private final int zzTy;
    private final String zzTz;
    private final zzad zzpg;
    private final String zzrS;

    public static final class Builder {
        private int mBackgroundColor;
        private int zzTA;
        private String zzTB;
        private int zzTC;
        private int zzTD;
        private int zzTs;
        private int zzTt;
        private int zzTu;
        private int zzTv;
        private int zzTw;
        private int zzTx = 0;
        private int zzTy;
        private String zzTz;
        private final zza zzph = new zza();
        private String zzrS;

        public Builder addCustomEventExtrasBundle(Class<? extends CustomEvent> cls, Bundle bundle) {
            this.zzph.zzb(cls, bundle);
            return this;
        }

        public Builder addNetworkExtras(NetworkExtras networkExtras) {
            this.zzph.zza(networkExtras);
            return this;
        }

        public Builder addNetworkExtrasBundle(Class<? extends MediationAdapter> cls, Bundle bundle) {
            this.zzph.zza(cls, bundle);
            return this;
        }

        public Builder addTestDevice(String str) {
            this.zzph.zzG(str);
            return this;
        }

        public SearchAdRequest build() {
            return new SearchAdRequest();
        }

        public Builder setAnchorTextColor(int i) {
            this.zzTs = i;
            return this;
        }

        public Builder setBackgroundColor(int i) {
            this.mBackgroundColor = i;
            this.zzTt = Color.argb(0, 0, 0, 0);
            this.zzTu = Color.argb(0, 0, 0, 0);
            return this;
        }

        public Builder setBackgroundGradient(int i, int i2) {
            this.mBackgroundColor = Color.argb(0, 0, 0, 0);
            this.zzTt = i2;
            this.zzTu = i;
            return this;
        }

        public Builder setBorderColor(int i) {
            this.zzTv = i;
            return this;
        }

        public Builder setBorderThickness(int i) {
            this.zzTw = i;
            return this;
        }

        public Builder setBorderType(int i) {
            this.zzTx = i;
            return this;
        }

        public Builder setCallButtonColor(int i) {
            this.zzTy = i;
            return this;
        }

        public Builder setCustomChannels(String str) {
            this.zzTz = str;
            return this;
        }

        public Builder setDescriptionTextColor(int i) {
            this.zzTA = i;
            return this;
        }

        public Builder setFontFace(String str) {
            this.zzTB = str;
            return this;
        }

        public Builder setHeaderTextColor(int i) {
            this.zzTC = i;
            return this;
        }

        public Builder setHeaderTextSize(int i) {
            this.zzTD = i;
            return this;
        }

        public Builder setLocation(Location location) {
            this.zzph.zzb(location);
            return this;
        }

        public Builder setQuery(String str) {
            this.zzrS = str;
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

    private SearchAdRequest(Builder builder) {
        this.zzTs = builder.zzTs;
        this.mBackgroundColor = builder.mBackgroundColor;
        this.zzTt = builder.zzTt;
        this.zzTu = builder.zzTu;
        this.zzTv = builder.zzTv;
        this.zzTw = builder.zzTw;
        this.zzTx = builder.zzTx;
        this.zzTy = builder.zzTy;
        this.zzTz = builder.zzTz;
        this.zzTA = builder.zzTA;
        this.zzTB = builder.zzTB;
        this.zzTC = builder.zzTC;
        this.zzTD = builder.zzTD;
        this.zzrS = builder.zzrS;
        this.zzpg = new zzad(builder.zzph, this);
    }

    public int getAnchorTextColor() {
        return this.zzTs;
    }

    public int getBackgroundColor() {
        return this.mBackgroundColor;
    }

    public int getBackgroundGradientBottom() {
        return this.zzTt;
    }

    public int getBackgroundGradientTop() {
        return this.zzTu;
    }

    public int getBorderColor() {
        return this.zzTv;
    }

    public int getBorderThickness() {
        return this.zzTw;
    }

    public int getBorderType() {
        return this.zzTx;
    }

    public int getCallButtonColor() {
        return this.zzTy;
    }

    public String getCustomChannels() {
        return this.zzTz;
    }

    public <T extends CustomEvent> Bundle getCustomEventExtrasBundle(Class<T> cls) {
        return this.zzpg.getCustomEventExtrasBundle(cls);
    }

    public int getDescriptionTextColor() {
        return this.zzTA;
    }

    public String getFontFace() {
        return this.zzTB;
    }

    public int getHeaderTextColor() {
        return this.zzTC;
    }

    public int getHeaderTextSize() {
        return this.zzTD;
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

    public String getQuery() {
        return this.zzrS;
    }

    public boolean isTestDevice(Context context) {
        return this.zzpg.isTestDevice(context);
    }

    zzad zzaX() {
        return this.zzpg;
    }
}
