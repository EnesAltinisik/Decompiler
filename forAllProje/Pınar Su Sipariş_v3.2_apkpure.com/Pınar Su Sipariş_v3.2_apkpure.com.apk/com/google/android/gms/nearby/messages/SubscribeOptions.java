package com.google.android.gms.nearby.messages;

import com.google.android.gms.common.internal.zzaa;

public final class SubscribeOptions {
    public static final SubscribeOptions DEFAULT = new Builder().build();
    private final Strategy zzbiW;
    private final MessageFilter zzbji;
    private final SubscribeCallback zzbjj;
    public final boolean zzbjk;

    public static class Builder {
        private Strategy zzbiW = Strategy.DEFAULT;
        private MessageFilter zzbji = MessageFilter.INCLUDE_ALL_MY_TYPES;
        private SubscribeCallback zzbjj;

        public SubscribeOptions build() {
            return new SubscribeOptions(this.zzbiW, this.zzbji, this.zzbjj, false);
        }

        public Builder setCallback(SubscribeCallback subscribeCallback) {
            this.zzbjj = (SubscribeCallback) zzaa.zzz(subscribeCallback);
            return this;
        }

        public Builder setFilter(MessageFilter messageFilter) {
            this.zzbji = messageFilter;
            return this;
        }

        public Builder setStrategy(Strategy strategy) {
            this.zzbiW = strategy;
            return this;
        }
    }

    private SubscribeOptions(Strategy strategy, MessageFilter messageFilter, SubscribeCallback subscribeCallback, boolean z) {
        this.zzbiW = strategy;
        this.zzbji = messageFilter;
        this.zzbjj = subscribeCallback;
        this.zzbjk = z;
    }

    public SubscribeCallback getCallback() {
        return this.zzbjj;
    }

    public MessageFilter getFilter() {
        return this.zzbji;
    }

    public Strategy getStrategy() {
        return this.zzbiW;
    }
}
