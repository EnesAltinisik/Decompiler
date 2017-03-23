package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.zze;

class ac implements ay {
    private final long a;
    private final long b;
    private final int c;
    private double d;
    private long e;
    private final Object f = new Object();
    private final String g;
    private final zze h;

    public ac(int i, long j, long j2, String str, zze com_google_android_gms_common_util_zze) {
        this.c = i;
        this.d = (double) this.c;
        this.a = j;
        this.b = j2;
        this.g = str;
        this.h = com_google_android_gms_common_util_zze;
    }

    public boolean a() {
        boolean z = false;
        synchronized (this.f) {
            long currentTimeMillis = this.h.currentTimeMillis();
            String str;
            if (currentTimeMillis - this.e < this.b) {
                str = this.g;
                zzbn.zzaW(new StringBuilder(String.valueOf(str).length() + 34).append("Excessive ").append(str).append(" detected; call ignored.").toString());
            } else {
                if (this.d < ((double) this.c)) {
                    double d = ((double) (currentTimeMillis - this.e)) / ((double) this.a);
                    if (d > 0.0d) {
                        this.d = Math.min((double) this.c, d + this.d);
                    }
                }
                this.e = currentTimeMillis;
                if (this.d >= 1.0d) {
                    this.d -= 1.0d;
                    z = true;
                } else {
                    str = this.g;
                    zzbn.zzaW(new StringBuilder(String.valueOf(str).length() + 34).append("Excessive ").append(str).append(" detected; call ignored.").toString());
                }
            }
        }
        return z;
    }
}
