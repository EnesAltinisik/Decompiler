package com.google.android.gms.fitness.internal.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fitness.service.FitnessSensorServiceRequest;
import com.google.android.gms.internal.zzrb;
import com.google.android.gms.internal.zzrp;

public interface zzc extends IInterface {

    public static abstract class zza extends Binder implements zzc {
        public zza() {
            attachInterface(this, "com.google.android.gms.fitness.internal.service.IFitnessSensorService");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            FitnessUnregistrationRequest fitnessUnregistrationRequest = null;
            switch (i) {
                case 1:
                    FitnessDataSourcesRequest fitnessDataSourcesRequest;
                    parcel.enforceInterface("com.google.android.gms.fitness.internal.service.IFitnessSensorService");
                    if (parcel.readInt() != 0) {
                        fitnessDataSourcesRequest = (FitnessDataSourcesRequest) FitnessDataSourcesRequest.CREATOR.createFromParcel(parcel);
                    }
                    zza(fitnessDataSourcesRequest, com.google.android.gms.internal.zzrb.zza.zzbL(parcel.readStrongBinder()));
                    return true;
                case 2:
                    FitnessSensorServiceRequest fitnessSensorServiceRequest;
                    parcel.enforceInterface("com.google.android.gms.fitness.internal.service.IFitnessSensorService");
                    if (parcel.readInt() != 0) {
                        fitnessSensorServiceRequest = (FitnessSensorServiceRequest) FitnessSensorServiceRequest.CREATOR.createFromParcel(parcel);
                    }
                    zza(fitnessSensorServiceRequest, com.google.android.gms.internal.zzrp.zza.zzbZ(parcel.readStrongBinder()));
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.fitness.internal.service.IFitnessSensorService");
                    if (parcel.readInt() != 0) {
                        fitnessUnregistrationRequest = (FitnessUnregistrationRequest) FitnessUnregistrationRequest.CREATOR.createFromParcel(parcel);
                    }
                    zza(fitnessUnregistrationRequest, com.google.android.gms.internal.zzrp.zza.zzbZ(parcel.readStrongBinder()));
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.fitness.internal.service.IFitnessSensorService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void zza(FitnessDataSourcesRequest fitnessDataSourcesRequest, zzrb com_google_android_gms_internal_zzrb) throws RemoteException;

    void zza(FitnessUnregistrationRequest fitnessUnregistrationRequest, zzrp com_google_android_gms_internal_zzrp) throws RemoteException;

    void zza(FitnessSensorServiceRequest fitnessSensorServiceRequest, zzrp com_google_android_gms_internal_zzrp) throws RemoteException;
}
