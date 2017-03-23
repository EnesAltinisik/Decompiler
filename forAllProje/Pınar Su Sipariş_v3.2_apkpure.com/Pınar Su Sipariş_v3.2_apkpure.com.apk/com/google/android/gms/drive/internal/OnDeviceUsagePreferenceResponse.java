package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class OnDeviceUsagePreferenceResponse extends AbstractSafeParcelable {
    public static final Creator<OnDeviceUsagePreferenceResponse> CREATOR = new zzau();
    final int mVersionCode;
    final FileUploadPreferencesImpl zzayB;

    OnDeviceUsagePreferenceResponse(int i, FileUploadPreferencesImpl fileUploadPreferencesImpl) {
        this.mVersionCode = i;
        this.zzayB = fileUploadPreferencesImpl;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzau.zza(this, parcel, i);
    }

    public FileUploadPreferencesImpl zzwv() {
        return this.zzayB;
    }
}
