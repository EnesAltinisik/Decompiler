package com.google.android.gms.nearby.messages.devices;

import java.util.Arrays;

abstract class a {
    private static final char[] a = "0123456789abcdef".toCharArray();
    private final byte[] b;

    protected a(byte[] bArr) {
        this.b = bArr;
    }

    static String a(byte[] bArr) {
        StringBuilder stringBuilder = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            stringBuilder.append(a[(b >> 4) & 15]).append(a[b & 15]);
        }
        return stringBuilder.toString();
    }

    byte[] a() {
        return this.b;
    }

    String b() {
        return a(this.b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!obj.getClass().isAssignableFrom(getClass())) {
            return false;
        }
        return Arrays.equals(this.b, ((a) obj).b);
    }

    public int hashCode() {
        return Arrays.hashCode(this.b);
    }

    public String toString() {
        return a(this.b);
    }
}
