package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class zzas {
    private static Cipher zzor = null;
    private static final Object zzos = new Object();
    private static final Object zzot = new Object();
    private final SecureRandom zzoq;

    public class zza extends Exception {
        final /* synthetic */ zzas zzou;

        public zza(zzas com_google_android_gms_internal_zzas) {
            this.zzou = com_google_android_gms_internal_zzas;
        }

        public zza(zzas com_google_android_gms_internal_zzas, Throwable th) {
            this.zzou = com_google_android_gms_internal_zzas;
            super(th);
        }
    }

    public zzas(SecureRandom secureRandom) {
        this.zzoq = secureRandom;
    }

    private Cipher getCipher() throws NoSuchAlgorithmException, NoSuchPaddingException {
        Cipher cipher;
        synchronized (zzot) {
            if (zzor == null) {
                zzor = Cipher.getInstance("AES/CBC/PKCS5Padding");
            }
            cipher = zzor;
        }
        return cipher;
    }

    static void zzf(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = (byte) (bArr[i] ^ 68);
        }
    }

    public byte[] zzc(byte[] bArr, String str) throws zza {
        if (bArr.length != 16) {
            throw new zza(this);
        }
        try {
            byte[] zza = zzah.zza(str, false);
            if (zza.length <= 16) {
                throw new zza(this);
            }
            ByteBuffer allocate = ByteBuffer.allocate(zza.length);
            allocate.put(zza);
            allocate.flip();
            byte[] bArr2 = new byte[16];
            zza = new byte[(zza.length - 16)];
            allocate.get(bArr2);
            allocate.get(zza);
            Key secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (zzos) {
                getCipher().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                zza = getCipher().doFinal(zza);
            }
            return zza;
        } catch (Throwable e) {
            throw new zza(this, e);
        } catch (Throwable e2) {
            throw new zza(this, e2);
        } catch (Throwable e22) {
            throw new zza(this, e22);
        } catch (Throwable e222) {
            throw new zza(this, e222);
        } catch (Throwable e2222) {
            throw new zza(this, e2222);
        } catch (Throwable e22222) {
            throw new zza(this, e22222);
        } catch (Throwable e222222) {
            throw new zza(this, e222222);
        }
    }

    public String zzd(byte[] bArr, byte[] bArr2) throws zza {
        if (bArr.length != 16) {
            throw new zza(this);
        }
        try {
            byte[] doFinal;
            byte[] iv;
            Key secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (zzos) {
                getCipher().init(1, secretKeySpec, this.zzoq);
                doFinal = getCipher().doFinal(bArr2);
                iv = getCipher().getIV();
            }
            int length = doFinal.length + iv.length;
            ByteBuffer allocate = ByteBuffer.allocate(length);
            allocate.put(iv).put(doFinal);
            allocate.flip();
            doFinal = new byte[length];
            allocate.get(doFinal);
            return zzah.zza(doFinal, false);
        } catch (Throwable e) {
            throw new zza(this, e);
        } catch (Throwable e2) {
            throw new zza(this, e2);
        } catch (Throwable e22) {
            throw new zza(this, e22);
        } catch (Throwable e222) {
            throw new zza(this, e222);
        } catch (Throwable e2222) {
            throw new zza(this, e2222);
        }
    }

    public byte[] zzl(String str) throws zza {
        try {
            byte[] zza = zzah.zza(str, false);
            if (zza.length != 32) {
                throw new zza(this);
            }
            byte[] bArr = new byte[16];
            ByteBuffer.wrap(zza, 4, 16).get(bArr);
            zzf(bArr);
            return bArr;
        } catch (Throwable e) {
            throw new zza(this, e);
        }
    }
}
