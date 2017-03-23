package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzd.zzb;
import com.google.android.gms.common.internal.zzd.zzc;
import com.google.android.gms.common.util.zze;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class zzad extends b {
    private final g zzbfA;
    private final d zzbfB;
    private final List<Runnable> zzbfC = new ArrayList();
    private final g zzbfD;
    private final zza zzbfx;
    private zzm zzbfy;
    private Boolean zzbfz;

    protected class zza implements ServiceConnection, zzb, zzc {
        final /* synthetic */ zzad zzbfE;
        private volatile boolean zzbfG;
        private volatile zzo zzbfH;

        protected zza(zzad com_google_android_gms_measurement_internal_zzad) {
            this.zzbfE = com_google_android_gms_measurement_internal_zzad;
        }

        public void onConnected(Bundle bundle) {
            zzaa.zzdc("MeasurementServiceConnection.onConnected");
            synchronized (this) {
                try {
                    final zzm com_google_android_gms_measurement_internal_zzm = (zzm) this.zzbfH.zztm();
                    this.zzbfH = null;
                    this.zzbfE.zzFl().zzg(new Runnable(this) {
                        final /* synthetic */ zza b;

                        public void run() {
                            synchronized (this.b) {
                                this.b.zzbfG = false;
                                if (!this.b.zzbfE.isConnected()) {
                                    this.b.zzbfE.zzFm().zzFK().log("Connected to remote service");
                                    this.b.zzbfE.zza(com_google_android_gms_measurement_internal_zzm);
                                }
                            }
                        }
                    });
                } catch (DeadObjectException e) {
                    this.zzbfH = null;
                    this.zzbfG = false;
                } catch (IllegalStateException e2) {
                    this.zzbfH = null;
                    this.zzbfG = false;
                }
            }
        }

        public void onConnectionFailed(ConnectionResult connectionResult) {
            zzaa.zzdc("MeasurementServiceConnection.onConnectionFailed");
            zzp zzFY = this.zzbfE.zzbbl.zzFY();
            if (zzFY != null) {
                zzFY.zzFG().zzj("Service connection failed", connectionResult);
            }
            synchronized (this) {
                this.zzbfG = false;
                this.zzbfH = null;
            }
        }

        public void onConnectionSuspended(int i) {
            zzaa.zzdc("MeasurementServiceConnection.onConnectionSuspended");
            this.zzbfE.zzFm().zzFK().log("Service connection suspended");
            this.zzbfE.zzFl().zzg(new Runnable(this) {
                final /* synthetic */ zza a;

                {
                    this.a = r1;
                }

                public void run() {
                    this.a.zzbfE.onServiceDisconnected(new ComponentName(this.a.zzbfE.getContext(), "com.google.android.gms.measurement.AppMeasurementService"));
                }
            });
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            zzaa.zzdc("MeasurementServiceConnection.onServiceConnected");
            synchronized (this) {
                if (iBinder == null) {
                    this.zzbfG = false;
                    this.zzbfE.zzFm().zzFE().log("Service connected with null binder");
                    return;
                }
                zzm com_google_android_gms_measurement_internal_zzm = null;
                try {
                    String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                    if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                        com_google_android_gms_measurement_internal_zzm = com.google.android.gms.measurement.internal.zzm.zza.zzdv(iBinder);
                        this.zzbfE.zzFm().zzFL().log("Bound to IMeasurementService interface");
                    } else {
                        this.zzbfE.zzFm().zzFE().zzj("Got binder with a wrong descriptor", interfaceDescriptor);
                    }
                } catch (RemoteException e) {
                    this.zzbfE.zzFm().zzFE().log("Service connect failed to get IMeasurementService");
                }
                if (com_google_android_gms_measurement_internal_zzm == null) {
                    this.zzbfG = false;
                    try {
                        com.google.android.gms.common.stats.zzb.zzuH().zza(this.zzbfE.getContext(), this.zzbfE.zzbfx);
                    } catch (IllegalArgumentException e2) {
                    }
                } else {
                    this.zzbfE.zzFl().zzg(new Runnable(this) {
                        final /* synthetic */ zza b;

                        public void run() {
                            synchronized (this.b) {
                                this.b.zzbfG = false;
                                if (!this.b.zzbfE.isConnected()) {
                                    this.b.zzbfE.zzFm().zzFL().log("Connected to service");
                                    this.b.zzbfE.zza(com_google_android_gms_measurement_internal_zzm);
                                }
                            }
                        }
                    });
                }
            }
        }

        public void onServiceDisconnected(final ComponentName componentName) {
            zzaa.zzdc("MeasurementServiceConnection.onServiceDisconnected");
            this.zzbfE.zzFm().zzFK().log("Service disconnected");
            this.zzbfE.zzFl().zzg(new Runnable(this) {
                final /* synthetic */ zza b;

                public void run() {
                    this.b.zzbfE.onServiceDisconnected(componentName);
                }
            });
        }

        public void zzGF() {
            this.zzbfE.zzkN();
            Context context = this.zzbfE.getContext();
            synchronized (this) {
                if (this.zzbfG) {
                    this.zzbfE.zzFm().zzFL().log("Connection attempt already in progress");
                } else if (this.zzbfH != null) {
                    this.zzbfE.zzFm().zzFL().log("Already awaiting connection attempt");
                } else {
                    this.zzbfH = new zzo(context, Looper.getMainLooper(), this, this);
                    this.zzbfE.zzFm().zzFL().log("Connecting to remote service");
                    this.zzbfG = true;
                    this.zzbfH.zztj();
                }
            }
        }

        public void zzx(Intent intent) {
            this.zzbfE.zzkN();
            Context context = this.zzbfE.getContext();
            com.google.android.gms.common.stats.zzb zzuH = com.google.android.gms.common.stats.zzb.zzuH();
            synchronized (this) {
                if (this.zzbfG) {
                    this.zzbfE.zzFm().zzFL().log("Connection attempt already in progress");
                    return;
                }
                this.zzbfG = true;
                zzuH.zza(context, intent, this.zzbfE.zzbfx, 129);
            }
        }
    }

    protected zzad(zzx com_google_android_gms_measurement_internal_zzx) {
        super(com_google_android_gms_measurement_internal_zzx);
        this.zzbfB = new d(com_google_android_gms_measurement_internal_zzx.zzlQ());
        this.zzbfx = new zza(this);
        this.zzbfA = new g(this, com_google_android_gms_measurement_internal_zzx) {
            final /* synthetic */ zzad a;

            public void a() {
                this.a.zzmo();
            }
        };
        this.zzbfD = new g(this, com_google_android_gms_measurement_internal_zzx) {
            final /* synthetic */ zzad a;

            public void a() {
                this.a.zzFm().zzFG().log("Tasks have been queued for a long time");
            }
        };
    }

    private void onServiceDisconnected(ComponentName componentName) {
        zzkN();
        if (this.zzbfy != null) {
            this.zzbfy = null;
            zzFm().zzFL().zzj("Disconnected from device MeasurementService", componentName);
            zzGD();
        }
    }

    private boolean zzGB() {
        List queryIntentServices = getContext().getPackageManager().queryIntentServices(new Intent().setClassName(getContext(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        return queryIntentServices != null && queryIntentServices.size() > 0;
    }

    private void zzGD() {
        zzkN();
        zzmC();
    }

    private void zzGE() {
        zzkN();
        zzFm().zzFL().zzj("Processing queued up service tasks", Integer.valueOf(this.zzbfC.size()));
        for (Runnable zzg : this.zzbfC) {
            zzFl().zzg(zzg);
        }
        this.zzbfC.clear();
        this.zzbfD.c();
    }

    private void zza(zzm com_google_android_gms_measurement_internal_zzm) {
        zzkN();
        zzaa.zzz(com_google_android_gms_measurement_internal_zzm);
        this.zzbfy = com_google_android_gms_measurement_internal_zzm;
        zzmn();
        zzGE();
    }

    private void zzi(Runnable runnable) throws IllegalStateException {
        zzkN();
        if (isConnected()) {
            runnable.run();
        } else if (((long) this.zzbfC.size()) >= zzFo().zzEQ()) {
            zzFm().zzFE().log("Discarding data. Max runnable queue size reached");
        } else {
            this.zzbfC.add(runnable);
            if (!this.zzbbl.zzGh()) {
                this.zzbfD.a(60000);
            }
            zzmC();
        }
    }

    private void zzmn() {
        zzkN();
        this.zzbfB.a();
        if (!this.zzbbl.zzGh()) {
            this.zzbfA.a(zzFo().zznr());
        }
    }

    private void zzmo() {
        zzkN();
        if (isConnected()) {
            zzFm().zzFL().log("Inactivity, disconnecting from AppMeasurementService");
            disconnect();
        }
    }

    public void disconnect() {
        zzkN();
        zzma();
        try {
            com.google.android.gms.common.stats.zzb.zzuH().zza(getContext(), this.zzbfx);
        } catch (IllegalStateException e) {
        } catch (IllegalArgumentException e2) {
        }
        this.zzbfy = null;
    }

    public /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    public boolean isConnected() {
        zzkN();
        zzma();
        return this.zzbfy != null;
    }

    public /* bridge */ /* synthetic */ void zzFb() {
        super.zzFb();
    }

    public /* bridge */ /* synthetic */ f zzFc() {
        return super.zzFc();
    }

    public /* bridge */ /* synthetic */ zzac zzFd() {
        return super.zzFd();
    }

    public /* bridge */ /* synthetic */ zzn zzFe() {
        return super.zzFe();
    }

    public /* bridge */ /* synthetic */ zzg zzFf() {
        return super.zzFf();
    }

    public /* bridge */ /* synthetic */ zzad zzFg() {
        return super.zzFg();
    }

    public /* bridge */ /* synthetic */ zze zzFh() {
        return super.zzFh();
    }

    public /* bridge */ /* synthetic */ zzal zzFi() {
        return super.zzFi();
    }

    public /* bridge */ /* synthetic */ zzv zzFj() {
        return super.zzFj();
    }

    public /* bridge */ /* synthetic */ zzaf zzFk() {
        return super.zzFk();
    }

    public /* bridge */ /* synthetic */ zzw zzFl() {
        return super.zzFl();
    }

    public /* bridge */ /* synthetic */ zzp zzFm() {
        return super.zzFm();
    }

    public /* bridge */ /* synthetic */ zzt zzFn() {
        return super.zzFn();
    }

    public /* bridge */ /* synthetic */ zzd zzFo() {
        return super.zzFo();
    }

    protected void zzGA() {
        zzkN();
        zzma();
        zzi(new Runnable(this) {
            final /* synthetic */ zzad a;

            {
                this.a = r1;
            }

            public void run() {
                zzm zzc = this.a.zzbfy;
                if (zzc == null) {
                    this.a.zzFm().zzFE().log("Failed to send measurementEnabled to service");
                    return;
                }
                try {
                    zzc.zzb(this.a.zzFe().zzfs(this.a.zzFm().zzFM()));
                    this.a.zzmn();
                } catch (RemoteException e) {
                    this.a.zzFm().zzFE().zzj("Failed to send measurementEnabled to AppMeasurementService", e);
                }
            }
        });
    }

    protected boolean zzGC() {
        zzkN();
        zzma();
        if (zzFo().zzmW()) {
            return true;
        }
        zzFm().zzFL().log("Checking service availability");
        switch (com.google.android.gms.common.zzc.zzqV().isGooglePlayServicesAvailable(getContext())) {
            case 0:
                zzFm().zzFL().log("Service available");
                return true;
            case 1:
                zzFm().zzFL().log("Service missing");
                return false;
            case 2:
                zzFm().zzFK().log("Service container out of date");
                return true;
            case 3:
                zzFm().zzFG().log("Service disabled");
                return false;
            case 9:
                zzFm().zzFG().log("Service invalid");
                return false;
            case 18:
                zzFm().zzFG().log("Service updating");
                return true;
            default:
                return false;
        }
    }

    protected void zzGx() {
        zzkN();
        zzma();
        zzi(new Runnable(this) {
            final /* synthetic */ zzad a;

            {
                this.a = r1;
            }

            public void run() {
                zzm zzc = this.a.zzbfy;
                if (zzc == null) {
                    this.a.zzFm().zzFE().log("Discarding data. Failed to send app launch");
                    return;
                }
                try {
                    zzc.zza(this.a.zzFe().zzfs(this.a.zzFm().zzFM()));
                    this.a.zzmn();
                } catch (RemoteException e) {
                    this.a.zzFm().zzFE().zzj("Failed to send app launch to AppMeasurementService", e);
                }
            }
        });
    }

    protected void zza(final UserAttributeParcel userAttributeParcel) {
        zzkN();
        zzma();
        zzi(new Runnable(this) {
            final /* synthetic */ zzad b;

            public void run() {
                zzm zzc = this.b.zzbfy;
                if (zzc == null) {
                    this.b.zzFm().zzFE().log("Discarding data. Failed to set user attribute");
                    return;
                }
                try {
                    zzc.zza(userAttributeParcel, this.b.zzFe().zzfs(this.b.zzFm().zzFM()));
                    this.b.zzmn();
                } catch (RemoteException e) {
                    this.b.zzFm().zzFE().zzj("Failed to send attribute to AppMeasurementService", e);
                }
            }
        });
    }

    protected void zza(final AtomicReference<List<UserAttributeParcel>> atomicReference, final boolean z) {
        zzkN();
        zzma();
        zzi(new Runnable(this) {
            final /* synthetic */ zzad c;

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                r5 = this;
                r1 = r2;
                monitor-enter(r1);
                r0 = r5.c;	 Catch:{ RemoteException -> 0x0046 }
                r0 = r0.zzbfy;	 Catch:{ RemoteException -> 0x0046 }
                if (r0 != 0) goto L_0x0021;
            L_0x000b:
                r0 = r5.c;	 Catch:{ RemoteException -> 0x0046 }
                r0 = r0.zzFm();	 Catch:{ RemoteException -> 0x0046 }
                r0 = r0.zzFE();	 Catch:{ RemoteException -> 0x0046 }
                r2 = "Failed to get user properties";
                r0.log(r2);	 Catch:{ RemoteException -> 0x0046 }
                r0 = r2;	 Catch:{ all -> 0x0043 }
                r0.notify();	 Catch:{ all -> 0x0043 }
                monitor-exit(r1);	 Catch:{ all -> 0x0043 }
            L_0x0020:
                return;
            L_0x0021:
                r2 = r2;	 Catch:{ RemoteException -> 0x0046 }
                r3 = r5.c;	 Catch:{ RemoteException -> 0x0046 }
                r3 = r3.zzFe();	 Catch:{ RemoteException -> 0x0046 }
                r4 = 0;
                r3 = r3.zzfs(r4);	 Catch:{ RemoteException -> 0x0046 }
                r4 = r3;	 Catch:{ RemoteException -> 0x0046 }
                r0 = r0.zza(r3, r4);	 Catch:{ RemoteException -> 0x0046 }
                r2.set(r0);	 Catch:{ RemoteException -> 0x0046 }
                r0 = r5.c;	 Catch:{ RemoteException -> 0x0046 }
                r0.zzmn();	 Catch:{ RemoteException -> 0x0046 }
                r0 = r2;	 Catch:{ all -> 0x0043 }
                r0.notify();	 Catch:{ all -> 0x0043 }
            L_0x0041:
                monitor-exit(r1);	 Catch:{ all -> 0x0043 }
                goto L_0x0020;
            L_0x0043:
                r0 = move-exception;
                monitor-exit(r1);	 Catch:{ all -> 0x0043 }
                throw r0;
            L_0x0046:
                r0 = move-exception;
                r2 = r5.c;	 Catch:{ all -> 0x005c }
                r2 = r2.zzFm();	 Catch:{ all -> 0x005c }
                r2 = r2.zzFE();	 Catch:{ all -> 0x005c }
                r3 = "Failed to get user properties";
                r2.zzj(r3, r0);	 Catch:{ all -> 0x005c }
                r0 = r2;	 Catch:{ all -> 0x0043 }
                r0.notify();	 Catch:{ all -> 0x0043 }
                goto L_0x0041;
            L_0x005c:
                r0 = move-exception;
                r2 = r2;	 Catch:{ all -> 0x0043 }
                r2.notify();	 Catch:{ all -> 0x0043 }
                throw r0;	 Catch:{ all -> 0x0043 }
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzad.6.run():void");
            }
        });
    }

    protected void zzc(final EventParcel eventParcel, final String str) {
        zzaa.zzz(eventParcel);
        zzkN();
        zzma();
        zzi(new Runnable(this) {
            final /* synthetic */ zzad c;

            public void run() {
                zzm zzc = this.c.zzbfy;
                if (zzc == null) {
                    this.c.zzFm().zzFE().log("Discarding data. Failed to send event to service");
                    return;
                }
                try {
                    if (TextUtils.isEmpty(str)) {
                        zzc.zza(eventParcel, this.c.zzFe().zzfs(this.c.zzFm().zzFM()));
                    } else {
                        zzc.zza(eventParcel, str, this.c.zzFm().zzFM());
                    }
                    this.c.zzmn();
                } catch (RemoteException e) {
                    this.c.zzFm().zzFE().zzj("Failed to send event to AppMeasurementService", e);
                }
            }
        });
    }

    public /* bridge */ /* synthetic */ void zzkN() {
        super.zzkN();
    }

    protected void zzkO() {
    }

    public /* bridge */ /* synthetic */ void zzlP() {
        super.zzlP();
    }

    public /* bridge */ /* synthetic */ zze zzlQ() {
        return super.zzlQ();
    }

    void zzmC() {
        zzkN();
        zzma();
        if (!isConnected()) {
            if (this.zzbfz == null) {
                this.zzbfz = zzFn().e();
                if (this.zzbfz == null) {
                    zzFm().zzFL().log("State of service unknown");
                    this.zzbfz = Boolean.valueOf(zzGC());
                    zzFn().a(this.zzbfz.booleanValue());
                }
            }
            if (this.zzbfz.booleanValue()) {
                zzFm().zzFL().log("Using measurement service");
                this.zzbfx.zzGF();
            } else if (!this.zzbbl.zzGh() && zzGB()) {
                zzFm().zzFL().log("Using local app measurement service");
                Intent intent = new Intent("com.google.android.gms.measurement.START");
                intent.setComponent(new ComponentName(getContext(), "com.google.android.gms.measurement.AppMeasurementService"));
                this.zzbfx.zzx(intent);
            } else if (zzFo().zzmX()) {
                zzFm().zzFL().log("Using direct local measurement implementation");
                zza(new zzy(this.zzbbl, true));
            } else {
                zzFm().zzFE().log("Not in main process. Unable to use local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            }
        }
    }
}
