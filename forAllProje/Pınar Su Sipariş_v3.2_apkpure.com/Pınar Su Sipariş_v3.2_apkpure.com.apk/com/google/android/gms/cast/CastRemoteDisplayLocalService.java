package com.google.android.gms.cast;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.support.v4.app.NotificationCompat;
import android.support.v7.c.g;
import android.support.v7.c.g.f;
import android.text.TextUtils;
import android.view.Display;
import com.google.android.gms.R;
import com.google.android.gms.cast.CastRemoteDisplay.CastRemoteDisplayOptions;
import com.google.android.gms.cast.CastRemoteDisplay.CastRemoteDisplaySessionCallbacks;
import com.google.android.gms.cast.CastRemoteDisplay.CastRemoteDisplaySessionResult;
import com.google.android.gms.cast.internal.zzl;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.Builder;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.drive.DriveFile;
import java.util.concurrent.atomic.AtomicBoolean;

@TargetApi(19)
public abstract class CastRemoteDisplayLocalService extends Service {
    private static final zzl zzaeJ = new zzl("CastRemoteDisplayLocalService");
    private static final int zzaeK = zzpJ();
    private static final Object zzaeL = new Object();
    private static AtomicBoolean zzaeM = new AtomicBoolean(false);
    private static CastRemoteDisplayLocalService zzafa;
    private Handler mHandler;
    private Notification mNotification;
    private Display zzId;
    private GoogleApiClient zzaeN;
    private CastRemoteDisplaySessionCallbacks zzaeO;
    private Callbacks zzaeP;
    private b zzaeQ;
    private NotificationSettings zzaeR;
    private boolean zzaeS;
    private PendingIntent zzaeT;
    private CastDevice zzaeU;
    private Context zzaeV;
    private ServiceConnection zzaeW;
    private g zzaeX;
    private boolean zzaeY = false;
    private final android.support.v7.c.g.a zzaeZ = new android.support.v7.c.g.a(this) {
        final /* synthetic */ CastRemoteDisplayLocalService a;

        {
            this.a = r1;
        }

        public void onRouteUnselected(g gVar, f fVar) {
            this.a.zzbH("onRouteUnselected");
            if (this.a.zzaeU == null) {
                this.a.zzbH("onRouteUnselected, no device was selected");
            } else if (CastDevice.getFromBundle(fVar.m()).getDeviceId().equals(this.a.zzaeU.getDeviceId())) {
                CastRemoteDisplayLocalService.stopService();
            } else {
                this.a.zzbH("onRouteUnselected, device does not match");
            }
        }
    };
    private String zzaeg;
    private final IBinder zzafb = new a();

    class AnonymousClass5 implements ServiceConnection {
        final /* synthetic */ String a;
        final /* synthetic */ CastDevice b;
        final /* synthetic */ NotificationSettings c;
        final /* synthetic */ Context d;
        final /* synthetic */ Callbacks e;

        AnonymousClass5(String str, CastDevice castDevice, NotificationSettings notificationSettings, Context context, Callbacks callbacks) {
            this.a = str;
            this.b = castDevice;
            this.c = notificationSettings;
            this.d = context;
            this.e = callbacks;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            CastRemoteDisplayLocalService a = ((a) iBinder).a();
            if (a == null || !a.zza(this.a, this.b, this.c, this.d, this, this.e)) {
                CastRemoteDisplayLocalService.zzaeJ.zzc("Connected but unable to get the service instance", new Object[0]);
                this.e.onRemoteDisplaySessionError(new Status(CastStatusCodes.ERROR_SERVICE_CREATION_FAILED));
                CastRemoteDisplayLocalService.zzaeM.set(false);
                try {
                    this.d.unbindService(this);
                } catch (IllegalArgumentException e) {
                    CastRemoteDisplayLocalService.zzaeJ.zzb("No need to unbind service, already unbound", new Object[0]);
                }
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            CastRemoteDisplayLocalService.zzaeJ.zzb("onServiceDisconnected", new Object[0]);
            this.e.onRemoteDisplaySessionError(new Status(CastStatusCodes.ERROR_SERVICE_DISCONNECTED, "Service Disconnected"));
            CastRemoteDisplayLocalService.zzaeM.set(false);
            try {
                this.d.unbindService(this);
            } catch (IllegalArgumentException e) {
                CastRemoteDisplayLocalService.zzaeJ.zzb("No need to unbind service, already unbound", new Object[0]);
            }
        }
    }

    public interface Callbacks {
        void onRemoteDisplaySessionError(Status status);

        void onRemoteDisplaySessionStarted(CastRemoteDisplayLocalService castRemoteDisplayLocalService);

        void onServiceCreated(CastRemoteDisplayLocalService castRemoteDisplayLocalService);
    }

    public static final class NotificationSettings {
        private Notification mNotification;
        private PendingIntent zzafi;
        private String zzafj;
        private String zzafk;

        public static final class Builder {
            private NotificationSettings zzafl = new NotificationSettings();

            public NotificationSettings build() {
                if (this.zzafl.mNotification != null) {
                    if (!TextUtils.isEmpty(this.zzafl.zzafj)) {
                        throw new IllegalArgumentException("notificationTitle requires using the default notification");
                    } else if (!TextUtils.isEmpty(this.zzafl.zzafk)) {
                        throw new IllegalArgumentException("notificationText requires using the default notification");
                    } else if (this.zzafl.zzafi != null) {
                        throw new IllegalArgumentException("notificationPendingIntent requires using the default notification");
                    }
                } else if (TextUtils.isEmpty(this.zzafl.zzafj) && TextUtils.isEmpty(this.zzafl.zzafk) && this.zzafl.zzafi == null) {
                    throw new IllegalArgumentException("At least an argument must be provided");
                }
                return this.zzafl;
            }

            public Builder setNotification(Notification notification) {
                this.zzafl.mNotification = notification;
                return this;
            }

            public Builder setNotificationPendingIntent(PendingIntent pendingIntent) {
                this.zzafl.zzafi = pendingIntent;
                return this;
            }

            public Builder setNotificationText(String str) {
                this.zzafl.zzafk = str;
                return this;
            }

            public Builder setNotificationTitle(String str) {
                this.zzafl.zzafj = str;
                return this;
            }
        }

        private NotificationSettings() {
        }

        private NotificationSettings(NotificationSettings notificationSettings) {
            this.mNotification = notificationSettings.mNotification;
            this.zzafi = notificationSettings.zzafi;
            this.zzafj = notificationSettings.zzafj;
            this.zzafk = notificationSettings.zzafk;
        }
    }

    private class a extends Binder {
        final /* synthetic */ CastRemoteDisplayLocalService a;

        private a(CastRemoteDisplayLocalService castRemoteDisplayLocalService) {
            this.a = castRemoteDisplayLocalService;
        }

        CastRemoteDisplayLocalService a() {
            return this.a;
        }
    }

    private static final class b extends BroadcastReceiver {
        private b() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("com.google.android.gms.cast.remote_display.ACTION_NOTIFICATION_DISCONNECT")) {
                CastRemoteDisplayLocalService.zzaeJ.zzb("disconnecting", new Object[0]);
                CastRemoteDisplayLocalService.stopService();
            }
        }
    }

    public static CastRemoteDisplayLocalService getInstance() {
        CastRemoteDisplayLocalService castRemoteDisplayLocalService;
        synchronized (zzaeL) {
            castRemoteDisplayLocalService = zzafa;
        }
        return castRemoteDisplayLocalService;
    }

    protected static void setDebugEnabled() {
        zzaeJ.zzag(true);
    }

    public static void startService(Context context, Class<? extends CastRemoteDisplayLocalService> cls, String str, CastDevice castDevice, NotificationSettings notificationSettings, Callbacks callbacks) {
        zzaeJ.zzb("Starting Service", new Object[0]);
        synchronized (zzaeL) {
            if (zzafa != null) {
                zzaeJ.zzf("An existing service had not been stopped before starting one", new Object[0]);
                zzaa(true);
            }
        }
        zza(context, (Class) cls);
        zzaa.zzb((Object) context, (Object) "activityContext is required.");
        zzaa.zzb((Object) cls, (Object) "serviceClass is required.");
        zzaa.zzb((Object) str, (Object) "applicationId is required.");
        zzaa.zzb((Object) castDevice, (Object) "device is required.");
        zzaa.zzb((Object) notificationSettings, (Object) "notificationSettings is required.");
        zzaa.zzb((Object) callbacks, (Object) "callbacks is required.");
        if (notificationSettings.mNotification == null && notificationSettings.zzafi == null) {
            throw new IllegalArgumentException("notificationSettings: Either the notification or the notificationPendingIntent must be provided");
        } else if (zzaeM.getAndSet(true)) {
            zzaeJ.zzc("Service is already being started, startService has been called twice", new Object[0]);
        } else {
            Intent intent = new Intent(context, cls);
            context.startService(intent);
            context.bindService(intent, new AnonymousClass5(str, castDevice, notificationSettings, context, callbacks), 64);
        }
    }

    public static void stopService() {
        zzaa(false);
    }

    private void zzY(final boolean z) {
        if (this.mHandler == null) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.mHandler.post(new Runnable(this) {
                final /* synthetic */ CastRemoteDisplayLocalService b;

                public void run() {
                    this.b.zzZ(z);
                }
            });
        } else {
            zzZ(z);
        }
    }

    private void zzZ(boolean z) {
        zzbH("Stopping Service");
        zzaa.zzdc("stopServiceInstanceInternal must be called on the main thread");
        if (!(z || this.zzaeX == null)) {
            zzbH("Setting default route");
            this.zzaeX.a(this.zzaeX.b());
        }
        if (this.zzaeQ != null) {
            zzbH("Unregistering notification receiver");
            unregisterReceiver(this.zzaeQ);
        }
        zzpO();
        zzpP();
        zzpK();
        if (this.zzaeN != null) {
            this.zzaeN.disconnect();
            this.zzaeN = null;
        }
        if (!(this.zzaeV == null || this.zzaeW == null)) {
            try {
                this.zzaeV.unbindService(this.zzaeW);
            } catch (IllegalArgumentException e) {
                zzbH("No need to unbind service, already unbound");
            }
            this.zzaeW = null;
            this.zzaeV = null;
        }
        this.zzaeg = null;
        this.zzaeN = null;
        this.mNotification = null;
        this.zzId = null;
    }

    private GoogleApiClient zza(CastDevice castDevice) {
        return new Builder(this, new ConnectionCallbacks(this) {
            final /* synthetic */ CastRemoteDisplayLocalService a;

            {
                this.a = r1;
            }

            public void onConnected(Bundle bundle) {
                this.a.zzbH("onConnected");
                this.a.zzpL();
            }

            public void onConnectionSuspended(int i) {
                CastRemoteDisplayLocalService.zzaeJ.zzf(String.format("[Instance: %s] ConnectionSuspended %d", new Object[]{this, Integer.valueOf(i)}), new Object[0]);
            }
        }, new OnConnectionFailedListener(this) {
            final /* synthetic */ CastRemoteDisplayLocalService a;

            {
                this.a = r1;
            }

            public void onConnectionFailed(ConnectionResult connectionResult) {
                CastRemoteDisplayLocalService castRemoteDisplayLocalService = this.a;
                String valueOf = String.valueOf(connectionResult);
                castRemoteDisplayLocalService.zzbK(new StringBuilder(String.valueOf(valueOf).length() + 19).append("Connection failed: ").append(valueOf).toString());
                this.a.zzpN();
            }
        }).addApi(CastRemoteDisplay.API, new CastRemoteDisplayOptions.Builder(castDevice, this.zzaeO).build()).build();
    }

    private static void zza(Context context, Class cls) {
        try {
            ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, cls), 128);
            if (serviceInfo != null && serviceInfo.exported) {
                throw new IllegalStateException("The service must not be exported, verify the manifest configuration");
            }
        } catch (NameNotFoundException e) {
            throw new IllegalStateException("Service not found, did you forget to configure it in the manifest?");
        }
    }

    private void zza(Display display) {
        this.zzId = display;
        if (this.zzaeS) {
            this.mNotification = zzab(true);
            startForeground(zzaeK, this.mNotification);
        }
        if (this.zzaeP != null) {
            this.zzaeP.onRemoteDisplaySessionStarted(this);
            this.zzaeP = null;
        }
        onCreatePresentation(this.zzId);
    }

    private void zza(NotificationSettings notificationSettings) {
        zzaa.zzdc("updateNotificationSettingsInternal must be called on the main thread");
        if (this.zzaeR == null) {
            throw new IllegalStateException("No current notification settings to update");
        }
        if (!this.zzaeS) {
            zzaa.zzb(notificationSettings.mNotification, (Object) "notification is required.");
            this.mNotification = notificationSettings.mNotification;
            this.zzaeR.mNotification = this.mNotification;
        } else if (notificationSettings.mNotification != null) {
            throw new IllegalStateException("Current mode is default notification, notification attribute must not be provided");
        } else {
            if (notificationSettings.zzafi != null) {
                this.zzaeR.zzafi = notificationSettings.zzafi;
            }
            if (!TextUtils.isEmpty(notificationSettings.zzafj)) {
                this.zzaeR.zzafj = notificationSettings.zzafj;
            }
            if (!TextUtils.isEmpty(notificationSettings.zzafk)) {
                this.zzaeR.zzafk = notificationSettings.zzafk;
            }
            this.mNotification = zzab(true);
        }
        startForeground(zzaeK, this.mNotification);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean zza(java.lang.String r8, com.google.android.gms.cast.CastDevice r9, com.google.android.gms.cast.CastRemoteDisplayLocalService.NotificationSettings r10, android.content.Context r11, android.content.ServiceConnection r12, com.google.android.gms.cast.CastRemoteDisplayLocalService.Callbacks r13) {
        /*
        r7 = this;
        r6 = 0;
        r1 = 1;
        r0 = 0;
        r2 = "startRemoteDisplaySession";
        r7.zzbH(r2);
        r2 = "Starting the Cast Remote Display must be done on the main thread";
        com.google.android.gms.common.internal.zzaa.zzdc(r2);
        r2 = zzaeL;
        monitor-enter(r2);
        r3 = zzafa;	 Catch:{ all -> 0x00ac }
        if (r3 == 0) goto L_0x0020;
    L_0x0014:
        r1 = zzaeJ;	 Catch:{ all -> 0x00ac }
        r3 = "An existing service had not been stopped before starting one";
        r4 = 0;
        r4 = new java.lang.Object[r4];	 Catch:{ all -> 0x00ac }
        r1.zzf(r3, r4);	 Catch:{ all -> 0x00ac }
        monitor-exit(r2);	 Catch:{ all -> 0x00ac }
    L_0x001f:
        return r0;
    L_0x0020:
        zzafa = r7;	 Catch:{ all -> 0x00ac }
        monitor-exit(r2);	 Catch:{ all -> 0x00ac }
        r7.zzaeP = r13;
        r7.zzaeg = r8;
        r7.zzaeU = r9;
        r7.zzaeV = r11;
        r7.zzaeW = r12;
        r2 = r7.getApplicationContext();
        r2 = android.support.v7.c.g.a(r2);
        r7.zzaeX = r2;
        r2 = new android.support.v7.c.f$a;
        r2.<init>();
        r3 = r7.zzaeg;
        r3 = com.google.android.gms.cast.CastMediaControlIntent.categoryForCast(r3);
        r2 = r2.a(r3);
        r2 = r2.a();
        r3 = "addMediaRouterCallback";
        r7.zzbH(r3);
        r3 = r7.zzaeX;
        r4 = r7.zzaeZ;
        r5 = 4;
        r3.a(r2, r4, r5);
        r2 = new com.google.android.gms.cast.CastRemoteDisplayLocalService$8;
        r2.<init>(r7);
        r7.zzaeO = r2;
        r2 = r10.mNotification;
        r7.mNotification = r2;
        r2 = new com.google.android.gms.cast.CastRemoteDisplayLocalService$b;
        r2.<init>();
        r7.zzaeQ = r2;
        r2 = r7.zzaeQ;
        r3 = new android.content.IntentFilter;
        r4 = "com.google.android.gms.cast.remote_display.ACTION_NOTIFICATION_DISCONNECT";
        r3.<init>(r4);
        r7.registerReceiver(r2, r3);
        r2 = new com.google.android.gms.cast.CastRemoteDisplayLocalService$NotificationSettings;
        r2.<init>(r10);
        r7.zzaeR = r2;
        r2 = r7.zzaeR;
        r2 = r2.mNotification;
        if (r2 != 0) goto L_0x00af;
    L_0x0086:
        r7.zzaeS = r1;
        r0 = r7.zzab(r0);
        r7.mNotification = r0;
    L_0x008e:
        r0 = zzaeK;
        r2 = r7.mNotification;
        r7.startForeground(r0, r2);
        r0 = r7.zza(r9);
        r7.zzaeN = r0;
        r0 = r7.zzaeN;
        r0.connect();
        r0 = r7.zzaeP;
        if (r0 == 0) goto L_0x00a9;
    L_0x00a4:
        r0 = r7.zzaeP;
        r0.onServiceCreated(r7);
    L_0x00a9:
        r0 = r1;
        goto L_0x001f;
    L_0x00ac:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x00ac }
        throw r0;
    L_0x00af:
        r7.zzaeS = r0;
        r0 = r7.zzaeR;
        r0 = r0.mNotification;
        r7.mNotification = r0;
        goto L_0x008e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.CastRemoteDisplayLocalService.zza(java.lang.String, com.google.android.gms.cast.CastDevice, com.google.android.gms.cast.CastRemoteDisplayLocalService$NotificationSettings, android.content.Context, android.content.ServiceConnection, com.google.android.gms.cast.CastRemoteDisplayLocalService$Callbacks):boolean");
    }

    private static void zzaa(boolean z) {
        zzaeJ.zzb("Stopping Service", new Object[0]);
        zzaeM.set(false);
        synchronized (zzaeL) {
            if (zzafa == null) {
                zzaeJ.zzc("Service is already being stopped", new Object[0]);
                return;
            }
            CastRemoteDisplayLocalService castRemoteDisplayLocalService = zzafa;
            zzafa = null;
            castRemoteDisplayLocalService.zzY(z);
        }
    }

    private Notification zzab(boolean z) {
        int i;
        int i2;
        CharSequence string;
        zzbH("createDefaultNotification");
        int i3 = getApplicationInfo().labelRes;
        CharSequence zzc = this.zzaeR.zzafj;
        CharSequence zzd = this.zzaeR.zzafk;
        if (z) {
            i = R.string.cast_notification_connected_message;
            i2 = R.drawable.cast_ic_notification_on;
        } else {
            i = R.string.cast_notification_connecting_message;
            i2 = R.drawable.cast_ic_notification_connecting;
        }
        if (TextUtils.isEmpty(zzc)) {
            zzc = getString(i3);
        }
        if (TextUtils.isEmpty(zzd)) {
            string = getString(i, new Object[]{this.zzaeU.getFriendlyName()});
        } else {
            string = zzd;
        }
        return new NotificationCompat.Builder(this).setContentTitle(zzc).setContentText(string).setContentIntent(this.zzaeR.zzafi).setSmallIcon(i2).setOngoing(true).addAction(17301560, getString(R.string.cast_notification_disconnect), zzpQ()).build();
    }

    private void zzbH(String str) {
        zzaeJ.zzb("[Instance: %s] %s", this, str);
    }

    private void zzbK(String str) {
        zzaeJ.zzc("[Instance: %s] %s", this, str);
    }

    private static int zzpJ() {
        return R.id.cast_notification_id;
    }

    private void zzpK() {
        if (this.zzaeX != null) {
            zzaa.zzdc("CastRemoteDisplayLocalService calls must be done on the main thread");
            zzbH("removeMediaRouterCallback");
            this.zzaeX.a(this.zzaeZ);
        }
    }

    private void zzpL() {
        zzbH("startRemoteDisplay");
        if (this.zzaeN == null || !this.zzaeN.isConnected()) {
            zzaeJ.zzc("Unable to start the remote display as the API client is not ready", new Object[0]);
        } else {
            CastRemoteDisplay.CastRemoteDisplayApi.startRemoteDisplay(this.zzaeN, this.zzaeg).setResultCallback(new ResultCallback<CastRemoteDisplaySessionResult>(this) {
                final /* synthetic */ CastRemoteDisplayLocalService a;

                {
                    this.a = r1;
                }

                /* JADX WARNING: inconsistent code. */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void a(com.google.android.gms.cast.CastRemoteDisplay.CastRemoteDisplaySessionResult r6) {
                    /*
                    r5 = this;
                    r4 = 0;
                    r3 = 0;
                    r0 = r6.getStatus();
                    r0 = r0.isSuccess();
                    if (r0 != 0) goto L_0x001d;
                L_0x000c:
                    r0 = com.google.android.gms.cast.CastRemoteDisplayLocalService.zzaeJ;
                    r1 = "Connection was not successful";
                    r2 = new java.lang.Object[r3];
                    r0.zzc(r1, r2);
                    r0 = r5.a;
                    r0.zzpN();
                L_0x001c:
                    return;
                L_0x001d:
                    r0 = com.google.android.gms.cast.CastRemoteDisplayLocalService.zzaeJ;
                    r1 = "startRemoteDisplay successful";
                    r2 = new java.lang.Object[r3];
                    r0.zzb(r1, r2);
                    r1 = com.google.android.gms.cast.CastRemoteDisplayLocalService.zzaeL;
                    monitor-enter(r1);
                    r0 = com.google.android.gms.cast.CastRemoteDisplayLocalService.zzafa;	 Catch:{ all -> 0x0046 }
                    if (r0 != 0) goto L_0x0049;
                L_0x0033:
                    r0 = com.google.android.gms.cast.CastRemoteDisplayLocalService.zzaeJ;	 Catch:{ all -> 0x0046 }
                    r2 = "Remote Display started but session already cancelled";
                    r3 = 0;
                    r3 = new java.lang.Object[r3];	 Catch:{ all -> 0x0046 }
                    r0.zzb(r2, r3);	 Catch:{ all -> 0x0046 }
                    r0 = r5.a;	 Catch:{ all -> 0x0046 }
                    r0.zzpN();	 Catch:{ all -> 0x0046 }
                    monitor-exit(r1);	 Catch:{ all -> 0x0046 }
                    goto L_0x001c;
                L_0x0046:
                    r0 = move-exception;
                    monitor-exit(r1);	 Catch:{ all -> 0x0046 }
                    throw r0;
                L_0x0049:
                    monitor-exit(r1);	 Catch:{ all -> 0x0046 }
                    r0 = r6.getPresentationDisplay();
                    if (r0 == 0) goto L_0x0086;
                L_0x0050:
                    r1 = r5.a;
                    r1.zza(r0);
                L_0x0055:
                    r0 = com.google.android.gms.cast.CastRemoteDisplayLocalService.zzaeM;
                    r0.set(r3);
                    r0 = r5.a;
                    r0 = r0.zzaeV;
                    if (r0 == 0) goto L_0x001c;
                L_0x0064:
                    r0 = r5.a;
                    r0 = r0.zzaeW;
                    if (r0 == 0) goto L_0x001c;
                L_0x006c:
                    r0 = r5.a;	 Catch:{ IllegalArgumentException -> 0x0092 }
                    r0 = r0.zzaeV;	 Catch:{ IllegalArgumentException -> 0x0092 }
                    r1 = r5.a;	 Catch:{ IllegalArgumentException -> 0x0092 }
                    r1 = r1.zzaeW;	 Catch:{ IllegalArgumentException -> 0x0092 }
                    r0.unbindService(r1);	 Catch:{ IllegalArgumentException -> 0x0092 }
                L_0x007b:
                    r0 = r5.a;
                    r0.zzaeW = r4;
                    r0 = r5.a;
                    r0.zzaeV = r4;
                    goto L_0x001c;
                L_0x0086:
                    r0 = com.google.android.gms.cast.CastRemoteDisplayLocalService.zzaeJ;
                    r1 = "Cast Remote Display session created without display";
                    r2 = new java.lang.Object[r3];
                    r0.zzc(r1, r2);
                    goto L_0x0055;
                L_0x0092:
                    r0 = move-exception;
                    r0 = com.google.android.gms.cast.CastRemoteDisplayLocalService.zzaeJ;
                    r1 = "No need to unbind service, already unbound";
                    r2 = new java.lang.Object[r3];
                    r0.zzb(r1, r2);
                    goto L_0x007b;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.CastRemoteDisplayLocalService.9.a(com.google.android.gms.cast.CastRemoteDisplay$CastRemoteDisplaySessionResult):void");
                }

                public /* synthetic */ void onResult(Result result) {
                    a((CastRemoteDisplaySessionResult) result);
                }
            });
        }
    }

    private void zzpM() {
        zzbH("stopRemoteDisplay");
        if (this.zzaeN == null || !this.zzaeN.isConnected()) {
            zzaeJ.zzc("Unable to stop the remote display as the API client is not ready", new Object[0]);
        } else {
            CastRemoteDisplay.CastRemoteDisplayApi.stopRemoteDisplay(this.zzaeN).setResultCallback(new ResultCallback<CastRemoteDisplaySessionResult>(this) {
                final /* synthetic */ CastRemoteDisplayLocalService a;

                {
                    this.a = r1;
                }

                public void a(CastRemoteDisplaySessionResult castRemoteDisplaySessionResult) {
                    if (castRemoteDisplaySessionResult.getStatus().isSuccess()) {
                        this.a.zzbH("remote display stopped");
                    } else {
                        this.a.zzbH("Unable to stop the remote display, result unsuccessful");
                    }
                    this.a.zzId = null;
                }

                public /* synthetic */ void onResult(Result result) {
                    a((CastRemoteDisplaySessionResult) result);
                }
            });
        }
    }

    private void zzpN() {
        if (this.zzaeP != null) {
            this.zzaeP.onRemoteDisplaySessionError(new Status(CastStatusCodes.ERROR_SERVICE_CREATION_FAILED));
            this.zzaeP = null;
        }
        stopService();
    }

    private void zzpO() {
        zzbH("stopRemoteDisplaySession");
        zzpM();
        onDismissPresentation();
    }

    private void zzpP() {
        zzbH("Stopping the remote display Service");
        stopForeground(true);
        stopSelf();
    }

    private PendingIntent zzpQ() {
        if (this.zzaeT == null) {
            Intent intent = new Intent("com.google.android.gms.cast.remote_display.ACTION_NOTIFICATION_DISCONNECT");
            intent.setPackage(this.zzaeV.getPackageName());
            this.zzaeT = PendingIntent.getBroadcast(this, 0, intent, DriveFile.MODE_READ_ONLY);
        }
        return this.zzaeT;
    }

    protected Display getDisplay() {
        return this.zzId;
    }

    public IBinder onBind(Intent intent) {
        zzbH("onBind");
        return this.zzafb;
    }

    public void onCreate() {
        zzbH("onCreate");
        super.onCreate();
        this.mHandler = new Handler(getMainLooper());
        this.mHandler.postDelayed(new Runnable(this) {
            final /* synthetic */ CastRemoteDisplayLocalService a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.zzbH("onCreate after delay. The local service been started: " + this.a.zzaeY);
                if (!this.a.zzaeY) {
                    this.a.zzbK("The local service has not been been started, stopping it");
                    this.a.stopSelf();
                }
            }
        }, 100);
    }

    public abstract void onCreatePresentation(Display display);

    public abstract void onDismissPresentation();

    public int onStartCommand(Intent intent, int i, int i2) {
        zzbH("onStartCommand");
        this.zzaeY = true;
        return 2;
    }

    public void updateNotificationSettings(final NotificationSettings notificationSettings) {
        zzaa.zzb((Object) notificationSettings, (Object) "notificationSettings is required.");
        zzaa.zzb(this.mHandler, (Object) "Service is not ready yet.");
        this.mHandler.post(new Runnable(this) {
            final /* synthetic */ CastRemoteDisplayLocalService b;

            public void run() {
                this.b.zza(notificationSettings);
            }
        });
    }
}
