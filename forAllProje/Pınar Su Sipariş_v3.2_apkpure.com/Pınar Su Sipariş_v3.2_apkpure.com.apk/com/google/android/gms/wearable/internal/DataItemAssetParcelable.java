package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.wearable.DataItemAsset;

@KeepName
public class DataItemAssetParcelable extends AbstractSafeParcelable implements DataItemAsset {
    public static final Creator<DataItemAssetParcelable> CREATOR = new zzab();
    final int mVersionCode;
    private final String zzBc;
    private final String zzwQ;

    DataItemAssetParcelable(int i, String str, String str2) {
        this.mVersionCode = i;
        this.zzBc = str;
        this.zzwQ = str2;
    }

    public DataItemAssetParcelable(DataItemAsset dataItemAsset) {
        this.mVersionCode = 1;
        this.zzBc = (String) zzaa.zzz(dataItemAsset.getId());
        this.zzwQ = (String) zzaa.zzz(dataItemAsset.getDataItemKey());
    }

    public /* synthetic */ Object freeze() {
        return zzNG();
    }

    public String getDataItemKey() {
        return this.zzwQ;
    }

    public String getId() {
        return this.zzBc;
    }

    public boolean isDataValid() {
        return true;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DataItemAssetParcelable[");
        stringBuilder.append("@");
        stringBuilder.append(Integer.toHexString(hashCode()));
        if (this.zzBc == null) {
            stringBuilder.append(",noid");
        } else {
            stringBuilder.append(",");
            stringBuilder.append(this.zzBc);
        }
        stringBuilder.append(", key=");
        stringBuilder.append(this.zzwQ);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzab.zza(this, parcel, i);
    }

    public DataItemAsset zzNG() {
        return this;
    }
}
