package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.FileUploadPreferences;

public final class FileUploadPreferencesImpl extends AbstractSafeParcelable implements FileUploadPreferences {
    public static final Creator<FileUploadPreferencesImpl> CREATOR = new zzag();
    final int mVersionCode;
    int zzayh;
    int zzayi;
    boolean zzayj;

    FileUploadPreferencesImpl(int i, int i2, int i3, boolean z) {
        this.mVersionCode = i;
        this.zzayh = i2;
        this.zzayi = i3;
        this.zzayj = z;
    }

    public static boolean zzdA(int i) {
        switch (i) {
            case 256:
            case FileUploadPreferences.BATTERY_USAGE_CHARGING_ONLY /*257*/:
                return true;
            default:
                return false;
        }
    }

    public static boolean zzdz(int i) {
        switch (i) {
            case 1:
            case 2:
                return true;
            default:
                return false;
        }
    }

    public int getBatteryUsagePreference() {
        return !zzdA(this.zzayi) ? 0 : this.zzayi;
    }

    public int getNetworkTypePreference() {
        return !zzdz(this.zzayh) ? 0 : this.zzayh;
    }

    public boolean isRoamingAllowed() {
        return this.zzayj;
    }

    public void setBatteryUsagePreference(int i) {
        if (zzdA(i)) {
            this.zzayi = i;
            return;
        }
        throw new IllegalArgumentException("Invalid battery usage preference value.");
    }

    public void setNetworkTypePreference(int i) {
        if (zzdz(i)) {
            this.zzayh = i;
            return;
        }
        throw new IllegalArgumentException("Invalid data connection preference value.");
    }

    public void setRoamingAllowed(boolean z) {
        this.zzayj = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzag.zza(this, parcel, i);
    }
}
