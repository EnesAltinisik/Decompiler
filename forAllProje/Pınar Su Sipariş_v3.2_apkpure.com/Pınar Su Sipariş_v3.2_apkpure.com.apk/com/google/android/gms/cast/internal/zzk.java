package com.google.android.gms.cast.internal;

import com.adjust.sdk.Constants;
import com.google.android.gms.common.api.Api.zzf;
import com.google.android.gms.internal.zznh;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;

public final class zzk {
    public static final zzf<zze> zzaiF = new zzf();
    public static final zzf<zznh> zzaiG = new zzf();
    public static final zzf<Object> zzaiH = new zzf();
    public static final Charset zzaiI;

    static {
        Charset charset = null;
        try {
            charset = Charset.forName(Constants.ENCODING);
        } catch (IllegalCharsetNameException e) {
        } catch (UnsupportedCharsetException e2) {
        }
        zzaiI = charset;
    }
}
