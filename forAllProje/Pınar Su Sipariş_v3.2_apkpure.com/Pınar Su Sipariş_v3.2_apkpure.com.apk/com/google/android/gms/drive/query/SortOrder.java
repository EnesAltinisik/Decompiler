package com.google.android.gms.drive.query;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.metadata.SortableMetadataField;
import com.google.android.gms.drive.query.internal.FieldWithSortOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class SortOrder extends AbstractSafeParcelable {
    public static final Creator<SortOrder> CREATOR = new zzb();
    final int mVersionCode;
    final List<FieldWithSortOrder> zzaAE;
    final boolean zzaAF;

    public static class Builder {
        private final List<FieldWithSortOrder> zzaAE = new ArrayList();
        private boolean zzaAF = false;

        public Builder addSortAscending(SortableMetadataField sortableMetadataField) {
            this.zzaAE.add(new FieldWithSortOrder(sortableMetadataField.getName(), true));
            return this;
        }

        public Builder addSortDescending(SortableMetadataField sortableMetadataField) {
            this.zzaAE.add(new FieldWithSortOrder(sortableMetadataField.getName(), false));
            return this;
        }

        public SortOrder build() {
            return new SortOrder(this.zzaAE, false);
        }
    }

    SortOrder(int i, List<FieldWithSortOrder> list, boolean z) {
        this.mVersionCode = i;
        this.zzaAE = list;
        this.zzaAF = z;
    }

    private SortOrder(List<FieldWithSortOrder> list, boolean z) {
        this(1, (List) list, z);
    }

    public String toString() {
        return String.format(Locale.US, "SortOrder[%s, %s]", new Object[]{TextUtils.join(",", this.zzaAE), Boolean.valueOf(this.zzaAF)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzb.zza(this, parcel, i);
    }
}
