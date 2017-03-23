package com.google.android.gms.drive.query;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveSpace;
import com.google.android.gms.drive.query.internal.LogicalFilter;
import com.google.android.gms.drive.query.internal.MatchAllFilter;
import com.google.android.gms.drive.query.internal.Operator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public class Query extends AbstractSafeParcelable {
    public static final Creator<Query> CREATOR = new zza();
    final int mVersionCode;
    final boolean zzaAA;
    final LogicalFilter zzaAw;
    final String zzaAx;
    final SortOrder zzaAy;
    final List<String> zzaAz;
    final List<DriveSpace> zzawb;
    private final Set<DriveSpace> zzawc;
    final boolean zzaym;

    public static class Builder {
        private boolean zzaAA;
        private final List<Filter> zzaAB = new ArrayList();
        private String zzaAx;
        private SortOrder zzaAy;
        private List<String> zzaAz;
        private Set<DriveSpace> zzawc;
        private boolean zzaym;

        public Builder(Query query) {
            this.zzaAB.add(query.getFilter());
            this.zzaAx = query.getPageToken();
            this.zzaAy = query.getSortOrder();
            this.zzaAz = query.zzwS();
            this.zzaAA = query.zzwT();
            this.zzawc = query.zzwU();
            this.zzaym = query.zzwV();
        }

        public Builder addFilter(Filter filter) {
            if (!(filter instanceof MatchAllFilter)) {
                this.zzaAB.add(filter);
            }
            return this;
        }

        public Query build() {
            return new Query(new LogicalFilter(Operator.zzaBd, this.zzaAB), this.zzaAx, this.zzaAy, this.zzaAz, this.zzaAA, this.zzawc, this.zzaym);
        }

        @Deprecated
        public Builder setPageToken(String str) {
            this.zzaAx = str;
            return this;
        }

        public Builder setSortOrder(SortOrder sortOrder) {
            this.zzaAy = sortOrder;
            return this;
        }
    }

    private Query(int i, LogicalFilter logicalFilter, String str, SortOrder sortOrder, List<String> list, boolean z, List<DriveSpace> list2, Set<DriveSpace> set, boolean z2) {
        this.mVersionCode = i;
        this.zzaAw = logicalFilter;
        this.zzaAx = str;
        this.zzaAy = sortOrder;
        this.zzaAz = list;
        this.zzaAA = z;
        this.zzawb = list2;
        this.zzawc = set;
        this.zzaym = z2;
    }

    Query(int i, LogicalFilter logicalFilter, String str, SortOrder sortOrder, List<String> list, boolean z, List<DriveSpace> list2, boolean z2) {
        this(i, logicalFilter, str, sortOrder, list, z, list2, list2 == null ? null : new HashSet(list2), z2);
    }

    private Query(LogicalFilter logicalFilter, String str, SortOrder sortOrder, List<String> list, boolean z, Set<DriveSpace> set, boolean z2) {
        this(1, logicalFilter, str, sortOrder, list, z, set == null ? null : new ArrayList(set), set, z2);
    }

    public Filter getFilter() {
        return this.zzaAw;
    }

    @Deprecated
    public String getPageToken() {
        return this.zzaAx;
    }

    public SortOrder getSortOrder() {
        return this.zzaAy;
    }

    public String toString() {
        return String.format(Locale.US, "Query[%s,%s,PageToken=%s,Spaces=%s]", new Object[]{this.zzaAw, this.zzaAy, this.zzaAx, this.zzawb});
    }

    public void writeToParcel(Parcel parcel, int i) {
        zza.zza(this, parcel, i);
    }

    public List<String> zzwS() {
        return this.zzaAz;
    }

    public boolean zzwT() {
        return this.zzaAA;
    }

    public Set<DriveSpace> zzwU() {
        return this.zzawc;
    }

    public boolean zzwV() {
        return this.zzaym;
    }
}
