package com.google.android.gms.games.video;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzz;

public final class VideoCapabilities extends AbstractSafeParcelable {
    public static final Creator<VideoCapabilities> CREATOR = new VideoCapabilitiesCreator();
    private final int mVersionCode;
    private final boolean[] zzaSA;
    private final boolean zzaSw;
    private final boolean zzaSx;
    private final boolean zzaSy;
    private final boolean[] zzaSz;

    public VideoCapabilities(int i, boolean z, boolean z2, boolean z3, boolean[] zArr, boolean[] zArr2) {
        this.mVersionCode = i;
        this.zzaSw = z;
        this.zzaSx = z2;
        this.zzaSy = z3;
        this.zzaSz = zArr;
        this.zzaSA = zArr2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof VideoCapabilities)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        VideoCapabilities videoCapabilities = (VideoCapabilities) obj;
        return zzz.equal(videoCapabilities.zzBE(), zzBE()) && zzz.equal(videoCapabilities.zzBF(), zzBF()) && zzz.equal(Boolean.valueOf(videoCapabilities.isCameraSupported()), Boolean.valueOf(isCameraSupported())) && zzz.equal(Boolean.valueOf(videoCapabilities.isMicSupported()), Boolean.valueOf(isMicSupported())) && zzz.equal(Boolean.valueOf(videoCapabilities.isWriteStorageSupported()), Boolean.valueOf(isWriteStorageSupported()));
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public int hashCode() {
        return zzz.hashCode(zzBE(), zzBF(), Boolean.valueOf(isCameraSupported()), Boolean.valueOf(isMicSupported()), Boolean.valueOf(isWriteStorageSupported()));
    }

    public boolean isCameraSupported() {
        return this.zzaSw;
    }

    public boolean isFullySupported(int i, int i2) {
        return this.zzaSw && this.zzaSx && this.zzaSy && supportsCaptureMode(i) && supportsQualityLevel(i2);
    }

    public boolean isMicSupported() {
        return this.zzaSx;
    }

    public boolean isWriteStorageSupported() {
        return this.zzaSy;
    }

    public boolean supportsCaptureMode(int i) {
        zzaa.zzai(VideoConfiguration.isValidCaptureMode(i, false));
        return this.zzaSz[i];
    }

    public boolean supportsQualityLevel(int i) {
        zzaa.zzai(VideoConfiguration.isValidQualityLevel(i, false));
        return this.zzaSA[i];
    }

    public String toString() {
        return zzz.zzy(this).zzg("SupportedCaptureModes", zzBE()).zzg("SupportedQualityLevels", zzBF()).zzg("CameraSupported", Boolean.valueOf(isCameraSupported())).zzg("MicSupported", Boolean.valueOf(isMicSupported())).zzg("StorageWriteSupported", Boolean.valueOf(isWriteStorageSupported())).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        VideoCapabilitiesCreator.zza(this, parcel, i);
    }

    public boolean[] zzBE() {
        return this.zzaSz;
    }

    public boolean[] zzBF() {
        return this.zzaSA;
    }
}
