package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.zzb;
import java.util.ArrayList;

public final class LabelValueRow extends AbstractSafeParcelable {
    public static final Creator<LabelValueRow> CREATOR = new zzc();
    private final int mVersionCode;
    String zzbBk;
    String zzbBl;
    ArrayList<LabelValue> zzbBm;

    LabelValueRow() {
        this.mVersionCode = 1;
        this.zzbBm = zzb.zzuT();
    }

    LabelValueRow(int i, String str, String str2, ArrayList<LabelValue> arrayList) {
        this.mVersionCode = i;
        this.zzbBk = str;
        this.zzbBl = str2;
        this.zzbBm = arrayList;
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzc.zza(this, parcel, i);
    }
}
