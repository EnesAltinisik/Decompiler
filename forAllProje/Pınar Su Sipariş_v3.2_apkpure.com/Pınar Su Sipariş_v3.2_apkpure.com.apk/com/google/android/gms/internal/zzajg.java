package com.google.android.gms.internal;

import com.adjust.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigValue;
import java.nio.charset.Charset;
import java.util.regex.Pattern;

public class zzajg implements FirebaseRemoteConfigValue {
    public static final Charset UTF_8 = Charset.forName(Constants.ENCODING);
    public static final Pattern zzauD = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
    public static final Pattern zzauE = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    private final byte[] zzbTA;
    private final int zzwP;

    public zzajg(byte[] bArr, int i) {
        this.zzbTA = bArr;
        this.zzwP = i;
    }

    private void zzUD() {
        if (this.zzbTA == null) {
            throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
        }
    }

    public boolean asBoolean() throws IllegalArgumentException {
        if (this.zzwP == 0) {
            return false;
        }
        Object asString = asString();
        if (zzauD.matcher(asString).matches()) {
            return true;
        }
        if (zzauE.matcher(asString).matches()) {
            return false;
        }
        throw new IllegalArgumentException(new StringBuilder(String.valueOf(asString).length() + 45).append("[Value: ").append(asString).append("] cannot be interpreted as a boolean.").toString());
    }

    public byte[] asByteArray() {
        return this.zzwP == 0 ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_BYTE_ARRAY : this.zzbTA;
    }

    public double asDouble() {
        if (this.zzwP == 0) {
            return 0.0d;
        }
        String asString = asString();
        try {
            return Double.valueOf(asString).doubleValue();
        } catch (Throwable e) {
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(asString).length() + 42).append("[Value: ").append(asString).append("] cannot be converted to a double.").toString(), e);
        }
    }

    public long asLong() {
        if (this.zzwP == 0) {
            return 0;
        }
        String asString = asString();
        try {
            return Long.valueOf(asString).longValue();
        } catch (Throwable e) {
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(asString).length() + 40).append("[Value: ").append(asString).append("] cannot be converted to a long.").toString(), e);
        }
    }

    public String asString() {
        if (this.zzwP == 0) {
            return "";
        }
        zzUD();
        return new String(this.zzbTA, UTF_8);
    }

    public int getSource() {
        return this.zzwP;
    }
}
