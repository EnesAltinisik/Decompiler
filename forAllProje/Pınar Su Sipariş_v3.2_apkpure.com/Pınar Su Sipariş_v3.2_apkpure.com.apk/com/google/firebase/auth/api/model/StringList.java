package com.google.firebase.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.zzacw;
import com.google.android.gms.internal.zzaku;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringList extends AbstractSafeParcelable {
    public static final Creator<StringList> CREATOR = new zzg();
    @zzacw
    public final int mVersionCode;
    @zzaku("values")
    private List<String> zzbFZ;

    public StringList() {
        this(null);
    }

    StringList(int i, List<String> list) {
        this.mVersionCode = i;
        if (list == null || list.isEmpty()) {
            this.zzbFZ = Collections.emptyList();
        } else {
            this.zzbFZ = Collections.unmodifiableList(list);
        }
    }

    public StringList(List<String> list) {
        this.mVersionCode = 1;
        this.zzbFZ = new ArrayList();
        if (list != null && !list.isEmpty()) {
            this.zzbFZ.addAll(list);
        }
    }

    public static StringList zzON() {
        return new StringList(null);
    }

    public static StringList zza(StringList stringList) {
        return new StringList(stringList != null ? stringList.zzOM() : null);
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzg.zza(this, parcel, i);
    }

    public List<String> zzOM() {
        return this.zzbFZ;
    }
}
