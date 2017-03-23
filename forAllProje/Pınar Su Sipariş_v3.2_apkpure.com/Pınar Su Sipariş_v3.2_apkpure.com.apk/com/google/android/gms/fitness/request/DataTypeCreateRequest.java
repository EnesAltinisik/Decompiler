package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.fitness.data.Field;
import com.google.android.gms.internal.zzrc;
import com.google.android.gms.internal.zzrc.zza;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DataTypeCreateRequest extends AbstractSafeParcelable {
    public static final Creator<DataTypeCreateRequest> CREATOR = new zzi();
    private final String mName;
    private final int mVersionCode;
    private final List<Field> zzaDs;
    private final zzrc zzaHN;

    public static class Builder {
        private String mName;
        private List<Field> zzaDs = new ArrayList();

        public Builder addField(Field field) {
            if (!this.zzaDs.contains(field)) {
                this.zzaDs.add(field);
            }
            return this;
        }

        public Builder addField(String str, int i) {
            boolean z = (str == null || str.isEmpty()) ? false : true;
            zzaa.zzb(z, (Object) "Invalid name specified");
            return addField(Field.zzl(str, i));
        }

        public DataTypeCreateRequest build() {
            boolean z = true;
            zzaa.zza(this.mName != null, (Object) "Must set the name");
            if (this.zzaDs.isEmpty()) {
                z = false;
            }
            zzaa.zza(z, (Object) "Must specify the data fields");
            return new DataTypeCreateRequest();
        }

        public Builder setName(String str) {
            this.mName = str;
            return this;
        }
    }

    DataTypeCreateRequest(int i, String str, List<Field> list, IBinder iBinder) {
        this.mVersionCode = i;
        this.mName = str;
        this.zzaDs = Collections.unmodifiableList(list);
        this.zzaHN = zza.zzbM(iBinder);
    }

    private DataTypeCreateRequest(Builder builder) {
        this(builder.mName, builder.zzaDs, null);
    }

    public DataTypeCreateRequest(DataTypeCreateRequest dataTypeCreateRequest, zzrc com_google_android_gms_internal_zzrc) {
        this(dataTypeCreateRequest.mName, dataTypeCreateRequest.zzaDs, com_google_android_gms_internal_zzrc);
    }

    public DataTypeCreateRequest(String str, List<Field> list, zzrc com_google_android_gms_internal_zzrc) {
        this.mVersionCode = 3;
        this.mName = str;
        this.zzaDs = Collections.unmodifiableList(list);
        this.zzaHN = com_google_android_gms_internal_zzrc;
    }

    private boolean zzb(DataTypeCreateRequest dataTypeCreateRequest) {
        return zzz.equal(this.mName, dataTypeCreateRequest.mName) && zzz.equal(this.zzaDs, dataTypeCreateRequest.zzaDs);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof DataTypeCreateRequest) && zzb((DataTypeCreateRequest) obj));
    }

    public IBinder getCallbackBinder() {
        return this.zzaHN == null ? null : this.zzaHN.asBinder();
    }

    public List<Field> getFields() {
        return this.zzaDs;
    }

    public String getName() {
        return this.mName;
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public int hashCode() {
        return zzz.hashCode(this.mName, this.zzaDs);
    }

    public String toString() {
        return zzz.zzy(this).zzg("name", this.mName).zzg("fields", this.zzaDs).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzi.zza(this, parcel, i);
    }
}
