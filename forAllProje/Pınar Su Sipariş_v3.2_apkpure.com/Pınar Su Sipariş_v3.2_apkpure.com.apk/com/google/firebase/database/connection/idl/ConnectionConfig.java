package com.google.firebase.database.connection.idl;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.zzaeh;
import com.google.android.gms.internal.zzahg.zza;
import java.util.List;

public class ConnectionConfig extends AbstractSafeParcelable {
    public static final zzb CREATOR = new zzb();
    final int versionCode;
    final boolean zzbIX;
    final String zzbIZ;
    final HostInfoParcelable zzbKo;
    final int zzbKp;
    final List<String> zzbKq;
    final String zzbKr;

    public ConnectionConfig(int i, HostInfoParcelable hostInfoParcelable, int i2, List<String> list, boolean z, String str, String str2) {
        this.versionCode = i;
        this.zzbKo = hostInfoParcelable;
        this.zzbKp = i2;
        this.zzbKq = list;
        this.zzbIX = z;
        this.zzbKr = str;
        this.zzbIZ = str2;
    }

    public ConnectionConfig(zzaeh com_google_android_gms_internal_zzaeh, zza com_google_android_gms_internal_zzahg_zza, List<String> list, boolean z, String str, String str2) {
        int i;
        switch (com_google_android_gms_internal_zzahg_zza) {
            case DEBUG:
                i = 1;
                break;
            case INFO:
                i = 2;
                break;
            case WARN:
                i = 3;
                break;
            case ERROR:
                i = 4;
                break;
            default:
                i = 0;
                break;
        }
        this.versionCode = 1;
        this.zzbKo = HostInfoParcelable.a(com_google_android_gms_internal_zzaeh);
        this.zzbKp = i;
        this.zzbKq = list;
        this.zzbIX = z;
        this.zzbKr = str;
        this.zzbIZ = str2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzb.zza(this, parcel, i);
    }

    public zza zzQD() {
        switch (this.zzbKp) {
            case 0:
                return zza.NONE;
            case 1:
                return zza.DEBUG;
            case 2:
                return zza.INFO;
            case 3:
                return zza.WARN;
            case 4:
                return zza.ERROR;
            default:
                return zza.NONE;
        }
    }

    public List<String> zzQE() {
        return this.zzbKq;
    }
}
