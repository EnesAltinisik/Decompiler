package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;
import java.util.List;

public final class AppContentActionRef extends MultiDataBufferRef implements AppContentAction {
    AppContentActionRef(ArrayList<DataHolder> arrayList, int i) {
        super(arrayList, 1, i);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return AppContentActionEntity.zza(this, obj);
    }

    public /* synthetic */ Object freeze() {
        return zzzl();
    }

    public Bundle getExtras() {
        return AppContentUtils.zzd(this.zzamz, this.zzaKL, "action_data", this.zzapa);
    }

    public String getId() {
        return getString("action_id");
    }

    public String getType() {
        return getString("action_type");
    }

    public int hashCode() {
        return AppContentActionEntity.zza(this);
    }

    public String toString() {
        return AppContentActionEntity.zzb(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((AppContentActionEntity) ((AppContentAction) freeze())).writeToParcel(parcel, i);
    }

    public AppContentAnnotation zzzh() {
        List zzb = AppContentUtils.zzb(this.zzamz, this.zzaKL, "action_annotation", this.zzapa);
        return zzb.size() == 1 ? (AppContentAnnotation) zzb.get(0) : null;
    }

    public List<AppContentCondition> zzzi() {
        return AppContentUtils.zzc(this.zzamz, this.zzaKL, "action_conditions", this.zzapa);
    }

    public String zzzj() {
        return getString("action_content_description");
    }

    public String zzzk() {
        return getString("overflow_text");
    }

    public AppContentAction zzzl() {
        return new AppContentActionEntity(this);
    }
}
