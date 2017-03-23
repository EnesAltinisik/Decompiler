package com.google.android.gms.drive.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.common.internal.zzk;
import com.google.android.gms.common.zze;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.ChangeListener;
import com.google.android.gms.drive.events.DriveEventService;
import com.google.android.gms.drive.events.zzc;
import com.google.android.gms.drive.events.zzi;
import com.google.android.gms.drive.internal.zzt.zza;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class zzu extends zzk<zzam> {
    private final String zzaaN;
    private final Bundle zzaxk;
    private final boolean zzaxl;
    private volatile DriveId zzaxm;
    private volatile DriveId zzaxn;
    private volatile boolean zzaxo = false;
    final ConnectionCallbacks zzaxp;
    final Map<DriveId, Map<ChangeListener, zzae>> zzaxq = new HashMap();
    final Map<zzc, zzae> zzaxr = new HashMap();
    final Map<DriveId, Map<zzi, zzae>> zzaxs = new HashMap();
    final Map<DriveId, Map<zzi, zzae>> zzaxt = new HashMap();

    public zzu(Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener, Bundle bundle) {
        super(context, looper, 11, com_google_android_gms_common_internal_zzg, connectionCallbacks, onConnectionFailedListener);
        this.zzaaN = com_google_android_gms_common_internal_zzg.zzty();
        this.zzaxp = connectionCallbacks;
        this.zzaxk = bundle;
        Intent intent = new Intent(DriveEventService.ACTION_HANDLE_EVENT);
        intent.setPackage(context.getPackageName());
        List queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        String valueOf;
        switch (queryIntentServices.size()) {
            case 0:
                this.zzaxl = false;
                return;
            case 1:
                ServiceInfo serviceInfo = ((ResolveInfo) queryIntentServices.get(0)).serviceInfo;
                if (serviceInfo.exported) {
                    this.zzaxl = true;
                    return;
                } else {
                    valueOf = String.valueOf(serviceInfo.name);
                    throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 60).append("Drive event service ").append(valueOf).append(" must be exported in AndroidManifest.xml").toString());
                }
            default:
                valueOf = String.valueOf(intent.getAction());
                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 72).append("AndroidManifest.xml can only define one service that handles the ").append(valueOf).append(" action").toString());
        }
    }

    private PendingResult<Status> zza(GoogleApiClient googleApiClient, final int i, final DriveId driveId) {
        zzaa.zzaj(com.google.android.gms.drive.events.zzg.zza(i, driveId));
        zzaa.zza(isConnected(), (Object) "Client must be connected");
        return googleApiClient.zzd(new zza(this, googleApiClient) {
            final /* synthetic */ zzu c;

            protected void a(zzu com_google_android_gms_drive_internal_zzu) throws RemoteException {
                com_google_android_gms_drive_internal_zzu.zzwn().zza(new RemoveEventListenerRequest(driveId, i), null, null, new zzbr(this));
            }

            protected /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzu) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    private PendingResult<Status> zza(GoogleApiClient googleApiClient, final AddEventListenerRequest addEventListenerRequest) {
        zzaa.zzaj(com.google.android.gms.drive.events.zzg.zza(addEventListenerRequest.getEventType(), addEventListenerRequest.getDriveId()));
        zzaa.zza(isConnected(), (Object) "Client must be connected");
        if (this.zzaxl) {
            return googleApiClient.zzd(new zza(this, googleApiClient) {
                final /* synthetic */ zzu b;

                protected void a(zzu com_google_android_gms_drive_internal_zzu) throws RemoteException {
                    com_google_android_gms_drive_internal_zzu.zzwn().zza(addEventListenerRequest, null, null, new zzbr(this));
                }

                protected /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                    a((zzu) com_google_android_gms_common_api_Api_zzb);
                }
            });
        }
        throw new IllegalStateException("Application must define an exported DriveEventService subclass in AndroidManifest.xml to add event subscriptions");
    }

    private PendingResult<Status> zza(GoogleApiClient googleApiClient, final AddEventListenerRequest addEventListenerRequest, final zzae com_google_android_gms_drive_internal_zzae) {
        return googleApiClient.zzd(new zza(this, googleApiClient) {
            final /* synthetic */ zzu c;

            protected void a(zzu com_google_android_gms_drive_internal_zzu) throws RemoteException {
                com_google_android_gms_drive_internal_zzu.zzwn().zza(addEventListenerRequest, com_google_android_gms_drive_internal_zzae, null, new zzbr(this));
            }

            protected /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzu) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    private PendingResult<Status> zza(GoogleApiClient googleApiClient, final RemoveEventListenerRequest removeEventListenerRequest, final zzae com_google_android_gms_drive_internal_zzae) {
        return googleApiClient.zzd(new zza(this, googleApiClient) {
            final /* synthetic */ zzu c;

            protected void a(zzu com_google_android_gms_drive_internal_zzu) throws RemoteException {
                com_google_android_gms_drive_internal_zzu.zzwn().zza(removeEventListenerRequest, com_google_android_gms_drive_internal_zzae, null, new zzbr(this));
            }

            protected /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzu) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    PendingResult<Status> cancelPendingActions(GoogleApiClient googleApiClient, final List<String> list) {
        boolean z = true;
        zzaa.zzaj(list != null);
        if (list.isEmpty()) {
            z = false;
        }
        zzaa.zzaj(z);
        zzaa.zza(isConnected(), (Object) "Client must be connected");
        return googleApiClient.zzd(new zza(this, googleApiClient) {
            final /* synthetic */ zzu b;

            protected void a(zzu com_google_android_gms_drive_internal_zzu) throws RemoteException {
                com_google_android_gms_drive_internal_zzu.zzwn().zza(new CancelPendingActionsRequest(list), new zzbr(this));
            }

            protected /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzu) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public void disconnect() {
        if (isConnected()) {
            try {
                ((zzam) zztm()).zza(new DisconnectRequest());
            } catch (RemoteException e) {
            }
        }
        super.disconnect();
        synchronized (this.zzaxq) {
            this.zzaxq.clear();
        }
        synchronized (this.zzaxr) {
            this.zzaxr.clear();
        }
        synchronized (this.zzaxs) {
            this.zzaxs.clear();
        }
        synchronized (this.zzaxt) {
            this.zzaxt.clear();
        }
    }

    PendingResult<Status> zza(GoogleApiClient googleApiClient, DriveId driveId) {
        return zza(googleApiClient, new AddEventListenerRequest(1, driveId));
    }

    PendingResult<Status> zza(GoogleApiClient googleApiClient, DriveId driveId, ChangeListener changeListener) {
        PendingResult<Status> jVar;
        zzaa.zzaj(com.google.android.gms.drive.events.zzg.zza(1, driveId));
        zzaa.zzb((Object) changeListener, (Object) "listener");
        zzaa.zza(isConnected(), (Object) "Client must be connected");
        synchronized (this.zzaxq) {
            Map map;
            Map map2 = (Map) this.zzaxq.get(driveId);
            if (map2 == null) {
                HashMap hashMap = new HashMap();
                this.zzaxq.put(driveId, hashMap);
                map = hashMap;
            } else {
                map = map2;
            }
            zzae com_google_android_gms_drive_internal_zzae = (zzae) map.get(changeListener);
            if (com_google_android_gms_drive_internal_zzae == null) {
                com_google_android_gms_drive_internal_zzae = new zzae(getLooper(), getContext(), 1, changeListener);
                map.put(changeListener, com_google_android_gms_drive_internal_zzae);
            } else if (com_google_android_gms_drive_internal_zzae.zzdx(1)) {
                jVar = new j(googleApiClient, Status.zzalw);
            }
            com_google_android_gms_drive_internal_zzae.zzdw(1);
            jVar = zza(googleApiClient, new AddEventListenerRequest(1, driveId), com_google_android_gms_drive_internal_zzae);
        }
        return jVar;
    }

    protected void zza(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (bundle != null) {
            bundle.setClassLoader(getClass().getClassLoader());
            this.zzaxm = (DriveId) bundle.getParcelable("com.google.android.gms.drive.root_id");
            this.zzaxn = (DriveId) bundle.getParcelable("com.google.android.gms.drive.appdata_id");
            this.zzaxo = true;
        }
        super.zza(i, iBinder, bundle, i2);
    }

    protected /* synthetic */ IInterface zzab(IBinder iBinder) {
        return zzbg(iBinder);
    }

    PendingResult<Status> zzb(GoogleApiClient googleApiClient, DriveId driveId) {
        return zza(googleApiClient, 1, driveId);
    }

    PendingResult<Status> zzb(GoogleApiClient googleApiClient, DriveId driveId, ChangeListener changeListener) {
        PendingResult<Status> jVar;
        zzaa.zzaj(com.google.android.gms.drive.events.zzg.zza(1, driveId));
        zzaa.zza(isConnected(), (Object) "Client must be connected");
        zzaa.zzb((Object) changeListener, (Object) "listener");
        synchronized (this.zzaxq) {
            Map map = (Map) this.zzaxq.get(driveId);
            if (map == null) {
                jVar = new j(googleApiClient, Status.zzalw);
            } else {
                zzae com_google_android_gms_drive_internal_zzae = (zzae) map.remove(changeListener);
                if (com_google_android_gms_drive_internal_zzae == null) {
                    jVar = new j(googleApiClient, Status.zzalw);
                } else {
                    if (map.isEmpty()) {
                        this.zzaxq.remove(driveId);
                    }
                    jVar = zza(googleApiClient, new RemoveEventListenerRequest(driveId, 1), com_google_android_gms_drive_internal_zzae);
                }
            }
        }
        return jVar;
    }

    protected zzam zzbg(IBinder iBinder) {
        return zzam.zza.zzbh(iBinder);
    }

    protected String zzhT() {
        return "com.google.android.gms.drive.ApiService.START";
    }

    protected String zzhU() {
        return "com.google.android.gms.drive.internal.IDriveService";
    }

    protected Bundle zzoO() {
        String packageName = getContext().getPackageName();
        zzaa.zzz(packageName);
        zzaa.zzai(!zztH().zztw().isEmpty());
        Bundle bundle = new Bundle();
        if (!packageName.equals(this.zzaaN)) {
            bundle.putString("proxy_package_name", this.zzaaN);
        }
        bundle.putAll(this.zzaxk);
        return bundle;
    }

    public boolean zzpd() {
        return (getContext().getPackageName().equals(this.zzaaN) && zzwm()) ? false : true;
    }

    public boolean zztn() {
        return true;
    }

    boolean zzwm() {
        return zze.zze(getContext(), Process.myUid());
    }

    public zzam zzwn() throws DeadObjectException {
        return (zzam) zztm();
    }

    public DriveId zzwo() {
        return this.zzaxm;
    }

    public DriveId zzwp() {
        return this.zzaxn;
    }

    public boolean zzwq() {
        return this.zzaxo;
    }

    public boolean zzwr() {
        return this.zzaxl;
    }
}
