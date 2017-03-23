package com.google.android.gms.nearby.messages.devices;

import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzz;

public class zzb {
    private final b zzbjn;

    public zzb(byte[] bArr) {
        this.zzbjn = new b(zzw(bArr));
    }

    private static byte[] zzw(byte[] bArr) {
        zzaa.zzb(bArr.length == 16, (Object) "Bytes must be a namespace plus instance (16 bytes).");
        return bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzb)) {
            return false;
        }
        return zzz.equal(this.zzbjn, ((zzb) obj).zzbjn);
    }

    public int hashCode() {
        return zzz.hashCode(this.zzbjn);
    }

    public String toString() {
        String valueOf = String.valueOf(zzHQ());
        return new StringBuilder(String.valueOf(valueOf).length() + 17).append("EddystoneUid{id=").append(valueOf).append("}").toString();
    }

    public String zzHQ() {
        return this.zzbjn.b();
    }
}
