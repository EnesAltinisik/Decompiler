package com.google.android.gms.wearable;

import java.io.IOException;

public class ChannelIOException extends IOException {
    private final int zzbBC;
    private final int zzbBD;

    public ChannelIOException(String str, int i, int i2) {
        super(str);
        this.zzbBC = i;
        this.zzbBD = i2;
    }

    public int getAppSpecificErrorCode() {
        return this.zzbBD;
    }

    public int getCloseReason() {
        return this.zzbBC;
    }
}
