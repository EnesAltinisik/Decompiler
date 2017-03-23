package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import java.util.ArrayList;
import java.util.List;

@zzig
public class zzfy implements zzfp {
    private final Context mContext;
    private final zzfr zzEX;
    private final AdRequestInfoParcel zzFm;
    private final long zzFn;
    private final long zzFo;
    private boolean zzFq = false;
    private List<zzfv> zzFs = new ArrayList();
    private zzfu zzFw;
    private final zzdc zzpQ;
    private final Object zzpp = new Object();
    private final zzga zzqc;
    private final boolean zztM;
    private final boolean zzwo;

    public zzfy(Context context, AdRequestInfoParcel adRequestInfoParcel, zzga com_google_android_gms_internal_zzga, zzfr com_google_android_gms_internal_zzfr, boolean z, boolean z2, long j, long j2, zzdc com_google_android_gms_internal_zzdc) {
        this.mContext = context;
        this.zzFm = adRequestInfoParcel;
        this.zzqc = com_google_android_gms_internal_zzga;
        this.zzEX = com_google_android_gms_internal_zzfr;
        this.zztM = z;
        this.zzwo = z2;
        this.zzFn = j;
        this.zzFo = j2;
        this.zzpQ = com_google_android_gms_internal_zzdc;
    }

    public void cancel() {
        synchronized (this.zzpp) {
            this.zzFq = true;
            if (this.zzFw != null) {
                this.zzFw.cancel();
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.internal.zzfv zzd(java.util.List<com.google.android.gms.internal.zzfq> r22) {
        /*
        r21 = this;
        r2 = "Starting mediation.";
        com.google.android.gms.ads.internal.util.client.zzb.zzaU(r2);
        r15 = new java.util.ArrayList;
        r15.<init>();
        r0 = r21;
        r2 = r0.zzpQ;
        r16 = r2.zzeA();
        r17 = r22.iterator();
    L_0x0016:
        r2 = r17.hasNext();
        if (r2 == 0) goto L_0x0133;
    L_0x001c:
        r7 = r17.next();
        r7 = (com.google.android.gms.internal.zzfq) r7;
        r3 = "Trying mediation network: ";
        r2 = r7.zzEo;
        r2 = java.lang.String.valueOf(r2);
        r4 = r2.length();
        if (r4 == 0) goto L_0x0066;
    L_0x0030:
        r2 = r3.concat(r2);
    L_0x0034:
        com.google.android.gms.ads.internal.util.client.zzb.zzaV(r2);
        r2 = r7.zzEp;
        r18 = r2.iterator();
    L_0x003d:
        r2 = r18.hasNext();
        if (r2 == 0) goto L_0x0016;
    L_0x0043:
        r4 = r18.next();
        r4 = (java.lang.String) r4;
        r0 = r21;
        r2 = r0.zzpQ;
        r19 = r2.zzeA();
        r0 = r21;
        r0 = r0.zzpp;
        r20 = r0;
        monitor-enter(r20);
        r0 = r21;
        r2 = r0.zzFq;	 Catch:{ all -> 0x010a }
        if (r2 == 0) goto L_0x006c;
    L_0x005e:
        r2 = new com.google.android.gms.internal.zzfv;	 Catch:{ all -> 0x010a }
        r3 = -1;
        r2.<init>(r3);	 Catch:{ all -> 0x010a }
        monitor-exit(r20);	 Catch:{ all -> 0x010a }
    L_0x0065:
        return r2;
    L_0x0066:
        r2 = new java.lang.String;
        r2.<init>(r3);
        goto L_0x0034;
    L_0x006c:
        r2 = new com.google.android.gms.internal.zzfu;	 Catch:{ all -> 0x010a }
        r0 = r21;
        r3 = r0.mContext;	 Catch:{ all -> 0x010a }
        r0 = r21;
        r5 = r0.zzqc;	 Catch:{ all -> 0x010a }
        r0 = r21;
        r6 = r0.zzEX;	 Catch:{ all -> 0x010a }
        r0 = r21;
        r8 = r0.zzFm;	 Catch:{ all -> 0x010a }
        r8 = r8.zzLi;	 Catch:{ all -> 0x010a }
        r0 = r21;
        r9 = r0.zzFm;	 Catch:{ all -> 0x010a }
        r9 = r9.zzsB;	 Catch:{ all -> 0x010a }
        r0 = r21;
        r10 = r0.zzFm;	 Catch:{ all -> 0x010a }
        r10 = r10.zzsx;	 Catch:{ all -> 0x010a }
        r0 = r21;
        r11 = r0.zztM;	 Catch:{ all -> 0x010a }
        r0 = r21;
        r12 = r0.zzwo;	 Catch:{ all -> 0x010a }
        r0 = r21;
        r13 = r0.zzFm;	 Catch:{ all -> 0x010a }
        r13 = r13.zzsP;	 Catch:{ all -> 0x010a }
        r0 = r21;
        r14 = r0.zzFm;	 Catch:{ all -> 0x010a }
        r14 = r14.zzsT;	 Catch:{ all -> 0x010a }
        r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14);	 Catch:{ all -> 0x010a }
        r0 = r21;
        r0.zzFw = r2;	 Catch:{ all -> 0x010a }
        monitor-exit(r20);	 Catch:{ all -> 0x010a }
        r0 = r21;
        r2 = r0.zzFw;
        r0 = r21;
        r8 = r0.zzFn;
        r0 = r21;
        r10 = r0.zzFo;
        r2 = r2.zza(r8, r10);
        r0 = r21;
        r3 = r0.zzFs;
        r3.add(r2);
        r3 = r2.zzFf;
        if (r3 != 0) goto L_0x010d;
    L_0x00c3:
        r3 = "Adapter succeeded.";
        com.google.android.gms.ads.internal.util.client.zzb.zzaU(r3);
        r0 = r21;
        r3 = r0.zzpQ;
        r5 = "mediation_network_succeed";
        r3.zzf(r5, r4);
        r3 = r15.isEmpty();
        if (r3 != 0) goto L_0x00e6;
    L_0x00d7:
        r0 = r21;
        r3 = r0.zzpQ;
        r4 = "mediation_networks_fail";
        r5 = ",";
        r5 = android.text.TextUtils.join(r5, r15);
        r3.zzf(r4, r5);
    L_0x00e6:
        r0 = r21;
        r3 = r0.zzpQ;
        r4 = 1;
        r4 = new java.lang.String[r4];
        r5 = 0;
        r6 = "mls";
        r4[r5] = r6;
        r0 = r19;
        r3.zza(r0, r4);
        r0 = r21;
        r3 = r0.zzpQ;
        r4 = 1;
        r4 = new java.lang.String[r4];
        r5 = 0;
        r6 = "ttm";
        r4[r5] = r6;
        r0 = r16;
        r3.zza(r0, r4);
        goto L_0x0065;
    L_0x010a:
        r2 = move-exception;
        monitor-exit(r20);	 Catch:{ all -> 0x010a }
        throw r2;
    L_0x010d:
        r15.add(r4);
        r0 = r21;
        r3 = r0.zzpQ;
        r4 = 1;
        r4 = new java.lang.String[r4];
        r5 = 0;
        r6 = "mlf";
        r4[r5] = r6;
        r0 = r19;
        r3.zza(r0, r4);
        r3 = r2.zzFh;
        if (r3 == 0) goto L_0x003d;
    L_0x0125:
        r3 = com.google.android.gms.internal.zzka.zzQu;
        r4 = new com.google.android.gms.internal.zzfy$1;
        r0 = r21;
        r4.<init>(r0, r2);
        r3.post(r4);
        goto L_0x003d;
    L_0x0133:
        r2 = r15.isEmpty();
        if (r2 != 0) goto L_0x0148;
    L_0x0139:
        r0 = r21;
        r2 = r0.zzpQ;
        r3 = "mediation_networks_fail";
        r4 = ",";
        r4 = android.text.TextUtils.join(r4, r15);
        r2.zzf(r3, r4);
    L_0x0148:
        r2 = new com.google.android.gms.internal.zzfv;
        r3 = 1;
        r2.<init>(r3);
        goto L_0x0065;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzfy.zzd(java.util.List):com.google.android.gms.internal.zzfv");
    }

    public List<zzfv> zzfA() {
        return this.zzFs;
    }
}
