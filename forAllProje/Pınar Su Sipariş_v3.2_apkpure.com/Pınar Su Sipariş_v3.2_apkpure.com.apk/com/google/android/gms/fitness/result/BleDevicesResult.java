package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BleDevicesResult extends AbstractSafeParcelable implements Result {
    public static final Creator<BleDevicesResult> CREATOR = new zza();
    private final int mVersionCode;
    private final List<BleDevice> zzaIr;
    private final Status zzaaO;

    BleDevicesResult(int i, List<BleDevice> list, Status status) {
        this.mVersionCode = i;
        this.zzaIr = Collections.unmodifiableList(list);
        this.zzaaO = status;
    }

    public BleDevicesResult(List<BleDevice> list, Status status) {
        this.mVersionCode = 3;
        this.zzaIr = Collections.unmodifiableList(list);
        this.zzaaO = status;
    }

    public static BleDevicesResult zzU(Status status) {
        return new BleDevicesResult(Collections.emptyList(), status);
    }

    private boolean zzb(BleDevicesResult bleDevicesResult) {
        return this.zzaaO.equals(bleDevicesResult.zzaaO) && zzz.equal(this.zzaIr, bleDevicesResult.zzaIr);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof BleDevicesResult) && zzb((BleDevicesResult) obj));
    }

    public List<BleDevice> getClaimedBleDevices() {
        return this.zzaIr;
    }

    public List<BleDevice> getClaimedBleDevices(DataType dataType) {
        List arrayList = new ArrayList();
        for (BleDevice bleDevice : this.zzaIr) {
            if (bleDevice.getDataTypes().contains(dataType)) {
                arrayList.add(bleDevice);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Status getStatus() {
        return this.zzaaO;
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public int hashCode() {
        return zzz.hashCode(this.zzaaO, this.zzaIr);
    }

    public String toString() {
        return zzz.zzy(this).zzg("status", this.zzaaO).zzg("bleDevices", this.zzaIr).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zza.zza(this, parcel, i);
    }
}
