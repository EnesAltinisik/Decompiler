package com.google.android.gms.location.places.internal;

import android.text.style.CharacterStyle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.AutocompletePrediction;
import com.google.android.gms.location.places.internal.AutocompletePredictionEntity.SubstringEntity;
import java.util.Collections;
import java.util.List;

public class zzb extends zzt implements AutocompletePrediction {
    public zzb(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    private String zzCQ() {
        return zzM("ap_description", "");
    }

    private String zzCR() {
        return zzM("ap_primary_text", "");
    }

    private String zzCS() {
        return zzM("ap_secondary_text", "");
    }

    private List<SubstringEntity> zzCT() {
        return zza("ap_matched_subscriptions", SubstringEntity.CREATOR, Collections.emptyList());
    }

    private List<SubstringEntity> zzCU() {
        return zza("ap_primary_text_matched", SubstringEntity.CREATOR, Collections.emptyList());
    }

    private List<SubstringEntity> zzCV() {
        return zza("ap_secondary_text_matched", SubstringEntity.CREATOR, Collections.emptyList());
    }

    public /* synthetic */ Object freeze() {
        return zzCO();
    }

    public CharSequence getFullText(CharacterStyle characterStyle) {
        return zzc.zza(zzCQ(), zzCT(), characterStyle);
    }

    public String getPlaceId() {
        return zzM("ap_place_id", null);
    }

    public List<Integer> getPlaceTypes() {
        return zza("ap_place_types", Collections.emptyList());
    }

    public CharSequence getPrimaryText(CharacterStyle characterStyle) {
        return zzc.zza(zzCR(), zzCU(), characterStyle);
    }

    public CharSequence getSecondaryText(CharacterStyle characterStyle) {
        return zzc.zza(zzCS(), zzCV(), characterStyle);
    }

    public AutocompletePrediction zzCO() {
        return AutocompletePredictionEntity.zza(getPlaceId(), getPlaceTypes(), zzCP(), zzCQ(), zzCT(), zzCR(), zzCU(), zzCS(), zzCV());
    }

    public int zzCP() {
        return zzx("ap_personalization_type", 6);
    }
}
