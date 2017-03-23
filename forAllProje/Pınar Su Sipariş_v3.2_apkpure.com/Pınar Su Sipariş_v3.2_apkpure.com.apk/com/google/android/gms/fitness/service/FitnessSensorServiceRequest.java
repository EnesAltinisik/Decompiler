package com.google.android.gms.fitness.service;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.zzk;
import com.google.android.gms.fitness.data.zzk.zza;
import java.util.concurrent.TimeUnit;

public class FitnessSensorServiceRequest extends AbstractSafeParcelable {
    public static final Creator<FitnessSensorServiceRequest> CREATOR = new zza();
    public static final int UNSPECIFIED = -1;
    private final int mVersionCode;
    private final DataSource zzaCI;
    private final zzk zzaHU;
    private final long zzaIE;
    private final long zzaIF;

    FitnessSensorServiceRequest(int i, DataSource dataSource, IBinder iBinder, long j, long j2) {
        this.mVersionCode = i;
        this.zzaCI = dataSource;
        this.zzaHU = zza.zzbB(iBinder);
        this.zzaIE = j;
        this.zzaIF = j2;
    }

    private boolean zza(FitnessSensorServiceRequest fitnessSensorServiceRequest) {
        return zzz.equal(this.zzaCI, fitnessSensorServiceRequest.zzaCI) && this.zzaIE == fitnessSensorServiceRequest.zzaIE && this.zzaIF == fitnessSensorServiceRequest.zzaIF;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof FitnessSensorServiceRequest) && zza((FitnessSensorServiceRequest) obj));
    }

    public long getBatchInterval(TimeUnit timeUnit) {
        return timeUnit.convert(this.zzaIF, TimeUnit.MICROSECONDS);
    }

    public DataSource getDataSource() {
        return this.zzaCI;
    }

    public SensorEventDispatcher getDispatcher() {
        return new a(this.zzaHU);
    }

    public long getSamplingRate(TimeUnit timeUnit) {
        return this.zzaIE == -1 ? -1 : timeUnit.convert(this.zzaIE, TimeUnit.MICROSECONDS);
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public int hashCode() {
        return zzz.hashCode(this.zzaCI, Long.valueOf(this.zzaIE), Long.valueOf(this.zzaIF));
    }

    public String toString() {
        return String.format("FitnessSensorServiceRequest{%s}", new Object[]{this.zzaCI});
    }

    public void writeToParcel(Parcel parcel, int i) {
        zza.zza(this, parcel, i);
    }

    public long zzxH() {
        return this.zzaIE;
    }

    public long zzyC() {
        return this.zzaIF;
    }

    IBinder zzyl() {
        return this.zzaHU.asBinder();
    }
}
