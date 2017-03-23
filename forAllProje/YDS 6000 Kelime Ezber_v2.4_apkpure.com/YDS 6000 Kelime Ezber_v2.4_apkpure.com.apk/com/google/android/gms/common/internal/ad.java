package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface ad extends IInterface {

    public static abstract class a extends Binder implements ad {

        private static class a implements ad {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public void a(ac acVar, j jVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(acVar != null ? acVar.asBinder() : null);
                    if (jVar != null) {
                        obtain.writeInt(1);
                        jVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(47, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(ac acVar, s sVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(acVar != null ? acVar.asBinder() : null);
                    if (sVar != null) {
                        obtain.writeInt(1);
                        sVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(46, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.a;
            }
        }

        public static ad a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ad)) ? new a(iBinder) : (ad) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            j jVar = null;
            ac a;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    com.google.android.gms.common.internal.ac.a.a(parcel.readStrongBinder());
                    parcel.readInt();
                    parcel.readString();
                    parcel.readString();
                    parcel.createStringArray();
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                        Bundle.CREATOR.createFromParcel(parcel);
                    }
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    com.google.android.gms.common.internal.ac.a.a(parcel.readStrongBinder());
                    parcel.readInt();
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                        Bundle.CREATOR.createFromParcel(parcel);
                    }
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    com.google.android.gms.common.internal.ac.a.a(parcel.readStrongBinder());
                    parcel.readInt();
                    parcel.readString();
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    com.google.android.gms.common.internal.ac.a.a(parcel.readStrongBinder());
                    parcel.readInt();
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    com.google.android.gms.common.internal.ac.a.a(parcel.readStrongBinder());
                    parcel.readInt();
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                        Bundle.CREATOR.createFromParcel(parcel);
                    }
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    com.google.android.gms.common.internal.ac.a.a(parcel.readStrongBinder());
                    parcel.readInt();
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                        Bundle.CREATOR.createFromParcel(parcel);
                    }
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    com.google.android.gms.common.internal.ac.a.a(parcel.readStrongBinder());
                    parcel.readInt();
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                        Bundle.CREATOR.createFromParcel(parcel);
                    }
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    com.google.android.gms.common.internal.ac.a.a(parcel.readStrongBinder());
                    parcel.readInt();
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                        Bundle.CREATOR.createFromParcel(parcel);
                    }
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    com.google.android.gms.common.internal.ac.a.a(parcel.readStrongBinder());
                    parcel.readInt();
                    parcel.readString();
                    parcel.readString();
                    parcel.createStringArray();
                    parcel.readString();
                    parcel.readStrongBinder();
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                        Bundle.CREATOR.createFromParcel(parcel);
                    }
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    com.google.android.gms.common.internal.ac.a.a(parcel.readStrongBinder());
                    parcel.readInt();
                    parcel.readString();
                    parcel.readString();
                    parcel.createStringArray();
                    parcel2.writeNoException();
                    return true;
                case 11:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    com.google.android.gms.common.internal.ac.a.a(parcel.readStrongBinder());
                    parcel.readInt();
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                        Bundle.CREATOR.createFromParcel(parcel);
                    }
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    com.google.android.gms.common.internal.ac.a.a(parcel.readStrongBinder());
                    parcel.readInt();
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                        Bundle.CREATOR.createFromParcel(parcel);
                    }
                    parcel2.writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    com.google.android.gms.common.internal.ac.a.a(parcel.readStrongBinder());
                    parcel.readInt();
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                        Bundle.CREATOR.createFromParcel(parcel);
                    }
                    parcel2.writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    com.google.android.gms.common.internal.ac.a.a(parcel.readStrongBinder());
                    parcel.readInt();
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                        Bundle.CREATOR.createFromParcel(parcel);
                    }
                    parcel2.writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    com.google.android.gms.common.internal.ac.a.a(parcel.readStrongBinder());
                    parcel.readInt();
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                        Bundle.CREATOR.createFromParcel(parcel);
                    }
                    parcel2.writeNoException();
                    return true;
                case 16:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    com.google.android.gms.common.internal.ac.a.a(parcel.readStrongBinder());
                    parcel.readInt();
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                        Bundle.CREATOR.createFromParcel(parcel);
                    }
                    parcel2.writeNoException();
                    return true;
                case 17:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    com.google.android.gms.common.internal.ac.a.a(parcel.readStrongBinder());
                    parcel.readInt();
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                        Bundle.CREATOR.createFromParcel(parcel);
                    }
                    parcel2.writeNoException();
                    return true;
                case 18:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    com.google.android.gms.common.internal.ac.a.a(parcel.readStrongBinder());
                    parcel.readInt();
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                        Bundle.CREATOR.createFromParcel(parcel);
                    }
                    parcel2.writeNoException();
                    return true;
                case 19:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    com.google.android.gms.common.internal.ac.a.a(parcel.readStrongBinder());
                    parcel.readInt();
                    parcel.readString();
                    parcel.readStrongBinder();
                    if (parcel.readInt() != 0) {
                        Bundle.CREATOR.createFromParcel(parcel);
                    }
                    parcel2.writeNoException();
                    return true;
                case 20:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    com.google.android.gms.common.internal.ac.a.a(parcel.readStrongBinder());
                    parcel.readInt();
                    parcel.readString();
                    parcel.createStringArray();
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                        Bundle.CREATOR.createFromParcel(parcel);
                    }
                    parcel2.writeNoException();
                    return true;
                case 21:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    com.google.android.gms.common.internal.ac.a.a(parcel.readStrongBinder());
                    parcel.readInt();
                    parcel.readString();
                    parcel2.writeNoException();
                    return true;
                case 22:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    com.google.android.gms.common.internal.ac.a.a(parcel.readStrongBinder());
                    parcel.readInt();
                    parcel.readString();
                    parcel2.writeNoException();
                    return true;
                case 23:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    com.google.android.gms.common.internal.ac.a.a(parcel.readStrongBinder());
                    parcel.readInt();
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                        Bundle.CREATOR.createFromParcel(parcel);
                    }
                    parcel2.writeNoException();
                    return true;
                case 24:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    com.google.android.gms.common.internal.ac.a.a(parcel.readStrongBinder());
                    parcel.readInt();
                    parcel.readString();
                    parcel2.writeNoException();
                    return true;
                case 25:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    com.google.android.gms.common.internal.ac.a.a(parcel.readStrongBinder());
                    parcel.readInt();
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                        Bundle.CREATOR.createFromParcel(parcel);
                    }
                    parcel2.writeNoException();
                    return true;
                case 26:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    com.google.android.gms.common.internal.ac.a.a(parcel.readStrongBinder());
                    parcel.readInt();
                    parcel.readString();
                    parcel2.writeNoException();
                    return true;
                case 27:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    com.google.android.gms.common.internal.ac.a.a(parcel.readStrongBinder());
                    parcel.readInt();
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                        Bundle.CREATOR.createFromParcel(parcel);
                    }
                    parcel2.writeNoException();
                    return true;
                case 28:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    parcel2.writeNoException();
                    return true;
                case 30:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    com.google.android.gms.common.internal.ac.a.a(parcel.readStrongBinder());
                    parcel.readInt();
                    parcel.readString();
                    parcel.readString();
                    parcel.createStringArray();
                    if (parcel.readInt() != 0) {
                        Bundle.CREATOR.createFromParcel(parcel);
                    }
                    parcel2.writeNoException();
                    return true;
                case 31:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    com.google.android.gms.common.internal.ac.a.a(parcel.readStrongBinder());
                    parcel.readInt();
                    parcel.readString();
                    parcel2.writeNoException();
                    return true;
                case 32:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    com.google.android.gms.common.internal.ac.a.a(parcel.readStrongBinder());
                    parcel.readInt();
                    parcel.readString();
                    parcel2.writeNoException();
                    return true;
                case 33:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    com.google.android.gms.common.internal.ac.a.a(parcel.readStrongBinder());
                    parcel.readInt();
                    parcel.readString();
                    parcel.readString();
                    parcel.readString();
                    parcel.createStringArray();
                    parcel2.writeNoException();
                    return true;
                case 34:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    com.google.android.gms.common.internal.ac.a.a(parcel.readStrongBinder());
                    parcel.readInt();
                    parcel.readString();
                    parcel.readString();
                    parcel2.writeNoException();
                    return true;
                case 35:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    com.google.android.gms.common.internal.ac.a.a(parcel.readStrongBinder());
                    parcel.readInt();
                    parcel.readString();
                    parcel2.writeNoException();
                    return true;
                case 36:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    com.google.android.gms.common.internal.ac.a.a(parcel.readStrongBinder());
                    parcel.readInt();
                    parcel.readString();
                    parcel2.writeNoException();
                    return true;
                case 37:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    com.google.android.gms.common.internal.ac.a.a(parcel.readStrongBinder());
                    parcel.readInt();
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                        Bundle.CREATOR.createFromParcel(parcel);
                    }
                    parcel2.writeNoException();
                    return true;
                case 38:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    com.google.android.gms.common.internal.ac.a.a(parcel.readStrongBinder());
                    parcel.readInt();
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                        Bundle.CREATOR.createFromParcel(parcel);
                    }
                    parcel2.writeNoException();
                    return true;
                case 40:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    com.google.android.gms.common.internal.ac.a.a(parcel.readStrongBinder());
                    parcel.readInt();
                    parcel.readString();
                    parcel2.writeNoException();
                    return true;
                case 41:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    com.google.android.gms.common.internal.ac.a.a(parcel.readStrongBinder());
                    parcel.readInt();
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                        Bundle.CREATOR.createFromParcel(parcel);
                    }
                    parcel2.writeNoException();
                    return true;
                case 42:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    com.google.android.gms.common.internal.ac.a.a(parcel.readStrongBinder());
                    parcel.readInt();
                    parcel.readString();
                    parcel2.writeNoException();
                    return true;
                case 43:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    com.google.android.gms.common.internal.ac.a.a(parcel.readStrongBinder());
                    parcel.readInt();
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                        Bundle.CREATOR.createFromParcel(parcel);
                    }
                    parcel2.writeNoException();
                    return true;
                case 44:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    com.google.android.gms.common.internal.ac.a.a(parcel.readStrongBinder());
                    parcel.readInt();
                    parcel.readString();
                    parcel2.writeNoException();
                    return true;
                case 45:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    com.google.android.gms.common.internal.ac.a.a(parcel.readStrongBinder());
                    parcel.readInt();
                    parcel.readString();
                    parcel2.writeNoException();
                    return true;
                case 46:
                    s sVar;
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    a = com.google.android.gms.common.internal.ac.a.a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        sVar = (s) s.CREATOR.createFromParcel(parcel);
                    }
                    a(a, sVar);
                    parcel2.writeNoException();
                    return true;
                case 47:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    a = com.google.android.gms.common.internal.ac.a.a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        jVar = (j) j.CREATOR.createFromParcel(parcel);
                    }
                    a(a, jVar);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.common.internal.IGmsServiceBroker");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void a(ac acVar, j jVar);

    void a(ac acVar, s sVar);
}
