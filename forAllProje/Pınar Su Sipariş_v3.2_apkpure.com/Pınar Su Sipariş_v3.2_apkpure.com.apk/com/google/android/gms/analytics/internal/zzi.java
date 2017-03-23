package com.google.android.gms.analytics.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.stats.zzb;
import java.util.Collections;

public class zzi extends zzd {
    private final zza zzWD = new zza(this);
    private zzac zzWE;
    private final h zzWF;
    private c zzWG;

    protected class zza implements ServiceConnection {
        final /* synthetic */ zzi zzWH;
        private volatile zzac zzWI;
        private volatile boolean zzWJ;

        protected zza(zzi com_google_android_gms_analytics_internal_zzi) {
            this.zzWH = com_google_android_gms_analytics_internal_zzi;
        }

        public void onServiceConnected(android.content.ComponentName r5, android.os.IBinder r6) {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Exception block dominator not found, method:com.google.android.gms.analytics.internal.zzi.zza.onServiceConnected(android.content.ComponentName, android.os.IBinder):void. bs: [B:3:0x0008, B:9:0x0015]
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:86)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
            /*
            r4 = this;
            r0 = "AnalyticsServiceConnection.onServiceConnected";
            com.google.android.gms.common.internal.zzaa.zzdc(r0);
            monitor-enter(r4);
            if (r6 != 0) goto L_0x0014;
        L_0x0008:
            r0 = r4.zzWH;	 Catch:{ all -> 0x005a }
            r1 = "Service connected with null binder";	 Catch:{ all -> 0x005a }
            r0.zzbK(r1);	 Catch:{ all -> 0x005a }
            r4.notifyAll();	 Catch:{ all -> 0x0046 }
            monitor-exit(r4);	 Catch:{ all -> 0x0046 }
        L_0x0013:
            return;
        L_0x0014:
            r0 = 0;
            r1 = r6.getInterfaceDescriptor();	 Catch:{ RemoteException -> 0x0051 }
            r2 = "com.google.android.gms.analytics.internal.IAnalyticsService";	 Catch:{ RemoteException -> 0x0051 }
            r2 = r2.equals(r1);	 Catch:{ RemoteException -> 0x0051 }
            if (r2 == 0) goto L_0x0049;	 Catch:{ RemoteException -> 0x0051 }
        L_0x0021:
            r0 = com.google.android.gms.analytics.internal.zzac.zza.zzak(r6);	 Catch:{ RemoteException -> 0x0051 }
            r1 = r4.zzWH;	 Catch:{ RemoteException -> 0x0051 }
            r2 = "Bound to IAnalyticsService interface";	 Catch:{ RemoteException -> 0x0051 }
            r1.zzbG(r2);	 Catch:{ RemoteException -> 0x0051 }
        L_0x002c:
            if (r0 != 0) goto L_0x005f;
        L_0x002e:
            r0 = com.google.android.gms.common.stats.zzb.zzuH();	 Catch:{ IllegalArgumentException -> 0x007c }
            r1 = r4.zzWH;	 Catch:{ IllegalArgumentException -> 0x007c }
            r1 = r1.getContext();	 Catch:{ IllegalArgumentException -> 0x007c }
            r2 = r4.zzWH;	 Catch:{ IllegalArgumentException -> 0x007c }
            r2 = r2.zzWD;	 Catch:{ IllegalArgumentException -> 0x007c }
            r0.zza(r1, r2);	 Catch:{ IllegalArgumentException -> 0x007c }
        L_0x0041:
            r4.notifyAll();	 Catch:{ all -> 0x0046 }
            monitor-exit(r4);	 Catch:{ all -> 0x0046 }
            goto L_0x0013;	 Catch:{ all -> 0x0046 }
        L_0x0046:
            r0 = move-exception;	 Catch:{ all -> 0x0046 }
            monitor-exit(r4);	 Catch:{ all -> 0x0046 }
            throw r0;
        L_0x0049:
            r2 = r4.zzWH;	 Catch:{ RemoteException -> 0x0051 }
            r3 = "Got binder with a wrong descriptor";	 Catch:{ RemoteException -> 0x0051 }
            r2.zze(r3, r1);	 Catch:{ RemoteException -> 0x0051 }
            goto L_0x002c;
        L_0x0051:
            r1 = move-exception;
            r1 = r4.zzWH;	 Catch:{ all -> 0x005a }
            r2 = "Service connect failed to get IAnalyticsService";	 Catch:{ all -> 0x005a }
            r1.zzbK(r2);	 Catch:{ all -> 0x005a }
            goto L_0x002c;
        L_0x005a:
            r0 = move-exception;
            r4.notifyAll();	 Catch:{ all -> 0x0046 }
            throw r0;	 Catch:{ all -> 0x0046 }
        L_0x005f:
            r1 = r4.zzWJ;	 Catch:{ all -> 0x005a }
            if (r1 != 0) goto L_0x0079;	 Catch:{ all -> 0x005a }
        L_0x0063:
            r1 = r4.zzWH;	 Catch:{ all -> 0x005a }
            r2 = "onServiceConnected received after the timeout limit";	 Catch:{ all -> 0x005a }
            r1.zzbJ(r2);	 Catch:{ all -> 0x005a }
            r1 = r4.zzWH;	 Catch:{ all -> 0x005a }
            r1 = r1.zzlT();	 Catch:{ all -> 0x005a }
            r2 = new com.google.android.gms.analytics.internal.zzi$zza$1;	 Catch:{ all -> 0x005a }
            r2.<init>(r4, r0);	 Catch:{ all -> 0x005a }
            r1.zzf(r2);	 Catch:{ all -> 0x005a }
            goto L_0x0041;	 Catch:{ all -> 0x005a }
        L_0x0079:
            r4.zzWI = r0;	 Catch:{ all -> 0x005a }
            goto L_0x0041;
        L_0x007c:
            r0 = move-exception;
            goto L_0x0041;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.internal.zzi.zza.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
        }

        public void onServiceDisconnected(final ComponentName componentName) {
            zzaa.zzdc("AnalyticsServiceConnection.onServiceDisconnected");
            this.zzWH.zzlT().zzf(new Runnable(this) {
                final /* synthetic */ zza b;

                public void run() {
                    this.b.zzWH.onServiceDisconnected(componentName);
                }
            });
        }

        public zzac zzmp() {
            zzac com_google_android_gms_analytics_internal_zzac = null;
            this.zzWH.zzkN();
            Intent intent = new Intent("com.google.android.gms.analytics.service.START");
            intent.setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.analytics.service.AnalyticsService"));
            Context context = this.zzWH.getContext();
            intent.putExtra("app_package_name", context.getPackageName());
            zzb zzuH = zzb.zzuH();
            synchronized (this) {
                this.zzWI = null;
                this.zzWJ = true;
                boolean zza = zzuH.zza(context, intent, this.zzWH.zzWD, 129);
                this.zzWH.zza("Bind to service requested", Boolean.valueOf(zza));
                if (zza) {
                    try {
                        wait(this.zzWH.zzlS().zzns());
                    } catch (InterruptedException e) {
                        this.zzWH.zzbJ("Wait for service connect was interrupted");
                    }
                    this.zzWJ = false;
                    com_google_android_gms_analytics_internal_zzac = this.zzWI;
                    this.zzWI = null;
                    if (com_google_android_gms_analytics_internal_zzac == null) {
                        this.zzWH.zzbK("Successfully bound to service but never got onServiceConnected callback");
                    }
                } else {
                    this.zzWJ = false;
                }
            }
            return com_google_android_gms_analytics_internal_zzac;
        }
    }

    protected zzi(zzf com_google_android_gms_analytics_internal_zzf) {
        super(com_google_android_gms_analytics_internal_zzf);
        this.zzWG = new c(com_google_android_gms_analytics_internal_zzf.zzlQ());
        this.zzWF = new h(this, com_google_android_gms_analytics_internal_zzf) {
            final /* synthetic */ zzi a;

            public void a() {
                this.a.zzmo();
            }
        };
    }

    private void onDisconnect() {
        zzkw().zzlL();
    }

    private void onServiceDisconnected(ComponentName componentName) {
        zzkN();
        if (this.zzWE != null) {
            this.zzWE = null;
            zza("Disconnected from device AnalyticsService", componentName);
            onDisconnect();
        }
    }

    private void zza(zzac com_google_android_gms_analytics_internal_zzac) {
        zzkN();
        this.zzWE = com_google_android_gms_analytics_internal_zzac;
        zzmn();
        zzkw().onServiceConnected();
    }

    private void zzmn() {
        this.zzWG.a();
        this.zzWF.a(zzlS().zznr());
    }

    private void zzmo() {
        zzkN();
        if (isConnected()) {
            zzbG("Inactivity, disconnecting from device AnalyticsService");
            disconnect();
        }
    }

    public boolean connect() {
        zzkN();
        zzma();
        if (this.zzWE != null) {
            return true;
        }
        zzac zzmp = this.zzWD.zzmp();
        if (zzmp == null) {
            return false;
        }
        this.zzWE = zzmp;
        zzmn();
        return true;
    }

    public void disconnect() {
        zzkN();
        zzma();
        try {
            zzb.zzuH().zza(getContext(), this.zzWD);
        } catch (IllegalStateException e) {
        } catch (IllegalArgumentException e2) {
        }
        if (this.zzWE != null) {
            this.zzWE = null;
            onDisconnect();
        }
    }

    public boolean isConnected() {
        zzkN();
        zzma();
        return this.zzWE != null;
    }

    public boolean zzb(zzab com_google_android_gms_analytics_internal_zzab) {
        zzaa.zzz(com_google_android_gms_analytics_internal_zzab);
        zzkN();
        zzma();
        zzac com_google_android_gms_analytics_internal_zzac = this.zzWE;
        if (com_google_android_gms_analytics_internal_zzac == null) {
            return false;
        }
        try {
            com_google_android_gms_analytics_internal_zzac.zza(com_google_android_gms_analytics_internal_zzab.zzm(), com_google_android_gms_analytics_internal_zzab.zznT(), com_google_android_gms_analytics_internal_zzab.zznV() ? zzlS().zznk() : zzlS().zznl(), Collections.emptyList());
            zzmn();
            return true;
        } catch (RemoteException e) {
            zzbG("Failed to send hits to AnalyticsService");
            return false;
        }
    }

    protected void zzkO() {
    }

    public boolean zzmm() {
        zzkN();
        zzma();
        zzac com_google_android_gms_analytics_internal_zzac = this.zzWE;
        if (com_google_android_gms_analytics_internal_zzac == null) {
            return false;
        }
        try {
            com_google_android_gms_analytics_internal_zzac.zzlI();
            zzmn();
            return true;
        } catch (RemoteException e) {
            zzbG("Failed to clear hits from AnalyticsService");
            return false;
        }
    }
}
