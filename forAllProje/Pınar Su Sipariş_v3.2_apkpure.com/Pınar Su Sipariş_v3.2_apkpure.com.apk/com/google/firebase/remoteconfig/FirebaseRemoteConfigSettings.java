package com.google.firebase.remoteconfig;

public class FirebaseRemoteConfigSettings {
    private final boolean zzbTq;

    public static class Builder {
        private boolean zzbTq = false;

        public FirebaseRemoteConfigSettings build() {
            return new FirebaseRemoteConfigSettings();
        }

        public Builder setDeveloperModeEnabled(boolean z) {
            this.zzbTq = z;
            return this;
        }
    }

    private FirebaseRemoteConfigSettings(Builder builder) {
        this.zzbTq = builder.zzbTq;
    }

    public boolean isDeveloperModeEnabled() {
        return this.zzbTq;
    }
}
