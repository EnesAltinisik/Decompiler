package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.auth.api.model.VerifyAssertionRequest;

public interface zzacu extends IInterface {

    public static abstract class zza extends Binder implements zzacu {

        private static class a implements zzacu {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public IBinder asBinder() {
                return this.a;
            }

            public void zza(zzact com_google_android_gms_internal_zzact) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    obtain.writeStrongBinder(com_google_android_gms_internal_zzact != null ? com_google_android_gms_internal_zzact.asBinder() : null);
                    this.a.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(VerifyAssertionRequest verifyAssertionRequest, zzact com_google_android_gms_internal_zzact) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    if (verifyAssertionRequest != null) {
                        obtain.writeInt(1);
                        verifyAssertionRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_internal_zzact != null ? com_google_android_gms_internal_zzact.asBinder() : null);
                    this.a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(String str, zzact com_google_android_gms_internal_zzact) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(com_google_android_gms_internal_zzact != null ? com_google_android_gms_internal_zzact.asBinder() : null);
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(String str, UserProfileChangeRequest userProfileChangeRequest, zzact com_google_android_gms_internal_zzact) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    obtain.writeString(str);
                    if (userProfileChangeRequest != null) {
                        obtain.writeInt(1);
                        userProfileChangeRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_internal_zzact != null ? com_google_android_gms_internal_zzact.asBinder() : null);
                    this.a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(String str, VerifyAssertionRequest verifyAssertionRequest, zzact com_google_android_gms_internal_zzact) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    obtain.writeString(str);
                    if (verifyAssertionRequest != null) {
                        obtain.writeInt(1);
                        verifyAssertionRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_internal_zzact != null ? com_google_android_gms_internal_zzact.asBinder() : null);
                    this.a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(String str, String str2, zzact com_google_android_gms_internal_zzact) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStrongBinder(com_google_android_gms_internal_zzact != null ? com_google_android_gms_internal_zzact.asBinder() : null);
                    this.a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(String str, String str2, String str3, zzact com_google_android_gms_internal_zzact) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeStrongBinder(com_google_android_gms_internal_zzact != null ? com_google_android_gms_internal_zzact.asBinder() : null);
                    this.a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zzb(String str, zzact com_google_android_gms_internal_zzact) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(com_google_android_gms_internal_zzact != null ? com_google_android_gms_internal_zzact.asBinder() : null);
                    this.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zzb(String str, String str2, zzact com_google_android_gms_internal_zzact) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStrongBinder(com_google_android_gms_internal_zzact != null ? com_google_android_gms_internal_zzact.asBinder() : null);
                    this.a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zzc(String str, zzact com_google_android_gms_internal_zzact) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(com_google_android_gms_internal_zzact != null ? com_google_android_gms_internal_zzact.asBinder() : null);
                    this.a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zzc(String str, String str2, zzact com_google_android_gms_internal_zzact) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStrongBinder(com_google_android_gms_internal_zzact != null ? com_google_android_gms_internal_zzact.asBinder() : null);
                    this.a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zzd(String str, zzact com_google_android_gms_internal_zzact) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(com_google_android_gms_internal_zzact != null ? com_google_android_gms_internal_zzact.asBinder() : null);
                    this.a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zzd(String str, String str2, zzact com_google_android_gms_internal_zzact) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStrongBinder(com_google_android_gms_internal_zzact != null ? com_google_android_gms_internal_zzact.asBinder() : null);
                    this.a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zze(String str, zzact com_google_android_gms_internal_zzact) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(com_google_android_gms_internal_zzact != null ? com_google_android_gms_internal_zzact.asBinder() : null);
                    this.a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zze(String str, String str2, zzact com_google_android_gms_internal_zzact) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStrongBinder(com_google_android_gms_internal_zzact != null ? com_google_android_gms_internal_zzact.asBinder() : null);
                    this.a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zzf(String str, zzact com_google_android_gms_internal_zzact) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(com_google_android_gms_internal_zzact != null ? com_google_android_gms_internal_zzact.asBinder() : null);
                    this.a.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zzg(String str, zzact com_google_android_gms_internal_zzact) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(com_google_android_gms_internal_zzact != null ? com_google_android_gms_internal_zzact.asBinder() : null);
                    this.a.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static zzacu zzeI(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof zzacu)) ? new a(iBinder) : (zzacu) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            VerifyAssertionRequest verifyAssertionRequest = null;
            String readString;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    zza(parcel.readString(), com.google.android.gms.internal.zzact.zza.zzeH(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    zzb(parcel.readString(), com.google.android.gms.internal.zzact.zza.zzeH(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    if (parcel.readInt() != 0) {
                        verifyAssertionRequest = (VerifyAssertionRequest) VerifyAssertionRequest.CREATOR.createFromParcel(parcel);
                    }
                    zza(verifyAssertionRequest, com.google.android.gms.internal.zzact.zza.zzeH(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    UserProfileChangeRequest userProfileChangeRequest;
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    readString = parcel.readString();
                    if (parcel.readInt() != 0) {
                        userProfileChangeRequest = (UserProfileChangeRequest) UserProfileChangeRequest.CREATOR.createFromParcel(parcel);
                    }
                    zza(readString, userProfileChangeRequest, com.google.android.gms.internal.zzact.zza.zzeH(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    zza(parcel.readString(), parcel.readString(), com.google.android.gms.internal.zzact.zza.zzeH(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    zzb(parcel.readString(), parcel.readString(), com.google.android.gms.internal.zzact.zza.zzeH(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    zzc(parcel.readString(), parcel.readString(), com.google.android.gms.internal.zzact.zza.zzeH(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    zzd(parcel.readString(), parcel.readString(), com.google.android.gms.internal.zzact.zza.zzeH(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    zzc(parcel.readString(), com.google.android.gms.internal.zzact.zza.zzeH(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    zzd(parcel.readString(), com.google.android.gms.internal.zzact.zza.zzeH(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 11:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    zza(parcel.readString(), parcel.readString(), parcel.readString(), com.google.android.gms.internal.zzact.zza.zzeH(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    readString = parcel.readString();
                    if (parcel.readInt() != 0) {
                        verifyAssertionRequest = (VerifyAssertionRequest) VerifyAssertionRequest.CREATOR.createFromParcel(parcel);
                    }
                    zza(readString, verifyAssertionRequest, com.google.android.gms.internal.zzact.zza.zzeH(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    zze(parcel.readString(), com.google.android.gms.internal.zzact.zza.zzeH(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    zze(parcel.readString(), parcel.readString(), com.google.android.gms.internal.zzact.zza.zzeH(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    zzf(parcel.readString(), com.google.android.gms.internal.zzact.zza.zzeH(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 16:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    zza(com.google.android.gms.internal.zzact.zza.zzeH(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 17:
                    parcel.enforceInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    zzg(parcel.readString(), com.google.android.gms.internal.zzact.zza.zzeH(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.firebase.auth.api.internal.IFirebaseAuthService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void zza(zzact com_google_android_gms_internal_zzact) throws RemoteException;

    void zza(VerifyAssertionRequest verifyAssertionRequest, zzact com_google_android_gms_internal_zzact) throws RemoteException;

    void zza(String str, zzact com_google_android_gms_internal_zzact) throws RemoteException;

    void zza(String str, UserProfileChangeRequest userProfileChangeRequest, zzact com_google_android_gms_internal_zzact) throws RemoteException;

    void zza(String str, VerifyAssertionRequest verifyAssertionRequest, zzact com_google_android_gms_internal_zzact) throws RemoteException;

    void zza(String str, String str2, zzact com_google_android_gms_internal_zzact) throws RemoteException;

    void zza(String str, String str2, String str3, zzact com_google_android_gms_internal_zzact) throws RemoteException;

    void zzb(String str, zzact com_google_android_gms_internal_zzact) throws RemoteException;

    void zzb(String str, String str2, zzact com_google_android_gms_internal_zzact) throws RemoteException;

    void zzc(String str, zzact com_google_android_gms_internal_zzact) throws RemoteException;

    void zzc(String str, String str2, zzact com_google_android_gms_internal_zzact) throws RemoteException;

    void zzd(String str, zzact com_google_android_gms_internal_zzact) throws RemoteException;

    void zzd(String str, String str2, zzact com_google_android_gms_internal_zzact) throws RemoteException;

    void zze(String str, zzact com_google_android_gms_internal_zzact) throws RemoteException;

    void zze(String str, String str2, zzact com_google_android_gms_internal_zzact) throws RemoteException;

    void zzf(String str, zzact com_google_android_gms_internal_zzact) throws RemoteException;

    void zzg(String str, zzact com_google_android_gms_internal_zzact) throws RemoteException;
}
