package com.google.android.gms.internal;

import com.google.firebase.database.EventTarget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class zzags {
    private final zzahf zzbHV;
    private final EventTarget zzbLp;

    public zzags(zzaeu com_google_android_gms_internal_zzaeu) {
        this.zzbLp = com_google_android_gms_internal_zzaeu.zzRb();
        this.zzbHV = com_google_android_gms_internal_zzaeu.zzib("EventRaiser");
    }

    public void zzU(List<? extends zzagq> list) {
        if (this.zzbHV.zzTe()) {
            this.zzbHV.zzh("Raising " + list.size() + " event(s)", new Object[0]);
        }
        final ArrayList arrayList = new ArrayList(list);
        this.zzbLp.postEvent(new Runnable(this) {
            final /* synthetic */ zzags b;

            public void run() {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    zzagq com_google_android_gms_internal_zzagq = (zzagq) it.next();
                    if (this.b.zzbHV.zzTe()) {
                        zzahf zza = this.b.zzbHV;
                        String str = "Raising ";
                        String valueOf = String.valueOf(com_google_android_gms_internal_zzagq.toString());
                        zza.zzh(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), new Object[0]);
                    }
                    com_google_android_gms_internal_zzagq.zzSu();
                }
            }
        });
    }
}
