package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.zzqz;
import com.google.android.gms.internal.zzqz.zza;

public class DailyTotalRequest extends AbstractSafeParcelable {
    public static final Creator<DailyTotalRequest> CREATOR = new zzc();
    private final int mVersionCode;
    private DataType zzaCH;
    private final zzqz zzaHr;

    DailyTotalRequest(int i, IBinder iBinder, DataType dataType) {
        this.mVersionCode = i;
        this.zzaHr = zza.zzbJ(iBinder);
        this.zzaCH = dataType;
    }

    public DailyTotalRequest(zzqz com_google_android_gms_internal_zzqz, DataType dataType) {
        this.mVersionCode = 2;
        this.zzaHr = com_google_android_gms_internal_zzqz;
        this.zzaCH = dataType;
    }

    public IBinder getCallbackBinder() {
        return this.zzaHr.asBinder();
    }

    public DataType getDataType() {
        return this.zzaCH;
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public String toString() {
        return String.format("DailyTotalRequest{%s}", new Object[]{this.zzaCH.zzxy()});
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzc.zza(this, parcel, i);
    }
}
