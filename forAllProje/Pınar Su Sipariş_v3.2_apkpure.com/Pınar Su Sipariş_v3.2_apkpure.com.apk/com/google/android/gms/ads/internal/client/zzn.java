package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.internal.client.zzy.zza;
import com.google.android.gms.internal.zzig;
import java.util.Random;

@zzig
public class zzn extends zza {
    private Object zzpp = new Object();
    private final Random zzvQ = new Random();
    private long zzvR;

    public zzn() {
        zzdS();
    }

    public long getValue() {
        return this.zzvR;
    }

    public void zzdS() {
        synchronized (this.zzpp) {
            int i = 3;
            long j = 0;
            while (true) {
                i--;
                if (i <= 0) {
                    break;
                }
                j = ((long) this.zzvQ.nextInt()) + 2147483648L;
                if (j != this.zzvR && j != 0) {
                    break;
                }
            }
            this.zzvR = j;
        }
    }
}
