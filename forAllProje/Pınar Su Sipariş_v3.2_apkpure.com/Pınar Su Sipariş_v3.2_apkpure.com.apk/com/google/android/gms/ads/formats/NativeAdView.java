package com.google.android.gms.ads.formats;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzdl;

public abstract class NativeAdView extends FrameLayout {
    private final FrameLayout zzpC;
    private final zzdl zzpD = zzbc();

    public NativeAdView(Context context) {
        super(context);
        this.zzpC = zzf(context);
    }

    public NativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zzpC = zzf(context);
    }

    public NativeAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.zzpC = zzf(context);
    }

    public NativeAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.zzpC = zzf(context);
    }

    private zzdl zzbc() {
        zzaa.zzb(this.zzpC, (Object) "createDelegate must be called after mOverlayFrame has been created");
        return zzm.zzdR().zza(this.zzpC.getContext(), (FrameLayout) this, this.zzpC);
    }

    private FrameLayout zzf(Context context) {
        View zzg = zzg(context);
        zzg.setLayoutParams(new LayoutParams(-1, -1));
        addView(zzg);
        return zzg;
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.zzpC);
    }

    public void bringChildToFront(View view) {
        super.bringChildToFront(view);
        if (this.zzpC != view) {
            super.bringChildToFront(this.zzpC);
        }
    }

    public void destroy() {
        try {
            this.zzpD.destroy();
        } catch (Throwable e) {
            zzb.zzb("Unable to destroy native ad view", e);
        }
    }

    public void removeAllViews() {
        super.removeAllViews();
        super.addView(this.zzpC);
    }

    public void removeView(View view) {
        if (this.zzpC != view) {
            super.removeView(view);
        }
    }

    public void setNativeAd(NativeAd nativeAd) {
        try {
            this.zzpD.zze((zzd) nativeAd.zzbb());
        } catch (Throwable e) {
            zzb.zzb("Unable to call setNativeAd on delegate", e);
        }
    }

    protected void zza(String str, View view) {
        try {
            this.zzpD.zzc(str, zze.zzD(view));
        } catch (Throwable e) {
            zzb.zzb("Unable to call setAssetView on delegate", e);
        }
    }

    FrameLayout zzg(Context context) {
        return new FrameLayout(context);
    }

    protected View zzq(String str) {
        try {
            zzd zzP = this.zzpD.zzP(str);
            if (zzP != null) {
                return (View) zze.zzx(zzP);
            }
        } catch (Throwable e) {
            zzb.zzb("Unable to call getAssetView on delegate", e);
        }
        return null;
    }
}
