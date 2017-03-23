package com.google.android.gms.wearable;

import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class PutDataRequest extends AbstractSafeParcelable {
    public static final Creator<PutDataRequest> CREATOR = new zzh();
    public static final String WEAR_URI_SCHEME = "wear";
    private static final long zzbBL = TimeUnit.MINUTES.toMillis(30);
    private static final Random zzbBM = new SecureRandom();
    private final Uri mUri;
    final int mVersionCode;
    private byte[] zzaRo;
    private final Bundle zzbBN;
    private long zzbBO;

    private PutDataRequest(int i, Uri uri) {
        this(i, uri, new Bundle(), null, zzbBL);
    }

    PutDataRequest(int i, Uri uri, Bundle bundle, byte[] bArr, long j) {
        this.mVersionCode = i;
        this.mUri = uri;
        this.zzbBN = bundle;
        this.zzbBN.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
        this.zzaRo = bArr;
        this.zzbBO = j;
    }

    public static PutDataRequest create(String str) {
        return zzu(zzhD(str));
    }

    public static PutDataRequest createFromDataItem(DataItem dataItem) {
        PutDataRequest zzu = zzu(dataItem.getUri());
        for (Entry entry : dataItem.getAssets().entrySet()) {
            if (((DataItemAsset) entry.getValue()).getId() == null) {
                String str = "Cannot create an asset for a put request without a digest: ";
                String valueOf = String.valueOf((String) entry.getKey());
                throw new IllegalStateException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
            zzu.putAsset((String) entry.getKey(), Asset.createFromRef(((DataItemAsset) entry.getValue()).getId()));
        }
        zzu.setData(dataItem.getData());
        return zzu;
    }

    public static PutDataRequest createWithAutoAppendedId(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        if (!str.endsWith("/")) {
            stringBuilder.append("/");
        }
        stringBuilder.append("PN").append(zzbBM.nextLong());
        return new PutDataRequest(2, zzhD(stringBuilder.toString()));
    }

    private static Uri zzhD(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("An empty path was supplied.");
        } else if (!str.startsWith("/")) {
            throw new IllegalArgumentException("A path must start with a single / .");
        } else if (!str.startsWith("//")) {
            return new Builder().scheme(WEAR_URI_SCHEME).path(str).build();
        } else {
            throw new IllegalArgumentException("A path must start with a single / .");
        }
    }

    public static PutDataRequest zzu(Uri uri) {
        return new PutDataRequest(2, uri);
    }

    public Asset getAsset(String str) {
        return (Asset) this.zzbBN.getParcelable(str);
    }

    public Map<String, Asset> getAssets() {
        Map hashMap = new HashMap();
        for (String str : this.zzbBN.keySet()) {
            hashMap.put(str, (Asset) this.zzbBN.getParcelable(str));
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public byte[] getData() {
        return this.zzaRo;
    }

    public Uri getUri() {
        return this.mUri;
    }

    public boolean hasAsset(String str) {
        return this.zzbBN.containsKey(str);
    }

    public boolean isUrgent() {
        return this.zzbBO == 0;
    }

    public PutDataRequest putAsset(String str, Asset asset) {
        zzaa.zzz(str);
        zzaa.zzz(asset);
        this.zzbBN.putParcelable(str, asset);
        return this;
    }

    public PutDataRequest removeAsset(String str) {
        this.zzbBN.remove(str);
        return this;
    }

    public PutDataRequest setData(byte[] bArr) {
        this.zzaRo = bArr;
        return this;
    }

    public PutDataRequest setUrgent() {
        this.zzbBO = 0;
        return this;
    }

    public String toString() {
        return toString(Log.isLoggable(DataMap.TAG, 3));
    }

    public String toString(boolean z) {
        StringBuilder stringBuilder = new StringBuilder("PutDataRequest[");
        String valueOf = String.valueOf(this.zzaRo == null ? "null" : Integer.valueOf(this.zzaRo.length));
        stringBuilder.append(new StringBuilder(String.valueOf(valueOf).length() + 7).append("dataSz=").append(valueOf).toString());
        stringBuilder.append(", numAssets=" + this.zzbBN.size());
        valueOf = String.valueOf(this.mUri);
        stringBuilder.append(new StringBuilder(String.valueOf(valueOf).length() + 6).append(", uri=").append(valueOf).toString());
        stringBuilder.append(", syncDeadline=" + this.zzbBO);
        if (z) {
            stringBuilder.append("]\n  assets: ");
            for (String valueOf2 : this.zzbBN.keySet()) {
                String valueOf3 = String.valueOf(this.zzbBN.getParcelable(valueOf2));
                stringBuilder.append(new StringBuilder((String.valueOf(valueOf2).length() + 7) + String.valueOf(valueOf3).length()).append("\n    ").append(valueOf2).append(": ").append(valueOf3).toString());
            }
            stringBuilder.append("\n  ]");
            return stringBuilder.toString();
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzh.zza(this, parcel, i);
    }

    public Bundle zzNq() {
        return this.zzbBN;
    }

    public long zzNr() {
        return this.zzbBO;
    }
}
