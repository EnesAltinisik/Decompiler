package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.zzrp;
import com.google.android.gms.internal.zzrp.zza;

public class DataUpdateListenerRegistrationRequest extends AbstractSafeParcelable {
    public static final Creator<DataUpdateListenerRegistrationRequest> CREATOR = new zzk();
    private final PendingIntent mPendingIntent;
    private final int mVersionCode;
    private DataType zzaCH;
    private DataSource zzaCI;
    private final zzrp zzaHq;

    public static class Builder {
        private PendingIntent mPendingIntent;
        private DataType zzaCH;
        private DataSource zzaCI;

        public DataUpdateListenerRegistrationRequest build() {
            boolean z = (this.zzaCI == null && this.zzaCH == null) ? false : true;
            zzaa.zza(z, (Object) "Set either dataSource or dataTYpe");
            zzaa.zzb(this.mPendingIntent, (Object) "pendingIntent must be set");
            return new DataUpdateListenerRegistrationRequest();
        }

        public Builder setDataSource(DataSource dataSource) throws NullPointerException {
            zzaa.zzz(dataSource);
            this.zzaCI = dataSource;
            return this;
        }

        public Builder setDataType(DataType dataType) {
            zzaa.zzz(dataType);
            this.zzaCH = dataType;
            return this;
        }

        public Builder setPendingIntent(PendingIntent pendingIntent) {
            zzaa.zzz(pendingIntent);
            this.mPendingIntent = pendingIntent;
            return this;
        }
    }

    DataUpdateListenerRegistrationRequest(int i, DataSource dataSource, DataType dataType, PendingIntent pendingIntent, IBinder iBinder) {
        this.mVersionCode = i;
        this.zzaCI = dataSource;
        this.zzaCH = dataType;
        this.mPendingIntent = pendingIntent;
        this.zzaHq = zza.zzbZ(iBinder);
    }

    public DataUpdateListenerRegistrationRequest(DataSource dataSource, DataType dataType, PendingIntent pendingIntent, IBinder iBinder) {
        this.mVersionCode = 1;
        this.zzaCI = dataSource;
        this.zzaCH = dataType;
        this.mPendingIntent = pendingIntent;
        this.zzaHq = zza.zzbZ(iBinder);
    }

    private DataUpdateListenerRegistrationRequest(Builder builder) {
        this(builder.zzaCI, builder.zzaCH, builder.mPendingIntent, null);
    }

    private boolean zzb(DataUpdateListenerRegistrationRequest dataUpdateListenerRegistrationRequest) {
        return zzz.equal(this.zzaCI, dataUpdateListenerRegistrationRequest.zzaCI) && zzz.equal(this.zzaCH, dataUpdateListenerRegistrationRequest.zzaCH) && zzz.equal(this.mPendingIntent, dataUpdateListenerRegistrationRequest.mPendingIntent);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof DataUpdateListenerRegistrationRequest) && zzb((DataUpdateListenerRegistrationRequest) obj));
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

    public PendingIntent getIntent() {
        return this.mPendingIntent;
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public int hashCode() {
        return zzz.hashCode(this.zzaCI, this.zzaCH, this.mPendingIntent);
    }

    public String toString() {
        return zzz.zzy(this).zzg("dataSource", this.zzaCI).zzg("dataType", this.zzaCH).zzg("pendingIntent", this.mPendingIntent).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzk.zza(this, parcel, i);
    }
}
