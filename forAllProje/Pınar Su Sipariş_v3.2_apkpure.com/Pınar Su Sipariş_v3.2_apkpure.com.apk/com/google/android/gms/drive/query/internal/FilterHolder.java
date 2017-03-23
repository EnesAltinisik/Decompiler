package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.drive.query.Filter;

public class FilterHolder extends AbstractSafeParcelable {
    public static final Creator<FilterHolder> CREATOR = new zzd();
    final int mVersionCode;
    final ComparisonFilter<?> zzaAL;
    final FieldOnlyFilter zzaAM;
    final LogicalFilter zzaAN;
    final NotFilter zzaAO;
    final InFilter<?> zzaAP;
    final MatchAllFilter zzaAQ;
    final HasFilter zzaAR;
    final FullTextSearchFilter zzaAS;
    final OwnedByMeFilter zzaAT;
    private final Filter zzavI;

    FilterHolder(int i, ComparisonFilter<?> comparisonFilter, FieldOnlyFilter fieldOnlyFilter, LogicalFilter logicalFilter, NotFilter notFilter, InFilter<?> inFilter, MatchAllFilter matchAllFilter, HasFilter<?> hasFilter, FullTextSearchFilter fullTextSearchFilter, OwnedByMeFilter ownedByMeFilter) {
        this.mVersionCode = i;
        this.zzaAL = comparisonFilter;
        this.zzaAM = fieldOnlyFilter;
        this.zzaAN = logicalFilter;
        this.zzaAO = notFilter;
        this.zzaAP = inFilter;
        this.zzaAQ = matchAllFilter;
        this.zzaAR = hasFilter;
        this.zzaAS = fullTextSearchFilter;
        this.zzaAT = ownedByMeFilter;
        if (this.zzaAL != null) {
            this.zzavI = this.zzaAL;
        } else if (this.zzaAM != null) {
            this.zzavI = this.zzaAM;
        } else if (this.zzaAN != null) {
            this.zzavI = this.zzaAN;
        } else if (this.zzaAO != null) {
            this.zzavI = this.zzaAO;
        } else if (this.zzaAP != null) {
            this.zzavI = this.zzaAP;
        } else if (this.zzaAQ != null) {
            this.zzavI = this.zzaAQ;
        } else if (this.zzaAR != null) {
            this.zzavI = this.zzaAR;
        } else if (this.zzaAS != null) {
            this.zzavI = this.zzaAS;
        } else if (this.zzaAT != null) {
            this.zzavI = this.zzaAT;
        } else {
            throw new IllegalArgumentException("At least one filter must be set.");
        }
    }

    public FilterHolder(Filter filter) {
        zzaa.zzb((Object) filter, (Object) "Null filter.");
        this.mVersionCode = 2;
        this.zzaAL = filter instanceof ComparisonFilter ? (ComparisonFilter) filter : null;
        this.zzaAM = filter instanceof FieldOnlyFilter ? (FieldOnlyFilter) filter : null;
        this.zzaAN = filter instanceof LogicalFilter ? (LogicalFilter) filter : null;
        this.zzaAO = filter instanceof NotFilter ? (NotFilter) filter : null;
        this.zzaAP = filter instanceof InFilter ? (InFilter) filter : null;
        this.zzaAQ = filter instanceof MatchAllFilter ? (MatchAllFilter) filter : null;
        this.zzaAR = filter instanceof HasFilter ? (HasFilter) filter : null;
        this.zzaAS = filter instanceof FullTextSearchFilter ? (FullTextSearchFilter) filter : null;
        this.zzaAT = filter instanceof OwnedByMeFilter ? (OwnedByMeFilter) filter : null;
        if (this.zzaAL == null && this.zzaAM == null && this.zzaAN == null && this.zzaAO == null && this.zzaAP == null && this.zzaAQ == null && this.zzaAR == null && this.zzaAS == null && this.zzaAT == null) {
            throw new IllegalArgumentException("Invalid filter type.");
        }
        this.zzavI = filter;
    }

    public Filter getFilter() {
        return this.zzavI;
    }

    public String toString() {
        return String.format("FilterHolder[%s]", new Object[]{this.zzavI});
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzd.zza(this, parcel, i);
    }
}
