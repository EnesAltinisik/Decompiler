package com.google.android.gms.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface abw extends IInterface {

    public static abstract class a extends Binder implements abw {

        private static class a implements abw {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public void a(abv com_google_android_gms_b_abv) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
                    if (com_google_android_gms_b_abv != null) {
                        iBinder = com_google_android_gms_b_abv.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(abv com_google_android_gms_b_abv, abq com_google_android_gms_b_abq) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
                    if (com_google_android_gms_b_abv != null) {
                        iBinder = com_google_android_gms_b_abv.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (com_google_android_gms_b_abq != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_b_abq.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.a;
            }
        }

        public static abw a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof abw)) ? new a(iBinder) : (abw) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
                    a(com.google.android.gms.b.abv.a.a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (abq) abq.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
                    a(com.google.android.gms.b.abv.a.a(parcel.readStrongBinder()));
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void a(abv com_google_android_gms_b_abv);

    void a(abv com_google_android_gms_b_abv, abq com_google_android_gms_b_abq);
}
