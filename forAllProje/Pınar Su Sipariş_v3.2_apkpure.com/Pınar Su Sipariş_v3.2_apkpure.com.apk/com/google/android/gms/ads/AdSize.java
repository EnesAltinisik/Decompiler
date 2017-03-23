package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.nearby.messages.Strategy;
import com.google.firebase.database.DatabaseError;

public final class AdSize {
    public static final int AUTO_HEIGHT = -2;
    public static final AdSize BANNER = new AdSize(320, 50, "320x50_mb");
    public static final AdSize FLUID = new AdSize(-3, -4, "fluid");
    public static final AdSize FULL_BANNER = new AdSize(468, 60, "468x60_as");
    public static final int FULL_WIDTH = -1;
    public static final AdSize LARGE_BANNER = new AdSize(320, 100, "320x100_as");
    public static final AdSize LEADERBOARD = new AdSize(728, 90, "728x90_as");
    public static final AdSize MEDIUM_RECTANGLE = new AdSize(Strategy.TTL_SECONDS_DEFAULT, 250, "300x250_as");
    public static final AdSize SEARCH = new AdSize(-3, 0, "search_v2");
    public static final AdSize SMART_BANNER = new AdSize(-1, -2, "smart_banner");
    public static final AdSize WIDE_SKYSCRAPER = new AdSize(160, 600, "160x600_as");
    private final int zzpi;
    private final int zzpj;
    private final String zzpk;

    public AdSize(int i, int i2) {
        String valueOf = i == -1 ? "FULL" : String.valueOf(i);
        String valueOf2 = i2 == -2 ? "AUTO" : String.valueOf(i2);
        String valueOf3 = String.valueOf("_as");
        this(i, i2, new StringBuilder(((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append(valueOf).append("x").append(valueOf2).append(valueOf3).toString());
    }

    AdSize(int i, int i2, String str) {
        if (i < 0 && i != -1 && i != -3) {
            throw new IllegalArgumentException("Invalid width for AdSize: " + i);
        } else if (i2 >= 0 || i2 == -2 || i2 == -4) {
            this.zzpi = i;
            this.zzpj = i2;
            this.zzpk = str;
        } else {
            throw new IllegalArgumentException("Invalid height for AdSize: " + i2);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdSize)) {
            return false;
        }
        AdSize adSize = (AdSize) obj;
        return this.zzpi == adSize.zzpi && this.zzpj == adSize.zzpj && this.zzpk.equals(adSize.zzpk);
    }

    public int getHeight() {
        return this.zzpj;
    }

    public int getHeightInPixels(Context context) {
        switch (this.zzpj) {
            case DatabaseError.DISCONNECTED /*-4*/:
            case DatabaseError.PERMISSION_DENIED /*-3*/:
                return -1;
            case -2:
                return AdSizeParcel.zzb(context.getResources().getDisplayMetrics());
            default:
                return zzm.zzdQ().zza(context, this.zzpj);
        }
    }

    public int getWidth() {
        return this.zzpi;
    }

    public int getWidthInPixels(Context context) {
        switch (this.zzpi) {
            case DatabaseError.DISCONNECTED /*-4*/:
            case DatabaseError.PERMISSION_DENIED /*-3*/:
                return -1;
            case -1:
                return AdSizeParcel.zza(context.getResources().getDisplayMetrics());
            default:
                return zzm.zzdQ().zza(context, this.zzpi);
        }
    }

    public int hashCode() {
        return this.zzpk.hashCode();
    }

    public boolean isAutoHeight() {
        return this.zzpj == -2;
    }

    public boolean isFluid() {
        return this.zzpi == -3 && this.zzpj == -4;
    }

    public boolean isFullWidth() {
        return this.zzpi == -1;
    }

    public String toString() {
        return this.zzpk;
    }
}
