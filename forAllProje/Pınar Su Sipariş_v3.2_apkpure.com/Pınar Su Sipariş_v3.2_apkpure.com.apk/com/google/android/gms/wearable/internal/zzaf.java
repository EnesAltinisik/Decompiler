package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataItemAsset;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class zzaf extends zzc implements DataItem {
    private final int zzaKH;

    public zzaf(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.zzaKH = i2;
    }

    public /* synthetic */ Object freeze() {
        return zzNH();
    }

    public Map<String, DataItemAsset> getAssets() {
        Map<String, DataItemAsset> hashMap = new HashMap(this.zzaKH);
        for (int i = 0; i < this.zzaKH; i++) {
            zzac com_google_android_gms_wearable_internal_zzac = new zzac(this.zzamz, this.zzapa + i);
            if (com_google_android_gms_wearable_internal_zzac.getDataItemKey() != null) {
                hashMap.put(com_google_android_gms_wearable_internal_zzac.getDataItemKey(), com_google_android_gms_wearable_internal_zzac);
            }
        }
        return hashMap;
    }

    public byte[] getData() {
        return getByteArray("data");
    }

    public Uri getUri() {
        return Uri.parse(getString("path"));
    }

    public DataItem setData(byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return toString(Log.isLoggable("DataItem", 3));
    }

    public String toString(boolean z) {
        byte[] data = getData();
        Map assets = getAssets();
        StringBuilder stringBuilder = new StringBuilder("DataItemInternal{ ");
        String valueOf = String.valueOf(getUri());
        stringBuilder.append(new StringBuilder(String.valueOf(valueOf).length() + 4).append("uri=").append(valueOf).toString());
        String valueOf2 = String.valueOf(data == null ? "null" : Integer.valueOf(data.length));
        stringBuilder.append(new StringBuilder(String.valueOf(valueOf2).length() + 9).append(", dataSz=").append(valueOf2).toString());
        stringBuilder.append(", numAssets=" + assets.size());
        if (z && !assets.isEmpty()) {
            stringBuilder.append(", assets=[");
            valueOf = "";
            for (Entry entry : assets.entrySet()) {
                String str = (String) entry.getKey();
                valueOf2 = String.valueOf(((DataItemAsset) entry.getValue()).getId());
                stringBuilder.append(new StringBuilder(((String.valueOf(valueOf).length() + 2) + String.valueOf(str).length()) + String.valueOf(valueOf2).length()).append(valueOf).append(str).append(": ").append(valueOf2).toString());
                valueOf = ", ";
            }
            stringBuilder.append("]");
        }
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }

    public DataItem zzNH() {
        return new zzad(this);
    }
}
