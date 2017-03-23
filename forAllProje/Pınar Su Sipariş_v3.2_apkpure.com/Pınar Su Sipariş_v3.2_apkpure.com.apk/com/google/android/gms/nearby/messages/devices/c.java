package com.google.android.gms.nearby.messages.devices;

import com.google.android.gms.common.internal.zzaa;
import java.nio.ByteBuffer;
import java.util.UUID;

class c extends a {
    public c(byte[] bArr) {
        super(b(bArr));
    }

    private static byte[] b(byte[] bArr) {
        boolean z = bArr.length == 16 || bArr.length == 18 || bArr.length == 20;
        zzaa.zzb(z, (Object) "Prefix must be a UUID, a UUID and a major, or a UUID, a major, and a minor.");
        return bArr;
    }

    public UUID c() {
        ByteBuffer wrap = ByteBuffer.wrap(a());
        return new UUID(wrap.getLong(), wrap.getLong());
    }

    public Short d() {
        byte[] a = a();
        return a.length >= 18 ? Short.valueOf(ByteBuffer.wrap(a).getShort(16)) : null;
    }

    public Short e() {
        byte[] a = a();
        return a.length == 20 ? Short.valueOf(ByteBuffer.wrap(a).getShort(18)) : null;
    }

    public String toString() {
        String valueOf = String.valueOf(c());
        String valueOf2 = String.valueOf(d());
        String valueOf3 = String.valueOf(e());
        return new StringBuilder(((String.valueOf(valueOf).length() + 47) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("IBeaconIdPrefix{proximityUuid=").append(valueOf).append(", major=").append(valueOf2).append(", minor=").append(valueOf3).append("}").toString();
    }
}
