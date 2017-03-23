package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.zzrk;
import com.google.android.gms.internal.zzrk.zza;

public class ListSubscriptionsRequest extends AbstractSafeParcelable {
    public static final Creator<ListSubscriptionsRequest> CREATOR = new zzs();
    private final int mVersionCode;
    private final DataType zzaCH;
    private final zzrk zzaHQ;

    ListSubscriptionsRequest(int i, DataType dataType, IBinder iBinder) {
        this.mVersionCode = i;
        this.zzaCH = dataType;
        this.zzaHQ = zza.zzbU(iBinder);
    }

    public ListSubscriptionsRequest(DataType dataType, zzrk com_google_android_gms_internal_zzrk) {
        this.mVersionCode = 3;
        this.zzaCH = dataType;
        this.zzaHQ = com_google_android_gms_internal_zzrk;
    }

    public IBinder getCallbackBinder() {
        return this.zzaHQ == null ? null : this.zzaHQ.asBinder();
    }

    public DataType getDataType() {
        return this.zzaCH;
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzs.zza(this, parcel, i);
    }
}
