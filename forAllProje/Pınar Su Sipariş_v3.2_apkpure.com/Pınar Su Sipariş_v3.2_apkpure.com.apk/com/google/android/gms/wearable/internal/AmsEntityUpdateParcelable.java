package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.zzb;

public class AmsEntityUpdateParcelable extends AbstractSafeParcelable implements zzb {
    public static final Creator<AmsEntityUpdateParcelable> CREATOR = new zzf();
    private final String mValue;
    final int mVersionCode;
    private byte zzbCm;
    private final byte zzbCn;

    AmsEntityUpdateParcelable(int i, byte b, byte b2, String str) {
        this.zzbCm = b;
        this.mVersionCode = i;
        this.zzbCn = b2;
        this.mValue = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AmsEntityUpdateParcelable amsEntityUpdateParcelable = (AmsEntityUpdateParcelable) obj;
        return this.zzbCm != amsEntityUpdateParcelable.zzbCm ? false : this.mVersionCode != amsEntityUpdateParcelable.mVersionCode ? false : this.zzbCn != amsEntityUpdateParcelable.zzbCn ? false : this.mValue.equals(amsEntityUpdateParcelable.mValue);
    }

    public String getValue() {
        return this.mValue;
    }

    public int hashCode() {
        return (((((this.mVersionCode * 31) + this.zzbCm) * 31) + this.zzbCn) * 31) + this.mValue.hashCode();
    }

    public String toString() {
        int i = this.mVersionCode;
        byte b = this.zzbCm;
        byte b2 = this.zzbCn;
        String str = this.mValue;
        return new StringBuilder(String.valueOf(str).length() + 97).append("AmsEntityUpdateParcelable{mVersionCode=").append(i).append(", mEntityId=").append(b).append(", mAttributeId=").append(b2).append(", mValue='").append(str).append("'").append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzf.zza(this, parcel, i);
    }

    public byte zzNu() {
        return this.zzbCm;
    }

    public byte zzNv() {
        return this.zzbCn;
    }
}
