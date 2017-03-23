package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.zzig;

@zzig
public final class SearchAdRequestParcel extends AbstractSafeParcelable {
    public static final zzao CREATOR = new zzao();
    public final int backgroundColor;
    public final int versionCode;
    public final int zzwA;
    public final int zzwB;
    public final int zzwC;
    public final int zzwD;
    public final int zzwE;
    public final int zzwF;
    public final int zzwG;
    public final String zzwH;
    public final int zzwI;
    public final String zzwJ;
    public final int zzwK;
    public final int zzwL;
    public final String zzwM;

    SearchAdRequestParcel(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, String str, int i10, String str2, int i11, int i12, String str3) {
        this.versionCode = i;
        this.zzwA = i2;
        this.backgroundColor = i3;
        this.zzwB = i4;
        this.zzwC = i5;
        this.zzwD = i6;
        this.zzwE = i7;
        this.zzwF = i8;
        this.zzwG = i9;
        this.zzwH = str;
        this.zzwI = i10;
        this.zzwJ = str2;
        this.zzwK = i11;
        this.zzwL = i12;
        this.zzwM = str3;
    }

    public SearchAdRequestParcel(SearchAdRequest searchAdRequest) {
        this.versionCode = 1;
        this.zzwA = searchAdRequest.getAnchorTextColor();
        this.backgroundColor = searchAdRequest.getBackgroundColor();
        this.zzwB = searchAdRequest.getBackgroundGradientBottom();
        this.zzwC = searchAdRequest.getBackgroundGradientTop();
        this.zzwD = searchAdRequest.getBorderColor();
        this.zzwE = searchAdRequest.getBorderThickness();
        this.zzwF = searchAdRequest.getBorderType();
        this.zzwG = searchAdRequest.getCallButtonColor();
        this.zzwH = searchAdRequest.getCustomChannels();
        this.zzwI = searchAdRequest.getDescriptionTextColor();
        this.zzwJ = searchAdRequest.getFontFace();
        this.zzwK = searchAdRequest.getHeaderTextColor();
        this.zzwL = searchAdRequest.getHeaderTextSize();
        this.zzwM = searchAdRequest.getQuery();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzao.zza(this, parcel, i);
    }
}
