package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.ChannelApi.ChannelListener;

public final class ChannelEventParcelable extends AbstractSafeParcelable {
    public static final Creator<ChannelEventParcelable> CREATOR = new zzn();
    final int mVersionCode;
    final int type;
    final int zzbCH;
    final int zzbCI;
    final ChannelImpl zzbCJ;

    ChannelEventParcelable(int i, ChannelImpl channelImpl, int i2, int i3, int i4) {
        this.mVersionCode = i;
        this.zzbCJ = channelImpl;
        this.type = i2;
        this.zzbCH = i3;
        this.zzbCI = i4;
    }

    private static String zzmB(int i) {
        switch (i) {
            case 1:
                return "CHANNEL_OPENED";
            case 2:
                return "CHANNEL_CLOSED";
            case 3:
                return "INPUT_CLOSED";
            case 4:
                return "OUTPUT_CLOSED";
            default:
                return Integer.toString(i);
        }
    }

    private static String zzmC(int i) {
        switch (i) {
            case 0:
                return "CLOSE_REASON_NORMAL";
            case 1:
                return "CLOSE_REASON_DISCONNECTED";
            case 2:
                return "CLOSE_REASON_REMOTE_CLOSE";
            case 3:
                return "CLOSE_REASON_LOCAL_CLOSE";
            default:
                return Integer.toString(i);
        }
    }

    public String toString() {
        int i = this.mVersionCode;
        String valueOf = String.valueOf(this.zzbCJ);
        String valueOf2 = String.valueOf(zzmB(this.type));
        String valueOf3 = String.valueOf(zzmC(this.zzbCH));
        return new StringBuilder(((String.valueOf(valueOf).length() + 104) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("ChannelEventParcelable[versionCode=").append(i).append(", channel=").append(valueOf).append(", type=").append(valueOf2).append(", closeReason=").append(valueOf3).append(", appErrorCode=").append(this.zzbCI).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzn.zza(this, parcel, i);
    }

    public void zza(ChannelListener channelListener) {
        switch (this.type) {
            case 1:
                channelListener.onChannelOpened(this.zzbCJ);
                return;
            case 2:
                channelListener.onChannelClosed(this.zzbCJ, this.zzbCH, this.zzbCI);
                return;
            case 3:
                channelListener.onInputClosed(this.zzbCJ, this.zzbCH, this.zzbCI);
                return;
            case 4:
                channelListener.onOutputClosed(this.zzbCJ, this.zzbCH, this.zzbCI);
                return;
            default:
                Log.w("ChannelEventParcelable", "Unknown type: " + this.type);
                return;
        }
    }
}
