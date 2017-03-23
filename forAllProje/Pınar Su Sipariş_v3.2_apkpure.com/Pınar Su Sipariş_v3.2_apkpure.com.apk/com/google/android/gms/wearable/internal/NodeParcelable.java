package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.Node;

public class NodeParcelable extends AbstractSafeParcelable implements Node {
    public static final Creator<NodeParcelable> CREATOR = new zzbc();
    final int mVersionCode;
    private final String zzBc;
    private final String zzaco;
    private final int zzbDE;
    private final boolean zzbDF;

    NodeParcelable(int i, String str, String str2, int i2, boolean z) {
        this.mVersionCode = i;
        this.zzBc = str;
        this.zzaco = str2;
        this.zzbDE = i2;
        this.zzbDF = z;
    }

    public boolean equals(Object obj) {
        return !(obj instanceof NodeParcelable) ? false : ((NodeParcelable) obj).zzBc.equals(this.zzBc);
    }

    public String getDisplayName() {
        return this.zzaco;
    }

    public int getHopCount() {
        return this.zzbDE;
    }

    public String getId() {
        return this.zzBc;
    }

    public int hashCode() {
        return this.zzBc.hashCode();
    }

    public boolean isNearby() {
        return this.zzbDF;
    }

    public String toString() {
        String str = this.zzaco;
        String str2 = this.zzBc;
        int i = this.zzbDE;
        return new StringBuilder((String.valueOf(str).length() + 45) + String.valueOf(str2).length()).append("Node{").append(str).append(", id=").append(str2).append(", hops=").append(i).append(", isNearby=").append(this.zzbDF).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzbc.zza(this, parcel, i);
    }
}
