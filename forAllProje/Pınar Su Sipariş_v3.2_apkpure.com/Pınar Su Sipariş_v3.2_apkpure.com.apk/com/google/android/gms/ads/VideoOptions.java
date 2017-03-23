package com.google.android.gms.ads;

import com.google.android.gms.internal.zzig;

@zzig
public final class VideoOptions {
    private final boolean zzps;

    public static final class Builder {
        private boolean zzps = false;

        public VideoOptions build() {
            return new VideoOptions();
        }

        public Builder setStartMuted(boolean z) {
            this.zzps = z;
            return this;
        }
    }

    private VideoOptions(Builder builder) {
        this.zzps = builder.zzps;
    }

    public boolean getStartMuted() {
        return this.zzps;
    }
}
