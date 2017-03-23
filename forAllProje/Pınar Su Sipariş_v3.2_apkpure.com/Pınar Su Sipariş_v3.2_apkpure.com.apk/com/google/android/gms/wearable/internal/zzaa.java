package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.DataItemAsset;

public class zzaa implements DataItemAsset {
    private final String zzBc;
    private final String zzwQ;

    public zzaa(DataItemAsset dataItemAsset) {
        this.zzBc = dataItemAsset.getId();
        this.zzwQ = dataItemAsset.getDataItemKey();
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
        stringBuilder.append("DataItemAssetEntity[");
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

    public DataItemAsset zzNG() {
        return this;
    }
}
