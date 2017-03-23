package com.google.android.gms.internal;

public class zzama {
    private final byte[] zzbZN = new byte[256];
    private int zzbZO;
    private int zzbZP;

    public zzama(byte[] bArr) {
        int i;
        for (i = 0; i < 256; i++) {
            this.zzbZN[i] = (byte) i;
        }
        i = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            i = ((i + this.zzbZN[i2]) + bArr[i2 % bArr.length]) & 255;
            byte b = this.zzbZN[i2];
            this.zzbZN[i2] = this.zzbZN[i];
            this.zzbZN[i] = b;
        }
        this.zzbZO = 0;
        this.zzbZP = 0;
    }

    public void zzM(byte[] bArr) {
        int i = this.zzbZO;
        int i2 = this.zzbZP;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            i = (i + 1) & 255;
            i2 = (i2 + this.zzbZN[i]) & 255;
            byte b = this.zzbZN[i];
            this.zzbZN[i] = this.zzbZN[i2];
            this.zzbZN[i2] = b;
            bArr[i3] = (byte) (bArr[i3] ^ this.zzbZN[(this.zzbZN[i] + this.zzbZN[i2]) & 255]);
        }
        this.zzbZO = i;
        this.zzbZP = i2;
    }
}
