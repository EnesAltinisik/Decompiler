package com.google.firebase.database.connection.idl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface zzg extends IInterface {

    public static abstract class zza extends Binder implements zzg {

        private static class a implements zzg {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public IBinder asBinder() {
                return this.a;
            }

            public String zzPY() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.database.connection.idl.IListenHashProvider");
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean zzPZ() throws RemoteException {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.database.connection.idl.IListenHashProvider");
                    this.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public CompoundHashParcelable zzQF() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.database.connection.idl.IListenHashProvider");
                    this.a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    CompoundHashParcelable compoundHashParcelable = obtain2.readInt() != 0 ? (CompoundHashParcelable) CompoundHashParcelable.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return compoundHashParcelable;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public zza() {
            attachInterface(this, "com.google.firebase.database.connection.idl.IListenHashProvider");
        }

        public static zzg zzeO(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.database.connection.idl.IListenHashProvider");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof zzg)) ? new a(iBinder) : (zzg) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            int i3 = 0;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.firebase.database.connection.idl.IListenHashProvider");
                    String zzPY = zzPY();
                    parcel2.writeNoException();
                    parcel2.writeString(zzPY);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.firebase.database.connection.idl.IListenHashProvider");
                    boolean zzPZ = zzPZ();
                    parcel2.writeNoException();
                    if (zzPZ) {
                        i3 = 1;
                    }
                    parcel2.writeInt(i3);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.firebase.database.connection.idl.IListenHashProvider");
                    CompoundHashParcelable zzQF = zzQF();
                    parcel2.writeNoException();
                    if (zzQF != null) {
                        parcel2.writeInt(1);
                        zzQF.writeToParcel(parcel2, 1);
                        return true;
                    }
                    parcel2.writeInt(0);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.firebase.database.connection.idl.IListenHashProvider");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    String zzPY() throws RemoteException;

    boolean zzPZ() throws RemoteException;

    CompoundHashParcelable zzQF() throws RemoteException;
}
