package com.google.android.gms.location.places.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.internal.PlaceEntity.zza;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class zzr extends zzt implements Place {
    private final String zzaWV = zzM("place_id", "");

    public zzr(DataHolder dataHolder, int i, Context context) {
        super(dataHolder, i);
    }

    private List<String> zzCZ() {
        return zzb("place_attributions", Collections.emptyList());
    }

    private PlaceEntity zzDj() {
        PlaceEntity zzDg = new zza().zzeP(getAddress().toString()).zzB(zzCZ()).zzeN(getId()).zzau(zzDa()).zza(getLatLng()).zzf(zzCX()).zzeO(getName().toString()).zzeQ(getPhoneNumber().toString()).zzix(getPriceLevel()).zzg(getRating()).zzA(getPlaceTypes()).zza(getViewport()).zzp(getWebsiteUri()).zzDg();
        zzDg.setLocale(getLocale());
        return zzDg;
    }

    public /* synthetic */ Object freeze() {
        return zzDf();
    }

    public CharSequence getAddress() {
        return zzM("place_address", "");
    }

    public CharSequence getAttributions() {
        return zzc.zzj(zzCZ());
    }

    public String getId() {
        return this.zzaWV;
    }

    public LatLng getLatLng() {
        return (LatLng) zza("place_lat_lng", LatLng.CREATOR);
    }

    public Locale getLocale() {
        Object zzM = zzM("place_locale_language", "");
        if (!TextUtils.isEmpty(zzM)) {
            return new Locale(zzM, zzM("place_locale_country", ""));
        }
        zzM = zzM("place_locale", "");
        return !TextUtils.isEmpty(zzM) ? new Locale(zzM) : Locale.getDefault();
    }

    public CharSequence getName() {
        return zzM("place_name", "");
    }

    public CharSequence getPhoneNumber() {
        return zzM("place_phone_number", "");
    }

    public List<Integer> getPlaceTypes() {
        return zza("place_types", Collections.emptyList());
    }

    public int getPriceLevel() {
        return zzx("place_price_level", -1);
    }

    public float getRating() {
        return zzb("place_rating", -1.0f);
    }

    public LatLngBounds getViewport() {
        return (LatLngBounds) zza("place_viewport", LatLngBounds.CREATOR);
    }

    public Uri getWebsiteUri() {
        String zzM = zzM("place_website_uri", null);
        return zzM == null ? null : Uri.parse(zzM);
    }

    public float zzCX() {
        return zzb("place_level_number", 0.0f);
    }

    public boolean zzDa() {
        return zzm("place_is_permanently_closed", false);
    }

    public Place zzDf() {
        return zzDj();
    }
}
