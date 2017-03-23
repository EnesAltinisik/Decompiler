package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@zzig
public class zzce {
    private final Object zzpp = new Object();
    private int zzui;
    private List<zzcd> zzuj = new LinkedList();

    public boolean zza(zzcd com_google_android_gms_internal_zzcd) {
        boolean z;
        synchronized (this.zzpp) {
            if (this.zzuj.contains(com_google_android_gms_internal_zzcd)) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public boolean zzb(zzcd com_google_android_gms_internal_zzcd) {
        boolean z;
        synchronized (this.zzpp) {
            Iterator it = this.zzuj.iterator();
            while (it.hasNext()) {
                zzcd com_google_android_gms_internal_zzcd2 = (zzcd) it.next();
                if (com_google_android_gms_internal_zzcd != com_google_android_gms_internal_zzcd2 && com_google_android_gms_internal_zzcd2.zzdl().equals(com_google_android_gms_internal_zzcd.zzdl())) {
                    it.remove();
                    z = true;
                    break;
                }
            }
            z = false;
        }
        return z;
    }

    public void zzc(zzcd com_google_android_gms_internal_zzcd) {
        synchronized (this.zzpp) {
            if (this.zzuj.size() >= 10) {
                zzb.zzaU("Queue is full, current size = " + this.zzuj.size());
                this.zzuj.remove(0);
            }
            int i = this.zzui;
            this.zzui = i + 1;
            com_google_android_gms_internal_zzcd.zzj(i);
            this.zzuj.add(com_google_android_gms_internal_zzcd);
        }
    }

    public zzcd zzds() {
        zzcd com_google_android_gms_internal_zzcd = null;
        synchronized (this.zzpp) {
            if (this.zzuj.size() == 0) {
                zzb.zzaU("Queue empty");
                return null;
            } else if (this.zzuj.size() >= 2) {
                int i = zzamj.UNSET_ENUM_VALUE;
                for (zzcd com_google_android_gms_internal_zzcd2 : this.zzuj) {
                    zzcd com_google_android_gms_internal_zzcd3;
                    int i2;
                    int score = com_google_android_gms_internal_zzcd2.getScore();
                    if (score > i) {
                        int i3 = score;
                        com_google_android_gms_internal_zzcd3 = com_google_android_gms_internal_zzcd2;
                        i2 = i3;
                    } else {
                        i2 = i;
                        com_google_android_gms_internal_zzcd3 = com_google_android_gms_internal_zzcd;
                    }
                    i = i2;
                    com_google_android_gms_internal_zzcd = com_google_android_gms_internal_zzcd3;
                }
                this.zzuj.remove(com_google_android_gms_internal_zzcd);
                return com_google_android_gms_internal_zzcd;
            } else {
                com_google_android_gms_internal_zzcd2 = (zzcd) this.zzuj.get(0);
                com_google_android_gms_internal_zzcd2.zzdn();
                return com_google_android_gms_internal_zzcd2;
            }
        }
    }
}
