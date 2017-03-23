package com.google.android.gms.auth.api.credentials.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.CredentialRequest;

public interface zzk extends IInterface {

    public static abstract class zza extends Binder implements zzk {

        private static class a implements zzk {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public IBinder asBinder() {
                return this.a;
            }

            public void zza(zzj com_google_android_gms_auth_api_credentials_internal_zzj) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                    obtain.writeStrongBinder(com_google_android_gms_auth_api_credentials_internal_zzj != null ? com_google_android_gms_auth_api_credentials_internal_zzj.asBinder() : null);
                    this.a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(zzj com_google_android_gms_auth_api_credentials_internal_zzj, CredentialRequest credentialRequest) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                    obtain.writeStrongBinder(com_google_android_gms_auth_api_credentials_internal_zzj != null ? com_google_android_gms_auth_api_credentials_internal_zzj.asBinder() : null);
                    if (credentialRequest != null) {
                        obtain.writeInt(1);
                        credentialRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(zzj com_google_android_gms_auth_api_credentials_internal_zzj, DeleteRequest deleteRequest) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                    obtain.writeStrongBinder(com_google_android_gms_auth_api_credentials_internal_zzj != null ? com_google_android_gms_auth_api_credentials_internal_zzj.asBinder() : null);
                    if (deleteRequest != null) {
                        obtain.writeInt(1);
                        deleteRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(zzj com_google_android_gms_auth_api_credentials_internal_zzj, GeneratePasswordRequest generatePasswordRequest) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                    obtain.writeStrongBinder(com_google_android_gms_auth_api_credentials_internal_zzj != null ? com_google_android_gms_auth_api_credentials_internal_zzj.asBinder() : null);
                    if (generatePasswordRequest != null) {
                        obtain.writeInt(1);
                        generatePasswordRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(zzj com_google_android_gms_auth_api_credentials_internal_zzj, SaveRequest saveRequest) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                    obtain.writeStrongBinder(com_google_android_gms_auth_api_credentials_internal_zzj != null ? com_google_android_gms_auth_api_credentials_internal_zzj.asBinder() : null);
                    if (saveRequest != null) {
                        obtain.writeInt(1);
                        saveRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static zzk zzaB(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof zzk)) ? new a(iBinder) : (zzk) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            GeneratePasswordRequest generatePasswordRequest = null;
            zzj zzaA;
            switch (i) {
                case 1:
                    CredentialRequest credentialRequest;
                    parcel.enforceInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                    zzaA = com.google.android.gms.auth.api.credentials.internal.zzj.zza.zzaA(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        credentialRequest = (CredentialRequest) CredentialRequest.CREATOR.createFromParcel(parcel);
                    }
                    zza(zzaA, credentialRequest);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    SaveRequest saveRequest;
                    parcel.enforceInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                    zzaA = com.google.android.gms.auth.api.credentials.internal.zzj.zza.zzaA(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        saveRequest = (SaveRequest) SaveRequest.CREATOR.createFromParcel(parcel);
                    }
                    zza(zzaA, saveRequest);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    DeleteRequest deleteRequest;
                    parcel.enforceInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                    zzaA = com.google.android.gms.auth.api.credentials.internal.zzj.zza.zzaA(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        deleteRequest = (DeleteRequest) DeleteRequest.CREATOR.createFromParcel(parcel);
                    }
                    zza(zzaA, deleteRequest);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                    zza(com.google.android.gms.auth.api.credentials.internal.zzj.zza.zzaA(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                    zzaA = com.google.android.gms.auth.api.credentials.internal.zzj.zza.zzaA(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        generatePasswordRequest = (GeneratePasswordRequest) GeneratePasswordRequest.CREATOR.createFromParcel(parcel);
                    }
                    zza(zzaA, generatePasswordRequest);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void zza(zzj com_google_android_gms_auth_api_credentials_internal_zzj) throws RemoteException;

    void zza(zzj com_google_android_gms_auth_api_credentials_internal_zzj, CredentialRequest credentialRequest) throws RemoteException;

    void zza(zzj com_google_android_gms_auth_api_credentials_internal_zzj, DeleteRequest deleteRequest) throws RemoteException;

    void zza(zzj com_google_android_gms_auth_api_credentials_internal_zzj, GeneratePasswordRequest generatePasswordRequest) throws RemoteException;

    void zza(zzj com_google_android_gms_auth_api_credentials_internal_zzj, SaveRequest saveRequest) throws RemoteException;
}
