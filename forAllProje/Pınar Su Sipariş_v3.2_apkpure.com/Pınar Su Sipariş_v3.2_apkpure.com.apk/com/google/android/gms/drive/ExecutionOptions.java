package com.google.android.gms.drive;

import android.text.TextUtils;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.drive.internal.zzu;

public class ExecutionOptions {
    public static final int CONFLICT_STRATEGY_KEEP_REMOTE = 1;
    public static final int CONFLICT_STRATEGY_OVERWRITE_REMOTE = 0;
    public static final int MAX_TRACKING_TAG_STRING_LENGTH = 65536;
    private final String zzavv;
    private final boolean zzavw;
    private final int zzavx;

    public static class Builder {
        protected String zzavv;
        protected boolean zzavw;
        protected int zzavx = 0;

        public ExecutionOptions build() {
            zzvN();
            return new ExecutionOptions(this.zzavv, this.zzavw, this.zzavx);
        }

        public Builder setConflictStrategy(int i) {
            if (ExecutionOptions.zzcM(i)) {
                this.zzavx = i;
                return this;
            }
            throw new IllegalArgumentException("Unrecognized value for conflict strategy: " + i);
        }

        public Builder setNotifyOnCompletion(boolean z) {
            this.zzavw = z;
            return this;
        }

        public Builder setTrackingTag(String str) {
            if (ExecutionOptions.zzdx(str)) {
                this.zzavv = str;
                return this;
            }
            throw new IllegalArgumentException(String.format("trackingTag must not be null nor empty, and the length must be <= the maximum length (%s)", new Object[]{Integer.valueOf(65536)}));
        }

        protected void zzvN() {
            if (this.zzavx == 1 && !this.zzavw) {
                throw new IllegalStateException("Cannot use CONFLICT_STRATEGY_KEEP_REMOTE without requesting completion notifications");
            }
        }
    }

    public ExecutionOptions(String str, boolean z, int i) {
        this.zzavv = str;
        this.zzavw = z;
        this.zzavx = i;
    }

    public static boolean zzcL(int i) {
        switch (i) {
            case 1:
                return true;
            default:
                return false;
        }
    }

    public static boolean zzcM(int i) {
        switch (i) {
            case 0:
            case 1:
                return true;
            default:
                return false;
        }
    }

    public static boolean zzdx(String str) {
        return !TextUtils.isEmpty(str) && str.length() <= 65536;
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ExecutionOptions executionOptions = (ExecutionOptions) obj;
        return zzz.equal(this.zzavv, executionOptions.zzavv) && this.zzavx == executionOptions.zzavx && this.zzavw == executionOptions.zzavw;
    }

    public int hashCode() {
        return zzz.hashCode(this.zzavv, Integer.valueOf(this.zzavx), Boolean.valueOf(this.zzavw));
    }

    public void zzg(GoogleApiClient googleApiClient) {
        zzu com_google_android_gms_drive_internal_zzu = (zzu) googleApiClient.zza(Drive.zzaaz);
        if (zzvL() && !com_google_android_gms_drive_internal_zzu.zzwr()) {
            throw new IllegalStateException("Application must define an exported DriveEventService subclass in AndroidManifest.xml to be notified on completion");
        }
    }

    public String zzvK() {
        return this.zzavv;
    }

    public boolean zzvL() {
        return this.zzavw;
    }

    public int zzvM() {
        return this.zzavx;
    }
}
