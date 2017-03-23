package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class Operator extends AbstractSafeParcelable {
    public static final Creator<Operator> CREATOR = new zzn();
    public static final Operator zzaAY = new Operator("=");
    public static final Operator zzaAZ = new Operator("<");
    public static final Operator zzaBa = new Operator("<=");
    public static final Operator zzaBb = new Operator(">");
    public static final Operator zzaBc = new Operator(">=");
    public static final Operator zzaBd = new Operator("and");
    public static final Operator zzaBe = new Operator("or");
    public static final Operator zzaBf = new Operator("not");
    public static final Operator zzaBg = new Operator("contains");
    final String mTag;
    final int mVersionCode;

    Operator(int i, String str) {
        this.mVersionCode = i;
        this.mTag = str;
    }

    private Operator(String str) {
        this(1, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Operator operator = (Operator) obj;
        return this.mTag == null ? operator.mTag == null : this.mTag.equals(operator.mTag);
    }

    public String getTag() {
        return this.mTag;
    }

    public int hashCode() {
        return (this.mTag == null ? 0 : this.mTag.hashCode()) + 31;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzn.zza(this, parcel, i);
    }
}
