package com.google.android.gms.ads.formats;

public final class NativeAdOptions {
    public static final int ORIENTATION_ANY = 0;
    public static final int ORIENTATION_LANDSCAPE = 2;
    public static final int ORIENTATION_PORTRAIT = 1;
    private final int zzpA;
    private final boolean zzpB;
    private final boolean zzpz;

    public static final class Builder {
        private int zzpA = 0;
        private boolean zzpB = false;
        private boolean zzpz = false;

        public NativeAdOptions build() {
            return new NativeAdOptions();
        }

        public Builder setImageOrientation(int i) {
            this.zzpA = i;
            return this;
        }

        public Builder setRequestMultipleImages(boolean z) {
            this.zzpB = z;
            return this;
        }

        public Builder setReturnUrlsForImageAssets(boolean z) {
            this.zzpz = z;
            return this;
        }
    }

    private NativeAdOptions(Builder builder) {
        this.zzpz = builder.zzpz;
        this.zzpA = builder.zzpA;
        this.zzpB = builder.zzpB;
    }

    public int getImageOrientation() {
        return this.zzpA;
    }

    public boolean shouldRequestMultipleImages() {
        return this.zzpB;
    }

    public boolean shouldReturnUrlsForImageAssets() {
        return this.zzpz;
    }
}
