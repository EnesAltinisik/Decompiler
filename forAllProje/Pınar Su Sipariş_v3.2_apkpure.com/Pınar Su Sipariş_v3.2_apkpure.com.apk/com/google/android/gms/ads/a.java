package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzae;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;

class a extends ViewGroup {
    protected final zzae zzpl;

    public a(Context context, int i) {
        super(context);
        this.zzpl = new zzae(this, zze(i));
    }

    public a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.zzpl = new zzae(this, attributeSet, false, zze(i));
    }

    public a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.zzpl = new zzae(this, attributeSet, false, zze(i2));
    }

    private static boolean zze(int i) {
        return i == 2;
    }

    public void destroy() {
        this.zzpl.destroy();
    }

    public AdListener getAdListener() {
        return this.zzpl.getAdListener();
    }

    public AdSize getAdSize() {
        return this.zzpl.getAdSize();
    }

    public String getAdUnitId() {
        return this.zzpl.getAdUnitId();
    }

    public InAppPurchaseListener getInAppPurchaseListener() {
        return this.zzpl.getInAppPurchaseListener();
    }

    public String getMediationAdapterClassName() {
        return this.zzpl.getMediationAdapterClassName();
    }

    public boolean isLoading() {
        return this.zzpl.isLoading();
    }

    public void loadAd(AdRequest adRequest) {
        this.zzpl.zza(adRequest.zzaX());
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getVisibility() != 8) {
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = ((i3 - i) - measuredWidth) / 2;
            int i6 = ((i4 - i2) - measuredHeight) / 2;
            childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
        }
    }

    protected void onMeasure(int i, int i2) {
        int widthInPixels;
        int i3 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            AdSize adSize = getAdSize();
            if (adSize != null) {
                Context context = getContext();
                widthInPixels = adSize.getWidthInPixels(context);
                i3 = adSize.getHeightInPixels(context);
            } else {
                widthInPixels = 0;
            }
        } else {
            measureChild(childAt, i, i2);
            widthInPixels = childAt.getMeasuredWidth();
            i3 = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(widthInPixels, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(i3, getSuggestedMinimumHeight()), i2));
    }

    public void pause() {
        this.zzpl.pause();
    }

    public void resume() {
        this.zzpl.resume();
    }

    public void setAdListener(AdListener adListener) {
        this.zzpl.setAdListener(adListener);
        if (adListener != null && (adListener instanceof zza)) {
            this.zzpl.zza((zza) adListener);
        } else if (adListener == null) {
            this.zzpl.zza(null);
        }
    }

    public void setAdSize(AdSize adSize) {
        this.zzpl.setAdSizes(adSize);
    }

    public void setAdUnitId(String str) {
        this.zzpl.setAdUnitId(str);
    }

    public void setInAppPurchaseListener(InAppPurchaseListener inAppPurchaseListener) {
        this.zzpl.setInAppPurchaseListener(inAppPurchaseListener);
    }

    public void setPlayStorePurchaseParams(PlayStorePurchaseListener playStorePurchaseListener, String str) {
        this.zzpl.setPlayStorePurchaseParams(playStorePurchaseListener, str);
    }
}
