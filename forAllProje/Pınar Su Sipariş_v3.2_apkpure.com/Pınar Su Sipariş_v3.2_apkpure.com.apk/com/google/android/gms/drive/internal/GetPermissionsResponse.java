package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.Permission;
import java.util.List;

public class GetPermissionsResponse extends AbstractSafeParcelable {
    public static final Creator<GetPermissionsResponse> CREATOR = new zzal();
    final int mVersionCode;
    final int zzCj;
    final List<Permission> zzayp;

    GetPermissionsResponse(int i, List<Permission> list, int i2) {
        this.mVersionCode = i;
        this.zzayp = list;
        this.zzCj = i2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzal.zza(this, parcel, i);
    }
}
