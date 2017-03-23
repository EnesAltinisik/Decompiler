package com.google.android.gms.b;

import com.google.android.gms.ads.d.a;

@vz
public class xt implements a {
    private final xp a;

    public xt(xp xpVar) {
        this.a = xpVar;
    }

    public String a() {
        String str = null;
        if (this.a != null) {
            try {
                str = this.a.a();
            } catch (Throwable e) {
                zy.c("Could not forward getType to RewardItem", e);
            }
        }
        return str;
    }

    public int b() {
        int i = 0;
        if (this.a != null) {
            try {
                i = this.a.b();
            } catch (Throwable e) {
                zy.c("Could not forward getAmount to RewardItem", e);
            }
        }
        return i;
    }
}
