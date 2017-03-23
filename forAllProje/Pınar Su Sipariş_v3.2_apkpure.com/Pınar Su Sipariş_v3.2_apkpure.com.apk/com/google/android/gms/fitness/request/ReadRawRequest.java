package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.zzrl;
import com.google.android.gms.internal.zzrl.zza;
import java.util.List;

public class ReadRawRequest extends AbstractSafeParcelable {
    public static final Creator<ReadRawRequest> CREATOR = new zzt();
    private final int mVersionCode;
    private final boolean zzaHC;
    private final boolean zzaHD;
    private final zzrl zzaHR;
    private final List<DataSourceQueryParams> zzaHS;

    ReadRawRequest(int i, IBinder iBinder, List<DataSourceQueryParams> list, boolean z, boolean z2) {
        this.mVersionCode = i;
        this.zzaHR = zza.zzbV(iBinder);
        this.zzaHS = list;
        this.zzaHC = z;
        this.zzaHD = z2;
    }

    public IBinder getCallbackBinder() {
        return this.zzaHR != null ? this.zzaHR.asBinder() : null;
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzt.zza(this, parcel, i);
    }

    public boolean zzxZ() {
        return this.zzaHD;
    }

    public boolean zzya() {
        return this.zzaHC;
    }

    public List<DataSourceQueryParams> zzyg() {
        return this.zzaHS;
    }
}
