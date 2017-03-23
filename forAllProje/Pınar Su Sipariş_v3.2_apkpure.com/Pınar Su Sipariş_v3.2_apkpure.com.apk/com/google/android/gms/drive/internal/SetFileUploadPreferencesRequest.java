package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class SetFileUploadPreferencesRequest extends AbstractSafeParcelable {
    public static final Creator<SetFileUploadPreferencesRequest> CREATOR = new zzbo();
    final int mVersionCode;
    final FileUploadPreferencesImpl zzayB;

    SetFileUploadPreferencesRequest(int i, FileUploadPreferencesImpl fileUploadPreferencesImpl) {
        this.mVersionCode = i;
        this.zzayB = fileUploadPreferencesImpl;
    }

    public SetFileUploadPreferencesRequest(FileUploadPreferencesImpl fileUploadPreferencesImpl) {
        this(1, fileUploadPreferencesImpl);
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzbo.zza(this, parcel, i);
    }
}
