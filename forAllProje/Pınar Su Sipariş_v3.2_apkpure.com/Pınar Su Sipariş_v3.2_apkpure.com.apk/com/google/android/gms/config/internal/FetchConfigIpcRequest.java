package com.google.android.gms.config.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public class FetchConfigIpcRequest extends AbstractSafeParcelable {
    public static final Creator<FetchConfigIpcRequest> CREATOR = new zze();
    public final int mVersionCode;
    private final String zzZC;
    private final long zzauL;
    private final DataHolder zzauM;
    private final String zzauN;
    private final String zzauO;
    private final String zzauP;
    private final List<String> zzauQ;

    FetchConfigIpcRequest(int i, String str, long j, DataHolder dataHolder, String str2, String str3, String str4, List<String> list) {
        this.mVersionCode = i;
        this.zzZC = str;
        this.zzauL = j;
        this.zzauM = dataHolder;
        this.zzauN = str2;
        this.zzauO = str3;
        this.zzauP = str4;
        this.zzauQ = list;
    }

    public FetchConfigIpcRequest(String str, long j, DataHolder dataHolder, String str2, String str3, String str4) {
        this(1, str, j, dataHolder, str2, str3, str4, null);
    }

    public String getPackageName() {
        return this.zzZC;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zze.zza(this, parcel, i);
    }

    public long zzvu() {
        return this.zzauL;
    }

    public DataHolder zzvv() {
        return this.zzauM;
    }

    public String zzvw() {
        return this.zzauN;
    }

    public String zzvx() {
        return this.zzauO;
    }

    public String zzvy() {
        return this.zzauP;
    }

    public List<String> zzvz() {
        return this.zzauQ;
    }
}
