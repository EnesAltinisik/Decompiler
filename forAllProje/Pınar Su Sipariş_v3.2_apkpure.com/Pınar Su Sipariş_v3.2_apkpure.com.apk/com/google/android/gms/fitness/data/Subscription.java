package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzz;

public class Subscription extends AbstractSafeParcelable {
    public static final Creator<Subscription> CREATOR = new zzs();
    private final int mVersionCode;
    private final DataType zzaCH;
    private final DataSource zzaCI;
    private final long zzaEb;
    private final int zzaEc;

    public static class zza {
        private DataType zzaCH;
        private DataSource zzaCI;
        private long zzaEb = -1;
        private int zzaEc = 2;

        public zza zzb(DataSource dataSource) {
            this.zzaCI = dataSource;
            return this;
        }

        public zza zzb(DataType dataType) {
            this.zzaCH = dataType;
            return this;
        }

        public Subscription zzxJ() {
            boolean z = false;
            boolean z2 = (this.zzaCI == null && this.zzaCH == null) ? false : true;
            zzaa.zza(z2, (Object) "Must call setDataSource() or setDataType()");
            if (this.zzaCH == null || this.zzaCI == null || this.zzaCH.equals(this.zzaCI.getDataType())) {
                z = true;
            }
            zzaa.zza(z, (Object) "Specified data type is incompatible with specified data source");
            return new Subscription();
        }
    }

    Subscription(int i, DataSource dataSource, DataType dataType, long j, int i2) {
        this.mVersionCode = i;
        this.zzaCI = dataSource;
        this.zzaCH = dataType;
        this.zzaEb = j;
        this.zzaEc = i2;
    }

    private Subscription(zza com_google_android_gms_fitness_data_Subscription_zza) {
        this.mVersionCode = 1;
        this.zzaCH = com_google_android_gms_fitness_data_Subscription_zza.zzaCH;
        this.zzaCI = com_google_android_gms_fitness_data_Subscription_zza.zzaCI;
        this.zzaEb = com_google_android_gms_fitness_data_Subscription_zza.zzaEb;
        this.zzaEc = com_google_android_gms_fitness_data_Subscription_zza.zzaEc;
    }

    private boolean zza(Subscription subscription) {
        return zzz.equal(this.zzaCI, subscription.zzaCI) && zzz.equal(this.zzaCH, subscription.zzaCH) && this.zzaEb == subscription.zzaEb && this.zzaEc == subscription.zzaEc;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof Subscription) && zza((Subscription) obj));
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

    int getVersionCode() {
        return this.mVersionCode;
    }

    public int hashCode() {
        return zzz.hashCode(this.zzaCI, this.zzaCI, Long.valueOf(this.zzaEb), Integer.valueOf(this.zzaEc));
    }

    public String toDebugString() {
        String str = "Subscription{%s}";
        Object[] objArr = new Object[1];
        objArr[0] = this.zzaCI == null ? this.zzaCH.getName() : this.zzaCI.toDebugString();
        return String.format(str, objArr);
    }

    public String toString() {
        return zzz.zzy(this).zzg("dataSource", this.zzaCI).zzg("dataType", this.zzaCH).zzg("samplingIntervalMicros", Long.valueOf(this.zzaEb)).zzg("accuracyMode", Integer.valueOf(this.zzaEc)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzs.zza(this, parcel, i);
    }

    public long zzxH() {
        return this.zzaEb;
    }

    public DataType zzxI() {
        return this.zzaCH == null ? this.zzaCI.getDataType() : this.zzaCH;
    }
}
