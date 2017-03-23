package com.google.android.gms.cast.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.Cast.ApplicationConnectionResult;
import com.google.android.gms.cast.Cast.Listener;
import com.google.android.gms.cast.Cast.MessageReceivedCallback;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.JoinOptions;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.internal.zzj.zza;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.common.internal.zzk;
import com.google.android.gms.internal.zznt.zzb;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public class zze extends zzk<zzi> {
    private static final zzl zzaeJ = new zzl("CastClientImpl");
    private static final Object zzais = new Object();
    private static final Object zzait = new Object();
    private final Listener zzaet;
    private double zzafU;
    private boolean zzafV;
    private ApplicationMetadata zzahZ;
    private final CastDevice zzaia;
    private final Map<String, MessageReceivedCallback> zzaib = new HashMap();
    private final long zzaic;
    private b zzaid;
    private String zzaie;
    private boolean zzaif;
    private boolean zzaig;
    private boolean zzaih;
    private int zzaii;
    private int zzaij;
    private final AtomicLong zzaik = new AtomicLong(0);
    private String zzail;
    private String zzaim;
    private Bundle zzain;
    private final Map<Long, zzb<Status>> zzaio = new HashMap();
    private zzi zzaip;
    private zzb<ApplicationConnectionResult> zzaiq;
    private zzb<Status> zzair;

    static final class a implements ApplicationConnectionResult {
        private final Status a;
        private final ApplicationMetadata b;
        private final String c;
        private final String d;
        private final boolean e;

        public a(Status status) {
            this(status, null, null, null, false);
        }

        public a(Status status, ApplicationMetadata applicationMetadata, String str, String str2, boolean z) {
            this.a = status;
            this.b = applicationMetadata;
            this.c = str;
            this.d = str2;
            this.e = z;
        }

        public ApplicationMetadata getApplicationMetadata() {
            return this.b;
        }

        public String getApplicationStatus() {
            return this.c;
        }

        public String getSessionId() {
            return this.d;
        }

        public Status getStatus() {
            return this.a;
        }

        public boolean getWasLaunched() {
            return this.e;
        }
    }

    static class b extends zza {
        private final AtomicReference<zze> a;
        private final Handler b;

        public b(zze com_google_android_gms_cast_internal_zze) {
            this.a = new AtomicReference(com_google_android_gms_cast_internal_zze);
            this.b = new Handler(com_google_android_gms_cast_internal_zze.getLooper());
        }

        private void a(zze com_google_android_gms_cast_internal_zze, long j, int i) {
            synchronized (com_google_android_gms_cast_internal_zze.zzaio) {
                zzb com_google_android_gms_internal_zznt_zzb = (zzb) com_google_android_gms_cast_internal_zze.zzaio.remove(Long.valueOf(j));
            }
            if (com_google_android_gms_internal_zznt_zzb != null) {
                com_google_android_gms_internal_zznt_zzb.setResult(new Status(i));
            }
        }

        private boolean a(zze com_google_android_gms_cast_internal_zze, int i) {
            synchronized (zze.zzait) {
                if (com_google_android_gms_cast_internal_zze.zzair != null) {
                    com_google_android_gms_cast_internal_zze.zzair.setResult(new Status(i));
                    com_google_android_gms_cast_internal_zze.zzair = null;
                    return true;
                }
                return false;
            }
        }

        public zze a() {
            zze com_google_android_gms_cast_internal_zze = (zze) this.a.getAndSet(null);
            if (com_google_android_gms_cast_internal_zze == null) {
                return null;
            }
            com_google_android_gms_cast_internal_zze.zzqq();
            return com_google_android_gms_cast_internal_zze;
        }

        public boolean b() {
            return this.a.get() == null;
        }

        public void onApplicationDisconnected(final int i) {
            final zze com_google_android_gms_cast_internal_zze = (zze) this.a.get();
            if (com_google_android_gms_cast_internal_zze != null) {
                com_google_android_gms_cast_internal_zze.zzail = null;
                com_google_android_gms_cast_internal_zze.zzaim = null;
                a(com_google_android_gms_cast_internal_zze, i);
                if (com_google_android_gms_cast_internal_zze.zzaet != null) {
                    this.b.post(new Runnable(this) {
                        final /* synthetic */ b c;

                        public void run() {
                            com_google_android_gms_cast_internal_zze.zzaet.onApplicationDisconnected(i);
                        }
                    });
                }
            }
        }

        public void zza(ApplicationMetadata applicationMetadata, String str, String str2, boolean z) {
            zze com_google_android_gms_cast_internal_zze = (zze) this.a.get();
            if (com_google_android_gms_cast_internal_zze != null) {
                com_google_android_gms_cast_internal_zze.zzahZ = applicationMetadata;
                com_google_android_gms_cast_internal_zze.zzail = applicationMetadata.getApplicationId();
                com_google_android_gms_cast_internal_zze.zzaim = str2;
                com_google_android_gms_cast_internal_zze.zzaie = str;
                synchronized (zze.zzais) {
                    if (com_google_android_gms_cast_internal_zze.zzaiq != null) {
                        com_google_android_gms_cast_internal_zze.zzaiq.setResult(new a(new Status(0), applicationMetadata, str, str2, z));
                        com_google_android_gms_cast_internal_zze.zzaiq = null;
                    }
                }
            }
        }

        public void zza(String str, double d, boolean z) {
            zze.zzaeJ.zzb("Deprecated callback: \"onStatusreceived\"", new Object[0]);
        }

        public void zza(String str, long j, int i) {
            zze com_google_android_gms_cast_internal_zze = (zze) this.a.get();
            if (com_google_android_gms_cast_internal_zze != null) {
                a(com_google_android_gms_cast_internal_zze, j, i);
            }
        }

        public void zzb(final ApplicationStatus applicationStatus) {
            final zze com_google_android_gms_cast_internal_zze = (zze) this.a.get();
            if (com_google_android_gms_cast_internal_zze != null) {
                zze.zzaeJ.zzb("onApplicationStatusChanged", new Object[0]);
                this.b.post(new Runnable(this) {
                    final /* synthetic */ b c;

                    public void run() {
                        com_google_android_gms_cast_internal_zze.zza(applicationStatus);
                    }
                });
            }
        }

        public void zzb(final DeviceStatus deviceStatus) {
            final zze com_google_android_gms_cast_internal_zze = (zze) this.a.get();
            if (com_google_android_gms_cast_internal_zze != null) {
                zze.zzaeJ.zzb("onDeviceStatusChanged", new Object[0]);
                this.b.post(new Runnable(this) {
                    final /* synthetic */ b c;

                    public void run() {
                        com_google_android_gms_cast_internal_zze.zza(deviceStatus);
                    }
                });
            }
        }

        public void zzb(String str, byte[] bArr) {
            if (((zze) this.a.get()) != null) {
                zze.zzaeJ.zzb("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
            }
        }

        public void zzbr(int i) {
            zze a = a();
            if (a != null) {
                zze.zzaeJ.zzb("ICastDeviceControllerListener.onDisconnected: %d", Integer.valueOf(i));
                if (i != 0) {
                    a.zzbZ(2);
                }
            }
        }

        public void zzbs(int i) {
            zze com_google_android_gms_cast_internal_zze = (zze) this.a.get();
            if (com_google_android_gms_cast_internal_zze != null) {
                synchronized (zze.zzais) {
                    if (com_google_android_gms_cast_internal_zze.zzaiq != null) {
                        com_google_android_gms_cast_internal_zze.zzaiq.setResult(new a(new Status(i)));
                        com_google_android_gms_cast_internal_zze.zzaiq = null;
                    }
                }
            }
        }

        public void zzbt(int i) {
            zze com_google_android_gms_cast_internal_zze = (zze) this.a.get();
            if (com_google_android_gms_cast_internal_zze != null) {
                a(com_google_android_gms_cast_internal_zze, i);
            }
        }

        public void zzbu(int i) {
            zze com_google_android_gms_cast_internal_zze = (zze) this.a.get();
            if (com_google_android_gms_cast_internal_zze != null) {
                a(com_google_android_gms_cast_internal_zze, i);
            }
        }

        public void zzc(String str, long j) {
            zze com_google_android_gms_cast_internal_zze = (zze) this.a.get();
            if (com_google_android_gms_cast_internal_zze != null) {
                a(com_google_android_gms_cast_internal_zze, j, 0);
            }
        }

        public void zzx(final String str, final String str2) {
            final zze com_google_android_gms_cast_internal_zze = (zze) this.a.get();
            if (com_google_android_gms_cast_internal_zze != null) {
                zze.zzaeJ.zzb("Receive (type=text, ns=%s) %s", str, str2);
                this.b.post(new Runnable(this) {
                    final /* synthetic */ b d;

                    public void run() {
                        synchronized (com_google_android_gms_cast_internal_zze.zzaib) {
                            MessageReceivedCallback messageReceivedCallback = (MessageReceivedCallback) com_google_android_gms_cast_internal_zze.zzaib.get(str);
                        }
                        if (messageReceivedCallback != null) {
                            messageReceivedCallback.onMessageReceived(com_google_android_gms_cast_internal_zze.zzaia, str, str2);
                            return;
                        }
                        zze.zzaeJ.zzb("Discarded message for unknown namespace '%s'", str);
                    }
                });
            }
        }
    }

    public zze(Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, CastDevice castDevice, long j, Listener listener, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 10, com_google_android_gms_common_internal_zzg, connectionCallbacks, onConnectionFailedListener);
        this.zzaia = castDevice;
        this.zzaet = listener;
        this.zzaic = j;
        zzqq();
    }

    private void zza(ApplicationStatus applicationStatus) {
        boolean z;
        String zzqn = applicationStatus.zzqn();
        if (zzf.zza(zzqn, this.zzaie)) {
            z = false;
        } else {
            this.zzaie = zzqn;
            z = true;
        }
        zzaeJ.zzb("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(this.zzaif));
        if (this.zzaet != null && (z || this.zzaif)) {
            this.zzaet.onApplicationStatusChanged();
        }
        this.zzaif = false;
    }

    private void zza(DeviceStatus deviceStatus) {
        boolean z;
        ApplicationMetadata applicationMetadata = deviceStatus.getApplicationMetadata();
        if (!zzf.zza(applicationMetadata, this.zzahZ)) {
            this.zzahZ = applicationMetadata;
            this.zzaet.onApplicationMetadataChanged(this.zzahZ);
        }
        double zzqu = deviceStatus.zzqu();
        if (Double.isNaN(zzqu) || Math.abs(zzqu - this.zzafU) <= 1.0E-7d) {
            z = false;
        } else {
            this.zzafU = zzqu;
            z = true;
        }
        boolean zzqD = deviceStatus.zzqD();
        if (zzqD != this.zzafV) {
            this.zzafV = zzqD;
            z = true;
        }
        zzaeJ.zzb("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(this.zzaig));
        if (this.zzaet != null && (z || this.zzaig)) {
            this.zzaet.onVolumeChanged();
        }
        int zzqv = deviceStatus.zzqv();
        if (zzqv != this.zzaii) {
            this.zzaii = zzqv;
            z = true;
        } else {
            z = false;
        }
        zzaeJ.zzb("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(this.zzaig));
        if (this.zzaet != null && (z || this.zzaig)) {
            this.zzaet.onActiveInputStateChanged(this.zzaii);
        }
        zzqv = deviceStatus.zzqw();
        if (zzqv != this.zzaij) {
            this.zzaij = zzqv;
            z = true;
        } else {
            z = false;
        }
        zzaeJ.zzb("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(this.zzaig));
        if (this.zzaet != null && (z || this.zzaig)) {
            this.zzaet.onStandbyStateChanged(this.zzaij);
        }
        this.zzaig = false;
    }

    private void zza(zzb<ApplicationConnectionResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_cast_Cast_ApplicationConnectionResult) {
        synchronized (zzais) {
            if (this.zzaiq != null) {
                this.zzaiq.setResult(new a(new Status(2002)));
            }
            this.zzaiq = com_google_android_gms_internal_zznt_zzb_com_google_android_gms_cast_Cast_ApplicationConnectionResult;
        }
    }

    private void zzc(zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status) {
        synchronized (zzait) {
            if (this.zzair != null) {
                com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status.setResult(new Status(2001));
                return;
            }
            this.zzair = com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status;
        }
    }

    private void zzqq() {
        this.zzaih = false;
        this.zzaii = -1;
        this.zzaij = -1;
        this.zzahZ = null;
        this.zzaie = null;
        this.zzafU = 0.0d;
        this.zzafV = false;
    }

    private void zzqx() {
        zzaeJ.zzb("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (this.zzaib) {
            this.zzaib.clear();
        }
    }

    public void disconnect() {
        Throwable e;
        zzaeJ.zzb("disconnect(); ServiceListener=%s, isConnected=%b", this.zzaid, Boolean.valueOf(isConnected()));
        b bVar = this.zzaid;
        this.zzaid = null;
        if (bVar == null || bVar.a() == null) {
            zzaeJ.zzb("already disposed, so short-circuiting", new Object[0]);
            return;
        }
        zzqx();
        try {
            zzqs().disconnect();
            super.disconnect();
        } catch (RemoteException e2) {
            e = e2;
            try {
                zzaeJ.zzb(e, "Error while disconnecting the controller interface: %s", e.getMessage());
            } finally {
                super.disconnect();
            }
        } catch (IllegalStateException e3) {
            e = e3;
            zzaeJ.zzb(e, "Error while disconnecting the controller interface: %s", e.getMessage());
        }
    }

    public ApplicationMetadata getApplicationMetadata() throws IllegalStateException {
        zzqy();
        return this.zzahZ;
    }

    public String getApplicationStatus() throws IllegalStateException {
        zzqy();
        return this.zzaie;
    }

    public boolean isMute() throws IllegalStateException {
        zzqy();
        return this.zzafV;
    }

    public void onConnectionFailed(ConnectionResult connectionResult) {
        super.onConnectionFailed(connectionResult);
        zzqx();
    }

    protected void zza(int i, IBinder iBinder, Bundle bundle, int i2) {
        zzaeJ.zzb("in onPostInitHandler; statusCode=%d", Integer.valueOf(i));
        if (i == 0 || i == 1001) {
            this.zzaih = true;
            this.zzaif = true;
            this.zzaig = true;
        } else {
            this.zzaih = false;
        }
        if (i == 1001) {
            this.zzain = new Bundle();
            this.zzain.putBoolean(Cast.EXTRA_APP_NO_LONGER_RUNNING, true);
            i = 0;
        }
        super.zza(i, iBinder, bundle, i2);
    }

    public void zza(String str, MessageReceivedCallback messageReceivedCallback) throws IllegalArgumentException, IllegalStateException, RemoteException {
        zzf.zzcE(str);
        zzcD(str);
        if (messageReceivedCallback != null) {
            synchronized (this.zzaib) {
                this.zzaib.put(str, messageReceivedCallback);
            }
            zzqs().zzcI(str);
        }
    }

    public void zza(String str, LaunchOptions launchOptions, zzb<ApplicationConnectionResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_cast_Cast_ApplicationConnectionResult) throws IllegalStateException, RemoteException {
        zza((zzb) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_cast_Cast_ApplicationConnectionResult);
        zzqs().zza(str, launchOptions);
    }

    public void zza(String str, zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status) throws IllegalStateException, RemoteException {
        zzc((zzb) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status);
        zzqs().zzcH(str);
    }

    public void zza(String str, String str2, JoinOptions joinOptions, zzb<ApplicationConnectionResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_cast_Cast_ApplicationConnectionResult) throws IllegalStateException, RemoteException {
        zza((zzb) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_cast_Cast_ApplicationConnectionResult);
        if (joinOptions == null) {
            joinOptions = new JoinOptions();
        }
        zzqs().zza(str, str2, joinOptions);
    }

    public void zza(String str, String str2, zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status) throws IllegalArgumentException, IllegalStateException, RemoteException {
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("The message payload cannot be null or empty");
        } else if (str2.length() > 65536) {
            throw new IllegalArgumentException("Message exceeds maximum size");
        } else {
            zzf.zzcE(str);
            zzqy();
            long incrementAndGet = this.zzaik.incrementAndGet();
            try {
                this.zzaio.put(Long.valueOf(incrementAndGet), com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status);
                zzqs().zzb(str, str2, incrementAndGet);
            } catch (Throwable th) {
                this.zzaio.remove(Long.valueOf(incrementAndGet));
            }
        }
    }

    public void zza(String str, boolean z, zzb<ApplicationConnectionResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_cast_Cast_ApplicationConnectionResult) throws IllegalStateException, RemoteException {
        LaunchOptions launchOptions = new LaunchOptions();
        launchOptions.setRelaunchIfRunning(z);
        zza(str, launchOptions, (zzb) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_cast_Cast_ApplicationConnectionResult);
    }

    protected zzi zzaI(IBinder iBinder) {
        return zzi.zza.zzaJ(iBinder);
    }

    protected /* synthetic */ IInterface zzab(IBinder iBinder) {
        return zzaI(iBinder);
    }

    public void zzaf(boolean z) throws IllegalStateException, RemoteException {
        zzqs().zza(z, this.zzafU, this.zzafV);
    }

    public void zzb(zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status) throws IllegalStateException, RemoteException {
        zzc((zzb) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status);
        zzqs().zzqE();
    }

    public void zzcD(String str) throws IllegalArgumentException, RemoteException {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Channel namespace cannot be null or empty");
        }
        synchronized (this.zzaib) {
            MessageReceivedCallback messageReceivedCallback = (MessageReceivedCallback) this.zzaib.remove(str);
        }
        if (messageReceivedCallback != null) {
            try {
                zzqs().zzcJ(str);
            } catch (Throwable e) {
                zzaeJ.zzb(e, "Error unregistering namespace (%s): %s", str, e.getMessage());
            }
        }
    }

    public void zzf(double d) throws IllegalArgumentException, IllegalStateException, RemoteException {
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            throw new IllegalArgumentException("Volume cannot be " + d);
        }
        zzqs().zza(d, this.zzafU, this.zzafV);
    }

    protected String zzhT() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    protected String zzhU() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    protected Bundle zzoO() {
        Bundle bundle = new Bundle();
        zzaeJ.zzb("getRemoteService(): mLastApplicationId=%s, mLastSessionId=%s", this.zzail, this.zzaim);
        this.zzaia.putInBundle(bundle);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.zzaic);
        this.zzaid = new b(this);
        bundle.putParcelable("listener", new BinderWrapper(this.zzaid.asBinder()));
        if (this.zzail != null) {
            bundle.putString("last_application_id", this.zzail);
            if (this.zzaim != null) {
                bundle.putString("last_session_id", this.zzaim);
            }
        }
        return bundle;
    }

    public Bundle zzqr() {
        if (this.zzain == null) {
            return super.zzqr();
        }
        Bundle bundle = this.zzain;
        this.zzain = null;
        return bundle;
    }

    zzi zzqs() throws DeadObjectException {
        return null == null ? (zzi) super.zztm() : this.zzaip;
    }

    public void zzqt() throws IllegalStateException, RemoteException {
        zzqs().zzqt();
    }

    public double zzqu() throws IllegalStateException {
        zzqy();
        return this.zzafU;
    }

    public int zzqv() throws IllegalStateException {
        zzqy();
        return this.zzaii;
    }

    public int zzqw() throws IllegalStateException {
        zzqy();
        return this.zzaij;
    }

    void zzqy() throws IllegalStateException {
        if (!this.zzaih || this.zzaid == null || this.zzaid.b()) {
            throw new IllegalStateException("Not connected to a device");
        }
    }
}
