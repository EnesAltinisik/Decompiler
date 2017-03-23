package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface zzul extends IInterface {

    public static abstract class zza extends Binder implements zzul {

        private static class a implements zzul {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public IBinder asBinder() {
                return this.a;
            }

            public void zza(boolean z, String str) throws RemoteException {
                int i = 1;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.tagmanager.internal.alpha.ITagManagerLoadContainerCallback");
                    if (!z) {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public zza() {
            attachInterface(this, "com.google.android.gms.tagmanager.internal.alpha.ITagManagerLoadContainerCallback");
        }

        public static zzul zzek(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.tagmanager.internal.alpha.ITagManagerLoadContainerCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof zzul)) ? new a(iBinder) : (zzul) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.tagmanager.internal.alpha.ITagManagerLoadContainerCallback");
                    zza(parcel.readInt() != 0, parcel.readString());
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.tagmanager.internal.alpha.ITagManagerLoadContainerCallback");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void zza(boolean z, String str) throws RemoteException;
}
