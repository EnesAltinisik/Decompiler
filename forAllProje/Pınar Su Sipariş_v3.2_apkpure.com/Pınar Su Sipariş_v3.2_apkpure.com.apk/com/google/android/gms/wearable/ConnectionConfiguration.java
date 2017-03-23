package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;

public class ConnectionConfiguration extends AbstractSafeParcelable {
    public static final Creator<ConnectionConfiguration> CREATOR = new zzg();
    private final String mName;
    final int mVersionCode;
    private boolean zzYR;
    private final String zzaCQ;
    private final int zzagd;
    private final int zzavO;
    private final boolean zzbBE;
    private String zzbBF;
    private boolean zzbBG;
    private String zzbBH;

    ConnectionConfiguration(int i, String str, String str2, int i2, int i3, boolean z, boolean z2, String str3, boolean z3, String str4) {
        this.mVersionCode = i;
        this.mName = str;
        this.zzaCQ = str2;
        this.zzagd = i2;
        this.zzavO = i3;
        this.zzbBE = z;
        this.zzYR = z2;
        this.zzbBF = str3;
        this.zzbBG = z3;
        this.zzbBH = str4;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ConnectionConfiguration)) {
            return false;
        }
        ConnectionConfiguration connectionConfiguration = (ConnectionConfiguration) obj;
        return zzz.equal(Integer.valueOf(this.mVersionCode), Integer.valueOf(connectionConfiguration.mVersionCode)) && zzz.equal(this.mName, connectionConfiguration.mName) && zzz.equal(this.zzaCQ, connectionConfiguration.zzaCQ) && zzz.equal(Integer.valueOf(this.zzagd), Integer.valueOf(connectionConfiguration.zzagd)) && zzz.equal(Integer.valueOf(this.zzavO), Integer.valueOf(connectionConfiguration.zzavO)) && zzz.equal(Boolean.valueOf(this.zzbBE), Boolean.valueOf(connectionConfiguration.zzbBE)) && zzz.equal(Boolean.valueOf(this.zzbBG), Boolean.valueOf(connectionConfiguration.zzbBG));
    }

    public String getAddress() {
        return this.zzaCQ;
    }

    public String getName() {
        return this.mName;
    }

    public String getNodeId() {
        return this.zzbBH;
    }

    public int getRole() {
        return this.zzavO;
    }

    public int getType() {
        return this.zzagd;
    }

    public int hashCode() {
        return zzz.hashCode(Integer.valueOf(this.mVersionCode), this.mName, this.zzaCQ, Integer.valueOf(this.zzagd), Integer.valueOf(this.zzavO), Boolean.valueOf(this.zzbBE), Boolean.valueOf(this.zzbBG));
    }

    public boolean isConnected() {
        return this.zzYR;
    }

    public boolean isEnabled() {
        return this.zzbBE;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("ConnectionConfiguration[ ");
        String str = "mName=";
        String valueOf = String.valueOf(this.mName);
        stringBuilder.append(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        str = ", mAddress=";
        valueOf = String.valueOf(this.zzaCQ);
        stringBuilder.append(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        stringBuilder.append(", mType=" + this.zzagd);
        stringBuilder.append(", mRole=" + this.zzavO);
        stringBuilder.append(", mEnabled=" + this.zzbBE);
        stringBuilder.append(", mIsConnected=" + this.zzYR);
        str = ", mPeerNodeId=";
        valueOf = String.valueOf(this.zzbBF);
        stringBuilder.append(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        stringBuilder.append(", mBtlePriority=" + this.zzbBG);
        str = ", mNodeId=";
        valueOf = String.valueOf(this.zzbBH);
        stringBuilder.append(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzg.zza(this, parcel, i);
    }

    public String zzNo() {
        return this.zzbBF;
    }

    public boolean zzNp() {
        return this.zzbBG;
    }
}
