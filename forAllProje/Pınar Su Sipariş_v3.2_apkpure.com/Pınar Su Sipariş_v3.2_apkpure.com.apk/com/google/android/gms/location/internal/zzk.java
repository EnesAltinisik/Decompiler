package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.content.Context;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.zzd;
import com.google.android.gms.location.zzd.zza;
import com.google.android.gms.location.zze;
import java.util.HashMap;
import java.util.Map;

public class zzk {
    private final Context mContext;
    private Map<LocationListener, c> zzaDR = new HashMap();
    private final zzp<zzi> zzaVJ;
    private ContentProviderClient zzaVW = null;
    private boolean zzaVX = false;
    private Map<LocationCallback, a> zzaVY = new HashMap();

    private static class a extends zza {
        private Handler a;

        a(final LocationCallback locationCallback, Looper looper) {
            if (looper == null) {
                looper = Looper.myLooper();
                zzaa.zza(looper != null, (Object) "Can't create handler inside thread that has not called Looper.prepare()");
            }
            this.a = new Handler(this, looper) {
                final /* synthetic */ a b;

                public void handleMessage(Message message) {
                    switch (message.what) {
                        case 0:
                            locationCallback.onLocationResult((LocationResult) message.obj);
                            return;
                        case 1:
                            locationCallback.onLocationAvailability((LocationAvailability) message.obj);
                            return;
                        default:
                            return;
                    }
                }
            };
        }

        private void a(int i, Object obj) {
            if (this.a == null) {
                Log.e("LocationClientHelper", "Received a data in client after calling removeLocationUpdates.");
                return;
            }
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.obj = obj;
            this.a.sendMessage(obtain);
        }

        public void a() {
            this.a = null;
        }

        public void onLocationAvailability(LocationAvailability locationAvailability) {
            a(1, locationAvailability);
        }

        public void onLocationResult(LocationResult locationResult) {
            a(0, locationResult);
        }
    }

    private static class b extends Handler {
        private final LocationListener a;

        public b(LocationListener locationListener) {
            this.a = locationListener;
        }

        public b(LocationListener locationListener, Looper looper) {
            super(looper);
            this.a = locationListener;
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    this.a.onLocationChanged(new Location((Location) message.obj));
                    return;
                default:
                    Log.e("LocationClientHelper", "unknown message in LocationHandler.handleMessage");
                    return;
            }
        }
    }

    private static class c extends zze.zza {
        private Handler a;

        c(LocationListener locationListener, Looper looper) {
            if (looper == null) {
                zzaa.zza(Looper.myLooper() != null, (Object) "Can't create handler inside thread that has not called Looper.prepare()");
            }
            this.a = looper == null ? new b(locationListener) : new b(locationListener, looper);
        }

        public void a() {
            this.a = null;
        }

        public void onLocationChanged(Location location) {
            if (this.a == null) {
                Log.e("LocationClientHelper", "Received a location in client after calling removeLocationUpdates.");
                return;
            }
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = location;
            this.a.sendMessage(obtain);
        }
    }

    public zzk(Context context, zzp<zzi> com_google_android_gms_location_internal_zzp_com_google_android_gms_location_internal_zzi) {
        this.mContext = context;
        this.zzaVJ = com_google_android_gms_location_internal_zzp_com_google_android_gms_location_internal_zzi;
    }

    private a zza(LocationCallback locationCallback, Looper looper) {
        a aVar;
        synchronized (this.zzaVY) {
            aVar = (a) this.zzaVY.get(locationCallback);
            if (aVar == null) {
                aVar = new a(locationCallback, looper);
            }
            this.zzaVY.put(locationCallback, aVar);
        }
        return aVar;
    }

    private c zza(LocationListener locationListener, Looper looper) {
        c cVar;
        synchronized (this.zzaDR) {
            cVar = (c) this.zzaDR.get(locationListener);
            if (cVar == null) {
                cVar = new c(locationListener, looper);
            }
            this.zzaDR.put(locationListener, cVar);
        }
        return cVar;
    }

    public Location getLastLocation() {
        this.zzaVJ.zztl();
        try {
            return ((zzi) this.zzaVJ.zztm()).zzeJ(this.mContext.getPackageName());
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    public void removeAllListeners() {
        try {
            synchronized (this.zzaDR) {
                for (zze com_google_android_gms_location_zze : this.zzaDR.values()) {
                    if (com_google_android_gms_location_zze != null) {
                        ((zzi) this.zzaVJ.zztm()).zza(LocationRequestUpdateData.zza(com_google_android_gms_location_zze, null));
                    }
                }
                this.zzaDR.clear();
            }
            synchronized (this.zzaVY) {
                for (zzd com_google_android_gms_location_zzd : this.zzaVY.values()) {
                    if (com_google_android_gms_location_zzd != null) {
                        ((zzi) this.zzaVJ.zztm()).zza(LocationRequestUpdateData.zza(com_google_android_gms_location_zzd, null));
                    }
                }
                this.zzaVY.clear();
            }
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    public LocationAvailability zzCw() {
        this.zzaVJ.zztl();
        try {
            return ((zzi) this.zzaVJ.zztm()).zzeK(this.mContext.getPackageName());
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    public void zzCx() {
        if (this.zzaVX) {
            try {
                zzat(false);
            } catch (Throwable e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public void zza(PendingIntent pendingIntent, zzg com_google_android_gms_location_internal_zzg) throws RemoteException {
        this.zzaVJ.zztl();
        ((zzi) this.zzaVJ.zztm()).zza(LocationRequestUpdateData.zzb(pendingIntent, com_google_android_gms_location_internal_zzg));
    }

    public void zza(LocationCallback locationCallback, zzg com_google_android_gms_location_internal_zzg) throws RemoteException {
        this.zzaVJ.zztl();
        zzaa.zzb((Object) locationCallback, (Object) "Invalid null callback");
        synchronized (this.zzaVY) {
            zzd com_google_android_gms_location_zzd = (a) this.zzaVY.remove(locationCallback);
            if (com_google_android_gms_location_zzd != null) {
                com_google_android_gms_location_zzd.a();
                ((zzi) this.zzaVJ.zztm()).zza(LocationRequestUpdateData.zza(com_google_android_gms_location_zzd, com_google_android_gms_location_internal_zzg));
            }
        }
    }

    public void zza(LocationListener locationListener, zzg com_google_android_gms_location_internal_zzg) throws RemoteException {
        this.zzaVJ.zztl();
        zzaa.zzb((Object) locationListener, (Object) "Invalid null listener");
        synchronized (this.zzaDR) {
            zze com_google_android_gms_location_zze = (c) this.zzaDR.remove(locationListener);
            if (com_google_android_gms_location_zze != null) {
                com_google_android_gms_location_zze.a();
                ((zzi) this.zzaVJ.zztm()).zza(LocationRequestUpdateData.zza(com_google_android_gms_location_zze, com_google_android_gms_location_internal_zzg));
            }
        }
    }

    public void zza(LocationRequest locationRequest, PendingIntent pendingIntent, zzg com_google_android_gms_location_internal_zzg) throws RemoteException {
        this.zzaVJ.zztl();
        ((zzi) this.zzaVJ.zztm()).zza(LocationRequestUpdateData.zza(LocationRequestInternal.zzb(locationRequest), pendingIntent, com_google_android_gms_location_internal_zzg));
    }

    public void zza(LocationRequest locationRequest, LocationListener locationListener, Looper looper, zzg com_google_android_gms_location_internal_zzg) throws RemoteException {
        this.zzaVJ.zztl();
        ((zzi) this.zzaVJ.zztm()).zza(LocationRequestUpdateData.zza(LocationRequestInternal.zzb(locationRequest), zza(locationListener, looper), com_google_android_gms_location_internal_zzg));
    }

    public void zza(LocationRequestInternal locationRequestInternal, LocationCallback locationCallback, Looper looper, zzg com_google_android_gms_location_internal_zzg) throws RemoteException {
        this.zzaVJ.zztl();
        ((zzi) this.zzaVJ.zztm()).zza(LocationRequestUpdateData.zza(locationRequestInternal, zza(locationCallback, looper), com_google_android_gms_location_internal_zzg));
    }

    public void zza(zzg com_google_android_gms_location_internal_zzg) throws RemoteException {
        this.zzaVJ.zztl();
        ((zzi) this.zzaVJ.zztm()).zza(com_google_android_gms_location_internal_zzg);
    }

    public void zzat(boolean z) throws RemoteException {
        this.zzaVJ.zztl();
        ((zzi) this.zzaVJ.zztm()).zzat(z);
        this.zzaVX = z;
    }

    public void zzc(Location location) throws RemoteException {
        this.zzaVJ.zztl();
        ((zzi) this.zzaVJ.zztm()).zzc(location);
    }
}
