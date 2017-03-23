package com.google.android.gms.iid;

import android.annotation.TargetApi;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import com.google.android.gms.iid.zzb.zza;

public class MessengerCompat implements Parcelable {
    public static final Creator<MessengerCompat> CREATOR = new Creator<MessengerCompat>() {
        public MessengerCompat a(Parcel parcel) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            return readStrongBinder != null ? new MessengerCompat(readStrongBinder) : null;
        }

        public MessengerCompat[] a(int i) {
            return new MessengerCompat[i];
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return a(i);
        }
    };
    Messenger zzaUn;
    zzb zzaUo;

    private final class a extends zza {
        Handler a;
        final /* synthetic */ MessengerCompat b;

        a(MessengerCompat messengerCompat, Handler handler) {
            this.b = messengerCompat;
            this.a = handler;
        }

        public void send(Message message) throws RemoteException {
            message.arg2 = Binder.getCallingUid();
            this.a.dispatchMessage(message);
        }
    }

    public MessengerCompat(Handler handler) {
        if (VERSION.SDK_INT >= 21) {
            this.zzaUn = new Messenger(handler);
        } else {
            this.zzaUo = new a(this, handler);
        }
    }

    public MessengerCompat(IBinder iBinder) {
        if (VERSION.SDK_INT >= 21) {
            this.zzaUn = new Messenger(iBinder);
        } else {
            this.zzaUo = zza.zzcl(iBinder);
        }
    }

    public static int zzc(Message message) {
        return VERSION.SDK_INT >= 21 ? zzd(message) : message.arg2;
    }

    @TargetApi(21)
    private static int zzd(Message message) {
        return message.sendingUid;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj != null) {
            try {
                z = getBinder().equals(((MessengerCompat) obj).getBinder());
            } catch (ClassCastException e) {
            }
        }
        return z;
    }

    public IBinder getBinder() {
        return this.zzaUn != null ? this.zzaUn.getBinder() : this.zzaUo.asBinder();
    }

    public int hashCode() {
        return getBinder().hashCode();
    }

    public void send(Message message) throws RemoteException {
        if (this.zzaUn != null) {
            this.zzaUn.send(message);
        } else {
            this.zzaUo.send(message);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (this.zzaUn != null) {
            parcel.writeStrongBinder(this.zzaUn.getBinder());
        } else {
            parcel.writeStrongBinder(this.zzaUo.asBinder());
        }
    }
}
