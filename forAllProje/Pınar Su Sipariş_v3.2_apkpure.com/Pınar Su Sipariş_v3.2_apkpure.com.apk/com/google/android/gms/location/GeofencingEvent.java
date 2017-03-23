package com.google.android.gms.location;

import android.content.Intent;
import android.location.Location;
import com.google.android.gms.location.internal.ParcelableGeofence;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GeofencingEvent {
    private final int zzKa;
    private final int zzaVa;
    private final List<Geofence> zzaVb;
    private final Location zzaVc;

    private GeofencingEvent(int i, int i2, List<Geofence> list, Location location) {
        this.zzKa = i;
        this.zzaVa = i2;
        this.zzaVb = list;
        this.zzaVc = location;
    }

    public static GeofencingEvent fromIntent(Intent intent) {
        return intent == null ? null : new GeofencingEvent(intent.getIntExtra("gms_error_code", -1), zzv(intent), zzw(intent), (Location) intent.getParcelableExtra("com.google.android.location.intent.extra.triggering_location"));
    }

    private static int zzv(Intent intent) {
        int intExtra = intent.getIntExtra("com.google.android.location.intent.extra.transition", -1);
        return intExtra == -1 ? -1 : (intExtra == 1 || intExtra == 2 || intExtra == 4) ? intExtra : -1;
    }

    private static List<Geofence> zzw(Intent intent) {
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra("com.google.android.location.intent.extra.geofence_list");
        if (arrayList == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(ParcelableGeofence.zzq((byte[]) it.next()));
        }
        return arrayList2;
    }

    public int getErrorCode() {
        return this.zzKa;
    }

    public int getGeofenceTransition() {
        return this.zzaVa;
    }

    public List<Geofence> getTriggeringGeofences() {
        return this.zzaVb;
    }

    public Location getTriggeringLocation() {
        return this.zzaVc;
    }

    public boolean hasError() {
        return this.zzKa != -1;
    }
}
