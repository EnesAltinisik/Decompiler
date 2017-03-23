package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.zzd;

public final class AncsNotificationParcelable extends AbstractSafeParcelable implements zzd {
    public static final Creator<AncsNotificationParcelable> CREATOR = new zzh();
    private int mId;
    final int mVersionCode;
    private final String zzPx;
    private final String zzZC;
    private final String zzaKz;
    private final String zzaco;
    private final String zzafk;
    private final String zzavG;
    private final String zzbCo;
    private final byte zzbCp;
    private final byte zzbCq;
    private final byte zzbCr;
    private final byte zzbCs;

    AncsNotificationParcelable(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, byte b, byte b2, byte b3, byte b4, String str7) {
        this.mId = i2;
        this.mVersionCode = i;
        this.zzPx = str;
        this.zzbCo = str2;
        this.zzafk = str3;
        this.zzavG = str4;
        this.zzaKz = str5;
        this.zzaco = str6;
        this.zzbCp = b;
        this.zzbCq = b2;
        this.zzbCr = b3;
        this.zzbCs = b4;
        this.zzZC = str7;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AncsNotificationParcelable ancsNotificationParcelable = (AncsNotificationParcelable) obj;
        if (this.mVersionCode != ancsNotificationParcelable.mVersionCode || this.mId != ancsNotificationParcelable.mId || this.zzbCp != ancsNotificationParcelable.zzbCp || this.zzbCq != ancsNotificationParcelable.zzbCq || this.zzbCr != ancsNotificationParcelable.zzbCr || this.zzbCs != ancsNotificationParcelable.zzbCs || !this.zzPx.equals(ancsNotificationParcelable.zzPx)) {
            return false;
        }
        if (this.zzbCo != null) {
            if (!this.zzbCo.equals(ancsNotificationParcelable.zzbCo)) {
                return false;
            }
        } else if (ancsNotificationParcelable.zzbCo != null) {
            return false;
        }
        if (!this.zzafk.equals(ancsNotificationParcelable.zzafk) || !this.zzavG.equals(ancsNotificationParcelable.zzavG) || !this.zzaKz.equals(ancsNotificationParcelable.zzaKz)) {
            return false;
        }
        if (this.zzaco != null) {
            if (!this.zzaco.equals(ancsNotificationParcelable.zzaco)) {
                return false;
            }
        } else if (ancsNotificationParcelable.zzaco != null) {
            return false;
        }
        if (this.zzZC != null) {
            z = this.zzZC.equals(ancsNotificationParcelable.zzZC);
        } else if (ancsNotificationParcelable.zzZC != null) {
            z = false;
        }
        return z;
    }

    public String getDisplayName() {
        return this.zzaco == null ? this.zzPx : this.zzaco;
    }

    public int getId() {
        return this.mId;
    }

    public String getPackageName() {
        return this.zzZC;
    }

    public String getTitle() {
        return this.zzavG;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((((this.zzaco != null ? this.zzaco.hashCode() : 0) + (((((((((this.zzbCo != null ? this.zzbCo.hashCode() : 0) + (((((this.mVersionCode * 31) + this.mId) * 31) + this.zzPx.hashCode()) * 31)) * 31) + this.zzafk.hashCode()) * 31) + this.zzavG.hashCode()) * 31) + this.zzaKz.hashCode()) * 31)) * 31) + this.zzbCp) * 31) + this.zzbCq) * 31) + this.zzbCr) * 31) + this.zzbCs) * 31;
        if (this.zzZC != null) {
            i = this.zzZC.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        int i = this.mVersionCode;
        int i2 = this.mId;
        String str = this.zzPx;
        String str2 = this.zzbCo;
        String str3 = this.zzafk;
        String str4 = this.zzavG;
        String str5 = this.zzaKz;
        String str6 = this.zzaco;
        byte b = this.zzbCp;
        byte b2 = this.zzbCq;
        byte b3 = this.zzbCr;
        byte b4 = this.zzbCs;
        String str7 = this.zzZC;
        return new StringBuilder(((((((String.valueOf(str).length() + 234) + String.valueOf(str2).length()) + String.valueOf(str3).length()) + String.valueOf(str4).length()) + String.valueOf(str5).length()) + String.valueOf(str6).length()) + String.valueOf(str7).length()).append("AncsNotificationParcelable{versionCode=").append(i).append(", id=").append(i2).append(", appId='").append(str).append("'").append(", dateTime='").append(str2).append("'").append(", notificationText='").append(str3).append("'").append(", title='").append(str4).append("'").append(", subtitle='").append(str5).append("'").append(", displayName='").append(str6).append("'").append(", eventId=").append(b).append(", eventFlags=").append(b2).append(", categoryId=").append(b3).append(", categoryCount=").append(b4).append(", packageName='").append(str7).append("'").append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzh.zza(this, parcel, i);
    }

    public byte zzNA() {
        return this.zzbCr;
    }

    public byte zzNB() {
        return this.zzbCs;
    }

    public String zzNw() {
        return this.zzbCo;
    }

    public String zzNx() {
        return this.zzafk;
    }

    public byte zzNy() {
        return this.zzbCp;
    }

    public byte zzNz() {
        return this.zzbCq;
    }

    public String zziC() {
        return this.zzPx;
    }

    public String zzzv() {
        return this.zzaKz;
    }
}
