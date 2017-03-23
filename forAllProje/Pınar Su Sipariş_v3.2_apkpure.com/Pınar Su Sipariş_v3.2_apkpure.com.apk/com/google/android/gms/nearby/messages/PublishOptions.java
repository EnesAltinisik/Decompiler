package com.google.android.gms.nearby.messages;

import com.google.android.gms.common.internal.zzaa;

public final class PublishOptions {
    public static final PublishOptions DEFAULT = new Builder().build();
    private final Strategy zzbiW;
    private final PublishCallback zzbiX;

    public static class Builder {
        private Strategy zzbiW = Strategy.DEFAULT;
        private PublishCallback zzbiX;

        public PublishOptions build() {
            return new PublishOptions(this.zzbiW, this.zzbiX);
        }

        public Builder setCallback(PublishCallback publishCallback) {
            this.zzbiX = (PublishCallback) zzaa.zzz(publishCallback);
            return this;
        }

        public Builder setStrategy(Strategy strategy) {
            this.zzbiW = (Strategy) zzaa.zzz(strategy);
            return this;
        }
    }

    private PublishOptions(Strategy strategy, PublishCallback publishCallback) {
        this.zzbiW = strategy;
        this.zzbiX = publishCallback;
    }

    public PublishCallback getCallback() {
        return this.zzbiX;
    }

    public Strategy getStrategy() {
        return this.zzbiW;
    }
}
