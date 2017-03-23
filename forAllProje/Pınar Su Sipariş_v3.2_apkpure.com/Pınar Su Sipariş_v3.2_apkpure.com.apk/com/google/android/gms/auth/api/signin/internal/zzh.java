package com.google.android.gms.auth.api.signin.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

public interface zzh extends IInterface {

    public static abstract class zza extends Binder implements zzh {

        private static class a implements zzh {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public IBinder asBinder() {
                return this.a;
            }

            public void zza(zzg com_google_android_gms_auth_api_signin_internal_zzg, GoogleSignInOptions googleSignInOptions) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.auth.api.signin.internal.ISignInService");
                    obtain.writeStrongBinder(com_google_android_gms_auth_api_signin_internal_zzg != null ? com_google_android_gms_auth_api_signin_internal_zzg.asBinder() : null);
                    if (googleSignInOptions != null) {
                        obtain.writeInt(1);
                        googleSignInOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(101, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zzb(zzg com_google_android_gms_auth_api_signin_internal_zzg, GoogleSignInOptions googleSignInOptions) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.auth.api.signin.internal.ISignInService");
                    obtain.writeStrongBinder(com_google_android_gms_auth_api_signin_internal_zzg != null ? com_google_android_gms_auth_api_signin_internal_zzg.asBinder() : null);
                    if (googleSignInOptions != null) {
                        obtain.writeInt(1);
                        googleSignInOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(102, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zzc(zzg com_google_android_gms_auth_api_signin_internal_zzg, GoogleSignInOptions googleSignInOptions) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.auth.api.signin.internal.ISignInService");
                    obtain.writeStrongBinder(com_google_android_gms_auth_api_signin_internal_zzg != null ? com_google_android_gms_auth_api_signin_internal_zzg.asBinder() : null);
                    if (googleSignInOptions != null) {
                        obtain.writeInt(1);
                        googleSignInOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(103, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static zzh zzaH(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof zzh)) ? new a(iBinder) : (zzh) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            GoogleSignInOptions googleSignInOptions = null;
            zzg zzaG;
            switch (i) {
                case 101:
                    parcel.enforceInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
                    zzaG = com.google.android.gms.auth.api.signin.internal.zzg.zza.zzaG(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        googleSignInOptions = (GoogleSignInOptions) GoogleSignInOptions.CREATOR.createFromParcel(parcel);
                    }
                    zza(zzaG, googleSignInOptions);
                    parcel2.writeNoException();
                    return true;
                case 102:
                    parcel.enforceInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
                    zzaG = com.google.android.gms.auth.api.signin.internal.zzg.zza.zzaG(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        googleSignInOptions = (GoogleSignInOptions) GoogleSignInOptions.CREATOR.createFromParcel(parcel);
                    }
                    zzb(zzaG, googleSignInOptions);
                    parcel2.writeNoException();
                    return true;
                case 103:
                    parcel.enforceInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
                    zzaG = com.google.android.gms.auth.api.signin.internal.zzg.zza.zzaG(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        googleSignInOptions = (GoogleSignInOptions) GoogleSignInOptions.CREATOR.createFromParcel(parcel);
                    }
                    zzc(zzaG, googleSignInOptions);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.auth.api.signin.internal.ISignInService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void zza(zzg com_google_android_gms_auth_api_signin_internal_zzg, GoogleSignInOptions googleSignInOptions) throws RemoteException;

    void zzb(zzg com_google_android_gms_auth_api_signin_internal_zzg, GoogleSignInOptions googleSignInOptions) throws RemoteException;

    void zzc(zzg com_google_android_gms_auth_api_signin_internal_zzg, GoogleSignInOptions googleSignInOptions) throws RemoteException;
}
