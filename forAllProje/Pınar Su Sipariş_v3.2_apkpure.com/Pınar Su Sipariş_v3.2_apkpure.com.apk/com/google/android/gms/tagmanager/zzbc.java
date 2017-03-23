package com.google.android.gms.tagmanager;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.internal.zzum;

public interface zzbc extends IInterface {

    public static abstract class zza extends Binder implements zzbc {

        private static class a implements zzbc {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public IBinder asBinder() {
                return this.a;
            }

            public zzum getService(zzd com_google_android_gms_dynamic_zzd, zzba com_google_android_gms_tagmanager_zzba, zzax com_google_android_gms_tagmanager_zzax) throws RemoteException {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.tagmanager.ITagManagerServiceProvider");
                    obtain.writeStrongBinder(com_google_android_gms_dynamic_zzd != null ? com_google_android_gms_dynamic_zzd.asBinder() : null);
                    obtain.writeStrongBinder(com_google_android_gms_tagmanager_zzba != null ? com_google_android_gms_tagmanager_zzba.asBinder() : null);
                    if (com_google_android_gms_tagmanager_zzax != null) {
                        iBinder = com_google_android_gms_tagmanager_zzax.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    zzum zzel = com.google.android.gms.internal.zzum.zza.zzel(obtain2.readStrongBinder());
                    return zzel;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public zza() {
            attachInterface(this, "com.google.android.gms.tagmanager.ITagManagerServiceProvider");
        }

        public static zzbc asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.tagmanager.ITagManagerServiceProvider");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof zzbc)) ? new a(iBinder) : (zzbc) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.tagmanager.ITagManagerServiceProvider");
                    zzum service = getService(com.google.android.gms.dynamic.zzd.zza.zzbz(parcel.readStrongBinder()), com.google.android.gms.tagmanager.zzba.zza.zzej(parcel.readStrongBinder()), com.google.android.gms.tagmanager.zzax.zza.zzeg(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(service != null ? service.asBinder() : null);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.tagmanager.ITagManagerServiceProvider");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    zzum getService(zzd com_google_android_gms_dynamic_zzd, zzba com_google_android_gms_tagmanager_zzba, zzax com_google_android_gms_tagmanager_zzax) throws RemoteException;
}
