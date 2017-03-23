package com.google.android.gms.fitness.request;

import android.os.RemoteException;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.fitness.data.BleDevice;
import java.util.HashMap;
import java.util.Map;

public class zza extends com.google.android.gms.fitness.request.zzq.zza {
    private final BleScanCallback zzaHl;

    public static class zza {
        private static final zza zzaHm = new zza();
        private final Map<BleScanCallback, zza> zzaHn = new HashMap();

        private zza() {
        }

        public static zza zzxT() {
            return zzaHm;
        }

        public zza zza(BleScanCallback bleScanCallback) {
            zza com_google_android_gms_fitness_request_zza;
            synchronized (this.zzaHn) {
                com_google_android_gms_fitness_request_zza = (zza) this.zzaHn.get(bleScanCallback);
                if (com_google_android_gms_fitness_request_zza == null) {
                    com_google_android_gms_fitness_request_zza = new zza(bleScanCallback);
                    this.zzaHn.put(bleScanCallback, com_google_android_gms_fitness_request_zza);
                }
            }
            return com_google_android_gms_fitness_request_zza;
        }

        public zza zzb(BleScanCallback bleScanCallback) {
            zza com_google_android_gms_fitness_request_zza;
            synchronized (this.zzaHn) {
                com_google_android_gms_fitness_request_zza = (zza) this.zzaHn.get(bleScanCallback);
                if (com_google_android_gms_fitness_request_zza != null) {
                } else {
                    com_google_android_gms_fitness_request_zza = new zza(bleScanCallback);
                }
            }
            return com_google_android_gms_fitness_request_zza;
        }
    }

    private zza(BleScanCallback bleScanCallback) {
        this.zzaHl = (BleScanCallback) zzaa.zzz(bleScanCallback);
    }

    public void onDeviceFound(BleDevice bleDevice) throws RemoteException {
        this.zzaHl.onDeviceFound(bleDevice);
    }

    public void onScanStopped() throws RemoteException {
        this.zzaHl.onScanStopped();
    }
}
