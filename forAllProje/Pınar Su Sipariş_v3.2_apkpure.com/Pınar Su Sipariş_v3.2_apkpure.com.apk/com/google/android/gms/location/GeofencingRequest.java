package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.location.internal.ParcelableGeofence;
import java.util.ArrayList;
import java.util.List;

public class GeofencingRequest extends AbstractSafeParcelable {
    public static final Creator<GeofencingRequest> CREATOR = new zzb();
    public static final int INITIAL_TRIGGER_DWELL = 4;
    public static final int INITIAL_TRIGGER_ENTER = 1;
    public static final int INITIAL_TRIGGER_EXIT = 2;
    private final int mVersionCode;
    private final List<ParcelableGeofence> zzaVd;
    private final int zzaVe;

    public static final class Builder {
        private final List<ParcelableGeofence> zzaVd = new ArrayList();
        private int zzaVe = 5;

        public static int zzhS(int i) {
            return i & 7;
        }

        public Builder addGeofence(Geofence geofence) {
            zzaa.zzb((Object) geofence, (Object) "geofence can't be null.");
            zzaa.zzb(geofence instanceof ParcelableGeofence, (Object) "Geofence must be created using Geofence.Builder.");
            this.zzaVd.add((ParcelableGeofence) geofence);
            return this;
        }

        public Builder addGeofences(List<Geofence> list) {
            if (!(list == null || list.isEmpty())) {
                for (Geofence geofence : list) {
                    if (geofence != null) {
                        addGeofence(geofence);
                    }
                }
            }
            return this;
        }

        public GeofencingRequest build() {
            zzaa.zzb(!this.zzaVd.isEmpty(), (Object) "No geofence has been added to this request.");
            return new GeofencingRequest(this.zzaVd, this.zzaVe);
        }

        public Builder setInitialTrigger(int i) {
            this.zzaVe = zzhS(i);
            return this;
        }
    }

    GeofencingRequest(int i, List<ParcelableGeofence> list, int i2) {
        this.mVersionCode = i;
        this.zzaVd = list;
        this.zzaVe = i2;
    }

    private GeofencingRequest(List<ParcelableGeofence> list, int i) {
        this(1, (List) list, i);
    }

    public List<Geofence> getGeofences() {
        List<Geofence> arrayList = new ArrayList();
        arrayList.addAll(this.zzaVd);
        return arrayList;
    }

    public int getInitialTrigger() {
        return this.zzaVe;
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzb.zza(this, parcel, i);
    }

    public List<ParcelableGeofence> zzCq() {
        return this.zzaVd;
    }
}
