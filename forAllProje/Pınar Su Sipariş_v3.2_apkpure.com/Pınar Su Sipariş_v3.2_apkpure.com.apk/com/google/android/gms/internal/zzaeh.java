package com.google.android.gms.internal;

import java.net.URI;

public class zzaeh {
    private final String zzasB;
    private final String zzbJa;
    private final boolean zzbJb;

    public zzaeh(String str, String str2, boolean z) {
        this.zzbJa = str;
        this.zzasB = str2;
        this.zzbJb = z;
    }

    public static URI zza(String str, boolean z, String str2, String str3) {
        String str4 = z ? "wss" : "ws";
        String valueOf = String.valueOf("v");
        String valueOf2 = String.valueOf("5");
        str4 = new StringBuilder(((((String.valueOf(str4).length() + 13) + String.valueOf(str).length()) + String.valueOf(str2).length()) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()).append(str4).append("://").append(str).append("/.ws?ns=").append(str2).append("&").append(valueOf).append("=").append(valueOf2).toString();
        if (str3 != null) {
            str4 = String.valueOf(str4);
            valueOf = String.valueOf("&ls=");
            str4 = new StringBuilder(((String.valueOf(str4).length() + 0) + String.valueOf(valueOf).length()) + String.valueOf(str3).length()).append(str4).append(valueOf).append(str3).toString();
        }
        return URI.create(str4);
    }

    public String getHost() {
        return this.zzbJa;
    }

    public String getNamespace() {
        return this.zzasB;
    }

    public boolean isSecure() {
        return this.zzbJb;
    }

    public String toString() {
        String str = this.zzbJb ? "s" : "";
        String str2 = this.zzbJa;
        return new StringBuilder((String.valueOf(str).length() + 7) + String.valueOf(str2).length()).append("http").append(str).append("://").append(str2).toString();
    }
}
