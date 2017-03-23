package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.drive.internal.zzab;
import com.google.android.gms.drive.internal.zzw;
import com.google.android.gms.drive.internal.zzy;
import com.google.android.gms.drive.internal.zzz;
import com.google.android.gms.internal.zzami;
import com.google.android.gms.internal.zzamj;
import com.google.android.gms.internal.zzqb;
import com.google.android.gms.internal.zzqc;

public class DriveId extends AbstractSafeParcelable {
    public static final Creator<DriveId> CREATOR = new zze();
    public static final int RESOURCE_TYPE_FILE = 0;
    public static final int RESOURCE_TYPE_FOLDER = 1;
    public static final int RESOURCE_TYPE_UNKNOWN = -1;
    final int mVersionCode;
    final long zzauU;
    private volatile String zzauW;
    final String zzavl;
    final long zzavm;
    final int zzavn;
    private volatile String zzavo;

    DriveId(int i, String str, long j, long j2, int i2) {
        boolean z = false;
        this.zzauW = null;
        this.zzavo = null;
        this.mVersionCode = i;
        this.zzavl = str;
        zzaa.zzaj(!"".equals(str));
        if (!(str == null && j == -1)) {
            z = true;
        }
        zzaa.zzaj(z);
        this.zzavm = j;
        this.zzauU = j2;
        this.zzavn = i2;
    }

    public DriveId(String str, long j, long j2, int i) {
        this(1, str, j, j2, i);
    }

    public static DriveId decodeFromString(String str) {
        boolean startsWith = str.startsWith("DriveId:");
        String str2 = "Invalid DriveId: ";
        String valueOf = String.valueOf(str);
        zzaa.zzb(startsWith, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        return zzn(Base64.decode(str.substring("DriveId:".length()), 10));
    }

    public static DriveId zzdw(String str) {
        zzaa.zzz(str);
        return new DriveId(str, -1, -1, -1);
    }

    static DriveId zzn(byte[] bArr) {
        try {
            zzqb zzo = zzqb.zzo(bArr);
            return new DriveId(zzo.versionCode, "".equals(zzo.zzazd) ? null : zzo.zzazd, zzo.zzaze, zzo.zzazb, zzo.zzazf);
        } catch (zzami e) {
            throw new IllegalArgumentException();
        }
    }

    private byte[] zzvJ() {
        zzamj com_google_android_gms_internal_zzqc = new zzqc();
        com_google_android_gms_internal_zzqc.zzaze = this.zzavm;
        com_google_android_gms_internal_zzqc.zzazb = this.zzauU;
        return zzamj.toByteArray(com_google_android_gms_internal_zzqc);
    }

    public DriveFile asDriveFile() {
        if (this.zzavn != 1) {
            return new zzw(this);
        }
        throw new IllegalStateException("This DriveId corresponds to a folder. Call asDriveFolder instead.");
    }

    public DriveFolder asDriveFolder() {
        if (this.zzavn != 0) {
            return new zzy(this);
        }
        throw new IllegalStateException("This DriveId corresponds to a file. Call asDriveFile instead.");
    }

    public DriveResource asDriveResource() {
        return this.zzavn == 1 ? asDriveFolder() : this.zzavn == 0 ? asDriveFile() : new zzab(this);
    }

    public final String encodeToString() {
        if (this.zzauW == null) {
            String encodeToString = Base64.encodeToString(zzvD(), 10);
            String valueOf = String.valueOf("DriveId:");
            encodeToString = String.valueOf(encodeToString);
            this.zzauW = encodeToString.length() != 0 ? valueOf.concat(encodeToString) : new String(valueOf);
        }
        return this.zzauW;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (!(obj instanceof DriveId)) {
            return false;
        }
        DriveId driveId = (DriveId) obj;
        if (driveId.zzauU != this.zzauU) {
            return false;
        }
        if (driveId.zzavm == -1 && this.zzavm == -1) {
            return driveId.zzavl.equals(this.zzavl);
        }
        if (this.zzavl == null || driveId.zzavl == null) {
            if (driveId.zzavm != this.zzavm) {
                z = false;
            }
            return z;
        } else if (driveId.zzavm != this.zzavm) {
            return false;
        } else {
            if (driveId.zzavl.equals(this.zzavl)) {
                return true;
            }
            zzz.zzD("DriveId", "Unexpected unequal resourceId for same DriveId object.");
            return false;
        }
    }

    public String getResourceId() {
        return this.zzavl;
    }

    public int getResourceType() {
        return this.zzavn;
    }

    public int hashCode() {
        if (this.zzavm == -1) {
            return this.zzavl.hashCode();
        }
        String valueOf = String.valueOf(String.valueOf(this.zzauU));
        String valueOf2 = String.valueOf(String.valueOf(this.zzavm));
        return (valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)).hashCode();
    }

    public final String toInvariantString() {
        if (this.zzavo == null) {
            this.zzavo = Base64.encodeToString(zzvJ(), 10);
        }
        return this.zzavo;
    }

    public String toString() {
        return encodeToString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zze.zza(this, parcel, i);
    }

    final byte[] zzvD() {
        zzamj com_google_android_gms_internal_zzqb = new zzqb();
        com_google_android_gms_internal_zzqb.versionCode = this.mVersionCode;
        com_google_android_gms_internal_zzqb.zzazd = this.zzavl == null ? "" : this.zzavl;
        com_google_android_gms_internal_zzqb.zzaze = this.zzavm;
        com_google_android_gms_internal_zzqb.zzazb = this.zzauU;
        com_google_android_gms_internal_zzqb.zzazf = this.zzavn;
        return zzamj.toByteArray(com_google_android_gms_internal_zzqb);
    }
}
