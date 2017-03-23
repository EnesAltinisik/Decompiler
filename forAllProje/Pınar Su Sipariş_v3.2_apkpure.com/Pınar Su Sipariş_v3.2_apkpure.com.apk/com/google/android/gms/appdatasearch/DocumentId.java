package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class DocumentId extends AbstractSafeParcelable {
    public static final zzc CREATOR = new zzc();
    final int mVersionCode;
    final String zzZC;
    final String zzZD;
    final String zzZE;

    DocumentId(int i, String str, String str2, String str3) {
        this.mVersionCode = i;
        this.zzZC = str;
        this.zzZD = str2;
        this.zzZE = str3;
    }

    public DocumentId(String str, String str2, String str3) {
        this(1, str, str2, str3);
    }

    public String toString() {
        return String.format("DocumentId[packageName=%s, corpusName=%s, uri=%s]", new Object[]{this.zzZC, this.zzZD, this.zzZE});
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzc com_google_android_gms_appdatasearch_zzc = CREATOR;
        zzc.zza(this, parcel, i);
    }
}
