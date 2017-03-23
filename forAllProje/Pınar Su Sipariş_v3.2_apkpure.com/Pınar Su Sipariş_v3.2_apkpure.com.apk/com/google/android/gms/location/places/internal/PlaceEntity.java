package com.google.android.gms.location.places.internal;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

public final class PlaceEntity implements SafeParcelable, Place {
    public static final zzl CREATOR = new zzl();
    private final String mName;
    final int mVersionCode;
    private final String zzBc;
    private final String zzaCQ;
    private final LatLng zzaWq;
    private final List<Integer> zzaWr;
    private final String zzaWs;
    private final Uri zzaWt;
    private Locale zzaXJ;
    private final Bundle zzaXN;
    @Deprecated
    private final PlaceLocalization zzaXO;
    private final float zzaXP;
    private final LatLngBounds zzaXQ;
    private final String zzaXR;
    private final boolean zzaXS;
    private final float zzaXT;
    private final int zzaXU;
    private final long zzaXV;
    private final List<Integer> zzaXW;
    private final String zzaXX;
    private final List<String> zzaXY;
    private final Map<Integer, String> zzaXZ;
    private final TimeZone zzaYa;

    public static class zza {
        private String mName;
        private int mVersionCode = 0;
        private String zzBc;
        private String zzaCQ;
        private LatLng zzaWq;
        private String zzaWs;
        private Uri zzaWt;
        private float zzaXP;
        private LatLngBounds zzaXQ;
        private boolean zzaXS;
        private float zzaXT;
        private int zzaXU;
        private List<String> zzaXY;
        private List<Integer> zzaYb;

        public zza zzA(List<Integer> list) {
            this.zzaYb = list;
            return this;
        }

        public zza zzB(List<String> list) {
            this.zzaXY = list;
            return this;
        }

        public PlaceEntity zzDg() {
            return new PlaceEntity(0, this.zzBc, this.zzaYb, Collections.emptyList(), null, this.mName, this.zzaCQ, this.zzaWs, null, this.zzaXY, this.zzaWq, this.zzaXP, this.zzaXQ, null, this.zzaWt, this.zzaXS, this.zzaXT, this.zzaXU, 0, PlaceLocalization.zza(this.mName, this.zzaCQ, this.zzaWs, null, this.zzaXY));
        }

        public zza zza(LatLng latLng) {
            this.zzaWq = latLng;
            return this;
        }

        public zza zza(LatLngBounds latLngBounds) {
            this.zzaXQ = latLngBounds;
            return this;
        }

        public zza zzau(boolean z) {
            this.zzaXS = z;
            return this;
        }

        public zza zzeN(String str) {
            this.zzBc = str;
            return this;
        }

        public zza zzeO(String str) {
            this.mName = str;
            return this;
        }

        public zza zzeP(String str) {
            this.zzaCQ = str;
            return this;
        }

        public zza zzeQ(String str) {
            this.zzaWs = str;
            return this;
        }

        public zza zzf(float f) {
            this.zzaXP = f;
            return this;
        }

        public zza zzg(float f) {
            this.zzaXT = f;
            return this;
        }

        public zza zzix(int i) {
            this.zzaXU = i;
            return this;
        }

        public zza zzp(Uri uri) {
            this.zzaWt = uri;
            return this;
        }
    }

    PlaceEntity(int i, String str, List<Integer> list, List<Integer> list2, Bundle bundle, String str2, String str3, String str4, String str5, List<String> list3, LatLng latLng, float f, LatLngBounds latLngBounds, String str6, Uri uri, boolean z, float f2, int i2, long j, PlaceLocalization placeLocalization) {
        List emptyList;
        this.mVersionCode = i;
        this.zzBc = str;
        this.zzaWr = Collections.unmodifiableList(list);
        this.zzaXW = list2;
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.zzaXN = bundle;
        this.mName = str2;
        this.zzaCQ = str3;
        this.zzaWs = str4;
        this.zzaXX = str5;
        if (list3 == null) {
            emptyList = Collections.emptyList();
        }
        this.zzaXY = emptyList;
        this.zzaWq = latLng;
        this.zzaXP = f;
        this.zzaXQ = latLngBounds;
        if (str6 == null) {
            str6 = "UTC";
        }
        this.zzaXR = str6;
        this.zzaWt = uri;
        this.zzaXS = z;
        this.zzaXT = f2;
        this.zzaXU = i2;
        this.zzaXV = j;
        this.zzaXZ = Collections.unmodifiableMap(new HashMap());
        this.zzaYa = null;
        this.zzaXJ = null;
        this.zzaXO = placeLocalization;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceEntity)) {
            return false;
        }
        PlaceEntity placeEntity = (PlaceEntity) obj;
        return this.zzBc.equals(placeEntity.zzBc) && zzz.equal(this.zzaXJ, placeEntity.zzaXJ) && this.zzaXV == placeEntity.zzaXV;
    }

    public /* synthetic */ Object freeze() {
        return zzDf();
    }

    public String getAddress() {
        return this.zzaCQ;
    }

    public CharSequence getAttributions() {
        return zzc.zzj(this.zzaXY);
    }

    public String getId() {
        return this.zzBc;
    }

    public LatLng getLatLng() {
        return this.zzaWq;
    }

    public Locale getLocale() {
        return this.zzaXJ;
    }

    public String getName() {
        return this.mName;
    }

    public String getPhoneNumber() {
        return this.zzaWs;
    }

    public List<Integer> getPlaceTypes() {
        return this.zzaWr;
    }

    public int getPriceLevel() {
        return this.zzaXU;
    }

    public float getRating() {
        return this.zzaXT;
    }

    public LatLngBounds getViewport() {
        return this.zzaXQ;
    }

    public Uri getWebsiteUri() {
        return this.zzaWt;
    }

    public int hashCode() {
        return zzz.hashCode(this.zzBc, this.zzaXJ, Long.valueOf(this.zzaXV));
    }

    public boolean isDataValid() {
        return true;
    }

    public void setLocale(Locale locale) {
        this.zzaXJ = locale;
    }

    @SuppressLint({"DefaultLocale"})
    public String toString() {
        return zzz.zzy(this).zzg("id", this.zzBc).zzg("placeTypes", this.zzaWr).zzg("locale", this.zzaXJ).zzg("name", this.mName).zzg("address", this.zzaCQ).zzg("phoneNumber", this.zzaWs).zzg("latlng", this.zzaWq).zzg("viewport", this.zzaXQ).zzg("websiteUri", this.zzaWt).zzg("isPermanentlyClosed", Boolean.valueOf(this.zzaXS)).zzg("priceLevel", Integer.valueOf(this.zzaXU)).zzg("timestampSecs", Long.valueOf(this.zzaXV)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzl.zza(this, parcel, i);
    }

    public List<Integer> zzCW() {
        return this.zzaXW;
    }

    public float zzCX() {
        return this.zzaXP;
    }

    public String zzCY() {
        return this.zzaXX;
    }

    public List<String> zzCZ() {
        return this.zzaXY;
    }

    public boolean zzDa() {
        return this.zzaXS;
    }

    public long zzDb() {
        return this.zzaXV;
    }

    public Bundle zzDc() {
        return this.zzaXN;
    }

    public String zzDd() {
        return this.zzaXR;
    }

    @Deprecated
    public PlaceLocalization zzDe() {
        return this.zzaXO;
    }

    public Place zzDf() {
        return this;
    }
}
