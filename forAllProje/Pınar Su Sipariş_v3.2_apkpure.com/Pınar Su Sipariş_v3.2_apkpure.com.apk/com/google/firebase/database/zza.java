package com.google.firebase.database;

import com.google.android.gms.internal.zzafa;
import com.google.android.gms.internal.zzafc;
import com.google.android.gms.internal.zzahp;
import com.google.android.gms.internal.zzahu;

public class zza {
    public static DataSnapshot zza(DatabaseReference databaseReference, zzahp com_google_android_gms_internal_zzahp) {
        return new DataSnapshot(databaseReference, com_google_android_gms_internal_zzahp);
    }

    public static DatabaseReference zza(zzafc com_google_android_gms_internal_zzafc, zzafa com_google_android_gms_internal_zzafa) {
        return new DatabaseReference(com_google_android_gms_internal_zzafc, com_google_android_gms_internal_zzafa);
    }

    public static MutableData zza(zzahu com_google_android_gms_internal_zzahu) {
        return new MutableData(com_google_android_gms_internal_zzahu);
    }
}
