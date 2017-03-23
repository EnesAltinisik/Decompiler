package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.drive.metadata.CustomPropertyKey;

public class CustomProperty extends AbstractSafeParcelable {
    public static final Creator<CustomProperty> CREATOR = new zzc();
    final String mValue;
    final int mVersionCode;
    final CustomPropertyKey zzazo;

    CustomProperty(int i, CustomPropertyKey customPropertyKey, String str) {
        this.mVersionCode = i;
        zzaa.zzb((Object) customPropertyKey, (Object) "key");
        this.zzazo = customPropertyKey;
        this.mValue = str;
    }

    public CustomProperty(CustomPropertyKey customPropertyKey, String str) {
        this(1, customPropertyKey, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        CustomProperty customProperty = (CustomProperty) obj;
        return zzz.equal(this.zzazo, customProperty.zzazo) && zzz.equal(this.mValue, customProperty.mValue);
    }

    public String getValue() {
        return this.mValue;
    }

    public int hashCode() {
        return zzz.hashCode(this.zzazo, this.mValue);
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzc.zza(this, parcel, i);
    }

    public CustomPropertyKey zzwK() {
        return this.zzazo;
    }
}
