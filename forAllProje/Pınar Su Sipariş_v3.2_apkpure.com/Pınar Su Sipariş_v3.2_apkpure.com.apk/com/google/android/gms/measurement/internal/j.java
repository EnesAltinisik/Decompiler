package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zzsn.zzd;

class j {
    final boolean a;
    final int b;
    long c;
    double d;
    long e;
    double f;
    long g;
    double h;
    final boolean i;

    public j(zzd com_google_android_gms_internal_zzsn_zzd) {
        boolean z;
        boolean z2 = true;
        zzaa.zzz(com_google_android_gms_internal_zzsn_zzd);
        if (com_google_android_gms_internal_zzsn_zzd.zzbgw == null || com_google_android_gms_internal_zzsn_zzd.zzbgw.intValue() == 0) {
            z = false;
        } else {
            if (com_google_android_gms_internal_zzsn_zzd.zzbgw.intValue() != 4) {
                if (com_google_android_gms_internal_zzsn_zzd.zzbgy == null) {
                    z = false;
                }
            } else if (com_google_android_gms_internal_zzsn_zzd.zzbgz == null || com_google_android_gms_internal_zzsn_zzd.zzbgA == null) {
                z = false;
            }
            z = true;
        }
        if (z) {
            this.b = com_google_android_gms_internal_zzsn_zzd.zzbgw.intValue();
            if (com_google_android_gms_internal_zzsn_zzd.zzbgx == null || !com_google_android_gms_internal_zzsn_zzd.zzbgx.booleanValue()) {
                z2 = false;
            }
            this.a = z2;
            if (com_google_android_gms_internal_zzsn_zzd.zzbgw.intValue() == 4) {
                if (this.a) {
                    this.f = Double.parseDouble(com_google_android_gms_internal_zzsn_zzd.zzbgz);
                    this.h = Double.parseDouble(com_google_android_gms_internal_zzsn_zzd.zzbgA);
                } else {
                    this.e = Long.parseLong(com_google_android_gms_internal_zzsn_zzd.zzbgz);
                    this.g = Long.parseLong(com_google_android_gms_internal_zzsn_zzd.zzbgA);
                }
            } else if (this.a) {
                this.d = Double.parseDouble(com_google_android_gms_internal_zzsn_zzd.zzbgy);
            } else {
                this.c = Long.parseLong(com_google_android_gms_internal_zzsn_zzd.zzbgy);
            }
        } else {
            this.b = 0;
            this.a = false;
        }
        this.i = z;
    }

    public Boolean a(double d) {
        boolean z = true;
        boolean z2 = false;
        if (!this.i) {
            return null;
        }
        if (!this.a) {
            return null;
        }
        switch (this.b) {
            case 1:
                if (d >= this.d) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                if (d <= this.d) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                if (d == this.d || Math.abs(d - this.d) < 2.0d * Math.max(Math.ulp(d), Math.ulp(this.d))) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 4:
                if (d < this.f || d > this.h) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                return null;
        }
    }

    public Boolean a(long j) {
        boolean z = true;
        if (!this.i) {
            return null;
        }
        if (this.a) {
            return null;
        }
        switch (this.b) {
            case 1:
                if (j >= this.c) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                if (j <= this.c) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                if (j != this.c) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                if (j < this.e || j > this.g) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                return null;
        }
    }
}
