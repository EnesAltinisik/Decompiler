package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ParcelableCollaborator extends AbstractSafeParcelable {
    public static final Creator<ParcelableCollaborator> CREATOR = new zzq();
    final int mVersionCode;
    final String zzPE;
    final String zzVA;
    final boolean zzaBj;
    final String zzaBk;
    final String zzaBl;
    final String zzaco;
    final boolean zzajB;

    ParcelableCollaborator(int i, boolean z, boolean z2, String str, String str2, String str3, String str4, String str5) {
        this.mVersionCode = i;
        this.zzaBj = z;
        this.zzajB = z2;
        this.zzPE = str;
        this.zzVA = str2;
        this.zzaco = str3;
        this.zzaBk = str4;
        this.zzaBl = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParcelableCollaborator)) {
            return false;
        }
        return this.zzPE.equals(((ParcelableCollaborator) obj).zzPE);
    }

    public int hashCode() {
        return this.zzPE.hashCode();
    }

    public String toString() {
        boolean z = this.zzaBj;
        boolean z2 = this.zzajB;
        String str = this.zzPE;
        String str2 = this.zzVA;
        String str3 = this.zzaco;
        String str4 = this.zzaBk;
        String str5 = this.zzaBl;
        return new StringBuilder(((((String.valueOf(str).length() + 98) + String.valueOf(str2).length()) + String.valueOf(str3).length()) + String.valueOf(str4).length()) + String.valueOf(str5).length()).append("Collaborator [isMe=").append(z).append(", isAnonymous=").append(z2).append(", sessionId=").append(str).append(", userId=").append(str2).append(", displayName=").append(str3).append(", color=").append(str4).append(", photoUrl=").append(str5).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzq.zza(this, parcel, i);
    }
}
