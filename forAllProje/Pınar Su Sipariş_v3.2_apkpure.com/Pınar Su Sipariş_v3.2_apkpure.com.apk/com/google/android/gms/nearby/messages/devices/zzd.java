package com.google.android.gms.nearby.messages.devices;

import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzz;
import java.util.UUID;

public class zzd {
    private final c zzbjo;

    public zzd(byte[] bArr) {
        this.zzbjo = new c(zzw(bArr));
    }

    private static byte[] zzw(byte[] bArr) {
        zzaa.zzb(bArr.length == 20, (Object) "iBeacon ID must be a UUID, a major, and a minor (20 total bytes).");
        return bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzd)) {
            return false;
        }
        return zzz.equal(this.zzbjo, ((zzd) obj).zzbjo);
    }

    public int hashCode() {
        return zzz.hashCode(this.zzbjo);
    }

    public String toString() {
        String valueOf = String.valueOf(zzHR());
        short zzHS = zzHS();
        return new StringBuilder(String.valueOf(valueOf).length() + 53).append("IBeaconId{proximityUuid=").append(valueOf).append(", major=").append(zzHS).append(", minor=").append(zzHT()).append("}").toString();
    }

    public UUID zzHR() {
        return this.zzbjo.c();
    }

    public short zzHS() {
        return this.zzbjo.d().shortValue();
    }

    public short zzHT() {
        return this.zzbjo.e().shortValue();
    }
}
