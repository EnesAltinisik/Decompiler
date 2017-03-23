package com.google.android.gms.games.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.games.internal.PopupManager.PopupLocationInfo;

public final class PopupLocationInfoParcelable extends AbstractSafeParcelable {
    public static final PopupLocationInfoParcelableCreator CREATOR = new PopupLocationInfoParcelableCreator();
    private final int mVersionCode;
    private final Bundle zzaMF;
    private final IBinder zzaMG;

    PopupLocationInfoParcelable(int i, Bundle bundle, IBinder iBinder) {
        this.mVersionCode = i;
        this.zzaMF = bundle;
        this.zzaMG = iBinder;
    }

    public PopupLocationInfoParcelable(PopupLocationInfo popupLocationInfo) {
        this.mVersionCode = 1;
        this.zzaMF = popupLocationInfo.zzAA();
        this.zzaMG = popupLocationInfo.zzaMJ;
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public IBinder getWindowToken() {
        return this.zzaMG;
    }

    public void writeToParcel(Parcel parcel, int i) {
        PopupLocationInfoParcelableCreator.zza(this, parcel, i);
    }

    public Bundle zzAA() {
        return this.zzaMF;
    }
}
