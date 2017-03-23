package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.wearable.CapabilityInfo;
import com.google.android.gms.wearable.Node;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CapabilityInfoParcelable extends AbstractSafeParcelable implements CapabilityInfo {
    public static final Creator<CapabilityInfoParcelable> CREATOR = new zzk();
    private final String mName;
    final int mVersionCode;
    private final List<NodeParcelable> zzbCC;
    private Set<Node> zzbCz;
    private final Object zzpp = new Object();

    CapabilityInfoParcelable(int i, String str, List<NodeParcelable> list) {
        this.mVersionCode = i;
        this.mName = str;
        this.zzbCC = list;
        this.zzbCz = null;
        zzNC();
    }

    private void zzNC() {
        zzaa.zzz(this.mName);
        zzaa.zzz(this.zzbCC);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CapabilityInfoParcelable capabilityInfoParcelable = (CapabilityInfoParcelable) obj;
        if (this.mVersionCode != capabilityInfoParcelable.mVersionCode) {
            return false;
        }
        if (this.mName == null ? capabilityInfoParcelable.mName != null : !this.mName.equals(capabilityInfoParcelable.mName)) {
            return false;
        }
        if (this.zzbCC != null) {
            if (this.zzbCC.equals(capabilityInfoParcelable.zzbCC)) {
                return true;
            }
        } else if (capabilityInfoParcelable.zzbCC == null) {
            return true;
        }
        return false;
    }

    public String getName() {
        return this.mName;
    }

    public Set<Node> getNodes() {
        Set<Node> set;
        synchronized (this.zzpp) {
            if (this.zzbCz == null) {
                this.zzbCz = new HashSet(this.zzbCC);
            }
            set = this.zzbCz;
        }
        return set;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.mName != null ? this.mName.hashCode() : 0) + (this.mVersionCode * 31)) * 31;
        if (this.zzbCC != null) {
            i = this.zzbCC.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.mName;
        String valueOf = String.valueOf(this.zzbCC);
        return new StringBuilder((String.valueOf(str).length() + 18) + String.valueOf(valueOf).length()).append("CapabilityInfo{").append(str).append(", ").append(valueOf).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzk.zza(this, parcel, i);
    }

    public List<NodeParcelable> zzND() {
        return this.zzbCC;
    }
}
