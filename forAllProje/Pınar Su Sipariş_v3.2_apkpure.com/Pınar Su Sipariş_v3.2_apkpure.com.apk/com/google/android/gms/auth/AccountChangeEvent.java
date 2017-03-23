package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzz;

public class AccountChangeEvent extends AbstractSafeParcelable {
    public static final Creator<AccountChangeEvent> CREATOR = new zza();
    final int mVersion;
    final long zzaaQ;
    final String zzaaR;
    final int zzaaS;
    final int zzaaT;
    final String zzaaU;

    AccountChangeEvent(int i, long j, String str, int i2, int i3, String str2) {
        this.mVersion = i;
        this.zzaaQ = j;
        this.zzaaR = (String) zzaa.zzz(str);
        this.zzaaS = i2;
        this.zzaaT = i3;
        this.zzaaU = str2;
    }

    public AccountChangeEvent(long j, String str, int i, int i2, String str2) {
        this.mVersion = 1;
        this.zzaaQ = j;
        this.zzaaR = (String) zzaa.zzz(str);
        this.zzaaS = i;
        this.zzaaT = i2;
        this.zzaaU = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AccountChangeEvent)) {
            return false;
        }
        AccountChangeEvent accountChangeEvent = (AccountChangeEvent) obj;
        return this.mVersion == accountChangeEvent.mVersion && this.zzaaQ == accountChangeEvent.zzaaQ && zzz.equal(this.zzaaR, accountChangeEvent.zzaaR) && this.zzaaS == accountChangeEvent.zzaaS && this.zzaaT == accountChangeEvent.zzaaT && zzz.equal(this.zzaaU, accountChangeEvent.zzaaU);
    }

    public String getAccountName() {
        return this.zzaaR;
    }

    public String getChangeData() {
        return this.zzaaU;
    }

    public int getChangeType() {
        return this.zzaaS;
    }

    public int getEventIndex() {
        return this.zzaaT;
    }

    public int hashCode() {
        return zzz.hashCode(Integer.valueOf(this.mVersion), Long.valueOf(this.zzaaQ), this.zzaaR, Integer.valueOf(this.zzaaS), Integer.valueOf(this.zzaaT), this.zzaaU);
    }

    public String toString() {
        String str = "UNKNOWN";
        switch (this.zzaaS) {
            case 1:
                str = "ADDED";
                break;
            case 2:
                str = "REMOVED";
                break;
            case 3:
                str = "RENAMED_FROM";
                break;
            case 4:
                str = "RENAMED_TO";
                break;
        }
        String str2 = this.zzaaR;
        String str3 = this.zzaaU;
        return new StringBuilder(((String.valueOf(str2).length() + 91) + String.valueOf(str).length()) + String.valueOf(str3).length()).append("AccountChangeEvent {accountName = ").append(str2).append(", changeType = ").append(str).append(", changeData = ").append(str3).append(", eventIndex = ").append(this.zzaaT).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zza.zza(this, parcel, i);
    }
}
