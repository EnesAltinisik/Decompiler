package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.common.util.zza;
import com.google.android.gms.nearby.messages.Message;
import java.util.Set;

public class Update extends AbstractSafeParcelable {
    public static final Creator<Update> CREATOR = new zzx();
    final int mVersionCode;
    public final Message zzbjL;
    final int zzbku;
    public final DistanceImpl zzbkv;
    public final BleSignalImpl zzbkw;

    Update(int i, int i2, Message message, DistanceImpl distanceImpl, BleSignalImpl bleSignalImpl) {
        boolean z = true;
        this.mVersionCode = i;
        this.zzbku = i2;
        if (zzkl(1) && zzkl(2)) {
            z = false;
        }
        zzaa.zza(z, (Object) "Update cannot represent both FOUND and LOST.");
        this.zzbjL = message;
        this.zzbkv = distanceImpl;
        this.zzbkw = bleSignalImpl;
    }

    private Set<String> zzIc() {
        Set<String> com_google_android_gms_common_util_zza = new zza();
        if (zzkl(1)) {
            com_google_android_gms_common_util_zza.add("FOUND");
        }
        if (zzkl(2)) {
            com_google_android_gms_common_util_zza.add("LOST");
        }
        if (zzkl(4)) {
            com_google_android_gms_common_util_zza.add("DISTANCE");
        }
        if (zzkl(8)) {
            com_google_android_gms_common_util_zza.add("BLE_SIGNAL");
        }
        return com_google_android_gms_common_util_zza;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Update)) {
            return false;
        }
        Update update = (Update) obj;
        return this.zzbku == update.zzbku && zzz.equal(this.zzbjL, update.zzbjL) && zzz.equal(this.zzbkv, update.zzbkv) && zzz.equal(this.zzbkw, update.zzbkw);
    }

    public int hashCode() {
        return zzz.hashCode(Integer.valueOf(this.zzbku), this.zzbjL, this.zzbkv, this.zzbkw);
    }

    public String toString() {
        String valueOf = String.valueOf(zzIc());
        String valueOf2 = String.valueOf(this.zzbjL);
        String valueOf3 = String.valueOf(this.zzbkv);
        String valueOf4 = String.valueOf(this.zzbkw);
        return new StringBuilder((((String.valueOf(valueOf).length() + 47) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()).append("Update{types=").append(valueOf).append(", message=").append(valueOf2).append(", distance=").append(valueOf3).append(", bleSignal=").append(valueOf4).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzx.zza(this, parcel, i);
    }

    public boolean zzkl(int i) {
        return (this.zzbku & i) != 0;
    }
}
