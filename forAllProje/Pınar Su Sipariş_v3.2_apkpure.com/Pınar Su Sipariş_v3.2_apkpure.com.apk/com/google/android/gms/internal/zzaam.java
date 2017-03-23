package com.google.android.gms.internal;

import a.a.a.a.a.d.b;
import com.google.android.gms.common.internal.zzaa;

public class zzaam {
    private final String zzbnR;
    private final String zzbqt;
    private final String zzbsg;
    private final String zzbuJ;
    private final boolean zzbuK;
    private final String zzbuL;

    public zzaam(String str, String str2, String str3, boolean z, String str4) {
        this(str, str2, str3, z, str4, "");
    }

    public zzaam(String str, String str2, String str3, boolean z, String str4, String str5) {
        zzaa.zzz(str);
        zzaa.zzz(str5);
        this.zzbnR = str;
        this.zzbsg = str2;
        this.zzbuJ = str3;
        this.zzbuK = z;
        this.zzbuL = str4;
        this.zzbqt = str5;
    }

    public String getContainerId() {
        return this.zzbnR;
    }

    public String zzLG() {
        return this.zzbsg;
    }

    public String zzLH() {
        return this.zzbuJ;
    }

    public String zzLI() {
        if (this.zzbuJ == null) {
            return this.zzbnR;
        }
        String str = this.zzbuJ;
        String str2 = this.zzbnR;
        return new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(str2).length()).append(str).append(b.ROLL_OVER_FILE_NAME_SEPARATOR).append(str2).toString();
    }

    public boolean zzLJ() {
        return this.zzbuK;
    }

    public String zzLK() {
        return this.zzbuL;
    }

    public String zzLL() {
        return this.zzbqt;
    }
}
