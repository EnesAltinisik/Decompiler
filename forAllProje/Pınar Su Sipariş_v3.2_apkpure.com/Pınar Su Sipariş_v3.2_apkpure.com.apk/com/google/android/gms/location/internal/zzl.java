package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.internal.zznt.zzb;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.LocationStatusCodes;
import com.google.android.gms.location.internal.zzh.zza;
import java.util.List;

public class zzl extends zzb {
    private final zzk zzaWc;

    private static final class a extends zza {
        private zzb<Status> a;

        public a(zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status) {
            this.a = com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status;
        }

        public void zza(int i, PendingIntent pendingIntent) {
            Log.wtf("LocationClientImpl", "Unexpected call to onRemoveGeofencesByPendingIntentResult");
        }

        public void zza(int i, String[] strArr) {
            if (this.a == null) {
                Log.wtf("LocationClientImpl", "onAddGeofenceResult called multiple times");
                return;
            }
            this.a.setResult(LocationStatusCodes.zzic(LocationStatusCodes.zzib(i)));
            this.a = null;
        }

        public void zzb(int i, String[] strArr) {
            Log.wtf("LocationClientImpl", "Unexpected call to onRemoveGeofencesByRequestIdsResult");
        }
    }

    private static final class b extends zza {
        private zzb<Status> a;

        public b(zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status) {
            this.a = com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status;
        }

        private void a(int i) {
            if (this.a == null) {
                Log.wtf("LocationClientImpl", "onRemoveGeofencesResult called multiple times");
                return;
            }
            this.a.setResult(LocationStatusCodes.zzic(LocationStatusCodes.zzib(i)));
            this.a = null;
        }

        public void zza(int i, PendingIntent pendingIntent) {
            a(i);
        }

        public void zza(int i, String[] strArr) {
            Log.wtf("LocationClientImpl", "Unexpected call to onAddGeofencesResult");
        }

        public void zzb(int i, String[] strArr) {
            a(i);
        }
    }

    private static final class c extends zzj.zza {
        private zzb<LocationSettingsResult> a;

        public c(zzb<LocationSettingsResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_location_LocationSettingsResult) {
            zzaa.zzb(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_location_LocationSettingsResult != null, (Object) "listener can't be null.");
            this.a = com_google_android_gms_internal_zznt_zzb_com_google_android_gms_location_LocationSettingsResult;
        }

        public void zza(LocationSettingsResult locationSettingsResult) throws RemoteException {
            this.a.setResult(locationSettingsResult);
            this.a = null;
        }
    }

    public zzl(Context context, Looper looper, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener, String str) {
        this(context, looper, connectionCallbacks, onConnectionFailedListener, str, zzg.zzau(context));
    }

    public zzl(Context context, Looper looper, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener, String str, zzg com_google_android_gms_common_internal_zzg) {
        super(context, looper, connectionCallbacks, onConnectionFailedListener, str, com_google_android_gms_common_internal_zzg);
        this.zzaWc = new zzk(context, this.zzaVJ);
    }

    public void disconnect() {
        synchronized (this.zzaWc) {
            if (isConnected()) {
                try {
                    this.zzaWc.removeAllListeners();
                    this.zzaWc.zzCx();
                } catch (Throwable e) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e);
                }
            }
            super.disconnect();
        }
    }

    public Location getLastLocation() {
        return this.zzaWc.getLastLocation();
    }

    public LocationAvailability zzCw() {
        return this.zzaWc.zzCw();
    }

    public void zza(long j, PendingIntent pendingIntent) throws RemoteException {
        zztl();
        zzaa.zzz(pendingIntent);
        zzaa.zzb(j >= 0, (Object) "detectionIntervalMillis must be >= 0");
        ((zzi) zztm()).zza(j, true, pendingIntent);
    }

    public void zza(PendingIntent pendingIntent) throws RemoteException {
        zztl();
        zzaa.zzz(pendingIntent);
        ((zzi) zztm()).zza(pendingIntent);
    }

    public void zza(PendingIntent pendingIntent, zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status) throws RemoteException {
        zztl();
        zzaa.zzb((Object) pendingIntent, (Object) "PendingIntent must be specified.");
        zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, (Object) "ResultHolder not provided.");
        ((zzi) zztm()).zza(pendingIntent, new b(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status), getContext().getPackageName());
    }

    public void zza(PendingIntent pendingIntent, zzg com_google_android_gms_location_internal_zzg) throws RemoteException {
        this.zzaWc.zza(pendingIntent, com_google_android_gms_location_internal_zzg);
    }

    public void zza(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status) throws RemoteException {
        zztl();
        zzaa.zzb((Object) geofencingRequest, (Object) "geofencingRequest can't be null.");
        zzaa.zzb((Object) pendingIntent, (Object) "PendingIntent must be specified.");
        zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, (Object) "ResultHolder not provided.");
        ((zzi) zztm()).zza(geofencingRequest, pendingIntent, new a(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status));
    }

    public void zza(LocationCallback locationCallback, zzg com_google_android_gms_location_internal_zzg) throws RemoteException {
        this.zzaWc.zza(locationCallback, com_google_android_gms_location_internal_zzg);
    }

    public void zza(LocationListener locationListener, zzg com_google_android_gms_location_internal_zzg) throws RemoteException {
        this.zzaWc.zza(locationListener, com_google_android_gms_location_internal_zzg);
    }

    public void zza(LocationRequest locationRequest, PendingIntent pendingIntent, zzg com_google_android_gms_location_internal_zzg) throws RemoteException {
        this.zzaWc.zza(locationRequest, pendingIntent, com_google_android_gms_location_internal_zzg);
    }

    public void zza(LocationRequest locationRequest, LocationListener locationListener, Looper looper, zzg com_google_android_gms_location_internal_zzg) throws RemoteException {
        synchronized (this.zzaWc) {
            this.zzaWc.zza(locationRequest, locationListener, looper, com_google_android_gms_location_internal_zzg);
        }
    }

    public void zza(LocationSettingsRequest locationSettingsRequest, zzb<LocationSettingsResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_location_LocationSettingsResult, String str) throws RemoteException {
        boolean z = true;
        zztl();
        zzaa.zzb(locationSettingsRequest != null, (Object) "locationSettingsRequest can't be null nor empty.");
        if (com_google_android_gms_internal_zznt_zzb_com_google_android_gms_location_LocationSettingsResult == null) {
            z = false;
        }
        zzaa.zzb(z, (Object) "listener can't be null.");
        ((zzi) zztm()).zza(locationSettingsRequest, new c(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_location_LocationSettingsResult), str);
    }

    public void zza(LocationRequestInternal locationRequestInternal, LocationCallback locationCallback, Looper looper, zzg com_google_android_gms_location_internal_zzg) throws RemoteException {
        synchronized (this.zzaWc) {
            this.zzaWc.zza(locationRequestInternal, locationCallback, looper, com_google_android_gms_location_internal_zzg);
        }
    }

    public void zza(zzg com_google_android_gms_location_internal_zzg) throws RemoteException {
        this.zzaWc.zza(com_google_android_gms_location_internal_zzg);
    }

    public void zza(List<String> list, zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status) throws RemoteException {
        zztl();
        boolean z = list != null && list.size() > 0;
        zzaa.zzb(z, (Object) "geofenceRequestIds can't be null nor empty.");
        zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, (Object) "ResultHolder not provided.");
        ((zzi) zztm()).zza((String[]) list.toArray(new String[0]), new b(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status), getContext().getPackageName());
    }

    public void zzat(boolean z) throws RemoteException {
        this.zzaWc.zzat(z);
    }

    public void zzc(Location location) throws RemoteException {
        this.zzaWc.zzc(location);
    }
}
