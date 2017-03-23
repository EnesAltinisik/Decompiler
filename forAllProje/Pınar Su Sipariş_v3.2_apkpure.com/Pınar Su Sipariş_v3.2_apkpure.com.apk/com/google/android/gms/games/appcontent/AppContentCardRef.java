package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;
import java.util.List;

public final class AppContentCardRef extends MultiDataBufferRef implements AppContentCard {
    AppContentCardRef(ArrayList<DataHolder> arrayList, int i) {
        super(arrayList, 0, i);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return AppContentCardEntity.zza(this, obj);
    }

    public /* synthetic */ Object freeze() {
        return zzzx();
    }

    public List<AppContentAction> getActions() {
        return AppContentUtils.zza(this.zzamz, this.zzaKL, "card_actions", this.zzapa);
    }

    public String getDescription() {
        return getString("card_description");
    }

    public Bundle getExtras() {
        return AppContentUtils.zzd(this.zzamz, this.zzaKL, "card_data", this.zzapa);
    }

    public String getId() {
        return getString("card_id");
    }

    public String getTitle() {
        return getString("card_title");
    }

    public String getType() {
        return getString("card_type");
    }

    public int hashCode() {
        return AppContentCardEntity.zza(this);
    }

    public String toString() {
        return AppContentCardEntity.zzb(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((AppContentCardEntity) ((AppContentCard) freeze())).writeToParcel(parcel, i);
    }

    public List<AppContentCondition> zzzi() {
        return AppContentUtils.zzc(this.zzamz, this.zzaKL, "card_conditions", this.zzapa);
    }

    public String zzzj() {
        return getString("card_content_description");
    }

    public List<AppContentAnnotation> zzzt() {
        return AppContentUtils.zzb(this.zzamz, this.zzaKL, "card_annotations", this.zzapa);
    }

    public int zzzu() {
        return getInteger("card_current_steps");
    }

    public String zzzv() {
        return getString("card_subtitle");
    }

    public int zzzw() {
        return getInteger("card_total_steps");
    }

    public AppContentCard zzzx() {
        return new AppContentCardEntity(this);
    }
}
