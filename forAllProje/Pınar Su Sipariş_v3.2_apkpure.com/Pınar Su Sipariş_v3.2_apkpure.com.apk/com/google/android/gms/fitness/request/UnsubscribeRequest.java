package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.zzrp;
import com.google.android.gms.internal.zzrp.zza;

public class UnsubscribeRequest extends AbstractSafeParcelable {
    public static final Creator<UnsubscribeRequest> CREATOR = new zzah();
    private final int mVersionCode;
    private final DataType zzaCH;
    private final DataSource zzaCI;
    private final zzrp zzaHq;

    UnsubscribeRequest(int i, DataType dataType, DataSource dataSource, IBinder iBinder) {
        this.mVersionCode = i;
        this.zzaCH = dataType;
        this.zzaCI = dataSource;
        this.zzaHq = zza.zzbZ(iBinder);
    }

    public UnsubscribeRequest(DataType dataType, DataSource dataSource, zzrp com_google_android_gms_internal_zzrp) {
        this.mVersionCode = 3;
        this.zzaCH = dataType;
        this.zzaCI = dataSource;
        this.zzaHq = com_google_android_gms_internal_zzrp;
    }

    private boolean zzb(UnsubscribeRequest unsubscribeRequest) {
        return zzz.equal(this.zzaCI, unsubscribeRequest.zzaCI) && zzz.equal(this.zzaCH, unsubscribeRequest.zzaCH);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof UnsubscribeRequest) && zzb((UnsubscribeRequest) obj));
    }

    public IBinder getCallbackBinder() {
        return this.zzaHq == null ? null : this.zzaHq.asBinder();
    }

    public DataSource getDataSource() {
        return this.zzaCI;
    }

    public DataType getDataType() {
        return this.zzaCH;
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public int hashCode() {
        return zzz.hashCode(this.zzaCI, this.zzaCH);
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzah.zza(this, parcel, i);
    }
}
