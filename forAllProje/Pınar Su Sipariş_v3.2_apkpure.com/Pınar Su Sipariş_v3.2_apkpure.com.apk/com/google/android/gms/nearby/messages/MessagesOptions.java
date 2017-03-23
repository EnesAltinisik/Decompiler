package com.google.android.gms.nearby.messages;

import com.google.android.gms.common.api.Api.ApiOptions.Optional;

public class MessagesOptions implements Optional {
    public final String zzbiR;
    public final boolean zzbiS;
    public final int zzbiT;
    public final String zzbiU;

    public static class Builder {
        private int zzbiV = -1;

        public MessagesOptions build() {
            return new MessagesOptions();
        }

        public Builder setPermissions(int i) {
            this.zzbiV = i;
            return this;
        }
    }

    private MessagesOptions(Builder builder) {
        this.zzbiR = null;
        this.zzbiS = false;
        this.zzbiT = builder.zzbiV;
        this.zzbiU = null;
    }
}
