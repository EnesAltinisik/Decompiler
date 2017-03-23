package com.google.android.gms.wearable;

import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.zzacj;
import com.google.android.gms.internal.zzacj.zza;
import com.google.android.gms.internal.zzack;
import com.google.android.gms.internal.zzami;
import java.util.ArrayList;
import java.util.List;

public class DataMapItem {
    private final Uri mUri;
    private final DataMap zzbBJ;

    private DataMapItem(DataItem dataItem) {
        this.mUri = dataItem.getUri();
        this.zzbBJ = zza((DataItem) dataItem.freeze());
    }

    public static DataMapItem fromDataItem(DataItem dataItem) {
        if (dataItem != null) {
            return new DataMapItem(dataItem);
        }
        throw new IllegalStateException("provided dataItem is null");
    }

    private DataMap zza(DataItem dataItem) {
        Throwable e;
        if (dataItem.getData() == null && dataItem.getAssets().size() > 0) {
            throw new IllegalArgumentException("Cannot create DataMapItem from a DataItem  that wasn't made with DataMapItem.");
        } else if (dataItem.getData() == null) {
            return new DataMap();
        } else {
            try {
                List arrayList = new ArrayList();
                int size = dataItem.getAssets().size();
                for (int i = 0; i < size; i++) {
                    DataItemAsset dataItemAsset = (DataItemAsset) dataItem.getAssets().get(Integer.toString(i));
                    if (dataItemAsset == null) {
                        String valueOf = String.valueOf(dataItem);
                        throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 64).append("Cannot find DataItemAsset referenced in data at ").append(i).append(" for ").append(valueOf).toString());
                    }
                    arrayList.add(Asset.createFromRef(dataItemAsset.getId()));
                }
                return zzacj.zza(new zza(zzack.zzF(dataItem.getData()), arrayList));
            } catch (zzami e2) {
                e = e2;
            } catch (NullPointerException e3) {
                e = e3;
            }
        }
        valueOf = String.valueOf(dataItem.getUri());
        String valueOf2 = String.valueOf(Base64.encodeToString(dataItem.getData(), 0));
        Log.w("DataItem", new StringBuilder((String.valueOf(valueOf).length() + 50) + String.valueOf(valueOf2).length()).append("Unable to parse datamap from dataItem. uri=").append(valueOf).append(", data=").append(valueOf2).toString());
        valueOf2 = String.valueOf(dataItem.getUri());
        throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf2).length() + 44).append("Unable to parse datamap from dataItem.  uri=").append(valueOf2).toString(), e);
    }

    public DataMap getDataMap() {
        return this.zzbBJ;
    }

    public Uri getUri() {
        return this.mUri;
    }
}
