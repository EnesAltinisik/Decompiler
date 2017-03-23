package com.google.android.gms.wearable;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.internal.zzacj;
import com.google.android.gms.internal.zzacj.zza;
import com.google.android.gms.internal.zzamj;

public class PutDataMapRequest {
    private final DataMap zzbBJ = new DataMap();
    private final PutDataRequest zzbBK;

    private PutDataMapRequest(PutDataRequest putDataRequest, DataMap dataMap) {
        this.zzbBK = putDataRequest;
        if (dataMap != null) {
            this.zzbBJ.putAll(dataMap);
        }
    }

    public static PutDataMapRequest create(String str) {
        return new PutDataMapRequest(PutDataRequest.create(str), null);
    }

    public static PutDataMapRequest createFromDataMapItem(DataMapItem dataMapItem) {
        return new PutDataMapRequest(PutDataRequest.zzu(dataMapItem.getUri()), dataMapItem.getDataMap());
    }

    public static PutDataMapRequest createWithAutoAppendedId(String str) {
        return new PutDataMapRequest(PutDataRequest.createWithAutoAppendedId(str), null);
    }

    public PutDataRequest asPutDataRequest() {
        zza zza = zzacj.zza(this.zzbBJ);
        this.zzbBK.setData(zzamj.toByteArray(zza.zzbEe));
        int size = zza.zzbEf.size();
        int i = 0;
        while (i < size) {
            String num = Integer.toString(i);
            Asset asset = (Asset) zza.zzbEf.get(i);
            String valueOf;
            if (num == null) {
                valueOf = String.valueOf(asset);
                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 26).append("asset key cannot be null: ").append(valueOf).toString());
            } else if (asset == null) {
                String str = "asset cannot be null: key=";
                valueOf = String.valueOf(num);
                throw new IllegalStateException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            } else {
                if (Log.isLoggable(DataMap.TAG, 3)) {
                    String str2 = DataMap.TAG;
                    String valueOf2 = String.valueOf(asset);
                    Log.d(str2, new StringBuilder((String.valueOf(num).length() + 33) + String.valueOf(valueOf2).length()).append("asPutDataRequest: adding asset: ").append(num).append(" ").append(valueOf2).toString());
                }
                this.zzbBK.putAsset(num, asset);
                i++;
            }
        }
        return this.zzbBK;
    }

    public DataMap getDataMap() {
        return this.zzbBJ;
    }

    public Uri getUri() {
        return this.zzbBK.getUri();
    }

    public boolean isUrgent() {
        return this.zzbBK.isUrgent();
    }

    public PutDataMapRequest setUrgent() {
        this.zzbBK.setUrgent();
        return this;
    }
}
