package com.google.android.gms.games.video;

import android.os.Bundle;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzz;

public final class CaptureState {
    private final boolean zzaSs;
    private final int zzaSt;
    private final int zzaSu;
    private final boolean zzaSv;
    private final boolean zzrF;

    private CaptureState(boolean z, int i, int i2, boolean z2, boolean z3) {
        zzaa.zzaj(VideoConfiguration.isValidCaptureMode(i, true));
        zzaa.zzaj(VideoConfiguration.isValidQualityLevel(i2, true));
        this.zzaSs = z;
        this.zzaSt = i;
        this.zzaSu = i2;
        this.zzaSv = z2;
        this.zzrF = z3;
    }

    public static CaptureState zzy(Bundle bundle) {
        return (bundle == null || bundle.get("IsCapturing") == null) ? null : new CaptureState(bundle.getBoolean("IsCapturing", false), bundle.getInt("CaptureMode", -1), bundle.getInt("CaptureQuality", -1), bundle.getBoolean("IsOverlayVisible", false), bundle.getBoolean("IsPaused", false));
    }

    public int getCaptureMode() {
        return this.zzaSt;
    }

    public int getCaptureQuality() {
        return this.zzaSu;
    }

    public boolean isCapturing() {
        return this.zzaSs;
    }

    public boolean isOverlayVisible() {
        return this.zzaSv;
    }

    public boolean isPaused() {
        return this.zzrF;
    }

    public String toString() {
        return zzz.zzy(this).zzg("IsCapturing", Boolean.valueOf(this.zzaSs)).zzg("CaptureMode", Integer.valueOf(this.zzaSt)).zzg("CaptureQuality", Integer.valueOf(this.zzaSu)).zzg("IsOverlayVisible", Boolean.valueOf(this.zzaSv)).zzg("IsPaused", Boolean.valueOf(this.zzrF)).toString();
    }
}
