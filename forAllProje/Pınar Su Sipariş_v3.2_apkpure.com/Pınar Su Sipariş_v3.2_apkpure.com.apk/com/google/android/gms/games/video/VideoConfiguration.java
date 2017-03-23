package com.google.android.gms.games.video;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;

public final class VideoConfiguration extends AbstractSafeParcelable {
    public static final int CAPTURE_MODE_FILE = 0;
    public static final int CAPTURE_MODE_STREAM = 1;
    public static final int CAPTURE_MODE_UNKNOWN = -1;
    public static final Creator<VideoConfiguration> CREATOR = new VideoConfigurationCreator();
    public static final int NUM_CAPTURE_MODE = 2;
    public static final int NUM_QUALITY_LEVEL = 4;
    public static final int QUALITY_LEVEL_FULLHD = 3;
    public static final int QUALITY_LEVEL_HD = 1;
    public static final int QUALITY_LEVEL_SD = 0;
    public static final int QUALITY_LEVEL_UNKNOWN = -1;
    public static final int QUALITY_LEVEL_XHD = 2;
    private final int mVersionCode;
    private final int zzaSB;
    private final String zzaSC;
    private final String zzaSD;
    private final String zzaSE;
    private final String zzaSF;
    private final boolean zzaSG;
    private final int zzaSt;

    public static final class Builder {
        private int zzaSB;
        private String zzaSC = null;
        private String zzaSD = null;
        private String zzaSE = null;
        private String zzaSF = null;
        private boolean zzaSG = true;
        private int zzaSt;

        public Builder(int i, int i2) {
            this.zzaSB = i;
            this.zzaSt = i2;
        }

        public VideoConfiguration build() {
            return new VideoConfiguration(this.zzaSB, this.zzaSt, null, null, null, null, this.zzaSG);
        }

        public Builder setCaptureMode(int i) {
            this.zzaSt = i;
            return this;
        }

        public Builder setQualityLevel(int i) {
            this.zzaSB = i;
            return this;
        }
    }

    public VideoConfiguration(int i, int i2, int i3, String str, String str2, String str3, String str4, boolean z) {
        boolean z2 = true;
        this.mVersionCode = i;
        zzaa.zzaj(isValidQualityLevel(i2, false));
        zzaa.zzaj(isValidCaptureMode(i3, false));
        this.zzaSB = i2;
        this.zzaSt = i3;
        this.zzaSG = z;
        if (i3 == 1) {
            this.zzaSD = str2;
            this.zzaSC = str;
            this.zzaSE = str3;
            this.zzaSF = str4;
            return;
        }
        zzaa.zzb(str2 == null, (Object) "Stream key should be null when not streaming");
        zzaa.zzb(str == null, (Object) "Stream url should be null when not streaming");
        zzaa.zzb(str3 == null, (Object) "Stream title should be null when not streaming");
        if (str4 != null) {
            z2 = false;
        }
        zzaa.zzb(z2, (Object) "Stream description should be null when not streaming");
        this.zzaSD = null;
        this.zzaSC = null;
        this.zzaSE = null;
        this.zzaSF = null;
    }

    private VideoConfiguration(int i, int i2, String str, String str2, String str3, String str4, boolean z) {
        this(2, i, i2, str, str2, str3, str4, z);
    }

    public static boolean isValidCaptureMode(int i, boolean z) {
        switch (i) {
            case -1:
                return z;
            case 0:
            case 1:
                return true;
            default:
                return false;
        }
    }

    public static boolean isValidQualityLevel(int i, boolean z) {
        switch (i) {
            case -1:
                return z;
            case 0:
            case 1:
            case 2:
            case 3:
                return true;
            default:
                return false;
        }
    }

    public int getCaptureMode() {
        return this.zzaSt;
    }

    public int getQualityLevel() {
        return this.zzaSB;
    }

    public String getStreamUrl() {
        return this.zzaSC;
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        VideoConfigurationCreator.zza(this, parcel, i);
    }

    public String zzBG() {
        return this.zzaSD;
    }

    public String zzBH() {
        return this.zzaSE;
    }

    public String zzBI() {
        return this.zzaSF;
    }

    public boolean zzBJ() {
        return this.zzaSG;
    }
}
