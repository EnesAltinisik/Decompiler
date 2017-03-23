package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataItemAsset;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DataItemParcelable extends AbstractSafeParcelable implements DataItem {
    public static final Creator<DataItemParcelable> CREATOR = new zzae();
    private final Uri mUri;
    final int mVersionCode;
    private byte[] zzaRo;
    private final Map<String, DataItemAsset> zzbDf;

    DataItemParcelable(int i, Uri uri, Bundle bundle, byte[] bArr) {
        this.mVersionCode = i;
        this.mUri = uri;
        Map hashMap = new HashMap();
        bundle.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
        for (String str : bundle.keySet()) {
            hashMap.put(str, (DataItemAssetParcelable) bundle.getParcelable(str));
        }
        this.zzbDf = hashMap;
        this.zzaRo = bArr;
    }

    public /* synthetic */ Object freeze() {
        return zzNI();
    }

    public Map<String, DataItemAsset> getAssets() {
        return this.zzbDf;
    }

    public byte[] getData() {
        return this.zzaRo;
    }

    public Uri getUri() {
        return this.mUri;
    }

    public boolean isDataValid() {
        return true;
    }

    public /* synthetic */ DataItem setData(byte[] bArr) {
        return zzE(bArr);
    }

    public String toString() {
        return toString(Log.isLoggable("DataItem", 3));
    }

    public String toString(boolean z) {
        StringBuilder stringBuilder = new StringBuilder("DataItemParcelable[");
        stringBuilder.append("@");
        stringBuilder.append(Integer.toHexString(hashCode()));
        String valueOf = String.valueOf(this.zzaRo == null ? "null" : Integer.valueOf(this.zzaRo.length));
        stringBuilder.append(new StringBuilder(String.valueOf(valueOf).length() + 8).append(",dataSz=").append(valueOf).toString());
        stringBuilder.append(", numAssets=" + this.zzbDf.size());
        valueOf = String.valueOf(this.mUri);
        stringBuilder.append(new StringBuilder(String.valueOf(valueOf).length() + 6).append(", uri=").append(valueOf).toString());
        if (z) {
            stringBuilder.append("]\n  assets: ");
            for (String valueOf2 : this.zzbDf.keySet()) {
                String valueOf3 = String.valueOf(this.zzbDf.get(valueOf2));
                stringBuilder.append(new StringBuilder((String.valueOf(valueOf2).length() + 7) + String.valueOf(valueOf3).length()).append("\n    ").append(valueOf2).append(": ").append(valueOf3).toString());
            }
            stringBuilder.append("\n  ]");
            return stringBuilder.toString();
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzae.zza(this, parcel, i);
    }

    public DataItemParcelable zzE(byte[] bArr) {
        this.zzaRo = bArr;
        return this;
    }

    public DataItemParcelable zzNI() {
        return this;
    }

    public Bundle zzNq() {
        Bundle bundle = new Bundle();
        bundle.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
        for (Entry entry : this.zzbDf.entrySet()) {
            bundle.putParcelable((String) entry.getKey(), new DataItemAssetParcelable((DataItemAsset) entry.getValue()));
        }
        return bundle;
    }
}
