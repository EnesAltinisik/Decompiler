package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzjn.zza;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.Future;
import org.json.JSONObject;

@zzig
public class zzje extends zzjv implements zzjd {
    private final Context mContext;
    private final zza zzJJ;
    private final ArrayList<Future> zzOO = new ArrayList();
    private final ArrayList<String> zzOP = new ArrayList();
    private final HashSet<String> zzOQ = new HashSet();
    private final zziy zzOR;
    private final Object zzpp = new Object();

    public zzje(Context context, zza com_google_android_gms_internal_zzjn_zza, zziy com_google_android_gms_internal_zziy) {
        this.mContext = context;
        this.zzJJ = com_google_android_gms_internal_zzjn_zza;
        this.zzOR = com_google_android_gms_internal_zziy;
    }

    private zzjn zza(int i, String str, zzfq com_google_android_gms_internal_zzfq) {
        return new zzjn(this.zzJJ.zzPh.zzLi, null, this.zzJJ.zzPi.zzEF, i, this.zzJJ.zzPi.zzEG, this.zzJJ.zzPi.zzLR, this.zzJJ.zzPi.orientation, this.zzJJ.zzPi.zzEL, this.zzJJ.zzPh.zzLl, this.zzJJ.zzPi.zzLP, com_google_android_gms_internal_zzfq, null, str, this.zzJJ.zzOY, null, this.zzJJ.zzPi.zzLQ, this.zzJJ.zzsB, this.zzJJ.zzPi.zzLO, this.zzJJ.zzPc, this.zzJJ.zzPi.zzLT, this.zzJJ.zzPi.zzLU, this.zzJJ.zzOW, null, this.zzJJ.zzPi.zzMf, this.zzJJ.zzPi.zzMg, this.zzJJ.zzPi.zzMh, this.zzJJ.zzPi.zzMi, this.zzJJ.zzPi.zzMj, null, this.zzJJ.zzPi.zzEI);
    }

    private zzjn zza(String str, zzfq com_google_android_gms_internal_zzfq) {
        return zza(-2, str, com_google_android_gms_internal_zzfq);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void zzd(java.lang.String r4, java.lang.String r5, java.lang.String r6) {
        /*
        r3 = this;
        r1 = r3.zzpp;
        monitor-enter(r1);
        r0 = r3.zzOR;	 Catch:{ all -> 0x002f }
        r0 = r0.zzaE(r4);	 Catch:{ all -> 0x002f }
        if (r0 == 0) goto L_0x0017;
    L_0x000b:
        r2 = r0.zziq();	 Catch:{ all -> 0x002f }
        if (r2 == 0) goto L_0x0017;
    L_0x0011:
        r2 = r0.zzip();	 Catch:{ all -> 0x002f }
        if (r2 != 0) goto L_0x0019;
    L_0x0017:
        monitor-exit(r1);	 Catch:{ all -> 0x002f }
    L_0x0018:
        return;
    L_0x0019:
        r0 = r3.zza(r4, r5, r6, r0);	 Catch:{ all -> 0x002f }
        r2 = r3.zzOO;	 Catch:{ all -> 0x002f }
        r0 = r0.zzhs();	 Catch:{ all -> 0x002f }
        r0 = (java.util.concurrent.Future) r0;	 Catch:{ all -> 0x002f }
        r2.add(r0);	 Catch:{ all -> 0x002f }
        r0 = r3.zzOP;	 Catch:{ all -> 0x002f }
        r0.add(r4);	 Catch:{ all -> 0x002f }
        monitor-exit(r1);	 Catch:{ all -> 0x002f }
        goto L_0x0018;
    L_0x002f:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x002f }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzje.zzd(java.lang.String, java.lang.String, java.lang.String):void");
    }

    private zzjn zzio() {
        return zza(3, null, null);
    }

    public void onStop() {
    }

    protected zziz zza(String str, String str2, String str3, zzjf com_google_android_gms_internal_zzjf) {
        return new zziz(this.mContext, str, str2, str3, this.zzJJ, com_google_android_gms_internal_zzjf, this);
    }

    public void zza(String str, int i) {
    }

    public void zzaF(String str) {
        synchronized (this.zzpp) {
            this.zzOQ.add(str);
        }
    }

    public void zzbQ() {
        final zzjn zza;
        for (zzfq com_google_android_gms_internal_zzfq : this.zzJJ.zzOY.zzED) {
            String str = com_google_android_gms_internal_zzfq.zzEv;
            for (String str2 : com_google_android_gms_internal_zzfq.zzEp) {
                String str22;
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str22)) {
                    try {
                        str22 = new JSONObject(str).getString("class_name");
                    } catch (Throwable e) {
                        zzb.zzb("Unable to determine custom event class name, skipping...", e);
                    }
                }
                zzd(str22, str, com_google_android_gms_internal_zzfq.zzEn);
            }
        }
        int i = 0;
        while (i < this.zzOO.size()) {
            try {
                ((Future) this.zzOO.get(i)).get();
                synchronized (this.zzpp) {
                    if (this.zzOQ.contains(this.zzOP.get(i))) {
                        zza = zza((String) this.zzOP.get(i), (zzfq) this.zzJJ.zzOY.zzED.get(i));
                        com.google.android.gms.ads.internal.util.client.zza.zzRt.post(new Runnable(this) {
                            final /* synthetic */ zzje b;

                            public void run() {
                                this.b.zzOR.zzb(zza);
                            }
                        });
                        return;
                    }
                }
            } catch (InterruptedException e2) {
            } catch (Exception e3) {
            }
        }
        zza = zzio();
        com.google.android.gms.ads.internal.util.client.zza.zzRt.post(new Runnable(this) {
            final /* synthetic */ zzje b;

            public void run() {
                this.b.zzOR.zzb(zza);
            }
        });
        return;
        i++;
    }
}
