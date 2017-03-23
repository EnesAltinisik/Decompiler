package com.google.android.gms.fitness.service;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.zzs;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.internal.service.FitnessDataSourcesRequest;
import com.google.android.gms.fitness.internal.service.FitnessUnregistrationRequest;
import com.google.android.gms.fitness.internal.service.zzc.zza;
import com.google.android.gms.fitness.result.DataSourcesResult;
import com.google.android.gms.internal.zzrb;
import com.google.android.gms.internal.zzrp;
import java.util.List;

public abstract class FitnessSensorService extends Service {
    public static final String SERVICE_INTERFACE = "com.google.android.gms.fitness.service.FitnessSensorService";
    private a zzaIC;

    private static class a extends zza {
        private final FitnessSensorService a;

        private a(FitnessSensorService fitnessSensorService) {
            this.a = fitnessSensorService;
        }

        public void zza(FitnessDataSourcesRequest fitnessDataSourcesRequest, zzrb com_google_android_gms_internal_zzrb) throws RemoteException {
            this.a.zzyB();
            com_google_android_gms_internal_zzrb.zza(new DataSourcesResult(this.a.onFindDataSources(fitnessDataSourcesRequest.getDataTypes()), Status.zzalw));
        }

        public void zza(FitnessUnregistrationRequest fitnessUnregistrationRequest, zzrp com_google_android_gms_internal_zzrp) throws RemoteException {
            this.a.zzyB();
            if (this.a.onUnregister(fitnessUnregistrationRequest.getDataSource())) {
                com_google_android_gms_internal_zzrp.zzo(Status.zzalw);
            } else {
                com_google_android_gms_internal_zzrp.zzo(new Status(13));
            }
        }

        public void zza(FitnessSensorServiceRequest fitnessSensorServiceRequest, zzrp com_google_android_gms_internal_zzrp) throws RemoteException {
            this.a.zzyB();
            if (this.a.onRegister(fitnessSensorServiceRequest)) {
                com_google_android_gms_internal_zzrp.zzo(Status.zzalw);
            } else {
                com_google_android_gms_internal_zzrp.zzo(new Status(13));
            }
        }
    }

    public IBinder onBind(Intent intent) {
        if (!SERVICE_INTERFACE.equals(intent.getAction())) {
            return null;
        }
        if (Log.isLoggable("FitnessSensorService", 3)) {
            String valueOf = String.valueOf(intent);
            String valueOf2 = String.valueOf(getClass().getName());
            Log.d("FitnessSensorService", new StringBuilder((String.valueOf(valueOf).length() + 20) + String.valueOf(valueOf2).length()).append("Intent ").append(valueOf).append(" received by ").append(valueOf2).toString());
        }
        return this.zzaIC.asBinder();
    }

    public void onCreate() {
        super.onCreate();
        this.zzaIC = new a();
    }

    public abstract List<DataSource> onFindDataSources(List<DataType> list);

    public abstract boolean onRegister(FitnessSensorServiceRequest fitnessSensorServiceRequest);

    public abstract boolean onUnregister(DataSource dataSource);

    @TargetApi(19)
    protected void zzyB() throws SecurityException {
        int callingUid = Binder.getCallingUid();
        String str = "com.google.android.gms";
        if (zzs.zzve()) {
            ((AppOpsManager) getSystemService("appops")).checkPackage(callingUid, "com.google.android.gms");
            return;
        }
        String[] packagesForUid = getPackageManager().getPackagesForUid(callingUid);
        if (packagesForUid != null) {
            int length = packagesForUid.length;
            int i = 0;
            while (i < length) {
                if (!packagesForUid[i].equals("com.google.android.gms")) {
                    i++;
                } else {
                    return;
                }
            }
        }
        throw new SecurityException("Unauthorized caller");
    }
}
