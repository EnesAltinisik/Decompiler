package com.google.android.gms.config.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.phenotype.Configuration;
import java.util.List;

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

            public void zza(zzg com_google_android_gms_config_internal_zzg, FetchConfigIpcRequest fetchConfigIpcRequest) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.config.internal.IConfigService");
                    obtain.writeStrongBinder(com_google_android_gms_config_internal_zzg != null ? com_google_android_gms_config_internal_zzg.asBinder() : null);
                    if (fetchConfigIpcRequest != null) {
                        obtain.writeInt(1);
                        fetchConfigIpcRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(zzg com_google_android_gms_config_internal_zzg, String str, Configuration configuration, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.config.internal.IConfigService");
                    obtain.writeStrongBinder(com_google_android_gms_config_internal_zzg != null ? com_google_android_gms_config_internal_zzg.asBinder() : null);
                    obtain.writeString(str);
                    if (configuration != null) {
                        obtain.writeInt(1);
                        configuration.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str2);
                    this.a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(zzg com_google_android_gms_config_internal_zzg, String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.config.internal.IConfigService");
                    obtain.writeStrongBinder(com_google_android_gms_config_internal_zzg != null ? com_google_android_gms_config_internal_zzg.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(zzg com_google_android_gms_config_internal_zzg, String str, List list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.config.internal.IConfigService");
                    obtain.writeStrongBinder(com_google_android_gms_config_internal_zzg != null ? com_google_android_gms_config_internal_zzg.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeList(list);
                    this.a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zzb(zzg com_google_android_gms_config_internal_zzg, String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.config.internal.IConfigService");
                    obtain.writeStrongBinder(com_google_android_gms_config_internal_zzg != null ? com_google_android_gms_config_internal_zzg.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static zzh zzbf(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.config.internal.IConfigService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof zzh)) ? new a(iBinder) : (zzh) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            FetchConfigIpcRequest fetchConfigIpcRequest = null;
            zzg zzbe;
            switch (i) {
                case 4:
                    parcel.enforceInterface("com.google.android.gms.config.internal.IConfigService");
                    zza(com.google.android.gms.config.internal.zzg.zza.zzbe(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.config.internal.IConfigService");
                    zzb(com.google.android.gms.config.internal.zzg.zza.zzbe(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.config.internal.IConfigService");
                    zza(com.google.android.gms.config.internal.zzg.zza.zzbe(parcel.readStrongBinder()), parcel.readString(), parcel.readArrayList(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                case 7:
                    Configuration configuration;
                    parcel.enforceInterface("com.google.android.gms.config.internal.IConfigService");
                    zzbe = com.google.android.gms.config.internal.zzg.zza.zzbe(parcel.readStrongBinder());
                    String readString = parcel.readString();
                    if (parcel.readInt() != 0) {
                        configuration = (Configuration) Configuration.CREATOR.createFromParcel(parcel);
                    }
                    zza(zzbe, readString, configuration, parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.android.gms.config.internal.IConfigService");
                    zzbe = com.google.android.gms.config.internal.zzg.zza.zzbe(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        fetchConfigIpcRequest = (FetchConfigIpcRequest) FetchConfigIpcRequest.CREATOR.createFromParcel(parcel);
                    }
                    zza(zzbe, fetchConfigIpcRequest);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.config.internal.IConfigService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void zza(zzg com_google_android_gms_config_internal_zzg, FetchConfigIpcRequest fetchConfigIpcRequest) throws RemoteException;

    void zza(zzg com_google_android_gms_config_internal_zzg, String str, Configuration configuration, String str2) throws RemoteException;

    void zza(zzg com_google_android_gms_config_internal_zzg, String str, String str2) throws RemoteException;

    void zza(zzg com_google_android_gms_config_internal_zzg, String str, List list) throws RemoteException;

    void zzb(zzg com_google_android_gms_config_internal_zzg, String str, String str2) throws RemoteException;
}
