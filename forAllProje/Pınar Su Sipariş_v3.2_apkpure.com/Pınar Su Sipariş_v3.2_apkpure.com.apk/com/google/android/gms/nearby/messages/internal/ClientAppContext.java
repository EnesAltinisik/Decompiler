package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;

public final class ClientAppContext extends AbstractSafeParcelable {
    public static final Creator<ClientAppContext> CREATOR = new zzb();
    final int versionCode;
    public final boolean zzbiS;
    public final String zzbiU;
    public final String zzbjE;
    public final String zzbjF;
    public final int zzbjG;

    ClientAppContext(int i, String str, String str2, boolean z, int i2, String str3) {
        this.versionCode = i;
        this.zzbjE = str;
        this.zzbjF = str2;
        this.zzbiS = z;
        this.zzbjG = i2;
        this.zzbiU = str3;
    }

    public ClientAppContext(String str, String str2, boolean z) {
        this(str, str2, z, null, 0);
    }

    public ClientAppContext(String str, String str2, boolean z, String str3, int i) {
        this(1, str, str2, z, i, str3);
    }

    static final ClientAppContext zza(ClientAppContext clientAppContext, String str, String str2, boolean z) {
        return clientAppContext != null ? clientAppContext : (str == null && str2 == null) ? null : new ClientAppContext(str, str2, z);
    }

    private static boolean zzac(String str, String str2) {
        return TextUtils.isEmpty(str) ? TextUtils.isEmpty(str2) : str.equals(str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientAppContext)) {
            return false;
        }
        ClientAppContext clientAppContext = (ClientAppContext) obj;
        return zzac(this.zzbjE, clientAppContext.zzbjE) && zzac(this.zzbjF, clientAppContext.zzbjF) && this.zzbiS == clientAppContext.zzbiS && zzac(this.zzbiU, clientAppContext.zzbiU) && this.zzbjG == clientAppContext.zzbjG;
    }

    public int hashCode() {
        return zzz.hashCode(this.zzbjE, this.zzbjF, Boolean.valueOf(this.zzbiS), this.zzbiU, Integer.valueOf(this.zzbjG));
    }

    public String toString() {
        return String.format("{realClientPackageName: %s, zeroPartyIdentifier: %s, useRealClientApiKey: %b, apiKey: %s, callingContext: %d}", new Object[]{this.zzbjE, this.zzbjF, Boolean.valueOf(this.zzbiS), this.zzbiU, Integer.valueOf(this.zzbjG)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzb.zza(this, parcel, i);
    }
}
