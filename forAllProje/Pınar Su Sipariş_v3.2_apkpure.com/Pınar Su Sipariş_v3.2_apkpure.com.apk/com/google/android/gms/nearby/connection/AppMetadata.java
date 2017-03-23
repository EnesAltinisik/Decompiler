package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import java.util.List;

public final class AppMetadata extends AbstractSafeParcelable {
    public static final Creator<AppMetadata> CREATOR = new zzc();
    private final int mVersionCode;
    private final List<AppIdentifier> zzbhU;

    AppMetadata(int i, List<AppIdentifier> list) {
        this.mVersionCode = i;
        this.zzbhU = (List) zzaa.zzb((Object) list, (Object) "Must specify application identifiers");
        zzaa.zza(list.size(), (Object) "Application identifiers cannot be empty");
    }

    public AppMetadata(List<AppIdentifier> list) {
        this(1, list);
    }

    public List<AppIdentifier> getAppIdentifiers() {
        return this.zzbhU;
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzc.zza(this, parcel, i);
    }
}
