package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.zzk;
import com.google.android.gms.fitness.data.zzk.zza;
import com.google.android.gms.internal.zzrp;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.ClientIdentity;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SensorRegistrationRequest extends AbstractSafeParcelable {
    public static final Creator<SensorRegistrationRequest> CREATOR = new zzv();
    private final PendingIntent mPendingIntent;
    private final int mVersionCode;
    private DataType zzaCH;
    private DataSource zzaCI;
    private final long zzaEb;
    private final int zzaEc;
    private zzk zzaHU;
    int zzaHV;
    int zzaHW;
    private final long zzaHX;
    private final long zzaHY;
    private final List<LocationRequest> zzaHZ;
    private final zzrp zzaHq;
    private final long zzaIa;
    private final List<ClientIdentity> zzaIb;

    SensorRegistrationRequest(int i, DataSource dataSource, DataType dataType, IBinder iBinder, int i2, int i3, long j, long j2, PendingIntent pendingIntent, long j3, int i4, List<LocationRequest> list, long j4, IBinder iBinder2) {
        this.mVersionCode = i;
        this.zzaCI = dataSource;
        this.zzaCH = dataType;
        this.zzaHU = iBinder == null ? null : zza.zzbB(iBinder);
        if (j == 0) {
            j = (long) i2;
        }
        this.zzaEb = j;
        this.zzaHY = j3;
        if (j2 == 0) {
            j2 = (long) i3;
        }
        this.zzaHX = j2;
        this.zzaHZ = list;
        this.mPendingIntent = pendingIntent;
        this.zzaEc = i4;
        this.zzaIb = Collections.emptyList();
        this.zzaIa = j4;
        this.zzaHq = zzrp.zza.zzbZ(iBinder2);
    }

    public SensorRegistrationRequest(DataSource dataSource, DataType dataType, zzk com_google_android_gms_fitness_data_zzk, PendingIntent pendingIntent, long j, long j2, long j3, int i, List<LocationRequest> list, List<ClientIdentity> list2, long j4, zzrp com_google_android_gms_internal_zzrp) {
        this.mVersionCode = 6;
        this.zzaCI = dataSource;
        this.zzaCH = dataType;
        this.zzaHU = com_google_android_gms_fitness_data_zzk;
        this.mPendingIntent = pendingIntent;
        this.zzaEb = j;
        this.zzaHY = j2;
        this.zzaHX = j3;
        this.zzaEc = i;
        this.zzaHZ = list;
        this.zzaIb = list2;
        this.zzaIa = j4;
        this.zzaHq = com_google_android_gms_internal_zzrp;
    }

    public SensorRegistrationRequest(SensorRequest sensorRequest, zzk com_google_android_gms_fitness_data_zzk, PendingIntent pendingIntent, zzrp com_google_android_gms_internal_zzrp) {
        zzk com_google_android_gms_fitness_data_zzk2 = com_google_android_gms_fitness_data_zzk;
        PendingIntent pendingIntent2 = pendingIntent;
        this(sensorRequest.getDataSource(), sensorRequest.getDataType(), com_google_android_gms_fitness_data_zzk2, pendingIntent2, sensorRequest.getSamplingRate(TimeUnit.MICROSECONDS), sensorRequest.getFastestRate(TimeUnit.MICROSECONDS), sensorRequest.getMaxDeliveryLatency(TimeUnit.MICROSECONDS), sensorRequest.getAccuracyMode(), null, Collections.emptyList(), sensorRequest.zzym(), com_google_android_gms_internal_zzrp);
    }

    private boolean zzb(SensorRegistrationRequest sensorRegistrationRequest) {
        return zzz.equal(this.zzaCI, sensorRegistrationRequest.zzaCI) && zzz.equal(this.zzaCH, sensorRegistrationRequest.zzaCH) && this.zzaEb == sensorRegistrationRequest.zzaEb && this.zzaHY == sensorRegistrationRequest.zzaHY && this.zzaHX == sensorRegistrationRequest.zzaHX && this.zzaEc == sensorRegistrationRequest.zzaEc && zzz.equal(this.zzaHZ, sensorRegistrationRequest.zzaHZ);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof SensorRegistrationRequest) && zzb((SensorRegistrationRequest) obj));
    }

    public int getAccuracyMode() {
        return this.zzaEc;
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
        return zzz.hashCode(this.zzaCI, this.zzaCH, this.zzaHU, Long.valueOf(this.zzaEb), Long.valueOf(this.zzaHY), Long.valueOf(this.zzaHX), Integer.valueOf(this.zzaEc), this.zzaHZ);
    }

    public String toString() {
        return String.format("SensorRegistrationRequest{type %s source %s interval %s fastest %s latency %s}", new Object[]{this.zzaCH, this.zzaCI, Long.valueOf(this.zzaEb), Long.valueOf(this.zzaHY), Long.valueOf(this.zzaHX)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzv.zza(this, parcel, i);
    }

    public long zzxH() {
        return this.zzaEb;
    }

    public long zzyh() {
        return this.zzaHY;
    }

    public long zzyi() {
        return this.zzaHX;
    }

    public List<LocationRequest> zzyj() {
        return this.zzaHZ;
    }

    public long zzyk() {
        return this.zzaIa;
    }

    IBinder zzyl() {
        return this.zzaHU == null ? null : this.zzaHU.asBinder();
    }
}
