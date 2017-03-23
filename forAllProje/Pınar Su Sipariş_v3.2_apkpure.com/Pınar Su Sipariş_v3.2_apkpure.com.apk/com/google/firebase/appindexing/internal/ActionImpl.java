package com.google.firebase.appindexing.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ActionImpl extends AbstractSafeParcelable {
    public static final Creator<ActionImpl> CREATOR = new zza();
    public final int mVersionCode;
    private final String zzbEP;
    private final String zzbEQ;
    private final String zzbER;
    private final String zzbES;
    private final MetadataImpl zzbET;
    private final String zzbEU;

    public static class MetadataImpl extends AbstractSafeParcelable {
        public static final Creator<MetadataImpl> CREATOR = new zzb();
        public final int mVersionCode;
        private final String zzaaR;
        private int zzaaq = 0;
        private final boolean zzbEV;
        private final String zzbEW;
        private final byte[] zzbEX;
        private final boolean zzbEY;

        MetadataImpl(int i, int i2, boolean z, String str, String str2, byte[] bArr, boolean z2) {
            this.mVersionCode = i;
            this.zzaaq = i2;
            this.zzbEV = z;
            this.zzbEW = str;
            this.zzaaR = str2;
            this.zzbEX = bArr;
            this.zzbEY = z2;
        }

        public String getAccountName() {
            return this.zzaaR;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("MetadataImpl { ");
            stringBuilder.append("{ eventStatus: '").append(this.zzaaq).append("' } ");
            stringBuilder.append("{ uploadable: '").append(this.zzbEV).append("' } ");
            if (this.zzbEW != null) {
                stringBuilder.append("{ completionToken: '").append(this.zzbEW).append("' } ");
            }
            if (this.zzaaR != null) {
                stringBuilder.append("{ accountName: '").append(this.zzaaR).append("' } ");
            }
            if (this.zzbEX != null) {
                stringBuilder.append("{ ssbContext: [ ");
                for (byte toHexString : this.zzbEX) {
                    stringBuilder.append("0x").append(Integer.toHexString(toHexString)).append(" ");
                }
                stringBuilder.append("] } ");
            }
            stringBuilder.append("{ contextOnly: '").append(this.zzbEY).append("' } ");
            stringBuilder.append("}");
            return stringBuilder.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            zzb.zza(this, parcel, i);
        }

        public int zzOd() {
            return this.zzaaq;
        }

        public boolean zzOe() {
            return this.zzbEV;
        }

        public String zzOf() {
            return this.zzbEW;
        }

        public byte[] zzOg() {
            return this.zzbEX;
        }

        public boolean zzOh() {
            return this.zzbEY;
        }
    }

    ActionImpl(int i, String str, String str2, String str3, String str4, MetadataImpl metadataImpl, String str5) {
        this.mVersionCode = i;
        this.zzbEP = str;
        this.zzbEQ = str2;
        this.zzbER = str3;
        this.zzbES = str4;
        this.zzbET = metadataImpl;
        this.zzbEU = str5;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ActionImpl { ");
        stringBuilder.append("{ actionType: '").append(this.zzbEP).append("' } ");
        stringBuilder.append("{ objectName: '").append(this.zzbEQ).append("' } ");
        stringBuilder.append("{ objectUrl: '").append(this.zzbER).append("' } ");
        if (this.zzbES != null) {
            stringBuilder.append("{ objectSameAs: '").append(this.zzbES).append("' } ");
        }
        if (this.zzbET != null) {
            stringBuilder.append("{ metadata: '").append(this.zzbET.toString()).append("' } ");
        }
        if (this.zzbEU != null) {
            stringBuilder.append("{ actionStatus: '").append(this.zzbEU).append("' } ");
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zza.zza(this, parcel, i);
    }

    public String zzNX() {
        return this.zzbEP;
    }

    public String zzNY() {
        return this.zzbEQ;
    }

    public String zzNZ() {
        return this.zzbER;
    }

    public String zzOa() {
        return this.zzbES;
    }

    public MetadataImpl zzOb() {
        return this.zzbET;
    }

    public String zzOc() {
        return this.zzbEU;
    }
}
