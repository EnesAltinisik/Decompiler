package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.CastRemoteDisplay.CastRemoteDisplaySessionCallbacks;
import com.google.android.gms.cast.internal.zzl;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.common.internal.zzk;
import com.google.android.gms.internal.zznk.zza;

public class zznh extends zzk<zznj> implements DeathRecipient {
    private static final zzl zzaeJ = new zzl("CastRemoteDisplayClientImpl");
    private CastDevice zzaes;
    private CastRemoteDisplaySessionCallbacks zzajq;

    public zznh(Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, CastDevice castDevice, CastRemoteDisplaySessionCallbacks castRemoteDisplaySessionCallbacks, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 83, com_google_android_gms_common_internal_zzg, connectionCallbacks, onConnectionFailedListener);
        zzaeJ.zzb("instance created", new Object[0]);
        this.zzajq = castRemoteDisplaySessionCallbacks;
        this.zzaes = castDevice;
    }

    public void binderDied() {
    }

    public void disconnect() {
        zzaeJ.zzb("disconnect", new Object[0]);
        this.zzajq = null;
        this.zzaes = null;
        try {
            ((zznj) zztm()).disconnect();
            super.disconnect();
        } catch (RemoteException e) {
            super.disconnect();
        } catch (IllegalStateException e2) {
            super.disconnect();
        } catch (Throwable th) {
            super.disconnect();
        }
    }

    public void zza(zzni com_google_android_gms_internal_zzni) throws RemoteException {
        zzaeJ.zzb("stopRemoteDisplay", new Object[0]);
        ((zznj) zztm()).zza(com_google_android_gms_internal_zzni);
    }

    public void zza(zzni com_google_android_gms_internal_zzni, int i) throws RemoteException {
        ((zznj) zztm()).zza(com_google_android_gms_internal_zzni, i);
    }

    public void zza(zzni com_google_android_gms_internal_zzni, final zznk com_google_android_gms_internal_zznk, String str) throws RemoteException {
        zzaeJ.zzb("startRemoteDisplay", new Object[0]);
        ((zznj) zztm()).zza(com_google_android_gms_internal_zzni, new zza(this) {
            final /* synthetic */ zznh b;

            public void zzbw(int i) throws RemoteException {
                zznh.zzaeJ.zzb("onRemoteDisplayEnded", new Object[0]);
                if (com_google_android_gms_internal_zznk != null) {
                    com_google_android_gms_internal_zznk.zzbw(i);
                }
                if (this.b.zzajq != null) {
                    this.b.zzajq.onRemoteDisplayEnded(new Status(i));
                }
            }
        }, this.zzaes.getDeviceId(), str);
    }

    public zznj zzaK(IBinder iBinder) {
        return zznj.zza.zzaM(iBinder);
    }

    public /* synthetic */ IInterface zzab(IBinder iBinder) {
        return zzaK(iBinder);
    }

    protected String zzhT() {
        return "com.google.android.gms.cast.remote_display.service.START";
    }

    protected String zzhU() {
        return "com.google.android.gms.cast.remote_display.ICastRemoteDisplayService";
    }
}
