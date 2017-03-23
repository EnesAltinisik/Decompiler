package com.google.android.gms.internal;

import com.adjust.sdk.Constants;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@zzig
public abstract class zzch {
    private static MessageDigest zzuA = null;
    protected Object zzpp = new Object();

    abstract byte[] zzA(String str);

    protected MessageDigest zzdy() {
        MessageDigest messageDigest;
        synchronized (this.zzpp) {
            if (zzuA != null) {
                messageDigest = zzuA;
            } else {
                for (int i = 0; i < 2; i++) {
                    try {
                        zzuA = MessageDigest.getInstance(Constants.MD5);
                    } catch (NoSuchAlgorithmException e) {
                    }
                }
                messageDigest = zzuA;
            }
        }
        return messageDigest;
    }
}
