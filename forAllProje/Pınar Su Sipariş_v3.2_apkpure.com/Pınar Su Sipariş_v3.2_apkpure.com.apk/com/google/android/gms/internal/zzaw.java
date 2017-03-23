package com.google.android.gms.internal;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.util.UUID;

public final class zzaw {
    private static final char[] zzoL = "0123456789abcdef".toCharArray();

    public static String zza(Throwable th) {
        Writer stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static String zzo(String str) {
        if (str == null || !str.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            return str;
        }
        UUID fromString = UUID.fromString(str);
        byte[] bArr = new byte[16];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(fromString.getMostSignificantBits());
        wrap.putLong(fromString.getLeastSignificantBits());
        return zzah.zza(bArr, true);
    }
}
