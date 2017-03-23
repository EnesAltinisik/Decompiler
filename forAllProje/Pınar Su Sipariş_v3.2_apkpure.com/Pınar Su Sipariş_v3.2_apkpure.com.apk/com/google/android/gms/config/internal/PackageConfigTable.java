package com.google.android.gms.config.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class PackageConfigTable extends AbstractSafeParcelable {
    public static final zzi CREATOR = new zzi();
    private final int mVersionCode;
    private final Bundle zzauS;

    PackageConfigTable(int i, Bundle bundle) {
        this.mVersionCode = i;
        this.zzauS = bundle;
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzi.zza(this, parcel, i);
    }

    public Bundle zzvC() {
        return this.zzauS;
    }
}
