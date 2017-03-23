package com.google.android.gms.nearby.messages.devices;

import com.google.android.gms.common.internal.zzaa;

class b extends a {
    public b(byte[] bArr) {
        super(b(bArr));
    }

    private static byte[] b(byte[] bArr) {
        boolean z = bArr.length == 10 || bArr.length == 16;
        zzaa.zzb(z, (Object) "Bytes must be a namespace (10 bytes), or a namespace plus instance (16 bytes).");
        return bArr;
    }

    public String toString() {
        String valueOf = String.valueOf(b());
        return new StringBuilder(String.valueOf(valueOf).length() + 26).append("EddystoneUidPrefix{bytes=").append(valueOf).append("}").toString();
    }
}
