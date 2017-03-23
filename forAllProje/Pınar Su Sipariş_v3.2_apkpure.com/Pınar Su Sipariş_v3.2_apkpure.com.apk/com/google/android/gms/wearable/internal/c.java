package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.ChannelApi.ChannelListener;

final class c implements ChannelListener {
    private final String a;
    private final ChannelListener b;

    c(String str, ChannelListener channelListener) {
        this.a = (String) zzaa.zzz(str);
        this.b = (ChannelListener) zzaa.zzz(channelListener);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.b.equals(cVar.b) && this.a.equals(cVar.a);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public void onChannelClosed(Channel channel, int i, int i2) {
        this.b.onChannelClosed(channel, i, i2);
    }

    public void onChannelOpened(Channel channel) {
        this.b.onChannelOpened(channel);
    }

    public void onInputClosed(Channel channel, int i, int i2) {
        this.b.onInputClosed(channel, i, i2);
    }

    public void onOutputClosed(Channel channel, int i, int i2) {
        this.b.onOutputClosed(channel, i, i2);
    }
}
