package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;
import java.util.List;

public final class AppContentSectionRef extends MultiDataBufferRef implements AppContentSection {
    private final int zzaKH;

    AppContentSectionRef(ArrayList<DataHolder> arrayList, int i, int i2) {
        super(arrayList, 0, i);
        this.zzaKH = i2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return AppContentSectionEntity.zza(this, obj);
    }

    public /* synthetic */ Object freeze() {
        return zzzF();
    }

    public /* synthetic */ List getActions() {
        return zzzG();
    }

    public Bundle getExtras() {
        return AppContentUtils.zzd(this.zzamz, this.zzaKL, "section_data", this.zzapa);
    }

    public String getId() {
        return getString("section_id");
    }

    public String getTitle() {
        return getString("section_title");
    }

    public String getType() {
        return getString("section_type");
    }

    public int hashCode() {
        return AppContentSectionEntity.zza(this);
    }

    public String toString() {
        return AppContentSectionEntity.zzb(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((AppContentSectionEntity) ((AppContentSection) freeze())).writeToParcel(parcel, i);
    }

    public /* synthetic */ List zzzD() {
        return zzzI();
    }

    public String zzzE() {
        return getString("section_card_type");
    }

    public AppContentSection zzzF() {
        return new AppContentSectionEntity(this);
    }

    public ArrayList<AppContentAction> zzzG() {
        return AppContentUtils.zza(this.zzamz, this.zzaKL, "section_actions", this.zzapa);
    }

    public ArrayList<AppContentAnnotation> zzzH() {
        return AppContentUtils.zzb(this.zzamz, this.zzaKL, "section_annotations", this.zzapa);
    }

    public ArrayList<AppContentCard> zzzI() {
        ArrayList<AppContentCard> arrayList = new ArrayList(this.zzaKH);
        for (int i = 0; i < this.zzaKH; i++) {
            arrayList.add(new AppContentCardRef(this.zzaKL, this.zzapa + i));
        }
        return arrayList;
    }

    public String zzzj() {
        return getString("section_content_description");
    }

    public /* synthetic */ List zzzt() {
        return zzzH();
    }

    public String zzzv() {
        return getString("section_subtitle");
    }
}
