package com.google.android.gms.internal;

import com.google.android.gms.games.request.GameRequest;
import java.security.MessageDigest;

@zzig
public class zzck extends zzch {
    private MessageDigest zzuI;

    public byte[] zzA(String str) {
        byte[] bArr;
        int i = 4;
        byte[] zza = zza(str.split(" "));
        this.zzuI = zzdy();
        synchronized (this.zzpp) {
            if (this.zzuI == null) {
                bArr = new byte[0];
            } else {
                this.zzuI.reset();
                this.zzuI.update(zza);
                Object digest = this.zzuI.digest();
                if (digest.length <= 4) {
                    i = digest.length;
                }
                bArr = new byte[i];
                System.arraycopy(digest, 0, bArr, 0, bArr.length);
            }
        }
        return bArr;
    }

    byte[] zza(String[] strArr) {
        int i = 0;
        if (strArr.length == 1) {
            return zzcj.zzl(zzcj.zzC(strArr[0]));
        }
        if (strArr.length < 5) {
            byte[] bArr = new byte[(strArr.length * 2)];
            for (int i2 = 0; i2 < strArr.length; i2++) {
                byte[] zzo = zzo(zzcj.zzC(strArr[i2]));
                bArr[i2 * 2] = zzo[0];
                bArr[(i2 * 2) + 1] = zzo[1];
            }
            return bArr;
        }
        byte[] bArr2 = new byte[strArr.length];
        while (i < strArr.length) {
            bArr2[i] = zzn(zzcj.zzC(strArr[i]));
            i++;
        }
        return bArr2;
    }

    byte zzn(int i) {
        return (byte) ((((i & 255) ^ ((65280 & i) >> 8)) ^ ((16711680 & i) >> 16)) ^ ((-16777216 & i) >> 24));
    }

    byte[] zzo(int i) {
        int i2 = (GameRequest.TYPE_ALL & i) ^ ((-65536 & i) >> 16);
        return new byte[]{(byte) i2, (byte) (i2 >> 8)};
    }
}
