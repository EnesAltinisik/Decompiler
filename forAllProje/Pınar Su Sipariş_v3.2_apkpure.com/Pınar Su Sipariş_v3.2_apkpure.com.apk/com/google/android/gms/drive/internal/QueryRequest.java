package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.query.Query;

public class QueryRequest extends AbstractSafeParcelable {
    public static final Creator<QueryRequest> CREATOR = new zzbl();
    final int mVersionCode;
    final Query zzayW;

    QueryRequest(int i, Query query) {
        this.mVersionCode = i;
        this.zzayW = query;
    }

    public QueryRequest(Query query) {
        this(1, query);
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzbl.zza(this, parcel, i);
    }
}
