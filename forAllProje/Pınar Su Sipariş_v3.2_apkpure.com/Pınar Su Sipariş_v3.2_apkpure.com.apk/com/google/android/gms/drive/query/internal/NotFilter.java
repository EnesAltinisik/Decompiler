package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.drive.query.Filter;

public class NotFilter extends AbstractFilter {
    public static final Creator<NotFilter> CREATOR = new zzm();
    final int mVersionCode;
    final FilterHolder zzaAX;

    NotFilter(int i, FilterHolder filterHolder) {
        this.mVersionCode = i;
        this.zzaAX = filterHolder;
    }

    public NotFilter(Filter filter) {
        this(1, new FilterHolder(filter));
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzm.zza(this, parcel, i);
    }

    public <T> T zza(zzf<T> com_google_android_gms_drive_query_internal_zzf_T) {
        return com_google_android_gms_drive_query_internal_zzf_T.zzC(this.zzaAX.getFilter().zza(com_google_android_gms_drive_query_internal_zzf_T));
    }
}
