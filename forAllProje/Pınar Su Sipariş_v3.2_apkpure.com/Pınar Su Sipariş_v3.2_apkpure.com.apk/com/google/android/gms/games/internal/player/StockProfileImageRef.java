package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;

public class StockProfileImageRef extends zzc implements StockProfileImage {
    public StockProfileImageRef(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    public int describeContents() {
        return 0;
    }

    public /* synthetic */ Object freeze() {
        return zzBi();
    }

    public String getImageUrl() {
        return getString("image_url");
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((StockProfileImageEntity) ((StockProfileImage) freeze())).writeToParcel(parcel, i);
    }

    public StockProfileImage zzBi() {
        return new StockProfileImageEntity(this);
    }

    public Uri zzzo() {
        return Uri.parse(getString("image_uri"));
    }
}
