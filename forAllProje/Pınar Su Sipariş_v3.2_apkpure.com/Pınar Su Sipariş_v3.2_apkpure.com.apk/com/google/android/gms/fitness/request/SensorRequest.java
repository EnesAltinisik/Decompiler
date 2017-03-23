package com.google.android.gms.fitness.request;

import android.os.SystemClock;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.location.LocationRequest;
import java.util.concurrent.TimeUnit;

public class SensorRequest {
    public static final int ACCURACY_MODE_DEFAULT = 2;
    public static final int ACCURACY_MODE_HIGH = 3;
    public static final int ACCURACY_MODE_LOW = 1;
    private final DataType zzaCH;
    private final DataSource zzaCI;
    private final long zzaEb;
    private final int zzaEc;
    private final long zzaHX;
    private final long zzaHY;
    private final LocationRequest zzaIc;
    private final long zzaId;

    public static class Builder {
        private DataType zzaCH;
        private DataSource zzaCI;
        private long zzaEb = -1;
        private int zzaEc = 2;
        private long zzaHX = 0;
        private long zzaHY = 0;
        private long zzaId = Long.MAX_VALUE;
        private boolean zzaIe = false;

        public SensorRequest build() {
            boolean z = false;
            boolean z2 = (this.zzaCI == null && this.zzaCH == null) ? false : true;
            zzaa.zza(z2, (Object) "Must call setDataSource() or setDataType()");
            if (this.zzaCH == null || this.zzaCI == null || this.zzaCH.equals(this.zzaCI.getDataType())) {
                z = true;
            }
            zzaa.zza(z, (Object) "Specified data type is incompatible with specified data source");
            return new SensorRequest();
        }

        public Builder setAccuracyMode(int i) {
            this.zzaEc = SensorRequest.zzfR(i);
            return this;
        }

        public Builder setDataSource(DataSource dataSource) {
            this.zzaCI = dataSource;
            return this;
        }

        public Builder setDataType(DataType dataType) {
            this.zzaCH = dataType;
            return this;
        }

        public Builder setFastestRate(int i, TimeUnit timeUnit) {
            zzaa.zzb(i >= 0, (Object) "Cannot use a negative interval");
            this.zzaIe = true;
            this.zzaHY = timeUnit.toMicros((long) i);
            return this;
        }

        public Builder setMaxDeliveryLatency(int i, TimeUnit timeUnit) {
            zzaa.zzb(i >= 0, (Object) "Cannot use a negative delivery interval");
            this.zzaHX = timeUnit.toMicros((long) i);
            return this;
        }

        public Builder setSamplingRate(long j, TimeUnit timeUnit) {
            zzaa.zzb(j >= 0, (Object) "Cannot use a negative sampling interval");
            this.zzaEb = timeUnit.toMicros(j);
            if (!this.zzaIe) {
                this.zzaHY = this.zzaEb / 2;
            }
            return this;
        }

        public Builder setTimeout(long j, TimeUnit timeUnit) {
            boolean z = true;
            zzaa.zzb(j > 0, "Invalid time out value specified: %d", Long.valueOf(j));
            if (timeUnit == null) {
                z = false;
            }
            zzaa.zzb(z, (Object) "Invalid time unit specified");
            this.zzaId = timeUnit.toMicros(j);
            return this;
        }
    }

    private SensorRequest(DataSource dataSource, LocationRequest locationRequest) {
        this.zzaIc = locationRequest;
        this.zzaEb = TimeUnit.MILLISECONDS.toMicros(locationRequest.getInterval());
        this.zzaHY = TimeUnit.MILLISECONDS.toMicros(locationRequest.getFastestInterval());
        this.zzaHX = this.zzaEb;
        this.zzaCH = dataSource.getDataType();
        this.zzaEc = zza(locationRequest);
        this.zzaCI = dataSource;
        long expirationTime = locationRequest.getExpirationTime();
        if (expirationTime == Long.MAX_VALUE) {
            this.zzaId = Long.MAX_VALUE;
        } else {
            this.zzaId = TimeUnit.MILLISECONDS.toMicros(expirationTime - SystemClock.elapsedRealtime());
        }
    }

    private SensorRequest(Builder builder) {
        this.zzaCI = builder.zzaCI;
        this.zzaCH = builder.zzaCH;
        this.zzaEb = builder.zzaEb;
        this.zzaHY = builder.zzaHY;
        this.zzaHX = builder.zzaHX;
        this.zzaEc = builder.zzaEc;
        this.zzaIc = null;
        this.zzaId = builder.zzaId;
    }

    public static SensorRequest fromLocationRequest(DataSource dataSource, LocationRequest locationRequest) {
        return new SensorRequest(dataSource, locationRequest);
    }

    private static int zza(LocationRequest locationRequest) {
        switch (locationRequest.getPriority()) {
            case 100:
                return 3;
            case 104:
                return 1;
            default:
                return 2;
        }
    }

    private boolean zza(SensorRequest sensorRequest) {
        return zzz.equal(this.zzaCI, sensorRequest.zzaCI) && zzz.equal(this.zzaCH, sensorRequest.zzaCH) && this.zzaEb == sensorRequest.zzaEb && this.zzaHY == sensorRequest.zzaHY && this.zzaHX == sensorRequest.zzaHX && this.zzaEc == sensorRequest.zzaEc && zzz.equal(this.zzaIc, sensorRequest.zzaIc) && this.zzaId == sensorRequest.zzaId;
    }

    public static int zzfR(int i) {
        switch (i) {
            case 1:
            case 3:
                return i;
            default:
                return 2;
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof SensorRequest) && zza((SensorRequest) obj));
    }

    public int getAccuracyMode() {
        return this.zzaEc;
    }

    public DataSource getDataSource() {
        return this.zzaCI;
    }

    public DataType getDataType() {
        return this.zzaCH;
    }

    public long getFastestRate(TimeUnit timeUnit) {
        return timeUnit.convert(this.zzaHY, TimeUnit.MICROSECONDS);
    }

    public long getMaxDeliveryLatency(TimeUnit timeUnit) {
        return timeUnit.convert(this.zzaHX, TimeUnit.MICROSECONDS);
    }

    public long getSamplingRate(TimeUnit timeUnit) {
        return timeUnit.convert(this.zzaEb, TimeUnit.MICROSECONDS);
    }

    public int hashCode() {
        return zzz.hashCode(this.zzaCI, this.zzaCH, Long.valueOf(this.zzaEb), Long.valueOf(this.zzaHY), Long.valueOf(this.zzaHX), Integer.valueOf(this.zzaEc), this.zzaIc, Long.valueOf(this.zzaId));
    }

    public String toString() {
        return zzz.zzy(this).zzg("dataSource", this.zzaCI).zzg("dataType", this.zzaCH).zzg("samplingRateMicros", Long.valueOf(this.zzaEb)).zzg("deliveryLatencyMicros", Long.valueOf(this.zzaHX)).zzg("timeOutMicros", Long.valueOf(this.zzaId)).toString();
    }

    public long zzym() {
        return this.zzaId;
    }
}
