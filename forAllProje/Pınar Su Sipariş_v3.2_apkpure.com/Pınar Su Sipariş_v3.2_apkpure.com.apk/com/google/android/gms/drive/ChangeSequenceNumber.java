package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zzamj;
import com.google.android.gms.internal.zzqa;

public class ChangeSequenceNumber extends AbstractSafeParcelable {
    public static final Creator<ChangeSequenceNumber> CREATOR = new zza();
    final int mVersionCode;
    final long zzauT;
    final long zzauU;
    final long zzauV;
    private volatile String zzauW = null;

    ChangeSequenceNumber(int i, long j, long j2, long j3) {
        boolean z = true;
        zzaa.zzaj(j != -1);
        zzaa.zzaj(j2 != -1);
        if (j3 == -1) {
            z = false;
        }
        zzaa.zzaj(z);
        this.mVersionCode = i;
        this.zzauT = j;
        this.zzauU = j2;
        this.zzauV = j3;
    }

    public final String encodeToString() {
        if (this.zzauW == null) {
            String encodeToString = Base64.encodeToString(zzvD(), 10);
            String valueOf = String.valueOf("ChangeSequenceNumber:");
            encodeToString = String.valueOf(encodeToString);
            this.zzauW = encodeToString.length() != 0 ? valueOf.concat(encodeToString) : new String(valueOf);
        }
        return this.zzauW;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ChangeSequenceNumber)) {
            return false;
        }
        ChangeSequenceNumber changeSequenceNumber = (ChangeSequenceNumber) obj;
        return changeSequenceNumber.zzauU == this.zzauU && changeSequenceNumber.zzauV == this.zzauV && changeSequenceNumber.zzauT == this.zzauT;
    }

    public int hashCode() {
        String valueOf = String.valueOf(String.valueOf(this.zzauT));
        String valueOf2 = String.valueOf(String.valueOf(this.zzauU));
        String valueOf3 = String.valueOf(String.valueOf(this.zzauV));
        return new StringBuilder(((String.valueOf(valueOf).length() + 0) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append(valueOf).append(valueOf2).append(valueOf3).toString().hashCode();
    }

    public String toString() {
        return encodeToString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zza.zza(this, parcel, i);
    }

    final byte[] zzvD() {
        zzamj com_google_android_gms_internal_zzqa = new zzqa();
        com_google_android_gms_internal_zzqa.versionCode = this.mVersionCode;
        com_google_android_gms_internal_zzqa.zzaza = this.zzauT;
        com_google_android_gms_internal_zzqa.zzazb = this.zzauU;
        com_google_android_gms_internal_zzqa.zzazc = this.zzauV;
        return zzamj.toByteArray(com_google_android_gms_internal_zzqa);
    }
}
