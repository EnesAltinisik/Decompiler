package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.internal.zzqk;
import java.util.Collections;
import java.util.List;

public class BleDevice extends AbstractSafeParcelable {
    public static final Creator<BleDevice> CREATOR = new zzb();
    private final String mName;
    private final int mVersionCode;
    private final String zzaCQ;
    private final List<String> zzaCR;
    private final List<DataType> zzaCS;

    BleDevice(int i, String str, String str2, List<String> list, List<DataType> list2) {
        this.mVersionCode = i;
        this.zzaCQ = str;
        this.mName = str2;
        this.zzaCR = Collections.unmodifiableList(list);
        this.zzaCS = Collections.unmodifiableList(list2);
    }

    private boolean zza(BleDevice bleDevice) {
        return this.mName.equals(bleDevice.mName) && this.zzaCQ.equals(bleDevice.zzaCQ) && zzqk.zza(bleDevice.zzaCR, this.zzaCR) && zzqk.zza(this.zzaCS, bleDevice.zzaCS);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof BleDevice) && zza((BleDevice) obj));
    }

    public String getAddress() {
        return this.zzaCQ;
    }

    public List<DataType> getDataTypes() {
        return this.zzaCS;
    }

    public String getName() {
        return this.mName;
    }

    public List<String> getSupportedProfiles() {
        return this.zzaCR;
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public int hashCode() {
        return zzz.hashCode(this.mName, this.zzaCQ, this.zzaCR, this.zzaCS);
    }

    public String toString() {
        return zzz.zzy(this).zzg("name", this.mName).zzg("address", this.zzaCQ).zzg("dataTypes", this.zzaCS).zzg("supportedProfiles", this.zzaCR).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzb.zza(this, parcel, i);
    }
}
