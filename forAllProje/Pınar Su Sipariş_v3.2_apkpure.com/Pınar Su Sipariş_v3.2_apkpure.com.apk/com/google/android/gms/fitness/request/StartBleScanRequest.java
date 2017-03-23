package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.common.util.zzb;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.request.zza.zza;
import com.google.android.gms.internal.zzrp;
import java.util.Collections;
import java.util.List;

public class StartBleScanRequest extends AbstractSafeParcelable {
    public static final Creator<StartBleScanRequest> CREATOR = new zzad();
    private final int mVersionCode;
    private final List<DataType> zzaCS;
    private final zzrp zzaHq;
    private final zzq zzaIn;
    private final int zzaIo;

    public static class Builder {
        private DataType[] zzaHL = new DataType[0];
        private zzq zzaIn;
        private int zzaIo = 10;

        public StartBleScanRequest build() {
            zzaa.zza(this.zzaIn != null, (Object) "Must set BleScanCallback");
            return new StartBleScanRequest();
        }

        public Builder setBleScanCallback(BleScanCallback bleScanCallback) {
            zza(zza.zzxT().zza(bleScanCallback));
            return this;
        }

        public Builder setDataTypes(DataType... dataTypeArr) {
            this.zzaHL = dataTypeArr;
            return this;
        }

        public Builder setTimeoutSecs(int i) {
            boolean z = true;
            zzaa.zzb(i > 0, (Object) "Stop time must be greater than zero");
            if (i > 60) {
                z = false;
            }
            zzaa.zzb(z, (Object) "Stop time must be less than 1 minute");
            this.zzaIo = i;
            return this;
        }

        public Builder zza(zzq com_google_android_gms_fitness_request_zzq) {
            this.zzaIn = com_google_android_gms_fitness_request_zzq;
            return this;
        }
    }

    StartBleScanRequest(int i, List<DataType> list, IBinder iBinder, int i2, IBinder iBinder2) {
        this.mVersionCode = i;
        this.zzaCS = list;
        this.zzaIn = zzq.zza.zzcc(iBinder);
        this.zzaIo = i2;
        this.zzaHq = zzrp.zza.zzbZ(iBinder2);
    }

    private StartBleScanRequest(Builder builder) {
        this(zzb.zzb(builder.zzaHL), builder.zzaIn, builder.zzaIo, null);
    }

    public StartBleScanRequest(StartBleScanRequest startBleScanRequest, zzrp com_google_android_gms_internal_zzrp) {
        this(startBleScanRequest.zzaCS, startBleScanRequest.zzaIn, startBleScanRequest.zzaIo, com_google_android_gms_internal_zzrp);
    }

    public StartBleScanRequest(List<DataType> list, zzq com_google_android_gms_fitness_request_zzq, int i, zzrp com_google_android_gms_internal_zzrp) {
        this.mVersionCode = 4;
        this.zzaCS = list;
        this.zzaIn = com_google_android_gms_fitness_request_zzq;
        this.zzaIo = i;
        this.zzaHq = com_google_android_gms_internal_zzrp;
    }

    public IBinder getCallbackBinder() {
        return this.zzaHq == null ? null : this.zzaHq.asBinder();
    }

    public List<DataType> getDataTypes() {
        return Collections.unmodifiableList(this.zzaCS);
    }

    public int getTimeoutSecs() {
        return this.zzaIo;
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public String toString() {
        return zzz.zzy(this).zzg("dataTypes", this.zzaCS).zzg("timeoutSecs", Integer.valueOf(this.zzaIo)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzad.zza(this, parcel, i);
    }

    public IBinder zzyq() {
        return this.zzaIn.asBinder();
    }
}
