package com.google.android.gms.internal;

import java.io.IOException;
import java.util.Arrays;

public abstract class zzamj {
    public static final int UNSET_ENUM_VALUE = Integer.MIN_VALUE;
    protected volatile int zzcaj = -1;

    public static final <T extends zzamj> T mergeFrom(T t, byte[] bArr) throws zzami {
        return mergeFrom(t, bArr, 0, bArr.length);
    }

    public static final <T extends zzamj> T mergeFrom(T t, byte[] bArr, int i, int i2) throws zzami {
        try {
            zzamb zza = zzamb.zza(bArr, i, i2);
            t.mergeFrom(zza);
            zza.zznT(0);
            return t;
        } catch (zzami e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
    }

    public static final boolean messageNanoEquals(zzamj com_google_android_gms_internal_zzamj, zzamj com_google_android_gms_internal_zzamj2) {
        if (com_google_android_gms_internal_zzamj == com_google_android_gms_internal_zzamj2) {
            return true;
        }
        if (com_google_android_gms_internal_zzamj == null || com_google_android_gms_internal_zzamj2 == null || com_google_android_gms_internal_zzamj.getClass() != com_google_android_gms_internal_zzamj2.getClass()) {
            return false;
        }
        int serializedSize = com_google_android_gms_internal_zzamj.getSerializedSize();
        if (com_google_android_gms_internal_zzamj2.getSerializedSize() != serializedSize) {
            return false;
        }
        byte[] bArr = new byte[serializedSize];
        byte[] bArr2 = new byte[serializedSize];
        toByteArray(com_google_android_gms_internal_zzamj, bArr, 0, serializedSize);
        toByteArray(com_google_android_gms_internal_zzamj2, bArr2, 0, serializedSize);
        return Arrays.equals(bArr, bArr2);
    }

    public static final void toByteArray(zzamj com_google_android_gms_internal_zzamj, byte[] bArr, int i, int i2) {
        try {
            zzamc zzb = zzamc.zzb(bArr, i, i2);
            com_google_android_gms_internal_zzamj.writeTo(zzb);
            zzb.zzWU();
        } catch (Throwable e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    public static final byte[] toByteArray(zzamj com_google_android_gms_internal_zzamj) {
        byte[] bArr = new byte[com_google_android_gms_internal_zzamj.getSerializedSize()];
        toByteArray(com_google_android_gms_internal_zzamj, bArr, 0, bArr.length);
        return bArr;
    }

    public zzamj clone() throws CloneNotSupportedException {
        return (zzamj) super.clone();
    }

    public int getCachedSize() {
        if (this.zzcaj < 0) {
            getSerializedSize();
        }
        return this.zzcaj;
    }

    public int getSerializedSize() {
        int zzy = zzy();
        this.zzcaj = zzy;
        return zzy;
    }

    public abstract zzamj mergeFrom(zzamb com_google_android_gms_internal_zzamb) throws IOException;

    public String toString() {
        return zzamk.zzf(this);
    }

    public void writeTo(zzamc com_google_android_gms_internal_zzamc) throws IOException {
    }

    protected int zzy() {
        return 0;
    }
}
