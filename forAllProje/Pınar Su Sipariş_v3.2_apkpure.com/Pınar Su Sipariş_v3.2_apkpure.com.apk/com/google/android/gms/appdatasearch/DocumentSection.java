package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.appdatasearch.RegisterSectionInfo.zza;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;

public class DocumentSection extends AbstractSafeParcelable {
    public static final zzd CREATOR = new zzd();
    public static final int zzZF = Integer.parseInt("-1");
    private static final RegisterSectionInfo zzZG = new zza("SsbContext").zzU(true).zzcf("blob").zzoK();
    final int mVersionCode;
    public final String zzZH;
    final RegisterSectionInfo zzZI;
    public final int zzZJ;
    public final byte[] zzZK;

    DocumentSection(int i, String str, RegisterSectionInfo registerSectionInfo, int i2, byte[] bArr) {
        boolean z = i2 == zzZF || zzh.zzaC(i2) != null;
        zzaa.zzb(z, "Invalid section type " + i2);
        this.mVersionCode = i;
        this.zzZH = str;
        this.zzZI = registerSectionInfo;
        this.zzZJ = i2;
        this.zzZK = bArr;
        String zzoI = zzoI();
        if (zzoI != null) {
            throw new IllegalArgumentException(zzoI);
        }
    }

    public DocumentSection(String str, RegisterSectionInfo registerSectionInfo) {
        this(1, str, registerSectionInfo, zzZF, null);
    }

    public DocumentSection(String str, RegisterSectionInfo registerSectionInfo, String str2) {
        this(1, str, registerSectionInfo, zzh.zzce(str2), null);
    }

    public DocumentSection(byte[] bArr, RegisterSectionInfo registerSectionInfo) {
        this(1, null, registerSectionInfo, zzZF, bArr);
    }

    public static DocumentSection zzi(byte[] bArr) {
        return new DocumentSection(bArr, zzZG);
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzd com_google_android_gms_appdatasearch_zzd = CREATOR;
        zzd.zza(this, parcel, i);
    }

    public String zzoI() {
        if (this.zzZJ == zzZF || zzh.zzaC(this.zzZJ) != null) {
            return (this.zzZH == null || this.zzZK == null) ? null : "Both content and blobContent set";
        } else {
            return "Invalid section type " + this.zzZJ;
        }
    }
}
