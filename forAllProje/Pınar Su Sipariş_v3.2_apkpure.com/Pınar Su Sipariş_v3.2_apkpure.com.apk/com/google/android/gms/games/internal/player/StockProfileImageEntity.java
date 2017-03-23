package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;

public final class StockProfileImageEntity extends AbstractSafeParcelable implements StockProfileImage {
    public static final StockProfileImageEntityCreator CREATOR = new StockProfileImageEntityCreator();
    private final int mVersionCode;
    private final Uri zzaKr;
    private final String zzaPY;

    StockProfileImageEntity(int i, String str, Uri uri) {
        this.mVersionCode = i;
        this.zzaPY = str;
        this.zzaKr = uri;
    }

    public StockProfileImageEntity(StockProfileImage stockProfileImage) {
        this(1, stockProfileImage.getImageUrl(), stockProfileImage.zzzo());
    }

    public StockProfileImageEntity(String str, Uri uri) {
        this(1, str, uri);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof StockProfileImage)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        StockProfileImage stockProfileImage = (StockProfileImage) obj;
        return zzz.equal(this.zzaPY, stockProfileImage.getImageUrl()) && zzz.equal(this.zzaKr, stockProfileImage.zzzo());
    }

    public /* synthetic */ Object freeze() {
        return zzBi();
    }

    public String getImageUrl() {
        return this.zzaPY;
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public int hashCode() {
        return zzz.hashCode(this.zzaPY, this.zzaKr);
    }

    public boolean isDataValid() {
        return true;
    }

    public String toString() {
        return zzz.zzy(this).zzg("ImageId", this.zzaPY).zzg("ImageUri", this.zzaKr).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        StockProfileImageEntityCreator.zza(this, parcel, i);
    }

    public StockProfileImage zzBi() {
        return this;
    }

    public Uri zzzo() {
        return this.zzaKr;
    }
}
