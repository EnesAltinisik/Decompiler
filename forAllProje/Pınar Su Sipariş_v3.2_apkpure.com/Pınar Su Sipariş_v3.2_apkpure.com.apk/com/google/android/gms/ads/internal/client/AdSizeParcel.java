package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Parcel;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.zza;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.zzig;

@zzig
public class AdSizeParcel extends AbstractSafeParcelable {
    public static final zzi CREATOR = new zzi();
    public final int height;
    public final int heightPixels;
    public final int versionCode;
    public final int width;
    public final int widthPixels;
    public final String zzvs;
    public final boolean zzvt;
    public final AdSizeParcel[] zzvu;
    public final boolean zzvv;
    public final boolean zzvw;
    public boolean zzvx;

    public AdSizeParcel() {
        this(5, "interstitial_mb", 0, 0, true, 0, 0, null, false, false, false);
    }

    AdSizeParcel(int i, String str, int i2, int i3, boolean z, int i4, int i5, AdSizeParcel[] adSizeParcelArr, boolean z2, boolean z3, boolean z4) {
        this.versionCode = i;
        this.zzvs = str;
        this.height = i2;
        this.heightPixels = i3;
        this.zzvt = z;
        this.width = i4;
        this.widthPixels = i5;
        this.zzvu = adSizeParcelArr;
        this.zzvv = z2;
        this.zzvw = z3;
        this.zzvx = z4;
    }

    public AdSizeParcel(Context context, AdSize adSize) {
        this(context, new AdSize[]{adSize});
    }

    public AdSizeParcel(Context context, AdSize[] adSizeArr) {
        int i;
        int i2;
        AdSize adSize = adSizeArr[0];
        this.versionCode = 5;
        this.zzvt = false;
        this.zzvw = adSize.isFluid();
        if (this.zzvw) {
            this.width = AdSize.BANNER.getWidth();
            this.height = AdSize.BANNER.getHeight();
        } else {
            this.width = adSize.getWidth();
            this.height = adSize.getHeight();
        }
        boolean z = this.width == -1;
        boolean z2 = this.height == -2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (z) {
            if (zzm.zzdQ().zzR(context) && zzm.zzdQ().zzS(context)) {
                this.widthPixels = zza(displayMetrics) - zzm.zzdQ().zzT(context);
            } else {
                this.widthPixels = zza(displayMetrics);
            }
            double d = (double) (((float) this.widthPixels) / displayMetrics.density);
            i = (int) d;
            if (d - ((double) ((int) d)) >= 0.01d) {
                i++;
            }
            i2 = i;
        } else {
            i = this.width;
            this.widthPixels = zzm.zzdQ().zza(displayMetrics, this.width);
            i2 = i;
        }
        i = z2 ? zzc(displayMetrics) : this.height;
        this.heightPixels = zzm.zzdQ().zza(displayMetrics, i);
        if (z || z2) {
            this.zzvs = i2 + "x" + i + "_as";
        } else if (this.zzvw) {
            this.zzvs = "320x50_mb";
        } else {
            this.zzvs = adSize.toString();
        }
        if (adSizeArr.length > 1) {
            this.zzvu = new AdSizeParcel[adSizeArr.length];
            for (int i3 = 0; i3 < adSizeArr.length; i3++) {
                this.zzvu[i3] = new AdSizeParcel(context, adSizeArr[i3]);
            }
        } else {
            this.zzvu = null;
        }
        this.zzvv = false;
        this.zzvx = false;
    }

    public AdSizeParcel(AdSizeParcel adSizeParcel, AdSizeParcel[] adSizeParcelArr) {
        this(5, adSizeParcel.zzvs, adSizeParcel.height, adSizeParcel.heightPixels, adSizeParcel.zzvt, adSizeParcel.width, adSizeParcel.widthPixels, adSizeParcelArr, adSizeParcel.zzvv, adSizeParcel.zzvw, adSizeParcel.zzvx);
    }

    public static int zza(DisplayMetrics displayMetrics) {
        return displayMetrics.widthPixels;
    }

    public static int zzb(DisplayMetrics displayMetrics) {
        return (int) (((float) zzc(displayMetrics)) * displayMetrics.density);
    }

    private static int zzc(DisplayMetrics displayMetrics) {
        int i = (int) (((float) displayMetrics.heightPixels) / displayMetrics.density);
        return i <= 400 ? 32 : i <= 720 ? 50 : 90;
    }

    public static AdSizeParcel zzdC() {
        return new AdSizeParcel(5, "reward_mb", 0, 0, true, 0, 0, null, false, false, false);
    }

    public static AdSizeParcel zzk(Context context) {
        return new AdSizeParcel(5, "320x50_mb", 0, 0, false, 0, 0, null, true, false, false);
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzi.zza(this, parcel, i);
    }

    public AdSize zzdD() {
        return zza.zza(this.width, this.height, this.zzvs);
    }

    public void zzj(boolean z) {
        this.zzvx = z;
    }
}
