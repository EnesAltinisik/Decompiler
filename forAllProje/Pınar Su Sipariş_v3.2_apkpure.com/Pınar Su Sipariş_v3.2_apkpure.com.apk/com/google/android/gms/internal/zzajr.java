package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzd;

public interface zzajr extends IInterface {

    public static abstract class zza extends Binder implements zzajr {

        private static class a implements zzajr {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public IBinder asBinder() {
                return this.a;
            }

            public String zzVv() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequestFactory");
                    this.a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public zzajq zza(Uri uri, zzd com_google_android_gms_dynamic_zzd) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequestFactory");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_dynamic_zzd != null ? com_google_android_gms_dynamic_zzd.asBinder() : null);
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    zzajq zzeR = com.google.android.gms.internal.zzajq.zza.zzeR(obtain2.readStrongBinder());
                    return zzeR;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public zzajq zza(Uri uri, zzd com_google_android_gms_dynamic_zzd, long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequestFactory");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_dynamic_zzd != null ? com_google_android_gms_dynamic_zzd.asBinder() : null);
                    obtain.writeLong(j);
                    this.a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    zzajq zzeR = com.google.android.gms.internal.zzajq.zza.zzeR(obtain2.readStrongBinder());
                    return zzeR;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public zzajq zza(Uri uri, zzd com_google_android_gms_dynamic_zzd, zzd com_google_android_gms_dynamic_zzd2) throws RemoteException {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequestFactory");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_dynamic_zzd != null ? com_google_android_gms_dynamic_zzd.asBinder() : null);
                    if (com_google_android_gms_dynamic_zzd2 != null) {
                        iBinder = com_google_android_gms_dynamic_zzd2.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    zzajq zzeR = com.google.android.gms.internal.zzajq.zza.zzeR(obtain2.readStrongBinder());
                    return zzeR;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public zzajq zza(Uri uri, zzd com_google_android_gms_dynamic_zzd, zzd com_google_android_gms_dynamic_zzd2, String str) throws RemoteException {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequestFactory");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_dynamic_zzd != null ? com_google_android_gms_dynamic_zzd.asBinder() : null);
                    if (com_google_android_gms_dynamic_zzd2 != null) {
                        iBinder = com_google_android_gms_dynamic_zzd2.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeString(str);
                    this.a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    zzajq zzeR = com.google.android.gms.internal.zzajq.zza.zzeR(obtain2.readStrongBinder());
                    return zzeR;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public zzajq zza(Uri uri, zzd com_google_android_gms_dynamic_zzd, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequestFactory");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_dynamic_zzd != null ? com_google_android_gms_dynamic_zzd.asBinder() : null);
                    obtain.writeString(str);
                    this.a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    zzajq zzeR = com.google.android.gms.internal.zzajq.zza.zzeR(obtain2.readStrongBinder());
                    return zzeR;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public zzajq zza(Uri uri, zzd com_google_android_gms_dynamic_zzd, String str, zzd com_google_android_gms_dynamic_zzd2, long j, int i, boolean z) throws RemoteException {
                IBinder iBinder = null;
                int i2 = 1;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequestFactory");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_dynamic_zzd != null ? com_google_android_gms_dynamic_zzd.asBinder() : null);
                    obtain.writeString(str);
                    if (com_google_android_gms_dynamic_zzd2 != null) {
                        iBinder = com_google_android_gms_dynamic_zzd2.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeLong(j);
                    obtain.writeInt(i);
                    if (!z) {
                        i2 = 0;
                    }
                    obtain.writeInt(i2);
                    this.a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    zzajq zzeR = com.google.android.gms.internal.zzajq.zza.zzeR(obtain2.readStrongBinder());
                    return zzeR;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public zzajq zzb(Uri uri, zzd com_google_android_gms_dynamic_zzd) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequestFactory");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_dynamic_zzd != null ? com_google_android_gms_dynamic_zzd.asBinder() : null);
                    this.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    zzajq zzeR = com.google.android.gms.internal.zzajq.zza.zzeR(obtain2.readStrongBinder());
                    return zzeR;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public zzajq zzb(Uri uri, zzd com_google_android_gms_dynamic_zzd, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequestFactory");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_dynamic_zzd != null ? com_google_android_gms_dynamic_zzd.asBinder() : null);
                    obtain.writeString(str);
                    this.a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    zzajq zzeR = com.google.android.gms.internal.zzajq.zza.zzeR(obtain2.readStrongBinder());
                    return zzeR;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public zzajq zzc(Uri uri, zzd com_google_android_gms_dynamic_zzd, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequestFactory");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_dynamic_zzd != null ? com_google_android_gms_dynamic_zzd.asBinder() : null);
                    obtain.writeString(str);
                    this.a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    zzajq zzeR = com.google.android.gms.internal.zzajq.zza.zzeR(obtain2.readStrongBinder());
                    return zzeR;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String zzw(Uri uri) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequestFactory");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String zzx(Uri uri) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.storage.network.INetworkRequestFactory");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static zzajr zzeS(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.storage.network.INetworkRequestFactory");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof zzajr)) ? new a(iBinder) : (zzajr) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            zzajq zza;
            String zzVv;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequestFactory");
                    zza = zza(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.dynamic.zzd.zza.zzbz(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(zza != null ? zza.asBinder() : null);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequestFactory");
                    zza = zzb(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.dynamic.zzd.zza.zzbz(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(zza != null ? zza.asBinder() : null);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequestFactory");
                    zza = zza(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.dynamic.zzd.zza.zzbz(parcel.readStrongBinder()), parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(zza != null ? zza.asBinder() : null);
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequestFactory");
                    zza = zza(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.dynamic.zzd.zza.zzbz(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(zza != null ? zza.asBinder() : null);
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequestFactory");
                    zza = zza(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.dynamic.zzd.zza.zzbz(parcel.readStrongBinder()), parcel.readString(), com.google.android.gms.dynamic.zzd.zza.zzbz(parcel.readStrongBinder()), parcel.readLong(), parcel.readInt(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(zza != null ? zza.asBinder() : null);
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequestFactory");
                    zza = zzb(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.dynamic.zzd.zza.zzbz(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(zza != null ? zza.asBinder() : null);
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequestFactory");
                    zza = zzc(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.dynamic.zzd.zza.zzbz(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(zza != null ? zza.asBinder() : null);
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequestFactory");
                    zza = zza(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.dynamic.zzd.zza.zzbz(parcel.readStrongBinder()), com.google.android.gms.dynamic.zzd.zza.zzbz(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(zza != null ? zza.asBinder() : null);
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequestFactory");
                    zza = zza(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.dynamic.zzd.zza.zzbz(parcel.readStrongBinder()), com.google.android.gms.dynamic.zzd.zza.zzbz(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(zza != null ? zza.asBinder() : null);
                    return true;
                case 10:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequestFactory");
                    zzVv = zzVv();
                    parcel2.writeNoException();
                    parcel2.writeString(zzVv);
                    return true;
                case 11:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequestFactory");
                    zzVv = zzw(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeString(zzVv);
                    return true;
                case 12:
                    parcel.enforceInterface("com.google.firebase.storage.network.INetworkRequestFactory");
                    zzVv = zzx(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeString(zzVv);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.firebase.storage.network.INetworkRequestFactory");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    String zzVv() throws RemoteException;

    zzajq zza(Uri uri, zzd com_google_android_gms_dynamic_zzd) throws RemoteException;

    zzajq zza(Uri uri, zzd com_google_android_gms_dynamic_zzd, long j) throws RemoteException;

    zzajq zza(Uri uri, zzd com_google_android_gms_dynamic_zzd, zzd com_google_android_gms_dynamic_zzd2) throws RemoteException;

    zzajq zza(Uri uri, zzd com_google_android_gms_dynamic_zzd, zzd com_google_android_gms_dynamic_zzd2, String str) throws RemoteException;

    zzajq zza(Uri uri, zzd com_google_android_gms_dynamic_zzd, String str) throws RemoteException;

    zzajq zza(Uri uri, zzd com_google_android_gms_dynamic_zzd, String str, zzd com_google_android_gms_dynamic_zzd2, long j, int i, boolean z) throws RemoteException;

    zzajq zzb(Uri uri, zzd com_google_android_gms_dynamic_zzd) throws RemoteException;

    zzajq zzb(Uri uri, zzd com_google_android_gms_dynamic_zzd, String str) throws RemoteException;

    zzajq zzc(Uri uri, zzd com_google_android_gms_dynamic_zzd, String str) throws RemoteException;

    String zzw(Uri uri) throws RemoteException;

    String zzx(Uri uri) throws RemoteException;
}
