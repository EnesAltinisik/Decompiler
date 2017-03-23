package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.drive.query.Filter;
import java.util.ArrayList;
import java.util.List;

public class LogicalFilter extends AbstractFilter {
    public static final Creator<LogicalFilter> CREATOR = new zzk();
    final int mVersionCode;
    private List<Filter> zzaAB;
    final Operator zzaAH;
    final List<FilterHolder> zzaAW;

    LogicalFilter(int i, Operator operator, List<FilterHolder> list) {
        this.mVersionCode = i;
        this.zzaAH = operator;
        this.zzaAW = list;
    }

    public LogicalFilter(Operator operator, Filter filter, Filter... filterArr) {
        this.mVersionCode = 1;
        this.zzaAH = operator;
        this.zzaAW = new ArrayList(filterArr.length + 1);
        this.zzaAW.add(new FilterHolder(filter));
        this.zzaAB = new ArrayList(filterArr.length + 1);
        this.zzaAB.add(filter);
        for (Filter filter2 : filterArr) {
            this.zzaAW.add(new FilterHolder(filter2));
            this.zzaAB.add(filter2);
        }
    }

    public LogicalFilter(Operator operator, Iterable<Filter> iterable) {
        this.mVersionCode = 1;
        this.zzaAH = operator;
        this.zzaAB = new ArrayList();
        this.zzaAW = new ArrayList();
        for (Filter filter : iterable) {
            this.zzaAB.add(filter);
            this.zzaAW.add(new FilterHolder(filter));
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzk.zza(this, parcel, i);
    }

    public <T> T zza(zzf<T> com_google_android_gms_drive_query_internal_zzf_T) {
        List arrayList = new ArrayList();
        for (FilterHolder filter : this.zzaAW) {
            arrayList.add(filter.getFilter().zza(com_google_android_gms_drive_query_internal_zzf_T));
        }
        return com_google_android_gms_drive_query_internal_zzf_T.zzb(this.zzaAH, arrayList);
    }
}
