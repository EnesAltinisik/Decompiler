package com.google.firebase.database.connection.idl;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.zzaec;
import com.google.android.gms.internal.zzaeg;
import java.util.ArrayList;
import java.util.List;

class CompoundHashParcelable extends AbstractSafeParcelable {
    public static final zza CREATOR = new zza();
    final int a;
    final List<String> b;
    final List<String> c;

    public CompoundHashParcelable(int i, List<String> list, List<String> list2) {
        this.a = i;
        this.b = list;
        this.c = list2;
    }

    public static zzaec a(CompoundHashParcelable compoundHashParcelable) {
        List arrayList = new ArrayList(compoundHashParcelable.b.size());
        for (String zzhU : compoundHashParcelable.b) {
            arrayList.add(zzaeg.zzhU(zzhU));
        }
        return new zzaec(arrayList, compoundHashParcelable.c);
    }

    public static CompoundHashParcelable a(zzaec com_google_android_gms_internal_zzaec) {
        List<List> zzPR = com_google_android_gms_internal_zzaec.zzPR();
        List arrayList = new ArrayList(zzPR.size());
        for (List zzP : zzPR) {
            arrayList.add(zzaeg.zzP(zzP));
        }
        return new CompoundHashParcelable(1, arrayList, com_google_android_gms_internal_zzaec.zzPS());
    }

    public void writeToParcel(Parcel parcel, int i) {
        zza.zza(this, parcel, i);
    }
}
